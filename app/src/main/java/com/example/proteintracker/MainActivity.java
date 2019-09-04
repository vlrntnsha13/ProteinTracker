    package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(button2GetListener);

        Button myBtn = (Button)findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText)findViewById(R.id.editText1);
                Log.d("ProteinTracker",myEditText.getText().toString());
            }
        });

       /*private View.OnClickListener helpButtonListener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,helpActivity.class);
                startActivity(intent);
            }
        };*/
    }

    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);

                Bundle b = new Bundle();

                EditText myEditText = (EditText) findViewById(R.id.editText1);

                b.putString("helpString",myEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
    };



    private View.OnClickListener button2GetListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
    };
}
