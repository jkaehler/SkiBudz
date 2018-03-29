package com.example.johnkaehler.skibudz;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by John Kaehler on 3/18/2018.
 */

public class ServerRequests extends Activity {

    ProgressDialog progressDialog;

    public static final int CONNECTION_TIMEOUT = 1000 * 15;//how long it will take for connection to timeout
    public static final String SERVER_ADDRESS = "http://10.0.2.2/PFS_PHP/";//sending data to local hosted server

    public ServerRequests(Context context){//constructor
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please wait...");
    }

}
