package sparks.csit.lab4app1;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView) findViewById(R.id.listView);
        AssetManager am  = getAssets();
        List<String> tempList = new ArrayList<String>();
        final List<Integer> scoresList = new ArrayList<Integer>();
        final List<String> namesList = new ArrayList<String>();


        try {
            InputStream input = am.open("grades.txt");
            Scanner scanner = new Scanner(input);
            String[] tempNames = new String[input.available()];
            int names = 0, i;

            //grabbing out header before loop
            scanner.nextLine();
            while(scanner.hasNext()){
                //adding all inputs into temp list for splitting
                tempList.add(scanner.next());
            }
            for(i = 0; i < tempList.size(); i++){
                try{
                    //checking if next in line is int then adding to score list
                    scoresList.add(Integer.parseInt(tempList.get(i)));
                }catch(NumberFormatException e){
                    //if input not int then must be name
                    tempNames[names] = tempList.get(i);
                    names++;
                    continue;
                }
            }
            i = 0;
            //adding first and last names together in list
            while(tempNames[i] != null){
                if(i%2 == 0){
                    namesList.add(tempNames[i] + " " + tempNames[i + 1]);
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //creating array adapter for list view
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, namesList);
        //filling list view with names
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Position: " + position);
                Intent intent = new Intent(MainActivity.this, DisplayGrades.class);
                    //packaging up chosen student name and 4 grades
                    intent.putExtra("name", namesList.get(position));
                    intent.putExtra("test1", scoresList.get(position*4));
                    intent.putExtra("test2", scoresList.get((position*4)+1));
                    intent.putExtra("test3", scoresList.get((position*4)+2));
                    intent.putExtra("finalTest", scoresList.get((position*4)+3));
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
