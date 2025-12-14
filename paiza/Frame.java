import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int i = line.length() + 2; 
        for(int j = 0 ; j < i ; j++){
            System.out.print("+");
        }
        System.out.println("");
        System.out.println("+" + line + "+");
        for(int p = 0 ; p < i ; p++){
            System.out.print("+");
        }
    }
}