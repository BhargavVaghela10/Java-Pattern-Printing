/*
7 7 7 7 7 7 7
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/

import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(key+" ");
            }
            key--;
            System.out.println();
        }
    }
}
