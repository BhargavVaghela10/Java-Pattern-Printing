import java.util.Scanner;

public class Pattern63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                if(j==1||j==nst) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<=(n/2))
            {
                nst++;
            }
            else{
                nst--;
            }
            System.out.println();
        }
    }
}
