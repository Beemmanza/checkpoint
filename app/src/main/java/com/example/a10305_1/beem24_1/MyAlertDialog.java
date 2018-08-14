package com.example.a10305_1.beem24_1;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyAlertDialog {
    private AlertDialog.Builder objAlertDailog;

    public  void HavespaceDialog(Context context){
        objAlertDailog = new AlertDialog.Builder(context);
        //objAlertDailog.setIcon(R.drawable.)
        objAlertDailog.setTitle("Have space");
        objAlertDailog.setMessage("Enter Temperature!!!");
        objAlertDailog.setCancelable(false);
        objAlertDailog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objAlertDailog.show();
        

    }
    public void ShowAnwer(Context context, String strTemperature, String strAnswer, String strTem) {
        objAlertDailog = new AlertDialog.Builder(context);
        //objAlertDailog.setIcon(R.drawable.tem);
        objAlertDailog.setTitle("Temperature is");
        objAlertDailog.setMessage("Your Enter "+ strTemperature +"\n" + "Exchange Temperature to "+ strAnswer + " " + strTem);
        objAlertDailog.setCancelable(false);
        objAlertDailog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        objAlertDailog.show();
    }
    public void Showfar(Context context, String strTemperature, String strAnswer, String strTem) {
        objAlertDailog = new AlertDialog.Builder(context);
        //objAlertDailog.setIcon(R.drawable.tem);
        objAlertDailog.setTitle("Temperature is");
        objAlertDailog.setMessage("Your Enter "+ strTemperature +"\n" + "Exchange Temperature to "+ strAnswer + " " + strTem);
        objAlertDailog.setCancelable(false);
        objAlertDailog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        objAlertDailog.show();
    }
    public void Showka(Context context, String strTemperature, String strAnswer, String strTem) {
        objAlertDailog = new AlertDialog.Builder(context);
        //objAlertDailog.setIcon(R.drawable.tem);
        objAlertDailog.setTitle("Temperature is");
        objAlertDailog.setMessage("Your Enter "+ strTemperature +"\n" + "Exchange Temperature to "+ strAnswer + " " + strTem);
        objAlertDailog.setCancelable(false);
        objAlertDailog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        objAlertDailog.show();
    }


}
