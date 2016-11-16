package at.fh.swengb.kmtomiconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextNum1);
        resultView = (TextView) findViewById(R.id.textViewResult);
    }

    public void ConvToMI (View view) {

        String numberString = editText.getText().toString();

        double number = 0;
        double convert = 0.62137;

        try {
            number=Double.parseDouble(numberString);

            double result = number*convert;
            String resultRounded = String.format("%.2f",result);
            resultView.setText(numberString+" * 0.62137 = " + resultRounded);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


    public void ConvToKM (View view) {

        String numberString = editText.getText().toString();

        double number = 0;
        double convert = 0.62137;

        try {
            number=Double.parseDouble(numberString);

            double result = number/convert;
            String resultRounded = String.format("%.2f",result);
            resultView.setText(numberString+" / 0.62137 = " + resultRounded);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


    public void showAbout (View view) {

        Intent intent = new Intent(this,DisplayAboutActivity.class);
        String message = resultView.getText().toString();
        intent.putExtra("data",message);
        startActivity(intent);
    }


}
