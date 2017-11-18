package kku.toolmee.bootcbatong.emsvolunteer.utility;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;


import kku.toolmee.bootcbatong.emsvolunteer.R;

/**
 * Created by BOOTCABA on 13-Nov-17.
 */

public class MyAlert {
    private Context mycontext;

    public MyAlert(Context mycontext){
        this.mycontext = mycontext;
    }

    public  void setPasswordDialog(String strTitle, String strMessage){

        AlertDialog.Builder builder = new AlertDialog.Builder(mycontext);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_face);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("ตกลง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }

}
