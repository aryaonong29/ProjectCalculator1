package com.arianasp.practicecalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.support.v7.app.ActionBarActivity;

import static com.arianasp.practicecalculator.R.drawable.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    android.widget.EditText et_1, et_2;

    android.widget.TextView tv_1;

    android.widget.Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_clear, btn_back;

    android.support.design.widget.FloatingActionButton fab;
    float sum;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setIcon(R.drawable.ic_toolbar);


        //untuk disable keyboard dari smartphone pada aplikasi
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
                WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
        //cari element berdasarkan id
        et_1 = (android.widget.EditText) findViewById(R.id.et_1);
        et_2 = (android.widget.EditText) findViewById(R.id.et_2);

        tv_1 = (android.widget.TextView) findViewById(R.id.tv_1);

        btn_0 = (android.widget.Button) findViewById(R.id.btn_0);
        btn_1 = (android.widget.Button) findViewById(R.id.btn_1);
        btn_2 = (android.widget.Button) findViewById(R.id.btn_2);
        btn_3 = (android.widget.Button) findViewById(R.id.btn_3);
        btn_4 = (android.widget.Button) findViewById(R.id.btn_4);
        btn_5 = (android.widget.Button) findViewById(R.id.btn_5);
        btn_6 = (android.widget.Button) findViewById(R.id.btn_6);
        btn_7 = (android.widget.Button) findViewById(R.id.btn_7);
        btn_8 = (android.widget.Button) findViewById(R.id.btn_8);
        btn_9 = (android.widget.Button) findViewById(R.id.btn_9);
        btn_back = (android.widget.Button) findViewById(R.id.btn_back);
        btn_clear = (android.widget.Button) findViewById(R.id.btn_clear);
        fab = (android.support.design.widget.FloatingActionButton) findViewById(R.id.fab);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        fab.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Editable num1 = et_1.getText();
        //Editable num2 = et_2.getText();

        /*if (TextUtils.isEmpty(et_1.getText().toString())
                || TextUtils.isEmpty(et_2.getText().toString())) {
            return;
        }
        sum = Float.parseFloat(String.valueOf(et_1.getText()))
                        + Float.parseFloat(String.valueOf(et_2.getText()));
                tv_1.setText(String.valueOf(sum));
                */
        //int cursorPosition = et_1.getSelectionStart();
        //CharSequence enteredText = et_1.getText().toString();
        //CharSequence cursorToEnd = enteredText.subSequence(cursorPosition, enteredText.length());
        /*switch (v.getId()){
            case R.id.btn_0:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"0");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"0");
                }
            break;
            case R.id.btn_1:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"1");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"1");
                }
                break;
            case R.id.btn_2:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"2");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"2");
                }
                break;
            case R.id.btn_3:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"3");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"3");
                }
                break;
            case R.id.btn_4:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"4");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"4");
                }
                break;
            case R.id.btn_5:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"5");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"5");
                }
                break;
            case R.id.btn_6:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"6");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"6");
                }
                break;
            case R.id.btn_7:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"7");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"7");
                }
                break;
            case R.id.btn_8:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"8");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"8");
                }
                break;
            case R.id.btn_9:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"9");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"9");
                }
                break;
            case R.id.btn_clear:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"");
                }
                break;
            case R.id.btn_back:
                if(){
                    et_1.getText().insert(et_1.getSelectionEnd(),"-1");
                }
                else{
                    et_2.getText().insert(et_2.getSelectionEnd(),"-1");
                }
                break;

        }*/

    }

}
