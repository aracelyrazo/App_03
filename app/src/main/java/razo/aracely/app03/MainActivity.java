package razo.aracely.app03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Eventos: onCreate", Toast.LENGTH_LONG);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Eventos: onStart", Toast.LENGTH_LONG);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Eventos: onStop", Toast.LENGTH_LONG);

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Eventos: onResume", Toast.LENGTH_LONG);

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Eventos: onDestroy", Toast.LENGTH_LONG);

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Eventos: onRestart", Toast.LENGTH_LONG);

    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Eventos: onPause", Toast.LENGTH_LONG);

    }
}