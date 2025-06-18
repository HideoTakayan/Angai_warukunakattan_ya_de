package com.university;

import com.university.database.insertToAiven;

public class WriteToSQLDb {
    public void writeToDb(User u) {
        insertToAiven ac = new insertToAiven();
        ac.insertToAivenDb(u);
    }

}
