package sg.edu.np.mad.Practical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("MAD");
        builder.setMessage("MADness");
        builder.setCancelable(true);
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random random = new Random();
                int randomNumber = random.nextInt();
                Intent activityName = new Intent(ListActivity.this, MainActivity.class);
                activityName.putExtra("randomNo", randomNumber);
                startActivity(activityName);
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog dialog1 = builder.create();


        ImageView buttonImg = (ImageView) findViewById(R.id.imageView2);
        buttonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Alert Dialog Prompted", Toast.LENGTH_SHORT).show();
                dialog1.show();
            }
        });
    }










}