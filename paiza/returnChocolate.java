import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc1 = new Scanner(System.in);
        int moveTimes = sc1.nextInt();
        int seatLine = sc1.nextInt();
        int seatColumn = sc1.nextInt();
        

        int mySeatLine = sc1.nextInt() - 1;
        int mySeatColumn = sc1.nextInt() - 1;
        
        String moveDirection = sc1.next();
        
        int[][] count = new int[seatLine][seatColumn] ;

        for(int i = 0 ;  i < seatLine ; i++){
            for(int x = 0 ; x < seatColumn ; x++){
                count[i][x] = Integer.parseInt(sc1.next());
            }
        }
        
        // 移動していく
        for(int p = 0 ; p < moveTimes ; p++){
            char d = moveDirection.charAt(p);
            switch(d){
                case 'F':
                    mySeatLine = mySeatLine -1;
                    break;
                case 'R':
                    mySeatColumn = mySeatColumn + 1;
                    break;
                case 'B':
                    mySeatLine = mySeatLine + 1;
                    break;
                case 'L':
                    mySeatColumn = mySeatColumn - 1;
                    break;
            }
            System.out.println(count[mySeatLine][mySeatColumn]);
        }
    }
}