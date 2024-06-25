import java.util.*;
class ArrangeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 1st value");
        int a = sc.nextInt();
        
        System.out.println("Enter the 2st value");
        int b = sc.nextInt();
        
        System.out.println("Enter the 3st value");
        int c = sc.nextInt();
        
        int temp;

        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }

        if(b>c){
            temp=b;
            b=c;
            c=temp;
        }

        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }

        System.out.printf(a+" "+b+" "+c);
    }
}