package FirstActivity.java;
	
	<?xml version="1.0" encoding="utf-8"?>
	
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	android:id="@+id/custom_toast_layout"
	android:orientation="vertical"
	android:background="#F14E23" >
	
	<ImageView
	android:id="@+id/custom_toast_image"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:contentDescription="Hello world"
	android:src="@drawable/customToastImage"/>
	
	<TextView
	android:id="@+id/custom_toast_message"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:contentDescription="To"
	android:text="JavaTpoint custom Toast" />
	
	</LinearLayout>


}
