package com.example.allyan.viewpager;

/**
 * Created by Allyan on 14/05/2017.
 */

public enum ResourcesModel {
    // создаем 3 перечисления с тайтлом и макетом
    // для удобной работы в адаптере
    FIRST_SCREEN(R.string.txt_screen_1, R.layout.view_screen_1),
    SECOND_SCREEN(R.string.txt_screen_2, R.layout.view_screen_2);

    private int mTitleResourceId;
    private int mLayoutResourceId;

    ResourcesModel(int titleResId, int layoutResId) {
        mTitleResourceId = titleResId;
        mLayoutResourceId = layoutResId;
    }

    public int getTitleResourceId() {
        return mTitleResourceId;
    }

    public int getLayoutResourceId() {
        return mLayoutResourceId;
    }
}

