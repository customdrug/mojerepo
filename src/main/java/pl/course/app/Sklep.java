package pl.course.app;

import pl.course.model.Client;
import pl.course.model.Product;
import pl.course.services.Seller;

import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {
        Product kiełbasa = new Product("Kiełbasa", 100, 15, 2000);
        Product jabłko = new Product("Jabłko", 1000, 7, 1000);
        Product czekolada = new Product("Czekolada", 200, 30, 165);

        Client jan = new Client("Jan", 100, 5000);
        Client lucas = new Client("łukasz", 1000, 500);

        int totalPrice = 0;
        int totalWage = 0;
        Seller seller = new Seller();


        System.out.println("Witaj w sklepie. Wpisz 1, aby sprawdzić zawartość sklepu i ceny. Jeśli chcesz wyjść naciśnij 2.");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Nasze produkty to: " + kiełbasa);
            System.out.println(jabłko);
            System.out.println(czekolada);
            System.out.println("Czy chcesz coś nabyć? Wpisz Tak aby kontynuować, lub Nie aby wyjść.");
        } if (choice == 2) {
            System.out.println("No to wypierdalaj śmieciu.");
        }


        Scanner choice2 = new Scanner(System.in);
        String odpowiedz = choice2.nextLine();
        if (odpowiedz.equalsIgnoreCase("Tak")) {
            System.out.println("Jaki produkt chcesz wybrać? (jablko/czekolada/kielbasa)");
        } if (odpowiedz.equalsIgnoreCase("Nie")) {
            System.out.println("To po co nadal tu jesteś?");
        }

        String wybranyprodukt = choice2.nextLine();
        if (wybranyprodukt.equalsIgnoreCase("jabłko")) {
            System.out.println("Ile tego chcesz w sztukach, sprzedajemy tylko po 100 gramów?");
            int ilosc = scanner.nextInt();
            scanner.nextLine();
            totalWage = seller.dodajDoKoszyka(jabłko, ilosc);
            totalPrice = seller.obliczCeneKoszyka(jabłko, ilosc);
            seller.czyGratis(totalPrice, scanner, jabłko, kiełbasa, czekolada, totalWage);
            seller.zakup(jan, totalPrice);
            seller.czyUniesie(jan, totalWage, scanner);


        }
        }







}

