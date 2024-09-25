package com.example.chatnova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

//import com.zegocloud.uikit.prebuilt.call.invite.widget.ZegoSendCallInvitationButton;
//import com.zegocloud.uikit.service.defines.ZegoUIKitUser;

import java.util.Collections;

public class profile extends AppCompatActivity {

    TextView caller;
    EditText targetuser;
//    ZegoSendCallInvitationButton callbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        caller = findViewById(R.id.textView);
        targetuser = findViewById(R.id.editID);
//        callbtn = findViewById(R.id.callBtn);

        caller.setText("you are : "+getIntent().getStringExtra("caller"));

        targetuser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                startvideocall(targetuser.getText().toString().trim());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void startvideocall(String targetuserid){

//        callbtn.setIsVideoCall(true);
//        callbtn.setResourceID("zego_uikit_call");
//        callbtn.setInvitees(Collections.singletonList(new ZegoUIKitUser(targetuserid,targetuserid)));
    }

}