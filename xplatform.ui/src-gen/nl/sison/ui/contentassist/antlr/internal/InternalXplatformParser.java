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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ANY_OTHER", "RULE_INT", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'boolean'", "'number'", "'string'", "'platform'", "'{'", "'}'", "'->'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'.'", "'enum'", "'map'"
    };
    public static final int RULE_ID=7;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_XPLATFORM_HEADER_PARAMETER=9;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=5;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=10;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RESTFUL_METHODS=8;
    public static final int RULE_INT=6;
    public static final int RULE_WS=14;

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:237:1: ruleXplatformJson : ( ( rule__XplatformJson__Alternatives ) ) ;
    public final void ruleXplatformJson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:241:2: ( ( ( rule__XplatformJson__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:242:1: ( ( rule__XplatformJson__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:242:1: ( ( rule__XplatformJson__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:243:1: ( rule__XplatformJson__Alternatives )
            {
             before(grammarAccess.getXplatformJsonAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:244:1: ( rule__XplatformJson__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:244:2: rule__XplatformJson__Alternatives
            {
            pushFollow(FOLLOW_rule__XplatformJson__Alternatives_in_ruleXplatformJson454);
            rule__XplatformJson__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleJsonMetaScalarType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:256:1: entryRuleJsonMetaScalarType : ruleJsonMetaScalarType EOF ;
    public final void entryRuleJsonMetaScalarType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:257:1: ( ruleJsonMetaScalarType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:258:1: ruleJsonMetaScalarType EOF
            {
             before(grammarAccess.getJsonMetaScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType481);
            ruleJsonMetaScalarType();

            state._fsp--;

             after(grammarAccess.getJsonMetaScalarTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaScalarType488); 

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
    // $ANTLR end "entryRuleJsonMetaScalarType"


    // $ANTLR start "ruleJsonMetaScalarType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:265:1: ruleJsonMetaScalarType : ( ( rule__JsonMetaScalarType__Alternatives ) ) ;
    public final void ruleJsonMetaScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:269:2: ( ( ( rule__JsonMetaScalarType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:270:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:270:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:271:1: ( rule__JsonMetaScalarType__Alternatives )
            {
             before(grammarAccess.getJsonMetaScalarTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:272:1: ( rule__JsonMetaScalarType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:272:2: rule__JsonMetaScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType514);
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


    // $ANTLR start "entryRuleJsonMetaArray"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:284:1: entryRuleJsonMetaArray : ruleJsonMetaArray EOF ;
    public final void entryRuleJsonMetaArray() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:285:1: ( ruleJsonMetaArray EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:286:1: ruleJsonMetaArray EOF
            {
             before(grammarAccess.getJsonMetaArrayRule()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray541);
            ruleJsonMetaArray();

            state._fsp--;

             after(grammarAccess.getJsonMetaArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaArray548); 

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
    // $ANTLR end "entryRuleJsonMetaArray"


    // $ANTLR start "ruleJsonMetaArray"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:293:1: ruleJsonMetaArray : ( ( rule__JsonMetaArray__Group__0 ) ) ;
    public final void ruleJsonMetaArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:297:2: ( ( ( rule__JsonMetaArray__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:298:1: ( ( rule__JsonMetaArray__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:298:1: ( ( rule__JsonMetaArray__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:299:1: ( rule__JsonMetaArray__Group__0 )
            {
             before(grammarAccess.getJsonMetaArrayAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:300:1: ( rule__JsonMetaArray__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:300:2: rule__JsonMetaArray__Group__0
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__0_in_ruleJsonMetaArray574);
            rule__JsonMetaArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonMetaArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonMetaArray"


    // $ANTLR start "entryRuleJsonMetaType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:312:1: entryRuleJsonMetaType : ruleJsonMetaType EOF ;
    public final void entryRuleJsonMetaType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:313:1: ( ruleJsonMetaType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:314:1: ruleJsonMetaType EOF
            {
             before(grammarAccess.getJsonMetaTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType601);
            ruleJsonMetaType();

            state._fsp--;

             after(grammarAccess.getJsonMetaTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaType608); 

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
    // $ANTLR end "entryRuleJsonMetaType"


    // $ANTLR start "ruleJsonMetaType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:321:1: ruleJsonMetaType : ( ( rule__JsonMetaType__Alternatives ) ) ;
    public final void ruleJsonMetaType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:325:2: ( ( ( rule__JsonMetaType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:326:1: ( ( rule__JsonMetaType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:326:1: ( ( rule__JsonMetaType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:327:1: ( rule__JsonMetaType__Alternatives )
            {
             before(grammarAccess.getJsonMetaTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:328:1: ( rule__JsonMetaType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:328:2: rule__JsonMetaType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonMetaType__Alternatives_in_ruleJsonMetaType634);
            rule__JsonMetaType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonMetaTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonMetaType"


    // $ANTLR start "entryRuleJsonCompositeType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:340:1: entryRuleJsonCompositeType : ruleJsonCompositeType EOF ;
    public final void entryRuleJsonCompositeType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:341:1: ( ruleJsonCompositeType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:342:1: ruleJsonCompositeType EOF
            {
             before(grammarAccess.getJsonCompositeTypeRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType661);
            ruleJsonCompositeType();

            state._fsp--;

             after(grammarAccess.getJsonCompositeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeType668); 

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
    // $ANTLR end "entryRuleJsonCompositeType"


    // $ANTLR start "ruleJsonCompositeType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:349:1: ruleJsonCompositeType : ( ( rule__JsonCompositeType__CompositeAssignment ) ) ;
    public final void ruleJsonCompositeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:353:2: ( ( ( rule__JsonCompositeType__CompositeAssignment ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:354:1: ( ( rule__JsonCompositeType__CompositeAssignment ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:354:1: ( ( rule__JsonCompositeType__CompositeAssignment ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:355:1: ( rule__JsonCompositeType__CompositeAssignment )
            {
             before(grammarAccess.getJsonCompositeTypeAccess().getCompositeAssignment()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:356:1: ( rule__JsonCompositeType__CompositeAssignment )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:356:2: rule__JsonCompositeType__CompositeAssignment
            {
            pushFollow(FOLLOW_rule__JsonCompositeType__CompositeAssignment_in_ruleJsonCompositeType694);
            rule__JsonCompositeType__CompositeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonCompositeTypeAccess().getCompositeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonCompositeType"


    // $ANTLR start "entryRuleJsonType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:368:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:369:1: ( ruleJsonType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:370:1: ruleJsonType EOF
            {
             before(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType721);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType728); 

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
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:377:1: ruleJsonType : ( ( rule__JsonType__Alternatives ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:381:2: ( ( ( rule__JsonType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:382:1: ( ( rule__JsonType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:382:1: ( ( rule__JsonType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:383:1: ( rule__JsonType__Alternatives )
            {
             before(grammarAccess.getJsonTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:384:1: ( rule__JsonType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:384:2: rule__JsonType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonType__Alternatives_in_ruleJsonType754);
            rule__JsonType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleJsonScalarType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:396:1: entryRuleJsonScalarType : ruleJsonScalarType EOF ;
    public final void entryRuleJsonScalarType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:397:1: ( ruleJsonScalarType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:398:1: ruleJsonScalarType EOF
            {
             before(grammarAccess.getJsonScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType781);
            ruleJsonScalarType();

            state._fsp--;

             after(grammarAccess.getJsonScalarTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonScalarType788); 

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
    // $ANTLR end "entryRuleJsonScalarType"


    // $ANTLR start "ruleJsonScalarType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:405:1: ruleJsonScalarType : ( ( rule__JsonScalarType__Alternatives ) ) ;
    public final void ruleJsonScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:409:2: ( ( ( rule__JsonScalarType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__JsonScalarType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__JsonScalarType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:411:1: ( rule__JsonScalarType__Alternatives )
            {
             before(grammarAccess.getJsonScalarTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:1: ( rule__JsonScalarType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:2: rule__JsonScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Alternatives_in_ruleJsonScalarType814);
            rule__JsonScalarType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonScalarTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonScalarType"


    // $ANTLR start "entryRuleJsonArray"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:424:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:425:1: ( ruleJsonArray EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:426:1: ruleJsonArray EOF
            {
             before(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray841);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray848); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:433:1: ruleJsonArray : ( ( rule__JsonArray__Alternatives ) ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:437:2: ( ( ( rule__JsonArray__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__JsonArray__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__JsonArray__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:439:1: ( rule__JsonArray__Alternatives )
            {
             before(grammarAccess.getJsonArrayAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:1: ( rule__JsonArray__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:2: rule__JsonArray__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonArray__Alternatives_in_ruleJsonArray874);
            rule__JsonArray__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleJsonObject"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:452:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:453:1: ( ruleJsonObject EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:454:1: ruleJsonObject EOF
            {
             before(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject901);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject908); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:461:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:465:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:466:1: ( ( rule__JsonObject__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:466:1: ( ( rule__JsonObject__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:467:1: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:468:1: ( rule__JsonObject__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:468:2: rule__JsonObject__Group__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject934);
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


    // $ANTLR start "entryRuleXplatformResourceDefinition"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:480:1: entryRuleXplatformResourceDefinition : ruleXplatformResourceDefinition EOF ;
    public final void entryRuleXplatformResourceDefinition() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:481:1: ( ruleXplatformResourceDefinition EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:482:1: ruleXplatformResourceDefinition EOF
            {
             before(grammarAccess.getXplatformResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition961);
            ruleXplatformResourceDefinition();

            state._fsp--;

             after(grammarAccess.getXplatformResourceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformResourceDefinition968); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:489:1: ruleXplatformResourceDefinition : ( ( ( rule__XplatformResourceDefinition__Alternatives ) ) ( ( rule__XplatformResourceDefinition__Alternatives )* ) ) ;
    public final void ruleXplatformResourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:493:2: ( ( ( ( rule__XplatformResourceDefinition__Alternatives ) ) ( ( rule__XplatformResourceDefinition__Alternatives )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:494:1: ( ( ( rule__XplatformResourceDefinition__Alternatives ) ) ( ( rule__XplatformResourceDefinition__Alternatives )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:494:1: ( ( ( rule__XplatformResourceDefinition__Alternatives ) ) ( ( rule__XplatformResourceDefinition__Alternatives )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:495:1: ( ( rule__XplatformResourceDefinition__Alternatives ) ) ( ( rule__XplatformResourceDefinition__Alternatives )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:495:1: ( ( rule__XplatformResourceDefinition__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:496:1: ( rule__XplatformResourceDefinition__Alternatives )
            {
             before(grammarAccess.getXplatformResourceDefinitionAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:497:1: ( rule__XplatformResourceDefinition__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:497:2: rule__XplatformResourceDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__XplatformResourceDefinition__Alternatives_in_ruleXplatformResourceDefinition996);
            rule__XplatformResourceDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXplatformResourceDefinitionAccess().getAlternatives()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:500:1: ( ( rule__XplatformResourceDefinition__Alternatives )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:501:1: ( rule__XplatformResourceDefinition__Alternatives )*
            {
             before(grammarAccess.getXplatformResourceDefinitionAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:502:1: ( rule__XplatformResourceDefinition__Alternatives )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:502:2: rule__XplatformResourceDefinition__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__XplatformResourceDefinition__Alternatives_in_ruleXplatformResourceDefinition1008);
            	    rule__XplatformResourceDefinition__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXplatformResourceDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleXplatformResourceDefinition"


    // $ANTLR start "entryRuleEnumInstance"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:515:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:516:1: ( ruleEnumInstance EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:517:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance1038);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance1045); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:524:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:528:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:529:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:529:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:530:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:531:1: ( rule__EnumInstance__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:531:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance1071);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:543:1: entryRuleMapInstance : ruleMapInstance EOF ;
    public final void entryRuleMapInstance() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:544:1: ( ruleMapInstance EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:545:1: ruleMapInstance EOF
            {
             before(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance1098);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMapInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance1105); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:552:1: ruleMapInstance : ( ( rule__MapInstance__Group__0 ) ) ;
    public final void ruleMapInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:556:2: ( ( ( rule__MapInstance__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:557:1: ( ( rule__MapInstance__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:557:1: ( ( rule__MapInstance__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:558:1: ( rule__MapInstance__Group__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:1: ( rule__MapInstance__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:2: rule__MapInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance1131);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:571:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:572:1: ( ruleStringList EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:573:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList1158);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList1165); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:580:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:584:2: ( ( ( rule__StringList__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:585:1: ( ( rule__StringList__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:585:1: ( ( rule__StringList__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:586:1: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:587:1: ( rule__StringList__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:587:2: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_rule__StringList__Group__0_in_ruleStringList1191);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:599:1: entryRuleNestedType : ruleNestedType EOF ;
    public final void entryRuleNestedType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:600:1: ( ruleNestedType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:601:1: ruleNestedType EOF
            {
             before(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType1218);
            ruleNestedType();

            state._fsp--;

             after(grammarAccess.getNestedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType1225); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:608:1: ruleNestedType : ( ( rule__NestedType__Alternatives ) ) ;
    public final void ruleNestedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:612:2: ( ( ( rule__NestedType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:613:1: ( ( rule__NestedType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:613:1: ( ( rule__NestedType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:614:1: ( rule__NestedType__Alternatives )
            {
             before(grammarAccess.getNestedTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:615:1: ( rule__NestedType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:615:2: rule__NestedType__Alternatives
            {
            pushFollow(FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1251);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:627:1: rule__Xplatform__Alternatives_1 : ( ( ( rule__Xplatform__ResourcesAssignment_1_0 ) ) | ( ( rule__Xplatform__CallsAssignment_1_1 ) ) );
    public final void rule__Xplatform__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:631:1: ( ( ( rule__Xplatform__ResourcesAssignment_1_0 ) ) | ( ( rule__Xplatform__CallsAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=39 && LA2_0<=40)) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:632:1: ( ( rule__Xplatform__ResourcesAssignment_1_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:632:1: ( ( rule__Xplatform__ResourcesAssignment_1_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:633:1: ( rule__Xplatform__ResourcesAssignment_1_0 )
                    {
                     before(grammarAccess.getXplatformAccess().getResourcesAssignment_1_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:634:1: ( rule__Xplatform__ResourcesAssignment_1_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:634:2: rule__Xplatform__ResourcesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__ResourcesAssignment_1_0_in_rule__Xplatform__Alternatives_11287);
                    rule__Xplatform__ResourcesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformAccess().getResourcesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:638:6: ( ( rule__Xplatform__CallsAssignment_1_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:638:6: ( ( rule__Xplatform__CallsAssignment_1_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:639:1: ( rule__Xplatform__CallsAssignment_1_1 )
                    {
                     before(grammarAccess.getXplatformAccess().getCallsAssignment_1_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:640:1: ( rule__Xplatform__CallsAssignment_1_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:640:2: rule__Xplatform__CallsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Xplatform__CallsAssignment_1_1_in_rule__Xplatform__Alternatives_11305);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:649:1: rule__XplatformHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) );
    public final void rule__XplatformHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:653:1: ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_XPLATFORM_HEADER_PARAMETER) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:654:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:654:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:655:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:656:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:656:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_21338);
                    rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:660:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:660:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:661:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:662:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:662:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_21356);
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


    // $ANTLR start "rule__XplatformJson__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:671:1: rule__XplatformJson__Alternatives : ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__MetaTypeAssignment_1 ) ) | ( ( rule__XplatformJson__Group_2__0 ) ) );
    public final void rule__XplatformJson__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:675:1: ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__MetaTypeAssignment_1 ) ) | ( ( rule__XplatformJson__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 33:
                {
                alt4=1;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 36:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:676:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:676:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:677:1: ( rule__XplatformJson__Group_0__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:678:1: ( rule__XplatformJson__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:678:2: rule__XplatformJson__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives1389);
                    rule__XplatformJson__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:682:6: ( ( rule__XplatformJson__MetaTypeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:682:6: ( ( rule__XplatformJson__MetaTypeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:683:1: ( rule__XplatformJson__MetaTypeAssignment_1 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:684:1: ( rule__XplatformJson__MetaTypeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:684:2: rule__XplatformJson__MetaTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_in_rule__XplatformJson__Alternatives1407);
                    rule__XplatformJson__MetaTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:688:6: ( ( rule__XplatformJson__Group_2__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:688:6: ( ( rule__XplatformJson__Group_2__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:689:1: ( rule__XplatformJson__Group_2__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_2()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:690:1: ( rule__XplatformJson__Group_2__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:690:2: rule__XplatformJson__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_2__0_in_rule__XplatformJson__Alternatives1425);
                    rule__XplatformJson__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getGroup_2()); 

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
    // $ANTLR end "rule__XplatformJson__Alternatives"


    // $ANTLR start "rule__JsonMetaScalarType__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:699:1: rule__JsonMetaScalarType__Alternatives : ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) );
    public final void rule__JsonMetaScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:703:1: ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:704:1: ( 'boolean' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:704:1: ( 'boolean' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:705:1: 'boolean'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives1459); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:712:6: ( 'number' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:712:6: ( 'number' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:713:1: 'number'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives1479); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:720:6: ( 'string' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:720:6: ( 'string' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:721:1: 'string'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getStringKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1499); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getStringKeyword_2()); 

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


    // $ANTLR start "rule__JsonMetaType__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:733:1: rule__JsonMetaType__Alternatives : ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) );
    public final void rule__JsonMetaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:737:1: ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=15 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:738:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:738:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:739:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:740:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:740:2: rule__JsonMetaType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1533);
                    rule__JsonMetaType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:744:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:744:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:745:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:746:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:746:2: rule__JsonMetaType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1551);
                    rule__JsonMetaType__CompositeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonMetaTypeAccess().getCompositeAssignment_1()); 

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
    // $ANTLR end "rule__JsonMetaType__Alternatives"


    // $ANTLR start "rule__JsonType__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:755:1: rule__JsonType__Alternatives : ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) );
    public final void rule__JsonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:759:1: ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==RULE_INT||(LA7_0>=RULE_JSON_LITERAL_BOOLEAN && LA7_0<=RULE_JSON_LITERAL_NULL)) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:760:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:760:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:761:1: ( rule__JsonType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:762:1: ( rule__JsonType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:762:2: rule__JsonType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1584);
                    rule__JsonType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:766:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:766:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:767:1: ( rule__JsonType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:768:1: ( rule__JsonType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:768:2: rule__JsonType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1602);
                    rule__JsonType__CompositeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonTypeAccess().getCompositeAssignment_1()); 

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
    // $ANTLR end "rule__JsonType__Alternatives"


    // $ANTLR start "rule__JsonScalarType__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:777:1: rule__JsonScalarType__Alternatives : ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) );
    public final void rule__JsonScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:781:1: ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:782:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:782:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:783:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:784:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:784:2: rule__JsonScalarType__BoolAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1635);
                    rule__JsonScalarType__BoolAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:788:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:788:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:789:1: ( rule__JsonScalarType__StringAssignment_1 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:790:1: ( rule__JsonScalarType__StringAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:790:2: rule__JsonScalarType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1653);
                    rule__JsonScalarType__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:794:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:794:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:795:1: ( rule__JsonScalarType__Group_2__0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:796:1: ( rule__JsonScalarType__Group_2__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:796:2: rule__JsonScalarType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1671);
                    rule__JsonScalarType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:800:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:800:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:801:1: ( rule__JsonScalarType__NullAssignment_3 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getNullAssignment_3()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:802:1: ( rule__JsonScalarType__NullAssignment_3 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:802:2: rule__JsonScalarType__NullAssignment_3
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1689);
                    rule__JsonScalarType__NullAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getNullAssignment_3()); 

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
    // $ANTLR end "rule__JsonScalarType__Alternatives"


    // $ANTLR start "rule__JsonArray__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:811:1: rule__JsonArray__Alternatives : ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) );
    public final void rule__JsonArray__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:815:1: ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==36) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_STRING||LA9_1==RULE_INT||(LA9_1>=RULE_JSON_LITERAL_BOOLEAN && LA9_1<=RULE_JSON_LITERAL_NULL)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:816:1: ( ( rule__JsonArray__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:816:1: ( ( rule__JsonArray__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:817:1: ( rule__JsonArray__Group_0__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:818:1: ( rule__JsonArray__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:818:2: rule__JsonArray__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1722);
                    rule__JsonArray__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonArrayAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:822:6: ( ( rule__JsonArray__Group_1__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:822:6: ( ( rule__JsonArray__Group_1__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:823:1: ( rule__JsonArray__Group_1__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:824:1: ( rule__JsonArray__Group_1__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:824:2: rule__JsonArray__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1740);
                    rule__JsonArray__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonArrayAccess().getGroup_1()); 

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
    // $ANTLR end "rule__JsonArray__Alternatives"


    // $ANTLR start "rule__XplatformResourceDefinition__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:833:1: rule__XplatformResourceDefinition__Alternatives : ( ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) ) | ( ( rule__XplatformResourceDefinition__ResourcesAssignment_1 ) ) );
    public final void rule__XplatformResourceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:837:1: ( ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) ) | ( ( rule__XplatformResourceDefinition__ResourcesAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:838:1: ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:838:1: ( ( rule__XplatformResourceDefinition__ResourcesAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:839:1: ( rule__XplatformResourceDefinition__ResourcesAssignment_0 )
                    {
                     before(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:840:1: ( rule__XplatformResourceDefinition__ResourcesAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:840:2: rule__XplatformResourceDefinition__ResourcesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__XplatformResourceDefinition__ResourcesAssignment_0_in_rule__XplatformResourceDefinition__Alternatives1773);
                    rule__XplatformResourceDefinition__ResourcesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:844:6: ( ( rule__XplatformResourceDefinition__ResourcesAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:844:6: ( ( rule__XplatformResourceDefinition__ResourcesAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:845:1: ( rule__XplatformResourceDefinition__ResourcesAssignment_1 )
                    {
                     before(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:846:1: ( rule__XplatformResourceDefinition__ResourcesAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:846:2: rule__XplatformResourceDefinition__ResourcesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__XplatformResourceDefinition__ResourcesAssignment_1_in_rule__XplatformResourceDefinition__Alternatives1791);
                    rule__XplatformResourceDefinition__ResourcesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesAssignment_1()); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:855:1: rule__NestedType__Alternatives : ( ( RULE_STRING ) | ( ruleStringList ) );
    public final void rule__NestedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:859:1: ( ( RULE_STRING ) | ( ruleStringList ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==36) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:860:1: ( RULE_STRING )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:860:1: ( RULE_STRING )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:861:1: RULE_STRING
                    {
                     before(grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NestedType__Alternatives1824); 
                     after(grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:866:6: ( ruleStringList )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:866:6: ( ruleStringList )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:867:1: ruleStringList
                    {
                     before(grammarAccess.getNestedTypeAccess().getStringListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringList_in_rule__NestedType__Alternatives1841);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:879:1: rule__Xplatform__Group__0 : rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 ;
    public final void rule__Xplatform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:883:1: ( rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:884:2: rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01871);
            rule__Xplatform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01874);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:891:1: rule__Xplatform__Group__0__Impl : ( ( rule__Xplatform__PlatformAssignment_0 ) ) ;
    public final void rule__Xplatform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:895:1: ( ( ( rule__Xplatform__PlatformAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:896:1: ( ( rule__Xplatform__PlatformAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:896:1: ( ( rule__Xplatform__PlatformAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:897:1: ( rule__Xplatform__PlatformAssignment_0 )
            {
             before(grammarAccess.getXplatformAccess().getPlatformAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:898:1: ( rule__Xplatform__PlatformAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:898:2: rule__Xplatform__PlatformAssignment_0
            {
            pushFollow(FOLLOW_rule__Xplatform__PlatformAssignment_0_in_rule__Xplatform__Group__0__Impl1901);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:908:1: rule__Xplatform__Group__1 : rule__Xplatform__Group__1__Impl ;
    public final void rule__Xplatform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:912:1: ( rule__Xplatform__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:913:2: rule__Xplatform__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11931);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:919:1: rule__Xplatform__Group__1__Impl : ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) ) ;
    public final void rule__Xplatform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:923:1: ( ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:924:1: ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:924:1: ( ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:925:1: ( ( rule__Xplatform__Alternatives_1 ) ) ( ( rule__Xplatform__Alternatives_1 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:925:1: ( ( rule__Xplatform__Alternatives_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:926:1: ( rule__Xplatform__Alternatives_1 )
            {
             before(grammarAccess.getXplatformAccess().getAlternatives_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:927:1: ( rule__Xplatform__Alternatives_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:927:2: rule__Xplatform__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1960);
            rule__Xplatform__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getAlternatives_1()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:930:1: ( ( rule__Xplatform__Alternatives_1 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:931:1: ( rule__Xplatform__Alternatives_1 )*
            {
             before(grammarAccess.getXplatformAccess().getAlternatives_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:932:1: ( rule__Xplatform__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22||(LA12_0>=39 && LA12_0<=40)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:932:2: rule__Xplatform__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1972);
            	    rule__Xplatform__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:947:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:951:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:952:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__02009);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__02012);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:959:1: rule__Platform__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:963:1: ( ( 'platform' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:964:1: ( 'platform' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:964:1: ( 'platform' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:965:1: 'platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Platform__Group__0__Impl2040); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:978:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:982:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:983:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__12071);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__12074);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:990:1: rule__Platform__Group__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:994:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:995:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:995:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:996:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Platform__Group__1__Impl2102); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1009:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1013:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1014:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__22133);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__22136);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1021:1: rule__Platform__Group__2__Impl : ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1025:1: ( ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1026:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1026:1: ( ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1027:1: ( ( rule__Platform__Group_2__0 ) ) ( ( rule__Platform__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1027:1: ( ( rule__Platform__Group_2__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1028:1: ( rule__Platform__Group_2__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1029:1: ( rule__Platform__Group_2__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1029:2: rule__Platform__Group_2__0
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl2165);
            rule__Platform__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup_2()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1032:1: ( ( rule__Platform__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1033:1: ( rule__Platform__Group_2__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1034:1: ( rule__Platform__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1034:2: rule__Platform__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl2177);
            	    rule__Platform__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1045:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1049:1: ( rule__Platform__Group__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1050:2: rule__Platform__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__32210);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1056:1: rule__Platform__Group__3__Impl : ( '}' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1060:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1061:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1061:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1062:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Platform__Group__3__Impl2238); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1083:1: rule__Platform__Group_2__0 : rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 ;
    public final void rule__Platform__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1087:1: ( rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1088:2: rule__Platform__Group_2__0__Impl rule__Platform__Group_2__1
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__02277);
            rule__Platform__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__02280);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1095:1: rule__Platform__Group_2__0__Impl : ( ( rule__Platform__PlatformsAssignment_2_0 ) ) ;
    public final void rule__Platform__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1099:1: ( ( ( rule__Platform__PlatformsAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1100:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1100:1: ( ( rule__Platform__PlatformsAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1101:1: ( rule__Platform__PlatformsAssignment_2_0 )
            {
             before(grammarAccess.getPlatformAccess().getPlatformsAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1102:1: ( rule__Platform__PlatformsAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1102:2: rule__Platform__PlatformsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl2307);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1112:1: rule__Platform__Group_2__1 : rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 ;
    public final void rule__Platform__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1116:1: ( rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1117:2: rule__Platform__Group_2__1__Impl rule__Platform__Group_2__2
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__12337);
            rule__Platform__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__12340);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1124:1: rule__Platform__Group_2__1__Impl : ( '->' ) ;
    public final void rule__Platform__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1128:1: ( ( '->' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1129:1: ( '->' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1129:1: ( '->' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1130:1: '->'
            {
             before(grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            match(input,21,FOLLOW_21_in_rule__Platform__Group_2__1__Impl2368); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1143:1: rule__Platform__Group_2__2 : rule__Platform__Group_2__2__Impl ;
    public final void rule__Platform__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1147:1: ( rule__Platform__Group_2__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1148:2: rule__Platform__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22399);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1154:1: rule__Platform__Group_2__2__Impl : ( ( rule__Platform__WhereToGenerateAssignment_2_2 ) ) ;
    public final void rule__Platform__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1158:1: ( ( ( rule__Platform__WhereToGenerateAssignment_2_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1159:1: ( ( rule__Platform__WhereToGenerateAssignment_2_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1159:1: ( ( rule__Platform__WhereToGenerateAssignment_2_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1160:1: ( rule__Platform__WhereToGenerateAssignment_2_2 )
            {
             before(grammarAccess.getPlatformAccess().getWhereToGenerateAssignment_2_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1161:1: ( rule__Platform__WhereToGenerateAssignment_2_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1161:2: rule__Platform__WhereToGenerateAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Platform__WhereToGenerateAssignment_2_2_in_rule__Platform__Group_2__2__Impl2426);
            rule__Platform__WhereToGenerateAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getWhereToGenerateAssignment_2_2()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1177:1: rule__XplatformCallDefinition__Group__0 : rule__XplatformCallDefinition__Group__0__Impl rule__XplatformCallDefinition__Group__1 ;
    public final void rule__XplatformCallDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1181:1: ( rule__XplatformCallDefinition__Group__0__Impl rule__XplatformCallDefinition__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1182:2: rule__XplatformCallDefinition__Group__0__Impl rule__XplatformCallDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__0__Impl_in_rule__XplatformCallDefinition__Group__02462);
            rule__XplatformCallDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__1_in_rule__XplatformCallDefinition__Group__02465);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1189:1: rule__XplatformCallDefinition__Group__0__Impl : ( 'call' ) ;
    public final void rule__XplatformCallDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1193:1: ( ( 'call' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1194:1: ( 'call' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1194:1: ( 'call' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1195:1: 'call'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getCallKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__XplatformCallDefinition__Group__0__Impl2493); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1208:1: rule__XplatformCallDefinition__Group__1 : rule__XplatformCallDefinition__Group__1__Impl rule__XplatformCallDefinition__Group__2 ;
    public final void rule__XplatformCallDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1212:1: ( rule__XplatformCallDefinition__Group__1__Impl rule__XplatformCallDefinition__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1213:2: rule__XplatformCallDefinition__Group__1__Impl rule__XplatformCallDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__1__Impl_in_rule__XplatformCallDefinition__Group__12524);
            rule__XplatformCallDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__2_in_rule__XplatformCallDefinition__Group__12527);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1220:1: rule__XplatformCallDefinition__Group__1__Impl : ( ( rule__XplatformCallDefinition__NameAssignment_1 ) ) ;
    public final void rule__XplatformCallDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1224:1: ( ( ( rule__XplatformCallDefinition__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1225:1: ( ( rule__XplatformCallDefinition__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1225:1: ( ( rule__XplatformCallDefinition__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1226:1: ( rule__XplatformCallDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1227:1: ( rule__XplatformCallDefinition__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1227:2: rule__XplatformCallDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__NameAssignment_1_in_rule__XplatformCallDefinition__Group__1__Impl2554);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1237:1: rule__XplatformCallDefinition__Group__2 : rule__XplatformCallDefinition__Group__2__Impl rule__XplatformCallDefinition__Group__3 ;
    public final void rule__XplatformCallDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1241:1: ( rule__XplatformCallDefinition__Group__2__Impl rule__XplatformCallDefinition__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1242:2: rule__XplatformCallDefinition__Group__2__Impl rule__XplatformCallDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__2__Impl_in_rule__XplatformCallDefinition__Group__22584);
            rule__XplatformCallDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__3_in_rule__XplatformCallDefinition__Group__22587);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1249:1: rule__XplatformCallDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__XplatformCallDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1253:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1254:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1254:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1255:1: ':'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__XplatformCallDefinition__Group__2__Impl2615); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1268:1: rule__XplatformCallDefinition__Group__3 : rule__XplatformCallDefinition__Group__3__Impl rule__XplatformCallDefinition__Group__4 ;
    public final void rule__XplatformCallDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1272:1: ( rule__XplatformCallDefinition__Group__3__Impl rule__XplatformCallDefinition__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1273:2: rule__XplatformCallDefinition__Group__3__Impl rule__XplatformCallDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__3__Impl_in_rule__XplatformCallDefinition__Group__32646);
            rule__XplatformCallDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__4_in_rule__XplatformCallDefinition__Group__32649);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1280:1: rule__XplatformCallDefinition__Group__3__Impl : ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) ) ;
    public final void rule__XplatformCallDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1284:1: ( ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1285:1: ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1285:1: ( ( rule__XplatformCallDefinition__MethodAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1286:1: ( rule__XplatformCallDefinition__MethodAssignment_3 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getMethodAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1287:1: ( rule__XplatformCallDefinition__MethodAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1287:2: rule__XplatformCallDefinition__MethodAssignment_3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__MethodAssignment_3_in_rule__XplatformCallDefinition__Group__3__Impl2676);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1297:1: rule__XplatformCallDefinition__Group__4 : rule__XplatformCallDefinition__Group__4__Impl rule__XplatformCallDefinition__Group__5 ;
    public final void rule__XplatformCallDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1301:1: ( rule__XplatformCallDefinition__Group__4__Impl rule__XplatformCallDefinition__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1302:2: rule__XplatformCallDefinition__Group__4__Impl rule__XplatformCallDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__4__Impl_in_rule__XplatformCallDefinition__Group__42706);
            rule__XplatformCallDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__5_in_rule__XplatformCallDefinition__Group__42709);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1309:1: rule__XplatformCallDefinition__Group__4__Impl : ( 'from' ) ;
    public final void rule__XplatformCallDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1313:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1314:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1314:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1315:1: 'from'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__XplatformCallDefinition__Group__4__Impl2737); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1328:1: rule__XplatformCallDefinition__Group__5 : rule__XplatformCallDefinition__Group__5__Impl rule__XplatformCallDefinition__Group__6 ;
    public final void rule__XplatformCallDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1332:1: ( rule__XplatformCallDefinition__Group__5__Impl rule__XplatformCallDefinition__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1333:2: rule__XplatformCallDefinition__Group__5__Impl rule__XplatformCallDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__5__Impl_in_rule__XplatformCallDefinition__Group__52768);
            rule__XplatformCallDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__6_in_rule__XplatformCallDefinition__Group__52771);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1340:1: rule__XplatformCallDefinition__Group__5__Impl : ( ( rule__XplatformCallDefinition__UriAssignment_5 ) ) ;
    public final void rule__XplatformCallDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1344:1: ( ( ( rule__XplatformCallDefinition__UriAssignment_5 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1345:1: ( ( rule__XplatformCallDefinition__UriAssignment_5 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1345:1: ( ( rule__XplatformCallDefinition__UriAssignment_5 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1346:1: ( rule__XplatformCallDefinition__UriAssignment_5 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getUriAssignment_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1347:1: ( rule__XplatformCallDefinition__UriAssignment_5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1347:2: rule__XplatformCallDefinition__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__UriAssignment_5_in_rule__XplatformCallDefinition__Group__5__Impl2798);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1357:1: rule__XplatformCallDefinition__Group__6 : rule__XplatformCallDefinition__Group__6__Impl rule__XplatformCallDefinition__Group__7 ;
    public final void rule__XplatformCallDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1361:1: ( rule__XplatformCallDefinition__Group__6__Impl rule__XplatformCallDefinition__Group__7 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1362:2: rule__XplatformCallDefinition__Group__6__Impl rule__XplatformCallDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__6__Impl_in_rule__XplatformCallDefinition__Group__62828);
            rule__XplatformCallDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__7_in_rule__XplatformCallDefinition__Group__62831);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1369:1: rule__XplatformCallDefinition__Group__6__Impl : ( ( rule__XplatformCallDefinition__Group_6__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1373:1: ( ( ( rule__XplatformCallDefinition__Group_6__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1374:1: ( ( rule__XplatformCallDefinition__Group_6__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1374:1: ( ( rule__XplatformCallDefinition__Group_6__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1375:1: ( rule__XplatformCallDefinition__Group_6__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_6()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1376:1: ( rule__XplatformCallDefinition__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1376:2: rule__XplatformCallDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__0_in_rule__XplatformCallDefinition__Group__6__Impl2858);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1386:1: rule__XplatformCallDefinition__Group__7 : rule__XplatformCallDefinition__Group__7__Impl ;
    public final void rule__XplatformCallDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1390:1: ( rule__XplatformCallDefinition__Group__7__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1391:2: rule__XplatformCallDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group__7__Impl_in_rule__XplatformCallDefinition__Group__72889);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1397:1: rule__XplatformCallDefinition__Group__7__Impl : ( ( rule__XplatformCallDefinition__Group_7__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1401:1: ( ( ( rule__XplatformCallDefinition__Group_7__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1402:1: ( ( rule__XplatformCallDefinition__Group_7__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1402:1: ( ( rule__XplatformCallDefinition__Group_7__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1403:1: ( rule__XplatformCallDefinition__Group_7__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_7()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1404:1: ( rule__XplatformCallDefinition__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1404:2: rule__XplatformCallDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__0_in_rule__XplatformCallDefinition__Group__7__Impl2916);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1430:1: rule__XplatformCallDefinition__Group_6__0 : rule__XplatformCallDefinition__Group_6__0__Impl rule__XplatformCallDefinition__Group_6__1 ;
    public final void rule__XplatformCallDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1434:1: ( rule__XplatformCallDefinition__Group_6__0__Impl rule__XplatformCallDefinition__Group_6__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1435:2: rule__XplatformCallDefinition__Group_6__0__Impl rule__XplatformCallDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__0__Impl_in_rule__XplatformCallDefinition__Group_6__02963);
            rule__XplatformCallDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__1_in_rule__XplatformCallDefinition__Group_6__02966);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1442:1: rule__XplatformCallDefinition__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__XplatformCallDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1446:1: ( ( 'with' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1447:1: ( 'with' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1447:1: ( 'with' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1448:1: 'with'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getWithKeyword_6_0()); 
            match(input,25,FOLLOW_25_in_rule__XplatformCallDefinition__Group_6__0__Impl2994); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1461:1: rule__XplatformCallDefinition__Group_6__1 : rule__XplatformCallDefinition__Group_6__1__Impl rule__XplatformCallDefinition__Group_6__2 ;
    public final void rule__XplatformCallDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1465:1: ( rule__XplatformCallDefinition__Group_6__1__Impl rule__XplatformCallDefinition__Group_6__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1466:2: rule__XplatformCallDefinition__Group_6__1__Impl rule__XplatformCallDefinition__Group_6__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__1__Impl_in_rule__XplatformCallDefinition__Group_6__13025);
            rule__XplatformCallDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__2_in_rule__XplatformCallDefinition__Group_6__13028);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1473:1: rule__XplatformCallDefinition__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__XplatformCallDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1477:1: ( ( 'headers' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1478:1: ( 'headers' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1478:1: ( 'headers' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1479:1: 'headers'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getHeadersKeyword_6_1()); 
            match(input,26,FOLLOW_26_in_rule__XplatformCallDefinition__Group_6__1__Impl3056); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1492:1: rule__XplatformCallDefinition__Group_6__2 : rule__XplatformCallDefinition__Group_6__2__Impl rule__XplatformCallDefinition__Group_6__3 ;
    public final void rule__XplatformCallDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1496:1: ( rule__XplatformCallDefinition__Group_6__2__Impl rule__XplatformCallDefinition__Group_6__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1497:2: rule__XplatformCallDefinition__Group_6__2__Impl rule__XplatformCallDefinition__Group_6__3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__2__Impl_in_rule__XplatformCallDefinition__Group_6__23087);
            rule__XplatformCallDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__3_in_rule__XplatformCallDefinition__Group_6__23090);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1504:1: rule__XplatformCallDefinition__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__XplatformCallDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1508:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1509:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1509:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1510:1: 'from'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_6_2()); 
            match(input,24,FOLLOW_24_in_rule__XplatformCallDefinition__Group_6__2__Impl3118); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1523:1: rule__XplatformCallDefinition__Group_6__3 : rule__XplatformCallDefinition__Group_6__3__Impl rule__XplatformCallDefinition__Group_6__4 ;
    public final void rule__XplatformCallDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1527:1: ( rule__XplatformCallDefinition__Group_6__3__Impl rule__XplatformCallDefinition__Group_6__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1528:2: rule__XplatformCallDefinition__Group_6__3__Impl rule__XplatformCallDefinition__Group_6__4
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__3__Impl_in_rule__XplatformCallDefinition__Group_6__33149);
            rule__XplatformCallDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__4_in_rule__XplatformCallDefinition__Group_6__33152);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1535:1: rule__XplatformCallDefinition__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__XplatformCallDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1539:1: ( ( 'request' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1540:1: ( 'request' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1540:1: ( 'request' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1541:1: 'request'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getRequestKeyword_6_3()); 
            match(input,27,FOLLOW_27_in_rule__XplatformCallDefinition__Group_6__3__Impl3180); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1554:1: rule__XplatformCallDefinition__Group_6__4 : rule__XplatformCallDefinition__Group_6__4__Impl rule__XplatformCallDefinition__Group_6__5 ;
    public final void rule__XplatformCallDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1558:1: ( rule__XplatformCallDefinition__Group_6__4__Impl rule__XplatformCallDefinition__Group_6__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1559:2: rule__XplatformCallDefinition__Group_6__4__Impl rule__XplatformCallDefinition__Group_6__5
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__4__Impl_in_rule__XplatformCallDefinition__Group_6__43211);
            rule__XplatformCallDefinition__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__5_in_rule__XplatformCallDefinition__Group_6__43214);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1566:1: rule__XplatformCallDefinition__Group_6__4__Impl : ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__XplatformCallDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1570:1: ( ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1571:1: ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1571:1: ( ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1572:1: ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersAssignment_6_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1573:1: ( rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1573:2: rule__XplatformCallDefinition__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__RequestHeadersAssignment_6_4_in_rule__XplatformCallDefinition__Group_6__4__Impl3241);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1583:1: rule__XplatformCallDefinition__Group_6__5 : rule__XplatformCallDefinition__Group_6__5__Impl ;
    public final void rule__XplatformCallDefinition__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1587:1: ( rule__XplatformCallDefinition__Group_6__5__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1588:2: rule__XplatformCallDefinition__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6__5__Impl_in_rule__XplatformCallDefinition__Group_6__53271);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1594:1: rule__XplatformCallDefinition__Group_6__5__Impl : ( ( rule__XplatformCallDefinition__Group_6_5__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1598:1: ( ( ( rule__XplatformCallDefinition__Group_6_5__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1599:1: ( ( rule__XplatformCallDefinition__Group_6_5__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1599:1: ( ( rule__XplatformCallDefinition__Group_6_5__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1600:1: ( rule__XplatformCallDefinition__Group_6_5__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_6_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1601:1: ( rule__XplatformCallDefinition__Group_6_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1601:2: rule__XplatformCallDefinition__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__0_in_rule__XplatformCallDefinition__Group_6__5__Impl3298);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1623:1: rule__XplatformCallDefinition__Group_6_5__0 : rule__XplatformCallDefinition__Group_6_5__0__Impl rule__XplatformCallDefinition__Group_6_5__1 ;
    public final void rule__XplatformCallDefinition__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1627:1: ( rule__XplatformCallDefinition__Group_6_5__0__Impl rule__XplatformCallDefinition__Group_6_5__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1628:2: rule__XplatformCallDefinition__Group_6_5__0__Impl rule__XplatformCallDefinition__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__0__Impl_in_rule__XplatformCallDefinition__Group_6_5__03341);
            rule__XplatformCallDefinition__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__1_in_rule__XplatformCallDefinition__Group_6_5__03344);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1635:1: rule__XplatformCallDefinition__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__XplatformCallDefinition__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1639:1: ( ( 'and' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1640:1: ( 'and' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1640:1: ( 'and' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1641:1: 'and'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getAndKeyword_6_5_0()); 
            match(input,28,FOLLOW_28_in_rule__XplatformCallDefinition__Group_6_5__0__Impl3372); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1654:1: rule__XplatformCallDefinition__Group_6_5__1 : rule__XplatformCallDefinition__Group_6_5__1__Impl rule__XplatformCallDefinition__Group_6_5__2 ;
    public final void rule__XplatformCallDefinition__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1658:1: ( rule__XplatformCallDefinition__Group_6_5__1__Impl rule__XplatformCallDefinition__Group_6_5__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1659:2: rule__XplatformCallDefinition__Group_6_5__1__Impl rule__XplatformCallDefinition__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__1__Impl_in_rule__XplatformCallDefinition__Group_6_5__13403);
            rule__XplatformCallDefinition__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__2_in_rule__XplatformCallDefinition__Group_6_5__13406);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1666:1: rule__XplatformCallDefinition__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__XplatformCallDefinition__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1670:1: ( ( 'response' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1671:1: ( 'response' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1671:1: ( 'response' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1672:1: 'response'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getResponseKeyword_6_5_1()); 
            match(input,29,FOLLOW_29_in_rule__XplatformCallDefinition__Group_6_5__1__Impl3434); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1685:1: rule__XplatformCallDefinition__Group_6_5__2 : rule__XplatformCallDefinition__Group_6_5__2__Impl ;
    public final void rule__XplatformCallDefinition__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1689:1: ( rule__XplatformCallDefinition__Group_6_5__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1690:2: rule__XplatformCallDefinition__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_6_5__2__Impl_in_rule__XplatformCallDefinition__Group_6_5__23465);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1696:1: rule__XplatformCallDefinition__Group_6_5__2__Impl : ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__XplatformCallDefinition__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1700:1: ( ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1701:1: ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1701:1: ( ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1702:1: ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1703:1: ( rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1703:2: rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__XplatformCallDefinition__Group_6_5__2__Impl3492);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1719:1: rule__XplatformCallDefinition__Group_7__0 : rule__XplatformCallDefinition__Group_7__0__Impl rule__XplatformCallDefinition__Group_7__1 ;
    public final void rule__XplatformCallDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1723:1: ( rule__XplatformCallDefinition__Group_7__0__Impl rule__XplatformCallDefinition__Group_7__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1724:2: rule__XplatformCallDefinition__Group_7__0__Impl rule__XplatformCallDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__0__Impl_in_rule__XplatformCallDefinition__Group_7__03528);
            rule__XplatformCallDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__1_in_rule__XplatformCallDefinition__Group_7__03531);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1731:1: rule__XplatformCallDefinition__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__XplatformCallDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1735:1: ( ( 'client' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1736:1: ( 'client' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1736:1: ( 'client' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1737:1: 'client'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getClientKeyword_7_0()); 
            match(input,30,FOLLOW_30_in_rule__XplatformCallDefinition__Group_7__0__Impl3559); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1750:1: rule__XplatformCallDefinition__Group_7__1 : rule__XplatformCallDefinition__Group_7__1__Impl rule__XplatformCallDefinition__Group_7__2 ;
    public final void rule__XplatformCallDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1754:1: ( rule__XplatformCallDefinition__Group_7__1__Impl rule__XplatformCallDefinition__Group_7__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1755:2: rule__XplatformCallDefinition__Group_7__1__Impl rule__XplatformCallDefinition__Group_7__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__1__Impl_in_rule__XplatformCallDefinition__Group_7__13590);
            rule__XplatformCallDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__2_in_rule__XplatformCallDefinition__Group_7__13593);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1762:1: rule__XplatformCallDefinition__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__XplatformCallDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1766:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1767:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1767:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1768:1: 'expects'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_1()); 
            match(input,31,FOLLOW_31_in_rule__XplatformCallDefinition__Group_7__1__Impl3621); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1781:1: rule__XplatformCallDefinition__Group_7__2 : rule__XplatformCallDefinition__Group_7__2__Impl rule__XplatformCallDefinition__Group_7__3 ;
    public final void rule__XplatformCallDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1785:1: ( rule__XplatformCallDefinition__Group_7__2__Impl rule__XplatformCallDefinition__Group_7__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1786:2: rule__XplatformCallDefinition__Group_7__2__Impl rule__XplatformCallDefinition__Group_7__3
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__2__Impl_in_rule__XplatformCallDefinition__Group_7__23652);
            rule__XplatformCallDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__3_in_rule__XplatformCallDefinition__Group_7__23655);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1793:1: rule__XplatformCallDefinition__Group_7__2__Impl : ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__XplatformCallDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1797:1: ( ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1798:1: ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1798:1: ( ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1799:1: ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientAssignment_7_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1800:1: ( rule__XplatformCallDefinition__JsonToClientAssignment_7_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1800:2: rule__XplatformCallDefinition__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__JsonToClientAssignment_7_2_in_rule__XplatformCallDefinition__Group_7__2__Impl3682);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1810:1: rule__XplatformCallDefinition__Group_7__3 : rule__XplatformCallDefinition__Group_7__3__Impl ;
    public final void rule__XplatformCallDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1814:1: ( rule__XplatformCallDefinition__Group_7__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1815:2: rule__XplatformCallDefinition__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7__3__Impl_in_rule__XplatformCallDefinition__Group_7__33712);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1821:1: rule__XplatformCallDefinition__Group_7__3__Impl : ( ( rule__XplatformCallDefinition__Group_7_3__0 )? ) ;
    public final void rule__XplatformCallDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1825:1: ( ( ( rule__XplatformCallDefinition__Group_7_3__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1826:1: ( ( rule__XplatformCallDefinition__Group_7_3__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1826:1: ( ( rule__XplatformCallDefinition__Group_7_3__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1827:1: ( rule__XplatformCallDefinition__Group_7_3__0 )?
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getGroup_7_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1828:1: ( rule__XplatformCallDefinition__Group_7_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1828:2: rule__XplatformCallDefinition__Group_7_3__0
                    {
                    pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__0_in_rule__XplatformCallDefinition__Group_7__3__Impl3739);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1846:1: rule__XplatformCallDefinition__Group_7_3__0 : rule__XplatformCallDefinition__Group_7_3__0__Impl rule__XplatformCallDefinition__Group_7_3__1 ;
    public final void rule__XplatformCallDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1850:1: ( rule__XplatformCallDefinition__Group_7_3__0__Impl rule__XplatformCallDefinition__Group_7_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1851:2: rule__XplatformCallDefinition__Group_7_3__0__Impl rule__XplatformCallDefinition__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__0__Impl_in_rule__XplatformCallDefinition__Group_7_3__03778);
            rule__XplatformCallDefinition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__1_in_rule__XplatformCallDefinition__Group_7_3__03781);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1858:1: rule__XplatformCallDefinition__Group_7_3__0__Impl : ( 'server' ) ;
    public final void rule__XplatformCallDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1862:1: ( ( 'server' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1863:1: ( 'server' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1863:1: ( 'server' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1864:1: 'server'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getServerKeyword_7_3_0()); 
            match(input,32,FOLLOW_32_in_rule__XplatformCallDefinition__Group_7_3__0__Impl3809); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1877:1: rule__XplatformCallDefinition__Group_7_3__1 : rule__XplatformCallDefinition__Group_7_3__1__Impl rule__XplatformCallDefinition__Group_7_3__2 ;
    public final void rule__XplatformCallDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1881:1: ( rule__XplatformCallDefinition__Group_7_3__1__Impl rule__XplatformCallDefinition__Group_7_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1882:2: rule__XplatformCallDefinition__Group_7_3__1__Impl rule__XplatformCallDefinition__Group_7_3__2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__1__Impl_in_rule__XplatformCallDefinition__Group_7_3__13840);
            rule__XplatformCallDefinition__Group_7_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__2_in_rule__XplatformCallDefinition__Group_7_3__13843);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1889:1: rule__XplatformCallDefinition__Group_7_3__1__Impl : ( 'expects' ) ;
    public final void rule__XplatformCallDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1893:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1894:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1894:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1895:1: 'expects'
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_3_1()); 
            match(input,31,FOLLOW_31_in_rule__XplatformCallDefinition__Group_7_3__1__Impl3871); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1908:1: rule__XplatformCallDefinition__Group_7_3__2 : rule__XplatformCallDefinition__Group_7_3__2__Impl ;
    public final void rule__XplatformCallDefinition__Group_7_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1912:1: ( rule__XplatformCallDefinition__Group_7_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1913:2: rule__XplatformCallDefinition__Group_7_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__Group_7_3__2__Impl_in_rule__XplatformCallDefinition__Group_7_3__23902);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1919:1: rule__XplatformCallDefinition__Group_7_3__2__Impl : ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) ) ;
    public final void rule__XplatformCallDefinition__Group_7_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1923:1: ( ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1924:1: ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1924:1: ( ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1925:1: ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 )
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerAssignment_7_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1926:1: ( rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1926:2: rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2
            {
            pushFollow(FOLLOW_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2_in_rule__XplatformCallDefinition__Group_7_3__2__Impl3929);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1942:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1946:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1947:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03965);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03968);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1954:1: rule__URI__Group__0__Impl : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1958:1: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1959:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1959:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1960:1: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1960:1: ( ( RULE_ANY_OTHER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1961:1: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1962:1: ( RULE_ANY_OTHER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1962:3: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3998); 

            }

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1965:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1966:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1967:1: ( RULE_ANY_OTHER )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ANY_OTHER) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1967:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl4011); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1978:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1982:1: ( rule__URI__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1983:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__14044);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1989:1: rule__URI__Group__1__Impl : ( ( rule__URI__Group_1__0 )? ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1993:1: ( ( ( rule__URI__Group_1__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1994:1: ( ( rule__URI__Group_1__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1994:1: ( ( rule__URI__Group_1__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1995:1: ( rule__URI__Group_1__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1996:1: ( rule__URI__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1996:2: rule__URI__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl4071);
                    rule__URI__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2010:1: rule__URI__Group_1__0 : rule__URI__Group_1__0__Impl rule__URI__Group_1__1 ;
    public final void rule__URI__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2014:1: ( rule__URI__Group_1__0__Impl rule__URI__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2015:2: rule__URI__Group_1__0__Impl rule__URI__Group_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__04106);
            rule__URI__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__04109);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2022:1: rule__URI__Group_1__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2026:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2027:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2027:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2028:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__URI__Group_1__0__Impl4137); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2041:1: rule__URI__Group_1__1 : rule__URI__Group_1__1__Impl rule__URI__Group_1__2 ;
    public final void rule__URI__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2045:1: ( rule__URI__Group_1__1__Impl rule__URI__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2046:2: rule__URI__Group_1__1__Impl rule__URI__Group_1__2
            {
            pushFollow(FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__14168);
            rule__URI__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__14171);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2053:1: rule__URI__Group_1__1__Impl : ( ( rule__URI__UriParametersAssignment_1_1 ) ) ;
    public final void rule__URI__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2057:1: ( ( ( rule__URI__UriParametersAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2058:1: ( ( rule__URI__UriParametersAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2058:1: ( ( rule__URI__UriParametersAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2059:1: ( rule__URI__UriParametersAssignment_1_1 )
            {
             before(grammarAccess.getURIAccess().getUriParametersAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2060:1: ( rule__URI__UriParametersAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2060:2: rule__URI__UriParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__URI__UriParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl4198);
            rule__URI__UriParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getUriParametersAssignment_1_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2070:1: rule__URI__Group_1__2 : rule__URI__Group_1__2__Impl rule__URI__Group_1__3 ;
    public final void rule__URI__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2074:1: ( rule__URI__Group_1__2__Impl rule__URI__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2075:2: rule__URI__Group_1__2__Impl rule__URI__Group_1__3
            {
            pushFollow(FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__24228);
            rule__URI__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__24231);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2082:1: rule__URI__Group_1__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2086:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2087:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2087:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2088:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,20,FOLLOW_20_in_rule__URI__Group_1__2__Impl4259); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2101:1: rule__URI__Group_1__3 : rule__URI__Group_1__3__Impl ;
    public final void rule__URI__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2105:1: ( rule__URI__Group_1__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2106:2: rule__URI__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__34290);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2112:1: rule__URI__Group_1__3__Impl : ( ( RULE_ANY_OTHER )* ) ;
    public final void rule__URI__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2116:1: ( ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2117:1: ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2117:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2118:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2119:1: ( RULE_ANY_OTHER )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ANY_OTHER) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2119:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl4318); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2137:1: rule__XplatformHeader__Group__0 : rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 ;
    public final void rule__XplatformHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2141:1: ( rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2142:2: rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__04357);
            rule__XplatformHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__04360);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2149:1: rule__XplatformHeader__Group__0__Impl : ( ( rule__XplatformHeader__NameAssignment_0 )? ) ;
    public final void rule__XplatformHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2153:1: ( ( ( rule__XplatformHeader__NameAssignment_0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2154:1: ( ( rule__XplatformHeader__NameAssignment_0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2154:1: ( ( rule__XplatformHeader__NameAssignment_0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2155:1: ( rule__XplatformHeader__NameAssignment_0 )?
            {
             before(grammarAccess.getXplatformHeaderAccess().getNameAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2156:1: ( rule__XplatformHeader__NameAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2156:2: rule__XplatformHeader__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__XplatformHeader__NameAssignment_0_in_rule__XplatformHeader__Group__0__Impl4387);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2166:1: rule__XplatformHeader__Group__1 : rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 ;
    public final void rule__XplatformHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2170:1: ( rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2171:2: rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__14418);
            rule__XplatformHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__14421);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2178:1: rule__XplatformHeader__Group__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2182:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2183:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2183:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2184:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__XplatformHeader__Group__1__Impl4449); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2197:1: rule__XplatformHeader__Group__2 : rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 ;
    public final void rule__XplatformHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2201:1: ( rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2202:2: rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__24480);
            rule__XplatformHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__24483);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2209:1: rule__XplatformHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__XplatformHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2213:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2214:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2214:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2215:1: '{'
            {
             before(grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__XplatformHeader__Group__2__Impl4511); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2228:1: rule__XplatformHeader__Group__3 : rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 ;
    public final void rule__XplatformHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2232:1: ( rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2233:2: rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__34542);
            rule__XplatformHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__34545);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2240:1: rule__XplatformHeader__Group__3__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) ) ;
    public final void rule__XplatformHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2244:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2245:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2245:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2246:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2247:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2247:2: rule__XplatformHeader__HeaderKeyValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_in_rule__XplatformHeader__Group__3__Impl4572);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2257:1: rule__XplatformHeader__Group__4 : rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 ;
    public final void rule__XplatformHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2261:1: ( rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2262:2: rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__44602);
            rule__XplatformHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__44605);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2269:1: rule__XplatformHeader__Group__4__Impl : ( ( rule__XplatformHeader__Group_4__0 )* ) ;
    public final void rule__XplatformHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2273:1: ( ( ( rule__XplatformHeader__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2274:1: ( ( rule__XplatformHeader__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2274:1: ( ( rule__XplatformHeader__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2275:1: ( rule__XplatformHeader__Group_4__0 )*
            {
             before(grammarAccess.getXplatformHeaderAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2276:1: ( rule__XplatformHeader__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_STRING) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2276:2: rule__XplatformHeader__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__XplatformHeader__Group_4__0_in_rule__XplatformHeader__Group__4__Impl4632);
            	    rule__XplatformHeader__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2286:1: rule__XplatformHeader__Group__5 : rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 ;
    public final void rule__XplatformHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2290:1: ( rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2291:2: rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__54663);
            rule__XplatformHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__54666);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2298:1: rule__XplatformHeader__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__XplatformHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2302:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2303:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2303:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2304:1: ( ',' )?
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2305:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2306:2: ','
                    {
                    match(input,34,FOLLOW_34_in_rule__XplatformHeader__Group__5__Impl4695); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2317:1: rule__XplatformHeader__Group__6 : rule__XplatformHeader__Group__6__Impl rule__XplatformHeader__Group__7 ;
    public final void rule__XplatformHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2321:1: ( rule__XplatformHeader__Group__6__Impl rule__XplatformHeader__Group__7 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2322:2: rule__XplatformHeader__Group__6__Impl rule__XplatformHeader__Group__7
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__64728);
            rule__XplatformHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__7_in_rule__XplatformHeader__Group__64731);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2329:1: rule__XplatformHeader__Group__6__Impl : ( '}' ) ;
    public final void rule__XplatformHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2333:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2334:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2334:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2335:1: '}'
            {
             before(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__XplatformHeader__Group__6__Impl4759); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2348:1: rule__XplatformHeader__Group__7 : rule__XplatformHeader__Group__7__Impl ;
    public final void rule__XplatformHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2352:1: ( rule__XplatformHeader__Group__7__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2353:2: rule__XplatformHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__7__Impl_in_rule__XplatformHeader__Group__74790);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2359:1: rule__XplatformHeader__Group__7__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2363:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2364:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2364:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2365:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_7()); 
            match(input,33,FOLLOW_33_in_rule__XplatformHeader__Group__7__Impl4818); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2394:1: rule__XplatformHeader__Group_4__0 : rule__XplatformHeader__Group_4__0__Impl rule__XplatformHeader__Group_4__1 ;
    public final void rule__XplatformHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2398:1: ( rule__XplatformHeader__Group_4__0__Impl rule__XplatformHeader__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2399:2: rule__XplatformHeader__Group_4__0__Impl rule__XplatformHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_4__0__Impl_in_rule__XplatformHeader__Group_4__04865);
            rule__XplatformHeader__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group_4__1_in_rule__XplatformHeader__Group_4__04868);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2406:1: rule__XplatformHeader__Group_4__0__Impl : ( ',' ) ;
    public final void rule__XplatformHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2410:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2411:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2411:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2412:1: ','
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__XplatformHeader__Group_4__0__Impl4896); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2425:1: rule__XplatformHeader__Group_4__1 : rule__XplatformHeader__Group_4__1__Impl ;
    public final void rule__XplatformHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2429:1: ( rule__XplatformHeader__Group_4__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2430:2: rule__XplatformHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_4__1__Impl_in_rule__XplatformHeader__Group_4__14927);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2436:1: rule__XplatformHeader__Group_4__1__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) ) ;
    public final void rule__XplatformHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2440:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2441:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2441:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2442:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2443:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2443:2: rule__XplatformHeader__HeaderKeyValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_4_1_in_rule__XplatformHeader__Group_4__1__Impl4954);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2457:1: rule__XplatformHeaderKeyValuePair__Group__0 : rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2461:1: ( rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2462:2: rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__04988);
            rule__XplatformHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__04991);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2469:1: rule__XplatformHeaderKeyValuePair__Group__0__Impl : ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2473:1: ( ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2474:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2474:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2475:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2476:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2476:2: rule__XplatformHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl5018);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2486:1: rule__XplatformHeaderKeyValuePair__Group__1 : rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2490:1: ( rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2491:2: rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__15048);
            rule__XplatformHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__15051);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2498:1: rule__XplatformHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2502:1: ( ( '=' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2503:1: ( '=' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2503:1: ( '=' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2504:1: '='
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl5079); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2517:1: rule__XplatformHeaderKeyValuePair__Group__2 : rule__XplatformHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2521:1: ( rule__XplatformHeaderKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2522:2: rule__XplatformHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__25110);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2528:1: rule__XplatformHeaderKeyValuePair__Group__2__Impl : ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2532:1: ( ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2533:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2533:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2534:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2535:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2535:2: rule__XplatformHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl5137);
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


    // $ANTLR start "rule__XplatformJson__Group_0__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2551:1: rule__XplatformJson__Group_0__0 : rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 ;
    public final void rule__XplatformJson__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2555:1: ( rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2556:2: rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__05173);
            rule__XplatformJson__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__05176);
            rule__XplatformJson__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_0__0"


    // $ANTLR start "rule__XplatformJson__Group_0__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2563:1: rule__XplatformJson__Group_0__0__Impl : ( ( rule__XplatformJson__NameAssignment_0_0 )? ) ;
    public final void rule__XplatformJson__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2567:1: ( ( ( rule__XplatformJson__NameAssignment_0_0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2568:1: ( ( rule__XplatformJson__NameAssignment_0_0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2568:1: ( ( rule__XplatformJson__NameAssignment_0_0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2569:1: ( rule__XplatformJson__NameAssignment_0_0 )?
            {
             before(grammarAccess.getXplatformJsonAccess().getNameAssignment_0_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2570:1: ( rule__XplatformJson__NameAssignment_0_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2570:2: rule__XplatformJson__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__NameAssignment_0_0_in_rule__XplatformJson__Group_0__0__Impl5203);
                    rule__XplatformJson__NameAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformJsonAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_0__0__Impl"


    // $ANTLR start "rule__XplatformJson__Group_0__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2580:1: rule__XplatformJson__Group_0__1 : rule__XplatformJson__Group_0__1__Impl rule__XplatformJson__Group_0__2 ;
    public final void rule__XplatformJson__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2584:1: ( rule__XplatformJson__Group_0__1__Impl rule__XplatformJson__Group_0__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2585:2: rule__XplatformJson__Group_0__1__Impl rule__XplatformJson__Group_0__2
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__15234);
            rule__XplatformJson__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_0__2_in_rule__XplatformJson__Group_0__15237);
            rule__XplatformJson__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_0__1"


    // $ANTLR start "rule__XplatformJson__Group_0__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2592:1: rule__XplatformJson__Group_0__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2596:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2597:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2597:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2598:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_1()); 
            match(input,33,FOLLOW_33_in_rule__XplatformJson__Group_0__1__Impl5265); 
             after(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_0__1__Impl"


    // $ANTLR start "rule__XplatformJson__Group_0__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2611:1: rule__XplatformJson__Group_0__2 : rule__XplatformJson__Group_0__2__Impl ;
    public final void rule__XplatformJson__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2615:1: ( rule__XplatformJson__Group_0__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2616:2: rule__XplatformJson__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__2__Impl_in_rule__XplatformJson__Group_0__25296);
            rule__XplatformJson__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_0__2"


    // $ANTLR start "rule__XplatformJson__Group_0__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2622:1: rule__XplatformJson__Group_0__2__Impl : ( ( rule__XplatformJson__TypeAssignment_0_2 ) ) ;
    public final void rule__XplatformJson__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2626:1: ( ( ( rule__XplatformJson__TypeAssignment_0_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2627:1: ( ( rule__XplatformJson__TypeAssignment_0_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2627:1: ( ( rule__XplatformJson__TypeAssignment_0_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2628:1: ( rule__XplatformJson__TypeAssignment_0_2 )
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeAssignment_0_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2629:1: ( rule__XplatformJson__TypeAssignment_0_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2629:2: rule__XplatformJson__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__XplatformJson__TypeAssignment_0_2_in_rule__XplatformJson__Group_0__2__Impl5323);
            rule__XplatformJson__TypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_0__2__Impl"


    // $ANTLR start "rule__XplatformJson__Group_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2645:1: rule__XplatformJson__Group_2__0 : rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1 ;
    public final void rule__XplatformJson__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2649:1: ( rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2650:2: rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_2__0__Impl_in_rule__XplatformJson__Group_2__05359);
            rule__XplatformJson__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_2__1_in_rule__XplatformJson__Group_2__05362);
            rule__XplatformJson__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_2__0"


    // $ANTLR start "rule__XplatformJson__Group_2__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2657:1: rule__XplatformJson__Group_2__0__Impl : ( ( rule__XplatformJson__CompositeAssignment_2_0 ) ) ;
    public final void rule__XplatformJson__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2661:1: ( ( ( rule__XplatformJson__CompositeAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2662:1: ( ( rule__XplatformJson__CompositeAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2662:1: ( ( rule__XplatformJson__CompositeAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2663:1: ( rule__XplatformJson__CompositeAssignment_2_0 )
            {
             before(grammarAccess.getXplatformJsonAccess().getCompositeAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2664:1: ( rule__XplatformJson__CompositeAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2664:2: rule__XplatformJson__CompositeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__XplatformJson__CompositeAssignment_2_0_in_rule__XplatformJson__Group_2__0__Impl5389);
            rule__XplatformJson__CompositeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getCompositeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_2__0__Impl"


    // $ANTLR start "rule__XplatformJson__Group_2__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2674:1: rule__XplatformJson__Group_2__1 : rule__XplatformJson__Group_2__1__Impl ;
    public final void rule__XplatformJson__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2678:1: ( rule__XplatformJson__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2679:2: rule__XplatformJson__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_2__1__Impl_in_rule__XplatformJson__Group_2__15419);
            rule__XplatformJson__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_2__1"


    // $ANTLR start "rule__XplatformJson__Group_2__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2685:1: rule__XplatformJson__Group_2__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2689:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2690:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2690:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2691:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_2_1()); 
            match(input,33,FOLLOW_33_in_rule__XplatformJson__Group_2__1__Impl5447); 
             after(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_2__1__Impl"


    // $ANTLR start "rule__JsonMetaArray__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2708:1: rule__JsonMetaArray__Group__0 : rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 ;
    public final void rule__JsonMetaArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2712:1: ( rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2713:2: rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__05482);
            rule__JsonMetaArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__05485);
            rule__JsonMetaArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaArray__Group__0"


    // $ANTLR start "rule__JsonMetaArray__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2720:1: rule__JsonMetaArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonMetaArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2724:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2725:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2725:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2726:1: '['
            {
             before(grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__JsonMetaArray__Group__0__Impl5513); 
             after(grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaArray__Group__0__Impl"


    // $ANTLR start "rule__JsonMetaArray__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2739:1: rule__JsonMetaArray__Group__1 : rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 ;
    public final void rule__JsonMetaArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2743:1: ( rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2744:2: rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__15544);
            rule__JsonMetaArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__15547);
            rule__JsonMetaArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaArray__Group__1"


    // $ANTLR start "rule__JsonMetaArray__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2751:1: rule__JsonMetaArray__Group__1__Impl : ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) ;
    public final void rule__JsonMetaArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2755:1: ( ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2756:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2756:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2757:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2758:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2758:2: rule__JsonMetaArray__MetaTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl5574);
            rule__JsonMetaArray__MetaTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonMetaArrayAccess().getMetaTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaArray__Group__1__Impl"


    // $ANTLR start "rule__JsonMetaArray__Group__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2768:1: rule__JsonMetaArray__Group__2 : rule__JsonMetaArray__Group__2__Impl ;
    public final void rule__JsonMetaArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2772:1: ( rule__JsonMetaArray__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2773:2: rule__JsonMetaArray__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__25604);
            rule__JsonMetaArray__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaArray__Group__2"


    // $ANTLR start "rule__JsonMetaArray__Group__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2779:1: rule__JsonMetaArray__Group__2__Impl : ( ']' ) ;
    public final void rule__JsonMetaArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2783:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2784:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2784:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2785:1: ']'
            {
             before(grammarAccess.getJsonMetaArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__JsonMetaArray__Group__2__Impl5632); 
             after(grammarAccess.getJsonMetaArrayAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaArray__Group__2__Impl"


    // $ANTLR start "rule__JsonScalarType__Group_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2804:1: rule__JsonScalarType__Group_2__0 : rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 ;
    public final void rule__JsonScalarType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2808:1: ( rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2809:2: rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__05669);
            rule__JsonScalarType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__05672);
            rule__JsonScalarType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2__0"


    // $ANTLR start "rule__JsonScalarType__Group_2__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2816:1: rule__JsonScalarType__Group_2__0__Impl : ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) ;
    public final void rule__JsonScalarType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2820:1: ( ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2821:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2821:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2822:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2823:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2823:2: rule__JsonScalarType__NumberAssignment_2_0
            {
            pushFollow(FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl5699);
            rule__JsonScalarType__NumberAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonScalarTypeAccess().getNumberAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2__0__Impl"


    // $ANTLR start "rule__JsonScalarType__Group_2__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2833:1: rule__JsonScalarType__Group_2__1 : rule__JsonScalarType__Group_2__1__Impl ;
    public final void rule__JsonScalarType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2837:1: ( rule__JsonScalarType__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2838:2: rule__JsonScalarType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__15729);
            rule__JsonScalarType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2__1"


    // $ANTLR start "rule__JsonScalarType__Group_2__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2844:1: rule__JsonScalarType__Group_2__1__Impl : ( ( rule__JsonScalarType__Group_2_1__0 )? ) ;
    public final void rule__JsonScalarType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2848:1: ( ( ( rule__JsonScalarType__Group_2_1__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2849:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2849:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2850:1: ( rule__JsonScalarType__Group_2_1__0 )?
            {
             before(grammarAccess.getJsonScalarTypeAccess().getGroup_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2851:1: ( rule__JsonScalarType__Group_2_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2851:2: rule__JsonScalarType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl5756);
                    rule__JsonScalarType__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonScalarTypeAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2__1__Impl"


    // $ANTLR start "rule__JsonScalarType__Group_2_1__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2865:1: rule__JsonScalarType__Group_2_1__0 : rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 ;
    public final void rule__JsonScalarType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2869:1: ( rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2870:2: rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__05791);
            rule__JsonScalarType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__05794);
            rule__JsonScalarType__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2_1__0"


    // $ANTLR start "rule__JsonScalarType__Group_2_1__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2877:1: rule__JsonScalarType__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__JsonScalarType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2881:1: ( ( '.' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2882:1: ( '.' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2882:1: ( '.' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2883:1: '.'
            {
             before(grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0()); 
            match(input,38,FOLLOW_38_in_rule__JsonScalarType__Group_2_1__0__Impl5822); 
             after(grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2_1__0__Impl"


    // $ANTLR start "rule__JsonScalarType__Group_2_1__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2896:1: rule__JsonScalarType__Group_2_1__1 : rule__JsonScalarType__Group_2_1__1__Impl ;
    public final void rule__JsonScalarType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2900:1: ( rule__JsonScalarType__Group_2_1__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2901:2: rule__JsonScalarType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__15853);
            rule__JsonScalarType__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2_1__1"


    // $ANTLR start "rule__JsonScalarType__Group_2_1__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2907:1: rule__JsonScalarType__Group_2_1__1__Impl : ( RULE_INT ) ;
    public final void rule__JsonScalarType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2911:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2912:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2912:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2913:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl5880); 
             after(grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__Group_2_1__1__Impl"


    // $ANTLR start "rule__JsonArray__Group_0__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2928:1: rule__JsonArray__Group_0__0 : rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 ;
    public final void rule__JsonArray__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2932:1: ( rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2933:2: rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__05913);
            rule__JsonArray__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__05916);
            rule__JsonArray__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__0"


    // $ANTLR start "rule__JsonArray__Group_0__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2940:1: rule__JsonArray__Group_0__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2944:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2945:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2945:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2946:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__JsonArray__Group_0__0__Impl5944); 
             after(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_0__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2959:1: rule__JsonArray__Group_0__1 : rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 ;
    public final void rule__JsonArray__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2963:1: ( rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2964:2: rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__15975);
            rule__JsonArray__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__15978);
            rule__JsonArray__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__1"


    // $ANTLR start "rule__JsonArray__Group_0__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2971:1: rule__JsonArray__Group_0__1__Impl : ( ( rule__JsonArray__ElementsAssignment_0_1 ) ) ;
    public final void rule__JsonArray__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2975:1: ( ( ( rule__JsonArray__ElementsAssignment_0_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2976:1: ( ( rule__JsonArray__ElementsAssignment_0_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2976:1: ( ( rule__JsonArray__ElementsAssignment_0_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2977:1: ( rule__JsonArray__ElementsAssignment_0_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2978:1: ( rule__JsonArray__ElementsAssignment_0_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2978:2: rule__JsonArray__ElementsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementsAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl6005);
            rule__JsonArray__ElementsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__1__Impl"


    // $ANTLR start "rule__JsonArray__Group_0__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2988:1: rule__JsonArray__Group_0__2 : rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 ;
    public final void rule__JsonArray__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2992:1: ( rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2993:2: rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__26035);
            rule__JsonArray__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__26038);
            rule__JsonArray__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__2"


    // $ANTLR start "rule__JsonArray__Group_0__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3000:1: rule__JsonArray__Group_0__2__Impl : ( ( rule__JsonArray__Group_0_2__0 )* ) ;
    public final void rule__JsonArray__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3004:1: ( ( ( rule__JsonArray__Group_0_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3005:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3005:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3006:1: ( rule__JsonArray__Group_0_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_0_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3007:1: ( rule__JsonArray__Group_0_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_STRING||LA26_1==RULE_INT||(LA26_1>=RULE_JSON_LITERAL_BOOLEAN && LA26_1<=RULE_JSON_LITERAL_NULL)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3007:2: rule__JsonArray__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl6065);
            	    rule__JsonArray__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getJsonArrayAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__2__Impl"


    // $ANTLR start "rule__JsonArray__Group_0__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3017:1: rule__JsonArray__Group_0__3 : rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4 ;
    public final void rule__JsonArray__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3021:1: ( rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3022:2: rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__36096);
            rule__JsonArray__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__4_in_rule__JsonArray__Group_0__36099);
            rule__JsonArray__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__3"


    // $ANTLR start "rule__JsonArray__Group_0__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3029:1: rule__JsonArray__Group_0__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3033:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3034:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3034:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3035:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3036:1: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3037:2: ','
                    {
                    match(input,34,FOLLOW_34_in_rule__JsonArray__Group_0__3__Impl6128); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__3__Impl"


    // $ANTLR start "rule__JsonArray__Group_0__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3048:1: rule__JsonArray__Group_0__4 : rule__JsonArray__Group_0__4__Impl ;
    public final void rule__JsonArray__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3052:1: ( rule__JsonArray__Group_0__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3053:2: rule__JsonArray__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__4__Impl_in_rule__JsonArray__Group_0__46161);
            rule__JsonArray__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__4"


    // $ANTLR start "rule__JsonArray__Group_0__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3059:1: rule__JsonArray__Group_0__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3063:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3064:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3064:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3065:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4()); 
            match(input,37,FOLLOW_37_in_rule__JsonArray__Group_0__4__Impl6189); 
             after(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0__4__Impl"


    // $ANTLR start "rule__JsonArray__Group_0_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3088:1: rule__JsonArray__Group_0_2__0 : rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 ;
    public final void rule__JsonArray__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3092:1: ( rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3093:2: rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__06230);
            rule__JsonArray__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__06233);
            rule__JsonArray__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0_2__0"


    // $ANTLR start "rule__JsonArray__Group_0_2__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3100:1: rule__JsonArray__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3104:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3105:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3105:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3106:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_0_2__0__Impl6261); 
             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0_2__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_0_2__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3119:1: rule__JsonArray__Group_0_2__1 : rule__JsonArray__Group_0_2__1__Impl ;
    public final void rule__JsonArray__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3123:1: ( rule__JsonArray__Group_0_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3124:2: rule__JsonArray__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__16292);
            rule__JsonArray__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0_2__1"


    // $ANTLR start "rule__JsonArray__Group_0_2__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3130:1: rule__JsonArray__Group_0_2__1__Impl : ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) ) ;
    public final void rule__JsonArray__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3134:1: ( ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3135:1: ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3135:1: ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3136:1: ( rule__JsonArray__ElementsAssignment_0_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3137:1: ( rule__JsonArray__ElementsAssignment_0_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3137:2: rule__JsonArray__ElementsAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementsAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl6319);
            rule__JsonArray__ElementsAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0_2__1__Impl"


    // $ANTLR start "rule__JsonArray__Group_1__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3151:1: rule__JsonArray__Group_1__0 : rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 ;
    public final void rule__JsonArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3155:1: ( rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3156:2: rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__06353);
            rule__JsonArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__06356);
            rule__JsonArray__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__0"


    // $ANTLR start "rule__JsonArray__Group_1__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3163:1: rule__JsonArray__Group_1__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3167:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3168:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3168:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3169:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__JsonArray__Group_1__0__Impl6384); 
             after(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_1__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3182:1: rule__JsonArray__Group_1__1 : rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 ;
    public final void rule__JsonArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3186:1: ( rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3187:2: rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__16415);
            rule__JsonArray__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__16418);
            rule__JsonArray__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__1"


    // $ANTLR start "rule__JsonArray__Group_1__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3194:1: rule__JsonArray__Group_1__1__Impl : ( ( rule__JsonArray__CompositesAssignment_1_1 ) ) ;
    public final void rule__JsonArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3198:1: ( ( ( rule__JsonArray__CompositesAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3199:1: ( ( rule__JsonArray__CompositesAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3199:1: ( ( rule__JsonArray__CompositesAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3200:1: ( rule__JsonArray__CompositesAssignment_1_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3201:1: ( rule__JsonArray__CompositesAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3201:2: rule__JsonArray__CompositesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositesAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl6445);
            rule__JsonArray__CompositesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__1__Impl"


    // $ANTLR start "rule__JsonArray__Group_1__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3211:1: rule__JsonArray__Group_1__2 : rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 ;
    public final void rule__JsonArray__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3215:1: ( rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3216:2: rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__26475);
            rule__JsonArray__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__26478);
            rule__JsonArray__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__2"


    // $ANTLR start "rule__JsonArray__Group_1__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3223:1: rule__JsonArray__Group_1__2__Impl : ( ( rule__JsonArray__Group_1_2__0 )* ) ;
    public final void rule__JsonArray__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3227:1: ( ( ( rule__JsonArray__Group_1_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3228:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3228:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3229:1: ( rule__JsonArray__Group_1_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_1_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3230:1: ( rule__JsonArray__Group_1_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==34) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==36) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3230:2: rule__JsonArray__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl6505);
            	    rule__JsonArray__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getJsonArrayAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__2__Impl"


    // $ANTLR start "rule__JsonArray__Group_1__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3240:1: rule__JsonArray__Group_1__3 : rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4 ;
    public final void rule__JsonArray__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3244:1: ( rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3245:2: rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__36536);
            rule__JsonArray__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__4_in_rule__JsonArray__Group_1__36539);
            rule__JsonArray__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__3"


    // $ANTLR start "rule__JsonArray__Group_1__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3252:1: rule__JsonArray__Group_1__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3256:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3257:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3257:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3258:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3259:1: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3260:2: ','
                    {
                    match(input,34,FOLLOW_34_in_rule__JsonArray__Group_1__3__Impl6568); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__3__Impl"


    // $ANTLR start "rule__JsonArray__Group_1__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3271:1: rule__JsonArray__Group_1__4 : rule__JsonArray__Group_1__4__Impl ;
    public final void rule__JsonArray__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3275:1: ( rule__JsonArray__Group_1__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3276:2: rule__JsonArray__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__4__Impl_in_rule__JsonArray__Group_1__46601);
            rule__JsonArray__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__4"


    // $ANTLR start "rule__JsonArray__Group_1__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3282:1: rule__JsonArray__Group_1__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3286:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3287:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3287:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3288:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,37,FOLLOW_37_in_rule__JsonArray__Group_1__4__Impl6629); 
             after(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1__4__Impl"


    // $ANTLR start "rule__JsonArray__Group_1_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3311:1: rule__JsonArray__Group_1_2__0 : rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 ;
    public final void rule__JsonArray__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3315:1: ( rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3316:2: rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__06670);
            rule__JsonArray__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__06673);
            rule__JsonArray__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1_2__0"


    // $ANTLR start "rule__JsonArray__Group_1_2__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3323:1: rule__JsonArray__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3327:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3328:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3328:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3329:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_1_2__0__Impl6701); 
             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1_2__0__Impl"


    // $ANTLR start "rule__JsonArray__Group_1_2__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3342:1: rule__JsonArray__Group_1_2__1 : rule__JsonArray__Group_1_2__1__Impl ;
    public final void rule__JsonArray__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3346:1: ( rule__JsonArray__Group_1_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3347:2: rule__JsonArray__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__16732);
            rule__JsonArray__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1_2__1"


    // $ANTLR start "rule__JsonArray__Group_1_2__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3353:1: rule__JsonArray__Group_1_2__1__Impl : ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) ) ;
    public final void rule__JsonArray__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3357:1: ( ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3358:1: ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3358:1: ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3359:1: ( rule__JsonArray__CompositesAssignment_1_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3360:1: ( rule__JsonArray__CompositesAssignment_1_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3360:2: rule__JsonArray__CompositesAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositesAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl6759);
            rule__JsonArray__CompositesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1_2__1__Impl"


    // $ANTLR start "rule__JsonObject__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3374:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3378:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3379:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__06793);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__06796);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3386:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3390:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3391:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3391:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3392:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__JsonObject__Group__0__Impl6824); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3405:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3409:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3410:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__16855);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__16858);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3417:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__Group_1__0 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3421:1: ( ( ( rule__JsonObject__Group_1__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3422:1: ( ( rule__JsonObject__Group_1__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3422:1: ( ( rule__JsonObject__Group_1__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3423:1: ( rule__JsonObject__Group_1__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3424:1: ( rule__JsonObject__Group_1__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3424:2: rule__JsonObject__Group_1__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__0_in_rule__JsonObject__Group__1__Impl6885);
            rule__JsonObject__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getGroup_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3434:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3438:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3439:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__26915);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__26918);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3446:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )* ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3450:1: ( ( ( rule__JsonObject__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3451:1: ( ( rule__JsonObject__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3451:1: ( ( rule__JsonObject__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3452:1: ( rule__JsonObject__Group_2__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3453:1: ( rule__JsonObject__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_STRING) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3453:2: rule__JsonObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl6945);
            	    rule__JsonObject__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3463:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3467:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3468:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__36976);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__36979);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3475:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3479:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3480:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3480:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3481:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3482:1: ( ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3483:2: ','
                    {
                    match(input,34,FOLLOW_34_in_rule__JsonObject__Group__3__Impl7008); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3494:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3498:1: ( rule__JsonObject__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3499:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__47041);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3505:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3509:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3510:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3510:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3511:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__JsonObject__Group__4__Impl7069); 
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


    // $ANTLR start "rule__JsonObject__Group_1__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3534:1: rule__JsonObject__Group_1__0 : rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1 ;
    public final void rule__JsonObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3538:1: ( rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3539:2: rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__0__Impl_in_rule__JsonObject__Group_1__07110);
            rule__JsonObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_1__1_in_rule__JsonObject__Group_1__07113);
            rule__JsonObject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_1__0"


    // $ANTLR start "rule__JsonObject__Group_1__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3546:1: rule__JsonObject__Group_1__0__Impl : ( ( rule__JsonObject__KeysAssignment_1_0 ) ) ;
    public final void rule__JsonObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3550:1: ( ( ( rule__JsonObject__KeysAssignment_1_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3551:1: ( ( rule__JsonObject__KeysAssignment_1_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3551:1: ( ( rule__JsonObject__KeysAssignment_1_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3552:1: ( rule__JsonObject__KeysAssignment_1_0 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeysAssignment_1_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3553:1: ( rule__JsonObject__KeysAssignment_1_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3553:2: rule__JsonObject__KeysAssignment_1_0
            {
            pushFollow(FOLLOW_rule__JsonObject__KeysAssignment_1_0_in_rule__JsonObject__Group_1__0__Impl7140);
            rule__JsonObject__KeysAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getKeysAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_1__0__Impl"


    // $ANTLR start "rule__JsonObject__Group_1__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3563:1: rule__JsonObject__Group_1__1 : rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2 ;
    public final void rule__JsonObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3567:1: ( rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3568:2: rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__1__Impl_in_rule__JsonObject__Group_1__17170);
            rule__JsonObject__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_1__2_in_rule__JsonObject__Group_1__17173);
            rule__JsonObject__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_1__1"


    // $ANTLR start "rule__JsonObject__Group_1__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3575:1: rule__JsonObject__Group_1__1__Impl : ( ':' ) ;
    public final void rule__JsonObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3579:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3580:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3580:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3581:1: ':'
            {
             before(grammarAccess.getJsonObjectAccess().getColonKeyword_1_1()); 
            match(input,23,FOLLOW_23_in_rule__JsonObject__Group_1__1__Impl7201); 
             after(grammarAccess.getJsonObjectAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_1__1__Impl"


    // $ANTLR start "rule__JsonObject__Group_1__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3594:1: rule__JsonObject__Group_1__2 : rule__JsonObject__Group_1__2__Impl ;
    public final void rule__JsonObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3598:1: ( rule__JsonObject__Group_1__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3599:2: rule__JsonObject__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__2__Impl_in_rule__JsonObject__Group_1__27232);
            rule__JsonObject__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_1__2"


    // $ANTLR start "rule__JsonObject__Group_1__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3605:1: rule__JsonObject__Group_1__2__Impl : ( ( rule__JsonObject__ValuesAssignment_1_2 ) ) ;
    public final void rule__JsonObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3609:1: ( ( ( rule__JsonObject__ValuesAssignment_1_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3610:1: ( ( rule__JsonObject__ValuesAssignment_1_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3610:1: ( ( rule__JsonObject__ValuesAssignment_1_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3611:1: ( rule__JsonObject__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getJsonObjectAccess().getValuesAssignment_1_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3612:1: ( rule__JsonObject__ValuesAssignment_1_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3612:2: rule__JsonObject__ValuesAssignment_1_2
            {
            pushFollow(FOLLOW_rule__JsonObject__ValuesAssignment_1_2_in_rule__JsonObject__Group_1__2__Impl7259);
            rule__JsonObject__ValuesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getValuesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_1__2__Impl"


    // $ANTLR start "rule__JsonObject__Group_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3628:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3632:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3633:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__07295);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__07298);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3640:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3644:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3645:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3645:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3646:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonObject__Group_2__0__Impl7326); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3659:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3663:1: ( rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3664:2: rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__17357);
            rule__JsonObject__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__2_in_rule__JsonObject__Group_2__17360);
            rule__JsonObject__Group_2__2();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3671:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeysAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3675:1: ( ( ( rule__JsonObject__KeysAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3676:1: ( ( rule__JsonObject__KeysAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3676:1: ( ( rule__JsonObject__KeysAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3677:1: ( rule__JsonObject__KeysAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeysAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3678:1: ( rule__JsonObject__KeysAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3678:2: rule__JsonObject__KeysAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeysAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl7387);
            rule__JsonObject__KeysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getKeysAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonObject__Group_2__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3688:1: rule__JsonObject__Group_2__2 : rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3 ;
    public final void rule__JsonObject__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3692:1: ( rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3693:2: rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__2__Impl_in_rule__JsonObject__Group_2__27417);
            rule__JsonObject__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__3_in_rule__JsonObject__Group_2__27420);
            rule__JsonObject__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__2"


    // $ANTLR start "rule__JsonObject__Group_2__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3700:1: rule__JsonObject__Group_2__2__Impl : ( ':' ) ;
    public final void rule__JsonObject__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3704:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3705:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3705:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3706:1: ':'
            {
             before(grammarAccess.getJsonObjectAccess().getColonKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__JsonObject__Group_2__2__Impl7448); 
             after(grammarAccess.getJsonObjectAccess().getColonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__2__Impl"


    // $ANTLR start "rule__JsonObject__Group_2__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3719:1: rule__JsonObject__Group_2__3 : rule__JsonObject__Group_2__3__Impl ;
    public final void rule__JsonObject__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3723:1: ( rule__JsonObject__Group_2__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3724:2: rule__JsonObject__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__3__Impl_in_rule__JsonObject__Group_2__37479);
            rule__JsonObject__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__3"


    // $ANTLR start "rule__JsonObject__Group_2__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3730:1: rule__JsonObject__Group_2__3__Impl : ( ( rule__JsonObject__ValuesAssignment_2_3 ) ) ;
    public final void rule__JsonObject__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3734:1: ( ( ( rule__JsonObject__ValuesAssignment_2_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3735:1: ( ( rule__JsonObject__ValuesAssignment_2_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3735:1: ( ( rule__JsonObject__ValuesAssignment_2_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3736:1: ( rule__JsonObject__ValuesAssignment_2_3 )
            {
             before(grammarAccess.getJsonObjectAccess().getValuesAssignment_2_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3737:1: ( rule__JsonObject__ValuesAssignment_2_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3737:2: rule__JsonObject__ValuesAssignment_2_3
            {
            pushFollow(FOLLOW_rule__JsonObject__ValuesAssignment_2_3_in_rule__JsonObject__Group_2__3__Impl7506);
            rule__JsonObject__ValuesAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getValuesAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Group_2__3__Impl"


    // $ANTLR start "rule__EnumInstance__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3755:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3759:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3760:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__07544);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__07547);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3767:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3771:1: ( ( 'enum' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3772:1: ( 'enum' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3772:1: ( 'enum' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3773:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__EnumInstance__Group__0__Impl7575); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3786:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3790:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3791:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__17606);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__17609);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3798:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__NameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3802:1: ( ( ( rule__EnumInstance__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3803:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3803:1: ( ( rule__EnumInstance__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3804:1: ( rule__EnumInstance__NameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3805:1: ( rule__EnumInstance__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3805:2: rule__EnumInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl7636);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3815:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3819:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3820:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__27666);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__27669);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3827:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3831:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3832:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3832:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3833:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__EnumInstance__Group__2__Impl7697); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3846:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3850:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3851:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__37728);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__37731);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3858:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3862:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3863:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3863:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3864:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3865:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3865:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl7758);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3875:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3879:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3880:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__47788);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__47791);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3887:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3891:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3892:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3892:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3893:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3894:1: ( rule__EnumInstance__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==34) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_STRING) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3894:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl7818);
            	    rule__EnumInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3904:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3908:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3909:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__57849);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__57852);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3916:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3920:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3921:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3921:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3922:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3923:1: ( ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3924:2: ','
                    {
                    match(input,34,FOLLOW_34_in_rule__EnumInstance__Group__5__Impl7881); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3935:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3939:1: ( rule__EnumInstance__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3940:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__67914);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3946:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3950:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3951:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3951:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3952:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__EnumInstance__Group__6__Impl7942); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3979:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3983:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3984:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__07987);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__07990);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3991:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3995:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3996:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3996:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3997:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__EnumInstance__Group_4__0__Impl8018); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4010:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4014:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4015:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__18049);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4021:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4025:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4026:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4026:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4027:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4028:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4028:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl8076);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4042:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4046:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4047:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__08110);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__08113);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4054:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4058:1: ( ( 'map' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4059:1: ( 'map' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4059:1: ( 'map' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4060:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__MapInstance__Group__0__Impl8141); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4073:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4077:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4078:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__18172);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__18175);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4085:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__NameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4089:1: ( ( ( rule__MapInstance__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4090:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4090:1: ( ( rule__MapInstance__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4091:1: ( rule__MapInstance__NameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4092:1: ( rule__MapInstance__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4092:2: rule__MapInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl8202);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4102:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4106:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4107:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__28232);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__28235);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4114:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4118:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4119:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4119:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4120:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__MapInstance__Group__2__Impl8263); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4133:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4137:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4138:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__38294);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__38297);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4145:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__Group_3__0 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4149:1: ( ( ( rule__MapInstance__Group_3__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4150:1: ( ( rule__MapInstance__Group_3__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4150:1: ( ( rule__MapInstance__Group_3__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4151:1: ( rule__MapInstance__Group_3__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4152:1: ( rule__MapInstance__Group_3__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4152:2: rule__MapInstance__Group_3__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl8324);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4162:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4166:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4167:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__48354);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__48357);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4174:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4178:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4179:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4179:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4180:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4181:1: ( rule__MapInstance__Group_4__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4181:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl8384);
            	    rule__MapInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4191:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4195:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4196:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__58415);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__58418);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4203:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4207:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4208:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4208:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4209:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4210:1: ( ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4211:2: ','
                    {
                    match(input,34,FOLLOW_34_in_rule__MapInstance__Group__5__Impl8447); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4222:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4226:1: ( rule__MapInstance__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4227:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__68480);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4233:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4237:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4238:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4238:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4239:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__MapInstance__Group__6__Impl8508); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4266:1: rule__MapInstance__Group_3__0 : rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 ;
    public final void rule__MapInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4270:1: ( rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4271:2: rule__MapInstance__Group_3__0__Impl rule__MapInstance__Group_3__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__08553);
            rule__MapInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__08556);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4278:1: rule__MapInstance__Group_3__0__Impl : ( ( rule__MapInstance__KeysAssignment_3_0 ) ) ;
    public final void rule__MapInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4282:1: ( ( ( rule__MapInstance__KeysAssignment_3_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4283:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4283:1: ( ( rule__MapInstance__KeysAssignment_3_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4284:1: ( rule__MapInstance__KeysAssignment_3_0 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4285:1: ( rule__MapInstance__KeysAssignment_3_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4285:2: rule__MapInstance__KeysAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl8583);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4295:1: rule__MapInstance__Group_3__1 : rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 ;
    public final void rule__MapInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4299:1: ( rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4300:2: rule__MapInstance__Group_3__1__Impl rule__MapInstance__Group_3__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__18613);
            rule__MapInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__18616);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4307:1: rule__MapInstance__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4311:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4312:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4312:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4313:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__MapInstance__Group_3__1__Impl8644); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4326:1: rule__MapInstance__Group_3__2 : rule__MapInstance__Group_3__2__Impl ;
    public final void rule__MapInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4330:1: ( rule__MapInstance__Group_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4331:2: rule__MapInstance__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__28675);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4337:1: rule__MapInstance__Group_3__2__Impl : ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) ;
    public final void rule__MapInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4341:1: ( ( ( rule__MapInstance__ValuesAssignment_3_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4342:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4342:1: ( ( rule__MapInstance__ValuesAssignment_3_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4343:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4344:1: ( rule__MapInstance__ValuesAssignment_3_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4344:2: rule__MapInstance__ValuesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl8702);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4360:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4364:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4365:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__08738);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__08741);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4372:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4376:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4377:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4377:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4378:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__MapInstance__Group_4__0__Impl8769); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4391:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4395:1: ( rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4396:2: rule__MapInstance__Group_4__1__Impl rule__MapInstance__Group_4__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__18800);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__18803);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4403:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__KeysAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4407:1: ( ( ( rule__MapInstance__KeysAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4408:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4408:1: ( ( rule__MapInstance__KeysAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4409:1: ( rule__MapInstance__KeysAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4410:1: ( rule__MapInstance__KeysAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4410:2: rule__MapInstance__KeysAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl8830);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4420:1: rule__MapInstance__Group_4__2 : rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 ;
    public final void rule__MapInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4424:1: ( rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4425:2: rule__MapInstance__Group_4__2__Impl rule__MapInstance__Group_4__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__28860);
            rule__MapInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__28863);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4432:1: rule__MapInstance__Group_4__2__Impl : ( ':' ) ;
    public final void rule__MapInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4436:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4437:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4437:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4438:1: ':'
            {
             before(grammarAccess.getMapInstanceAccess().getColonKeyword_4_2()); 
            match(input,23,FOLLOW_23_in_rule__MapInstance__Group_4__2__Impl8891); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4451:1: rule__MapInstance__Group_4__3 : rule__MapInstance__Group_4__3__Impl ;
    public final void rule__MapInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4455:1: ( rule__MapInstance__Group_4__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4456:2: rule__MapInstance__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__38922);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4462:1: rule__MapInstance__Group_4__3__Impl : ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) ;
    public final void rule__MapInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4466:1: ( ( ( rule__MapInstance__ValuesAssignment_4_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4467:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4467:1: ( ( rule__MapInstance__ValuesAssignment_4_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4468:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4469:1: ( rule__MapInstance__ValuesAssignment_4_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4469:2: rule__MapInstance__ValuesAssignment_4_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl8949);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4487:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4491:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4492:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__08987);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__08990);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4499:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4503:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4504:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4504:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4505:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__StringList__Group__0__Impl9018); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4518:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4522:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4523:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__19049);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__19052);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4530:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4534:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4535:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4535:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4536:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4537:1: ( rule__StringList__ValuesAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4537:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl9079);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4547:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4551:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4552:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__29109);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__29112);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4559:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4563:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4564:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4564:1: ( ( rule__StringList__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4565:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4566:1: ( rule__StringList__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==RULE_STRING) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4566:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl9139);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4576:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4580:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4581:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__39170);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__39173);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4588:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4592:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4593:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4593:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4594:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4595:1: ( ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4596:2: ','
                    {
                    match(input,34,FOLLOW_34_in_rule__StringList__Group__3__Impl9202); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4607:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4611:1: ( rule__StringList__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4612:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__49235);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4618:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4622:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4623:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4623:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4624:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,37,FOLLOW_37_in_rule__StringList__Group__4__Impl9263); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4647:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4651:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4652:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__09304);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__09307);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4659:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4663:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4664:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4664:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4665:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__StringList__Group_2__0__Impl9335); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4678:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4682:1: ( rule__StringList__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4683:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__19366);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4689:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4693:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4694:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4694:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4695:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4696:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4696:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl9393);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4711:1: rule__Xplatform__PlatformAssignment_0 : ( rulePlatform ) ;
    public final void rule__Xplatform__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4715:1: ( ( rulePlatform ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4716:1: ( rulePlatform )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4716:1: ( rulePlatform )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4717:1: rulePlatform
            {
             before(grammarAccess.getXplatformAccess().getPlatformPlatformParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePlatform_in_rule__Xplatform__PlatformAssignment_09432);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4726:1: rule__Xplatform__ResourcesAssignment_1_0 : ( ruleXplatformResourceDefinition ) ;
    public final void rule__Xplatform__ResourcesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4730:1: ( ( ruleXplatformResourceDefinition ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4731:1: ( ruleXplatformResourceDefinition )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4731:1: ( ruleXplatformResourceDefinition )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4732:1: ruleXplatformResourceDefinition
            {
             before(grammarAccess.getXplatformAccess().getResourcesXplatformResourceDefinitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_rule__Xplatform__ResourcesAssignment_1_09463);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4741:1: rule__Xplatform__CallsAssignment_1_1 : ( ruleXplatformCallDefinition ) ;
    public final void rule__Xplatform__CallsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4745:1: ( ( ruleXplatformCallDefinition ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4746:1: ( ruleXplatformCallDefinition )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4746:1: ( ruleXplatformCallDefinition )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4747:1: ruleXplatformCallDefinition
            {
             before(grammarAccess.getXplatformAccess().getCallsXplatformCallDefinitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleXplatformCallDefinition_in_rule__Xplatform__CallsAssignment_1_19494);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4756:1: rule__Platform__PlatformsAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Platform__PlatformsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4760:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4761:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4761:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4762:1: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_09525); 
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


    // $ANTLR start "rule__Platform__WhereToGenerateAssignment_2_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4771:1: rule__Platform__WhereToGenerateAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Platform__WhereToGenerateAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4775:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4776:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4776:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4777:1: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getWhereToGenerateSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Platform__WhereToGenerateAssignment_2_29556); 
             after(grammarAccess.getPlatformAccess().getWhereToGenerateSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__WhereToGenerateAssignment_2_2"


    // $ANTLR start "rule__XplatformCallDefinition__NameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4786:1: rule__XplatformCallDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XplatformCallDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4790:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4791:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4791:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4792:1: RULE_ID
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XplatformCallDefinition__NameAssignment_19587); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4801:1: rule__XplatformCallDefinition__MethodAssignment_3 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__XplatformCallDefinition__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4805:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4806:1: ( RULE_RESTFUL_METHODS )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4806:1: ( RULE_RESTFUL_METHODS )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4807:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__XplatformCallDefinition__MethodAssignment_39618); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4816:1: rule__XplatformCallDefinition__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__XplatformCallDefinition__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4820:1: ( ( ruleURI ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4821:1: ( ruleURI )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4821:1: ( ruleURI )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4822:1: ruleURI
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__XplatformCallDefinition__UriAssignment_59649);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4831:1: rule__XplatformCallDefinition__RequestHeadersAssignment_6_4 : ( ruleXplatformHeader ) ;
    public final void rule__XplatformCallDefinition__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4835:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4836:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4836:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4837:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__RequestHeadersAssignment_6_49680);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4846:1: rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2 : ( ruleXplatformHeader ) ;
    public final void rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4850:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4851:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4851:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4852:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_29711);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4861:1: rule__XplatformCallDefinition__JsonToClientAssignment_7_2 : ( ruleXplatformJson ) ;
    public final void rule__XplatformCallDefinition__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4865:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4866:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4866:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4867:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToClientAssignment_7_29742);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4876:1: rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2 : ( ruleXplatformJson ) ;
    public final void rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4880:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4881:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4881:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4882:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_29773);
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


    // $ANTLR start "rule__URI__UriParametersAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4891:1: rule__URI__UriParametersAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__URI__UriParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4895:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4896:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4896:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4897:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getUriParametersIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__UriParametersAssignment_1_19804); 
             after(grammarAccess.getURIAccess().getUriParametersIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__UriParametersAssignment_1_1"


    // $ANTLR start "rule__XplatformHeader__NameAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4906:1: rule__XplatformHeader__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XplatformHeader__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4910:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4911:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4911:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4912:1: RULE_ID
            {
             before(grammarAccess.getXplatformHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XplatformHeader__NameAssignment_09835); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4921:1: rule__XplatformHeader__HeaderKeyValuesAssignment_3 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4925:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4926:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4926:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4927:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_39866);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4936:1: rule__XplatformHeader__HeaderKeyValuesAssignment_4_1 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4940:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4941:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4941:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4942:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_4_19897);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4951:1: rule__XplatformHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4955:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4956:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4956:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4957:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_09928); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4966:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4970:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4971:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4971:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4972:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_09959); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4981:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 : ( RULE_XPLATFORM_HEADER_PARAMETER ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4985:1: ( ( RULE_XPLATFORM_HEADER_PARAMETER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4986:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4986:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4987:1: RULE_XPLATFORM_HEADER_PARAMETER
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
            match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_19990); 
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


    // $ANTLR start "rule__XplatformJson__NameAssignment_0_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4996:1: rule__XplatformJson__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__XplatformJson__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5000:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5001:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5001:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5002:1: RULE_ID
            {
             before(grammarAccess.getXplatformJsonAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XplatformJson__NameAssignment_0_010021); 
             after(grammarAccess.getXplatformJsonAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__NameAssignment_0_0"


    // $ANTLR start "rule__XplatformJson__TypeAssignment_0_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5011:1: rule__XplatformJson__TypeAssignment_0_2 : ( ruleJsonType ) ;
    public final void rule__XplatformJson__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5015:1: ( ( ruleJsonType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5016:1: ( ruleJsonType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5016:1: ( ruleJsonType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5017:1: ruleJsonType
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_210052);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__TypeAssignment_0_2"


    // $ANTLR start "rule__XplatformJson__MetaTypeAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5026:1: rule__XplatformJson__MetaTypeAssignment_1 : ( ruleJsonMetaType ) ;
    public final void rule__XplatformJson__MetaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5030:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5031:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5031:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5032:1: ruleJsonMetaType
            {
             before(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_110083);
            ruleJsonMetaType();

            state._fsp--;

             after(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__MetaTypeAssignment_1"


    // $ANTLR start "rule__XplatformJson__CompositeAssignment_2_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5041:1: rule__XplatformJson__CompositeAssignment_2_0 : ( ruleJsonObject ) ;
    public final void rule__XplatformJson__CompositeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5045:1: ( ( ruleJsonObject ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5046:1: ( ruleJsonObject )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5046:1: ( ruleJsonObject )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5047:1: ruleJsonObject
            {
             before(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleJsonObject_in_rule__XplatformJson__CompositeAssignment_2_010114);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__CompositeAssignment_2_0"


    // $ANTLR start "rule__JsonMetaArray__MetaTypeAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5056:1: rule__JsonMetaArray__MetaTypeAssignment_1 : ( ruleJsonMetaType ) ;
    public final void rule__JsonMetaArray__MetaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5060:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5061:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5061:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5062:1: ruleJsonMetaType
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_110145);
            ruleJsonMetaType();

            state._fsp--;

             after(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaArray__MetaTypeAssignment_1"


    // $ANTLR start "rule__JsonMetaType__ScalarAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5071:1: rule__JsonMetaType__ScalarAssignment_0 : ( ruleJsonMetaScalarType ) ;
    public final void rule__JsonMetaType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5075:1: ( ( ruleJsonMetaScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5076:1: ( ruleJsonMetaScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5076:1: ( ruleJsonMetaScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5077:1: ruleJsonMetaScalarType
            {
             before(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_010176);
            ruleJsonMetaScalarType();

            state._fsp--;

             after(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaType__ScalarAssignment_0"


    // $ANTLR start "rule__JsonMetaType__CompositeAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5086:1: rule__JsonMetaType__CompositeAssignment_1 : ( ruleJsonMetaArray ) ;
    public final void rule__JsonMetaType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5090:1: ( ( ruleJsonMetaArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5091:1: ( ruleJsonMetaArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5091:1: ( ruleJsonMetaArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5092:1: ruleJsonMetaArray
            {
             before(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_110207);
            ruleJsonMetaArray();

            state._fsp--;

             after(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaType__CompositeAssignment_1"


    // $ANTLR start "rule__JsonCompositeType__CompositeAssignment"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5101:1: rule__JsonCompositeType__CompositeAssignment : ( ruleJsonArray ) ;
    public final void rule__JsonCompositeType__CompositeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5105:1: ( ( ruleJsonArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5106:1: ( ruleJsonArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5106:1: ( ruleJsonArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5107:1: ruleJsonArray
            {
             before(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment10238);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCompositeType__CompositeAssignment"


    // $ANTLR start "rule__JsonType__ScalarAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5116:1: rule__JsonType__ScalarAssignment_0 : ( ruleJsonScalarType ) ;
    public final void rule__JsonType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5120:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5121:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5121:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5122:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_010269);
            ruleJsonScalarType();

            state._fsp--;

             after(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__ScalarAssignment_0"


    // $ANTLR start "rule__JsonType__CompositeAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5131:1: rule__JsonType__CompositeAssignment_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5135:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5136:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5136:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5137:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_110300);
            ruleJsonCompositeType();

            state._fsp--;

             after(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__CompositeAssignment_1"


    // $ANTLR start "rule__JsonScalarType__BoolAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5146:1: rule__JsonScalarType__BoolAssignment_0 : ( RULE_JSON_LITERAL_BOOLEAN ) ;
    public final void rule__JsonScalarType__BoolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5150:1: ( ( RULE_JSON_LITERAL_BOOLEAN ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5151:1: ( RULE_JSON_LITERAL_BOOLEAN )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5151:1: ( RULE_JSON_LITERAL_BOOLEAN )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5152:1: RULE_JSON_LITERAL_BOOLEAN
            {
             before(grammarAccess.getJsonScalarTypeAccess().getBoolJSON_LITERAL_BOOLEANTerminalRuleCall_0_0()); 
            match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_010331); 
             after(grammarAccess.getJsonScalarTypeAccess().getBoolJSON_LITERAL_BOOLEANTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__BoolAssignment_0"


    // $ANTLR start "rule__JsonScalarType__StringAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5161:1: rule__JsonScalarType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__JsonScalarType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5165:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5166:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5166:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5167:1: RULE_STRING
            {
             before(grammarAccess.getJsonScalarTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_110362); 
             after(grammarAccess.getJsonScalarTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__StringAssignment_1"


    // $ANTLR start "rule__JsonScalarType__NumberAssignment_2_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5176:1: rule__JsonScalarType__NumberAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__JsonScalarType__NumberAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5180:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5181:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5181:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5182:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_010393); 
             after(grammarAccess.getJsonScalarTypeAccess().getNumberINTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__NumberAssignment_2_0"


    // $ANTLR start "rule__JsonScalarType__NullAssignment_3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5191:1: rule__JsonScalarType__NullAssignment_3 : ( RULE_JSON_LITERAL_NULL ) ;
    public final void rule__JsonScalarType__NullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5195:1: ( ( RULE_JSON_LITERAL_NULL ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5196:1: ( RULE_JSON_LITERAL_NULL )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5196:1: ( RULE_JSON_LITERAL_NULL )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5197:1: RULE_JSON_LITERAL_NULL
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 
            match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_310424); 
             after(grammarAccess.getJsonScalarTypeAccess().getNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonScalarType__NullAssignment_3"


    // $ANTLR start "rule__JsonArray__ElementsAssignment_0_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5206:1: rule__JsonArray__ElementsAssignment_0_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5210:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5211:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5211:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5212:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_110455);
            ruleJsonScalarType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ElementsAssignment_0_1"


    // $ANTLR start "rule__JsonArray__ElementsAssignment_0_2_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5221:1: rule__JsonArray__ElementsAssignment_0_2_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5225:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5226:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5226:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5227:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_2_110486);
            ruleJsonScalarType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ElementsAssignment_0_2_1"


    // $ANTLR start "rule__JsonArray__CompositesAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5236:1: rule__JsonArray__CompositesAssignment_1_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5240:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5241:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5241:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5242:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_110517);
            ruleJsonCompositeType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__CompositesAssignment_1_1"


    // $ANTLR start "rule__JsonArray__CompositesAssignment_1_2_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5251:1: rule__JsonArray__CompositesAssignment_1_2_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5255:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5256:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5256:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5257:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_2_110548);
            ruleJsonCompositeType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__CompositesAssignment_1_2_1"


    // $ANTLR start "rule__JsonObject__KeysAssignment_1_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5266:1: rule__JsonObject__KeysAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__JsonObject__KeysAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5270:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5271:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5271:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5272:1: RULE_STRING
            {
             before(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_1_010579); 
             after(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__KeysAssignment_1_0"


    // $ANTLR start "rule__JsonObject__ValuesAssignment_1_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5281:1: rule__JsonObject__ValuesAssignment_1_2 : ( ruleXplatformJson ) ;
    public final void rule__JsonObject__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5285:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5286:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5286:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5287:1: ruleXplatformJson
            {
             before(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_1_210610);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__ValuesAssignment_1_2"


    // $ANTLR start "rule__JsonObject__KeysAssignment_2_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5296:1: rule__JsonObject__KeysAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__JsonObject__KeysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5300:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5301:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5301:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5302:1: RULE_STRING
            {
             before(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_2_110641); 
             after(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__KeysAssignment_2_1"


    // $ANTLR start "rule__JsonObject__ValuesAssignment_2_3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5311:1: rule__JsonObject__ValuesAssignment_2_3 : ( ruleXplatformJson ) ;
    public final void rule__JsonObject__ValuesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5315:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5316:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5316:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5317:1: ruleXplatformJson
            {
             before(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_2_310672);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__ValuesAssignment_2_3"


    // $ANTLR start "rule__XplatformResourceDefinition__ResourcesAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5326:1: rule__XplatformResourceDefinition__ResourcesAssignment_0 : ( ruleMapInstance ) ;
    public final void rule__XplatformResourceDefinition__ResourcesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5330:1: ( ( ruleMapInstance ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5331:1: ( ruleMapInstance )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5331:1: ( ruleMapInstance )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5332:1: ruleMapInstance
            {
             before(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMapInstance_in_rule__XplatformResourceDefinition__ResourcesAssignment_010703);
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


    // $ANTLR start "rule__XplatformResourceDefinition__ResourcesAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5341:1: rule__XplatformResourceDefinition__ResourcesAssignment_1 : ( ruleEnumInstance ) ;
    public final void rule__XplatformResourceDefinition__ResourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5345:1: ( ( ruleEnumInstance ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5346:1: ( ruleEnumInstance )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5346:1: ( ruleEnumInstance )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5347:1: ruleEnumInstance
            {
             before(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesEnumInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_rule__XplatformResourceDefinition__ResourcesAssignment_110734);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesEnumInstanceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformResourceDefinition__ResourcesAssignment_1"


    // $ANTLR start "rule__EnumInstance__NameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5356:1: rule__EnumInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5360:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5361:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5361:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5362:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_110765); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5371:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5375:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5376:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5376:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5377:1: RULE_STRING
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumInstance__ValuesAssignment_310796); 
             after(grammarAccess.getEnumInstanceAccess().getValuesSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5386:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5390:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5391:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5391:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5392:1: RULE_STRING
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumInstance__ValuesAssignment_4_110827); 
             after(grammarAccess.getEnumInstanceAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5401:1: rule__MapInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5405:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5406:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5406:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5407:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_110858); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5416:1: rule__MapInstance__KeysAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5420:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5421:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5421:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5422:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_010889); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5431:1: rule__MapInstance__ValuesAssignment_3_2 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5435:1: ( ( ruleNestedType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5436:1: ( ruleNestedType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5436:1: ( ruleNestedType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5437:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_210920);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5446:1: rule__MapInstance__KeysAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__KeysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5450:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5451:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5451:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5452:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_110951); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5461:1: rule__MapInstance__ValuesAssignment_4_3 : ( ruleNestedType ) ;
    public final void rule__MapInstance__ValuesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5465:1: ( ( ruleNestedType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5466:1: ( ruleNestedType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5466:1: ( ruleNestedType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5467:1: ruleNestedType
            {
             before(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_310982);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5476:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5480:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5481:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5481:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5482:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_111013); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5491:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5495:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5496:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5496:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5497:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_111044); 
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


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\36\uffff";
    static final String DFA1_eofS =
        "\1\1\35\uffff";
    static final String DFA1_minS =
        "\1\26\1\uffff\2\7\2\23\1\7\1\4\1\27\1\24\2\4\1\uffff\1\24\1\4\1"+
        "\24\1\7\1\uffff\1\42\1\27\1\4\1\24\1\4\1\42\1\24\1\4\1\42\1\4\1"+
        "\24\1\42";
    static final String DFA1_maxS =
        "\1\50\1\uffff\2\7\2\23\1\7\1\4\1\27\1\42\1\44\1\24\1\uffff\1\42"+
        "\1\4\1\42\1\24\1\uffff\1\45\1\27\1\45\1\42\1\44\1\45\1\42\1\4\2"+
        "\45\1\42\1\45";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\12\uffff\1\1\4\uffff\1\1\14\uffff";
    static final String DFA1_specialS =
        "\36\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\20\uffff\1\3\1\2",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\15\uffff\1\13",
            "\1\15\37\uffff\1\16",
            "\1\17\17\uffff\1\14",
            "",
            "\1\21\15\uffff\1\20",
            "\1\22",
            "\1\14\15\uffff\1\13",
            "\1\23\14\uffff\1\21",
            "",
            "\1\24\2\uffff\1\25",
            "\1\26",
            "\1\27\40\uffff\1\25",
            "\1\21\15\uffff\1\20",
            "\1\30\37\uffff\1\31",
            "\1\24\2\uffff\1\25",
            "\1\21\15\uffff\1\20",
            "\1\32",
            "\1\33\2\uffff\1\34",
            "\1\35\40\uffff\1\34",
            "\1\21\15\uffff\1\20",
            "\1\33\2\uffff\1\34"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 502:1: ( rule__XplatformResourceDefinition__Alternatives )*";
        }
    }
 

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
    public static final BitSet FOLLOW_rule__XplatformJson__Alternatives_in_ruleXplatformJson454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaScalarType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaArray548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__0_in_ruleJsonMetaArray574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__Alternatives_in_ruleJsonMetaType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeType__CompositeAssignment_in_ruleJsonCompositeType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Alternatives_in_ruleJsonType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonScalarType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Alternatives_in_ruleJsonScalarType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Alternatives_in_ruleJsonArray874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformResourceDefinition968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResourceDefinition__Alternatives_in_ruleXplatformResourceDefinition996 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rule__XplatformResourceDefinition__Alternatives_in_ruleXplatformResourceDefinition1008 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0_in_ruleStringList1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedType__Alternatives_in_ruleNestedType1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__ResourcesAssignment_1_0_in_rule__Xplatform__Alternatives_11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__CallsAssignment_1_1_in_rule__Xplatform__Alternatives_11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_21338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_21356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_in_rule__XplatformJson__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__0_in_rule__XplatformJson__Alternatives1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResourceDefinition__ResourcesAssignment_0_in_rule__XplatformResourceDefinition__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResourceDefinition__ResourcesAssignment_1_in_rule__XplatformResourceDefinition__Alternatives1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NestedType__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__NestedType__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01871 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__PlatformAssignment_0_in_rule__Xplatform__Group__0__Impl1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1960 = new BitSet(new long[]{0x0000018000400002L});
    public static final BitSet FOLLOW_rule__Xplatform__Alternatives_1_in_rule__Xplatform__Group__1__Impl1972 = new BitSet(new long[]{0x0000018000400002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__02009 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__02012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Platform__Group__0__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__12071 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__12074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Platform__Group__1__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__22133 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__22136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl2165 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0_in_rule__Platform__Group__2__Impl2177 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__32210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Platform__Group__3__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__0__Impl_in_rule__Platform__Group_2__02277 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1_in_rule__Platform__Group_2__02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__PlatformsAssignment_2_0_in_rule__Platform__Group_2__0__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__1__Impl_in_rule__Platform__Group_2__12337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2_in_rule__Platform__Group_2__12340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Platform__Group_2__1__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group_2__2__Impl_in_rule__Platform__Group_2__22399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__WhereToGenerateAssignment_2_2_in_rule__Platform__Group_2__2__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__0__Impl_in_rule__XplatformCallDefinition__Group__02462 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__1_in_rule__XplatformCallDefinition__Group__02465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__XplatformCallDefinition__Group__0__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__1__Impl_in_rule__XplatformCallDefinition__Group__12524 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__2_in_rule__XplatformCallDefinition__Group__12527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__NameAssignment_1_in_rule__XplatformCallDefinition__Group__1__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__2__Impl_in_rule__XplatformCallDefinition__Group__22584 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__3_in_rule__XplatformCallDefinition__Group__22587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__XplatformCallDefinition__Group__2__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__3__Impl_in_rule__XplatformCallDefinition__Group__32646 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__4_in_rule__XplatformCallDefinition__Group__32649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__MethodAssignment_3_in_rule__XplatformCallDefinition__Group__3__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__4__Impl_in_rule__XplatformCallDefinition__Group__42706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__5_in_rule__XplatformCallDefinition__Group__42709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__XplatformCallDefinition__Group__4__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__5__Impl_in_rule__XplatformCallDefinition__Group__52768 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__6_in_rule__XplatformCallDefinition__Group__52771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__UriAssignment_5_in_rule__XplatformCallDefinition__Group__5__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__6__Impl_in_rule__XplatformCallDefinition__Group__62828 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__7_in_rule__XplatformCallDefinition__Group__62831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__0_in_rule__XplatformCallDefinition__Group__6__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group__7__Impl_in_rule__XplatformCallDefinition__Group__72889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__0_in_rule__XplatformCallDefinition__Group__7__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__0__Impl_in_rule__XplatformCallDefinition__Group_6__02963 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__1_in_rule__XplatformCallDefinition__Group_6__02966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__XplatformCallDefinition__Group_6__0__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__1__Impl_in_rule__XplatformCallDefinition__Group_6__13025 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__2_in_rule__XplatformCallDefinition__Group_6__13028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__XplatformCallDefinition__Group_6__1__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__2__Impl_in_rule__XplatformCallDefinition__Group_6__23087 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__3_in_rule__XplatformCallDefinition__Group_6__23090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__XplatformCallDefinition__Group_6__2__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__3__Impl_in_rule__XplatformCallDefinition__Group_6__33149 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__4_in_rule__XplatformCallDefinition__Group_6__33152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__XplatformCallDefinition__Group_6__3__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__4__Impl_in_rule__XplatformCallDefinition__Group_6__43211 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__5_in_rule__XplatformCallDefinition__Group_6__43214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__RequestHeadersAssignment_6_4_in_rule__XplatformCallDefinition__Group_6__4__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6__5__Impl_in_rule__XplatformCallDefinition__Group_6__53271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__0_in_rule__XplatformCallDefinition__Group_6__5__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__0__Impl_in_rule__XplatformCallDefinition__Group_6_5__03341 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__1_in_rule__XplatformCallDefinition__Group_6_5__03344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__XplatformCallDefinition__Group_6_5__0__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__1__Impl_in_rule__XplatformCallDefinition__Group_6_5__13403 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__2_in_rule__XplatformCallDefinition__Group_6_5__13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__XplatformCallDefinition__Group_6_5__1__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_6_5__2__Impl_in_rule__XplatformCallDefinition__Group_6_5__23465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_2_in_rule__XplatformCallDefinition__Group_6_5__2__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__0__Impl_in_rule__XplatformCallDefinition__Group_7__03528 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__1_in_rule__XplatformCallDefinition__Group_7__03531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformCallDefinition__Group_7__0__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__1__Impl_in_rule__XplatformCallDefinition__Group_7__13590 = new BitSet(new long[]{0x00000012000B8080L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__2_in_rule__XplatformCallDefinition__Group_7__13593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformCallDefinition__Group_7__1__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__2__Impl_in_rule__XplatformCallDefinition__Group_7__23652 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__3_in_rule__XplatformCallDefinition__Group_7__23655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__JsonToClientAssignment_7_2_in_rule__XplatformCallDefinition__Group_7__2__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7__3__Impl_in_rule__XplatformCallDefinition__Group_7__33712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__0_in_rule__XplatformCallDefinition__Group_7__3__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__0__Impl_in_rule__XplatformCallDefinition__Group_7_3__03778 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__1_in_rule__XplatformCallDefinition__Group_7_3__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformCallDefinition__Group_7_3__0__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__1__Impl_in_rule__XplatformCallDefinition__Group_7_3__13840 = new BitSet(new long[]{0x00000012000B8080L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__2_in_rule__XplatformCallDefinition__Group_7_3__13843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformCallDefinition__Group_7_3__1__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__Group_7_3__2__Impl_in_rule__XplatformCallDefinition__Group_7_3__23902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_2_in_rule__XplatformCallDefinition__Group_7_3__2__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03965 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3998 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl4011 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__14044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__04106 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__04109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__URI__Group_1__0__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__14168 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__14171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__UriParametersAssignment_1_1_in_rule__URI__Group_1__1__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__24228 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__24231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__URI__Group_1__2__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__34290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl4318 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__04357 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__04360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__NameAssignment_0_in_rule__XplatformHeader__Group__0__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__14418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__XplatformHeader__Group__1__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__24480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__24483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__XplatformHeader__Group__2__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__34542 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__34545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_in_rule__XplatformHeader__Group__3__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__44602 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__44605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__0_in_rule__XplatformHeader__Group__4__Impl4632 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__54663 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__54666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__XplatformHeader__Group__5__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__64728 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__7_in_rule__XplatformHeader__Group__64731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__XplatformHeader__Group__6__Impl4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__7__Impl_in_rule__XplatformHeader__Group__74790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__XplatformHeader__Group__7__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__0__Impl_in_rule__XplatformHeader__Group_4__04865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__1_in_rule__XplatformHeader__Group_4__04868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__XplatformHeader__Group_4__0__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_4__1__Impl_in_rule__XplatformHeader__Group_4__14927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_4_1_in_rule__XplatformHeader__Group_4__1__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__04988 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__04991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__15048 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__15051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__25110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__05173 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__05176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__NameAssignment_0_0_in_rule__XplatformJson__Group_0__0__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__15234 = new BitSet(new long[]{0x0000001000000C50L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__2_in_rule__XplatformJson__Group_0__15237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__XplatformJson__Group_0__1__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__2__Impl_in_rule__XplatformJson__Group_0__25296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__TypeAssignment_0_2_in_rule__XplatformJson__Group_0__2__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__0__Impl_in_rule__XplatformJson__Group_2__05359 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__1_in_rule__XplatformJson__Group_2__05362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__CompositeAssignment_2_0_in_rule__XplatformJson__Group_2__0__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__1__Impl_in_rule__XplatformJson__Group_2__15419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__XplatformJson__Group_2__1__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__05482 = new BitSet(new long[]{0x0000001000038000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__05485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonMetaArray__Group__0__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__15544 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__15547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__25604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__JsonMetaArray__Group__2__Impl5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__05669 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__05672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__15729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__05791 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__05794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__JsonScalarType__Group_2_1__0__Impl5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__15853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__05913 = new BitSet(new long[]{0x0000000000000C50L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__05916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonArray__Group_0__0__Impl5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__15975 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__15978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementsAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__26035 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__26038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl6065 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__36096 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__4_in_rule__JsonArray__Group_0__36099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_0__3__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__4__Impl_in_rule__JsonArray__Group_0__46161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__JsonArray__Group_0__4__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__06230 = new BitSet(new long[]{0x0000000000000C50L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__06233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_0_2__0__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__16292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementsAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__06353 = new BitSet(new long[]{0x0000001000000C50L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__06356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonArray__Group_1__0__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__16415 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__16418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositesAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__26475 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__26478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl6505 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__36536 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__4_in_rule__JsonArray__Group_1__36539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_1__3__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__4__Impl_in_rule__JsonArray__Group_1__46601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__JsonArray__Group_1__4__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__06670 = new BitSet(new long[]{0x0000001000000C50L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__06673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_1_2__0__Impl6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__16732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositesAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__06793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__06796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JsonObject__Group__0__Impl6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__16855 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__16858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__0_in_rule__JsonObject__Group__1__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__26915 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__26918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl6945 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__36976 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__36979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonObject__Group__3__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__47041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JsonObject__Group__4__Impl7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__0__Impl_in_rule__JsonObject__Group_1__07110 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__1_in_rule__JsonObject__Group_1__07113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeysAssignment_1_0_in_rule__JsonObject__Group_1__0__Impl7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__1__Impl_in_rule__JsonObject__Group_1__17170 = new BitSet(new long[]{0x00000012000B8080L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__2_in_rule__JsonObject__Group_1__17173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonObject__Group_1__1__Impl7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__2__Impl_in_rule__JsonObject__Group_1__27232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__ValuesAssignment_1_2_in_rule__JsonObject__Group_1__2__Impl7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__07295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__07298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonObject__Group_2__0__Impl7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__17357 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__2_in_rule__JsonObject__Group_2__17360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeysAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__2__Impl_in_rule__JsonObject__Group_2__27417 = new BitSet(new long[]{0x00000012000B8080L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__3_in_rule__JsonObject__Group_2__27420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JsonObject__Group_2__2__Impl7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__3__Impl_in_rule__JsonObject__Group_2__37479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__ValuesAssignment_2_3_in_rule__JsonObject__Group_2__3__Impl7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__07544 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__07547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumInstance__Group__0__Impl7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__17606 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__17609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__NameAssignment_1_in_rule__EnumInstance__Group__1__Impl7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__27666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__27669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumInstance__Group__2__Impl7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__37728 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__37731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__47788 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__47791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl7818 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__57849 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__57852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumInstance__Group__5__Impl7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__67914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumInstance__Group__6__Impl7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__07987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__07990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumInstance__Group_4__0__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__08110 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__08113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MapInstance__Group__0__Impl8141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__18172 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__18175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__NameAssignment_1_in_rule__MapInstance__Group__1__Impl8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__28232 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__28235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MapInstance__Group__2__Impl8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__38294 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__38297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0_in_rule__MapInstance__Group__3__Impl8324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__48354 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__48357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl8384 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__58415 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__58418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MapInstance__Group__5__Impl8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__68480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MapInstance__Group__6__Impl8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__0__Impl_in_rule__MapInstance__Group_3__08553 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1_in_rule__MapInstance__Group_3__08556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_3_0_in_rule__MapInstance__Group_3__0__Impl8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__1__Impl_in_rule__MapInstance__Group_3__18613 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2_in_rule__MapInstance__Group_3__18616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapInstance__Group_3__1__Impl8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_3__2__Impl_in_rule__MapInstance__Group_3__28675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_2_in_rule__MapInstance__Group_3__2__Impl8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__08738 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__08741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MapInstance__Group_4__0__Impl8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__18800 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2_in_rule__MapInstance__Group_4__18803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__KeysAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__2__Impl_in_rule__MapInstance__Group_4__28860 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3_in_rule__MapInstance__Group_4__28863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapInstance__Group_4__2__Impl8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__3__Impl_in_rule__MapInstance__Group_4__38922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_3_in_rule__MapInstance__Group_4__3__Impl8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__08987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__08990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__StringList__Group__0__Impl9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__19049 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__19052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__29109 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__29112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl9139 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__39170 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__39173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringList__Group__3__Impl9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__49235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__StringList__Group__4__Impl9263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__09304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__09307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringList__Group_2__0__Impl9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__19366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl9393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__Xplatform__PlatformAssignment_09432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_rule__Xplatform__ResourcesAssignment_1_09463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_rule__Xplatform__CallsAssignment_1_19494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Platform__PlatformsAssignment_2_09525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Platform__WhereToGenerateAssignment_2_29556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XplatformCallDefinition__NameAssignment_19587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__XplatformCallDefinition__MethodAssignment_39618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__XplatformCallDefinition__UriAssignment_59649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__RequestHeadersAssignment_6_49680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__XplatformCallDefinition__ResponseHeadersAssignment_6_5_29711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToClientAssignment_7_29742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__XplatformCallDefinition__JsonToServerAssignment_7_3_29773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__UriParametersAssignment_1_19804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XplatformHeader__NameAssignment_09835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_39866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_4_19897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_09928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_09959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_19990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XplatformJson__NameAssignment_0_010021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_210052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_110083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__XplatformJson__CompositeAssignment_2_010114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_110145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_010176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_110207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment10238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_010269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_110300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_010331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_110362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_010393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_310424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_110455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_2_110486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_110517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_2_110548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_1_010579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_1_210610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_2_110641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_2_310672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__XplatformResourceDefinition__ResourcesAssignment_010703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__XplatformResourceDefinition__ResourcesAssignment_110734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__NameAssignment_110765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumInstance__ValuesAssignment_310796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumInstance__ValuesAssignment_4_110827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__NameAssignment_110858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_3_010889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_3_210920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__KeysAssignment_4_110951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_rule__MapInstance__ValuesAssignment_4_310982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_111013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_111044 = new BitSet(new long[]{0x0000000000000002L});

}