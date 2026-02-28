import java.util.Scanner;

public class Pattern57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++)
            {
                if(i==n||k==1||k==nst) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }
}
