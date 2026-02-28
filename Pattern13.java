import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 0;
        int nst = n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++)
            {
                System.out.print(k);
            }
            nst--;
            nsp++;
            System.out.println();
        }
    }
}
