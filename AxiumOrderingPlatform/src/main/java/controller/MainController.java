package controller;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import model.Medicine;
import repository.MedicineRepo;

@Controller
public class MainController {
	

	
	
	
	@Autowired
	private MedicineRepo medicineRepo;
	
	/*@GetMapping(value="/list")
	public ResponseEntity<List<Medicine>> index(ModelMap model) {
		List<Medicine> allfiles = medicineRepo.findAll();
		System.out.println(allfiles.get(0));
		model.put("allfiles", allfiles);
		return new ResponseEntity<List<Medicine>>(allfiles, HttpStatus.OK);
	}*/
	
	@GetMapping(value="/")
	public String indexGet(ModelMap model) throws ClassNotFoundException {
		Connection connection = null;
		Statement statement = null;
		ResultSetImpl rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fullipufile","root", "shell1");
			statement = (Statement) connection.createStatement();
			rs = (ResultSetImpl) statement.executeQuery("SELECT * FROM medicine");
			
			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) System.out.print(",  ");
			        String columnValue = rs.getString(i);
			        System.out.print(columnValue + " " + rsmd.getColumnName(i));
			    }
			    System.out.println("");
			}
			
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}

		
		
		
		List<Medicine> allfiles = medicineRepo.findAll();
		System.out.println(allfiles.get(0).toString());
		model.put("allfiles", allfiles);
		return "index";
	}

}
