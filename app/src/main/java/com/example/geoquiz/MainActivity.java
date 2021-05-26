package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button trueButton;
    private Button falseButton;
    private Button nextButton;
    private TextView questionTextView;
    private List<Question> questionBank = Arrays.asList(
            new Question(R.string.question_australia, true),
            new Question(R.string.question_oceans, true),
            new Question(R.string.question_mideast, false),
            new Question(R.string.question_africa, false),
            new Question(R.string.question_americas, true),
            new Question(R.string.question_asia, true)
    );

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);
        nextButton = findViewById(R.id.next_button);
        questionTextView = findViewById(R.id.question_text_view);

        trueButton.setOnClickListener(v ->
            Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()
        );

        falseButton.setOnClickListener(v ->
            Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
        );

        int questionTextResId = questionBank.get(currentIndex).getTextResId();
        questionTextView.setText(questionTextResId);

        nextButton.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % questionBank.size();

        });
    }
}