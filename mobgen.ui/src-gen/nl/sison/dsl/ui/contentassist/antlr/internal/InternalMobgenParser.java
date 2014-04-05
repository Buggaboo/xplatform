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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_JSON_NUMBER", "RULE_JSON_META_SCALAR_TYPE", "RULE_ANY_OTHER", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_MOBGEN_HEADER_PARAMETER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'platform'", "'{'", "'}'", "'->'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'enum'", "'map'"
    };
    public static final int RULE_ID=12;
    public static final int T__40=40;
    public static final int RULE_JSON_META_SCALAR_TYPE=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_EMPTY_JSON_ARRAY=6;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=7;
    public static final int RULE_EMPTY_JSON_OBJECT=5;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_JSON_NUMBER=9;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MOBGEN_HEADER_PARAMETER=14;
    public static final int RULE_INT=15;
    public static final int RULE_RESTFUL_METHODS=13;
    public static final int RULE_WS=18;

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


    // $ANTLR start "entryRuleURI"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:144:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:145:1: ( ruleURI EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:146:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI241);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI248); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:153:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:157:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:158:1: ( ( rule__URI__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:158:1: ( ( rule__URI__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:159:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:160:1: ( rule__URI__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:160:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI274);
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


    // $ANTLR start "entryRuleMobgenHeader"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:172:1: entryRuleMobgenHeader : ruleMobgenHeader EOF ;
    public final void entryRuleMobgenHeader() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:173:1: ( ruleMobgenHeader EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:174:1: ruleMobgenHeader EOF
            {
             before(grammarAccess.getMobgenHeaderRule()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader301);
            ruleMobgenHeader();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeader308); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:181:1: ruleMobgenHeader : ( ( rule__MobgenHeader__Group__0 ) ) ;
    public final void ruleMobgenHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:185:2: ( ( ( rule__MobgenHeader__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:186:1: ( ( rule__MobgenHeader__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:186:1: ( ( rule__MobgenHeader__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:187:1: ( rule__MobgenHeader__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:188:1: ( rule__MobgenHeader__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:188:2: rule__MobgenHeader__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0_in_ruleMobgenHeader334);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:200:1: entryRuleMobgenHeaderKeyValuePair : ruleMobgenHeaderKeyValuePair EOF ;
    public final void entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:201:1: ( ruleMobgenHeaderKeyValuePair EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:202:1: ruleMobgenHeaderKeyValuePair EOF
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair361);
            ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair368); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:209:1: ruleMobgenHeaderKeyValuePair : ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) ;
    public final void ruleMobgenHeaderKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:213:2: ( ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:214:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:214:1: ( ( rule__MobgenHeaderKeyValuePair__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:215:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:216:1: ( rule__MobgenHeaderKeyValuePair__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:216:2: rule__MobgenHeaderKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0_in_ruleMobgenHeaderKeyValuePair394);
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


    // $ANTLR start "entryRuleJsonCompositeValue"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:284:1: entryRuleJsonCompositeValue : ruleJsonCompositeValue EOF ;
    public final void entryRuleJsonCompositeValue() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:285:1: ( ruleJsonCompositeValue EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:286:1: ruleJsonCompositeValue EOF
            {
             before(grammarAccess.getJsonCompositeValueRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue541);
            ruleJsonCompositeValue();

            state._fsp--;

             after(grammarAccess.getJsonCompositeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeValue548); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:293:1: ruleJsonCompositeValue : ( ( rule__JsonCompositeValue__Alternatives ) ) ;
    public final void ruleJsonCompositeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:297:2: ( ( ( rule__JsonCompositeValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:298:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:298:1: ( ( rule__JsonCompositeValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:299:1: ( rule__JsonCompositeValue__Alternatives )
            {
             before(grammarAccess.getJsonCompositeValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:300:1: ( rule__JsonCompositeValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:300:2: rule__JsonCompositeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonCompositeValue__Alternatives_in_ruleJsonCompositeValue574);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:312:1: entryRuleJsonLiteralValue : ruleJsonLiteralValue EOF ;
    public final void entryRuleJsonLiteralValue() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:313:1: ( ruleJsonLiteralValue EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:314:1: ruleJsonLiteralValue EOF
            {
             before(grammarAccess.getJsonLiteralValueRule()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue601);
            ruleJsonLiteralValue();

            state._fsp--;

             after(grammarAccess.getJsonLiteralValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonLiteralValue608); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:321:1: ruleJsonLiteralValue : ( ( rule__JsonLiteralValue__Alternatives ) ) ;
    public final void ruleJsonLiteralValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:325:2: ( ( ( rule__JsonLiteralValue__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:326:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:326:1: ( ( rule__JsonLiteralValue__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:327:1: ( rule__JsonLiteralValue__Alternatives )
            {
             before(grammarAccess.getJsonLiteralValueAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:328:1: ( rule__JsonLiteralValue__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:328:2: rule__JsonLiteralValue__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonLiteralValue__Alternatives_in_ruleJsonLiteralValue634);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:340:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:341:1: ( ruleJsonObject EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:342:1: ruleJsonObject EOF
            {
             before(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject661);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject668); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:349:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:353:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:354:1: ( ( rule__JsonObject__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:354:1: ( ( rule__JsonObject__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:355:1: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:356:1: ( rule__JsonObject__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:356:2: rule__JsonObject__Group__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject694);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:368:1: entryRuleJsonKeyValuePair : ruleJsonKeyValuePair EOF ;
    public final void entryRuleJsonKeyValuePair() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:369:1: ( ruleJsonKeyValuePair EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:370:1: ruleJsonKeyValuePair EOF
            {
             before(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair721);
            ruleJsonKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair728); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:377:1: ruleJsonKeyValuePair : ( ( rule__JsonKeyValuePair__Group__0 ) ) ;
    public final void ruleJsonKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:381:2: ( ( ( rule__JsonKeyValuePair__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:382:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:382:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:383:1: ( rule__JsonKeyValuePair__Group__0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:384:1: ( rule__JsonKeyValuePair__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:384:2: rule__JsonKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair754);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:396:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:397:1: ( ruleJsonArray EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:398:1: ruleJsonArray EOF
            {
             before(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray781);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray788); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:405:1: ruleJsonArray : ( ( rule__JsonArray__Group__0 ) ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:409:2: ( ( ( rule__JsonArray__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:410:1: ( ( rule__JsonArray__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:410:1: ( ( rule__JsonArray__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:411:1: ( rule__JsonArray__Group__0 )
            {
             before(grammarAccess.getJsonArrayAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:412:1: ( rule__JsonArray__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:412:2: rule__JsonArray__Group__0
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0_in_ruleJsonArray814);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:424:1: entryRuleMobgenResourceDefinition : ruleMobgenResourceDefinition EOF ;
    public final void entryRuleMobgenResourceDefinition() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:425:1: ( ruleMobgenResourceDefinition EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:426:1: ruleMobgenResourceDefinition EOF
            {
             before(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition841);
            ruleMobgenResourceDefinition();

            state._fsp--;

             after(grammarAccess.getMobgenResourceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition848); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:433:1: ruleMobgenResourceDefinition : ( ( rule__MobgenResourceDefinition__Alternatives ) ) ;
    public final void ruleMobgenResourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:437:2: ( ( ( rule__MobgenResourceDefinition__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:438:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:438:1: ( ( rule__MobgenResourceDefinition__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:439:1: ( rule__MobgenResourceDefinition__Alternatives )
            {
             before(grammarAccess.getMobgenResourceDefinitionAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:440:1: ( rule__MobgenResourceDefinition__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:440:2: rule__MobgenResourceDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition874);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:452:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:453:1: ( ruleEnumInstance EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:454:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance901);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance908); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:461:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:465:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:466:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:466:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:467:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:468:1: ( rule__EnumInstance__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:468:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance934);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:480:1: entryRuleMapInstance : ruleMapInstance EOF ;
    public final void entryRuleMapInstance() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:481:1: ( ruleMapInstance EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:482:1: ruleMapInstance EOF
            {
             before(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance961);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMapInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance968); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:489:1: ruleMapInstance : ( ( rule__MapInstance__Group__0 ) ) ;
    public final void ruleMapInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:493:2: ( ( ( rule__MapInstance__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:494:1: ( ( rule__MapInstance__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:494:1: ( ( rule__MapInstance__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:495:1: ( rule__MapInstance__Group__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:496:1: ( rule__MapInstance__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:496:2: rule__MapInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance994);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:508:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:509:1: ( ruleStringList EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:510:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList1021);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList1028); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:517:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:521:2: ( ( ( rule__StringList__Group__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:522:1: ( ( rule__StringList__Group__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:522:1: ( ( rule__StringList__Group__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:523:1: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:524:1: ( rule__StringList__Group__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:524:2: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_rule__StringList__Group__0_in_ruleStringList1054);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:536:1: entryRuleNestedType : ruleNestedType EOF ;
    public final void entryRuleNestedType() throws RecognitionException {
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:537:1: ( ruleNestedType EOF )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:538:1: ruleNestedType EOF
            {
             before(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType1081);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getNestedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType1088); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:545:1: ruleNestedType : ( ( rule__NestedType__Alternatives ) ) ;
    public final void ruleNestedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:549:2: ( ( ( rule__NestedType__Alternatives ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:550:1: ( ( rule__NestedType__Alternatives ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:550:1: ( ( rule__NestedType__Alternatives ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:551:1: ( rule__NestedType__Alternatives )
            {
             before(grammarAccess.getNestedTypeAccess().getAlternatives()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:552:1: ( rule__NestedType__Alternatives )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:552:2: rule__NestedType__Alternatives
            {
            pushFollow(FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1114);
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


    // $ANTLR start "rule__Mobgen__Alternatives_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:564:1: rule__Mobgen__Alternatives_1 : ( ( ( rule__Mobgen__ResourcesAssignment_1_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1_1 ) ) );
    public final void rule__Mobgen__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:568:1: ( ( ( rule__Mobgen__ResourcesAssignment_1_0 ) ) | ( ( rule__Mobgen__CallsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=39 && LA1_0<=40)) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:569:1: ( ( rule__Mobgen__ResourcesAssignment_1_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:569:1: ( ( rule__Mobgen__ResourcesAssignment_1_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:570:1: ( rule__Mobgen__ResourcesAssignment_1_0 )
                    {
                     before(grammarAccess.getMobgenAccess().getResourcesAssignment_1_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:571:1: ( rule__Mobgen__ResourcesAssignment_1_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:571:2: rule__Mobgen__ResourcesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Mobgen__ResourcesAssignment_1_0_in_rule__Mobgen__Alternatives_11150);
                    rule__Mobgen__ResourcesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenAccess().getResourcesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:575:6: ( ( rule__Mobgen__CallsAssignment_1_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:575:6: ( ( rule__Mobgen__CallsAssignment_1_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:576:1: ( rule__Mobgen__CallsAssignment_1_1 )
                    {
                     before(grammarAccess.getMobgenAccess().getCallsAssignment_1_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:577:1: ( rule__Mobgen__CallsAssignment_1_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:577:2: rule__Mobgen__CallsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Mobgen__CallsAssignment_1_1_in_rule__Mobgen__Alternatives_11168);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:586:1: rule__MobgenHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 ) ) );
    public final void rule__MobgenHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:590:1: ( ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_MOBGEN_HEADER_PARAMETER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:591:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:591:1: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:592:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:593:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:593:2: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21201);
                    rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:597:6: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:597:6: ( ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:598:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:599:1: ( rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:599:2: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21219);
                    rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_1()); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:608:1: rule__JsonObjectValue__Alternatives : ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ruleJsonCompositeValue ) );
    public final void rule__JsonObjectValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:612:1: ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ruleJsonCompositeValue ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_JSON_META_SCALAR_TYPE)) ) {
                alt3=1;
            }
            else if ( (LA3_0==20||LA3_0==37) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:613:1: ( ( rule__JsonObjectValue__ValueAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:613:1: ( ( rule__JsonObjectValue__ValueAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:614:1: ( rule__JsonObjectValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getValueAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:615:1: ( rule__JsonObjectValue__ValueAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:615:2: rule__JsonObjectValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__ValueAssignment_0_in_rule__JsonObjectValue__Alternatives1252);
                    rule__JsonObjectValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonObjectValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:619:6: ( ruleJsonCompositeValue )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:619:6: ( ruleJsonCompositeValue )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:620:1: ruleJsonCompositeValue
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getJsonCompositeValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__Alternatives1270);
                    ruleJsonCompositeValue();

                    state._fsp--;

                     after(grammarAccess.getJsonObjectValueAccess().getJsonCompositeValueParserRuleCall_1()); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:630:1: rule__JsonCompositeValue__Alternatives : ( ( ruleJsonObject ) | ( ruleJsonArray ) );
    public final void rule__JsonCompositeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:634:1: ( ( ruleJsonObject ) | ( ruleJsonArray ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:635:1: ( ruleJsonObject )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:635:1: ( ruleJsonObject )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:636:1: ruleJsonObject
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getJsonObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__Alternatives1302);
                    ruleJsonObject();

                    state._fsp--;

                     after(grammarAccess.getJsonCompositeValueAccess().getJsonObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:641:6: ( ruleJsonArray )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:641:6: ( ruleJsonArray )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:642:1: ruleJsonArray
                    {
                     before(grammarAccess.getJsonCompositeValueAccess().getJsonArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__Alternatives1319);
                    ruleJsonArray();

                    state._fsp--;

                     after(grammarAccess.getJsonCompositeValueAccess().getJsonArrayParserRuleCall_1()); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:652:1: rule__JsonLiteralValue__Alternatives : ( ( RULE_STRING ) | ( RULE_EMPTY_JSON_OBJECT ) | ( RULE_EMPTY_JSON_ARRAY ) | ( RULE_JSON_LITERAL_BOOLEAN ) | ( RULE_JSON_LITERAL_NULL ) | ( RULE_JSON_NUMBER ) | ( RULE_JSON_META_SCALAR_TYPE ) );
    public final void rule__JsonLiteralValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:656:1: ( ( RULE_STRING ) | ( RULE_EMPTY_JSON_OBJECT ) | ( RULE_EMPTY_JSON_ARRAY ) | ( RULE_JSON_LITERAL_BOOLEAN ) | ( RULE_JSON_LITERAL_NULL ) | ( RULE_JSON_NUMBER ) | ( RULE_JSON_META_SCALAR_TYPE ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_EMPTY_JSON_OBJECT:
                {
                alt5=2;
                }
                break;
            case RULE_EMPTY_JSON_ARRAY:
                {
                alt5=3;
                }
                break;
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt5=4;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt5=5;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt5=6;
                }
                break;
            case RULE_JSON_META_SCALAR_TYPE:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:657:1: ( RULE_STRING )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:657:1: ( RULE_STRING )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:658:1: RULE_STRING
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__Alternatives1351); 
                     after(grammarAccess.getJsonLiteralValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:663:6: ( RULE_EMPTY_JSON_OBJECT )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:663:6: ( RULE_EMPTY_JSON_OBJECT )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:664:1: RULE_EMPTY_JSON_OBJECT
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_1()); 
                    match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__Alternatives1368); 
                     after(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:669:6: ( RULE_EMPTY_JSON_ARRAY )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:669:6: ( RULE_EMPTY_JSON_ARRAY )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:670:1: RULE_EMPTY_JSON_ARRAY
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_2()); 
                    match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__Alternatives1385); 
                     after(grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:675:6: ( RULE_JSON_LITERAL_BOOLEAN )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:675:6: ( RULE_JSON_LITERAL_BOOLEAN )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:676:1: RULE_JSON_LITERAL_BOOLEAN
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_3()); 
                    match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonLiteralValue__Alternatives1402); 
                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:681:6: ( RULE_JSON_LITERAL_NULL )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:681:6: ( RULE_JSON_LITERAL_NULL )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:682:1: RULE_JSON_LITERAL_NULL
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_4()); 
                    match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__Alternatives1419); 
                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:687:6: ( RULE_JSON_NUMBER )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:687:6: ( RULE_JSON_NUMBER )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:688:1: RULE_JSON_NUMBER
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBERTerminalRuleCall_5()); 
                    match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_rule__JsonLiteralValue__Alternatives1436); 
                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBERTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:693:6: ( RULE_JSON_META_SCALAR_TYPE )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:693:6: ( RULE_JSON_META_SCALAR_TYPE )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:694:1: RULE_JSON_META_SCALAR_TYPE
                    {
                     before(grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_6()); 
                    match(input,RULE_JSON_META_SCALAR_TYPE,FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_rule__JsonLiteralValue__Alternatives1453); 
                     after(grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_6()); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:704:1: rule__MobgenResourceDefinition__Alternatives : ( ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) ) | ( ruleEnumInstance ) );
    public final void rule__MobgenResourceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:708:1: ( ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) ) | ( ruleEnumInstance ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
                alt6=1;
            }
            else if ( (LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:709:1: ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:709:1: ( ( rule__MobgenResourceDefinition__ResourcesAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:710:1: ( rule__MobgenResourceDefinition__ResourcesAssignment_0 )
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:711:1: ( rule__MobgenResourceDefinition__ResourcesAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:711:2: rule__MobgenResourceDefinition__ResourcesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MobgenResourceDefinition__ResourcesAssignment_0_in_rule__MobgenResourceDefinition__Alternatives1485);
                    rule__MobgenResourceDefinition__ResourcesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:715:6: ( ruleEnumInstance )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:715:6: ( ruleEnumInstance )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:716:1: ruleEnumInstance
                    {
                     before(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1503);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:726:1: rule__NestedType__Alternatives : ( ( RULE_STRING ) | ( ruleStringList ) );
    public final void rule__NestedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:730:1: ( ( RULE_STRING ) | ( ruleStringList ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:731:1: ( RULE_STRING )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:731:1: ( RULE_STRING )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:732:1: RULE_STRING
                    {
                     before(grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NestedType__Alternatives1535); 
                     after(grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:737:6: ( ruleStringList )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:737:6: ( ruleStringList )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:738:1: ruleStringList
                    {
                     before(grammarAccess.getNestedTypeAccess().getStringListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringList_in_rule__NestedType__Alternatives1552);
                    ruleStringList();

                    state._fsp--;

                     after(grammarAccess.getNestedTypeAccess().getStringListParserRuleCall_1()); 

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


    // $ANTLR start "rule__Mobgen__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:750:1: rule__Mobgen__Group__0 : rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1 ;
    public final void rule__Mobgen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:754:1: ( rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:755:2: rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1
            {
            pushFollow(FOLLOW_rule__Mobgen__Group__0__Impl_in_rule__Mobgen__Group__01582);
            rule__Mobgen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mobgen__Group__1_in_rule__Mobgen__Group__01585);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:762:1: rule__Mobgen__Group__0__Impl : ( ( rule__Mobgen__PlatformAssignment_0 ) ) ;
    public final void rule__Mobgen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:766:1: ( ( ( rule__Mobgen__PlatformAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:767:1: ( ( rule__Mobgen__PlatformAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:767:1: ( ( rule__Mobgen__PlatformAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:768:1: ( rule__Mobgen__PlatformAssignment_0 )
            {
             before(grammarAccess.getMobgenAccess().getPlatformAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:769:1: ( rule__Mobgen__PlatformAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:769:2: rule__Mobgen__PlatformAssignment_0
            {
            pushFollow(FOLLOW_rule__Mobgen__PlatformAssignment_0_in_rule__Mobgen__Group__0__Impl1612);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:779:1: rule__Mobgen__Group__1 : rule__Mobgen__Group__1__Impl ;
    public final void rule__Mobgen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:783:1: ( rule__Mobgen__Group__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:784:2: rule__Mobgen__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mobgen__Group__1__Impl_in_rule__Mobgen__Group__11642);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:790:1: rule__Mobgen__Group__1__Impl : ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) ) ;
    public final void rule__Mobgen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:794:1: ( ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:795:1: ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:795:1: ( ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:796:1: ( ( rule__Mobgen__Alternatives_1 ) ) ( ( rule__Mobgen__Alternatives_1 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:796:1: ( ( rule__Mobgen__Alternatives_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:797:1: ( rule__Mobgen__Alternatives_1 )
            {
             before(grammarAccess.getMobgenAccess().getAlternatives_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:798:1: ( rule__Mobgen__Alternatives_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:798:2: rule__Mobgen__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1671);
            rule__Mobgen__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMobgenAccess().getAlternatives_1()); 

            }

            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:801:1: ( ( rule__Mobgen__Alternatives_1 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:802:1: ( rule__Mobgen__Alternatives_1 )*
            {
             before(grammarAccess.getMobgenAccess().getAlternatives_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:803:1: ( rule__Mobgen__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||(LA8_0>=39 && LA8_0<=40)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:803:2: rule__Mobgen__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1683);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:818:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:822:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:823:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01720);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01723);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:830:1: rule__Platform__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:834:1: ( ( 'platform' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:835:1: ( 'platform' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:835:1: ( 'platform' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:836:1: 'platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Platform__Group__0__Impl1751); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:849:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:853:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:854:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11782);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11785);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:861:1: rule__Platform__Group__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:865:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:866:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:866:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:867:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Platform__Group__1__Impl1813); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:880:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:884:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:885:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21844);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21847);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:892:1: rule__Platform__Group__2__Impl : ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:896:1: ( ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:897:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:897:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:898:1: ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:898:1: ( ( rule__Platform__Group_2__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:899:1: ( rule__Platform__Group_2__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:900:1: ( rule__Platform__Group_2__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:900:2: rule__Platform__Group_2__0
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1876);
            rule__Platform__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup_2()); 

            }

            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:903:1: ( ( rule__Platform__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:904:1: ( rule__Platform__Group_2__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:905:1: ( rule__Platform__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:905:2: rule__Platform__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1888);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:916:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:920:1: ( rule__Platform__Group__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:921:2: rule__Platform__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31921);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:927:1: rule__Platform__Group__3__Impl : ( '}' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:931:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:932:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:932:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:933:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Platform__Group__3__Impl1949); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:954:1: rule__Platform__Group_2__0 : rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 ;
    public final void rule__Platform__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:958:1: ( rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:959:2: rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01988);
            rule__Platform__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01991);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:966:1: rule__Platform__Group_2__0__Impl : ( ( rule__Platform__PlatformsAssignment_2_0 ) ) ;
    public final void rule__Platform__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:970:1: ( ( ( rule__Platform__PlatformsAssignment_2_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:971:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:971:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:972:1: ( rule__Platform__PlatformsAssignment_2_0 )
            {
             before(grammarAccess.getPlatformAccess().getPlatformsAssignment_2_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:973:1: ( rule__Platform__PlatformsAssignment_2_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:973:2: rule__Platform__PlatformsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl2018);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:983:1: rule__Platform__Group_2__1 : rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 ;
    public final void rule__Platform__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:987:1: ( rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:988:2: rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__12048);
            rule__Platform__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__12051);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:995:1: rule__Platform__Group_2__1__Impl : ( '->' ) ;
    public final void rule__Platform__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:999:1: ( ( '->' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1000:1: ( '->' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1000:1: ( '->' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1001:1: '->'
            {
             before(grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__Platform__Group_2__1__Impl2079); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1014:1: rule__Platform__Group_2__2 : rule__Platform__Group_2__2__Impl ;
    public final void rule__Platform__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1018:1: ( rule__Platform__Group_2__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1019:2: rule__Platform__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22110);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1025:1: rule__Platform__Group_2__2__Impl : ( ( rule__Platform__GenerateWhereAssignment_2_2 ) ) ;
    public final void rule__Platform__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1029:1: ( ( ( rule__Platform__GenerateWhereAssignment_2_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1030:1: ( ( rule__Platform__GenerateWhereAssignment_2_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1030:1: ( ( rule__Platform__GenerateWhereAssignment_2_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1031:1: ( rule__Platform__GenerateWhereAssignment_2_2 )
            {
             before(grammarAccess.getPlatformAccess().getGenerateWhereAssignment_2_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1032:1: ( rule__Platform__GenerateWhereAssignment_2_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1032:2: rule__Platform__GenerateWhereAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl2137);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1048:1: rule__MobgenCallDefinition__Group__0 : rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 ;
    public final void rule__MobgenCallDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1052:1: ( rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1053:2: rule__MobgenCallDefinition__Group__0__Impl rule__MobgenCallDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02173);
            rule__MobgenCallDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02176);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1060:1: rule__MobgenCallDefinition__Group__0__Impl : ( 'call' ) ;
    public final void rule__MobgenCallDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1064:1: ( ( 'call' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1065:1: ( 'call' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1065:1: ( 'call' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1066:1: 'call'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__MobgenCallDefinition__Group__0__Impl2204); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1079:1: rule__MobgenCallDefinition__Group__1 : rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 ;
    public final void rule__MobgenCallDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1083:1: ( rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1084:2: rule__MobgenCallDefinition__Group__1__Impl rule__MobgenCallDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12235);
            rule__MobgenCallDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12238);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1091:1: rule__MobgenCallDefinition__Group__1__Impl : ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) ;
    public final void rule__MobgenCallDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1095:1: ( ( ( rule__MobgenCallDefinition__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1096:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1096:1: ( ( rule__MobgenCallDefinition__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1097:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1098:1: ( rule__MobgenCallDefinition__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1098:2: rule__MobgenCallDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2265);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1108:1: rule__MobgenCallDefinition__Group__2 : rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 ;
    public final void rule__MobgenCallDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1112:1: ( rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1113:2: rule__MobgenCallDefinition__Group__2__Impl rule__MobgenCallDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22295);
            rule__MobgenCallDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22298);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1120:1: rule__MobgenCallDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__MobgenCallDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1124:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1125:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1125:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1126:1: ':'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__MobgenCallDefinition__Group__2__Impl2326); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1139:1: rule__MobgenCallDefinition__Group__3 : rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 ;
    public final void rule__MobgenCallDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1143:1: ( rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1144:2: rule__MobgenCallDefinition__Group__3__Impl rule__MobgenCallDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32357);
            rule__MobgenCallDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32360);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1151:1: rule__MobgenCallDefinition__Group__3__Impl : ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) ;
    public final void rule__MobgenCallDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1155:1: ( ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1156:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1156:1: ( ( rule__MobgenCallDefinition__MethodAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1157:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1158:1: ( rule__MobgenCallDefinition__MethodAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1158:2: rule__MobgenCallDefinition__MethodAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2387);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1168:1: rule__MobgenCallDefinition__Group__4 : rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 ;
    public final void rule__MobgenCallDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1172:1: ( rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1173:2: rule__MobgenCallDefinition__Group__4__Impl rule__MobgenCallDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42417);
            rule__MobgenCallDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42420);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1180:1: rule__MobgenCallDefinition__Group__4__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1184:1: ( ( 'from' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1185:1: ( 'from' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1185:1: ( 'from' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1186:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MobgenCallDefinition__Group__4__Impl2448); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1199:1: rule__MobgenCallDefinition__Group__5 : rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 ;
    public final void rule__MobgenCallDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1203:1: ( rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1204:2: rule__MobgenCallDefinition__Group__5__Impl rule__MobgenCallDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52479);
            rule__MobgenCallDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52482);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1211:1: rule__MobgenCallDefinition__Group__5__Impl : ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) ;
    public final void rule__MobgenCallDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1215:1: ( ( ( rule__MobgenCallDefinition__UriAssignment_5 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1216:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1216:1: ( ( rule__MobgenCallDefinition__UriAssignment_5 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1217:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriAssignment_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1218:1: ( rule__MobgenCallDefinition__UriAssignment_5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1218:2: rule__MobgenCallDefinition__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2509);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1228:1: rule__MobgenCallDefinition__Group__6 : rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 ;
    public final void rule__MobgenCallDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1232:1: ( rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1233:2: rule__MobgenCallDefinition__Group__6__Impl rule__MobgenCallDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62539);
            rule__MobgenCallDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62542);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1240:1: rule__MobgenCallDefinition__Group__6__Impl : ( ( rule__MobgenCallDefinition__Group_6__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1244:1: ( ( ( rule__MobgenCallDefinition__Group_6__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1245:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1245:1: ( ( rule__MobgenCallDefinition__Group_6__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1246:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1247:1: ( rule__MobgenCallDefinition__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1247:2: rule__MobgenCallDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2569);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1257:1: rule__MobgenCallDefinition__Group__7 : rule__MobgenCallDefinition__Group__7__Impl ;
    public final void rule__MobgenCallDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1261:1: ( rule__MobgenCallDefinition__Group__7__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1262:2: rule__MobgenCallDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72600);
            rule__MobgenCallDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1268:1: rule__MobgenCallDefinition__Group__7__Impl : ( ( rule__MobgenCallDefinition__Group_7__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1272:1: ( ( ( rule__MobgenCallDefinition__Group_7__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1273:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1273:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1274:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1275:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1275:2: rule__MobgenCallDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2627);
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


    // $ANTLR start "rule__MobgenCallDefinition__Group_6__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1301:1: rule__MobgenCallDefinition__Group_6__0 : rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 ;
    public final void rule__MobgenCallDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1305:1: ( rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1306:2: rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02674);
            rule__MobgenCallDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02677);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1313:1: rule__MobgenCallDefinition__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__MobgenCallDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1317:1: ( ( 'with' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1318:1: ( 'with' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1318:1: ( 'with' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1319:1: 'with'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__MobgenCallDefinition__Group_6__0__Impl2705); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1332:1: rule__MobgenCallDefinition__Group_6__1 : rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 ;
    public final void rule__MobgenCallDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1336:1: ( rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1337:2: rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12736);
            rule__MobgenCallDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12739);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1344:1: rule__MobgenCallDefinition__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__MobgenCallDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1348:1: ( ( 'headers' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1349:1: ( 'headers' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1349:1: ( 'headers' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1350:1: 'headers'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1()); 
            match(input,27,FOLLOW_27_in_rule__MobgenCallDefinition__Group_6__1__Impl2767); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1363:1: rule__MobgenCallDefinition__Group_6__2 : rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 ;
    public final void rule__MobgenCallDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1367:1: ( rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1368:2: rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22798);
            rule__MobgenCallDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22801);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1375:1: rule__MobgenCallDefinition__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1379:1: ( ( 'from' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1380:1: ( 'from' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1380:1: ( 'from' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1381:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2()); 
            match(input,25,FOLLOW_25_in_rule__MobgenCallDefinition__Group_6__2__Impl2829); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1394:1: rule__MobgenCallDefinition__Group_6__3 : rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 ;
    public final void rule__MobgenCallDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1398:1: ( rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1399:2: rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32860);
            rule__MobgenCallDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32863);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1406:1: rule__MobgenCallDefinition__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__MobgenCallDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1410:1: ( ( 'request' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1411:1: ( 'request' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1411:1: ( 'request' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1412:1: 'request'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3()); 
            match(input,28,FOLLOW_28_in_rule__MobgenCallDefinition__Group_6__3__Impl2891); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1425:1: rule__MobgenCallDefinition__Group_6__4 : rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 ;
    public final void rule__MobgenCallDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1429:1: ( rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1430:2: rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42922);
            rule__MobgenCallDefinition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42925);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1437:1: rule__MobgenCallDefinition__Group_6__4__Impl : ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1441:1: ( ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1442:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1442:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1443:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1444:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1444:2: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2952);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1454:1: rule__MobgenCallDefinition__Group_6__5 : rule__MobgenCallDefinition__Group_6__5__Impl ;
    public final void rule__MobgenCallDefinition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1458:1: ( rule__MobgenCallDefinition__Group_6__5__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1459:2: rule__MobgenCallDefinition__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52982);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1465:1: rule__MobgenCallDefinition__Group_6__5__Impl : ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1469:1: ( ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1470:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1470:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1471:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1472:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1472:2: rule__MobgenCallDefinition__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl3009);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1494:1: rule__MobgenCallDefinition__Group_6_5__0 : rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 ;
    public final void rule__MobgenCallDefinition__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1498:1: ( rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1499:2: rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__03052);
            rule__MobgenCallDefinition__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__03055);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1506:1: rule__MobgenCallDefinition__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1510:1: ( ( 'and' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1511:1: ( 'and' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1511:1: ( 'and' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1512:1: 'and'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0()); 
            match(input,29,FOLLOW_29_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3083); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1525:1: rule__MobgenCallDefinition__Group_6_5__1 : rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 ;
    public final void rule__MobgenCallDefinition__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1529:1: ( rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1530:2: rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13114);
            rule__MobgenCallDefinition__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13117);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1537:1: rule__MobgenCallDefinition__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1541:1: ( ( 'response' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1542:1: ( 'response' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1542:1: ( 'response' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1543:1: 'response'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1()); 
            match(input,30,FOLLOW_30_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3145); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1556:1: rule__MobgenCallDefinition__Group_6_5__2 : rule__MobgenCallDefinition__Group_6_5__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1560:1: ( rule__MobgenCallDefinition__Group_6_5__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1561:2: rule__MobgenCallDefinition__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23176);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1567:1: rule__MobgenCallDefinition__Group_6_5__2__Impl : ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1571:1: ( ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1572:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1572:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1573:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1574:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1574:2: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3203);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1590:1: rule__MobgenCallDefinition__Group_7__0 : rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 ;
    public final void rule__MobgenCallDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1594:1: ( rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1595:2: rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03239);
            rule__MobgenCallDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03242);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1602:1: rule__MobgenCallDefinition__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__MobgenCallDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1606:1: ( ( 'client' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1607:1: ( 'client' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1607:1: ( 'client' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1608:1: 'client'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__MobgenCallDefinition__Group_7__0__Impl3270); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1621:1: rule__MobgenCallDefinition__Group_7__1 : rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 ;
    public final void rule__MobgenCallDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1625:1: ( rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1626:2: rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13301);
            rule__MobgenCallDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13304);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1633:1: rule__MobgenCallDefinition__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1637:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1638:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1638:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1639:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1()); 
            match(input,32,FOLLOW_32_in_rule__MobgenCallDefinition__Group_7__1__Impl3332); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1652:1: rule__MobgenCallDefinition__Group_7__2 : rule__MobgenCallDefinition__Group_7__2__Impl rule__MobgenCallDefinition__Group_7__3 ;
    public final void rule__MobgenCallDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1656:1: ( rule__MobgenCallDefinition__Group_7__2__Impl rule__MobgenCallDefinition__Group_7__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1657:2: rule__MobgenCallDefinition__Group_7__2__Impl rule__MobgenCallDefinition__Group_7__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23363);
            rule__MobgenCallDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__3_in_rule__MobgenCallDefinition__Group_7__23366);
            rule__MobgenCallDefinition__Group_7__3();

            state._fsp--;


            }

        }
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1664:1: rule__MobgenCallDefinition__Group_7__2__Impl : ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1668:1: ( ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1669:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1669:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1670:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientAssignment_7_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1671:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1671:2: rule__MobgenCallDefinition__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3393);
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


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__3"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1681:1: rule__MobgenCallDefinition__Group_7__3 : rule__MobgenCallDefinition__Group_7__3__Impl ;
    public final void rule__MobgenCallDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1685:1: ( rule__MobgenCallDefinition__Group_7__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1686:2: rule__MobgenCallDefinition__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__3__Impl_in_rule__MobgenCallDefinition__Group_7__33423);
            rule__MobgenCallDefinition__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__3"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7__3__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1692:1: rule__MobgenCallDefinition__Group_7__3__Impl : ( ( rule__MobgenCallDefinition__Group_7_3__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1696:1: ( ( ( rule__MobgenCallDefinition__Group_7_3__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1697:1: ( ( rule__MobgenCallDefinition__Group_7_3__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1697:1: ( ( rule__MobgenCallDefinition__Group_7_3__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1698:1: ( rule__MobgenCallDefinition__Group_7_3__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1699:1: ( rule__MobgenCallDefinition__Group_7_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1699:2: rule__MobgenCallDefinition__Group_7_3__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7_3__0_in_rule__MobgenCallDefinition__Group_7__3__Impl3450);
                    rule__MobgenCallDefinition__Group_7_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7_3__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1717:1: rule__MobgenCallDefinition__Group_7_3__0 : rule__MobgenCallDefinition__Group_7_3__0__Impl rule__MobgenCallDefinition__Group_7_3__1 ;
    public final void rule__MobgenCallDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1721:1: ( rule__MobgenCallDefinition__Group_7_3__0__Impl rule__MobgenCallDefinition__Group_7_3__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1722:2: rule__MobgenCallDefinition__Group_7_3__0__Impl rule__MobgenCallDefinition__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7_3__0__Impl_in_rule__MobgenCallDefinition__Group_7_3__03489);
            rule__MobgenCallDefinition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7_3__1_in_rule__MobgenCallDefinition__Group_7_3__03492);
            rule__MobgenCallDefinition__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7_3__0"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7_3__0__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1729:1: rule__MobgenCallDefinition__Group_7_3__0__Impl : ( 'server' ) ;
    public final void rule__MobgenCallDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1733:1: ( ( 'server' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1734:1: ( 'server' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1734:1: ( 'server' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1735:1: 'server'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_7_3_0()); 
            match(input,33,FOLLOW_33_in_rule__MobgenCallDefinition__Group_7_3__0__Impl3520); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7_3__0__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7_3__1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1748:1: rule__MobgenCallDefinition__Group_7_3__1 : rule__MobgenCallDefinition__Group_7_3__1__Impl rule__MobgenCallDefinition__Group_7_3__2 ;
    public final void rule__MobgenCallDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1752:1: ( rule__MobgenCallDefinition__Group_7_3__1__Impl rule__MobgenCallDefinition__Group_7_3__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1753:2: rule__MobgenCallDefinition__Group_7_3__1__Impl rule__MobgenCallDefinition__Group_7_3__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7_3__1__Impl_in_rule__MobgenCallDefinition__Group_7_3__13551);
            rule__MobgenCallDefinition__Group_7_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7_3__2_in_rule__MobgenCallDefinition__Group_7_3__13554);
            rule__MobgenCallDefinition__Group_7_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7_3__1"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7_3__1__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1760:1: rule__MobgenCallDefinition__Group_7_3__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1764:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1765:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1765:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1766:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_3_1()); 
            match(input,32,FOLLOW_32_in_rule__MobgenCallDefinition__Group_7_3__1__Impl3582); 
             after(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7_3__1__Impl"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7_3__2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1779:1: rule__MobgenCallDefinition__Group_7_3__2 : rule__MobgenCallDefinition__Group_7_3__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_7_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1783:1: ( rule__MobgenCallDefinition__Group_7_3__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1784:2: rule__MobgenCallDefinition__Group_7_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7_3__2__Impl_in_rule__MobgenCallDefinition__Group_7_3__23613);
            rule__MobgenCallDefinition__Group_7_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7_3__2"


    // $ANTLR start "rule__MobgenCallDefinition__Group_7_3__2__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1790:1: rule__MobgenCallDefinition__Group_7_3__2__Impl : ( ( rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_7_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1794:1: ( ( ( rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1795:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1795:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1796:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_7_3_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1797:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1797:2: rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2_in_rule__MobgenCallDefinition__Group_7_3__2__Impl3640);
            rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_7_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__Group_7_3__2__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1813:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1817:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1818:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03676);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03679);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1825:1: rule__URI__Group__0__Impl : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1829:1: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1830:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1830:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1831:1: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1831:1: ( ( RULE_ANY_OTHER ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1832:1: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1833:1: ( RULE_ANY_OTHER )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1833:3: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3709); 

            }

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 

            }

            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1836:1: ( ( RULE_ANY_OTHER )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1837:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1838:1: ( RULE_ANY_OTHER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANY_OTHER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1838:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3722); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__URI__Group__0__Impl"


    // $ANTLR start "rule__URI__Group__1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1849:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1853:1: ( rule__URI__Group__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1854:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13755);
            rule__URI__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1860:1: rule__URI__Group__1__Impl : ( ( rule__URI__Group_1__0 )* ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1864:1: ( ( ( rule__URI__Group_1__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1865:1: ( ( rule__URI__Group_1__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1865:1: ( ( rule__URI__Group_1__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1866:1: ( rule__URI__Group_1__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1867:1: ( rule__URI__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1867:2: rule__URI__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3782);
            	    rule__URI__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__URI__Group_1__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1881:1: rule__URI__Group_1__0 : rule__URI__Group_1__0__Impl rule__URI__Group_1__1 ;
    public final void rule__URI__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1885:1: ( rule__URI__Group_1__0__Impl rule__URI__Group_1__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1886:2: rule__URI__Group_1__0__Impl rule__URI__Group_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03817);
            rule__URI__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03820);
            rule__URI__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__0"


    // $ANTLR start "rule__URI__Group_1__0__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1893:1: rule__URI__Group_1__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1897:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1898:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1898:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1899:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__URI__Group_1__0__Impl3848); 
             after(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__0__Impl"


    // $ANTLR start "rule__URI__Group_1__1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1912:1: rule__URI__Group_1__1 : rule__URI__Group_1__1__Impl rule__URI__Group_1__2 ;
    public final void rule__URI__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1916:1: ( rule__URI__Group_1__1__Impl rule__URI__Group_1__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1917:2: rule__URI__Group_1__1__Impl rule__URI__Group_1__2
            {
            pushFollow(FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13879);
            rule__URI__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13882);
            rule__URI__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__1"


    // $ANTLR start "rule__URI__Group_1__1__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1924:1: rule__URI__Group_1__1__Impl : ( ( rule__URI__ParametersAssignment_1_1 ) ) ;
    public final void rule__URI__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1928:1: ( ( ( rule__URI__ParametersAssignment_1_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1929:1: ( ( rule__URI__ParametersAssignment_1_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1929:1: ( ( rule__URI__ParametersAssignment_1_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1930:1: ( rule__URI__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getURIAccess().getParametersAssignment_1_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1931:1: ( rule__URI__ParametersAssignment_1_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1931:2: rule__URI__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__URI__ParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl3909);
            rule__URI__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__1__Impl"


    // $ANTLR start "rule__URI__Group_1__2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1941:1: rule__URI__Group_1__2 : rule__URI__Group_1__2__Impl rule__URI__Group_1__3 ;
    public final void rule__URI__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1945:1: ( rule__URI__Group_1__2__Impl rule__URI__Group_1__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1946:2: rule__URI__Group_1__2__Impl rule__URI__Group_1__3
            {
            pushFollow(FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23939);
            rule__URI__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23942);
            rule__URI__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__2"


    // $ANTLR start "rule__URI__Group_1__2__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1953:1: rule__URI__Group_1__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1957:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1958:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1958:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1959:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__URI__Group_1__2__Impl3970); 
             after(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__2__Impl"


    // $ANTLR start "rule__URI__Group_1__3"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1972:1: rule__URI__Group_1__3 : rule__URI__Group_1__3__Impl ;
    public final void rule__URI__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1976:1: ( rule__URI__Group_1__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1977:2: rule__URI__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__34001);
            rule__URI__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__3"


    // $ANTLR start "rule__URI__Group_1__3__Impl"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1983:1: rule__URI__Group_1__3__Impl : ( ( RULE_ANY_OTHER )* ) ;
    public final void rule__URI__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1987:1: ( ( ( RULE_ANY_OTHER )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1988:1: ( ( RULE_ANY_OTHER )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1988:1: ( ( RULE_ANY_OTHER )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1989:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1990:1: ( RULE_ANY_OTHER )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANY_OTHER) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1990:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl4029); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_1__3__Impl"


    // $ANTLR start "rule__MobgenHeader__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2008:1: rule__MobgenHeader__Group__0 : rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 ;
    public final void rule__MobgenHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2012:1: ( rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2013:2: rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__04068);
            rule__MobgenHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__04071);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2020:1: rule__MobgenHeader__Group__0__Impl : ( ( rule__MobgenHeader__NameAssignment_0 )? ) ;
    public final void rule__MobgenHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2024:1: ( ( ( rule__MobgenHeader__NameAssignment_0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2025:1: ( ( rule__MobgenHeader__NameAssignment_0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2025:1: ( ( rule__MobgenHeader__NameAssignment_0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2026:1: ( rule__MobgenHeader__NameAssignment_0 )?
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2027:1: ( rule__MobgenHeader__NameAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2027:2: rule__MobgenHeader__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl4098);
                    rule__MobgenHeader__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2037:1: rule__MobgenHeader__Group__1 : rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 ;
    public final void rule__MobgenHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2041:1: ( rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2042:2: rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__14129);
            rule__MobgenHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__14132);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2049:1: rule__MobgenHeader__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2053:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2054:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2054:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2055:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__MobgenHeader__Group__1__Impl4160); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2068:1: rule__MobgenHeader__Group__2 : rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 ;
    public final void rule__MobgenHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2072:1: ( rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2073:2: rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__24191);
            rule__MobgenHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__24194);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2080:1: rule__MobgenHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__MobgenHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2084:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2085:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2085:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2086:1: '{'
            {
             before(grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MobgenHeader__Group__2__Impl4222); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2099:1: rule__MobgenHeader__Group__3 : rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 ;
    public final void rule__MobgenHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2103:1: ( rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2104:2: rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__34253);
            rule__MobgenHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__34256);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2111:1: rule__MobgenHeader__Group__3__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) ;
    public final void rule__MobgenHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2115:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2116:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2116:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2117:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2118:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2118:2: rule__MobgenHeader__HeaderKeyValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl4283);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2128:1: rule__MobgenHeader__Group__4 : rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 ;
    public final void rule__MobgenHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2132:1: ( rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2133:2: rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__44313);
            rule__MobgenHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__44316);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2140:1: rule__MobgenHeader__Group__4__Impl : ( ( rule__MobgenHeader__Group_4__0 )* ) ;
    public final void rule__MobgenHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2144:1: ( ( ( rule__MobgenHeader__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2145:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2145:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2146:1: ( rule__MobgenHeader__Group_4__0 )*
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2147:1: ( rule__MobgenHeader__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_STRING) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2147:2: rule__MobgenHeader__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl4343);
            	    rule__MobgenHeader__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2157:1: rule__MobgenHeader__Group__5 : rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 ;
    public final void rule__MobgenHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2161:1: ( rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2162:2: rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__54374);
            rule__MobgenHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__54377);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2169:1: rule__MobgenHeader__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MobgenHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2173:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2174:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2174:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2175:1: ( ',' )?
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2176:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2177:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__MobgenHeader__Group__5__Impl4406); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2188:1: rule__MobgenHeader__Group__6 : rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 ;
    public final void rule__MobgenHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2192:1: ( rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2193:2: rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__64439);
            rule__MobgenHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__64442);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2200:1: rule__MobgenHeader__Group__6__Impl : ( '}' ) ;
    public final void rule__MobgenHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2204:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2205:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2205:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2206:1: '}'
            {
             before(grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__MobgenHeader__Group__6__Impl4470); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2219:1: rule__MobgenHeader__Group__7 : rule__MobgenHeader__Group__7__Impl ;
    public final void rule__MobgenHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2223:1: ( rule__MobgenHeader__Group__7__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2224:2: rule__MobgenHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__74501);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2230:1: rule__MobgenHeader__Group__7__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2234:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2235:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2235:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2236:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__MobgenHeader__Group__7__Impl4529); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2265:1: rule__MobgenHeader__Group_4__0 : rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 ;
    public final void rule__MobgenHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2269:1: ( rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2270:2: rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04576);
            rule__MobgenHeader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04579);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2277:1: rule__MobgenHeader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MobgenHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2281:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2282:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2282:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2283:1: ','
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__MobgenHeader__Group_4__0__Impl4607); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2296:1: rule__MobgenHeader__Group_4__1 : rule__MobgenHeader__Group_4__1__Impl ;
    public final void rule__MobgenHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2300:1: ( rule__MobgenHeader__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2301:2: rule__MobgenHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14638);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2307:1: rule__MobgenHeader__Group_4__1__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) ;
    public final void rule__MobgenHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2311:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2312:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2312:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2313:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2314:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2314:2: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4665);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2328:1: rule__MobgenHeaderKeyValuePair__Group__0 : rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2332:1: ( rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2333:2: rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04699);
            rule__MobgenHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04702);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2340:1: rule__MobgenHeaderKeyValuePair__Group__0__Impl : ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2344:1: ( ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2345:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2345:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2346:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2347:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2347:2: rule__MobgenHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4729);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2357:1: rule__MobgenHeaderKeyValuePair__Group__1 : rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2361:1: ( rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2362:2: rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14759);
            rule__MobgenHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14762);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2369:1: rule__MobgenHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2373:1: ( ( '=' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2374:1: ( '=' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2374:1: ( '=' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2375:1: '='
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4790); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2388:1: rule__MobgenHeaderKeyValuePair__Group__2 : rule__MobgenHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2392:1: ( rule__MobgenHeaderKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2393:2: rule__MobgenHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24821);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2399:1: rule__MobgenHeaderKeyValuePair__Group__2__Impl : ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2403:1: ( ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2404:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2404:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2405:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2406:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2406:2: rule__MobgenHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4848);
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


    // $ANTLR start "rule__MobgenJson__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2422:1: rule__MobgenJson__Group__0 : rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 ;
    public final void rule__MobgenJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2426:1: ( rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2427:2: rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04884);
            rule__MobgenJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04887);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2434:1: rule__MobgenJson__Group__0__Impl : ( ( rule__MobgenJson__NameAssignment_0 ) ) ;
    public final void rule__MobgenJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2438:1: ( ( ( rule__MobgenJson__NameAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2439:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2439:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2440:1: ( rule__MobgenJson__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2441:1: ( rule__MobgenJson__NameAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2441:2: rule__MobgenJson__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4914);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2451:1: rule__MobgenJson__Group__1 : rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 ;
    public final void rule__MobgenJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2455:1: ( rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2456:2: rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14944);
            rule__MobgenJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14947);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2463:1: rule__MobgenJson__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2467:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2468:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2468:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2469:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__MobgenJson__Group__1__Impl4975); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2482:1: rule__MobgenJson__Group__2 : rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 ;
    public final void rule__MobgenJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2486:1: ( rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2487:2: rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__25006);
            rule__MobgenJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__25009);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2494:1: rule__MobgenJson__Group__2__Impl : ( ( rule__MobgenJson__ValueAssignment_2 ) ) ;
    public final void rule__MobgenJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2498:1: ( ( ( rule__MobgenJson__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2499:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2499:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2500:1: ( rule__MobgenJson__ValueAssignment_2 )
            {
             before(grammarAccess.getMobgenJsonAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2501:1: ( rule__MobgenJson__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2501:2: rule__MobgenJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl5036);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2511:1: rule__MobgenJson__Group__3 : rule__MobgenJson__Group__3__Impl ;
    public final void rule__MobgenJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2515:1: ( rule__MobgenJson__Group__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2516:2: rule__MobgenJson__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__35066);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2522:1: rule__MobgenJson__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2526:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2527:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2527:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2528:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__MobgenJson__Group__3__Impl5094); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2549:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2553:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2554:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__05133);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__05136);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2561:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2565:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2566:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2566:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2567:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__JsonObject__Group__0__Impl5164); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2580:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2584:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2585:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15195);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15198);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2592:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2596:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2597:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2597:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2598:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2599:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2599:2: rule__JsonObject__KeyValuePairAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl5225);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2609:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2613:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2614:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25255);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25258);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2621:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )* ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2625:1: ( ( ( rule__JsonObject__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2626:1: ( ( rule__JsonObject__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2626:1: ( ( rule__JsonObject__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2627:1: ( rule__JsonObject__Group_2__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2628:1: ( rule__JsonObject__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_STRING) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2628:2: rule__JsonObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5285);
            	    rule__JsonObject__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2638:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2642:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2643:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35316);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35319);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2650:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2654:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2655:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2655:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2656:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2657:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2658:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__JsonObject__Group__3__Impl5348); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2669:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2673:1: ( rule__JsonObject__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2674:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45381);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2680:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2684:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2685:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2685:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2686:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__JsonObject__Group__4__Impl5409); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2709:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2713:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2714:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05450);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05453);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2721:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2725:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2726:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2726:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2727:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__JsonObject__Group_2__0__Impl5481); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2740:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2744:1: ( rule__JsonObject__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2745:2: rule__JsonObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15512);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2751:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2755:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2756:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2756:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2757:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2758:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2758:2: rule__JsonObject__KeyValuePairAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5539);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2772:1: rule__JsonKeyValuePair__Group__0 : rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 ;
    public final void rule__JsonKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2776:1: ( rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2777:2: rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05573);
            rule__JsonKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05576);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2784:1: rule__JsonKeyValuePair__Group__0__Impl : ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2788:1: ( ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2789:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2789:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2790:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2791:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2791:2: rule__JsonKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5603);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2801:1: rule__JsonKeyValuePair__Group__1 : rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 ;
    public final void rule__JsonKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2805:1: ( rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2806:2: rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15633);
            rule__JsonKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15636);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2813:1: rule__JsonKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2817:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2818:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2818:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2819:1: ':'
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__JsonKeyValuePair__Group__1__Impl5664); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2832:1: rule__JsonKeyValuePair__Group__2 : rule__JsonKeyValuePair__Group__2__Impl ;
    public final void rule__JsonKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2836:1: ( rule__JsonKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2837:2: rule__JsonKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25695);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2843:1: rule__JsonKeyValuePair__Group__2__Impl : ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2847:1: ( ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2848:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2848:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2849:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2850:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2850:2: rule__JsonKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5722);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2866:1: rule__JsonArray__Group__0 : rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 ;
    public final void rule__JsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2870:1: ( rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2871:2: rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05758);
            rule__JsonArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05761);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2878:1: rule__JsonArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2882:1: ( ( '[' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2883:1: ( '[' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2883:1: ( '[' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2884:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__JsonArray__Group__0__Impl5789); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2897:1: rule__JsonArray__Group__1 : rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 ;
    public final void rule__JsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2901:1: ( rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2902:2: rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15820);
            rule__JsonArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15823);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2909:1: rule__JsonArray__Group__1__Impl : ( ( rule__JsonArray__ItemsAssignment_1 ) ) ;
    public final void rule__JsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2913:1: ( ( ( rule__JsonArray__ItemsAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2914:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2914:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2915:1: ( rule__JsonArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2916:1: ( rule__JsonArray__ItemsAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2916:2: rule__JsonArray__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5850);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2926:1: rule__JsonArray__Group__2 : rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 ;
    public final void rule__JsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2930:1: ( rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2931:2: rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25880);
            rule__JsonArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25883);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2938:1: rule__JsonArray__Group__2__Impl : ( ( rule__JsonArray__Group_2__0 )* ) ;
    public final void rule__JsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2942:1: ( ( ( rule__JsonArray__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2943:1: ( ( rule__JsonArray__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2943:1: ( ( rule__JsonArray__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2944:1: ( rule__JsonArray__Group_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2945:1: ( rule__JsonArray__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    int LA22_1 = input.LA(2);

                    if ( ((LA22_1>=RULE_STRING && LA22_1<=RULE_JSON_META_SCALAR_TYPE)||LA22_1==20||LA22_1==37) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2945:2: rule__JsonArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5910);
            	    rule__JsonArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2955:1: rule__JsonArray__Group__3 : rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 ;
    public final void rule__JsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2959:1: ( rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2960:2: rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35941);
            rule__JsonArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35944);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2967:1: rule__JsonArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2971:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2972:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2972:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2973:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2974:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2975:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__JsonArray__Group__3__Impl5973); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2986:1: rule__JsonArray__Group__4 : rule__JsonArray__Group__4__Impl ;
    public final void rule__JsonArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2990:1: ( rule__JsonArray__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2991:2: rule__JsonArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__46006);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2997:1: rule__JsonArray__Group__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3001:1: ( ( ']' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3002:1: ( ']' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3002:1: ( ']' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3003:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__JsonArray__Group__4__Impl6034); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3026:1: rule__JsonArray__Group_2__0 : rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 ;
    public final void rule__JsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3030:1: ( rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3031:2: rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__06075);
            rule__JsonArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__06078);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3038:1: rule__JsonArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3042:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3043:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3043:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3044:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__JsonArray__Group_2__0__Impl6106); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3057:1: rule__JsonArray__Group_2__1 : rule__JsonArray__Group_2__1__Impl ;
    public final void rule__JsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3061:1: ( rule__JsonArray__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3062:2: rule__JsonArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__16137);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3068:1: rule__JsonArray__Group_2__1__Impl : ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__JsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3072:1: ( ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3073:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3073:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3074:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3075:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3075:2: rule__JsonArray__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl6164);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3089:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3093:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3094:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06198);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06201);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3101:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3105:1: ( ( 'enum' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3106:1: ( 'enum' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3106:1: ( 'enum' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3107:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__EnumInstance__Group__0__Impl6229); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3120:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3124:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3125:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16260);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16263);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3132:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3136:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3137:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3137:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3138:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3139:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3139:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6290);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3149:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3153:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3154:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26320);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26323);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3161:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3165:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3166:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3166:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3167:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__EnumInstance__Group__2__Impl6351); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3180:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3184:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3185:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36382);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36385);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3192:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3196:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3197:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3197:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3198:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3199:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3199:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6412);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3209:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3213:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3214:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46442);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46445);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3221:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3225:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3226:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3226:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3227:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3228:1: ( rule__EnumInstance__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3228:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6472);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3238:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3242:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3243:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56503);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56506);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3250:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3254:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3255:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3255:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3256:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3257:1: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3258:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__EnumInstance__Group__5__Impl6535); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3269:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3273:1: ( rule__EnumInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3274:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66568);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3280:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3284:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3285:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3285:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3286:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__EnumInstance__Group__6__Impl6596); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3313:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3317:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3318:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06641);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06644);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3325:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3329:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3330:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3330:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3331:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__EnumInstance__Group_4__0__Impl6672); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3344:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3348:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3349:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16703);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3355:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3359:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3360:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3360:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3361:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3362:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3362:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6730);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3376:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3380:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3381:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06764);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06767);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3388:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3392:1: ( ( 'map' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3393:1: ( 'map' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3393:1: ( 'map' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3394:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__MapInstance__Group__0__Impl6795); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3407:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3411:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3412:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16826);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16829);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3419:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__NameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3423:1: ( ( ( rule__MapInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3424:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3424:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3425:1: ( rule__MapInstance__NameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3426:1: ( rule__MapInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3426:2: rule__MapInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6856);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3436:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3440:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3441:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26886);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26889);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3448:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3452:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3453:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3453:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3454:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MapInstance__Group__2__Impl6917); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3467:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3471:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3472:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36948);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36951);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3479:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__Group_3__0 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3483:1: ( ( ( rule__MapInstance__Group_3__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3484:1: ( ( rule__MapInstance__Group_3__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3484:1: ( ( rule__MapInstance__Group_3__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3485:1: ( rule__MapInstance__Group_3__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3486:1: ( rule__MapInstance__Group_3__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3486:2: rule__MapInstance__Group_3__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6978);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3496:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3500:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3501:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__47008);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__47011);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3508:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3512:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3513:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3513:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3514:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3515:1: ( rule__MapInstance__Group_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3515:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl7038);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3525:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3529:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3530:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__57069);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__57072);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3537:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3541:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3542:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3542:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3543:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3544:1: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3545:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__MapInstance__Group__5__Impl7101); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3556:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3560:1: ( rule__MapInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3561:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__67134);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3567:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3571:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3572:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3572:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3573:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__MapInstance__Group__6__Impl7162); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3600:1: rule__MapInstance__Group_3__0 : rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 ;
    public final void rule__MapInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3604:1: ( rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3605:2: rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07207);
            rule__MapInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07210);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3612:1: rule__MapInstance__Group_3__0__Impl : ( ( rule__MapInstance__KeysAssignment_3_0 ) ) ;
    public final void rule__MapInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3616:1: ( ( ( rule__MapInstance__KeysAssignment_3_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3617:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3617:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3618:1: ( rule__MapInstance__KeysAssignment_3_0 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3619:1: ( rule__MapInstance__KeysAssignment_3_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3619:2: rule__MapInstance__KeysAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7237);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3629:1: rule__MapInstance__Group_3__1 : rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 ;
    public final void rule__MapInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3633:1: ( rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3634:2: rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17267);
            rule__MapInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17270);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3641:1: rule__MapInstance__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3645:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3646:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3646:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3647:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__MapInstance__Group_3__1__Impl7298); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3660:1: rule__MapInstance__Group_3__2 : rule__MapInstance__Group_3__2__Impl ;
    public final void rule__MapInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3664:1: ( rule__MapInstance__Group_3__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3665:2: rule__MapInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27329);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3671:1: rule__MapInstance__Group_3__2__Impl : ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) ;
    public final void rule__MapInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3675:1: ( ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3676:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3676:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3677:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3678:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3678:2: rule__MapInstance__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7356);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3694:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3698:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3699:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07392);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07395);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3706:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3710:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3711:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3711:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3712:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__MapInstance__Group_4__0__Impl7423); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3725:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3729:1: ( rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3730:2: rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17454);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17457);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3737:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__KeysAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3741:1: ( ( ( rule__MapInstance__KeysAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3742:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3742:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3743:1: ( rule__MapInstance__KeysAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3744:1: ( rule__MapInstance__KeysAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3744:2: rule__MapInstance__KeysAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7484);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3754:1: rule__MapInstance__Group_4__2 : rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 ;
    public final void rule__MapInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3758:1: ( rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3759:2: rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27514);
            rule__MapInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27517);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3766:1: rule__MapInstance__Group_4__2__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3770:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3771:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3771:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3772:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 
            match(input,24,FOLLOW_24_in_rule__MapInstance__Group_4__2__Impl7545); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3785:1: rule__MapInstance__Group_4__3 : rule__MapInstance__Group_4__3__Impl ;
    public final void rule__MapInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3789:1: ( rule__MapInstance__Group_4__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3790:2: rule__MapInstance__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37576);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3796:1: rule__MapInstance__Group_4__3__Impl : ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) ;
    public final void rule__MapInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3800:1: ( ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3801:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3801:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3802:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3803:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3803:2: rule__MapInstance__ValuesAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7603);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3821:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3825:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3826:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07641);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07644);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3833:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3837:1: ( ( '[' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3838:1: ( '[' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3838:1: ( '[' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3839:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__StringList__Group__0__Impl7672); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3852:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3856:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3857:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17703);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17706);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3864:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3868:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3869:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3869:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3870:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3871:1: ( rule__StringList__ValuesAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3871:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7733);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3881:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3885:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3886:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27763);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27766);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3893:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3897:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3898:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3898:1: ( ( rule__StringList__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3899:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3900:1: ( rule__StringList__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_STRING) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3900:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7793);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3910:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3914:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3915:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37824);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37827);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3922:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3926:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3927:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3927:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3928:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3929:1: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3930:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__StringList__Group__3__Impl7856); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3941:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3945:1: ( rule__StringList__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3946:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47889);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3952:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3956:1: ( ( ']' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3957:1: ( ']' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3957:1: ( ']' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3958:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__StringList__Group__4__Impl7917); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3981:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3985:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3986:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07958);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07961);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3993:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3997:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3998:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3998:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3999:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__StringList__Group_2__0__Impl7989); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4012:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4016:1: ( rule__StringList__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4017:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18020);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4023:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4027:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4028:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4028:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4029:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4030:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4030:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8047);
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


    // $ANTLR start "rule__Mobgen__PlatformAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4045:1: rule__Mobgen__PlatformAssignment_0 : ( rulePlatform ) ;
    public final void rule__Mobgen__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4049:1: ( ( rulePlatform ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4050:1: ( rulePlatform )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4050:1: ( rulePlatform )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4051:1: rulePlatform
            {
             before(grammarAccess.getMobgenAccess().getPlatformPlatformParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePlatform_in_rule__Mobgen__PlatformAssignment_08086);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4060:1: rule__Mobgen__ResourcesAssignment_1_0 : ( ruleMobgenResourceDefinition ) ;
    public final void rule__Mobgen__ResourcesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4064:1: ( ( ruleMobgenResourceDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4065:1: ( ruleMobgenResourceDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4065:1: ( ruleMobgenResourceDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4066:1: ruleMobgenResourceDefinition
            {
             before(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_1_08117);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4075:1: rule__Mobgen__CallsAssignment_1_1 : ( ruleMobgenCallDefinition ) ;
    public final void rule__Mobgen__CallsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4079:1: ( ( ruleMobgenCallDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4080:1: ( ruleMobgenCallDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4080:1: ( ruleMobgenCallDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4081:1: ruleMobgenCallDefinition
            {
             before(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_1_18148);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4090:1: rule__Platform__PlatformsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Platform__PlatformsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4094:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4095:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4095:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4096:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_08179); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4105:1: rule__Platform__GenerateWhereAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Platform__GenerateWhereAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4109:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4110:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4110:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4111:1: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getGenerateWhereSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_28210); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4120:1: rule__MobgenCallDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenCallDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4124:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4125:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4125:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4126:1: RULE_ID
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_18241); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4135:1: rule__MobgenCallDefinition__MethodAssignment_3 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__MobgenCallDefinition__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4139:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4140:1: ( RULE_RESTFUL_METHODS )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4140:1: ( RULE_RESTFUL_METHODS )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4141:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__MobgenCallDefinition__MethodAssignment_38272); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4150:1: rule__MobgenCallDefinition__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__MobgenCallDefinition__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4154:1: ( ( ruleURI ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4155:1: ( ruleURI )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4155:1: ( ruleURI )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4156:1: ruleURI
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_58303);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4165:1: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4169:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4170:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4170:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4171:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_48334);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4180:1: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4184:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4185:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4185:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4186:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28365);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4195:1: rule__MobgenCallDefinition__JsonToClientAssignment_7_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4199:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4200:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4200:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4201:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28396);
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


    // $ANTLR start "rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4210:1: rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4214:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4215:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4215:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4216:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_7_3_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_7_3_28427);
            ruleMobgenJson();

            state._fsp--;

             after(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_7_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2"


    // $ANTLR start "rule__URI__ParametersAssignment_1_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4225:1: rule__URI__ParametersAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__URI__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4229:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4230:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4230:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4231:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getParametersIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__ParametersAssignment_1_18458); 
             after(grammarAccess.getURIAccess().getParametersIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__ParametersAssignment_1_1"


    // $ANTLR start "rule__MobgenHeader__NameAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4240:1: rule__MobgenHeader__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenHeader__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4244:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4245:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4245:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4246:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08489); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4255:1: rule__MobgenHeader__HeaderKeyValuesAssignment_3 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4259:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4260:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4260:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4261:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38520);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4270:1: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4274:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4275:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4275:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4276:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18551);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4285:1: rule__MobgenHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4289:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4290:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4290:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4291:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08582); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4300:1: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4304:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4305:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4305:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4306:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08613); 
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


    // $ANTLR start "rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4315:1: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 : ( RULE_MOBGEN_HEADER_PARAMETER ) ;
    public final void rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4319:1: ( ( RULE_MOBGEN_HEADER_PARAMETER ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4320:1: ( RULE_MOBGEN_HEADER_PARAMETER )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4320:1: ( RULE_MOBGEN_HEADER_PARAMETER )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4321:1: RULE_MOBGEN_HEADER_PARAMETER
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueMobgen_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
            match(input,RULE_MOBGEN_HEADER_PARAMETER,FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_18644); 
             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueMobgen_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1"


    // $ANTLR start "rule__MobgenJson__NameAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4330:1: rule__MobgenJson__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenJson__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4334:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4335:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4335:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4336:1: RULE_ID
            {
             before(grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08675); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4345:1: rule__MobgenJson__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__MobgenJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4349:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4350:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4350:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4351:1: ruleJsonObjectValue
            {
             before(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_28706);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4360:1: rule__JsonObjectValue__ValueAssignment_0 : ( ruleJsonLiteralValue ) ;
    public final void rule__JsonObjectValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4364:1: ( ( ruleJsonLiteralValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4365:1: ( ruleJsonLiteralValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4365:1: ( ruleJsonLiteralValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4366:1: ruleJsonLiteralValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ValueAssignment_08737);
            ruleJsonLiteralValue();

            state._fsp--;

             after(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonObject__KeyValuePairAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4375:1: rule__JsonObject__KeyValuePairAssignment_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4379:1: ( ( ruleJsonKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4380:1: ( ruleJsonKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4380:1: ( ruleJsonKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4381:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_18768);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4390:1: rule__JsonObject__KeyValuePairAssignment_2_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4394:1: ( ( ruleJsonKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4395:1: ( ruleJsonKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4395:1: ( ruleJsonKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4396:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_18799);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4405:1: rule__JsonKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4409:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4410:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4410:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4411:1: RULE_STRING
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08830); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4420:1: rule__JsonKeyValuePair__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4424:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4425:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4425:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4426:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28861);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4435:1: rule__JsonArray__ItemsAssignment_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4439:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4440:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4440:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4441:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_18892);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4450:1: rule__JsonArray__ItemsAssignment_2_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4454:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4455:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4455:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4456:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_18923);
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


    // $ANTLR start "rule__MobgenResourceDefinition__ResourcesAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4465:1: rule__MobgenResourceDefinition__ResourcesAssignment_0 : ( ruleMapInstance ) ;
    public final void rule__MobgenResourceDefinition__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4469:1: ( ( ruleMapInstance ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4470:1: ( ruleMapInstance )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4470:1: ( ruleMapInstance )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4471:1: ruleMapInstance
            {
             before(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__ResourcesAssignment_08954);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4480:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4484:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4485:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4485:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4486:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_18985); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4495:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4499:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4500:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4500:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4501:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_39016); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4510:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4514:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4515:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4515:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4516:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_19047); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4525:1: rule__MapInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4529:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4530:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4530:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4531:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_19078); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4540:1: rule__MapInstance__KeysAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4544:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4545:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4545:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4546:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_09109); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4555:1: rule__MapInstance__ValuesAssignment_3_2 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4559:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4560:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4560:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4561:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_29140);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4570:1: rule__MapInstance__KeysAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4574:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4575:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4575:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4576:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_19171); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4585:1: rule__MapInstance__ValuesAssignment_4_3 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4589:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4590:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4590:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4591:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39202);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4600:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4604:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4605:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4605:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4606:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19233); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4615:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4619:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4620:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4620:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4621:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19264); 
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
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeader308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0_in_ruleMobgenHeader334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0_in_ruleMobgenHeaderKeyValuePair394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenJson428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0_in_ruleMobgenJson454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__Alternatives_in_ruleJsonObjectValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeValue__Alternatives_in_ruleJsonCompositeValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonLiteralValue608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonLiteralValue__Alternatives_in_ruleJsonLiteralValue634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0_in_ruleJsonArray814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenResourceDefinition__Alternatives_in_ruleMobgenResourceDefinition874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0_in_ruleStringList1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__ResourcesAssignment_1_0_in_rule__Mobgen__Alternatives_11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__CallsAssignment_1_1_in_rule__Mobgen__Alternatives_11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0_in_rule__MobgenHeaderKeyValuePair__Alternatives_21201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1_in_rule__MobgenHeaderKeyValuePair__Alternatives_21219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__ValueAssignment_0_in_rule__JsonObjectValue__Alternatives1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__Alternatives1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonLiteralValue__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__Alternatives1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_rule__JsonLiteralValue__Alternatives1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_rule__JsonLiteralValue__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenResourceDefinition__ResourcesAssignment_0_in_rule__MobgenResourceDefinition__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NestedType__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__NestedType__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__0__Impl_in_rule__Mobgen__Group__01582 = new BitSet(new long[]{0x0000018000800000L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__1_in_rule__Mobgen__Group__01585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__PlatformAssignment_0_in_rule__Mobgen__Group__0__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__1__Impl_in_rule__Mobgen__Group__11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1671 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1683 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01720 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Platform__Group__0__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11782 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Platform__Group__1__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21844 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1876 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1888 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Platform__Group__3__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01988 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__12048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Platform__Group_2__1__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02173 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MobgenCallDefinition__Group__0__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12235 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22295 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MobgenCallDefinition__Group__2__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32357 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42417 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MobgenCallDefinition__Group__4__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52479 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62539 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02674 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MobgenCallDefinition__Group_6__0__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12736 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MobgenCallDefinition__Group_6__1__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22798 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MobgenCallDefinition__Group_6__2__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32860 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MobgenCallDefinition__Group_6__3__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42922 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__52982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__03052 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__03055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13114 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03239 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MobgenCallDefinition__Group_7__0__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenCallDefinition__Group_7__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23363 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__3_in_rule__MobgenCallDefinition__Group_7__23366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__3__Impl_in_rule__MobgenCallDefinition__Group_7__33423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7_3__0_in_rule__MobgenCallDefinition__Group_7__3__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7_3__0__Impl_in_rule__MobgenCallDefinition__Group_7_3__03489 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7_3__1_in_rule__MobgenCallDefinition__Group_7_3__03492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MobgenCallDefinition__Group_7_3__0__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7_3__1__Impl_in_rule__MobgenCallDefinition__Group_7_3__13551 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7_3__2_in_rule__MobgenCallDefinition__Group_7_3__13554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenCallDefinition__Group_7_3__1__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7_3__2__Impl_in_rule__MobgenCallDefinition__Group_7_3__23613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_7_3_2_in_rule__MobgenCallDefinition__Group_7_3__2__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03676 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3709 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3722 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3782 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03817 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__URI__Group_1__0__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13879 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__ParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23939 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__URI__Group_1__2__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__34001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl4029 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__04068 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__04071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__14129 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__14132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenHeader__Group__1__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__24191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__24194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MobgenHeader__Group__2__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__34253 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__34256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__44313 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__44316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl4343 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__54374 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__54377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MobgenHeader__Group__5__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__64439 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__64442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MobgenHeader__Group__6__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__74501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenHeader__Group__7__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MobgenHeader__Group_4__0__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04699 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14759 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04884 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14944 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenJson__Group__1__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__25006 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__25009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__35066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenJson__Group__3__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__05133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__05136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JsonObject__Group__0__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15195 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25255 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5285 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35316 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonObject__Group__3__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JsonObject__Group__4__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonObject__Group_2__0__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05573 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15633 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonKeyValuePair__Group__1__Impl5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05758 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__JsonArray__Group__0__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15820 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25880 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5910 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35941 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group__3__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__46006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__JsonArray__Group__4__Impl6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__06075 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__06078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group_2__0__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__16137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06198 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumInstance__Group__0__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16260 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumInstance__Group__2__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36382 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46442 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6472 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56503 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumInstance__Group__5__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumInstance__Group__6__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06641 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumInstance__Group_4__0__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06764 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MapInstance__Group__0__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16826 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26886 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MapInstance__Group__2__Impl6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36948 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__47008 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__47011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl7038 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__57069 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__57072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MapInstance__Group__5__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__67134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapInstance__Group__6__Impl7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07207 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17267 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapInstance__Group_3__1__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07392 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MapInstance__Group_4__0__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17454 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27514 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapInstance__Group_4__2__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__StringList__Group__0__Impl7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17703 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27763 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7793 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37824 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringList__Group__3__Impl7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StringList__Group__4__Impl7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringList__Group_2__0__Impl7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__Mobgen__PlatformAssignment_08086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_1_08117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_1_18148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_08179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_28210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_18241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__MobgenCallDefinition__MethodAssignment_38272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_58303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_48334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_7_3_28427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__ParametersAssignment_1_18458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_18644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_28706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ValueAssignment_08737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_18768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_18799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_18892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_18923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__ResourcesAssignment_08954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_18985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_39016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_19047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_19078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_09109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_29140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_19171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19264 = new BitSet(new long[]{0x0000000000000002L});

}