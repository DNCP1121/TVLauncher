package tvlauncher1.tvbox.android.com.tvlauncher.fragment;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import tvlauncher1.tvbox.android.com.tvlauncher.utils.Constants;
import tvlauncher1.tvbox.android.com.tvlauncher.R;
/**
 * Created by nana on 2016/5/9.
 */
public class BaseFragment extends Fragment {
    /**
     *
     * @param mainView  Object View
     * @param page_index  you can find class PAGE_CATEGORY in class Constants
     */
    void setTitle(View mainView , int page_index){
        
        if(mainView == null)
            return;

        TextView textView = null;

        switch(page_index){
            case Constants.PAGE_CATEGORY.PAGE_RECOMMEND:
                textView = (TextView)mainView.findViewById(R.id.recommend_title);
                break;
            case Constants.PAGE_CATEGORY.PAGE_MEDIA:
                textView = (TextView)mainView.findViewById(R.id.media_title);
                break;
            case Constants.PAGE_CATEGORY.PAGE_STORE:
                textView = (TextView)mainView.findViewById(R.id.store_title);
                break;
            case Constants.PAGE_CATEGORY.PAGE_APP:
                textView = (TextView)mainView.findViewById(R.id.app_title);
                break;
        }

        if(textView == null)
            return;
        textView.setTextColor(Color.RED);

    }
}
