package exposi_p.epidroid;

import android.app.DownloadManager;
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
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

import exposi_p.epidroid.models.MyVolley;
import exposi_p.epidroid.models.Token;
import exposi_p.epidroid.models.User;

public class MainActivity extends AppCompatActivity {

    private RequestHandler requestHandler;
    private Token token;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

        Button button = (Button) findViewById(R.id.Button_Login);
        final EditText login = (EditText) findViewById(R.id.EditText_Login);
        final EditText password = (EditText) findViewById(R.id.EditText_Password);
        //requestHandler = new RequestHandler(this);
        String url = "http://epitech-api.herokuapp.com/";
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(password.getText().toString(), login.getText().toString());
//                try {
//                    Volley.newRequestQueue(getApplicationContext()).add(requestHandler.loginRequest(user));;
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
                RequestQueue queue = MyVolley.getRequestQueue();
                StringRequest request = new StringRequest(Request.Method.POST, "http://epitech-api.herokuapp.com/login",
                        createMyReqSuccessListener(),
                        createMyReqErrorListener()
                ) {
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String>  params = new HashMap<>();
                        params.put("login", "exposip");
                        params.put("password", "?rzXaea8");
                        return params;
                    }
                };

                queue.add(request);

            }
        });
    }

    private Response.Listener<String> createMyReqSuccessListener() {
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                token = gson.fromJson(response, Token.class);
                if (token != null)
                    Toast.makeText(getApplicationContext(), token.getToken(), Toast.LENGTH_LONG).show();
                System.out.println(response);
            }
        };
    }

    private void displayToast(Token token) {
    }


    private Response.ErrorListener createMyReqErrorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "gadded", Toast.LENGTH_LONG).show();
            }
        };
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

    public void login(){

    }
}
