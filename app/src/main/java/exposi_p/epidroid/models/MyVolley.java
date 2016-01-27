package exposi_p.epidroid.models;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
/**
 * Created by sound on 26/01/16.
 */
public class MyVolley {
    private static RequestQueue requestQueue;

    private MyVolley(){

    }

    public static void init(Context context){
        requestQueue = Volley.newRequestQueue(context);
    }

    public static RequestQueue getRequestQueue(){
        if (requestQueue != null){
            return requestQueue;
        }
        else
            throw new IllegalStateException("RequestQueue not initialized");
    }
}
