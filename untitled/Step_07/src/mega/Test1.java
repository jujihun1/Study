package mega;

class Product{
    String name;
    int price;
}

public class Test1 {
    public static void main(String[] args) {

        Product[] productList = new Product[3];

        productList[0] = new Product();
        productList[0].name = "기계식 키보드";
        productList[0].price = 45000;

        productList[1] = new Product();
        productList[1].name = "무소음 마우스";
        productList[1].price = 35000;

        Product product = new Product();
        product.name = "장패드";
        product.price = 10000;
        productList[2] = product;

        // 엘리먼트(배열의 요소) 조회
        for (int i = 0; i < productList.length; i++) {
            //System.out.println(productList[i]);
            System.out.println("name = " + productList[i].name);
            System.out.println("price = " + productList[i].price);
            System.out.println(i);
        }

        System.out.println(product);

    }
}
