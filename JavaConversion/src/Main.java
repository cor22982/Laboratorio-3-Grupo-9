import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Inicializaciones
		Scanner in = new Scanner(System.in);	
		ConvertBinari convertidor = new ConvertBinari();
		ConvertoHexa convertidorhexa = new ConvertoHexa();
		int option = 0;
		String number = "";
		int decimalorhexa= 0;
		
		System.out.println("------LABORATORIO 3------");
		System.out.println("---------ELIJA UNA OPCION--------");
		System.out.println("[1]Complementos de binario"+"\n"+"[2]Conversiones de Hexadecimales y Decimales"+"\n"+"[3]Salir");
		option = Integer.parseInt(in.nextLine());
		while(option!=3) {
			switch(option) {
			case 1:{
				System.out.println("------Complementos BIANRIOS------");
				System.out.println("INGRESE EL NUMERO EN BINARIO (8 bits)");
				number = in.nextLine();
				convertidor.setNumber(number);
				System.out.println("[1]Complemento A1"+"\n"+"[2]Complemento A2");
				option = Integer.parseInt(in.nextLine());
				
				if(option ==1){
					System.out.println("A1: "+convertidor.Complement1());
				}
				else if(option ==2){
					System.out.println("A2: "+convertidor.Complement2());
				}
				
			}break;
			case 2:{
				System.out.println("------Conversiones Hexadecimales y Decimales------");
				System.out.println("[1]Hexadecimal a Decimal"+"\n"+"[2]Decimal a Hexadecimal");
				option = Integer.parseInt(in.nextLine());
				if(option ==1){
					System.out.println("Ingrese el numero en Hexadecimal (LETRAS MAYUSCULAS)");
					number = in.nextLine();
					System.out.println("\n"+"Hexadecimal: "+ number+"\n"+"Decimal: "+convertidorhexa.HexatoDecimal(number));
				}
				else if(option ==2){
					System.out.println("Ingrese el numero Decimal");
					decimalorhexa = Integer.parseInt(in.nextLine());
					System.out.println("\n"+"Decimal: "+ decimalorhexa+"\n"+"Hexadecimal: "+convertidorhexa.DecimalToHexa(decimalorhexa));
				}
			}break;
			}
			System.out.println("\n"+"---------ELIJA UNA OPCION--------");
			System.out.println("[1]Complementos de binario"+"\n"+"[2]Conversiones de Hexadecimales y Decimales"+"\n"+"[3]Salir");
			option = Integer.parseInt(in.nextLine());
		}
		System.out.println("PROGRAMA FINALIZADO");
		
	}

}
