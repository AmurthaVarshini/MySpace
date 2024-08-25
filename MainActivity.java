import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button alert;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
alert = (Button) findViewById(R.id.btnalert);
alert.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
AlertDialogalertDialog = new AlertDialog.Builder(MainActivity.this).create();
alertDialog.setTitle(&quot;Alert Title&quot;);
alertDialog.setMessage(&quot;Are you sure, you want to close this application&quot;);
alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, &quot;Yes&quot;,
new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterfacedialogInterface, int i) {
finish();
}
});
alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, &quot;No&quot;,
new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterfacedialogInterface, int i) {
dialogInterface.dismiss();
}
});
alertDialog.show();
}
});
}
