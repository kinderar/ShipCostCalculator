import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Declaring Variables
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;

        //Prompt user to enter price
        System.out.print("Enter the price of an item: ");

        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
        }

        if(itemPrice >= 100)
        {
            System.out.println("Your shipping is free!");
        }
        else
        {

            shippingCost = itemPrice * 0.02;
            totalPrice = itemPrice + shippingCost;
            System.out.println("The shipping cost is " + shippingCost + " and the total cost is " + totalPrice);
        }

    }
}