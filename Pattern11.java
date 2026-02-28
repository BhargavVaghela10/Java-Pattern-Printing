import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            int key1 = 1;
            int key2 = nst/2;

            for(int j=1;j<=(nst/2)+1;j++)
            {
                System.out.print(key1++);
            }
            for(int k=1;k<=(nst/2);k++)
            {
                System.out.print(key2--);
            }
            nst=nst+2;
            System.out.println();
        }
    }
}
