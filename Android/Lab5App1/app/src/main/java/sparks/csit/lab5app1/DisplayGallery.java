package sparks.csit.lab5app1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class DisplayGallery extends AppCompatActivity {
    Integer[] animalPicArray = {R.drawable.buffalo,
            R.drawable.cheetah,
            R.drawable.hippo,
            R.drawable.jellyfish,
            R.drawable.leopard,
            R.drawable.owl,
            R.drawable.seaturtle,
            R.drawable.tiger};

    Integer[] carPicArray = {R.drawable.audir8,
            R.drawable.bugatti,
            R.drawable.corvette,
            R.drawable.ferrari,
            R.drawable.maserati,
            R.drawable.lambo,
            R.drawable.mclaren,
            R.drawable.mustang};

    String[] animalTextArray = {"Buffalo",
            "Cheetah",
            "Hippo",
            "Jellyfish",
            "Leopard",
            "Owl",
            "Sea Turtle",
            "Tiger"};

    String[] carsTextArray = {"Audi",
            "Bugatti",
            "Corvette",
            "Ferrari",
            "Maserati",
            "Lambo",
            "Mclaren",
            "Mustang"};

    Integer[] pictureArray;
    String[] pictureText;

    ImageView image;
    Gallery gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Button backButton = (Button) findViewById(R.id.buttonBack);

        String selection = getIntent().getExtras().getString("selection");
        if(selection.equals("animals")) {
            pictureArray = animalPicArray.clone();
            pictureText = animalTextArray.clone();
        }
        else{
            pictureArray = carPicArray.clone();
            pictureText = carsTextArray.clone();
        }
        image = (ImageView) findViewById(R.id.imageViewPicture);
        gallery = (Gallery) findViewById(R.id.galleryAlbum);

        gallery.setAdapter(new ImageAdapter(this));

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), pictureText[position], Toast.LENGTH_SHORT).show();
                image.setImageResource(pictureArray[position]);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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

    private class ImageAdapter extends BaseAdapter{

        private Context context;

        public ImageAdapter(Context c){
            context = c;
        }

        public int getCount()
        {
            return pictureArray.length;
        }

        public Object getItem(int arg0){
            return null;
        }

        public long getItemId(int arg0){
            return 0;
        }

        public View getView(int position, View arg1, ViewGroup arg2){
            //ImageView object
            ImageView imageView = new ImageView(this.context);

            imageView.setImageResource(pictureArray[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new Gallery.LayoutParams(500,300));
            imageView.setPadding(5,5,5,5);

            return imageView;
        }
    }
}

