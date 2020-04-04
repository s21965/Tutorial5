import java.util.ArrayList;

public class category {

    public String name;
    public ArrayList<Product>product = new ArrayList<>();

    public category(String name, ArrayList<Product>product){

        this.name = name;
        this.product = product;

    }

    public category(ArrayList<Product>product){

        this.name = null;
        this.product = product;

    }

    public category(){

        this.product = new ArrayList<>();

    }

    public void add(Product b){

        product.add(b);

    }

    public void remove(Product b){

        product.remove(b);

    }

    public void rename (String name) {

        this.name = name;
    }


}
