package FirstActivity.java;


public class FirstActivity extends AppComatActivity{
	
	@Override
	
	protected void onCreate(Bundel savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//Creating the LayoutInflater instance
		LayoutInflater li = getLayoutInflater();
		//Getting the View object as defined in the customtoast.xml file
		View layout = li.inflate(R.layout.customtoast, (ViewGroup)
		findViewById(R.id.custom_toast_layout));
		
		//Creating the Toast object
		Toast toast = new Toast(getApplicationContext());
		toast.setDuration(Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.setView(layout);//setting the view of custom toast layout
		toast.show();
	
	}

}
