package generics;

public class generic{
	
	public static <G> void genric (G k)

{

System.out.println("value is"+" "+k);
}

public static void main(String[] args) { // TODO Auto-generated method stub

genric("Ran"); Integer val =3;

genric(val);

genric(true);

}
}

