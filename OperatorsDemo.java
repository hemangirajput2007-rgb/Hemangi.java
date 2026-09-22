public class OperatorsDemo {
    void add(int a,int b){;
    int sum = a + b; 
    System.out.println("Addition:"+sum);
}

int multiply(int a, int b){
    return a * b ;
}
public static void main(String[]args){
    int x =20, y = 30;
    System.out.println("x + y =" + (x + y));
    System.out.println("x - y =" +(x - y));
    System.out.println("x * y =" +(x * y));
    System.out.println("x % y =" +(x % y));

    byte a = 30, b = 10;
    int result = a+b;
    System.out.println("Arithmetic Promotion Result:" + result);

    OperatorsDemo obj = new OperatorsDemo();
    obj.add(6, 8);
    int product = obj.multiply(5, 9);
    System.out.println("Multiplication: " + product);
}
}
