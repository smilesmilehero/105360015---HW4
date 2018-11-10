
public class sample4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car(1234,20.5);
		car1.vshow();
		car1.mshow();
	}
}

interface iVechile
{
	void vshow();
}

interface iMaterial
{
	void mshow();
}

class Car implements iVechile,iMaterial
{
	private int num;
	private double gas;
	
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產的車號為"+num+"汽油量為"+gas+"的車子");
	}
	
	public void vshow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
	public void mshow()
	{
		System.out.println("車號的材質是鐵");
	}

}
