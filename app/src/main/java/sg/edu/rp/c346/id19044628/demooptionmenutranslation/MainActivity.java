package sg.edu.rp.c346.id19044628.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedtext, tvTranslatedtext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedtext=findViewById(R.id.textViewTranslated);
        tvTranslatedtext2=findViewById(R.id.textViewTranslated2);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedtext.setText("Hello ");
            tvTranslatedtext2.setText("Bye");
            return true;
        } else if (id == R.id.italianSelection) {
            tvTranslatedtext.setText("Ciao");
            tvTranslatedtext2.setText("Addio");
            return true;
        } else {
            tvTranslatedtext.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }

}