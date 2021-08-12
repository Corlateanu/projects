package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departament;
    private int mailboxCapacity = 500;
    private String email;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "maccompany.com";

    //Constructor pentru a primi firstname si lastname
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;


//chemam metoda pentru departament,returnam departamentu
        this.departament = setDepartment();


//chemam o metoda care returneaza un numaru random
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is :" + this.password);

        //combinam elemente pentru a genera email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departament + "." + companySuffix;

    }

    //intrebam de departament
    private String setDepartment() {
        System.out.println("New worker: " + firstName + ". Departmetn Codes\n1 for Sales\n2 for Devlopment\n3 for Accounting\n0 for none\nEnter departement code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }

    }

    //Generarea unei parole random
    private String randomPassword(int length) {
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
    }

    //setare capcitatea la mailbox
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Setare unui email alternativ
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Schimbare parolei
    public void changepPassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public  String showInfo(){
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}
