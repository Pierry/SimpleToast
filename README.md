SimpleToast
===========

Notifications for Android (like a Toast)

Current version: 1.0

Example
===========
http://pierrydev.com/ok.png
http://pierrydev.com/cancel.png


Usage
===========

The API is kept as simple as the Toast API:

Create a SimpleToast for any CharSequence:

	SimpleToast.ok(Context, CharSequence);
    SimpleToast.error(Context, CharSequence);
    SimpleToast.info(Context, CharSequence);
