package exposi_p.epidroid.models;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.android.volley.cache.BitmapImageCache;
import com.android.volley.cache.SimpleImageLoader;
/**
 * Created by sound on 26/01/16.
 */
public class MyVolley {
    private static RequestQueue requestQueue;
    private static SimpleImageLoader ImageLoader;

    private MyVolley(){

    }

    public static void init(Context context){
        requestQueue = Volley.newRequestQueue(context);
        ImageLoader = new SimpleImageLoader(requestQueue, BitmapImageCache.getInstance(null));
    }

    public static RequestQueue getRequestQueue(){
        if (requestQueue != null){
            return requestQueue;
        }
        else
            throw new IllegalStateException("RequestQueue not initialized");
    }

    /**
     * Returns instance of ImageLoader initialized with {@see FakeImageCache} which effectively means
     * that no memory caching is used. This is useful for images that you know that will be show
     * only once.
     *
     * @return
     */
    public static SimpleImageLoader getImageLoader() {
        if (ImageLoader != null) {
            return ImageLoader;
        } else {
            throw new IllegalStateException("ImageLoader not initialized");
        }
    }
}
