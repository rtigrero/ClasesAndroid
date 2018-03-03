package com.richard.ejemplo1;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.*;

public class Ejemplo1 extends Activity {

    private TextView mensaje;
    private Button ejecutar_saludo;
    private EditText nombre;
    private CheckBox chk_c1,chk_c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo1);
        mensaje = (TextView) findViewById(R.id.tv_saludo);
        ejecutar_saludo=(Button) findViewById(R.id.btn_saludar);
        nombre = (EditText) findViewById(R.id.edt_nombre);
        chk_c1= (CheckBox) findViewById(R.id.chk_c1);
        chk_c2= (CheckBox) findViewById(R.id.chk_c2);
        mensaje.setText("");
        //notificacion();

        ejecutar_saludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nombre.getText().toString().isEmpty())
                {
                    mensaje.setText("");
                    notificacion2("Debe Ingresar un Nombre ");
                }else
                {
                   if(chk_c1.isChecked()==true)
                   {
                       mensaje.setText("Hola "+nombre.getText().toString());
                   }else
                   {
                       mensaje.setText("");
                   }

                    if(chk_c2.isChecked())
                    {
                        notificacion2("Hola -> "+nombre.getText().toString());
                    }else
                    {
                        //mensaje.setText("");
                    }


                }




            }
        });



        //notificacion2(mensaje.getText().toString());


    }
   // TODO:  CREANDO FUNCIONES

    public void notificacion(){

        Toast.makeText(getApplicationContext()," Iniciando Curso Android",Toast.LENGTH_SHORT).show();

    }

    public void notificacion2(String param){

        Toast.makeText(getApplicationContext(),param,Toast.LENGTH_SHORT).show();

    }
}
