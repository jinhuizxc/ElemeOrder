package com.jh.elemeorder;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jh.elemeorder.fragment.FirstFragment;

/**
 * 饿了么点餐页面
 * https://github.com/wudifamo/Neleme
 */
public class MainActivity extends BaseActivity {

    public static final String CAR_ACTION = "handleCar";
    public static final String CLEARCAR_ACTION = "clearCar";
    private CoordinatorLayout rootview;
    public BottomSheetBehavior behavior;
    public View scroll_container;
    private FirstFragment firstFragment;
    public static CarAdapter carAdapter;
    private ShopCarView shopCarView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
