import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConvertoHexa {
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	Map<Integer, String> map2 = new HashMap<Integer, String>();
	public ConvertoHexa() {
		map.put('A', 10);
		map.put('B', 11);
		map.put('C', 12);
		map.put('D', 13);
		map.put('E', 14);
		map.put('F', 15);
		
		map2.put(10, "A");
		map2.put(11, "B");
		map2.put(12, "C");
		map2.put(13, "D");
		map2.put(14, "E");
		map2.put(15, "F");
		
	}



	public ArrayList<Integer> Represtantion(int Number, ArrayList<Integer> mydata) {
		mydata.add(Number%16); //agregamos el residuo
		int division = ((Number-(Number%16))/16); //resultado de la division
		if(division<=16) {
			mydata.add(division);
		}else {
		this.Represtantion(division, mydata);}
		return mydata;
	}
	
	public String DecimalToHexa(int Number) {
		String toreturn = "";
		if((Number>255)&&(Number<=4095)) { //si esta entre el rango
		ArrayList<Integer> mydata = new ArrayList<Integer>();
		mydata  = this.Represtantion(Number, mydata);
		Collections.reverse(mydata);  //aqui invierte el orden
		for (int i = 0; i<mydata.size();i++) {
			if(mydata.get(i)>9) {
				toreturn += map2.get(mydata.get(i));
			}
			else {
				toreturn += mydata.get(i);
			}
		}}
		
		else {
			toreturn += "No se puede convertir a un Hexadecimal de 3 digitos";
		}
		return toreturn;
	}
	
	public String HexatoDecimal(String number) {
		String toreturn = "";
		ArrayList<Integer> mydata = new ArrayList<Integer>();
		for (int i = 0; i<number.length();i++) {
			char especifico = number.charAt(i);
			if(Character.isAlphabetic(especifico)) {  //si el caracter es un alfabeto
				mydata.add(map.get(especifico)); //añade su valor
			
			}
			else {
				mydata.add(Integer.parseInt(String.valueOf(especifico)));
			}
			
		}
		
		toreturn += mydata.get(0)*256+ mydata.get(1)*16+mydata.get(2);
		//ya teniendo separado todo lo podemos solo multiplicar.
		
		
		return toreturn;
	}
	
}
