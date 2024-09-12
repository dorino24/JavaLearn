
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class ArrayChallenge {

    public static String ArrayChallengeMet(String[] arr) {
        String firstWord = arr[0];
        String[] wordsArray = arr[1].split(",");
        Set<String> wordSet = new HashSet<>();
        String output = "";
        wordSet.addAll(Arrays.asList(wordsArray));
        
        for (int i = 1; i <= firstWord.length(); i++) {
            if (firstWord.length() % i == 0) {
                Boolean allMatch = true;
                for (int j = 0; j < firstWord.length(); j+=i) {
                    String subWords = firstWord.substring(j, j + 1);
                    if(!wordSet.contains(subWords)){
                        allMatch = false;
                        break;
                    }
                }
                if (allMatch) {
                    for(int j=0; j<firstWord.length(); j+=i){
                        output += firstWord.substring(j, j + i) + ",";
                    }
                    output = output.substring(0,output.length()-1).concat("1yon87p3I0c");
                    break;
                }
            }
        }
        String finalOutput = "";
        for (int i = 0; i < output.length(); i++) {
            finalOutput += ((i+1)%3==0) ? "X":output.charAt(i)  ; 
        }

        return finalOutput;
    }

    public static void main(String[] args) {
        System.out.println(ArrayChallengeMet(new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}));
    }
}
