package nl.sison.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXplatformLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_XPLATFORM_HEADER_PARAMETER=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int RULE_JSON_LITERAL_NULL=11;
    public static final int RULE_RESTFUL_METHODS=5;
    public static final int RULE_INT=10;
    public static final int RULE_WS=14;

    // delegates
    // delegators

    public InternalXplatformLexer() {;} 
    public InternalXplatformLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXplatformLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:11:7: ( 'call' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:11:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:12:7: ( ':' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:13:7: ( 'from' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:13:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:14:7: ( 'with' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:14:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:15:7: ( 'headers' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:15:9: 'headers'
            {
            match("headers"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:16:7: ( 'request' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:16:9: 'request'
            {
            match("request"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:17:7: ( 'and' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:17:9: 'and'
            {
            match("and"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:18:7: ( 'response' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:18:9: 'response'
            {
            match("response"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:19:7: ( 'client' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:19:9: 'client'
            {
            match("client"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:20:7: ( 'expects' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:20:9: 'expects'
            {
            match("expects"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:21:7: ( 'server' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:21:9: 'server'
            {
            match("server"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:22:7: ( '{' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:22:9: '{'
            {
            match('{'); 

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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:23:7: ( '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:23:9: '}'
            {
            match('}'); 

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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:24:7: ( '\\'\\'\\'' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:24:9: '\\'\\'\\''
            {
            match("'''"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:25:7: ( ',' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:25:9: ','
            {
            match(','); 

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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:26:7: ( '=' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:26:9: '='
            {
            match('='); 

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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:27:7: ( 'boolean' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:27:9: 'boolean'
            {
            match("boolean"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:28:7: ( 'number' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:28:9: 'number'
            {
            match("number"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:29:7: ( 'string' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:29:9: 'string'
            {
            match("string"); 


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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:30:7: ( '[' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:30:9: '['
            {
            match('['); 

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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:31:7: ( ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:31:9: ']'
            {
            match(']'); 

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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:32:7: ( '.' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_XPLATFORM_HEADER_PARAMETER"
    public final void mRULE_XPLATFORM_HEADER_PARAMETER() throws RecognitionException {
        try {
            int _type = RULE_XPLATFORM_HEADER_PARAMETER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1156:33: ( '{' RULE_ID '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1156:35: '{' RULE_ID '}'
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
    // $ANTLR end "RULE_XPLATFORM_HEADER_PARAMETER"

    // $ANTLR start "RULE_RESTFUL_METHODS"
    public final void mRULE_RESTFUL_METHODS() throws RecognitionException {
        try {
            int _type = RULE_RESTFUL_METHODS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1158:22: ( ( 'PUT' | 'POST' | 'GET' | 'DELETE' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1158:24: ( 'PUT' | 'POST' | 'GET' | 'DELETE' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1158:24: ( 'PUT' | 'POST' | 'GET' | 'DELETE' )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1158:25: 'PUT'
                    {
                    match("PUT"); 


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1158:31: 'POST'
                    {
                    match("POST"); 


                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1158:38: 'GET'
                    {
                    match("GET"); 


                    }
                    break;
                case 4 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1158:44: 'DELETE'
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

    // $ANTLR start "RULE_JSON_LITERAL_NULL"
    public final void mRULE_JSON_LITERAL_NULL() throws RecognitionException {
        try {
            int _type = RULE_JSON_LITERAL_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1160:24: ( 'null' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1160:26: 'null'
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1162:27: ( ( 'true' | 'false' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1162:29: ( 'true' | 'false' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1162:29: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1162:30: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1162:37: 'false'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1164:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1164:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1164:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1164:11: '^'
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1164:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:
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
            	    break loop4;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1166:10: ( ( '0' .. '9' )+ )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1166:12: ( '0' .. '9' )+
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1166:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1166:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1168:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1170:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1170:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1170:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1170:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:41: ( '\\r' )? '\\n'
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:41: '\\r'
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1174:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1174:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1174:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1176:16: ( . )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1176:18: .
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
        // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_XPLATFORM_HEADER_PARAMETER | RULE_RESTFUL_METHODS | RULE_JSON_LITERAL_NULL | RULE_JSON_LITERAL_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=33;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:142: RULE_XPLATFORM_HEADER_PARAMETER
                {
                mRULE_XPLATFORM_HEADER_PARAMETER(); 

                }
                break;
            case 24 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:174: RULE_RESTFUL_METHODS
                {
                mRULE_RESTFUL_METHODS(); 

                }
                break;
            case 25 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:195: RULE_JSON_LITERAL_NULL
                {
                mRULE_JSON_LITERAL_NULL(); 

                }
                break;
            case 26 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:218: RULE_JSON_LITERAL_BOOLEAN
                {
                mRULE_JSON_LITERAL_BOOLEAN(); 

                }
                break;
            case 27 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:244: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:252: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:261: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:273: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:289: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:305: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1:313: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\41\1\uffff\7\41\1\54\1\uffff\1\36\2\uffff\2\41\3\uffff"+
        "\4\41\1\36\2\uffff\2\36\2\uffff\2\41\2\uffff\11\41\3\uffff\1\60"+
        "\3\uffff\2\41\3\uffff\5\41\4\uffff\10\41\1\136\3\41\1\uffff\3\41"+
        "\1\145\1\41\1\145\2\41\1\151\1\41\1\153\1\41\1\155\3\41\1\uffff"+
        "\5\41\1\166\1\uffff\1\145\1\41\1\170\1\uffff\1\41\1\uffff\1\170"+
        "\1\uffff\10\41\1\uffff\1\41\1\uffff\1\u0083\4\41\1\u0088\1\u0089"+
        "\1\41\1\u008b\1\145\1\uffff\1\u008c\1\u008d\1\41\1\u008f\2\uffff"+
        "\1\u0090\3\uffff\1\u0091\3\uffff";
    static final String DFA14_eofS =
        "\u0092\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\uffff\1\141\1\151\2\145\1\156\1\170\1\145\1\101\1\uffff"+
        "\1\0\2\uffff\1\157\1\165\3\uffff\1\117\2\105\1\162\1\101\2\uffff"+
        "\1\0\1\52\2\uffff\1\154\1\151\2\uffff\1\157\1\154\1\164\1\141\1"+
        "\161\1\144\1\160\2\162\3\uffff\1\47\3\uffff\1\157\1\154\3\uffff"+
        "\1\124\1\123\1\124\1\114\1\165\4\uffff\1\154\1\145\1\155\1\163\1"+
        "\150\1\144\1\165\1\160\1\60\1\145\1\166\1\151\1\uffff\1\154\1\142"+
        "\1\154\1\60\1\124\1\60\1\105\1\145\1\60\1\156\1\60\1\145\1\60\2"+
        "\145\1\157\1\uffff\1\143\1\145\1\156\2\145\1\60\1\uffff\1\60\1\124"+
        "\1\60\1\uffff\1\164\1\uffff\1\60\1\uffff\1\162\1\163\1\156\1\164"+
        "\1\162\1\147\1\141\1\162\1\uffff\1\105\1\uffff\1\60\1\163\1\164"+
        "\2\163\2\60\1\156\2\60\1\uffff\2\60\1\145\1\60\2\uffff\1\60\3\uffff"+
        "\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\154\1\uffff\1\162\1\151\2\145\1\156\1\170\1\164\1\172"+
        "\1\uffff\1\uffff\2\uffff\1\157\1\165\3\uffff\1\125\2\105\1\162\1"+
        "\172\2\uffff\1\uffff\1\57\2\uffff\1\154\1\151\2\uffff\1\157\1\154"+
        "\1\164\1\141\1\163\1\144\1\160\2\162\3\uffff\1\47\3\uffff\1\157"+
        "\1\155\3\uffff\1\124\1\123\1\124\1\114\1\165\4\uffff\1\154\1\145"+
        "\1\155\1\163\1\150\1\144\1\165\1\160\1\172\1\145\1\166\1\151\1\uffff"+
        "\1\154\1\142\1\154\1\172\1\124\1\172\1\105\1\145\1\172\1\156\1\172"+
        "\1\145\1\172\2\145\1\157\1\uffff\1\143\1\145\1\156\2\145\1\172\1"+
        "\uffff\1\172\1\124\1\172\1\uffff\1\164\1\uffff\1\172\1\uffff\1\162"+
        "\1\163\1\156\1\164\1\162\1\147\1\141\1\162\1\uffff\1\105\1\uffff"+
        "\1\172\1\163\1\164\2\163\2\172\1\156\2\172\1\uffff\2\172\1\145\1"+
        "\172\2\uffff\1\172\3\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\10\uffff\1\15\1\uffff\1\17\1\20\2\uffff\1\24\1\25\1"+
        "\26\5\uffff\1\33\1\34\2\uffff\1\40\1\41\2\uffff\1\33\1\2\11\uffff"+
        "\1\14\1\27\1\15\1\uffff\1\35\1\17\1\20\2\uffff\1\24\1\25\1\26\5"+
        "\uffff\1\34\1\36\1\37\1\40\14\uffff\1\16\20\uffff\1\7\6\uffff\1"+
        "\30\3\uffff\1\1\1\uffff\1\3\1\uffff\1\4\10\uffff\1\31\1\uffff\1"+
        "\32\12\uffff\1\11\4\uffff\1\13\1\23\1\uffff\1\22\1\5\1\6\1\uffff"+
        "\1\12\1\21\1\10";
    static final String DFA14_specialS =
        "\1\1\13\uffff\1\2\16\uffff\1\0\166\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\33\4\36\1\14\4\36\1"+
            "\15\1\36\1\23\1\34\12\32\1\2\2\36\1\16\3\36\3\31\1\26\2\31\1"+
            "\25\10\31\1\24\12\31\1\21\1\36\1\22\1\30\1\31\1\36\1\7\1\17"+
            "\1\1\1\31\1\10\1\3\1\31\1\5\5\31\1\20\3\31\1\6\1\11\1\27\2\31"+
            "\1\4\3\31\1\12\1\36\1\13\uff82\36",
            "\1\37\12\uffff\1\40",
            "",
            "\1\44\20\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\16\uffff\1\53",
            "\32\55\3\uffff\2\55\1\uffff\32\55",
            "",
            "\47\60\1\57\uffd8\60",
            "",
            "",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "\1\71\5\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\60",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107\1\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "\1\116",
            "\1\120\1\117",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\146",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\147",
            "\1\150",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\152",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\154",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\167",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\171",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_XPLATFORM_HEADER_PARAMETER | RULE_RESTFUL_METHODS | RULE_JSON_LITERAL_NULL | RULE_JSON_LITERAL_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 48;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='c') ) {s = 1;}

                        else if ( (LA14_0==':') ) {s = 2;}

                        else if ( (LA14_0=='f') ) {s = 3;}

                        else if ( (LA14_0=='w') ) {s = 4;}

                        else if ( (LA14_0=='h') ) {s = 5;}

                        else if ( (LA14_0=='r') ) {s = 6;}

                        else if ( (LA14_0=='a') ) {s = 7;}

                        else if ( (LA14_0=='e') ) {s = 8;}

                        else if ( (LA14_0=='s') ) {s = 9;}

                        else if ( (LA14_0=='{') ) {s = 10;}

                        else if ( (LA14_0=='}') ) {s = 11;}

                        else if ( (LA14_0=='\'') ) {s = 12;}

                        else if ( (LA14_0==',') ) {s = 13;}

                        else if ( (LA14_0=='=') ) {s = 14;}

                        else if ( (LA14_0=='b') ) {s = 15;}

                        else if ( (LA14_0=='n') ) {s = 16;}

                        else if ( (LA14_0=='[') ) {s = 17;}

                        else if ( (LA14_0==']') ) {s = 18;}

                        else if ( (LA14_0=='.') ) {s = 19;}

                        else if ( (LA14_0=='P') ) {s = 20;}

                        else if ( (LA14_0=='G') ) {s = 21;}

                        else if ( (LA14_0=='D') ) {s = 22;}

                        else if ( (LA14_0=='t') ) {s = 23;}

                        else if ( (LA14_0=='^') ) {s = 24;}

                        else if ( ((LA14_0>='A' && LA14_0<='C')||(LA14_0>='E' && LA14_0<='F')||(LA14_0>='H' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='d'||LA14_0=='g'||(LA14_0>='i' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='q')||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 25;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 26;}

                        else if ( (LA14_0=='\"') ) {s = 27;}

                        else if ( (LA14_0=='/') ) {s = 28;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 29;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='-'||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( (LA14_12=='\'') ) {s = 47;}

                        else if ( ((LA14_12>='\u0000' && LA14_12<='&')||(LA14_12>='(' && LA14_12<='\uFFFF')) ) {s = 48;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}