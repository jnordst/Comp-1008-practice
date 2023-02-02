package org.example;

public class Main {
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        VideoGame fireEmblem = new VideoGame("Fire Emblem: Engage", 79.99);
        VideoGame finalFantasy = new VideoGame("Final Fantasy XIV", 24.99);
        cart.AddToCart(fireEmblem);
        cart.AddToCart(finalFantasy);


        for (VideoGame game : cart.ItemsInCart()) {
            System.out.println(game.getName() + " " + game.getCost());
        }

        System.out.println("Total: $" + cart.TotalValue());

    }
}