// imports
import java.util.Random;
import java.util.Scanner;

public class Khan_Ayaan{

    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("****** S store ***************");
        System.out.println("******************************");
        int rand = random_receipt();
        // Adding 1000 to get numbers from 1000-2000 (exclusive)
        System.out.println("receipt number      "+(rand + 1000));

        date_generation();

        Scanner scan = new Scanner(System.in);
        String item;
        float price; 
        int counter = 0;
        float total = 0;
        String point;
        String res;

        // while the user does not input DONE, the loop will let him add more items to the receipt
        do {
            System.out.print("Write item name: ");
            item = scan.nextLine();

            // Check if the input is "DONE" before asking for the price
            if (!item.equalsIgnoreCase("DONE")) {
                System.out.print("Write price: ");
                price = scan.nextFloat();
                
                scan.nextLine();
                // This counter gives every item a number, and gives us the total number of items
                counter++;
                price = tax_rate(item, price);
                // Getting the total price which is rounded and with tax
                total += price;
                
                // point makes the first letter of the word uppercase
                point = item.substring(0, 1).toUpperCase();
                res = item.substring(1);
                // adding both of the substrings back together to the item 
                item = point + res;
                System.out.println("item number " + counter + " " + item + " " + price);
            }

            
        } while (!item.equalsIgnoreCase("DONE"));
        
        System.out.println(counter + " items      total " + total);
        
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");
        scan.close();



    }

    public static float tax_rate(String item, float price){
        // Tax is 30%
        float tax = 0.30f;

        // If the item is food then there is no tax so its 0 percent
        if(item.equalsIgnoreCase("FOOD")){
            tax = 0;
            price = price + (tax * price);
        } else {
            // Any other item 30%, so it adds to original price
            price = price + (tax * price);
        }
        
        // After that we round the price
        price = Math.round(price);

        
        return price;
    }

    public static int random_receipt(){
        Random random = new Random();
        int lower = 1000;
        
        //Getting numbers from 0-1000, later adding another 1000 when we print
        int int_random = random.nextInt(lower);

        return int_random;
    }

    public static void date_generation(){
        Random random = new Random();

        //Getting a random number between 0-12 and then adding 1
        // 1-13 (exlusive 13)
        int month_random = random.nextInt(12) + 1;

        String month_name = "";
        // For whichever random number it is assigned a month 
        if(month_random == 1){
            month_name = "Janurary";
        } else if (month_random == 2){
            month_name = "Feburary";
        } else if (month_random == 3){
            month_name = "March";
        } else if (month_random == 4){
            month_name = "April";
        } else if (month_random == 5){
            month_name = "May";
        } else if (month_random == 6){
            month_name = "June";
        } else if (month_random == 7){
            month_name = "July";
        } else if (month_random == 8){
            month_name = "August";
        } else if (month_random == 9){
            month_name = "September";
        } else if (month_random == 10){
            month_name = "October";
        } else if (month_random == 11){
            month_name = "November";
        } else {
            month_name = "December";
        }

        // Getting random date 1 - 28
        int day_upper = 28;
        int day_random = random.nextInt(day_upper)+1;

        // Getting random year 1900 - 2100
        int year_lower = 1900;
        int year_upper = 2100;
        int year_random = random.nextInt((year_upper-year_lower) + 1) + year_lower;
        
        
        System.out.println(month_name + " " + day_random + " " + year_random);
    }
    
}
