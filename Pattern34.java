import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                if(j==((nst/2)+1))
                {
                    System.out.print(i);
                }
                else{
                    System.out.print("*");
                }
            }
            nst=nst+2;
            System.out.println();
        }
    }
}
