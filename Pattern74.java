import java.util.Scanner;

public class Pattern74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for(int i=1;i<=n;i++)
        {
            int key = 91-i;
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++)
            {
                System.out.print((char)(key)+" ");
                key++;
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }
}
