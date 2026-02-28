import java.util.Scanner;

public class Pattern71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            char ch='p';
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
