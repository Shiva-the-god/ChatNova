package com.example.chatnova;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calling_class extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_class);

        editText = findViewById(R.id.textID);
        btn = findViewById(R.id.callLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pass the user input (caller ID) to the profile activity
                String callerID = editText.getText().toString().trim();
                Intent intent = new Intent(getApplicationContext(), profile.class);
                intent.putExtra("caller", callerID);
                startActivity(intent);
            }
        });
    }

    // You can add other functionalities here if needed.
    // The Zegocloud service has been completely removed.
}