import java.util.Scanner;

public class div {


    public static class calci { // + - * / %


        public void div() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any two numbers of Your Choice:-");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Division is = " + result);
        }

        public int sub(int a, int b) {
            return (a / b);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            calci obj = new calci();
            obj.div();
        }
    }
}

