package pl.course.services;

import pl.course.model.Client;
import pl.course.model.Product;

import java.util.Scanner;

public class Seller {
    public int dodajDoKoszyka(Product product, int quantity) {
        int total = product.getPrice() * quantity;
        System.out.println("Dodałeś do kosza" + quantity + "00 gramów" + product);
        return total;
    }

    public int obliczCeneKoszyka(Product product, int quantity) {
        int koszt = product.getPrice() * quantity;
        return koszt;
    }

    public boolean zakup(Client client, int totalPrice) {
        if (client.getMoney() >= totalPrice) {
            client.setMoney(client.getMoney() - totalPrice);
            return true;
        } else {
            System.out.println("niestety nie masz wystarczająco pieniędzy, musisz coś odłożyć");
            return false;
        }
    }

    public boolean czyUniesie(Client client, int totalWage, Scanner scanner) {
        if (client.getMaxWageCapability() >= totalWage) {
            System.out.println("Zabierz swoje rzeczy i wyjdź krecie.");
            return true;
        } else {
            System.out.println("nie możesz tyle unieść, musisz dopłacić za taksówkę! kosztuje 30 zlotych");
            if (client.getMoney() >= 30) {
                System.out.println("Czy mam zamówić dla ciebie taksówkę? Napisz Tak jeśli chcesz lub nie jeśli chcesz poradzić sobie jakoś inaczej.");
                String odpowiedz = scanner.nextLine();
                if (odpowiedz.equalsIgnoreCase("Tak")) {
                    System.out.println("dobrze w takim razie dzwonie.");
                    client.setMoney(client.getMoney() - 30);
                    return true;

                } else if (odpowiedz.equalsIgnoreCase("Nie")) {
                    System.out.println("w takim razie radź sobie sam");
                    return false;
                }
                return false;
            } else {
                System.out.println("niestety nie masz siły i pieniedzy aby się stąd zabrac musisz zwrócić artykuły");
                return false;
            }
        }
    }

    public int czyGratis(int totalPrice, Scanner scanner, Product jabłko, Product kiełbasa, Product czekolada, int totalWage) {
        if (totalPrice >= 200) {
            System.out.println("Super twoje zakupy przekroczyły 200 złotych, wybierz sobie gratisowy produkt. Wybierz poprzez wpisanie jablko/kiełbasa/czekolada");
            String odpowiedz = scanner.nextLine();
            switch (odpowiedz.toLowerCase()) {
                case "jabłko":
                    System.out.println("otrzymujesz gratis jabłko");
                    totalWage += jabłko.getWage();
                    break;
                case "czekolada":
                    System.out.println("otrzymujesz gratis czekolade");
                    totalWage += czekolada.getWage();
                    break;
                case "kiełbasa":
                    System.out.println("otrzymujesz gratis kielbe");
                    totalWage += kiełbasa.getWage();
                    break;
                default:
                    System.out.println("Nie ma takiego produktu nie otrzymujesz nic");
            }
            return totalWage;

        } else {
            System.out.println("TWoje zakupy nie przekroczył 200złotych gratis ci sie nie nalezy");
            return totalWage;
        }
    }
}

