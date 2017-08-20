package com.jiyun.qcloud.dashixummoban.ui.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jiyun.qcloud.dashixummoban.R;
import com.jiyun.qcloud.dashixummoban.base.BaseFragment;
import com.jiyun.qcloud.dashixummoban.manager.FragmentMager;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by chj on 2017/8/20.
 */

public class HomePageFragment extends BaseFragment {
    @BindView(R.id.homeBtns)
    Button homeBtns;


    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public void setBundle(Bundle bundle) {

    }





    @OnClick(R.id.homeBtns)
    public void onViewClicked() {
        Toast.makeText(getActivity(), "00000000", Toast.LENGTH_SHORT).show();
        FragmentMager.getInstance().start(R.id.homeframe123,HomeDetailFragment.class,true).build();
       // FragmentBuilder.getInstance().init().initContainId(R.id.homeframe123).replace(HomeDetailFragment.class).build();
    }
}
