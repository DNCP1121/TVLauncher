package tvlauncher1.tvbox.android.com.tvlauncher.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tvlauncher1.tvbox.android.com.tvlauncher.R;
import tvlauncher1.tvbox.android.com.tvlauncher.utils.Constants;

/**
 * Created by nana on 2016/5/8.
 */
public class AppFragment extends BaseFragment {

    private View mMainView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mMainView = LayoutInflater.from(getActivity()).inflate(R.layout.media_fragment , null);
        setTitle(mMainView , Constants.PAGE_CATEGORY.PAGE_APP);
        return mMainView;
    }
}
