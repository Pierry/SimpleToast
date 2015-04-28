package com.github.pierry.simpletoast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.IconTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.joanzapata.android.iconify.IconDrawable;
import com.joanzapata.android.iconify.Iconify;

/*
* Copyright (C) 2015 Pierry Borges
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
public class SimpleToast {

  private static LayoutInflater mInflater;
  LinearLayout linearLayout;
  private static Button mButton;
  private static Toast mToast;
  private static View mView;

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

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN) public static void ok(Context context, String msg, int color, int borderColor,
      Iconify.IconValue iconValue) {
    LayoutInflater myInflater = LayoutInflater.from(context);
    View view = myInflater.inflate(R.layout.toast_base, null);

    Button button = (Button) view.findViewById(R.id.button);
    button.setText(msg);

    IconTextView img = (IconTextView) view.findViewById(R.id.img);
    img.setBackground(new IconDrawable(context, iconValue)
            .colorRes(R.color.white).sizeDp(40));

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

  private static Button getButtonInstance() {
    mButton = (Button) mView.findViewById(R.id.button);
    return mButton;
  }
}
