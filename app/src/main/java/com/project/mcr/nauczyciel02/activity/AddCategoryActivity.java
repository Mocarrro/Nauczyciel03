package com.project.mcr.nauczyciel02.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.project.mcr.nauczyciel02.R;

/**
 * Created by mikolaj.mocarski on 2016-11-29.
 */
public class AddCategoryActivity extends Activity {

    private EditText categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);

    }

    public void onClickAddCategory(View v){

        String category = categoryName.getText().toString().trim();
        //DODAJE DO BAZY nową kategorię
    }
}