import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = (n/2)+1;
        int nsp = 0;
        for(int i=1;i<=n;i++)
        {
            int key;
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            key=nsp+1;
            for(int k=1;k<=nst;k++)
            {
                System.out.print(key + " ");
                key++;
            }
            if(i<=(n/2))
            {
                nst--;
                nsp++;
            }
            else
            {
                nst++;
                nsp--;
            }
            System.out.println();
        }
    }
}
