package exposi_p.epidroid;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import exposi_p.epidroid.models.User;

/**
 * Class for all the HTTP Request (DELETE, POST, GET)
 * @author sound
 */
public class RequestHandler {
    private String url;

    /**
     * Constructor
     * @author sound
     */
    public RequestHandler(){
        url = "http://epitech-api.herokuapp.com/";
    }

    public StringRequest Request(int method, final Map<String, String> params, String attribut, User user) throws JSONException {

        StringRequest request = new StringRequest(Request.Method.POST, url + attribut,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                return params;
            }
        };
        return request;
    }

    public StringRequest loginRequest(final User user) throws JSONException {

        StringRequest postRequest = new StringRequest(Request.Method.POST, url + "login",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                // the POST parameters:
                Map<String, String>  params = new HashMap<>();
                params.put("login", user.getLogin());
                params.put("password", user.getPassword());
                return params;
            }
        };
        return postRequest;
    }
}