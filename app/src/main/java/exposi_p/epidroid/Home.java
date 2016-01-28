package exposi_p.epidroid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.cache.plus.ImageRequest;
import com.android.volley.error.VolleyError;
import com.android.volley.request.StringRequest;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.ui.NetworkImageView;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import exposi_p.epidroid.Utilities.RoundImage;
import exposi_p.epidroid.models.InfosPost;
import exposi_p.epidroid.models.MyVolley;
import exposi_p.epidroid.models.Token;

public class Home extends AppCompatActivity {
    private String token;
    private ImageView trombi;
    private TextView text;
    private NetworkImageView network_image_view;
    private InfosPost infosPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        Intent intent = getIntent();
        token = intent.getStringExtra("token");
        Toast.makeText(getApplicationContext(), token, Toast.LENGTH_LONG).show();

        trombi = (ImageView) findViewById(R.id.StudentImage);
        text = (TextView) findViewById(R.id.jsontest);

        RequestQueue queue = MyVolley.getRequestQueue();
        StringRequest request = new StringRequest(Request.Method.POST, getString(R.string.infos),
                createMyInfoReqSuccessListener(),
                createMyInfoReqErrorListener()
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("token", token);
                return params;
            }
        };
        queue.add(request);
    }

    private Response.ErrorListener createMyInfoReqErrorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), getString(R.string.BadInfoLogin), Toast.LENGTH_LONG).show();
            }
        };
    }

    private Response.Listener<String> createMyInfoReqSuccessListener() {
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                System.out.println(response);
                infosPost = gson.fromJson(response, InfosPost.class);
                ImageLoader imageLoader = MyVolley.getImageLoader();
                imageLoader.get(getString(R.string.pictureUrl) + infosPost.getInfos().getPicture().replaceAll(".bmp", ".jpg"),
                        ImageLoader.getImageListener(trombi, R.drawable.empty_photo, R.drawable.error_image));
            }
        };
    }

}
