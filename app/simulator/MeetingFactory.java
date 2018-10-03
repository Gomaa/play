package simulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

import com.google.gson.Gson;

import model.Meeting;

public class MeetingFactory {

	
	
	public static List<Meeting> getMeetingList(){
		
		  Gson gson = new Gson();
		  InputStream is = MeetingFactory.class.getResourceAsStream("/meetingjson.json");
		  String jsonObject = null;

		  try {
			 
			  jsonObject = read(is , Charset.defaultCharset());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		 MeetingListSimulator data = gson.fromJson(jsonObject, MeetingListSimulator.class);
		 
		 return data.getMeetingList();		  		  		  		 
		  
	}
	
	public static String read(InputStream inputStream, Charset charset) throws IOException {
		 
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset))) {	
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line);
			}
		}
	 
		return stringBuilder.toString();
	}
	
		
}
