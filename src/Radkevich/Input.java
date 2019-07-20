package Radkevich;
import java.io.*;
public class Input{
	public int read_i(){
		String inputLine=null;
		BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
		int i;
		while (true){
			try{
				inputLine=is.readLine();
				if (inputLine.length() > 0) {
					i = Integer.valueOf(inputLine);
					return i;
					}
			}
			catch (IOException e){
				System.out.println("IOException " +e);
			} 
			catch (NumberFormatException e) {
				System.out.println("Number entered incorrectly. Please try again");
			}
		}
	}
	
	public double read_d(){
		String inputLine=null;
		BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
		double i;
		while (true){
			try{
				inputLine=is.readLine();
				if (inputLine.length() > 0) {
					i = Double.parseDouble(inputLine);
					return i;
					}
			}
			catch (IOException e){
				System.out.println("IOException " +e);
			} 
			catch (NumberFormatException e) {
				System.out.println("Number entered incorrectly. Please try again");
			}
		}
	}
	
	public String read_s(){
		String inputLine=null;
		BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
		while (true){
			try{
				inputLine=is.readLine();
				if (inputLine.length() > 0) {
					return inputLine;
					}
			}
			catch (IOException e){
				System.out.println("IOException " +e);
			} 
		}
	}
}