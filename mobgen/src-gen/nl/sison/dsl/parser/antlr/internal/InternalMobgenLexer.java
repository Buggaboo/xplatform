package nl.sison.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMobgenLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_ID=4;
    public static final int RULE_JSON_META_SCALAR_TYPE=14;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_EMPTY_JSON_ARRAY=10;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=11;
    public static final int RULE_EMPTY_JSON_OBJECT=9;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_JSON_NUMBER=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_JSON_LITERAL_NULL=12;
    public static final int T__39=39;
    public static final int RULE_MOBGEN_HEADER_PARAMETER=8;
    public static final int RULE_RESTFUL_METHODS=6;
    public static final int RULE_INT=15;
    public static final int RULE_WS=18;

    // delegates
    // delegators

    public InternalMobgenLexer() {;} 
    public InternalMobgenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMobgenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:11:7: ( 'platform' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:11:9: 'platform'
            {
            match("platform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:12:7: ( '{' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:13:7: ( '->' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:13:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:14:7: ( '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:15:7: ( 'call' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:15:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:16:7: ( ':' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:17:7: ( 'from' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:17:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:18:7: ( 'with' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:18:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:19:7: ( 'headers' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:19:9: 'headers'
            {
            match("headers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:20:7: ( 'request' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:20:9: 'request'
            {
            match("request"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:21:7: ( 'and' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:21:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:22:7: ( 'response' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:22:9: 'response'
            {
            match("response"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:23:7: ( 'client' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:23:9: 'client'
            {
            match("client"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:24:7: ( 'expects' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:24:9: 'expects'
            {
            match("expects"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:25:7: ( 'server' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:25:9: 'server'
            {
            match("server"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:26:7: ( '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:26:9: '\\'\\'\\''
            {
            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:27:7: ( ',' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:27:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:28:7: ( '=' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:29:7: ( '[' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:30:7: ( ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:30:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:31:7: ( 'enum' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:31:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:32:7: ( 'map' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:32:9: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_MOBGEN_HEADER_PARAMETER"
    public final void mRULE_MOBGEN_HEADER_PARAMETER() throws RecognitionException {
        try {
            int _type = RULE_MOBGEN_HEADER_PARAMETER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1536:30: ( '{' RULE_ID '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1536:32: '{' RULE_ID '}'
            {
            match('{'); 
            mRULE_ID(); 
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOBGEN_HEADER_PARAMETER"

    // $ANTLR start "RULE_RESTFUL_METHODS"
    public final void mRULE_RESTFUL_METHODS() throws RecognitionException {
        try {
            int _type = RULE_RESTFUL_METHODS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:22: ( ( 'PUT' | 'POST' | 'GET' | 'DELETE' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:24: ( 'PUT' | 'POST' | 'GET' | 'DELETE' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:24: ( 'PUT' | 'POST' | 'GET' | 'DELETE' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'P':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='U') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='O') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'G':
                {
                alt1=3;
                }
                break;
            case 'D':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:25: 'PUT'
                    {
                    match("PUT"); 


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:31: 'POST'
                    {
                    match("POST"); 


                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:38: 'GET'
                    {
                    match("GET"); 


                    }
                    break;
                case 4 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:44: 'DELETE'
                    {
                    match("DELETE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RESTFUL_METHODS"

    // $ANTLR start "RULE_JSON_META_SCALAR_TYPE"
    public final void mRULE_JSON_META_SCALAR_TYPE() throws RecognitionException {
        try {
            int _type = RULE_JSON_META_SCALAR_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1540:28: ( ( 'boolean' | 'number' | 'string' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1540:30: ( 'boolean' | 'number' | 'string' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1540:30: ( 'boolean' | 'number' | 'string' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt2=1;
                }
                break;
            case 'n':
                {
                alt2=2;
                }
                break;
            case 's':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1540:31: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1540:41: 'number'
                    {
                    match("number"); 


                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1540:50: 'string'
                    {
                    match("string"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_META_SCALAR_TYPE"

    // $ANTLR start "RULE_EMPTY_JSON_OBJECT"
    public final void mRULE_EMPTY_JSON_OBJECT() throws RecognitionException {
        try {
            int _type = RULE_EMPTY_JSON_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1542:24: ( '{}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1542:26: '{}'
            {
            match("{}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EMPTY_JSON_OBJECT"

    // $ANTLR start "RULE_EMPTY_JSON_ARRAY"
    public final void mRULE_EMPTY_JSON_ARRAY() throws RecognitionException {
        try {
            int _type = RULE_EMPTY_JSON_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1544:23: ( '[]' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1544:25: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EMPTY_JSON_ARRAY"

    // $ANTLR start "RULE_JSON_LITERAL_NULL"
    public final void mRULE_JSON_LITERAL_NULL() throws RecognitionException {
        try {
            int _type = RULE_JSON_LITERAL_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1546:24: ( 'null' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1546:26: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_LITERAL_NULL"

    // $ANTLR start "RULE_JSON_LITERAL_BOOLEAN"
    public final void mRULE_JSON_LITERAL_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_JSON_LITERAL_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1548:27: ( ( 'true' | 'false' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1548:29: ( 'true' | 'false' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1548:29: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1548:30: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1548:37: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_LITERAL_BOOLEAN"

    // $ANTLR start "RULE_JSON_NUMBER"
    public final void mRULE_JSON_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_JSON_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:18: ( ( '0' | ( '1..9' )+ RULE_INT ) ( '.' RULE_INT )? )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:20: ( '0' | ( '1..9' )+ RULE_INT ) ( '.' RULE_INT )?
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:20: ( '0' | ( '1..9' )+ RULE_INT )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                alt5=1;
            }
            else if ( (LA5_0=='1') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:21: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:25: ( '1..9' )+ RULE_INT
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:25: ( '1..9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='1') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='.') ) {
                                int LA4_3 = input.LA(3);

                                if ( (LA4_3=='.') ) {
                                    alt4=1;
                                }


                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:25: '1..9'
                    	    {
                    	    match("1..9"); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:43: ( '.' RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1550:44: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_NUMBER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1552:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1552:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1552:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1552:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1552:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1554:10: ( ( '0' .. '9' )+ )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1554:12: ( '0' .. '9' )+
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1554:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1554:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1556:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1558:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1558:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1558:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1558:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:41: ( '\\r' )? '\\n'
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1562:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1564:16: ( . )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1564:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_MOBGEN_HEADER_PARAMETER | RULE_RESTFUL_METHODS | RULE_JSON_META_SCALAR_TYPE | RULE_EMPTY_JSON_OBJECT | RULE_EMPTY_JSON_ARRAY | RULE_JSON_LITERAL_NULL | RULE_JSON_LITERAL_BOOLEAN | RULE_JSON_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=37;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:142: RULE_MOBGEN_HEADER_PARAMETER
                {
                mRULE_MOBGEN_HEADER_PARAMETER(); 

                }
                break;
            case 24 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:171: RULE_RESTFUL_METHODS
                {
                mRULE_RESTFUL_METHODS(); 

                }
                break;
            case 25 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:192: RULE_JSON_META_SCALAR_TYPE
                {
                mRULE_JSON_META_SCALAR_TYPE(); 

                }
                break;
            case 26 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:219: RULE_EMPTY_JSON_OBJECT
                {
                mRULE_EMPTY_JSON_OBJECT(); 

                }
                break;
            case 27 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:242: RULE_EMPTY_JSON_ARRAY
                {
                mRULE_EMPTY_JSON_ARRAY(); 

                }
                break;
            case 28 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:264: RULE_JSON_LITERAL_NULL
                {
                mRULE_JSON_LITERAL_NULL(); 

                }
                break;
            case 29 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:287: RULE_JSON_LITERAL_BOOLEAN
                {
                mRULE_JSON_LITERAL_BOOLEAN(); 

                }
                break;
            case 30 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:313: RULE_JSON_NUMBER
                {
                mRULE_JSON_NUMBER(); 

                }
                break;
            case 31 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:330: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:338: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:347: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:359: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:375: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:391: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1:399: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\44\1\46\1\42\1\uffff\1\44\1\uffff\7\44\1\42\2\uffff\1"+
        "\74\1\uffff\7\44\1\106\1\107\1\42\2\uffff\2\42\2\uffff\1\44\6\uffff"+
        "\2\44\1\uffff\12\44\1\70\6\uffff\10\44\5\uffff\11\44\1\154\4\44"+
        "\1\uffff\1\161\1\162\1\44\1\162\6\44\1\172\1\44\1\174\1\44\1\176"+
        "\3\44\1\uffff\1\44\1\u0083\2\44\2\uffff\1\162\3\44\1\u0089\1\u008a"+
        "\1\44\1\uffff\1\44\1\uffff\1\u008a\1\uffff\4\44\1\uffff\5\44\2\uffff"+
        "\1\44\1\u0097\4\44\1\u009c\1\u009d\1\162\1\44\1\u009d\1\44\1\uffff"+
        "\1\u00a0\1\u00a1\1\44\1\u00a3\2\uffff\1\u009d\1\u00a4\2\uffff\1"+
        "\u00a5\3\uffff";
    static final String DFA18_eofS =
        "\u00a6\uffff";
    static final String DFA18_minS =
        "\1\0\1\154\1\101\1\76\1\uffff\1\141\1\uffff\1\141\1\151\2\145\2"+
        "\156\1\145\1\0\2\uffff\1\135\1\uffff\1\141\1\117\2\105\1\157\1\165"+
        "\1\162\1\60\1\56\1\101\2\uffff\1\0\1\52\2\uffff\1\141\6\uffff\1"+
        "\154\1\151\1\uffff\1\157\1\154\1\164\1\141\1\161\1\144\1\160\1\165"+
        "\2\162\1\47\6\uffff\1\160\1\124\1\123\1\124\1\114\1\157\1\154\1"+
        "\165\5\uffff\1\164\1\154\1\145\1\155\1\163\1\150\1\144\1\165\1\160"+
        "\1\60\1\145\1\155\1\166\1\151\1\uffff\2\60\1\124\1\60\1\105\1\154"+
        "\1\142\1\154\1\145\1\146\1\60\1\156\1\60\1\145\1\60\2\145\1\157"+
        "\1\uffff\1\143\1\60\1\145\1\156\2\uffff\1\60\1\124\2\145\2\60\1"+
        "\157\1\uffff\1\164\1\uffff\1\60\1\uffff\1\162\1\163\1\156\1\164"+
        "\1\uffff\1\162\1\147\1\105\1\141\1\162\2\uffff\1\162\1\60\1\163"+
        "\1\164\2\163\3\60\1\156\1\60\1\155\1\uffff\2\60\1\145\1\60\2\uffff"+
        "\2\60\2\uffff\1\60\3\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\154\1\175\1\76\1\uffff\1\154\1\uffff\1\162\1\151\2\145"+
        "\1\156\1\170\1\164\1\uffff\2\uffff\1\135\1\uffff\1\141\1\125\2\105"+
        "\1\157\1\165\1\162\1\71\1\56\1\172\2\uffff\1\uffff\1\57\2\uffff"+
        "\1\141\6\uffff\1\154\1\151\1\uffff\1\157\1\154\1\164\1\141\1\163"+
        "\1\144\1\160\1\165\2\162\1\47\6\uffff\1\160\1\124\1\123\1\124\1"+
        "\114\1\157\1\155\1\165\5\uffff\1\164\1\154\1\145\1\155\1\163\1\150"+
        "\1\144\1\165\1\160\1\172\1\145\1\155\1\166\1\151\1\uffff\2\172\1"+
        "\124\1\172\1\105\1\154\1\142\1\154\1\145\1\146\1\172\1\156\1\172"+
        "\1\145\1\172\2\145\1\157\1\uffff\1\143\1\172\1\145\1\156\2\uffff"+
        "\1\172\1\124\2\145\2\172\1\157\1\uffff\1\164\1\uffff\1\172\1\uffff"+
        "\1\162\1\163\1\156\1\164\1\uffff\1\162\1\147\1\105\1\141\1\162\2"+
        "\uffff\1\162\1\172\1\163\1\164\2\163\3\172\1\156\1\172\1\155\1\uffff"+
        "\2\172\1\145\1\172\2\uffff\2\172\2\uffff\1\172\3\uffff";
    static final String DFA18_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\10\uffff\1\21\1\22\1\uffff\1\24\12\uffff"+
        "\1\37\1\40\2\uffff\1\44\1\45\1\uffff\1\37\1\32\1\2\1\27\1\3\1\4"+
        "\2\uffff\1\6\13\uffff\1\41\1\21\1\22\1\33\1\23\1\24\10\uffff\1\36"+
        "\1\40\1\42\1\43\1\44\16\uffff\1\20\22\uffff\1\13\4\uffff\1\26\1"+
        "\30\7\uffff\1\5\1\uffff\1\7\1\uffff\1\10\4\uffff\1\25\5\uffff\1"+
        "\34\1\35\14\uffff\1\15\4\uffff\1\17\1\31\2\uffff\1\11\1\12\1\uffff"+
        "\1\16\1\1\1\14";
    static final String DFA18_specialS =
        "\1\1\15\uffff\1\0\20\uffff\1\2\u0086\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\37\4\42\1\16\4\42\1"+
            "\17\1\3\1\42\1\40\1\32\1\33\10\36\1\6\2\42\1\20\3\42\3\35\1"+
            "\26\2\35\1\25\10\35\1\24\12\35\1\21\1\42\1\22\1\34\1\35\1\42"+
            "\1\13\1\27\1\5\1\35\1\14\1\7\1\35\1\11\4\35\1\23\1\30\1\35\1"+
            "\1\1\35\1\12\1\15\1\31\2\35\1\10\3\35\1\2\1\42\1\4\uff82\42",
            "\1\43",
            "\32\47\3\uffff\2\47\1\uffff\32\47\2\uffff\1\45",
            "\1\50",
            "",
            "\1\52\12\uffff\1\53",
            "",
            "\1\56\20\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\11\uffff\1\63",
            "\1\65\16\uffff\1\66",
            "\47\70\1\67\uffd8\70",
            "",
            "",
            "\1\73",
            "",
            "\1\76",
            "\1\100\5\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\107",
            "\1\106",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\70",
            "\1\110\4\uffff\1\111",
            "",
            "",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\1\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\141\1\140",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\163",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\173",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\175",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008b",
            "",
            "\1\u008c",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009f",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_MOBGEN_HEADER_PARAMETER | RULE_RESTFUL_METHODS | RULE_JSON_META_SCALAR_TYPE | RULE_EMPTY_JSON_OBJECT | RULE_EMPTY_JSON_ARRAY | RULE_JSON_LITERAL_NULL | RULE_JSON_LITERAL_BOOLEAN | RULE_JSON_NUMBER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_14 = input.LA(1);

                        s = -1;
                        if ( (LA18_14=='\'') ) {s = 55;}

                        else if ( ((LA18_14>='\u0000' && LA18_14<='&')||(LA18_14>='(' && LA18_14<='\uFFFF')) ) {s = 56;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='p') ) {s = 1;}

                        else if ( (LA18_0=='{') ) {s = 2;}

                        else if ( (LA18_0=='-') ) {s = 3;}

                        else if ( (LA18_0=='}') ) {s = 4;}

                        else if ( (LA18_0=='c') ) {s = 5;}

                        else if ( (LA18_0==':') ) {s = 6;}

                        else if ( (LA18_0=='f') ) {s = 7;}

                        else if ( (LA18_0=='w') ) {s = 8;}

                        else if ( (LA18_0=='h') ) {s = 9;}

                        else if ( (LA18_0=='r') ) {s = 10;}

                        else if ( (LA18_0=='a') ) {s = 11;}

                        else if ( (LA18_0=='e') ) {s = 12;}

                        else if ( (LA18_0=='s') ) {s = 13;}

                        else if ( (LA18_0=='\'') ) {s = 14;}

                        else if ( (LA18_0==',') ) {s = 15;}

                        else if ( (LA18_0=='=') ) {s = 16;}

                        else if ( (LA18_0=='[') ) {s = 17;}

                        else if ( (LA18_0==']') ) {s = 18;}

                        else if ( (LA18_0=='m') ) {s = 19;}

                        else if ( (LA18_0=='P') ) {s = 20;}

                        else if ( (LA18_0=='G') ) {s = 21;}

                        else if ( (LA18_0=='D') ) {s = 22;}

                        else if ( (LA18_0=='b') ) {s = 23;}

                        else if ( (LA18_0=='n') ) {s = 24;}

                        else if ( (LA18_0=='t') ) {s = 25;}

                        else if ( (LA18_0=='0') ) {s = 26;}

                        else if ( (LA18_0=='1') ) {s = 27;}

                        else if ( (LA18_0=='^') ) {s = 28;}

                        else if ( ((LA18_0>='A' && LA18_0<='C')||(LA18_0>='E' && LA18_0<='F')||(LA18_0>='H' && LA18_0<='O')||(LA18_0>='Q' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='d'||LA18_0=='g'||(LA18_0>='i' && LA18_0<='l')||LA18_0=='o'||LA18_0=='q'||(LA18_0>='u' && LA18_0<='v')||(LA18_0>='x' && LA18_0<='z')) ) {s = 29;}

                        else if ( ((LA18_0>='2' && LA18_0<='9')) ) {s = 30;}

                        else if ( (LA18_0=='\"') ) {s = 31;}

                        else if ( (LA18_0=='/') ) {s = 32;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 33;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='+')||LA18_0=='.'||(LA18_0>=';' && LA18_0<='<')||(LA18_0>='>' && LA18_0<='@')||LA18_0=='\\'||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_31 = input.LA(1);

                        s = -1;
                        if ( ((LA18_31>='\u0000' && LA18_31<='\uFFFF')) ) {s = 56;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}