package examen;

public class Exámen {
	
public String primeraLetraMayus, cadenaInvert, vocalMayus, palindromo;
	
	public Exámen () {
		this(" ", " ", " ", " ");
	}
	 public Exámen(String primeraLetraMayus, String cadenaInvert, String vocalMayus, String palindromo) {
		this.primeraLetraMayus = primeraLetraMayus;
		this.cadenaInvert = cadenaInvert;
		this.vocalMayus = vocalMayus;
		this.palindromo = palindromo;
	 }
	 public String primeraMayuscula(String palabra) {
		 return primeraLetraMayus = palabra.toUpperCase().charAt(0) + palabra.substring(1, palabra.length());
	 }
	

	public String invertirCadena (String palabra) {
	int n = palabra.length()-1;
	for (;n>=0; n--) {
		cadenaInvert += palabra.charAt(n);
	}
	return cadenaInvert = cadenaInvert +"";
	}
	
	
	public String vocalesMayuscula (String palabra){
		char [] vocalesMayuscula=palabra.getText().toCharArray();
		
		for (int i=0; 1<vocalesMayuscula.length;i++) {
			condicion(vocalesMayuscula,1, "A","a");
			condicion(vocalesMayuscula,1, "E","e");
			condicion(vocalesMayuscula,1, "I","i");
			condicion(vocalesMayuscula,1, "O","o");
			condicion(vocalesMayuscula,1, "U","u");
		}
		Object jlbmayusculas;
		Object setText;
		jlbmayusculas.setText(String.valueOf(vocalesMayuscula));
		
		
	}
	
	private void condicion(char[] arraymayus, int i, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	{
		int j=100;
		for(int k=0; k<=j; k++) {
			if(k%3==0 && (!(k%5==0))) {
				//k=0;
				String f="Fizz";
				System.out.println(f);
				//String f=String.valueOf(k);
				//String p = String.format("Fizz",k);
				//System.out.println(p);
				//System.out.println("Fizz");
				continue;
			}
			if(k%5==0 && (!(k%3==0))) {
				String b="Buzz";
				System.out.println(b);
				continue;
			}
			if(k%3==0 && k%5==0) {
				String fb="FizzBuzz";
				System.out.println(fb);
				continue;
			}
			else {
				if(!(k%3==0 || k%5==0)) {
					System.out.println(k);
				}
			}
		}
	}
}
