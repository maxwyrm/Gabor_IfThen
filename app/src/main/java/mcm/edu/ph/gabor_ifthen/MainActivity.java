package mcm.edu.ph.gabor_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnD1);
        Button btnDecision2 = findViewById(R.id.btnD2);
        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);

        TextView storyBackground = findViewById(R.id.txtBG);
        TextView outcome = findViewById(R.id.txtAns);

        storyBackground.setText(
                "You're sitting in the classroom. It's your last subject for the day." +
                        "\nAs soon as you hear the bell ring, it starts to rain, and as soon as you start " +
                        "\nmaking your way out of the school, it pours down harder and harder." +
                        "\nNevertheless, you start making your way home. On your way, you come across a" +
                        "\nlittle girl waiting outside the nearby elementary school." +
                        "\nShe has no umbrella or raincoat, none of her schoolmates seem interested in " +
                        "\nhelping her either. What do you do?");

        outcome.setText(
                "The first decision is to simply keep walking and go home. You do have a lot of homework to do..." +
                        "\nThe second decision that comes to your mind involves helping the girl and walking her home. This might lead to you coming home late though, or even worse, lost."


        );


    }

    @Override
    public void onClick(View view) {

        TextView outcome = findViewById(R.id.txtAns);
        TextView storyBackground = findViewById(R.id.txtBG);

        if (view.getId() == R.id.btnD1) {
            storyBackground.setText("Though you feel guilt, you ignore the girl and continue making your way home." +
                    "With your head down, a car comes sliding down the road getting closer and closer. Your vision goes completely dark.\n");
            outcome.setText("Game Over");

        } else if (view.getId() == R.id.btnD2) {
            storyBackground.setText("You tell the girl that you will share your umbrella with her and get her home safely.\n" +
                    "She smiles and thanks you, and you start walking together. As you walk, she tells you the directions to her home. You nod along" +
                    " with every turn.\n \n" +
                    "The more you walk, the longer the road seems. You start to feel doubtful and worried. She said it wasn't that far," +
                    "so why does it feel like the opposite?");
            outcome.setText(
                    "Decision1: Ask her if she's sure this is the way\n \n" +
                            "Decision 2: Keep walking");
        
        }else if (view.getId() == R.id.btnD1) {
                storyBackground.setText("The girl opens her mouth, but before you even get an answer out of her, your vision goes completely dark.");
                outcome.setText("Game Over");
                if (view.getId() == R.id.btnD2) {
                    storyBackground.setText
                            ("You keep walking, even though every part of you is telling you no. Minutes go by, to no avail." +
                                    "The roads seem to be... looping. You honestly aren't sure anymore. Suddenly, you hear a loud honking from behind both of you.");
                    outcome.setText(
                            "Decision1: Move out of the way\n \n" +
                                    "Decision 2: Protect her");
                }

            }else if (view.getId() == R.id.btnD1) {
                    storyBackground.setText("You selfishly move out of the way, leaving the girl to her dismay.");
                    outcome.setText("Why did you do that?");

                    if (view.getId() == R.id.btnD2) {
                        storyBackground.setText("You shield the girl from the oncoming vehicle. You hear a loud ringing in your ear, and then, silence.");
                        outcome.setText("Game Over. But hey, at least you died selfless, right?");

                    }

                }
            }
        }
















