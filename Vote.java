//Write a java program to input the age of a person and check he/she can vote or not.



import java.util.Scanner;

public class Vote {
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age here:- ");
        age = sc.nextInt();
        if (age<18)
        {
            System.out.println("You cannot vote.");
        }
        else {
            System.out.println("You can vote");
        }
    }
}
