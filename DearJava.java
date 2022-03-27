/*
public class DearJava {
    public static void main(String[] args) {
        int fact=1;
        int i=1;
        while (i<=5){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
*/

/*
public class DearJava {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.println(a+" "+b+" ");
        for (int i=2;i<=5; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
*/

/*
public class DearJava {
    public static void main(String[] args){
        int a=0, b=1, c;
        System.out.print(a+" "+b);
        for(int i=2; i<=5; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
*/


/*
public class DearJava {
    public static void main(String[] args) {
        int fact=1,i=1;
        while (i<=5){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
*/

/*
public class DearJava {
    public static void main(String[]args){
        int a=0, b=1, c;
        System.out.print(a+" "+b);
        for (int i=2; i<=10; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
*/

/*class A{
    public void find_series(int n){
        int a=0, b=1, c;
        System.out.print(a+" "+b);
        for (int i=2; i<=n; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
public class DearJava {
    public static void main(String[] args) {
     A obj=new A();
     obj.find_series(10);
    }
}*/



//Rough works


/*Quest:- Wap to find the sum of given numbers is 0 to 10.
class Add{
    void add(){
        int n1=1;
        int n2=10;
        int sum=0;
        for (int i=n1; i<=n2; i++){
            sum+=i;
        }
        System.out.println("Sum of the given numbers is :" +sum);
    }
}
public class Sum {
    public static void main(String[] args) {
        Add obj=new Add();
        obj.add();
    }
}*/



/*

//Hello java


Quest:- Wap to find the sum of given any numbers by user.

import java.util.Scanner;

class Summ{
   void Addd(){
       int n1,n2;
       int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any first number");
       n1= sc.nextInt();
       System.out.println("Enter any second number");
       n2= sc.nextInt();
       for (int i=n1; i<=n2; i++){
           sum+=i;
       }
       System.out.println(sum);
   }
}
public class Sum {
   public static void main(String[] args) {
       Summ obj=new Summ();
       obj.Addd();
   }
}
*/
