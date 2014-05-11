package nl.sison.dsl.ui.contentassist.antlr.internal; 

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
import nl.sison.dsl.services.MobgenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMobgenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_NULL", "RULE_JSON_NUMBER", "RULE_ID", "RULE_URL_PREFIX", "RULE_URL_PATH", "RULE_URL_QUERY", "RULE_URL_QUERY_SUFFIX", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PUT'", "'POST'", "'GET'", "'DELETE'", "'boolean'", "'number'", "'string'", "'true'", "'false'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "'{'", "','", "'}'", "'='", "'['", "']'", "'enum'", "'map'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_EMPTY_JSON_ARRAY=6;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_URL_QUERY=12;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_JSON_NUMBER=8;
    public static final int RULE_URL_PATH=11;
    public static final int RULE_INT=14;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_EMPTY_JSON_OBJECT=5;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_ML_COMMENT=15;
    public static final int RULE_URL_PREFIX=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_JSON_LITERAL_NULL=7;
    public static final int T__39=39;
    public static final int RULE_WS=17;
    public static final int RULE_URL_QUERY_SUFFIX=13;

    // delegates
    // delegators


        public InternalMobgenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMobgenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMobgenParser.tokenNames; }
    public String getGrammarFileName() { return "../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g"; }


     
     	private MobgenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MobgenGrammarAccess grammarAccess) {
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:60:1: entryRuleMobgen : ruleMobgen EOF ;
    public final void entryRuleMobgen() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:61:1: ( ruleMobgen EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:62:1: ruleMobgen EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:69:1: ruleMobgen : ( ( rule__Mobgen__Alternatives )* ) ;
    public final void ruleMobgen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:73:2: ( ( ( rule__Mobgen__Alternatives )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:74:1: ( ( rule__Mobgen__Alternatives )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:74:1: ( ( rule__Mobgen__Alternatives )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:75:1: ( rule__Mobgen__Alternatives )*
            {
             before(grammarAccess.getMobgenAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:76:1: ( rule__Mobgen__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28||(LA1_0>=46 && LA1_0<=47)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:76:2: rule__Mobgen__Alternatives
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:88:1: entryRuleMobgenCallDefinition : ruleMobgenCallDefinition EOF ;
    public final void entryRuleMobgenCallDefinition() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:89:1: ( ruleMobgenCallDefinition EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:90:1: ruleMobgenCallDefinition EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:97:1: ruleMobgenCallDefinition : ( ( rule__MobgenCallDefinition__Group__0 ) ) ;
    public final void ruleMobgenCallDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:101:2: ( ( ( rule__MobgenCallDefinition__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:102:1: ( ( rule__MobgenCallDefinition__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:102:1: ( ( rule__MobgenCallDefinition__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:103:1: ( rule__MobgenCallDefinition__Group__0 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:104:1: ( rule__MobgenCallDefinition__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:104:2: rule__MobgenCallDefinition__Group__0
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:116:1: entryRuleMobgenHeader : ruleMobgenHeader EOF ;
    public final void entryRuleMobgenHeader() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:117:1: ( ruleMobgenHeader EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:118:1: ruleMobgenHeader EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:125:1: ruleMobgenHeader : ( ( rule__MobgenHeader__Group__0 ) ) ;
    public final void ruleMobgenHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:129:2: ( ( ( rule__MobgenHeader__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:130:1: ( ( rule__MobgenHeader__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:130:1: ( ( rule__MobgenHeader__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:131:1: ( rule__MobgenHeader__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:132:1: ( rule__MobgenHeader__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:132:2: rule__MobgenHeader__Group__0
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:144:1: entryRuleMobgenHeaderKeyValuePair : ruleMobgenHeaderKeyValuePair EOF ;
    public final void entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:145:1: ( ruleMobgenHeaderKeyValuePair EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:146:1: ruleMobgenHeaderKeyValuePair EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:153:1: ruleMobgenHeaderKeyValuePair : ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) ;
    public final void ruleMobgenHeaderKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:157:2: ( ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:158:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:158:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:159:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:160:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:160:2: rule__MobgenHeaderKeyValuePair__Group__0
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:172:1: entryRuleMobgenHeaderParameter : ruleMobgenHeaderParameter EOF ;
    public final void entryRuleMobgenHeaderParameter() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:173:1: ( ruleMobgenHeaderParameter EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:174:1: ruleMobgenHeaderParameter EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:181:1: ruleMobgenHeaderParameter : ( ( rule__MobgenHeaderParameter__Group__0 ) ) ;
    public final void ruleMobgenHeaderParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:185:2: ( ( ( rule__MobgenHeaderParameter__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:186:1: ( ( rule__MobgenHeaderParameter__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:186:1: ( ( rule__MobgenHeaderParameter__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:187:1: ( rule__MobgenHeaderParameter__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:188:1: ( rule__MobgenHeaderParameter__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:188:2: rule__MobgenHeaderParameter__Group__0
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:200:1: entryRuleMobgenJson : ruleMobgenJson EOF ;
    public final void entryRuleMobgenJson() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:201:1: ( ruleMobgenJson EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:202:1: ruleMobgenJson EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:209:1: ruleMobgenJson : ( ( rule__MobgenJson__Group__0 ) ) ;
    public final void ruleMobgenJson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:213:2: ( ( ( rule__MobgenJson__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:214:1: ( ( rule__MobgenJson__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:214:1: ( ( rule__MobgenJson__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:215:1: ( rule__MobgenJson__Group__0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:216:1: ( rule__MobgenJson__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:216:2: rule__MobgenJson__Group__0
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:228:1: entryRuleJsonObjectValue : ruleJsonObjectValue EOF ;
    public final void entryRuleJsonObjectValue() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:229:1: ( ruleJsonObjectValue EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:230:1: ruleJsonObjectValue EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:237:1: ruleJsonObjectValue : ( ( rule__JsonObjectValue__Alternatives ) ) ;
    public final void ruleJsonObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:241:2: ( ( ( rule__JsonObjectValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:242:1: ( ( rule__JsonObjectValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:242:1: ( ( rule__JsonObjectValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:243:1: ( rule__JsonObjectValue__Alternatives )
            {
             before(grammarAccess.getJsonObjectValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:244:1: ( rule__JsonObjectValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:244:2: rule__JsonObjectValue__Alternatives
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:256:1: entryRuleJsonCompositeValue : ruleJsonCompositeValue EOF ;
    public final void entryRuleJsonCompositeValue() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:257:1: ( ruleJsonCompositeValue EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:258:1: ruleJsonCompositeValue EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:265:1: ruleJsonCompositeValue : ( ( rule__JsonCompositeValue__Alternatives ) ) ;
    public final void ruleJsonCompositeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:269:2: ( ( ( rule__JsonCompositeValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:270:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:270:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:271:1: ( rule__JsonCompositeValue__Alternatives )
            {
             before(grammarAccess.getJsonCompositeValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:272:1: ( rule__JsonCompositeValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:272:2: rule__JsonCompositeValue__Alternatives
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:284:1: entryRuleJsonLiteralValue : ruleJsonLiteralValue EOF ;
    public final void entryRuleJsonLiteralValue() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:285:1: ( ruleJsonLiteralValue EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:286:1: ruleJsonLiteralValue EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:293:1: ruleJsonLiteralValue : ( ( rule__JsonLiteralValue__Alternatives ) ) ;
    public final void ruleJsonLiteralValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:297:2: ( ( ( rule__JsonLiteralValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:298:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:298:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:299:1: ( rule__JsonLiteralValue__Alternatives )
            {
             before(grammarAccess.getJsonLiteralValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:300:1: ( rule__JsonLiteralValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:300:2: rule__JsonLiteralValue__Alternatives
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:312:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:313:1: ( ruleJsonObject EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:314:1: ruleJsonObject EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:321:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:325:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:326:1: ( ( rule__JsonObject__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:326:1: ( ( rule__JsonObject__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:327:1: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:328:1: ( rule__JsonObject__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:328:2: rule__JsonObject__Group__0
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:340:1: entryRuleJsonKeyValuePair : ruleJsonKeyValuePair EOF ;
    public final void entryRuleJsonKeyValuePair() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:341:1: ( ruleJsonKeyValuePair EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:342:1: ruleJsonKeyValuePair EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:349:1: ruleJsonKeyValuePair : ( ( rule__JsonKeyValuePair__Group__0 ) ) ;
    public final void ruleJsonKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:353:2: ( ( ( rule__JsonKeyValuePair__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:354:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:354:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:355:1: ( rule__JsonKeyValuePair__Group__0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:356:1: ( rule__JsonKeyValuePair__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:356:2: rule__JsonKeyValuePair__Group__0
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:368:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:369:1: ( ruleJsonArray EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:370:1: ruleJsonArray EOF
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:377:1: ruleJsonArray : ( ( rule__JsonArray__Group__0 ) ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:381:2: ( ( ( rule__JsonArray__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:382:1: ( ( rule__JsonArray__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:382:1: ( ( rule__JsonArray__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:383:1: ( rule__JsonArray__Group__0 )
            {
             before(grammarAccess.getJsonArrayAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:384:1: ( rule__JsonArray__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:384:2: rule__JsonArray__Group__0
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


    // $ANTLR start "entryRuleMobgenResourceDefinition"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:396:1: entryRuleMobgenResourceDefinition : ruleMobgenResourceDefinition EOF ;
    public final void entryRuleMobgenResourceDefinition() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:397:1: ( ruleMobgenResourceDefinition EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:398:1: ruleMobgenResourceDefinition EOF
            {
             before(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition782);
            ruleMobgenResourceDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenResourceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition789); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:405:1: ruleMobgenResourceDefinition : ( ( rule__MobgenResourceDefinition__Alternatives ) ) ;
    public final void ruleMobgenResourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:409:2: ( ( ( rule__MobgenResourceDefinition__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:410:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:410:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:411:1: ( rule__MobgenResourceDefinition__Alternatives )
            {
             before(grammarAccess.getMobgenResourceDefinitionAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:412:1: ( rule__MobgenResourceDefinition__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:412:2: rule__MobgenResourceDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition815);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:424:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:425:1: ( ruleEnumInstance EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:426:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance842);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance849); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:433:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:437:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:438:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:438:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:439:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:440:1: ( rule__EnumInstance__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:440:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance875);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:452:1: entryRuleMapInstance : ruleMapInstance EOF ;
    public final void entryRuleMapInstance() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:453:1: ( ruleMapInstance EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:454:1: ruleMapInstance EOF
            {
             before(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance902);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMapInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance909); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:461:1: ruleMapInstance : ( ( rule__MapInstance__Group__0 ) ) ;
    public final void ruleMapInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:465:2: ( ( ( rule__MapInstance__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:466:1: ( ( rule__MapInstance__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:466:1: ( ( rule__MapInstance__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:467:1: ( rule__MapInstance__Group__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:468:1: ( rule__MapInstance__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:468:2: rule__MapInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance935);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:480:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:481:1: ( ruleStringList EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:482:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList962);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList969); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:489:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:493:2: ( ( ( rule__StringList__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:494:1: ( ( rule__StringList__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:494:1: ( ( rule__StringList__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:495:1: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:496:1: ( rule__StringList__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:496:2: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_rule__StringList__Group__0_in_ruleStringList995);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:508:1: entryRuleNestedType : ruleNestedType EOF ;
    public final void entryRuleNestedType() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:509:1: ( ruleNestedType EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:510:1: ruleNestedType EOF
            {
             before(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType1022);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getNestedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType1029); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:517:1: ruleNestedType : ( ( rule__NestedType__Alternatives ) ) ;
    public final void ruleNestedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:521:2: ( ( ( rule__NestedType__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:522:1: ( ( rule__NestedType__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:522:1: ( ( rule__NestedType__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:523:1: ( rule__NestedType__Alternatives )
            {
             before(grammarAccess.getNestedTypeAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:524:1: ( rule__NestedType__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:524:2: rule__NestedType__Alternatives
            {
            pushFollow(FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1055);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:536:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:537:1: ( ruleURI EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:538:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI1082);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI1089); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:545:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:549:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:550:1: ( ( rule__URI__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:550:1: ( ( rule__URI__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:551:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:552:1: ( rule__URI__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:552:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI1115);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:565:1: ruleRestfulMethods : ( ( rule__RestfulMethods__Alternatives ) ) ;
    public final void ruleRestfulMethods() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:569:1: ( ( ( rule__RestfulMethods__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:570:1: ( ( rule__RestfulMethods__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:570:1: ( ( rule__RestfulMethods__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:571:1: ( rule__RestfulMethods__Alternatives )
            {
             before(grammarAccess.getRestfulMethodsAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:572:1: ( rule__RestfulMethods__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:572:2: rule__RestfulMethods__Alternatives
            {
            pushFollow(FOLLOW_rule__RestfulMethods__Alternatives_in_ruleRestfulMethods1152);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:584:1: ruleJsonMetaScalarType : ( ( rule__JsonMetaScalarType__Alternatives ) ) ;
    public final void ruleJsonMetaScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:588:1: ( ( ( rule__JsonMetaScalarType__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:589:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:589:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:590:1: ( rule__JsonMetaScalarType__Alternatives )
            {
             before(grammarAccess.getJsonMetaScalarTypeAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:591:1: ( rule__JsonMetaScalarType__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:591:2: rule__JsonMetaScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType1188);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:603:1: ruleJsonLiteralBoolean : ( ( rule__JsonLiteralBoolean__Alternatives ) ) ;
    public final void ruleJsonLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:607:1: ( ( ( rule__JsonLiteralBoolean__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:608:1: ( ( rule__JsonLiteralBoolean__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:608:1: ( ( rule__JsonLiteralBoolean__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:609:1: ( rule__JsonLiteralBoolean__Alternatives )
            {
             before(grammarAccess.getJsonLiteralBooleanAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:610:1: ( rule__JsonLiteralBoolean__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:610:2: rule__JsonLiteralBoolean__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonLiteralBoolean__Alternatives_in_ruleJsonLiteralBoolean1224);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:621:1: rule__Mobgen__Alternatives : ( ( ( rule__Mobgen__ResourcesAssignment_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1 ) ) );
    public final void rule__Mobgen__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:625:1: ( ( ( rule__Mobgen__ResourcesAssignment_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1 ) ) )
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
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:626:1: ( ( rule__Mobgen__ResourcesAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:626:1: ( ( rule__Mobgen__ResourcesAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:627:1: ( rule__Mobgen__ResourcesAssignment_0 )
                    {
                     before(grammarAccess.getMobgenAccess().getResourcesAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:628:1: ( rule__Mobgen__ResourcesAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:628:2: rule__Mobgen__ResourcesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Mobgen__ResourcesAssignment_0_in_rule__Mobgen__Alternatives1259);
                    rule__Mobgen__ResourcesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenAccess().getResourcesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:632:6: ( ( rule__Mobgen__CallsAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:632:6: ( ( rule__Mobgen__CallsAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:633:1: ( rule__Mobgen__CallsAssignment_1 )
                    {
                     before(grammarAccess.getMobgenAccess().getCallsAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:634:1: ( rule__Mobgen__CallsAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:634:2: rule__Mobgen__CallsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Mobgen__CallsAssignment_1_in_rule__Mobgen__Alternatives1277);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:643:1: rule__MobgenHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) ) );
    public final void rule__MobgenHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:647:1: ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) ) )
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
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:648:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:648:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:649:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:650:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:650:2: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21310);
                    rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:654:6: ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:654:6: ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:655:1: ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterAssignment_2_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:656:1: ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:656:2: rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21328);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:665:1: rule__JsonObjectValue__Alternatives : ( ( ( rule__JsonObjectValue__ScalarAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) );
    public final void rule__JsonObjectValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:669:1: ( ( ( rule__JsonObjectValue__ScalarAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_JSON_NUMBER)||(LA4_0>=23 && LA4_0<=27)) ) {
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
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:670:1: ( ( rule__JsonObjectValue__ScalarAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:670:1: ( ( rule__JsonObjectValue__ScalarAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:671:1: ( rule__JsonObjectValue__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getScalarAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:672:1: ( rule__JsonObjectValue__ScalarAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:672:2: rule__JsonObjectValue__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__ScalarAssignment_0_in_rule__JsonObjectValue__Alternatives1361);
                    rule__JsonObjectValue__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonObjectValueAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:676:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:676:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:677:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getCompositeAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:678:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:678:2: rule__JsonObjectValue__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1379);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:687:1: rule__JsonCompositeValue__Alternatives : ( ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) ) | ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) ) );
    public final void rule__JsonCompositeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:691:1: ( ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) ) | ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) ) )
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
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:692:1: ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:692:1: ( ( rule__JsonCompositeValue__ObjectValueAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:693:1: ( rule__JsonCompositeValue__ObjectValueAssignment_0 )
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getObjectValueAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:694:1: ( rule__JsonCompositeValue__ObjectValueAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:694:2: rule__JsonCompositeValue__ObjectValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonCompositeValue__ObjectValueAssignment_0_in_rule__JsonCompositeValue__Alternatives1412);
                    rule__JsonCompositeValue__ObjectValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonCompositeValueAccess().getObjectValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:698:6: ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:698:6: ( ( rule__JsonCompositeValue__ArrayValueAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:699:1: ( rule__JsonCompositeValue__ArrayValueAssignment_1 )
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getArrayValueAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:700:1: ( rule__JsonCompositeValue__ArrayValueAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:700:2: rule__JsonCompositeValue__ArrayValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonCompositeValue__ArrayValueAssignment_1_in_rule__JsonCompositeValue__Alternatives1430);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:709:1: rule__JsonLiteralValue__Alternatives : ( ( ( rule__JsonLiteralValue__StringTypeAssignment_0 ) ) | ( ( rule__JsonLiteralValue__BooleanTypeAssignment_1 ) ) | ( ( rule__JsonLiteralValue__MetaTypeAssignment_2 ) ) );
    public final void rule__JsonLiteralValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:713:1: ( ( ( rule__JsonLiteralValue__StringTypeAssignment_0 ) ) | ( ( rule__JsonLiteralValue__BooleanTypeAssignment_1 ) ) | ( ( rule__JsonLiteralValue__MetaTypeAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_EMPTY_JSON_OBJECT:
            case RULE_EMPTY_JSON_ARRAY:
            case RULE_JSON_LITERAL_NULL:
            case RULE_JSON_NUMBER:
                {
                alt6=1;
                }
                break;
            case 26:
            case 27:
                {
                alt6=2;
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:714:1: ( ( rule__JsonLiteralValue__StringTypeAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:714:1: ( ( rule__JsonLiteralValue__StringTypeAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:715:1: ( rule__JsonLiteralValue__StringTypeAssignment_0 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getStringTypeAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:716:1: ( rule__JsonLiteralValue__StringTypeAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:716:2: rule__JsonLiteralValue__StringTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__StringTypeAssignment_0_in_rule__JsonLiteralValue__Alternatives1463);
                    rule__JsonLiteralValue__StringTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getStringTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:720:6: ( ( rule__JsonLiteralValue__BooleanTypeAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:720:6: ( ( rule__JsonLiteralValue__BooleanTypeAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:721:1: ( rule__JsonLiteralValue__BooleanTypeAssignment_1 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getBooleanTypeAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:722:1: ( rule__JsonLiteralValue__BooleanTypeAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:722:2: rule__JsonLiteralValue__BooleanTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__BooleanTypeAssignment_1_in_rule__JsonLiteralValue__Alternatives1481);
                    rule__JsonLiteralValue__BooleanTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getBooleanTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:726:6: ( ( rule__JsonLiteralValue__MetaTypeAssignment_2 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:726:6: ( ( rule__JsonLiteralValue__MetaTypeAssignment_2 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:727:1: ( rule__JsonLiteralValue__MetaTypeAssignment_2 )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getMetaTypeAssignment_2()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:728:1: ( rule__JsonLiteralValue__MetaTypeAssignment_2 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:728:2: rule__JsonLiteralValue__MetaTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__JsonLiteralValue__MetaTypeAssignment_2_in_rule__JsonLiteralValue__Alternatives1499);
                    rule__JsonLiteralValue__MetaTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getMetaTypeAssignment_2()); 

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


    // $ANTLR start "rule__JsonLiteralValue__StringTypeAlternatives_0_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:737:1: rule__JsonLiteralValue__StringTypeAlternatives_0_0 : ( ( RULE_STRING ) | ( RULE_EMPTY_JSON_OBJECT ) | ( RULE_EMPTY_JSON_ARRAY ) | ( RULE_JSON_LITERAL_NULL ) | ( RULE_JSON_NUMBER ) );
    public final void rule__JsonLiteralValue__StringTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:741:1: ( ( RULE_STRING ) | ( RULE_EMPTY_JSON_OBJECT ) | ( RULE_EMPTY_JSON_ARRAY ) | ( RULE_JSON_LITERAL_NULL ) | ( RULE_JSON_NUMBER ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_EMPTY_JSON_OBJECT:
                {
                alt7=2;
                }
                break;
            case RULE_EMPTY_JSON_ARRAY:
                {
                alt7=3;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt7=4;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:742:1: ( RULE_STRING )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:742:1: ( RULE_STRING )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:743:1: RULE_STRING
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getStringTypeSTRINGTerminalRuleCall_0_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01532); 
                     after(grammarAccess.getJsonLiteralValueAccess().getStringTypeSTRINGTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:748:6: ( RULE_EMPTY_JSON_OBJECT )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:748:6: ( RULE_EMPTY_JSON_OBJECT )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:749:1: RULE_EMPTY_JSON_OBJECT
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getStringTypeEMPTY_JSON_OBJECTTerminalRuleCall_0_0_1()); 
                    match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01549); 
                     after(grammarAccess.getJsonLiteralValueAccess().getStringTypeEMPTY_JSON_OBJECTTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:754:6: ( RULE_EMPTY_JSON_ARRAY )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:754:6: ( RULE_EMPTY_JSON_ARRAY )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:755:1: RULE_EMPTY_JSON_ARRAY
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getStringTypeEMPTY_JSON_ARRAYTerminalRuleCall_0_0_2()); 
                    match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01566); 
                     after(grammarAccess.getJsonLiteralValueAccess().getStringTypeEMPTY_JSON_ARRAYTerminalRuleCall_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:760:6: ( RULE_JSON_LITERAL_NULL )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:760:6: ( RULE_JSON_LITERAL_NULL )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:761:1: RULE_JSON_LITERAL_NULL
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getStringTypeJSON_LITERAL_NULLTerminalRuleCall_0_0_3()); 
                    match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01583); 
                     after(grammarAccess.getJsonLiteralValueAccess().getStringTypeJSON_LITERAL_NULLTerminalRuleCall_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:766:6: ( RULE_JSON_NUMBER )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:766:6: ( RULE_JSON_NUMBER )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:767:1: RULE_JSON_NUMBER
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getStringTypeJSON_NUMBERTerminalRuleCall_0_0_4()); 
                    match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01600); 
                     after(grammarAccess.getJsonLiteralValueAccess().getStringTypeJSON_NUMBERTerminalRuleCall_0_0_4()); 

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
    // $ANTLR end "rule__JsonLiteralValue__StringTypeAlternatives_0_0"


    // $ANTLR start "rule__MobgenResourceDefinition__Alternatives"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:777:1: rule__MobgenResourceDefinition__Alternatives : ( ( ruleMapInstance ) | ( ruleEnumInstance ) );
    public final void rule__MobgenResourceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:781:1: ( ( ruleMapInstance ) | ( ruleEnumInstance ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==46) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:782:1: ( ruleMapInstance )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:782:1: ( ruleMapInstance )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:783:1: ruleMapInstance
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getMapInstanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__Alternatives1632);
                    ruleMapInstance();

                    state._fsp--;

                     after(grammarAccess.getMobgenResourceDefinitionAccess().getMapInstanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:788:6: ( ruleEnumInstance )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:788:6: ( ruleEnumInstance )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:789:1: ruleEnumInstance
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1649);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:799:1: rule__NestedType__Alternatives : ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) );
    public final void rule__NestedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:803:1: ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:804:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:804:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:805:1: ( rule__NestedType__ListAssignment_0 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:806:1: ( rule__NestedType__ListAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:806:2: rule__NestedType__ListAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1681);
                    rule__NestedType__ListAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:810:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:810:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:811:1: ( rule__NestedType__StringAssignment_1 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getStringAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:812:1: ( rule__NestedType__StringAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:812:2: rule__NestedType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1699);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:821:1: rule__RestfulMethods__Alternatives : ( ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__RestfulMethods__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:825:1: ( ( ( 'PUT' ) ) | ( ( 'POST' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:826:1: ( ( 'PUT' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:826:1: ( ( 'PUT' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:827:1: ( 'PUT' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getPutEnumLiteralDeclaration_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:828:1: ( 'PUT' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:828:3: 'PUT'
                    {
                    match(input,19,FOLLOW_19_in_rule__RestfulMethods__Alternatives1733); 

                    }

                     after(grammarAccess.getRestfulMethodsAccess().getPutEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:833:6: ( ( 'POST' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:833:6: ( ( 'POST' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:834:1: ( 'POST' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getPostEnumLiteralDeclaration_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:835:1: ( 'POST' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:835:3: 'POST'
                    {
                    match(input,20,FOLLOW_20_in_rule__RestfulMethods__Alternatives1754); 

                    }

                     after(grammarAccess.getRestfulMethodsAccess().getPostEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:840:6: ( ( 'GET' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:840:6: ( ( 'GET' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:841:1: ( 'GET' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getGetEnumLiteralDeclaration_2()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:842:1: ( 'GET' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:842:3: 'GET'
                    {
                    match(input,21,FOLLOW_21_in_rule__RestfulMethods__Alternatives1775); 

                    }

                     after(grammarAccess.getRestfulMethodsAccess().getGetEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:847:6: ( ( 'DELETE' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:847:6: ( ( 'DELETE' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:848:1: ( 'DELETE' )
                    {
                     before(grammarAccess.getRestfulMethodsAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:849:1: ( 'DELETE' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:849:3: 'DELETE'
                    {
                    match(input,22,FOLLOW_22_in_rule__RestfulMethods__Alternatives1796); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:859:1: rule__JsonMetaScalarType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'number' ) ) | ( ( 'string' ) ) );
    public final void rule__JsonMetaScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:863:1: ( ( ( 'boolean' ) ) | ( ( 'number' ) ) | ( ( 'string' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:864:1: ( ( 'boolean' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:864:1: ( ( 'boolean' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:865:1: ( 'boolean' )
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:866:1: ( 'boolean' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:866:3: 'boolean'
                    {
                    match(input,23,FOLLOW_23_in_rule__JsonMetaScalarType__Alternatives1832); 

                    }

                     after(grammarAccess.getJsonMetaScalarTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:871:6: ( ( 'number' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:871:6: ( ( 'number' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:872:1: ( 'number' )
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:873:1: ( 'number' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:873:3: 'number'
                    {
                    match(input,24,FOLLOW_24_in_rule__JsonMetaScalarType__Alternatives1853); 

                    }

                     after(grammarAccess.getJsonMetaScalarTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:878:6: ( ( 'string' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:878:6: ( ( 'string' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:879:1: ( 'string' )
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:880:1: ( 'string' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:880:3: 'string'
                    {
                    match(input,25,FOLLOW_25_in_rule__JsonMetaScalarType__Alternatives1874); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:890:1: rule__JsonLiteralBoolean__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__JsonLiteralBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:894:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:895:1: ( ( 'true' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:895:1: ( ( 'true' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:896:1: ( 'true' )
                    {
                     before(grammarAccess.getJsonLiteralBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:897:1: ( 'true' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:897:3: 'true'
                    {
                    match(input,26,FOLLOW_26_in_rule__JsonLiteralBoolean__Alternatives1910); 

                    }

                     after(grammarAccess.getJsonLiteralBooleanAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:902:6: ( ( 'false' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:902:6: ( ( 'false' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:903:1: ( 'false' )
                    {
                     before(grammarAccess.getJsonLiteralBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:904:1: ( 'false' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:904:3: 'false'
                    {
                    match(input,27,FOLLOW_27_in_rule__JsonLiteralBoolean__Alternatives1931); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:916:1: rule__MobgenCallDefinition__Group__0 : rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 ;
    public final void rule__MobgenCallDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:920:1: ( rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:921:2: rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__01964);
            rule__MobgenCallDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__01967);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:928:1: rule__MobgenCallDefinition__Group__0__Impl : ( 'call' ) ;
    public final void rule__MobgenCallDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:932:1: ( ( 'call' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:933:1: ( 'call' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:933:1: ( 'call' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:934:1: 'call'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__MobgenCallDefinition__Group__0__Impl1995); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:947:1: rule__MobgenCallDefinition__Group__1 : rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 ;
    public final void rule__MobgenCallDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:951:1: ( rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:952:2: rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12026);
            rule__MobgenCallDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12029);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:959:1: rule__MobgenCallDefinition__Group__1__Impl : ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) ;
    public final void rule__MobgenCallDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:963:1: ( ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:964:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:964:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:965:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:966:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:966:2: rule__MobgenCallDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2056);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:976:1: rule__MobgenCallDefinition__Group__2 : rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 ;
    public final void rule__MobgenCallDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:980:1: ( rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:981:2: rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22086);
            rule__MobgenCallDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22089);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:988:1: rule__MobgenCallDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__MobgenCallDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:992:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:993:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:993:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:994:1: ':'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__MobgenCallDefinition__Group__2__Impl2117); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1007:1: rule__MobgenCallDefinition__Group__3 : rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 ;
    public final void rule__MobgenCallDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1011:1: ( rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1012:2: rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32148);
            rule__MobgenCallDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32151);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1019:1: rule__MobgenCallDefinition__Group__3__Impl : ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) ;
    public final void rule__MobgenCallDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1023:1: ( ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1024:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1024:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1025:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1026:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1026:2: rule__MobgenCallDefinition__MethodAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2178);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1036:1: rule__MobgenCallDefinition__Group__4 : rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 ;
    public final void rule__MobgenCallDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1040:1: ( rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1041:2: rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42208);
            rule__MobgenCallDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42211);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1048:1: rule__MobgenCallDefinition__Group__4__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1052:1: ( ( 'from' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1053:1: ( 'from' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1053:1: ( 'from' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1054:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__MobgenCallDefinition__Group__4__Impl2239); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1067:1: rule__MobgenCallDefinition__Group__5 : rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 ;
    public final void rule__MobgenCallDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1071:1: ( rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1072:2: rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52270);
            rule__MobgenCallDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52273);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1079:1: rule__MobgenCallDefinition__Group__5__Impl : ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) ;
    public final void rule__MobgenCallDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1083:1: ( ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1084:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1084:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1085:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriAssignment_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1086:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1086:2: rule__MobgenCallDefinition__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2300);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1096:1: rule__MobgenCallDefinition__Group__6 : rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 ;
    public final void rule__MobgenCallDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1100:1: ( rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1101:2: rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62330);
            rule__MobgenCallDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62333);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1108:1: rule__MobgenCallDefinition__Group__6__Impl : ( ( rule__MobgenCallDefinition__Group_6__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1112:1: ( ( ( rule__MobgenCallDefinition__Group_6__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1113:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1113:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1114:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1115:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1115:2: rule__MobgenCallDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2360);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1125:1: rule__MobgenCallDefinition__Group__7 : rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 ;
    public final void rule__MobgenCallDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1129:1: ( rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1130:2: rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72391);
            rule__MobgenCallDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72394);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1137:1: rule__MobgenCallDefinition__Group__7__Impl : ( ( rule__MobgenCallDefinition__Group_7__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1141:1: ( ( ( rule__MobgenCallDefinition__Group_7__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1142:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1142:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1143:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1144:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1144:2: rule__MobgenCallDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2421);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1154:1: rule__MobgenCallDefinition__Group__8 : rule__MobgenCallDefinition__Group__8__Impl ;
    public final void rule__MobgenCallDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1158:1: ( rule__MobgenCallDefinition__Group__8__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1159:2: rule__MobgenCallDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82452);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1165:1: rule__MobgenCallDefinition__Group__8__Impl : ( ( rule__MobgenCallDefinition__Group_8__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1169:1: ( ( ( rule__MobgenCallDefinition__Group_8__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1170:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1170:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1171:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_8()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1172:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1172:2: rule__MobgenCallDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2479);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1200:1: rule__MobgenCallDefinition__Group_6__0 : rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 ;
    public final void rule__MobgenCallDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1204:1: ( rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1205:2: rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02528);
            rule__MobgenCallDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02531);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1212:1: rule__MobgenCallDefinition__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__MobgenCallDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1216:1: ( ( 'with' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1217:1: ( 'with' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1217:1: ( 'with' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1218:1: 'with'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__MobgenCallDefinition__Group_6__0__Impl2559); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1231:1: rule__MobgenCallDefinition__Group_6__1 : rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 ;
    public final void rule__MobgenCallDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1235:1: ( rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1236:2: rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12590);
            rule__MobgenCallDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12593);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1243:1: rule__MobgenCallDefinition__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__MobgenCallDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1247:1: ( ( 'headers' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1248:1: ( 'headers' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1248:1: ( 'headers' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1249:1: 'headers'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1()); 
            match(input,32,FOLLOW_32_in_rule__MobgenCallDefinition__Group_6__1__Impl2621); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1262:1: rule__MobgenCallDefinition__Group_6__2 : rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 ;
    public final void rule__MobgenCallDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1266:1: ( rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1267:2: rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22652);
            rule__MobgenCallDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22655);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1274:1: rule__MobgenCallDefinition__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1278:1: ( ( 'from' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1279:1: ( 'from' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1279:1: ( 'from' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1280:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2()); 
            match(input,30,FOLLOW_30_in_rule__MobgenCallDefinition__Group_6__2__Impl2683); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1293:1: rule__MobgenCallDefinition__Group_6__3 : rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 ;
    public final void rule__MobgenCallDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1297:1: ( rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1298:2: rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32714);
            rule__MobgenCallDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32717);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1305:1: rule__MobgenCallDefinition__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__MobgenCallDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1309:1: ( ( 'request' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1310:1: ( 'request' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1310:1: ( 'request' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1311:1: 'request'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3()); 
            match(input,33,FOLLOW_33_in_rule__MobgenCallDefinition__Group_6__3__Impl2745); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1324:1: rule__MobgenCallDefinition__Group_6__4 : rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 ;
    public final void rule__MobgenCallDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1328:1: ( rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1329:2: rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42776);
            rule__MobgenCallDefinition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42779);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1336:1: rule__MobgenCallDefinition__Group_6__4__Impl : ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1340:1: ( ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1341:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1341:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1342:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1343:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1343:2: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2806);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1353:1: rule__MobgenCallDefinition__Group_6__5 : rule__MobgenCallDefinition__Group_6__5__Impl ;
    public final void rule__MobgenCallDefinition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1357:1: ( rule__MobgenCallDefinition__Group_6__5__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1358:2: rule__MobgenCallDefinition__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52836);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1364:1: rule__MobgenCallDefinition__Group_6__5__Impl : ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1368:1: ( ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1369:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1369:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1370:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1371:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1371:2: rule__MobgenCallDefinition__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl2863);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1393:1: rule__MobgenCallDefinition__Group_6_5__0 : rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 ;
    public final void rule__MobgenCallDefinition__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1397:1: ( rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1398:2: rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__02906);
            rule__MobgenCallDefinition__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__02909);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1405:1: rule__MobgenCallDefinition__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1409:1: ( ( 'and' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1410:1: ( 'and' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1410:1: ( 'and' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1411:1: 'and'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0()); 
            match(input,34,FOLLOW_34_in_rule__MobgenCallDefinition__Group_6_5__0__Impl2937); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1424:1: rule__MobgenCallDefinition__Group_6_5__1 : rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 ;
    public final void rule__MobgenCallDefinition__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1428:1: ( rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1429:2: rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__12968);
            rule__MobgenCallDefinition__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__12971);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1436:1: rule__MobgenCallDefinition__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1440:1: ( ( 'response' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1441:1: ( 'response' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1441:1: ( 'response' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1442:1: 'response'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1()); 
            match(input,35,FOLLOW_35_in_rule__MobgenCallDefinition__Group_6_5__1__Impl2999); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1455:1: rule__MobgenCallDefinition__Group_6_5__2 : rule__MobgenCallDefinition__Group_6_5__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1459:1: ( rule__MobgenCallDefinition__Group_6_5__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1460:2: rule__MobgenCallDefinition__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23030);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1466:1: rule__MobgenCallDefinition__Group_6_5__2__Impl : ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1470:1: ( ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1471:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1471:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1472:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1473:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1473:2: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3057);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1489:1: rule__MobgenCallDefinition__Group_7__0 : rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 ;
    public final void rule__MobgenCallDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1493:1: ( rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1494:2: rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03093);
            rule__MobgenCallDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03096);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1501:1: rule__MobgenCallDefinition__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__MobgenCallDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1505:1: ( ( 'client' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1506:1: ( 'client' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1506:1: ( 'client' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1507:1: 'client'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__MobgenCallDefinition__Group_7__0__Impl3124); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1520:1: rule__MobgenCallDefinition__Group_7__1 : rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 ;
    public final void rule__MobgenCallDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1524:1: ( rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1525:2: rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13155);
            rule__MobgenCallDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13158);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1532:1: rule__MobgenCallDefinition__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1536:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1537:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1537:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1538:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1()); 
            match(input,37,FOLLOW_37_in_rule__MobgenCallDefinition__Group_7__1__Impl3186); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1551:1: rule__MobgenCallDefinition__Group_7__2 : rule__MobgenCallDefinition__Group_7__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1555:1: ( rule__MobgenCallDefinition__Group_7__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1556:2: rule__MobgenCallDefinition__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23217);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1562:1: rule__MobgenCallDefinition__Group_7__2__Impl : ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1566:1: ( ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1567:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1567:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1568:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientAssignment_7_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1569:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1569:2: rule__MobgenCallDefinition__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3244);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1585:1: rule__MobgenCallDefinition__Group_8__0 : rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 ;
    public final void rule__MobgenCallDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1589:1: ( rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1590:2: rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03280);
            rule__MobgenCallDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03283);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1597:1: rule__MobgenCallDefinition__Group_8__0__Impl : ( 'server' ) ;
    public final void rule__MobgenCallDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1601:1: ( ( 'server' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1602:1: ( 'server' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1602:1: ( 'server' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1603:1: 'server'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0()); 
            match(input,38,FOLLOW_38_in_rule__MobgenCallDefinition__Group_8__0__Impl3311); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1616:1: rule__MobgenCallDefinition__Group_8__1 : rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 ;
    public final void rule__MobgenCallDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1620:1: ( rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1621:2: rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13342);
            rule__MobgenCallDefinition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13345);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1628:1: rule__MobgenCallDefinition__Group_8__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1632:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1633:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1633:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1634:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1()); 
            match(input,37,FOLLOW_37_in_rule__MobgenCallDefinition__Group_8__1__Impl3373); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1647:1: rule__MobgenCallDefinition__Group_8__2 : rule__MobgenCallDefinition__Group_8__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1651:1: ( rule__MobgenCallDefinition__Group_8__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1652:2: rule__MobgenCallDefinition__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23404);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1658:1: rule__MobgenCallDefinition__Group_8__2__Impl : ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1662:1: ( ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1663:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1663:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1664:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_8_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1665:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1665:2: rule__MobgenCallDefinition__JsonToServerAssignment_8_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3431);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1681:1: rule__MobgenHeader__Group__0 : rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 ;
    public final void rule__MobgenHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1685:1: ( rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1686:2: rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__03467);
            rule__MobgenHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__03470);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1693:1: rule__MobgenHeader__Group__0__Impl : ( ( rule__MobgenHeader__NameAssignment_0 ) ) ;
    public final void rule__MobgenHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1697:1: ( ( ( rule__MobgenHeader__NameAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1698:1: ( ( rule__MobgenHeader__NameAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1698:1: ( ( rule__MobgenHeader__NameAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1699:1: ( rule__MobgenHeader__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1700:1: ( rule__MobgenHeader__NameAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1700:2: rule__MobgenHeader__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl3497);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1710:1: rule__MobgenHeader__Group__1 : rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 ;
    public final void rule__MobgenHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1714:1: ( rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1715:2: rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__13527);
            rule__MobgenHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__13530);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1722:1: rule__MobgenHeader__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1726:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1727:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1727:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1728:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__MobgenHeader__Group__1__Impl3558); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1741:1: rule__MobgenHeader__Group__2 : rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 ;
    public final void rule__MobgenHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1745:1: ( rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1746:2: rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__23589);
            rule__MobgenHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__23592);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1753:1: rule__MobgenHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__MobgenHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1757:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1758:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1758:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1759:1: '{'
            {
             before(grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__MobgenHeader__Group__2__Impl3620); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1772:1: rule__MobgenHeader__Group__3 : rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 ;
    public final void rule__MobgenHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1776:1: ( rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1777:2: rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__33651);
            rule__MobgenHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__33654);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1784:1: rule__MobgenHeader__Group__3__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) ;
    public final void rule__MobgenHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1788:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1789:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1789:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1790:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1791:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1791:2: rule__MobgenHeader__HeaderKeyValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl3681);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1801:1: rule__MobgenHeader__Group__4 : rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 ;
    public final void rule__MobgenHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1805:1: ( rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1806:2: rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__43711);
            rule__MobgenHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__43714);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1813:1: rule__MobgenHeader__Group__4__Impl : ( ( rule__MobgenHeader__Group_4__0 )* ) ;
    public final void rule__MobgenHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1817:1: ( ( ( rule__MobgenHeader__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1818:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1818:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1819:1: ( rule__MobgenHeader__Group_4__0 )*
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1820:1: ( rule__MobgenHeader__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_STRING) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1820:2: rule__MobgenHeader__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl3741);
            	    rule__MobgenHeader__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1830:1: rule__MobgenHeader__Group__5 : rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 ;
    public final void rule__MobgenHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1834:1: ( rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1835:2: rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__53772);
            rule__MobgenHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__53775);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1842:1: rule__MobgenHeader__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MobgenHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1846:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1847:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1847:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1848:1: ( ',' )?
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1849:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1850:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__MobgenHeader__Group__5__Impl3804); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1861:1: rule__MobgenHeader__Group__6 : rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 ;
    public final void rule__MobgenHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1865:1: ( rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1866:2: rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__63837);
            rule__MobgenHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__63840);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1873:1: rule__MobgenHeader__Group__6__Impl : ( '}' ) ;
    public final void rule__MobgenHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1877:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1878:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1878:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1879:1: '}'
            {
             before(grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__MobgenHeader__Group__6__Impl3868); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1892:1: rule__MobgenHeader__Group__7 : rule__MobgenHeader__Group__7__Impl ;
    public final void rule__MobgenHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1896:1: ( rule__MobgenHeader__Group__7__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1897:2: rule__MobgenHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__73899);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1903:1: rule__MobgenHeader__Group__7__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1907:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1908:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1908:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1909:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__MobgenHeader__Group__7__Impl3927); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1938:1: rule__MobgenHeader__Group_4__0 : rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 ;
    public final void rule__MobgenHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1942:1: ( rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1943:2: rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__03974);
            rule__MobgenHeader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__03977);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1950:1: rule__MobgenHeader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MobgenHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1954:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1955:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1955:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1956:1: ','
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__MobgenHeader__Group_4__0__Impl4005); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1969:1: rule__MobgenHeader__Group_4__1 : rule__MobgenHeader__Group_4__1__Impl ;
    public final void rule__MobgenHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1973:1: ( rule__MobgenHeader__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1974:2: rule__MobgenHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14036);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1980:1: rule__MobgenHeader__Group_4__1__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) ;
    public final void rule__MobgenHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1984:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1985:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1985:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1986:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1987:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1987:2: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4063);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2001:1: rule__MobgenHeaderKeyValuePair__Group__0 : rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2005:1: ( rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2006:2: rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04097);
            rule__MobgenHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04100);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2013:1: rule__MobgenHeaderKeyValuePair__Group__0__Impl : ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2017:1: ( ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2018:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2018:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2019:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2020:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2020:2: rule__MobgenHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4127);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2030:1: rule__MobgenHeaderKeyValuePair__Group__1 : rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2034:1: ( rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2035:2: rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14157);
            rule__MobgenHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14160);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2042:1: rule__MobgenHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2046:1: ( ( '=' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2047:1: ( '=' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2047:1: ( '=' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2048:1: '='
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4188); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2061:1: rule__MobgenHeaderKeyValuePair__Group__2 : rule__MobgenHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2065:1: ( rule__MobgenHeaderKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2066:2: rule__MobgenHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24219);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2072:1: rule__MobgenHeaderKeyValuePair__Group__2__Impl : ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2076:1: ( ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2077:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2077:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2078:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2079:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2079:2: rule__MobgenHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4246);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2095:1: rule__MobgenHeaderParameter__Group__0 : rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1 ;
    public final void rule__MobgenHeaderParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2099:1: ( rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2100:2: rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__0__Impl_in_rule__MobgenHeaderParameter__Group__04282);
            rule__MobgenHeaderParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__1_in_rule__MobgenHeaderParameter__Group__04285);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2107:1: rule__MobgenHeaderParameter__Group__0__Impl : ( '{' ) ;
    public final void rule__MobgenHeaderParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2111:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2112:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2112:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2113:1: '{'
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__MobgenHeaderParameter__Group__0__Impl4313); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2126:1: rule__MobgenHeaderParameter__Group__1 : rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2 ;
    public final void rule__MobgenHeaderParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2130:1: ( rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2131:2: rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__1__Impl_in_rule__MobgenHeaderParameter__Group__14344);
            rule__MobgenHeaderParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__2_in_rule__MobgenHeaderParameter__Group__14347);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2138:1: rule__MobgenHeaderParameter__Group__1__Impl : ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) ) ;
    public final void rule__MobgenHeaderParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2142:1: ( ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2143:1: ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2143:1: ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2144:1: ( rule__MobgenHeaderParameter__IdAssignment_1 )
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getIdAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2145:1: ( rule__MobgenHeaderParameter__IdAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2145:2: rule__MobgenHeaderParameter__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__IdAssignment_1_in_rule__MobgenHeaderParameter__Group__1__Impl4374);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2155:1: rule__MobgenHeaderParameter__Group__2 : rule__MobgenHeaderParameter__Group__2__Impl ;
    public final void rule__MobgenHeaderParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2159:1: ( rule__MobgenHeaderParameter__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2160:2: rule__MobgenHeaderParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__2__Impl_in_rule__MobgenHeaderParameter__Group__24404);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2166:1: rule__MobgenHeaderParameter__Group__2__Impl : ( '}' ) ;
    public final void rule__MobgenHeaderParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2170:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2171:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2171:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2172:1: '}'
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getRightCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__MobgenHeaderParameter__Group__2__Impl4432); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2191:1: rule__MobgenJson__Group__0 : rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 ;
    public final void rule__MobgenJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2195:1: ( rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2196:2: rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04469);
            rule__MobgenJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04472);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2203:1: rule__MobgenJson__Group__0__Impl : ( ( rule__MobgenJson__NameAssignment_0 ) ) ;
    public final void rule__MobgenJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2207:1: ( ( ( rule__MobgenJson__NameAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2208:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2208:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2209:1: ( rule__MobgenJson__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2210:1: ( rule__MobgenJson__NameAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2210:2: rule__MobgenJson__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4499);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2220:1: rule__MobgenJson__Group__1 : rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 ;
    public final void rule__MobgenJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2224:1: ( rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2225:2: rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14529);
            rule__MobgenJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14532);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2232:1: rule__MobgenJson__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2236:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2237:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2237:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2238:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__MobgenJson__Group__1__Impl4560); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2251:1: rule__MobgenJson__Group__2 : rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 ;
    public final void rule__MobgenJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2255:1: ( rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2256:2: rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__24591);
            rule__MobgenJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__24594);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2263:1: rule__MobgenJson__Group__2__Impl : ( ( rule__MobgenJson__ValueAssignment_2 ) ) ;
    public final void rule__MobgenJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2267:1: ( ( ( rule__MobgenJson__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2268:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2268:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2269:1: ( rule__MobgenJson__ValueAssignment_2 )
            {
             before(grammarAccess.getMobgenJsonAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2270:1: ( rule__MobgenJson__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2270:2: rule__MobgenJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl4621);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2280:1: rule__MobgenJson__Group__3 : rule__MobgenJson__Group__3__Impl ;
    public final void rule__MobgenJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2284:1: ( rule__MobgenJson__Group__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2285:2: rule__MobgenJson__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__34651);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2291:1: rule__MobgenJson__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2295:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2296:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2296:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2297:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__MobgenJson__Group__3__Impl4679); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2318:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2322:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2323:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__04718);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__04721);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2330:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2334:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2335:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2335:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2336:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__JsonObject__Group__0__Impl4749); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2349:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2353:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2354:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__14780);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__14783);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2361:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2365:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2366:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2366:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2367:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2368:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2368:2: rule__JsonObject__KeyValuePairAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl4810);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2378:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2382:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2383:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__24840);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__24843);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2390:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )* ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2394:1: ( ( ( rule__JsonObject__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2395:1: ( ( rule__JsonObject__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2395:1: ( ( rule__JsonObject__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2396:1: ( rule__JsonObject__Group_2__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2397:1: ( rule__JsonObject__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_STRING) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2397:2: rule__JsonObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl4870);
            	    rule__JsonObject__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2407:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2411:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2412:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__34901);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__34904);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2419:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2423:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2424:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2424:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2425:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2426:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2427:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__JsonObject__Group__3__Impl4933); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2438:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2442:1: ( rule__JsonObject__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2443:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__44966);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2449:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2453:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2454:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2454:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2455:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__JsonObject__Group__4__Impl4994); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2478:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2482:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2483:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05035);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05038);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2490:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2494:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2495:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2495:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2496:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__JsonObject__Group_2__0__Impl5066); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2509:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2513:1: ( rule__JsonObject__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2514:2: rule__JsonObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15097);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2520:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2524:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2525:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2525:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2526:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2527:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2527:2: rule__JsonObject__KeyValuePairAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5124);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2541:1: rule__JsonKeyValuePair__Group__0 : rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 ;
    public final void rule__JsonKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2545:1: ( rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2546:2: rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05158);
            rule__JsonKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05161);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2553:1: rule__JsonKeyValuePair__Group__0__Impl : ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2557:1: ( ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2558:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2558:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2559:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2560:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2560:2: rule__JsonKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5188);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2570:1: rule__JsonKeyValuePair__Group__1 : rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 ;
    public final void rule__JsonKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2574:1: ( rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2575:2: rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15218);
            rule__JsonKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15221);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2582:1: rule__JsonKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2586:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2587:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2587:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2588:1: ':'
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__JsonKeyValuePair__Group__1__Impl5249); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2601:1: rule__JsonKeyValuePair__Group__2 : rule__JsonKeyValuePair__Group__2__Impl ;
    public final void rule__JsonKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2605:1: ( rule__JsonKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2606:2: rule__JsonKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25280);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2612:1: rule__JsonKeyValuePair__Group__2__Impl : ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2616:1: ( ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2617:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2617:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2618:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2619:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2619:2: rule__JsonKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5307);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2635:1: rule__JsonArray__Group__0 : rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 ;
    public final void rule__JsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2639:1: ( rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2640:2: rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05343);
            rule__JsonArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05346);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2647:1: rule__JsonArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2651:1: ( ( '[' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2652:1: ( '[' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2652:1: ( '[' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2653:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__JsonArray__Group__0__Impl5374); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2666:1: rule__JsonArray__Group__1 : rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 ;
    public final void rule__JsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2670:1: ( rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2671:2: rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15405);
            rule__JsonArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15408);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2678:1: rule__JsonArray__Group__1__Impl : ( ( rule__JsonArray__ItemsAssignment_1 ) ) ;
    public final void rule__JsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2682:1: ( ( ( rule__JsonArray__ItemsAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2683:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2683:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2684:1: ( rule__JsonArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2685:1: ( rule__JsonArray__ItemsAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2685:2: rule__JsonArray__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5435);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2695:1: rule__JsonArray__Group__2 : rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 ;
    public final void rule__JsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2699:1: ( rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2700:2: rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25465);
            rule__JsonArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25468);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2707:1: rule__JsonArray__Group__2__Impl : ( ( rule__JsonArray__Group_2__0 )* ) ;
    public final void rule__JsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2711:1: ( ( ( rule__JsonArray__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2712:1: ( ( rule__JsonArray__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2712:1: ( ( rule__JsonArray__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2713:1: ( rule__JsonArray__Group_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2714:1: ( rule__JsonArray__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    int LA21_1 = input.LA(2);

                    if ( ((LA21_1>=RULE_STRING && LA21_1<=RULE_JSON_NUMBER)||(LA21_1>=23 && LA21_1<=27)||LA21_1==40||LA21_1==44) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2714:2: rule__JsonArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5495);
            	    rule__JsonArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2724:1: rule__JsonArray__Group__3 : rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 ;
    public final void rule__JsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2728:1: ( rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2729:2: rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35526);
            rule__JsonArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35529);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2736:1: rule__JsonArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2740:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2741:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2741:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2742:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2743:1: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2744:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__JsonArray__Group__3__Impl5558); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2755:1: rule__JsonArray__Group__4 : rule__JsonArray__Group__4__Impl ;
    public final void rule__JsonArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2759:1: ( rule__JsonArray__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2760:2: rule__JsonArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__45591);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2766:1: rule__JsonArray__Group__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2770:1: ( ( ']' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2771:1: ( ']' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2771:1: ( ']' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2772:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__JsonArray__Group__4__Impl5619); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2795:1: rule__JsonArray__Group_2__0 : rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 ;
    public final void rule__JsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2799:1: ( rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2800:2: rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__05660);
            rule__JsonArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__05663);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2807:1: rule__JsonArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2811:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2812:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2812:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2813:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__JsonArray__Group_2__0__Impl5691); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2826:1: rule__JsonArray__Group_2__1 : rule__JsonArray__Group_2__1__Impl ;
    public final void rule__JsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2830:1: ( rule__JsonArray__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2831:2: rule__JsonArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__15722);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2837:1: rule__JsonArray__Group_2__1__Impl : ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__JsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2841:1: ( ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2842:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2842:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2843:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2844:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2844:2: rule__JsonArray__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl5749);
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


    // $ANTLR start "rule__EnumInstance__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2858:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2862:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2863:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__05783);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__05786);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2870:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2874:1: ( ( 'enum' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2875:1: ( 'enum' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2875:1: ( 'enum' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2876:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__EnumInstance__Group__0__Impl5814); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2889:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2893:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2894:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__15845);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__15848);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2901:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2905:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2906:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2906:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2907:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2908:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2908:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl5875);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2918:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2922:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2923:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__25905);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__25908);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2930:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2934:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2935:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2935:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2936:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__EnumInstance__Group__2__Impl5936); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2949:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2953:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2954:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__35967);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__35970);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2961:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2965:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2966:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2966:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2967:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2968:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2968:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl5997);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2978:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2982:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2983:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46027);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46030);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2990:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2994:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2995:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2995:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2996:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2997:1: ( rule__EnumInstance__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_ID) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2997:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6057);
            	    rule__EnumInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3007:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3011:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3012:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56088);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56091);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3019:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3023:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3024:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3024:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3025:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3026:1: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3027:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__EnumInstance__Group__5__Impl6120); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3038:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3042:1: ( rule__EnumInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3043:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66153);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3049:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3053:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3054:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3054:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3055:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__EnumInstance__Group__6__Impl6181); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3082:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3086:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3087:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06226);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06229);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3094:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3098:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3099:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3099:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3100:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumInstance__Group_4__0__Impl6257); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3113:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3117:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3118:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16288);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3124:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3128:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3129:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3129:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3130:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3131:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3131:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6315);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3145:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3149:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3150:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06349);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06352);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3157:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3161:1: ( ( 'map' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3162:1: ( 'map' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3162:1: ( 'map' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3163:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__MapInstance__Group__0__Impl6380); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3176:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3180:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3181:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16411);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16414);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3188:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__NameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3192:1: ( ( ( rule__MapInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3193:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3193:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3194:1: ( rule__MapInstance__NameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3195:1: ( rule__MapInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3195:2: rule__MapInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6441);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3205:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3209:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3210:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26471);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26474);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3217:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3221:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3222:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3222:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3223:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__MapInstance__Group__2__Impl6502); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3236:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3240:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3241:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36533);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36536);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3248:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__Group_3__0 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3252:1: ( ( ( rule__MapInstance__Group_3__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3253:1: ( ( rule__MapInstance__Group_3__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3253:1: ( ( rule__MapInstance__Group_3__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3254:1: ( rule__MapInstance__Group_3__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3255:1: ( rule__MapInstance__Group_3__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3255:2: rule__MapInstance__Group_3__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6563);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3265:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3269:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3270:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__46593);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__46596);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3277:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3281:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3282:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3282:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3283:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3284:1: ( rule__MapInstance__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3284:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl6623);
            	    rule__MapInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3294:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3298:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3299:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__56654);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__56657);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3306:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3310:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3311:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3311:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3312:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3313:1: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3314:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__MapInstance__Group__5__Impl6686); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3325:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3329:1: ( rule__MapInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3330:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__66719);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3336:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3340:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3341:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3341:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3342:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__MapInstance__Group__6__Impl6747); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3369:1: rule__MapInstance__Group_3__0 : rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 ;
    public final void rule__MapInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3373:1: ( rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3374:2: rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__06792);
            rule__MapInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__06795);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3381:1: rule__MapInstance__Group_3__0__Impl : ( ( rule__MapInstance__KeysAssignment_3_0 ) ) ;
    public final void rule__MapInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3385:1: ( ( ( rule__MapInstance__KeysAssignment_3_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3386:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3386:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3387:1: ( rule__MapInstance__KeysAssignment_3_0 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3388:1: ( rule__MapInstance__KeysAssignment_3_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3388:2: rule__MapInstance__KeysAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl6822);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3398:1: rule__MapInstance__Group_3__1 : rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 ;
    public final void rule__MapInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3402:1: ( rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3403:2: rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__16852);
            rule__MapInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__16855);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3410:1: rule__MapInstance__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3414:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3415:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3415:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3416:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 
            match(input,29,FOLLOW_29_in_rule__MapInstance__Group_3__1__Impl6883); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3429:1: rule__MapInstance__Group_3__2 : rule__MapInstance__Group_3__2__Impl ;
    public final void rule__MapInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3433:1: ( rule__MapInstance__Group_3__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3434:2: rule__MapInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__26914);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3440:1: rule__MapInstance__Group_3__2__Impl : ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) ;
    public final void rule__MapInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3444:1: ( ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3445:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3445:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3446:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3447:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3447:2: rule__MapInstance__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl6941);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3463:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3467:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3468:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__06977);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__06980);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3475:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3479:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3480:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3480:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3481:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__MapInstance__Group_4__0__Impl7008); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3494:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3498:1: ( rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3499:2: rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17039);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17042);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3506:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__KeysAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3510:1: ( ( ( rule__MapInstance__KeysAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3511:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3511:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3512:1: ( rule__MapInstance__KeysAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3513:1: ( rule__MapInstance__KeysAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3513:2: rule__MapInstance__KeysAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7069);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3523:1: rule__MapInstance__Group_4__2 : rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 ;
    public final void rule__MapInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3527:1: ( rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3528:2: rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27099);
            rule__MapInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27102);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3535:1: rule__MapInstance__Group_4__2__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3539:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3540:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3540:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3541:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 
            match(input,29,FOLLOW_29_in_rule__MapInstance__Group_4__2__Impl7130); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3554:1: rule__MapInstance__Group_4__3 : rule__MapInstance__Group_4__3__Impl ;
    public final void rule__MapInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3558:1: ( rule__MapInstance__Group_4__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3559:2: rule__MapInstance__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37161);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3565:1: rule__MapInstance__Group_4__3__Impl : ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) ;
    public final void rule__MapInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3569:1: ( ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3570:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3570:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3571:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3572:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3572:2: rule__MapInstance__ValuesAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7188);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3590:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3594:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3595:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07226);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07229);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3602:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3606:1: ( ( '[' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3607:1: ( '[' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3607:1: ( '[' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3608:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__StringList__Group__0__Impl7257); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3621:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3625:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3626:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17288);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17291);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3633:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3637:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3638:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3638:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3639:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3640:1: ( rule__StringList__ValuesAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3640:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7318);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3650:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3654:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3655:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27348);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27351);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3662:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3666:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3667:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3667:1: ( ( rule__StringList__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3668:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3669:1: ( rule__StringList__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_STRING) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3669:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7378);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3679:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3683:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3684:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37409);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37412);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3691:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3695:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3696:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3696:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3697:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3698:1: ( ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3699:2: ','
                    {
                    match(input,41,FOLLOW_41_in_rule__StringList__Group__3__Impl7441); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3710:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3714:1: ( rule__StringList__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3715:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47474);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3721:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3725:1: ( ( ']' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3726:1: ( ']' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3726:1: ( ']' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3727:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__StringList__Group__4__Impl7502); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3750:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3754:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3755:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07543);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07546);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3762:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3766:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3767:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3767:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3768:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__StringList__Group_2__0__Impl7574); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3781:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3785:1: ( rule__StringList__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3786:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__17605);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3792:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3796:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3797:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3797:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3798:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3799:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3799:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl7632);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3813:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3817:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3818:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__07666);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__07669);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3825:1: rule__URI__Group__0__Impl : ( ( rule__URI__UrlPrefixAssignment_0 ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3829:1: ( ( ( rule__URI__UrlPrefixAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3830:1: ( ( rule__URI__UrlPrefixAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3830:1: ( ( rule__URI__UrlPrefixAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3831:1: ( rule__URI__UrlPrefixAssignment_0 )
            {
             before(grammarAccess.getURIAccess().getUrlPrefixAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3832:1: ( rule__URI__UrlPrefixAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3832:2: rule__URI__UrlPrefixAssignment_0
            {
            pushFollow(FOLLOW_rule__URI__UrlPrefixAssignment_0_in_rule__URI__Group__0__Impl7696);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3842:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3846:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3847:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__17726);
            rule__URI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__17729);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3854:1: rule__URI__Group__1__Impl : ( ( rule__URI__PathAssignment_1 ) ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3858:1: ( ( ( rule__URI__PathAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3859:1: ( ( rule__URI__PathAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3859:1: ( ( rule__URI__PathAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3860:1: ( rule__URI__PathAssignment_1 )
            {
             before(grammarAccess.getURIAccess().getPathAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3861:1: ( rule__URI__PathAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3861:2: rule__URI__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__URI__PathAssignment_1_in_rule__URI__Group__1__Impl7756);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3871:1: rule__URI__Group__2 : rule__URI__Group__2__Impl rule__URI__Group__3 ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3875:1: ( rule__URI__Group__2__Impl rule__URI__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3876:2: rule__URI__Group__2__Impl rule__URI__Group__3
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__27786);
            rule__URI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__3_in_rule__URI__Group__27789);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3883:1: rule__URI__Group__2__Impl : ( ( rule__URI__Group_2__0 )* ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3887:1: ( ( ( rule__URI__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3888:1: ( ( rule__URI__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3888:1: ( ( rule__URI__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3889:1: ( rule__URI__Group_2__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3890:1: ( rule__URI__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3890:2: rule__URI__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl7816);
            	    rule__URI__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3900:1: rule__URI__Group__3 : rule__URI__Group__3__Impl rule__URI__Group__4 ;
    public final void rule__URI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3904:1: ( rule__URI__Group__3__Impl rule__URI__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3905:2: rule__URI__Group__3__Impl rule__URI__Group__4
            {
            pushFollow(FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__37847);
            rule__URI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__4_in_rule__URI__Group__37850);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3912:1: rule__URI__Group__3__Impl : ( ( rule__URI__QueryAssignment_3 ) ) ;
    public final void rule__URI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3916:1: ( ( ( rule__URI__QueryAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3917:1: ( ( rule__URI__QueryAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3917:1: ( ( rule__URI__QueryAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3918:1: ( rule__URI__QueryAssignment_3 )
            {
             before(grammarAccess.getURIAccess().getQueryAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3919:1: ( rule__URI__QueryAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3919:2: rule__URI__QueryAssignment_3
            {
            pushFollow(FOLLOW_rule__URI__QueryAssignment_3_in_rule__URI__Group__3__Impl7877);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3929:1: rule__URI__Group__4 : rule__URI__Group__4__Impl ;
    public final void rule__URI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3933:1: ( rule__URI__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3934:2: rule__URI__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__47907);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3940:1: rule__URI__Group__4__Impl : ( ( rule__URI__Group_4__0 )* ) ;
    public final void rule__URI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3944:1: ( ( ( rule__URI__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3945:1: ( ( rule__URI__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3945:1: ( ( rule__URI__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3946:1: ( rule__URI__Group_4__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3947:1: ( rule__URI__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3947:2: rule__URI__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl7934);
            	    rule__URI__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3967:1: rule__URI__Group_2__0 : rule__URI__Group_2__0__Impl rule__URI__Group_2__1 ;
    public final void rule__URI__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3971:1: ( rule__URI__Group_2__0__Impl rule__URI__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3972:2: rule__URI__Group_2__0__Impl rule__URI__Group_2__1
            {
            pushFollow(FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__07975);
            rule__URI__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__07978);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3979:1: rule__URI__Group_2__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3983:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3984:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3984:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3985:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__URI__Group_2__0__Impl8006); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3998:1: rule__URI__Group_2__1 : rule__URI__Group_2__1__Impl rule__URI__Group_2__2 ;
    public final void rule__URI__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4002:1: ( rule__URI__Group_2__1__Impl rule__URI__Group_2__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4003:2: rule__URI__Group_2__1__Impl rule__URI__Group_2__2
            {
            pushFollow(FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__18037);
            rule__URI__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__2_in_rule__URI__Group_2__18040);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4010:1: rule__URI__Group_2__1__Impl : ( ( rule__URI__PathParametersAssignment_2_1 ) ) ;
    public final void rule__URI__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4014:1: ( ( ( rule__URI__PathParametersAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4015:1: ( ( rule__URI__PathParametersAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4015:1: ( ( rule__URI__PathParametersAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4016:1: ( rule__URI__PathParametersAssignment_2_1 )
            {
             before(grammarAccess.getURIAccess().getPathParametersAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4017:1: ( rule__URI__PathParametersAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4017:2: rule__URI__PathParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__URI__PathParametersAssignment_2_1_in_rule__URI__Group_2__1__Impl8067);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4027:1: rule__URI__Group_2__2 : rule__URI__Group_2__2__Impl rule__URI__Group_2__3 ;
    public final void rule__URI__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4031:1: ( rule__URI__Group_2__2__Impl rule__URI__Group_2__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4032:2: rule__URI__Group_2__2__Impl rule__URI__Group_2__3
            {
            pushFollow(FOLLOW_rule__URI__Group_2__2__Impl_in_rule__URI__Group_2__28097);
            rule__URI__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__3_in_rule__URI__Group_2__28100);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4039:1: rule__URI__Group_2__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4043:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4044:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4044:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4045:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,42,FOLLOW_42_in_rule__URI__Group_2__2__Impl8128); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4058:1: rule__URI__Group_2__3 : rule__URI__Group_2__3__Impl ;
    public final void rule__URI__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4062:1: ( rule__URI__Group_2__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4063:2: rule__URI__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_2__3__Impl_in_rule__URI__Group_2__38159);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4069:1: rule__URI__Group_2__3__Impl : ( ( rule__URI__PathSuffixAssignment_2_3 ) ) ;
    public final void rule__URI__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4073:1: ( ( ( rule__URI__PathSuffixAssignment_2_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4074:1: ( ( rule__URI__PathSuffixAssignment_2_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4074:1: ( ( rule__URI__PathSuffixAssignment_2_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4075:1: ( rule__URI__PathSuffixAssignment_2_3 )
            {
             before(grammarAccess.getURIAccess().getPathSuffixAssignment_2_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4076:1: ( rule__URI__PathSuffixAssignment_2_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4076:2: rule__URI__PathSuffixAssignment_2_3
            {
            pushFollow(FOLLOW_rule__URI__PathSuffixAssignment_2_3_in_rule__URI__Group_2__3__Impl8186);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4094:1: rule__URI__Group_4__0 : rule__URI__Group_4__0__Impl rule__URI__Group_4__1 ;
    public final void rule__URI__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4098:1: ( rule__URI__Group_4__0__Impl rule__URI__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4099:2: rule__URI__Group_4__0__Impl rule__URI__Group_4__1
            {
            pushFollow(FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__08224);
            rule__URI__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__08227);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4106:1: rule__URI__Group_4__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4110:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4111:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4111:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4112:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__URI__Group_4__0__Impl8255); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4125:1: rule__URI__Group_4__1 : rule__URI__Group_4__1__Impl rule__URI__Group_4__2 ;
    public final void rule__URI__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4129:1: ( rule__URI__Group_4__1__Impl rule__URI__Group_4__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4130:2: rule__URI__Group_4__1__Impl rule__URI__Group_4__2
            {
            pushFollow(FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__18286);
            rule__URI__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__2_in_rule__URI__Group_4__18289);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4137:1: rule__URI__Group_4__1__Impl : ( ( rule__URI__QueryParametersAssignment_4_1 ) ) ;
    public final void rule__URI__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4141:1: ( ( ( rule__URI__QueryParametersAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4142:1: ( ( rule__URI__QueryParametersAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4142:1: ( ( rule__URI__QueryParametersAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4143:1: ( rule__URI__QueryParametersAssignment_4_1 )
            {
             before(grammarAccess.getURIAccess().getQueryParametersAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4144:1: ( rule__URI__QueryParametersAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4144:2: rule__URI__QueryParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__URI__QueryParametersAssignment_4_1_in_rule__URI__Group_4__1__Impl8316);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4154:1: rule__URI__Group_4__2 : rule__URI__Group_4__2__Impl rule__URI__Group_4__3 ;
    public final void rule__URI__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4158:1: ( rule__URI__Group_4__2__Impl rule__URI__Group_4__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4159:2: rule__URI__Group_4__2__Impl rule__URI__Group_4__3
            {
            pushFollow(FOLLOW_rule__URI__Group_4__2__Impl_in_rule__URI__Group_4__28346);
            rule__URI__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__3_in_rule__URI__Group_4__28349);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4166:1: rule__URI__Group_4__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4170:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4171:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4171:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4172:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,42,FOLLOW_42_in_rule__URI__Group_4__2__Impl8377); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4185:1: rule__URI__Group_4__3 : rule__URI__Group_4__3__Impl ;
    public final void rule__URI__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4189:1: ( rule__URI__Group_4__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4190:2: rule__URI__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_4__3__Impl_in_rule__URI__Group_4__38408);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4196:1: rule__URI__Group_4__3__Impl : ( ( rule__URI__QuerySuffixAssignment_4_3 ) ) ;
    public final void rule__URI__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4200:1: ( ( ( rule__URI__QuerySuffixAssignment_4_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4201:1: ( ( rule__URI__QuerySuffixAssignment_4_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4201:1: ( ( rule__URI__QuerySuffixAssignment_4_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4202:1: ( rule__URI__QuerySuffixAssignment_4_3 )
            {
             before(grammarAccess.getURIAccess().getQuerySuffixAssignment_4_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4203:1: ( rule__URI__QuerySuffixAssignment_4_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4203:2: rule__URI__QuerySuffixAssignment_4_3
            {
            pushFollow(FOLLOW_rule__URI__QuerySuffixAssignment_4_3_in_rule__URI__Group_4__3__Impl8435);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4222:1: rule__Mobgen__ResourcesAssignment_0 : ( ruleMobgenResourceDefinition ) ;
    public final void rule__Mobgen__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4226:1: ( ( ruleMobgenResourceDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4227:1: ( ruleMobgenResourceDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4227:1: ( ruleMobgenResourceDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4228:1: ruleMobgenResourceDefinition
            {
             before(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_08478);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4237:1: rule__Mobgen__CallsAssignment_1 : ( ruleMobgenCallDefinition ) ;
    public final void rule__Mobgen__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4241:1: ( ( ruleMobgenCallDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4242:1: ( ruleMobgenCallDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4242:1: ( ruleMobgenCallDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4243:1: ruleMobgenCallDefinition
            {
             before(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_18509);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4252:1: rule__MobgenCallDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenCallDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4256:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4257:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4257:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4258:1: RULE_ID
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_18540); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4267:1: rule__MobgenCallDefinition__MethodAssignment_3 : ( ruleRestfulMethods ) ;
    public final void rule__MobgenCallDefinition__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4271:1: ( ( ruleRestfulMethods ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4272:1: ( ruleRestfulMethods )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4272:1: ( ruleRestfulMethods )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4273:1: ruleRestfulMethods
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodRestfulMethodsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRestfulMethods_in_rule__MobgenCallDefinition__MethodAssignment_38571);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4282:1: rule__MobgenCallDefinition__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__MobgenCallDefinition__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4286:1: ( ( ruleURI ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4287:1: ( ruleURI )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4287:1: ( ruleURI )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4288:1: ruleURI
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_58602);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4297:1: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4301:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4302:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4302:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4303:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_48633);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4312:1: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4316:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4317:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4317:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4318:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28664);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4327:1: rule__MobgenCallDefinition__JsonToClientAssignment_7_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4331:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4332:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4332:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4333:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28695);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4342:1: rule__MobgenCallDefinition__JsonToServerAssignment_8_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToServerAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4346:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4347:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4347:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4348:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_28726);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4357:1: rule__MobgenHeader__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenHeader__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4361:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4362:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4362:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4363:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08757); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4372:1: rule__MobgenHeader__HeaderKeyValuesAssignment_3 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4376:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4377:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4377:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4378:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38788);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4387:1: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4391:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4392:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4392:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4393:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18819);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4402:1: rule__MobgenHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4406:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4407:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4407:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4408:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08850); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4417:1: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4421:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4422:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4422:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4423:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08881); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4432:1: rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 : ( ruleMobgenHeaderParameter ) ;
    public final void rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4436:1: ( ( ruleMobgenHeaderParameter ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4437:1: ( ruleMobgenHeaderParameter )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4437:1: ( ruleMobgenHeaderParameter )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4438:1: ruleMobgenHeaderParameter
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterMobgenHeaderParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_18912);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4447:1: rule__MobgenHeaderParameter__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenHeaderParameter__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4451:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4452:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4452:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4453:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeaderParameter__IdAssignment_18943); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4462:1: rule__MobgenJson__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenJson__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4466:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4467:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4467:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4468:1: RULE_ID
            {
             before(grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08974); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4477:1: rule__MobgenJson__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__MobgenJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4481:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4482:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4482:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4483:1: ruleJsonObjectValue
            {
             before(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_29005);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4492:1: rule__JsonObjectValue__ScalarAssignment_0 : ( ruleJsonLiteralValue ) ;
    public final void rule__JsonObjectValue__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4496:1: ( ( ruleJsonLiteralValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4497:1: ( ruleJsonLiteralValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4497:1: ( ruleJsonLiteralValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4498:1: ruleJsonLiteralValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getScalarJsonLiteralValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ScalarAssignment_09036);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4507:1: rule__JsonObjectValue__CompositeAssignment_1 : ( ruleJsonCompositeValue ) ;
    public final void rule__JsonObjectValue__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4511:1: ( ( ruleJsonCompositeValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4512:1: ( ruleJsonCompositeValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4512:1: ( ruleJsonCompositeValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4513:1: ruleJsonCompositeValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_19067);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4522:1: rule__JsonCompositeValue__ObjectValueAssignment_0 : ( ruleJsonObject ) ;
    public final void rule__JsonCompositeValue__ObjectValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4526:1: ( ( ruleJsonObject ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4527:1: ( ruleJsonObject )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4527:1: ( ruleJsonObject )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4528:1: ruleJsonObject
            {
             before(grammarAccess.getJsonCompositeValueAccess().getObjectValueJsonObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__ObjectValueAssignment_09098);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4537:1: rule__JsonCompositeValue__ArrayValueAssignment_1 : ( ruleJsonArray ) ;
    public final void rule__JsonCompositeValue__ArrayValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4541:1: ( ( ruleJsonArray ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4542:1: ( ruleJsonArray )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4542:1: ( ruleJsonArray )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4543:1: ruleJsonArray
            {
             before(grammarAccess.getJsonCompositeValueAccess().getArrayValueJsonArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__ArrayValueAssignment_19129);
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


    // $ANTLR start "rule__JsonLiteralValue__StringTypeAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4552:1: rule__JsonLiteralValue__StringTypeAssignment_0 : ( ( rule__JsonLiteralValue__StringTypeAlternatives_0_0 ) ) ;
    public final void rule__JsonLiteralValue__StringTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4556:1: ( ( ( rule__JsonLiteralValue__StringTypeAlternatives_0_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4557:1: ( ( rule__JsonLiteralValue__StringTypeAlternatives_0_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4557:1: ( ( rule__JsonLiteralValue__StringTypeAlternatives_0_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4558:1: ( rule__JsonLiteralValue__StringTypeAlternatives_0_0 )
            {
             before(grammarAccess.getJsonLiteralValueAccess().getStringTypeAlternatives_0_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4559:1: ( rule__JsonLiteralValue__StringTypeAlternatives_0_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4559:2: rule__JsonLiteralValue__StringTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__JsonLiteralValue__StringTypeAlternatives_0_0_in_rule__JsonLiteralValue__StringTypeAssignment_09160);
            rule__JsonLiteralValue__StringTypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonLiteralValueAccess().getStringTypeAlternatives_0_0()); 

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
    // $ANTLR end "rule__JsonLiteralValue__StringTypeAssignment_0"


    // $ANTLR start "rule__JsonLiteralValue__BooleanTypeAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4568:1: rule__JsonLiteralValue__BooleanTypeAssignment_1 : ( ruleJsonLiteralBoolean ) ;
    public final void rule__JsonLiteralValue__BooleanTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4572:1: ( ( ruleJsonLiteralBoolean ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4573:1: ( ruleJsonLiteralBoolean )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4573:1: ( ruleJsonLiteralBoolean )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4574:1: ruleJsonLiteralBoolean
            {
             before(grammarAccess.getJsonLiteralValueAccess().getBooleanTypeJsonLiteralBooleanEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonLiteralBoolean_in_rule__JsonLiteralValue__BooleanTypeAssignment_19193);
            ruleJsonLiteralBoolean();

            state._fsp--;

             after(grammarAccess.getJsonLiteralValueAccess().getBooleanTypeJsonLiteralBooleanEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__JsonLiteralValue__BooleanTypeAssignment_1"


    // $ANTLR start "rule__JsonLiteralValue__MetaTypeAssignment_2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4583:1: rule__JsonLiteralValue__MetaTypeAssignment_2 : ( ruleJsonMetaScalarType ) ;
    public final void rule__JsonLiteralValue__MetaTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4587:1: ( ( ruleJsonMetaScalarType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4588:1: ( ruleJsonMetaScalarType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4588:1: ( ruleJsonMetaScalarType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4589:1: ruleJsonMetaScalarType
            {
             before(grammarAccess.getJsonLiteralValueAccess().getMetaTypeJsonMetaScalarTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_rule__JsonLiteralValue__MetaTypeAssignment_29224);
            ruleJsonMetaScalarType();

            state._fsp--;

             after(grammarAccess.getJsonLiteralValueAccess().getMetaTypeJsonMetaScalarTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__JsonLiteralValue__MetaTypeAssignment_2"


    // $ANTLR start "rule__JsonObject__KeyValuePairAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4598:1: rule__JsonObject__KeyValuePairAssignment_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4602:1: ( ( ruleJsonKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4603:1: ( ruleJsonKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4603:1: ( ruleJsonKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4604:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_19255);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4613:1: rule__JsonObject__KeyValuePairAssignment_2_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4617:1: ( ( ruleJsonKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4618:1: ( ruleJsonKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4618:1: ( ruleJsonKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4619:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_19286);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4628:1: rule__JsonKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4632:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4633:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4633:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4634:1: RULE_STRING
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_09317); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4643:1: rule__JsonKeyValuePair__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4647:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4648:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4648:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4649:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_29348);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4658:1: rule__JsonArray__ItemsAssignment_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4662:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4663:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4663:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4664:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_19379);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4673:1: rule__JsonArray__ItemsAssignment_2_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4677:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4678:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4678:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4679:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_19410);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4688:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4692:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4693:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4693:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4694:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_19441); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4703:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4707:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4708:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4708:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4709:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_39472); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4718:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4722:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4723:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4723:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4724:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_19503); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4733:1: rule__MapInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4737:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4738:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4738:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4739:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_19534); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4748:1: rule__MapInstance__KeysAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4752:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4753:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4753:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4754:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_09565); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4763:1: rule__MapInstance__ValuesAssignment_3_2 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4767:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4768:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4768:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4769:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_29596);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4778:1: rule__MapInstance__KeysAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4782:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4783:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4783:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4784:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_19627); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4793:1: rule__MapInstance__ValuesAssignment_4_3 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4797:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4798:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4798:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4799:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39658);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4808:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4812:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4813:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4813:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4814:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19689); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4823:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4827:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4828:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4828:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4829:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19720); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4838:1: rule__NestedType__ListAssignment_0 : ( ruleStringList ) ;
    public final void rule__NestedType__ListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4842:1: ( ( ruleStringList ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4843:1: ( ruleStringList )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4843:1: ( ruleStringList )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4844:1: ruleStringList
            {
             before(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_09751);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4853:1: rule__NestedType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NestedType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4857:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4858:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4858:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4859:1: RULE_STRING
            {
             before(grammarAccess.getNestedTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_19782); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4868:1: rule__URI__UrlPrefixAssignment_0 : ( RULE_URL_PREFIX ) ;
    public final void rule__URI__UrlPrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4872:1: ( ( RULE_URL_PREFIX ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4873:1: ( RULE_URL_PREFIX )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4873:1: ( RULE_URL_PREFIX )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4874:1: RULE_URL_PREFIX
            {
             before(grammarAccess.getURIAccess().getUrlPrefixURL_PREFIXTerminalRuleCall_0_0()); 
            match(input,RULE_URL_PREFIX,FOLLOW_RULE_URL_PREFIX_in_rule__URI__UrlPrefixAssignment_09813); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4883:1: rule__URI__PathAssignment_1 : ( RULE_URL_PATH ) ;
    public final void rule__URI__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4887:1: ( ( RULE_URL_PATH ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4888:1: ( RULE_URL_PATH )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4888:1: ( RULE_URL_PATH )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4889:1: RULE_URL_PATH
            {
             before(grammarAccess.getURIAccess().getPathURL_PATHTerminalRuleCall_1_0()); 
            match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_rule__URI__PathAssignment_19844); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4898:1: rule__URI__PathParametersAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__URI__PathParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4902:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4903:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4903:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4904:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getPathParametersIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__PathParametersAssignment_2_19875); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4913:1: rule__URI__PathSuffixAssignment_2_3 : ( RULE_URL_PATH ) ;
    public final void rule__URI__PathSuffixAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4917:1: ( ( RULE_URL_PATH ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4918:1: ( RULE_URL_PATH )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4918:1: ( RULE_URL_PATH )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4919:1: RULE_URL_PATH
            {
             before(grammarAccess.getURIAccess().getPathSuffixURL_PATHTerminalRuleCall_2_3_0()); 
            match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_rule__URI__PathSuffixAssignment_2_39906); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4928:1: rule__URI__QueryAssignment_3 : ( RULE_URL_QUERY ) ;
    public final void rule__URI__QueryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4932:1: ( ( RULE_URL_QUERY ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4933:1: ( RULE_URL_QUERY )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4933:1: ( RULE_URL_QUERY )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4934:1: RULE_URL_QUERY
            {
             before(grammarAccess.getURIAccess().getQueryURL_QUERYTerminalRuleCall_3_0()); 
            match(input,RULE_URL_QUERY,FOLLOW_RULE_URL_QUERY_in_rule__URI__QueryAssignment_39937); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4943:1: rule__URI__QueryParametersAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__URI__QueryParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4947:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4948:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4948:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4949:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getQueryParametersIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__QueryParametersAssignment_4_19968); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4958:1: rule__URI__QuerySuffixAssignment_4_3 : ( RULE_URL_QUERY_SUFFIX ) ;
    public final void rule__URI__QuerySuffixAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4962:1: ( ( RULE_URL_QUERY_SUFFIX ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4963:1: ( RULE_URL_QUERY_SUFFIX )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4963:1: ( RULE_URL_QUERY_SUFFIX )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4964:1: RULE_URL_QUERY_SUFFIX
            {
             before(grammarAccess.getURIAccess().getQuerySuffixURL_QUERY_SUFFIXTerminalRuleCall_4_3_0()); 
            match(input,RULE_URL_QUERY_SUFFIX,FOLLOW_RULE_URL_QUERY_SUFFIX_in_rule__URI__QuerySuffixAssignment_4_39999); 
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
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0_in_ruleStringList995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestfulMethods__Alternatives_in_ruleRestfulMethods1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralBoolean__Alternatives_in_ruleJsonLiteralBoolean1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__ResourcesAssignment_0_in_rule__Mobgen__Alternatives1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__CallsAssignment_1_in_rule__Mobgen__Alternatives1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__ScalarAssignment_0_in_rule__JsonObjectValue__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeValue__ObjectValueAssignment_0_in_rule__JsonCompositeValue__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeValue__ArrayValueAssignment_1_in_rule__JsonCompositeValue__Alternatives1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__StringTypeAssignment_0_in_rule__JsonLiteralValue__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__BooleanTypeAssignment_1_in_rule__JsonLiteralValue__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__MetaTypeAssignment_2_in_rule__JsonLiteralValue__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_rule__JsonLiteralValue__StringTypeAlternatives_0_01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RestfulMethods__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RestfulMethods__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RestfulMethods__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RestfulMethods__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonMetaScalarType__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonMetaScalarType__Alternatives1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__JsonMetaScalarType__Alternatives1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JsonLiteralBoolean__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__JsonLiteralBoolean__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__01964 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__01967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MobgenCallDefinition__Group__0__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12026 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22086 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MobgenCallDefinition__Group__2__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32148 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42208 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MobgenCallDefinition__Group__4__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52270 = new BitSet(new long[]{0x0000005080000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62330 = new BitSet(new long[]{0x0000005080000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72391 = new BitSet(new long[]{0x0000005080000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02528 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MobgenCallDefinition__Group_6__0__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12590 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenCallDefinition__Group_6__1__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22652 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MobgenCallDefinition__Group_6__2__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32714 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MobgenCallDefinition__Group_6__3__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42776 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__02906 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__02909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenCallDefinition__Group_6_5__0__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__12968 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__12971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MobgenCallDefinition__Group_6_5__1__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03093 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MobgenCallDefinition__Group_7__0__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MobgenCallDefinition__Group_7__1__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03280 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MobgenCallDefinition__Group_8__0__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13342 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MobgenCallDefinition__Group_8__1__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__03467 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__03470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__13527 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__13530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenHeader__Group__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__23589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__23592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MobgenHeader__Group__2__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__33651 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__33654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__43711 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__43714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl3741 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__53772 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__53775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MobgenHeader__Group__5__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__63837 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__63840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MobgenHeader__Group__6__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__73899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenHeader__Group__7__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__03974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MobgenHeader__Group_4__0__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04097 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14157 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__0__Impl_in_rule__MobgenHeaderParameter__Group__04282 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__1_in_rule__MobgenHeaderParameter__Group__04285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MobgenHeaderParameter__Group__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__1__Impl_in_rule__MobgenHeaderParameter__Group__14344 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__2_in_rule__MobgenHeaderParameter__Group__14347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__IdAssignment_1_in_rule__MobgenHeaderParameter__Group__1__Impl4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__2__Impl_in_rule__MobgenHeaderParameter__Group__24404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MobgenHeaderParameter__Group__2__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04469 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14529 = new BitSet(new long[]{0x000011000F8001F0L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenJson__Group__1__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__24591 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__24594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__34651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenJson__Group__3__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__04718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__04721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__JsonObject__Group__0__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__14780 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__14783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__24840 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__24843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl4870 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__34901 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__34904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonObject__Group__3__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__44966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__JsonObject__Group__4__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonObject__Group_2__0__Impl5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05158 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15218 = new BitSet(new long[]{0x000011000F8001F0L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__JsonKeyValuePair__Group__1__Impl5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05343 = new BitSet(new long[]{0x000011000F8001F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__JsonArray__Group__0__Impl5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15405 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25465 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5495 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35526 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonArray__Group__3__Impl5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__45591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__JsonArray__Group__4__Impl5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__05660 = new BitSet(new long[]{0x000011000F8001F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__05663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__JsonArray__Group_2__0__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__05783 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__05786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EnumInstance__Group__0__Impl5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__15845 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__15848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__25905 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__25908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumInstance__Group__2__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__35967 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__35970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46027 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6057 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56088 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumInstance__Group__5__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumInstance__Group__6__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumInstance__Group_4__0__Impl6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06349 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MapInstance__Group__0__Impl6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16411 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26471 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MapInstance__Group__2__Impl6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36533 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__46593 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__46596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl6623 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__56654 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__56657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MapInstance__Group__5__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__66719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MapInstance__Group__6__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__06792 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__06795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__16852 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__16855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MapInstance__Group_3__1__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__26914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__06977 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__06980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MapInstance__Group_4__0__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17039 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27099 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MapInstance__Group_4__2__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StringList__Group__0__Impl7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17288 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27348 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7378 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37409 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StringList__Group__3__Impl7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__StringList__Group__4__Impl7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__StringList__Group_2__0__Impl7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__17605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__07666 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__07669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__UrlPrefixAssignment_0_in_rule__URI__Group__0__Impl7696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__17726 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__17729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathAssignment_1_in_rule__URI__Group__1__Impl7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__27786 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_rule__URI__Group__3_in_rule__URI__Group__27789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl7816 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__37847 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__URI__Group__4_in_rule__URI__Group__37850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QueryAssignment_3_in_rule__URI__Group__3__Impl7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__47907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl7934 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__07975 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__07978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__URI__Group_2__0__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__18037 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__URI__Group_2__2_in_rule__URI__Group_2__18040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathParametersAssignment_2_1_in_rule__URI__Group_2__1__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__2__Impl_in_rule__URI__Group_2__28097 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__URI__Group_2__3_in_rule__URI__Group_2__28100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__URI__Group_2__2__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__3__Impl_in_rule__URI__Group_2__38159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathSuffixAssignment_2_3_in_rule__URI__Group_2__3__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__08224 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__08227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__URI__Group_4__0__Impl8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__18286 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__URI__Group_4__2_in_rule__URI__Group_4__18289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QueryParametersAssignment_4_1_in_rule__URI__Group_4__1__Impl8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__2__Impl_in_rule__URI__Group_4__28346 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__URI__Group_4__3_in_rule__URI__Group_4__28349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__URI__Group_4__2__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__3__Impl_in_rule__URI__Group_4__38408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QuerySuffixAssignment_4_3_in_rule__URI__Group_4__3__Impl8435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_08478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_18509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_18540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestfulMethods_in_rule__MobgenCallDefinition__MethodAssignment_38571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_58602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_48633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_28726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_18912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeaderParameter__IdAssignment_18943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_29005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ScalarAssignment_09036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_19067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__ObjectValueAssignment_09098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__ArrayValueAssignment_19129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__StringTypeAlternatives_0_0_in_rule__JsonLiteralValue__StringTypeAssignment_09160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralBoolean_in_rule__JsonLiteralValue__BooleanTypeAssignment_19193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_rule__JsonLiteralValue__MetaTypeAssignment_29224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_19255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_19286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_09317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_29348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_19379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_19410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_19441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_39472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_19503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_19534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_09565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_29596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_19627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_09751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_19782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PREFIX_in_rule__URI__UrlPrefixAssignment_09813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_rule__URI__PathAssignment_19844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__PathParametersAssignment_2_19875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_rule__URI__PathSuffixAssignment_2_39906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_in_rule__URI__QueryAssignment_39937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__QueryParametersAssignment_4_19968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_SUFFIX_in_rule__URI__QuerySuffixAssignment_4_39999 = new BitSet(new long[]{0x0000000000000002L});

}