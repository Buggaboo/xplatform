Grammar Examples
================

Restful GET/HEAD example
------------------------

    call StockPrice: GET from /meh/blah?p1={name1}&p2={name2}
    with headers from request // these headers will be injected in the front end call
    StockPriceRequestJson
    '''
    {
        "client-version" = "2.3.4",
        "srp-ECDH-Qa" = {client_secret},
        "session-id" = {session_id}
        "oauth-token" = {oauth_token}
        "content-type" = "application/ubjson" // comment: also listens to 'bson' or 'ubjson' and generates a parser accordingly
    }
    '''
    and response StockPriceResponse // these headers will be injected in the back end call
    '''
    {
        "server-version" = "1.2.3",
        "srp-ECDH-Qb" = {server_secret},
        "session-id" = {session}
        "server-id" = {server_id}
        "oauth-token" = {oauth_token}
        "content-type" = "application/json"
    }
    '''
    client expects // keyword client is optional in the case of GET and HEAD
    '''
    {
        useThisPropertyNameInstead("key0") : boolean,
        "key1" : number,
        "key2" : string,
        alsoInCodeRenameToThisPropertyName("key3") : string?, // This is optional, the value might be null, or the whole key:value might be missing
        "key4" : enum FourEnumValues {"this" | "that" | "something" | "else" },
        "numberList" : [ number ],
        "stringList" : [ string ],
        "booleanList" : [ boolean ]
        "nestedJsonObject" :
            Nested
            '''
            {
                "meh" : [boolean],
                "bla" : [string],
                "hmf" : [number],
            }
            '''
    }
    '''
    or
    '''
    null
    '''
    or
    '''
    boolean
    '''
    or
    '''
    number'''
    or
    '''string'''
    or
    '''
    [ { "attr" : string } ]
    '''


Restful POST/PUT example
--------------------

    call AddPerson : PUT on /blaat/bleh/meh?p={sex}&q={sells}
    with headers from request
    ''' ... '''
    and response
    ''' ... '''
    client expects
    ''' ... '''
    server expects
    ''' ... '''

Restful DELETE example
----------------------

    call DeleteFile : DELETE from /booyakasha/goonigoogoo/hm?p={hmf}&a={smells}
    with headers from response // or 'in' response, 'in' reply
    ''' ... '''
    and request
    ''' ... '''

