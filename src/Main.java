import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name = scanner.next();
        System.out.println("Podaj swoje nazwisko");
        String lastName = scanner.next();
        System.out.println("Podaj swoje miasto zamieszkania");
        String city = scanner.next();
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();
        System.out.println("Czy jesteś w związku?");
        String marriage = scanner.next();
        if(!"tak".equalsIgnoreCase(marriage) || !"nie".equalsIgnoreCase(marriage) ) {
            System.out.println("Podales błędną odpowiedz. Spróbuj ponownie.");
            System.out.println("Czy jesteś w związku? TAK/NIE");
            marriage = scanner.next();
        }
        System.out.println("Witaj " + name + lastName + " w klubie Testersi!");
        System.out.println("Twoje dane to:\nimię: " + name + "\nnazwisko: " + lastName + "\nmiasto: "
                + city + "\nwiek: " + age + "\nw związku: " + marriage);
    }
}