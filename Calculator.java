import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        int operator;
        double num, total;
        boolean begin, clear;
        total = 0;
        
        Scanner input = new Scanner(System.in);
        clear = false;
        begin = true;
        
        do {
            System.out.println("Calculator");
            System.out.println("=============");
            System.out.print("Total : ");
            System.out.print(total);
            System.out.println();
            System.out.println();
            System.out.println();

            if (begin) {
             System.out.print("Input Number : ");
                total = input.nextInt();
                begin = false;
            }

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Clear Total");
            System.out.println("7. Exit");
            System.out.print("Operator [1...7]: ");
            operator = input.nextInt();
         
            
            switch(operator) {
                case 1:
                    System.out.println("Input Number: ");
                    num = input.nextInt();
                    total = total + num;
                    break;
                case 2:
                    System.out.println("Input Number: ");
                    num = input.nextInt();
                    total = total - num;
                    break;
                case 3:
                    System.out.println("Input Number: ");
                    num = input.nextInt();
                    total = total * num;
                    break;
                case 4:
                    System.out.println("Input Number: ");
                    num = input.nextInt();
                    total = total / num;
                    break;
                case 5:
                    System.out.println("Input Number: ");
                    num = input.nextInt();
                    total = total % num;
                    break;
                case 6:
                    total = 0;
                    break;
                case 7:
                    System.out.print("Selesai, terima kasih");
                    clear = true;
                    break;
                default:
                    System.out.println("salah operator woy !");
                break;
            }
        } while(!clear);
    }
} 
