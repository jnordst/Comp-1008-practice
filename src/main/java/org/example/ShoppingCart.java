package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<VideoGame> cart = new ArrayList<VideoGame>();

    public void AddToCart(VideoGame videoGame)
    {
        cart.add(videoGame);
    }

    public Double TotalValue()
    {
        Double total = 0.00;
        for (VideoGame game : cart)
        {
            total += game.getCost();
        }

        return total;
    }

    public List<VideoGame> ItemsInCart()
    {
        return cart;
    }
}
