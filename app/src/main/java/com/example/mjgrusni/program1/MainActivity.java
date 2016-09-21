package com.example.mjgrusni.program1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onClickFaculty(View view){
        Intent intent = new Intent(this, FacultyActivity.class);
        startActivity(intent);
    }

    protected void onClickCourseSequence(View view){
        Intent intent = new Intent(this, CourseSequenceActivity.class);
        startActivity(intent);
    }

}
