package br.com.bancodedadosarquiteturacompleta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import br.com.bancodedadosarquiteturacompleta.R;
import br.com.bancodedadosarquiteturacompleta.controller.ClienteController;
import br.com.bancodedadosarquiteturacompleta.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(getApplicationContext());
        Cliente cliente = new Cliente();
        cliente.setNome("Claudio");
        cliente.setEmail("teste@gmail.com");
        clienteController.incluir(cliente);

    }
}