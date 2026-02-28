import java.util.Scanner;

public class Pattern79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            int key=65;
            for(int j=1;j<=nst;j++)
            {
                System.out.print((char)(key)+" ");
                key++;
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
