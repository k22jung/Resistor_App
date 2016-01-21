package k22jung.resistor_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1;
    String band1_color = "Band 1";
    int band1_int = 0;
    ArrayAdapter<CharSequence> adapter1;

    Spinner spinner2;
    String band2_color = "Band 2";
    int band2_int = 0;
    ArrayAdapter<CharSequence> adapter2;

    Spinner spinner3;
    String band3_color = "Band 3";
    int band3_int = 1;
    char band3_char = ' ';
    ArrayAdapter<CharSequence> adapter3;

    Spinner spinner4;
    String band4_color = "Band 4";
    double band4_percent = 0;
    double tolerance = 0;
    ArrayAdapter<CharSequence> adapter4;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //------------------------------------ BAND 1 ----------------------------------------------
        spinner1 = (Spinner) findViewById(R.id.band1);
        adapter1 = ArrayAdapter.createFromResource(this,R.array.first_band_colors,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected",
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //------------------------------------ BAND 2 ----------------------------------------------
        spinner2 = (Spinner) findViewById(R.id.band2);
        adapter2 = ArrayAdapter.createFromResource(this,R.array.second_band_colors,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //------------------------------------ BAND 3 ----------------------------------------------
        spinner3 = (Spinner) findViewById(R.id.band3);
        adapter3 = ArrayAdapter.createFromResource(this,R.array.multiplier_colors,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //------------------------------------ BAND 4 ----------------------------------------------
        spinner4 = (Spinner) findViewById(R.id.band4);
        adapter4 = ArrayAdapter.createFromResource(this,R.array.tolerance_colors,
                android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        button = (Button)findViewById(R.id.button);

        button.setOnClickListener( //Event listener
                new Button.OnClickListener() { // Interface
                    public void onClick(View v) {// Callback method (response of the click)
                        TextView answer_text = (TextView) findViewById(R.id.answer);

                        if (band1_color.equals("Band 1") || band2_color.equals("Band 2")
                                || band3_color.equals("Band 3") || band4_color.equals("Band 4")){
                            answer_text.setText("");
                        } else {
                            answer_text.setText(""); //Incomplete
                        }

                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
