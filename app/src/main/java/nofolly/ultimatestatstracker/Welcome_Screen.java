package nofolly.ultimatestatstracker;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.ListView;


public class Welcome_Screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__screen);

        //TODO: Need to do fun things to the lists
        //Possibly need to roll own swipe detection and place it on the list?
        ListView players = (ListView) findViewById(R.id.players_list);

    }
}
