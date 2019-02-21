package com.example.tec.lab2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

     /*   Toast myToast = new Toast(context);

        myToast.makeText(context,"you closed",Toast.LENGTH_LONG).show();*/


       /* AlertDialog.Builder DialogContent = new AlertDialog.Builder(this);

        DialogContent.setTitle("Tittle");

        DialogContent.setMessage("text is here");

        DialogContent.setIcon(R.mipmap.ic_launcher);

        DialogContent.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //do whatever I want if the user clicks here
                Toast.makeText(context,"you closed",Toast.LENGTH_LONG).show();

            }
        });

       AlertDialog myDialog = DialogContent.create();
        myDialog.show();*/

       //Second step

       /*

        AlertDialog.Builder SecondDialogConf = new AlertDialog.Builder(this);

        SecondDialogConf.setTitle("Confirmation Dialog");
        SecondDialogConf.setMessage("This is the Text of the Dialog");
        SecondDialogConf.setIcon(R.mipmap.ic_launcher);

        SecondDialogConf.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You answer yes.", Toast.LENGTH_LONG).show();
                    }
                });

        SecondDialogConf.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You answer No.", Toast.LENGTH_LONG).show();
                    }
                });

        SecondDialogConf.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //do whatever I want if the user clicks here
                Toast.makeText(context,"you closed",Toast.LENGTH_LONG).show();

            }
        });


        AlertDialog MyDialog = SecondDialogConf.create();
        MyDialog.show();*/


       //Third step
/*
        AlertDialog.Builder ThirdDialogContent = new AlertDialog.Builder(this);

        ThirdDialogContent.setTitle("Tittle");

        ThirdDialogContent.setMessage("text is here");

        ThirdDialogContent.setIcon(R.mipmap.ic_launcher);

        final EditText TextInput = new EditText(context);
        TextInput.setTextColor(Color.BLUE);
        ThirdDialogContent.setView(TextInput);


        ThirdDialogContent.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //do whatever I want if the user clicks here
                String str = TextInput.getEditableText().toString();
                Toast.makeText(context,"you wrote this in the dialog: " + str,Toast.LENGTH_LONG).show();

            }
        });

        AlertDialog myDialog = ThirdDialogContent.create();
        myDialog.show();*/

        int NOTIF_ID = 1234;
        Notification.Builder NotifBuilder = new Notification.Builder(this);
        NotifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        NotifBuilder.setContentTitle("Important Notification");
        NotifBuilder.setContentText("This is the detail of the notification");

        NotificationManager MyNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        MyNotification.notify(NOTIF_ID, NotifBuilder.build());

    }
}
