package nofolly.ultimatestatstracker;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class LoginScreen extends Activity {
    Bundle thisBundle;
    EditText userName;
    EditText passWord;
    String signInStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This sets the xml that will be the base view!
        setContentView(R.layout.login_res);


        //Gets Variables that are created in the xml and links them here for our use so we can see what is entered
        userName = (EditText) findViewById(R.id.username_text);
        passWord = (EditText) findViewById(R.id.password_field);

        //Puts stuff in shared prefs which is a good way to store small things like bools in the program.
        //Should not be used for larger dumps and storage
        //ALWAYS COMMIT Shared pref editor
        SharedPreferences stored = getSharedPreferences("prefs", 0);
        SharedPreferences.Editor e = stored.edit();
        e.putString("current_user", userName.getText().toString());
        e.commit(); //ALWAYS COMMIT Shared pref editor
        //ALWAYS COMMIT Shared pref editor

        findViewById(R.id.login_button).setOnClickListener(signIn);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_screen, menu);
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

    private final View.OnClickListener signIn;
    {
        signIn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(getApplicationContext(), Welcome_Screen.class);
                //thisBundle.putSerializable("Player", player);
                startActivity(change);
            }

        };
    }
}
