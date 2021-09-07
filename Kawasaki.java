//Kawasaki.java
class Kawasaki extends RacingBike
{
 //A base price for Kawasaki model 
 public int basePrice=100000;
 public Kawasaki(String m)
 {
 modelName = m;
 }
 @Override
 public BasicCar clone() throws CloneNotSupportedException
 {
 return (Kawasaki)super.clone();
 }
}