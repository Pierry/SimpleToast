SimpleToast
===========

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SimpleToast-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1031)
![](https://img.shields.io/github/tag/Pierry/SimpleToast.svg?label=maven)

Notifications for Android (like a Toast) 

Current version: v1.4

Example
===========
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/cancel.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/ok.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/info.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/muted.png)


Gradle
===========

Into your build.gradle:

    repositories {
      maven { url "https://jitpack.io" }
    }

    dependencies {
      compile 'com.github.Pierry:SimpleToast:v1.4'
    }

Ref. https://jitpack.io/#Pierry/SimpleToast/v1.4

Usage
=============

The API is kept as simple as the Toast API:

Create a SimpleToast for any CharSequence with default icon:

	SimpleToast.ok(Context, CharSequence);
    SimpleToast.error(Context, CharSequence);
    SimpleToast.info(Context, CharSequence);
    SimpleToast.muted(Context, CharSequence);

Using [Font Awesome](http://fortawesome.github.io/Font-Awesome/icons/):

    SimpleToast.ok(Context, CharSequence, "{fa-home}");
    SimpleToast.error(Context, CharSequence, "{fa-user}");
    SimpleToast.info(Context, CharSequence, "{fa-check-square}");
    SimpleToast.muted(Context, CharSequence, "{fa-github}");
    
Use this link for icons:
http://fortawesome.github.io/Font-Awesome/icons/
    
Questions
==========
Questions regarding SimpleToast can be asked on [StackOverflow, using the simpletoast tag](http://stackoverflow.com/questions/tagged/simpletoast).

License
==========

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
