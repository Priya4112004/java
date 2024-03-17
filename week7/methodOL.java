import java.util.*;
class MeOL{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        MeOL obj = new MeOL();
        System.out.println("add(int 10, int 20) : "+obj.add(10,20));
        System.out.println("add(double 25.34, double 73.57) : "+obj.add(25.34,73.57));
        System.out.println("add(int 10, int 20, int 30) : "+obj.add(10,20,30));
    }
}
