package com.example.kaori.trilhasweb.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kaori.trilhasweb.Model.ResTrilha;
import com.example.kaori.trilhasweb.R;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.w3c.dom.Text;

import cz.msebera.android.httpclient.Header;


public class MainActivity extends AppCompatActivity {


    EditText editTrilhas;
    TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTrilhas = (EditText) findViewById(R.id.editTrilhas);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void pesquisar(View v) {
        String trilhas = editTrilhas.getText().toString();
        final String url = "http://172.28.3.240/Trilhas/listar.php";

        //Requisição HTTP Asyncrona
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new AsyncHttpResponseHandler() {

            @Override
            public void onStart() {
                super.onStart();
                Toast.makeText(MainActivity.this, "Iniciando Requisiçao", Toast.LENGTH_SHORT).show();
                tvResultado.setText("Carregando...");
            }

            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                //Resgatar o retorno do http
                String res = new String(bytes);

                // Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
                Gson gson = new Gson();
                ResTrilha trilhas = gson.fromJson(res, ResTrilha.class);
                for (int is = 0; is < trilhas.getTrilhas().size(); is++) {

                   tvResultado.setText("" + trilhas.getTrilhas().toString());

                }


            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                tvResultado.setText("Erro na requisição " + i);
            }

            @Override
            public void onRetry(int retryNo) {
                super.onRetry(retryNo);
                tvResultado.setText("Tentativa: " + retryNo);
            }
        });

    }
}
