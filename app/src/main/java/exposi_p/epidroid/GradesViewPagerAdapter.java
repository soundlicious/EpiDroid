package exposi_p.epidroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sound on 20/01/16.
 */
public class GradesViewPagerAdapter extends FragmentPagerAdapter
{
    private String[] semester;
    public GradesViewPagerAdapter(FragmentManager fm) {
        super(fm);
        //Get Modules --> get all semester /infos POST get actuel semester --> create semester tab
        //Get Grades --> Create Map, value == Module_name, item --> list marks
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 0;
    }
}
