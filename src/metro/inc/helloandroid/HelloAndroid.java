package metro.inc.helloandroid;

import java.io.File;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class HelloAndroid extends Activity implements OnClickListener
{
	private static File m_AppPathRoot = null; 

    // "KryoTest Branch"
	
    /** Called when the activity is first created. */
	@Override public void onCreate(Bundle savedInstanceState)
	{
		m_AppPathRoot = Environment.getExternalStorageDirectory();
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Get handle to a button
        Button lButton1 = (Button)findViewById(R.id.new_button);
        Button lButton2 = (Button)findViewById(R.id.new_button2);
        TextView lTV = (TextView)findViewById(R.id.new_TextView);
        Spinner lSpinner = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.testarray, R.layout.my_normal_spinner_item_style);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lSpinner.setAdapter(adapter);
        //CustBtn lCustBtn = (CustBtn)findViewById(R.id.CustBtn);
        
        // Apply the onclick event to the button
        lButton1.setOnClickListener(this);
        lButton2.setOnClickListener(this);
        lTV.setOnClickListener(this);
        //lCustBtn.setOnClickListener(this);
    }
	
	public void onClick(View v) 
	{
		switch (v.getId())
		{
			case R.id.new_button :
				Toast.makeText(v.getContext(), "Button1", Toast.LENGTH_SHORT).show();
				break;
			case R.id.new_button2 :
				Toast.makeText(v.getContext(), "Button2", Toast.LENGTH_SHORT).show();
				break;
			default:
				Toast.makeText(v.getContext(), "ButtonDef", Toast.LENGTH_SHORT).show();		
				break;
		}
	}	
}