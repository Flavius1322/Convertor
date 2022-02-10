import java.util.*;
import java.text.DecimalFormat;
// currency converter in java swing
class Converter
{
    public static void main(String[] args)
    {
        double ron,dollar,pound,code,euro,yen;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency code 1:ron\n2:Dollar\n3:Euro\n");
        code=sc.nextInt();
        //For Ron Conversion
        if(code == 1)
        {
            System.out.println("Enter amount in ron");
            ron = sc.nextFloat();
            dollar = ron *4.33;
            System.out.println("Dollar : "+f.format(dollar));
            pound = ron * 5.86;
            System.out.println("Pound : "+f.format(pound));
            euro = ron *4.94;
            System.out.println("Euro : "+f.format(euro));

        }
        //For Dollar Conversion
        else if (code == 2)
        {
            System.out.println("Enter amount in dollar");
            dollar = sc.nextFloat();
            ron = dollar * 0.23;
            System.out.println("Ron : "+f.format(ron));
            pound = dollar * 0.74;
            System.out.println("Pound : "+f.format(pound));
            euro = dollar * 0.88;
            System.out.println("Euro : "+f.format(euro));

        }

        //For Euro Conversion
        else if(code == 3)
        {
            System.out.println("Enter amount in Euro");
            euro = sc.nextFloat();
            ron = euro * 4.95;
            System.out.println("Ron : "+f.format(ron));
            dollar = euro * 1.14;
            System.out.println("Dollar : "+f.format(dollar));
            pound = euro * 0.84;
            System.out.println("Pound : "+f.format(pound));

        }
        else
            System.out.println("Invalid Code");
    }
}