import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive data types
        int studentAge = 15;
        double studentGPA = 3.0;
        //char studentFirstNameInitial = 'I';
        //char studentLastNameInitial = 'G';
        boolean hasPerfectAttendance = true;

        // strings, start with index 0
        String studentFirstName = "Iulia";
        String studentLastName = "Golicova";
        // accessing single characters in a string
        char studentFirstNameInitial = studentFirstName.charAt(0);
        char studentLastNameInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstNameInitial);
        System.out.println(studentLastNameInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        // combining values
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + studentGPA);

        // asking for user input
        System.out.println("What do you want to update it to?: ");
        // Scanner is a tool that allows us to get inputs
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of: " + studentGPA);
    }
}

