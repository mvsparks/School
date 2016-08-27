package sparks.csit.lab3app1;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import static sparks.csit.lab3app1.R.id.editTextRadius;
import static sparks.csit.lab3app1.R.id.spinnerShapes;

public class MainActivity extends AppCompatActivity {

    final double PI = Math.PI;
    double radius, height, length, width,
            sideA, sideB, sideC, area, circumference,
            surfaceArea, perimeter, volume, s;
    String shapeSelection;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final Spinner shapeSpinner = (Spinner) findViewById(R.id.spinnerShapes);



        shapeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                EditText radiusText = (EditText) findViewById(R.id.editTextRadius);
                EditText heightText = (EditText) findViewById(R.id.editTextHeight);
                EditText lengthText = (EditText) findViewById(R.id.editTextLength);
                EditText widthText = (EditText) findViewById(R.id.editTextWidth);
                EditText sideAText = (EditText) findViewById(R.id.editTextSideA);
                EditText sideBText = (EditText) findViewById(R.id.editTextSideB);
                EditText sideCText = (EditText) findViewById(R.id.editTextSideC);

                shapeSelection = shapeSpinner.getSelectedItem().toString();


                if (shapeSelection.equalsIgnoreCase("Select Shape")) {
                    lengthText.setVisibility(View.GONE);
                    heightText.setVisibility(View.GONE);
                    sideAText.setVisibility(View.GONE);
                    sideBText.setVisibility(View.GONE);
                    sideCText.setVisibility(View.GONE);
                    widthText.setVisibility(View.GONE);
                    radiusText.setVisibility(View.GONE);
                } else if (shapeSelection.equalsIgnoreCase("Circle")) {
                    lengthText.setVisibility(View.GONE);
                    heightText.setVisibility(View.GONE);
                    sideAText.setVisibility(View.GONE);
                    sideBText.setVisibility(View.GONE);
                    sideCText.setVisibility(View.GONE);
                    widthText.setVisibility(View.GONE);
                    radiusText.setVisibility(View.VISIBLE);
                } else if (shapeSelection.equalsIgnoreCase("Cylinder")) {
                    lengthText.setVisibility(View.GONE);
                    heightText.setVisibility(View.GONE);
                    sideAText.setVisibility(View.GONE);
                    sideBText.setVisibility(View.GONE);
                    sideCText.setVisibility(View.GONE);
                    widthText.setVisibility(View.GONE);
                    heightText.setVisibility(View.VISIBLE);
                    radiusText.setVisibility(View.VISIBLE);
                } else if (shapeSelection.equalsIgnoreCase("Rectangle")) {
                    radiusText.setVisibility(View.GONE);
                    sideAText.setVisibility(View.GONE);
                    sideBText.setVisibility(View.GONE);
                    sideCText.setVisibility(View.GONE);
                    heightText.setVisibility(View.GONE);
                    widthText.setVisibility(View.VISIBLE);
                    lengthText.setVisibility(View.VISIBLE);
                } else if (shapeSelection.equalsIgnoreCase("Triangle")) {
                    radiusText.setVisibility(View.GONE);
                    lengthText.setVisibility(View.GONE);
                    heightText.setVisibility(View.GONE);
                    widthText.setVisibility(View.GONE);
                    sideAText.setVisibility(View.VISIBLE);
                    sideBText.setVisibility(View.VISIBLE);
                    sideCText.setVisibility(View.VISIBLE);
                } else if (shapeSelection.equalsIgnoreCase("Sphere")) {
                    lengthText.setVisibility(View.GONE);
                    heightText.setVisibility(View.GONE);
                    sideAText.setVisibility(View.GONE);
                    sideBText.setVisibility(View.GONE);
                    sideCText.setVisibility(View.GONE);
                    widthText.setVisibility(View.GONE);
                    radiusText.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //register listener on find volume button
        final Button calcButton = (Button) findViewById(R.id.buttonCalcVolumeButton);

        calcButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText radiusText = (EditText) findViewById(R.id.editTextRadius);
                EditText heightText = (EditText) findViewById(R.id.editTextHeight);
                EditText lengthText = (EditText) findViewById(R.id.editTextLength);
                EditText widthText = (EditText) findViewById(R.id.editTextWidth);
                EditText sideAText = (EditText) findViewById(R.id.editTextSideA);
                EditText sideBText = (EditText) findViewById(R.id.editTextSideB);
                EditText sideCText = (EditText) findViewById(R.id.editTextSideC);

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);

                intent.putExtra("shapeSelected", shapeSelection);

                if(shapeSelection.equalsIgnoreCase("Circle")){
                    if(radiusText.getText().toString().length() == 0){
                        radiusText.setError("Please Enter Radius");
                    }
                    else {
                        radius = Double.parseDouble(radiusText.getText().toString());

                        area = PI * radius * radius;
                        circumference = 2 * PI * radius;

                        intent.putExtra("enteredRadius", radiusText.getText().toString());
                        intent.putExtra("area", area);
                        intent.putExtra("circumference", circumference);

                        startActivity(intent);
                    }

                } else if(shapeSelection.equalsIgnoreCase("Cylinder")){
                    if(radiusText.getText().toString().length() == 0) {
                        radiusText.setError("Error");
                    } else if(heightText.getText().toString().length() == 0){
                        heightText.setError("Error");
                    } else {
                        radius = Double.parseDouble(radiusText.getText().toString());
                        height = Double.parseDouble(heightText.getText().toString());

                        volume = PI * radius * radius * height;
                        surfaceArea = 2 * PI * height + 2 * PI * radius * radius;

                        intent.putExtra("volume", volume);
                        intent.putExtra("surfaceArea", surfaceArea);

                        startActivity(intent);
                    }
                } else if(shapeSelection.equalsIgnoreCase("Rectangle")){
                    if(lengthText.getText().toString().length() == 0){
                        lengthText.setError("Error");
                    } else if(widthText.getText().toString().length() == 0){
                        widthText.setError("Error");
                    } else {
                        length = Double.parseDouble(lengthText.getText().toString());
                        width = Double.parseDouble(widthText.getText().toString());

                        area = length * width;
                        perimeter = 2 * (length + width);

                        intent.putExtra("area", area);
                        intent.putExtra("perimeter", perimeter);

                        startActivity(intent);
                    }
                } else if(shapeSelection.equalsIgnoreCase("Triangle")) {
                    if (sideAText.getText().toString().length() == 0) {
                        sideAText.setError("Error");
                    } else if (sideBText.getText().toString().length() == 0) {
                        sideBText.setError("Error");
                    } else if (sideCText.getText().toString().length() == 0) {
                        sideCText.setError("Error");
                    } else if (((sideA + sideB) > sideC) && ((sideA + sideC) > sideB) && ((sideC + sideB) > sideA)) {
                        calcButton.setError("Error");
                    } else {
                        sideA = Double.parseDouble(sideAText.getText().toString());
                        sideB = Double.parseDouble(sideBText.getText().toString());
                        sideC = Double.parseDouble(sideCText.getText().toString());

                        s = (sideA + sideB + sideC) / 2;
                        area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
                        perimeter = sideA + sideB + sideC;

                        intent.putExtra("s", s);
                        intent.putExtra("area", area);
                        intent.putExtra("perimeter", perimeter);

                        startActivity(intent);
                    }
                } else if(shapeSelection.equalsIgnoreCase("Sphere")){
                    if (radiusText.getText().toString().length() == 0) {
                        radiusText.setError("Error");
                    } else {
                        radius = Double.parseDouble(radiusText.getText().toString());

                        volume = (4 / 3) * PI * (radius * radius * radius);
                        surfaceArea = 4 * PI * radius * radius;

                        intent.putExtra("surfaceArea", surfaceArea);
                        intent.putExtra("volume", volume);

                        startActivity(intent);
                    }
                } else{
                    calcButton.setError("Error");
                }
            }
        });


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
