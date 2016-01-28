package exposi_p.epidroid;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.error.VolleyError;
import com.android.volley.request.StringRequest;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import exposi_p.epidroid.models.MyVolley;
import exposi_p.epidroid.models.Token;
import exposi_p.epidroid.models.User;

public class MainActivity extends AppCompatActivity {

    private Token token;
    private User user;
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        Button button = (Button) findViewById(R.id.Button_Login);
        login = (EditText) findViewById(R.id.EditText_Login);
        password = (EditText) findViewById(R.id.EditText_Password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText() == null || login.getText() == null)
                    Toast.makeText(getApplicationContext(), getString(R.string.EmptyLoginPassFields), Toast.LENGTH_LONG).show();
                else {
                    RequestQueue queue = MyVolley.getRequestQueue();
                    StringRequest request = new StringRequest(Request.Method.POST, getString(R.string.login),
                            createMyReqSuccessListener(),
                            createMyReqErrorListener()
                    ) {
                        @Override
                        protected Map<String, String> getParams() {
                            Map<String, String> params = new HashMap<>();
                            params.put("login", login.getText().toString());
                            params.put("password", password.getText().toString());
                            return params;
                        }
                    };
                    queue.add(request);
                }
            }
        });
    }

    private Response.Listener<String> createMyReqSuccessListener() {
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                token = gson.fromJson(response, Token.class);
                if (token != null){
                    Intent home = new Intent(getApplicationContext(), Home.class);
                    home.putExtra("token", token.getToken());
                    startActivity(home);
                }
            }
        };
    }


    private Response.ErrorListener createMyReqErrorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), getString(R.string.BadInfoLogin), Toast.LENGTH_LONG).show();
            }
        };
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        if (login.getText() != null)
            bundle.putString("login", login.getText().toString());
        if (password.getText() != null)
            bundle.putString("password", password.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        //Restore login and password if savedInstanceState not null
        if (savedInstanceState != null) {
            login.setText(savedInstanceState.getString("login"));
            password.setText(savedInstanceState.getString("password"));
        }
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
