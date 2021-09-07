//BajajPulsar.java
class BajajPulsar extends RacingBike
{
 //A base price for BajajPulsar
 public int basePrice=100000;
 public BajajPulsar(String m)
 {
 modelName = m;
 }
 @Override
 public RacingBike clone() throws CloneNotSupportedException
 {
 return (BajajPulsar)super.clone();
 //return this.clone();
 }
}