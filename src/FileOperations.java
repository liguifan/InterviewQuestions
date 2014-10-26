import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String s: args) {
			System.out.println(s);
		}
		
		for(int i=1;i<100;i++){
				System.out.println(i);
		}

		System.out.println("liguifan");
	}


	public ArrayList<Integer> readfile(String path) throws IOException{
		ArrayList<Integer> res= new ArrayList<Integer>();
		File filename=new File(path);
		BufferedReader reader=new BufferedReader(new FileReader(filename));
		String line="";
		while((line=reader.readLine())!=null){

		}
		reader.close();
		return res;
	}


	public void writefile(String path) throws IOException{
		File writename = new File(".\\result\\en\\output.txt");  
		writename.createNewFile(); 
		BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
		out.write("adf");
		out.flush(); 
		out.close();  
	}

}
