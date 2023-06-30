package com.example.sprit_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.sprit_final.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {sendEmail();


            }
            private void sendEmail() { String TO = "jguzmanalarcon@gmail.com";
                String CC = new String("");
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setData(Uri.parse("mailto: jguzmanalarcon@gmail.com"));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL,TO);
            emailIntent.putExtra(Intent.EXTRA_CC,CC);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Asunto");
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Mensaje");

            startActivity(emailIntent);

            }
        });


        binding.buttonLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLinkedin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/mafu8/"));
                startActivity(intentLinkedin);
            }
        });

        binding.buttonWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhatsapp = new Intent(Intent.ACTION_VIEW,Uri.parse("https://api.whatsapp.com/send?phone=+56992401294"));
                startActivity(intentWhatsapp);
            }
        });



    }


}