import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonenSortierer {
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<Person> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Was möchten Sie machen?" +
                    "1 ... Person eingeben\n" +
                    "2 ... Liste nach Nachnamen / Vornamen sortiert ausgeben\n" +
                    "3 ... Liste nach Alter absteigend ausgeben\n" +
                    "4 ... Liste nach Größe aufsteigend ausgeben\n" +
                    "0 ... Programm beenden"
            );
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Geben Sie einen Vornamen ein: ");
                String firstname = scanner.nextLine();
                System.out.println("Geben Sie einen Nachnamen ein: ");
                String lastname = scanner.nextLine();
                System.out.println("Geben Sie die Größe ein: ");
                int sizeInCm = scanner.nextInt();
                System.out.println("Geben Sie Ihr Geburtsdatum ein: (DD.MM.YYYY)");
                String date = scanner.next();

                DateTimeFormatter df = DateTimeFormatter.ofPattern("d.MM.yyyy");


                LocalDate dob = LocalDate.parse(date, df);
                String[] splitted = date.split(".");
                LocalDate ld = LocalDate.of(Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1]), Integer.parseInt(splitted[2]));


                liste.add(new Person(firstname, lastname, dob, sizeInCm));
            } else if (choice == 2) {
            //    Collections.sort(liste);
                for (Person p : liste) {
                    System.out.println(p.toString());
                }
            }
        } while (choice != 0);
    }
}
