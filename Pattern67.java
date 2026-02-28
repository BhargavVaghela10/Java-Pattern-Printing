import java.util.Scanner;

public class Pattern67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int key = 90;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(key));
                key--;
            }
            System.out.println();
        }
    }
}
