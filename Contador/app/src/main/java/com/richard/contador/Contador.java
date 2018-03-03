package com.richard.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class Contador extends AppCompatActivity {
    private TextView resultado;
    private Button btn_sumar,btn_restar,btn_reset;
    private CheckBox chk_c1,chk_c2;
    String Valor_text="";
    int Valor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        resultado = (TextView) findViewById(R.id.tv_resultado);
        btn_sumar=(Button) findViewById(R.id.btn_incrementar);
        btn_restar=(Button) findViewById(R.id.btn_disminuir);
        btn_reset=(Button) findViewById(R.id.btn_resetear);
        chk_c1= (CheckBox) findViewById(R.id.chk_habilitar);


        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Valor_text=resultado.getText().toString();
                Valor= Integer.parseInt(Valor_text)+1;
                resultado.setText(Integer.toString(Valor));
                notificacion2(resultado.getText().toString());

            }
        });

        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Valor_text=resultado.getText().toString();
                Valor= Integer.parseInt(Valor_text)-1;
                resultado.setText(Integer.toString(Valor));
                notificacion2(resultado.getText().toString());


            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultado.setText("0");
            }
        });


        chk_c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton,boolean isChecked) {

                if(compoundButton.isChecked())
                {
                    chk_c1.setText("Deshabilitar");
                    btn_sumar.setEnabled(true);
                    btn_restar.setEnabled(true);
                }else
                {
                    chk_c1.setText("Habilitar");
                    btn_sumar.setEnabled(false);
                    btn_restar.setEnabled(false);
                    Toast.makeText(getApplicationContext()," Esta desabilitado la aplicacion",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void notificacion2(String param){

        Toast.makeText(getApplicationContext(),param,Toast.LENGTH_SHORT).show();

    }
}
