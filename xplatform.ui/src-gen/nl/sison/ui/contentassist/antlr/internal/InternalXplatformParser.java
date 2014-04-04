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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_INT", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_STRING", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'boolean'", "'number'", "'string'", "'call'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'{'", "'}'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'.'", "':'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_XPLATFORM_HEADER_PARAMETER=9;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=4;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=10;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_JSON_LITERAL_NULL=11;
    public static final int RULE_RESTFUL_METHODS=7;
    public static final int RULE_INT=5;
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


    // $ANTLR start "entryRuleURI"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:88:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:89:1: ( ruleURI EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:90:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI121);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI128); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:97:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:101:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:102:1: ( ( rule__URI__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:102:1: ( ( rule__URI__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:103:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:104:1: ( rule__URI__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:104:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI154);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:116:1: entryRuleXplatformHeader : ruleXplatformHeader EOF ;
    public final void entryRuleXplatformHeader() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:117:1: ( ruleXplatformHeader EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:118:1: ruleXplatformHeader EOF
            {
             before(grammarAccess.getXplatformHeaderRule()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader181);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeader188); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:125:1: ruleXplatformHeader : ( ( rule__XplatformHeader__Group__0 ) ) ;
    public final void ruleXplatformHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:129:2: ( ( ( rule__XplatformHeader__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:130:1: ( ( rule__XplatformHeader__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:130:1: ( ( rule__XplatformHeader__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:131:1: ( rule__XplatformHeader__Group__0 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:132:1: ( rule__XplatformHeader__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:132:2: rule__XplatformHeader__Group__0
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__0_in_ruleXplatformHeader214);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:144:1: entryRuleXplatformHeaderKeyValuePair : ruleXplatformHeaderKeyValuePair EOF ;
    public final void entryRuleXplatformHeaderKeyValuePair() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:145:1: ( ruleXplatformHeaderKeyValuePair EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:146:1: ruleXplatformHeaderKeyValuePair EOF
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair241);
            ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair248); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:153:1: ruleXplatformHeaderKeyValuePair : ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) ) ;
    public final void ruleXplatformHeaderKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:157:2: ( ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:158:1: ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:158:1: ( ( rule__XplatformHeaderKeyValuePair__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:159:1: ( rule__XplatformHeaderKeyValuePair__Group__0 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:160:1: ( rule__XplatformHeaderKeyValuePair__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:160:2: rule__XplatformHeaderKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0_in_ruleXplatformHeaderKeyValuePair274);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:172:1: entryRuleXplatformJson : ruleXplatformJson EOF ;
    public final void entryRuleXplatformJson() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:173:1: ( ruleXplatformJson EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:174:1: ruleXplatformJson EOF
            {
             before(grammarAccess.getXplatformJsonRule()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson301);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformJsonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformJson308); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:181:1: ruleXplatformJson : ( ( rule__XplatformJson__Alternatives ) ) ;
    public final void ruleXplatformJson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:185:2: ( ( ( rule__XplatformJson__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:186:1: ( ( rule__XplatformJson__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:186:1: ( ( rule__XplatformJson__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:187:1: ( rule__XplatformJson__Alternatives )
            {
             before(grammarAccess.getXplatformJsonAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:188:1: ( rule__XplatformJson__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:188:2: rule__XplatformJson__Alternatives
            {
            pushFollow(FOLLOW_rule__XplatformJson__Alternatives_in_ruleXplatformJson334);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:200:1: entryRuleJsonMetaScalarType : ruleJsonMetaScalarType EOF ;
    public final void entryRuleJsonMetaScalarType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:201:1: ( ruleJsonMetaScalarType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:202:1: ruleJsonMetaScalarType EOF
            {
             before(grammarAccess.getJsonMetaScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType361);
            ruleJsonMetaScalarType();

            state._fsp--;

             after(grammarAccess.getJsonMetaScalarTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaScalarType368); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:209:1: ruleJsonMetaScalarType : ( ( rule__JsonMetaScalarType__Alternatives ) ) ;
    public final void ruleJsonMetaScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:213:2: ( ( ( rule__JsonMetaScalarType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:214:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:214:1: ( ( rule__JsonMetaScalarType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:215:1: ( rule__JsonMetaScalarType__Alternatives )
            {
             before(grammarAccess.getJsonMetaScalarTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:216:1: ( rule__JsonMetaScalarType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:216:2: rule__JsonMetaScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType394);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:228:1: entryRuleJsonMetaArray : ruleJsonMetaArray EOF ;
    public final void entryRuleJsonMetaArray() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:229:1: ( ruleJsonMetaArray EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:230:1: ruleJsonMetaArray EOF
            {
             before(grammarAccess.getJsonMetaArrayRule()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray421);
            ruleJsonMetaArray();

            state._fsp--;

             after(grammarAccess.getJsonMetaArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaArray428); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:237:1: ruleJsonMetaArray : ( ( rule__JsonMetaArray__Group__0 ) ) ;
    public final void ruleJsonMetaArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:241:2: ( ( ( rule__JsonMetaArray__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:242:1: ( ( rule__JsonMetaArray__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:242:1: ( ( rule__JsonMetaArray__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:243:1: ( rule__JsonMetaArray__Group__0 )
            {
             before(grammarAccess.getJsonMetaArrayAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:244:1: ( rule__JsonMetaArray__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:244:2: rule__JsonMetaArray__Group__0
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__0_in_ruleJsonMetaArray454);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:256:1: entryRuleJsonMetaType : ruleJsonMetaType EOF ;
    public final void entryRuleJsonMetaType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:257:1: ( ruleJsonMetaType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:258:1: ruleJsonMetaType EOF
            {
             before(grammarAccess.getJsonMetaTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType481);
            ruleJsonMetaType();

            state._fsp--;

             after(grammarAccess.getJsonMetaTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaType488); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:265:1: ruleJsonMetaType : ( ( rule__JsonMetaType__Alternatives ) ) ;
    public final void ruleJsonMetaType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:269:2: ( ( ( rule__JsonMetaType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:270:1: ( ( rule__JsonMetaType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:270:1: ( ( rule__JsonMetaType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:271:1: ( rule__JsonMetaType__Alternatives )
            {
             before(grammarAccess.getJsonMetaTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:272:1: ( rule__JsonMetaType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:272:2: rule__JsonMetaType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonMetaType__Alternatives_in_ruleJsonMetaType514);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:284:1: entryRuleJsonCompositeType : ruleJsonCompositeType EOF ;
    public final void entryRuleJsonCompositeType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:285:1: ( ruleJsonCompositeType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:286:1: ruleJsonCompositeType EOF
            {
             before(grammarAccess.getJsonCompositeTypeRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType541);
            ruleJsonCompositeType();

            state._fsp--;

             after(grammarAccess.getJsonCompositeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeType548); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:293:1: ruleJsonCompositeType : ( ( rule__JsonCompositeType__CompositeAssignment ) ) ;
    public final void ruleJsonCompositeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:297:2: ( ( ( rule__JsonCompositeType__CompositeAssignment ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:298:1: ( ( rule__JsonCompositeType__CompositeAssignment ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:298:1: ( ( rule__JsonCompositeType__CompositeAssignment ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:299:1: ( rule__JsonCompositeType__CompositeAssignment )
            {
             before(grammarAccess.getJsonCompositeTypeAccess().getCompositeAssignment()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:300:1: ( rule__JsonCompositeType__CompositeAssignment )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:300:2: rule__JsonCompositeType__CompositeAssignment
            {
            pushFollow(FOLLOW_rule__JsonCompositeType__CompositeAssignment_in_ruleJsonCompositeType574);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:312:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:313:1: ( ruleJsonType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:314:1: ruleJsonType EOF
            {
             before(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType601);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType608); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:321:1: ruleJsonType : ( ( rule__JsonType__Alternatives ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:325:2: ( ( ( rule__JsonType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:326:1: ( ( rule__JsonType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:326:1: ( ( rule__JsonType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:327:1: ( rule__JsonType__Alternatives )
            {
             before(grammarAccess.getJsonTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:328:1: ( rule__JsonType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:328:2: rule__JsonType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonType__Alternatives_in_ruleJsonType634);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:340:1: entryRuleJsonScalarType : ruleJsonScalarType EOF ;
    public final void entryRuleJsonScalarType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:341:1: ( ruleJsonScalarType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:342:1: ruleJsonScalarType EOF
            {
             before(grammarAccess.getJsonScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType661);
            ruleJsonScalarType();

            state._fsp--;

             after(grammarAccess.getJsonScalarTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonScalarType668); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:349:1: ruleJsonScalarType : ( ( rule__JsonScalarType__Alternatives ) ) ;
    public final void ruleJsonScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:353:2: ( ( ( rule__JsonScalarType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:354:1: ( ( rule__JsonScalarType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:354:1: ( ( rule__JsonScalarType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:355:1: ( rule__JsonScalarType__Alternatives )
            {
             before(grammarAccess.getJsonScalarTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:356:1: ( rule__JsonScalarType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:356:2: rule__JsonScalarType__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Alternatives_in_ruleJsonScalarType694);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:368:1: entryRuleJsonArray : ruleJsonArray EOF ;
    public final void entryRuleJsonArray() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:369:1: ( ruleJsonArray EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:370:1: ruleJsonArray EOF
            {
             before(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray721);
            ruleJsonArray();

            state._fsp--;

             after(grammarAccess.getJsonArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray728); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:377:1: ruleJsonArray : ( ( rule__JsonArray__Alternatives ) ) ;
    public final void ruleJsonArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:381:2: ( ( ( rule__JsonArray__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:382:1: ( ( rule__JsonArray__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:382:1: ( ( rule__JsonArray__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:383:1: ( rule__JsonArray__Alternatives )
            {
             before(grammarAccess.getJsonArrayAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:384:1: ( rule__JsonArray__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:384:2: rule__JsonArray__Alternatives
            {
            pushFollow(FOLLOW_rule__JsonArray__Alternatives_in_ruleJsonArray754);
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


    // $ANTLR start "entryRuleJsonKeyValuePair"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:396:1: entryRuleJsonKeyValuePair : ruleJsonKeyValuePair EOF ;
    public final void entryRuleJsonKeyValuePair() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:397:1: ( ruleJsonKeyValuePair EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:398:1: ruleJsonKeyValuePair EOF
            {
             before(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair781);
            ruleJsonKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair788); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:405:1: ruleJsonKeyValuePair : ( ( rule__JsonKeyValuePair__Group__0 ) ) ;
    public final void ruleJsonKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:409:2: ( ( ( rule__JsonKeyValuePair__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__JsonKeyValuePair__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:411:1: ( rule__JsonKeyValuePair__Group__0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:1: ( rule__JsonKeyValuePair__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:2: rule__JsonKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair814);
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


    // $ANTLR start "entryRuleJsonMetaKeyValuePair"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:424:1: entryRuleJsonMetaKeyValuePair : ruleJsonMetaKeyValuePair EOF ;
    public final void entryRuleJsonMetaKeyValuePair() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:425:1: ( ruleJsonMetaKeyValuePair EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:426:1: ruleJsonMetaKeyValuePair EOF
            {
             before(grammarAccess.getJsonMetaKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonMetaKeyValuePair_in_entryRuleJsonMetaKeyValuePair841);
            ruleJsonMetaKeyValuePair();

            state._fsp--;

             after(grammarAccess.getJsonMetaKeyValuePairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaKeyValuePair848); 

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
    // $ANTLR end "entryRuleJsonMetaKeyValuePair"


    // $ANTLR start "ruleJsonMetaKeyValuePair"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:433:1: ruleJsonMetaKeyValuePair : ( ( rule__JsonMetaKeyValuePair__Group__0 ) ) ;
    public final void ruleJsonMetaKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:437:2: ( ( ( rule__JsonMetaKeyValuePair__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__JsonMetaKeyValuePair__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__JsonMetaKeyValuePair__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:439:1: ( rule__JsonMetaKeyValuePair__Group__0 )
            {
             before(grammarAccess.getJsonMetaKeyValuePairAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:1: ( rule__JsonMetaKeyValuePair__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:2: rule__JsonMetaKeyValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__Group__0_in_ruleJsonMetaKeyValuePair874);
            rule__JsonMetaKeyValuePair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonMetaKeyValuePairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonMetaKeyValuePair"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Alternatives_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:454:1: rule__XplatformHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) );
    public final void rule__XplatformHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:458:1: ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_XPLATFORM_HEADER_PARAMETER) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:459:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:459:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:460:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:461:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:461:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_2912);
                    rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:465:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:465:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:466:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:467:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:467:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_2930);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:476:1: rule__XplatformJson__Alternatives : ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__Group_1__0 ) ) );
    public final void rule__XplatformJson__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:480:1: ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=17)||LA2_0==33) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:481:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:481:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:482:1: ( rule__XplatformJson__Group_0__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:483:1: ( rule__XplatformJson__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:483:2: rule__XplatformJson__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives963);
                    rule__XplatformJson__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:487:6: ( ( rule__XplatformJson__Group_1__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:487:6: ( ( rule__XplatformJson__Group_1__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:488:1: ( rule__XplatformJson__Group_1__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:489:1: ( rule__XplatformJson__Group_1__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:489:2: rule__XplatformJson__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_1__0_in_rule__XplatformJson__Alternatives981);
                    rule__XplatformJson__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getGroup_1()); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:498:1: rule__JsonMetaScalarType__Alternatives : ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) );
    public final void rule__JsonMetaScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:502:1: ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:503:1: ( 'boolean' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:503:1: ( 'boolean' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:504:1: 'boolean'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives1015); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:511:6: ( 'number' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:511:6: ( 'number' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:512:1: 'number'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives1035); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:519:6: ( 'string' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:519:6: ( 'string' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:520:1: 'string'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getStringKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1055); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:532:1: rule__JsonMetaType__Alternatives : ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) );
    public final void rule__JsonMetaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:536:1: ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=17)) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:537:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:537:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:538:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:539:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:539:2: rule__JsonMetaType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1089);
                    rule__JsonMetaType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:543:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:543:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:544:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:545:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:545:2: rule__JsonMetaType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1107);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:554:1: rule__JsonType__Alternatives : ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) );
    public final void rule__JsonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:558:1: ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==RULE_STRING||(LA5_0>=RULE_JSON_LITERAL_BOOLEAN && LA5_0<=RULE_JSON_LITERAL_NULL)) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:560:1: ( rule__JsonType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:561:1: ( rule__JsonType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:561:2: rule__JsonType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1140);
                    rule__JsonType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:565:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:565:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:566:1: ( rule__JsonType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:567:1: ( rule__JsonType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:567:2: rule__JsonType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1158);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:576:1: rule__JsonScalarType__Alternatives : ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) );
    public final void rule__JsonScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:580:1: ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:581:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:581:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:582:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:583:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:583:2: rule__JsonScalarType__BoolAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1191);
                    rule__JsonScalarType__BoolAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:587:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:587:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:588:1: ( rule__JsonScalarType__StringAssignment_1 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:589:1: ( rule__JsonScalarType__StringAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:589:2: rule__JsonScalarType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1209);
                    rule__JsonScalarType__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:593:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:593:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:594:1: ( rule__JsonScalarType__Group_2__0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:595:1: ( rule__JsonScalarType__Group_2__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:595:2: rule__JsonScalarType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1227);
                    rule__JsonScalarType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:599:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:599:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:600:1: ( rule__JsonScalarType__NullAssignment_3 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getNullAssignment_3()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:601:1: ( rule__JsonScalarType__NullAssignment_3 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:601:2: rule__JsonScalarType__NullAssignment_3
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1245);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:610:1: rule__JsonArray__Alternatives : ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) );
    public final void rule__JsonArray__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:614:1: ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_INT||LA7_1==RULE_STRING||(LA7_1>=RULE_JSON_LITERAL_BOOLEAN && LA7_1<=RULE_JSON_LITERAL_NULL)) ) {
                    alt7=1;
                }
                else if ( (LA7_1==33) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:615:1: ( ( rule__JsonArray__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:615:1: ( ( rule__JsonArray__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:616:1: ( rule__JsonArray__Group_0__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:617:1: ( rule__JsonArray__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:617:2: rule__JsonArray__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1278);
                    rule__JsonArray__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonArrayAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:621:6: ( ( rule__JsonArray__Group_1__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:621:6: ( ( rule__JsonArray__Group_1__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:622:1: ( rule__JsonArray__Group_1__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:623:1: ( rule__JsonArray__Group_1__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:623:2: rule__JsonArray__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1296);
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


    // $ANTLR start "rule__Xplatform__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:636:1: rule__Xplatform__Group__0 : rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 ;
    public final void rule__Xplatform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:640:1: ( rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:641:2: rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01329);
            rule__Xplatform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01332);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:648:1: rule__Xplatform__Group__0__Impl : ( 'call' ) ;
    public final void rule__Xplatform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:652:1: ( ( 'call' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:653:1: ( 'call' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:653:1: ( 'call' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:654:1: 'call'
            {
             before(grammarAccess.getXplatformAccess().getCallKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Xplatform__Group__0__Impl1360); 
             after(grammarAccess.getXplatformAccess().getCallKeyword_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:667:1: rule__Xplatform__Group__1 : rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2 ;
    public final void rule__Xplatform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:671:1: ( rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:672:2: rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11391);
            rule__Xplatform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__2_in_rule__Xplatform__Group__11394);
            rule__Xplatform__Group__2();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:679:1: rule__Xplatform__Group__1__Impl : ( ( rule__Xplatform__NameAssignment_1 ) ) ;
    public final void rule__Xplatform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:683:1: ( ( ( rule__Xplatform__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:684:1: ( ( rule__Xplatform__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:684:1: ( ( rule__Xplatform__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:685:1: ( rule__Xplatform__NameAssignment_1 )
            {
             before(grammarAccess.getXplatformAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:686:1: ( rule__Xplatform__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:686:2: rule__Xplatform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Xplatform__NameAssignment_1_in_rule__Xplatform__Group__1__Impl1421);
            rule__Xplatform__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Xplatform__Group__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:696:1: rule__Xplatform__Group__2 : rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3 ;
    public final void rule__Xplatform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:700:1: ( rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:701:2: rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__2__Impl_in_rule__Xplatform__Group__21451);
            rule__Xplatform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__3_in_rule__Xplatform__Group__21454);
            rule__Xplatform__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__2"


    // $ANTLR start "rule__Xplatform__Group__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:708:1: rule__Xplatform__Group__2__Impl : ( ( rule__Xplatform__MethodAssignment_2 ) ) ;
    public final void rule__Xplatform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:712:1: ( ( ( rule__Xplatform__MethodAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:713:1: ( ( rule__Xplatform__MethodAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:713:1: ( ( rule__Xplatform__MethodAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:714:1: ( rule__Xplatform__MethodAssignment_2 )
            {
             before(grammarAccess.getXplatformAccess().getMethodAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:715:1: ( rule__Xplatform__MethodAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:715:2: rule__Xplatform__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__Xplatform__MethodAssignment_2_in_rule__Xplatform__Group__2__Impl1481);
            rule__Xplatform__MethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getMethodAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__2__Impl"


    // $ANTLR start "rule__Xplatform__Group__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:725:1: rule__Xplatform__Group__3 : rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4 ;
    public final void rule__Xplatform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:729:1: ( rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:730:2: rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__3__Impl_in_rule__Xplatform__Group__31511);
            rule__Xplatform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__4_in_rule__Xplatform__Group__31514);
            rule__Xplatform__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__3"


    // $ANTLR start "rule__Xplatform__Group__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:737:1: rule__Xplatform__Group__3__Impl : ( 'from' ) ;
    public final void rule__Xplatform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:741:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:742:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:742:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:743:1: 'from'
            {
             before(grammarAccess.getXplatformAccess().getFromKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Xplatform__Group__3__Impl1542); 
             after(grammarAccess.getXplatformAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__3__Impl"


    // $ANTLR start "rule__Xplatform__Group__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:756:1: rule__Xplatform__Group__4 : rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5 ;
    public final void rule__Xplatform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:760:1: ( rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:761:2: rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__4__Impl_in_rule__Xplatform__Group__41573);
            rule__Xplatform__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__5_in_rule__Xplatform__Group__41576);
            rule__Xplatform__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__4"


    // $ANTLR start "rule__Xplatform__Group__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:768:1: rule__Xplatform__Group__4__Impl : ( ( rule__Xplatform__UriAssignment_4 ) ) ;
    public final void rule__Xplatform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:772:1: ( ( ( rule__Xplatform__UriAssignment_4 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:773:1: ( ( rule__Xplatform__UriAssignment_4 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:773:1: ( ( rule__Xplatform__UriAssignment_4 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:774:1: ( rule__Xplatform__UriAssignment_4 )
            {
             before(grammarAccess.getXplatformAccess().getUriAssignment_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:775:1: ( rule__Xplatform__UriAssignment_4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:775:2: rule__Xplatform__UriAssignment_4
            {
            pushFollow(FOLLOW_rule__Xplatform__UriAssignment_4_in_rule__Xplatform__Group__4__Impl1603);
            rule__Xplatform__UriAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getUriAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__4__Impl"


    // $ANTLR start "rule__Xplatform__Group__5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:785:1: rule__Xplatform__Group__5 : rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6 ;
    public final void rule__Xplatform__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:789:1: ( rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:790:2: rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__5__Impl_in_rule__Xplatform__Group__51633);
            rule__Xplatform__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__6_in_rule__Xplatform__Group__51636);
            rule__Xplatform__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__5"


    // $ANTLR start "rule__Xplatform__Group__5__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:797:1: rule__Xplatform__Group__5__Impl : ( ( rule__Xplatform__Group_5__0 )? ) ;
    public final void rule__Xplatform__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:801:1: ( ( ( rule__Xplatform__Group_5__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:802:1: ( ( rule__Xplatform__Group_5__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:802:1: ( ( rule__Xplatform__Group_5__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:803:1: ( rule__Xplatform__Group_5__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:804:1: ( rule__Xplatform__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:804:2: rule__Xplatform__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_5__0_in_rule__Xplatform__Group__5__Impl1663);
                    rule__Xplatform__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__5__Impl"


    // $ANTLR start "rule__Xplatform__Group__6"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:814:1: rule__Xplatform__Group__6 : rule__Xplatform__Group__6__Impl ;
    public final void rule__Xplatform__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:818:1: ( rule__Xplatform__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:819:2: rule__Xplatform__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__6__Impl_in_rule__Xplatform__Group__61694);
            rule__Xplatform__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__6"


    // $ANTLR start "rule__Xplatform__Group__6__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:825:1: rule__Xplatform__Group__6__Impl : ( ( rule__Xplatform__Group_6__0 )? ) ;
    public final void rule__Xplatform__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:829:1: ( ( ( rule__Xplatform__Group_6__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:830:1: ( ( rule__Xplatform__Group_6__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:830:1: ( ( rule__Xplatform__Group_6__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:831:1: ( rule__Xplatform__Group_6__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_6()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:832:1: ( rule__Xplatform__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:832:2: rule__Xplatform__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_6__0_in_rule__Xplatform__Group__6__Impl1721);
                    rule__Xplatform__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__6__Impl"


    // $ANTLR start "rule__Xplatform__Group_5__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:856:1: rule__Xplatform__Group_5__0 : rule__Xplatform__Group_5__0__Impl rule__Xplatform__Group_5__1 ;
    public final void rule__Xplatform__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:860:1: ( rule__Xplatform__Group_5__0__Impl rule__Xplatform__Group_5__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:861:2: rule__Xplatform__Group_5__0__Impl rule__Xplatform__Group_5__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5__0__Impl_in_rule__Xplatform__Group_5__01766);
            rule__Xplatform__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_5__1_in_rule__Xplatform__Group_5__01769);
            rule__Xplatform__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__0"


    // $ANTLR start "rule__Xplatform__Group_5__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:868:1: rule__Xplatform__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__Xplatform__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:872:1: ( ( 'with' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:873:1: ( 'with' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:873:1: ( 'with' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:874:1: 'with'
            {
             before(grammarAccess.getXplatformAccess().getWithKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Xplatform__Group_5__0__Impl1797); 
             after(grammarAccess.getXplatformAccess().getWithKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_5__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:887:1: rule__Xplatform__Group_5__1 : rule__Xplatform__Group_5__1__Impl rule__Xplatform__Group_5__2 ;
    public final void rule__Xplatform__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:891:1: ( rule__Xplatform__Group_5__1__Impl rule__Xplatform__Group_5__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:892:2: rule__Xplatform__Group_5__1__Impl rule__Xplatform__Group_5__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5__1__Impl_in_rule__Xplatform__Group_5__11828);
            rule__Xplatform__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_5__2_in_rule__Xplatform__Group_5__11831);
            rule__Xplatform__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__1"


    // $ANTLR start "rule__Xplatform__Group_5__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:899:1: rule__Xplatform__Group_5__1__Impl : ( 'headers' ) ;
    public final void rule__Xplatform__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:903:1: ( ( 'headers' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:904:1: ( 'headers' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:904:1: ( 'headers' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:905:1: 'headers'
            {
             before(grammarAccess.getXplatformAccess().getHeadersKeyword_5_1()); 
            match(input,21,FOLLOW_21_in_rule__Xplatform__Group_5__1__Impl1859); 
             after(grammarAccess.getXplatformAccess().getHeadersKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_5__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:918:1: rule__Xplatform__Group_5__2 : rule__Xplatform__Group_5__2__Impl rule__Xplatform__Group_5__3 ;
    public final void rule__Xplatform__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:922:1: ( rule__Xplatform__Group_5__2__Impl rule__Xplatform__Group_5__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:923:2: rule__Xplatform__Group_5__2__Impl rule__Xplatform__Group_5__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5__2__Impl_in_rule__Xplatform__Group_5__21890);
            rule__Xplatform__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_5__3_in_rule__Xplatform__Group_5__21893);
            rule__Xplatform__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__2"


    // $ANTLR start "rule__Xplatform__Group_5__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:930:1: rule__Xplatform__Group_5__2__Impl : ( 'from' ) ;
    public final void rule__Xplatform__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:934:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:935:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:935:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:936:1: 'from'
            {
             before(grammarAccess.getXplatformAccess().getFromKeyword_5_2()); 
            match(input,19,FOLLOW_19_in_rule__Xplatform__Group_5__2__Impl1921); 
             after(grammarAccess.getXplatformAccess().getFromKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__2__Impl"


    // $ANTLR start "rule__Xplatform__Group_5__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:949:1: rule__Xplatform__Group_5__3 : rule__Xplatform__Group_5__3__Impl rule__Xplatform__Group_5__4 ;
    public final void rule__Xplatform__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:953:1: ( rule__Xplatform__Group_5__3__Impl rule__Xplatform__Group_5__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:954:2: rule__Xplatform__Group_5__3__Impl rule__Xplatform__Group_5__4
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5__3__Impl_in_rule__Xplatform__Group_5__31952);
            rule__Xplatform__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_5__4_in_rule__Xplatform__Group_5__31955);
            rule__Xplatform__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__3"


    // $ANTLR start "rule__Xplatform__Group_5__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:961:1: rule__Xplatform__Group_5__3__Impl : ( 'request' ) ;
    public final void rule__Xplatform__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:965:1: ( ( 'request' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:966:1: ( 'request' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:966:1: ( 'request' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:967:1: 'request'
            {
             before(grammarAccess.getXplatformAccess().getRequestKeyword_5_3()); 
            match(input,22,FOLLOW_22_in_rule__Xplatform__Group_5__3__Impl1983); 
             after(grammarAccess.getXplatformAccess().getRequestKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__3__Impl"


    // $ANTLR start "rule__Xplatform__Group_5__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:980:1: rule__Xplatform__Group_5__4 : rule__Xplatform__Group_5__4__Impl rule__Xplatform__Group_5__5 ;
    public final void rule__Xplatform__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:984:1: ( rule__Xplatform__Group_5__4__Impl rule__Xplatform__Group_5__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:985:2: rule__Xplatform__Group_5__4__Impl rule__Xplatform__Group_5__5
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5__4__Impl_in_rule__Xplatform__Group_5__42014);
            rule__Xplatform__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_5__5_in_rule__Xplatform__Group_5__42017);
            rule__Xplatform__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__4"


    // $ANTLR start "rule__Xplatform__Group_5__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:992:1: rule__Xplatform__Group_5__4__Impl : ( ( rule__Xplatform__RequestHeadersAssignment_5_4 ) ) ;
    public final void rule__Xplatform__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:996:1: ( ( ( rule__Xplatform__RequestHeadersAssignment_5_4 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:997:1: ( ( rule__Xplatform__RequestHeadersAssignment_5_4 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:997:1: ( ( rule__Xplatform__RequestHeadersAssignment_5_4 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:998:1: ( rule__Xplatform__RequestHeadersAssignment_5_4 )
            {
             before(grammarAccess.getXplatformAccess().getRequestHeadersAssignment_5_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:999:1: ( rule__Xplatform__RequestHeadersAssignment_5_4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:999:2: rule__Xplatform__RequestHeadersAssignment_5_4
            {
            pushFollow(FOLLOW_rule__Xplatform__RequestHeadersAssignment_5_4_in_rule__Xplatform__Group_5__4__Impl2044);
            rule__Xplatform__RequestHeadersAssignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getRequestHeadersAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__4__Impl"


    // $ANTLR start "rule__Xplatform__Group_5__5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1009:1: rule__Xplatform__Group_5__5 : rule__Xplatform__Group_5__5__Impl ;
    public final void rule__Xplatform__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1013:1: ( rule__Xplatform__Group_5__5__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1014:2: rule__Xplatform__Group_5__5__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5__5__Impl_in_rule__Xplatform__Group_5__52074);
            rule__Xplatform__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__5"


    // $ANTLR start "rule__Xplatform__Group_5__5__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1020:1: rule__Xplatform__Group_5__5__Impl : ( ( rule__Xplatform__Group_5_5__0 )? ) ;
    public final void rule__Xplatform__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1024:1: ( ( ( rule__Xplatform__Group_5_5__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1025:1: ( ( rule__Xplatform__Group_5_5__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1025:1: ( ( rule__Xplatform__Group_5_5__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1026:1: ( rule__Xplatform__Group_5_5__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_5_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1027:1: ( rule__Xplatform__Group_5_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1027:2: rule__Xplatform__Group_5_5__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_5_5__0_in_rule__Xplatform__Group_5__5__Impl2101);
                    rule__Xplatform__Group_5_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5__5__Impl"


    // $ANTLR start "rule__Xplatform__Group_5_5__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1049:1: rule__Xplatform__Group_5_5__0 : rule__Xplatform__Group_5_5__0__Impl rule__Xplatform__Group_5_5__1 ;
    public final void rule__Xplatform__Group_5_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1053:1: ( rule__Xplatform__Group_5_5__0__Impl rule__Xplatform__Group_5_5__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1054:2: rule__Xplatform__Group_5_5__0__Impl rule__Xplatform__Group_5_5__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5_5__0__Impl_in_rule__Xplatform__Group_5_5__02144);
            rule__Xplatform__Group_5_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_5_5__1_in_rule__Xplatform__Group_5_5__02147);
            rule__Xplatform__Group_5_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5_5__0"


    // $ANTLR start "rule__Xplatform__Group_5_5__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1061:1: rule__Xplatform__Group_5_5__0__Impl : ( 'and' ) ;
    public final void rule__Xplatform__Group_5_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1065:1: ( ( 'and' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1066:1: ( 'and' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1066:1: ( 'and' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1067:1: 'and'
            {
             before(grammarAccess.getXplatformAccess().getAndKeyword_5_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Xplatform__Group_5_5__0__Impl2175); 
             after(grammarAccess.getXplatformAccess().getAndKeyword_5_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5_5__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_5_5__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1080:1: rule__Xplatform__Group_5_5__1 : rule__Xplatform__Group_5_5__1__Impl rule__Xplatform__Group_5_5__2 ;
    public final void rule__Xplatform__Group_5_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1084:1: ( rule__Xplatform__Group_5_5__1__Impl rule__Xplatform__Group_5_5__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1085:2: rule__Xplatform__Group_5_5__1__Impl rule__Xplatform__Group_5_5__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5_5__1__Impl_in_rule__Xplatform__Group_5_5__12206);
            rule__Xplatform__Group_5_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_5_5__2_in_rule__Xplatform__Group_5_5__12209);
            rule__Xplatform__Group_5_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5_5__1"


    // $ANTLR start "rule__Xplatform__Group_5_5__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1092:1: rule__Xplatform__Group_5_5__1__Impl : ( 'response' ) ;
    public final void rule__Xplatform__Group_5_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1096:1: ( ( 'response' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1097:1: ( 'response' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1097:1: ( 'response' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1098:1: 'response'
            {
             before(grammarAccess.getXplatformAccess().getResponseKeyword_5_5_1()); 
            match(input,24,FOLLOW_24_in_rule__Xplatform__Group_5_5__1__Impl2237); 
             after(grammarAccess.getXplatformAccess().getResponseKeyword_5_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5_5__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_5_5__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1111:1: rule__Xplatform__Group_5_5__2 : rule__Xplatform__Group_5_5__2__Impl ;
    public final void rule__Xplatform__Group_5_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1115:1: ( rule__Xplatform__Group_5_5__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1116:2: rule__Xplatform__Group_5_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_5_5__2__Impl_in_rule__Xplatform__Group_5_5__22268);
            rule__Xplatform__Group_5_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5_5__2"


    // $ANTLR start "rule__Xplatform__Group_5_5__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1122:1: rule__Xplatform__Group_5_5__2__Impl : ( ( rule__Xplatform__ResponseHeadersAssignment_5_5_2 ) ) ;
    public final void rule__Xplatform__Group_5_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1126:1: ( ( ( rule__Xplatform__ResponseHeadersAssignment_5_5_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1127:1: ( ( rule__Xplatform__ResponseHeadersAssignment_5_5_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1127:1: ( ( rule__Xplatform__ResponseHeadersAssignment_5_5_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1128:1: ( rule__Xplatform__ResponseHeadersAssignment_5_5_2 )
            {
             before(grammarAccess.getXplatformAccess().getResponseHeadersAssignment_5_5_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1129:1: ( rule__Xplatform__ResponseHeadersAssignment_5_5_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1129:2: rule__Xplatform__ResponseHeadersAssignment_5_5_2
            {
            pushFollow(FOLLOW_rule__Xplatform__ResponseHeadersAssignment_5_5_2_in_rule__Xplatform__Group_5_5__2__Impl2295);
            rule__Xplatform__ResponseHeadersAssignment_5_5_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getResponseHeadersAssignment_5_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_5_5__2__Impl"


    // $ANTLR start "rule__Xplatform__Group_6__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1145:1: rule__Xplatform__Group_6__0 : rule__Xplatform__Group_6__0__Impl rule__Xplatform__Group_6__1 ;
    public final void rule__Xplatform__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1149:1: ( rule__Xplatform__Group_6__0__Impl rule__Xplatform__Group_6__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1150:2: rule__Xplatform__Group_6__0__Impl rule__Xplatform__Group_6__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__0__Impl_in_rule__Xplatform__Group_6__02331);
            rule__Xplatform__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__1_in_rule__Xplatform__Group_6__02334);
            rule__Xplatform__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__0"


    // $ANTLR start "rule__Xplatform__Group_6__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1157:1: rule__Xplatform__Group_6__0__Impl : ( 'client' ) ;
    public final void rule__Xplatform__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1161:1: ( ( 'client' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1162:1: ( 'client' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1162:1: ( 'client' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1163:1: 'client'
            {
             before(grammarAccess.getXplatformAccess().getClientKeyword_6_0()); 
            match(input,25,FOLLOW_25_in_rule__Xplatform__Group_6__0__Impl2362); 
             after(grammarAccess.getXplatformAccess().getClientKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_6__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1176:1: rule__Xplatform__Group_6__1 : rule__Xplatform__Group_6__1__Impl rule__Xplatform__Group_6__2 ;
    public final void rule__Xplatform__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1180:1: ( rule__Xplatform__Group_6__1__Impl rule__Xplatform__Group_6__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1181:2: rule__Xplatform__Group_6__1__Impl rule__Xplatform__Group_6__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__1__Impl_in_rule__Xplatform__Group_6__12393);
            rule__Xplatform__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__2_in_rule__Xplatform__Group_6__12396);
            rule__Xplatform__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__1"


    // $ANTLR start "rule__Xplatform__Group_6__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1188:1: rule__Xplatform__Group_6__1__Impl : ( 'expects' ) ;
    public final void rule__Xplatform__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1192:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1193:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1193:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1194:1: 'expects'
            {
             before(grammarAccess.getXplatformAccess().getExpectsKeyword_6_1()); 
            match(input,26,FOLLOW_26_in_rule__Xplatform__Group_6__1__Impl2424); 
             after(grammarAccess.getXplatformAccess().getExpectsKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_6__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1207:1: rule__Xplatform__Group_6__2 : rule__Xplatform__Group_6__2__Impl rule__Xplatform__Group_6__3 ;
    public final void rule__Xplatform__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1211:1: ( rule__Xplatform__Group_6__2__Impl rule__Xplatform__Group_6__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1212:2: rule__Xplatform__Group_6__2__Impl rule__Xplatform__Group_6__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__2__Impl_in_rule__Xplatform__Group_6__22455);
            rule__Xplatform__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__3_in_rule__Xplatform__Group_6__22458);
            rule__Xplatform__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__2"


    // $ANTLR start "rule__Xplatform__Group_6__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1219:1: rule__Xplatform__Group_6__2__Impl : ( ( rule__Xplatform__JsonToClientAssignment_6_2 ) ) ;
    public final void rule__Xplatform__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1223:1: ( ( ( rule__Xplatform__JsonToClientAssignment_6_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1224:1: ( ( rule__Xplatform__JsonToClientAssignment_6_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1224:1: ( ( rule__Xplatform__JsonToClientAssignment_6_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1225:1: ( rule__Xplatform__JsonToClientAssignment_6_2 )
            {
             before(grammarAccess.getXplatformAccess().getJsonToClientAssignment_6_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1226:1: ( rule__Xplatform__JsonToClientAssignment_6_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1226:2: rule__Xplatform__JsonToClientAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Xplatform__JsonToClientAssignment_6_2_in_rule__Xplatform__Group_6__2__Impl2485);
            rule__Xplatform__JsonToClientAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getJsonToClientAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__2__Impl"


    // $ANTLR start "rule__Xplatform__Group_6__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1236:1: rule__Xplatform__Group_6__3 : rule__Xplatform__Group_6__3__Impl ;
    public final void rule__Xplatform__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1240:1: ( rule__Xplatform__Group_6__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1241:2: rule__Xplatform__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__3__Impl_in_rule__Xplatform__Group_6__32515);
            rule__Xplatform__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__3"


    // $ANTLR start "rule__Xplatform__Group_6__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1247:1: rule__Xplatform__Group_6__3__Impl : ( ( rule__Xplatform__Group_6_3__0 )? ) ;
    public final void rule__Xplatform__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1251:1: ( ( ( rule__Xplatform__Group_6_3__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1252:1: ( ( rule__Xplatform__Group_6_3__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1252:1: ( ( rule__Xplatform__Group_6_3__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1253:1: ( rule__Xplatform__Group_6_3__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_6_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1254:1: ( rule__Xplatform__Group_6_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1254:2: rule__Xplatform__Group_6_3__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_6_3__0_in_rule__Xplatform__Group_6__3__Impl2542);
                    rule__Xplatform__Group_6_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__3__Impl"


    // $ANTLR start "rule__Xplatform__Group_6_3__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1272:1: rule__Xplatform__Group_6_3__0 : rule__Xplatform__Group_6_3__0__Impl rule__Xplatform__Group_6_3__1 ;
    public final void rule__Xplatform__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1276:1: ( rule__Xplatform__Group_6_3__0__Impl rule__Xplatform__Group_6_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1277:2: rule__Xplatform__Group_6_3__0__Impl rule__Xplatform__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6_3__0__Impl_in_rule__Xplatform__Group_6_3__02581);
            rule__Xplatform__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6_3__1_in_rule__Xplatform__Group_6_3__02584);
            rule__Xplatform__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_3__0"


    // $ANTLR start "rule__Xplatform__Group_6_3__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1284:1: rule__Xplatform__Group_6_3__0__Impl : ( 'server' ) ;
    public final void rule__Xplatform__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1288:1: ( ( 'server' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1289:1: ( 'server' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1289:1: ( 'server' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1290:1: 'server'
            {
             before(grammarAccess.getXplatformAccess().getServerKeyword_6_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Xplatform__Group_6_3__0__Impl2612); 
             after(grammarAccess.getXplatformAccess().getServerKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_3__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_6_3__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1303:1: rule__Xplatform__Group_6_3__1 : rule__Xplatform__Group_6_3__1__Impl rule__Xplatform__Group_6_3__2 ;
    public final void rule__Xplatform__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1307:1: ( rule__Xplatform__Group_6_3__1__Impl rule__Xplatform__Group_6_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1308:2: rule__Xplatform__Group_6_3__1__Impl rule__Xplatform__Group_6_3__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6_3__1__Impl_in_rule__Xplatform__Group_6_3__12643);
            rule__Xplatform__Group_6_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6_3__2_in_rule__Xplatform__Group_6_3__12646);
            rule__Xplatform__Group_6_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_3__1"


    // $ANTLR start "rule__Xplatform__Group_6_3__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1315:1: rule__Xplatform__Group_6_3__1__Impl : ( 'expects' ) ;
    public final void rule__Xplatform__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1319:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1320:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1320:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1321:1: 'expects'
            {
             before(grammarAccess.getXplatformAccess().getExpectsKeyword_6_3_1()); 
            match(input,26,FOLLOW_26_in_rule__Xplatform__Group_6_3__1__Impl2674); 
             after(grammarAccess.getXplatformAccess().getExpectsKeyword_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_3__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_6_3__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1334:1: rule__Xplatform__Group_6_3__2 : rule__Xplatform__Group_6_3__2__Impl ;
    public final void rule__Xplatform__Group_6_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1338:1: ( rule__Xplatform__Group_6_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1339:2: rule__Xplatform__Group_6_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6_3__2__Impl_in_rule__Xplatform__Group_6_3__22705);
            rule__Xplatform__Group_6_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_3__2"


    // $ANTLR start "rule__Xplatform__Group_6_3__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1345:1: rule__Xplatform__Group_6_3__2__Impl : ( ( rule__Xplatform__JsonToServerAssignment_6_3_2 ) ) ;
    public final void rule__Xplatform__Group_6_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1349:1: ( ( ( rule__Xplatform__JsonToServerAssignment_6_3_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1350:1: ( ( rule__Xplatform__JsonToServerAssignment_6_3_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1350:1: ( ( rule__Xplatform__JsonToServerAssignment_6_3_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1351:1: ( rule__Xplatform__JsonToServerAssignment_6_3_2 )
            {
             before(grammarAccess.getXplatformAccess().getJsonToServerAssignment_6_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1352:1: ( rule__Xplatform__JsonToServerAssignment_6_3_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1352:2: rule__Xplatform__JsonToServerAssignment_6_3_2
            {
            pushFollow(FOLLOW_rule__Xplatform__JsonToServerAssignment_6_3_2_in_rule__Xplatform__Group_6_3__2__Impl2732);
            rule__Xplatform__JsonToServerAssignment_6_3_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getJsonToServerAssignment_6_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_3__2__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1368:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1372:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1373:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02768);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02771);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1380:1: rule__URI__Group__0__Impl : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1384:1: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1385:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1385:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1386:1: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1386:1: ( ( RULE_ANY_OTHER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1387:1: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1388:1: ( RULE_ANY_OTHER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1388:3: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2801); 

            }

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1391:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1392:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1393:1: ( RULE_ANY_OTHER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANY_OTHER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1393:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2814); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1404:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1408:1: ( rule__URI__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1409:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12847);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1415:1: rule__URI__Group__1__Impl : ( ( rule__URI__Group_1__0 )* ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1419:1: ( ( ( rule__URI__Group_1__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1420:1: ( ( rule__URI__Group_1__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1420:1: ( ( rule__URI__Group_1__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1421:1: ( rule__URI__Group_1__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1422:1: ( rule__URI__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1422:2: rule__URI__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl2874);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1436:1: rule__URI__Group_1__0 : rule__URI__Group_1__0__Impl rule__URI__Group_1__1 ;
    public final void rule__URI__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1440:1: ( rule__URI__Group_1__0__Impl rule__URI__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1441:2: rule__URI__Group_1__0__Impl rule__URI__Group_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__02909);
            rule__URI__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__02912);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1448:1: rule__URI__Group_1__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1452:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1453:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1453:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1454:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__URI__Group_1__0__Impl2940); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1467:1: rule__URI__Group_1__1 : rule__URI__Group_1__1__Impl rule__URI__Group_1__2 ;
    public final void rule__URI__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1471:1: ( rule__URI__Group_1__1__Impl rule__URI__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1472:2: rule__URI__Group_1__1__Impl rule__URI__Group_1__2
            {
            pushFollow(FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__12971);
            rule__URI__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__12974);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1479:1: rule__URI__Group_1__1__Impl : ( ( rule__URI__UriParameterAssignment_1_1 ) ) ;
    public final void rule__URI__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1483:1: ( ( ( rule__URI__UriParameterAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1484:1: ( ( rule__URI__UriParameterAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1484:1: ( ( rule__URI__UriParameterAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1485:1: ( rule__URI__UriParameterAssignment_1_1 )
            {
             before(grammarAccess.getURIAccess().getUriParameterAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1486:1: ( rule__URI__UriParameterAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1486:2: rule__URI__UriParameterAssignment_1_1
            {
            pushFollow(FOLLOW_rule__URI__UriParameterAssignment_1_1_in_rule__URI__Group_1__1__Impl3001);
            rule__URI__UriParameterAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getUriParameterAssignment_1_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1496:1: rule__URI__Group_1__2 : rule__URI__Group_1__2__Impl rule__URI__Group_1__3 ;
    public final void rule__URI__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1500:1: ( rule__URI__Group_1__2__Impl rule__URI__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1501:2: rule__URI__Group_1__2__Impl rule__URI__Group_1__3
            {
            pushFollow(FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23031);
            rule__URI__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23034);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1508:1: rule__URI__Group_1__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1512:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1513:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1513:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1514:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,29,FOLLOW_29_in_rule__URI__Group_1__2__Impl3062); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1527:1: rule__URI__Group_1__3 : rule__URI__Group_1__3__Impl ;
    public final void rule__URI__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1531:1: ( rule__URI__Group_1__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1532:2: rule__URI__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33093);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1538:1: rule__URI__Group_1__3__Impl : ( ( RULE_ANY_OTHER )* ) ;
    public final void rule__URI__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1542:1: ( ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1543:1: ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1543:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1544:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1545:1: ( RULE_ANY_OTHER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANY_OTHER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1545:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3121); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1563:1: rule__XplatformHeader__Group__0 : rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 ;
    public final void rule__XplatformHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1567:1: ( rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1568:2: rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03160);
            rule__XplatformHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03163);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1575:1: rule__XplatformHeader__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1579:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1580:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1580:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1581:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__XplatformHeader__Group__0__Impl3191); 
             after(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1594:1: rule__XplatformHeader__Group__1 : rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 ;
    public final void rule__XplatformHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1598:1: ( rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1599:2: rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13222);
            rule__XplatformHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13225);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1606:1: rule__XplatformHeader__Group__1__Impl : ( '{' ) ;
    public final void rule__XplatformHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1610:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1611:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1611:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1612:1: '{'
            {
             before(grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__XplatformHeader__Group__1__Impl3253); 
             after(grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1625:1: rule__XplatformHeader__Group__2 : rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 ;
    public final void rule__XplatformHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1629:1: ( rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1630:2: rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__23284);
            rule__XplatformHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__23287);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1637:1: rule__XplatformHeader__Group__2__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) ) ;
    public final void rule__XplatformHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1641:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1642:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1642:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1643:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1644:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1644:2: rule__XplatformHeader__HeaderKeyValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_2_in_rule__XplatformHeader__Group__2__Impl3314);
            rule__XplatformHeader__HeaderKeyValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_2()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1654:1: rule__XplatformHeader__Group__3 : rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 ;
    public final void rule__XplatformHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1658:1: ( rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1659:2: rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__33344);
            rule__XplatformHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__33347);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1666:1: rule__XplatformHeader__Group__3__Impl : ( ( rule__XplatformHeader__Group_3__0 )* ) ;
    public final void rule__XplatformHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1670:1: ( ( ( rule__XplatformHeader__Group_3__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1671:1: ( ( rule__XplatformHeader__Group_3__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1671:1: ( ( rule__XplatformHeader__Group_3__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1672:1: ( rule__XplatformHeader__Group_3__0 )*
            {
             before(grammarAccess.getXplatformHeaderAccess().getGroup_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1673:1: ( rule__XplatformHeader__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1673:2: rule__XplatformHeader__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__XplatformHeader__Group_3__0_in_rule__XplatformHeader__Group__3__Impl3374);
            	    rule__XplatformHeader__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getXplatformHeaderAccess().getGroup_3()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1683:1: rule__XplatformHeader__Group__4 : rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 ;
    public final void rule__XplatformHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1687:1: ( rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1688:2: rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__43405);
            rule__XplatformHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__43408);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1695:1: rule__XplatformHeader__Group__4__Impl : ( '}' ) ;
    public final void rule__XplatformHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1699:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1700:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1700:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1701:1: '}'
            {
             before(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__XplatformHeader__Group__4__Impl3436); 
             after(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1714:1: rule__XplatformHeader__Group__5 : rule__XplatformHeader__Group__5__Impl ;
    public final void rule__XplatformHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1718:1: ( rule__XplatformHeader__Group__5__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1719:2: rule__XplatformHeader__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__53467);
            rule__XplatformHeader__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1725:1: rule__XplatformHeader__Group__5__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1729:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1730:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1730:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1731:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__XplatformHeader__Group__5__Impl3495); 
             after(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__XplatformHeader__Group_3__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1756:1: rule__XplatformHeader__Group_3__0 : rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1 ;
    public final void rule__XplatformHeader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1760:1: ( rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1761:2: rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__0__Impl_in_rule__XplatformHeader__Group_3__03538);
            rule__XplatformHeader__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__1_in_rule__XplatformHeader__Group_3__03541);
            rule__XplatformHeader__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_3__0"


    // $ANTLR start "rule__XplatformHeader__Group_3__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1768:1: rule__XplatformHeader__Group_3__0__Impl : ( ',' ) ;
    public final void rule__XplatformHeader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1772:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1773:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1773:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1774:1: ','
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__XplatformHeader__Group_3__0__Impl3569); 
             after(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_3__0__Impl"


    // $ANTLR start "rule__XplatformHeader__Group_3__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1787:1: rule__XplatformHeader__Group_3__1 : rule__XplatformHeader__Group_3__1__Impl rule__XplatformHeader__Group_3__2 ;
    public final void rule__XplatformHeader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1791:1: ( rule__XplatformHeader__Group_3__1__Impl rule__XplatformHeader__Group_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1792:2: rule__XplatformHeader__Group_3__1__Impl rule__XplatformHeader__Group_3__2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__1__Impl_in_rule__XplatformHeader__Group_3__13600);
            rule__XplatformHeader__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__2_in_rule__XplatformHeader__Group_3__13603);
            rule__XplatformHeader__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_3__1"


    // $ANTLR start "rule__XplatformHeader__Group_3__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1799:1: rule__XplatformHeader__Group_3__1__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) ) ;
    public final void rule__XplatformHeader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1803:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1804:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1804:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1805:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_3_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1806:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1806:2: rule__XplatformHeader__HeaderKeyValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_1_in_rule__XplatformHeader__Group_3__1__Impl3630);
            rule__XplatformHeader__HeaderKeyValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_3__1__Impl"


    // $ANTLR start "rule__XplatformHeader__Group_3__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1816:1: rule__XplatformHeader__Group_3__2 : rule__XplatformHeader__Group_3__2__Impl ;
    public final void rule__XplatformHeader__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1820:1: ( rule__XplatformHeader__Group_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1821:2: rule__XplatformHeader__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__2__Impl_in_rule__XplatformHeader__Group_3__23660);
            rule__XplatformHeader__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_3__2"


    // $ANTLR start "rule__XplatformHeader__Group_3__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1827:1: rule__XplatformHeader__Group_3__2__Impl : ( ( ',' )? ) ;
    public final void rule__XplatformHeader__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1831:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1832:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1832:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1833:1: ( ',' )?
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1834:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==29||LA16_1==31) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1835:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__XplatformHeader__Group_3__2__Impl3689); 

                    }
                    break;

            }

             after(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__Group_3__2__Impl"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1852:1: rule__XplatformHeaderKeyValuePair__Group__0 : rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1856:1: ( rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1857:2: rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__03728);
            rule__XplatformHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__03731);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1864:1: rule__XplatformHeaderKeyValuePair__Group__0__Impl : ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1868:1: ( ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1869:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1869:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1870:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1871:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1871:2: rule__XplatformHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl3758);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1881:1: rule__XplatformHeaderKeyValuePair__Group__1 : rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1885:1: ( rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1886:2: rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__13788);
            rule__XplatformHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__13791);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1893:1: rule__XplatformHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1897:1: ( ( '=' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1898:1: ( '=' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1898:1: ( '=' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1899:1: '='
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl3819); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1912:1: rule__XplatformHeaderKeyValuePair__Group__2 : rule__XplatformHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1916:1: ( rule__XplatformHeaderKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1917:2: rule__XplatformHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__23850);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1923:1: rule__XplatformHeaderKeyValuePair__Group__2__Impl : ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1927:1: ( ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1928:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1928:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1929:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1930:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1930:2: rule__XplatformHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl3877);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1946:1: rule__XplatformJson__Group_0__0 : rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 ;
    public final void rule__XplatformJson__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1950:1: ( rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1951:2: rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__03913);
            rule__XplatformJson__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__03916);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1958:1: rule__XplatformJson__Group_0__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1962:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1963:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1963:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1964:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__XplatformJson__Group_0__0__Impl3944); 
             after(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1977:1: rule__XplatformJson__Group_0__1 : rule__XplatformJson__Group_0__1__Impl ;
    public final void rule__XplatformJson__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1981:1: ( rule__XplatformJson__Group_0__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1982:2: rule__XplatformJson__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__13975);
            rule__XplatformJson__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1988:1: rule__XplatformJson__Group_0__1__Impl : ( ( rule__XplatformJson__TypeAssignment_0_1 ) ) ;
    public final void rule__XplatformJson__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1992:1: ( ( ( rule__XplatformJson__TypeAssignment_0_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1993:1: ( ( rule__XplatformJson__TypeAssignment_0_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1993:1: ( ( rule__XplatformJson__TypeAssignment_0_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1994:1: ( rule__XplatformJson__TypeAssignment_0_1 )
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeAssignment_0_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1995:1: ( rule__XplatformJson__TypeAssignment_0_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1995:2: rule__XplatformJson__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__XplatformJson__TypeAssignment_0_1_in_rule__XplatformJson__Group_0__1__Impl4002);
            rule__XplatformJson__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getTypeAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XplatformJson__Group_1__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2009:1: rule__XplatformJson__Group_1__0 : rule__XplatformJson__Group_1__0__Impl rule__XplatformJson__Group_1__1 ;
    public final void rule__XplatformJson__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2013:1: ( rule__XplatformJson__Group_1__0__Impl rule__XplatformJson__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2014:2: rule__XplatformJson__Group_1__0__Impl rule__XplatformJson__Group_1__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_1__0__Impl_in_rule__XplatformJson__Group_1__04036);
            rule__XplatformJson__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_1__1_in_rule__XplatformJson__Group_1__04039);
            rule__XplatformJson__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_1__0"


    // $ANTLR start "rule__XplatformJson__Group_1__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2021:1: rule__XplatformJson__Group_1__0__Impl : ( ( rule__XplatformJson__MetaTypeAssignment_1_0 ) ) ;
    public final void rule__XplatformJson__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2025:1: ( ( ( rule__XplatformJson__MetaTypeAssignment_1_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2026:1: ( ( rule__XplatformJson__MetaTypeAssignment_1_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2026:1: ( ( rule__XplatformJson__MetaTypeAssignment_1_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2027:1: ( rule__XplatformJson__MetaTypeAssignment_1_0 )
            {
             before(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2028:1: ( rule__XplatformJson__MetaTypeAssignment_1_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2028:2: rule__XplatformJson__MetaTypeAssignment_1_0
            {
            pushFollow(FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_0_in_rule__XplatformJson__Group_1__0__Impl4066);
            rule__XplatformJson__MetaTypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_1__0__Impl"


    // $ANTLR start "rule__XplatformJson__Group_1__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2038:1: rule__XplatformJson__Group_1__1 : rule__XplatformJson__Group_1__1__Impl ;
    public final void rule__XplatformJson__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2042:1: ( rule__XplatformJson__Group_1__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2043:2: rule__XplatformJson__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_1__1__Impl_in_rule__XplatformJson__Group_1__14096);
            rule__XplatformJson__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_1__1"


    // $ANTLR start "rule__XplatformJson__Group_1__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2049:1: rule__XplatformJson__Group_1__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2053:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2054:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2054:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2055:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__XplatformJson__Group_1__1__Impl4124); 
             after(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__Group_1__1__Impl"


    // $ANTLR start "rule__JsonMetaArray__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2072:1: rule__JsonMetaArray__Group__0 : rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 ;
    public final void rule__JsonMetaArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2076:1: ( rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2077:2: rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__04159);
            rule__JsonMetaArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__04162);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2084:1: rule__JsonMetaArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonMetaArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2088:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2089:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2089:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2090:1: '['
            {
             before(grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__JsonMetaArray__Group__0__Impl4190); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2103:1: rule__JsonMetaArray__Group__1 : rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 ;
    public final void rule__JsonMetaArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2107:1: ( rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2108:2: rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__14221);
            rule__JsonMetaArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__14224);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2115:1: rule__JsonMetaArray__Group__1__Impl : ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) ;
    public final void rule__JsonMetaArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2119:1: ( ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2120:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2120:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2121:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2122:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2122:2: rule__JsonMetaArray__MetaTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl4251);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2132:1: rule__JsonMetaArray__Group__2 : rule__JsonMetaArray__Group__2__Impl ;
    public final void rule__JsonMetaArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2136:1: ( rule__JsonMetaArray__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2137:2: rule__JsonMetaArray__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__24281);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2143:1: rule__JsonMetaArray__Group__2__Impl : ( ']' ) ;
    public final void rule__JsonMetaArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2147:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2148:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2148:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2149:1: ']'
            {
             before(grammarAccess.getJsonMetaArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__JsonMetaArray__Group__2__Impl4309); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2168:1: rule__JsonScalarType__Group_2__0 : rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 ;
    public final void rule__JsonScalarType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2172:1: ( rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2173:2: rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__04346);
            rule__JsonScalarType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__04349);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2180:1: rule__JsonScalarType__Group_2__0__Impl : ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) ;
    public final void rule__JsonScalarType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2184:1: ( ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2185:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2185:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2186:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2187:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2187:2: rule__JsonScalarType__NumberAssignment_2_0
            {
            pushFollow(FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl4376);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2197:1: rule__JsonScalarType__Group_2__1 : rule__JsonScalarType__Group_2__1__Impl ;
    public final void rule__JsonScalarType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2201:1: ( rule__JsonScalarType__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2202:2: rule__JsonScalarType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__14406);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2208:1: rule__JsonScalarType__Group_2__1__Impl : ( ( rule__JsonScalarType__Group_2_1__0 )? ) ;
    public final void rule__JsonScalarType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2212:1: ( ( ( rule__JsonScalarType__Group_2_1__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2213:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2213:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2214:1: ( rule__JsonScalarType__Group_2_1__0 )?
            {
             before(grammarAccess.getJsonScalarTypeAccess().getGroup_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2215:1: ( rule__JsonScalarType__Group_2_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2215:2: rule__JsonScalarType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl4433);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2229:1: rule__JsonScalarType__Group_2_1__0 : rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 ;
    public final void rule__JsonScalarType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2233:1: ( rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2234:2: rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__04468);
            rule__JsonScalarType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__04471);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2241:1: rule__JsonScalarType__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__JsonScalarType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2245:1: ( ( '.' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2246:1: ( '.' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2246:1: ( '.' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2247:1: '.'
            {
             before(grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0()); 
            match(input,35,FOLLOW_35_in_rule__JsonScalarType__Group_2_1__0__Impl4499); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2260:1: rule__JsonScalarType__Group_2_1__1 : rule__JsonScalarType__Group_2_1__1__Impl ;
    public final void rule__JsonScalarType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2264:1: ( rule__JsonScalarType__Group_2_1__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2265:2: rule__JsonScalarType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__14530);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2271:1: rule__JsonScalarType__Group_2_1__1__Impl : ( RULE_INT ) ;
    public final void rule__JsonScalarType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2275:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2276:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2276:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2277:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl4557); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2292:1: rule__JsonArray__Group_0__0 : rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 ;
    public final void rule__JsonArray__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2296:1: ( rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2297:2: rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__04590);
            rule__JsonArray__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__04593);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2304:1: rule__JsonArray__Group_0__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2308:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2309:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2309:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2310:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__JsonArray__Group_0__0__Impl4621); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2323:1: rule__JsonArray__Group_0__1 : rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 ;
    public final void rule__JsonArray__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2327:1: ( rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2328:2: rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__14652);
            rule__JsonArray__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__14655);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2335:1: rule__JsonArray__Group_0__1__Impl : ( ( rule__JsonArray__ElementAssignment_0_1 ) ) ;
    public final void rule__JsonArray__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2339:1: ( ( ( rule__JsonArray__ElementAssignment_0_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2340:1: ( ( rule__JsonArray__ElementAssignment_0_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2340:1: ( ( rule__JsonArray__ElementAssignment_0_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2341:1: ( rule__JsonArray__ElementAssignment_0_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementAssignment_0_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2342:1: ( rule__JsonArray__ElementAssignment_0_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2342:2: rule__JsonArray__ElementAssignment_0_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl4682);
            rule__JsonArray__ElementAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getElementAssignment_0_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2352:1: rule__JsonArray__Group_0__2 : rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 ;
    public final void rule__JsonArray__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2356:1: ( rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2357:2: rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__24712);
            rule__JsonArray__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__24715);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2364:1: rule__JsonArray__Group_0__2__Impl : ( ( rule__JsonArray__Group_0_2__0 )* ) ;
    public final void rule__JsonArray__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2368:1: ( ( ( rule__JsonArray__Group_0_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2369:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2369:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2370:1: ( rule__JsonArray__Group_0_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_0_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2371:1: ( rule__JsonArray__Group_0_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2371:2: rule__JsonArray__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl4742);
            	    rule__JsonArray__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2381:1: rule__JsonArray__Group_0__3 : rule__JsonArray__Group_0__3__Impl ;
    public final void rule__JsonArray__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2385:1: ( rule__JsonArray__Group_0__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2386:2: rule__JsonArray__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__34773);
            rule__JsonArray__Group_0__3__Impl();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2392:1: rule__JsonArray__Group_0__3__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2396:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2397:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2397:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2398:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_0__3__Impl4801); 
             after(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonArray__Group_0_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2419:1: rule__JsonArray__Group_0_2__0 : rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 ;
    public final void rule__JsonArray__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2423:1: ( rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2424:2: rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__04840);
            rule__JsonArray__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__04843);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2431:1: rule__JsonArray__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2435:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2436:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2436:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2437:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0()); 
            match(input,31,FOLLOW_31_in_rule__JsonArray__Group_0_2__0__Impl4871); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2450:1: rule__JsonArray__Group_0_2__1 : rule__JsonArray__Group_0_2__1__Impl rule__JsonArray__Group_0_2__2 ;
    public final void rule__JsonArray__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2454:1: ( rule__JsonArray__Group_0_2__1__Impl rule__JsonArray__Group_0_2__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2455:2: rule__JsonArray__Group_0_2__1__Impl rule__JsonArray__Group_0_2__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__14902);
            rule__JsonArray__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__2_in_rule__JsonArray__Group_0_2__14905);
            rule__JsonArray__Group_0_2__2();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2462:1: rule__JsonArray__Group_0_2__1__Impl : ( ( rule__JsonArray__ElementAssignment_0_2_1 ) ) ;
    public final void rule__JsonArray__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2466:1: ( ( ( rule__JsonArray__ElementAssignment_0_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2467:1: ( ( rule__JsonArray__ElementAssignment_0_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2467:1: ( ( rule__JsonArray__ElementAssignment_0_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2468:1: ( rule__JsonArray__ElementAssignment_0_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementAssignment_0_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2469:1: ( rule__JsonArray__ElementAssignment_0_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2469:2: rule__JsonArray__ElementAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl4932);
            rule__JsonArray__ElementAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getElementAssignment_0_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonArray__Group_0_2__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2479:1: rule__JsonArray__Group_0_2__2 : rule__JsonArray__Group_0_2__2__Impl ;
    public final void rule__JsonArray__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2483:1: ( rule__JsonArray__Group_0_2__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2484:2: rule__JsonArray__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__2__Impl_in_rule__JsonArray__Group_0_2__24962);
            rule__JsonArray__Group_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0_2__2"


    // $ANTLR start "rule__JsonArray__Group_0_2__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2490:1: rule__JsonArray__Group_0_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2494:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2495:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2495:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2496:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2497:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==31||LA19_1==34) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2498:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__JsonArray__Group_0_2__2__Impl4991); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_0_2__2__Impl"


    // $ANTLR start "rule__JsonArray__Group_1__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2515:1: rule__JsonArray__Group_1__0 : rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 ;
    public final void rule__JsonArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2519:1: ( rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2520:2: rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__05030);
            rule__JsonArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__05033);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2527:1: rule__JsonArray__Group_1__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2531:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2532:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2532:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2533:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__JsonArray__Group_1__0__Impl5061); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2546:1: rule__JsonArray__Group_1__1 : rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 ;
    public final void rule__JsonArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2550:1: ( rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2551:2: rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__15092);
            rule__JsonArray__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__15095);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2558:1: rule__JsonArray__Group_1__1__Impl : ( ( rule__JsonArray__CompositeAssignment_1_1 ) ) ;
    public final void rule__JsonArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2562:1: ( ( ( rule__JsonArray__CompositeAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2563:1: ( ( rule__JsonArray__CompositeAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2563:1: ( ( rule__JsonArray__CompositeAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2564:1: ( rule__JsonArray__CompositeAssignment_1_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositeAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2565:1: ( rule__JsonArray__CompositeAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2565:2: rule__JsonArray__CompositeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositeAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl5122);
            rule__JsonArray__CompositeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getCompositeAssignment_1_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2575:1: rule__JsonArray__Group_1__2 : rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 ;
    public final void rule__JsonArray__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2579:1: ( rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2580:2: rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__25152);
            rule__JsonArray__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__25155);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2587:1: rule__JsonArray__Group_1__2__Impl : ( ( rule__JsonArray__Group_1_2__0 )* ) ;
    public final void rule__JsonArray__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2591:1: ( ( ( rule__JsonArray__Group_1_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2592:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2592:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2593:1: ( rule__JsonArray__Group_1_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_1_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2594:1: ( rule__JsonArray__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2594:2: rule__JsonArray__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl5182);
            	    rule__JsonArray__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2604:1: rule__JsonArray__Group_1__3 : rule__JsonArray__Group_1__3__Impl ;
    public final void rule__JsonArray__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2608:1: ( rule__JsonArray__Group_1__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2609:2: rule__JsonArray__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__35213);
            rule__JsonArray__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2615:1: rule__JsonArray__Group_1__3__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2619:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2620:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2620:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2621:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_1__3__Impl5241); 
             after(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonArray__Group_1_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2642:1: rule__JsonArray__Group_1_2__0 : rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 ;
    public final void rule__JsonArray__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2646:1: ( rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2647:2: rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__05280);
            rule__JsonArray__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__05283);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2654:1: rule__JsonArray__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2658:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2659:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2659:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2660:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0()); 
            match(input,31,FOLLOW_31_in_rule__JsonArray__Group_1_2__0__Impl5311); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2673:1: rule__JsonArray__Group_1_2__1 : rule__JsonArray__Group_1_2__1__Impl rule__JsonArray__Group_1_2__2 ;
    public final void rule__JsonArray__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2677:1: ( rule__JsonArray__Group_1_2__1__Impl rule__JsonArray__Group_1_2__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2678:2: rule__JsonArray__Group_1_2__1__Impl rule__JsonArray__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__15342);
            rule__JsonArray__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__2_in_rule__JsonArray__Group_1_2__15345);
            rule__JsonArray__Group_1_2__2();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2685:1: rule__JsonArray__Group_1_2__1__Impl : ( ( rule__JsonArray__CompositeAssignment_1_2_1 ) ) ;
    public final void rule__JsonArray__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2689:1: ( ( ( rule__JsonArray__CompositeAssignment_1_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2690:1: ( ( rule__JsonArray__CompositeAssignment_1_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2690:1: ( ( rule__JsonArray__CompositeAssignment_1_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2691:1: ( rule__JsonArray__CompositeAssignment_1_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositeAssignment_1_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2692:1: ( rule__JsonArray__CompositeAssignment_1_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2692:2: rule__JsonArray__CompositeAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositeAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl5372);
            rule__JsonArray__CompositeAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonArrayAccess().getCompositeAssignment_1_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonArray__Group_1_2__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2702:1: rule__JsonArray__Group_1_2__2 : rule__JsonArray__Group_1_2__2__Impl ;
    public final void rule__JsonArray__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2706:1: ( rule__JsonArray__Group_1_2__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2707:2: rule__JsonArray__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__2__Impl_in_rule__JsonArray__Group_1_2__25402);
            rule__JsonArray__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1_2__2"


    // $ANTLR start "rule__JsonArray__Group_1_2__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2713:1: rule__JsonArray__Group_1_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2717:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2718:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2718:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2719:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2720:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==31||LA21_1==34) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2721:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__JsonArray__Group_1_2__2__Impl5431); 

                    }
                    break;

            }

             after(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__Group_1_2__2__Impl"


    // $ANTLR start "rule__JsonKeyValuePair__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2738:1: rule__JsonKeyValuePair__Group__0 : rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 ;
    public final void rule__JsonKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2742:1: ( rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2743:2: rule__JsonKeyValuePair__Group__0__Impl rule__JsonKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05470);
            rule__JsonKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05473);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2750:1: rule__JsonKeyValuePair__Group__0__Impl : ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2754:1: ( ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2755:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2755:1: ( ( rule__JsonKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2756:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2757:1: ( rule__JsonKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2757:2: rule__JsonKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5500);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2767:1: rule__JsonKeyValuePair__Group__1 : rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 ;
    public final void rule__JsonKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2771:1: ( rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2772:2: rule__JsonKeyValuePair__Group__1__Impl rule__JsonKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15530);
            rule__JsonKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15533);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2779:1: rule__JsonKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2783:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2784:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2784:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2785:1: ':'
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__JsonKeyValuePair__Group__1__Impl5561); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2798:1: rule__JsonKeyValuePair__Group__2 : rule__JsonKeyValuePair__Group__2__Impl ;
    public final void rule__JsonKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2802:1: ( rule__JsonKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2803:2: rule__JsonKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25592);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2809:1: rule__JsonKeyValuePair__Group__2__Impl : ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2813:1: ( ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2814:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2814:1: ( ( rule__JsonKeyValuePair__ValueAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2815:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2816:1: ( rule__JsonKeyValuePair__ValueAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2816:2: rule__JsonKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5619);
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


    // $ANTLR start "rule__JsonMetaKeyValuePair__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2832:1: rule__JsonMetaKeyValuePair__Group__0 : rule__JsonMetaKeyValuePair__Group__0__Impl rule__JsonMetaKeyValuePair__Group__1 ;
    public final void rule__JsonMetaKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2836:1: ( rule__JsonMetaKeyValuePair__Group__0__Impl rule__JsonMetaKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2837:2: rule__JsonMetaKeyValuePair__Group__0__Impl rule__JsonMetaKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__Group__0__Impl_in_rule__JsonMetaKeyValuePair__Group__05655);
            rule__JsonMetaKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__Group__1_in_rule__JsonMetaKeyValuePair__Group__05658);
            rule__JsonMetaKeyValuePair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__Group__0"


    // $ANTLR start "rule__JsonMetaKeyValuePair__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2844:1: rule__JsonMetaKeyValuePair__Group__0__Impl : ( ( rule__JsonMetaKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__JsonMetaKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2848:1: ( ( ( rule__JsonMetaKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2849:1: ( ( rule__JsonMetaKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2849:1: ( ( rule__JsonMetaKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2850:1: ( rule__JsonMetaKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getJsonMetaKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2851:1: ( rule__JsonMetaKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2851:2: rule__JsonMetaKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__KeyAssignment_0_in_rule__JsonMetaKeyValuePair__Group__0__Impl5685);
            rule__JsonMetaKeyValuePair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonMetaKeyValuePairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__Group__0__Impl"


    // $ANTLR start "rule__JsonMetaKeyValuePair__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2861:1: rule__JsonMetaKeyValuePair__Group__1 : rule__JsonMetaKeyValuePair__Group__1__Impl rule__JsonMetaKeyValuePair__Group__2 ;
    public final void rule__JsonMetaKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2865:1: ( rule__JsonMetaKeyValuePair__Group__1__Impl rule__JsonMetaKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2866:2: rule__JsonMetaKeyValuePair__Group__1__Impl rule__JsonMetaKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__Group__1__Impl_in_rule__JsonMetaKeyValuePair__Group__15715);
            rule__JsonMetaKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__Group__2_in_rule__JsonMetaKeyValuePair__Group__15718);
            rule__JsonMetaKeyValuePair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__Group__1"


    // $ANTLR start "rule__JsonMetaKeyValuePair__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2873:1: rule__JsonMetaKeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__JsonMetaKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2877:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2878:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2878:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2879:1: ':'
            {
             before(grammarAccess.getJsonMetaKeyValuePairAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__JsonMetaKeyValuePair__Group__1__Impl5746); 
             after(grammarAccess.getJsonMetaKeyValuePairAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__Group__1__Impl"


    // $ANTLR start "rule__JsonMetaKeyValuePair__Group__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2892:1: rule__JsonMetaKeyValuePair__Group__2 : rule__JsonMetaKeyValuePair__Group__2__Impl ;
    public final void rule__JsonMetaKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2896:1: ( rule__JsonMetaKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2897:2: rule__JsonMetaKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__Group__2__Impl_in_rule__JsonMetaKeyValuePair__Group__25777);
            rule__JsonMetaKeyValuePair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__Group__2"


    // $ANTLR start "rule__JsonMetaKeyValuePair__Group__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2903:1: rule__JsonMetaKeyValuePair__Group__2__Impl : ( ( rule__JsonMetaKeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__JsonMetaKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2907:1: ( ( ( rule__JsonMetaKeyValuePair__ValueAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2908:1: ( ( rule__JsonMetaKeyValuePair__ValueAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2908:1: ( ( rule__JsonMetaKeyValuePair__ValueAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2909:1: ( rule__JsonMetaKeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getJsonMetaKeyValuePairAccess().getValueAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2910:1: ( rule__JsonMetaKeyValuePair__ValueAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2910:2: rule__JsonMetaKeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__JsonMetaKeyValuePair__ValueAssignment_2_in_rule__JsonMetaKeyValuePair__Group__2__Impl5804);
            rule__JsonMetaKeyValuePair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonMetaKeyValuePairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__Group__2__Impl"


    // $ANTLR start "rule__Xplatform__NameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2929:1: rule__Xplatform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Xplatform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2933:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2934:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2934:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2935:1: RULE_ID
            {
             before(grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Xplatform__NameAssignment_15847); 
             after(grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__NameAssignment_1"


    // $ANTLR start "rule__Xplatform__MethodAssignment_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2944:1: rule__Xplatform__MethodAssignment_2 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__Xplatform__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2948:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2949:1: ( RULE_RESTFUL_METHODS )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2949:1: ( RULE_RESTFUL_METHODS )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2950:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_2_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__Xplatform__MethodAssignment_25878); 
             after(grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__MethodAssignment_2"


    // $ANTLR start "rule__Xplatform__UriAssignment_4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2959:1: rule__Xplatform__UriAssignment_4 : ( ruleURI ) ;
    public final void rule__Xplatform__UriAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2963:1: ( ( ruleURI ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2964:1: ( ruleURI )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2964:1: ( ruleURI )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2965:1: ruleURI
            {
             before(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__Xplatform__UriAssignment_45909);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__UriAssignment_4"


    // $ANTLR start "rule__Xplatform__RequestHeadersAssignment_5_4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2974:1: rule__Xplatform__RequestHeadersAssignment_5_4 : ( ruleXplatformHeader ) ;
    public final void rule__Xplatform__RequestHeadersAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2978:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2979:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2979:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2980:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__Xplatform__RequestHeadersAssignment_5_45940);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__RequestHeadersAssignment_5_4"


    // $ANTLR start "rule__Xplatform__ResponseHeadersAssignment_5_5_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2989:1: rule__Xplatform__ResponseHeadersAssignment_5_5_2 : ( ruleXplatformHeader ) ;
    public final void rule__Xplatform__ResponseHeadersAssignment_5_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2993:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2994:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2994:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2995:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_5_5_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__Xplatform__ResponseHeadersAssignment_5_5_25971);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_5_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__ResponseHeadersAssignment_5_5_2"


    // $ANTLR start "rule__Xplatform__JsonToClientAssignment_6_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3004:1: rule__Xplatform__JsonToClientAssignment_6_2 : ( ruleXplatformJson ) ;
    public final void rule__Xplatform__JsonToClientAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3008:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3009:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3009:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3010:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToClientAssignment_6_26002);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__JsonToClientAssignment_6_2"


    // $ANTLR start "rule__Xplatform__JsonToServerAssignment_6_3_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3019:1: rule__Xplatform__JsonToServerAssignment_6_3_2 : ( ruleXplatformJson ) ;
    public final void rule__Xplatform__JsonToServerAssignment_6_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3023:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3024:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3024:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3025:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_6_3_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToServerAssignment_6_3_26033);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_6_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__JsonToServerAssignment_6_3_2"


    // $ANTLR start "rule__URI__UriParameterAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3034:1: rule__URI__UriParameterAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__URI__UriParameterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3038:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3039:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3039:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3040:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getUriParameterIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__UriParameterAssignment_1_16064); 
             after(grammarAccess.getURIAccess().getUriParameterIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__UriParameterAssignment_1_1"


    // $ANTLR start "rule__XplatformHeader__HeaderKeyValuesAssignment_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3049:1: rule__XplatformHeader__HeaderKeyValuesAssignment_2 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3053:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3054:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3054:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3055:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_26095);
            ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__HeaderKeyValuesAssignment_2"


    // $ANTLR start "rule__XplatformHeader__HeaderKeyValuesAssignment_3_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3064:1: rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3068:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3069:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3069:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3070:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_3_16126);
            ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             after(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformHeader__HeaderKeyValuesAssignment_3_1"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__KeyAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3079:1: rule__XplatformHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3083:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3084:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3084:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3085:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_06157); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3094:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3098:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3099:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3099:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3100:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_06188); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3109:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 : ( RULE_XPLATFORM_HEADER_PARAMETER ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3113:1: ( ( RULE_XPLATFORM_HEADER_PARAMETER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3114:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3114:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3115:1: RULE_XPLATFORM_HEADER_PARAMETER
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
            match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_16219); 
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


    // $ANTLR start "rule__XplatformJson__TypeAssignment_0_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3124:1: rule__XplatformJson__TypeAssignment_0_1 : ( ruleJsonType ) ;
    public final void rule__XplatformJson__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3128:1: ( ( ruleJsonType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3129:1: ( ruleJsonType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3129:1: ( ruleJsonType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3130:1: ruleJsonType
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_16250);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__TypeAssignment_0_1"


    // $ANTLR start "rule__XplatformJson__MetaTypeAssignment_1_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3139:1: rule__XplatformJson__MetaTypeAssignment_1_0 : ( ruleJsonMetaType ) ;
    public final void rule__XplatformJson__MetaTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3143:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3144:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3144:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3145:1: ruleJsonMetaType
            {
             before(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_1_06281);
            ruleJsonMetaType();

            state._fsp--;

             after(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformJson__MetaTypeAssignment_1_0"


    // $ANTLR start "rule__JsonMetaArray__MetaTypeAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3154:1: rule__JsonMetaArray__MetaTypeAssignment_1 : ( ruleJsonMetaType ) ;
    public final void rule__JsonMetaArray__MetaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3158:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3159:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3159:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3160:1: ruleJsonMetaType
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_16312);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3169:1: rule__JsonMetaType__ScalarAssignment_0 : ( ruleJsonMetaScalarType ) ;
    public final void rule__JsonMetaType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3173:1: ( ( ruleJsonMetaScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3174:1: ( ruleJsonMetaScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3174:1: ( ruleJsonMetaScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3175:1: ruleJsonMetaScalarType
            {
             before(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_06343);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3184:1: rule__JsonMetaType__CompositeAssignment_1 : ( ruleJsonMetaArray ) ;
    public final void rule__JsonMetaType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3188:1: ( ( ruleJsonMetaArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3189:1: ( ruleJsonMetaArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3189:1: ( ruleJsonMetaArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3190:1: ruleJsonMetaArray
            {
             before(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_16374);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3199:1: rule__JsonCompositeType__CompositeAssignment : ( ruleJsonArray ) ;
    public final void rule__JsonCompositeType__CompositeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3203:1: ( ( ruleJsonArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3204:1: ( ruleJsonArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3204:1: ( ruleJsonArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3205:1: ruleJsonArray
            {
             before(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment6405);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3214:1: rule__JsonType__ScalarAssignment_0 : ( ruleJsonScalarType ) ;
    public final void rule__JsonType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3218:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3219:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3219:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3220:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_06436);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3229:1: rule__JsonType__CompositeAssignment_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3233:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3234:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3234:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3235:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_16467);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3244:1: rule__JsonScalarType__BoolAssignment_0 : ( RULE_JSON_LITERAL_BOOLEAN ) ;
    public final void rule__JsonScalarType__BoolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3248:1: ( ( RULE_JSON_LITERAL_BOOLEAN ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3249:1: ( RULE_JSON_LITERAL_BOOLEAN )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3249:1: ( RULE_JSON_LITERAL_BOOLEAN )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3250:1: RULE_JSON_LITERAL_BOOLEAN
            {
             before(grammarAccess.getJsonScalarTypeAccess().getBoolJSON_LITERAL_BOOLEANTerminalRuleCall_0_0()); 
            match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_06498); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3259:1: rule__JsonScalarType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__JsonScalarType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3263:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3264:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3264:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3265:1: RULE_STRING
            {
             before(grammarAccess.getJsonScalarTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_16529); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3274:1: rule__JsonScalarType__NumberAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__JsonScalarType__NumberAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3278:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3279:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3279:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3280:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_06560); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3289:1: rule__JsonScalarType__NullAssignment_3 : ( RULE_JSON_LITERAL_NULL ) ;
    public final void rule__JsonScalarType__NullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3293:1: ( ( RULE_JSON_LITERAL_NULL ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3294:1: ( RULE_JSON_LITERAL_NULL )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3294:1: ( RULE_JSON_LITERAL_NULL )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3295:1: RULE_JSON_LITERAL_NULL
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 
            match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_36591); 
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


    // $ANTLR start "rule__JsonArray__ElementAssignment_0_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3304:1: rule__JsonArray__ElementAssignment_0_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3308:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3309:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3309:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3310:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementJsonScalarTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementAssignment_0_16622);
            ruleJsonScalarType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getElementJsonScalarTypeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ElementAssignment_0_1"


    // $ANTLR start "rule__JsonArray__ElementAssignment_0_2_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3319:1: rule__JsonArray__ElementAssignment_0_2_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3323:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3324:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3324:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3325:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementJsonScalarTypeParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementAssignment_0_2_16653);
            ruleJsonScalarType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getElementJsonScalarTypeParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__ElementAssignment_0_2_1"


    // $ANTLR start "rule__JsonArray__CompositeAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3334:1: rule__JsonArray__CompositeAssignment_1_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3338:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3339:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3339:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3340:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositeJsonCompositeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositeAssignment_1_16684);
            ruleJsonCompositeType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getCompositeJsonCompositeTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__CompositeAssignment_1_1"


    // $ANTLR start "rule__JsonArray__CompositeAssignment_1_2_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3349:1: rule__JsonArray__CompositeAssignment_1_2_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositeAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3353:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3354:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3354:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3355:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositeJsonCompositeTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositeAssignment_1_2_16715);
            ruleJsonCompositeType();

            state._fsp--;

             after(grammarAccess.getJsonArrayAccess().getCompositeJsonCompositeTypeParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonArray__CompositeAssignment_1_2_1"


    // $ANTLR start "rule__JsonKeyValuePair__KeyAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3364:1: rule__JsonKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3368:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3369:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3369:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3370:1: RULE_STRING
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_06746); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3379:1: rule__JsonKeyValuePair__ValueAssignment_2 : ( ruleJsonType ) ;
    public final void rule__JsonKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3383:1: ( ( ruleJsonType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3384:1: ( ruleJsonType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3384:1: ( ruleJsonType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3385:1: ruleJsonType
            {
             before(grammarAccess.getJsonKeyValuePairAccess().getValueJsonTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonType_in_rule__JsonKeyValuePair__ValueAssignment_26777);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonKeyValuePairAccess().getValueJsonTypeParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__JsonMetaKeyValuePair__KeyAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3394:1: rule__JsonMetaKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__JsonMetaKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3398:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3399:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3399:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3400:1: RULE_STRING
            {
             before(grammarAccess.getJsonMetaKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonMetaKeyValuePair__KeyAssignment_06808); 
             after(grammarAccess.getJsonMetaKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__KeyAssignment_0"


    // $ANTLR start "rule__JsonMetaKeyValuePair__ValueAssignment_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3409:1: rule__JsonMetaKeyValuePair__ValueAssignment_2 : ( ruleJsonMetaType ) ;
    public final void rule__JsonMetaKeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3413:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3414:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3414:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3415:1: ruleJsonMetaType
            {
             before(grammarAccess.getJsonMetaKeyValuePairAccess().getValueJsonMetaTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__JsonMetaKeyValuePair__ValueAssignment_26839);
            ruleJsonMetaType();

            state._fsp--;

             after(grammarAccess.getJsonMetaKeyValuePairAccess().getValueJsonMetaTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonMetaKeyValuePair__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXplatform_in_entryRuleXplatform61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatform68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__0_in_ruleXplatform94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__0_in_ruleXplatformHeader214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0_in_ruleXplatformHeaderKeyValuePair274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Alternatives_in_ruleXplatformJson334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaScalarType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaScalarType__Alternatives_in_ruleJsonMetaScalarType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaArray428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__0_in_ruleJsonMetaArray454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__Alternatives_in_ruleJsonMetaType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonCompositeType__CompositeAssignment_in_ruleJsonCompositeType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__Alternatives_in_ruleJsonType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonScalarType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Alternatives_in_ruleJsonScalarType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Alternatives_in_ruleJsonArray754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0_in_ruleJsonKeyValuePair814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaKeyValuePair_in_entryRuleJsonMetaKeyValuePair841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaKeyValuePair848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__Group__0_in_ruleJsonMetaKeyValuePair874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_1__0_in_rule__XplatformJson__Alternatives981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Xplatform__Group__0__Impl1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11391 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__2_in_rule__Xplatform__Group__11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__NameAssignment_1_in_rule__Xplatform__Group__1__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__2__Impl_in_rule__Xplatform__Group__21451 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__3_in_rule__Xplatform__Group__21454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__MethodAssignment_2_in_rule__Xplatform__Group__2__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__3__Impl_in_rule__Xplatform__Group__31511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__4_in_rule__Xplatform__Group__31514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Xplatform__Group__3__Impl1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__4__Impl_in_rule__Xplatform__Group__41573 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__5_in_rule__Xplatform__Group__41576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__UriAssignment_4_in_rule__Xplatform__Group__4__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__5__Impl_in_rule__Xplatform__Group__51633 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__6_in_rule__Xplatform__Group__51636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__0_in_rule__Xplatform__Group__5__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__6__Impl_in_rule__Xplatform__Group__61694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__0_in_rule__Xplatform__Group__6__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__0__Impl_in_rule__Xplatform__Group_5__01766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__1_in_rule__Xplatform__Group_5__01769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Xplatform__Group_5__0__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__1__Impl_in_rule__Xplatform__Group_5__11828 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__2_in_rule__Xplatform__Group_5__11831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Xplatform__Group_5__1__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__2__Impl_in_rule__Xplatform__Group_5__21890 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__3_in_rule__Xplatform__Group_5__21893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Xplatform__Group_5__2__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__3__Impl_in_rule__Xplatform__Group_5__31952 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__4_in_rule__Xplatform__Group_5__31955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Xplatform__Group_5__3__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__4__Impl_in_rule__Xplatform__Group_5__42014 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__5_in_rule__Xplatform__Group_5__42017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__RequestHeadersAssignment_5_4_in_rule__Xplatform__Group_5__4__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5__5__Impl_in_rule__Xplatform__Group_5__52074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5_5__0_in_rule__Xplatform__Group_5__5__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5_5__0__Impl_in_rule__Xplatform__Group_5_5__02144 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5_5__1_in_rule__Xplatform__Group_5_5__02147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Xplatform__Group_5_5__0__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5_5__1__Impl_in_rule__Xplatform__Group_5_5__12206 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5_5__2_in_rule__Xplatform__Group_5_5__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Xplatform__Group_5_5__1__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_5_5__2__Impl_in_rule__Xplatform__Group_5_5__22268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__ResponseHeadersAssignment_5_5_2_in_rule__Xplatform__Group_5_5__2__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__0__Impl_in_rule__Xplatform__Group_6__02331 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__1_in_rule__Xplatform__Group_6__02334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Xplatform__Group_6__0__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__1__Impl_in_rule__Xplatform__Group_6__12393 = new BitSet(new long[]{0x0000000240038000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__2_in_rule__Xplatform__Group_6__12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Xplatform__Group_6__1__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__2__Impl_in_rule__Xplatform__Group_6__22455 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__3_in_rule__Xplatform__Group_6__22458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__JsonToClientAssignment_6_2_in_rule__Xplatform__Group_6__2__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__3__Impl_in_rule__Xplatform__Group_6__32515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_3__0_in_rule__Xplatform__Group_6__3__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_3__0__Impl_in_rule__Xplatform__Group_6_3__02581 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_3__1_in_rule__Xplatform__Group_6_3__02584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Xplatform__Group_6_3__0__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_3__1__Impl_in_rule__Xplatform__Group_6_3__12643 = new BitSet(new long[]{0x0000000240038000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_3__2_in_rule__Xplatform__Group_6_3__12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Xplatform__Group_6_3__1__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_3__2__Impl_in_rule__Xplatform__Group_6_3__22705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__JsonToServerAssignment_6_3_2_in_rule__Xplatform__Group_6_3__2__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02768 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2801 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2814 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl2874 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__02909 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__02912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__URI__Group_1__0__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__12971 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__12974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__UriParameterAssignment_1_1_in_rule__URI__Group_1__1__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__URI__Group_1__2__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3121 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03160 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformHeader__Group__0__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13222 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__XplatformHeader__Group__1__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__23284 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__23287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_2_in_rule__XplatformHeader__Group__2__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__33344 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__33347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__0_in_rule__XplatformHeader__Group__3__Impl3374 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__43405 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__43408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__XplatformHeader__Group__4__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__53467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformHeader__Group__5__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__0__Impl_in_rule__XplatformHeader__Group_3__03538 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__1_in_rule__XplatformHeader__Group_3__03541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformHeader__Group_3__0__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__1__Impl_in_rule__XplatformHeader__Group_3__13600 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__2_in_rule__XplatformHeader__Group_3__13603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_1_in_rule__XplatformHeader__Group_3__1__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__2__Impl_in_rule__XplatformHeader__Group_3__23660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformHeader__Group_3__2__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__03728 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__03731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__13788 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__13791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__23850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__03913 = new BitSet(new long[]{0x0000000200000D20L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__03916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformJson__Group_0__0__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__TypeAssignment_0_1_in_rule__XplatformJson__Group_0__1__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_1__0__Impl_in_rule__XplatformJson__Group_1__04036 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_1__1_in_rule__XplatformJson__Group_1__04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_0_in_rule__XplatformJson__Group_1__0__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_1__1__Impl_in_rule__XplatformJson__Group_1__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformJson__Group_1__1__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__04159 = new BitSet(new long[]{0x0000000240038000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__04162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__JsonMetaArray__Group__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__14221 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__14224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__24281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonMetaArray__Group__2__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__04346 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__04349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__04468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__04471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonScalarType__Group_2_1__0__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__14530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__04590 = new BitSet(new long[]{0x0000000000000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__04593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__JsonArray__Group_0__0__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__14652 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__24712 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__24715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl4742 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__34773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_0__3__Impl4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__04840 = new BitSet(new long[]{0x0000000000000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__04843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__JsonArray__Group_0_2__0__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__14902 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__2_in_rule__JsonArray__Group_0_2__14905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__2__Impl_in_rule__JsonArray__Group_0_2__24962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__JsonArray__Group_0_2__2__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__05030 = new BitSet(new long[]{0x0000000200000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__05033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__JsonArray__Group_1__0__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__15092 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositeAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__25152 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__25155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl5182 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__35213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_1__3__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__05280 = new BitSet(new long[]{0x0000000200000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__05283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__JsonArray__Group_1_2__0__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__15342 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__2_in_rule__JsonArray__Group_1_2__15345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositeAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__2__Impl_in_rule__JsonArray__Group_1_2__25402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__JsonArray__Group_1_2__2__Impl5431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__0__Impl_in_rule__JsonKeyValuePair__Group__05470 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1_in_rule__JsonKeyValuePair__Group__05473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__KeyAssignment_0_in_rule__JsonKeyValuePair__Group__0__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__1__Impl_in_rule__JsonKeyValuePair__Group__15530 = new BitSet(new long[]{0x0000000200000D20L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2_in_rule__JsonKeyValuePair__Group__15533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonKeyValuePair__Group__1__Impl5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__Group__2__Impl_in_rule__JsonKeyValuePair__Group__25592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonKeyValuePair__ValueAssignment_2_in_rule__JsonKeyValuePair__Group__2__Impl5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__Group__0__Impl_in_rule__JsonMetaKeyValuePair__Group__05655 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__Group__1_in_rule__JsonMetaKeyValuePair__Group__05658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__KeyAssignment_0_in_rule__JsonMetaKeyValuePair__Group__0__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__Group__1__Impl_in_rule__JsonMetaKeyValuePair__Group__15715 = new BitSet(new long[]{0x0000000240038000L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__Group__2_in_rule__JsonMetaKeyValuePair__Group__15718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonMetaKeyValuePair__Group__1__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__Group__2__Impl_in_rule__JsonMetaKeyValuePair__Group__25777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaKeyValuePair__ValueAssignment_2_in_rule__JsonMetaKeyValuePair__Group__2__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Xplatform__NameAssignment_15847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__Xplatform__MethodAssignment_25878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Xplatform__UriAssignment_45909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__Xplatform__RequestHeadersAssignment_5_45940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__Xplatform__ResponseHeadersAssignment_5_5_25971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToClientAssignment_6_26002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToServerAssignment_6_3_26033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__UriParameterAssignment_1_16064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_26095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_3_16126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_06157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_06188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_16219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_16250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_1_06281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_16312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_06343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_16374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_06436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_16467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_06498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_16529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_06560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_36591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementAssignment_0_16622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementAssignment_0_2_16653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositeAssignment_1_16684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositeAssignment_1_2_16715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonKeyValuePair__KeyAssignment_06746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__JsonKeyValuePair__ValueAssignment_26777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonMetaKeyValuePair__KeyAssignment_06808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__JsonMetaKeyValuePair__ValueAssignment_26839 = new BitSet(new long[]{0x0000000000000002L});

}