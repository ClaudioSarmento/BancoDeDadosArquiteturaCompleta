package br.com.bancodedadosarquiteturacompleta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import br.com.bancodedadosarquiteturacompleta.R;
import br.com.bancodedadosarquiteturacompleta.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clienteController = new ClienteController(getApplicationContext());
    }
}