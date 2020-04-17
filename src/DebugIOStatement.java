import java.util.Scanner;
public class DebugIOStatement {
        public static void main(String[] args) {
            String Name, Age, DOB, Year;
            Scanner scanner = new Scanner (System.in);

            System.out.println("Input your name?: ");
            String name=scanner.nextLine();
            System.out.println("Name: " + name);
            System.out.println("Enter your Age: ");
            String age=scanner.nextLine();
            System.out.println("Age: " + "Age");
            System.out.println("Enter your dob?: ");
            String Dob=scanner.nextLine();
            System.out.println("your DOB Year: " + "Year");
            System.out.println("Summary: "+"Your name is: "+name+"\n"+"Your age is: +Age\n"+"Your birth year is: "+Dob);
        }
    }


