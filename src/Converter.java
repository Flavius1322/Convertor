import java.util.*;
import java.text.DecimalFormat;

class Converter
{
    public static void main(String[] args) {



        double ron = 0,dollar = 0,pound=0,code,euro=0;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency code 1:ron\n2:Dollar\n3:Euro\n");
        code=sc.nextInt();

        if(code == 1)
        {
            System.out.println("Enter amount in ron");

            ron = sc.nextFloat();
            System.out.println("Enter exchange rate for dollar");
            double exchange_for_dollars = sc.nextFloat();
            dollar = ron * exchange_for_dollars;
            System.out.println("Dollar : "+f.format(dollar));

            System.out.println("Enter exchange rate for pound");
            double exchange_for_pound  = sc.nextFloat();
            pound = ron * exchange_for_pound;
            System.out.println("Pound : "+f.format(pound));


            System.out.println("Enter exchange rate for euro");
            double exchange_for_euro  = sc.nextFloat();
            euro = ron * exchange_for_euro;
            System.out.println("Pound : "+f.format(euro));


        }

        else if (code == 2)
        {
            System.out.println("Enter amount in dollar");
            dollar = sc.nextFloat();
            System.out.println("Enter exchange rate for rons");
            double exchange_for_rons = sc.nextFloat();
            ron = dollar * exchange_for_rons;
            System.out.println("Ron : "+f.format(ron));

            System.out.println("Enter exchange rate for pound");
            double exchange_for_pound  = sc.nextFloat();
            pound = dollar * exchange_for_pound;
            System.out.println("Pound : "+f.format(pound));

            System.out.println("Enter exchange rate for euro");
            double exchange_for_euro  = sc.nextFloat();
            euro = dollar * exchange_for_euro;
            System.out.println("Pound : "+f.format(euro));

        }

        else if(code == 3)
        {
            System.out.println("Enter amount in euro");
            euro = sc.nextFloat();
            System.out.println("Enter exchange rate for rons");
            double exchange_for_rons = sc.nextFloat();
            ron = euro * exchange_for_rons;
            System.out.println("Ron : "+f.format(ron));

            System.out.println("Enter exchange rate for dollars");
            double exchange_for_dollar   = sc.nextFloat();
            dollar  = euro  * exchange_for_dollar;
            System.out.println("Dollar : "+f.format(dollar));

            System.out.println("Enter exchange rate for pounds");
            double exchange_for_pounds   = sc.nextFloat();
            pound = euro * exchange_for_pounds;
            System.out.println("Pounds : "+f.format(pound));

        }
        else
            System.out.println("Invalid Code");
    }
}
}
