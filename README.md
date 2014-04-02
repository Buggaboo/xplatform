Xplatform
=========

Xplatform is a (mobile) crossplatform json parser + model and asset generator, created with xtext + xtend.

This was created with the idea to quickly generate scaffolding code for making http calls from a diverse range of mobile applications on different platforms, as native as you can grok, according to the best practices from each platform.

From the back end and front end perspective.

How-to
======

Use the Domain Specific Language (DSL) for xplatform (in .xplatform files), to generate the source files etc. required for a certain platform.

TODO create videos how to set it up.


Features on supported platforms
-------------------------------
* Android: xml string resource files, standard JSON parser code, POJ for Parcelable models, for use in AsyncTaskLoaders<Parcelable>.
* iOS: plists, standard JSON parser, starting from iOS5, objective C code with @property for use in delegates for http calls.

Roadmap: front end
------------------
* BSON
* Android
* Blackberry 10
* iOS
* Windows
* GreenSQL style database schema generation / iOS core data

Roadmap: back end
-----------------
* node.js
* Dependency Injection (DI)style mockapi generation
* BSON
* Spring
* JEE
* Database schema generation for PosgreSQL (bjson/bson)?

Dependencies
------------
* Mobile platforms where you will deploy to (e.g. iOS: xcode, android: eclips/android studio)
* [Eclipse with xtext/xtend pre-packaged](https://www.eclipse.org/Xtext/download.html)

Mission statement
-----------------

There is so much more interesting code to write in this single lifetime, it is only roughly 30 000 days.

Don't write it! Automate it or make someone else do it. Stop writing boilerplate code at any cost.

Avoid NIH and stick to the guidelines!
