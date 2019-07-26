package com.example.changesize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private EditText editText;
    private Editable name;
    private float num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       change();
    }


   private void change() {
        findViewById(R.id.button01).setOnClickListener(this);
        findViewById(R.id.button02).setOnClickListener(this);
        findViewById(R.id.button03).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
         editText= findViewById(R.id.et);
         textView= findViewById(R.id.tv);
         name= editText.getText();
         num = editText.getTextSize();
        switch (view.getId()){
            case R.id.button01:
                textView.setText(name);
                break;
            case R.id.button02:
                textView.setTextSize(++num);
                break;
            case R.id.button03:
                textView.setTextSize(--num);
                break;
        }

    }

}
