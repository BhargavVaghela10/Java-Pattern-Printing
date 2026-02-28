import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(0);
        }
        System.out.println();
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(0);
            }
            for(int k=1;k<=n-i;k++)
            {
                if(k==1)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
