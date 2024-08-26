
import constants.TradeAccountType;
import constants.Transaction;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import pojo.CashAccount;
import pojo.MarginAccount;
import repository.TradeAccountRepository;
import service.CashAccountService;
import service.MarginAccountService;
import service.TradeAccountService;

public class Main {

    static Path[] paths = new Path[]{Paths.get("data/accounts.txt"), Paths.get("data/transactions.txt")};
    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);

    public static void main(String[] args) {
        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void loadTradeAccounts() throws IOException {
        Files.lines(paths[0])
                .forEach(line -> {
                    String[] data = line.split(" ");
                    if (data[0].equals(TradeAccountType.CASH.toString())) {
                        CashAccount cashAccount = new CashAccount(data[1], new BigDecimal(data[2]));
                        cashAccountService.createTradeAccount(cashAccount);
                    } else if (data[0].equals(TradeAccountType.MARGIN.toString())) {
                        MarginAccount marginAccount = new MarginAccount(data[1], new BigDecimal(data[2]));
                        marginAccountService.createTradeAccount(marginAccount);
                    }
                });
    }

    public static void applyTransactions() throws IOException {
        Files.lines(paths[1])
                .forEach(line -> {
                    String[] data = line.split(" ");
                    Boolean isChecking = data[0].equals(TradeAccountType.CASH.toString());
                    TradeAccountService accountService = isChecking ? cashAccountService : marginAccountService;
                    Transaction transaction = Transaction.valueOf(data[2]);
                    if (transaction == Transaction.DEPOSIT) {
                        accountService.deposit(data[1], new BigDecimal(data[3]));
                    } else if (transaction == Transaction.WITHDRAWAL) {
                        accountService.withdraw(data[1], new BigDecimal(data[3]));
                    }
                });
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println("Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println("Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }

}
