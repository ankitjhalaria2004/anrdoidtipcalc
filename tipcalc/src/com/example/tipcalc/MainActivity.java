package com.example.tipcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText totalBill = (EditText)findViewById(R.id.billAmount);
		final TextView tipAmount = (TextView)findViewById(R.id.tipAmount);
		
		 final Button btnTenPercentTip = (Button) findViewById(R.id.button10);
		 btnTenPercentTip.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
            	 double billAmount =  Double.valueOf(totalBill.getText().toString());
            	 tipAmount.setText(calculateTipAmount(billAmount, 10));
             }
         });

		 final Button btnFifteenPercentTip = (Button) findViewById(R.id.button15);
		 btnFifteenPercentTip.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
            	 double billAmount =  Double.valueOf(totalBill.getText().toString());
            	 tipAmount.setText(calculateTipAmount(billAmount, 15));
             }
         });
		 
		 final Button btnTwentyPercentTip = (Button) findViewById(R.id.button20);
		 btnTwentyPercentTip.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
            	 double billAmount =  Double.valueOf(totalBill.getText().toString());
            	 tipAmount.setText(calculateTipAmount(billAmount, 20));
             }
         });
		
	}
	
	private String calculateTipAmount(double billAmount, int tipPercent) {
		return "$" + Double.toString((billAmount * tipPercent/100));
	}

}
