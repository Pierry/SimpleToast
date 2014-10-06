SimpleToast
===========

Notifications for Android (like a Toast)

Current version: 1.0

Example
===========
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/cancel.png)
![alt tag](https://raw.githubusercontent.com/Pierry/SimpleToast/master/screentshots/ok.png)


Usage
===========

The API is kept as simple as the Toast API:

Create a SimpleToast for any CharSequence:

	SimpleToast.ok(Context, CharSequence);
    SimpleToast.error(Context, CharSequence);
    SimpleToast.info(Context, CharSequence);
