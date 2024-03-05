import java.text.DecimalFormat;
import java.util.Scanner;

class Geeks{

    static void printInFormat(float a, float b){
        float result = a/b;

        // Create a DecimalFormat object with the desired pattern for up to 3 decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        // Format the result using the DecimalFormat
        String formattedResult = decimalFormat.format(result);

        // Print the formatted result
        System.out.println(result +" "+ formattedResult);

        // Your code here to print upto 3 decimal places

    }

    public static void main(String[] args){
        Scanner userIp= new Scanner(System.in);
        //System.out.println("Enter float value for a :");
        float a=userIp.nextFloat();
        //System.out.println("Enter float value for b :");
        float b=userIp.nextFloat();
        printInFormat(a,b);
    }

}