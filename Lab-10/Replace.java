import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace{
	public static void main(String [] args) throws IOException {
		FileReader f1=new FileReader("Name.txt");
		BufferedReader bf=new BufferedReader(f1);
		FileWriter f2=new FileWriter("FullName.txt");
		String word1,word2;
		BufferedReader bf2=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  word you want to replace: ");
		word1=bf2.readLine();
		System.out.println("Enter  word you want to replace with: ");
		word2=bf2.readLine();
		String x="",msg="";
		while((x=bf.readLine())!=null) {
			x=x.replace(word1, word2);
			f2.write(x);
		}
		f2.close();
		f1.close();
		
	}
}