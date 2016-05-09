package tvlauncher1.tvbox.android.com.tvlauncher.fragment;

import android.support.v4.app.Fragment;
import tvlauncher1.tvbox.android.com.tvlauncher.fragment.RecommendFragment;
/**
 * init and return fragment objects
 * Created by nana on 2016/5/8.
 */
public class FragmentFactory {
    public FragmentFactory(){}

    private Fragment mRecommendFragment; //
    private Fragment mMediaFragment;
    private Fragment mStoreFragment;
    private Fragment mAppFragment;


    public void initFirstLevelFragments(){
        mRecommendFragment = new RecommendFragment();
        mMediaFragment = new MediaFragment();
        mStoreFragment = new StoreFragment();
        mAppFragment = new AppFragment();
    }

    public Fragment getFirstLevelFragment(int index){
        switch(index){
            case 0:
                return mRecommendFragment;
            case 1:
                return mMediaFragment;
            case 2:
                return mStoreFragment;
            case 3:
                return mAppFragment;
        }
        return mRecommendFragment;
    }

    public int getFirstLevelCount(){
        return 4;
    }

}