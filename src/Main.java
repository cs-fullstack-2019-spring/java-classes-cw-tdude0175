import com.company.classwork.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Object> dogList = new ArrayList<>();
        Dog Spike = new Dog("Spike", "beagle", 12, "brown");
        dogList.add(Spike);
        Dog elvis = new Dog("elvis", "terrier", 7, "tan");
        dogList.add(elvis);
        Dog Zo = new Dog( "Zo", "yorie", 5, "silver/brown");
        dogList.add(Zo);

        for( Object dog : dogList)
        {
            System.out.println(dog.toString());
        }
        Account person1 = new Account("KYancy", 10);
        Account person2 = new Account("KGibbs", 1000);
        person2.withdraw(100);
        person1.deposit(100);
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        do
            {
                System.out.println("Would you like to look for a dog?");
                String search= scan.next();
                if(search.equals((String)"yes")){
                    System.out.println("Who would you like to search for?");
                String searchName = scan.next();
                for(Object dog : dogList)
                {
                    System.out.println(dog);
                    if(dog == searchName)
                    {
                        System.out.println(dog);
                    }
                }
                }
                else
                    {
                        break;
                    }
            }while (true);
    }
}
