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
public class DataProviders  {
	
	ExcelUtils obj=new ExcelUtils();
	@DataProvider(name ="customerName")
	public Object[][] set_Customer() {
		//Totals rows count
		int rows=obj.getRowCount("CustomerName") ;
		//Total Columns
		int column=obj.getColumnCount ("CustomerName") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("CustomerName", j, i+2);
			}
		}
		return data;
	}
	
	@DataProvider(name ="basicDetailsFresher")
	public Object[][] set_BasicDetailsFresher() {
		//Totals rows count
		int rows=obj.getRowCount("Basic Details-Fresher") ;
		//Total Columns
		int column=obj.getColumnCount ("Basic Details-Fresher") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Basic Details-Fresher", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="basicDetailsExperienced")
	public Object[][] set_BasicDetailsExperienced() {
		//Totals rows count
		int rows=obj.getRowCount("Basic Details-Experienced") ;
		//Total Columns
		int column=obj.getColumnCount ("Basic Details-Experienced") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Basic Details-Experienced", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FilldataBasic")
	public Object[][] setFilldataBasicDetails() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-BasicDetails") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-BasicDetails") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-BasicDetails", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FilldataEducation")
	public Object[][] setFillDataEducation() {
		//Totals rows count
		int rows=obj.getRowCount("FillDataEducation") ;
		//Total Columns
		int column=obj.getColumnCount ("FillDataEducation") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillDataEducation", j, i+2);
			}
		}
		return data;			
	 
	}
	
	@DataProvider(name ="FillDataAddress")
	public Object[][] setFilldataAddress() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-AddressVerification") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-AddressVerification") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-AddressVerification", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FillCriminalData")
	public Object[][] setFilldataCriminalVerification() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-Criminal Verification") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-Criminal Verification") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-Criminal Verification", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FillDataIdentification")
	public Object[][] setFillIdentificationVerification() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-Identification") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-Identification") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-Identification", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="FillDataEmployment")
	public Object[][] setFillEmployement() {
		//Totals rows count
		int rows=obj.getRowCount("FillData-Employement") ;
		//Total Columns
		int column=obj.getColumnCount ("FillData-Employement") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("FillData-Employement", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="Authorization")
	public Object[][] setFillDataAuthorization() {
		//Totals rows count
		int rows=obj.getRowCount("Authorization") ;
		//Total Columns
		int column=obj.getColumnCount ("Authorization") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Authorization", j, i+2);
			}
		}
		return data;			
	 
	}
	@DataProvider(name ="crtNum")
	public Object[][] searchCaseNum() {
		//Totals rows count
		int rows=obj.getRowCount("CrtNumber") ;
		//Total Columns
		int column=obj.getColumnCount ("CrtNumber") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("CrtNumber", j, i+2);
			}
		}
		return data;			
	 
	}
	
	
	@DataProvider(name ="AutoComponentVerification")
	public Object[][] setVerifierAuto() {
		//Totals rows count
		int rows=obj.getRowCount("Verifier validation") ;
		//Total Columns
		int column=obj.getColumnCount ("Verifier validation") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Verifier validation", j, i+2);
			}
		}
		return data;	
	}
	@DataProvider(name ="Insufficent")
	public Object[][] setinsuff() {
		//Totals rows count
		int rows=obj.getRowCount("Insufficient") ;
		//Total Columns
		int column=obj.getColumnCount ("Insufficient") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Insufficient", j, i+2);
			}
		}
		return data;	
	}
	@DataProvider(name ="Rejection")
	public Object[][] setRejection() {
		//Totals rows count
		int rows=obj.getRowCount("Rejection") ;
		//Total Columns
		int column=obj.getColumnCount ("Rejection") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("Rejection", j, i+2);
			}
		}
		return data;	
	}
	@DataProvider(name ="CandidateFlow")
	public Object[][] setCandidateFlow() {
		//Totals rows count
		int rows=obj.getRowCount("CandidateFlow") ;
		//Total Columns
		int column=obj.getColumnCount ("CandidateFlow") ;
		int actRows=rows-1;
		Object[][] data= new Object[actRows] [column];
		for(int i=0;i<actRows;i++) {
			for(int j=0; j<column;j++) {
				data[i][j]=obj.getCellData("CandidateFlow", j, i+2);
			}
		}
		return data;	
	}
	
}

