//Write a Java program for bonus calculation. Accept basic salary from user. Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary.
// If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary.
// Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)

import java.util.*;

public class Bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your basic Salary:");
        int salary = in.nextInt();
        if(salary >= 20000)
        {
            System.out.println("Basic = "+(salary));
            System.out.println("TA(10%) = "+(0.10*salary));
            System.out.println("DA(15%) = "+(0.15*salary));
            System.out.println("HRA(20%) = "+(0.20*salary));
            System.out.println("PF(12%) = "+(0.12*salary));
            System.out.println("Bonus(10%) = "+(0.10*salary));
            System.out.println("Gross Salary = "+((salary)+(0.10*salary)+(0.15*salary)+(0.20*salary)+(0.20*salary)));
        }
        else {
            System.out.println("Basic = "+(salary));
            System.out.println("TA(10%) = "+(0.10*salary));
            System.out.println("DA(15%) = "+(0.15*salary));
            System.out.println("HRA(20%) = "+(0.20*salary));
            System.out.println("PF(12%) = "+(0.12*salary));
            System.out.println("Bonus(20%) = "+(0.20*salary));
            System.out.println("Gross Salary = "+(salary)+(0.10*salary)+(0.15*salary)+(0.20*salary)+(0.20*salary));
        }
    }
}