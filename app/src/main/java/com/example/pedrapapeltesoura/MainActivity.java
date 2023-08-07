package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecPedra (View view){
        this.opcaoSelec(1);
    }
    public void selecPapel (View view){
        this.opcaoSelec(2);
    }

    public void selecTesoura (View view){
        this.opcaoSelec(3);
    }

    public void opcaoSelec(int opcaoSelec) {
        ImageView imageRes = findViewById(R.id.imageRes);
        TextView tVresult = findViewById(R.id.tVresult);

        Random random = new Random();
        int opApp = random.nextInt(3) + 1;

        switch (opApp) {
            case 1:
                imageRes.setImageResource(R.drawable.pedra);
                break;
            case 2:
                imageRes.setImageResource(R.drawable.papel);
                break;
            case 3:
                imageRes.setImageResource(R.drawable.tesoura);
                break;
        }

        if(opApp == 1 && opcaoSelec == 3 || opApp == 2 && opcaoSelec == 1 || opApp == 3 && opcaoSelec == 2) { //app ganha
            //app case 1 pedra for < menor que 3 ou
            //case 2 papel for maior que 1 ou
            //case 3 for maior que 2
            tVresult.setText("Você perdeu =(");

        } else if (opcaoSelec == 1 && opApp == 3 || opcaoSelec == 2 && opApp == 1 || opcaoSelec == 3 && opApp == 2) {//jogador ganha
            tVresult.setText("Você ganhou =)");

        }else {//empate
            tVresult.setText("Empate =|");


        }
    }
}