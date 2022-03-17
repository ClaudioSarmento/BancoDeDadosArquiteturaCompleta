package br.com.bancodedadosarquiteturacompleta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import br.com.bancodedadosarquiteturacompleta.R;
import br.com.bancodedadosarquiteturacompleta.api.AppUtil;
import br.com.bancodedadosarquiteturacompleta.controller.ClienteController;
import br.com.bancodedadosarquiteturacompleta.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteController = new ClienteController(getApplicationContext());

        /*for(int i = 0; i < 50; i++){
            Cliente cliente = new Cliente();
            cliente.setNome("Claudio"+(i+1));
            cliente.setEmail(i+"_teste@gmail.com"+(i+1));

            if(clienteController.incluir(cliente)){
                AppUtil.mostrarMensagemToast(getApplicationContext(),"Cliente inserido com sucesso...");
            }else{
                AppUtil.mostrarMensagemToast(getApplicationContext(),"Erro ao inserir cliente...");
            }
        }*/
        List<Cliente> teste = clienteController.listar();
        for(Cliente cliente : teste){
            Log.i(AppUtil.TAG,cliente.getNome());
        }
        /*Cliente cliente = new Cliente();
        cliente.setId(3);
        cliente.setNome("Fabiana");
        cliente.setEmail("FabianaTeste@gmail");
        clienteController.alterar(cliente);*/
        //clienteController.deletar(2);

    }
}