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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RESTFUL_METHODS", "RULE_URL_PREFIX", "RULE_URL_PATH", "RULE_URL_QUERY", "RULE_URL_QUERY_SUFFIX", "RULE_JSON_META_SCALAR_TYPE", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_NULL", "RULE_JSON_LITERAL_BOOLEAN", "RULE_INT", "RULE_JSON_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'JsonObject'", "'JsonArray'", "'STRING'", "'EMPTY_JSON_OBJECT'", "'EMPTY_JSON_ARRAY'", "'JSON_LITERAL_BOOLEAN'", "'JSON_LITERAL_NULL'", "'JSON_NUMBER'", "'JSON_META_SCALAR_TYPE'", "'platform'", "'{'", "'}'", "'->'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'enum'", "'map'", "'['", "']'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_JSON_META_SCALAR_TYPE=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_EMPTY_JSON_ARRAY=13;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_URL_QUERY=9;
    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_JSON_NUMBER=17;
    public static final int RULE_URL_PATH=8;
    public static final int RULE_INT=16;
    public static final int RULE_RESTFUL_METHODS=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_JSON_LITERAL_BOOLEAN=15;
    public static final int RULE_EMPTY_JSON_OBJECT=12;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_URL_PREFIX=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=20;
    public static final int RULE_URL_QUERY_SUFFIX=10;

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:69:1: ruleMobgen : ( ( rule__Mobgen__Group__0 ) ) ;
    public final void ruleMobgen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:73:2: ( ( ( rule__Mobgen__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:74:1: ( ( rule__Mobgen__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:74:1: ( ( rule__Mobgen__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:75:1: ( rule__Mobgen__Group__0 )
            {
             before(grammarAccess.getMobgenAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:76:1: ( rule__Mobgen__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:76:2: rule__Mobgen__Group__0
            {
            pushFollow(FOLLOW_rule__Mobgen__Group__0_in_ruleMobgen94);
            rule__Mobgen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePlatform"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:88:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:89:1: ( rulePlatform EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:90:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform121);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform128); 

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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:97:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:101:2: ( ( ( rule__Platform__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:102:1: ( ( rule__Platform__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:102:1: ( ( rule__Platform__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:103:1: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:104:1: ( rule__Platform__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:104:2: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_rule__Platform__Group__0_in_rulePlatform154);
            rule__Platform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleMobgenCallDefinition"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:116:1: entryRuleMobgenCallDefinition : ruleMobgenCallDefinition EOF ;
    public final void entryRuleMobgenCallDefinition() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:117:1: ( ruleMobgenCallDefinition EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:118:1: ruleMobgenCallDefinition EOF
            {
             before(grammarAccess.getMobgenCallDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition181);
            ruleMobgenCallDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenCallDefinition188); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:125:1: ruleMobgenCallDefinition : ( ( rule__MobgenCallDefinition__Group__0 ) ) ;
    public final void ruleMobgenCallDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:129:2: ( ( ( rule__MobgenCallDefinition__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:130:1: ( ( rule__MobgenCallDefinition__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:130:1: ( ( rule__MobgenCallDefinition__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:131:1: ( rule__MobgenCallDefinition__Group__0 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:132:1: ( rule__MobgenCallDefinition__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:132:2: rule__MobgenCallDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__0_in_ruleMobgenCallDefinition214);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:144:1: entryRuleMobgenHeader : ruleMobgenHeader EOF ;
    public final void entryRuleMobgenHeader() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:145:1: ( ruleMobgenHeader EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:146:1: ruleMobgenHeader EOF
            {
             before(grammarAccess.getMobgenHeaderRule()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader241);
            ruleMobgenHeader();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeader248); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:153:1: ruleMobgenHeader : ( ( rule__MobgenHeader__Group__0 ) ) ;
    public final void ruleMobgenHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:157:2: ( ( ( rule__MobgenHeader__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:158:1: ( ( rule__MobgenHeader__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:158:1: ( ( rule__MobgenHeader__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:159:1: ( rule__MobgenHeader__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:160:1: ( rule__MobgenHeader__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:160:2: rule__MobgenHeader__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0_in_ruleMobgenHeader274);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:172:1: entryRuleMobgenHeaderKeyValuePair : ruleMobgenHeaderKeyValuePair EOF ;
    public final void entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:173:1: ( ruleMobgenHeaderKeyValuePair EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:174:1: ruleMobgenHeaderKeyValuePair EOF
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair301);
            ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair308); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:181:1: ruleMobgenHeaderKeyValuePair : ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) ;
    public final void ruleMobgenHeaderKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:185:2: ( ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:186:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:186:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:187:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:188:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:188:2: rule__MobgenHeaderKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0_in_ruleMobgenHeaderKeyValuePair334);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:200:1: entryRuleMobgenHeaderParameter : ruleMobgenHeaderParameter EOF ;
    public final void entryRuleMobgenHeaderParameter() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:201:1: ( ruleMobgenHeaderParameter EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:202:1: ruleMobgenHeaderParameter EOF
            {
             before(grammarAccess.getMobgenHeaderParameterRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter361);
            ruleMobgenHeaderParameter();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderParameter368); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:209:1: ruleMobgenHeaderParameter : ( ( rule__MobgenHeaderParameter__Group__0 ) ) ;
    public final void ruleMobgenHeaderParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:213:2: ( ( ( rule__MobgenHeaderParameter__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:214:1: ( ( rule__MobgenHeaderParameter__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:214:1: ( ( rule__MobgenHeaderParameter__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:215:1: ( rule__MobgenHeaderParameter__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:216:1: ( rule__MobgenHeaderParameter__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:216:2: rule__MobgenHeaderParameter__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__0_in_ruleMobgenHeaderParameter394);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:228:1: entryRuleMobgenJson : ruleMobgenJson EOF ;
    public final void entryRuleMobgenJson() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:229:1: ( ruleMobgenJson EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:230:1: ruleMobgenJson EOF
            {
             before(grammarAccess.getMobgenJsonRule()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson421);
            ruleMobgenJson();

            state._fsp--;

             after(grammarAccess.getMobgenJsonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenJson428); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:237:1: ruleMobgenJson : ( ( rule__MobgenJson__Group__0 ) ) ;
    public final void ruleMobgenJson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:241:2: ( ( ( rule__MobgenJson__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:242:1: ( ( rule__MobgenJson__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:242:1: ( ( rule__MobgenJson__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:243:1: ( rule__MobgenJson__Group__0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:244:1: ( rule__MobgenJson__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:244:2: rule__MobgenJson__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__0_in_ruleMobgenJson454);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:256:1: entryRuleJsonObjectValue : ruleJsonObjectValue EOF ;
    public final void entryRuleJsonObjectValue() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:257:1: ( ruleJsonObjectValue EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:258:1: ruleJsonObjectValue EOF
            {
             before(grammarAccess.getJsonObjectValueRule()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue481);
            ruleJsonObjectValue();

            state._fsp--;

             after(grammarAccess.getJsonObjectValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObjectValue488); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:265:1: ruleJsonObjectValue : ( ( rule__JsonObjectValue__Alternatives ) ) ;
    public final void ruleJsonObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:269:2: ( ( ( rule__JsonObjectValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:270:1: ( ( rule__JsonObjectValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:270:1: ( ( rule__JsonObjectValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:271:1: ( rule__JsonObjectValue__Alternatives )
            {
             before(grammarAccess.getJsonObjectValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:272:1: ( rule__JsonObjectValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:272:2: rule__JsonObjectValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonObjectValue__Alternatives_in_ruleJsonObjectValue514);
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


    // $ANTLR start "entryRuleJsonKeyValuePair"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:286:1: entryRuleJsonKeyValuePair : ruleJsonKeyValuePair EOF ;
    public final void entryRuleJsonKeyValuePair() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:287:1: ( ruleJsonKeyValuePair EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:288:1: ruleJsonKeyValuePair EOF
            {
             before(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair543);
            ruleJsonKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair550); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:295:1: ruleJsonKeyValuePair : ( ( rule__JsonKeyValuePair__Group__0 ) ) ;
    public final void ruleJsonKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:299:2: ( ( ( rule__JsonKeyValuePair__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:300:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:300:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:301:1: ( rule__JsonKeyValuePair__Group__0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:302:1: ( rule__JsonKeyValuePair__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:302:2: rule__JsonKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair576);
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


    // $ANTLR start "entryRuleMobgenResourceDefinition"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:316:1: entryRuleMobgenResourceDefinition : ruleMobgenResourceDefinition EOF ;
    public final void entryRuleMobgenResourceDefinition() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:317:1: ( ruleMobgenResourceDefinition EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:318:1: ruleMobgenResourceDefinition EOF
            {
             before(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition605);
            ruleMobgenResourceDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenResourceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition612); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:325:1: ruleMobgenResourceDefinition : ( ( rule__MobgenResourceDefinition__Alternatives ) ) ;
    public final void ruleMobgenResourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:329:2: ( ( ( rule__MobgenResourceDefinition__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:330:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:330:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:331:1: ( rule__MobgenResourceDefinition__Alternatives )
            {
             before(grammarAccess.getMobgenResourceDefinitionAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:332:1: ( rule__MobgenResourceDefinition__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:332:2: rule__MobgenResourceDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition638);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:344:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:345:1: ( ruleEnumInstance EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:346:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance665);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance672); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:353:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:357:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:358:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:358:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:359:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:360:1: ( rule__EnumInstance__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:360:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance698);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:372:1: entryRuleMapInstance : ruleMapInstance EOF ;
    public final void entryRuleMapInstance() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:373:1: ( ruleMapInstance EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:374:1: ruleMapInstance EOF
            {
             before(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance725);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMapInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance732); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:381:1: ruleMapInstance : ( ( rule__MapInstance__Group__0 ) ) ;
    public final void ruleMapInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:385:2: ( ( ( rule__MapInstance__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:386:1: ( ( rule__MapInstance__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:386:1: ( ( rule__MapInstance__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:387:1: ( rule__MapInstance__Group__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:388:1: ( rule__MapInstance__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:388:2: rule__MapInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance758);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:400:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:401:1: ( ruleStringList EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:402:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList785);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList792); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:409:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:413:2: ( ( ( rule__StringList__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:414:1: ( ( rule__StringList__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:414:1: ( ( rule__StringList__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:415:1: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:416:1: ( rule__StringList__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:416:2: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_rule__StringList__Group__0_in_ruleStringList818);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:428:1: entryRuleNestedType : ruleNestedType EOF ;
    public final void entryRuleNestedType() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:429:1: ( ruleNestedType EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:430:1: ruleNestedType EOF
            {
             before(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType845);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getNestedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType852); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:437:1: ruleNestedType : ( ( rule__NestedType__Alternatives ) ) ;
    public final void ruleNestedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:441:2: ( ( ( rule__NestedType__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:442:1: ( ( rule__NestedType__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:442:1: ( ( rule__NestedType__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:443:1: ( rule__NestedType__Alternatives )
            {
             before(grammarAccess.getNestedTypeAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:444:1: ( rule__NestedType__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:444:2: rule__NestedType__Alternatives
            {
            pushFollow(FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType878);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:456:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:457:1: ( ruleURI EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:458:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI905);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI912); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:465:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:469:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:470:1: ( ( rule__URI__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:470:1: ( ( rule__URI__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:471:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:472:1: ( rule__URI__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:472:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI938);
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


    // $ANTLR start "ruleJsonCompositeValue"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:485:1: ruleJsonCompositeValue : ( ( rule__JsonCompositeValue__Alternatives ) ) ;
    public final void ruleJsonCompositeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:489:1: ( ( ( rule__JsonCompositeValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:490:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:490:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:491:1: ( rule__JsonCompositeValue__Alternatives )
            {
             before(grammarAccess.getJsonCompositeValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:492:1: ( rule__JsonCompositeValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:492:2: rule__JsonCompositeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonCompositeValue__Alternatives_in_ruleJsonCompositeValue975);
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


    // $ANTLR start "ruleJsonLiteralValue"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:504:1: ruleJsonLiteralValue : ( ( rule__JsonLiteralValue__Alternatives ) ) ;
    public final void ruleJsonLiteralValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:508:1: ( ( ( rule__JsonLiteralValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:509:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:509:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:510:1: ( rule__JsonLiteralValue__Alternatives )
            {
             before(grammarAccess.getJsonLiteralValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:511:1: ( rule__JsonLiteralValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:511:2: rule__JsonLiteralValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonLiteralValue__Alternatives_in_ruleJsonLiteralValue1011);
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


    // $ANTLR start "rule__Mobgen__Alternatives_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:522:1: rule__Mobgen__Alternatives_1 : ( ( ( rule__Mobgen__ResourcesAssignment_1_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1_1 ) ) );
    public final void rule__Mobgen__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:526:1: ( ( ( rule__Mobgen__ResourcesAssignment_1_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=49 && LA1_0<=50)) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:527:1: ( ( rule__Mobgen__ResourcesAssignment_1_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:527:1: ( ( rule__Mobgen__ResourcesAssignment_1_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:528:1: ( rule__Mobgen__ResourcesAssignment_1_0 )
                    {
                     before(grammarAccess.getMobgenAccess().getResourcesAssignment_1_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:529:1: ( rule__Mobgen__ResourcesAssignment_1_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:529:2: rule__Mobgen__ResourcesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Mobgen__ResourcesAssignment_1_0_in_rule__Mobgen__Alternatives_11046);
                    rule__Mobgen__ResourcesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenAccess().getResourcesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:533:6: ( ( rule__Mobgen__CallsAssignment_1_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:533:6: ( ( rule__Mobgen__CallsAssignment_1_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:534:1: ( rule__Mobgen__CallsAssignment_1_1 )
                    {
                     before(grammarAccess.getMobgenAccess().getCallsAssignment_1_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:535:1: ( rule__Mobgen__CallsAssignment_1_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:535:2: rule__Mobgen__CallsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Mobgen__CallsAssignment_1_1_in_rule__Mobgen__Alternatives_11064);
                    rule__Mobgen__CallsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenAccess().getCallsAssignment_1_1()); 

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
    // $ANTLR end "rule__Mobgen__Alternatives_1"


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__Alternatives_2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:544:1: rule__MobgenHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) ) );
    public final void rule__MobgenHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:548:1: ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:549:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:549:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:550:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:551:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:551:2: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21097);
                    rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:555:6: ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:555:6: ( ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:556:1: ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterAssignment_2_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:557:1: ( rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:557:2: rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21115);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:566:1: rule__JsonObjectValue__Alternatives : ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) );
    public final void rule__JsonObjectValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:570:1: ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=30)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=22 && LA3_0<=23)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:571:1: ( ( rule__JsonObjectValue__ValueAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:571:1: ( ( rule__JsonObjectValue__ValueAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:572:1: ( rule__JsonObjectValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getValueAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:573:1: ( rule__JsonObjectValue__ValueAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:573:2: rule__JsonObjectValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__ValueAssignment_0_in_rule__JsonObjectValue__Alternatives1148);
                    rule__JsonObjectValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonObjectValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:577:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:577:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:578:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getCompositeAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:579:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:579:2: rule__JsonObjectValue__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1166);
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


    // $ANTLR start "rule__MobgenResourceDefinition__Alternatives"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:588:1: rule__MobgenResourceDefinition__Alternatives : ( ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) ) | ( ruleEnumInstance ) );
    public final void rule__MobgenResourceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:592:1: ( ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) ) | ( ruleEnumInstance ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==49) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:593:1: ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:593:1: ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:594:1: ( rule__MobgenResourceDefinition__ResourcesAssignment_0 )
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:595:1: ( rule__MobgenResourceDefinition__ResourcesAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:595:2: rule__MobgenResourceDefinition__ResourcesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MobgenResourceDefinition__ResourcesAssignment_0_in_rule__MobgenResourceDefinition__Alternatives1199);
                    rule__MobgenResourceDefinition__ResourcesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:599:6: ( ruleEnumInstance )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:599:6: ( ruleEnumInstance )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:600:1: ruleEnumInstance
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1217);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:610:1: rule__NestedType__Alternatives : ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) );
    public final void rule__NestedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:614:1: ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==51) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:615:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:615:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:616:1: ( rule__NestedType__ListAssignment_0 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:617:1: ( rule__NestedType__ListAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:617:2: rule__NestedType__ListAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1249);
                    rule__NestedType__ListAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:621:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:621:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:622:1: ( rule__NestedType__StringAssignment_1 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getStringAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:623:1: ( rule__NestedType__StringAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:623:2: rule__NestedType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1267);
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


    // $ANTLR start "rule__JsonCompositeValue__Alternatives"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:632:1: rule__JsonCompositeValue__Alternatives : ( ( ( 'JsonObject' ) ) | ( ( 'JsonArray' ) ) );
    public final void rule__JsonCompositeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:636:1: ( ( ( 'JsonObject' ) ) | ( ( 'JsonArray' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:637:1: ( ( 'JsonObject' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:637:1: ( ( 'JsonObject' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:638:1: ( 'JsonObject' )
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getJsonObjectEnumLiteralDeclaration_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:639:1: ( 'JsonObject' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:639:3: 'JsonObject'
                    {
                    match(input,22,FOLLOW_22_in_rule__JsonCompositeValue__Alternatives1301); 

                    }

                     after(grammarAccess.getJsonCompositeValueAccess().getJsonObjectEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:644:6: ( ( 'JsonArray' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:644:6: ( ( 'JsonArray' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:645:1: ( 'JsonArray' )
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getJsonArrayEnumLiteralDeclaration_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:646:1: ( 'JsonArray' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:646:3: 'JsonArray'
                    {
                    match(input,23,FOLLOW_23_in_rule__JsonCompositeValue__Alternatives1322); 

                    }

                     after(grammarAccess.getJsonCompositeValueAccess().getJsonArrayEnumLiteralDeclaration_1()); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:656:1: rule__JsonLiteralValue__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'EMPTY_JSON_OBJECT' ) ) | ( ( 'EMPTY_JSON_ARRAY' ) ) | ( ( 'JSON_LITERAL_BOOLEAN' ) ) | ( ( 'JSON_LITERAL_NULL' ) ) | ( ( 'JSON_NUMBER' ) ) | ( ( 'JSON_META_SCALAR_TYPE' ) ) );
    public final void rule__JsonLiteralValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:660:1: ( ( ( 'STRING' ) ) | ( ( 'EMPTY_JSON_OBJECT' ) ) | ( ( 'EMPTY_JSON_ARRAY' ) ) | ( ( 'JSON_LITERAL_BOOLEAN' ) ) | ( ( 'JSON_LITERAL_NULL' ) ) | ( ( 'JSON_NUMBER' ) ) | ( ( 'JSON_META_SCALAR_TYPE' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            case 30:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:661:1: ( ( 'STRING' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:661:1: ( ( 'STRING' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:662:1: ( 'STRING' )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:663:1: ( 'STRING' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:663:3: 'STRING'
                    {
                    match(input,24,FOLLOW_24_in_rule__JsonLiteralValue__Alternatives1358); 

                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:668:6: ( ( 'EMPTY_JSON_OBJECT' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:668:6: ( ( 'EMPTY_JSON_OBJECT' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:669:1: ( 'EMPTY_JSON_OBJECT' )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTEnumLiteralDeclaration_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:670:1: ( 'EMPTY_JSON_OBJECT' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:670:3: 'EMPTY_JSON_OBJECT'
                    {
                    match(input,25,FOLLOW_25_in_rule__JsonLiteralValue__Alternatives1379); 

                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:675:6: ( ( 'EMPTY_JSON_ARRAY' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:675:6: ( ( 'EMPTY_JSON_ARRAY' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:676:1: ( 'EMPTY_JSON_ARRAY' )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYEnumLiteralDeclaration_2()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:677:1: ( 'EMPTY_JSON_ARRAY' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:677:3: 'EMPTY_JSON_ARRAY'
                    {
                    match(input,26,FOLLOW_26_in_rule__JsonLiteralValue__Alternatives1400); 

                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:682:6: ( ( 'JSON_LITERAL_BOOLEAN' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:682:6: ( ( 'JSON_LITERAL_BOOLEAN' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:683:1: ( 'JSON_LITERAL_BOOLEAN' )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANEnumLiteralDeclaration_3()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:684:1: ( 'JSON_LITERAL_BOOLEAN' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:684:3: 'JSON_LITERAL_BOOLEAN'
                    {
                    match(input,27,FOLLOW_27_in_rule__JsonLiteralValue__Alternatives1421); 

                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:689:6: ( ( 'JSON_LITERAL_NULL' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:689:6: ( ( 'JSON_LITERAL_NULL' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:690:1: ( 'JSON_LITERAL_NULL' )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLEnumLiteralDeclaration_4()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:691:1: ( 'JSON_LITERAL_NULL' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:691:3: 'JSON_LITERAL_NULL'
                    {
                    match(input,28,FOLLOW_28_in_rule__JsonLiteralValue__Alternatives1442); 

                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:696:6: ( ( 'JSON_NUMBER' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:696:6: ( ( 'JSON_NUMBER' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:697:1: ( 'JSON_NUMBER' )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBEREnumLiteralDeclaration_5()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:698:1: ( 'JSON_NUMBER' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:698:3: 'JSON_NUMBER'
                    {
                    match(input,29,FOLLOW_29_in_rule__JsonLiteralValue__Alternatives1463); 

                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBEREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:703:6: ( ( 'JSON_META_SCALAR_TYPE' ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:703:6: ( ( 'JSON_META_SCALAR_TYPE' ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:704:1: ( 'JSON_META_SCALAR_TYPE' )
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPEEnumLiteralDeclaration_6()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:705:1: ( 'JSON_META_SCALAR_TYPE' )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:705:3: 'JSON_META_SCALAR_TYPE'
                    {
                    match(input,30,FOLLOW_30_in_rule__JsonLiteralValue__Alternatives1484); 

                    }

                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPEEnumLiteralDeclaration_6()); 

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


    // $ANTLR start "rule__Mobgen__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:717:1: rule__Mobgen__Group__0 : rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1 ;
    public final void rule__Mobgen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:721:1: ( rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:722:2: rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1
            {
            pushFollow(FOLLOW_rule__Mobgen__Group__0__Impl_in_rule__Mobgen__Group__01517);
            rule__Mobgen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mobgen__Group__1_in_rule__Mobgen__Group__01520);
            rule__Mobgen__Group__1();

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
    // $ANTLR end "rule__Mobgen__Group__0"


    // $ANTLR start "rule__Mobgen__Group__0__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:729:1: rule__Mobgen__Group__0__Impl : ( ( rule__Mobgen__PlatformAssignment_0 ) ) ;
    public final void rule__Mobgen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:733:1: ( ( ( rule__Mobgen__PlatformAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:734:1: ( ( rule__Mobgen__PlatformAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:734:1: ( ( rule__Mobgen__PlatformAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:735:1: ( rule__Mobgen__PlatformAssignment_0 )
            {
             before(grammarAccess.getMobgenAccess().getPlatformAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:736:1: ( rule__Mobgen__PlatformAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:736:2: rule__Mobgen__PlatformAssignment_0
            {
            pushFollow(FOLLOW_rule__Mobgen__PlatformAssignment_0_in_rule__Mobgen__Group__0__Impl1547);
            rule__Mobgen__PlatformAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMobgenAccess().getPlatformAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__Group__0__Impl"


    // $ANTLR start "rule__Mobgen__Group__1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:746:1: rule__Mobgen__Group__1 : rule__Mobgen__Group__1__Impl ;
    public final void rule__Mobgen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:750:1: ( rule__Mobgen__Group__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:751:2: rule__Mobgen__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mobgen__Group__1__Impl_in_rule__Mobgen__Group__11577);
            rule__Mobgen__Group__1__Impl();

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
    // $ANTLR end "rule__Mobgen__Group__1"


    // $ANTLR start "rule__Mobgen__Group__1__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:757:1: rule__Mobgen__Group__1__Impl : ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) ) ;
    public final void rule__Mobgen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:761:1: ( ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:762:1: ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:762:1: ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:763:1: ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:763:1: ( ( rule__Mobgen__Alternatives_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:764:1: ( rule__Mobgen__Alternatives_1 )
            {
             before(grammarAccess.getMobgenAccess().getAlternatives_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:765:1: ( rule__Mobgen__Alternatives_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:765:2: rule__Mobgen__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1606);
            rule__Mobgen__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMobgenAccess().getAlternatives_1()); 

            }

            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:768:1: ( ( rule__Mobgen__Alternatives_1 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:769:1: ( rule__Mobgen__Alternatives_1 )*
            {
             before(grammarAccess.getMobgenAccess().getAlternatives_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:770:1: ( rule__Mobgen__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35||(LA8_0>=49 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:770:2: rule__Mobgen__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1618);
            	    rule__Mobgen__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMobgenAccess().getAlternatives_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:785:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:789:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:790:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01655);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01658);
            rule__Platform__Group__1();

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
    // $ANTLR end "rule__Platform__Group__0"


    // $ANTLR start "rule__Platform__Group__0__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:797:1: rule__Platform__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:801:1: ( ( 'platform' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:802:1: ( 'platform' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:802:1: ( 'platform' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:803:1: 'platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Platform__Group__0__Impl1686); 
             after(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__0__Impl"


    // $ANTLR start "rule__Platform__Group__1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:816:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:820:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:821:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11717);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11720);
            rule__Platform__Group__2();

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
    // $ANTLR end "rule__Platform__Group__1"


    // $ANTLR start "rule__Platform__Group__1__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:828:1: rule__Platform__Group__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:832:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:833:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:833:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:834:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Platform__Group__1__Impl1748); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:847:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:851:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:852:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21779);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21782);
            rule__Platform__Group__3();

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
    // $ANTLR end "rule__Platform__Group__2"


    // $ANTLR start "rule__Platform__Group__2__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:859:1: rule__Platform__Group__2__Impl : ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:863:1: ( ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:864:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:864:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:865:1: ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:865:1: ( ( rule__Platform__Group_2__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:866:1: ( rule__Platform__Group_2__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:867:1: ( rule__Platform__Group_2__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:867:2: rule__Platform__Group_2__0
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1811);
            rule__Platform__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup_2()); 

            }

            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:870:1: ( ( rule__Platform__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:871:1: ( rule__Platform__Group_2__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:872:1: ( rule__Platform__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:872:2: rule__Platform__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1823);
            	    rule__Platform__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__2__Impl"


    // $ANTLR start "rule__Platform__Group__3"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:883:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:887:1: ( rule__Platform__Group__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:888:2: rule__Platform__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31856);
            rule__Platform__Group__3__Impl();

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
    // $ANTLR end "rule__Platform__Group__3"


    // $ANTLR start "rule__Platform__Group__3__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:894:1: rule__Platform__Group__3__Impl : ( '}' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:898:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:899:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:899:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:900:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Platform__Group__3__Impl1884); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__3__Impl"


    // $ANTLR start "rule__Platform__Group_2__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:921:1: rule__Platform__Group_2__0 : rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 ;
    public final void rule__Platform__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:925:1: ( rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:926:2: rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01923);
            rule__Platform__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01926);
            rule__Platform__Group_2__1();

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
    // $ANTLR end "rule__Platform__Group_2__0"


    // $ANTLR start "rule__Platform__Group_2__0__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:933:1: rule__Platform__Group_2__0__Impl : ( ( rule__Platform__PlatformsAssignment_2_0 ) ) ;
    public final void rule__Platform__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:937:1: ( ( ( rule__Platform__PlatformsAssignment_2_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:938:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:938:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:939:1: ( rule__Platform__PlatformsAssignment_2_0 )
            {
             before(grammarAccess.getPlatformAccess().getPlatformsAssignment_2_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:940:1: ( rule__Platform__PlatformsAssignment_2_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:940:2: rule__Platform__PlatformsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl1953);
            rule__Platform__PlatformsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getPlatformsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_2__0__Impl"


    // $ANTLR start "rule__Platform__Group_2__1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:950:1: rule__Platform__Group_2__1 : rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 ;
    public final void rule__Platform__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:954:1: ( rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:955:2: rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__11983);
            rule__Platform__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__11986);
            rule__Platform__Group_2__2();

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
    // $ANTLR end "rule__Platform__Group_2__1"


    // $ANTLR start "rule__Platform__Group_2__1__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:962:1: rule__Platform__Group_2__1__Impl : ( '->' ) ;
    public final void rule__Platform__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:966:1: ( ( '->' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:967:1: ( '->' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:967:1: ( '->' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:968:1: '->'
            {
             before(grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            match(input,34,FOLLOW_34_in_rule__Platform__Group_2__1__Impl2014); 
             after(grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_2__1__Impl"


    // $ANTLR start "rule__Platform__Group_2__2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:981:1: rule__Platform__Group_2__2 : rule__Platform__Group_2__2__Impl ;
    public final void rule__Platform__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:985:1: ( rule__Platform__Group_2__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:986:2: rule__Platform__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22045);
            rule__Platform__Group_2__2__Impl();

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
    // $ANTLR end "rule__Platform__Group_2__2"


    // $ANTLR start "rule__Platform__Group_2__2__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:992:1: rule__Platform__Group_2__2__Impl : ( ( rule__Platform__GenerateWhereAssignment_2_2 ) ) ;
    public final void rule__Platform__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:996:1: ( ( ( rule__Platform__GenerateWhereAssignment_2_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:997:1: ( ( rule__Platform__GenerateWhereAssignment_2_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:997:1: ( ( rule__Platform__GenerateWhereAssignment_2_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:998:1: ( rule__Platform__GenerateWhereAssignment_2_2 )
            {
             before(grammarAccess.getPlatformAccess().getGenerateWhereAssignment_2_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:999:1: ( rule__Platform__GenerateWhereAssignment_2_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:999:2: rule__Platform__GenerateWhereAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl2072);
            rule__Platform__GenerateWhereAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGenerateWhereAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_2__2__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1015:1: rule__MobgenCallDefinition__Group__0 : rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 ;
    public final void rule__MobgenCallDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1019:1: ( rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1020:2: rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02108);
            rule__MobgenCallDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02111);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1027:1: rule__MobgenCallDefinition__Group__0__Impl : ( 'call' ) ;
    public final void rule__MobgenCallDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1031:1: ( ( 'call' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1032:1: ( 'call' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1032:1: ( 'call' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1033:1: 'call'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__MobgenCallDefinition__Group__0__Impl2139); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1046:1: rule__MobgenCallDefinition__Group__1 : rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 ;
    public final void rule__MobgenCallDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1050:1: ( rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1051:2: rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12170);
            rule__MobgenCallDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12173);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1058:1: rule__MobgenCallDefinition__Group__1__Impl : ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) ;
    public final void rule__MobgenCallDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1062:1: ( ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1063:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1063:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1064:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1065:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1065:2: rule__MobgenCallDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2200);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1075:1: rule__MobgenCallDefinition__Group__2 : rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 ;
    public final void rule__MobgenCallDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1079:1: ( rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1080:2: rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22230);
            rule__MobgenCallDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22233);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1087:1: rule__MobgenCallDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__MobgenCallDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1091:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1092:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1092:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1093:1: ':'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__MobgenCallDefinition__Group__2__Impl2261); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1106:1: rule__MobgenCallDefinition__Group__3 : rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 ;
    public final void rule__MobgenCallDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1110:1: ( rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1111:2: rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32292);
            rule__MobgenCallDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32295);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1118:1: rule__MobgenCallDefinition__Group__3__Impl : ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) ;
    public final void rule__MobgenCallDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1122:1: ( ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1123:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1123:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1124:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1125:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1125:2: rule__MobgenCallDefinition__MethodAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2322);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1135:1: rule__MobgenCallDefinition__Group__4 : rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 ;
    public final void rule__MobgenCallDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1139:1: ( rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1140:2: rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42352);
            rule__MobgenCallDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42355);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1147:1: rule__MobgenCallDefinition__Group__4__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1151:1: ( ( 'from' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1152:1: ( 'from' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1152:1: ( 'from' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1153:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4()); 
            match(input,37,FOLLOW_37_in_rule__MobgenCallDefinition__Group__4__Impl2383); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1166:1: rule__MobgenCallDefinition__Group__5 : rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 ;
    public final void rule__MobgenCallDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1170:1: ( rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1171:2: rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52414);
            rule__MobgenCallDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52417);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1178:1: rule__MobgenCallDefinition__Group__5__Impl : ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) ;
    public final void rule__MobgenCallDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1182:1: ( ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1183:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1183:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1184:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriAssignment_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1185:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1185:2: rule__MobgenCallDefinition__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2444);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1195:1: rule__MobgenCallDefinition__Group__6 : rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 ;
    public final void rule__MobgenCallDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1199:1: ( rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1200:2: rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62474);
            rule__MobgenCallDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62477);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1207:1: rule__MobgenCallDefinition__Group__6__Impl : ( ( rule__MobgenCallDefinition__Group_6__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1211:1: ( ( ( rule__MobgenCallDefinition__Group_6__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1212:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1212:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1213:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1214:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1214:2: rule__MobgenCallDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2504);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1224:1: rule__MobgenCallDefinition__Group__7 : rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 ;
    public final void rule__MobgenCallDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1228:1: ( rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1229:2: rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72535);
            rule__MobgenCallDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72538);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1236:1: rule__MobgenCallDefinition__Group__7__Impl : ( ( rule__MobgenCallDefinition__Group_7__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1240:1: ( ( ( rule__MobgenCallDefinition__Group_7__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1241:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1241:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1242:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1243:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1243:2: rule__MobgenCallDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2565);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1253:1: rule__MobgenCallDefinition__Group__8 : rule__MobgenCallDefinition__Group__8__Impl ;
    public final void rule__MobgenCallDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1257:1: ( rule__MobgenCallDefinition__Group__8__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1258:2: rule__MobgenCallDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82596);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1264:1: rule__MobgenCallDefinition__Group__8__Impl : ( ( rule__MobgenCallDefinition__Group_8__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1268:1: ( ( ( rule__MobgenCallDefinition__Group_8__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1269:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1269:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1270:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_8()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1271:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1271:2: rule__MobgenCallDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2623);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1299:1: rule__MobgenCallDefinition__Group_6__0 : rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 ;
    public final void rule__MobgenCallDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1303:1: ( rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1304:2: rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02672);
            rule__MobgenCallDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02675);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1311:1: rule__MobgenCallDefinition__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__MobgenCallDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1315:1: ( ( 'with' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1316:1: ( 'with' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1316:1: ( 'with' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1317:1: 'with'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0()); 
            match(input,38,FOLLOW_38_in_rule__MobgenCallDefinition__Group_6__0__Impl2703); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1330:1: rule__MobgenCallDefinition__Group_6__1 : rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 ;
    public final void rule__MobgenCallDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1334:1: ( rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1335:2: rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12734);
            rule__MobgenCallDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12737);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1342:1: rule__MobgenCallDefinition__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__MobgenCallDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1346:1: ( ( 'headers' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1347:1: ( 'headers' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1347:1: ( 'headers' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1348:1: 'headers'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1()); 
            match(input,39,FOLLOW_39_in_rule__MobgenCallDefinition__Group_6__1__Impl2765); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1361:1: rule__MobgenCallDefinition__Group_6__2 : rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 ;
    public final void rule__MobgenCallDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1365:1: ( rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1366:2: rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22796);
            rule__MobgenCallDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22799);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1373:1: rule__MobgenCallDefinition__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1377:1: ( ( 'from' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1378:1: ( 'from' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1378:1: ( 'from' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1379:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2()); 
            match(input,37,FOLLOW_37_in_rule__MobgenCallDefinition__Group_6__2__Impl2827); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1392:1: rule__MobgenCallDefinition__Group_6__3 : rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 ;
    public final void rule__MobgenCallDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1396:1: ( rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1397:2: rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32858);
            rule__MobgenCallDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32861);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1404:1: rule__MobgenCallDefinition__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__MobgenCallDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1408:1: ( ( 'request' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1409:1: ( 'request' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1409:1: ( 'request' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1410:1: 'request'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3()); 
            match(input,40,FOLLOW_40_in_rule__MobgenCallDefinition__Group_6__3__Impl2889); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1423:1: rule__MobgenCallDefinition__Group_6__4 : rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 ;
    public final void rule__MobgenCallDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1427:1: ( rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1428:2: rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42920);
            rule__MobgenCallDefinition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42923);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1435:1: rule__MobgenCallDefinition__Group_6__4__Impl : ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1439:1: ( ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1440:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1440:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1441:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1442:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1442:2: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2950);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1452:1: rule__MobgenCallDefinition__Group_6__5 : rule__MobgenCallDefinition__Group_6__5__Impl ;
    public final void rule__MobgenCallDefinition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1456:1: ( rule__MobgenCallDefinition__Group_6__5__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1457:2: rule__MobgenCallDefinition__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52980);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1463:1: rule__MobgenCallDefinition__Group_6__5__Impl : ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1467:1: ( ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1468:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1468:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1469:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1470:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1470:2: rule__MobgenCallDefinition__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl3007);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1492:1: rule__MobgenCallDefinition__Group_6_5__0 : rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 ;
    public final void rule__MobgenCallDefinition__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1496:1: ( rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1497:2: rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__03050);
            rule__MobgenCallDefinition__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__03053);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1504:1: rule__MobgenCallDefinition__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1508:1: ( ( 'and' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1509:1: ( 'and' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1509:1: ( 'and' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1510:1: 'and'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0()); 
            match(input,41,FOLLOW_41_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3081); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1523:1: rule__MobgenCallDefinition__Group_6_5__1 : rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 ;
    public final void rule__MobgenCallDefinition__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1527:1: ( rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1528:2: rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13112);
            rule__MobgenCallDefinition__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13115);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1535:1: rule__MobgenCallDefinition__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1539:1: ( ( 'response' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1540:1: ( 'response' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1540:1: ( 'response' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1541:1: 'response'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1()); 
            match(input,42,FOLLOW_42_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3143); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1554:1: rule__MobgenCallDefinition__Group_6_5__2 : rule__MobgenCallDefinition__Group_6_5__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1558:1: ( rule__MobgenCallDefinition__Group_6_5__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1559:2: rule__MobgenCallDefinition__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23174);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1565:1: rule__MobgenCallDefinition__Group_6_5__2__Impl : ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1569:1: ( ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1570:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1570:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1571:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1572:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1572:2: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3201);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1588:1: rule__MobgenCallDefinition__Group_7__0 : rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 ;
    public final void rule__MobgenCallDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1592:1: ( rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1593:2: rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03237);
            rule__MobgenCallDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03240);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1600:1: rule__MobgenCallDefinition__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__MobgenCallDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1604:1: ( ( 'client' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1605:1: ( 'client' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1605:1: ( 'client' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1606:1: 'client'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0()); 
            match(input,43,FOLLOW_43_in_rule__MobgenCallDefinition__Group_7__0__Impl3268); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1619:1: rule__MobgenCallDefinition__Group_7__1 : rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 ;
    public final void rule__MobgenCallDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1623:1: ( rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1624:2: rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13299);
            rule__MobgenCallDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13302);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1631:1: rule__MobgenCallDefinition__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1635:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1636:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1636:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1637:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1()); 
            match(input,44,FOLLOW_44_in_rule__MobgenCallDefinition__Group_7__1__Impl3330); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1650:1: rule__MobgenCallDefinition__Group_7__2 : rule__MobgenCallDefinition__Group_7__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1654:1: ( rule__MobgenCallDefinition__Group_7__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1655:2: rule__MobgenCallDefinition__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23361);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1661:1: rule__MobgenCallDefinition__Group_7__2__Impl : ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1665:1: ( ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1666:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1666:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1667:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientAssignment_7_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1668:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1668:2: rule__MobgenCallDefinition__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3388);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1684:1: rule__MobgenCallDefinition__Group_8__0 : rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 ;
    public final void rule__MobgenCallDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1688:1: ( rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1689:2: rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03424);
            rule__MobgenCallDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03427);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1696:1: rule__MobgenCallDefinition__Group_8__0__Impl : ( 'server' ) ;
    public final void rule__MobgenCallDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1700:1: ( ( 'server' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1701:1: ( 'server' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1701:1: ( 'server' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1702:1: 'server'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0()); 
            match(input,45,FOLLOW_45_in_rule__MobgenCallDefinition__Group_8__0__Impl3455); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1715:1: rule__MobgenCallDefinition__Group_8__1 : rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 ;
    public final void rule__MobgenCallDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1719:1: ( rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1720:2: rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13486);
            rule__MobgenCallDefinition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13489);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1727:1: rule__MobgenCallDefinition__Group_8__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1731:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1732:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1732:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1733:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1()); 
            match(input,44,FOLLOW_44_in_rule__MobgenCallDefinition__Group_8__1__Impl3517); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1746:1: rule__MobgenCallDefinition__Group_8__2 : rule__MobgenCallDefinition__Group_8__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1750:1: ( rule__MobgenCallDefinition__Group_8__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1751:2: rule__MobgenCallDefinition__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23548);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1757:1: rule__MobgenCallDefinition__Group_8__2__Impl : ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1761:1: ( ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1762:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1762:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1763:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_8_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1764:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1764:2: rule__MobgenCallDefinition__JsonToServerAssignment_8_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3575);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1780:1: rule__MobgenHeader__Group__0 : rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 ;
    public final void rule__MobgenHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1784:1: ( rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1785:2: rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__03611);
            rule__MobgenHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__03614);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1792:1: rule__MobgenHeader__Group__0__Impl : ( ( rule__MobgenHeader__NameAssignment_0 ) ) ;
    public final void rule__MobgenHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1796:1: ( ( ( rule__MobgenHeader__NameAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1797:1: ( ( rule__MobgenHeader__NameAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1797:1: ( ( rule__MobgenHeader__NameAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1798:1: ( rule__MobgenHeader__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1799:1: ( rule__MobgenHeader__NameAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1799:2: rule__MobgenHeader__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl3641);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1809:1: rule__MobgenHeader__Group__1 : rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 ;
    public final void rule__MobgenHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1813:1: ( rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1814:2: rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__13671);
            rule__MobgenHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__13674);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1821:1: rule__MobgenHeader__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1825:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1826:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1826:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1827:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__MobgenHeader__Group__1__Impl3702); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1840:1: rule__MobgenHeader__Group__2 : rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 ;
    public final void rule__MobgenHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1844:1: ( rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1845:2: rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__23733);
            rule__MobgenHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__23736);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1852:1: rule__MobgenHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__MobgenHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1856:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1857:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1857:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1858:1: '{'
            {
             before(grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__MobgenHeader__Group__2__Impl3764); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1871:1: rule__MobgenHeader__Group__3 : rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 ;
    public final void rule__MobgenHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1875:1: ( rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1876:2: rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__33795);
            rule__MobgenHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__33798);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1883:1: rule__MobgenHeader__Group__3__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) ;
    public final void rule__MobgenHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1887:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1888:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1888:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1889:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1890:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1890:2: rule__MobgenHeader__HeaderKeyValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl3825);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1900:1: rule__MobgenHeader__Group__4 : rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 ;
    public final void rule__MobgenHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1904:1: ( rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1905:2: rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__43855);
            rule__MobgenHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__43858);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1912:1: rule__MobgenHeader__Group__4__Impl : ( ( rule__MobgenHeader__Group_4__0 )* ) ;
    public final void rule__MobgenHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1916:1: ( ( ( rule__MobgenHeader__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1917:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1917:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1918:1: ( rule__MobgenHeader__Group_4__0 )*
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1919:1: ( rule__MobgenHeader__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==47) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_STRING) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1919:2: rule__MobgenHeader__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl3885);
            	    rule__MobgenHeader__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1929:1: rule__MobgenHeader__Group__5 : rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 ;
    public final void rule__MobgenHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1933:1: ( rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1934:2: rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__53916);
            rule__MobgenHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__53919);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1941:1: rule__MobgenHeader__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MobgenHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1945:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1946:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1946:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1947:1: ( ',' )?
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1948:1: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1949:2: ','
                    {
                    match(input,47,FOLLOW_47_in_rule__MobgenHeader__Group__5__Impl3948); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1960:1: rule__MobgenHeader__Group__6 : rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 ;
    public final void rule__MobgenHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1964:1: ( rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1965:2: rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__63981);
            rule__MobgenHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__63984);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1972:1: rule__MobgenHeader__Group__6__Impl : ( '}' ) ;
    public final void rule__MobgenHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1976:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1977:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1977:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1978:1: '}'
            {
             before(grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__MobgenHeader__Group__6__Impl4012); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1991:1: rule__MobgenHeader__Group__7 : rule__MobgenHeader__Group__7__Impl ;
    public final void rule__MobgenHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1995:1: ( rule__MobgenHeader__Group__7__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1996:2: rule__MobgenHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__74043);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2002:1: rule__MobgenHeader__Group__7__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2006:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2007:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2007:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2008:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 
            match(input,46,FOLLOW_46_in_rule__MobgenHeader__Group__7__Impl4071); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2037:1: rule__MobgenHeader__Group_4__0 : rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 ;
    public final void rule__MobgenHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2041:1: ( rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2042:2: rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04118);
            rule__MobgenHeader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04121);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2049:1: rule__MobgenHeader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MobgenHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2053:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2054:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2054:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2055:1: ','
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__MobgenHeader__Group_4__0__Impl4149); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2068:1: rule__MobgenHeader__Group_4__1 : rule__MobgenHeader__Group_4__1__Impl ;
    public final void rule__MobgenHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2072:1: ( rule__MobgenHeader__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2073:2: rule__MobgenHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14180);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2079:1: rule__MobgenHeader__Group_4__1__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) ;
    public final void rule__MobgenHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2083:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2084:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2084:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2085:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2086:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2086:2: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4207);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2100:1: rule__MobgenHeaderKeyValuePair__Group__0 : rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2104:1: ( rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2105:2: rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04241);
            rule__MobgenHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04244);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2112:1: rule__MobgenHeaderKeyValuePair__Group__0__Impl : ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2116:1: ( ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2117:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2117:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2118:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2119:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2119:2: rule__MobgenHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4271);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2129:1: rule__MobgenHeaderKeyValuePair__Group__1 : rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2133:1: ( rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2134:2: rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14301);
            rule__MobgenHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14304);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2141:1: rule__MobgenHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2145:1: ( ( '=' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2146:1: ( '=' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2146:1: ( '=' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2147:1: '='
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4332); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2160:1: rule__MobgenHeaderKeyValuePair__Group__2 : rule__MobgenHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2164:1: ( rule__MobgenHeaderKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2165:2: rule__MobgenHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24363);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2171:1: rule__MobgenHeaderKeyValuePair__Group__2__Impl : ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2175:1: ( ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2176:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2176:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2177:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2178:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2178:2: rule__MobgenHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4390);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2194:1: rule__MobgenHeaderParameter__Group__0 : rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1 ;
    public final void rule__MobgenHeaderParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2198:1: ( rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2199:2: rule__MobgenHeaderParameter__Group__0__Impl rule__MobgenHeaderParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__0__Impl_in_rule__MobgenHeaderParameter__Group__04426);
            rule__MobgenHeaderParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__1_in_rule__MobgenHeaderParameter__Group__04429);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2206:1: rule__MobgenHeaderParameter__Group__0__Impl : ( '{' ) ;
    public final void rule__MobgenHeaderParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2210:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2211:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2211:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2212:1: '{'
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__MobgenHeaderParameter__Group__0__Impl4457); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2225:1: rule__MobgenHeaderParameter__Group__1 : rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2 ;
    public final void rule__MobgenHeaderParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2229:1: ( rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2230:2: rule__MobgenHeaderParameter__Group__1__Impl rule__MobgenHeaderParameter__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__1__Impl_in_rule__MobgenHeaderParameter__Group__14488);
            rule__MobgenHeaderParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__2_in_rule__MobgenHeaderParameter__Group__14491);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2237:1: rule__MobgenHeaderParameter__Group__1__Impl : ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) ) ;
    public final void rule__MobgenHeaderParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2241:1: ( ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2242:1: ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2242:1: ( ( rule__MobgenHeaderParameter__IdAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2243:1: ( rule__MobgenHeaderParameter__IdAssignment_1 )
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getIdAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2244:1: ( rule__MobgenHeaderParameter__IdAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2244:2: rule__MobgenHeaderParameter__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__IdAssignment_1_in_rule__MobgenHeaderParameter__Group__1__Impl4518);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2254:1: rule__MobgenHeaderParameter__Group__2 : rule__MobgenHeaderParameter__Group__2__Impl ;
    public final void rule__MobgenHeaderParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2258:1: ( rule__MobgenHeaderParameter__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2259:2: rule__MobgenHeaderParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderParameter__Group__2__Impl_in_rule__MobgenHeaderParameter__Group__24548);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2265:1: rule__MobgenHeaderParameter__Group__2__Impl : ( '}' ) ;
    public final void rule__MobgenHeaderParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2269:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2270:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2270:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2271:1: '}'
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__MobgenHeaderParameter__Group__2__Impl4576); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2290:1: rule__MobgenJson__Group__0 : rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 ;
    public final void rule__MobgenJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2294:1: ( rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2295:2: rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04613);
            rule__MobgenJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04616);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2302:1: rule__MobgenJson__Group__0__Impl : ( ( rule__MobgenJson__NameAssignment_0 ) ) ;
    public final void rule__MobgenJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2306:1: ( ( ( rule__MobgenJson__NameAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2307:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2307:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2308:1: ( rule__MobgenJson__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2309:1: ( rule__MobgenJson__NameAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2309:2: rule__MobgenJson__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4643);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2319:1: rule__MobgenJson__Group__1 : rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 ;
    public final void rule__MobgenJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2323:1: ( rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2324:2: rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14673);
            rule__MobgenJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14676);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2331:1: rule__MobgenJson__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2335:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2336:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2336:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2337:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__MobgenJson__Group__1__Impl4704); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2350:1: rule__MobgenJson__Group__2 : rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 ;
    public final void rule__MobgenJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2354:1: ( rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2355:2: rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__24735);
            rule__MobgenJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__24738);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2362:1: rule__MobgenJson__Group__2__Impl : ( ( rule__MobgenJson__ValueAssignment_2 ) ) ;
    public final void rule__MobgenJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2366:1: ( ( ( rule__MobgenJson__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2367:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2367:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2368:1: ( rule__MobgenJson__ValueAssignment_2 )
            {
             before(grammarAccess.getMobgenJsonAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2369:1: ( rule__MobgenJson__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2369:2: rule__MobgenJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl4765);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2379:1: rule__MobgenJson__Group__3 : rule__MobgenJson__Group__3__Impl ;
    public final void rule__MobgenJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2383:1: ( rule__MobgenJson__Group__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2384:2: rule__MobgenJson__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__34795);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2390:1: rule__MobgenJson__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2394:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2395:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2395:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2396:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__MobgenJson__Group__3__Impl4823); 
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


    // $ANTLR start "rule__JsonKeyValuePair__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2419:1: rule__JsonKeyValuePair__Group__0 : rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 ;
    public final void rule__JsonKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2423:1: ( rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2424:2: rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__04864);
            rule__JsonKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__04867);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2431:1: rule__JsonKeyValuePair__Group__0__Impl : ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2435:1: ( ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2436:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2436:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2437:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2438:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2438:2: rule__JsonKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl4894);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2448:1: rule__JsonKeyValuePair__Group__1 : rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 ;
    public final void rule__JsonKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2452:1: ( rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2453:2: rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__14924);
            rule__JsonKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__14927);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2460:1: rule__JsonKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2464:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2465:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2465:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2466:1: ':'
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__JsonKeyValuePair__Group__1__Impl4955); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2479:1: rule__JsonKeyValuePair__Group__2 : rule__JsonKeyValuePair__Group__2__Impl ;
    public final void rule__JsonKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2483:1: ( rule__JsonKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2484:2: rule__JsonKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__24986);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2490:1: rule__JsonKeyValuePair__Group__2__Impl : ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2494:1: ( ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2495:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2495:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2496:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2497:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2497:2: rule__JsonKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5013);
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


    // $ANTLR start "rule__EnumInstance__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2515:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2519:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2520:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__05051);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__05054);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2527:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2531:1: ( ( 'enum' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2532:1: ( 'enum' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2532:1: ( 'enum' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2533:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__EnumInstance__Group__0__Impl5082); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2546:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2550:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2551:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__15113);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__15116);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2558:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2562:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2563:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2563:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2564:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2565:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2565:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl5143);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2575:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2579:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2580:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__25173);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__25176);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2587:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2591:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2592:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2592:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2593:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__EnumInstance__Group__2__Impl5204); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2606:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2610:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2611:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__35235);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__35238);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2618:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2622:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2623:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2623:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2624:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2625:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2625:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl5265);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2635:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2639:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2640:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__45295);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__45298);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2647:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2651:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2652:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2652:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2653:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2654:1: ( rule__EnumInstance__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_ID) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2654:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl5325);
            	    rule__EnumInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2664:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2668:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2669:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__55356);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__55359);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2676:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2680:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2681:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2681:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2682:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2683:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2684:2: ','
                    {
                    match(input,47,FOLLOW_47_in_rule__EnumInstance__Group__5__Impl5388); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2695:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2699:1: ( rule__EnumInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2700:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__65421);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2706:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2710:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2711:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2711:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2712:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__EnumInstance__Group__6__Impl5449); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2739:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2743:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2744:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__05494);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__05497);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2751:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2755:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2756:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2756:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2757:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__EnumInstance__Group_4__0__Impl5525); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2770:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2774:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2775:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__15556);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2781:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2785:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2786:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2786:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2787:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2788:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2788:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl5583);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2802:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2806:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2807:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__05617);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__05620);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2814:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2818:1: ( ( 'map' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2819:1: ( 'map' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2819:1: ( 'map' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2820:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__MapInstance__Group__0__Impl5648); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2833:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2837:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2838:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__15679);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__15682);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2845:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__NameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2849:1: ( ( ( rule__MapInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2850:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2850:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2851:1: ( rule__MapInstance__NameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2852:1: ( rule__MapInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2852:2: rule__MapInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl5709);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2862:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2866:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2867:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__25739);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__25742);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2874:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2878:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2879:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2879:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2880:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__MapInstance__Group__2__Impl5770); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2893:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2897:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2898:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__35801);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__35804);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2905:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__Group_3__0 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2909:1: ( ( ( rule__MapInstance__Group_3__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2910:1: ( ( rule__MapInstance__Group_3__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2910:1: ( ( rule__MapInstance__Group_3__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2911:1: ( rule__MapInstance__Group_3__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2912:1: ( rule__MapInstance__Group_3__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2912:2: rule__MapInstance__Group_3__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl5831);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2922:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2926:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2927:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__45861);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__45864);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2934:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2938:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2939:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2939:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2940:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2941:1: ( rule__MapInstance__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==47) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_ID) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2941:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl5891);
            	    rule__MapInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2951:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2955:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2956:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__55922);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__55925);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2963:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2967:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2968:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2968:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2969:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2970:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2971:2: ','
                    {
                    match(input,47,FOLLOW_47_in_rule__MapInstance__Group__5__Impl5954); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2982:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2986:1: ( rule__MapInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2987:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__65987);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2993:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2997:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2998:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2998:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2999:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__MapInstance__Group__6__Impl6015); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3026:1: rule__MapInstance__Group_3__0 : rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 ;
    public final void rule__MapInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3030:1: ( rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3031:2: rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__06060);
            rule__MapInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__06063);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3038:1: rule__MapInstance__Group_3__0__Impl : ( ( rule__MapInstance__KeysAssignment_3_0 ) ) ;
    public final void rule__MapInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3042:1: ( ( ( rule__MapInstance__KeysAssignment_3_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3043:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3043:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3044:1: ( rule__MapInstance__KeysAssignment_3_0 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3045:1: ( rule__MapInstance__KeysAssignment_3_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3045:2: rule__MapInstance__KeysAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl6090);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3055:1: rule__MapInstance__Group_3__1 : rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 ;
    public final void rule__MapInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3059:1: ( rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3060:2: rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__16120);
            rule__MapInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__16123);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3067:1: rule__MapInstance__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3071:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3072:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3072:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3073:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 
            match(input,36,FOLLOW_36_in_rule__MapInstance__Group_3__1__Impl6151); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3086:1: rule__MapInstance__Group_3__2 : rule__MapInstance__Group_3__2__Impl ;
    public final void rule__MapInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3090:1: ( rule__MapInstance__Group_3__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3091:2: rule__MapInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__26182);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3097:1: rule__MapInstance__Group_3__2__Impl : ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) ;
    public final void rule__MapInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3101:1: ( ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3102:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3102:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3103:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3104:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3104:2: rule__MapInstance__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl6209);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3120:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3124:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3125:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__06245);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__06248);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3132:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3136:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3137:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3137:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3138:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__MapInstance__Group_4__0__Impl6276); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3151:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3155:1: ( rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3156:2: rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__16307);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__16310);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3163:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__KeysAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3167:1: ( ( ( rule__MapInstance__KeysAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3168:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3168:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3169:1: ( rule__MapInstance__KeysAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3170:1: ( rule__MapInstance__KeysAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3170:2: rule__MapInstance__KeysAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl6337);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3180:1: rule__MapInstance__Group_4__2 : rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 ;
    public final void rule__MapInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3184:1: ( rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3185:2: rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__26367);
            rule__MapInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__26370);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3192:1: rule__MapInstance__Group_4__2__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3196:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3197:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3197:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3198:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 
            match(input,36,FOLLOW_36_in_rule__MapInstance__Group_4__2__Impl6398); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3211:1: rule__MapInstance__Group_4__3 : rule__MapInstance__Group_4__3__Impl ;
    public final void rule__MapInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3215:1: ( rule__MapInstance__Group_4__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3216:2: rule__MapInstance__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__36429);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3222:1: rule__MapInstance__Group_4__3__Impl : ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) ;
    public final void rule__MapInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3226:1: ( ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3227:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3227:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3228:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3229:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3229:2: rule__MapInstance__ValuesAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl6456);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3247:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3251:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3252:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__06494);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__06497);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3259:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3263:1: ( ( '[' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3264:1: ( '[' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3264:1: ( '[' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3265:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__StringList__Group__0__Impl6525); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3278:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3282:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3283:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__16556);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__16559);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3290:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3294:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3295:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3295:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3296:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3297:1: ( rule__StringList__ValuesAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3297:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl6586);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3307:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3311:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3312:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__26616);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__26619);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3319:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3323:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3324:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3324:1: ( ( rule__StringList__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3325:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3326:1: ( rule__StringList__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==47) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_STRING) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3326:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl6646);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3336:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3340:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3341:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__36677);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__36680);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3348:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3352:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3353:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3353:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3354:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3355:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3356:2: ','
                    {
                    match(input,47,FOLLOW_47_in_rule__StringList__Group__3__Impl6709); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3367:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3371:1: ( rule__StringList__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3372:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__46742);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3378:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3382:1: ( ( ']' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3383:1: ( ']' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3383:1: ( ']' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3384:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,52,FOLLOW_52_in_rule__StringList__Group__4__Impl6770); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3407:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3411:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3412:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__06811);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__06814);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3419:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3423:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3424:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3424:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3425:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__StringList__Group_2__0__Impl6842); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3438:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3442:1: ( rule__StringList__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3443:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__16873);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3449:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3453:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3454:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3454:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3455:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3456:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3456:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl6900);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3470:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3474:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3475:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__06934);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__06937);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3482:1: rule__URI__Group__0__Impl : ( ( rule__URI__UrlPrefixAssignment_0 ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3486:1: ( ( ( rule__URI__UrlPrefixAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3487:1: ( ( rule__URI__UrlPrefixAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3487:1: ( ( rule__URI__UrlPrefixAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3488:1: ( rule__URI__UrlPrefixAssignment_0 )
            {
             before(grammarAccess.getURIAccess().getUrlPrefixAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3489:1: ( rule__URI__UrlPrefixAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3489:2: rule__URI__UrlPrefixAssignment_0
            {
            pushFollow(FOLLOW_rule__URI__UrlPrefixAssignment_0_in_rule__URI__Group__0__Impl6964);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3499:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3503:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3504:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__16994);
            rule__URI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__16997);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3511:1: rule__URI__Group__1__Impl : ( ( rule__URI__PathAssignment_1 ) ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3515:1: ( ( ( rule__URI__PathAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3516:1: ( ( rule__URI__PathAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3516:1: ( ( rule__URI__PathAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3517:1: ( rule__URI__PathAssignment_1 )
            {
             before(grammarAccess.getURIAccess().getPathAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3518:1: ( rule__URI__PathAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3518:2: rule__URI__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__URI__PathAssignment_1_in_rule__URI__Group__1__Impl7024);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3528:1: rule__URI__Group__2 : rule__URI__Group__2__Impl rule__URI__Group__3 ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3532:1: ( rule__URI__Group__2__Impl rule__URI__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3533:2: rule__URI__Group__2__Impl rule__URI__Group__3
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__27054);
            rule__URI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__3_in_rule__URI__Group__27057);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3540:1: rule__URI__Group__2__Impl : ( ( rule__URI__Group_2__0 )* ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3544:1: ( ( ( rule__URI__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3545:1: ( ( rule__URI__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3545:1: ( ( rule__URI__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3546:1: ( rule__URI__Group_2__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3547:1: ( rule__URI__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3547:2: rule__URI__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl7084);
            	    rule__URI__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3557:1: rule__URI__Group__3 : rule__URI__Group__3__Impl rule__URI__Group__4 ;
    public final void rule__URI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3561:1: ( rule__URI__Group__3__Impl rule__URI__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3562:2: rule__URI__Group__3__Impl rule__URI__Group__4
            {
            pushFollow(FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__37115);
            rule__URI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__4_in_rule__URI__Group__37118);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3569:1: rule__URI__Group__3__Impl : ( ( rule__URI__QueryAssignment_3 ) ) ;
    public final void rule__URI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3573:1: ( ( ( rule__URI__QueryAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3574:1: ( ( rule__URI__QueryAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3574:1: ( ( rule__URI__QueryAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3575:1: ( rule__URI__QueryAssignment_3 )
            {
             before(grammarAccess.getURIAccess().getQueryAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3576:1: ( rule__URI__QueryAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3576:2: rule__URI__QueryAssignment_3
            {
            pushFollow(FOLLOW_rule__URI__QueryAssignment_3_in_rule__URI__Group__3__Impl7145);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3586:1: rule__URI__Group__4 : rule__URI__Group__4__Impl ;
    public final void rule__URI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3590:1: ( rule__URI__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3591:2: rule__URI__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__47175);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3597:1: rule__URI__Group__4__Impl : ( ( rule__URI__Group_4__0 )* ) ;
    public final void rule__URI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3601:1: ( ( ( rule__URI__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3602:1: ( ( rule__URI__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3602:1: ( ( rule__URI__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3603:1: ( rule__URI__Group_4__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3604:1: ( rule__URI__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3604:2: rule__URI__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl7202);
            	    rule__URI__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3624:1: rule__URI__Group_2__0 : rule__URI__Group_2__0__Impl rule__URI__Group_2__1 ;
    public final void rule__URI__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3628:1: ( rule__URI__Group_2__0__Impl rule__URI__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3629:2: rule__URI__Group_2__0__Impl rule__URI__Group_2__1
            {
            pushFollow(FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__07243);
            rule__URI__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__07246);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3636:1: rule__URI__Group_2__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3640:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3641:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3641:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3642:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__URI__Group_2__0__Impl7274); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3655:1: rule__URI__Group_2__1 : rule__URI__Group_2__1__Impl rule__URI__Group_2__2 ;
    public final void rule__URI__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3659:1: ( rule__URI__Group_2__1__Impl rule__URI__Group_2__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3660:2: rule__URI__Group_2__1__Impl rule__URI__Group_2__2
            {
            pushFollow(FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__17305);
            rule__URI__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__2_in_rule__URI__Group_2__17308);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3667:1: rule__URI__Group_2__1__Impl : ( ( rule__URI__PathParametersAssignment_2_1 ) ) ;
    public final void rule__URI__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3671:1: ( ( ( rule__URI__PathParametersAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3672:1: ( ( rule__URI__PathParametersAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3672:1: ( ( rule__URI__PathParametersAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3673:1: ( rule__URI__PathParametersAssignment_2_1 )
            {
             before(grammarAccess.getURIAccess().getPathParametersAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3674:1: ( rule__URI__PathParametersAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3674:2: rule__URI__PathParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__URI__PathParametersAssignment_2_1_in_rule__URI__Group_2__1__Impl7335);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3684:1: rule__URI__Group_2__2 : rule__URI__Group_2__2__Impl rule__URI__Group_2__3 ;
    public final void rule__URI__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3688:1: ( rule__URI__Group_2__2__Impl rule__URI__Group_2__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3689:2: rule__URI__Group_2__2__Impl rule__URI__Group_2__3
            {
            pushFollow(FOLLOW_rule__URI__Group_2__2__Impl_in_rule__URI__Group_2__27365);
            rule__URI__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__3_in_rule__URI__Group_2__27368);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3696:1: rule__URI__Group_2__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3700:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3701:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3701:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3702:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,33,FOLLOW_33_in_rule__URI__Group_2__2__Impl7396); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3715:1: rule__URI__Group_2__3 : rule__URI__Group_2__3__Impl ;
    public final void rule__URI__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3719:1: ( rule__URI__Group_2__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3720:2: rule__URI__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_2__3__Impl_in_rule__URI__Group_2__37427);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3726:1: rule__URI__Group_2__3__Impl : ( ( rule__URI__PathSuffixAssignment_2_3 ) ) ;
    public final void rule__URI__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3730:1: ( ( ( rule__URI__PathSuffixAssignment_2_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3731:1: ( ( rule__URI__PathSuffixAssignment_2_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3731:1: ( ( rule__URI__PathSuffixAssignment_2_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3732:1: ( rule__URI__PathSuffixAssignment_2_3 )
            {
             before(grammarAccess.getURIAccess().getPathSuffixAssignment_2_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3733:1: ( rule__URI__PathSuffixAssignment_2_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3733:2: rule__URI__PathSuffixAssignment_2_3
            {
            pushFollow(FOLLOW_rule__URI__PathSuffixAssignment_2_3_in_rule__URI__Group_2__3__Impl7454);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3751:1: rule__URI__Group_4__0 : rule__URI__Group_4__0__Impl rule__URI__Group_4__1 ;
    public final void rule__URI__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3755:1: ( rule__URI__Group_4__0__Impl rule__URI__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3756:2: rule__URI__Group_4__0__Impl rule__URI__Group_4__1
            {
            pushFollow(FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__07492);
            rule__URI__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__07495);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3763:1: rule__URI__Group_4__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3767:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3768:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3768:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3769:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__URI__Group_4__0__Impl7523); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3782:1: rule__URI__Group_4__1 : rule__URI__Group_4__1__Impl rule__URI__Group_4__2 ;
    public final void rule__URI__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3786:1: ( rule__URI__Group_4__1__Impl rule__URI__Group_4__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3787:2: rule__URI__Group_4__1__Impl rule__URI__Group_4__2
            {
            pushFollow(FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__17554);
            rule__URI__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__2_in_rule__URI__Group_4__17557);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3794:1: rule__URI__Group_4__1__Impl : ( ( rule__URI__QueryParametersAssignment_4_1 ) ) ;
    public final void rule__URI__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3798:1: ( ( ( rule__URI__QueryParametersAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3799:1: ( ( rule__URI__QueryParametersAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3799:1: ( ( rule__URI__QueryParametersAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3800:1: ( rule__URI__QueryParametersAssignment_4_1 )
            {
             before(grammarAccess.getURIAccess().getQueryParametersAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3801:1: ( rule__URI__QueryParametersAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3801:2: rule__URI__QueryParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__URI__QueryParametersAssignment_4_1_in_rule__URI__Group_4__1__Impl7584);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3811:1: rule__URI__Group_4__2 : rule__URI__Group_4__2__Impl rule__URI__Group_4__3 ;
    public final void rule__URI__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3815:1: ( rule__URI__Group_4__2__Impl rule__URI__Group_4__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3816:2: rule__URI__Group_4__2__Impl rule__URI__Group_4__3
            {
            pushFollow(FOLLOW_rule__URI__Group_4__2__Impl_in_rule__URI__Group_4__27614);
            rule__URI__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_4__3_in_rule__URI__Group_4__27617);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3823:1: rule__URI__Group_4__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3827:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3828:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3828:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3829:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,33,FOLLOW_33_in_rule__URI__Group_4__2__Impl7645); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3842:1: rule__URI__Group_4__3 : rule__URI__Group_4__3__Impl ;
    public final void rule__URI__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3846:1: ( rule__URI__Group_4__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3847:2: rule__URI__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_4__3__Impl_in_rule__URI__Group_4__37676);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3853:1: rule__URI__Group_4__3__Impl : ( ( rule__URI__QuerySuffixAssignment_4_3 ) ) ;
    public final void rule__URI__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3857:1: ( ( ( rule__URI__QuerySuffixAssignment_4_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3858:1: ( ( rule__URI__QuerySuffixAssignment_4_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3858:1: ( ( rule__URI__QuerySuffixAssignment_4_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3859:1: ( rule__URI__QuerySuffixAssignment_4_3 )
            {
             before(grammarAccess.getURIAccess().getQuerySuffixAssignment_4_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3860:1: ( rule__URI__QuerySuffixAssignment_4_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3860:2: rule__URI__QuerySuffixAssignment_4_3
            {
            pushFollow(FOLLOW_rule__URI__QuerySuffixAssignment_4_3_in_rule__URI__Group_4__3__Impl7703);
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


    // $ANTLR start "rule__Mobgen__PlatformAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3879:1: rule__Mobgen__PlatformAssignment_0 : ( rulePlatform ) ;
    public final void rule__Mobgen__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3883:1: ( ( rulePlatform ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3884:1: ( rulePlatform )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3884:1: ( rulePlatform )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3885:1: rulePlatform
            {
             before(grammarAccess.getMobgenAccess().getPlatformPlatformParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePlatform_in_rule__Mobgen__PlatformAssignment_07746);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getMobgenAccess().getPlatformPlatformParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__PlatformAssignment_0"


    // $ANTLR start "rule__Mobgen__ResourcesAssignment_1_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3894:1: rule__Mobgen__ResourcesAssignment_1_0 : ( ruleMobgenResourceDefinition ) ;
    public final void rule__Mobgen__ResourcesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3898:1: ( ( ruleMobgenResourceDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3899:1: ( ruleMobgenResourceDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3899:1: ( ruleMobgenResourceDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3900:1: ruleMobgenResourceDefinition
            {
             before(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_1_07777);
            ruleMobgenResourceDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__ResourcesAssignment_1_0"


    // $ANTLR start "rule__Mobgen__CallsAssignment_1_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3909:1: rule__Mobgen__CallsAssignment_1_1 : ( ruleMobgenCallDefinition ) ;
    public final void rule__Mobgen__CallsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3913:1: ( ( ruleMobgenCallDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3914:1: ( ruleMobgenCallDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3914:1: ( ruleMobgenCallDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3915:1: ruleMobgenCallDefinition
            {
             before(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_1_17808);
            ruleMobgenCallDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mobgen__CallsAssignment_1_1"


    // $ANTLR start "rule__Platform__PlatformsAssignment_2_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3924:1: rule__Platform__PlatformsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Platform__PlatformsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3928:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3929:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3929:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3930:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_07839); 
             after(grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__PlatformsAssignment_2_0"


    // $ANTLR start "rule__Platform__GenerateWhereAssignment_2_2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3939:1: rule__Platform__GenerateWhereAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Platform__GenerateWhereAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3943:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3944:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3944:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3945:1: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getGenerateWhereSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_27870); 
             after(grammarAccess.getPlatformAccess().getGenerateWhereSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__GenerateWhereAssignment_2_2"


    // $ANTLR start "rule__MobgenCallDefinition__NameAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3954:1: rule__MobgenCallDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenCallDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3958:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3959:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3959:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3960:1: RULE_ID
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_17901); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3969:1: rule__MobgenCallDefinition__MethodAssignment_3 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__MobgenCallDefinition__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3973:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3974:1: ( RULE_RESTFUL_METHODS )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3974:1: ( RULE_RESTFUL_METHODS )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3975:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__MobgenCallDefinition__MethodAssignment_37932); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3984:1: rule__MobgenCallDefinition__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__MobgenCallDefinition__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3988:1: ( ( ruleURI ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3989:1: ( ruleURI )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3989:1: ( ruleURI )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3990:1: ruleURI
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_57963);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3999:1: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4003:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4004:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4004:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4005:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_47994);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4014:1: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4018:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4019:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4019:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4020:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28025);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4029:1: rule__MobgenCallDefinition__JsonToClientAssignment_7_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4033:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4034:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4034:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4035:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28056);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4044:1: rule__MobgenCallDefinition__JsonToServerAssignment_8_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToServerAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4048:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4049:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4049:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4050:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_28087);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4059:1: rule__MobgenHeader__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenHeader__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4063:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4064:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4064:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4065:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08118); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4074:1: rule__MobgenHeader__HeaderKeyValuesAssignment_3 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4078:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4079:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4079:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4080:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38149);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4089:1: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4093:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4094:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4094:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4095:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18180);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4104:1: rule__MobgenHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4108:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4109:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4109:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4110:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08211); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4119:1: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4123:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4124:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4124:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4125:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08242); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4134:1: rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1 : ( ruleMobgenHeaderParameter ) ;
    public final void rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4138:1: ( ( ruleMobgenHeaderParameter ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4139:1: ( ruleMobgenHeaderParameter )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4139:1: ( ruleMobgenHeaderParameter )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4140:1: ruleMobgenHeaderParameter
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterMobgenHeaderParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_18273);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4149:1: rule__MobgenHeaderParameter__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenHeaderParameter__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4153:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4154:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4154:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4155:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderParameterAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeaderParameter__IdAssignment_18304); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4164:1: rule__MobgenJson__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenJson__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4168:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4169:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4169:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4170:1: RULE_ID
            {
             before(grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08335); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4179:1: rule__MobgenJson__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__MobgenJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4183:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4184:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4184:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4185:1: ruleJsonObjectValue
            {
             before(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_28366);
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


    // $ANTLR start "rule__JsonObjectValue__ValueAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4194:1: rule__JsonObjectValue__ValueAssignment_0 : ( ruleJsonLiteralValue ) ;
    public final void rule__JsonObjectValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4198:1: ( ( ruleJsonLiteralValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4199:1: ( ruleJsonLiteralValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4199:1: ( ruleJsonLiteralValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4200:1: ruleJsonLiteralValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ValueAssignment_08397);
            ruleJsonLiteralValue();

            state._fsp--;

             after(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObjectValue__ValueAssignment_0"


    // $ANTLR start "rule__JsonObjectValue__CompositeAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4209:1: rule__JsonObjectValue__CompositeAssignment_1 : ( ruleJsonCompositeValue ) ;
    public final void rule__JsonObjectValue__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4213:1: ( ( ruleJsonCompositeValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4214:1: ( ruleJsonCompositeValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4214:1: ( ruleJsonCompositeValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4215:1: ruleJsonCompositeValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_18428);
            ruleJsonCompositeValue();

            state._fsp--;

             after(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueEnumRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonKeyValuePair__KeyAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4226:1: rule__JsonKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4230:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4231:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4231:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4232:1: RULE_STRING
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08461); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4241:1: rule__JsonKeyValuePair__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4245:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4246:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4246:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4247:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28492);
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


    // $ANTLR start "rule__MobgenResourceDefinition__ResourcesAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4258:1: rule__MobgenResourceDefinition__ResourcesAssignment_0 : ( ruleMapInstance ) ;
    public final void rule__MobgenResourceDefinition__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4262:1: ( ( ruleMapInstance ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4263:1: ( ruleMapInstance )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4263:1: ( ruleMapInstance )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4264:1: ruleMapInstance
            {
             before(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__ResourcesAssignment_08525);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenResourceDefinition__ResourcesAssignment_0"


    // $ANTLR start "rule__EnumInstance__NameAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4273:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4277:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4278:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4278:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4279:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_18556); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4288:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4292:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4293:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4293:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4294:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_38587); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4303:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4307:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4308:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4308:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4309:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_18618); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4318:1: rule__MapInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4322:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4323:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4323:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4324:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_18649); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4333:1: rule__MapInstance__KeysAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4337:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4338:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4338:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4339:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_08680); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4348:1: rule__MapInstance__ValuesAssignment_3_2 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4352:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4353:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4353:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4354:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_28711);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4363:1: rule__MapInstance__KeysAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4367:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4368:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4368:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4369:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_18742); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4378:1: rule__MapInstance__ValuesAssignment_4_3 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4382:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4383:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4383:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4384:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_38773);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4393:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4397:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4398:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4398:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4399:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_18804); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4408:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4412:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4413:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4413:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4414:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_18835); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4423:1: rule__NestedType__ListAssignment_0 : ( ruleStringList ) ;
    public final void rule__NestedType__ListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4427:1: ( ( ruleStringList ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4428:1: ( ruleStringList )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4428:1: ( ruleStringList )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4429:1: ruleStringList
            {
             before(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_08866);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4438:1: rule__NestedType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NestedType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4442:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4443:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4443:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4444:1: RULE_STRING
            {
             before(grammarAccess.getNestedTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_18897); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4453:1: rule__URI__UrlPrefixAssignment_0 : ( RULE_URL_PREFIX ) ;
    public final void rule__URI__UrlPrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4457:1: ( ( RULE_URL_PREFIX ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4458:1: ( RULE_URL_PREFIX )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4458:1: ( RULE_URL_PREFIX )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4459:1: RULE_URL_PREFIX
            {
             before(grammarAccess.getURIAccess().getUrlPrefixURL_PREFIXTerminalRuleCall_0_0()); 
            match(input,RULE_URL_PREFIX,FOLLOW_RULE_URL_PREFIX_in_rule__URI__UrlPrefixAssignment_08928); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4468:1: rule__URI__PathAssignment_1 : ( RULE_URL_PATH ) ;
    public final void rule__URI__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4472:1: ( ( RULE_URL_PATH ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4473:1: ( RULE_URL_PATH )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4473:1: ( RULE_URL_PATH )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4474:1: RULE_URL_PATH
            {
             before(grammarAccess.getURIAccess().getPathURL_PATHTerminalRuleCall_1_0()); 
            match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_rule__URI__PathAssignment_18959); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4483:1: rule__URI__PathParametersAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__URI__PathParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4487:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4488:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4488:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4489:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getPathParametersIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__PathParametersAssignment_2_18990); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4498:1: rule__URI__PathSuffixAssignment_2_3 : ( RULE_URL_PATH ) ;
    public final void rule__URI__PathSuffixAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4502:1: ( ( RULE_URL_PATH ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4503:1: ( RULE_URL_PATH )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4503:1: ( RULE_URL_PATH )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4504:1: RULE_URL_PATH
            {
             before(grammarAccess.getURIAccess().getPathSuffixURL_PATHTerminalRuleCall_2_3_0()); 
            match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_rule__URI__PathSuffixAssignment_2_39021); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4513:1: rule__URI__QueryAssignment_3 : ( RULE_URL_QUERY ) ;
    public final void rule__URI__QueryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4517:1: ( ( RULE_URL_QUERY ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4518:1: ( RULE_URL_QUERY )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4518:1: ( RULE_URL_QUERY )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4519:1: RULE_URL_QUERY
            {
             before(grammarAccess.getURIAccess().getQueryURL_QUERYTerminalRuleCall_3_0()); 
            match(input,RULE_URL_QUERY,FOLLOW_RULE_URL_QUERY_in_rule__URI__QueryAssignment_39052); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4528:1: rule__URI__QueryParametersAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__URI__QueryParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4532:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4533:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4533:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4534:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getQueryParametersIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__QueryParametersAssignment_4_19083); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4543:1: rule__URI__QuerySuffixAssignment_4_3 : ( RULE_URL_QUERY_SUFFIX ) ;
    public final void rule__URI__QuerySuffixAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4547:1: ( ( RULE_URL_QUERY_SUFFIX ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4548:1: ( RULE_URL_QUERY_SUFFIX )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4548:1: ( RULE_URL_QUERY_SUFFIX )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4549:1: RULE_URL_QUERY_SUFFIX
            {
             before(grammarAccess.getURIAccess().getQuerySuffixURL_QUERY_SUFFIXTerminalRuleCall_4_3_0()); 
            match(input,RULE_URL_QUERY_SUFFIX,FOLLOW_RULE_URL_QUERY_SUFFIX_in_rule__URI__QuerySuffixAssignment_4_39114); 
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
    public static final BitSet FOLLOW_rule__Mobgen__Group__0_in_ruleMobgen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0_in_rulePlatform154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenCallDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__0_in_ruleMobgenCallDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeader248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0_in_ruleMobgenHeader274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0_in_ruleMobgenHeaderKeyValuePair334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderParameter368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__0_in_ruleMobgenHeaderParameter394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenJson428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0_in_ruleMobgenJson454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__Alternatives_in_ruleJsonObjectValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0_in_ruleStringList818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeValue__Alternatives_in_ruleJsonCompositeValue975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__Alternatives_in_ruleJsonLiteralValue1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__ResourcesAssignment_1_0_in_rule__Mobgen__Alternatives_11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__CallsAssignment_1_1_in_rule__Mobgen__Alternatives_11064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__ValueAssignment_0_in_rule__JsonObjectValue__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenResourceDefinition__ResourcesAssignment_0_in_rule__MobgenResourceDefinition__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JsonCompositeValue__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonCompositeValue__Alternatives1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonLiteralValue__Alternatives1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__JsonLiteralValue__Alternatives1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__JsonLiteralValue__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__JsonLiteralValue__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__JsonLiteralValue__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__JsonLiteralValue__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__JsonLiteralValue__Alternatives1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__0__Impl_in_rule__Mobgen__Group__01517 = new BitSet(new long[]{0x0006000800000000L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__1_in_rule__Mobgen__Group__01520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__PlatformAssignment_0_in_rule__Mobgen__Group__0__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__1__Impl_in_rule__Mobgen__Group__11577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1606 = new BitSet(new long[]{0x0006000800000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1618 = new BitSet(new long[]{0x0006000800000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01655 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Platform__Group__0__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Platform__Group__1__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21779 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1811 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1823 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Platform__Group__3__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01923 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__11983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Platform__Group_2__1__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MobgenCallDefinition__Group__0__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12170 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22230 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MobgenCallDefinition__Group__2__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32292 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42352 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MobgenCallDefinition__Group__4__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52414 = new BitSet(new long[]{0x0000284000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62474 = new BitSet(new long[]{0x0000284000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72535 = new BitSet(new long[]{0x0000284000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02672 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MobgenCallDefinition__Group_6__0__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12734 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MobgenCallDefinition__Group_6__1__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22796 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MobgenCallDefinition__Group_6__2__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MobgenCallDefinition__Group_6__3__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42920 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__03050 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__03053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03237 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MobgenCallDefinition__Group_7__0__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MobgenCallDefinition__Group_7__1__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03424 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MobgenCallDefinition__Group_8__0__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MobgenCallDefinition__Group_8__1__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__03611 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__03614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__13671 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MobgenHeader__Group__1__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__23733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__23736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenHeader__Group__2__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__33795 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__33798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__43855 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__43858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl3885 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__53916 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__53919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MobgenHeader__Group__5__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__63981 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__63984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MobgenHeader__Group__6__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__74043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MobgenHeader__Group__7__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MobgenHeader__Group_4__0__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04241 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14301 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__0__Impl_in_rule__MobgenHeaderParameter__Group__04426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__1_in_rule__MobgenHeaderParameter__Group__04429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenHeaderParameter__Group__0__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__1__Impl_in_rule__MobgenHeaderParameter__Group__14488 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__2_in_rule__MobgenHeaderParameter__Group__14491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__IdAssignment_1_in_rule__MobgenHeaderParameter__Group__1__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderParameter__Group__2__Impl_in_rule__MobgenHeaderParameter__Group__24548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MobgenHeaderParameter__Group__2__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04613 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14673 = new BitSet(new long[]{0x000000007FC00000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MobgenJson__Group__1__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__24735 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__24738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__34795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MobgenJson__Group__3__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__04864 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__04867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__14924 = new BitSet(new long[]{0x000000007FC00000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__14927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonKeyValuePair__Group__1__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__24986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__05051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__05054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EnumInstance__Group__0__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__15113 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__25173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__25176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EnumInstance__Group__2__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__35235 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__35238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__45295 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__45298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl5325 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__55356 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__55359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumInstance__Group__5__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__65421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EnumInstance__Group__6__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__05494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__05497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumInstance__Group_4__0__Impl5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__15556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__05617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__05620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MapInstance__Group__0__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__15679 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__15682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__25739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__25742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MapInstance__Group__2__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__35801 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__35804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__45861 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__45864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl5891 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__55922 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__55925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MapInstance__Group__5__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__65987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MapInstance__Group__6__Impl6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__06060 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__06063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__16120 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__16123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MapInstance__Group_3__1__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__26182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__06245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__06248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MapInstance__Group_4__0__Impl6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__16307 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__16310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__26367 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__26370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MapInstance__Group_4__2__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__36429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__06494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__06497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__StringList__Group__0__Impl6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__16556 = new BitSet(new long[]{0x0010800000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__16559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__26616 = new BitSet(new long[]{0x0010800000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__26619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl6646 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__36677 = new BitSet(new long[]{0x0010800000000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__36680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StringList__Group__3__Impl6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__46742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StringList__Group__4__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__06811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__06814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StringList__Group_2__0__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__16873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__06934 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__06937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__UrlPrefixAssignment_0_in_rule__URI__Group__0__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__16994 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__16997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathAssignment_1_in_rule__URI__Group__1__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__27054 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_rule__URI__Group__3_in_rule__URI__Group__27057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl7084 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__URI__Group__3__Impl_in_rule__URI__Group__37115 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__URI__Group__4_in_rule__URI__Group__37118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QueryAssignment_3_in_rule__URI__Group__3__Impl7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__4__Impl_in_rule__URI__Group__47175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0_in_rule__URI__Group__4__Impl7202 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__07243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__07246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__URI__Group_2__0__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__17305 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__URI__Group_2__2_in_rule__URI__Group_2__17308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathParametersAssignment_2_1_in_rule__URI__Group_2__1__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__2__Impl_in_rule__URI__Group_2__27365 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__URI__Group_2__3_in_rule__URI__Group_2__27368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__URI__Group_2__2__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__3__Impl_in_rule__URI__Group_2__37427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__PathSuffixAssignment_2_3_in_rule__URI__Group_2__3__Impl7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__0__Impl_in_rule__URI__Group_4__07492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1_in_rule__URI__Group_4__07495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__URI__Group_4__0__Impl7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__1__Impl_in_rule__URI__Group_4__17554 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__URI__Group_4__2_in_rule__URI__Group_4__17557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QueryParametersAssignment_4_1_in_rule__URI__Group_4__1__Impl7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__2__Impl_in_rule__URI__Group_4__27614 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__URI__Group_4__3_in_rule__URI__Group_4__27617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__URI__Group_4__2__Impl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_4__3__Impl_in_rule__URI__Group_4__37676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__QuerySuffixAssignment_4_3_in_rule__URI__Group_4__3__Impl7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__Mobgen__PlatformAssignment_07746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_1_07777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_1_17808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_07839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_27870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_17901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__MobgenCallDefinition__MethodAssignment_37932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_57963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_47994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_28087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_rule__MobgenHeaderKeyValuePair__ParameterAssignment_2_18273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeaderParameter__IdAssignment_18304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_28366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ValueAssignment_08397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_18428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__ResourcesAssignment_08525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_18556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_38587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_18618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_18649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_08680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_28711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_18742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_38773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_18804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_18835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_08866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_18897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PREFIX_in_rule__URI__UrlPrefixAssignment_08928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_rule__URI__PathAssignment_18959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__PathParametersAssignment_2_18990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_rule__URI__PathSuffixAssignment_2_39021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_in_rule__URI__QueryAssignment_39052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__QueryParametersAssignment_4_19083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_SUFFIX_in_rule__URI__QuerySuffixAssignment_4_39114 = new BitSet(new long[]{0x0000000000000002L});

}