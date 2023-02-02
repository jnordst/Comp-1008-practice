package org.example;

public class Main {
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        VideoGame fireEmblem = new VideoGame("Fire Emblem: Engage", 79.99);
        VideoGame finalFantasy = new VideoGame("Final Fantasy XIV", 24.99);
        VideoGame octopathTraveler = new VideoGame("Octopath Traveler", 64.99);
        VideoGame triangleStrategy = new VideoGame("Triangle Strategy", 79.99);
        VideoGame xenobladeChronicles = new VideoGame("Xenoblade Chronicles 3", 79.99);

        cart.AddToCart(fireEmblem);
        cart.AddToCart(finalFantasy);
        cart.AddToCart(octopathTraveler);



        for (VideoGame game : cart.ItemsInCart()) {
            System.out.println(game.getName() + " " + game.getCost());
        }

        System.out.println("Total: $" + cart.TotalValue());

    }
}