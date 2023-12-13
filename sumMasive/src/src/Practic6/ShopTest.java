package Practic6;

public class ShopTest
{
    public static void main(String[] args)
    {
        Shop shop = new Shop(5);
        shop.add(new Table("Metal crafting table", 10000, 810, 700, 1400, "Metal"));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(3));
        System.out.println(shop.getPrices());

        for (Furniture f : shop.getGoods())
        {
            f.canSleep();
        }
    }
}
