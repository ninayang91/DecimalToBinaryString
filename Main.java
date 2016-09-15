
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printBinary(0.25));

	}
	
//Convert 0<x<1 to a binary representation
	//check stringBuilder.length() in each loop
	//keep times 2, append to StringBuilder 0 or 1
	public static String printBinary(double num){
		if(num<=0 || num>=1)return"Error";
		StringBuilder sb=new StringBuilder();
		sb.append(".");
		while(num>0){
			if(sb.length()>32)return "Error";
			double r=num*2;
			if(r>=1){
				sb.append(1);
				num =r-1;
			}else{
				sb.append(0);
				num=r;
			}	
		}
		return sb.toString();
	}

}
