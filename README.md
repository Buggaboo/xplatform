Mobgen
======

Mobgen is a (mobile) crossplatform json parser + model and asset generator, created with xtext + xtend.

The goal of this project is to quickly generate scaffolding code for making http calls from a diverse range of mobile applications on different platforms, as native as you can grok, according to the best practices from each platform.

From the back end and front end perspective.

How-to
======

Use the Domain Specific Language (DSL) for xplatform (in .xplatform files), to generate the source files etc. required for a certain platform.

TODO create videos how to set it up.


Planned features on supported platforms
-------------------------------
* Android: xml string resource files, standard JSON parser code, POJ for Parcelable models, for use in AsyncTaskLoaders<Parcelable>.
* iOS: plists, standard JSON parser, starting from iOS5, objective C code with @property for use in delegates for http calls.

Roadmap: front end
------------------
* [UBJSON](http://ubjson.org/)
* Android
* iOS
* Windows

Roadmap: back end
-----------------
* [Spark](http://www.sparkjava.com/) and [git clone it](https://github.com/perwendel/spark) (pure java restful web framework) + xtend
* [UBJSON](http://ubjson.org/)

Dependencies
------------
* Mobile platforms where you will deploy to (e.g. iOS: xcode, android: eclips/android studio)
* [Eclipse with xtext/xtend pre-packaged](https://www.eclipse.org/Xtext/download.html)

Mission statement
-----------------

There is so much more interesting code to write in this single lifetime, it is only roughly 30 000 days.

Don't write it! Automate it or make someone else do it. Stop writing boilerplate code at any cost.

Avoid NIH and stick to the guidelines!
