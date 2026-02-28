/*
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        6 5 4 3 2 1
        7 6 5 4 3 2 1
 */


import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int key = i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(key+" ");
                key--;
            }
            System.out.println();
        }
    }
}
