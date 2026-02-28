import java.util.Scanner;

public class Pattern70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int key = 64+n;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print((char)(key));
                key--;
            }
            System.out.println();
        }
    }
}
