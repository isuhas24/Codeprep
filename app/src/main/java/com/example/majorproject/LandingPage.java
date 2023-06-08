package com.example.majorproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class LandingPage extends AppCompatActivity implements View.OnClickListener{

    //calling fire base
    FirebaseFirestore fstore;
    FirebaseUser user;
    FirebaseAuth fAuth;
    String userID,name;


    TextView PFname;

    private LinearLayout factPhoto;
    private Handler handler = new Handler();
    private int[] backgrounds = {R.drawable.fact1, R.drawable.fact2, R.drawable.fact3};
    private int currentIndex = 0;

    ImageView mobility_image,ecommerce_image,crm_image,cloud_image,collaboration_image,communication_image,advertisement_image,payment_image,investment_image,entertainment_image;
    Button system_design_button,programming_languages_button,dsa_button,oops_button,dbms_button,os_button,se_button,cn_button,github_button,sde_sheet_button,web_development_button,leetcode_solutions_button,coding_practices_button,tips_button,questions_button,roadmaps,resumemaker;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        //FIREBASE INSTANCE
        fAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        user = fAuth.getCurrentUser();
        userID = fAuth.getCurrentUser().getUid();





        //Images
        mobility_image=(ImageView) findViewById(R.id.company1);
        mobility_image.setOnClickListener(this);
        ecommerce_image=(ImageView) findViewById(R.id.company2);
        ecommerce_image.setOnClickListener(this);
        crm_image=(ImageView) findViewById(R.id.company3);
        crm_image.setOnClickListener(this);
        cloud_image=(ImageView) findViewById(R.id.company5);
        cloud_image.setOnClickListener(this);
        collaboration_image=(ImageView) findViewById(R.id.company4);
        collaboration_image.setOnClickListener(this);
        communication_image=(ImageView) findViewById(R.id.company6);
        communication_image.setOnClickListener(this);
        advertisement_image=(ImageView) findViewById(R.id.company7);
        advertisement_image.setOnClickListener(this);
        payment_image=(ImageView) findViewById(R.id.company8);
        payment_image.setOnClickListener(this);
        investment_image=(ImageView) findViewById(R.id.company10);
        investment_image.setOnClickListener(this);
        entertainment_image=(ImageView) findViewById(R.id.company12);
        entertainment_image.setOnClickListener(this);

        //Button
        system_design_button=(Button) findViewById(R.id.customButton1);
        system_design_button.setOnClickListener(this);
        programming_languages_button=(Button) findViewById(R.id.customButton2);
        programming_languages_button.setOnClickListener(this);
        dsa_button=(Button) findViewById(R.id.customButton3);
        dsa_button.setOnClickListener(this);
        oops_button=(Button) findViewById(R.id.customButton4);
        oops_button.setOnClickListener(this);
        dbms_button=(Button) findViewById(R.id.customButton5);
        dbms_button.setOnClickListener(this);
        os_button=(Button) findViewById(R.id.customButton6);
        os_button.setOnClickListener(this);
        se_button=(Button) findViewById(R.id.customButton7);
        se_button.setOnClickListener(this);
        cn_button=(Button) findViewById(R.id.customButton8);
        cn_button.setOnClickListener(this);
        github_button=(Button) findViewById(R.id.customButton9);
        github_button.setOnClickListener(this);
        sde_sheet_button=(Button) findViewById(R.id.customButton10);
        sde_sheet_button.setOnClickListener(this);
        web_development_button=(Button) findViewById(R.id.customButton11);
        web_development_button.setOnClickListener(this);
        leetcode_solutions_button=(Button) findViewById(R.id.customButton12);
        leetcode_solutions_button.setOnClickListener(this);
        coding_practices_button=(Button) findViewById(R.id.customButton13);
        coding_practices_button.setOnClickListener(this);
        tips_button=(Button) findViewById(R.id.customButton14);
        tips_button.setOnClickListener(this);
        questions_button=(Button) findViewById(R.id.customButton15);
        questions_button.setOnClickListener(this);
        resumemaker=(Button)findViewById(R.id.resumemaker);
        resumemaker.setOnClickListener(this);


        PFname = findViewById(R.id.profilename);

        //GETTING NAME FROM FIREBASE
        DocumentReference documentReferencenamename = fstore.collection("user").document(userID);
        documentReferencenamename.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                name = String.valueOf(value.getString("FullName"));
                PFname.setText(name);
            }
        });



        //Image Slider Code
        factPhoto = findViewById(R.id.factphoto);

        // Start the background changer
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                currentIndex++;
                if (currentIndex >= backgrounds.length) {
                    currentIndex = 0;
                }
                factPhoto.setBackgroundResource(backgrounds[currentIndex]);
                handler.postDelayed(this, 3000);
            }
        }, 3000);
    }

    @Override
    public void onClick(View v){

        //Images if-else block
        if(v.equals(mobility_image)){

            //Intent intent = new Intent(LandingPage.this, VideoPlayerActivity.class);
            //intent.putExtra(VideoPlayerActivity.VIDEO_ID_KEY, "VIDEO_ID_KEY");
            //startActivity(intent);
            Intent it=new Intent(this, MobilityCompanies.class);
            startActivity(it);
        }
        else if (v.equals(ecommerce_image)) {
            Intent it=new Intent(this,EcommerceCompanyies.class);
            startActivity(it);
        }
        else if(v.equals(crm_image)){
            Intent it=new Intent(this,CRMCompanies.class);
            startActivity(it);
        }
        else if(v.equals(cloud_image)){
            Intent it=new Intent(this,CloudCompanies.class);
            startActivity(it);
        }
        else if(v.equals(collaboration_image)){
            Intent it=new Intent(this,CollaborationCompanies.class);
            startActivity(it);
        }
        else if(v.equals(communication_image)){
            Intent it=new Intent(this,CommunicationCompanies.class);
            startActivity(it);
        }
        else if(v.equals(advertisement_image)){
            Intent it=new Intent(this,AdvertisementCompanies.class);
            startActivity(it);
        }
        else if(v.equals(payment_image)){
            Intent it=new Intent(this,PaymentCompanies.class);
            startActivity(it);
        }
        else if(v.equals(investment_image)){
            Intent it=new Intent(this,InvestmentCompanies.class);
            startActivity(it);
        }
        else if(v.equals(entertainment_image)){
            Intent it=new Intent(this,EntertainmentCompanies.class);
            startActivity(it);
        }

        //Buttons if-else block
        if(v.equals(system_design_button)){
            Intent it=new Intent(this,SystemDesign.class);
            startActivity(it);
        }
        else if(v.equals(programming_languages_button)){
            Intent it=new Intent(this,ProgrammingLanguages.class);
            startActivity(it);
        }
        else if(v.equals(dsa_button)){
            Intent it=new Intent(this,DSA.class);
            startActivity(it);
        }
        else if(v.equals(oops_button)){
            Intent it=new Intent(this,OOPS.class);
            startActivity(it);
        }
        else if(v.equals(dbms_button)){
            Intent it=new Intent(this,DBMS.class);
            startActivity(it);
        }
        else if(v.equals(os_button)){
            Intent it=new Intent(this,OperatingSystem.class);
            startActivity(it);
        }
        else if(v.equals(se_button)){
            Intent it=new Intent(this,SoftwareEngineering.class);
            startActivity(it);
        }
        else if(v.equals(cn_button)){
            Intent it=new Intent(this,ComputerNetworks.class);
            startActivity(it);
        }
        else if(v.equals(cn_button)){
            Intent it=new Intent(this,ComputerNetworks.class);
            startActivity(it);
        }
        else if(v.equals(github_button)){
            Intent it=new Intent(this,GitHub.class);
            startActivity(it);
        }
        else if(v.equals(sde_sheet_button)){
            Intent it=new Intent(this,SDESheet.class);
            startActivity(it);
        }
        else if(v.equals(web_development_button)){
            Intent it=new Intent(this,WebDevelopment.class);
            startActivity(it);
        }
        else if(v.equals(leetcode_solutions_button)){
            Intent it=new Intent(this,LeetcodeSolutions.class);
            startActivity(it);
        }
        else if(v.equals(coding_practices_button)){
            Intent it=new Intent(this,CodingPractices.class);
            startActivity(it);
        }
        else if(v.equals(tips_button)){
            Intent it=new Intent(this,Tips.class);
            startActivity(it);
        }
        else if(v.equals(questions_button)){
            Intent it=new Intent(this,Questions.class);
            startActivity(it);
        }
    }
}
