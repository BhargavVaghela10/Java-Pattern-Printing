import java.util.Scanner;

public class Pattern41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=(2*n)-1;i++)
        {
            for(int j=1;j<=(2*n)-1;j++)
            {
                int a=i , b=j;
                if(i>n)
                {
                    a=2*n - i;
                }
                if(j>n)
                {
                    b=2*n - j;
                }
                int val = n - Math.min(a,b) + 1;
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
