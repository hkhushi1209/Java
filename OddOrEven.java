public class OddOrEven {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is an " + result + " number.");
        
        scanner.close();
    }
}