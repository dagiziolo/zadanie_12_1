import java.util.Arrays;

public class ProductMethod {

    public double sum(Product[] product) {
        double sum = 0;
        for (int i = 0; i < product.length; i++) {
            sum += product[i].getPrice();
        }
        return sum;
    }


    public double max(Product[] product) {
        double max = 0;
        for (int i = 0; i < product.length; i++) {
            if (max < product[i].getPrice())
                max = product[i].getPrice();
        }
        return max;
    }


    public Product EspensiveProuct(Product[] product) {
        Product prod = null;
        for (int i = 0; i < product.length; i++) {
            if (product[i].getPrice() == max(product)) {
                prod = product[i];
            }
        }
        return prod;
    }
}
