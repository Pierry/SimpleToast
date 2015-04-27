package com.github.pierry.simpletoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

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
  private static Button mButton;
  private static Toast mToast;
  private static View mView;

  public static void ok(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    View view = mInflater.inflate(R.layout.toast_ok, null);
    getButtonInstance().setText(msg);
    mToast = new Toast(context);
    mToast.setView(view);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  public static void error(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_error, null);
    getButtonInstance().setText(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  public static void info(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_info, null);
    getButtonInstance().setText(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  private static Button getButtonInstance() {
    mButton = (Button) mView.findViewById(R.id.button);
    return mButton;
  }
}
