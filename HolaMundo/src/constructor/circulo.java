package constructor;

public class circulo {
	
public int rad;
public float d;

public circulo()
{
	rad = 170465;
}

public float calcCircunf()
{
	d = rad;
	return (float) (2*3.14*d);
}

public float calcAreaCirc()
{
	return (float) 3.14*d*d;
}

public void cambRadio(int radio)
{
	rad = radio;
}

}
