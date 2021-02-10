package mcm.edu.ph.tapenit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boolean condition;
        int x=0;

        Intent i = getIntent();
        x = i.getIntExtra("INT_MONTHS",0);

        TextView display = findViewById(R.id.textView);

        switch (x){
            case 1:
                display.setText("The month you have type is January");
                break;
            case 2:
                display.setText("The month you have type is February");
                break;
            case 3:
                display.setText("The month you have type is March");
                break;
            case 4:
                display.setText("The month you have type is April");
                break;
            case 5:
                display.setText("The month you have type is May");
                break;
            case 6:
                display.setText("The month you have type is June");
                break;
            case 7:
                display.setText("The month you have type is July");
                break;
            case 8:
                display.setText("The month you have type is August");
                break;
            case 9:
                display.setText("The month you have type is September");
                break;
            case 10:
                display.setText("The month you have type is October");
                break;
            case 11:
                display.setText("The month you have type is November");
                break;
            case 12:
                display.setText("The month you have type is December");
                break;
            default:
                display.setText("ERROR: you type a wrong number");
                break;
        }


    }
}