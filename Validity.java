// Write a class in which you need to write functions to find area of circle,
// area of square and area of right angle triangle.
// Call all those functions inside the main and show the result. Take all inputs from the user.
public class Validity  {
    public static int Valid(int a, int b, int c)
    {

        if (a + b + c == 180 && a != 0 && b != 0 && c != 0)
            return 1;
        else
            return 0;
    }


    public static void main(String args[]) {

        int a = 60, b = 40, c = 80;

        if ((Valid(a, b, c)) == 1)
        {
            System.out.print("Valid");
        }
else
        {

            System.out.print("Invalid");
        }
    }


}
