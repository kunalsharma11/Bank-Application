package application.bank.account;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class DataReader {

	public static List<String[]> readFile(String file) {
		List<String[]> userData = new LinkedList<String[]>();
		String data;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			while ((data = br.readLine()) != null) {
				String[] dataRecords = data.split(",");
				userData.add(dataRecords);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userData;
	}

}
