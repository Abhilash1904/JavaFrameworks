package JsonDemo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper objmapper = new ObjectMapper();
		try {
			Fruit fr= objmapper.readValue(new File("data/fruit.json"), Fruit.class);
			System.out.println("Fruit type=" +fr.getFruit());
			System.out.println("Fruit size=" +fr.getSize());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
