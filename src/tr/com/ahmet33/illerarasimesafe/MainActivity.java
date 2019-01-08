package tr.com.ahmet33.illerarasimesafe;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	private String array_spinner[];
	private Spinner il1, il2;
	private Button btnHesapla;
	private AutoCompleteTextView sonuc;
	private ImageButton imageButton1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		illeriDoldur();
		addListenerOnButton();
		addListenerOnSpinnerItemSelection();

	}

	public void addListenerOnSpinnerItemSelection() {

		il1 = (Spinner) findViewById(R.id.il1);
		il2.setOnItemSelectedListener(new ListenerIl());
	}

	// get the selected dropdown list value
	public void addListenerOnButton() {

		il1 = (Spinner) findViewById(R.id.il1);
		il2 = (Spinner) findViewById(R.id.il2);

		btnHesapla = (Button) findViewById(R.id.btnHesapla);

		// sonuc=(AutoCompleteTextView) findViewById(R.id.sonuc);
		
		imageButton1=(ImageButton)  findViewById(R.id.imageButton1);
		
		imageButton1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Toast.makeText(
						MainActivity.this,
								"Fika Yazýlým 2014"+"\n"
								+"ahmet33@gmail.com"
								+ "\n"
								+ "\n"
								+" iyi yolculuklar dileriz "		
										,
										Toast.LENGTH_LONG).show();

			

			}
		});

		

		btnHesapla.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				VeritabaniIsleme veritabani = new VeritabaniIsleme(
						getApplicationContext());
				
				Toast.makeText(
						MainActivity.this,
								String.valueOf(il1.getSelectedItem()).trim() +" - "
								
								+ String.valueOf(il2.getSelectedItem()).trim()
								+ "\n"
								+ "ARASI  MESAFE "
								+ "\n" +il1.getSelectedItemId() +"-"+il2.getSelectedItemId() 
								+ "\n"
								+veritabani.mesafeGetir(il1.getSelectedItemPosition()+1, il2.getSelectedItemPosition()+1).MESAFE
								+ " KÝLOMETREDÝR."
								+ "\n"
										
										,
										Toast.LENGTH_LONG).show();

				
				/* kayýt ekle: */
				// veritabani.kayitEkle(new Il(1,"Deneme"));

				// sonuc.setText(String.valueOf(il1.getSelectedItem())
				// +"-"+String.valueOf(il2.getSelectedItem())
				// +" arasý 400 km dir.");

				//sonuc.setText(veritabani.kayitSayisi());

			}
			
			
			

		});

	}

	public void illeriDoldur() {
		array_spinner = new String[81];

		array_spinner[0] = "	ADANA	";
		array_spinner[1] = "	ADIYAMAN	";
		array_spinner[2] = "	AFYONKARAHÝSAR	";
		array_spinner[3] = "	AÐRI	";
		array_spinner[4] = "	AMASYA	";
		array_spinner[5] = "	ANKARA	";
		array_spinner[6] = "	ANTALYA	";
		array_spinner[7] = "	ARTVÝN	";
		array_spinner[8] = "	AYDIN	";
		array_spinner[9] = "	BALIKESÝR	";
		array_spinner[10] = "	BÝLECÝK	";
		array_spinner[11] = "	BÝNGÖL	";
		array_spinner[12] = "	BÝTLÝS	";
		array_spinner[13] = "	BOLU	";
		array_spinner[14] = "	BURDUR	";
		array_spinner[15] = "	BURSA	";
		array_spinner[16] = "	ÇANAKKALE	";
		array_spinner[17] = "	ÇANKIRI	";
		array_spinner[18] = "	ÇORUM	";
		array_spinner[19] = "	DENÝZLÝ	";
		array_spinner[20] = "	DÝYARBAKIR	";
		array_spinner[21] = "	EDÝRNE	";
		array_spinner[22] = "	ELAZIÐ	";
		array_spinner[23] = "	ERZÝNCAN	";
		array_spinner[24] = "	ERZURUM	";
		array_spinner[25] = "	ESKÝÞEHÝR	";
		array_spinner[26] = "	GAZÝANTEP	";
		array_spinner[27] = "	GÝRESUN	";
		array_spinner[28] = "	GÜMÜÞHANE	";
		array_spinner[29] = "	HAKKARÝ	";
		array_spinner[30] = "	HATAY	";
		array_spinner[31] = "	ISPARTA	";
		array_spinner[32] = "	MERSÝN	";
		array_spinner[33] = "	ÝSTANBUL	";
		array_spinner[34] = "	ÝZMÝR	";
		array_spinner[35] = "	KARS	";
		array_spinner[36] = "	KASTAMONU	";
		array_spinner[37] = "	KAYSERÝ	";
		array_spinner[38] = "	KIRKLARELÝ	";
		array_spinner[39] = "	KIRÞEHÝR	";
		array_spinner[40] = "	KOCAELÝ	";
		array_spinner[41] = "	KONYA	";
		array_spinner[42] = "	KÜTAHYA	";
		array_spinner[43] = "	MALATYA	";
		array_spinner[44] = "	MANÝSA	";
		array_spinner[45] = "	KAHRAMANMARAÞ	";
		array_spinner[46] = "	MARDÝN	";
		array_spinner[47] = "	MUÐLA	";
		array_spinner[48] = "	MUÞ	";
		array_spinner[49] = "	NEVÞEHÝR	";
		array_spinner[50] = "	NÝÐDE	";
		array_spinner[51] = "	ORDU	";
		array_spinner[52] = "	RÝZE	";
		array_spinner[53] = "	SAKARYA	";
		array_spinner[54] = "	SAMSUN	";
		array_spinner[55] = "	SÝÝRT	";
		array_spinner[56] = "	SÝNOP	";
		array_spinner[57] = "	SÝVAS	";
		array_spinner[58] = "	TEKÝRDAÐ	";
		array_spinner[59] = "	TOKAT	";
		array_spinner[60] = "	TRABZON	";
		array_spinner[61] = "	TUNCELÝ	";
		array_spinner[62] = "	ÞANLIURFA	";
		array_spinner[63] = "	UÞAK	";
		array_spinner[64] = "	VAN	";
		array_spinner[65] = "	YOZGAT	";
		array_spinner[66] = "	ZONGULDAK	";
		array_spinner[67] = "	AKSARAY	";
		array_spinner[68] = "	BAYBURT	";
		array_spinner[69] = "	KARAMAN	";
		array_spinner[70] = "	KIRIKKALE	";
		array_spinner[71] = "	BATMAN	";
		array_spinner[72] = "	ÞIRNAK	";
		array_spinner[73] = "	BARTIN	";
		array_spinner[74] = "	ARDAHAN	";
		array_spinner[75] = "	IÐDIR	";
		array_spinner[76] = "	YALOVA	";
		array_spinner[77] = "	KARABÜK	";
		array_spinner[78] = "	KÝLÝS	";
		array_spinner[79] = "	OSMANÝYE	";
		array_spinner[80] = "	DÜZCE	";

		Spinner s = (Spinner) findViewById(R.id.il1);
		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_spinner_dropdown_item, array_spinner);
		s.setAdapter(adapter);

		Spinner s1 = (Spinner) findViewById(R.id.il2);
		ArrayAdapter adapter1 = new ArrayAdapter(this,
				android.R.layout.simple_spinner_dropdown_item, array_spinner);
		s1.setAdapter(adapter1);

	}
}
