package com.example.roam;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView textView = findViewById(R.id.login_text);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        SpannableString spannableString = new SpannableString("Login");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                // Open the LoginActivity when "Login" is clicked
                Intent intent = new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        };

        // Set the clickable span for the word "Login"
        spannableString.setSpan(clickableSpan, spannableString.toString().indexOf("Login"), spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);
    }
}
