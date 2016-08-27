package sparks.csit.lab4app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayGrades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_grades);
        int test1, test2, test3, finalTest;
        double totalGrade;
        String name;

        TextView nameText = (TextView) findViewById(R.id.textViewName);
        TextView test1Text = (TextView) findViewById(R.id.textViewTest1);
        TextView test2Text = (TextView) findViewById(R.id.textViewTest2);
        TextView test3Text = (TextView) findViewById(R.id.textViewTest3);
        TextView finalText = (TextView) findViewById(R.id.textViewFinal);
        TextView totalText = (TextView) findViewById(R.id.textViewTotalGrade);
        Button backButton = (Button) findViewById(R.id.buttonBack);

        name = getIntent().getExtras().getString("name");
        test1 = getIntent().getExtras().getInt("test1");
        test2 = getIntent().getExtras().getInt("test2");
        test3 = getIntent().getExtras().getInt("test3");
        finalTest = getIntent().getExtras().getInt("finalTest");

        totalGrade = (test1 + test2 + test3 + finalTest)/4;


        nameText.setText(name);
        test1Text.append(" " + test1);
        test2Text.append(" " + test2);
        test3Text.append(" " + test3);
        finalText.append(" " + finalTest);

        if(totalGrade >= 93){
            totalText.append(" A");
        }else if(totalGrade >= 88){
            totalText.append(" B+");
        }else if(totalGrade >= 83){
            totalText.append(" B");
        }else if(totalGrade >= 78){
            totalText.append(" C+");
        }else if(totalGrade >= 73){
            totalText.append(" C");
        }else if(totalGrade >= 65){
            totalText.append(" D");
        }else{
            totalText.append(" F");
        }
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayGrades.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_grades, menu);
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
