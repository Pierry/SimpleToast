SimpleToast
===========

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SimpleToast-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1031)
![](https://img.shields.io/github/tag/Pierry/SimpleToast.svg?label=maven)

Notifications for Android (like a Toast)

Current version: 1.0

Example
===========
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/cancel.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/ok.png)


Gradle
===========

Into your build.gradle:

    repositories {
      maven { url "https://jitpack.io" }
    }

    dependencies {
      compile 'com.github.Pierry:SimpleToast:v1.01'
    }

Ref. https://jitpack.io/#Pierry/SimpleToast/v1.01

Usage
=============

The API is kept as simple as the Toast API:

Create a SimpleToast for any CharSequence:

	SimpleToast.ok(Context, CharSequence);
    SimpleToast.error(Context, CharSequence);
    SimpleToast.info(Context, CharSequence);

Questions
==========
Questions regarding SimpleToast can be asked on [StackOverflow, using the simpletoast tag](http://stackoverflow.com/questions/tagged/simpletoast).

License
==========

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
