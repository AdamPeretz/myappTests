import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileInputStream;

public class Test {

	public static void main(String[] args) {
		BufferedReader jso = null;
		try {
			jso = new BufferedReader(new FileReader("applicationEnglishHebrewCopy.json"));
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		
//		JSONObject myjson = new JSONObject(jso);
//		try {
//			JSONArray the_json_array = myjson.getJSONArray("ListeCar");
//		} catch (JSONException e1) {
//			System.out.println("catch");
//			e1.printStackTrace();
//		}
//	
			
	}

}

