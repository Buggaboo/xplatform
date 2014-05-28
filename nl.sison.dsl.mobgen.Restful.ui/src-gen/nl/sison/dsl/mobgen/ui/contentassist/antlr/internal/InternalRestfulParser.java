package nl.sison.dsl.mobgen.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import nl.sison.dsl.mobgen.services.RestfulGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestfulParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_NULL", "RULE_JSON_NUMBER_FLOAT", "RULE_INT", "RULE_URL_PREFIX", "RULE_URL_PATH", "RULE_URL_QUERY", "RULE_URL_QUERY_SUFFIX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PUT'", "'POST'", "'GET'", "'DELETE'", "'boolean'", "'number'", "'string'", "'true'", "'false'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "'{'", "','", "'}'", "'='", "'['", "']'", "'enum'", "'map'"
    };
    public static final int RULE_JSON_LITERAL_NULL=8;
    public static final int T__19=19;
    public static final int RULE_EMPTY_JSON_ARRAY=7;
    public static final int RULE_ID=5;
    public static final int RULE_URL_QUERY=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_EMPTY_JSON_OBJECT=6;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_URL_QUERY_SUFFIX=14;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_URL_PATH=12;
    public static final int RULE_WS=17;
    public static final int RULE_JSON_NUMBER_FLOAT=9;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_URL_PREFIX=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRestfulParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestfulParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestfulParser.tokenNames; }
    public String getGrammarFileName() { return "../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g"; }


     
     	private RestfulGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RestfulGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMobgen"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:60:1: entryRuleMobgen : ruleMobgen EOF ;
    public final void entryRuleMobgen() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:61:1: ( ruleMobgen EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:62:1: ruleMobgen EOF
            {
             before(grammarAccess.getMobgenRule()); 
            pushFollow(FOLLOW_ruleMobgen_in_entryRuleMobgen61);
            ruleMobgen();

            state._fsp--;

             after(grammarAccess.getMobgenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgen68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobgen"


    // $ANTLR start "ruleMobgen"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:69:1: ruleMobgen : ( ( rule__Mobgen__Alternatives )* ) ;
    public final void ruleMobgen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:73:2: ( ( ( rule__Mobgen__Alternatives )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:74:1: ( ( rule__Mobgen__Alternatives )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:74:1: ( ( rule__Mobgen__Alternatives )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:75:1: ( rule__Mobgen__Alternatives )*
            {
             before(grammarAccess.getMobgenAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:76:1: ( rule__Mobgen__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28||(LA1_0>=46 && LA1_0<=47)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:76:2: rule__Mobgen__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Mobgen__Alternatives_in_ruleMobgen94);
            	    rule__Mobgen__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMobgenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobgen"


    // $ANTLR start "entryRuleMobgenCallDefinition"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:88:1: entryRuleMobgenCallDefinition : ruleMobgenCallDefinition EOF ;
    public final void entryRuleMobgenCallDefinition() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:89:1: ( ruleMobgenCallDefinition EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:90:1: ruleMobgenCallDefinition EOF
            {
             before(grammarAccess.getMobgenCallDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition122);
            ruleMobgenCallDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenCallDefinition129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobgenCallDefinition"


    // $ANTLR start "ruleMobgenCallDefinition"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:97:1: ruleMobgenCallDefinition : ( ( rule__MobgenCallDefinition__Group__0 ) ) ;
    public final void ruleMobgenCallDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:101:2: ( ( ( rule__MobgenCallDefinition__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:102:1: ( ( rule__MobgenCallDefinition__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:102:1: ( ( rule__MobgenCallDefinition__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:103:1: ( rule__MobgenCallDefinition__Group__0 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:104:1: ( rule__MobgenCallDefinition__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:104:2: rule__MobgenCallDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__0_in_ruleMobgenCallDefinition155);
            rule__MobgenCallDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobgenCallDefinition"


    // $ANTLR start "entryRuleMobgenHeader"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:116:1: entryRuleMobgenHeader : ruleMobgenHeader EOF ;
    public final void entryRuleMobgenHeader() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:117:1: ( ruleMobgenHeader EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:118:1: ruleMobgenHeader EOF
            {
             before(grammarAccess.getMobgenHeaderRule()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader182);
            ruleMobgenHeader();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeader189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobgenHeader"


    // $ANTLR start "ruleMobgenHeader"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:125:1: ruleMobgenHeader : ( ( rule__MobgenHeader__Group__0 ) ) ;
    public final void ruleMobgenHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:129:2: ( ( ( rule__MobgenHeader__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:130:1: ( ( rule__MobgenHeader__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:130:1: ( ( rule__MobgenHeader__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:131:1: ( rule__MobgenHeader__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:132:1: ( rule__MobgenHeader__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:132:2: rule__MobgenHeader__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0_in_ruleMobgenHeader215);
            rule__MobgenHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobgenHeader"


    // $ANTLR start "entryRuleMobgenHeaderKeyValuePair"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:144:1: entryRuleMobgenHeaderKeyValuePair : ruleMobgenHeaderKeyValuePair EOF ;
    public final void entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:145:1: ( ruleMobgenHeaderKeyValuePair EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:146:1: ruleMobgenHeaderKeyValuePair EOF
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair242);
            ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobgenHeaderKeyValuePair"


    // $ANTLR start "ruleMobgenHeaderKeyValuePair"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:153:1: ruleMobgenHeaderKeyValuePair : ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) ;
    public final void ruleMobgenHeaderKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:157:2: ( ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:158:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:158:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:159:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:160:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:160:2: rule__MobgenHeaderKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0_in_ruleMobgenHeaderKeyValuePair275);
            rule__MobgenHeaderKeyValuePair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobgenHeaderKeyValuePair"


    // $ANTLR start "entryRuleMobgenHeaderParameter"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:172:1: entryRuleMobgenHeaderParameter : ruleMobgenHeaderParameter EOF ;
    public final void entryRuleMobgenHeaderParameter() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:173:1: ( ruleMobgenHeaderParameter EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:174:1: ruleMobgenHeaderParameter EOF
            {
             before(grammarAccess.getMobgenHeaderParameterRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter302);
            ruleMobgenHeaderParameter();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderParameter309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobgenHeaderParameter"


    // $ANTLR start "ruleMobgenHeaderParameter"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:181:1: ruleMobgenHeaderParameter : ( ( rule__MobgenHeaderParameter__Group__0 ) ) ;
    public final void ruleMobgenHeaderParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:185:2: ( ( ( rule__MobgenHeaderParameter__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:186:1: ( ( rule__MobgenHeaderParameter__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:186:1: ( ( rule__MobgenHeaderParameter__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:187:1: ( rule__MobgenHeaderParameter__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:188:1: ( rule__MobgenHeaderParameter__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:188:2: rule__MobgenHeaderParameter__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__0_in_ruleMobgenHeaderParameter335);
            rule__MobgenHeaderParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobgenHeaderParameter"


    // $ANTLR start "entryRuleMobgenJson"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:200:1: entryRuleMobgenJson : ruleMobgenJson EOF ;
    public final void entryRuleMobgenJson() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:201:1: ( ruleMobgenJson EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:202:1: ruleMobgenJson EOF
            {
             before(grammarAccess.getMobgenJsonRule()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson362);
            ruleMobgenJson();

            state._fsp--;

             after(grammarAccess.getMobgenJsonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenJson369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobgenJson"


    // $ANTLR start "ruleMobgenJson"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:209:1: ruleMobgenJson : ( ( rule__MobgenJson__Group__0 ) ) ;
    public final void ruleMobgenJson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:213:2: ( ( ( rule__MobgenJson__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:214:1: ( ( rule__MobgenJson__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:214:1: ( ( rule__MobgenJson__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:215:1: ( rule__MobgenJson__Group__0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:216:1: ( rule__MobgenJson__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:216:2: rule__MobgenJson__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__0_in_ruleMobgenJson395);
            rule__MobgenJson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobgenJson"


    // $ANTLR start "entryRuleJsonObjectValue"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:228:1: entryRuleJsonObjectValue : ruleJsonObjectValue EOF ;
    public final void entryRuleJsonObjectValue() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:229:1: ( ruleJsonObjectValue EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:230:1: ruleJsonObjectValue EOF
            {
             before(grammarAccess.getJsonObjectValueRule()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue422);
            ruleJsonObjectValue();

            state._fsp--;

             after(grammarAccess.getJsonObjectValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObjectValue429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonObjectValue"


    // $ANTLR start "ruleJsonObjectValue"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:237:1: ruleJsonObjectValue : ( ( rule__JsonObjectValue__Alternatives ) ) ;
    public final void ruleJsonObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:241:2: ( ( ( rule__JsonObjectValue__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:242:1: ( ( rule__JsonObjectValue__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:242:1: ( ( rule__JsonObjectValue__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:243:1: ( rule__JsonObjectValue__Alternatives )
            {
             before(grammarAccess.getJsonObjectValueAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:244:1: ( rule__JsonObjectValue__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:244:2: rule__JsonObjectValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonObjectValue__Alternatives_in_ruleJsonObjectValue455);
            rule__JsonObjectValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonObjectValue"


    // $ANTLR start "entryRuleJsonCompositeValue"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:256:1: entryRuleJsonCompositeValue : ruleJsonCompositeValue EOF ;
    public final void entryRuleJsonCompositeValue() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:257:1: ( ruleJsonCompositeValue EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:258:1: ruleJsonCompositeValue EOF
            {
             before(grammarAccess.getJsonCompositeValueRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue482);
            ruleJsonCompositeValue();

            state._fsp--;

             after(grammarAccess.getJsonCompositeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeValue489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonCompositeValue"


    // $ANTLR start "ruleJsonCompositeValue"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:265:1: ruleJsonCompositeValue : ( ( rule__JsonCompositeValue__Alternatives ) ) ;
    public final void ruleJsonCompositeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:269:2: ( ( ( rule__JsonCompositeValue__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:270:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:270:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:271:1: ( rule__JsonCompositeValue__Alternatives )
            {
             before(grammarAccess.getJsonCompositeValueAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:272:1: ( rule__JsonCompositeValue__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:272:2: rule__JsonCompositeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonCompositeValue__Alternatives_in_ruleJsonCompositeValue515);
            rule__JsonCompositeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonCompositeValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonCompositeValue"


    // $ANTLR start "entryRuleJsonLiteralValue"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:284:1: entryRuleJsonLiteralValue : ruleJsonLiteralValue EOF ;
    public final void entryRuleJsonLiteralValue() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:285:1: ( ruleJsonLiteralValue EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:286:1: ruleJsonLiteralValue EOF
            {
             before(grammarAccess.getJsonLiteralValueRule()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue542);
            ruleJsonLiteralValue();

            state._fsp--;

             after(grammarAccess.getJsonLiteralValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonLiteralValue549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonLiteralValue"


    // $ANTLR start "ruleJsonLiteralValue"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:293:1: ruleJsonLiteralValue : ( ( rule__JsonLiteralValue__Alternatives ) ) ;
    public final void ruleJsonLiteralValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:297:2: ( ( ( rule__JsonLiteralValue__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:298:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:298:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:299:1: ( rule__JsonLiteralValue__Alternatives )
            {
             before(grammarAccess.getJsonLiteralValueAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:300:1: ( rule__JsonLiteralValue__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:300:2: rule__JsonLiteralValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonLiteralValue__Alternatives_in_ruleJsonLiteralValue575);
            rule__JsonLiteralValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonLiteralValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonLiteralValue"


    // $ANTLR start "entryRuleJsonObject"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:312:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:313:1: ( ruleJsonObject EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:314:1: ruleJsonObject EOF
            {
             before(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject602);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonObject"


    // $ANTLR start "ruleJsonObject"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:321:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:325:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:326:1: ( ( rule__JsonObject__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:326:1: ( ( rule__JsonObject__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:327:1: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:328:1: ( rule__JsonObject__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:328:2: rule__JsonObject__Group__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject635);
            rule__JsonObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonObject"


    // $ANTLR start "entryRuleJsonKeyValuePair"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:340:1: entryRuleJsonKeyValuePair : ruleJsonKeyValuePair EOF ;
    public final void entryRuleJsonKeyValuePair() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:341:1: ( ruleJsonKeyValuePair EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:342:1: ruleJsonKeyValuePair EOF
            {
             before(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair662);
            ruleJsonKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonKeyValuePair"


    // $ANTLR start "ruleJsonKeyValuePair"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:349:1: ruleJsonKeyValuePair : ( ( rule__JsonKeyValuePair__Group__0 ) ) ;
    public final void ruleJsonKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:353:2: ( ( ( rule__JsonKeyValuePair__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:354:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:354:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:355:1: ( rule__JsonKeyValuePair__Group__0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:356:1: ( rule__JsonKeyValuePair__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:356:2: rule__JsonKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair695);
            rule__JsonKeyValuePair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonKeyValuePairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonKeyValuePair"


    // $ANTLR start "entryRuleJsonArray"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:368:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:369:1: ( ruleJsonArray EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:370:1: ruleJsonArray EOF
            {
             before(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray722);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonArray"


    // $ANTLR start "ruleJsonArray"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:377:1: ruleJsonArray : ( ( rule__JsonArray__Group__0 ) ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:381:2: ( ( ( rule__JsonArray__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:382:1: ( ( rule__JsonArray__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:382:1: ( ( rule__JsonArray__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:383:1: ( rule__JsonArray__Group__0 )
            {
             before(grammarAccess.getJsonArrayAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:384:1: ( rule__JsonArray__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:384:2: rule__JsonArray__Group__0
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0_in_ruleJsonArray755);
            rule__JsonArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleJsonEnumType"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:396:1: entryRuleJsonEnumType : ruleJsonEnumType EOF ;
    public final void entryRuleJsonEnumType() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:397:1: ( ruleJsonEnumType EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:398:1: ruleJsonEnumType EOF
            {
             before(grammarAccess.getJsonEnumTypeRule()); 
            pushFollow(FOLLOW_ruleJsonEnumType_in_entryRuleJsonEnumType782);
            ruleJsonEnumType();

            state._fsp--;

             after(grammarAccess.getJsonEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonEnumType789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonEnumType"


    // $ANTLR start "ruleJsonEnumType"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:405:1: ruleJsonEnumType : ( ( rule__JsonEnumType__Group__0 ) ) ;
    public final void ruleJsonEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:409:2: ( ( ( rule__JsonEnumType__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:410:1: ( ( rule__JsonEnumType__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:410:1: ( ( rule__JsonEnumType__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:411:1: ( rule__JsonEnumType__Group__0 )
            {
             before(grammarAccess.getJsonEnumTypeAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:412:1: ( rule__JsonEnumType__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:412:2: rule__JsonEnumType__Group__0
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group__0_in_ruleJsonEnumType815);
            rule__JsonEnumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonEnumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonEnumType"


    // $ANTLR start "entryRuleMobgenResourceDefinition"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:424:1: entryRuleMobgenResourceDefinition : ruleMobgenResourceDefinition EOF ;
    public final void entryRuleMobgenResourceDefinition() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:425:1: ( ruleMobgenResourceDefinition EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:426:1: ruleMobgenResourceDefinition EOF
            {
             before(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition842);
            ruleMobgenResourceDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenResourceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobgenResourceDefinition"


    // $ANTLR start "ruleMobgenResourceDefinition"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:433:1: ruleMobgenResourceDefinition : ( ( rule__MobgenResourceDefinition__Alternatives ) ) ;
    public final void ruleMobgenResourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:437:2: ( ( ( rule__MobgenResourceDefinition__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:438:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:438:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:439:1: ( rule__MobgenResourceDefinition__Alternatives )
            {
             before(grammarAccess.getMobgenResourceDefinitionAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:440:1: ( rule__MobgenResourceDefinition__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:440:2: rule__MobgenResourceDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition875);
            rule__MobgenResourceDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobgenResourceDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobgenResourceDefinition"


    // $ANTLR start "entryRuleEnumInstance"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:452:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:453:1: ( ruleEnumInstance EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:454:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance902);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumInstance"


    // $ANTLR start "ruleEnumInstance"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:461:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:465:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:466:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:466:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:467:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:468:1: ( rule__EnumInstance__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:468:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance935);
            rule__EnumInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumInstance"


    // $ANTLR start "entryRuleMapInstance"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:480:1: entryRuleMapInstance : ruleMapInstance EOF ;
    public final void entryRuleMapInstance() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:481:1: ( ruleMapInstance EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:482:1: ruleMapInstance EOF
            {
             before(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance962);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMapInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapInstance"


    // $ANTLR start "ruleMapInstance"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:489:1: ruleMapInstance : ( ( rule__MapInstance__Group__0 ) ) ;
    public final void ruleMapInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:493:2: ( ( ( rule__MapInstance__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:494:1: ( ( rule__MapInstance__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:494:1: ( ( rule__MapInstance__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:495:1: ( rule__MapInstance__Group__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:496:1: ( rule__MapInstance__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:496:2: rule__MapInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance995);
            rule__MapInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapInstance"


    // $ANTLR start "entryRuleStringList"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:508:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:509:1: ( ruleStringList EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:510:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList1022);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:517:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:521:2: ( ( ( rule__StringList__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:522:1: ( ( rule__StringList__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:522:1: ( ( rule__StringList__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:523:1: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:524:1: ( rule__StringList__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:524:2: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_rule__StringList__Group__0_in_ruleStringList1055);
            rule__StringList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleNestedType"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:536:1: entryRuleNestedType : ruleNestedType EOF ;
    public final void entryRuleNestedType() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:537:1: ( ruleNestedType EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:538:1: ruleNestedType EOF
            {
             before(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType1082);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getNestedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedType"


    // $ANTLR start "ruleNestedType"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:545:1: ruleNestedType : ( ( rule__NestedType__Alternatives ) ) ;
    public final void ruleNestedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:549:2: ( ( ( rule__NestedType__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:550:1: ( ( rule__NestedType__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:550:1: ( ( rule__NestedType__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:551:1: ( rule__NestedType__Alternatives )
            {
             before(grammarAccess.getNestedTypeAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:552:1: ( rule__NestedType__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:552:2: rule__NestedType__Alternatives
            {
            pushFollow(FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1115);
            rule__NestedType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNestedTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedType"


    // $ANTLR start "entryRuleURI"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:564:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:565:1: ( ruleURI EOF )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:566:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI1142);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:573:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:577:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:578:1: ( ( rule__URI__Group__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:578:1: ( ( rule__URI__Group__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:579:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:580:1: ( rule__URI__Group__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:580:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI1175);
            rule__URI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURI"


    // $ANTLR start "ruleRestfulMethods"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:593:1: ruleRestfulMethods : ( ( rule__RestfulMethods__Alternatives ) ) ;
    public final void ruleRestfulMethods() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:597:1: ( ( ( rule__RestfulMethods__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:598:1: ( ( rule__RestfulMethods__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:598:1: ( ( rule__RestfulMethods__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:599:1: ( rule__RestfulMethods__Alternatives )
            {
             before(grammarAccess.getRestfulMethodsAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:600:1: ( rule__RestfulMethods__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:600:2: rule__RestfulMethods__Alternatives
            {
            pushFollow(FOLLOW_rule__RestfulMethods__Alternatives_in_ruleRestfulMethods1212);
            rule__RestfulMethods__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestfulMethodsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestfulMethods"


    // $ANTLR start "ruleJsonMetaScalarType"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:612:1: ruleJsonMetaScalarType : ( ( rule__JsonMetaScalarType__Alternatives ) ) ;
    public final void ruleJsonMetaScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:616:1: ( ( ( rule__JsonMetaScalarType__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:617:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:617:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:618:1: ( rule__JsonMetaScalarType__Alternatives )
            {
             before(grammarAccess.getJsonMetaScalarTypeAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:619:1: ( rule__JsonMetaScalarType__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:619:2: rule__JsonMetaScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType1248);
            rule__JsonMetaScalarType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonMetaScalarTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonMetaScalarType"


    // $ANTLR start "ruleJsonLiteralBoolean"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:631:1: ruleJsonLiteralBoolean : ( ( rule__JsonLiteralBoolean__Alternatives ) ) ;
    public final void ruleJsonLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:635:1: ( ( ( rule__JsonLiteralBoolean__Alternatives ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:636:1: ( ( rule__JsonLiteralBoolean__Alternatives ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:636:1: ( ( rule__JsonLiteralBoolean__Alternatives ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:637:1: ( rule__JsonLiteralBoolean__Alternatives )
            {
             before(grammarAccess.getJsonLiteralBooleanAccess().getAlternatives()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:638:1: ( rule__JsonLiteralBoolean__Alternatives )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:638:2: rule__JsonLiteralBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonLiteralBoolean__Alternatives_in_ruleJsonLiteralBoolean1284);
            rule__JsonLiteralBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonLiteralBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonLiteralBoolean"


    // $ANTLR start "rule__Mobgen__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:649:1: rule__Mobgen__Alternatives : ( ( ( rule__Mobgen__ResourcesAssignment_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1 ) ) );
    public final void rule__Mobgen__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:653:1: ( ( ( rule__Mobgen__ResourcesAssignment_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=46 && LA2_0<=47)) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:654:1: ( ( rule__Mobgen__ResourcesAssignment_0 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:654:1: ( ( rule__Mobgen__ResourcesAssignment_0 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:655:1: ( rule__Mobgen__ResourcesAssignment_0 )
                    {
                     before(grammarAccess.getMobgenAccess().getResourcesAssignment_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:656:1: ( rule__Mobgen__ResourcesAssignment_0 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:656:2: rule__Mobgen__ResourcesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Mobgen__ResourcesAssignment_0_in_rule__Mobgen__Alternatives1319);
                    rule__Mobgen__ResourcesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenAccess().getResourcesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:660:6: ( ( rule__Mobgen__CallsAssignment_1 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:660:6: ( ( rule__Mobgen__CallsAssignment_1 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:661:1: ( rule__Mobgen__CallsAssignment_1 )
                    {
                     before(grammarAccess.getMobgenAccess().getCallsAssignment_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:662:1: ( rule__Mobgen__CallsAssignment_1 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:662:2: rule__Mobgen__CallsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Mobgen__CallsAssignment_1_in_rule__Mobgen__Alternatives1337);
                    rule__Mobgen__CallsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenAccess().getCallsAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__Alternatives"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Alternatives_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:671:1: rule__MobgenHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) ) );
    public final void rule__MobgenHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:675:1: ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:676:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:676:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:677:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:678:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:678:2: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21370);
                    rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:682:6: ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:682:6: ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:683:1: ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterAssignment_2_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:684:1: ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:684:2: rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21388);
                    rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__Alternatives_2"


    // $ANTLR start "rule__JsonObjectValue__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:693:1: rule__JsonObjectValue__Alternatives : ( ( ( rule__JsonObjectValue__ScalarAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) );
    public final void rule__JsonObjectValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:697:1: ( ( ( rule__JsonObjectValue__ScalarAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||(LA4_0>=RULE_EMPTY_JSON_OBJECT && LA4_0<=RULE_INT)||(LA4_0>=23 && LA4_0<=27)||LA4_0==46) ) {
                alt4=1;
            }
            else if ( (LA4_0==40||LA4_0==44) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:698:1: ( ( rule__JsonObjectValue__ScalarAssignment_0 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:698:1: ( ( rule__JsonObjectValue__ScalarAssignment_0 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:699:1: ( rule__JsonObjectValue__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getScalarAssignment_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:700:1: ( rule__JsonObjectValue__ScalarAssignment_0 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:700:2: rule__JsonObjectValue__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__ScalarAssignment_0_in_rule__JsonObjectValue__Alternatives1421);
                    rule__JsonObjectValue__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonObjectValueAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:704:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:704:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:705:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getCompositeAssignment_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:706:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:706:2: rule__JsonObjectValue__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1439);
                    rule__JsonObjectValue__CompositeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonObjectValueAccess().getCompositeAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObjectValue__Alternatives"


    // $ANTLR start "rule__JsonCompositeValue__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:715:1: rule__JsonCompositeValue__Alternatives : ( ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) ) | ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) ) );
    public final void rule__JsonCompositeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:719:1: ( ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) ) | ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==40) ) {
                alt5=1;
            }
            else if ( (LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:720:1: ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:720:1: ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:721:1: ( rule__JsonCompositeValue__ObjectValueAssignment_0 )
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getObjectValueAssignment_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:722:1: ( rule__JsonCompositeValue__ObjectValueAssignment_0 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:722:2: rule__JsonCompositeValue__ObjectValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonCompositeValue__ObjectValueAssignment_0_in_rule__JsonCompositeValue__Alternatives1472);
                    rule__JsonCompositeValue__ObjectValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonCompositeValueAccess().getObjectValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:726:6: ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:726:6: ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:727:1: ( rule__JsonCompositeValue__ArrayValueAssignment_1 )
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getArrayValueAssignment_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:728:1: ( rule__JsonCompositeValue__ArrayValueAssignment_1 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:728:2: rule__JsonCompositeValue__ArrayValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonCompositeValue__ArrayValueAssignment_1_in_rule__JsonCompositeValue__Alternatives1490);
                    rule__JsonCompositeValue__ArrayValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonCompositeValueAccess().getArrayValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCompositeValue__Alternatives"


    // $ANTLR start "rule__JsonLiteralValue__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:737:1: rule__JsonLiteralValue__Alternatives : ( ( ( rule__JsonLiteralValue__LiteralStringAssignment_0 ) ) | ( ( rule__JsonLiteralValue__EmptyObjectAssignment_1 ) ) | ( ( rule__JsonLiteralValue__EmptyArrayAssignment_2 ) ) | ( ( rule__JsonLiteralValue__LiteralNullAssignment_3 ) ) | ( ( rule__JsonLiteralValue__NumberFloatAssignment_4 ) ) | ( ( rule__JsonLiteralValue__NumberIntegerAssignment_5 ) ) | ( ( rule__JsonLiteralValue__EnumTypeAssignment_6 ) ) | ( ( rule__JsonLiteralValue__BooleanValueAssignment_7 ) ) | ( ( rule__JsonLiteralValue__MetaScalarValueAssignment_8 ) ) );
    public final void rule__JsonLiteralValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:741:1: ( ( ( rule__JsonLiteralValue__LiteralStringAssignment_0 ) ) | ( ( rule__JsonLiteralValue__EmptyObjectAssignment_1 ) ) | ( ( rule__JsonLiteralValue__EmptyArrayAssignment_2 ) ) | ( ( rule__JsonLiteralValue__LiteralNullAssignment_3 ) ) | ( ( rule__JsonLiteralValue__NumberFloatAssignment_4 ) ) | ( ( rule__JsonLiteralValue__NumberIntegerAssignment_5 ) ) | ( ( rule__JsonLiteralValue__EnumTypeAssignment_6 ) ) | ( ( rule__JsonLiteralValue__BooleanValueAssignment_7 ) ) | ( ( rule__JsonLiteralValue__MetaScalarValueAssignment_8 ) ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_EMPTY_JSON_OBJECT:
                {
                alt6=2;
                }
                break;
            case RULE_EMPTY_JSON_ARRAY:
                {
                alt6=3;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt6=4;
                }
                break;
            case RULE_JSON_NUMBER_FLOAT:
                {
                alt6=5;
                }
                break;
            case RULE_INT:
                {
                alt6=6;
                }
                break;
            case 46:
                {
                alt6=7;
                }
                break;
            case 26:
            case 27:
                {
                alt6=8;
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:742:1: ( ( rule__JsonLiteralValue__LiteralStringAssignment_0 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:742:1: ( ( rule__JsonLiteralValue__LiteralStringAssignment_0 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:743:1: ( rule__JsonLiteralValue__LiteralStringAssignment_0 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getLiteralStringAssignment_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:744:1: ( rule__JsonLiteralValue__LiteralStringAssignment_0 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:744:2: rule__JsonLiteralValue__LiteralStringAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__LiteralStringAssignment_0_in_rule__JsonLiteralValue__Alternatives1523);
                    rule__JsonLiteralValue__LiteralStringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getLiteralStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:748:6: ( ( rule__JsonLiteralValue__EmptyObjectAssignment_1 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:748:6: ( ( rule__JsonLiteralValue__EmptyObjectAssignment_1 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:749:1: ( rule__JsonLiteralValue__EmptyObjectAssignment_1 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getEmptyObjectAssignment_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:750:1: ( rule__JsonLiteralValue__EmptyObjectAssignment_1 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:750:2: rule__JsonLiteralValue__EmptyObjectAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__EmptyObjectAssignment_1_in_rule__JsonLiteralValue__Alternatives1541);
                    rule__JsonLiteralValue__EmptyObjectAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getEmptyObjectAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:754:6: ( ( rule__JsonLiteralValue__EmptyArrayAssignment_2 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:754:6: ( ( rule__JsonLiteralValue__EmptyArrayAssignment_2 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:755:1: ( rule__JsonLiteralValue__EmptyArrayAssignment_2 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getEmptyArrayAssignment_2()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:756:1: ( rule__JsonLiteralValue__EmptyArrayAssignment_2 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:756:2: rule__JsonLiteralValue__EmptyArrayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__EmptyArrayAssignment_2_in_rule__JsonLiteralValue__Alternatives1559);
                    rule__JsonLiteralValue__EmptyArrayAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getEmptyArrayAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:760:6: ( ( rule__JsonLiteralValue__LiteralNullAssignment_3 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:760:6: ( ( rule__JsonLiteralValue__LiteralNullAssignment_3 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:761:1: ( rule__JsonLiteralValue__LiteralNullAssignment_3 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getLiteralNullAssignment_3()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:762:1: ( rule__JsonLiteralValue__LiteralNullAssignment_3 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:762:2: rule__JsonLiteralValue__LiteralNullAssignment_3
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__LiteralNullAssignment_3_in_rule__JsonLiteralValue__Alternatives1577);
                    rule__JsonLiteralValue__LiteralNullAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getLiteralNullAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:766:6: ( ( rule__JsonLiteralValue__NumberFloatAssignment_4 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:766:6: ( ( rule__JsonLiteralValue__NumberFloatAssignment_4 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:767:1: ( rule__JsonLiteralValue__NumberFloatAssignment_4 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getNumberFloatAssignment_4()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:768:1: ( rule__JsonLiteralValue__NumberFloatAssignment_4 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:768:2: rule__JsonLiteralValue__NumberFloatAssignment_4
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__NumberFloatAssignment_4_in_rule__JsonLiteralValue__Alternatives1595);
                    rule__JsonLiteralValue__NumberFloatAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getNumberFloatAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:772:6: ( ( rule__JsonLiteralValue__NumberIntegerAssignment_5 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:772:6: ( ( rule__JsonLiteralValue__NumberIntegerAssignment_5 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:773:1: ( rule__JsonLiteralValue__NumberIntegerAssignment_5 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getNumberIntegerAssignment_5()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:774:1: ( rule__JsonLiteralValue__NumberIntegerAssignment_5 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:774:2: rule__JsonLiteralValue__NumberIntegerAssignment_5
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__NumberIntegerAssignment_5_in_rule__JsonLiteralValue__Alternatives1613);
                    rule__JsonLiteralValue__NumberIntegerAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getNumberIntegerAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:778:6: ( ( rule__JsonLiteralValue__EnumTypeAssignment_6 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:778:6: ( ( rule__JsonLiteralValue__EnumTypeAssignment_6 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:779:1: ( rule__JsonLiteralValue__EnumTypeAssignment_6 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getEnumTypeAssignment_6()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:780:1: ( rule__JsonLiteralValue__EnumTypeAssignment_6 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:780:2: rule__JsonLiteralValue__EnumTypeAssignment_6
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__EnumTypeAssignment_6_in_rule__JsonLiteralValue__Alternatives1631);
                    rule__JsonLiteralValue__EnumTypeAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getEnumTypeAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:784:6: ( ( rule__JsonLiteralValue__BooleanValueAssignment_7 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:784:6: ( ( rule__JsonLiteralValue__BooleanValueAssignment_7 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:785:1: ( rule__JsonLiteralValue__BooleanValueAssignment_7 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getBooleanValueAssignment_7()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:786:1: ( rule__JsonLiteralValue__BooleanValueAssignment_7 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:786:2: rule__JsonLiteralValue__BooleanValueAssignment_7
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__BooleanValueAssignment_7_in_rule__JsonLiteralValue__Alternatives1649);
                    rule__JsonLiteralValue__BooleanValueAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getBooleanValueAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:790:6: ( ( rule__JsonLiteralValue__MetaScalarValueAssignment_8 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:790:6: ( ( rule__JsonLiteralValue__MetaScalarValueAssignment_8 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:791:1: ( rule__JsonLiteralValue__MetaScalarValueAssignment_8 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getMetaScalarValueAssignment_8()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:792:1: ( rule__JsonLiteralValue__MetaScalarValueAssignment_8 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:792:2: rule__JsonLiteralValue__MetaScalarValueAssignment_8
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__MetaScalarValueAssignment_8_in_rule__JsonLiteralValue__Alternatives1667);
                    rule__JsonLiteralValue__MetaScalarValueAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getMetaScalarValueAssignment_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__Alternatives"


    // $ANTLR start "rule__MobgenResourceDefinition__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:801:1: rule__MobgenResourceDefinition__Alternatives : ( ( ruleMapInstance ) | ( ruleEnumInstance ) );
    public final void rule__MobgenResourceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:805:1: ( ( ruleMapInstance ) | ( ruleEnumInstance ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==46) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:806:1: ( ruleMapInstance )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:806:1: ( ruleMapInstance )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:807:1: ruleMapInstance
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getMapInstanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__Alternatives1700);
                    ruleMapInstance();

                    state._fsp--;

                     after(grammarAccess.getMobgenResourceDefinitionAccess().getMapInstanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:812:6: ( ruleEnumInstance )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:812:6: ( ruleEnumInstance )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:813:1: ruleEnumInstance
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1717);
                    ruleEnumInstance();

                    state._fsp--;

                     after(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenResourceDefinition__Alternatives"


    // $ANTLR start "rule__NestedType__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:823:1: rule__NestedType__Alternatives : ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) );
    public final void rule__NestedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:827:1: ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:828:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:828:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:829:1: ( rule__NestedType__ListAssignment_0 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:830:1: ( rule__NestedType__ListAssignment_0 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:830:2: rule__NestedType__ListAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1749);
                    rule__NestedType__ListAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:834:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:834:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:835:1: ( rule__NestedType__StringAssignment_1 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getStringAssignment_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:836:1: ( rule__NestedType__StringAssignment_1 )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:836:2: rule__NestedType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1767);
                    rule__NestedType__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedTypeAccess().getStringAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedType__Alternatives"


    // $ANTLR start "rule__RestfulMethods__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:845:1: rule__RestfulMethods__Alternatives : ( ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__RestfulMethods__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:849:1: ( ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:850:1: ( ( 'PUT' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:850:1: ( ( 'PUT' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:851:1: ( 'PUT' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getPutEnumLiteralDeclaration_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:852:1: ( 'PUT' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:852:3: 'PUT'
                    {
                    match(input,19,FOLLOW_19_in_rule__RestfulMethods__Alternatives1801); 

                    }

                     after(grammarAccess.getRestfulMethodsAccess().getPutEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:857:6: ( ( 'POST' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:857:6: ( ( 'POST' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:858:1: ( 'POST' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getPostEnumLiteralDeclaration_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:859:1: ( 'POST' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:859:3: 'POST'
                    {
                    match(input,20,FOLLOW_20_in_rule__RestfulMethods__Alternatives1822); 

                    }

                     after(grammarAccess.getRestfulMethodsAccess().getPostEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:864:6: ( ( 'GET' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:864:6: ( ( 'GET' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:865:1: ( 'GET' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getGetEnumLiteralDeclaration_2()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:866:1: ( 'GET' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:866:3: 'GET'
                    {
                    match(input,21,FOLLOW_21_in_rule__RestfulMethods__Alternatives1843); 

                    }

                     after(grammarAccess.getRestfulMethodsAccess().getGetEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:871:6: ( ( 'DELETE' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:871:6: ( ( 'DELETE' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:872:1: ( 'DELETE' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:873:1: ( 'DELETE' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:873:3: 'DELETE'
                    {
                    match(input,22,FOLLOW_22_in_rule__RestfulMethods__Alternatives1864); 

                    }

                     after(grammarAccess.getRestfulMethodsAccess().getDeleteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestfulMethods__Alternatives"


    // $ANTLR start "rule__JsonMetaScalarType__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:883:1: rule__JsonMetaScalarType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'number' ) ) | ( ( 'string' ) ) );
    public final void rule__JsonMetaScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:887:1: ( ( ( 'boolean' ) ) | ( ( 'number' ) ) | ( ( 'string' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:888:1: ( ( 'boolean' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:888:1: ( ( 'boolean' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:889:1: ( 'boolean' )
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:890:1: ( 'boolean' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:890:3: 'boolean'
                    {
                    match(input,23,FOLLOW_23_in_rule__JsonMetaScalarType__Alternatives1900); 

                    }

                     after(grammarAccess.getJsonMetaScalarTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:895:6: ( ( 'number' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:895:6: ( ( 'number' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:896:1: ( 'number' )
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:897:1: ( 'number' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:897:3: 'number'
                    {
                    match(input,24,FOLLOW_24_in_rule__JsonMetaScalarType__Alternatives1921); 

                    }

                     after(grammarAccess.getJsonMetaScalarTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:902:6: ( ( 'string' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:902:6: ( ( 'string' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:903:1: ( 'string' )
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:904:1: ( 'string' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:904:3: 'string'
                    {
                    match(input,25,FOLLOW_25_in_rule__JsonMetaScalarType__Alternatives1942); 

                    }

                     after(grammarAccess.getJsonMetaScalarTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaScalarType__Alternatives"


    // $ANTLR start "rule__JsonLiteralBoolean__Alternatives"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:914:1: rule__JsonLiteralBoolean__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__JsonLiteralBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:918:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:919:1: ( ( 'true' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:919:1: ( ( 'true' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:920:1: ( 'true' )
                    {
                     before(grammarAccess.getJsonLiteralBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:921:1: ( 'true' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:921:3: 'true'
                    {
                    match(input,26,FOLLOW_26_in_rule__JsonLiteralBoolean__Alternatives1978); 

                    }

                     after(grammarAccess.getJsonLiteralBooleanAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:926:6: ( ( 'false' ) )
                    {
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:926:6: ( ( 'false' ) )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:927:1: ( 'false' )
                    {
                     before(grammarAccess.getJsonLiteralBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:928:1: ( 'false' )
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:928:3: 'false'
                    {
                    match(input,27,FOLLOW_27_in_rule__JsonLiteralBoolean__Alternatives1999); 

                    }

                     after(grammarAccess.getJsonLiteralBooleanAccess().getFalseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralBoolean__Alternatives"


    // $ANTLR start "rule__MobgenCallDefinition__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:940:1: rule__MobgenCallDefinition__Group__0 : rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 ;
    public final void rule__MobgenCallDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:944:1: ( rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:945:2: rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02032);
            rule__MobgenCallDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02035);
            rule__MobgenCallDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__0"


    // $ANTLR start "rule__MobgenCallDefinition__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:952:1: rule__MobgenCallDefinition__Group__0__Impl : ( 'call' ) ;
    public final void rule__MobgenCallDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:956:1: ( ( 'call' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:957:1: ( 'call' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:957:1: ( 'call' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:958:1: 'call'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__MobgenCallDefinition__Group__0__Impl2063); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__0__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:971:1: rule__MobgenCallDefinition__Group__1 : rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 ;
    public final void rule__MobgenCallDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:975:1: ( rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:976:2: rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12094);
            rule__MobgenCallDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12097);
            rule__MobgenCallDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__1"


    // $ANTLR start "rule__MobgenCallDefinition__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:983:1: rule__MobgenCallDefinition__Group__1__Impl : ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) ;
    public final void rule__MobgenCallDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:987:1: ( ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:988:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:988:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:989:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:990:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:990:2: rule__MobgenCallDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2124);
            rule__MobgenCallDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__1__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1000:1: rule__MobgenCallDefinition__Group__2 : rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 ;
    public final void rule__MobgenCallDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1004:1: ( rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1005:2: rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22154);
            rule__MobgenCallDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22157);
            rule__MobgenCallDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__2"


    // $ANTLR start "rule__MobgenCallDefinition__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1012:1: rule__MobgenCallDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__MobgenCallDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1016:1: ( ( ':' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1017:1: ( ':' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1017:1: ( ':' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1018:1: ':'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__MobgenCallDefinition__Group__2__Impl2185); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__2__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1031:1: rule__MobgenCallDefinition__Group__3 : rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 ;
    public final void rule__MobgenCallDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1035:1: ( rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1036:2: rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32216);
            rule__MobgenCallDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32219);
            rule__MobgenCallDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__3"


    // $ANTLR start "rule__MobgenCallDefinition__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1043:1: rule__MobgenCallDefinition__Group__3__Impl : ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) ;
    public final void rule__MobgenCallDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1047:1: ( ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1048:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1048:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1049:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodAssignment_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1050:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1050:2: rule__MobgenCallDefinition__MethodAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2246);
            rule__MobgenCallDefinition__MethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__3__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1060:1: rule__MobgenCallDefinition__Group__4 : rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 ;
    public final void rule__MobgenCallDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1064:1: ( rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1065:2: rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42276);
            rule__MobgenCallDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42279);
            rule__MobgenCallDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__4"


    // $ANTLR start "rule__MobgenCallDefinition__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1072:1: rule__MobgenCallDefinition__Group__4__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1076:1: ( ( 'from' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1077:1: ( 'from' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1077:1: ( 'from' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1078:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__MobgenCallDefinition__Group__4__Impl2307); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__4__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1091:1: rule__MobgenCallDefinition__Group__5 : rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 ;
    public final void rule__MobgenCallDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1095:1: ( rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1096:2: rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52338);
            rule__MobgenCallDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52341);
            rule__MobgenCallDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__5"


    // $ANTLR start "rule__MobgenCallDefinition__Group__5__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1103:1: rule__MobgenCallDefinition__Group__5__Impl : ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) ;
    public final void rule__MobgenCallDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1107:1: ( ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1108:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1108:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1109:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriAssignment_5()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1110:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1110:2: rule__MobgenCallDefinition__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2368);
            rule__MobgenCallDefinition__UriAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getUriAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__5__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__6"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1120:1: rule__MobgenCallDefinition__Group__6 : rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 ;
    public final void rule__MobgenCallDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1124:1: ( rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1125:2: rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62398);
            rule__MobgenCallDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62401);
            rule__MobgenCallDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__6"


    // $ANTLR start "rule__MobgenCallDefinition__Group__6__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1132:1: rule__MobgenCallDefinition__Group__6__Impl : ( ( rule__MobgenCallDefinition__Group_6__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1136:1: ( ( ( rule__MobgenCallDefinition__Group_6__0 )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1137:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1137:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1138:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1139:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1139:2: rule__MobgenCallDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2428);
                    rule__MobgenCallDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__6__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__7"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1149:1: rule__MobgenCallDefinition__Group__7 : rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 ;
    public final void rule__MobgenCallDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1153:1: ( rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1154:2: rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72459);
            rule__MobgenCallDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72462);
            rule__MobgenCallDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__7"


    // $ANTLR start "rule__MobgenCallDefinition__Group__7__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1161:1: rule__MobgenCallDefinition__Group__7__Impl : ( ( rule__MobgenCallDefinition__Group_7__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1165:1: ( ( ( rule__MobgenCallDefinition__Group_7__0 )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1166:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1166:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1167:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1168:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1168:2: rule__MobgenCallDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2489);
                    rule__MobgenCallDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__7__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__8"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1178:1: rule__MobgenCallDefinition__Group__8 : rule__MobgenCallDefinition__Group__8__Impl ;
    public final void rule__MobgenCallDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1182:1: ( rule__MobgenCallDefinition__Group__8__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1183:2: rule__MobgenCallDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82520);
            rule__MobgenCallDefinition__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__8"


    // $ANTLR start "rule__MobgenCallDefinition__Group__8__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1189:1: rule__MobgenCallDefinition__Group__8__Impl : ( ( rule__MobgenCallDefinition__Group_8__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1193:1: ( ( ( rule__MobgenCallDefinition__Group_8__0 )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1194:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1194:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1195:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_8()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1196:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1196:2: rule__MobgenCallDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2547);
                    rule__MobgenCallDefinition__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group__8__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1224:1: rule__MobgenCallDefinition__Group_6__0 : rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 ;
    public final void rule__MobgenCallDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1228:1: ( rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1229:2: rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02596);
            rule__MobgenCallDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02599);
            rule__MobgenCallDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__0"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1236:1: rule__MobgenCallDefinition__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__MobgenCallDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1240:1: ( ( 'with' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1241:1: ( 'with' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1241:1: ( 'with' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1242:1: 'with'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__MobgenCallDefinition__Group_6__0__Impl2627); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1255:1: rule__MobgenCallDefinition__Group_6__1 : rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 ;
    public final void rule__MobgenCallDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1259:1: ( rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1260:2: rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12658);
            rule__MobgenCallDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12661);
            rule__MobgenCallDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__1"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1267:1: rule__MobgenCallDefinition__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__MobgenCallDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1271:1: ( ( 'headers' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1272:1: ( 'headers' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1272:1: ( 'headers' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1273:1: 'headers'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1()); 
            match(input,32,FOLLOW_32_in_rule__MobgenCallDefinition__Group_6__1__Impl2689); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1286:1: rule__MobgenCallDefinition__Group_6__2 : rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 ;
    public final void rule__MobgenCallDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1290:1: ( rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1291:2: rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22720);
            rule__MobgenCallDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22723);
            rule__MobgenCallDefinition__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__2"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1298:1: rule__MobgenCallDefinition__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1302:1: ( ( 'from' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1303:1: ( 'from' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1303:1: ( 'from' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1304:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2()); 
            match(input,30,FOLLOW_30_in_rule__MobgenCallDefinition__Group_6__2__Impl2751); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1317:1: rule__MobgenCallDefinition__Group_6__3 : rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 ;
    public final void rule__MobgenCallDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1321:1: ( rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1322:2: rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32782);
            rule__MobgenCallDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32785);
            rule__MobgenCallDefinition__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__3"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1329:1: rule__MobgenCallDefinition__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__MobgenCallDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1333:1: ( ( 'request' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1334:1: ( 'request' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1334:1: ( 'request' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1335:1: 'request'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3()); 
            match(input,33,FOLLOW_33_in_rule__MobgenCallDefinition__Group_6__3__Impl2813); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1348:1: rule__MobgenCallDefinition__Group_6__4 : rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 ;
    public final void rule__MobgenCallDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1352:1: ( rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1353:2: rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42844);
            rule__MobgenCallDefinition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42847);
            rule__MobgenCallDefinition__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__4"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1360:1: rule__MobgenCallDefinition__Group_6__4__Impl : ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1364:1: ( ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1365:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1365:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1366:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1367:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1367:2: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2874);
            rule__MobgenCallDefinition__RequestHeadersAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1377:1: rule__MobgenCallDefinition__Group_6__5 : rule__MobgenCallDefinition__Group_6__5__Impl ;
    public final void rule__MobgenCallDefinition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1381:1: ( rule__MobgenCallDefinition__Group_6__5__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1382:2: rule__MobgenCallDefinition__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52904);
            rule__MobgenCallDefinition__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__5"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__5__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1388:1: rule__MobgenCallDefinition__Group_6__5__Impl : ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1392:1: ( ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1393:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1393:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1394:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6_5()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1395:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1395:2: rule__MobgenCallDefinition__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl2931);
                    rule__MobgenCallDefinition__Group_6_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6__5__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6_5__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1417:1: rule__MobgenCallDefinition__Group_6_5__0 : rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 ;
    public final void rule__MobgenCallDefinition__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1421:1: ( rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1422:2: rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__02974);
            rule__MobgenCallDefinition__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__02977);
            rule__MobgenCallDefinition__Group_6_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6_5__0"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6_5__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1429:1: rule__MobgenCallDefinition__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1433:1: ( ( 'and' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1434:1: ( 'and' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1434:1: ( 'and' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1435:1: 'and'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0()); 
            match(input,34,FOLLOW_34_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3005); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6_5__0__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6_5__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1448:1: rule__MobgenCallDefinition__Group_6_5__1 : rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 ;
    public final void rule__MobgenCallDefinition__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1452:1: ( rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1453:2: rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13036);
            rule__MobgenCallDefinition__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13039);
            rule__MobgenCallDefinition__Group_6_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6_5__1"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6_5__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1460:1: rule__MobgenCallDefinition__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1464:1: ( ( 'response' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1465:1: ( 'response' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1465:1: ( 'response' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1466:1: 'response'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1()); 
            match(input,35,FOLLOW_35_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3067); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6_5__1__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6_5__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1479:1: rule__MobgenCallDefinition__Group_6_5__2 : rule__MobgenCallDefinition__Group_6_5__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1483:1: ( rule__MobgenCallDefinition__Group_6_5__2__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1484:2: rule__MobgenCallDefinition__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23098);
            rule__MobgenCallDefinition__Group_6_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6_5__2"


    // $ANTLR start "rule__MobgenCallDefinition__Group_6_5__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1490:1: rule__MobgenCallDefinition__Group_6_5__2__Impl : ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1494:1: ( ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1495:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1495:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1496:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1497:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1497:2: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3125);
            rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_6_5__2__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1513:1: rule__MobgenCallDefinition__Group_7__0 : rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 ;
    public final void rule__MobgenCallDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1517:1: ( rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1518:2: rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03161);
            rule__MobgenCallDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03164);
            rule__MobgenCallDefinition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__0"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1525:1: rule__MobgenCallDefinition__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__MobgenCallDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1529:1: ( ( 'client' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1530:1: ( 'client' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1530:1: ( 'client' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1531:1: 'client'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__MobgenCallDefinition__Group_7__0__Impl3192); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1544:1: rule__MobgenCallDefinition__Group_7__1 : rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 ;
    public final void rule__MobgenCallDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1548:1: ( rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1549:2: rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13223);
            rule__MobgenCallDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13226);
            rule__MobgenCallDefinition__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__1"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1556:1: rule__MobgenCallDefinition__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1560:1: ( ( 'expects' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1561:1: ( 'expects' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1561:1: ( 'expects' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1562:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1()); 
            match(input,37,FOLLOW_37_in_rule__MobgenCallDefinition__Group_7__1__Impl3254); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1575:1: rule__MobgenCallDefinition__Group_7__2 : rule__MobgenCallDefinition__Group_7__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1579:1: ( rule__MobgenCallDefinition__Group_7__2__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1580:2: rule__MobgenCallDefinition__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23285);
            rule__MobgenCallDefinition__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__2"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1586:1: rule__MobgenCallDefinition__Group_7__2__Impl : ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1590:1: ( ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1591:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1591:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1592:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientAssignment_7_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1593:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1593:2: rule__MobgenCallDefinition__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3312);
            rule__MobgenCallDefinition__JsonToClientAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_8__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1609:1: rule__MobgenCallDefinition__Group_8__0 : rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 ;
    public final void rule__MobgenCallDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1613:1: ( rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1614:2: rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03348);
            rule__MobgenCallDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03351);
            rule__MobgenCallDefinition__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_8__0"


    // $ANTLR start "rule__MobgenCallDefinition__Group_8__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1621:1: rule__MobgenCallDefinition__Group_8__0__Impl : ( 'server' ) ;
    public final void rule__MobgenCallDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1625:1: ( ( 'server' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1626:1: ( 'server' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1626:1: ( 'server' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1627:1: 'server'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0()); 
            match(input,38,FOLLOW_38_in_rule__MobgenCallDefinition__Group_8__0__Impl3379); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_8__0__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_8__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1640:1: rule__MobgenCallDefinition__Group_8__1 : rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 ;
    public final void rule__MobgenCallDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1644:1: ( rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1645:2: rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13410);
            rule__MobgenCallDefinition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13413);
            rule__MobgenCallDefinition__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_8__1"


    // $ANTLR start "rule__MobgenCallDefinition__Group_8__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1652:1: rule__MobgenCallDefinition__Group_8__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1656:1: ( ( 'expects' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1657:1: ( 'expects' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1657:1: ( 'expects' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1658:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1()); 
            match(input,37,FOLLOW_37_in_rule__MobgenCallDefinition__Group_8__1__Impl3441); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_8__1__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_8__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1671:1: rule__MobgenCallDefinition__Group_8__2 : rule__MobgenCallDefinition__Group_8__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1675:1: ( rule__MobgenCallDefinition__Group_8__2__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1676:2: rule__MobgenCallDefinition__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23472);
            rule__MobgenCallDefinition__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_8__2"


    // $ANTLR start "rule__MobgenCallDefinition__Group_8__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1682:1: rule__MobgenCallDefinition__Group_8__2__Impl : ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1686:1: ( ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1687:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1687:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1688:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_8_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1689:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1689:2: rule__MobgenCallDefinition__JsonToServerAssignment_8_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3499);
            rule__MobgenCallDefinition__JsonToServerAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_8__2__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1705:1: rule__MobgenHeader__Group__0 : rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 ;
    public final void rule__MobgenHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1709:1: ( rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1710:2: rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__03535);
            rule__MobgenHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__03538);
            rule__MobgenHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__0"


    // $ANTLR start "rule__MobgenHeader__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1717:1: rule__MobgenHeader__Group__0__Impl : ( ( rule__MobgenHeader__NameAssignment_0 ) ) ;
    public final void rule__MobgenHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1721:1: ( ( ( rule__MobgenHeader__NameAssignment_0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1722:1: ( ( rule__MobgenHeader__NameAssignment_0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1722:1: ( ( rule__MobgenHeader__NameAssignment_0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1723:1: ( rule__MobgenHeader__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameAssignment_0()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1724:1: ( rule__MobgenHeader__NameAssignment_0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1724:2: rule__MobgenHeader__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl3565);
            rule__MobgenHeader__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__0__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1734:1: rule__MobgenHeader__Group__1 : rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 ;
    public final void rule__MobgenHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1738:1: ( rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1739:2: rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__13595);
            rule__MobgenHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__13598);
            rule__MobgenHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__1"


    // $ANTLR start "rule__MobgenHeader__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1746:1: rule__MobgenHeader__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1750:1: ( ( '\\'\\'\\'' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1751:1: ( '\\'\\'\\'' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1751:1: ( '\\'\\'\\'' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1752:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__MobgenHeader__Group__1__Impl3626); 
             after(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__1__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1765:1: rule__MobgenHeader__Group__2 : rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 ;
    public final void rule__MobgenHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1769:1: ( rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1770:2: rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__23657);
            rule__MobgenHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__23660);
            rule__MobgenHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__2"


    // $ANTLR start "rule__MobgenHeader__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1777:1: rule__MobgenHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__MobgenHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1781:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1782:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1782:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1783:1: '{'
            {
             before(grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__MobgenHeader__Group__2__Impl3688); 
             after(grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__2__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1796:1: rule__MobgenHeader__Group__3 : rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 ;
    public final void rule__MobgenHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1800:1: ( rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1801:2: rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__33719);
            rule__MobgenHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__33722);
            rule__MobgenHeader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__3"


    // $ANTLR start "rule__MobgenHeader__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1808:1: rule__MobgenHeader__Group__3__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) ;
    public final void rule__MobgenHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1812:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1813:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1813:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1814:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1815:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1815:2: rule__MobgenHeader__HeaderKeyValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl3749);
            rule__MobgenHeader__HeaderKeyValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__3__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1825:1: rule__MobgenHeader__Group__4 : rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 ;
    public final void rule__MobgenHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1829:1: ( rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1830:2: rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__43779);
            rule__MobgenHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__43782);
            rule__MobgenHeader__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__4"


    // $ANTLR start "rule__MobgenHeader__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1837:1: rule__MobgenHeader__Group__4__Impl : ( ( rule__MobgenHeader__Group_4__0 )* ) ;
    public final void rule__MobgenHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1841:1: ( ( ( rule__MobgenHeader__Group_4__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1842:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1842:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1843:1: ( rule__MobgenHeader__Group_4__0 )*
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup_4()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1844:1: ( rule__MobgenHeader__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_STRING) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1844:2: rule__MobgenHeader__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl3809);
            	    rule__MobgenHeader__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMobgenHeaderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__4__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1854:1: rule__MobgenHeader__Group__5 : rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 ;
    public final void rule__MobgenHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1858:1: ( rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1859:2: rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__53840);
            rule__MobgenHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__53843);
            rule__MobgenHeader__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__5"


    // $ANTLR start "rule__MobgenHeader__Group__5__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1866:1: rule__MobgenHeader__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MobgenHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1870:1: ( ( ( ',' )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1871:1: ( ( ',' )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1871:1: ( ( ',' )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1872:1: ( ',' )?
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1873:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1874:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__MobgenHeader__Group__5__Impl3872); 

                    }
                    break;

            }

             after(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__5__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__6"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1885:1: rule__MobgenHeader__Group__6 : rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 ;
    public final void rule__MobgenHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1889:1: ( rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1890:2: rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__63905);
            rule__MobgenHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__63908);
            rule__MobgenHeader__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__6"


    // $ANTLR start "rule__MobgenHeader__Group__6__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1897:1: rule__MobgenHeader__Group__6__Impl : ( '}' ) ;
    public final void rule__MobgenHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1901:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1902:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1902:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1903:1: '}'
            {
             before(grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__MobgenHeader__Group__6__Impl3936); 
             after(grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__6__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__7"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1916:1: rule__MobgenHeader__Group__7 : rule__MobgenHeader__Group__7__Impl ;
    public final void rule__MobgenHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1920:1: ( rule__MobgenHeader__Group__7__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1921:2: rule__MobgenHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__73967);
            rule__MobgenHeader__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__7"


    // $ANTLR start "rule__MobgenHeader__Group__7__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1927:1: rule__MobgenHeader__Group__7__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1931:1: ( ( '\\'\\'\\'' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1932:1: ( '\\'\\'\\'' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1932:1: ( '\\'\\'\\'' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1933:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__MobgenHeader__Group__7__Impl3995); 
             after(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group__7__Impl"


    // $ANTLR start "rule__MobgenHeader__Group_4__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1962:1: rule__MobgenHeader__Group_4__0 : rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 ;
    public final void rule__MobgenHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1966:1: ( rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1967:2: rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04042);
            rule__MobgenHeader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04045);
            rule__MobgenHeader__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group_4__0"


    // $ANTLR start "rule__MobgenHeader__Group_4__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1974:1: rule__MobgenHeader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MobgenHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1978:1: ( ( ',' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1979:1: ( ',' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1979:1: ( ',' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1980:1: ','
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__MobgenHeader__Group_4__0__Impl4073); 
             after(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group_4__0__Impl"


    // $ANTLR start "rule__MobgenHeader__Group_4__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1993:1: rule__MobgenHeader__Group_4__1 : rule__MobgenHeader__Group_4__1__Impl ;
    public final void rule__MobgenHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1997:1: ( rule__MobgenHeader__Group_4__1__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:1998:2: rule__MobgenHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14104);
            rule__MobgenHeader__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group_4__1"


    // $ANTLR start "rule__MobgenHeader__Group_4__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2004:1: rule__MobgenHeader__Group_4__1__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) ;
    public final void rule__MobgenHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2008:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2009:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2009:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2010:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2011:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2011:2: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4131);
            rule__MobgenHeader__HeaderKeyValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__Group_4__1__Impl"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2025:1: rule__MobgenHeaderKeyValuePair__Group__0 : rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2029:1: ( rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2030:2: rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04165);
            rule__MobgenHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04168);
            rule__MobgenHeaderKeyValuePair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__Group__0"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2037:1: rule__MobgenHeaderKeyValuePair__Group__0__Impl : ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2041:1: ( ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2042:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2042:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2043:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2044:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2044:2: rule__MobgenHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4195);
            rule__MobgenHeaderKeyValuePair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__Group__0__Impl"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2054:1: rule__MobgenHeaderKeyValuePair__Group__1 : rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2058:1: ( rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2059:2: rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14225);
            rule__MobgenHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14228);
            rule__MobgenHeaderKeyValuePair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__Group__1"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2066:1: rule__MobgenHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2070:1: ( ( '=' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2071:1: ( '=' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2071:1: ( '=' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2072:1: '='
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4256); 
             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__Group__1__Impl"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2085:1: rule__MobgenHeaderKeyValuePair__Group__2 : rule__MobgenHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2089:1: ( rule__MobgenHeaderKeyValuePair__Group__2__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2090:2: rule__MobgenHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24287);
            rule__MobgenHeaderKeyValuePair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__Group__2"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2096:1: rule__MobgenHeaderKeyValuePair__Group__2__Impl : ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2100:1: ( ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2101:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2101:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2102:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2103:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2103:2: rule__MobgenHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4314);
            rule__MobgenHeaderKeyValuePair__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__Group__2__Impl"


    // $ANTLR start "rule__MobgenHeaderParameter__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2119:1: rule__MobgenHeaderParameter__Group__0 : rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1 ;
    public final void rule__MobgenHeaderParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2123:1: ( rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2124:2: rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__0__Impl_in_rule__MobgenHeaderParameter__Group__04350);
            rule__MobgenHeaderParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__1_in_rule__MobgenHeaderParameter__Group__04353);
            rule__MobgenHeaderParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderParameter__Group__0"


    // $ANTLR start "rule__MobgenHeaderParameter__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2131:1: rule__MobgenHeaderParameter__Group__0__Impl : ( '{' ) ;
    public final void rule__MobgenHeaderParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2135:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2136:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2136:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2137:1: '{'
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__MobgenHeaderParameter__Group__0__Impl4381); 
             after(grammarAccess.getMobgenHeaderParameterAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderParameter__Group__0__Impl"


    // $ANTLR start "rule__MobgenHeaderParameter__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2150:1: rule__MobgenHeaderParameter__Group__1 : rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2 ;
    public final void rule__MobgenHeaderParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2154:1: ( rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2155:2: rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__1__Impl_in_rule__MobgenHeaderParameter__Group__14412);
            rule__MobgenHeaderParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__2_in_rule__MobgenHeaderParameter__Group__14415);
            rule__MobgenHeaderParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderParameter__Group__1"


    // $ANTLR start "rule__MobgenHeaderParameter__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2162:1: rule__MobgenHeaderParameter__Group__1__Impl : ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) ) ;
    public final void rule__MobgenHeaderParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2166:1: ( ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2167:1: ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2167:1: ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2168:1: ( rule__MobgenHeaderParameter__IdAssignment_1 )
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getIdAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2169:1: ( rule__MobgenHeaderParameter__IdAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2169:2: rule__MobgenHeaderParameter__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__IdAssignment_1_in_rule__MobgenHeaderParameter__Group__1__Impl4442);
            rule__MobgenHeaderParameter__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobgenHeaderParameterAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderParameter__Group__1__Impl"


    // $ANTLR start "rule__MobgenHeaderParameter__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2179:1: rule__MobgenHeaderParameter__Group__2 : rule__MobgenHeaderParameter__Group__2__Impl ;
    public final void rule__MobgenHeaderParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2183:1: ( rule__MobgenHeaderParameter__Group__2__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2184:2: rule__MobgenHeaderParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__2__Impl_in_rule__MobgenHeaderParameter__Group__24472);
            rule__MobgenHeaderParameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderParameter__Group__2"


    // $ANTLR start "rule__MobgenHeaderParameter__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2190:1: rule__MobgenHeaderParameter__Group__2__Impl : ( '}' ) ;
    public final void rule__MobgenHeaderParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2194:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2195:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2195:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2196:1: '}'
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getRightCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__MobgenHeaderParameter__Group__2__Impl4500); 
             after(grammarAccess.getMobgenHeaderParameterAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderParameter__Group__2__Impl"


    // $ANTLR start "rule__MobgenJson__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2215:1: rule__MobgenJson__Group__0 : rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 ;
    public final void rule__MobgenJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2219:1: ( rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2220:2: rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04537);
            rule__MobgenJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04540);
            rule__MobgenJson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__0"


    // $ANTLR start "rule__MobgenJson__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2227:1: rule__MobgenJson__Group__0__Impl : ( ( rule__MobgenJson__NameAssignment_0 ) ) ;
    public final void rule__MobgenJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2231:1: ( ( ( rule__MobgenJson__NameAssignment_0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2232:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2232:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2233:1: ( rule__MobgenJson__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getNameAssignment_0()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2234:1: ( rule__MobgenJson__NameAssignment_0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2234:2: rule__MobgenJson__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4567);
            rule__MobgenJson__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenJsonAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__0__Impl"


    // $ANTLR start "rule__MobgenJson__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2244:1: rule__MobgenJson__Group__1 : rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 ;
    public final void rule__MobgenJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2248:1: ( rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2249:2: rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14597);
            rule__MobgenJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14600);
            rule__MobgenJson__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__1"


    // $ANTLR start "rule__MobgenJson__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2256:1: rule__MobgenJson__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2260:1: ( ( '\\'\\'\\'' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2261:1: ( '\\'\\'\\'' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2261:1: ( '\\'\\'\\'' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2262:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__MobgenJson__Group__1__Impl4628); 
             after(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__1__Impl"


    // $ANTLR start "rule__MobgenJson__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2275:1: rule__MobgenJson__Group__2 : rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 ;
    public final void rule__MobgenJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2279:1: ( rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2280:2: rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__24659);
            rule__MobgenJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__24662);
            rule__MobgenJson__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__2"


    // $ANTLR start "rule__MobgenJson__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2287:1: rule__MobgenJson__Group__2__Impl : ( ( rule__MobgenJson__ValueAssignment_2 ) ) ;
    public final void rule__MobgenJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2291:1: ( ( ( rule__MobgenJson__ValueAssignment_2 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2292:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2292:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2293:1: ( rule__MobgenJson__ValueAssignment_2 )
            {
             before(grammarAccess.getMobgenJsonAccess().getValueAssignment_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2294:1: ( rule__MobgenJson__ValueAssignment_2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2294:2: rule__MobgenJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl4689);
            rule__MobgenJson__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMobgenJsonAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__2__Impl"


    // $ANTLR start "rule__MobgenJson__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2304:1: rule__MobgenJson__Group__3 : rule__MobgenJson__Group__3__Impl ;
    public final void rule__MobgenJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2308:1: ( rule__MobgenJson__Group__3__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2309:2: rule__MobgenJson__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__34719);
            rule__MobgenJson__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__3"


    // $ANTLR start "rule__MobgenJson__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2315:1: rule__MobgenJson__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2319:1: ( ( '\\'\\'\\'' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2320:1: ( '\\'\\'\\'' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2320:1: ( '\\'\\'\\'' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2321:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__MobgenJson__Group__3__Impl4747); 
             after(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__Group__3__Impl"


    // $ANTLR start "rule__JsonObject__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2342:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2346:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2347:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__04786);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__04789);
            rule__JsonObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__0"


    // $ANTLR start "rule__JsonObject__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2354:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2358:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2359:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2359:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2360:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__JsonObject__Group__0__Impl4817); 
             after(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__0__Impl"


    // $ANTLR start "rule__JsonObject__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2373:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2377:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2378:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__14848);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__14851);
            rule__JsonObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__1"


    // $ANTLR start "rule__JsonObject__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2385:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2389:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2390:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2390:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2391:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2392:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2392:2: rule__JsonObject__KeyValuePairAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl4878);
            rule__JsonObject__KeyValuePairAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__1__Impl"


    // $ANTLR start "rule__JsonObject__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2402:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2406:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2407:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__24908);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__24911);
            rule__JsonObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__2"


    // $ANTLR start "rule__JsonObject__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2414:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )* ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2418:1: ( ( ( rule__JsonObject__Group_2__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2419:1: ( ( rule__JsonObject__Group_2__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2419:1: ( ( rule__JsonObject__Group_2__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2420:1: ( rule__JsonObject__Group_2__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2421:1: ( rule__JsonObject__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_STRING) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2421:2: rule__JsonObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl4938);
            	    rule__JsonObject__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getJsonObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__2__Impl"


    // $ANTLR start "rule__JsonObject__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2431:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2435:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2436:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__34969);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__34972);
            rule__JsonObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__3"


    // $ANTLR start "rule__JsonObject__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2443:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2447:1: ( ( ( ',' )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2448:1: ( ( ',' )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2448:1: ( ( ',' )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2449:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2450:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2451:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__JsonObject__Group__3__Impl5001); 

                    }
                    break;

            }

             after(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__3__Impl"


    // $ANTLR start "rule__JsonObject__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2462:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2466:1: ( rule__JsonObject__Group__4__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2467:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45034);
            rule__JsonObject__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__4"


    // $ANTLR start "rule__JsonObject__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2473:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2477:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2478:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2478:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2479:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__JsonObject__Group__4__Impl5062); 
             after(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group__4__Impl"


    // $ANTLR start "rule__JsonObject__Group_2__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2502:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2506:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2507:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05103);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05106);
            rule__JsonObject__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__0"


    // $ANTLR start "rule__JsonObject__Group_2__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2514:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2518:1: ( ( ',' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2519:1: ( ',' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2519:1: ( ',' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2520:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__JsonObject__Group_2__0__Impl5134); 
             after(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__0__Impl"


    // $ANTLR start "rule__JsonObject__Group_2__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2533:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2537:1: ( rule__JsonObject__Group_2__1__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2538:2: rule__JsonObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15165);
            rule__JsonObject__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__1"


    // $ANTLR start "rule__JsonObject__Group_2__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2544:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2548:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2549:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2549:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2550:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_2_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2551:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2551:2: rule__JsonObject__KeyValuePairAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5192);
            rule__JsonObject__KeyValuePairAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__1__Impl"


    // $ANTLR start "rule__JsonKeyValuePair__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2565:1: rule__JsonKeyValuePair__Group__0 : rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 ;
    public final void rule__JsonKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2569:1: ( rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2570:2: rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05226);
            rule__JsonKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05229);
            rule__JsonKeyValuePair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__Group__0"


    // $ANTLR start "rule__JsonKeyValuePair__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2577:1: rule__JsonKeyValuePair__Group__0__Impl : ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2581:1: ( ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2582:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2582:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2583:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2584:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2584:2: rule__JsonKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5256);
            rule__JsonKeyValuePair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__Group__0__Impl"


    // $ANTLR start "rule__JsonKeyValuePair__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2594:1: rule__JsonKeyValuePair__Group__1 : rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 ;
    public final void rule__JsonKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2598:1: ( rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2599:2: rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15286);
            rule__JsonKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15289);
            rule__JsonKeyValuePair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__Group__1"


    // $ANTLR start "rule__JsonKeyValuePair__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2606:1: rule__JsonKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2610:1: ( ( ':' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2611:1: ( ':' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2611:1: ( ':' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2612:1: ':'
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__JsonKeyValuePair__Group__1__Impl5317); 
             after(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__Group__1__Impl"


    // $ANTLR start "rule__JsonKeyValuePair__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2625:1: rule__JsonKeyValuePair__Group__2 : rule__JsonKeyValuePair__Group__2__Impl ;
    public final void rule__JsonKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2629:1: ( rule__JsonKeyValuePair__Group__2__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2630:2: rule__JsonKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25348);
            rule__JsonKeyValuePair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__Group__2"


    // $ANTLR start "rule__JsonKeyValuePair__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2636:1: rule__JsonKeyValuePair__Group__2__Impl : ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2640:1: ( ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2641:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2641:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2642:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2643:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2643:2: rule__JsonKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5375);
            rule__JsonKeyValuePair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__Group__2__Impl"


    // $ANTLR start "rule__JsonArray__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2659:1: rule__JsonArray__Group__0 : rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 ;
    public final void rule__JsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2663:1: ( rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2664:2: rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05411);
            rule__JsonArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05414);
            rule__JsonArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__0"


    // $ANTLR start "rule__JsonArray__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2671:1: rule__JsonArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2675:1: ( ( '[' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2676:1: ( '[' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2676:1: ( '[' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2677:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__JsonArray__Group__0__Impl5442); 
             after(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__0__Impl"


    // $ANTLR start "rule__JsonArray__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2690:1: rule__JsonArray__Group__1 : rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 ;
    public final void rule__JsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2694:1: ( rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2695:2: rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15473);
            rule__JsonArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15476);
            rule__JsonArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__1"


    // $ANTLR start "rule__JsonArray__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2702:1: rule__JsonArray__Group__1__Impl : ( ( rule__JsonArray__ItemsAssignment_1 ) ) ;
    public final void rule__JsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2706:1: ( ( ( rule__JsonArray__ItemsAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2707:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2707:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2708:1: ( rule__JsonArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2709:1: ( rule__JsonArray__ItemsAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2709:2: rule__JsonArray__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5503);
            rule__JsonArray__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__1__Impl"


    // $ANTLR start "rule__JsonArray__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2719:1: rule__JsonArray__Group__2 : rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 ;
    public final void rule__JsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2723:1: ( rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2724:2: rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25533);
            rule__JsonArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25536);
            rule__JsonArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__2"


    // $ANTLR start "rule__JsonArray__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2731:1: rule__JsonArray__Group__2__Impl : ( ( rule__JsonArray__Group_2__0 )* ) ;
    public final void rule__JsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2735:1: ( ( ( rule__JsonArray__Group_2__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2736:1: ( ( rule__JsonArray__Group_2__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2736:1: ( ( rule__JsonArray__Group_2__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2737:1: ( rule__JsonArray__Group_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2738:1: ( rule__JsonArray__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_STRING||(LA20_1>=RULE_EMPTY_JSON_OBJECT && LA20_1<=RULE_INT)||(LA20_1>=23 && LA20_1<=27)||LA20_1==40||LA20_1==44||LA20_1==46) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2738:2: rule__JsonArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5563);
            	    rule__JsonArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getJsonArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__2__Impl"


    // $ANTLR start "rule__JsonArray__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2748:1: rule__JsonArray__Group__3 : rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 ;
    public final void rule__JsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2752:1: ( rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2753:2: rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35594);
            rule__JsonArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35597);
            rule__JsonArray__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__3"


    // $ANTLR start "rule__JsonArray__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2760:1: rule__JsonArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2764:1: ( ( ( ',' )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2765:1: ( ( ',' )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2765:1: ( ( ',' )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2766:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2767:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2768:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__JsonArray__Group__3__Impl5626); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__3__Impl"


    // $ANTLR start "rule__JsonArray__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2779:1: rule__JsonArray__Group__4 : rule__JsonArray__Group__4__Impl ;
    public final void rule__JsonArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2783:1: ( rule__JsonArray__Group__4__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2784:2: rule__JsonArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__45659);
            rule__JsonArray__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__4"


    // $ANTLR start "rule__JsonArray__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2790:1: rule__JsonArray__Group__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2794:1: ( ( ']' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2795:1: ( ']' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2795:1: ( ']' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2796:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__JsonArray__Group__4__Impl5687); 
             after(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group__4__Impl"


    // $ANTLR start "rule__JsonArray__Group_2__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2819:1: rule__JsonArray__Group_2__0 : rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 ;
    public final void rule__JsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2823:1: ( rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2824:2: rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__05728);
            rule__JsonArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__05731);
            rule__JsonArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__0"


    // $ANTLR start "rule__JsonArray__Group_2__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2831:1: rule__JsonArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2835:1: ( ( ',' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2836:1: ( ',' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2836:1: ( ',' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2837:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__JsonArray__Group_2__0__Impl5759); 
             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_2__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2850:1: rule__JsonArray__Group_2__1 : rule__JsonArray__Group_2__1__Impl ;
    public final void rule__JsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2854:1: ( rule__JsonArray__Group_2__1__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2855:2: rule__JsonArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__15790);
            rule__JsonArray__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__1"


    // $ANTLR start "rule__JsonArray__Group_2__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2861:1: rule__JsonArray__Group_2__1__Impl : ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__JsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2865:1: ( ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2866:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2866:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2867:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_2_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2868:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2868:2: rule__JsonArray__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl5817);
            rule__JsonArray__ItemsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getItemsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_2__1__Impl"


    // $ANTLR start "rule__JsonEnumType__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2882:1: rule__JsonEnumType__Group__0 : rule__JsonEnumType__Group__0__Impl rule__JsonEnumType__Group__1 ;
    public final void rule__JsonEnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2886:1: ( rule__JsonEnumType__Group__0__Impl rule__JsonEnumType__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2887:2: rule__JsonEnumType__Group__0__Impl rule__JsonEnumType__Group__1
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group__0__Impl_in_rule__JsonEnumType__Group__05851);
            rule__JsonEnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonEnumType__Group__1_in_rule__JsonEnumType__Group__05854);
            rule__JsonEnumType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__0"


    // $ANTLR start "rule__JsonEnumType__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2894:1: rule__JsonEnumType__Group__0__Impl : ( 'enum' ) ;
    public final void rule__JsonEnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2898:1: ( ( 'enum' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2899:1: ( 'enum' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2899:1: ( 'enum' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2900:1: 'enum'
            {
             before(grammarAccess.getJsonEnumTypeAccess().getEnumKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__JsonEnumType__Group__0__Impl5882); 
             after(grammarAccess.getJsonEnumTypeAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__0__Impl"


    // $ANTLR start "rule__JsonEnumType__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2913:1: rule__JsonEnumType__Group__1 : rule__JsonEnumType__Group__1__Impl rule__JsonEnumType__Group__2 ;
    public final void rule__JsonEnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2917:1: ( rule__JsonEnumType__Group__1__Impl rule__JsonEnumType__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2918:2: rule__JsonEnumType__Group__1__Impl rule__JsonEnumType__Group__2
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group__1__Impl_in_rule__JsonEnumType__Group__15913);
            rule__JsonEnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonEnumType__Group__2_in_rule__JsonEnumType__Group__15916);
            rule__JsonEnumType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__1"


    // $ANTLR start "rule__JsonEnumType__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2925:1: rule__JsonEnumType__Group__1__Impl : ( '{' ) ;
    public final void rule__JsonEnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2929:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2930:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2930:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2931:1: '{'
            {
             before(grammarAccess.getJsonEnumTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__JsonEnumType__Group__1__Impl5944); 
             after(grammarAccess.getJsonEnumTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__1__Impl"


    // $ANTLR start "rule__JsonEnumType__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2944:1: rule__JsonEnumType__Group__2 : rule__JsonEnumType__Group__2__Impl rule__JsonEnumType__Group__3 ;
    public final void rule__JsonEnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2948:1: ( rule__JsonEnumType__Group__2__Impl rule__JsonEnumType__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2949:2: rule__JsonEnumType__Group__2__Impl rule__JsonEnumType__Group__3
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group__2__Impl_in_rule__JsonEnumType__Group__25975);
            rule__JsonEnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonEnumType__Group__3_in_rule__JsonEnumType__Group__25978);
            rule__JsonEnumType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__2"


    // $ANTLR start "rule__JsonEnumType__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2956:1: rule__JsonEnumType__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__JsonEnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2960:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2961:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2961:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2962:1: RULE_STRING
            {
             before(grammarAccess.getJsonEnumTypeAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonEnumType__Group__2__Impl6005); 
             after(grammarAccess.getJsonEnumTypeAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__2__Impl"


    // $ANTLR start "rule__JsonEnumType__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2973:1: rule__JsonEnumType__Group__3 : rule__JsonEnumType__Group__3__Impl rule__JsonEnumType__Group__4 ;
    public final void rule__JsonEnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2977:1: ( rule__JsonEnumType__Group__3__Impl rule__JsonEnumType__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2978:2: rule__JsonEnumType__Group__3__Impl rule__JsonEnumType__Group__4
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group__3__Impl_in_rule__JsonEnumType__Group__36034);
            rule__JsonEnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonEnumType__Group__4_in_rule__JsonEnumType__Group__36037);
            rule__JsonEnumType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__3"


    // $ANTLR start "rule__JsonEnumType__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2985:1: rule__JsonEnumType__Group__3__Impl : ( ( rule__JsonEnumType__Group_3__0 )* ) ;
    public final void rule__JsonEnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2989:1: ( ( ( rule__JsonEnumType__Group_3__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2990:1: ( ( rule__JsonEnumType__Group_3__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2990:1: ( ( rule__JsonEnumType__Group_3__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2991:1: ( rule__JsonEnumType__Group_3__0 )*
            {
             before(grammarAccess.getJsonEnumTypeAccess().getGroup_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2992:1: ( rule__JsonEnumType__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_STRING) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:2992:2: rule__JsonEnumType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonEnumType__Group_3__0_in_rule__JsonEnumType__Group__3__Impl6064);
            	    rule__JsonEnumType__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getJsonEnumTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__3__Impl"


    // $ANTLR start "rule__JsonEnumType__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3002:1: rule__JsonEnumType__Group__4 : rule__JsonEnumType__Group__4__Impl rule__JsonEnumType__Group__5 ;
    public final void rule__JsonEnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3006:1: ( rule__JsonEnumType__Group__4__Impl rule__JsonEnumType__Group__5 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3007:2: rule__JsonEnumType__Group__4__Impl rule__JsonEnumType__Group__5
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group__4__Impl_in_rule__JsonEnumType__Group__46095);
            rule__JsonEnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonEnumType__Group__5_in_rule__JsonEnumType__Group__46098);
            rule__JsonEnumType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__4"


    // $ANTLR start "rule__JsonEnumType__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3014:1: rule__JsonEnumType__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__JsonEnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3018:1: ( ( ( ',' )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3019:1: ( ( ',' )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3019:1: ( ( ',' )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3020:1: ( ',' )?
            {
             before(grammarAccess.getJsonEnumTypeAccess().getCommaKeyword_4()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3021:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3022:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__JsonEnumType__Group__4__Impl6127); 

                    }
                    break;

            }

             after(grammarAccess.getJsonEnumTypeAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__4__Impl"


    // $ANTLR start "rule__JsonEnumType__Group__5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3033:1: rule__JsonEnumType__Group__5 : rule__JsonEnumType__Group__5__Impl ;
    public final void rule__JsonEnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3037:1: ( rule__JsonEnumType__Group__5__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3038:2: rule__JsonEnumType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group__5__Impl_in_rule__JsonEnumType__Group__56160);
            rule__JsonEnumType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__5"


    // $ANTLR start "rule__JsonEnumType__Group__5__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3044:1: rule__JsonEnumType__Group__5__Impl : ( '}' ) ;
    public final void rule__JsonEnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3048:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3049:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3049:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3050:1: '}'
            {
             before(grammarAccess.getJsonEnumTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__JsonEnumType__Group__5__Impl6188); 
             after(grammarAccess.getJsonEnumTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group__5__Impl"


    // $ANTLR start "rule__JsonEnumType__Group_3__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3075:1: rule__JsonEnumType__Group_3__0 : rule__JsonEnumType__Group_3__0__Impl rule__JsonEnumType__Group_3__1 ;
    public final void rule__JsonEnumType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3079:1: ( rule__JsonEnumType__Group_3__0__Impl rule__JsonEnumType__Group_3__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3080:2: rule__JsonEnumType__Group_3__0__Impl rule__JsonEnumType__Group_3__1
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group_3__0__Impl_in_rule__JsonEnumType__Group_3__06231);
            rule__JsonEnumType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonEnumType__Group_3__1_in_rule__JsonEnumType__Group_3__06234);
            rule__JsonEnumType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group_3__0"


    // $ANTLR start "rule__JsonEnumType__Group_3__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3087:1: rule__JsonEnumType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__JsonEnumType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3091:1: ( ( ',' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3092:1: ( ',' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3092:1: ( ',' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3093:1: ','
            {
             before(grammarAccess.getJsonEnumTypeAccess().getCommaKeyword_3_0()); 
            match(input,41,FOLLOW_41_in_rule__JsonEnumType__Group_3__0__Impl6262); 
             after(grammarAccess.getJsonEnumTypeAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group_3__0__Impl"


    // $ANTLR start "rule__JsonEnumType__Group_3__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3106:1: rule__JsonEnumType__Group_3__1 : rule__JsonEnumType__Group_3__1__Impl ;
    public final void rule__JsonEnumType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3110:1: ( rule__JsonEnumType__Group_3__1__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3111:2: rule__JsonEnumType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonEnumType__Group_3__1__Impl_in_rule__JsonEnumType__Group_3__16293);
            rule__JsonEnumType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group_3__1"


    // $ANTLR start "rule__JsonEnumType__Group_3__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3117:1: rule__JsonEnumType__Group_3__1__Impl : ( RULE_STRING ) ;
    public final void rule__JsonEnumType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3121:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3122:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3122:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3123:1: RULE_STRING
            {
             before(grammarAccess.getJsonEnumTypeAccess().getSTRINGTerminalRuleCall_3_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonEnumType__Group_3__1__Impl6320); 
             after(grammarAccess.getJsonEnumTypeAccess().getSTRINGTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEnumType__Group_3__1__Impl"


    // $ANTLR start "rule__EnumInstance__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3138:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3142:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3143:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06353);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06356);
            rule__EnumInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__0"


    // $ANTLR start "rule__EnumInstance__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3150:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3154:1: ( ( 'enum' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3155:1: ( 'enum' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3155:1: ( 'enum' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3156:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__EnumInstance__Group__0__Impl6384); 
             after(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__0__Impl"


    // $ANTLR start "rule__EnumInstance__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3169:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3173:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3174:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16415);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16418);
            rule__EnumInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__1"


    // $ANTLR start "rule__EnumInstance__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3181:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3185:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3186:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3186:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3187:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3188:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3188:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6445);
            rule__EnumInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__1__Impl"


    // $ANTLR start "rule__EnumInstance__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3198:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3202:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3203:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26475);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26478);
            rule__EnumInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__2"


    // $ANTLR start "rule__EnumInstance__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3210:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3214:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3215:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3215:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3216:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__EnumInstance__Group__2__Impl6506); 
             after(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__2__Impl"


    // $ANTLR start "rule__EnumInstance__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3229:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3233:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3234:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36537);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36540);
            rule__EnumInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__3"


    // $ANTLR start "rule__EnumInstance__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3241:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3245:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3246:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3246:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3247:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3248:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3248:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6567);
            rule__EnumInstance__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__3__Impl"


    // $ANTLR start "rule__EnumInstance__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3258:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3262:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3263:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46597);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46600);
            rule__EnumInstance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__4"


    // $ANTLR start "rule__EnumInstance__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3270:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3274:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3275:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3275:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3276:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3277:1: ( rule__EnumInstance__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3277:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6627);
            	    rule__EnumInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEnumInstanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__4__Impl"


    // $ANTLR start "rule__EnumInstance__Group__5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3287:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3291:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3292:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56658);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56661);
            rule__EnumInstance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__5"


    // $ANTLR start "rule__EnumInstance__Group__5__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3299:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3303:1: ( ( ( ',' )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3304:1: ( ( ',' )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3304:1: ( ( ',' )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3305:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3306:1: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3307:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__EnumInstance__Group__5__Impl6690); 

                    }
                    break;

            }

             after(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__5__Impl"


    // $ANTLR start "rule__EnumInstance__Group__6"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3318:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3322:1: ( rule__EnumInstance__Group__6__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3323:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66723);
            rule__EnumInstance__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__6"


    // $ANTLR start "rule__EnumInstance__Group__6__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3329:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3333:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3334:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3334:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3335:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__EnumInstance__Group__6__Impl6751); 
             after(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group__6__Impl"


    // $ANTLR start "rule__EnumInstance__Group_4__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3362:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3366:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3367:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06796);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06799);
            rule__EnumInstance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_4__0"


    // $ANTLR start "rule__EnumInstance__Group_4__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3374:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3378:1: ( ( ',' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3379:1: ( ',' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3379:1: ( ',' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3380:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumInstance__Group_4__0__Impl6827); 
             after(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_4__0__Impl"


    // $ANTLR start "rule__EnumInstance__Group_4__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3393:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3397:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3398:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16858);
            rule__EnumInstance__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_4__1"


    // $ANTLR start "rule__EnumInstance__Group_4__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3404:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3408:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3409:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3409:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3410:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3411:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3411:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6885);
            rule__EnumInstance__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__Group_4__1__Impl"


    // $ANTLR start "rule__MapInstance__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3425:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3429:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3430:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06919);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06922);
            rule__MapInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__0"


    // $ANTLR start "rule__MapInstance__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3437:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3441:1: ( ( 'map' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3442:1: ( 'map' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3442:1: ( 'map' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3443:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__MapInstance__Group__0__Impl6950); 
             after(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__0__Impl"


    // $ANTLR start "rule__MapInstance__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3456:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3460:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3461:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16981);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16984);
            rule__MapInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__1"


    // $ANTLR start "rule__MapInstance__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3468:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__NameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3472:1: ( ( ( rule__MapInstance__NameAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3473:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3473:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3474:1: ( rule__MapInstance__NameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3475:1: ( rule__MapInstance__NameAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3475:2: rule__MapInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl7011);
            rule__MapInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__1__Impl"


    // $ANTLR start "rule__MapInstance__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3485:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3489:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3490:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__27041);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__27044);
            rule__MapInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__2"


    // $ANTLR start "rule__MapInstance__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3497:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3501:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3502:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3502:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3503:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__MapInstance__Group__2__Impl7072); 
             after(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__2__Impl"


    // $ANTLR start "rule__MapInstance__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3516:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3520:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3521:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__37103);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__37106);
            rule__MapInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__3"


    // $ANTLR start "rule__MapInstance__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3528:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__Group_3__0 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3532:1: ( ( ( rule__MapInstance__Group_3__0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3533:1: ( ( rule__MapInstance__Group_3__0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3533:1: ( ( rule__MapInstance__Group_3__0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3534:1: ( rule__MapInstance__Group_3__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3535:1: ( rule__MapInstance__Group_3__0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3535:2: rule__MapInstance__Group_3__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl7133);
            rule__MapInstance__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__3__Impl"


    // $ANTLR start "rule__MapInstance__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3545:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3549:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3550:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__47163);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__47166);
            rule__MapInstance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__4"


    // $ANTLR start "rule__MapInstance__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3557:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3561:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3562:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3562:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3563:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3564:1: ( rule__MapInstance__Group_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3564:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl7193);
            	    rule__MapInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMapInstanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__4__Impl"


    // $ANTLR start "rule__MapInstance__Group__5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3574:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3578:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3579:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__57224);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__57227);
            rule__MapInstance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__5"


    // $ANTLR start "rule__MapInstance__Group__5__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3586:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3590:1: ( ( ( ',' )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3591:1: ( ( ',' )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3591:1: ( ( ',' )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3592:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3593:1: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3594:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__MapInstance__Group__5__Impl7256); 

                    }
                    break;

            }

             after(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__5__Impl"


    // $ANTLR start "rule__MapInstance__Group__6"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3605:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3609:1: ( rule__MapInstance__Group__6__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3610:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__67289);
            rule__MapInstance__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__6"


    // $ANTLR start "rule__MapInstance__Group__6__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3616:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3620:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3621:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3621:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3622:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__MapInstance__Group__6__Impl7317); 
             after(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group__6__Impl"


    // $ANTLR start "rule__MapInstance__Group_3__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3649:1: rule__MapInstance__Group_3__0 : rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 ;
    public final void rule__MapInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3653:1: ( rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3654:2: rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07362);
            rule__MapInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07365);
            rule__MapInstance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_3__0"


    // $ANTLR start "rule__MapInstance__Group_3__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3661:1: rule__MapInstance__Group_3__0__Impl : ( ( rule__MapInstance__KeysAssignment_3_0 ) ) ;
    public final void rule__MapInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3665:1: ( ( ( rule__MapInstance__KeysAssignment_3_0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3666:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3666:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3667:1: ( rule__MapInstance__KeysAssignment_3_0 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3668:1: ( rule__MapInstance__KeysAssignment_3_0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3668:2: rule__MapInstance__KeysAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7392);
            rule__MapInstance__KeysAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_3__0__Impl"


    // $ANTLR start "rule__MapInstance__Group_3__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3678:1: rule__MapInstance__Group_3__1 : rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 ;
    public final void rule__MapInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3682:1: ( rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3683:2: rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17422);
            rule__MapInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17425);
            rule__MapInstance__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_3__1"


    // $ANTLR start "rule__MapInstance__Group_3__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3690:1: rule__MapInstance__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3694:1: ( ( ':' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3695:1: ( ':' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3695:1: ( ':' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3696:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 
            match(input,29,FOLLOW_29_in_rule__MapInstance__Group_3__1__Impl7453); 
             after(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_3__1__Impl"


    // $ANTLR start "rule__MapInstance__Group_3__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3709:1: rule__MapInstance__Group_3__2 : rule__MapInstance__Group_3__2__Impl ;
    public final void rule__MapInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3713:1: ( rule__MapInstance__Group_3__2__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3714:2: rule__MapInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27484);
            rule__MapInstance__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_3__2"


    // $ANTLR start "rule__MapInstance__Group_3__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3720:1: rule__MapInstance__Group_3__2__Impl : ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) ;
    public final void rule__MapInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3724:1: ( ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3725:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3725:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3726:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3727:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3727:2: rule__MapInstance__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7511);
            rule__MapInstance__ValuesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_3__2__Impl"


    // $ANTLR start "rule__MapInstance__Group_4__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3743:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3747:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3748:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07547);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07550);
            rule__MapInstance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__0"


    // $ANTLR start "rule__MapInstance__Group_4__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3755:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3759:1: ( ( ',' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3760:1: ( ',' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3760:1: ( ',' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3761:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__MapInstance__Group_4__0__Impl7578); 
             after(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__0__Impl"


    // $ANTLR start "rule__MapInstance__Group_4__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3774:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3778:1: ( rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3779:2: rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17609);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17612);
            rule__MapInstance__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__1"


    // $ANTLR start "rule__MapInstance__Group_4__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3786:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__KeysAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3790:1: ( ( ( rule__MapInstance__KeysAssignment_4_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3791:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3791:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3792:1: ( rule__MapInstance__KeysAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3793:1: ( rule__MapInstance__KeysAssignment_4_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3793:2: rule__MapInstance__KeysAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7639);
            rule__MapInstance__KeysAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__1__Impl"


    // $ANTLR start "rule__MapInstance__Group_4__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3803:1: rule__MapInstance__Group_4__2 : rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 ;
    public final void rule__MapInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3807:1: ( rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3808:2: rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27669);
            rule__MapInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27672);
            rule__MapInstance__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__2"


    // $ANTLR start "rule__MapInstance__Group_4__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3815:1: rule__MapInstance__Group_4__2__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3819:1: ( ( ':' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3820:1: ( ':' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3820:1: ( ':' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3821:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 
            match(input,29,FOLLOW_29_in_rule__MapInstance__Group_4__2__Impl7700); 
             after(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__2__Impl"


    // $ANTLR start "rule__MapInstance__Group_4__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3834:1: rule__MapInstance__Group_4__3 : rule__MapInstance__Group_4__3__Impl ;
    public final void rule__MapInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3838:1: ( rule__MapInstance__Group_4__3__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3839:2: rule__MapInstance__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37731);
            rule__MapInstance__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__3"


    // $ANTLR start "rule__MapInstance__Group_4__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3845:1: rule__MapInstance__Group_4__3__Impl : ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) ;
    public final void rule__MapInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3849:1: ( ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3850:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3850:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3851:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3852:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3852:2: rule__MapInstance__ValuesAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7758);
            rule__MapInstance__ValuesAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__Group_4__3__Impl"


    // $ANTLR start "rule__StringList__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3870:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3874:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3875:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07796);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07799);
            rule__StringList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0"


    // $ANTLR start "rule__StringList__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3882:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3886:1: ( ( '[' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3887:1: ( '[' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3887:1: ( '[' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3888:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__StringList__Group__0__Impl7827); 
             after(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0__Impl"


    // $ANTLR start "rule__StringList__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3901:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3905:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3906:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17858);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17861);
            rule__StringList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1"


    // $ANTLR start "rule__StringList__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3913:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3917:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3918:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3918:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3919:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3920:1: ( rule__StringList__ValuesAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3920:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7888);
            rule__StringList__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1__Impl"


    // $ANTLR start "rule__StringList__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3930:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3934:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3935:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27918);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27921);
            rule__StringList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__2"


    // $ANTLR start "rule__StringList__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3942:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3946:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3947:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3947:1: ( ( rule__StringList__Group_2__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3948:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3949:1: ( rule__StringList__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==41) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_STRING) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3949:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7948);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getStringListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__2__Impl"


    // $ANTLR start "rule__StringList__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3959:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3963:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3964:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37979);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37982);
            rule__StringList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__3"


    // $ANTLR start "rule__StringList__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3971:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3975:1: ( ( ( ',' )? ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3976:1: ( ( ',' )? )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3976:1: ( ( ',' )? )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3977:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3978:1: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3979:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__StringList__Group__3__Impl8011); 

                    }
                    break;

            }

             after(grammarAccess.getStringListAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__3__Impl"


    // $ANTLR start "rule__StringList__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3990:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3994:1: ( rule__StringList__Group__4__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:3995:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__48044);
            rule__StringList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__4"


    // $ANTLR start "rule__StringList__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4001:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4005:1: ( ( ']' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4006:1: ( ']' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4006:1: ( ']' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4007:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__StringList__Group__4__Impl8072); 
             after(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__4__Impl"


    // $ANTLR start "rule__StringList__Group_2__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4030:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4034:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4035:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__08113);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__08116);
            rule__StringList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__0"


    // $ANTLR start "rule__StringList__Group_2__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4042:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4046:1: ( ( ',' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4047:1: ( ',' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4047:1: ( ',' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4048:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__StringList__Group_2__0__Impl8144); 
             after(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__0__Impl"


    // $ANTLR start "rule__StringList__Group_2__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4061:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4065:1: ( rule__StringList__Group_2__1__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4066:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18175);
            rule__StringList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__1"


    // $ANTLR start "rule__StringList__Group_2__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4072:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4076:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4077:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4077:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4078:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4079:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4079:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8202);
            rule__StringList__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__1__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4093:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4097:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4098:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__08236);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__08239);
            rule__URI__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__0"


    // $ANTLR start "rule__URI__Group__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4105:1: rule__URI__Group__0__Impl : ( ( rule__URI__UrlPrefixAssignment_0 ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4109:1: ( ( ( rule__URI__UrlPrefixAssignment_0 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4110:1: ( ( rule__URI__UrlPrefixAssignment_0 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4110:1: ( ( rule__URI__UrlPrefixAssignment_0 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4111:1: ( rule__URI__UrlPrefixAssignment_0 )
            {
             before(grammarAccess.getURIAccess().getUrlPrefixAssignment_0()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4112:1: ( rule__URI__UrlPrefixAssignment_0 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4112:2: rule__URI__UrlPrefixAssignment_0
            {
            pushFollow(FOLLOW_rule__URI__UrlPrefixAssignment_0_in_rule__URI__Group__0__Impl8266);
            rule__URI__UrlPrefixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getUrlPrefixAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__0__Impl"


    // $ANTLR start "rule__URI__Group__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4122:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4126:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4127:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__18296);
            rule__URI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__18299);
            rule__URI__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__1"


    // $ANTLR start "rule__URI__Group__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4134:1: rule__URI__Group__1__Impl : ( ( rule__URI__PathAssignment_1 ) ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4138:1: ( ( ( rule__URI__PathAssignment_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4139:1: ( ( rule__URI__PathAssignment_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4139:1: ( ( rule__URI__PathAssignment_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4140:1: ( rule__URI__PathAssignment_1 )
            {
             before(grammarAccess.getURIAccess().getPathAssignment_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4141:1: ( rule__URI__PathAssignment_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4141:2: rule__URI__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__URI__PathAssignment_1_in_rule__URI__Group__1__Impl8326);
            rule__URI__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__1__Impl"


    // $ANTLR start "rule__URI__Group__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4151:1: rule__URI__Group__2 : rule__URI__Group__2__Impl rule__URI__Group__3 ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4155:1: ( rule__URI__Group__2__Impl rule__URI__Group__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4156:2: rule__URI__Group__2__Impl rule__URI__Group__3
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__28356);
            rule__URI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__3_in_rule__URI__Group__28359);
            rule__URI__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__2"


    // $ANTLR start "rule__URI__Group__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4163:1: rule__URI__Group__2__Impl : ( ( rule__URI__Group_2__0 )* ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4167:1: ( ( ( rule__URI__Group_2__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4168:1: ( ( rule__URI__Group_2__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4168:1: ( ( rule__URI__Group_2__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4169:1: ( rule__URI__Group_2__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_2()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4170:1: ( rule__URI__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4170:2: rule__URI__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl8386);
            	    rule__URI__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__2__Impl"


    // $ANTLR start "rule__URI__Group__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4180:1: rule__URI__Group__3 : rule__URI__Group__3__Impl rule__URI__Group__4 ;
    public final void rule__URI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4184:1: ( rule__URI__Group__3__Impl rule__URI__Group__4 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4185:2: rule__URI__Group__3__Impl rule__URI__Group__4
            {
            pushFollow(FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__38417);
            rule__URI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__4_in_rule__URI__Group__38420);
            rule__URI__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__3"


    // $ANTLR start "rule__URI__Group__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4192:1: rule__URI__Group__3__Impl : ( ( rule__URI__QueryAssignment_3 ) ) ;
    public final void rule__URI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4196:1: ( ( ( rule__URI__QueryAssignment_3 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4197:1: ( ( rule__URI__QueryAssignment_3 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4197:1: ( ( rule__URI__QueryAssignment_3 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4198:1: ( rule__URI__QueryAssignment_3 )
            {
             before(grammarAccess.getURIAccess().getQueryAssignment_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4199:1: ( rule__URI__QueryAssignment_3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4199:2: rule__URI__QueryAssignment_3
            {
            pushFollow(FOLLOW_rule__URI__QueryAssignment_3_in_rule__URI__Group__3__Impl8447);
            rule__URI__QueryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getQueryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__3__Impl"


    // $ANTLR start "rule__URI__Group__4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4209:1: rule__URI__Group__4 : rule__URI__Group__4__Impl ;
    public final void rule__URI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4213:1: ( rule__URI__Group__4__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4214:2: rule__URI__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__48477);
            rule__URI__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__4"


    // $ANTLR start "rule__URI__Group__4__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4220:1: rule__URI__Group__4__Impl : ( ( rule__URI__Group_4__0 )* ) ;
    public final void rule__URI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4224:1: ( ( ( rule__URI__Group_4__0 )* ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4225:1: ( ( rule__URI__Group_4__0 )* )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4225:1: ( ( rule__URI__Group_4__0 )* )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4226:1: ( rule__URI__Group_4__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_4()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4227:1: ( rule__URI__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4227:2: rule__URI__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl8504);
            	    rule__URI__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__4__Impl"


    // $ANTLR start "rule__URI__Group_2__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4247:1: rule__URI__Group_2__0 : rule__URI__Group_2__0__Impl rule__URI__Group_2__1 ;
    public final void rule__URI__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4251:1: ( rule__URI__Group_2__0__Impl rule__URI__Group_2__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4252:2: rule__URI__Group_2__0__Impl rule__URI__Group_2__1
            {
            pushFollow(FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__08545);
            rule__URI__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__08548);
            rule__URI__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__0"


    // $ANTLR start "rule__URI__Group_2__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4259:1: rule__URI__Group_2__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4263:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4264:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4264:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4265:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__URI__Group_2__0__Impl8576); 
             after(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__0__Impl"


    // $ANTLR start "rule__URI__Group_2__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4278:1: rule__URI__Group_2__1 : rule__URI__Group_2__1__Impl rule__URI__Group_2__2 ;
    public final void rule__URI__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4282:1: ( rule__URI__Group_2__1__Impl rule__URI__Group_2__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4283:2: rule__URI__Group_2__1__Impl rule__URI__Group_2__2
            {
            pushFollow(FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__18607);
            rule__URI__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__2_in_rule__URI__Group_2__18610);
            rule__URI__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__1"


    // $ANTLR start "rule__URI__Group_2__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4290:1: rule__URI__Group_2__1__Impl : ( ( rule__URI__PathParametersAssignment_2_1 ) ) ;
    public final void rule__URI__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4294:1: ( ( ( rule__URI__PathParametersAssignment_2_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4295:1: ( ( rule__URI__PathParametersAssignment_2_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4295:1: ( ( rule__URI__PathParametersAssignment_2_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4296:1: ( rule__URI__PathParametersAssignment_2_1 )
            {
             before(grammarAccess.getURIAccess().getPathParametersAssignment_2_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4297:1: ( rule__URI__PathParametersAssignment_2_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4297:2: rule__URI__PathParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__URI__PathParametersAssignment_2_1_in_rule__URI__Group_2__1__Impl8637);
            rule__URI__PathParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getPathParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__1__Impl"


    // $ANTLR start "rule__URI__Group_2__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4307:1: rule__URI__Group_2__2 : rule__URI__Group_2__2__Impl rule__URI__Group_2__3 ;
    public final void rule__URI__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4311:1: ( rule__URI__Group_2__2__Impl rule__URI__Group_2__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4312:2: rule__URI__Group_2__2__Impl rule__URI__Group_2__3
            {
            pushFollow(FOLLOW_rule__URI__Group_2__2__Impl_in_rule__URI__Group_2__28667);
            rule__URI__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__3_in_rule__URI__Group_2__28670);
            rule__URI__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__2"


    // $ANTLR start "rule__URI__Group_2__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4319:1: rule__URI__Group_2__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4323:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4324:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4324:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4325:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,42,FOLLOW_42_in_rule__URI__Group_2__2__Impl8698); 
             after(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__2__Impl"


    // $ANTLR start "rule__URI__Group_2__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4338:1: rule__URI__Group_2__3 : rule__URI__Group_2__3__Impl ;
    public final void rule__URI__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4342:1: ( rule__URI__Group_2__3__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4343:2: rule__URI__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_2__3__Impl_in_rule__URI__Group_2__38729);
            rule__URI__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__3"


    // $ANTLR start "rule__URI__Group_2__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4349:1: rule__URI__Group_2__3__Impl : ( ( rule__URI__PathSuffixAssignment_2_3 ) ) ;
    public final void rule__URI__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4353:1: ( ( ( rule__URI__PathSuffixAssignment_2_3 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4354:1: ( ( rule__URI__PathSuffixAssignment_2_3 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4354:1: ( ( rule__URI__PathSuffixAssignment_2_3 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4355:1: ( rule__URI__PathSuffixAssignment_2_3 )
            {
             before(grammarAccess.getURIAccess().getPathSuffixAssignment_2_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4356:1: ( rule__URI__PathSuffixAssignment_2_3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4356:2: rule__URI__PathSuffixAssignment_2_3
            {
            pushFollow(FOLLOW_rule__URI__PathSuffixAssignment_2_3_in_rule__URI__Group_2__3__Impl8756);
            rule__URI__PathSuffixAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getPathSuffixAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__3__Impl"


    // $ANTLR start "rule__URI__Group_4__0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4374:1: rule__URI__Group_4__0 : rule__URI__Group_4__0__Impl rule__URI__Group_4__1 ;
    public final void rule__URI__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4378:1: ( rule__URI__Group_4__0__Impl rule__URI__Group_4__1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4379:2: rule__URI__Group_4__0__Impl rule__URI__Group_4__1
            {
            pushFollow(FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__08794);
            rule__URI__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__08797);
            rule__URI__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__0"


    // $ANTLR start "rule__URI__Group_4__0__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4386:1: rule__URI__Group_4__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4390:1: ( ( '{' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4391:1: ( '{' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4391:1: ( '{' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4392:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__URI__Group_4__0__Impl8825); 
             after(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__0__Impl"


    // $ANTLR start "rule__URI__Group_4__1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4405:1: rule__URI__Group_4__1 : rule__URI__Group_4__1__Impl rule__URI__Group_4__2 ;
    public final void rule__URI__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4409:1: ( rule__URI__Group_4__1__Impl rule__URI__Group_4__2 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4410:2: rule__URI__Group_4__1__Impl rule__URI__Group_4__2
            {
            pushFollow(FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__18856);
            rule__URI__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__2_in_rule__URI__Group_4__18859);
            rule__URI__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__1"


    // $ANTLR start "rule__URI__Group_4__1__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4417:1: rule__URI__Group_4__1__Impl : ( ( rule__URI__QueryParametersAssignment_4_1 ) ) ;
    public final void rule__URI__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4421:1: ( ( ( rule__URI__QueryParametersAssignment_4_1 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4422:1: ( ( rule__URI__QueryParametersAssignment_4_1 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4422:1: ( ( rule__URI__QueryParametersAssignment_4_1 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4423:1: ( rule__URI__QueryParametersAssignment_4_1 )
            {
             before(grammarAccess.getURIAccess().getQueryParametersAssignment_4_1()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4424:1: ( rule__URI__QueryParametersAssignment_4_1 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4424:2: rule__URI__QueryParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__URI__QueryParametersAssignment_4_1_in_rule__URI__Group_4__1__Impl8886);
            rule__URI__QueryParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getQueryParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__1__Impl"


    // $ANTLR start "rule__URI__Group_4__2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4434:1: rule__URI__Group_4__2 : rule__URI__Group_4__2__Impl rule__URI__Group_4__3 ;
    public final void rule__URI__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4438:1: ( rule__URI__Group_4__2__Impl rule__URI__Group_4__3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4439:2: rule__URI__Group_4__2__Impl rule__URI__Group_4__3
            {
            pushFollow(FOLLOW_rule__URI__Group_4__2__Impl_in_rule__URI__Group_4__28916);
            rule__URI__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__3_in_rule__URI__Group_4__28919);
            rule__URI__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__2"


    // $ANTLR start "rule__URI__Group_4__2__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4446:1: rule__URI__Group_4__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4450:1: ( ( '}' ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4451:1: ( '}' )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4451:1: ( '}' )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4452:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,42,FOLLOW_42_in_rule__URI__Group_4__2__Impl8947); 
             after(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__2__Impl"


    // $ANTLR start "rule__URI__Group_4__3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4465:1: rule__URI__Group_4__3 : rule__URI__Group_4__3__Impl ;
    public final void rule__URI__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4469:1: ( rule__URI__Group_4__3__Impl )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4470:2: rule__URI__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_4__3__Impl_in_rule__URI__Group_4__38978);
            rule__URI__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__3"


    // $ANTLR start "rule__URI__Group_4__3__Impl"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4476:1: rule__URI__Group_4__3__Impl : ( ( rule__URI__QuerySuffixAssignment_4_3 ) ) ;
    public final void rule__URI__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4480:1: ( ( ( rule__URI__QuerySuffixAssignment_4_3 ) ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4481:1: ( ( rule__URI__QuerySuffixAssignment_4_3 ) )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4481:1: ( ( rule__URI__QuerySuffixAssignment_4_3 ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4482:1: ( rule__URI__QuerySuffixAssignment_4_3 )
            {
             before(grammarAccess.getURIAccess().getQuerySuffixAssignment_4_3()); 
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4483:1: ( rule__URI__QuerySuffixAssignment_4_3 )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4483:2: rule__URI__QuerySuffixAssignment_4_3
            {
            pushFollow(FOLLOW_rule__URI__QuerySuffixAssignment_4_3_in_rule__URI__Group_4__3__Impl9005);
            rule__URI__QuerySuffixAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getQuerySuffixAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_4__3__Impl"


    // $ANTLR start "rule__Mobgen__ResourcesAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4502:1: rule__Mobgen__ResourcesAssignment_0 : ( ruleMobgenResourceDefinition ) ;
    public final void rule__Mobgen__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4506:1: ( ( ruleMobgenResourceDefinition ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4507:1: ( ruleMobgenResourceDefinition )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4507:1: ( ruleMobgenResourceDefinition )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4508:1: ruleMobgenResourceDefinition
            {
             before(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_09048);
            ruleMobgenResourceDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__ResourcesAssignment_0"


    // $ANTLR start "rule__Mobgen__CallsAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4517:1: rule__Mobgen__CallsAssignment_1 : ( ruleMobgenCallDefinition ) ;
    public final void rule__Mobgen__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4521:1: ( ( ruleMobgenCallDefinition ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4522:1: ( ruleMobgenCallDefinition )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4522:1: ( ruleMobgenCallDefinition )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4523:1: ruleMobgenCallDefinition
            {
             before(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_19079);
            ruleMobgenCallDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__CallsAssignment_1"


    // $ANTLR start "rule__MobgenCallDefinition__NameAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4532:1: rule__MobgenCallDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenCallDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4536:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4537:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4537:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4538:1: RULE_ID
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_19110); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__NameAssignment_1"


    // $ANTLR start "rule__MobgenCallDefinition__MethodAssignment_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4547:1: rule__MobgenCallDefinition__MethodAssignment_3 : ( ruleRestfulMethods ) ;
    public final void rule__MobgenCallDefinition__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4551:1: ( ( ruleRestfulMethods ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4552:1: ( ruleRestfulMethods )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4552:1: ( ruleRestfulMethods )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4553:1: ruleRestfulMethods
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodRestfulMethodsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRestfulMethods_in_rule__MobgenCallDefinition__MethodAssignment_39141);
            ruleRestfulMethods();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionAccess().getMethodRestfulMethodsEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__MethodAssignment_3"


    // $ANTLR start "rule__MobgenCallDefinition__UriAssignment_5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4562:1: rule__MobgenCallDefinition__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__MobgenCallDefinition__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4566:1: ( ( ruleURI ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4567:1: ( ruleURI )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4567:1: ( ruleURI )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4568:1: ruleURI
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_59172);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__UriAssignment_5"


    // $ANTLR start "rule__MobgenCallDefinition__RequestHeadersAssignment_6_4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4577:1: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4581:1: ( ( ruleMobgenHeader ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4582:1: ( ruleMobgenHeader )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4582:1: ( ruleMobgenHeader )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4583:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_49203);
            ruleMobgenHeader();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__RequestHeadersAssignment_6_4"


    // $ANTLR start "rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4592:1: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4596:1: ( ( ruleMobgenHeader ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4597:1: ( ruleMobgenHeader )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4597:1: ( ruleMobgenHeader )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4598:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_29234);
            ruleMobgenHeader();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2"


    // $ANTLR start "rule__MobgenCallDefinition__JsonToClientAssignment_7_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4607:1: rule__MobgenCallDefinition__JsonToClientAssignment_7_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4611:1: ( ( ruleMobgenJson ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4612:1: ( ruleMobgenJson )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4612:1: ( ruleMobgenJson )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4613:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_29265);
            ruleMobgenJson();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__JsonToClientAssignment_7_2"


    // $ANTLR start "rule__MobgenCallDefinition__JsonToServerAssignment_8_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4622:1: rule__MobgenCallDefinition__JsonToServerAssignment_8_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToServerAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4626:1: ( ( ruleMobgenJson ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4627:1: ( ruleMobgenJson )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4627:1: ( ruleMobgenJson )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4628:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_29296);
            ruleMobgenJson();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__JsonToServerAssignment_8_2"


    // $ANTLR start "rule__MobgenHeader__NameAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4637:1: rule__MobgenHeader__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenHeader__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4641:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4642:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4642:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4643:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_09327); 
             after(grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__NameAssignment_0"


    // $ANTLR start "rule__MobgenHeader__HeaderKeyValuesAssignment_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4652:1: rule__MobgenHeader__HeaderKeyValuesAssignment_3 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4656:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4657:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4657:1: ( ruleMobgenHeaderKeyValuePair )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4658:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_39358);
            ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__HeaderKeyValuesAssignment_3"


    // $ANTLR start "rule__MobgenHeader__HeaderKeyValuesAssignment_4_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4667:1: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4671:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4672:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4672:1: ( ruleMobgenHeaderKeyValuePair )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4673:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_19389);
            ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeader__HeaderKeyValuesAssignment_4_1"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__KeyAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4682:1: rule__MobgenHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4686:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4687:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4687:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4688:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_09420); 
             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__KeyAssignment_0"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4697:1: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4701:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4702:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4702:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4703:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_09451); 
             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4712:1: rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 : ( ruleMobgenHeaderParameter ) ;
    public final void rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4716:1: ( ( ruleMobgenHeaderParameter ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4717:1: ( ruleMobgenHeaderParameter )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4717:1: ( ruleMobgenHeaderParameter )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4718:1: ruleMobgenHeaderParameter
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterMobgenHeaderParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_19482);
            ruleMobgenHeaderParameter();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterMobgenHeaderParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1"


    // $ANTLR start "rule__MobgenHeaderParameter__IdAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4727:1: rule__MobgenHeaderParameter__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenHeaderParameter__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4731:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4732:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4732:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4733:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeaderParameter__IdAssignment_19513); 
             after(grammarAccess.getMobgenHeaderParameterAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderParameter__IdAssignment_1"


    // $ANTLR start "rule__MobgenJson__NameAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4742:1: rule__MobgenJson__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenJson__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4746:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4747:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4747:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4748:1: RULE_ID
            {
             before(grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_09544); 
             after(grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__NameAssignment_0"


    // $ANTLR start "rule__MobgenJson__ValueAssignment_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4757:1: rule__MobgenJson__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__MobgenJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4761:1: ( ( ruleJsonObjectValue ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4762:1: ( ruleJsonObjectValue )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4762:1: ( ruleJsonObjectValue )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4763:1: ruleJsonObjectValue
            {
             before(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_29575);
            ruleJsonObjectValue();

            state._fsp--;

             after(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenJson__ValueAssignment_2"


    // $ANTLR start "rule__JsonObjectValue__ScalarAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4772:1: rule__JsonObjectValue__ScalarAssignment_0 : ( ruleJsonLiteralValue ) ;
    public final void rule__JsonObjectValue__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4776:1: ( ( ruleJsonLiteralValue ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4777:1: ( ruleJsonLiteralValue )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4777:1: ( ruleJsonLiteralValue )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4778:1: ruleJsonLiteralValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getScalarJsonLiteralValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ScalarAssignment_09606);
            ruleJsonLiteralValue();

            state._fsp--;

             after(grammarAccess.getJsonObjectValueAccess().getScalarJsonLiteralValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObjectValue__ScalarAssignment_0"


    // $ANTLR start "rule__JsonObjectValue__CompositeAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4787:1: rule__JsonObjectValue__CompositeAssignment_1 : ( ruleJsonCompositeValue ) ;
    public final void rule__JsonObjectValue__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4791:1: ( ( ruleJsonCompositeValue ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4792:1: ( ruleJsonCompositeValue )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4792:1: ( ruleJsonCompositeValue )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4793:1: ruleJsonCompositeValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_19637);
            ruleJsonCompositeValue();

            state._fsp--;

             after(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObjectValue__CompositeAssignment_1"


    // $ANTLR start "rule__JsonCompositeValue__ObjectValueAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4802:1: rule__JsonCompositeValue__ObjectValueAssignment_0 : ( ruleJsonObject ) ;
    public final void rule__JsonCompositeValue__ObjectValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4806:1: ( ( ruleJsonObject ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4807:1: ( ruleJsonObject )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4807:1: ( ruleJsonObject )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4808:1: ruleJsonObject
            {
             before(grammarAccess.getJsonCompositeValueAccess().getObjectValueJsonObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__ObjectValueAssignment_09668);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonCompositeValueAccess().getObjectValueJsonObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCompositeValue__ObjectValueAssignment_0"


    // $ANTLR start "rule__JsonCompositeValue__ArrayValueAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4817:1: rule__JsonCompositeValue__ArrayValueAssignment_1 : ( ruleJsonArray ) ;
    public final void rule__JsonCompositeValue__ArrayValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4821:1: ( ( ruleJsonArray ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4822:1: ( ruleJsonArray )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4822:1: ( ruleJsonArray )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4823:1: ruleJsonArray
            {
             before(grammarAccess.getJsonCompositeValueAccess().getArrayValueJsonArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__ArrayValueAssignment_19699);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonCompositeValueAccess().getArrayValueJsonArrayParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCompositeValue__ArrayValueAssignment_1"


    // $ANTLR start "rule__JsonLiteralValue__LiteralStringAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4832:1: rule__JsonLiteralValue__LiteralStringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonLiteralValue__LiteralStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4836:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4837:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4837:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4838:1: RULE_STRING
            {
             before(grammarAccess.getJsonLiteralValueAccess().getLiteralStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__LiteralStringAssignment_09730); 
             after(grammarAccess.getJsonLiteralValueAccess().getLiteralStringSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__LiteralStringAssignment_0"


    // $ANTLR start "rule__JsonLiteralValue__EmptyObjectAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4847:1: rule__JsonLiteralValue__EmptyObjectAssignment_1 : ( RULE_EMPTY_JSON_OBJECT ) ;
    public final void rule__JsonLiteralValue__EmptyObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4851:1: ( ( RULE_EMPTY_JSON_OBJECT ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4852:1: ( RULE_EMPTY_JSON_OBJECT )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4852:1: ( RULE_EMPTY_JSON_OBJECT )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4853:1: RULE_EMPTY_JSON_OBJECT
            {
             before(grammarAccess.getJsonLiteralValueAccess().getEmptyObjectEMPTY_JSON_OBJECTTerminalRuleCall_1_0()); 
            match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__EmptyObjectAssignment_19761); 
             after(grammarAccess.getJsonLiteralValueAccess().getEmptyObjectEMPTY_JSON_OBJECTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__EmptyObjectAssignment_1"


    // $ANTLR start "rule__JsonLiteralValue__EmptyArrayAssignment_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4862:1: rule__JsonLiteralValue__EmptyArrayAssignment_2 : ( RULE_EMPTY_JSON_ARRAY ) ;
    public final void rule__JsonLiteralValue__EmptyArrayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4866:1: ( ( RULE_EMPTY_JSON_ARRAY ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4867:1: ( RULE_EMPTY_JSON_ARRAY )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4867:1: ( RULE_EMPTY_JSON_ARRAY )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4868:1: RULE_EMPTY_JSON_ARRAY
            {
             before(grammarAccess.getJsonLiteralValueAccess().getEmptyArrayEMPTY_JSON_ARRAYTerminalRuleCall_2_0()); 
            match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__EmptyArrayAssignment_29792); 
             after(grammarAccess.getJsonLiteralValueAccess().getEmptyArrayEMPTY_JSON_ARRAYTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__EmptyArrayAssignment_2"


    // $ANTLR start "rule__JsonLiteralValue__LiteralNullAssignment_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4877:1: rule__JsonLiteralValue__LiteralNullAssignment_3 : ( RULE_JSON_LITERAL_NULL ) ;
    public final void rule__JsonLiteralValue__LiteralNullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4881:1: ( ( RULE_JSON_LITERAL_NULL ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4882:1: ( RULE_JSON_LITERAL_NULL )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4882:1: ( RULE_JSON_LITERAL_NULL )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4883:1: RULE_JSON_LITERAL_NULL
            {
             before(grammarAccess.getJsonLiteralValueAccess().getLiteralNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 
            match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__LiteralNullAssignment_39823); 
             after(grammarAccess.getJsonLiteralValueAccess().getLiteralNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__LiteralNullAssignment_3"


    // $ANTLR start "rule__JsonLiteralValue__NumberFloatAssignment_4"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4892:1: rule__JsonLiteralValue__NumberFloatAssignment_4 : ( RULE_JSON_NUMBER_FLOAT ) ;
    public final void rule__JsonLiteralValue__NumberFloatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4896:1: ( ( RULE_JSON_NUMBER_FLOAT ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4897:1: ( RULE_JSON_NUMBER_FLOAT )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4897:1: ( RULE_JSON_NUMBER_FLOAT )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4898:1: RULE_JSON_NUMBER_FLOAT
            {
             before(grammarAccess.getJsonLiteralValueAccess().getNumberFloatJSON_NUMBER_FLOATTerminalRuleCall_4_0()); 
            match(input,RULE_JSON_NUMBER_FLOAT,FOLLOW_RULE_JSON_NUMBER_FLOAT_in_rule__JsonLiteralValue__NumberFloatAssignment_49854); 
             after(grammarAccess.getJsonLiteralValueAccess().getNumberFloatJSON_NUMBER_FLOATTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__NumberFloatAssignment_4"


    // $ANTLR start "rule__JsonLiteralValue__NumberIntegerAssignment_5"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4907:1: rule__JsonLiteralValue__NumberIntegerAssignment_5 : ( RULE_INT ) ;
    public final void rule__JsonLiteralValue__NumberIntegerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4911:1: ( ( RULE_INT ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4912:1: ( RULE_INT )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4912:1: ( RULE_INT )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4913:1: RULE_INT
            {
             before(grammarAccess.getJsonLiteralValueAccess().getNumberIntegerINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonLiteralValue__NumberIntegerAssignment_59885); 
             after(grammarAccess.getJsonLiteralValueAccess().getNumberIntegerINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__NumberIntegerAssignment_5"


    // $ANTLR start "rule__JsonLiteralValue__EnumTypeAssignment_6"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4922:1: rule__JsonLiteralValue__EnumTypeAssignment_6 : ( ruleJsonEnumType ) ;
    public final void rule__JsonLiteralValue__EnumTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4926:1: ( ( ruleJsonEnumType ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4927:1: ( ruleJsonEnumType )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4927:1: ( ruleJsonEnumType )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4928:1: ruleJsonEnumType
            {
             before(grammarAccess.getJsonLiteralValueAccess().getEnumTypeJsonEnumTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleJsonEnumType_in_rule__JsonLiteralValue__EnumTypeAssignment_69916);
            ruleJsonEnumType();

            state._fsp--;

             after(grammarAccess.getJsonLiteralValueAccess().getEnumTypeJsonEnumTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__EnumTypeAssignment_6"


    // $ANTLR start "rule__JsonLiteralValue__BooleanValueAssignment_7"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4937:1: rule__JsonLiteralValue__BooleanValueAssignment_7 : ( ruleJsonLiteralBoolean ) ;
    public final void rule__JsonLiteralValue__BooleanValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4941:1: ( ( ruleJsonLiteralBoolean ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4942:1: ( ruleJsonLiteralBoolean )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4942:1: ( ruleJsonLiteralBoolean )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4943:1: ruleJsonLiteralBoolean
            {
             before(grammarAccess.getJsonLiteralValueAccess().getBooleanValueJsonLiteralBooleanEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleJsonLiteralBoolean_in_rule__JsonLiteralValue__BooleanValueAssignment_79947);
            ruleJsonLiteralBoolean();

            state._fsp--;

             after(grammarAccess.getJsonLiteralValueAccess().getBooleanValueJsonLiteralBooleanEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__BooleanValueAssignment_7"


    // $ANTLR start "rule__JsonLiteralValue__MetaScalarValueAssignment_8"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4952:1: rule__JsonLiteralValue__MetaScalarValueAssignment_8 : ( ruleJsonMetaScalarType ) ;
    public final void rule__JsonLiteralValue__MetaScalarValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4956:1: ( ( ruleJsonMetaScalarType ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4957:1: ( ruleJsonMetaScalarType )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4957:1: ( ruleJsonMetaScalarType )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4958:1: ruleJsonMetaScalarType
            {
             before(grammarAccess.getJsonLiteralValueAccess().getMetaScalarValueJsonMetaScalarTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_rule__JsonLiteralValue__MetaScalarValueAssignment_89978);
            ruleJsonMetaScalarType();

            state._fsp--;

             after(grammarAccess.getJsonLiteralValueAccess().getMetaScalarValueJsonMetaScalarTypeEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonLiteralValue__MetaScalarValueAssignment_8"


    // $ANTLR start "rule__JsonObject__KeyValuePairAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4967:1: rule__JsonObject__KeyValuePairAssignment_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4971:1: ( ( ruleJsonKeyValuePair ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4972:1: ( ruleJsonKeyValuePair )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4972:1: ( ruleJsonKeyValuePair )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4973:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_110009);
            ruleJsonKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__KeyValuePairAssignment_1"


    // $ANTLR start "rule__JsonObject__KeyValuePairAssignment_2_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4982:1: rule__JsonObject__KeyValuePairAssignment_2_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4986:1: ( ( ruleJsonKeyValuePair ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4987:1: ( ruleJsonKeyValuePair )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4987:1: ( ruleJsonKeyValuePair )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4988:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_110040);
            ruleJsonKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__KeyValuePairAssignment_2_1"


    // $ANTLR start "rule__JsonKeyValuePair__KeyAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:4997:1: rule__JsonKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5001:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5002:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5002:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5003:1: RULE_STRING
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_010071); 
             after(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__KeyAssignment_0"


    // $ANTLR start "rule__JsonKeyValuePair__ValueAssignment_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5012:1: rule__JsonKeyValuePair__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5016:1: ( ( ruleJsonObjectValue ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5017:1: ( ruleJsonObjectValue )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5017:1: ( ruleJsonObjectValue )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5018:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_210102);
            ruleJsonObjectValue();

            state._fsp--;

             after(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonKeyValuePair__ValueAssignment_2"


    // $ANTLR start "rule__JsonArray__ItemsAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5027:1: rule__JsonArray__ItemsAssignment_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5031:1: ( ( ruleJsonObjectValue ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5032:1: ( ruleJsonObjectValue )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5032:1: ( ruleJsonObjectValue )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5033:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_110133);
            ruleJsonObjectValue();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ItemsAssignment_1"


    // $ANTLR start "rule__JsonArray__ItemsAssignment_2_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5042:1: rule__JsonArray__ItemsAssignment_2_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5046:1: ( ( ruleJsonObjectValue ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5047:1: ( ruleJsonObjectValue )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5047:1: ( ruleJsonObjectValue )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5048:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_110164);
            ruleJsonObjectValue();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ItemsAssignment_2_1"


    // $ANTLR start "rule__EnumInstance__NameAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5057:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5061:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5062:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5062:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5063:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_110195); 
             after(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__NameAssignment_1"


    // $ANTLR start "rule__EnumInstance__ValuesAssignment_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5072:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5076:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5077:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5077:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5078:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_310226); 
             after(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__ValuesAssignment_3"


    // $ANTLR start "rule__EnumInstance__ValuesAssignment_4_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5087:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5091:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5092:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5092:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5093:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_110257); 
             after(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__ValuesAssignment_4_1"


    // $ANTLR start "rule__MapInstance__NameAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5102:1: rule__MapInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5106:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5107:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5107:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5108:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_110288); 
             after(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__NameAssignment_1"


    // $ANTLR start "rule__MapInstance__KeysAssignment_3_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5117:1: rule__MapInstance__KeysAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5121:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5122:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5122:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5123:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_010319); 
             after(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__KeysAssignment_3_0"


    // $ANTLR start "rule__MapInstance__ValuesAssignment_3_2"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5132:1: rule__MapInstance__ValuesAssignment_3_2 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5136:1: ( ( ruleNestedType ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5137:1: ( ruleNestedType )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5137:1: ( ruleNestedType )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5138:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_210350);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__ValuesAssignment_3_2"


    // $ANTLR start "rule__MapInstance__KeysAssignment_4_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5147:1: rule__MapInstance__KeysAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5151:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5152:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5152:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5153:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_110381); 
             after(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__KeysAssignment_4_1"


    // $ANTLR start "rule__MapInstance__ValuesAssignment_4_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5162:1: rule__MapInstance__ValuesAssignment_4_3 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5166:1: ( ( ruleNestedType ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5167:1: ( ruleNestedType )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5167:1: ( ruleNestedType )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5168:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_310412);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__ValuesAssignment_4_3"


    // $ANTLR start "rule__StringList__ValuesAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5177:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5181:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5182:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5182:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5183:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_110443); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_1"


    // $ANTLR start "rule__StringList__ValuesAssignment_2_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5192:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5196:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5197:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5197:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5198:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_110474); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_2_1"


    // $ANTLR start "rule__NestedType__ListAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5207:1: rule__NestedType__ListAssignment_0 : ( ruleStringList ) ;
    public final void rule__NestedType__ListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5211:1: ( ( ruleStringList ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5212:1: ( ruleStringList )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5212:1: ( ruleStringList )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5213:1: ruleStringList
            {
             before(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_010505);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedType__ListAssignment_0"


    // $ANTLR start "rule__NestedType__StringAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5222:1: rule__NestedType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NestedType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5226:1: ( ( RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5227:1: ( RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5227:1: ( RULE_STRING )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5228:1: RULE_STRING
            {
             before(grammarAccess.getNestedTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_110536); 
             after(grammarAccess.getNestedTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedType__StringAssignment_1"


    // $ANTLR start "rule__URI__UrlPrefixAssignment_0"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5237:1: rule__URI__UrlPrefixAssignment_0 : ( RULE_URL_PREFIX ) ;
    public final void rule__URI__UrlPrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5241:1: ( ( RULE_URL_PREFIX ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5242:1: ( RULE_URL_PREFIX )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5242:1: ( RULE_URL_PREFIX )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5243:1: RULE_URL_PREFIX
            {
             before(grammarAccess.getURIAccess().getUrlPrefixURL_PREFIXTerminalRuleCall_0_0()); 
            match(input,RULE_URL_PREFIX,FOLLOW_RULE_URL_PREFIX_in_rule__URI__UrlPrefixAssignment_010567); 
             after(grammarAccess.getURIAccess().getUrlPrefixURL_PREFIXTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__UrlPrefixAssignment_0"


    // $ANTLR start "rule__URI__PathAssignment_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5252:1: rule__URI__PathAssignment_1 : ( RULE_URL_PATH ) ;
    public final void rule__URI__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5256:1: ( ( RULE_URL_PATH ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5257:1: ( RULE_URL_PATH )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5257:1: ( RULE_URL_PATH )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5258:1: RULE_URL_PATH
            {
             before(grammarAccess.getURIAccess().getPathURL_PATHTerminalRuleCall_1_0()); 
            match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_rule__URI__PathAssignment_110598); 
             after(grammarAccess.getURIAccess().getPathURL_PATHTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__PathAssignment_1"


    // $ANTLR start "rule__URI__PathParametersAssignment_2_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5267:1: rule__URI__PathParametersAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__URI__PathParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5271:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5272:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5272:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5273:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getPathParametersIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__PathParametersAssignment_2_110629); 
             after(grammarAccess.getURIAccess().getPathParametersIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__PathParametersAssignment_2_1"


    // $ANTLR start "rule__URI__PathSuffixAssignment_2_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5282:1: rule__URI__PathSuffixAssignment_2_3 : ( RULE_URL_PATH ) ;
    public final void rule__URI__PathSuffixAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5286:1: ( ( RULE_URL_PATH ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5287:1: ( RULE_URL_PATH )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5287:1: ( RULE_URL_PATH )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5288:1: RULE_URL_PATH
            {
             before(grammarAccess.getURIAccess().getPathSuffixURL_PATHTerminalRuleCall_2_3_0()); 
            match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_rule__URI__PathSuffixAssignment_2_310660); 
             after(grammarAccess.getURIAccess().getPathSuffixURL_PATHTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__PathSuffixAssignment_2_3"


    // $ANTLR start "rule__URI__QueryAssignment_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5297:1: rule__URI__QueryAssignment_3 : ( RULE_URL_QUERY ) ;
    public final void rule__URI__QueryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5301:1: ( ( RULE_URL_QUERY ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5302:1: ( RULE_URL_QUERY )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5302:1: ( RULE_URL_QUERY )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5303:1: RULE_URL_QUERY
            {
             before(grammarAccess.getURIAccess().getQueryURL_QUERYTerminalRuleCall_3_0()); 
            match(input,RULE_URL_QUERY,FOLLOW_RULE_URL_QUERY_in_rule__URI__QueryAssignment_310691); 
             after(grammarAccess.getURIAccess().getQueryURL_QUERYTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__QueryAssignment_3"


    // $ANTLR start "rule__URI__QueryParametersAssignment_4_1"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5312:1: rule__URI__QueryParametersAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__URI__QueryParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5316:1: ( ( RULE_ID ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5317:1: ( RULE_ID )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5317:1: ( RULE_ID )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5318:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getQueryParametersIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__QueryParametersAssignment_4_110722); 
             after(grammarAccess.getURIAccess().getQueryParametersIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__QueryParametersAssignment_4_1"


    // $ANTLR start "rule__URI__QuerySuffixAssignment_4_3"
    // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5327:1: rule__URI__QuerySuffixAssignment_4_3 : ( RULE_URL_QUERY_SUFFIX ) ;
    public final void rule__URI__QuerySuffixAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5331:1: ( ( RULE_URL_QUERY_SUFFIX ) )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5332:1: ( RULE_URL_QUERY_SUFFIX )
            {
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5332:1: ( RULE_URL_QUERY_SUFFIX )
            // ../nl.sison.dsl.mobgen.Restful.ui/src-gen/nl/sison/dsl/mobgen/ui/contentassist/antlr/internal/InternalRestful.g:5333:1: RULE_URL_QUERY_SUFFIX
            {
             before(grammarAccess.getURIAccess().getQuerySuffixURL_QUERY_SUFFIXTerminalRuleCall_4_3_0()); 
            match(input,RULE_URL_QUERY_SUFFIX,FOLLOW_RULE_URL_QUERY_SUFFIX_in_rule__URI__QuerySuffixAssignment_4_310753); 
             after(grammarAccess.getURIAccess().getQuerySuffixURL_QUERY_SUFFIXTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__QuerySuffixAssignment_4_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMobgen_in_entryRuleMobgen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Alternatives_in_ruleMobgen94 = new BitSet(new long[]{0x0000C00010000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenCallDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__0_in_ruleMobgenCallDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeader189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0_in_ruleMobgenHeader215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0_in_ruleMobgenHeaderKeyValuePair275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderParameter309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__0_in_ruleMobgenHeaderParameter335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenJson369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0_in_ruleMobgenJson395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__Alternatives_in_ruleJsonObjectValue455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeValue489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeValue__Alternatives_in_ruleJsonCompositeValue515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonLiteralValue549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__Alternatives_in_ruleJsonLiteralValue575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0_in_ruleJsonArray755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonEnumType_in_entryRuleJsonEnumType782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonEnumType789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__0_in_ruleJsonEnumType815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0_in_ruleStringList1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestfulMethods__Alternatives_in_ruleRestfulMethods1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralBoolean__Alternatives_in_ruleJsonLiteralBoolean1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__ResourcesAssignment_0_in_rule__Mobgen__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__CallsAssignment_1_in_rule__Mobgen__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__ScalarAssignment_0_in_rule__JsonObjectValue__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeValue__ObjectValueAssignment_0_in_rule__JsonCompositeValue__Alternatives1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeValue__ArrayValueAssignment_1_in_rule__JsonCompositeValue__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__LiteralStringAssignment_0_in_rule__JsonLiteralValue__Alternatives1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__EmptyObjectAssignment_1_in_rule__JsonLiteralValue__Alternatives1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__EmptyArrayAssignment_2_in_rule__JsonLiteralValue__Alternatives1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__LiteralNullAssignment_3_in_rule__JsonLiteralValue__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__NumberFloatAssignment_4_in_rule__JsonLiteralValue__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__NumberIntegerAssignment_5_in_rule__JsonLiteralValue__Alternatives1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__EnumTypeAssignment_6_in_rule__JsonLiteralValue__Alternatives1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__BooleanValueAssignment_7_in_rule__JsonLiteralValue__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__MetaScalarValueAssignment_8_in_rule__JsonLiteralValue__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__Alternatives1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RestfulMethods__Alternatives1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RestfulMethods__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RestfulMethods__Alternatives1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RestfulMethods__Alternatives1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonMetaScalarType__Alternatives1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonMetaScalarType__Alternatives1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__JsonMetaScalarType__Alternatives1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JsonLiteralBoolean__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__JsonLiteralBoolean__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MobgenCallDefinition__Group__0__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12094 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22154 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MobgenCallDefinition__Group__2__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32216 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42276 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MobgenCallDefinition__Group__4__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52338 = new BitSet(new long[]{0x0000005080000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62398 = new BitSet(new long[]{0x0000005080000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72459 = new BitSet(new long[]{0x0000005080000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02596 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MobgenCallDefinition__Group_6__0__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12658 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenCallDefinition__Group_6__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22720 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MobgenCallDefinition__Group_6__2__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MobgenCallDefinition__Group_6__3__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42844 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__02974 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__02977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03161 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MobgenCallDefinition__Group_7__0__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MobgenCallDefinition__Group_7__1__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03348 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MobgenCallDefinition__Group_8__0__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MobgenCallDefinition__Group_8__1__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__03535 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__03538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__13595 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__13598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenHeader__Group__1__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__23657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__23660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MobgenHeader__Group__2__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__33719 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__33722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__43779 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__43782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl3809 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__53840 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__53843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MobgenHeader__Group__5__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__63905 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__63908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MobgenHeader__Group__6__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__73967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenHeader__Group__7__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MobgenHeader__Group_4__0__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04165 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14225 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__0__Impl_in_rule__MobgenHeaderParameter__Group__04350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__1_in_rule__MobgenHeaderParameter__Group__04353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MobgenHeaderParameter__Group__0__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__1__Impl_in_rule__MobgenHeaderParameter__Group__14412 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__2_in_rule__MobgenHeaderParameter__Group__14415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__IdAssignment_1_in_rule__MobgenHeaderParameter__Group__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__2__Impl_in_rule__MobgenHeaderParameter__Group__24472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MobgenHeaderParameter__Group__2__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04537 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14597 = new BitSet(new long[]{0x000051000F8007D0L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenJson__Group__1__Impl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__24659 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__24662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__34719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenJson__Group__3__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__04786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__04789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__JsonObject__Group__0__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__14848 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__14851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__24908 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__24911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl4938 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__34969 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__34972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonObject__Group__3__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__JsonObject__Group__4__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonObject__Group_2__0__Impl5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05226 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15286 = new BitSet(new long[]{0x000051000F8007D0L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__JsonKeyValuePair__Group__1__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05411 = new BitSet(new long[]{0x000051000F8007D0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__JsonArray__Group__0__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15473 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25533 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5563 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35594 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonArray__Group__3__Impl5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__45659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__JsonArray__Group__4__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__05728 = new BitSet(new long[]{0x000051000F8007D0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__05731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonArray__Group_2__0__Impl5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__15790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__0__Impl_in_rule__JsonEnumType__Group__05851 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__1_in_rule__JsonEnumType__Group__05854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__JsonEnumType__Group__0__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__1__Impl_in_rule__JsonEnumType__Group__15913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__2_in_rule__JsonEnumType__Group__15916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__JsonEnumType__Group__1__Impl5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__2__Impl_in_rule__JsonEnumType__Group__25975 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__3_in_rule__JsonEnumType__Group__25978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonEnumType__Group__2__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__3__Impl_in_rule__JsonEnumType__Group__36034 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__4_in_rule__JsonEnumType__Group__36037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group_3__0_in_rule__JsonEnumType__Group__3__Impl6064 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__4__Impl_in_rule__JsonEnumType__Group__46095 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__5_in_rule__JsonEnumType__Group__46098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonEnumType__Group__4__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group__5__Impl_in_rule__JsonEnumType__Group__56160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__JsonEnumType__Group__5__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group_3__0__Impl_in_rule__JsonEnumType__Group_3__06231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group_3__1_in_rule__JsonEnumType__Group_3__06234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonEnumType__Group_3__0__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonEnumType__Group_3__1__Impl_in_rule__JsonEnumType__Group_3__16293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonEnumType__Group_3__1__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EnumInstance__Group__0__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16415 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26475 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumInstance__Group__2__Impl6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36537 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46597 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6627 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56658 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumInstance__Group__5__Impl6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumInstance__Group__6__Impl6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumInstance__Group_4__0__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MapInstance__Group__0__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16981 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__27041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__27044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MapInstance__Group__2__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__37103 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__37106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__47163 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__47166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl7193 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__57224 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__57227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MapInstance__Group__5__Impl7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__67289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MapInstance__Group__6__Impl7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07362 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17422 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MapInstance__Group_3__1__Impl7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MapInstance__Group_4__0__Impl7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17609 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27669 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MapInstance__Group_4__2__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StringList__Group__0__Impl7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17858 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27918 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7948 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37979 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StringList__Group__3__Impl8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__48044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__StringList__Group__4__Impl8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__08113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__08116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StringList__Group_2__0__Impl8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__08236 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__08239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__UrlPrefixAssignment_0_in_rule__URI__Group__0__Impl8266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__18296 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__18299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathAssignment_1_in_rule__URI__Group__1__Impl8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__28356 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_rule__URI__Group__3_in_rule__URI__Group__28359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl8386 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__38417 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__URI__Group__4_in_rule__URI__Group__38420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QueryAssignment_3_in_rule__URI__Group__3__Impl8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__48477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl8504 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__08545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__08548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__URI__Group_2__0__Impl8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__18607 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__URI__Group_2__2_in_rule__URI__Group_2__18610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathParametersAssignment_2_1_in_rule__URI__Group_2__1__Impl8637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__2__Impl_in_rule__URI__Group_2__28667 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__URI__Group_2__3_in_rule__URI__Group_2__28670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__URI__Group_2__2__Impl8698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__3__Impl_in_rule__URI__Group_2__38729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathSuffixAssignment_2_3_in_rule__URI__Group_2__3__Impl8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__08794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__08797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__URI__Group_4__0__Impl8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__18856 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__URI__Group_4__2_in_rule__URI__Group_4__18859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QueryParametersAssignment_4_1_in_rule__URI__Group_4__1__Impl8886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__2__Impl_in_rule__URI__Group_4__28916 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__URI__Group_4__3_in_rule__URI__Group_4__28919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__URI__Group_4__2__Impl8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__3__Impl_in_rule__URI__Group_4__38978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QuerySuffixAssignment_4_3_in_rule__URI__Group_4__3__Impl9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_09048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_19079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_19110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestfulMethods_in_rule__MobgenCallDefinition__MethodAssignment_39141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_59172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_49203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_29234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_29265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_29296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_09327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_39358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_19389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_09420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_09451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_19482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeaderParameter__IdAssignment_19513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_09544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_29575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ScalarAssignment_09606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_19637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__ObjectValueAssignment_09668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__ArrayValueAssignment_19699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__LiteralStringAssignment_09730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__EmptyObjectAssignment_19761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__EmptyArrayAssignment_29792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__LiteralNullAssignment_39823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_FLOAT_in_rule__JsonLiteralValue__NumberFloatAssignment_49854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonLiteralValue__NumberIntegerAssignment_59885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonEnumType_in_rule__JsonLiteralValue__EnumTypeAssignment_69916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralBoolean_in_rule__JsonLiteralValue__BooleanValueAssignment_79947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_rule__JsonLiteralValue__MetaScalarValueAssignment_89978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_110009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_110040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_010071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_210102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_110133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_110164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_110195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_310226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_110257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_110288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_010319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_210350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_110381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_310412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_110443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_110474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_010505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_110536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PREFIX_in_rule__URI__UrlPrefixAssignment_010567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_rule__URI__PathAssignment_110598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__PathParametersAssignment_2_110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_rule__URI__PathSuffixAssignment_2_310660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_in_rule__URI__QueryAssignment_310691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__QueryParametersAssignment_4_110722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_SUFFIX_in_rule__URI__QuerySuffixAssignment_4_310753 = new BitSet(new long[]{0x0000000000000002L});

}