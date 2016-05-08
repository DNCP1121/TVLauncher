/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package tvlauncher1.tvbox.android.com.tvlauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import tvlauncher1.tvbox.android.com.tvlauncher.fragment.FragmentFactory;
import tvlauncher1.tvbox.android.com.tvlauncher.viewpager.TabPageIndicator;

/*
 * MainActivity class that loads MainFragment
 */
public class MainActivity extends FragmentActivity {
    /**
     * Called when the activity is first created.
     */

    private FragmentFactory mFragmentFactory;
    private FragmentPagerAdapter mAdapter;
    private ViewPager mPager;
    private TabPageIndicator mIndicator;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        mFragmentFactory = new FragmentFactory();
        mFragmentFactory.initFirstLevelFragments();

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return mFragmentFactory.getFirstLevelFragment(i);
            }

            @Override
            public int getCount() {
                return 4;
            }
        };

        mPager = (ViewPager) findViewById(R.id.main_pager);
        mPager.setOffscreenPageLimit(4);
        mPager.setAdapter(mAdapter);

        mIndicator = (TabPageIndicator) findViewById(R.id.main_indicator);
        mIndicator.setViewPager(mPager);
        mPager.setCurrentItem(0, true);

    }

    private void initViews(){

    }
}
