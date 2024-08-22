
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
        "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
        "wombat", "zebra"};

    public static String[] gallows = {"+---+\n"
        + "|   |\n"
        + "    |\n"
        + "    |\n"
        + "    |\n"
        + "    |\n"
        + "=========\n",
        "+---+\n"
        + "|   |\n"
        + "O   |\n"
        + "    |\n"
        + "    |\n"
        + "    |\n"
        + "=========\n",
        "+---+\n"
        + "|   |\n"
        + "O   |\n"
        + "|   |\n"
        + "    |\n"
        + "    |\n"
        + "=========\n",
        " +---+\n"
        + " |   |\n"
        + " O   |\n"
        + "/|   |\n"
        + "     |\n"
        + "     |\n"
        + " =========\n",
        " +---+\n"
        + " |   |\n"
        + " O   |\n"
        + "/|\\  |\n"
        + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
        "     |\n"
        + "     |\n"
        + " =========\n",
        " +---+\n"
        + " |   |\n"
        + " O   |\n"
        + "/|\\  |\n"
        + "/    |\n"
        + "     |\n"
        + " =========\n",
        " +---+\n"
        + " |   |\n"
        + " O   |\n"
        + "/|\\  |\n"
        + "/ \\  |\n"
        + "     |\n"
        + " =========\n"};

    public static void main(String[] args) {
        String word = getRandomWord();
        Scanner scanner = new Scanner(System.in);

        String[] missedWord = new String[6];
        String[] guessedWord = new String[word.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = "_";
        }
        System.out.println(word);
        int stage = 0;
        while (true) {
            String letter = "";

            System.out.println(gallows[stage]);
            for (String guessedWord1 : guessedWord) {
                letter += guessedWord1;
            }
            if (letter.equals(word) || stage == 6) {
                break;
            }

            printGuessedWord(guessedWord);

            System.out.print("\n\nMisses : ");
            for (String missed : missedWord) {
                if (missed != null) {
                    System.out.print(missed);
                }
            }

            System.out.print("\n\nGuess : ");
            char guesses = scanner.nextLine().charAt(0);
            if (!word.contains(Character.toString(guesses))) {
                missedWord[stage] = Character.toString(guesses);
                stage++;
            }
            cekGuesses(word, guesses, guessedWord);
        }

        if (stage == 6) {
            System.out.println("RIP !!");
            System.out.println("You lose! The word was " + word);
        } else {
            System.out.println("You win! The word was " + word);
        }
        scanner.close();
    }

    public static String getRandomWord() {
        return words[(int) (Math.random() * words.length)];
    }

    public static void printGuessedWord(String[] guessedWord) {
        System.out.print("Word : ");
        for (String guessedWord1 : guessedWord) {
            System.out.print(guessedWord1);
        }
    }

    public static void cekGuesses(String word, char guesses, String[] guessedWord) {
        for (int i = 0; i < word.length(); i++) {
            if (guesses == word.charAt(i)) {
                if (guessedWord[i].equals("_")) {
                    guessedWord[i] = String.valueOf(guesses);
                    break;
                }
            }
        }
    }

}
