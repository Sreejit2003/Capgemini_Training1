package File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveImage {
	public static void main(String[] args) throws IOException {
		
		String image = "C:\\Users\\User\\Downloads\\Image.jpg";
		
		Path path = Paths.get(image);
		byte[] byte_array = Files.readAllBytes(path);
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\User\\Desktop\\Capgemini\\File Handling\\database,.jpg");
		fos.write(byte_array);
		
		System.out.println("Image saved");
		
		fos.close();
	}
}
