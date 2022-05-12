/**
* Class Trapezio.
*
* @author parisi alessio
* Dichiarazione della classe Trapezio
*/
import java.util.*;

public class Trapezio
{

/**
* Dichiarazione degli attributi nella classe Trapezio .
*
*/
private float base1;

/**  base 2. */
private float base2;

/**  altezza. */
private float altezza;

/**
* Generazione del costruttore Trapezio.
*
* @param base1  base 1
* @param base2  base 2
* @param altezza  altezza
*/
public Trapezio (float base1,float base2,float altezza)
{
this.base1=base1;
this.base2=base2;
this.altezza=altezza;
}

/**
* Calcola Area.
*
* @return float
*/
public float Area()
{
return(base1+base2)*altezza/2;
}

/**
* Main.
*/
public static void main(String [] args)
{
Trapezio t = new Trapezio(1,2,3);
System.out.println("Area: "+ t.Area());
}
}