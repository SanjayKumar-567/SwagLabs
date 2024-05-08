package filecutiltiy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	FileInputStream path;
	
	
	public String fetchproperty(String key) {
		try {
			 path = new FileInputStream("./Data/swaglabs.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pobj = new Properties();
		try {
			pobj.load(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = pobj.getProperty(key);
		return data;
	}
	
	

}
