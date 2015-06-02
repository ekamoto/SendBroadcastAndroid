package com.example.SendBroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {

    private Button btnEnviar;
    public Intent intent;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String teste = "HisamotoBroadCast";
        intent = new Intent(teste);
        //intent.addCategory("Categoria teste");

        btnEnviar = (Button)findViewById(R.id.sendBroadcast);

        btnEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent.putExtra("nome", "Leandro Shindi Ekamoto vindo por broadcast");
                intent.putExtra("gmail", "ekamoto.leandro@gmail.com vindo por broadcast");
                getApplication().sendBroadcast(intent);
            }
        });
    }
}
