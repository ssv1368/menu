package testmenu.com.testmenu;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 9/2/2017.
 */
    public class TabsPagerAdapter extends FragmentPagerAdapter {

        public TabsPagerAdapter(FragmentManager fm) {
            super(fm);
        }



        @Override
        public Fragment getItem(int index) {

            switch (index) {
                case 0:
                    // Top Rated fragment activity
                    return new TopRatedFragment();
                case 1:
                    // Games fragment activity
                    return new GamesFragment();
                case 2:
                    // Movies fragment activity
                    return new MoviesFragment();
            }

            return null;
        }

    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
        switch (position) {
                case 0:
                    return "فال حافظ";
                case 1:
                    return " سعدی";
                case 2:
                    return "معجز ";
                case 3:
                    return "گلستان";
            }
            return null;
        }


    @Override
        public int getCount() {
            // get item count - equal to number of tabs
            return 3;
        }

    }


