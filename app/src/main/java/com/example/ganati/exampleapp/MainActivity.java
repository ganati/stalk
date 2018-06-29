package com.example.ganati.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AddpersonDialog.AddpersonDialogListener{


    Button btnAddperson;
    TextView tvpersonInfo;
    private String TAG = "personInfo";
    SQLiteDatabase dtb;
    int btnBackPressCounter = 0;
    dbhandler db;

    @Override
    protected void onCreate(Bundle savedInsatanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new dbhandler(this);
        btnAddperson = (Button)findViewById(R.id.btnAddperson);

        btnAddperson.setOnClickListener(new view.OnClickListener(){
            @Override
            public void onClick(View v) {
                AddpersonDialog dialog = new AddStudentDialog();
                dialog.show(getFragmentManager(), TAG);

            }
        })

    }


btnShowDetails.setOnClickListener((v)) {
    tvpersonInfo = (TextView) findViewById(R.id.tvpersonList);
    tvpersonInfo.setMovementMethod(ArrowKeyMovementMethod.getInstance());

    tvpersonInfo.setText("");
    tvpersonInfo.setPadding(5, 2, 5, 2);

    List<person> personList = db.getAllpersonList();
    for (person prsn : personList){
    String prsnDetail = "\n\nID:" + prsn.get_id()+ "\n\tEND" + prsn.get_username() + "\n\tEND" + prsn.get_email tvpersonInfo.append("\n" + prsnDetail);}
    }
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMunuInflater().inflate(R.menu.menu_main, menu);
    return true;

}

@Override
public void onSaveButtonClick(DialogFragment dialog){
    EditText entusername = (EditText) dialog.getDialog(.findViewById(R.id.edtusername);
    String username = entusername.getText().toString();
    EditText entemail = (EditText) dialog.getDialog().findViewById(R.id.edtemail);
    String email = entemail.getText().toString();
    boolean check_username = checkUsername(username);
    boolean check_email = checkEmail(email);
    if (check_username == false || check_email = = false){
        toast.makeText(gettApplicationContext(), "enter Data Again... :p", Toast.LENGTH_LOAD)
    }
    else {
        db.addNewperson(new person(username,email));
        Toast.makeText(getApplicationContext(), "person added to the list... O_o" , Toast.LENGTH.LOAD)
    }

    Toast.makeText(getApplicationContext(), "\nusername: " + email + "\nemail"))
}


public boolean checkUsername(String username){
    if (username == "" || username.length() !=2){
        return false;
    }else {
        return true;
    }
}
public boolean checkEmail(String prsnemail){
    if(prsnemail == ""){
        return false;
    }else {
        return true;
    }

}