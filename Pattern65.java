import java.util.Scanner;

public class Pattern65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst1=1;
        int nsp=n-1;
        int nst2=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst1;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=nst2;l++)
            {
                System.out.print("* ");
            }
            if(i<=(n/2))
            {
                nst1++;
                nsp=nsp-2;
                nst2++;
            }
            else{
                nst1--;
                nsp=nsp+2;
                nst2--;
            }
            System.out.println();
        }
    }
}
