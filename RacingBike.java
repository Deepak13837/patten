//RacingBike.java
import java.util.Random;
public abstract class RacingBike implements Cloneable
{
 public String modelName;
 public int basePrice,onRoadPrice;
 public String getModelname() {
 return modelName;
 }
 public void setModelname(String modelname) {
 this.modelName = modelname;
 }
 public static int setAdditionalPrice()
 {
 int price = 0;
 Random r = new Random();
 //By doing this we get int value ranging from 0 to 100000
 int p = r.nextInt(100000);
 price = p;
 return price;
 }
 public RacingBike clone() throws CloneNotSupportedException
 {
 return (RacingBike)super.clone();
 }
}
