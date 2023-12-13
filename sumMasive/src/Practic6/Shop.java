package Practic6;

public class Shop
{
    private Furniture[] goods;

    public Shop(int count)
    {
        goods = new Furniture[count];
        for (int i = 0; i < count; )
        {
            goods[i++] = new Chair(true, "Standart", 2500, 60, 40, 46, "Wood");
            if(i >= count) break;
            goods[i++] = new Table("Standart", 5000, 75, 120, 104, "Wood");
            if (i >= count)break;
            goods[i++] = new Bed(2, "Standart", 10000, 106, 148, 211, "Wood");
        }
    }

    public Furniture[] getGoods()
    {
        return goods;
    }

    public void add(Furniture f)
    {
        Furniture[] tmp = new Furniture[goods.length+1];
        System.arraycopy(goods, 0, tmp, 0, goods.length);
        tmp[goods.length] = f;
        goods = tmp;
    }

    public Furniture buy(int number)
    {
        Furniture f = goods[number];
        Furniture[] tmp = new Furniture[goods.length-1];
        for (int i = 0; i < goods.length; i++)
        {
            if(i < number) tmp[i] = goods[i];
            if (i > number) tmp[i-1] = goods[i];
        }
        goods = tmp;
        return f;
    }

    public String getPrices()
    {
        String res = "Магазин продаёт следующие товары:\n\n";
        for (Furniture f : goods)
        {
            res += f.toString() + "\n";
        }

        return res;
    }
}