package br.com.pierry.simpletoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SimpleToast {

	private LinearLayout linearLayout;
	private Button button;

	public static void ok(Context context, String msg) {
		LayoutInflater myInflater = LayoutInflater.from(context);
		View view = myInflater.inflate(R.layout.toast_ok, null);

		Button button = (Button) view.findViewById(R.id.button);
		button.setText(msg);

		Toast mytoast = new Toast(context);

		mytoast.setView(view);
		mytoast.setDuration(Toast.LENGTH_SHORT);
		mytoast.show();
	}

	public static void error(Context context, String msg) {
		LayoutInflater myInflater = LayoutInflater.from(context);
		View view = myInflater.inflate(R.layout.toast_error, null);

		Button button = (Button) view.findViewById(R.id.button);
		button.setText(msg);

		Toast mytoast = new Toast(context);

		mytoast.setView(view);
		mytoast.setDuration(Toast.LENGTH_SHORT);
		mytoast.show();
	}

	public static void info(Context context, String msg) {
		LayoutInflater myInflater = LayoutInflater.from(context);
		View view = myInflater.inflate(R.layout.toast_info, null);

		Button button = (Button) view.findViewById(R.id.button);
		button.setText(msg);

		Toast mytoast = new Toast(context);

		mytoast.setView(view);
		mytoast.setDuration(Toast.LENGTH_SHORT);
		mytoast.show();
	}

}
