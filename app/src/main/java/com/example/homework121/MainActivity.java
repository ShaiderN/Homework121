package com.example.homework121;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editTextName;
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView3);
        editTextName = (EditText)findViewById(R.id.editText3);
        editTextEmail = (EditText)findViewById(R.id.editText2);
    }

    public void displayMessage(View view) {
        textView.setText("Подписка на рассылку успешно оформлена для пользователя " +
                editTextName.getText() + " на электронный адрес " + editTextEmail.getText());
    }

    public void cleanAll() {
        textView.setText("");
        editTextName.setText("");
        editTextEmail.setText("");
    }
}
