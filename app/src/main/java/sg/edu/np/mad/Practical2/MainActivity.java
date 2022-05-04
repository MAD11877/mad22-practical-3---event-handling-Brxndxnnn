package sg.edu.np.mad.Practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button followButton = (Button) findViewById(R.id.button);
        Button messageButton = (Button) findViewById(R.id.button2);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!user123.followed){
                    followButton.setText("Unfollow");
                    user123.followed = true;
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
                else{
                    followButton.setText("Follow");
                    user123.followed = false;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityName1 = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(activityName1);
            }
        });

        Intent receivingEnd = getIntent();
        Integer numbers = receivingEnd.getIntExtra("randomNo", 0);
        TextView mainText = (TextView) findViewById(R.id.textView2);
        mainText.setText("MAD" + " " +numbers.toString());
    }

    User user123 = new User("MAD", "Blue Red White Sheep", 1, false);







}