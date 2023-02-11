package com.darkenergy.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView totalQuestionsTextView;
    TextView questionTextView;
    ImageView questionImages;
    Button ans1, ans2, ans3, ans4;
    Button submitBtn;
    int score=0;
    int totalQuestion = QuestionModel.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    ProgressBar progressBar;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        questionImages= findViewById(R.id.QuestionImages);
        ans1 = findViewById(R.id.option_1);
        ans2 = findViewById(R.id.option_2);
        ans3 = findViewById(R.id.option_3);
        ans4 = findViewById(R.id.option_4);
        submitBtn = findViewById(R.id.submit_btn);
        progressBar=findViewById(R.id.progress_bar);
        viewFlipper=findViewById(R.id.viewFlipper);

        ans1.setOnClickListener(this);
        ans2.setOnClickListener(this);
        ans3.setOnClickListener(this);
        ans4.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions : "+totalQuestion);
        progressBar.setMax(totalQuestion);

        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {
        ans1.setBackgroundColor(Color.WHITE);
        ans2.setBackgroundColor(Color.WHITE);
        ans3.setBackgroundColor(Color.WHITE);
        ans4.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;

        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(QuestionModel.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;

            progressBar.setProgress(currentQuestionIndex);
            viewFlipper.setInAnimation(MainActivity.this, R.anim.slide_in);
            viewFlipper.setOutAnimation(MainActivity.this, R.anim.slide_out);
            viewFlipper.showNext();
            loadNewQuestion();


        }else{
            //options button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.GREEN);

        }
    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }
        questionTextView.setText(QuestionModel.question[currentQuestionIndex]);
        questionImages.setImageResource(QuestionModel.questionImages[currentQuestionIndex]);
        ans1.setText(QuestionModel.options[currentQuestionIndex][0]);
        ans2.setText(QuestionModel.options[currentQuestionIndex][1]);
        ans3.setText(QuestionModel.options[currentQuestionIndex][2]);
        ans4.setText(QuestionModel.options[currentQuestionIndex][3]);
    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();
    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
        progressBar.setMax(0);
    }
}