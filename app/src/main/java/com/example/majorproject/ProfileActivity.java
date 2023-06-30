package com.example.majorproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class ProfileActivity extends AppCompatActivity {

    //calling fire base
    FirebaseFirestore fstore;
    FirebaseUser user;
    FirebaseAuth fAuth;
    String userID,name,email;

    //for trans
    LinearLayout topprofilebar,greenbarinfo,pfinfo,greenbaraction,pfaction;

    //for data get and clicks
    LinearLayout homepage,changepassword,logoutbtn;
    TextView pfnametxt,pfemailtxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //firebase
        fAuth = FirebaseAuth.getInstance();
        user = fAuth.getCurrentUser();
        fstore = FirebaseFirestore.getInstance();
        userID = fAuth.getCurrentUser().getUid();


        //main uses
        homepage=findViewById(R.id.homepage);
        changepassword=findViewById(R.id.changepassword);
        logoutbtn=findViewById(R.id.logoutbtn);
        pfnametxt=findViewById(R.id.pfnametxt);
        pfemailtxt=findViewById(R.id.pfemailtxt);

        //trans
        topprofilebar=findViewById(R.id.topprofilebar);
        greenbarinfo=findViewById(R.id.greenbarinfo);
        pfinfo=findViewById(R.id.pfinfo);
        greenbaraction=findViewById(R.id.greenbaraction);
        pfaction=findViewById(R.id.pfaction);

        //clicks
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LandingPage.class));
            }
        });

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sign out the user
                fAuth.signOut();

                // Redirect the user to the login or home screen
                // You can replace LoginActivity.class with the desired destination
                Intent intent = new Intent(getApplicationContext(), Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish(); // Finish the current activity


            }
        });

        changepassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ForgetPassword.class));
            }
        });






        DocumentReference documentReferencenamename = fstore.collection("user").document(userID);
        documentReferencenamename.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                name = String.valueOf(value.getString("FullName"));
                pfnametxt.setText(name);
            }
        });

        DocumentReference documentReferenceemail = fstore.collection("user").document(userID);
        documentReferenceemail.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                email = String.valueOf(value.getString("Email"));
                pfemailtxt.setText(email);
            }
        });


        //trans
        startSlideFadeInAnimation(topprofilebar);
        startSlideFadeInAnimation2(greenbarinfo);
        startSlideFadeInAnimationleft(pfinfo);
        startSlideFadeInAnimationright2(greenbaraction);
        startSlideFadeInAnimationright(pfaction);
























    }


    private void startSlideFadeInAnimation(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);
    }
    private void startSlideFadeInAnimation2(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        layout.startAnimation(slideFadeInAnimation);

    }

    private void startSlideFadeInAnimationright(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);

    }


    private void startSlideFadeInAnimationleft(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_leftright_layout);
        layout.startAnimation(slideFadeInAnimation);

    }


    private void startSlideFadeInAnimationright2(LinearLayout layout) {
        Animation slideFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_layout);
        layout.startAnimation(slideFadeInAnimation);

    }
}