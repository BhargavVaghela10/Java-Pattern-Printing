import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int key = i;
            int jump = n-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(key+" ");
                key = key +jump;
                jump--;
            }
            System.out.println();
        }
    }
}
