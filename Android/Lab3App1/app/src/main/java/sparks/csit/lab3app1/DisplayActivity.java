package sparks.csit.lab3app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DisplayActivity extends AppCompatActivity {
    double area, circumference, volume,
            surfaceArea, perimeter, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView areaText = (TextView) findViewById(R.id.textViewArea);
        TextView circumferenceText = (TextView) findViewById(R.id.textViewCircumference);
        TextView volumeText = (TextView) findViewById(R.id.textViewVolume);
        TextView surfaceAreaText = (TextView) findViewById(R.id.textViewSurfaceArea);
        TextView perimeterText = (TextView) findViewById(R.id.textViewPerimeter);
        TextView sText = (TextView) findViewById(R.id.textViewS);
        TextView shapeSelected = (TextView) findViewById(R.id.textViewShapeSelected);
        String shapeType = getIntent().getExtras().getString("shapeSelected");
        DecimalFormat df = new DecimalFormat("#0.00");

        shapeSelected.append(" " + shapeType);

        if(shapeType.equalsIgnoreCase("Circle")){
            areaText.setVisibility(View.VISIBLE);
            circumferenceText.setVisibility(View.VISIBLE);
            volumeText.setVisibility(View.GONE);
            surfaceAreaText.setVisibility(View.GONE);
            perimeterText.setVisibility(View.GONE);
            sText.setVisibility(View.GONE);

            area = getIntent().getExtras().getDouble("area");
            circumference = getIntent().getExtras().getDouble("circumference");

            areaText.append(" " + df.format(area));
            circumferenceText.append(" " + df.format(circumference));

        } else if(shapeType.equalsIgnoreCase("Cylinder")){

            areaText.setVisibility(View.GONE);
            circumferenceText.setVisibility(View.GONE);
            volumeText.setVisibility(View.VISIBLE);
            surfaceAreaText.setVisibility(View.VISIBLE);
            perimeterText.setVisibility(View.GONE);
            sText.setVisibility(View.GONE);

            volume = getIntent().getExtras().getDouble("volume");
            surfaceArea = getIntent().getExtras().getDouble("surfaceArea");

            volumeText.append(" " + df.format(volume));
            surfaceAreaText.append(" " + df.format(surfaceArea));

        } else if(shapeType.equalsIgnoreCase("Rectangle")){

            areaText.setVisibility(View.VISIBLE);
            circumferenceText.setVisibility(View.GONE);
            volumeText.setVisibility(View.GONE);
            surfaceAreaText.setVisibility(View.GONE);
            perimeterText.setVisibility(View.VISIBLE);
            sText.setVisibility(View.GONE);

            area = getIntent().getExtras().getDouble("area");
            perimeter = getIntent().getExtras().getDouble("perimeter");

            areaText.append(" " + df.format(area));
            perimeterText.append(" " + df.format(perimeter));

        } else if(shapeType.equalsIgnoreCase("Triangle")){

            areaText.setVisibility(View.VISIBLE);
            circumferenceText.setVisibility(View.GONE);
            volumeText.setVisibility(View.GONE);
            surfaceAreaText.setVisibility(View.GONE);
            perimeterText.setVisibility(View.VISIBLE);
            sText.setVisibility(View.VISIBLE);

            s = getIntent().getExtras().getDouble("s");
            area = getIntent().getExtras().getDouble("area");
            perimeter = getIntent().getExtras().getDouble("perimeter");

            sText.append(" " + df.format(s));
            areaText.append(" " + df.format(area));
            perimeterText.append(" " + df.format(perimeter));

        } else if(shapeType.equalsIgnoreCase("Sphere")){

            areaText.setVisibility(View.GONE);
            circumferenceText.setVisibility(View.GONE);
            volumeText.setVisibility(View.VISIBLE);
            surfaceAreaText.setVisibility(View.VISIBLE);
            perimeterText.setVisibility(View.GONE);
            sText.setVisibility(View.GONE);

            volume = getIntent().getExtras().getDouble("volume");
            surfaceArea = getIntent().getExtras().getDouble("surfaceArea");

            volumeText.append(" " + df.format(volume));
            surfaceAreaText.append(" " + df.format(surfaceArea));

        } else{
            shapeSelected.setError("");
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display, menu);
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
