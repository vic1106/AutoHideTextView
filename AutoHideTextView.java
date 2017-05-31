package com.example.vic1106.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;

/**
 * Created by vic1106 on 24/2/2017.
 */

public class AutoHideTextView extends AppCompatTextView {

    public AutoHideTextView(Context context) {
        super(context);
        initView();
    }

    public AutoHideTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public AutoHideTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        if (getText().toString().isEmpty())
            setVisibility(GONE);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString()))
                    setVisibility(GONE);
                else
                    setVisibility(VISIBLE);
            }
        });
    }


}
