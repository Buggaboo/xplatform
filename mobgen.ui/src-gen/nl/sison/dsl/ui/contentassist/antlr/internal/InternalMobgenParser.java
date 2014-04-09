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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_JSON_NUMBER", "RULE_JSON_META_SCALAR_TYPE", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_ANY_OTHER", "RULE_MOBGEN_HEADER_PARAMETER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'platform'", "'{'", "'}'", "'->'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'enum'", "'map'"
    };
    public static final int RULE_ID=11;
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
    public static final int RULE_ANY_OTHER=13;
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
    public static final int RULE_RESTFUL_METHODS=12;
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:608:1: rule__JsonObjectValue__Alternatives : ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) );
    public final void rule__JsonObjectValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:612:1: ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ( rule__JsonObjectValue__CompositeAssignment_1 ) ) )
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
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:619:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:619:6: ( ( rule__JsonObjectValue__CompositeAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:620:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getCompositeAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:621:1: ( rule__JsonObjectValue__CompositeAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:621:2: rule__JsonObjectValue__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1270);
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
                    pushFollow(FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__Alternatives1303);
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
                    pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__Alternatives1320);
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
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__Alternatives1352); 
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
                    match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__Alternatives1369); 
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
                    match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__Alternatives1386); 
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
                    match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonLiteralValue__Alternatives1403); 
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
                    match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__Alternatives1420); 
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
                    match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_rule__JsonLiteralValue__Alternatives1437); 
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
                    match(input,RULE_JSON_META_SCALAR_TYPE,FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_rule__JsonLiteralValue__Alternatives1454); 
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
                    pushFollow(FOLLOW_rule__MobgenResourceDefinition__ResourcesAssignment_0_in_rule__MobgenResourceDefinition__Alternatives1486);
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
                    pushFollow(FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1504);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:726:1: rule__NestedType__Alternatives : ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) );
    public final void rule__NestedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:730:1: ( ( ( rule__NestedType__ListAssignment_0 ) ) | ( ( rule__NestedType__StringAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:731:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:731:1: ( ( rule__NestedType__ListAssignment_0 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:732:1: ( rule__NestedType__ListAssignment_0 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:733:1: ( rule__NestedType__ListAssignment_0 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:733:2: rule__NestedType__ListAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1536);
                    rule__NestedType__ListAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedTypeAccess().getListAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:737:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    {
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:737:6: ( ( rule__NestedType__StringAssignment_1 ) )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:738:1: ( rule__NestedType__StringAssignment_1 )
                    {
                     before(grammarAccess.getNestedTypeAccess().getStringAssignment_1()); 
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:739:1: ( rule__NestedType__StringAssignment_1 )
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:739:2: rule__NestedType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1554);
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


    // $ANTLR start "rule__Mobgen__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:750:1: rule__Mobgen__Group__0 : rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1 ;
    public final void rule__Mobgen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:754:1: ( rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:755:2: rule__Mobgen__Group__0__Impl rule__Mobgen__Group__1
            {
            pushFollow(FOLLOW_rule__Mobgen__Group__0__Impl_in_rule__Mobgen__Group__01585);
            rule__Mobgen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mobgen__Group__1_in_rule__Mobgen__Group__01588);
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
            pushFollow(FOLLOW_rule__Mobgen__PlatformAssignment_0_in_rule__Mobgen__Group__0__Impl1615);
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
            pushFollow(FOLLOW_rule__Mobgen__Group__1__Impl_in_rule__Mobgen__Group__11645);
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
            pushFollow(FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1674);
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
            	    pushFollow(FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1686);
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
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01723);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01726);
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
            match(input,19,FOLLOW_19_in_rule__Platform__Group__0__Impl1754); 
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
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11785);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11788);
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
            match(input,20,FOLLOW_20_in_rule__Platform__Group__1__Impl1816); 
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
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21847);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21850);
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
            pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1879);
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
            	    pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1891);
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
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31924);
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
            match(input,21,FOLLOW_21_in_rule__Platform__Group__3__Impl1952); 
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
            pushFollow(FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01991);
            rule__Platform__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01994);
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
            pushFollow(FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl2021);
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
            pushFollow(FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__12051);
            rule__Platform__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__12054);
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
            match(input,22,FOLLOW_22_in_rule__Platform__Group_2__1__Impl2082); 
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
            pushFollow(FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22113);
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
            pushFollow(FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl2140);
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02176);
            rule__MobgenCallDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02179);
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
            match(input,23,FOLLOW_23_in_rule__MobgenCallDefinition__Group__0__Impl2207); 
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12238);
            rule__MobgenCallDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12241);
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2268);
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22298);
            rule__MobgenCallDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22301);
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
            match(input,24,FOLLOW_24_in_rule__MobgenCallDefinition__Group__2__Impl2329); 
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32360);
            rule__MobgenCallDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32363);
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2390);
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42420);
            rule__MobgenCallDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42423);
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
            match(input,25,FOLLOW_25_in_rule__MobgenCallDefinition__Group__4__Impl2451); 
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52482);
            rule__MobgenCallDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52485);
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2512);
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
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62542);
            rule__MobgenCallDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62545);
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
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2572);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1257:1: rule__MobgenCallDefinition__Group__7 : rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 ;
    public final void rule__MobgenCallDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1261:1: ( rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1262:2: rule__MobgenCallDefinition__Group__7__Impl rule__MobgenCallDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72603);
            rule__MobgenCallDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72606);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1269:1: rule__MobgenCallDefinition__Group__7__Impl : ( ( rule__MobgenCallDefinition__Group_7__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1273:1: ( ( ( rule__MobgenCallDefinition__Group_7__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1274:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1274:1: ( ( rule__MobgenCallDefinition__Group_7__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1275:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1276:1: ( rule__MobgenCallDefinition__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1276:2: rule__MobgenCallDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2633);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1286:1: rule__MobgenCallDefinition__Group__8 : rule__MobgenCallDefinition__Group__8__Impl ;
    public final void rule__MobgenCallDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1290:1: ( rule__MobgenCallDefinition__Group__8__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1291:2: rule__MobgenCallDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82664);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1297:1: rule__MobgenCallDefinition__Group__8__Impl : ( ( rule__MobgenCallDefinition__Group_8__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1301:1: ( ( ( rule__MobgenCallDefinition__Group_8__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1302:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1302:1: ( ( rule__MobgenCallDefinition__Group_8__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1303:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_8()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1304:1: ( rule__MobgenCallDefinition__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1304:2: rule__MobgenCallDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2691);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1332:1: rule__MobgenCallDefinition__Group_6__0 : rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 ;
    public final void rule__MobgenCallDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1336:1: ( rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1337:2: rule__MobgenCallDefinition__Group_6__0__Impl rule__MobgenCallDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02740);
            rule__MobgenCallDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02743);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1344:1: rule__MobgenCallDefinition__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__MobgenCallDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1348:1: ( ( 'with' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1349:1: ( 'with' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1349:1: ( 'with' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1350:1: 'with'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__MobgenCallDefinition__Group_6__0__Impl2771); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1363:1: rule__MobgenCallDefinition__Group_6__1 : rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 ;
    public final void rule__MobgenCallDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1367:1: ( rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1368:2: rule__MobgenCallDefinition__Group_6__1__Impl rule__MobgenCallDefinition__Group_6__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12802);
            rule__MobgenCallDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12805);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1375:1: rule__MobgenCallDefinition__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__MobgenCallDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1379:1: ( ( 'headers' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1380:1: ( 'headers' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1380:1: ( 'headers' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1381:1: 'headers'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1()); 
            match(input,27,FOLLOW_27_in_rule__MobgenCallDefinition__Group_6__1__Impl2833); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1394:1: rule__MobgenCallDefinition__Group_6__2 : rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 ;
    public final void rule__MobgenCallDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1398:1: ( rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1399:2: rule__MobgenCallDefinition__Group_6__2__Impl rule__MobgenCallDefinition__Group_6__3
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22864);
            rule__MobgenCallDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22867);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1406:1: rule__MobgenCallDefinition__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__MobgenCallDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1410:1: ( ( 'from' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1411:1: ( 'from' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1411:1: ( 'from' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1412:1: 'from'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2()); 
            match(input,25,FOLLOW_25_in_rule__MobgenCallDefinition__Group_6__2__Impl2895); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1425:1: rule__MobgenCallDefinition__Group_6__3 : rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 ;
    public final void rule__MobgenCallDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1429:1: ( rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1430:2: rule__MobgenCallDefinition__Group_6__3__Impl rule__MobgenCallDefinition__Group_6__4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32926);
            rule__MobgenCallDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32929);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1437:1: rule__MobgenCallDefinition__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__MobgenCallDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1441:1: ( ( 'request' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1442:1: ( 'request' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1442:1: ( 'request' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1443:1: 'request'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3()); 
            match(input,28,FOLLOW_28_in_rule__MobgenCallDefinition__Group_6__3__Impl2957); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1456:1: rule__MobgenCallDefinition__Group_6__4 : rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 ;
    public final void rule__MobgenCallDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1460:1: ( rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1461:2: rule__MobgenCallDefinition__Group_6__4__Impl rule__MobgenCallDefinition__Group_6__5
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42988);
            rule__MobgenCallDefinition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42991);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1468:1: rule__MobgenCallDefinition__Group_6__4__Impl : ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1472:1: ( ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1473:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1473:1: ( ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1474:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1475:1: ( rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1475:2: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl3018);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1485:1: rule__MobgenCallDefinition__Group_6__5 : rule__MobgenCallDefinition__Group_6__5__Impl ;
    public final void rule__MobgenCallDefinition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1489:1: ( rule__MobgenCallDefinition__Group_6__5__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1490:2: rule__MobgenCallDefinition__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__53048);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1496:1: rule__MobgenCallDefinition__Group_6__5__Impl : ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) ;
    public final void rule__MobgenCallDefinition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1500:1: ( ( ( rule__MobgenCallDefinition__Group_6_5__0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1501:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1501:1: ( ( rule__MobgenCallDefinition__Group_6_5__0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1502:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1503:1: ( rule__MobgenCallDefinition__Group_6_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1503:2: rule__MobgenCallDefinition__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl3075);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1525:1: rule__MobgenCallDefinition__Group_6_5__0 : rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 ;
    public final void rule__MobgenCallDefinition__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1529:1: ( rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1530:2: rule__MobgenCallDefinition__Group_6_5__0__Impl rule__MobgenCallDefinition__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__03118);
            rule__MobgenCallDefinition__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__03121);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1537:1: rule__MobgenCallDefinition__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1541:1: ( ( 'and' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1542:1: ( 'and' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1542:1: ( 'and' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1543:1: 'and'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0()); 
            match(input,29,FOLLOW_29_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3149); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1556:1: rule__MobgenCallDefinition__Group_6_5__1 : rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 ;
    public final void rule__MobgenCallDefinition__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1560:1: ( rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1561:2: rule__MobgenCallDefinition__Group_6_5__1__Impl rule__MobgenCallDefinition__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13180);
            rule__MobgenCallDefinition__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13183);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1568:1: rule__MobgenCallDefinition__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1572:1: ( ( 'response' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1573:1: ( 'response' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1573:1: ( 'response' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1574:1: 'response'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1()); 
            match(input,30,FOLLOW_30_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3211); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1587:1: rule__MobgenCallDefinition__Group_6_5__2 : rule__MobgenCallDefinition__Group_6_5__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1591:1: ( rule__MobgenCallDefinition__Group_6_5__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1592:2: rule__MobgenCallDefinition__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23242);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1598:1: rule__MobgenCallDefinition__Group_6_5__2__Impl : ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1602:1: ( ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1603:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1603:1: ( ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1604:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1605:1: ( rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1605:2: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3269);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1621:1: rule__MobgenCallDefinition__Group_7__0 : rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 ;
    public final void rule__MobgenCallDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1625:1: ( rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1626:2: rule__MobgenCallDefinition__Group_7__0__Impl rule__MobgenCallDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03305);
            rule__MobgenCallDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03308);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1633:1: rule__MobgenCallDefinition__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__MobgenCallDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1637:1: ( ( 'client' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1638:1: ( 'client' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1638:1: ( 'client' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1639:1: 'client'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__MobgenCallDefinition__Group_7__0__Impl3336); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1652:1: rule__MobgenCallDefinition__Group_7__1 : rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 ;
    public final void rule__MobgenCallDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1656:1: ( rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1657:2: rule__MobgenCallDefinition__Group_7__1__Impl rule__MobgenCallDefinition__Group_7__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13367);
            rule__MobgenCallDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13370);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1664:1: rule__MobgenCallDefinition__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1668:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1669:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1669:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1670:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1()); 
            match(input,32,FOLLOW_32_in_rule__MobgenCallDefinition__Group_7__1__Impl3398); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1683:1: rule__MobgenCallDefinition__Group_7__2 : rule__MobgenCallDefinition__Group_7__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1687:1: ( rule__MobgenCallDefinition__Group_7__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1688:2: rule__MobgenCallDefinition__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23429);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1694:1: rule__MobgenCallDefinition__Group_7__2__Impl : ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1698:1: ( ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1699:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1699:1: ( ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1700:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientAssignment_7_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1701:1: ( rule__MobgenCallDefinition__JsonToClientAssignment_7_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1701:2: rule__MobgenCallDefinition__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3456);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1717:1: rule__MobgenCallDefinition__Group_8__0 : rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 ;
    public final void rule__MobgenCallDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1721:1: ( rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1722:2: rule__MobgenCallDefinition__Group_8__0__Impl rule__MobgenCallDefinition__Group_8__1
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03492);
            rule__MobgenCallDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03495);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1729:1: rule__MobgenCallDefinition__Group_8__0__Impl : ( 'server' ) ;
    public final void rule__MobgenCallDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1733:1: ( ( 'server' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1734:1: ( 'server' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1734:1: ( 'server' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1735:1: 'server'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0()); 
            match(input,33,FOLLOW_33_in_rule__MobgenCallDefinition__Group_8__0__Impl3523); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1748:1: rule__MobgenCallDefinition__Group_8__1 : rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 ;
    public final void rule__MobgenCallDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1752:1: ( rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1753:2: rule__MobgenCallDefinition__Group_8__1__Impl rule__MobgenCallDefinition__Group_8__2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13554);
            rule__MobgenCallDefinition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13557);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1760:1: rule__MobgenCallDefinition__Group_8__1__Impl : ( 'expects' ) ;
    public final void rule__MobgenCallDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1764:1: ( ( 'expects' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1765:1: ( 'expects' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1765:1: ( 'expects' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1766:1: 'expects'
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1()); 
            match(input,32,FOLLOW_32_in_rule__MobgenCallDefinition__Group_8__1__Impl3585); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1779:1: rule__MobgenCallDefinition__Group_8__2 : rule__MobgenCallDefinition__Group_8__2__Impl ;
    public final void rule__MobgenCallDefinition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1783:1: ( rule__MobgenCallDefinition__Group_8__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1784:2: rule__MobgenCallDefinition__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23616);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1790:1: rule__MobgenCallDefinition__Group_8__2__Impl : ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) ;
    public final void rule__MobgenCallDefinition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1794:1: ( ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1795:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1795:1: ( ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1796:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_8_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1797:1: ( rule__MobgenCallDefinition__JsonToServerAssignment_8_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1797:2: rule__MobgenCallDefinition__JsonToServerAssignment_8_2
            {
            pushFollow(FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3643);
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


    // $ANTLR start "rule__URI__Group__0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1813:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1817:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1818:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03679);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03682);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1825:1: rule__URI__Group__0__Impl : ( ( ( rule__URI__StringPrefixAssignment_0 ) ) ( ( rule__URI__StringPrefixAssignment_0 )* ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1829:1: ( ( ( ( rule__URI__StringPrefixAssignment_0 ) ) ( ( rule__URI__StringPrefixAssignment_0 )* ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1830:1: ( ( ( rule__URI__StringPrefixAssignment_0 ) ) ( ( rule__URI__StringPrefixAssignment_0 )* ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1830:1: ( ( ( rule__URI__StringPrefixAssignment_0 ) ) ( ( rule__URI__StringPrefixAssignment_0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1831:1: ( ( rule__URI__StringPrefixAssignment_0 ) ) ( ( rule__URI__StringPrefixAssignment_0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1831:1: ( ( rule__URI__StringPrefixAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1832:1: ( rule__URI__StringPrefixAssignment_0 )
            {
             before(grammarAccess.getURIAccess().getStringPrefixAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1833:1: ( rule__URI__StringPrefixAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1833:2: rule__URI__StringPrefixAssignment_0
            {
            pushFollow(FOLLOW_rule__URI__StringPrefixAssignment_0_in_rule__URI__Group__0__Impl3711);
            rule__URI__StringPrefixAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getStringPrefixAssignment_0()); 

            }

            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1836:1: ( ( rule__URI__StringPrefixAssignment_0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1837:1: ( rule__URI__StringPrefixAssignment_0 )*
            {
             before(grammarAccess.getURIAccess().getStringPrefixAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1838:1: ( rule__URI__StringPrefixAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANY_OTHER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1838:2: rule__URI__StringPrefixAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__URI__StringPrefixAssignment_0_in_rule__URI__Group__0__Impl3723);
            	    rule__URI__StringPrefixAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getStringPrefixAssignment_0()); 

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
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13756);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1860:1: rule__URI__Group__1__Impl : ( ( ( rule__URI__Group_1__0 ) ) ( ( rule__URI__Group_1__0 )* ) ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1864:1: ( ( ( ( rule__URI__Group_1__0 ) ) ( ( rule__URI__Group_1__0 )* ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1865:1: ( ( ( rule__URI__Group_1__0 ) ) ( ( rule__URI__Group_1__0 )* ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1865:1: ( ( ( rule__URI__Group_1__0 ) ) ( ( rule__URI__Group_1__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1866:1: ( ( rule__URI__Group_1__0 ) ) ( ( rule__URI__Group_1__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1866:1: ( ( rule__URI__Group_1__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1867:1: ( rule__URI__Group_1__0 )
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1868:1: ( rule__URI__Group_1__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1868:2: rule__URI__Group_1__0
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3785);
            rule__URI__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getGroup_1()); 

            }

            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1871:1: ( ( rule__URI__Group_1__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1872:1: ( rule__URI__Group_1__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1873:1: ( rule__URI__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1873:2: rule__URI__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3797);
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

        }
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1888:1: rule__URI__Group_1__0 : rule__URI__Group_1__0__Impl rule__URI__Group_1__1 ;
    public final void rule__URI__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1892:1: ( rule__URI__Group_1__0__Impl rule__URI__Group_1__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1893:2: rule__URI__Group_1__0__Impl rule__URI__Group_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03834);
            rule__URI__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03837);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1900:1: rule__URI__Group_1__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1904:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1905:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1905:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1906:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__URI__Group_1__0__Impl3865); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1919:1: rule__URI__Group_1__1 : rule__URI__Group_1__1__Impl rule__URI__Group_1__2 ;
    public final void rule__URI__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1923:1: ( rule__URI__Group_1__1__Impl rule__URI__Group_1__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1924:2: rule__URI__Group_1__1__Impl rule__URI__Group_1__2
            {
            pushFollow(FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13896);
            rule__URI__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13899);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1931:1: rule__URI__Group_1__1__Impl : ( ( rule__URI__ParametersAssignment_1_1 ) ) ;
    public final void rule__URI__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1935:1: ( ( ( rule__URI__ParametersAssignment_1_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1936:1: ( ( rule__URI__ParametersAssignment_1_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1936:1: ( ( rule__URI__ParametersAssignment_1_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1937:1: ( rule__URI__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getURIAccess().getParametersAssignment_1_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1938:1: ( rule__URI__ParametersAssignment_1_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1938:2: rule__URI__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__URI__ParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl3926);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1948:1: rule__URI__Group_1__2 : rule__URI__Group_1__2__Impl rule__URI__Group_1__3 ;
    public final void rule__URI__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1952:1: ( rule__URI__Group_1__2__Impl rule__URI__Group_1__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1953:2: rule__URI__Group_1__2__Impl rule__URI__Group_1__3
            {
            pushFollow(FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23956);
            rule__URI__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23959);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1960:1: rule__URI__Group_1__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1964:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1965:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1965:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1966:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__URI__Group_1__2__Impl3987); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1979:1: rule__URI__Group_1__3 : rule__URI__Group_1__3__Impl ;
    public final void rule__URI__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1983:1: ( rule__URI__Group_1__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1984:2: rule__URI__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__34018);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1990:1: rule__URI__Group_1__3__Impl : ( ( rule__URI__StringSuffixAssignment_1_3 ) ) ;
    public final void rule__URI__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1994:1: ( ( ( rule__URI__StringSuffixAssignment_1_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1995:1: ( ( rule__URI__StringSuffixAssignment_1_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1995:1: ( ( rule__URI__StringSuffixAssignment_1_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1996:1: ( rule__URI__StringSuffixAssignment_1_3 )
            {
             before(grammarAccess.getURIAccess().getStringSuffixAssignment_1_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1997:1: ( rule__URI__StringSuffixAssignment_1_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:1997:2: rule__URI__StringSuffixAssignment_1_3
            {
            pushFollow(FOLLOW_rule__URI__StringSuffixAssignment_1_3_in_rule__URI__Group_1__3__Impl4045);
            rule__URI__StringSuffixAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getStringSuffixAssignment_1_3()); 

            }


            }

        }
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2015:1: rule__MobgenHeader__Group__0 : rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 ;
    public final void rule__MobgenHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2019:1: ( rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2020:2: rule__MobgenHeader__Group__0__Impl rule__MobgenHeader__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__04083);
            rule__MobgenHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__04086);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2027:1: rule__MobgenHeader__Group__0__Impl : ( ( rule__MobgenHeader__NameAssignment_0 )? ) ;
    public final void rule__MobgenHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2031:1: ( ( ( rule__MobgenHeader__NameAssignment_0 )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2032:1: ( ( rule__MobgenHeader__NameAssignment_0 )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2032:1: ( ( rule__MobgenHeader__NameAssignment_0 )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2033:1: ( rule__MobgenHeader__NameAssignment_0 )?
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2034:1: ( rule__MobgenHeader__NameAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2034:2: rule__MobgenHeader__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl4113);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2044:1: rule__MobgenHeader__Group__1 : rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 ;
    public final void rule__MobgenHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2048:1: ( rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2049:2: rule__MobgenHeader__Group__1__Impl rule__MobgenHeader__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__14144);
            rule__MobgenHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__14147);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2056:1: rule__MobgenHeader__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2060:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2061:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2061:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2062:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__MobgenHeader__Group__1__Impl4175); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2075:1: rule__MobgenHeader__Group__2 : rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 ;
    public final void rule__MobgenHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2079:1: ( rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2080:2: rule__MobgenHeader__Group__2__Impl rule__MobgenHeader__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__24206);
            rule__MobgenHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__24209);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2087:1: rule__MobgenHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__MobgenHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2091:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2092:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2092:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2093:1: '{'
            {
             before(grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MobgenHeader__Group__2__Impl4237); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2106:1: rule__MobgenHeader__Group__3 : rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 ;
    public final void rule__MobgenHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2110:1: ( rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2111:2: rule__MobgenHeader__Group__3__Impl rule__MobgenHeader__Group__4
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__34268);
            rule__MobgenHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__34271);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2118:1: rule__MobgenHeader__Group__3__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) ;
    public final void rule__MobgenHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2122:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2123:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2123:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2124:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2125:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2125:2: rule__MobgenHeader__HeaderKeyValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl4298);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2135:1: rule__MobgenHeader__Group__4 : rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 ;
    public final void rule__MobgenHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2139:1: ( rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2140:2: rule__MobgenHeader__Group__4__Impl rule__MobgenHeader__Group__5
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__44328);
            rule__MobgenHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__44331);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2147:1: rule__MobgenHeader__Group__4__Impl : ( ( rule__MobgenHeader__Group_4__0 )* ) ;
    public final void rule__MobgenHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2151:1: ( ( ( rule__MobgenHeader__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2152:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2152:1: ( ( rule__MobgenHeader__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2153:1: ( rule__MobgenHeader__Group_4__0 )*
            {
             before(grammarAccess.getMobgenHeaderAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2154:1: ( rule__MobgenHeader__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_STRING) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2154:2: rule__MobgenHeader__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl4358);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2164:1: rule__MobgenHeader__Group__5 : rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 ;
    public final void rule__MobgenHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2168:1: ( rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2169:2: rule__MobgenHeader__Group__5__Impl rule__MobgenHeader__Group__6
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__54389);
            rule__MobgenHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__54392);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2176:1: rule__MobgenHeader__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MobgenHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2180:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2181:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2181:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2182:1: ( ',' )?
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2183:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2184:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__MobgenHeader__Group__5__Impl4421); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2195:1: rule__MobgenHeader__Group__6 : rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 ;
    public final void rule__MobgenHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2199:1: ( rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2200:2: rule__MobgenHeader__Group__6__Impl rule__MobgenHeader__Group__7
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__64454);
            rule__MobgenHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__64457);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2207:1: rule__MobgenHeader__Group__6__Impl : ( '}' ) ;
    public final void rule__MobgenHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2211:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2212:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2212:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2213:1: '}'
            {
             before(grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__MobgenHeader__Group__6__Impl4485); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2226:1: rule__MobgenHeader__Group__7 : rule__MobgenHeader__Group__7__Impl ;
    public final void rule__MobgenHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2230:1: ( rule__MobgenHeader__Group__7__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2231:2: rule__MobgenHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__74516);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2237:1: rule__MobgenHeader__Group__7__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2241:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2242:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2242:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2243:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__MobgenHeader__Group__7__Impl4544); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2272:1: rule__MobgenHeader__Group_4__0 : rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 ;
    public final void rule__MobgenHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2276:1: ( rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2277:2: rule__MobgenHeader__Group_4__0__Impl rule__MobgenHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04591);
            rule__MobgenHeader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04594);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2284:1: rule__MobgenHeader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MobgenHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2288:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2289:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2289:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2290:1: ','
            {
             before(grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__MobgenHeader__Group_4__0__Impl4622); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2303:1: rule__MobgenHeader__Group_4__1 : rule__MobgenHeader__Group_4__1__Impl ;
    public final void rule__MobgenHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2307:1: ( rule__MobgenHeader__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2308:2: rule__MobgenHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14653);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2314:1: rule__MobgenHeader__Group_4__1__Impl : ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) ;
    public final void rule__MobgenHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2318:1: ( ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2319:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2319:1: ( ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2320:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2321:1: ( rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2321:2: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4680);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2335:1: rule__MobgenHeaderKeyValuePair__Group__0 : rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2339:1: ( rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2340:2: rule__MobgenHeaderKeyValuePair__Group__0__Impl rule__MobgenHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04714);
            rule__MobgenHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04717);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2347:1: rule__MobgenHeaderKeyValuePair__Group__0__Impl : ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2351:1: ( ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2352:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2352:1: ( ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2353:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2354:1: ( rule__MobgenHeaderKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2354:2: rule__MobgenHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4744);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2364:1: rule__MobgenHeaderKeyValuePair__Group__1 : rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2368:1: ( rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2369:2: rule__MobgenHeaderKeyValuePair__Group__1__Impl rule__MobgenHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14774);
            rule__MobgenHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14777);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2376:1: rule__MobgenHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2380:1: ( ( '=' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2381:1: ( '=' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2381:1: ( '=' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2382:1: '='
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4805); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2395:1: rule__MobgenHeaderKeyValuePair__Group__2 : rule__MobgenHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2399:1: ( rule__MobgenHeaderKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2400:2: rule__MobgenHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24836);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2406:1: rule__MobgenHeaderKeyValuePair__Group__2__Impl : ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__MobgenHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2410:1: ( ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2411:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2411:1: ( ( rule__MobgenHeaderKeyValuePair__Alternatives_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2412:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2413:1: ( rule__MobgenHeaderKeyValuePair__Alternatives_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2413:2: rule__MobgenHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4863);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2429:1: rule__MobgenJson__Group__0 : rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 ;
    public final void rule__MobgenJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2433:1: ( rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2434:2: rule__MobgenJson__Group__0__Impl rule__MobgenJson__Group__1
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04899);
            rule__MobgenJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04902);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2441:1: rule__MobgenJson__Group__0__Impl : ( ( rule__MobgenJson__NameAssignment_0 ) ) ;
    public final void rule__MobgenJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2445:1: ( ( ( rule__MobgenJson__NameAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2446:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2446:1: ( ( rule__MobgenJson__NameAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2447:1: ( rule__MobgenJson__NameAssignment_0 )
            {
             before(grammarAccess.getMobgenJsonAccess().getNameAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2448:1: ( rule__MobgenJson__NameAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2448:2: rule__MobgenJson__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4929);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2458:1: rule__MobgenJson__Group__1 : rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 ;
    public final void rule__MobgenJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2462:1: ( rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2463:2: rule__MobgenJson__Group__1__Impl rule__MobgenJson__Group__2
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14959);
            rule__MobgenJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14962);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2470:1: rule__MobgenJson__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2474:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2475:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2475:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2476:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__MobgenJson__Group__1__Impl4990); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2489:1: rule__MobgenJson__Group__2 : rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 ;
    public final void rule__MobgenJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2493:1: ( rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2494:2: rule__MobgenJson__Group__2__Impl rule__MobgenJson__Group__3
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__25021);
            rule__MobgenJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__25024);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2501:1: rule__MobgenJson__Group__2__Impl : ( ( rule__MobgenJson__ValueAssignment_2 ) ) ;
    public final void rule__MobgenJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2505:1: ( ( ( rule__MobgenJson__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2506:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2506:1: ( ( rule__MobgenJson__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2507:1: ( rule__MobgenJson__ValueAssignment_2 )
            {
             before(grammarAccess.getMobgenJsonAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2508:1: ( rule__MobgenJson__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2508:2: rule__MobgenJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl5051);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2518:1: rule__MobgenJson__Group__3 : rule__MobgenJson__Group__3__Impl ;
    public final void rule__MobgenJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2522:1: ( rule__MobgenJson__Group__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2523:2: rule__MobgenJson__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__35081);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2529:1: rule__MobgenJson__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__MobgenJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2533:1: ( ( '\\'\\'\\'' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2534:1: ( '\\'\\'\\'' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2534:1: ( '\\'\\'\\'' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2535:1: '\\'\\'\\''
            {
             before(grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__MobgenJson__Group__3__Impl5109); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2556:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2560:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2561:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__05148);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__05151);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2568:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2572:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2573:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2573:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2574:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__JsonObject__Group__0__Impl5179); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2587:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2591:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2592:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15210);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15213);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2599:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2603:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2604:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2604:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2605:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2606:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2606:2: rule__JsonObject__KeyValuePairAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl5240);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2616:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2620:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2621:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25270);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25273);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2628:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )* ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2632:1: ( ( ( rule__JsonObject__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2633:1: ( ( rule__JsonObject__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2633:1: ( ( rule__JsonObject__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2634:1: ( rule__JsonObject__Group_2__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2635:1: ( rule__JsonObject__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_STRING) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2635:2: rule__JsonObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5300);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2645:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2649:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2650:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35331);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35334);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2657:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2661:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2662:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2662:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2663:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2664:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2665:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__JsonObject__Group__3__Impl5363); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2676:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2680:1: ( rule__JsonObject__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2681:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45396);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2687:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2691:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2692:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2692:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2693:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__JsonObject__Group__4__Impl5424); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2716:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2720:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2721:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05465);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05468);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2728:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2732:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2733:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2733:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2734:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__JsonObject__Group_2__0__Impl5496); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2747:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2751:1: ( rule__JsonObject__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2752:2: rule__JsonObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15527);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2758:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2762:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2763:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2763:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2764:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2765:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2765:2: rule__JsonObject__KeyValuePairAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5554);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2779:1: rule__JsonKeyValuePair__Group__0 : rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 ;
    public final void rule__JsonKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2783:1: ( rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2784:2: rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05588);
            rule__JsonKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05591);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2791:1: rule__JsonKeyValuePair__Group__0__Impl : ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2795:1: ( ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2796:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2796:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2797:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2798:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2798:2: rule__JsonKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5618);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2808:1: rule__JsonKeyValuePair__Group__1 : rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 ;
    public final void rule__JsonKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2812:1: ( rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2813:2: rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15648);
            rule__JsonKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15651);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2820:1: rule__JsonKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2824:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2825:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2825:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2826:1: ':'
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__JsonKeyValuePair__Group__1__Impl5679); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2839:1: rule__JsonKeyValuePair__Group__2 : rule__JsonKeyValuePair__Group__2__Impl ;
    public final void rule__JsonKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2843:1: ( rule__JsonKeyValuePair__Group__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2844:2: rule__JsonKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25710);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2850:1: rule__JsonKeyValuePair__Group__2__Impl : ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2854:1: ( ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2855:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2855:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2856:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2857:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2857:2: rule__JsonKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5737);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2873:1: rule__JsonArray__Group__0 : rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 ;
    public final void rule__JsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2877:1: ( rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2878:2: rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05773);
            rule__JsonArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05776);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2885:1: rule__JsonArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2889:1: ( ( '[' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2890:1: ( '[' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2890:1: ( '[' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2891:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__JsonArray__Group__0__Impl5804); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2904:1: rule__JsonArray__Group__1 : rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 ;
    public final void rule__JsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2908:1: ( rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2909:2: rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15835);
            rule__JsonArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15838);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2916:1: rule__JsonArray__Group__1__Impl : ( ( rule__JsonArray__ItemsAssignment_1 ) ) ;
    public final void rule__JsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2920:1: ( ( ( rule__JsonArray__ItemsAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2921:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2921:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2922:1: ( rule__JsonArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2923:1: ( rule__JsonArray__ItemsAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2923:2: rule__JsonArray__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5865);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2933:1: rule__JsonArray__Group__2 : rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 ;
    public final void rule__JsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2937:1: ( rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2938:2: rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25895);
            rule__JsonArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25898);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2945:1: rule__JsonArray__Group__2__Impl : ( ( rule__JsonArray__Group_2__0 )* ) ;
    public final void rule__JsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2949:1: ( ( ( rule__JsonArray__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2950:1: ( ( rule__JsonArray__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2950:1: ( ( rule__JsonArray__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2951:1: ( rule__JsonArray__Group_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2952:1: ( rule__JsonArray__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    int LA21_1 = input.LA(2);

                    if ( ((LA21_1>=RULE_STRING && LA21_1<=RULE_JSON_META_SCALAR_TYPE)||LA21_1==20||LA21_1==37) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2952:2: rule__JsonArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5925);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2962:1: rule__JsonArray__Group__3 : rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 ;
    public final void rule__JsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2966:1: ( rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2967:2: rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35956);
            rule__JsonArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35959);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2974:1: rule__JsonArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2978:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2979:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2979:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2980:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2981:1: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2982:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__JsonArray__Group__3__Impl5988); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2993:1: rule__JsonArray__Group__4 : rule__JsonArray__Group__4__Impl ;
    public final void rule__JsonArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2997:1: ( rule__JsonArray__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:2998:2: rule__JsonArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__46021);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3004:1: rule__JsonArray__Group__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3008:1: ( ( ']' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3009:1: ( ']' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3009:1: ( ']' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3010:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__JsonArray__Group__4__Impl6049); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3033:1: rule__JsonArray__Group_2__0 : rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 ;
    public final void rule__JsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3037:1: ( rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3038:2: rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__06090);
            rule__JsonArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__06093);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3045:1: rule__JsonArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3049:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3050:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3050:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3051:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__JsonArray__Group_2__0__Impl6121); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3064:1: rule__JsonArray__Group_2__1 : rule__JsonArray__Group_2__1__Impl ;
    public final void rule__JsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3068:1: ( rule__JsonArray__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3069:2: rule__JsonArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__16152);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3075:1: rule__JsonArray__Group_2__1__Impl : ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__JsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3079:1: ( ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3080:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3080:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3081:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3082:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3082:2: rule__JsonArray__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl6179);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3096:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3100:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3101:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06213);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06216);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3108:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3112:1: ( ( 'enum' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3113:1: ( 'enum' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3113:1: ( 'enum' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3114:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__EnumInstance__Group__0__Impl6244); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3127:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3131:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3132:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16275);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16278);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3139:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3143:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3144:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3144:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3145:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3146:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3146:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6305);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3156:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3160:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3161:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26335);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26338);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3168:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3172:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3173:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3173:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3174:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__EnumInstance__Group__2__Impl6366); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3187:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3191:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3192:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36397);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36400);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3199:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3203:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3204:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3204:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3205:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3206:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3206:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6427);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3216:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3220:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3221:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46457);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46460);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3228:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3232:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3233:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3233:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3234:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3235:1: ( rule__EnumInstance__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_ID) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3235:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6487);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3245:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3249:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3250:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56518);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56521);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3257:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3261:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3262:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3262:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3263:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3264:1: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3265:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__EnumInstance__Group__5__Impl6550); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3276:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3280:1: ( rule__EnumInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3281:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66583);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3287:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3291:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3292:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3292:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3293:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__EnumInstance__Group__6__Impl6611); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3320:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3324:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3325:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06656);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06659);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3332:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3336:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3337:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3337:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3338:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__EnumInstance__Group_4__0__Impl6687); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3351:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3355:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3356:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16718);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3362:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3366:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3367:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3367:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3368:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3369:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3369:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6745);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3383:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3387:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3388:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06779);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06782);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3395:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3399:1: ( ( 'map' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3400:1: ( 'map' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3400:1: ( 'map' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3401:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__MapInstance__Group__0__Impl6810); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3414:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3418:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3419:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16841);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16844);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3426:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__NameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3430:1: ( ( ( rule__MapInstance__NameAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3431:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3431:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3432:1: ( rule__MapInstance__NameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3433:1: ( rule__MapInstance__NameAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3433:2: rule__MapInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6871);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3443:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3447:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3448:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26901);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26904);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3455:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3459:1: ( ( '{' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3460:1: ( '{' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3460:1: ( '{' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3461:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MapInstance__Group__2__Impl6932); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3474:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3478:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3479:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36963);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36966);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3486:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__Group_3__0 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3490:1: ( ( ( rule__MapInstance__Group_3__0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3491:1: ( ( rule__MapInstance__Group_3__0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3491:1: ( ( rule__MapInstance__Group_3__0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3492:1: ( rule__MapInstance__Group_3__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3493:1: ( rule__MapInstance__Group_3__0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3493:2: rule__MapInstance__Group_3__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6993);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3503:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3507:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3508:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__47023);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__47026);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3515:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3519:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3520:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3520:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3521:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3522:1: ( rule__MapInstance__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3522:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl7053);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3532:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3536:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3537:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__57084);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__57087);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3544:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3548:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3549:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3549:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3550:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3551:1: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3552:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__MapInstance__Group__5__Impl7116); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3563:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3567:1: ( rule__MapInstance__Group__6__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3568:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__67149);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3574:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3578:1: ( ( '}' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3579:1: ( '}' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3579:1: ( '}' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3580:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__MapInstance__Group__6__Impl7177); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3607:1: rule__MapInstance__Group_3__0 : rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 ;
    public final void rule__MapInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3611:1: ( rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3612:2: rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07222);
            rule__MapInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07225);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3619:1: rule__MapInstance__Group_3__0__Impl : ( ( rule__MapInstance__KeysAssignment_3_0 ) ) ;
    public final void rule__MapInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3623:1: ( ( ( rule__MapInstance__KeysAssignment_3_0 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3624:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3624:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3625:1: ( rule__MapInstance__KeysAssignment_3_0 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3626:1: ( rule__MapInstance__KeysAssignment_3_0 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3626:2: rule__MapInstance__KeysAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7252);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3636:1: rule__MapInstance__Group_3__1 : rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 ;
    public final void rule__MapInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3640:1: ( rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3641:2: rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17282);
            rule__MapInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17285);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3648:1: rule__MapInstance__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3652:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3653:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3653:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3654:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__MapInstance__Group_3__1__Impl7313); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3667:1: rule__MapInstance__Group_3__2 : rule__MapInstance__Group_3__2__Impl ;
    public final void rule__MapInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3671:1: ( rule__MapInstance__Group_3__2__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3672:2: rule__MapInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27344);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3678:1: rule__MapInstance__Group_3__2__Impl : ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) ;
    public final void rule__MapInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3682:1: ( ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3683:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3683:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3684:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3685:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3685:2: rule__MapInstance__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7371);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3701:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3705:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3706:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07407);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07410);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3713:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3717:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3718:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3718:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3719:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__MapInstance__Group_4__0__Impl7438); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3732:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3736:1: ( rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3737:2: rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17469);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17472);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3744:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__KeysAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3748:1: ( ( ( rule__MapInstance__KeysAssignment_4_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3749:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3749:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3750:1: ( rule__MapInstance__KeysAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3751:1: ( rule__MapInstance__KeysAssignment_4_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3751:2: rule__MapInstance__KeysAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7499);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3761:1: rule__MapInstance__Group_4__2 : rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 ;
    public final void rule__MapInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3765:1: ( rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3766:2: rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27529);
            rule__MapInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27532);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3773:1: rule__MapInstance__Group_4__2__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3777:1: ( ( ':' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3778:1: ( ':' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3778:1: ( ':' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3779:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 
            match(input,24,FOLLOW_24_in_rule__MapInstance__Group_4__2__Impl7560); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3792:1: rule__MapInstance__Group_4__3 : rule__MapInstance__Group_4__3__Impl ;
    public final void rule__MapInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3796:1: ( rule__MapInstance__Group_4__3__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3797:2: rule__MapInstance__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37591);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3803:1: rule__MapInstance__Group_4__3__Impl : ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) ;
    public final void rule__MapInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3807:1: ( ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3808:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3808:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3809:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3810:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3810:2: rule__MapInstance__ValuesAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7618);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3828:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3832:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3833:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07656);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07659);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3840:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3844:1: ( ( '[' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3845:1: ( '[' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3845:1: ( '[' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3846:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__StringList__Group__0__Impl7687); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3859:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3863:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3864:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17718);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17721);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3871:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3875:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3876:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3876:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3877:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3878:1: ( rule__StringList__ValuesAssignment_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3878:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7748);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3888:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3892:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3893:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27778);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27781);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3900:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3904:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3905:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3905:1: ( ( rule__StringList__Group_2__0 )* )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3906:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3907:1: ( rule__StringList__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_STRING) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3907:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7808);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3917:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3921:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3922:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37839);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37842);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3929:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3933:1: ( ( ( ',' )? ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3934:1: ( ( ',' )? )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3934:1: ( ( ',' )? )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3935:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3936:1: ( ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3937:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__StringList__Group__3__Impl7871); 

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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3948:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3952:1: ( rule__StringList__Group__4__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3953:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47904);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3959:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3963:1: ( ( ']' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3964:1: ( ']' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3964:1: ( ']' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3965:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__StringList__Group__4__Impl7932); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3988:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3992:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:3993:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07973);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07976);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4000:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4004:1: ( ( ',' ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4005:1: ( ',' )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4005:1: ( ',' )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4006:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__StringList__Group_2__0__Impl8004); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4019:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4023:1: ( rule__StringList__Group_2__1__Impl )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4024:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18035);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4030:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4034:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4035:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4035:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4036:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4037:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4037:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8062);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4052:1: rule__Mobgen__PlatformAssignment_0 : ( rulePlatform ) ;
    public final void rule__Mobgen__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4056:1: ( ( rulePlatform ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4057:1: ( rulePlatform )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4057:1: ( rulePlatform )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4058:1: rulePlatform
            {
             before(grammarAccess.getMobgenAccess().getPlatformPlatformParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePlatform_in_rule__Mobgen__PlatformAssignment_08101);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4067:1: rule__Mobgen__ResourcesAssignment_1_0 : ( ruleMobgenResourceDefinition ) ;
    public final void rule__Mobgen__ResourcesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4071:1: ( ( ruleMobgenResourceDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4072:1: ( ruleMobgenResourceDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4072:1: ( ruleMobgenResourceDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4073:1: ruleMobgenResourceDefinition
            {
             before(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_1_08132);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4082:1: rule__Mobgen__CallsAssignment_1_1 : ( ruleMobgenCallDefinition ) ;
    public final void rule__Mobgen__CallsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4086:1: ( ( ruleMobgenCallDefinition ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4087:1: ( ruleMobgenCallDefinition )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4087:1: ( ruleMobgenCallDefinition )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4088:1: ruleMobgenCallDefinition
            {
             before(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_1_18163);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4097:1: rule__Platform__PlatformsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Platform__PlatformsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4101:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4102:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4102:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4103:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_08194); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4112:1: rule__Platform__GenerateWhereAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Platform__GenerateWhereAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4116:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4117:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4117:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4118:1: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getGenerateWhereSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_28225); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4127:1: rule__MobgenCallDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobgenCallDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4131:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4132:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4132:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4133:1: RULE_ID
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_18256); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4142:1: rule__MobgenCallDefinition__MethodAssignment_3 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__MobgenCallDefinition__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4146:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4147:1: ( RULE_RESTFUL_METHODS )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4147:1: ( RULE_RESTFUL_METHODS )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4148:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__MobgenCallDefinition__MethodAssignment_38287); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4157:1: rule__MobgenCallDefinition__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__MobgenCallDefinition__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4161:1: ( ( ruleURI ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4162:1: ( ruleURI )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4162:1: ( ruleURI )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4163:1: ruleURI
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_58318);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4172:1: rule__MobgenCallDefinition__RequestHeadersAssignment_6_4 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4176:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4177:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4177:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4178:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_48349);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4187:1: rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2 : ( ruleMobgenHeader ) ;
    public final void rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4191:1: ( ( ruleMobgenHeader ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4192:1: ( ruleMobgenHeader )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4192:1: ( ruleMobgenHeader )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4193:1: ruleMobgenHeader
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28380);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4202:1: rule__MobgenCallDefinition__JsonToClientAssignment_7_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4206:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4207:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4207:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4208:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28411);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4217:1: rule__MobgenCallDefinition__JsonToServerAssignment_8_2 : ( ruleMobgenJson ) ;
    public final void rule__MobgenCallDefinition__JsonToServerAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4221:1: ( ( ruleMobgenJson ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4222:1: ( ruleMobgenJson )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4222:1: ( ruleMobgenJson )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4223:1: ruleMobgenJson
            {
             before(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_28442);
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


    // $ANTLR start "rule__URI__StringPrefixAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4232:1: rule__URI__StringPrefixAssignment_0 : ( RULE_ANY_OTHER ) ;
    public final void rule__URI__StringPrefixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4236:1: ( ( RULE_ANY_OTHER ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4237:1: ( RULE_ANY_OTHER )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4237:1: ( RULE_ANY_OTHER )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4238:1: RULE_ANY_OTHER
            {
             before(grammarAccess.getURIAccess().getStringPrefixANY_OTHERTerminalRuleCall_0_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__StringPrefixAssignment_08473); 
             after(grammarAccess.getURIAccess().getStringPrefixANY_OTHERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__StringPrefixAssignment_0"


    // $ANTLR start "rule__URI__ParametersAssignment_1_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4247:1: rule__URI__ParametersAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__URI__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4251:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4252:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4252:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4253:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getParametersIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__ParametersAssignment_1_18504); 
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


    // $ANTLR start "rule__URI__StringSuffixAssignment_1_3"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4262:1: rule__URI__StringSuffixAssignment_1_3 : ( RULE_ANY_OTHER ) ;
    public final void rule__URI__StringSuffixAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4266:1: ( ( RULE_ANY_OTHER ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4267:1: ( RULE_ANY_OTHER )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4267:1: ( RULE_ANY_OTHER )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4268:1: RULE_ANY_OTHER
            {
             before(grammarAccess.getURIAccess().getStringSuffixANY_OTHERTerminalRuleCall_1_3_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__StringSuffixAssignment_1_38535); 
             after(grammarAccess.getURIAccess().getStringSuffixANY_OTHERTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__StringSuffixAssignment_1_3"


    // $ANTLR start "rule__MobgenHeader__NameAssignment_0"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4277:1: rule__MobgenHeader__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenHeader__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4281:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4282:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4282:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4283:1: RULE_ID
            {
             before(grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08566); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4292:1: rule__MobgenHeader__HeaderKeyValuesAssignment_3 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4296:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4297:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4297:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4298:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38597);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4307:1: rule__MobgenHeader__HeaderKeyValuesAssignment_4_1 : ( ruleMobgenHeaderKeyValuePair ) ;
    public final void rule__MobgenHeader__HeaderKeyValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4311:1: ( ( ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4312:1: ( ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4312:1: ( ruleMobgenHeaderKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4313:1: ruleMobgenHeaderKeyValuePair
            {
             before(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18628);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4322:1: rule__MobgenHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4326:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4327:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4327:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4328:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08659); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4337:1: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4341:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4342:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4342:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4343:1: RULE_STRING
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08690); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4352:1: rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1 : ( RULE_MOBGEN_HEADER_PARAMETER ) ;
    public final void rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4356:1: ( ( RULE_MOBGEN_HEADER_PARAMETER ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4357:1: ( RULE_MOBGEN_HEADER_PARAMETER )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4357:1: ( RULE_MOBGEN_HEADER_PARAMETER )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4358:1: RULE_MOBGEN_HEADER_PARAMETER
            {
             before(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueMOBGEN_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
            match(input,RULE_MOBGEN_HEADER_PARAMETER,FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_18721); 
             after(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueMOBGEN_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4367:1: rule__MobgenJson__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MobgenJson__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4371:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4372:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4372:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4373:1: RULE_ID
            {
             before(grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08752); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4382:1: rule__MobgenJson__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__MobgenJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4386:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4387:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4387:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4388:1: ruleJsonObjectValue
            {
             before(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_28783);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4397:1: rule__JsonObjectValue__ValueAssignment_0 : ( ruleJsonLiteralValue ) ;
    public final void rule__JsonObjectValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4401:1: ( ( ruleJsonLiteralValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4402:1: ( ruleJsonLiteralValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4402:1: ( ruleJsonLiteralValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4403:1: ruleJsonLiteralValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ValueAssignment_08814);
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


    // $ANTLR start "rule__JsonObjectValue__CompositeAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4412:1: rule__JsonObjectValue__CompositeAssignment_1 : ( ruleJsonCompositeValue ) ;
    public final void rule__JsonObjectValue__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4416:1: ( ( ruleJsonCompositeValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4417:1: ( ruleJsonCompositeValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4417:1: ( ruleJsonCompositeValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4418:1: ruleJsonCompositeValue
            {
             before(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_18845);
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


    // $ANTLR start "rule__JsonObject__KeyValuePairAssignment_1"
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4427:1: rule__JsonObject__KeyValuePairAssignment_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4431:1: ( ( ruleJsonKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4432:1: ( ruleJsonKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4432:1: ( ruleJsonKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4433:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_18876);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4442:1: rule__JsonObject__KeyValuePairAssignment_2_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4446:1: ( ( ruleJsonKeyValuePair ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4447:1: ( ruleJsonKeyValuePair )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4447:1: ( ruleJsonKeyValuePair )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4448:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_18907);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4457:1: rule__JsonKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4461:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4462:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4462:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4463:1: RULE_STRING
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08938); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4472:1: rule__JsonKeyValuePair__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4476:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4477:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4477:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4478:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28969);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4487:1: rule__JsonArray__ItemsAssignment_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4491:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4492:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4492:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4493:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_19000);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4502:1: rule__JsonArray__ItemsAssignment_2_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4506:1: ( ( ruleJsonObjectValue ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4507:1: ( ruleJsonObjectValue )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4507:1: ( ruleJsonObjectValue )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4508:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_19031);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4517:1: rule__MobgenResourceDefinition__ResourcesAssignment_0 : ( ruleMapInstance ) ;
    public final void rule__MobgenResourceDefinition__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4521:1: ( ( ruleMapInstance ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4522:1: ( ruleMapInstance )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4522:1: ( ruleMapInstance )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4523:1: ruleMapInstance
            {
             before(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__ResourcesAssignment_09062);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4532:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4536:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4537:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4537:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4538:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_19093); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4547:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4551:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4552:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4552:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4553:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_39124); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4562:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4566:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4567:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4567:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4568:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_19155); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4577:1: rule__MapInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4581:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4582:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4582:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4583:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_19186); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4592:1: rule__MapInstance__KeysAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4596:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4597:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4597:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4598:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_09217); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4607:1: rule__MapInstance__ValuesAssignment_3_2 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4611:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4612:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4612:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4613:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_29248);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4622:1: rule__MapInstance__KeysAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4626:1: ( ( RULE_ID ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4627:1: ( RULE_ID )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4627:1: ( RULE_ID )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4628:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_19279); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4637:1: rule__MapInstance__ValuesAssignment_4_3 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4641:1: ( ( ruleNestedType ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4642:1: ( ruleNestedType )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4642:1: ( ruleNestedType )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4643:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39310);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4652:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4656:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4657:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4657:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4658:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19341); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4667:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4671:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4672:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4672:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4673:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19372); 
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4682:1: rule__NestedType__ListAssignment_0 : ( ruleStringList ) ;
    public final void rule__NestedType__ListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4686:1: ( ( ruleStringList ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4687:1: ( ruleStringList )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4687:1: ( ruleStringList )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4688:1: ruleStringList
            {
             before(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_09403);
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
    // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4697:1: rule__NestedType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NestedType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4701:1: ( ( RULE_STRING ) )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4702:1: ( RULE_STRING )
            {
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4702:1: ( RULE_STRING )
            // ../mobgen.ui/src-gen/nl/sison/dsl/ui/contentassist/antlr/internal/InternalMobgen.g:4703:1: RULE_STRING
            {
             before(grammarAccess.getNestedTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_19434); 
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
    public static final BitSet FOLLOW_rule__JsonObjectValue__CompositeAssignment_1_in_rule__JsonObjectValue__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__JsonCompositeValue__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeValue__Alternatives1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonLiteralValue__Alternatives1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonLiteralValue__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonLiteralValue__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonLiteralValue__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonLiteralValue__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_rule__JsonLiteralValue__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_rule__JsonLiteralValue__Alternatives1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenResourceDefinition__ResourcesAssignment_0_in_rule__MobgenResourceDefinition__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__MobgenResourceDefinition__Alternatives1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__ListAssignment_0_in_rule__NestedType__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__StringAssignment_1_in_rule__NestedType__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__0__Impl_in_rule__Mobgen__Group__01585 = new BitSet(new long[]{0x0000018000800000L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__1_in_rule__Mobgen__Group__01588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__PlatformAssignment_0_in_rule__Mobgen__Group__0__Impl1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Group__1__Impl_in_rule__Mobgen__Group__11645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1674 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rule__Mobgen__Alternatives_1_in_rule__Mobgen__Group__1__Impl1686 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01723 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Platform__Group__0__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11785 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Platform__Group__1__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21847 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1879 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1891 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Platform__Group__3__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01991 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__12051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Platform__Group_2__1__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__0__Impl_in_rule__MobgenCallDefinition__Group__02176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1_in_rule__MobgenCallDefinition__Group__02179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MobgenCallDefinition__Group__0__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__1__Impl_in_rule__MobgenCallDefinition__Group__12238 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2_in_rule__MobgenCallDefinition__Group__12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__NameAssignment_1_in_rule__MobgenCallDefinition__Group__1__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__2__Impl_in_rule__MobgenCallDefinition__Group__22298 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3_in_rule__MobgenCallDefinition__Group__22301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MobgenCallDefinition__Group__2__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__3__Impl_in_rule__MobgenCallDefinition__Group__32360 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4_in_rule__MobgenCallDefinition__Group__32363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__MethodAssignment_3_in_rule__MobgenCallDefinition__Group__3__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__4__Impl_in_rule__MobgenCallDefinition__Group__42420 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5_in_rule__MobgenCallDefinition__Group__42423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MobgenCallDefinition__Group__4__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__5__Impl_in_rule__MobgenCallDefinition__Group__52482 = new BitSet(new long[]{0x0000000284000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6_in_rule__MobgenCallDefinition__Group__52485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__UriAssignment_5_in_rule__MobgenCallDefinition__Group__5__Impl2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__6__Impl_in_rule__MobgenCallDefinition__Group__62542 = new BitSet(new long[]{0x0000000284000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7_in_rule__MobgenCallDefinition__Group__62545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0_in_rule__MobgenCallDefinition__Group__6__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__7__Impl_in_rule__MobgenCallDefinition__Group__72603 = new BitSet(new long[]{0x0000000284000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8_in_rule__MobgenCallDefinition__Group__72606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0_in_rule__MobgenCallDefinition__Group__7__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group__8__Impl_in_rule__MobgenCallDefinition__Group__82664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0_in_rule__MobgenCallDefinition__Group__8__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__0__Impl_in_rule__MobgenCallDefinition__Group_6__02740 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1_in_rule__MobgenCallDefinition__Group_6__02743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MobgenCallDefinition__Group_6__0__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__1__Impl_in_rule__MobgenCallDefinition__Group_6__12802 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2_in_rule__MobgenCallDefinition__Group_6__12805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MobgenCallDefinition__Group_6__1__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__2__Impl_in_rule__MobgenCallDefinition__Group_6__22864 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3_in_rule__MobgenCallDefinition__Group_6__22867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MobgenCallDefinition__Group_6__2__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__3__Impl_in_rule__MobgenCallDefinition__Group_6__32926 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4_in_rule__MobgenCallDefinition__Group_6__32929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MobgenCallDefinition__Group_6__3__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__4__Impl_in_rule__MobgenCallDefinition__Group_6__42988 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5_in_rule__MobgenCallDefinition__Group_6__42991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__RequestHeadersAssignment_6_4_in_rule__MobgenCallDefinition__Group_6__4__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6__5__Impl_in_rule__MobgenCallDefinition__Group_6__53048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0_in_rule__MobgenCallDefinition__Group_6__5__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__0__Impl_in_rule__MobgenCallDefinition__Group_6_5__03118 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1_in_rule__MobgenCallDefinition__Group_6_5__03121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MobgenCallDefinition__Group_6_5__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__1__Impl_in_rule__MobgenCallDefinition__Group_6_5__13180 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2_in_rule__MobgenCallDefinition__Group_6_5__13183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MobgenCallDefinition__Group_6_5__1__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_6_5__2__Impl_in_rule__MobgenCallDefinition__Group_6_5__23242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__MobgenCallDefinition__Group_6_5__2__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__0__Impl_in_rule__MobgenCallDefinition__Group_7__03305 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1_in_rule__MobgenCallDefinition__Group_7__03308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MobgenCallDefinition__Group_7__0__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__1__Impl_in_rule__MobgenCallDefinition__Group_7__13367 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2_in_rule__MobgenCallDefinition__Group_7__13370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenCallDefinition__Group_7__1__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_7__2__Impl_in_rule__MobgenCallDefinition__Group_7__23429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToClientAssignment_7_2_in_rule__MobgenCallDefinition__Group_7__2__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__0__Impl_in_rule__MobgenCallDefinition__Group_8__03492 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1_in_rule__MobgenCallDefinition__Group_8__03495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MobgenCallDefinition__Group_8__0__Impl3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__1__Impl_in_rule__MobgenCallDefinition__Group_8__13554 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2_in_rule__MobgenCallDefinition__Group_8__13557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MobgenCallDefinition__Group_8__1__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__Group_8__2__Impl_in_rule__MobgenCallDefinition__Group_8__23616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenCallDefinition__JsonToServerAssignment_8_2_in_rule__MobgenCallDefinition__Group_8__2__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03679 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__StringPrefixAssignment_0_in_rule__URI__Group__0__Impl3711 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__URI__StringPrefixAssignment_0_in_rule__URI__Group__0__Impl3723 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3785 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3797 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03834 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__URI__Group_1__0__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13896 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__ParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23956 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__URI__Group_1__2__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__34018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__StringSuffixAssignment_1_3_in_rule__URI__Group_1__3__Impl4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__0__Impl_in_rule__MobgenHeader__Group__04083 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1_in_rule__MobgenHeader__Group__04086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__NameAssignment_0_in_rule__MobgenHeader__Group__0__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__1__Impl_in_rule__MobgenHeader__Group__14144 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2_in_rule__MobgenHeader__Group__14147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenHeader__Group__1__Impl4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__2__Impl_in_rule__MobgenHeader__Group__24206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3_in_rule__MobgenHeader__Group__24209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MobgenHeader__Group__2__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__3__Impl_in_rule__MobgenHeader__Group__34268 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4_in_rule__MobgenHeader__Group__34271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_3_in_rule__MobgenHeader__Group__3__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__4__Impl_in_rule__MobgenHeader__Group__44328 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5_in_rule__MobgenHeader__Group__44331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0_in_rule__MobgenHeader__Group__4__Impl4358 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__5__Impl_in_rule__MobgenHeader__Group__54389 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6_in_rule__MobgenHeader__Group__54392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MobgenHeader__Group__5__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__6__Impl_in_rule__MobgenHeader__Group__64454 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7_in_rule__MobgenHeader__Group__64457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MobgenHeader__Group__6__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group__7__Impl_in_rule__MobgenHeader__Group__74516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenHeader__Group__7__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__0__Impl_in_rule__MobgenHeader__Group_4__04591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1_in_rule__MobgenHeader__Group_4__04594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MobgenHeader__Group_4__0__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__Group_4__1__Impl_in_rule__MobgenHeader__Group_4__14653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeader__HeaderKeyValuesAssignment_4_1_in_rule__MobgenHeader__Group_4__1__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__0__Impl_in_rule__MobgenHeaderKeyValuePair__Group__04714 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1_in_rule__MobgenHeaderKeyValuePair__Group__04717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__KeyAssignment_0_in_rule__MobgenHeaderKeyValuePair__Group__0__Impl4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__1__Impl_in_rule__MobgenHeaderKeyValuePair__Group__14774 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2_in_rule__MobgenHeaderKeyValuePair__Group__14777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MobgenHeaderKeyValuePair__Group__1__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Group__2__Impl_in_rule__MobgenHeaderKeyValuePair__Group__24836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenHeaderKeyValuePair__Alternatives_2_in_rule__MobgenHeaderKeyValuePair__Group__2__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__0__Impl_in_rule__MobgenJson__Group__04899 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1_in_rule__MobgenJson__Group__04902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__NameAssignment_0_in_rule__MobgenJson__Group__0__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__1__Impl_in_rule__MobgenJson__Group__14959 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2_in_rule__MobgenJson__Group__14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenJson__Group__1__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__2__Impl_in_rule__MobgenJson__Group__25021 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3_in_rule__MobgenJson__Group__25024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__ValueAssignment_2_in_rule__MobgenJson__Group__2__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MobgenJson__Group__3__Impl_in_rule__MobgenJson__Group__35081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MobgenJson__Group__3__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__05148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__05151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JsonObject__Group__0__Impl5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15210 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25270 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5300 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35331 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonObject__Group__3__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JsonObject__Group__4__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonObject__Group_2__0__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05588 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15648 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonKeyValuePair__Group__1__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05773 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__JsonArray__Group__0__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15835 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25895 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5925 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35956 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group__3__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__46021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__JsonArray__Group__4__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__06090 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__06093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group_2__0__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__16152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06213 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumInstance__Group__0__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16275 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26335 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumInstance__Group__2__Impl6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36397 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46457 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6487 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56518 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumInstance__Group__5__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumInstance__Group__6__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06656 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumInstance__Group_4__0__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06779 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MapInstance__Group__0__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16841 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26901 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MapInstance__Group__2__Impl6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36963 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__47023 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__47026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl7053 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__57084 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__57087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MapInstance__Group__5__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__67149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapInstance__Group__6__Impl7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07222 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17282 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapInstance__Group_3__1__Impl7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07407 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MapInstance__Group_4__0__Impl7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27529 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapInstance__Group_4__2__Impl7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__StringList__Group__0__Impl7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17718 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27778 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7808 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37839 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringList__Group__3__Impl7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StringList__Group__4__Impl7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringList__Group_2__0__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__Mobgen__PlatformAssignment_08101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_rule__Mobgen__ResourcesAssignment_1_08132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_rule__Mobgen__CallsAssignment_1_18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_08194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_28225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenCallDefinition__NameAssignment_18256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__MobgenCallDefinition__MethodAssignment_38287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__MobgenCallDefinition__UriAssignment_58318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__RequestHeadersAssignment_6_48349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_28380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToClientAssignment_7_28411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_rule__MobgenCallDefinition__JsonToServerAssignment_8_28442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__StringPrefixAssignment_08473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__ParametersAssignment_1_18504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__StringSuffixAssignment_1_38535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenHeader__NameAssignment_08566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_38597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_rule__MobgenHeader__HeaderKeyValuesAssignment_4_18628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__KeyAssignment_08659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_08690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_rule__MobgenHeaderKeyValuePair__ValueAssignment_2_18721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MobgenJson__NameAssignment_08752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__MobgenJson__ValueAssignment_28783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_rule__JsonObjectValue__ValueAssignment_08814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_rule__JsonObjectValue__CompositeAssignment_18845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_18876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_18907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_19000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_19031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__MobgenResourceDefinition__ResourcesAssignment_09062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_19093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_39124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_19155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_19186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_09217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_29248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_19279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__NestedType__ListAssignment_09403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NestedType__StringAssignment_19434 = new BitSet(new long[]{0x0000000000000002L});

}