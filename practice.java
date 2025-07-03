class Calculator {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b);
    }
};
public class practice{
   public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=7;
        Calculator calc=new Calculator();
        calc.add(a, b);
        calc.add(a,b,c);
    } 
}