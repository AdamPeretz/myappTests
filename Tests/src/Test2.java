import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader jso = null;
		String line = null;
		int i = 0;
		int l = 0;

		// Count Label name
		try {
			jso = new BufferedReader(new FileReader("applicationEnglishHebrewCopy.json"));

			while ((line = jso.readLine()) != null) {
				if (line.contains("Label name")) {
					i++;
				}
			}

		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}

		// Enter Label name value to array
		String[] LB = new String[i];
		try {
			jso = new BufferedReader(new FileReader("applicationEnglishHebrewCopy.json"));

			while ((line = jso.readLine()) != null) {
				if (line.contains("Label name")) {
					LB[l] = line.substring(18, line.length() - 1);
					l++;

					if (l == i) {
						break;
					}
				}

			}
		}

		catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		

		// Check double value
		List<String> doubleValue = new ArrayList<String>();
		int countCheck = 0;
		int check = 0;
		for (int j = 0; j < LB.length; j++) {
			for (int j2 = j + 1; j2 < LB.length; j2++) {
				if (Arrays.asList(LB[j]).contains(LB[j2])) {
				check++;
				System.out.println(LB[j]);
				

				}
			}
	
//			if (check > 1) {
//				countCheck++;
//				doubleValue.add(LB[j]);
//				
//			}
//			check = 0;
		}
		
		
		//Print only the double value
//		String[] doubleValueArr = new String[doubleValue.size()];
//		doubleValueArr = doubleValue.toArray(doubleValueArr);
//		
//		for (int j = 0; j < doubleValue.size(); j++) {
//			if (j%2 == 0) {
//				System.out.println(doubleValueArr[j]);
//			}
//		}
		



	}
}
