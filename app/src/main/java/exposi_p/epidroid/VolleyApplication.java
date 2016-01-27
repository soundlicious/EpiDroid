package exposi_p.epidroid;

import android.app.Application;

import exposi_p.epidroid.models.MyVolley;

/**
 * Created by sound on 26/01/16.
 */
public class VolleyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MyVolley.init(this);
    }
}
