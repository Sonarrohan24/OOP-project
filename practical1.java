class OperatorsDemo {

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int x = 10, y = 3;

        System.out.println("Addition = " + (x + y));
        System.out.println("Subtraction = " + (x - y));
        System.out.println("Multiplication = " + (x * y));
        System.out.println("Division = " + (x / y));
        System.out.println("Remainder = " + (x % y));

        boolean a = 10 < 20;
        boolean b = 20 > 10;

        int result = a ? 10 : 20;

        System.out.println("Arithmetic Result = " + result);

        OperatorsDemo obj = new OperatorsDemo();

        obj.add(5, 2);

        int product = obj.multiply(4, 6);

        System.out.println("Product = " + product);
    }
  }
