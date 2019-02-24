package austinwhite.tech.basicconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    EditText inputf;
    EditText inputc;
    Button fahrenheitconvert;
    Button celsiusconvert;
    TextView FtoC;
    TextView CtoF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FtoC = findViewById(R.id.FtoCview);

        CtoF = findViewById(R.id.CtoFconvert);

        inputf = findViewById(R.id.fahrenheit);

        inputc = findViewById(R.id.celsius);

        fahrenheitconvert = findViewById(R.id.convertfahrenheit);

        celsiusconvert = findViewById(R.id.convertcelsius);


        fahrenheitconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(inputf.getText()));
                int convert = (num1 - 32 * 5 / 9);
                String x = Integer.toString(convert);
                FtoC.setText(x);
            }
        });
        celsiusconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num2 = Integer.parseInt(String.valueOf(inputc.getText()));
                int convert2 = (num2 * 9/5 + 32);
                String y = Integer.toString(convert2);
                CtoF.setText(y);
            }
        });


    }
}
