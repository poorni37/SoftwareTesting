package org.bik;

public class Ninja extends BMW{
	@Override
	public void mileage(int milege) {
		// TODO Auto-generated method stub
		System.out.println("Milege :"+milege);	
	}
	@Override
	public void enginePower(int Engine) {
		// TODO Auto-generated method stub
		 System.out.println("Engine Power: "+Engine);
	}
   private void price(int price) {
	// TODO Auto-generated method stub
  System.out.println("Price"+price);
}
  private void model(String model) {
	// TODO Auto-generated method stub
System.out.println("Model Name"+model);
}
  private void speed(int speed) {
	// TODO Auto-generated method stub
System.out.println("Speed"+speed);

}
  
  public static void main(String[] args) {
	Ninja a = new Ninja();
	a.mileage(64);
	a.enginePower(2000);
	a.model("Ninja");
	a.price(100000);
	a.speed(50);
	
}
}
