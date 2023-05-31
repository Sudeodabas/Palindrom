import java.util.Scanner;
public class Palindrom {
    static boolean palindrom(int number){
        int temp,lastNumber,reverseNumber;
        temp=number;
        reverseNumber=0;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp /= 10;
        }
        if(number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz: ");
        number=input.nextInt();
        palindrom(number);
        if(palindrom(number)==true)
            System.out.println("Palindrom sayıdır.");
        else
            System.out.println("Palindrom sayı değildir.");

    }
}
