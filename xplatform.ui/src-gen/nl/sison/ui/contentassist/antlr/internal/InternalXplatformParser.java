package nl.sison.ui.contentassist.antlr.internal; 

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
import nl.sison.services.XplatformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXplatformParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_JSON_META_SCALAR_TYPE", "RULE_JSON_NUMBER", "RULE_STRING", "RULE_ANY_OTHER", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'platform'", "'{'", "'}'", "'->'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'enum'", "'map'"
    };
    public static final int RULE_ID=12;
    public static final int T__40=40;
    public static final int RULE_JSON_META_SCALAR_TYPE=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_XPLATFORM_HEADER_PARAMETER=14;
    public static final int RULE_EMPTY_JSON_ARRAY=5;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=6;
    public static final int RULE_EMPTY_JSON_OBJECT=4;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=10;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_JSON_NUMBER=9;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=15;
    public static final int RULE_RESTFUL_METHODS=13;
    public static final int RULE_WS=18;

    // delegates
    // delegators


        public InternalXplatformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXplatformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXplatformParser.tokenNames; }
    public String getGrammarFileName() { return "../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g"; }


     
     	private XplatformGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XplatformGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleXplatform"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:60:1: entryRuleXplatform : ruleXplatform EOF ;
    public final void entryRuleXplatform() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:61:1: ( ruleXplatform EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:62:1: ruleXplatform EOF
            {
             before(grammarAccess.getXplatformRule()); 
            pushFollow(FOLLOW_ruleXplatform_in_entryRuleXplatform61);
            ruleXplatform();

            state._fsp--;

             after(grammarAccess.getXplatformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatform68); 

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
    // $ANTLR end "entryRuleXplatform"


    // $ANTLR start "ruleXplatform"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:69:1: ruleXplatform : ( ( rule__Xplatform__Group__0 ) ) ;
    public final void ruleXplatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:73:2: ( ( ( rule__Xplatform__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:74:1: ( ( rule__Xplatform__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:74:1: ( ( rule__Xplatform__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:75:1: ( rule__Xplatform__Group__0 )
            {
             before(grammarAccess.getXplatformAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:76:1: ( rule__Xplatform__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:76:2: rule__Xplatform__Group__0
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__0_in_ruleXplatform94);
            rule__Xplatform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXplatform"


    // $ANTLR start "entryRulePlatform"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:88:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:89:1: ( rulePlatform EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:90:1: rulePlatform EOF
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:97:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:101:2: ( ( ( rule__Platform__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:102:1: ( ( rule__Platform__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:102:1: ( ( rule__Platform__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:103:1: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:104:1: ( rule__Platform__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:104:2: rule__Platform__Group__0
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


    // $ANTLR start "entryRuleXplatformCallDefinition"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:116:1: entryRuleXplatformCallDefinition : ruleXplatformCallDefinition EOF ;
    public final void entryRuleXplatformCallDefinition() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:117:1: ( ruleXplatformCallDefinition EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:118:1: ruleXplatformCallDefinition EOF
            {
             before(grammarAccess.getXplatformCallDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformCallDefinition_in_entryRuleXplatformCallDefinition181);
            ruleXplatformCallDefinition();

            state._fsp--;

             after(grammarAccess.getXplatformCallDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformCallDefinition188); 

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
    // $ANTLR end "entryRuleXplatformCallDefinition"


    // $ANTLR start "ruleXplatformCallDefinition"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:125:1: ruleXplatformCallDefinition : ( ( rule__XplatformCallDefinition__Group__0 ) ) ;
    public final void ruleXplatformCallDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:129:2: ( ( ( rule__XplatformCallDefinition__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:130:1: ( ( rule__XplatformCallDefinition__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:130:1: ( ( rule__XplatformCallDefinition__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:131:1: ( rule__XplatformCallDefinition__Group__0 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:132:1: ( rule__XplatformCallDefinition__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:132:2: rule__XplatformCallDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__0_in_ruleXplatformCallDefinition214);
            rule__XplatformCallDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXplatformCallDefinition"


    // $ANTLR start "entryRuleURI"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:144:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:145:1: ( ruleURI EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:146:1: ruleURI EOF
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:153:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:157:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:158:1: ( ( rule__URI__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:158:1: ( ( rule__URI__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:159:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:160:1: ( rule__URI__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:160:2: rule__URI__Group__0
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


    // $ANTLR start "entryRuleXplatformHeader"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:172:1: entryRuleXplatformHeader : ruleXplatformHeader EOF ;
    public final void entryRuleXplatformHeader() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:173:1: ( ruleXplatformHeader EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:174:1: ruleXplatformHeader EOF
            {
             before(grammarAccess.getXplatformHeaderRule()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader301);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeader308); 

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
    // $ANTLR end "entryRuleXplatformHeader"


    // $ANTLR start "ruleXplatformHeader"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:181:1: ruleXplatformHeader : ( ( rule__XplatformHeader__Group__0 ) ) ;
    public final void ruleXplatformHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:185:2: ( ( ( rule__XplatformHeader__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:186:1: ( ( rule__XplatformHeader__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:186:1: ( ( rule__XplatformHeader__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:187:1: ( rule__XplatformHeader__Group__0 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:188:1: ( rule__XplatformHeader__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:188:2: rule__XplatformHeader__Group__0
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__0_in_ruleXplatformHeader334);
            rule__XplatformHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXplatformHeader"


    // $ANTLR start "entryRuleXplatformHeaderKeyValuePair"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:200:1: entryRuleXplatformHeaderKeyValuePair : ruleXplatformHeaderKeyValuePair EOF ;
    public final void entryRuleXplatformHeaderKeyValuePair() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:201:1: ( ruleXplatformHeaderKeyValuePair EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:202:1: ruleXplatformHeaderKeyValuePair EOF
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair361);
            ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair368); 

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
    // $ANTLR end "entryRuleXplatformHeaderKeyValuePair"


    // $ANTLR start "ruleXplatformHeaderKeyValuePair"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:209:1: ruleXplatformHeaderKeyValuePair : ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) ) ;
    public final void ruleXplatformHeaderKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:213:2: ( ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:214:1: ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:214:1: ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:215:1: ( rule__XplatformHeaderKeyValuePair__Group__0 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:216:1: ( rule__XplatformHeaderKeyValuePair__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:216:2: rule__XplatformHeaderKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0_in_ruleXplatformHeaderKeyValuePair394);
            rule__XplatformHeaderKeyValuePair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXplatformHeaderKeyValuePair"


    // $ANTLR start "entryRuleXplatformJson"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:228:1: entryRuleXplatformJson : ruleXplatformJson EOF ;
    public final void entryRuleXplatformJson() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:229:1: ( ruleXplatformJson EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:230:1: ruleXplatformJson EOF
            {
             before(grammarAccess.getXplatformJsonRule()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson421);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformJsonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformJson428); 

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
    // $ANTLR end "entryRuleXplatformJson"


    // $ANTLR start "ruleXplatformJson"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:237:1: ruleXplatformJson : ( ( rule__XplatformJson__Group__0 ) ) ;
    public final void ruleXplatformJson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:241:2: ( ( ( rule__XplatformJson__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:242:1: ( ( rule__XplatformJson__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:242:1: ( ( rule__XplatformJson__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:243:1: ( rule__XplatformJson__Group__0 )
            {
             before(grammarAccess.getXplatformJsonAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:244:1: ( rule__XplatformJson__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:244:2: rule__XplatformJson__Group__0
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group__0_in_ruleXplatformJson454);
            rule__XplatformJson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXplatformJson"


    // $ANTLR start "entryRuleJsonObjectValue"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:256:1: entryRuleJsonObjectValue : ruleJsonObjectValue EOF ;
    public final void entryRuleJsonObjectValue() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:257:1: ( ruleJsonObjectValue EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:258:1: ruleJsonObjectValue EOF
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:265:1: ruleJsonObjectValue : ( ( rule__JsonObjectValue__Alternatives ) ) ;
    public final void ruleJsonObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:269:2: ( ( ( rule__JsonObjectValue__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:270:1: ( ( rule__JsonObjectValue__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:270:1: ( ( rule__JsonObjectValue__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:271:1: ( rule__JsonObjectValue__Alternatives )
            {
             before(grammarAccess.getJsonObjectValueAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:272:1: ( rule__JsonObjectValue__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:272:2: rule__JsonObjectValue__Alternatives
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


    // $ANTLR start "entryRuleJsonObject"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:284:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:285:1: ( ruleJsonObject EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:286:1: ruleJsonObject EOF
            {
             before(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject541);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject548); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:293:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:297:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:298:1: ( ( rule__JsonObject__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:298:1: ( ( rule__JsonObject__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:299:1: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:300:1: ( rule__JsonObject__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:300:2: rule__JsonObject__Group__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject574);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:312:1: entryRuleJsonKeyValuePair : ruleJsonKeyValuePair EOF ;
    public final void entryRuleJsonKeyValuePair() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:313:1: ( ruleJsonKeyValuePair EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:314:1: ruleJsonKeyValuePair EOF
            {
             before(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair601);
            ruleJsonKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair608); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:321:1: ruleJsonKeyValuePair : ( ( rule__JsonKeyValuePair__Group__0 ) ) ;
    public final void ruleJsonKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:325:2: ( ( ( rule__JsonKeyValuePair__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:326:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:326:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:327:1: ( rule__JsonKeyValuePair__Group__0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:328:1: ( rule__JsonKeyValuePair__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:328:2: rule__JsonKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair634);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:340:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:341:1: ( ruleJsonArray EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:342:1: ruleJsonArray EOF
            {
             before(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray661);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray668); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:349:1: ruleJsonArray : ( ( rule__JsonArray__Group__0 ) ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:353:2: ( ( ( rule__JsonArray__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:354:1: ( ( rule__JsonArray__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:354:1: ( ( rule__JsonArray__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:355:1: ( rule__JsonArray__Group__0 )
            {
             before(grammarAccess.getJsonArrayAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:356:1: ( rule__JsonArray__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:356:2: rule__JsonArray__Group__0
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0_in_ruleJsonArray694);
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


    // $ANTLR start "entryRuleXplatformResourceDefinition"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:368:1: entryRuleXplatformResourceDefinition : ruleXplatformResourceDefinition EOF ;
    public final void entryRuleXplatformResourceDefinition() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:369:1: ( ruleXplatformResourceDefinition EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:370:1: ruleXplatformResourceDefinition EOF
            {
             before(grammarAccess.getXplatformResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition721);
            ruleXplatformResourceDefinition();

            state._fsp--;

             after(grammarAccess.getXplatformResourceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformResourceDefinition728); 

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
    // $ANTLR end "entryRuleXplatformResourceDefinition"


    // $ANTLR start "ruleXplatformResourceDefinition"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:377:1: ruleXplatformResourceDefinition : ( ( rule__XplatformResourceDefinition__Alternatives ) ) ;
    public final void ruleXplatformResourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:381:2: ( ( ( rule__XplatformResourceDefinition__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:382:1: ( ( rule__XplatformResourceDefinition__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:382:1: ( ( rule__XplatformResourceDefinition__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:383:1: ( rule__XplatformResourceDefinition__Alternatives )
            {
             before(grammarAccess.getXplatformResourceDefinitionAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:384:1: ( rule__XplatformResourceDefinition__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:384:2: rule__XplatformResourceDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__XplatformResourceDefinition__Alternatives_in_ruleXplatformResourceDefinition754);
            rule__XplatformResourceDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXplatformResourceDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXplatformResourceDefinition"


    // $ANTLR start "entryRuleEnumInstance"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:396:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:397:1: ( ruleEnumInstance EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:398:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance781);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance788); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:405:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:409:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:411:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:1: ( rule__EnumInstance__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance814);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:424:1: entryRuleMapInstance : ruleMapInstance EOF ;
    public final void entryRuleMapInstance() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:425:1: ( ruleMapInstance EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:426:1: ruleMapInstance EOF
            {
             before(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance841);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMapInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance848); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:433:1: ruleMapInstance : ( ( rule__MapInstance__Group__0 ) ) ;
    public final void ruleMapInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:437:2: ( ( ( rule__MapInstance__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__MapInstance__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__MapInstance__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:439:1: ( rule__MapInstance__Group__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:1: ( rule__MapInstance__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:2: rule__MapInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance874);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:452:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:453:1: ( ruleStringList EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:454:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList901);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList908); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:461:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:465:2: ( ( ( rule__StringList__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:466:1: ( ( rule__StringList__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:466:1: ( ( rule__StringList__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:467:1: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:468:1: ( rule__StringList__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:468:2: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_rule__StringList__Group__0_in_ruleStringList934);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:480:1: entryRuleNestedType : ruleNestedType EOF ;
    public final void entryRuleNestedType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:481:1: ( ruleNestedType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:482:1: ruleNestedType EOF
            {
             before(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType961);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getNestedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType968); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:489:1: ruleNestedType : ( ( rule__NestedType__Alternatives ) ) ;
    public final void ruleNestedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:493:2: ( ( ( rule__NestedType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:494:1: ( ( rule__NestedType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:494:1: ( ( rule__NestedType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:495:1: ( rule__NestedType__Alternatives )
            {
             before(grammarAccess.getNestedTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:496:1: ( rule__NestedType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:496:2: rule__NestedType__Alternatives
            {
            pushFollow(FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType994);
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


    // $ANTLR start "rule__Xplatform__Alternatives_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:508:1: rule__Xplatform__Alternatives_1 : ( ( ( rule__Xplatform__ResourcesAssignment_1_0 ) ) | ( ( rule__Xplatform__CallsAssignment_1_1 ) ) );
    public final void rule__Xplatform__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:512:1: ( ( ( rule__Xplatform__ResourcesAssignment_1_0 ) ) | ( ( rule__Xplatform__CallsAssignment_1_1 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:513:1: ( ( rule__Xplatform__ResourcesAssignment_1_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:513:1: ( ( rule__Xplatform__ResourcesAssignment_1_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:514:1: ( rule__Xplatform__ResourcesAssignment_1_0 )
                    {
                     before(grammarAccess.getXplatformAccess().getResourcesAssignment_1_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:515:1: ( rule__Xplatform__ResourcesAssignment_1_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:515:2: rule__Xplatform__ResourcesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__ResourcesAssignment_1_0_in_rule__Xplatform__Alternatives_11030);
                    rule__Xplatform__ResourcesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformAccess().getResourcesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:519:6: ( ( rule__Xplatform__CallsAssignment_1_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:519:6: ( ( rule__Xplatform__CallsAssignment_1_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:520:1: ( rule__Xplatform__CallsAssignment_1_1 )
                    {
                     before(grammarAccess.getXplatformAccess().getCallsAssignment_1_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:521:1: ( rule__Xplatform__CallsAssignment_1_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:521:2: rule__Xplatform__CallsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Xplatform__CallsAssignment_1_1_in_rule__Xplatform__Alternatives_11048);
                    rule__Xplatform__CallsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformAccess().getCallsAssignment_1_1()); 

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
    // $ANTLR end "rule__Xplatform__Alternatives_1"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Alternatives_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:530:1: rule__XplatformHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) );
    public final void rule__XplatformHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:534:1: ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_XPLATFORM_HEADER_PARAMETER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:535:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:535:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:536:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:537:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:537:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_21081);
                    rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:541:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:541:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:542:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:543:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:543:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_21099);
                    rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__Alternatives_2"


    // $ANTLR start "rule__JsonObjectValue__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:552:1: rule__JsonObjectValue__Alternatives : ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ruleJsonObject ) | ( ruleJsonArray ) | ( RULE_EMPTY_JSON_OBJECT ) | ( RULE_EMPTY_JSON_ARRAY ) | ( RULE_JSON_LITERAL_BOOLEAN ) | ( RULE_JSON_LITERAL_NULL ) | ( RULE_JSON_META_SCALAR_TYPE ) | ( RULE_JSON_NUMBER ) );
    public final void rule__JsonObjectValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:556:1: ( ( ( rule__JsonObjectValue__ValueAssignment_0 ) ) | ( ruleJsonObject ) | ( ruleJsonArray ) | ( RULE_EMPTY_JSON_OBJECT ) | ( RULE_EMPTY_JSON_ARRAY ) | ( RULE_JSON_LITERAL_BOOLEAN ) | ( RULE_JSON_LITERAL_NULL ) | ( RULE_JSON_META_SCALAR_TYPE ) | ( RULE_JSON_NUMBER ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case RULE_EMPTY_JSON_OBJECT:
                {
                alt3=4;
                }
                break;
            case RULE_EMPTY_JSON_ARRAY:
                {
                alt3=5;
                }
                break;
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt3=6;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt3=7;
                }
                break;
            case RULE_JSON_META_SCALAR_TYPE:
                {
                alt3=8;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:557:1: ( ( rule__JsonObjectValue__ValueAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:557:1: ( ( rule__JsonObjectValue__ValueAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:558:1: ( rule__JsonObjectValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getValueAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:1: ( rule__JsonObjectValue__ValueAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:2: rule__JsonObjectValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonObjectValue__ValueAssignment_0_in_rule__JsonObjectValue__Alternatives1132);
                    rule__JsonObjectValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonObjectValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:563:6: ( ruleJsonObject )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:563:6: ( ruleJsonObject )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:564:1: ruleJsonObject
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getJsonObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJsonObject_in_rule__JsonObjectValue__Alternatives1150);
                    ruleJsonObject();

                    state._fsp--;

                     after(grammarAccess.getJsonObjectValueAccess().getJsonObjectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:569:6: ( ruleJsonArray )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:569:6: ( ruleJsonArray )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:570:1: ruleJsonArray
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getJsonArrayParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonObjectValue__Alternatives1167);
                    ruleJsonArray();

                    state._fsp--;

                     after(grammarAccess.getJsonObjectValueAccess().getJsonArrayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:575:6: ( RULE_EMPTY_JSON_OBJECT )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:575:6: ( RULE_EMPTY_JSON_OBJECT )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:576:1: RULE_EMPTY_JSON_OBJECT
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_3()); 
                    match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonObjectValue__Alternatives1184); 
                     after(grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:581:6: ( RULE_EMPTY_JSON_ARRAY )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:581:6: ( RULE_EMPTY_JSON_ARRAY )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:582:1: RULE_EMPTY_JSON_ARRAY
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_4()); 
                    match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonObjectValue__Alternatives1201); 
                     after(grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:587:6: ( RULE_JSON_LITERAL_BOOLEAN )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:587:6: ( RULE_JSON_LITERAL_BOOLEAN )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:588:1: RULE_JSON_LITERAL_BOOLEAN
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_5()); 
                    match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonObjectValue__Alternatives1218); 
                     after(grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:593:6: ( RULE_JSON_LITERAL_NULL )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:593:6: ( RULE_JSON_LITERAL_NULL )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:594:1: RULE_JSON_LITERAL_NULL
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_6()); 
                    match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonObjectValue__Alternatives1235); 
                     after(grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:599:6: ( RULE_JSON_META_SCALAR_TYPE )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:599:6: ( RULE_JSON_META_SCALAR_TYPE )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:600:1: RULE_JSON_META_SCALAR_TYPE
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_7()); 
                    match(input,RULE_JSON_META_SCALAR_TYPE,FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_rule__JsonObjectValue__Alternatives1252); 
                     after(grammarAccess.getJsonObjectValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:605:6: ( RULE_JSON_NUMBER )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:605:6: ( RULE_JSON_NUMBER )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:606:1: RULE_JSON_NUMBER
                    {
                     before(grammarAccess.getJsonObjectValueAccess().getJSON_NUMBERTerminalRuleCall_8()); 
                    match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_rule__JsonObjectValue__Alternatives1269); 
                     after(grammarAccess.getJsonObjectValueAccess().getJSON_NUMBERTerminalRuleCall_8()); 

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


    // $ANTLR start "rule__XplatformResourceDefinition__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:616:1: rule__XplatformResourceDefinition__Alternatives : ( ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) ) | ( ruleEnumInstance ) );
    public final void rule__XplatformResourceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:620:1: ( ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) ) | ( ruleEnumInstance ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:621:1: ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:621:1: ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:622:1: ( rule__XplatformResourceDefinition__ResourcesAssignment_0 )
                    {
                     before(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:623:1: ( rule__XplatformResourceDefinition__ResourcesAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:623:2: rule__XplatformResourceDefinition__ResourcesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__XplatformResourceDefinition__ResourcesAssignment_0_in_rule__XplatformResourceDefinition__Alternatives1301);
                    rule__XplatformResourceDefinition__ResourcesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:627:6: ( ruleEnumInstance )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:627:6: ( ruleEnumInstance )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:628:1: ruleEnumInstance
                    {
                     before(grammarAccess.getXplatformResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumInstance_in_rule__XplatformResourceDefinition__Alternatives1319);
                    ruleEnumInstance();

                    state._fsp--;

                     after(grammarAccess.getXplatformResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 

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
    // $ANTLR end "rule__XplatformResourceDefinition__Alternatives"


    // $ANTLR start "rule__NestedType__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:638:1: rule__NestedType__Alternatives : ( ( RULE_STRING ) | ( ruleStringList ) );
    public final void rule__NestedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:642:1: ( ( RULE_STRING ) | ( ruleStringList ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:643:1: ( RULE_STRING )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:643:1: ( RULE_STRING )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:644:1: RULE_STRING
                    {
                     before(grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NestedType__Alternatives1351); 
                     after(grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:649:6: ( ruleStringList )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:649:6: ( ruleStringList )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:650:1: ruleStringList
                    {
                     before(grammarAccess.getNestedTypeAccess().getStringListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringList_in_rule__NestedType__Alternatives1368);
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


    // $ANTLR start "rule__Xplatform__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:662:1: rule__Xplatform__Group__0 : rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 ;
    public final void rule__Xplatform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:666:1: ( rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:667:2: rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01398);
            rule__Xplatform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01401);
            rule__Xplatform__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__0"


    // $ANTLR start "rule__Xplatform__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:674:1: rule__Xplatform__Group__0__Impl : ( ( rule__Xplatform__PlatformAssignment_0 ) ) ;
    public final void rule__Xplatform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:678:1: ( ( ( rule__Xplatform__PlatformAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:679:1: ( ( rule__Xplatform__PlatformAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:679:1: ( ( rule__Xplatform__PlatformAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:680:1: ( rule__Xplatform__PlatformAssignment_0 )
            {
             before(grammarAccess.getXplatformAccess().getPlatformAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:681:1: ( rule__Xplatform__PlatformAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:681:2: rule__Xplatform__PlatformAssignment_0
            {
            pushFollow(FOLLOW_rule__Xplatform__PlatformAssignment_0_in_rule__Xplatform__Group__0__Impl1428);
            rule__Xplatform__PlatformAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getPlatformAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__0__Impl"


    // $ANTLR start "rule__Xplatform__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:691:1: rule__Xplatform__Group__1 : rule__Xplatform__Group__1__Impl ;
    public final void rule__Xplatform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:695:1: ( rule__Xplatform__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:696:2: rule__Xplatform__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11458);
            rule__Xplatform__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__1"


    // $ANTLR start "rule__Xplatform__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:702:1: rule__Xplatform__Group__1__Impl : ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) ) ;
    public final void rule__Xplatform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:706:1: ( ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:707:1: ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:707:1: ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:708:1: ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:708:1: ( ( rule__Xplatform__Alternatives_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:709:1: ( rule__Xplatform__Alternatives_1 )
            {
             before(grammarAccess.getXplatformAccess().getAlternatives_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:710:1: ( rule__Xplatform__Alternatives_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:710:2: rule__Xplatform__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1487);
            rule__Xplatform__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getAlternatives_1()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:713:1: ( ( rule__Xplatform__Alternatives_1 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:714:1: ( rule__Xplatform__Alternatives_1 )*
            {
             before(grammarAccess.getXplatformAccess().getAlternatives_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:715:1: ( rule__Xplatform__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||(LA6_0>=39 && LA6_0<=40)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:715:2: rule__Xplatform__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1499);
            	    rule__Xplatform__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getXplatformAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Xplatform__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:730:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:734:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:735:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01536);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01539);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:742:1: rule__Platform__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:746:1: ( ( 'platform' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:747:1: ( 'platform' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:747:1: ( 'platform' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:748:1: 'platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Platform__Group__0__Impl1567); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:761:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:765:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:766:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11598);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11601);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:773:1: rule__Platform__Group__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:777:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:778:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:778:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:779:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Platform__Group__1__Impl1629); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:792:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:796:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:797:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21660);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21663);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:804:1: rule__Platform__Group__2__Impl : ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:808:1: ( ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:809:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:809:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:810:1: ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:810:1: ( ( rule__Platform__Group_2__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:811:1: ( rule__Platform__Group_2__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:812:1: ( rule__Platform__Group_2__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:812:2: rule__Platform__Group_2__0
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1692);
            rule__Platform__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup_2()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:815:1: ( ( rule__Platform__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:816:1: ( rule__Platform__Group_2__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:817:1: ( rule__Platform__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:817:2: rule__Platform__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1704);
            	    rule__Platform__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:828:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:832:1: ( rule__Platform__Group__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:833:2: rule__Platform__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31737);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:839:1: rule__Platform__Group__3__Impl : ( '}' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:843:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:844:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:844:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:845:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Platform__Group__3__Impl1765); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:866:1: rule__Platform__Group_2__0 : rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 ;
    public final void rule__Platform__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:870:1: ( rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:871:2: rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01804);
            rule__Platform__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01807);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:878:1: rule__Platform__Group_2__0__Impl : ( ( rule__Platform__PlatformsAssignment_2_0 ) ) ;
    public final void rule__Platform__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:882:1: ( ( ( rule__Platform__PlatformsAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:883:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:883:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:884:1: ( rule__Platform__PlatformsAssignment_2_0 )
            {
             before(grammarAccess.getPlatformAccess().getPlatformsAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:885:1: ( rule__Platform__PlatformsAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:885:2: rule__Platform__PlatformsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl1834);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:895:1: rule__Platform__Group_2__1 : rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 ;
    public final void rule__Platform__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:899:1: ( rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:900:2: rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__11864);
            rule__Platform__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__11867);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:907:1: rule__Platform__Group_2__1__Impl : ( '->' ) ;
    public final void rule__Platform__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:911:1: ( ( '->' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:912:1: ( '->' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:912:1: ( '->' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:913:1: '->'
            {
             before(grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__Platform__Group_2__1__Impl1895); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:926:1: rule__Platform__Group_2__2 : rule__Platform__Group_2__2__Impl ;
    public final void rule__Platform__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:930:1: ( rule__Platform__Group_2__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:931:2: rule__Platform__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__21926);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:937:1: rule__Platform__Group_2__2__Impl : ( ( rule__Platform__GenerateWhereAssignment_2_2 ) ) ;
    public final void rule__Platform__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:941:1: ( ( ( rule__Platform__GenerateWhereAssignment_2_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:942:1: ( ( rule__Platform__GenerateWhereAssignment_2_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:942:1: ( ( rule__Platform__GenerateWhereAssignment_2_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:943:1: ( rule__Platform__GenerateWhereAssignment_2_2 )
            {
             before(grammarAccess.getPlatformAccess().getGenerateWhereAssignment_2_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:944:1: ( rule__Platform__GenerateWhereAssignment_2_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:944:2: rule__Platform__GenerateWhereAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl1953);
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


    // $ANTLR start "rule__XplatformCallDefinition__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:960:1: rule__XplatformCallDefinition__Group__0 : rule__XplatformCallDefinition__Group__0__Impl rule__XplatformCallDefinition__Group__1 ;
    public final void rule__XplatformCallDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:964:1: ( rule__XplatformCallDefinition__Group__0__Impl rule__XplatformCallDefinition__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:965:2: rule__XplatformCallDefinition__Group__0__Impl rule__XplatformCallDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__0__Impl_in_rule__XplatformCallDefinition__Group__01989);
            rule__XplatformCallDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__1_in_rule__XplatformCallDefinition__Group__01992);
            rule__XplatformCallDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__0"


    // $ANTLR start "rule__XplatformCallDefinition__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:972:1: rule__XplatformCallDefinition__Group__0__Impl : ( 'call' ) ;
    public final void rule__XplatformCallDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:976:1: ( ( 'call' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:977:1: ( 'call' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:977:1: ( 'call' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:978:1: 'call'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getCallKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__XplatformCallDefinition__Group__0__Impl2020); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__0__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:991:1: rule__XplatformCallDefinition__Group__1 : rule__XplatformCallDefinition__Group__1__Impl rule__XplatformCallDefinition__Group__2 ;
    public final void rule__XplatformCallDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:995:1: ( rule__XplatformCallDefinition__Group__1__Impl rule__XplatformCallDefinition__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:996:2: rule__XplatformCallDefinition__Group__1__Impl rule__XplatformCallDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__1__Impl_in_rule__XplatformCallDefinition__Group__12051);
            rule__XplatformCallDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__2_in_rule__XplatformCallDefinition__Group__12054);
            rule__XplatformCallDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__1"


    // $ANTLR start "rule__XplatformCallDefinition__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1003:1: rule__XplatformCallDefinition__Group__1__Impl : ( ( rule__XplatformCallDefinition__NameAssignment_1 ) ) ;
    public final void rule__XplatformCallDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1007:1: ( ( ( rule__XplatformCallDefinition__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1008:1: ( ( rule__XplatformCallDefinition__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1008:1: ( ( rule__XplatformCallDefinition__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1009:1: ( rule__XplatformCallDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1010:1: ( rule__XplatformCallDefinition__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1010:2: rule__XplatformCallDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__NameAssignment_1_in_rule__XplatformCallDefinition__Group__1__Impl2081);
            rule__XplatformCallDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__1__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1020:1: rule__XplatformCallDefinition__Group__2 : rule__XplatformCallDefinition__Group__2__Impl rule__XplatformCallDefinition__Group__3 ;
    public final void rule__XplatformCallDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1024:1: ( rule__XplatformCallDefinition__Group__2__Impl rule__XplatformCallDefinition__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1025:2: rule__XplatformCallDefinition__Group__2__Impl rule__XplatformCallDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__2__Impl_in_rule__XplatformCallDefinition__Group__22111);
            rule__XplatformCallDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__3_in_rule__XplatformCallDefinition__Group__22114);
            rule__XplatformCallDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__2"


    // $ANTLR start "rule__XplatformCallDefinition__Group__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1032:1: rule__XplatformCallDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__XplatformCallDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1036:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1037:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1037:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1038:1: ':'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__XplatformCallDefinition__Group__2__Impl2142); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__2__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1051:1: rule__XplatformCallDefinition__Group__3 : rule__XplatformCallDefinition__Group__3__Impl rule__XplatformCallDefinition__Group__4 ;
    public final void rule__XplatformCallDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1055:1: ( rule__XplatformCallDefinition__Group__3__Impl rule__XplatformCallDefinition__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1056:2: rule__XplatformCallDefinition__Group__3__Impl rule__XplatformCallDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__3__Impl_in_rule__XplatformCallDefinition__Group__32173);
            rule__XplatformCallDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__4_in_rule__XplatformCallDefinition__Group__32176);
            rule__XplatformCallDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__3"


    // $ANTLR start "rule__XplatformCallDefinition__Group__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1063:1: rule__XplatformCallDefinition__Group__3__Impl : ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) ) ;
    public final void rule__XplatformCallDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1067:1: ( ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1068:1: ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1068:1: ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1069:1: ( rule__XplatformCallDefinition__MethodAssignment_3 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getMethodAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1070:1: ( rule__XplatformCallDefinition__MethodAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1070:2: rule__XplatformCallDefinition__MethodAssignment_3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__MethodAssignment_3_in_rule__XplatformCallDefinition__Group__3__Impl2203);
            rule__XplatformCallDefinition__MethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__3__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1080:1: rule__XplatformCallDefinition__Group__4 : rule__XplatformCallDefinition__Group__4__Impl rule__XplatformCallDefinition__Group__5 ;
    public final void rule__XplatformCallDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1084:1: ( rule__XplatformCallDefinition__Group__4__Impl rule__XplatformCallDefinition__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1085:2: rule__XplatformCallDefinition__Group__4__Impl rule__XplatformCallDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__4__Impl_in_rule__XplatformCallDefinition__Group__42233);
            rule__XplatformCallDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__5_in_rule__XplatformCallDefinition__Group__42236);
            rule__XplatformCallDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__4"


    // $ANTLR start "rule__XplatformCallDefinition__Group__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1092:1: rule__XplatformCallDefinition__Group__4__Impl : ( 'from' ) ;
    public final void rule__XplatformCallDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1096:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1097:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1097:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1098:1: 'from'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__XplatformCallDefinition__Group__4__Impl2264); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__4__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group__5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1111:1: rule__XplatformCallDefinition__Group__5 : rule__XplatformCallDefinition__Group__5__Impl rule__XplatformCallDefinition__Group__6 ;
    public final void rule__XplatformCallDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1115:1: ( rule__XplatformCallDefinition__Group__5__Impl rule__XplatformCallDefinition__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1116:2: rule__XplatformCallDefinition__Group__5__Impl rule__XplatformCallDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__5__Impl_in_rule__XplatformCallDefinition__Group__52295);
            rule__XplatformCallDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__6_in_rule__XplatformCallDefinition__Group__52298);
            rule__XplatformCallDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__5"


    // $ANTLR start "rule__XplatformCallDefinition__Group__5__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1123:1: rule__XplatformCallDefinition__Group__5__Impl : ( ( rule__XplatformCallDefinition__UriAssignment_5 ) ) ;
    public final void rule__XplatformCallDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1127:1: ( ( ( rule__XplatformCallDefinition__UriAssignment_5 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1128:1: ( ( rule__XplatformCallDefinition__UriAssignment_5 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1128:1: ( ( rule__XplatformCallDefinition__UriAssignment_5 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1129:1: ( rule__XplatformCallDefinition__UriAssignment_5 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getUriAssignment_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1130:1: ( rule__XplatformCallDefinition__UriAssignment_5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1130:2: rule__XplatformCallDefinition__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__UriAssignment_5_in_rule__XplatformCallDefinition__Group__5__Impl2325);
            rule__XplatformCallDefinition__UriAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getUriAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__5__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group__6"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1140:1: rule__XplatformCallDefinition__Group__6 : rule__XplatformCallDefinition__Group__6__Impl rule__XplatformCallDefinition__Group__7 ;
    public final void rule__XplatformCallDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1144:1: ( rule__XplatformCallDefinition__Group__6__Impl rule__XplatformCallDefinition__Group__7 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1145:2: rule__XplatformCallDefinition__Group__6__Impl rule__XplatformCallDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__6__Impl_in_rule__XplatformCallDefinition__Group__62355);
            rule__XplatformCallDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__7_in_rule__XplatformCallDefinition__Group__62358);
            rule__XplatformCallDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__6"


    // $ANTLR start "rule__XplatformCallDefinition__Group__6__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1152:1: rule__XplatformCallDefinition__Group__6__Impl : ( ( rule__XplatformCallDefinition__Group_6__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1156:1: ( ( ( rule__XplatformCallDefinition__Group_6__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1157:1: ( ( rule__XplatformCallDefinition__Group_6__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1157:1: ( ( rule__XplatformCallDefinition__Group_6__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1158:1: ( rule__XplatformCallDefinition__Group_6__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_6()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1159:1: ( rule__XplatformCallDefinition__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1159:2: rule__XplatformCallDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__0_in_rule__XplatformCallDefinition__Group__6__Impl2385);
                    rule__XplatformCallDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__6__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group__7"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1169:1: rule__XplatformCallDefinition__Group__7 : rule__XplatformCallDefinition__Group__7__Impl ;
    public final void rule__XplatformCallDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1173:1: ( rule__XplatformCallDefinition__Group__7__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1174:2: rule__XplatformCallDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__7__Impl_in_rule__XplatformCallDefinition__Group__72416);
            rule__XplatformCallDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__7"


    // $ANTLR start "rule__XplatformCallDefinition__Group__7__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1180:1: rule__XplatformCallDefinition__Group__7__Impl : ( ( rule__XplatformCallDefinition__Group_7__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1184:1: ( ( ( rule__XplatformCallDefinition__Group_7__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1185:1: ( ( rule__XplatformCallDefinition__Group_7__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1185:1: ( ( rule__XplatformCallDefinition__Group_7__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1186:1: ( rule__XplatformCallDefinition__Group_7__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_7()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1187:1: ( rule__XplatformCallDefinition__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1187:2: rule__XplatformCallDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__0_in_rule__XplatformCallDefinition__Group__7__Impl2443);
                    rule__XplatformCallDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group__7__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1213:1: rule__XplatformCallDefinition__Group_6__0 : rule__XplatformCallDefinition__Group_6__0__Impl rule__XplatformCallDefinition__Group_6__1 ;
    public final void rule__XplatformCallDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1217:1: ( rule__XplatformCallDefinition__Group_6__0__Impl rule__XplatformCallDefinition__Group_6__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1218:2: rule__XplatformCallDefinition__Group_6__0__Impl rule__XplatformCallDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__0__Impl_in_rule__XplatformCallDefinition__Group_6__02490);
            rule__XplatformCallDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__1_in_rule__XplatformCallDefinition__Group_6__02493);
            rule__XplatformCallDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__0"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1225:1: rule__XplatformCallDefinition__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__XplatformCallDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1229:1: ( ( 'with' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1230:1: ( 'with' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1230:1: ( 'with' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1231:1: 'with'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getWithKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__XplatformCallDefinition__Group_6__0__Impl2521); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getWithKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1244:1: rule__XplatformCallDefinition__Group_6__1 : rule__XplatformCallDefinition__Group_6__1__Impl rule__XplatformCallDefinition__Group_6__2 ;
    public final void rule__XplatformCallDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1248:1: ( rule__XplatformCallDefinition__Group_6__1__Impl rule__XplatformCallDefinition__Group_6__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1249:2: rule__XplatformCallDefinition__Group_6__1__Impl rule__XplatformCallDefinition__Group_6__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__1__Impl_in_rule__XplatformCallDefinition__Group_6__12552);
            rule__XplatformCallDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__2_in_rule__XplatformCallDefinition__Group_6__12555);
            rule__XplatformCallDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__1"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1256:1: rule__XplatformCallDefinition__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__XplatformCallDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1260:1: ( ( 'headers' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1261:1: ( 'headers' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1261:1: ( 'headers' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1262:1: 'headers'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getHeadersKeyword_6_1()); 
            match(input,27,FOLLOW_27_in_rule__XplatformCallDefinition__Group_6__1__Impl2583); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getHeadersKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1275:1: rule__XplatformCallDefinition__Group_6__2 : rule__XplatformCallDefinition__Group_6__2__Impl rule__XplatformCallDefinition__Group_6__3 ;
    public final void rule__XplatformCallDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1279:1: ( rule__XplatformCallDefinition__Group_6__2__Impl rule__XplatformCallDefinition__Group_6__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1280:2: rule__XplatformCallDefinition__Group_6__2__Impl rule__XplatformCallDefinition__Group_6__3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__2__Impl_in_rule__XplatformCallDefinition__Group_6__22614);
            rule__XplatformCallDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__3_in_rule__XplatformCallDefinition__Group_6__22617);
            rule__XplatformCallDefinition__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__2"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1287:1: rule__XplatformCallDefinition__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__XplatformCallDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1291:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1292:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1292:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1293:1: 'from'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_6_2()); 
            match(input,25,FOLLOW_25_in_rule__XplatformCallDefinition__Group_6__2__Impl2645); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1306:1: rule__XplatformCallDefinition__Group_6__3 : rule__XplatformCallDefinition__Group_6__3__Impl rule__XplatformCallDefinition__Group_6__4 ;
    public final void rule__XplatformCallDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1310:1: ( rule__XplatformCallDefinition__Group_6__3__Impl rule__XplatformCallDefinition__Group_6__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1311:2: rule__XplatformCallDefinition__Group_6__3__Impl rule__XplatformCallDefinition__Group_6__4
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__3__Impl_in_rule__XplatformCallDefinition__Group_6__32676);
            rule__XplatformCallDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__4_in_rule__XplatformCallDefinition__Group_6__32679);
            rule__XplatformCallDefinition__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__3"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1318:1: rule__XplatformCallDefinition__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__XplatformCallDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1322:1: ( ( 'request' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1323:1: ( 'request' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1323:1: ( 'request' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1324:1: 'request'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getRequestKeyword_6_3()); 
            match(input,28,FOLLOW_28_in_rule__XplatformCallDefinition__Group_6__3__Impl2707); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getRequestKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1337:1: rule__XplatformCallDefinition__Group_6__4 : rule__XplatformCallDefinition__Group_6__4__Impl rule__XplatformCallDefinition__Group_6__5 ;
    public final void rule__XplatformCallDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1341:1: ( rule__XplatformCallDefinition__Group_6__4__Impl rule__XplatformCallDefinition__Group_6__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1342:2: rule__XplatformCallDefinition__Group_6__4__Impl rule__XplatformCallDefinition__Group_6__5
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__4__Impl_in_rule__XplatformCallDefinition__Group_6__42738);
            rule__XplatformCallDefinition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__5_in_rule__XplatformCallDefinition__Group_6__42741);
            rule__XplatformCallDefinition__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__4"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1349:1: rule__XplatformCallDefinition__Group_6__4__Impl : ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__XplatformCallDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1353:1: ( ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1354:1: ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1354:1: ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1355:1: ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1356:1: ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1356:2: rule__XplatformCallDefinition__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__RequestHeadersAssignment_6_4_in_rule__XplatformCallDefinition__Group_6__4__Impl2768);
            rule__XplatformCallDefinition__RequestHeadersAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1366:1: rule__XplatformCallDefinition__Group_6__5 : rule__XplatformCallDefinition__Group_6__5__Impl ;
    public final void rule__XplatformCallDefinition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1370:1: ( rule__XplatformCallDefinition__Group_6__5__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1371:2: rule__XplatformCallDefinition__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__5__Impl_in_rule__XplatformCallDefinition__Group_6__52798);
            rule__XplatformCallDefinition__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__5"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6__5__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1377:1: rule__XplatformCallDefinition__Group_6__5__Impl : ( ( rule__XplatformCallDefinition__Group_6_5__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1381:1: ( ( ( rule__XplatformCallDefinition__Group_6_5__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1382:1: ( ( rule__XplatformCallDefinition__Group_6_5__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1382:1: ( ( rule__XplatformCallDefinition__Group_6_5__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1383:1: ( rule__XplatformCallDefinition__Group_6_5__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_6_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1384:1: ( rule__XplatformCallDefinition__Group_6_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1384:2: rule__XplatformCallDefinition__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__0_in_rule__XplatformCallDefinition__Group_6__5__Impl2825);
                    rule__XplatformCallDefinition__Group_6_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getGroup_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6__5__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6_5__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1406:1: rule__XplatformCallDefinition__Group_6_5__0 : rule__XplatformCallDefinition__Group_6_5__0__Impl rule__XplatformCallDefinition__Group_6_5__1 ;
    public final void rule__XplatformCallDefinition__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1410:1: ( rule__XplatformCallDefinition__Group_6_5__0__Impl rule__XplatformCallDefinition__Group_6_5__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1411:2: rule__XplatformCallDefinition__Group_6_5__0__Impl rule__XplatformCallDefinition__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__0__Impl_in_rule__XplatformCallDefinition__Group_6_5__02868);
            rule__XplatformCallDefinition__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__1_in_rule__XplatformCallDefinition__Group_6_5__02871);
            rule__XplatformCallDefinition__Group_6_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6_5__0"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6_5__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1418:1: rule__XplatformCallDefinition__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__XplatformCallDefinition__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1422:1: ( ( 'and' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1423:1: ( 'and' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1423:1: ( 'and' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1424:1: 'and'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getAndKeyword_6_5_0()); 
            match(input,29,FOLLOW_29_in_rule__XplatformCallDefinition__Group_6_5__0__Impl2899); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getAndKeyword_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6_5__0__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6_5__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1437:1: rule__XplatformCallDefinition__Group_6_5__1 : rule__XplatformCallDefinition__Group_6_5__1__Impl rule__XplatformCallDefinition__Group_6_5__2 ;
    public final void rule__XplatformCallDefinition__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1441:1: ( rule__XplatformCallDefinition__Group_6_5__1__Impl rule__XplatformCallDefinition__Group_6_5__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1442:2: rule__XplatformCallDefinition__Group_6_5__1__Impl rule__XplatformCallDefinition__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__1__Impl_in_rule__XplatformCallDefinition__Group_6_5__12930);
            rule__XplatformCallDefinition__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__2_in_rule__XplatformCallDefinition__Group_6_5__12933);
            rule__XplatformCallDefinition__Group_6_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6_5__1"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6_5__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1449:1: rule__XplatformCallDefinition__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__XplatformCallDefinition__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1453:1: ( ( 'response' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1454:1: ( 'response' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1454:1: ( 'response' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1455:1: 'response'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getResponseKeyword_6_5_1()); 
            match(input,30,FOLLOW_30_in_rule__XplatformCallDefinition__Group_6_5__1__Impl2961); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getResponseKeyword_6_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6_5__1__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6_5__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1468:1: rule__XplatformCallDefinition__Group_6_5__2 : rule__XplatformCallDefinition__Group_6_5__2__Impl ;
    public final void rule__XplatformCallDefinition__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1472:1: ( rule__XplatformCallDefinition__Group_6_5__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1473:2: rule__XplatformCallDefinition__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__2__Impl_in_rule__XplatformCallDefinition__Group_6_5__22992);
            rule__XplatformCallDefinition__Group_6_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6_5__2"


    // $ANTLR start "rule__XplatformCallDefinition__Group_6_5__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1479:1: rule__XplatformCallDefinition__Group_6_5__2__Impl : ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__XplatformCallDefinition__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1483:1: ( ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1484:1: ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1484:1: ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1485:1: ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1486:1: ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1486:2: rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__XplatformCallDefinition__Group_6_5__2__Impl3019);
            rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_6_5__2__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1502:1: rule__XplatformCallDefinition__Group_7__0 : rule__XplatformCallDefinition__Group_7__0__Impl rule__XplatformCallDefinition__Group_7__1 ;
    public final void rule__XplatformCallDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1506:1: ( rule__XplatformCallDefinition__Group_7__0__Impl rule__XplatformCallDefinition__Group_7__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1507:2: rule__XplatformCallDefinition__Group_7__0__Impl rule__XplatformCallDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__0__Impl_in_rule__XplatformCallDefinition__Group_7__03055);
            rule__XplatformCallDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__1_in_rule__XplatformCallDefinition__Group_7__03058);
            rule__XplatformCallDefinition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__0"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1514:1: rule__XplatformCallDefinition__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__XplatformCallDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1518:1: ( ( 'client' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1519:1: ( 'client' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1519:1: ( 'client' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1520:1: 'client'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getClientKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__XplatformCallDefinition__Group_7__0__Impl3086); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getClientKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1533:1: rule__XplatformCallDefinition__Group_7__1 : rule__XplatformCallDefinition__Group_7__1__Impl rule__XplatformCallDefinition__Group_7__2 ;
    public final void rule__XplatformCallDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1537:1: ( rule__XplatformCallDefinition__Group_7__1__Impl rule__XplatformCallDefinition__Group_7__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1538:2: rule__XplatformCallDefinition__Group_7__1__Impl rule__XplatformCallDefinition__Group_7__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__1__Impl_in_rule__XplatformCallDefinition__Group_7__13117);
            rule__XplatformCallDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__2_in_rule__XplatformCallDefinition__Group_7__13120);
            rule__XplatformCallDefinition__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__1"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1545:1: rule__XplatformCallDefinition__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__XplatformCallDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1549:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1550:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1550:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1551:1: 'expects'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_1()); 
            match(input,32,FOLLOW_32_in_rule__XplatformCallDefinition__Group_7__1__Impl3148); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1564:1: rule__XplatformCallDefinition__Group_7__2 : rule__XplatformCallDefinition__Group_7__2__Impl rule__XplatformCallDefinition__Group_7__3 ;
    public final void rule__XplatformCallDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1568:1: ( rule__XplatformCallDefinition__Group_7__2__Impl rule__XplatformCallDefinition__Group_7__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1569:2: rule__XplatformCallDefinition__Group_7__2__Impl rule__XplatformCallDefinition__Group_7__3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__2__Impl_in_rule__XplatformCallDefinition__Group_7__23179);
            rule__XplatformCallDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__3_in_rule__XplatformCallDefinition__Group_7__23182);
            rule__XplatformCallDefinition__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__2"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1576:1: rule__XplatformCallDefinition__Group_7__2__Impl : ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__XplatformCallDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1580:1: ( ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1581:1: ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1581:1: ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1582:1: ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientAssignment_7_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1583:1: ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1583:2: rule__XplatformCallDefinition__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__JsonToClientAssignment_7_2_in_rule__XplatformCallDefinition__Group_7__2__Impl3209);
            rule__XplatformCallDefinition__JsonToClientAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1593:1: rule__XplatformCallDefinition__Group_7__3 : rule__XplatformCallDefinition__Group_7__3__Impl ;
    public final void rule__XplatformCallDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1597:1: ( rule__XplatformCallDefinition__Group_7__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1598:2: rule__XplatformCallDefinition__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__3__Impl_in_rule__XplatformCallDefinition__Group_7__33239);
            rule__XplatformCallDefinition__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__3"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1604:1: rule__XplatformCallDefinition__Group_7__3__Impl : ( ( rule__XplatformCallDefinition__Group_7_3__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1608:1: ( ( ( rule__XplatformCallDefinition__Group_7_3__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1609:1: ( ( rule__XplatformCallDefinition__Group_7_3__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1609:1: ( ( rule__XplatformCallDefinition__Group_7_3__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1610:1: ( rule__XplatformCallDefinition__Group_7_3__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_7_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1611:1: ( rule__XplatformCallDefinition__Group_7_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1611:2: rule__XplatformCallDefinition__Group_7_3__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__0_in_rule__XplatformCallDefinition__Group_7__3__Impl3266);
                    rule__XplatformCallDefinition__Group_7_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7_3__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1629:1: rule__XplatformCallDefinition__Group_7_3__0 : rule__XplatformCallDefinition__Group_7_3__0__Impl rule__XplatformCallDefinition__Group_7_3__1 ;
    public final void rule__XplatformCallDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1633:1: ( rule__XplatformCallDefinition__Group_7_3__0__Impl rule__XplatformCallDefinition__Group_7_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1634:2: rule__XplatformCallDefinition__Group_7_3__0__Impl rule__XplatformCallDefinition__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__0__Impl_in_rule__XplatformCallDefinition__Group_7_3__03305);
            rule__XplatformCallDefinition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__1_in_rule__XplatformCallDefinition__Group_7_3__03308);
            rule__XplatformCallDefinition__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7_3__0"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7_3__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1641:1: rule__XplatformCallDefinition__Group_7_3__0__Impl : ( 'server' ) ;
    public final void rule__XplatformCallDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1645:1: ( ( 'server' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1646:1: ( 'server' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1646:1: ( 'server' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1647:1: 'server'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getServerKeyword_7_3_0()); 
            match(input,33,FOLLOW_33_in_rule__XplatformCallDefinition__Group_7_3__0__Impl3336); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getServerKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7_3__0__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7_3__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1660:1: rule__XplatformCallDefinition__Group_7_3__1 : rule__XplatformCallDefinition__Group_7_3__1__Impl rule__XplatformCallDefinition__Group_7_3__2 ;
    public final void rule__XplatformCallDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1664:1: ( rule__XplatformCallDefinition__Group_7_3__1__Impl rule__XplatformCallDefinition__Group_7_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1665:2: rule__XplatformCallDefinition__Group_7_3__1__Impl rule__XplatformCallDefinition__Group_7_3__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__1__Impl_in_rule__XplatformCallDefinition__Group_7_3__13367);
            rule__XplatformCallDefinition__Group_7_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__2_in_rule__XplatformCallDefinition__Group_7_3__13370);
            rule__XplatformCallDefinition__Group_7_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7_3__1"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7_3__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1672:1: rule__XplatformCallDefinition__Group_7_3__1__Impl : ( 'expects' ) ;
    public final void rule__XplatformCallDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1676:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1677:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1677:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1678:1: 'expects'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_3_1()); 
            match(input,32,FOLLOW_32_in_rule__XplatformCallDefinition__Group_7_3__1__Impl3398); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7_3__1__Impl"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7_3__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1691:1: rule__XplatformCallDefinition__Group_7_3__2 : rule__XplatformCallDefinition__Group_7_3__2__Impl ;
    public final void rule__XplatformCallDefinition__Group_7_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1695:1: ( rule__XplatformCallDefinition__Group_7_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1696:2: rule__XplatformCallDefinition__Group_7_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__2__Impl_in_rule__XplatformCallDefinition__Group_7_3__23429);
            rule__XplatformCallDefinition__Group_7_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7_3__2"


    // $ANTLR start "rule__XplatformCallDefinition__Group_7_3__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1702:1: rule__XplatformCallDefinition__Group_7_3__2__Impl : ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) ) ;
    public final void rule__XplatformCallDefinition__Group_7_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1706:1: ( ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1707:1: ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1707:1: ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1708:1: ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerAssignment_7_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1709:1: ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1709:2: rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2_in_rule__XplatformCallDefinition__Group_7_3__2__Impl3456);
            rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerAssignment_7_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__Group_7_3__2__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1725:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1729:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1730:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03492);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03495);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1737:1: rule__URI__Group__0__Impl : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1741:1: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1742:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1742:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1743:1: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1743:1: ( ( RULE_ANY_OTHER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1744:1: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1745:1: ( RULE_ANY_OTHER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1745:3: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3525); 

            }

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1748:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1749:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1750:1: ( RULE_ANY_OTHER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANY_OTHER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1750:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3538); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1761:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1765:1: ( rule__URI__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1766:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13571);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1772:1: rule__URI__Group__1__Impl : ( ( rule__URI__Group_1__0 )* ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1776:1: ( ( ( rule__URI__Group_1__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1777:1: ( ( rule__URI__Group_1__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1777:1: ( ( rule__URI__Group_1__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1778:1: ( rule__URI__Group_1__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1779:1: ( rule__URI__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1779:2: rule__URI__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3598);
            	    rule__URI__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1793:1: rule__URI__Group_1__0 : rule__URI__Group_1__0__Impl rule__URI__Group_1__1 ;
    public final void rule__URI__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1797:1: ( rule__URI__Group_1__0__Impl rule__URI__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1798:2: rule__URI__Group_1__0__Impl rule__URI__Group_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03633);
            rule__URI__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03636);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1805:1: rule__URI__Group_1__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1809:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1810:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1810:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1811:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__URI__Group_1__0__Impl3664); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1824:1: rule__URI__Group_1__1 : rule__URI__Group_1__1__Impl rule__URI__Group_1__2 ;
    public final void rule__URI__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1828:1: ( rule__URI__Group_1__1__Impl rule__URI__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1829:2: rule__URI__Group_1__1__Impl rule__URI__Group_1__2
            {
            pushFollow(FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13695);
            rule__URI__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13698);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1836:1: rule__URI__Group_1__1__Impl : ( ( rule__URI__ParametersAssignment_1_1 ) ) ;
    public final void rule__URI__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1840:1: ( ( ( rule__URI__ParametersAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1841:1: ( ( rule__URI__ParametersAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1841:1: ( ( rule__URI__ParametersAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1842:1: ( rule__URI__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getURIAccess().getParametersAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1843:1: ( rule__URI__ParametersAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1843:2: rule__URI__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__URI__ParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl3725);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1853:1: rule__URI__Group_1__2 : rule__URI__Group_1__2__Impl rule__URI__Group_1__3 ;
    public final void rule__URI__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1857:1: ( rule__URI__Group_1__2__Impl rule__URI__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1858:2: rule__URI__Group_1__2__Impl rule__URI__Group_1__3
            {
            pushFollow(FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23755);
            rule__URI__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23758);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1865:1: rule__URI__Group_1__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1869:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1870:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1870:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1871:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__URI__Group_1__2__Impl3786); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1884:1: rule__URI__Group_1__3 : rule__URI__Group_1__3__Impl ;
    public final void rule__URI__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1888:1: ( rule__URI__Group_1__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1889:2: rule__URI__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33817);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1895:1: rule__URI__Group_1__3__Impl : ( ( RULE_ANY_OTHER )* ) ;
    public final void rule__URI__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1899:1: ( ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1900:1: ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1900:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1901:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1902:1: ( RULE_ANY_OTHER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANY_OTHER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1902:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3845); 

            	    }
            	    break;

            	default :
            	    break loop14;
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


    // $ANTLR start "rule__XplatformHeader__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1920:1: rule__XplatformHeader__Group__0 : rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 ;
    public final void rule__XplatformHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1924:1: ( rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1925:2: rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03884);
            rule__XplatformHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03887);
            rule__XplatformHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__0"


    // $ANTLR start "rule__XplatformHeader__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1932:1: rule__XplatformHeader__Group__0__Impl : ( ( rule__XplatformHeader__NameAssignment_0 )? ) ;
    public final void rule__XplatformHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1936:1: ( ( ( rule__XplatformHeader__NameAssignment_0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1937:1: ( ( rule__XplatformHeader__NameAssignment_0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1937:1: ( ( rule__XplatformHeader__NameAssignment_0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1938:1: ( rule__XplatformHeader__NameAssignment_0 )?
            {
             before(grammarAccess.getXplatformHeaderAccess().getNameAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1939:1: ( rule__XplatformHeader__NameAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1939:2: rule__XplatformHeader__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__XplatformHeader__NameAssignment_0_in_rule__XplatformHeader__Group__0__Impl3914);
                    rule__XplatformHeader__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformHeaderAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__0__Impl"


    // $ANTLR start "rule__XplatformHeader__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1949:1: rule__XplatformHeader__Group__1 : rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 ;
    public final void rule__XplatformHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1953:1: ( rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1954:2: rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13945);
            rule__XplatformHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13948);
            rule__XplatformHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__1"


    // $ANTLR start "rule__XplatformHeader__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1961:1: rule__XplatformHeader__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1965:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1966:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1966:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1967:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__XplatformHeader__Group__1__Impl3976); 
             after(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__1__Impl"


    // $ANTLR start "rule__XplatformHeader__Group__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1980:1: rule__XplatformHeader__Group__2 : rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 ;
    public final void rule__XplatformHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1984:1: ( rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1985:2: rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__24007);
            rule__XplatformHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__24010);
            rule__XplatformHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__2"


    // $ANTLR start "rule__XplatformHeader__Group__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1992:1: rule__XplatformHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__XplatformHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1996:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1997:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1997:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1998:1: '{'
            {
             before(grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__XplatformHeader__Group__2__Impl4038); 
             after(grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__2__Impl"


    // $ANTLR start "rule__XplatformHeader__Group__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2011:1: rule__XplatformHeader__Group__3 : rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 ;
    public final void rule__XplatformHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2015:1: ( rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2016:2: rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__34069);
            rule__XplatformHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__34072);
            rule__XplatformHeader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__3"


    // $ANTLR start "rule__XplatformHeader__Group__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2023:1: rule__XplatformHeader__Group__3__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) ) ;
    public final void rule__XplatformHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2027:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2028:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2028:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2029:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2030:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2030:2: rule__XplatformHeader__HeaderKeyValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_in_rule__XplatformHeader__Group__3__Impl4099);
            rule__XplatformHeader__HeaderKeyValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__3__Impl"


    // $ANTLR start "rule__XplatformHeader__Group__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2040:1: rule__XplatformHeader__Group__4 : rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 ;
    public final void rule__XplatformHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2044:1: ( rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2045:2: rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__44129);
            rule__XplatformHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__44132);
            rule__XplatformHeader__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__4"


    // $ANTLR start "rule__XplatformHeader__Group__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2052:1: rule__XplatformHeader__Group__4__Impl : ( ( rule__XplatformHeader__Group_4__0 )* ) ;
    public final void rule__XplatformHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2056:1: ( ( ( rule__XplatformHeader__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2057:1: ( ( rule__XplatformHeader__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2057:1: ( ( rule__XplatformHeader__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2058:1: ( rule__XplatformHeader__Group_4__0 )*
            {
             before(grammarAccess.getXplatformHeaderAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2059:1: ( rule__XplatformHeader__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_STRING) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2059:2: rule__XplatformHeader__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__XplatformHeader__Group_4__0_in_rule__XplatformHeader__Group__4__Impl4159);
            	    rule__XplatformHeader__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getXplatformHeaderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__4__Impl"


    // $ANTLR start "rule__XplatformHeader__Group__5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2069:1: rule__XplatformHeader__Group__5 : rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 ;
    public final void rule__XplatformHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2073:1: ( rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2074:2: rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__54190);
            rule__XplatformHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__54193);
            rule__XplatformHeader__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__5"


    // $ANTLR start "rule__XplatformHeader__Group__5__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2081:1: rule__XplatformHeader__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__XplatformHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2085:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2086:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2086:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2087:1: ( ',' )?
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2088:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2089:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__XplatformHeader__Group__5__Impl4222); 

                    }
                    break;

            }

             after(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__5__Impl"


    // $ANTLR start "rule__XplatformHeader__Group__6"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2100:1: rule__XplatformHeader__Group__6 : rule__XplatformHeader__Group__6__Impl rule__XplatformHeader__Group__7 ;
    public final void rule__XplatformHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2104:1: ( rule__XplatformHeader__Group__6__Impl rule__XplatformHeader__Group__7 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2105:2: rule__XplatformHeader__Group__6__Impl rule__XplatformHeader__Group__7
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__64255);
            rule__XplatformHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__7_in_rule__XplatformHeader__Group__64258);
            rule__XplatformHeader__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__6"


    // $ANTLR start "rule__XplatformHeader__Group__6__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2112:1: rule__XplatformHeader__Group__6__Impl : ( '}' ) ;
    public final void rule__XplatformHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2116:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2117:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2117:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2118:1: '}'
            {
             before(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__XplatformHeader__Group__6__Impl4286); 
             after(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__6__Impl"


    // $ANTLR start "rule__XplatformHeader__Group__7"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2131:1: rule__XplatformHeader__Group__7 : rule__XplatformHeader__Group__7__Impl ;
    public final void rule__XplatformHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2135:1: ( rule__XplatformHeader__Group__7__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2136:2: rule__XplatformHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__7__Impl_in_rule__XplatformHeader__Group__74317);
            rule__XplatformHeader__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__7"


    // $ANTLR start "rule__XplatformHeader__Group__7__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2142:1: rule__XplatformHeader__Group__7__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2146:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2147:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2147:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2148:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__XplatformHeader__Group__7__Impl4345); 
             after(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group__7__Impl"


    // $ANTLR start "rule__XplatformHeader__Group_4__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2177:1: rule__XplatformHeader__Group_4__0 : rule__XplatformHeader__Group_4__0__Impl rule__XplatformHeader__Group_4__1 ;
    public final void rule__XplatformHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2181:1: ( rule__XplatformHeader__Group_4__0__Impl rule__XplatformHeader__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2182:2: rule__XplatformHeader__Group_4__0__Impl rule__XplatformHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_4__0__Impl_in_rule__XplatformHeader__Group_4__04392);
            rule__XplatformHeader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group_4__1_in_rule__XplatformHeader__Group_4__04395);
            rule__XplatformHeader__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_4__0"


    // $ANTLR start "rule__XplatformHeader__Group_4__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2189:1: rule__XplatformHeader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__XplatformHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2193:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2194:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2194:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2195:1: ','
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__XplatformHeader__Group_4__0__Impl4423); 
             after(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_4__0__Impl"


    // $ANTLR start "rule__XplatformHeader__Group_4__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2208:1: rule__XplatformHeader__Group_4__1 : rule__XplatformHeader__Group_4__1__Impl ;
    public final void rule__XplatformHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2212:1: ( rule__XplatformHeader__Group_4__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2213:2: rule__XplatformHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_4__1__Impl_in_rule__XplatformHeader__Group_4__14454);
            rule__XplatformHeader__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_4__1"


    // $ANTLR start "rule__XplatformHeader__Group_4__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2219:1: rule__XplatformHeader__Group_4__1__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) ) ;
    public final void rule__XplatformHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2223:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2224:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2224:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2225:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2226:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2226:2: rule__XplatformHeader__HeaderKeyValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_4_1_in_rule__XplatformHeader__Group_4__1__Impl4481);
            rule__XplatformHeader__HeaderKeyValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_4__1__Impl"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2240:1: rule__XplatformHeaderKeyValuePair__Group__0 : rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2244:1: ( rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2245:2: rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__04515);
            rule__XplatformHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__04518);
            rule__XplatformHeaderKeyValuePair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__Group__0"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2252:1: rule__XplatformHeaderKeyValuePair__Group__0__Impl : ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2256:1: ( ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2257:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2257:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2258:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2259:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2259:2: rule__XplatformHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl4545);
            rule__XplatformHeaderKeyValuePair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__Group__0__Impl"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2269:1: rule__XplatformHeaderKeyValuePair__Group__1 : rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2273:1: ( rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2274:2: rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__14575);
            rule__XplatformHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__14578);
            rule__XplatformHeaderKeyValuePair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__Group__1"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2281:1: rule__XplatformHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2285:1: ( ( '=' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2286:1: ( '=' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2286:1: ( '=' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2287:1: '='
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl4606); 
             after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__Group__1__Impl"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2300:1: rule__XplatformHeaderKeyValuePair__Group__2 : rule__XplatformHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2304:1: ( rule__XplatformHeaderKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2305:2: rule__XplatformHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__24637);
            rule__XplatformHeaderKeyValuePair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__Group__2"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2311:1: rule__XplatformHeaderKeyValuePair__Group__2__Impl : ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2315:1: ( ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2316:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2316:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2317:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2318:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2318:2: rule__XplatformHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl4664);
            rule__XplatformHeaderKeyValuePair__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__Group__2__Impl"


    // $ANTLR start "rule__XplatformJson__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2334:1: rule__XplatformJson__Group__0 : rule__XplatformJson__Group__0__Impl rule__XplatformJson__Group__1 ;
    public final void rule__XplatformJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2338:1: ( rule__XplatformJson__Group__0__Impl rule__XplatformJson__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2339:2: rule__XplatformJson__Group__0__Impl rule__XplatformJson__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group__0__Impl_in_rule__XplatformJson__Group__04700);
            rule__XplatformJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group__1_in_rule__XplatformJson__Group__04703);
            rule__XplatformJson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__0"


    // $ANTLR start "rule__XplatformJson__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2346:1: rule__XplatformJson__Group__0__Impl : ( ( rule__XplatformJson__NameAssignment_0 ) ) ;
    public final void rule__XplatformJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2350:1: ( ( ( rule__XplatformJson__NameAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2351:1: ( ( rule__XplatformJson__NameAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2351:1: ( ( rule__XplatformJson__NameAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2352:1: ( rule__XplatformJson__NameAssignment_0 )
            {
             before(grammarAccess.getXplatformJsonAccess().getNameAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2353:1: ( rule__XplatformJson__NameAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2353:2: rule__XplatformJson__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__XplatformJson__NameAssignment_0_in_rule__XplatformJson__Group__0__Impl4730);
            rule__XplatformJson__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__0__Impl"


    // $ANTLR start "rule__XplatformJson__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2363:1: rule__XplatformJson__Group__1 : rule__XplatformJson__Group__1__Impl rule__XplatformJson__Group__2 ;
    public final void rule__XplatformJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2367:1: ( rule__XplatformJson__Group__1__Impl rule__XplatformJson__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2368:2: rule__XplatformJson__Group__1__Impl rule__XplatformJson__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group__1__Impl_in_rule__XplatformJson__Group__14760);
            rule__XplatformJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group__2_in_rule__XplatformJson__Group__14763);
            rule__XplatformJson__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__1"


    // $ANTLR start "rule__XplatformJson__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2375:1: rule__XplatformJson__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2379:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2380:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2380:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2381:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__XplatformJson__Group__1__Impl4791); 
             after(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__1__Impl"


    // $ANTLR start "rule__XplatformJson__Group__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2394:1: rule__XplatformJson__Group__2 : rule__XplatformJson__Group__2__Impl rule__XplatformJson__Group__3 ;
    public final void rule__XplatformJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2398:1: ( rule__XplatformJson__Group__2__Impl rule__XplatformJson__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2399:2: rule__XplatformJson__Group__2__Impl rule__XplatformJson__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group__2__Impl_in_rule__XplatformJson__Group__24822);
            rule__XplatformJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group__3_in_rule__XplatformJson__Group__24825);
            rule__XplatformJson__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__2"


    // $ANTLR start "rule__XplatformJson__Group__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2406:1: rule__XplatformJson__Group__2__Impl : ( ( rule__XplatformJson__ValueAssignment_2 ) ) ;
    public final void rule__XplatformJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2410:1: ( ( ( rule__XplatformJson__ValueAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2411:1: ( ( rule__XplatformJson__ValueAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2411:1: ( ( rule__XplatformJson__ValueAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2412:1: ( rule__XplatformJson__ValueAssignment_2 )
            {
             before(grammarAccess.getXplatformJsonAccess().getValueAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2413:1: ( rule__XplatformJson__ValueAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2413:2: rule__XplatformJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__XplatformJson__ValueAssignment_2_in_rule__XplatformJson__Group__2__Impl4852);
            rule__XplatformJson__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__2__Impl"


    // $ANTLR start "rule__XplatformJson__Group__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2423:1: rule__XplatformJson__Group__3 : rule__XplatformJson__Group__3__Impl ;
    public final void rule__XplatformJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2427:1: ( rule__XplatformJson__Group__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2428:2: rule__XplatformJson__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group__3__Impl_in_rule__XplatformJson__Group__34882);
            rule__XplatformJson__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__3"


    // $ANTLR start "rule__XplatformJson__Group__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2434:1: rule__XplatformJson__Group__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2438:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2439:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2439:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2440:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__XplatformJson__Group__3__Impl4910); 
             after(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group__3__Impl"


    // $ANTLR start "rule__JsonObject__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2461:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2465:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2466:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__04949);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__04952);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2473:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2477:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2478:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2478:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2479:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__JsonObject__Group__0__Impl4980); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2492:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2496:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2497:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15011);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15014);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2504:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2508:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2509:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2509:1: ( ( rule__JsonObject__KeyValuePairAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2510:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2511:1: ( rule__JsonObject__KeyValuePairAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2511:2: rule__JsonObject__KeyValuePairAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl5041);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2521:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2525:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2526:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25071);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25074);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2533:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )* ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2537:1: ( ( ( rule__JsonObject__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2538:1: ( ( rule__JsonObject__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2538:1: ( ( rule__JsonObject__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2539:1: ( rule__JsonObject__Group_2__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2540:1: ( rule__JsonObject__Group_2__0 )*
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
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2540:2: rule__JsonObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5101);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2550:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2554:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2555:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35132);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35135);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2562:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2566:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2567:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2567:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2568:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2569:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2570:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__JsonObject__Group__3__Impl5164); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2581:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2585:1: ( rule__JsonObject__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2586:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45197);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2592:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2596:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2597:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2597:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2598:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__JsonObject__Group__4__Impl5225); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2621:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2625:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2626:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05266);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05269);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2633:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2637:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2638:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2638:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2639:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__JsonObject__Group_2__0__Impl5297); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2652:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2656:1: ( rule__JsonObject__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2657:2: rule__JsonObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15328);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2663:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2667:1: ( ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2668:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2668:1: ( ( rule__JsonObject__KeyValuePairAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2669:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2670:1: ( rule__JsonObject__KeyValuePairAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2670:2: rule__JsonObject__KeyValuePairAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5355);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2684:1: rule__JsonKeyValuePair__Group__0 : rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 ;
    public final void rule__JsonKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2688:1: ( rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2689:2: rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05389);
            rule__JsonKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05392);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2696:1: rule__JsonKeyValuePair__Group__0__Impl : ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2700:1: ( ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2701:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2701:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2702:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2703:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2703:2: rule__JsonKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5419);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2713:1: rule__JsonKeyValuePair__Group__1 : rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 ;
    public final void rule__JsonKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2717:1: ( rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2718:2: rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15449);
            rule__JsonKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15452);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2725:1: rule__JsonKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2729:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2730:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2730:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2731:1: ':'
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__JsonKeyValuePair__Group__1__Impl5480); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2744:1: rule__JsonKeyValuePair__Group__2 : rule__JsonKeyValuePair__Group__2__Impl ;
    public final void rule__JsonKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2748:1: ( rule__JsonKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2749:2: rule__JsonKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25511);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2755:1: rule__JsonKeyValuePair__Group__2__Impl : ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2759:1: ( ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2760:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2760:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2761:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2762:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2762:2: rule__JsonKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5538);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2778:1: rule__JsonArray__Group__0 : rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 ;
    public final void rule__JsonArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2782:1: ( rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2783:2: rule__JsonArray__Group__0__Impl rule__JsonArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05574);
            rule__JsonArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05577);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2790:1: rule__JsonArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2794:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2795:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2795:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2796:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__JsonArray__Group__0__Impl5605); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2809:1: rule__JsonArray__Group__1 : rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 ;
    public final void rule__JsonArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2813:1: ( rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2814:2: rule__JsonArray__Group__1__Impl rule__JsonArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15636);
            rule__JsonArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15639);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2821:1: rule__JsonArray__Group__1__Impl : ( ( rule__JsonArray__ItemsAssignment_1 ) ) ;
    public final void rule__JsonArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2825:1: ( ( ( rule__JsonArray__ItemsAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2826:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2826:1: ( ( rule__JsonArray__ItemsAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2827:1: ( rule__JsonArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2828:1: ( rule__JsonArray__ItemsAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2828:2: rule__JsonArray__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5666);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2838:1: rule__JsonArray__Group__2 : rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 ;
    public final void rule__JsonArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2842:1: ( rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2843:2: rule__JsonArray__Group__2__Impl rule__JsonArray__Group__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25696);
            rule__JsonArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25699);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2850:1: rule__JsonArray__Group__2__Impl : ( ( rule__JsonArray__Group_2__0 )* ) ;
    public final void rule__JsonArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2854:1: ( ( ( rule__JsonArray__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2855:1: ( ( rule__JsonArray__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2855:1: ( ( rule__JsonArray__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2856:1: ( rule__JsonArray__Group_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2857:1: ( rule__JsonArray__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    int LA20_1 = input.LA(2);

                    if ( ((LA20_1>=RULE_EMPTY_JSON_OBJECT && LA20_1<=RULE_STRING)||LA20_1==20||LA20_1==37) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2857:2: rule__JsonArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5726);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2867:1: rule__JsonArray__Group__3 : rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 ;
    public final void rule__JsonArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2871:1: ( rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2872:2: rule__JsonArray__Group__3__Impl rule__JsonArray__Group__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35757);
            rule__JsonArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35760);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2879:1: rule__JsonArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2883:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2884:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2884:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2885:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2886:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2887:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__JsonArray__Group__3__Impl5789); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2898:1: rule__JsonArray__Group__4 : rule__JsonArray__Group__4__Impl ;
    public final void rule__JsonArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2902:1: ( rule__JsonArray__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2903:2: rule__JsonArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__45822);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2909:1: rule__JsonArray__Group__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2913:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2914:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2914:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2915:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__JsonArray__Group__4__Impl5850); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2938:1: rule__JsonArray__Group_2__0 : rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 ;
    public final void rule__JsonArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2942:1: ( rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2943:2: rule__JsonArray__Group_2__0__Impl rule__JsonArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__05891);
            rule__JsonArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__05894);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2950:1: rule__JsonArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2954:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2955:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2955:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2956:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__JsonArray__Group_2__0__Impl5922); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2969:1: rule__JsonArray__Group_2__1 : rule__JsonArray__Group_2__1__Impl ;
    public final void rule__JsonArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2973:1: ( rule__JsonArray__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2974:2: rule__JsonArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__15953);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2980:1: rule__JsonArray__Group_2__1__Impl : ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__JsonArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2984:1: ( ( ( rule__JsonArray__ItemsAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2985:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2985:1: ( ( rule__JsonArray__ItemsAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2986:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getItemsAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2987:1: ( rule__JsonArray__ItemsAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2987:2: rule__JsonArray__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl5980);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3001:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3005:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3006:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06014);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06017);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3013:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3017:1: ( ( 'enum' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3018:1: ( 'enum' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3018:1: ( 'enum' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3019:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__EnumInstance__Group__0__Impl6045); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3032:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3036:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3037:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16076);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16079);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3044:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3048:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3049:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3049:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3050:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3051:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3051:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6106);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3061:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3065:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3066:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26136);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26139);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3073:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3077:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3078:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3078:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3079:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__EnumInstance__Group__2__Impl6167); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3092:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3096:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3097:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36198);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36201);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3104:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3108:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3109:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3109:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3110:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3111:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3111:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6228);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3121:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3125:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3126:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46258);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46261);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3133:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3137:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3138:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3138:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3139:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3140:1: ( rule__EnumInstance__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_ID) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3140:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6288);
            	    rule__EnumInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3150:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3154:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3155:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56319);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56322);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3162:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3166:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3167:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3167:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3168:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3169:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3170:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__EnumInstance__Group__5__Impl6351); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3181:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3185:1: ( rule__EnumInstance__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3186:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66384);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3192:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3196:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3197:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3197:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3198:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__EnumInstance__Group__6__Impl6412); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3225:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3229:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3230:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06457);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06460);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3237:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3241:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3242:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3242:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3243:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__EnumInstance__Group_4__0__Impl6488); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3256:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3260:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3261:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16519);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3267:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3271:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3272:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3272:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3273:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3274:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3274:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6546);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3288:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3292:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3293:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06580);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06583);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3300:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3304:1: ( ( 'map' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3305:1: ( 'map' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3305:1: ( 'map' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3306:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__MapInstance__Group__0__Impl6611); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3319:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3323:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3324:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16642);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16645);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3331:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__NameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3335:1: ( ( ( rule__MapInstance__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3336:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3336:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3337:1: ( rule__MapInstance__NameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3338:1: ( rule__MapInstance__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3338:2: rule__MapInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6672);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3348:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3352:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3353:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26702);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26705);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3360:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3364:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3365:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3365:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3366:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MapInstance__Group__2__Impl6733); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3379:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3383:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3384:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36764);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36767);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3391:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__Group_3__0 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3395:1: ( ( ( rule__MapInstance__Group_3__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3396:1: ( ( rule__MapInstance__Group_3__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3396:1: ( ( rule__MapInstance__Group_3__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3397:1: ( rule__MapInstance__Group_3__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3398:1: ( rule__MapInstance__Group_3__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3398:2: rule__MapInstance__Group_3__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6794);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3408:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3412:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3413:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__46824);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__46827);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3420:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3424:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3425:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3425:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3426:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3427:1: ( rule__MapInstance__Group_4__0 )*
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
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3427:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl6854);
            	    rule__MapInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3437:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3441:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3442:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__56885);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__56888);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3449:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3453:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3454:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3454:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3455:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3456:1: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3457:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__MapInstance__Group__5__Impl6917); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3468:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3472:1: ( rule__MapInstance__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3473:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__66950);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3479:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3483:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3484:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3484:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3485:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__MapInstance__Group__6__Impl6978); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3512:1: rule__MapInstance__Group_3__0 : rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 ;
    public final void rule__MapInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3516:1: ( rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3517:2: rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07023);
            rule__MapInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07026);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3524:1: rule__MapInstance__Group_3__0__Impl : ( ( rule__MapInstance__KeysAssignment_3_0 ) ) ;
    public final void rule__MapInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3528:1: ( ( ( rule__MapInstance__KeysAssignment_3_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3529:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3529:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3530:1: ( rule__MapInstance__KeysAssignment_3_0 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3531:1: ( rule__MapInstance__KeysAssignment_3_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3531:2: rule__MapInstance__KeysAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7053);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3541:1: rule__MapInstance__Group_3__1 : rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 ;
    public final void rule__MapInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3545:1: ( rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3546:2: rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17083);
            rule__MapInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17086);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3553:1: rule__MapInstance__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3557:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3558:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3558:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3559:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__MapInstance__Group_3__1__Impl7114); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3572:1: rule__MapInstance__Group_3__2 : rule__MapInstance__Group_3__2__Impl ;
    public final void rule__MapInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3576:1: ( rule__MapInstance__Group_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3577:2: rule__MapInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27145);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3583:1: rule__MapInstance__Group_3__2__Impl : ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) ;
    public final void rule__MapInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3587:1: ( ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3588:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3588:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3589:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3590:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3590:2: rule__MapInstance__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7172);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3606:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3610:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3611:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07208);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07211);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3618:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3622:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3623:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3623:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3624:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__MapInstance__Group_4__0__Impl7239); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3637:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3641:1: ( rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3642:2: rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17270);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17273);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3649:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__KeysAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3653:1: ( ( ( rule__MapInstance__KeysAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3654:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3654:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3655:1: ( rule__MapInstance__KeysAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3656:1: ( rule__MapInstance__KeysAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3656:2: rule__MapInstance__KeysAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7300);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3666:1: rule__MapInstance__Group_4__2 : rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 ;
    public final void rule__MapInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3670:1: ( rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3671:2: rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27330);
            rule__MapInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27333);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3678:1: rule__MapInstance__Group_4__2__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3682:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3683:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3683:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3684:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 
            match(input,24,FOLLOW_24_in_rule__MapInstance__Group_4__2__Impl7361); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3697:1: rule__MapInstance__Group_4__3 : rule__MapInstance__Group_4__3__Impl ;
    public final void rule__MapInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3701:1: ( rule__MapInstance__Group_4__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3702:2: rule__MapInstance__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37392);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3708:1: rule__MapInstance__Group_4__3__Impl : ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) ;
    public final void rule__MapInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3712:1: ( ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3713:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3713:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3714:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3715:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3715:2: rule__MapInstance__ValuesAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7419);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3733:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3737:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3738:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07457);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07460);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3745:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3749:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3750:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3750:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3751:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__StringList__Group__0__Impl7488); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3764:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3768:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3769:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17519);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17522);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3776:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3780:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3781:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3781:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3782:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3783:1: ( rule__StringList__ValuesAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3783:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7549);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3793:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3797:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3798:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27579);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27582);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3805:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3809:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3810:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3810:1: ( ( rule__StringList__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3811:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3812:1: ( rule__StringList__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_STRING) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3812:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7609);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3822:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3826:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3827:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37640);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37643);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3834:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3838:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3839:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3839:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3840:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3841:1: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3842:2: ','
                    {
                    match(input,35,FOLLOW_35_in_rule__StringList__Group__3__Impl7672); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3853:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3857:1: ( rule__StringList__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3858:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47705);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3864:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3868:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3869:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3869:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3870:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__StringList__Group__4__Impl7733); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3893:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3897:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3898:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07774);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07777);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3905:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3909:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3910:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3910:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3911:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__StringList__Group_2__0__Impl7805); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3924:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3928:1: ( rule__StringList__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3929:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__17836);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3935:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3939:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3940:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3940:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3941:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3942:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3942:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl7863);
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


    // $ANTLR start "rule__Xplatform__PlatformAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3957:1: rule__Xplatform__PlatformAssignment_0 : ( rulePlatform ) ;
    public final void rule__Xplatform__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3961:1: ( ( rulePlatform ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3962:1: ( rulePlatform )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3962:1: ( rulePlatform )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3963:1: rulePlatform
            {
             before(grammarAccess.getXplatformAccess().getPlatformPlatformParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePlatform_in_rule__Xplatform__PlatformAssignment_07902);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getPlatformPlatformParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__PlatformAssignment_0"


    // $ANTLR start "rule__Xplatform__ResourcesAssignment_1_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3972:1: rule__Xplatform__ResourcesAssignment_1_0 : ( ruleXplatformResourceDefinition ) ;
    public final void rule__Xplatform__ResourcesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3976:1: ( ( ruleXplatformResourceDefinition ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3977:1: ( ruleXplatformResourceDefinition )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3977:1: ( ruleXplatformResourceDefinition )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3978:1: ruleXplatformResourceDefinition
            {
             before(grammarAccess.getXplatformAccess().getResourcesXplatformResourceDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_rule__Xplatform__ResourcesAssignment_1_07933);
            ruleXplatformResourceDefinition();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getResourcesXplatformResourceDefinitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__ResourcesAssignment_1_0"


    // $ANTLR start "rule__Xplatform__CallsAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3987:1: rule__Xplatform__CallsAssignment_1_1 : ( ruleXplatformCallDefinition ) ;
    public final void rule__Xplatform__CallsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3991:1: ( ( ruleXplatformCallDefinition ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3992:1: ( ruleXplatformCallDefinition )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3992:1: ( ruleXplatformCallDefinition )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3993:1: ruleXplatformCallDefinition
            {
             before(grammarAccess.getXplatformAccess().getCallsXplatformCallDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleXplatformCallDefinition_in_rule__Xplatform__CallsAssignment_1_17964);
            ruleXplatformCallDefinition();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getCallsXplatformCallDefinitionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__CallsAssignment_1_1"


    // $ANTLR start "rule__Platform__PlatformsAssignment_2_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4002:1: rule__Platform__PlatformsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Platform__PlatformsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4006:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4007:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4007:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4008:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_07995); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4017:1: rule__Platform__GenerateWhereAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Platform__GenerateWhereAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4021:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4022:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4022:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4023:1: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getGenerateWhereSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_28026); 
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


    // $ANTLR start "rule__XplatformCallDefinition__NameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4032:1: rule__XplatformCallDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XplatformCallDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4036:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4037:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4037:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4038:1: RULE_ID
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XplatformCallDefinition__NameAssignment_18057); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__NameAssignment_1"


    // $ANTLR start "rule__XplatformCallDefinition__MethodAssignment_3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4047:1: rule__XplatformCallDefinition__MethodAssignment_3 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__XplatformCallDefinition__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4051:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4052:1: ( RULE_RESTFUL_METHODS )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4052:1: ( RULE_RESTFUL_METHODS )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4053:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__XplatformCallDefinition__MethodAssignment_38088); 
             after(grammarAccess.getXplatformCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__MethodAssignment_3"


    // $ANTLR start "rule__XplatformCallDefinition__UriAssignment_5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4062:1: rule__XplatformCallDefinition__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__XplatformCallDefinition__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4066:1: ( ( ruleURI ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4067:1: ( ruleURI )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4067:1: ( ruleURI )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4068:1: ruleURI
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__XplatformCallDefinition__UriAssignment_58119);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getXplatformCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__UriAssignment_5"


    // $ANTLR start "rule__XplatformCallDefinition__RequestHeadersAssignment_6_4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4077:1: rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 : ( ruleXplatformHeader ) ;
    public final void rule__XplatformCallDefinition__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4081:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4082:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4082:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4083:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__RequestHeadersAssignment_6_48150);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__RequestHeadersAssignment_6_4"


    // $ANTLR start "rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4092:1: rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 : ( ruleXplatformHeader ) ;
    public final void rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4096:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4097:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4097:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4098:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_28181);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2"


    // $ANTLR start "rule__XplatformCallDefinition__JsonToClientAssignment_7_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4107:1: rule__XplatformCallDefinition__JsonToClientAssignment_7_2 : ( ruleXplatformJson ) ;
    public final void rule__XplatformCallDefinition__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4111:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4112:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4112:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4113:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToClientAssignment_7_28212);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__JsonToClientAssignment_7_2"


    // $ANTLR start "rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4122:1: rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 : ( ruleXplatformJson ) ;
    public final void rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4126:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4127:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4127:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4128:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_28243);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2"


    // $ANTLR start "rule__URI__ParametersAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4137:1: rule__URI__ParametersAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__URI__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4141:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4142:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4142:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4143:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getParametersIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__ParametersAssignment_1_18274); 
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


    // $ANTLR start "rule__XplatformHeader__NameAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4152:1: rule__XplatformHeader__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XplatformHeader__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4156:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4157:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4157:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4158:1: RULE_ID
            {
             before(grammarAccess.getXplatformHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XplatformHeader__NameAssignment_08305); 
             after(grammarAccess.getXplatformHeaderAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__NameAssignment_0"


    // $ANTLR start "rule__XplatformHeader__HeaderKeyValuesAssignment_3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4167:1: rule__XplatformHeader__HeaderKeyValuesAssignment_3 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4171:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4172:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4172:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4173:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_38336);
            ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__HeaderKeyValuesAssignment_3"


    // $ANTLR start "rule__XplatformHeader__HeaderKeyValuesAssignment_4_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4182:1: rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4186:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4187:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4187:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4188:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_4_18367);
            ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__HeaderKeyValuesAssignment_4_1"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__KeyAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4197:1: rule__XplatformHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4201:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4202:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4202:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4203:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_08398); 
             after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__KeyAssignment_0"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4212:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4216:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4217:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4217:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4218:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_08429); 
             after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4227:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 : ( RULE_XPLATFORM_HEADER_PARAMETER ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4231:1: ( ( RULE_XPLATFORM_HEADER_PARAMETER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4232:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4232:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4233:1: RULE_XPLATFORM_HEADER_PARAMETER
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
            match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_18460); 
             after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1"


    // $ANTLR start "rule__XplatformJson__NameAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4242:1: rule__XplatformJson__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XplatformJson__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4246:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4247:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4247:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4248:1: RULE_ID
            {
             before(grammarAccess.getXplatformJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XplatformJson__NameAssignment_08491); 
             after(grammarAccess.getXplatformJsonAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__NameAssignment_0"


    // $ANTLR start "rule__XplatformJson__ValueAssignment_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4257:1: rule__XplatformJson__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__XplatformJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4261:1: ( ( ruleJsonObjectValue ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4262:1: ( ruleJsonObjectValue )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4262:1: ( ruleJsonObjectValue )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4263:1: ruleJsonObjectValue
            {
             before(grammarAccess.getXplatformJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__XplatformJson__ValueAssignment_28522);
            ruleJsonObjectValue();

            state._fsp--;

             after(grammarAccess.getXplatformJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__ValueAssignment_2"


    // $ANTLR start "rule__JsonObjectValue__ValueAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4272:1: rule__JsonObjectValue__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonObjectValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4276:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4277:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4277:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4278:1: RULE_STRING
            {
             before(grammarAccess.getJsonObjectValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonObjectValue__ValueAssignment_08553); 
             after(grammarAccess.getJsonObjectValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4287:1: rule__JsonObject__KeyValuePairAssignment_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4291:1: ( ( ruleJsonKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4292:1: ( ruleJsonKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4292:1: ( ruleJsonKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4293:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_18584);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4302:1: rule__JsonObject__KeyValuePairAssignment_2_1 : ( ruleJsonKeyValuePair ) ;
    public final void rule__JsonObject__KeyValuePairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4306:1: ( ( ruleJsonKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4307:1: ( ruleJsonKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4307:1: ( ruleJsonKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4308:1: ruleJsonKeyValuePair
            {
             before(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_18615);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4317:1: rule__JsonKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4321:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4322:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4322:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4323:1: RULE_STRING
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08646); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4332:1: rule__JsonKeyValuePair__ValueAssignment_2 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4336:1: ( ( ruleJsonObjectValue ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4337:1: ( ruleJsonObjectValue )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4337:1: ( ruleJsonObjectValue )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4338:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28677);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4347:1: rule__JsonArray__ItemsAssignment_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4351:1: ( ( ruleJsonObjectValue ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4352:1: ( ruleJsonObjectValue )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4352:1: ( ruleJsonObjectValue )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4353:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_18708);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4362:1: rule__JsonArray__ItemsAssignment_2_1 : ( ruleJsonObjectValue ) ;
    public final void rule__JsonArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4366:1: ( ( ruleJsonObjectValue ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4367:1: ( ruleJsonObjectValue )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4367:1: ( ruleJsonObjectValue )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4368:1: ruleJsonObjectValue
            {
             before(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_18739);
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


    // $ANTLR start "rule__XplatformResourceDefinition__ResourcesAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4377:1: rule__XplatformResourceDefinition__ResourcesAssignment_0 : ( ruleMapInstance ) ;
    public final void rule__XplatformResourceDefinition__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4381:1: ( ( ruleMapInstance ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4382:1: ( ruleMapInstance )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4382:1: ( ruleMapInstance )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4383:1: ruleMapInstance
            {
             before(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMapInstance_in_rule__XplatformResourceDefinition__ResourcesAssignment_08770);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformResourceDefinition__ResourcesAssignment_0"


    // $ANTLR start "rule__EnumInstance__NameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4392:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4396:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4397:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4397:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4398:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_18801); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4407:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4411:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4412:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4412:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4413:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_38832); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4422:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4426:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4427:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4427:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4428:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_18863); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4437:1: rule__MapInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4441:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4442:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4442:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4443:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_18894); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4452:1: rule__MapInstance__KeysAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4456:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4457:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4457:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4458:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_08925); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4467:1: rule__MapInstance__ValuesAssignment_3_2 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4471:1: ( ( ruleNestedType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4472:1: ( ruleNestedType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4472:1: ( ruleNestedType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4473:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_28956);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4482:1: rule__MapInstance__KeysAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4486:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4487:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4487:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4488:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_18987); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4497:1: rule__MapInstance__ValuesAssignment_4_3 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4501:1: ( ( ruleNestedType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4502:1: ( ruleNestedType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4502:1: ( ruleNestedType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4503:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39018);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4512:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4516:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4517:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4517:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4518:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19049); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4527:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4531:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4532:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4532:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4533:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19080); 
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


 

    public static final BitSet FOLLOW_ruleXplatform_in_entryRuleXplatform61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatform68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__0_in_ruleXplatform94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0_in_rulePlatform154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_entryRuleXplatformCallDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformCallDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__0_in_ruleXplatformCallDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__0_in_ruleXplatformHeader334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0_in_ruleXplatformHeaderKeyValuePair394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__0_in_ruleXplatformJson454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__Alternatives_in_ruleJsonObjectValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0_in_ruleJsonArray694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformResourceDefinition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResourceDefinition__Alternatives_in_ruleXplatformResourceDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0_in_ruleStringList934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__ResourcesAssignment_1_0_in_rule__Xplatform__Alternatives_11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__CallsAssignment_1_1_in_rule__Xplatform__Alternatives_11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_21081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_21099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObjectValue__ValueAssignment_0_in_rule__JsonObjectValue__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__JsonObjectValue__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonObjectValue__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_rule__JsonObjectValue__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_rule__JsonObjectValue__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonObjectValue__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonObjectValue__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_rule__JsonObjectValue__Alternatives1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_rule__JsonObjectValue__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResourceDefinition__ResourcesAssignment_0_in_rule__XplatformResourceDefinition__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__XplatformResourceDefinition__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NestedType__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__NestedType__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01398 = new BitSet(new long[]{0x0000018000800000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__PlatformAssignment_0_in_rule__Xplatform__Group__0__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1487 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1499 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__01536 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__01539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Platform__Group__0__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__11598 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__11601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Platform__Group__1__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__21660 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__21663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1692 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl1704 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__31737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Platform__Group__3__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__01804 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__01807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__11864 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Platform__Group_2__1__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__21926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__GenerateWhereAssignment_2_2_in_rule__Platform__Group_2__2__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__0__Impl_in_rule__XplatformCallDefinition__Group__01989 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__1_in_rule__XplatformCallDefinition__Group__01992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__XplatformCallDefinition__Group__0__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__1__Impl_in_rule__XplatformCallDefinition__Group__12051 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__2_in_rule__XplatformCallDefinition__Group__12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__NameAssignment_1_in_rule__XplatformCallDefinition__Group__1__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__2__Impl_in_rule__XplatformCallDefinition__Group__22111 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__3_in_rule__XplatformCallDefinition__Group__22114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__XplatformCallDefinition__Group__2__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__3__Impl_in_rule__XplatformCallDefinition__Group__32173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__4_in_rule__XplatformCallDefinition__Group__32176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__MethodAssignment_3_in_rule__XplatformCallDefinition__Group__3__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__4__Impl_in_rule__XplatformCallDefinition__Group__42233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__5_in_rule__XplatformCallDefinition__Group__42236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__XplatformCallDefinition__Group__4__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__5__Impl_in_rule__XplatformCallDefinition__Group__52295 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__6_in_rule__XplatformCallDefinition__Group__52298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__UriAssignment_5_in_rule__XplatformCallDefinition__Group__5__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__6__Impl_in_rule__XplatformCallDefinition__Group__62355 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__7_in_rule__XplatformCallDefinition__Group__62358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__0_in_rule__XplatformCallDefinition__Group__6__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__7__Impl_in_rule__XplatformCallDefinition__Group__72416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__0_in_rule__XplatformCallDefinition__Group__7__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__0__Impl_in_rule__XplatformCallDefinition__Group_6__02490 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__1_in_rule__XplatformCallDefinition__Group_6__02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__XplatformCallDefinition__Group_6__0__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__1__Impl_in_rule__XplatformCallDefinition__Group_6__12552 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__2_in_rule__XplatformCallDefinition__Group_6__12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__XplatformCallDefinition__Group_6__1__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__2__Impl_in_rule__XplatformCallDefinition__Group_6__22614 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__3_in_rule__XplatformCallDefinition__Group_6__22617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__XplatformCallDefinition__Group_6__2__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__3__Impl_in_rule__XplatformCallDefinition__Group_6__32676 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__4_in_rule__XplatformCallDefinition__Group_6__32679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__XplatformCallDefinition__Group_6__3__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__4__Impl_in_rule__XplatformCallDefinition__Group_6__42738 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__5_in_rule__XplatformCallDefinition__Group_6__42741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__RequestHeadersAssignment_6_4_in_rule__XplatformCallDefinition__Group_6__4__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__5__Impl_in_rule__XplatformCallDefinition__Group_6__52798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__0_in_rule__XplatformCallDefinition__Group_6__5__Impl2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__0__Impl_in_rule__XplatformCallDefinition__Group_6_5__02868 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__1_in_rule__XplatformCallDefinition__Group_6_5__02871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__XplatformCallDefinition__Group_6_5__0__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__1__Impl_in_rule__XplatformCallDefinition__Group_6_5__12930 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__2_in_rule__XplatformCallDefinition__Group_6_5__12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformCallDefinition__Group_6_5__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__2__Impl_in_rule__XplatformCallDefinition__Group_6_5__22992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__XplatformCallDefinition__Group_6_5__2__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__0__Impl_in_rule__XplatformCallDefinition__Group_7__03055 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__1_in_rule__XplatformCallDefinition__Group_7__03058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformCallDefinition__Group_7__0__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__1__Impl_in_rule__XplatformCallDefinition__Group_7__13117 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__2_in_rule__XplatformCallDefinition__Group_7__13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformCallDefinition__Group_7__1__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__2__Impl_in_rule__XplatformCallDefinition__Group_7__23179 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__3_in_rule__XplatformCallDefinition__Group_7__23182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__JsonToClientAssignment_7_2_in_rule__XplatformCallDefinition__Group_7__2__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__3__Impl_in_rule__XplatformCallDefinition__Group_7__33239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__0_in_rule__XplatformCallDefinition__Group_7__3__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__0__Impl_in_rule__XplatformCallDefinition__Group_7_3__03305 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__1_in_rule__XplatformCallDefinition__Group_7_3__03308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__XplatformCallDefinition__Group_7_3__0__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__1__Impl_in_rule__XplatformCallDefinition__Group_7_3__13367 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__2_in_rule__XplatformCallDefinition__Group_7_3__13370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformCallDefinition__Group_7_3__1__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__2__Impl_in_rule__XplatformCallDefinition__Group_7_3__23429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2_in_rule__XplatformCallDefinition__Group_7_3__2__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03492 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3525 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3538 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3598 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03633 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__URI__Group_1__0__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13695 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__ParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23755 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__URI__Group_1__2__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3845 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03884 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__NameAssignment_0_in_rule__XplatformHeader__Group__0__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13945 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__XplatformHeader__Group__1__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__24007 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__24010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__XplatformHeader__Group__2__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__34069 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__34072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_in_rule__XplatformHeader__Group__3__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__44129 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__44132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__0_in_rule__XplatformHeader__Group__4__Impl4159 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__54190 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__54193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__XplatformHeader__Group__5__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__64255 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__7_in_rule__XplatformHeader__Group__64258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__XplatformHeader__Group__6__Impl4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__7__Impl_in_rule__XplatformHeader__Group__74317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__XplatformHeader__Group__7__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__0__Impl_in_rule__XplatformHeader__Group_4__04392 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__1_in_rule__XplatformHeader__Group_4__04395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__XplatformHeader__Group_4__0__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__1__Impl_in_rule__XplatformHeader__Group_4__14454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_4_1_in_rule__XplatformHeader__Group_4__1__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__04515 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__04518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__14575 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__14578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__24637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__0__Impl_in_rule__XplatformJson__Group__04700 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__1_in_rule__XplatformJson__Group__04703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__NameAssignment_0_in_rule__XplatformJson__Group__0__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__1__Impl_in_rule__XplatformJson__Group__14760 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__2_in_rule__XplatformJson__Group__14763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__XplatformJson__Group__1__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__2__Impl_in_rule__XplatformJson__Group__24822 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__3_in_rule__XplatformJson__Group__24825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__ValueAssignment_2_in_rule__XplatformJson__Group__2__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group__3__Impl_in_rule__XplatformJson__Group__34882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__XplatformJson__Group__3__Impl4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__04949 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__04952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JsonObject__Group__0__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15011 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_1_in_rule__JsonObject__Group__1__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25071 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5101 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35132 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonObject__Group__3__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JsonObject__Group__4__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05266 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonObject__Group_2__0__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__15328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeyValuePairAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05389 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15449 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JsonKeyValuePair__Group__1__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__0__Impl_in_rule__JsonArray__Group__05574 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1_in_rule__JsonArray__Group__05577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__JsonArray__Group__0__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__1__Impl_in_rule__JsonArray__Group__15636 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2_in_rule__JsonArray__Group__15639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_1_in_rule__JsonArray__Group__1__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__2__Impl_in_rule__JsonArray__Group__25696 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3_in_rule__JsonArray__Group__25699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0_in_rule__JsonArray__Group__2__Impl5726 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__3__Impl_in_rule__JsonArray__Group__35757 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4_in_rule__JsonArray__Group__35760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group__3__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group__4__Impl_in_rule__JsonArray__Group__45822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__JsonArray__Group__4__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__0__Impl_in_rule__JsonArray__Group_2__05891 = new BitSet(new long[]{0x00000020001007F0L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1_in_rule__JsonArray__Group_2__05894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group_2__0__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_2__1__Impl_in_rule__JsonArray__Group_2__15953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ItemsAssignment_2_1_in_rule__JsonArray__Group_2__1__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__06014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__06017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumInstance__Group__0__Impl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__16076 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__16079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__26136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__26139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumInstance__Group__2__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__36198 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__36201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__46258 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__46261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl6288 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__56319 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__56322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumInstance__Group__5__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__66384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumInstance__Group__6__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__06457 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__06460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumInstance__Group_4__0__Impl6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__16519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__06580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__06583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MapInstance__Group__0__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__16642 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__16645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__26702 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__26705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MapInstance__Group__2__Impl6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__36764 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__36767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__46824 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__46827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl6854 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__56885 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__56888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MapInstance__Group__5__Impl6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__66950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MapInstance__Group__6__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__07023 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__07026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__17083 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__17086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapInstance__Group_3__1__Impl7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__27145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__07208 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__07211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MapInstance__Group_4__0__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__17270 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__17273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__27330 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__27333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapInstance__Group_4__2__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__37392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__07457 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__07460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__StringList__Group__0__Impl7488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__17519 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__17522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__27579 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__27582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl7609 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__37640 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__37643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringList__Group__3__Impl7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__47705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StringList__Group__4__Impl7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__07774 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__07777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringList__Group_2__0__Impl7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__17836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__Xplatform__PlatformAssignment_07902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_rule__Xplatform__ResourcesAssignment_1_07933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_rule__Xplatform__CallsAssignment_1_17964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_07995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Platform__GenerateWhereAssignment_2_28026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XplatformCallDefinition__NameAssignment_18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__XplatformCallDefinition__MethodAssignment_38088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__XplatformCallDefinition__UriAssignment_58119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__RequestHeadersAssignment_6_48150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_28181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToClientAssignment_7_28212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_28243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__ParametersAssignment_1_18274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XplatformHeader__NameAssignment_08305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_38336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_4_18367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_08398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_08429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_18460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XplatformJson__NameAssignment_08491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__XplatformJson__ValueAssignment_28522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonObjectValue__ValueAssignment_08553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_18584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_rule__JsonObject__KeyValuePairAssignment_2_18615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_08646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonKeyValuePair__ValueAssignment_28677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_18708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_rule__JsonArray__ItemsAssignment_2_18739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__XplatformResourceDefinition__ResourcesAssignment_08770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_18801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_38832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_18863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_18894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_08925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_28956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_18987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_39018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_19049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_19080 = new BitSet(new long[]{0x0000000000000002L});

}