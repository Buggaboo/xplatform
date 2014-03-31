xplatform (pronounced as crossplatform)
=======================================

Mobile Crossplatform json parser + model and asset generator, created with xtext + xtend
with generator for Spring and/or JEE.

This was created with the idea to quickly generate scaffolding code for making http calls from a diverse range of mobile applications on different platforms, as native as you can grok, according to the best practices from each platform.

From the back end and front end perspective.

Supported platforms
===================
* Android: xml string resource files, standard JSON parser code, POJ for Parcelable models, for use in AsyncTaskLoaders<Parcelable>.
* iOS: plists, standard JSON parser, starting from iOS5, objective C code with @property for use in delegates.

Roadmap front end
=================
* Android
* Blackberry 10
* iOS
* Windows

Roadmap back end
================
* Spring
* JEE

Dependencies
============
* Mobile platforms where you will deploy to (e.g. iOS: xcode, android: eclips/android studio)
* [Eclipse with xtext/xtend pre-packaged](https://www.eclipse.org/Xtext/download.html)

Mission statement
=================

There is so much more interesting code to write in this single lifetime, it is only roughly 30 000 days.

Don't write it! Automate it or make someone else do it. Stop writing boilerplate code at any cost.

Avoid NIH and stick to the guidelines!
