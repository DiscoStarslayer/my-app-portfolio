package darren.udacity.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    private Toast createToastForApp(String appName) {
        Context context = getApplicationContext();
        String baseText = "This button will launch my ";
        String terminator = " app!";

        CharSequence toastText = baseText + appName + terminator;

        return Toast.makeText(context, toastText, Toast.LENGTH_SHORT);
    }

    public void spotifyClicked(View view) {
        Toast toast = createToastForApp("spotify streamer");
        toast.show();
    }

    public void scoresClicked(View view) {
        Toast toast = createToastForApp("scores");
        toast.show();
    }

    public void libraryClicked(View view) {
        Toast toast = createToastForApp("library");
        toast.show();
    }

    public void buildItBiggerClicked(View view) {
        Toast toast = createToastForApp("build it bigger");
        toast.show();
    }

    public void xyzReaderClicked(View view) {
        Toast toast = createToastForApp("xyz reader");
        toast.show();
    }

    public void capstoneClicked(View view) {
        Toast toast = createToastForApp("capstone");
        toast.show();
    }
}
