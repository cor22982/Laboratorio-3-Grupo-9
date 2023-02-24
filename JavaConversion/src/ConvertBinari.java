public class ConvertBinari {

	public Character[] mybinaries;
	public String number;
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		for(int i = 0; i<number.length();i++) {
			mybinaries[i] = number.charAt(i);
		}
		this.number = number;
	}

	public ConvertBinari() {
		mybinaries = new Character[8];
	}

	public String Complement1 (){
		for(int j=0; j<mybinaries.length;j++) {
			if(mybinaries[j]=='0') {
				mybinaries[j]='1';	
			}else if(mybinaries[j]=='1') {
				mybinaries[j]='0';
			}
		}
		
		return this.showMyconvertion();
	}
	
	public String Complement2() {
		int pivot = 0;
		for(int i = 7; i>=0;i--) {
			if(mybinaries[i]=='1') {
				pivot  = i;
				i = -2;
			}
		}
		
		for(int o = pivot-1; o>=0;o--) {
			if(mybinaries[o]=='1') {
				mybinaries[o] = '0';
			}else if(mybinaries[o]=='0'){
				mybinaries[o] = '1';
			}
		}
		return this.showMyconvertion();
	}
	
	public String showMyconvertion () {
		String numberreturn = "";
		for(int r = 0; r<mybinaries.length;r++) {
			numberreturn += mybinaries[r];
		}
		return numberreturn;
	}
}
