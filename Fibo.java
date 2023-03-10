
    import java.util.Scanner;
    public class Fibo {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int n=sc.nextInt();
            int p=0;
            int i=1;
            int count=2;// Since we already have first two numbers of the fibonacci series
            while(count<=n)
            {
                int temp=i;
                i=i+p;
                p=temp;
                count++;
            }
            System.out.println("The nth fibonacci number is :"+ i);
        }
    }


