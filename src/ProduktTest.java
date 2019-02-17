import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ProduktTest {
    public static void main(String[] args) {
        File file = new File("produkty.csv");
        Product[] product = new Product[nrLines(file)];
        ProductMethod pm = new ProductMethod();
        int i = 0;

        try (Scanner scan = new Scanner(file);) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] s = line.split(";");
                Product tmpProd = new Product(s[0], s[1], Double.valueOf(s[2]));
                product[i] = tmpProd;
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
        //       System.out.println(product[0].getPrice());
        System.out.println("Łączna cena: " + pm.sum(product));
        Product prod = pm.EspensiveProuct(product);
        System.out.println("Najdroższy produkt: " + pm.EspensiveProuct(product).toString() + " jest w cenie: " + pm.max(product));


    }

    private static int nrLines(File file) {
        int i = 0;
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                i++;
                scan.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
        return i;
    }
}
