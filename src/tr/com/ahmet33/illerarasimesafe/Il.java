package tr.com.ahmet33.illerarasimesafe;



public class Il {

	int ID1;
	int ID2;
	int MESAFE;
	
	
	/*Constructor(Yapýlandýrýcý):1*/
	public Il(){
		//varsayýlan...
	}
	/*Constructor(Yapýlandýrýcý):2*/
	public Il(int _ID1,int _ID2, int _mesafe){
		this.ID1 = _ID1;
		this.ID2 = _ID2;
		this.MESAFE = _mesafe;
	
	}
	

	
	/*ID ayarla:*/
	public void setID1(int _ID1){
		this.ID1 = _ID1;
    }
		
	/*ID bilgisini çaðýr:*/
	public int getID1(){
		return this.ID1;
	}
	
	/*ID ayarla:*/
	public void setID2(int _ID2){
		this.ID2 = _ID2;
    }
		
	/*ID bilgisini çaðýr:*/
	public int getID2(){
		return this.ID2;
	}
	
	/*ID ayarla:*/
	public void setMESAFE(int _MESAFE){
		this.MESAFE = _MESAFE;
    }
		
	/*ID bilgisini çaðýr:*/
	public int getMESAFE(){
		return this.MESAFE;
	}
	
	
	

}
