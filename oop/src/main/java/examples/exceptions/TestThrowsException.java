package examples.exceptions;

import java.util.List;

public class TestThrowsException {

    private static List<Object> db;

    public static void main(String[] args) {

    }


    public static void getProduct(Integer productId) {
        Object product = db.get(productId);

        if (product == null) {
            throw new ProductNotFoundException("Product not found by id " + product);
        }
    }
}
