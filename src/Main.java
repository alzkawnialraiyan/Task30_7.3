import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char[][] chars ={{'a','b','c'},{'d','c','f'},{'d','e','t'}};
        System.out.println("enter a word:");
        String word = read.next();

        char[] cs = word.toCharArray();
        boolean isThisWordValid = true;
        for (char c: cs) {
            System.out.println(c+" : " + isExist(c,chars));
            if (!isExist(c,chars)){
                isThisWordValid = false;
                break;
            }
        }
        System.out.println("this word is "+isThisWordValid);
    }
    static boolean isExist(char c, char[][] chars){
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                if (c == chars[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}