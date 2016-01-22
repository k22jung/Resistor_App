package k22jung.resistor_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1;
    String band1_color = "Band 1";
    int band1_int = 0;
    ImageView color1;
    ArrayAdapter<CharSequence> adapter1;

    Spinner spinner2;
    String band2_color = "Band 2";
    int band2_int = 0;
    ImageView color2;
    ArrayAdapter<CharSequence> adapter2;

    Spinner spinner3;
    String band3_color = "Band 3";
    double band3_value = 1;
    char band3_char = '\0';
    ImageView color3;
    ArrayAdapter<CharSequence> adapter3;

    Spinner spinner4;
    String band4_color = "Band 4";
    double band4_percent = 0;
    double tolerance = 0;
    ImageView color4;
    ArrayAdapter<CharSequence> adapter4;

    Button button;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //------------------------------------ BAND 1 ----------------------------------------------
        color1 = (ImageView) findViewById(R.id.color1);

        spinner1 = (Spinner) findViewById(R.id.band1);
        adapter1 = ArrayAdapter.createFromResource(this,R.array.first_band_colors,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!parent.getItemAtPosition(position).equals("Band 1")) {
                    Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected",
                        Toast.LENGTH_LONG).show();
                }
                
                band1_color = parent.getItemAtPosition(position).toString();
                
                /*String band1_color = "Band 1";
                int band1_int = 0;*/
    
                switch(band1_color) {
                    case "Band 1":
                        color1.setBackgroundColor(Color.parseColor("#00000000"));
                        break;
                    case "Black":
                        band1_int = 0;
                        color1.setBackgroundColor(Color.parseColor("#000000"));
                        break; 
                    case "Brown":
                        band1_int = 1;
                        color1.setBackgroundColor(Color.parseColor("#835C3B"));
                        break; 
                    case "Red":
                        band1_int = 2;
                        color1.setBackgroundColor(Color.parseColor("#FF0000"));
                        break; 
                    case "Orange":
                        band1_int = 3;
                        color1.setBackgroundColor(Color.parseColor("#FF8000"));
                        break; 
                    case "Yellow":
                        band1_int = 4;
                        color1.setBackgroundColor(Color.parseColor("#FFFF00"));
                        break; 
                    case "Green":
                        band1_int = 5;
                        color1.setBackgroundColor(Color.parseColor("#009A00"));
                        break; 
                    case "Blue":
                        band1_int = 6;
                        color1.setBackgroundColor(Color.parseColor("#006FFF"));
                        break; 
                    case "Violet":
                        band1_int = 7;
                        color1.setBackgroundColor(Color.parseColor("#BF00FF"));
                        break; 
                    case "Grey":
                        band1_int = 8;
                        color1.setBackgroundColor(Color.parseColor("#A4A4A4"));
                        break; 
                    case "White":
                        band1_int = 9;
                        color1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //------------------------------------ BAND 2 ----------------------------------------------
        color2 = (ImageView) findViewById(R.id.color2);

        spinner2 = (Spinner) findViewById(R.id.band2);
        adapter2 = ArrayAdapter.createFromResource(this,R.array.second_band_colors,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!parent.getItemAtPosition(position).equals("Band 2")) {
                    Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected",
                        Toast.LENGTH_LONG).show();
                }
                        
                band2_color = parent.getItemAtPosition(position).toString();
                
                /*String band2_color = "Band 2";
                int band2_int = 0;*/
                
                switch(band2_color) {
                    case "Band 2":
                        color2.setBackgroundColor(Color.parseColor("#00000000"));
                        break;
                    case "Black":
                        band2_int = 0;
                        color2.setBackgroundColor(Color.parseColor("#000000"));
                        break; 
                    case "Brown":
                        band2_int = 1;
                        color2.setBackgroundColor(Color.parseColor("#835C3B"));
                        break; 
                    case "Red":
                        band2_int = 2;
                        color2.setBackgroundColor(Color.parseColor("#FF0000"));
                        break; 
                    case "Orange":
                        band2_int = 3;
                        color2.setBackgroundColor(Color.parseColor("#FF8000"));
                        break; 
                    case "Yellow":
                        band2_int = 4;
                        color2.setBackgroundColor(Color.parseColor("#FFFF00"));
                        break; 
                    case "Green":
                        band2_int = 5;
                        color2.setBackgroundColor(Color.parseColor("#009A00"));
                        break; 
                    case "Blue":
                        band2_int = 6;
                        color2.setBackgroundColor(Color.parseColor("#006FFF"));
                        break; 
                    case "Violet":
                        band2_int = 7;
                        color2.setBackgroundColor(Color.parseColor("#BF00FF"));
                        break; 
                    case "Grey":
                        band2_int = 8;
                        color2.setBackgroundColor(Color.parseColor("#A4A4A4"));
                        break;
                    case "White":
                        band2_int = 9;
                        color2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                
            }
        });



        //------------------------------------ BAND 3 ----------------------------------------------
        color3 = (ImageView) findViewById(R.id.color3);

        spinner3 = (Spinner) findViewById(R.id.band3);
        adapter3 = ArrayAdapter.createFromResource(this,R.array.multiplier_colors,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!parent.getItemAtPosition(position).equals("Band 3")) {
                    Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected",
                        Toast.LENGTH_LONG).show();
                }
                
                band3_color = parent.getItemAtPosition(position).toString();
                
                /*String band3_color = "Band 3";
                double band3_value = 1;
                char band3_char = '\0';*/
                
                switch(band3_color) {
                    case "Band 3":
                        color3.setBackgroundColor(Color.parseColor("#00000000"));
                        break;
                    case "Black":
                        band3_value = 1;
                        band3_char = '\0';
                        color3.setBackgroundColor(Color.parseColor("#000000"));
                        break; 
                    case "Brown":
                        band3_value = 10;
                        band3_char = '\0';
                        color3.setBackgroundColor(Color.parseColor("#835C3B"));
                        break; 
                    case "Red":
                        band3_value = 100;
                        band3_char = '\0';
                        color3.setBackgroundColor(Color.parseColor("#FF0000"));
                        break; 
                    case "Orange":
                        band3_value = 1;
                        band3_char = 'k';
                        color3.setBackgroundColor(Color.parseColor("#FF8000"));
                        break; 
                    case "Yellow":
                        band3_value = 10;
                        band3_char = 'k';
                        color3.setBackgroundColor(Color.parseColor("#FFFF00"));
                        break; 
                    case "Green":
                        band3_value = 100;
                        band3_char = 'k';
                        color3.setBackgroundColor(Color.parseColor("#009A00"));
                        break; 
                    case "Blue":
                        band3_value = 1;
                        band3_char = 'M';
                        color3.setBackgroundColor(Color.parseColor("#006FFF"));
                        break; 
                    case "Violet":
                        band3_value = 10;
                        band3_char = 'M';
                        color3.setBackgroundColor(Color.parseColor("#BF00FF"));
                        break; 
                    case "Gold":
                        band3_value = 0.1;
                        band3_char = '\0';
                        color3.setBackgroundColor(Color.parseColor("#E2C20B"));
                        break; 
                    case "Silver":
                        band3_value = 0.01;
                        band3_char = '\0';
                        color3.setBackgroundColor(Color.parseColor("#CBCBCB"));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        //------------------------------------ BAND 4 ----------------------------------------------
        color4 = (ImageView) findViewById(R.id.color4);

        spinner4 = (Spinner) findViewById(R.id.band4);
        adapter4 = ArrayAdapter.createFromResource(this,R.array.tolerance_colors,
                android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (!parent.getItemAtPosition(position).equals("Band 4")) {
                    Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected",
                        Toast.LENGTH_LONG).show();
                }
                
                band4_color = parent.getItemAtPosition(position).toString();
                
                /*String band4_color = "Band 4";
                 double band4_percent = 0;
                 double tolerance = 0;*/
    
                switch(band4_color) {
                    case "Band 4":
                        color4.setBackgroundColor(Color.parseColor("#00000000"));
                        break;
                    case "Brown":
                        band4_percent = 0.01;
                        color4.setBackgroundColor(Color.parseColor("#835C3B"));
                        break; 
                    case "Red":
                        band4_percent = 0.02;
                        color4.setBackgroundColor(Color.parseColor("#FF0000"));
                        break; 
                    case "Green":
                        band4_percent = 0.005;
                        color4.setBackgroundColor(Color.parseColor("#009A00"));
                        break; 
                    case "Blue":
                        band4_percent = 0.0025;
                        color4.setBackgroundColor(Color.parseColor("#006FFF"));
                        break; 
                    case "Violet":
                        band4_percent = 0.001;
                        color4.setBackgroundColor(Color.parseColor("#BF00FF"));
                        break; 
                    case "Grey":
                        band4_percent = 0.0005;
                        color4.setBackgroundColor(Color.parseColor("#A4A4A4"));
                        break; 
                    case "Gold":
                        band4_percent = 0.05;
                        color4.setBackgroundColor(Color.parseColor("#E2C20B"));
                        break;
                    case "Silver":
                        band4_percent = 0.1;
                        color4.setBackgroundColor(Color.parseColor("#CBCBCB"));
                        break;
                }

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

                        //If colors are unselected, do not answer.
                        if (band1_color.equals("Band 1") || band2_color.equals("Band 2")
                                || band3_color.equals("Band 3") || band4_color.equals("Band 4")){
                            answer_text.setText("\0"); 
                        } else {
                            double answer_value = (band1_int*10 + band2_int)*band3_value;

                            //Truncate so no floating-point errors occur.
                            tolerance = Math.round(1.0E6*band4_percent*answer_value)/1.0E6;
                            
                            //Don't round whole number (contains decimals)
                            if (band3_color.equals("Gold") || band3_color.equals("Silver")){ 
                                answer_text.setText(Math.round(1000.0*answer_value)/1000.0 + " "
                                        + band3_char + "Ω  ± " + 100*band4_percent + "% (" +
                                        tolerance + " " + band3_char + "Ω)");
                            } else { //Round whole number (contains unwanted decimals)
                                answer_text.setText(Math.round(answer_value) + " " + band3_char +
                                "Ω  ± " + 100*band4_percent + "% (" + tolerance + " " + band3_char
                                + "Ω)");
                            }
                            
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
