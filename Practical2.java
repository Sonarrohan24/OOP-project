class StringMathDemo {
    public static void main(String[] args) {

        // String Operations
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        System.out.println("Concatenation: " + str1.concat(str2));
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));
        System.out.println("Substring: " + str1.substring(1));
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Uppercase: " + str1.toUpperCase());

        // Math Operations
        double a = 16.0;
        double b = 3.7;

        System.out.println("Square root: " + Math.sqrt(a));
        System.out.println("Power: " + Math.pow(a, 2));
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Minimum: " + Math.min(a, b));
        System.out.println("Random: " + Math.random());
        System.out.println("Ceiling: " + Math.ceil(b));
        System.out.println("Floor: " + Math.floor(b));
        System.out.println("Round: " + Math.round(b));
    }
}