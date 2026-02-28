import java.util.Scanner;

public class Pattern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int key=i;
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(key++);
            }
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
