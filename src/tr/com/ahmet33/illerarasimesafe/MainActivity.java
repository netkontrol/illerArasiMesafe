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
								"Fika Yaz�l�m 2014"+"\n"
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
								+ " K�LOMETRED�R."
								+ "\n"
										
										,
										Toast.LENGTH_LONG).show();

				
				/* kay�t ekle: */
				// veritabani.kayitEkle(new Il(1,"Deneme"));

				// sonuc.setText(String.valueOf(il1.getSelectedItem())
				// +"-"+String.valueOf(il2.getSelectedItem())
				// +" aras� 400 km dir.");

				//sonuc.setText(veritabani.kayitSayisi());

			}
			
			
			

		});

	}

	public void illeriDoldur() {
		array_spinner = new String[81];

		array_spinner[0] = "	ADANA	";
		array_spinner[1] = "	ADIYAMAN	";
		array_spinner[2] = "	AFYONKARAH�SAR	";
		array_spinner[3] = "	A�RI	";
		array_spinner[4] = "	AMASYA	";
		array_spinner[5] = "	ANKARA	";
		array_spinner[6] = "	ANTALYA	";
		array_spinner[7] = "	ARTV�N	";
		array_spinner[8] = "	AYDIN	";
		array_spinner[9] = "	BALIKES�R	";
		array_spinner[10] = "	B�LEC�K	";
		array_spinner[11] = "	B�NG�L	";
		array_spinner[12] = "	B�TL�S	";
		array_spinner[13] = "	BOLU	";
		array_spinner[14] = "	BURDUR	";
		array_spinner[15] = "	BURSA	";
		array_spinner[16] = "	�ANAKKALE	";
		array_spinner[17] = "	�ANKIRI	";
		array_spinner[18] = "	�ORUM	";
		array_spinner[19] = "	DEN�ZL�	";
		array_spinner[20] = "	D�YARBAKIR	";
		array_spinner[21] = "	ED�RNE	";
		array_spinner[22] = "	ELAZI�	";
		array_spinner[23] = "	ERZ�NCAN	";
		array_spinner[24] = "	ERZURUM	";
		array_spinner[25] = "	ESK��EH�R	";
		array_spinner[26] = "	GAZ�ANTEP	";
		array_spinner[27] = "	G�RESUN	";
		array_spinner[28] = "	G�M��HANE	";
		array_spinner[29] = "	HAKKAR�	";
		array_spinner[30] = "	HATAY	";
		array_spinner[31] = "	ISPARTA	";
		array_spinner[32] = "	MERS�N	";
		array_spinner[33] = "	�STANBUL	";
		array_spinner[34] = "	�ZM�R	";
		array_spinner[35] = "	KARS	";
		array_spinner[36] = "	KASTAMONU	";
		array_spinner[37] = "	KAYSER�	";
		array_spinner[38] = "	KIRKLAREL�	";
		array_spinner[39] = "	KIR�EH�R	";
		array_spinner[40] = "	KOCAEL�	";
		array_spinner[41] = "	KONYA	";
		array_spinner[42] = "	K�TAHYA	";
		array_spinner[43] = "	MALATYA	";
		array_spinner[44] = "	MAN�SA	";
		array_spinner[45] = "	KAHRAMANMARA�	";
		array_spinner[46] = "	MARD�N	";
		array_spinner[47] = "	MU�LA	";
		array_spinner[48] = "	MU�	";
		array_spinner[49] = "	NEV�EH�R	";
		array_spinner[50] = "	N��DE	";
		array_spinner[51] = "	ORDU	";
		array_spinner[52] = "	R�ZE	";
		array_spinner[53] = "	SAKARYA	";
		array_spinner[54] = "	SAMSUN	";
		array_spinner[55] = "	S��RT	";
		array_spinner[56] = "	S�NOP	";
		array_spinner[57] = "	S�VAS	";
		array_spinner[58] = "	TEK�RDA�	";
		array_spinner[59] = "	TOKAT	";
		array_spinner[60] = "	TRABZON	";
		array_spinner[61] = "	TUNCEL�	";
		array_spinner[62] = "	�ANLIURFA	";
		array_spinner[63] = "	U�AK	";
		array_spinner[64] = "	VAN	";
		array_spinner[65] = "	YOZGAT	";
		array_spinner[66] = "	ZONGULDAK	";
		array_spinner[67] = "	AKSARAY	";
		array_spinner[68] = "	BAYBURT	";
		array_spinner[69] = "	KARAMAN	";
		array_spinner[70] = "	KIRIKKALE	";
		array_spinner[71] = "	BATMAN	";
		array_spinner[72] = "	�IRNAK	";
		array_spinner[73] = "	BARTIN	";
		array_spinner[74] = "	ARDAHAN	";
		array_spinner[75] = "	I�DIR	";
		array_spinner[76] = "	YALOVA	";
		array_spinner[77] = "	KARAB�K	";
		array_spinner[78] = "	K�L�S	";
		array_spinner[79] = "	OSMAN�YE	";
		array_spinner[80] = "	D�ZCE	";

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
