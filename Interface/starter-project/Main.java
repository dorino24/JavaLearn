
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import pojo.Account;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;
import service.AccountService;
import service.CheckingService;
import service.CreditService;

public class Main {

    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);

        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
                new Checking("A1234B", new BigDecimal("500.00")),
                new Checking("E3456F", new BigDecimal("300.50")),
                new Checking("I5678J", new BigDecimal("100.25")),
                new Credit("A1534B", new BigDecimal("0.50")),
                new Credit("G4567H", new BigDecimal("200.00"))
        );

        accounts.forEach(account -> {
            if (account instanceof Checking) {
                checkingService.createAccount((Checking) account);
            } else {
                creditService.createAccount((Credit) account);
            }
        });

        Checking checking = checkingService.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("1000.00")));
        repository.updateAccount(checking);
        repository.deleteAccount("G4567H");

        AccountService accountService = new CheckingService(repository);
        accountService.deposit("A1234B", new BigDecimal("100.00"));
        accountService.withdraw("A1234B", new BigDecimal("50.00"));

        AccountService accountService2 = new CreditService(repository);
        accountService2.deposit("A1534B", new BigDecimal("100.00"));
        accountService2.withdraw("A1534B", new BigDecimal("50.00"));
    
        System.out.println();

    }

}
