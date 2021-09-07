//pattern.java
public class Pattern
{
 public static void main(String[] args) throws 
CloneNotSupportedException
 {
 System.out.println("***MY FAVORATE RACING BIKE***\n");
 RacingBike BajajPulsar = new BajajPulsar("Red Pulsar") ;
 BajajPulsar.basePrice=100000;
 RacingBike Kawasaki = new Kawasaki("Blue Kawasaki");
 Kawasaki.basePrice=500000;
 RacingBike rb1;
 //BajajPulsar
 rb1 =BajajPulsar.clone();
 //bike price will beyond 100000 (my assumption)
 rb1.onRoadPrice = BajajPulsar.basePrice+BasicCar.setAdditionalPrice();
 System.out.println("Bike is: "+ rb1.modelName+" and it's price is 
Rs."+rb1.onRoadPrice);
 //Kawasaki
 kw1 =ford.clone();
 //bike price will beyond 500000  (my assumption)
 rb1.onRoadPrice = Kawasaki.basePrice+BasicCar.setAdditionalPrice();
 System.out.println("Bike is: "+ rb1.modelName+" and it's price is 
Rs."+rb1.onRoadPrice);
 }
}