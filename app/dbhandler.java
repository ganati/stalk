package com.example.ganati.exampleapp;

public class dbhandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION-1;
    private static final String DATABASE_NAME = "personal";
    private static final String TABLE_PERSONAL_DETAILS = "peronalDetails";


    private static final String KEY_username = "username";
    private static final String KEY_email = "email";

    public dbhandler (Context context) { super (context DATABASE_NAME, null, DATABASE_VERSION);}

    @Override

    public void onCreate(SQLiteDatabase db)   {
        String CREATE_PERSONAL_DETAIL_TABLE = "CREATE TABLE" + "("
                + KEY_username "TEXT,"
                + KEY_email "TEXT" + ")";
        db.execSQL(CREATE_PERSONAL_TABLE);


    }
    @Override

    public void OnUpgrade(SQLiteDatabase, int olderVersi0n, int newVersion){
        db.execSQLite("DROP TABLE IF EXISTS" + TABLE_PERSONAL_DETAIL);

        onCreate(db);
    }


}

//add new person details

void addNewperson(Person newprsn){
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues values = new ContentVlaues();
    values.put(KEY_username, newprsn.get_username());
    values.put(KEY_email, newprsn.get_email);

    //inserting row

    db.insert(TABLE_PERSON_DETAILS, null, values);
    //closing database connection

    db.close();
}