Examples of crossplatform string resources / translation files etc.
===================================================================

Plist style syntax:

    project/relative/path/{platform-specific-path}/to-fr/filename { // the system will figure out the suffix
        "key" = "valeur"
    }

    project/relative/path/{platform-specific-path}to-en/filename { // the system will figure out the suffix
        "key" = "value"
    }

    enum Name
    {
        literal0,
        literal1,
        literal2
    }

