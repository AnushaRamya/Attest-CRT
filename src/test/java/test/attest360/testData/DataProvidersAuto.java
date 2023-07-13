/**
 * 
 */
package test.attest360.testData;

import org.testng.annotations.DataProvider;
import test.attest360.utilities.ExcelUtils;

/**
 * @author Sathish A
 *
 */
public class DataProvidersAuto  {
	ExcelUtils auto=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
	
	@DataProvider(name ="AutoBasic")
	public Object[][] setBasicAuto() {
		//Totals rows count
		int rows=auto.getRowCount("ComponentDataEntry") ;
		//Total Columns
		int column=auto.getColumnCount ("ComponentDataEntry") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=auto.getCellData("ComponentDataEntry", j, i+2);
			}
		}
		return data;	
	}
	@DataProvider(name ="FilldataAutoComponent")
	public Object[][] setFilldataAuto() {
		//Totals rows count
		int rows=auto.getRowCount("Component DataEntry") ;
		//Total Columns
		int column=auto.getColumnCount ("Component DataEntry") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=auto.getCellData("Component DataEntry", j, i+2);
			}
		}
		return data;	
	}
	@DataProvider(name ="AutoComponentVerification")
	public Object[][] setVerifierAuto() {
		//Totals rows count
		int rows=auto.getRowCount("Verifier validation") ;
		//Total Columns
		int column=auto.getColumnCount ("Verifier validation") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=auto.getCellData("Verifier validation", j, i+2);
			}
		}
		return data;	
	}
	@DataProvider(name ="basic-Candidate")
	public Object[][] setBasicCandidateFlow() {
		//Totals rows count
		int rows=auto.getRowCount("CandidateBasic") ;
		//Total Columns
		int column=auto.getColumnCount ("CandidateBasic") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=auto.getCellData("CandidateBasic", j, i+2);
			}
		}
		return data;	
	}
	@DataProvider(name ="FieldValidation-Candidate")
	public Object[][] setAutoCompCandidateFlow() {
		//Totals rows count
		int rows=auto.getRowCount("FieldValidation-Candidate") ;
		//Total Columns
		int column=auto.getColumnCount ("FieldValidation-Candidate") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=auto.getCellData("FieldValidation-Candidate", j, i+2);
			}
		}
		return data;	
	}
}

