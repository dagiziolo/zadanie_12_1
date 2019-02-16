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


    public String EspensiveProuct(Product[] product) {
        String prouctName = null;
        for (int i = 0; i < product.length; i++) {
            if (product[i].getPrice() == max(product)) {
                if (prouctName == null) {
                    prouctName = product[i].getName();
                } else {
                    prouctName = prouctName + ", " + product[i].getName();
                }
            }
        }
        return prouctName;
    }

}
