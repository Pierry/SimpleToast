package com.github.pierry.simpletoast;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.IconTextView;
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
  private static Toast mToast;
  private static View mView;

  public static void ok(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_ok, null);
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN) public static void ok(Context context, String msg,
      String icon) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_ok_icon, null);
    initSetButtonMsg(msg);
    IconTextView img = (IconTextView) mView.findViewById(R.id.img);
    img.setText(icon);
    img.setTextSize(20);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  public static void ok(Context context, String msg, String icon, int time){
    mInflater = LayoutInflater.from(context);
    if (!icon.equals("")) {
      mView = mInflater.inflate(R.layout.toast_ok_icon, null);
      IconTextView img = (IconTextView) mView.findViewById(R.id.img);
      img.setText(icon);
      img.setTextSize(20);
    } else {
      mView = mInflater.inflate(R.layout.toast_ok, null);
    }
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
    if (time != 0) {
      Handler handler = new Handler();
      handler.postDelayed(new Runnable() {
        @Override public void run() {
          mToast.cancel();
        }
      }, time);
    }
  }

  public static void error(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_error, null);
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN) public static void error(Context context, String msg, String icon, int time){
    mInflater = LayoutInflater.from(context);
    if (!icon.equals("")) {
      mView = mInflater.inflate(R.layout.toast_error_icon, null);
      IconTextView img = (IconTextView) mView.findViewById(R.id.img);
      img.setText(icon);
      img.setTextSize(20);
    } else {
      mView = mInflater.inflate(R.layout.toast_error, null);
    }
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
    if (time != 0) {
      Handler handler = new Handler();
      handler.postDelayed(new Runnable() {
        @Override public void run() {
          mToast.cancel();
        }
      }, time);
    }
  }

  public static void info(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_info, null);
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN) public static void info(Context context, String msg, String icon, int time){
    mInflater = LayoutInflater.from(context);
    if (!icon.equals("")) {
      mView = mInflater.inflate(R.layout.toast_info_icon, null);
      IconTextView img = (IconTextView) mView.findViewById(R.id.img);
      img.setText(icon);
      img.setTextSize(20);
    } else {
      mView = mInflater.inflate(R.layout.toast_info, null);
    }
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
    if (time != 0) {
      Handler handler = new Handler();
      handler.postDelayed(new Runnable() {
        @Override public void run() {
          mToast.cancel();
        }
      }, time);
    }
  }

  public static void muted(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_muted, null);
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN) public static void muted(Context context, String msg, String icon, int time){
    mInflater = LayoutInflater.from(context);
    if (!icon.equals("")) {
      mView = mInflater.inflate(R.layout.toast_muted_icon, null);
      IconTextView img = (IconTextView) mView.findViewById(R.id.img);
      img.setText(icon);
      img.setTextSize(20);
    } else {
      mView = mInflater.inflate(R.layout.toast_muted, null);
    }
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
    if (time != 0) {
      Handler handler = new Handler();
      handler.postDelayed(new Runnable() {
        @Override public void run() {
          mToast.cancel();
        }
      }, time);
    }
  }

  public static void warning(Context context, String msg) {
    mInflater = LayoutInflater.from(context);
    mView = mInflater.inflate(R.layout.toast_warning, null);
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
  }

  @TargetApi(Build.VERSION_CODES.JELLY_BEAN) public static void warning(Context context, String msg, String icon, int time){
    mInflater = LayoutInflater.from(context);
    if (!icon.equals("")) {
      mView = mInflater.inflate(R.layout.toast_warning_icon, null);
      IconTextView img = (IconTextView) mView.findViewById(R.id.img);
      img.setText(icon);
      img.setTextSize(20);
    } else {
      mView = mInflater.inflate(R.layout.toast_warning, null);
    }
    initSetButtonMsg(msg);
    mToast = new Toast(context);
    mToast.setView(mView);
    mToast.setDuration(Toast.LENGTH_SHORT);
    mToast.show();
    if (time != 0) {
      Handler handler = new Handler();
      handler.postDelayed(new Runnable() {
        @Override public void run() {
          mToast.cancel();
        }
      }, time);
    }
  }

  private static Button initSetButtonMsg(String msg) {
    Button mButton = (Button) mView.findViewById(R.id.button);
    mButton.setText(msg);
    return mButton;
  }
}
