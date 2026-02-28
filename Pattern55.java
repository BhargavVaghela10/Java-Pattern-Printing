import java.util.Scanner;

public class Pattern55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp=0;
        int nst=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++)
            {
                if(i==1||k==1||k==nst) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
