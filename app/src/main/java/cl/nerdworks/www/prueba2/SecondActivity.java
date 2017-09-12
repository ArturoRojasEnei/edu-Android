package cl.nerdworks.www.prueba2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button botonVolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.textViewMain);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String greeter = bundle.getString("greeter");
            Toast.makeText(SecondActivity.this, "El valor entregado es: "+greeter, Toast.LENGTH_LONG).show();
            textView.setText(greeter);
        } else {
            Toast.makeText(SecondActivity.this, "No viene valor", Toast.LENGTH_LONG).show();
        }

        // para volver
        botonVolver = (Button) findViewById(R.id.button3);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // acceder a un segundo activity y enviaremos un string
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                //Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                //intent.putExtra("greeter", GREETER);
                startActivity(intent);

            }
        });




    }
}
