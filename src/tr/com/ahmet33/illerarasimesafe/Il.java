package tr.com.ahmet33.illerarasimesafe;



public class Il {

	int ID1;
	int ID2;
	int MESAFE;
	
	
	/*Constructor(Yap�land�r�c�):1*/
	public Il(){
		//varsay�lan...
	}
	/*Constructor(Yap�land�r�c�):2*/
	public Il(int _ID1,int _ID2, int _mesafe){
		this.ID1 = _ID1;
		this.ID2 = _ID2;
		this.MESAFE = _mesafe;
	
	}
	

	
	/*ID ayarla:*/
	public void setID1(int _ID1){
		this.ID1 = _ID1;
    }
		
	/*ID bilgisini �a��r:*/
	public int getID1(){
		return this.ID1;
	}
	
	/*ID ayarla:*/
	public void setID2(int _ID2){
		this.ID2 = _ID2;
    }
		
	/*ID bilgisini �a��r:*/
	public int getID2(){
		return this.ID2;
	}
	
	/*ID ayarla:*/
	public void setMESAFE(int _MESAFE){
		this.MESAFE = _MESAFE;
    }
		
	/*ID bilgisini �a��r:*/
	public int getMESAFE(){
		return this.MESAFE;
	}
	
	
	

}
