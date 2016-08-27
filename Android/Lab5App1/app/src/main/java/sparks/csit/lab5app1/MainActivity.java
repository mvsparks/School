package sparks.csit.lab5app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton carsImageButton = (ImageButton) findViewById(R.id.imageButtonCars);
        ImageButton animalImageButton = (ImageButton) findViewById(R.id.imageButtonAnimals);

        //listener for cars album
        carsImageButton.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(MainActivity.this, DisplayGallery.class);

            String selection;

            @Override
            public void onClick(View v) {
                selection = "cars";
                intent.putExtra("selection", selection);
                startActivity(intent);
            }
        });

        //listener for animals album
        animalImageButton.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(MainActivity.this, DisplayGallery.class);

            String selection;
            @Override
            public void onClick(View v) {
                selection = "animals";
                intent.putExtra("selection", selection);
                startActivity(intent);
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

