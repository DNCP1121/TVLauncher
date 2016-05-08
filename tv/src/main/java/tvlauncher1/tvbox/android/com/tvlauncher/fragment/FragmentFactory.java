package tvlauncher1.tvbox.android.com.tvlauncher.fragment;

import android.support.v4.app.Fragment;
/**
 * init and return fragment objects
 * Created by nana on 2016/5/8.
 */
public class FragmentFactory {
    public FragmentFactory(){}

    private Fragment mRecommendFragment; //
    private Fragment mMediaFragment;
    private Fragment mPopularizeFragment;
    private Fragment mAppFragment;


    public void initFirstLevelFragments(){
        mRecommendFragment = new RecommendFragment();
        mMediaFragment = new MediaFragment();
        mPopularizeFragment = new PopularizeFragment();
        mAppFragment = new AppFragment();
    }

    public Fragment getFirstLevelFragment(int index){
        switch(index){
            case 0:
                return mRecommendFragment;
            case 1:
                return mMediaFragment;
            case 2:
                return mPopularizeFragment;
            case 3:
                return mAppFragment;
        }
        return mRecommendFragment;
    }

    public int getFirstLevelCount(){
        return 4;
    }

}