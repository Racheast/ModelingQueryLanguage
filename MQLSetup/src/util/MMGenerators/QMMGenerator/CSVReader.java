package util.MMGenerators.QMMGenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import util.Constants;

public class CSVReader {
	
	public static ArrayList<String[]> readFunctionalOperators(){
		return readCSVFile(Constants.FUNCTIONAL_OPERATORS_PATH);
	}
	
	public static ArrayList<String[]> readTypeHierarchy(){
		return readCSVFile(Constants.TYPE_HIERARCHY_PATH);
	}
	
	private static ArrayList<String[]> readCSVFile(final String path){
		ArrayList<String[]> lines = new ArrayList<String[]>();
		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] lineSplit = line.split(cvsSplitBy);
                lines.add(lineSplit);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

		return lines;
	}
}
