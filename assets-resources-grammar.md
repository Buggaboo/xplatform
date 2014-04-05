Examples of cross platform string resources / translation files etc.
===================================================================

Plist style syntax:

    project/relative/path/{platform-specific-path}/to-fr/filename { // the system will figure out the suffix
        "flow_prefix_key" = "valeur"
    }

    project/relative/path/{platform-specific-path}to-en/filename { // the system will figure out the suffix
        "flow_prefix_key" = "value"
    }

    enum Name
    {
        literal0,
        literal1,
        literal2
    }

