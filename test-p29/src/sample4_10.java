
public class sample4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechile[] vc=new Vechile[2];
		
		vc[0]=new Car(1234,20.5);
		vc[0].setspeed(60);
		
		vc[1]=new Plane(232);
		vc[1].setspeed(500);
		
		for(int i=0;i<vc.length;i++)
		{
		vc[i].show();
		}
	}
}


abstract class Vechile
{
	protected int speed;
	
	public void setspeed(int s)
	{
		speed=s;
		System.out.println("�N�t�׳]��"+speed+"�F");
	}
	
	abstract void show();
	
}

class Car extends Vechile
{
	private int num;
	private double gas;
	
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�Ͳ���������"+num+"�T�o�q��"+gas+"�����l");
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}

class Plane extends Vechile
{
	private int flight;
	
	public Plane(int f)
	{
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	
	public void show()
	{
		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}