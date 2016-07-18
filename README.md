SimpleToast
===========

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SimpleToast-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1031)
![](https://img.shields.io/github/tag/Pierry/SimpleToast.svg?label=maven)

Notifications for Android (like a Toast) 

Current version: v1.9

Example
===========
### Default icons
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/ok_default.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/cancel_default.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/info_default.png)
### Font awesome

![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/cancel.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/ok.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/info.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/muted.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/warning.png)


Gradle
===========

This library uses android-iconify:1.0.9.

Into your build.gradle:

    repositories {
      maven { url "https://jitpack.io" }
    }

    dependencies {
      compile 'com.github.Pierry:SimpleToast:v1.7'
    }

Ref. https://jitpack.io/#Pierry/SimpleToast/v1.7

Usage
=============

The API is kept as simple as the Toast API:

Create a SimpleToast for any CharSequence with default icon:

	SimpleToast.ok(Context, CharSequence);
    SimpleToast.error(Context, CharSequence);
    SimpleToast.info(Context, CharSequence);
    SimpleToast.muted(Context, CharSequence);
    SimpleToast.warning(Context, CharSequence);

Using [Font Awesome](http://fortawesome.github.io/Font-Awesome/icons/):

    SimpleToast.ok(Context, CharSequence, "{fa-home}");
    SimpleToast.error(Context, CharSequence, "{fa-user}");
    SimpleToast.info(Context, CharSequence, "{fa-check-square}");
    SimpleToast.muted(Context, CharSequence, "{fa-github}");
    SimpleToast.warning(Context, CharSequence, "{fa-exclamation-circle}");
    
Use this link for icons:
http://fortawesome.github.io/Font-Awesome/icons/
    
Questions
==========
Questions regarding SimpleToast can be asked on [StackOverflow, using the simpletoast tag](http://stackoverflow.com/questions/tagged/simpletoast).

Credits
==========
[Joan Zapata](https://github.com/JoanZapata) creator of [Android-Iconify](https://github.com/JoanZapata/android-iconify)

[Dave Gandy](https://github.com/davegandy) creator of [Font-Awesome](https://github.com/FortAwesome/Font-Awesome)

Developed By
==========
Pierry Borges - http://pierry.github.io - pieerry@gmail.com

License
==========

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
