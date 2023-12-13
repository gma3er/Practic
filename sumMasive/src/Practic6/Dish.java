package Practic6;

public abstract class Dish
{
   protected String material;
   protected String colour;

   public Dish (String material, String colour)
   {
       this.material = material;
       this.colour = colour;
   }

   public Dish()
   {
       material = "non";
       colour = "non";
   }

   public String getName()
   {
       return material;
   }

   public String getColour()
   {
       return colour;
   }

   public void setName(String name)
   {
       this.material = name;
   }

   public void setColour(String colour)
   {
       this.colour = colour;
   }

   public abstract double getVolume();

   @Override
   public String toString()
   {
      return "CLASS DISH - " + '/'
      + "material = " + material + '/'
      + "colour = " + colour;
   }

}
