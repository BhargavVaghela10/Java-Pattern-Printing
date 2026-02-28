/*
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
*/


import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int key = n;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(key+" ");
                key--;
            }
            System.out.println();
        }
    }
}
