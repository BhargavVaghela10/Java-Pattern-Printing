import java.util.Scanner;

public class Pattern38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        for(int i=1;i<=n;i++)
        {
            int key=1;
            for(int j=1;j<=nst;j++)
            {
                if(j%2==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(key++);
                }
            }
            nst=nst+2;
            System.out.println();
        }
    }
}
