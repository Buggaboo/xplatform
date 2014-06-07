package nl.sison.dsl.mobgen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonGenLexer extends Lexer {
    public static final int RULE_EX_JSON_UTC=9;
    public static final int RULE_JSON_NULL=6;
    public static final int RULE_JSON_BOOLEAN=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_JSON_FLOAT=8;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalJsonGenLexer() {;} 
    public InternalJsonGenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJsonGenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:11:7: ( '{' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:11:9: '{'
            {
            match('{'); 

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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:12:7: ( ',' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:12:9: ','
            {
            match(','); 

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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:13:7: ( '}' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:13:9: '}'
            {
            match('}'); 

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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:14:7: ( '?' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:14:9: '?'
            {
            match('?'); 

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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:15:7: ( ':' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:15:9: ':'
            {
            match(':'); 

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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:16:7: ( '[' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:16:9: '['
            {
            match('['); 

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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:17:7: ( ']' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:17:9: ']'
            {
            match(']'); 

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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:18:7: ( 'enum' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:18:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_JSON_BOOLEAN"
    public final void mRULE_JSON_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_JSON_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:544:19: ( ( 'true' | 'false' | 'boolean' ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:544:21: ( 'true' | 'false' | 'boolean' )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:544:21: ( 'true' | 'false' | 'boolean' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:544:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:544:29: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:544:37: 'boolean'
                    {
                    match("boolean"); 


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
    // $ANTLR end "RULE_JSON_BOOLEAN"

    // $ANTLR start "RULE_JSON_NULL"
    public final void mRULE_JSON_NULL() throws RecognitionException {
        try {
            int _type = RULE_JSON_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:546:16: ( 'null' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:546:18: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JSON_NULL"

    // $ANTLR start "RULE_JSON_FLOAT"
    public final void mRULE_JSON_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_JSON_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:17: ( ( '-' )? RULE_INT '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )? )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:19: ( '-' )? RULE_INT '.' RULE_INT ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:19: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:19: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:46: ( ( 'E' | 'e' ) ( '-' )? RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E'||LA4_0=='e') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:47: ( 'E' | 'e' ) ( '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:57: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:548:57: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

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
    // $ANTLR end "RULE_JSON_FLOAT"

    // $ANTLR start "RULE_EX_JSON_UTC"
    public final void mRULE_EX_JSON_UTC() throws RecognitionException {
        try {
            int _type = RULE_EX_JSON_UTC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:550:18: ( 'UTC' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:550:20: 'UTC'
            {
            match("UTC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EX_JSON_UTC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:552:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:552:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:552:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:552:11: '^'
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

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:552:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:
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
            	    break loop6;
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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:554:10: ( ( '0' .. '9' )+ )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:554:12: ( '0' .. '9' )+
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:554:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:554:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:558:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:558:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:558:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:558:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:41: ( '\\r' )? '\\n'
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:560:41: '\\r'
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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:562:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:562:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:564:16: ( . )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:564:18: .
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
        // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_JSON_BOOLEAN | RULE_JSON_NULL | RULE_JSON_FLOAT | RULE_EX_JSON_UTC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=19;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:58: RULE_JSON_BOOLEAN
                {
                mRULE_JSON_BOOLEAN(); 

                }
                break;
            case 10 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:76: RULE_JSON_NULL
                {
                mRULE_JSON_NULL(); 

                }
                break;
            case 11 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:91: RULE_JSON_FLOAT
                {
                mRULE_JSON_FLOAT(); 

                }
                break;
            case 12 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:107: RULE_EX_JSON_UTC
                {
                mRULE_EX_JSON_UTC(); 

                }
                break;
            case 13 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:124: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:132: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:141: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:153: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:169: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:185: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:1:193: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\10\uffff\5\37\1\26\1\45\1\37\1\26\1\uffff\3\26\11\uffff\1\37\1"+
        "\uffff\4\37\2\uffff\1\45\1\37\4\uffff\5\37\1\67\1\70\1\71\2\37\1"+
        "\74\3\uffff\1\71\1\37\1\uffff\1\37\1\71";
    static final String DFA16_eofS =
        "\77\uffff";
    static final String DFA16_minS =
        "\1\0\7\uffff\1\156\1\162\1\141\1\157\1\165\1\60\1\56\1\124\1\101"+
        "\1\uffff\2\0\1\52\11\uffff\1\165\1\uffff\1\165\1\154\1\157\1\154"+
        "\2\uffff\1\56\1\103\4\uffff\1\155\1\145\1\163\2\154\3\60\2\145\1"+
        "\60\3\uffff\1\60\1\141\1\uffff\1\156\1\60";
    static final String DFA16_maxS =
        "\1\uffff\7\uffff\1\156\1\162\1\141\1\157\1\165\2\71\1\124\1\172"+
        "\1\uffff\2\uffff\1\57\11\uffff\1\165\1\uffff\1\165\1\154\1\157\1"+
        "\154\2\uffff\1\71\1\103\4\uffff\1\155\1\145\1\163\2\154\3\172\2"+
        "\145\1\172\3\uffff\1\172\1\141\1\uffff\1\156\1\172";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\11\uffff\1\15\3\uffff\1\22"+
        "\1\23\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\15\4\uffff\1\13\1\16"+
        "\2\uffff\1\17\1\20\1\21\1\22\13\uffff\1\14\1\10\1\11\2\uffff\1\12"+
        "\2\uffff";
    static final String DFA16_specialS =
        "\1\0\21\uffff\1\1\1\2\53\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\4\26\1"+
            "\2\1\15\1\26\1\24\12\16\1\5\4\26\1\4\1\26\24\21\1\17\5\21\1"+
            "\6\1\26\1\7\1\20\1\21\1\26\1\21\1\13\2\21\1\10\1\12\7\21\1\14"+
            "\5\21\1\11\6\21\1\1\1\26\1\3\uff82\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\12\44",
            "\1\44\1\uffff\12\46",
            "\1\47",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\0\50",
            "\0\50",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "\1\44\1\uffff\12\46",
            "\1\61",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\72",
            "\1\73",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\75",
            "",
            "\1\76",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_JSON_BOOLEAN | RULE_JSON_NULL | RULE_JSON_FLOAT | RULE_EX_JSON_UTC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='{') ) {s = 1;}

                        else if ( (LA16_0==',') ) {s = 2;}

                        else if ( (LA16_0=='}') ) {s = 3;}

                        else if ( (LA16_0=='?') ) {s = 4;}

                        else if ( (LA16_0==':') ) {s = 5;}

                        else if ( (LA16_0=='[') ) {s = 6;}

                        else if ( (LA16_0==']') ) {s = 7;}

                        else if ( (LA16_0=='e') ) {s = 8;}

                        else if ( (LA16_0=='t') ) {s = 9;}

                        else if ( (LA16_0=='f') ) {s = 10;}

                        else if ( (LA16_0=='b') ) {s = 11;}

                        else if ( (LA16_0=='n') ) {s = 12;}

                        else if ( (LA16_0=='-') ) {s = 13;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 14;}

                        else if ( (LA16_0=='U') ) {s = 15;}

                        else if ( (LA16_0=='^') ) {s = 16;}

                        else if ( ((LA16_0>='A' && LA16_0<='T')||(LA16_0>='V' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||(LA16_0>='c' && LA16_0<='d')||(LA16_0>='g' && LA16_0<='m')||(LA16_0>='o' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='z')) ) {s = 17;}

                        else if ( (LA16_0=='\"') ) {s = 18;}

                        else if ( (LA16_0=='\'') ) {s = 19;}

                        else if ( (LA16_0=='/') ) {s = 20;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 21;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='+')||LA16_0=='.'||(LA16_0>=';' && LA16_0<='>')||LA16_0=='@'||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_18 = input.LA(1);

                        s = -1;
                        if ( ((LA16_18>='\u0000' && LA16_18<='\uFFFF')) ) {s = 40;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_19 = input.LA(1);

                        s = -1;
                        if ( ((LA16_19>='\u0000' && LA16_19<='\uFFFF')) ) {s = 40;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}