package contacts;
import java.util.Scanner;
import java.util.logging.Logger;
public class Contact
{
    public static void main( String[] args )
    {
    	Linkedlist list=new Linkedlist();
        Scanner scan=new Scanner(System.in);
        Logger l=Logger.getLogger("hi");
        int option=0;
        while(true)
        {
            l.info("enter your option 1.add 2.search 3.delete 4.display 5.exit");
            option=scan.nextInt();
            switch(option)
            {
                case 1:
                {
                    l.info("Enter your name:");
                    String name=scan.next();
                    l.info("Enter your phone:");
                    long number=scan.nextLong();
                    l.info("Enter your email:");
                    String email=scan.next();
                    list.add(name, number, email);
                    l.info("Added successfully");
                    break;
                }
                case 2:
                {
                    l.info("Enter the search contact name");
                    String searchname=scan.next();
                    list.search(searchname);
                    break;
                }
                case 3:
                {
                    l.info("Enter the delete contact name");
                    String delete=scan.next();
                    list.deleteContact(delete);
                    break;
                }
                case 4:
                {
                    l.info("Display");
                    list.display();
                    break;
                }
                case 5:
                {
                    l.info("Exit");
                    System.exit(0);
                    break;
                }
                default:
                {
                    l.info("Invalid Input");
                    break;
                }
            }
        }
    }
    }
