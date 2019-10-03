package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee4;

public class ComparableApp {

	public static void main(String[] args) {
		
		List<Employee4> list = new ArrayList<>();
		String path = "/home/lucas/Documentos/testFolder/entrada.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeeCsv = br.readLine();
			while(employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee4(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			
			for(Employee4 emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
