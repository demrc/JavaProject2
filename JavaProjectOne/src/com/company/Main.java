package com.company;

public class Main {

    public static void main(String[] args) {
        //this instance create without get,set
        Product product1 = new Product(1,"Something","Someone",10000);
        Product product2 = new Product(2,"Something2","Someone2",20000);

        //this instance create with get,set
        Content content1 = new Content();
        content1.setId(3);
        content1.setName("Anything");
        content1.setGenre("Any genre");

        Content content2 = new Content();
        content2.setId(5);
        content2.setName("Anything2");
        content2.setGenre("Any genre 2");

        Product[] products = {product1,product2};
        Content[] contents = {content1,content2};
        for(Product product: products){
            System.out.println(product.id);
        }
        for (Content content: contents){
            System.out.println(content.getId());

        }
        ContentManager contentManager = new ContentManager();
        contentManager.VideoContent();
        contentManager.VideoResume();


    }
}
