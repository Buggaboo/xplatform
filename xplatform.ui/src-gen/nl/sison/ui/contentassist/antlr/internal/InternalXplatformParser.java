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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_INT", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_STRING", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'boolean'", "'number'", "'string'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'{'", "'}'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'.'"
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


    // $ANTLR start "entryRuleJsonObject"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:396:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:397:1: ( ruleJsonObject EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:398:1: ruleJsonObject EOF
            {
             before(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject781);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject788); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:405:1: ruleJsonObject : ( ( rule__JsonObject__Group__0 ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:409:2: ( ( ( rule__JsonObject__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__JsonObject__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:410:1: ( ( rule__JsonObject__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:411:1: ( rule__JsonObject__Group__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:1: ( rule__JsonObject__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:412:2: rule__JsonObject__Group__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject814);
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


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Alternatives_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:424:1: rule__XplatformHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) );
    public final void rule__XplatformHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:428:1: ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:429:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:429:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:430:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:431:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:431:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_2850);
                    rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:435:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:435:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:436:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:437:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:437:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_2868);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:446:1: rule__XplatformJson__Alternatives : ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__MetaTypeAssignment_1 ) ) | ( ( rule__XplatformJson__Group_2__0 ) ) );
    public final void rule__XplatformJson__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:450:1: ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__MetaTypeAssignment_1 ) ) | ( ( rule__XplatformJson__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 34:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:451:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:451:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:452:1: ( rule__XplatformJson__Group_0__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:453:1: ( rule__XplatformJson__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:453:2: rule__XplatformJson__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives901);
                    rule__XplatformJson__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:457:6: ( ( rule__XplatformJson__MetaTypeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:457:6: ( ( rule__XplatformJson__MetaTypeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:458:1: ( rule__XplatformJson__MetaTypeAssignment_1 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:459:1: ( rule__XplatformJson__MetaTypeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:459:2: rule__XplatformJson__MetaTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_in_rule__XplatformJson__Alternatives919);
                    rule__XplatformJson__MetaTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:463:6: ( ( rule__XplatformJson__Group_2__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:463:6: ( ( rule__XplatformJson__Group_2__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:464:1: ( rule__XplatformJson__Group_2__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_2()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:465:1: ( rule__XplatformJson__Group_2__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:465:2: rule__XplatformJson__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_2__0_in_rule__XplatformJson__Alternatives937);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:474:1: rule__JsonMetaScalarType__Alternatives : ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) );
    public final void rule__JsonMetaScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:478:1: ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:479:1: ( 'boolean' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:479:1: ( 'boolean' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:480:1: 'boolean'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives971); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:487:6: ( 'number' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:487:6: ( 'number' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:488:1: 'number'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives991); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:495:6: ( 'string' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:495:6: ( 'string' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:496:1: 'string'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getStringKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1011); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:508:1: rule__JsonMetaType__Alternatives : ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) );
    public final void rule__JsonMetaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:512:1: ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=17)) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:513:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:513:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:514:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:515:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:515:2: rule__JsonMetaType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1045);
                    rule__JsonMetaType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:519:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:519:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:520:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:521:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:521:2: rule__JsonMetaType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1063);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:530:1: rule__JsonType__Alternatives : ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) );
    public final void rule__JsonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:534:1: ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==RULE_STRING||(LA5_0>=RULE_JSON_LITERAL_BOOLEAN && LA5_0<=RULE_JSON_LITERAL_NULL)) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:535:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:535:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:536:1: ( rule__JsonType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:537:1: ( rule__JsonType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:537:2: rule__JsonType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1096);
                    rule__JsonType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:541:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:541:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:542:1: ( rule__JsonType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:543:1: ( rule__JsonType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:543:2: rule__JsonType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1114);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:552:1: rule__JsonScalarType__Alternatives : ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) );
    public final void rule__JsonScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:556:1: ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:557:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:557:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:558:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:559:2: rule__JsonScalarType__BoolAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1147);
                    rule__JsonScalarType__BoolAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:563:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:563:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:564:1: ( rule__JsonScalarType__StringAssignment_1 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:565:1: ( rule__JsonScalarType__StringAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:565:2: rule__JsonScalarType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1165);
                    rule__JsonScalarType__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:569:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:569:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:570:1: ( rule__JsonScalarType__Group_2__0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:571:1: ( rule__JsonScalarType__Group_2__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:571:2: rule__JsonScalarType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1183);
                    rule__JsonScalarType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:575:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:575:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:576:1: ( rule__JsonScalarType__NullAssignment_3 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getNullAssignment_3()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:577:1: ( rule__JsonScalarType__NullAssignment_3 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:577:2: rule__JsonScalarType__NullAssignment_3
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1201);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:586:1: rule__JsonArray__Alternatives : ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) );
    public final void rule__JsonArray__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:590:1: ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_INT||LA7_1==RULE_STRING||(LA7_1>=RULE_JSON_LITERAL_BOOLEAN && LA7_1<=RULE_JSON_LITERAL_NULL)) ) {
                    alt7=1;
                }
                else if ( (LA7_1==34) ) {
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:591:1: ( ( rule__JsonArray__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:591:1: ( ( rule__JsonArray__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:592:1: ( rule__JsonArray__Group_0__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:593:1: ( rule__JsonArray__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:593:2: rule__JsonArray__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1234);
                    rule__JsonArray__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonArrayAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:597:6: ( ( rule__JsonArray__Group_1__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:597:6: ( ( rule__JsonArray__Group_1__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:598:1: ( rule__JsonArray__Group_1__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:599:1: ( rule__JsonArray__Group_1__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:599:2: rule__JsonArray__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1252);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:610:1: rule__Xplatform__Group__0 : rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 ;
    public final void rule__Xplatform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:614:1: ( rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:615:2: rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01283);
            rule__Xplatform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01286);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:622:1: rule__Xplatform__Group__0__Impl : ( 'call' ) ;
    public final void rule__Xplatform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:626:1: ( ( 'call' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:627:1: ( 'call' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:627:1: ( 'call' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:628:1: 'call'
            {
             before(grammarAccess.getXplatformAccess().getCallKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Xplatform__Group__0__Impl1314); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:641:1: rule__Xplatform__Group__1 : rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2 ;
    public final void rule__Xplatform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:645:1: ( rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:646:2: rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11345);
            rule__Xplatform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__2_in_rule__Xplatform__Group__11348);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:653:1: rule__Xplatform__Group__1__Impl : ( ( rule__Xplatform__NameAssignment_1 ) ) ;
    public final void rule__Xplatform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:657:1: ( ( ( rule__Xplatform__NameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:658:1: ( ( rule__Xplatform__NameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:658:1: ( ( rule__Xplatform__NameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:659:1: ( rule__Xplatform__NameAssignment_1 )
            {
             before(grammarAccess.getXplatformAccess().getNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:660:1: ( rule__Xplatform__NameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:660:2: rule__Xplatform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Xplatform__NameAssignment_1_in_rule__Xplatform__Group__1__Impl1375);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:670:1: rule__Xplatform__Group__2 : rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3 ;
    public final void rule__Xplatform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:674:1: ( rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:675:2: rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__2__Impl_in_rule__Xplatform__Group__21405);
            rule__Xplatform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__3_in_rule__Xplatform__Group__21408);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:682:1: rule__Xplatform__Group__2__Impl : ( ':' ) ;
    public final void rule__Xplatform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:686:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:687:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:687:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:688:1: ':'
            {
             before(grammarAccess.getXplatformAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Xplatform__Group__2__Impl1436); 
             after(grammarAccess.getXplatformAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:701:1: rule__Xplatform__Group__3 : rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4 ;
    public final void rule__Xplatform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:705:1: ( rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:706:2: rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__3__Impl_in_rule__Xplatform__Group__31467);
            rule__Xplatform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__4_in_rule__Xplatform__Group__31470);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:713:1: rule__Xplatform__Group__3__Impl : ( ( rule__Xplatform__MethodAssignment_3 ) ) ;
    public final void rule__Xplatform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:717:1: ( ( ( rule__Xplatform__MethodAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:718:1: ( ( rule__Xplatform__MethodAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:718:1: ( ( rule__Xplatform__MethodAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:719:1: ( rule__Xplatform__MethodAssignment_3 )
            {
             before(grammarAccess.getXplatformAccess().getMethodAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:720:1: ( rule__Xplatform__MethodAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:720:2: rule__Xplatform__MethodAssignment_3
            {
            pushFollow(FOLLOW_rule__Xplatform__MethodAssignment_3_in_rule__Xplatform__Group__3__Impl1497);
            rule__Xplatform__MethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getMethodAssignment_3()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:730:1: rule__Xplatform__Group__4 : rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5 ;
    public final void rule__Xplatform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:734:1: ( rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:735:2: rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__4__Impl_in_rule__Xplatform__Group__41527);
            rule__Xplatform__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__5_in_rule__Xplatform__Group__41530);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:742:1: rule__Xplatform__Group__4__Impl : ( 'from' ) ;
    public final void rule__Xplatform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:746:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:747:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:747:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:748:1: 'from'
            {
             before(grammarAccess.getXplatformAccess().getFromKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Xplatform__Group__4__Impl1558); 
             after(grammarAccess.getXplatformAccess().getFromKeyword_4()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:761:1: rule__Xplatform__Group__5 : rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6 ;
    public final void rule__Xplatform__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:765:1: ( rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:766:2: rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__5__Impl_in_rule__Xplatform__Group__51589);
            rule__Xplatform__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__6_in_rule__Xplatform__Group__51592);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:773:1: rule__Xplatform__Group__5__Impl : ( ( rule__Xplatform__UriAssignment_5 ) ) ;
    public final void rule__Xplatform__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:777:1: ( ( ( rule__Xplatform__UriAssignment_5 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:778:1: ( ( rule__Xplatform__UriAssignment_5 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:778:1: ( ( rule__Xplatform__UriAssignment_5 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:779:1: ( rule__Xplatform__UriAssignment_5 )
            {
             before(grammarAccess.getXplatformAccess().getUriAssignment_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:780:1: ( rule__Xplatform__UriAssignment_5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:780:2: rule__Xplatform__UriAssignment_5
            {
            pushFollow(FOLLOW_rule__Xplatform__UriAssignment_5_in_rule__Xplatform__Group__5__Impl1619);
            rule__Xplatform__UriAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getUriAssignment_5()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:790:1: rule__Xplatform__Group__6 : rule__Xplatform__Group__6__Impl rule__Xplatform__Group__7 ;
    public final void rule__Xplatform__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:794:1: ( rule__Xplatform__Group__6__Impl rule__Xplatform__Group__7 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:795:2: rule__Xplatform__Group__6__Impl rule__Xplatform__Group__7
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__6__Impl_in_rule__Xplatform__Group__61649);
            rule__Xplatform__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__7_in_rule__Xplatform__Group__61652);
            rule__Xplatform__Group__7();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:802:1: rule__Xplatform__Group__6__Impl : ( ( rule__Xplatform__Group_6__0 )? ) ;
    public final void rule__Xplatform__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:806:1: ( ( ( rule__Xplatform__Group_6__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:807:1: ( ( rule__Xplatform__Group_6__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:807:1: ( ( rule__Xplatform__Group_6__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:808:1: ( rule__Xplatform__Group_6__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_6()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:809:1: ( rule__Xplatform__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:809:2: rule__Xplatform__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_6__0_in_rule__Xplatform__Group__6__Impl1679);
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


    // $ANTLR start "rule__Xplatform__Group__7"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:819:1: rule__Xplatform__Group__7 : rule__Xplatform__Group__7__Impl ;
    public final void rule__Xplatform__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:823:1: ( rule__Xplatform__Group__7__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:824:2: rule__Xplatform__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__7__Impl_in_rule__Xplatform__Group__71710);
            rule__Xplatform__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__7"


    // $ANTLR start "rule__Xplatform__Group__7__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:830:1: rule__Xplatform__Group__7__Impl : ( ( rule__Xplatform__Group_7__0 )? ) ;
    public final void rule__Xplatform__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:834:1: ( ( ( rule__Xplatform__Group_7__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:835:1: ( ( rule__Xplatform__Group_7__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:835:1: ( ( rule__Xplatform__Group_7__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:836:1: ( rule__Xplatform__Group_7__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_7()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:837:1: ( rule__Xplatform__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:837:2: rule__Xplatform__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_7__0_in_rule__Xplatform__Group__7__Impl1737);
                    rule__Xplatform__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__7__Impl"


    // $ANTLR start "rule__Xplatform__Group_6__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:863:1: rule__Xplatform__Group_6__0 : rule__Xplatform__Group_6__0__Impl rule__Xplatform__Group_6__1 ;
    public final void rule__Xplatform__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:867:1: ( rule__Xplatform__Group_6__0__Impl rule__Xplatform__Group_6__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:868:2: rule__Xplatform__Group_6__0__Impl rule__Xplatform__Group_6__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__0__Impl_in_rule__Xplatform__Group_6__01784);
            rule__Xplatform__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__1_in_rule__Xplatform__Group_6__01787);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:875:1: rule__Xplatform__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__Xplatform__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:879:1: ( ( 'with' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:880:1: ( 'with' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:880:1: ( 'with' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:881:1: 'with'
            {
             before(grammarAccess.getXplatformAccess().getWithKeyword_6_0()); 
            match(input,21,FOLLOW_21_in_rule__Xplatform__Group_6__0__Impl1815); 
             after(grammarAccess.getXplatformAccess().getWithKeyword_6_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:894:1: rule__Xplatform__Group_6__1 : rule__Xplatform__Group_6__1__Impl rule__Xplatform__Group_6__2 ;
    public final void rule__Xplatform__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:898:1: ( rule__Xplatform__Group_6__1__Impl rule__Xplatform__Group_6__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:899:2: rule__Xplatform__Group_6__1__Impl rule__Xplatform__Group_6__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__1__Impl_in_rule__Xplatform__Group_6__11846);
            rule__Xplatform__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__2_in_rule__Xplatform__Group_6__11849);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:906:1: rule__Xplatform__Group_6__1__Impl : ( 'headers' ) ;
    public final void rule__Xplatform__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:910:1: ( ( 'headers' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:911:1: ( 'headers' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:911:1: ( 'headers' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:912:1: 'headers'
            {
             before(grammarAccess.getXplatformAccess().getHeadersKeyword_6_1()); 
            match(input,22,FOLLOW_22_in_rule__Xplatform__Group_6__1__Impl1877); 
             after(grammarAccess.getXplatformAccess().getHeadersKeyword_6_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:925:1: rule__Xplatform__Group_6__2 : rule__Xplatform__Group_6__2__Impl rule__Xplatform__Group_6__3 ;
    public final void rule__Xplatform__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:929:1: ( rule__Xplatform__Group_6__2__Impl rule__Xplatform__Group_6__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:930:2: rule__Xplatform__Group_6__2__Impl rule__Xplatform__Group_6__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__2__Impl_in_rule__Xplatform__Group_6__21908);
            rule__Xplatform__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__3_in_rule__Xplatform__Group_6__21911);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:937:1: rule__Xplatform__Group_6__2__Impl : ( 'from' ) ;
    public final void rule__Xplatform__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:941:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:942:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:942:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:943:1: 'from'
            {
             before(grammarAccess.getXplatformAccess().getFromKeyword_6_2()); 
            match(input,20,FOLLOW_20_in_rule__Xplatform__Group_6__2__Impl1939); 
             after(grammarAccess.getXplatformAccess().getFromKeyword_6_2()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:956:1: rule__Xplatform__Group_6__3 : rule__Xplatform__Group_6__3__Impl rule__Xplatform__Group_6__4 ;
    public final void rule__Xplatform__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:960:1: ( rule__Xplatform__Group_6__3__Impl rule__Xplatform__Group_6__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:961:2: rule__Xplatform__Group_6__3__Impl rule__Xplatform__Group_6__4
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__3__Impl_in_rule__Xplatform__Group_6__31970);
            rule__Xplatform__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__4_in_rule__Xplatform__Group_6__31973);
            rule__Xplatform__Group_6__4();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:968:1: rule__Xplatform__Group_6__3__Impl : ( 'request' ) ;
    public final void rule__Xplatform__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:972:1: ( ( 'request' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:973:1: ( 'request' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:973:1: ( 'request' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:974:1: 'request'
            {
             before(grammarAccess.getXplatformAccess().getRequestKeyword_6_3()); 
            match(input,23,FOLLOW_23_in_rule__Xplatform__Group_6__3__Impl2001); 
             after(grammarAccess.getXplatformAccess().getRequestKeyword_6_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Xplatform__Group_6__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:987:1: rule__Xplatform__Group_6__4 : rule__Xplatform__Group_6__4__Impl rule__Xplatform__Group_6__5 ;
    public final void rule__Xplatform__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:991:1: ( rule__Xplatform__Group_6__4__Impl rule__Xplatform__Group_6__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:992:2: rule__Xplatform__Group_6__4__Impl rule__Xplatform__Group_6__5
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__4__Impl_in_rule__Xplatform__Group_6__42032);
            rule__Xplatform__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6__5_in_rule__Xplatform__Group_6__42035);
            rule__Xplatform__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__4"


    // $ANTLR start "rule__Xplatform__Group_6__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:999:1: rule__Xplatform__Group_6__4__Impl : ( ( rule__Xplatform__RequestHeadersAssignment_6_4 ) ) ;
    public final void rule__Xplatform__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1003:1: ( ( ( rule__Xplatform__RequestHeadersAssignment_6_4 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1004:1: ( ( rule__Xplatform__RequestHeadersAssignment_6_4 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1004:1: ( ( rule__Xplatform__RequestHeadersAssignment_6_4 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1005:1: ( rule__Xplatform__RequestHeadersAssignment_6_4 )
            {
             before(grammarAccess.getXplatformAccess().getRequestHeadersAssignment_6_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1006:1: ( rule__Xplatform__RequestHeadersAssignment_6_4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1006:2: rule__Xplatform__RequestHeadersAssignment_6_4
            {
            pushFollow(FOLLOW_rule__Xplatform__RequestHeadersAssignment_6_4_in_rule__Xplatform__Group_6__4__Impl2062);
            rule__Xplatform__RequestHeadersAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getRequestHeadersAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__4__Impl"


    // $ANTLR start "rule__Xplatform__Group_6__5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1016:1: rule__Xplatform__Group_6__5 : rule__Xplatform__Group_6__5__Impl ;
    public final void rule__Xplatform__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1020:1: ( rule__Xplatform__Group_6__5__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1021:2: rule__Xplatform__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6__5__Impl_in_rule__Xplatform__Group_6__52092);
            rule__Xplatform__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__5"


    // $ANTLR start "rule__Xplatform__Group_6__5__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1027:1: rule__Xplatform__Group_6__5__Impl : ( ( rule__Xplatform__Group_6_5__0 )? ) ;
    public final void rule__Xplatform__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1031:1: ( ( ( rule__Xplatform__Group_6_5__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1032:1: ( ( rule__Xplatform__Group_6_5__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1032:1: ( ( rule__Xplatform__Group_6_5__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1033:1: ( rule__Xplatform__Group_6_5__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_6_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1034:1: ( rule__Xplatform__Group_6_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1034:2: rule__Xplatform__Group_6_5__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_6_5__0_in_rule__Xplatform__Group_6__5__Impl2119);
                    rule__Xplatform__Group_6_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6__5__Impl"


    // $ANTLR start "rule__Xplatform__Group_6_5__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1056:1: rule__Xplatform__Group_6_5__0 : rule__Xplatform__Group_6_5__0__Impl rule__Xplatform__Group_6_5__1 ;
    public final void rule__Xplatform__Group_6_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1060:1: ( rule__Xplatform__Group_6_5__0__Impl rule__Xplatform__Group_6_5__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1061:2: rule__Xplatform__Group_6_5__0__Impl rule__Xplatform__Group_6_5__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6_5__0__Impl_in_rule__Xplatform__Group_6_5__02162);
            rule__Xplatform__Group_6_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6_5__1_in_rule__Xplatform__Group_6_5__02165);
            rule__Xplatform__Group_6_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_5__0"


    // $ANTLR start "rule__Xplatform__Group_6_5__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1068:1: rule__Xplatform__Group_6_5__0__Impl : ( 'and' ) ;
    public final void rule__Xplatform__Group_6_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1072:1: ( ( 'and' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1073:1: ( 'and' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1073:1: ( 'and' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1074:1: 'and'
            {
             before(grammarAccess.getXplatformAccess().getAndKeyword_6_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Xplatform__Group_6_5__0__Impl2193); 
             after(grammarAccess.getXplatformAccess().getAndKeyword_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_5__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_6_5__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1087:1: rule__Xplatform__Group_6_5__1 : rule__Xplatform__Group_6_5__1__Impl rule__Xplatform__Group_6_5__2 ;
    public final void rule__Xplatform__Group_6_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1091:1: ( rule__Xplatform__Group_6_5__1__Impl rule__Xplatform__Group_6_5__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1092:2: rule__Xplatform__Group_6_5__1__Impl rule__Xplatform__Group_6_5__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6_5__1__Impl_in_rule__Xplatform__Group_6_5__12224);
            rule__Xplatform__Group_6_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_6_5__2_in_rule__Xplatform__Group_6_5__12227);
            rule__Xplatform__Group_6_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_5__1"


    // $ANTLR start "rule__Xplatform__Group_6_5__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1099:1: rule__Xplatform__Group_6_5__1__Impl : ( 'response' ) ;
    public final void rule__Xplatform__Group_6_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1103:1: ( ( 'response' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1104:1: ( 'response' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1104:1: ( 'response' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1105:1: 'response'
            {
             before(grammarAccess.getXplatformAccess().getResponseKeyword_6_5_1()); 
            match(input,25,FOLLOW_25_in_rule__Xplatform__Group_6_5__1__Impl2255); 
             after(grammarAccess.getXplatformAccess().getResponseKeyword_6_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_5__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_6_5__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1118:1: rule__Xplatform__Group_6_5__2 : rule__Xplatform__Group_6_5__2__Impl ;
    public final void rule__Xplatform__Group_6_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1122:1: ( rule__Xplatform__Group_6_5__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1123:2: rule__Xplatform__Group_6_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_6_5__2__Impl_in_rule__Xplatform__Group_6_5__22286);
            rule__Xplatform__Group_6_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_5__2"


    // $ANTLR start "rule__Xplatform__Group_6_5__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1129:1: rule__Xplatform__Group_6_5__2__Impl : ( ( rule__Xplatform__ResponseHeadersAssignment_6_5_2 ) ) ;
    public final void rule__Xplatform__Group_6_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1133:1: ( ( ( rule__Xplatform__ResponseHeadersAssignment_6_5_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1134:1: ( ( rule__Xplatform__ResponseHeadersAssignment_6_5_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1134:1: ( ( rule__Xplatform__ResponseHeadersAssignment_6_5_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1135:1: ( rule__Xplatform__ResponseHeadersAssignment_6_5_2 )
            {
             before(grammarAccess.getXplatformAccess().getResponseHeadersAssignment_6_5_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1136:1: ( rule__Xplatform__ResponseHeadersAssignment_6_5_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1136:2: rule__Xplatform__ResponseHeadersAssignment_6_5_2
            {
            pushFollow(FOLLOW_rule__Xplatform__ResponseHeadersAssignment_6_5_2_in_rule__Xplatform__Group_6_5__2__Impl2313);
            rule__Xplatform__ResponseHeadersAssignment_6_5_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getResponseHeadersAssignment_6_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_6_5__2__Impl"


    // $ANTLR start "rule__Xplatform__Group_7__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1152:1: rule__Xplatform__Group_7__0 : rule__Xplatform__Group_7__0__Impl rule__Xplatform__Group_7__1 ;
    public final void rule__Xplatform__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1156:1: ( rule__Xplatform__Group_7__0__Impl rule__Xplatform__Group_7__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1157:2: rule__Xplatform__Group_7__0__Impl rule__Xplatform__Group_7__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__0__Impl_in_rule__Xplatform__Group_7__02349);
            rule__Xplatform__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__1_in_rule__Xplatform__Group_7__02352);
            rule__Xplatform__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__0"


    // $ANTLR start "rule__Xplatform__Group_7__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1164:1: rule__Xplatform__Group_7__0__Impl : ( 'client' ) ;
    public final void rule__Xplatform__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1168:1: ( ( 'client' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1169:1: ( 'client' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1169:1: ( 'client' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1170:1: 'client'
            {
             before(grammarAccess.getXplatformAccess().getClientKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Xplatform__Group_7__0__Impl2380); 
             after(grammarAccess.getXplatformAccess().getClientKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_7__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1183:1: rule__Xplatform__Group_7__1 : rule__Xplatform__Group_7__1__Impl rule__Xplatform__Group_7__2 ;
    public final void rule__Xplatform__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1187:1: ( rule__Xplatform__Group_7__1__Impl rule__Xplatform__Group_7__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1188:2: rule__Xplatform__Group_7__1__Impl rule__Xplatform__Group_7__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__1__Impl_in_rule__Xplatform__Group_7__12411);
            rule__Xplatform__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__2_in_rule__Xplatform__Group_7__12414);
            rule__Xplatform__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__1"


    // $ANTLR start "rule__Xplatform__Group_7__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1195:1: rule__Xplatform__Group_7__1__Impl : ( 'expects' ) ;
    public final void rule__Xplatform__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1199:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1200:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1200:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1201:1: 'expects'
            {
             before(grammarAccess.getXplatformAccess().getExpectsKeyword_7_1()); 
            match(input,27,FOLLOW_27_in_rule__Xplatform__Group_7__1__Impl2442); 
             after(grammarAccess.getXplatformAccess().getExpectsKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_7__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1214:1: rule__Xplatform__Group_7__2 : rule__Xplatform__Group_7__2__Impl rule__Xplatform__Group_7__3 ;
    public final void rule__Xplatform__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1218:1: ( rule__Xplatform__Group_7__2__Impl rule__Xplatform__Group_7__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1219:2: rule__Xplatform__Group_7__2__Impl rule__Xplatform__Group_7__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__2__Impl_in_rule__Xplatform__Group_7__22473);
            rule__Xplatform__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__3_in_rule__Xplatform__Group_7__22476);
            rule__Xplatform__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__2"


    // $ANTLR start "rule__Xplatform__Group_7__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1226:1: rule__Xplatform__Group_7__2__Impl : ( ( rule__Xplatform__JsonToClientAssignment_7_2 ) ) ;
    public final void rule__Xplatform__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1230:1: ( ( ( rule__Xplatform__JsonToClientAssignment_7_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1231:1: ( ( rule__Xplatform__JsonToClientAssignment_7_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1231:1: ( ( rule__Xplatform__JsonToClientAssignment_7_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1232:1: ( rule__Xplatform__JsonToClientAssignment_7_2 )
            {
             before(grammarAccess.getXplatformAccess().getJsonToClientAssignment_7_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1233:1: ( rule__Xplatform__JsonToClientAssignment_7_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1233:2: rule__Xplatform__JsonToClientAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Xplatform__JsonToClientAssignment_7_2_in_rule__Xplatform__Group_7__2__Impl2503);
            rule__Xplatform__JsonToClientAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getJsonToClientAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__2__Impl"


    // $ANTLR start "rule__Xplatform__Group_7__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1243:1: rule__Xplatform__Group_7__3 : rule__Xplatform__Group_7__3__Impl ;
    public final void rule__Xplatform__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1247:1: ( rule__Xplatform__Group_7__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1248:2: rule__Xplatform__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__3__Impl_in_rule__Xplatform__Group_7__32533);
            rule__Xplatform__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__3"


    // $ANTLR start "rule__Xplatform__Group_7__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1254:1: rule__Xplatform__Group_7__3__Impl : ( ( rule__Xplatform__Group_7_3__0 )? ) ;
    public final void rule__Xplatform__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1258:1: ( ( ( rule__Xplatform__Group_7_3__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1259:1: ( ( rule__Xplatform__Group_7_3__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1259:1: ( ( rule__Xplatform__Group_7_3__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1260:1: ( rule__Xplatform__Group_7_3__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_7_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1261:1: ( rule__Xplatform__Group_7_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1261:2: rule__Xplatform__Group_7_3__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_7_3__0_in_rule__Xplatform__Group_7__3__Impl2560);
                    rule__Xplatform__Group_7_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__3__Impl"


    // $ANTLR start "rule__Xplatform__Group_7_3__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1279:1: rule__Xplatform__Group_7_3__0 : rule__Xplatform__Group_7_3__0__Impl rule__Xplatform__Group_7_3__1 ;
    public final void rule__Xplatform__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1283:1: ( rule__Xplatform__Group_7_3__0__Impl rule__Xplatform__Group_7_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1284:2: rule__Xplatform__Group_7_3__0__Impl rule__Xplatform__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7_3__0__Impl_in_rule__Xplatform__Group_7_3__02599);
            rule__Xplatform__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7_3__1_in_rule__Xplatform__Group_7_3__02602);
            rule__Xplatform__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_3__0"


    // $ANTLR start "rule__Xplatform__Group_7_3__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1291:1: rule__Xplatform__Group_7_3__0__Impl : ( 'server' ) ;
    public final void rule__Xplatform__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1295:1: ( ( 'server' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1296:1: ( 'server' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1296:1: ( 'server' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1297:1: 'server'
            {
             before(grammarAccess.getXplatformAccess().getServerKeyword_7_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Xplatform__Group_7_3__0__Impl2630); 
             after(grammarAccess.getXplatformAccess().getServerKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_3__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_7_3__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1310:1: rule__Xplatform__Group_7_3__1 : rule__Xplatform__Group_7_3__1__Impl rule__Xplatform__Group_7_3__2 ;
    public final void rule__Xplatform__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1314:1: ( rule__Xplatform__Group_7_3__1__Impl rule__Xplatform__Group_7_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1315:2: rule__Xplatform__Group_7_3__1__Impl rule__Xplatform__Group_7_3__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7_3__1__Impl_in_rule__Xplatform__Group_7_3__12661);
            rule__Xplatform__Group_7_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7_3__2_in_rule__Xplatform__Group_7_3__12664);
            rule__Xplatform__Group_7_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_3__1"


    // $ANTLR start "rule__Xplatform__Group_7_3__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1322:1: rule__Xplatform__Group_7_3__1__Impl : ( 'expects' ) ;
    public final void rule__Xplatform__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1326:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1327:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1327:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1328:1: 'expects'
            {
             before(grammarAccess.getXplatformAccess().getExpectsKeyword_7_3_1()); 
            match(input,27,FOLLOW_27_in_rule__Xplatform__Group_7_3__1__Impl2692); 
             after(grammarAccess.getXplatformAccess().getExpectsKeyword_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_3__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_7_3__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1341:1: rule__Xplatform__Group_7_3__2 : rule__Xplatform__Group_7_3__2__Impl ;
    public final void rule__Xplatform__Group_7_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1345:1: ( rule__Xplatform__Group_7_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1346:2: rule__Xplatform__Group_7_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7_3__2__Impl_in_rule__Xplatform__Group_7_3__22723);
            rule__Xplatform__Group_7_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_3__2"


    // $ANTLR start "rule__Xplatform__Group_7_3__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1352:1: rule__Xplatform__Group_7_3__2__Impl : ( ( rule__Xplatform__JsonToServerAssignment_7_3_2 ) ) ;
    public final void rule__Xplatform__Group_7_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1356:1: ( ( ( rule__Xplatform__JsonToServerAssignment_7_3_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1357:1: ( ( rule__Xplatform__JsonToServerAssignment_7_3_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1357:1: ( ( rule__Xplatform__JsonToServerAssignment_7_3_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1358:1: ( rule__Xplatform__JsonToServerAssignment_7_3_2 )
            {
             before(grammarAccess.getXplatformAccess().getJsonToServerAssignment_7_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1359:1: ( rule__Xplatform__JsonToServerAssignment_7_3_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1359:2: rule__Xplatform__JsonToServerAssignment_7_3_2
            {
            pushFollow(FOLLOW_rule__Xplatform__JsonToServerAssignment_7_3_2_in_rule__Xplatform__Group_7_3__2__Impl2750);
            rule__Xplatform__JsonToServerAssignment_7_3_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getJsonToServerAssignment_7_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_3__2__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1375:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1379:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1380:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02786);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02789);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1387:1: rule__URI__Group__0__Impl : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1391:1: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1392:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1392:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1393:1: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1393:1: ( ( RULE_ANY_OTHER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1394:1: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1395:1: ( RULE_ANY_OTHER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1395:3: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2819); 

            }

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1398:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1399:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1400:1: ( RULE_ANY_OTHER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANY_OTHER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1400:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2832); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1411:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1415:1: ( rule__URI__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1416:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12865);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1422:1: rule__URI__Group__1__Impl : ( ( rule__URI__Group_1__0 )? ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1426:1: ( ( ( rule__URI__Group_1__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1427:1: ( ( rule__URI__Group_1__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1427:1: ( ( rule__URI__Group_1__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1428:1: ( rule__URI__Group_1__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1429:1: ( rule__URI__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1429:2: rule__URI__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl2892);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1443:1: rule__URI__Group_1__0 : rule__URI__Group_1__0__Impl rule__URI__Group_1__1 ;
    public final void rule__URI__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1447:1: ( rule__URI__Group_1__0__Impl rule__URI__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1448:2: rule__URI__Group_1__0__Impl rule__URI__Group_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__02927);
            rule__URI__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__02930);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1455:1: rule__URI__Group_1__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1459:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1460:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1460:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1461:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__URI__Group_1__0__Impl2958); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1474:1: rule__URI__Group_1__1 : rule__URI__Group_1__1__Impl rule__URI__Group_1__2 ;
    public final void rule__URI__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1478:1: ( rule__URI__Group_1__1__Impl rule__URI__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1479:2: rule__URI__Group_1__1__Impl rule__URI__Group_1__2
            {
            pushFollow(FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__12989);
            rule__URI__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__12992);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1486:1: rule__URI__Group_1__1__Impl : ( ( rule__URI__UriParameterAssignment_1_1 ) ) ;
    public final void rule__URI__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1490:1: ( ( ( rule__URI__UriParameterAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1491:1: ( ( rule__URI__UriParameterAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1491:1: ( ( rule__URI__UriParameterAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1492:1: ( rule__URI__UriParameterAssignment_1_1 )
            {
             before(grammarAccess.getURIAccess().getUriParameterAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1493:1: ( rule__URI__UriParameterAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1493:2: rule__URI__UriParameterAssignment_1_1
            {
            pushFollow(FOLLOW_rule__URI__UriParameterAssignment_1_1_in_rule__URI__Group_1__1__Impl3019);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1503:1: rule__URI__Group_1__2 : rule__URI__Group_1__2__Impl rule__URI__Group_1__3 ;
    public final void rule__URI__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1507:1: ( rule__URI__Group_1__2__Impl rule__URI__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1508:2: rule__URI__Group_1__2__Impl rule__URI__Group_1__3
            {
            pushFollow(FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23049);
            rule__URI__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23052);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1515:1: rule__URI__Group_1__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1519:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1520:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1520:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1521:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,30,FOLLOW_30_in_rule__URI__Group_1__2__Impl3080); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1534:1: rule__URI__Group_1__3 : rule__URI__Group_1__3__Impl ;
    public final void rule__URI__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1538:1: ( rule__URI__Group_1__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1539:2: rule__URI__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33111);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1545:1: rule__URI__Group_1__3__Impl : ( ( RULE_ANY_OTHER )* ) ;
    public final void rule__URI__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1549:1: ( ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1550:1: ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1550:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1551:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1552:1: ( RULE_ANY_OTHER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANY_OTHER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1552:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3139); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1570:1: rule__XplatformHeader__Group__0 : rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 ;
    public final void rule__XplatformHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1574:1: ( rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1575:2: rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03178);
            rule__XplatformHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03181);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1582:1: rule__XplatformHeader__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1586:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1587:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1587:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1588:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__XplatformHeader__Group__0__Impl3209); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1601:1: rule__XplatformHeader__Group__1 : rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 ;
    public final void rule__XplatformHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1605:1: ( rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1606:2: rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13240);
            rule__XplatformHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13243);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1613:1: rule__XplatformHeader__Group__1__Impl : ( '{' ) ;
    public final void rule__XplatformHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1617:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1618:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1618:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1619:1: '{'
            {
             before(grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__XplatformHeader__Group__1__Impl3271); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1632:1: rule__XplatformHeader__Group__2 : rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 ;
    public final void rule__XplatformHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1636:1: ( rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1637:2: rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__23302);
            rule__XplatformHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__23305);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1644:1: rule__XplatformHeader__Group__2__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) ) ;
    public final void rule__XplatformHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1648:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1649:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1649:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1650:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1651:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1651:2: rule__XplatformHeader__HeaderKeyValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_2_in_rule__XplatformHeader__Group__2__Impl3332);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1661:1: rule__XplatformHeader__Group__3 : rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 ;
    public final void rule__XplatformHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1665:1: ( rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1666:2: rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__33362);
            rule__XplatformHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__33365);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1673:1: rule__XplatformHeader__Group__3__Impl : ( ( rule__XplatformHeader__Group_3__0 )* ) ;
    public final void rule__XplatformHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1677:1: ( ( ( rule__XplatformHeader__Group_3__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1678:1: ( ( rule__XplatformHeader__Group_3__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1678:1: ( ( rule__XplatformHeader__Group_3__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1679:1: ( rule__XplatformHeader__Group_3__0 )*
            {
             before(grammarAccess.getXplatformHeaderAccess().getGroup_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1680:1: ( rule__XplatformHeader__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_STRING) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1680:2: rule__XplatformHeader__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__XplatformHeader__Group_3__0_in_rule__XplatformHeader__Group__3__Impl3392);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1690:1: rule__XplatformHeader__Group__4 : rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 ;
    public final void rule__XplatformHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1694:1: ( rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1695:2: rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__43423);
            rule__XplatformHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__43426);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1702:1: rule__XplatformHeader__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__XplatformHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1706:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1707:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1707:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1708:1: ( ',' )?
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1709:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1710:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__XplatformHeader__Group__4__Impl3455); 

                    }
                    break;

            }

             after(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1721:1: rule__XplatformHeader__Group__5 : rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 ;
    public final void rule__XplatformHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1725:1: ( rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1726:2: rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__53488);
            rule__XplatformHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__53491);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1733:1: rule__XplatformHeader__Group__5__Impl : ( '}' ) ;
    public final void rule__XplatformHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1737:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1738:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1738:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1739:1: '}'
            {
             before(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__XplatformHeader__Group__5__Impl3519); 
             after(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1752:1: rule__XplatformHeader__Group__6 : rule__XplatformHeader__Group__6__Impl ;
    public final void rule__XplatformHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1756:1: ( rule__XplatformHeader__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1757:2: rule__XplatformHeader__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__63550);
            rule__XplatformHeader__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1763:1: rule__XplatformHeader__Group__6__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1767:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1768:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1768:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1769:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__XplatformHeader__Group__6__Impl3578); 
             after(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__XplatformHeader__Group_3__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1796:1: rule__XplatformHeader__Group_3__0 : rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1 ;
    public final void rule__XplatformHeader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1800:1: ( rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1801:2: rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__0__Impl_in_rule__XplatformHeader__Group_3__03623);
            rule__XplatformHeader__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__1_in_rule__XplatformHeader__Group_3__03626);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1808:1: rule__XplatformHeader__Group_3__0__Impl : ( ',' ) ;
    public final void rule__XplatformHeader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1812:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1813:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1813:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1814:1: ','
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__XplatformHeader__Group_3__0__Impl3654); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1827:1: rule__XplatformHeader__Group_3__1 : rule__XplatformHeader__Group_3__1__Impl ;
    public final void rule__XplatformHeader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1831:1: ( rule__XplatformHeader__Group_3__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1832:2: rule__XplatformHeader__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__1__Impl_in_rule__XplatformHeader__Group_3__13685);
            rule__XplatformHeader__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1838:1: rule__XplatformHeader__Group_3__1__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) ) ;
    public final void rule__XplatformHeader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1842:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1843:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1843:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1844:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_3_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1845:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1845:2: rule__XplatformHeader__HeaderKeyValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_1_in_rule__XplatformHeader__Group_3__1__Impl3712);
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


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1859:1: rule__XplatformHeaderKeyValuePair__Group__0 : rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1863:1: ( rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1864:2: rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__03746);
            rule__XplatformHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__03749);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1871:1: rule__XplatformHeaderKeyValuePair__Group__0__Impl : ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1875:1: ( ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1876:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1876:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1877:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1878:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1878:2: rule__XplatformHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl3776);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1888:1: rule__XplatformHeaderKeyValuePair__Group__1 : rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1892:1: ( rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1893:2: rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__13806);
            rule__XplatformHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__13809);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1900:1: rule__XplatformHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1904:1: ( ( '=' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1905:1: ( '=' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1905:1: ( '=' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1906:1: '='
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl3837); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1919:1: rule__XplatformHeaderKeyValuePair__Group__2 : rule__XplatformHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1923:1: ( rule__XplatformHeaderKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1924:2: rule__XplatformHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__23868);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1930:1: rule__XplatformHeaderKeyValuePair__Group__2__Impl : ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1934:1: ( ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1935:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1935:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1936:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1937:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1937:2: rule__XplatformHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl3895);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1953:1: rule__XplatformJson__Group_0__0 : rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 ;
    public final void rule__XplatformJson__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1957:1: ( rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1958:2: rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__03931);
            rule__XplatformJson__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__03934);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1965:1: rule__XplatformJson__Group_0__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1969:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1970:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1970:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1971:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__XplatformJson__Group_0__0__Impl3962); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1984:1: rule__XplatformJson__Group_0__1 : rule__XplatformJson__Group_0__1__Impl ;
    public final void rule__XplatformJson__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1988:1: ( rule__XplatformJson__Group_0__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1989:2: rule__XplatformJson__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__13993);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1995:1: rule__XplatformJson__Group_0__1__Impl : ( ( rule__XplatformJson__TypeAssignment_0_1 ) ) ;
    public final void rule__XplatformJson__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1999:1: ( ( ( rule__XplatformJson__TypeAssignment_0_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2000:1: ( ( rule__XplatformJson__TypeAssignment_0_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2000:1: ( ( rule__XplatformJson__TypeAssignment_0_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2001:1: ( rule__XplatformJson__TypeAssignment_0_1 )
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeAssignment_0_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2002:1: ( rule__XplatformJson__TypeAssignment_0_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2002:2: rule__XplatformJson__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__XplatformJson__TypeAssignment_0_1_in_rule__XplatformJson__Group_0__1__Impl4020);
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


    // $ANTLR start "rule__XplatformJson__Group_2__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2016:1: rule__XplatformJson__Group_2__0 : rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1 ;
    public final void rule__XplatformJson__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2020:1: ( rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2021:2: rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_2__0__Impl_in_rule__XplatformJson__Group_2__04054);
            rule__XplatformJson__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_2__1_in_rule__XplatformJson__Group_2__04057);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2028:1: rule__XplatformJson__Group_2__0__Impl : ( ( rule__XplatformJson__CompositeAssignment_2_0 ) ) ;
    public final void rule__XplatformJson__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2032:1: ( ( ( rule__XplatformJson__CompositeAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2033:1: ( ( rule__XplatformJson__CompositeAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2033:1: ( ( rule__XplatformJson__CompositeAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2034:1: ( rule__XplatformJson__CompositeAssignment_2_0 )
            {
             before(grammarAccess.getXplatformJsonAccess().getCompositeAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2035:1: ( rule__XplatformJson__CompositeAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2035:2: rule__XplatformJson__CompositeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__XplatformJson__CompositeAssignment_2_0_in_rule__XplatformJson__Group_2__0__Impl4084);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2045:1: rule__XplatformJson__Group_2__1 : rule__XplatformJson__Group_2__1__Impl ;
    public final void rule__XplatformJson__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2049:1: ( rule__XplatformJson__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2050:2: rule__XplatformJson__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_2__1__Impl_in_rule__XplatformJson__Group_2__14114);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2056:1: rule__XplatformJson__Group_2__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2060:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2061:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2061:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2062:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_2_1()); 
            match(input,31,FOLLOW_31_in_rule__XplatformJson__Group_2__1__Impl4142); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2079:1: rule__JsonMetaArray__Group__0 : rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 ;
    public final void rule__JsonMetaArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2083:1: ( rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2084:2: rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__04177);
            rule__JsonMetaArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__04180);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2091:1: rule__JsonMetaArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonMetaArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2095:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2096:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2096:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2097:1: '['
            {
             before(grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonMetaArray__Group__0__Impl4208); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2110:1: rule__JsonMetaArray__Group__1 : rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 ;
    public final void rule__JsonMetaArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2114:1: ( rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2115:2: rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__14239);
            rule__JsonMetaArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__14242);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2122:1: rule__JsonMetaArray__Group__1__Impl : ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) ;
    public final void rule__JsonMetaArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2126:1: ( ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2127:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2127:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2128:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2129:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2129:2: rule__JsonMetaArray__MetaTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl4269);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2139:1: rule__JsonMetaArray__Group__2 : rule__JsonMetaArray__Group__2__Impl ;
    public final void rule__JsonMetaArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2143:1: ( rule__JsonMetaArray__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2144:2: rule__JsonMetaArray__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__24299);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2150:1: rule__JsonMetaArray__Group__2__Impl : ( ']' ) ;
    public final void rule__JsonMetaArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2154:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2155:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2155:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2156:1: ']'
            {
             before(grammarAccess.getJsonMetaArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__JsonMetaArray__Group__2__Impl4327); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2175:1: rule__JsonScalarType__Group_2__0 : rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 ;
    public final void rule__JsonScalarType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2179:1: ( rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2180:2: rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__04364);
            rule__JsonScalarType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__04367);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2187:1: rule__JsonScalarType__Group_2__0__Impl : ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) ;
    public final void rule__JsonScalarType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2191:1: ( ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2192:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2192:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2193:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2194:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2194:2: rule__JsonScalarType__NumberAssignment_2_0
            {
            pushFollow(FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl4394);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2204:1: rule__JsonScalarType__Group_2__1 : rule__JsonScalarType__Group_2__1__Impl ;
    public final void rule__JsonScalarType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2208:1: ( rule__JsonScalarType__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2209:2: rule__JsonScalarType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__14424);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2215:1: rule__JsonScalarType__Group_2__1__Impl : ( ( rule__JsonScalarType__Group_2_1__0 )? ) ;
    public final void rule__JsonScalarType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2219:1: ( ( ( rule__JsonScalarType__Group_2_1__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2220:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2220:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2221:1: ( rule__JsonScalarType__Group_2_1__0 )?
            {
             before(grammarAccess.getJsonScalarTypeAccess().getGroup_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2222:1: ( rule__JsonScalarType__Group_2_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2222:2: rule__JsonScalarType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl4451);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2236:1: rule__JsonScalarType__Group_2_1__0 : rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 ;
    public final void rule__JsonScalarType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2240:1: ( rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2241:2: rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__04486);
            rule__JsonScalarType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__04489);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2248:1: rule__JsonScalarType__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__JsonScalarType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2252:1: ( ( '.' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2253:1: ( '.' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2253:1: ( '.' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2254:1: '.'
            {
             before(grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0()); 
            match(input,36,FOLLOW_36_in_rule__JsonScalarType__Group_2_1__0__Impl4517); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2267:1: rule__JsonScalarType__Group_2_1__1 : rule__JsonScalarType__Group_2_1__1__Impl ;
    public final void rule__JsonScalarType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2271:1: ( rule__JsonScalarType__Group_2_1__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2272:2: rule__JsonScalarType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__14548);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2278:1: rule__JsonScalarType__Group_2_1__1__Impl : ( RULE_INT ) ;
    public final void rule__JsonScalarType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2282:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2283:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2283:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2284:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl4575); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2299:1: rule__JsonArray__Group_0__0 : rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 ;
    public final void rule__JsonArray__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2303:1: ( rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2304:2: rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__04608);
            rule__JsonArray__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__04611);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2311:1: rule__JsonArray__Group_0__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2315:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2316:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2316:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2317:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_0__0__Impl4639); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2330:1: rule__JsonArray__Group_0__1 : rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 ;
    public final void rule__JsonArray__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2334:1: ( rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2335:2: rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__14670);
            rule__JsonArray__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__14673);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2342:1: rule__JsonArray__Group_0__1__Impl : ( ( rule__JsonArray__ElementsAssignment_0_1 ) ) ;
    public final void rule__JsonArray__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2346:1: ( ( ( rule__JsonArray__ElementsAssignment_0_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2347:1: ( ( rule__JsonArray__ElementsAssignment_0_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2347:1: ( ( rule__JsonArray__ElementsAssignment_0_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2348:1: ( rule__JsonArray__ElementsAssignment_0_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2349:1: ( rule__JsonArray__ElementsAssignment_0_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2349:2: rule__JsonArray__ElementsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementsAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl4700);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2359:1: rule__JsonArray__Group_0__2 : rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 ;
    public final void rule__JsonArray__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2363:1: ( rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2364:2: rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__24730);
            rule__JsonArray__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__24733);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2371:1: rule__JsonArray__Group_0__2__Impl : ( ( rule__JsonArray__Group_0_2__0 )* ) ;
    public final void rule__JsonArray__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2375:1: ( ( ( rule__JsonArray__Group_0_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2376:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2376:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2377:1: ( rule__JsonArray__Group_0_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_0_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2378:1: ( rule__JsonArray__Group_0_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_INT||LA18_1==RULE_STRING||(LA18_1>=RULE_JSON_LITERAL_BOOLEAN && LA18_1<=RULE_JSON_LITERAL_NULL)) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2378:2: rule__JsonArray__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl4760);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2388:1: rule__JsonArray__Group_0__3 : rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4 ;
    public final void rule__JsonArray__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2392:1: ( rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2393:2: rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__34791);
            rule__JsonArray__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__4_in_rule__JsonArray__Group_0__34794);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2400:1: rule__JsonArray__Group_0__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2404:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2405:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2405:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2406:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2407:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2408:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__JsonArray__Group_0__3__Impl4823); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2419:1: rule__JsonArray__Group_0__4 : rule__JsonArray__Group_0__4__Impl ;
    public final void rule__JsonArray__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2423:1: ( rule__JsonArray__Group_0__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2424:2: rule__JsonArray__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__4__Impl_in_rule__JsonArray__Group_0__44856);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2430:1: rule__JsonArray__Group_0__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2434:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2435:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2435:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2436:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4()); 
            match(input,35,FOLLOW_35_in_rule__JsonArray__Group_0__4__Impl4884); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2459:1: rule__JsonArray__Group_0_2__0 : rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 ;
    public final void rule__JsonArray__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2463:1: ( rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2464:2: rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__04925);
            rule__JsonArray__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__04928);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2471:1: rule__JsonArray__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2475:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2476:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2476:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2477:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0()); 
            match(input,32,FOLLOW_32_in_rule__JsonArray__Group_0_2__0__Impl4956); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2490:1: rule__JsonArray__Group_0_2__1 : rule__JsonArray__Group_0_2__1__Impl ;
    public final void rule__JsonArray__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2494:1: ( rule__JsonArray__Group_0_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2495:2: rule__JsonArray__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__14987);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2501:1: rule__JsonArray__Group_0_2__1__Impl : ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) ) ;
    public final void rule__JsonArray__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2505:1: ( ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2506:1: ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2506:1: ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2507:1: ( rule__JsonArray__ElementsAssignment_0_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2508:1: ( rule__JsonArray__ElementsAssignment_0_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2508:2: rule__JsonArray__ElementsAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementsAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl5014);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2522:1: rule__JsonArray__Group_1__0 : rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 ;
    public final void rule__JsonArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2526:1: ( rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2527:2: rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__05048);
            rule__JsonArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__05051);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2534:1: rule__JsonArray__Group_1__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2538:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2539:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2539:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2540:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_1__0__Impl5079); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2553:1: rule__JsonArray__Group_1__1 : rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 ;
    public final void rule__JsonArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2557:1: ( rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2558:2: rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__15110);
            rule__JsonArray__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__15113);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2565:1: rule__JsonArray__Group_1__1__Impl : ( ( rule__JsonArray__CompositesAssignment_1_1 ) ) ;
    public final void rule__JsonArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2569:1: ( ( ( rule__JsonArray__CompositesAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2570:1: ( ( rule__JsonArray__CompositesAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2570:1: ( ( rule__JsonArray__CompositesAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2571:1: ( rule__JsonArray__CompositesAssignment_1_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2572:1: ( rule__JsonArray__CompositesAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2572:2: rule__JsonArray__CompositesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositesAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl5140);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2582:1: rule__JsonArray__Group_1__2 : rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 ;
    public final void rule__JsonArray__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2586:1: ( rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2587:2: rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__25170);
            rule__JsonArray__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__25173);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2594:1: rule__JsonArray__Group_1__2__Impl : ( ( rule__JsonArray__Group_1_2__0 )* ) ;
    public final void rule__JsonArray__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2598:1: ( ( ( rule__JsonArray__Group_1_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2599:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2599:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2600:1: ( rule__JsonArray__Group_1_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_1_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2601:1: ( rule__JsonArray__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==34) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2601:2: rule__JsonArray__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl5200);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2611:1: rule__JsonArray__Group_1__3 : rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4 ;
    public final void rule__JsonArray__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2615:1: ( rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2616:2: rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__35231);
            rule__JsonArray__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__4_in_rule__JsonArray__Group_1__35234);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2623:1: rule__JsonArray__Group_1__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2627:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2628:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2628:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2629:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2630:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2631:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__JsonArray__Group_1__3__Impl5263); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2642:1: rule__JsonArray__Group_1__4 : rule__JsonArray__Group_1__4__Impl ;
    public final void rule__JsonArray__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2646:1: ( rule__JsonArray__Group_1__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2647:2: rule__JsonArray__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__4__Impl_in_rule__JsonArray__Group_1__45296);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2653:1: rule__JsonArray__Group_1__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2657:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2658:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2658:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2659:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,35,FOLLOW_35_in_rule__JsonArray__Group_1__4__Impl5324); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2682:1: rule__JsonArray__Group_1_2__0 : rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 ;
    public final void rule__JsonArray__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2686:1: ( rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2687:2: rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__05365);
            rule__JsonArray__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__05368);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2694:1: rule__JsonArray__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2698:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2699:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2699:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2700:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0()); 
            match(input,32,FOLLOW_32_in_rule__JsonArray__Group_1_2__0__Impl5396); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2713:1: rule__JsonArray__Group_1_2__1 : rule__JsonArray__Group_1_2__1__Impl ;
    public final void rule__JsonArray__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2717:1: ( rule__JsonArray__Group_1_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2718:2: rule__JsonArray__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__15427);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2724:1: rule__JsonArray__Group_1_2__1__Impl : ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) ) ;
    public final void rule__JsonArray__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2728:1: ( ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2729:1: ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2729:1: ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2730:1: ( rule__JsonArray__CompositesAssignment_1_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2731:1: ( rule__JsonArray__CompositesAssignment_1_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2731:2: rule__JsonArray__CompositesAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositesAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl5454);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2745:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2749:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2750:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__05488);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__05491);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2757:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2761:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2762:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2762:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2763:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__JsonObject__Group__0__Impl5519); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2776:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2780:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2781:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15550);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15553);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2788:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__Group_1__0 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2792:1: ( ( ( rule__JsonObject__Group_1__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2793:1: ( ( rule__JsonObject__Group_1__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2793:1: ( ( rule__JsonObject__Group_1__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2794:1: ( rule__JsonObject__Group_1__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2795:1: ( rule__JsonObject__Group_1__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2795:2: rule__JsonObject__Group_1__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__0_in_rule__JsonObject__Group__1__Impl5580);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2805:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2809:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2810:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25610);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25613);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2817:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 ) ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2821:1: ( ( ( rule__JsonObject__Group_2__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2822:1: ( ( rule__JsonObject__Group_2__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2822:1: ( ( rule__JsonObject__Group_2__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2823:1: ( rule__JsonObject__Group_2__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2824:1: ( rule__JsonObject__Group_2__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2824:2: rule__JsonObject__Group_2__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5640);
            rule__JsonObject__Group_2__0();

            state._fsp--;


            }

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2834:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2838:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2839:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35670);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35673);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2846:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2850:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2851:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2851:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2852:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2853:1: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2854:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__JsonObject__Group__3__Impl5702); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2865:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2869:1: ( rule__JsonObject__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2870:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45735);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2876:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2880:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2881:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2881:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2882:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__JsonObject__Group__4__Impl5763); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2905:1: rule__JsonObject__Group_1__0 : rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1 ;
    public final void rule__JsonObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2909:1: ( rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2910:2: rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__0__Impl_in_rule__JsonObject__Group_1__05804);
            rule__JsonObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_1__1_in_rule__JsonObject__Group_1__05807);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2917:1: rule__JsonObject__Group_1__0__Impl : ( ( rule__JsonObject__KeysAssignment_1_0 ) ) ;
    public final void rule__JsonObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2921:1: ( ( ( rule__JsonObject__KeysAssignment_1_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2922:1: ( ( rule__JsonObject__KeysAssignment_1_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2922:1: ( ( rule__JsonObject__KeysAssignment_1_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2923:1: ( rule__JsonObject__KeysAssignment_1_0 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeysAssignment_1_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2924:1: ( rule__JsonObject__KeysAssignment_1_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2924:2: rule__JsonObject__KeysAssignment_1_0
            {
            pushFollow(FOLLOW_rule__JsonObject__KeysAssignment_1_0_in_rule__JsonObject__Group_1__0__Impl5834);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2934:1: rule__JsonObject__Group_1__1 : rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2 ;
    public final void rule__JsonObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2938:1: ( rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2939:2: rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__1__Impl_in_rule__JsonObject__Group_1__15864);
            rule__JsonObject__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_1__2_in_rule__JsonObject__Group_1__15867);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2946:1: rule__JsonObject__Group_1__1__Impl : ( ':' ) ;
    public final void rule__JsonObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2950:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2951:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2951:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2952:1: ':'
            {
             before(grammarAccess.getJsonObjectAccess().getColonKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__JsonObject__Group_1__1__Impl5895); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2965:1: rule__JsonObject__Group_1__2 : rule__JsonObject__Group_1__2__Impl ;
    public final void rule__JsonObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2969:1: ( rule__JsonObject__Group_1__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2970:2: rule__JsonObject__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__2__Impl_in_rule__JsonObject__Group_1__25926);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2976:1: rule__JsonObject__Group_1__2__Impl : ( ( rule__JsonObject__ValuesAssignment_1_2 ) ) ;
    public final void rule__JsonObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2980:1: ( ( ( rule__JsonObject__ValuesAssignment_1_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2981:1: ( ( rule__JsonObject__ValuesAssignment_1_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2981:1: ( ( rule__JsonObject__ValuesAssignment_1_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2982:1: ( rule__JsonObject__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getJsonObjectAccess().getValuesAssignment_1_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2983:1: ( rule__JsonObject__ValuesAssignment_1_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2983:2: rule__JsonObject__ValuesAssignment_1_2
            {
            pushFollow(FOLLOW_rule__JsonObject__ValuesAssignment_1_2_in_rule__JsonObject__Group_1__2__Impl5953);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2999:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3003:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3004:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05989);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05992);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3011:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3015:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3016:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3016:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3017:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__JsonObject__Group_2__0__Impl6020); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3030:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3034:1: ( rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3035:2: rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__16051);
            rule__JsonObject__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__2_in_rule__JsonObject__Group_2__16054);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3042:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeysAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3046:1: ( ( ( rule__JsonObject__KeysAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3047:1: ( ( rule__JsonObject__KeysAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3047:1: ( ( rule__JsonObject__KeysAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3048:1: ( rule__JsonObject__KeysAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeysAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3049:1: ( rule__JsonObject__KeysAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3049:2: rule__JsonObject__KeysAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeysAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl6081);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3059:1: rule__JsonObject__Group_2__2 : rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3 ;
    public final void rule__JsonObject__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3063:1: ( rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3064:2: rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__2__Impl_in_rule__JsonObject__Group_2__26111);
            rule__JsonObject__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__3_in_rule__JsonObject__Group_2__26114);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3071:1: rule__JsonObject__Group_2__2__Impl : ( ':' ) ;
    public final void rule__JsonObject__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3075:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3076:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3076:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3077:1: ':'
            {
             before(grammarAccess.getJsonObjectAccess().getColonKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__JsonObject__Group_2__2__Impl6142); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3090:1: rule__JsonObject__Group_2__3 : rule__JsonObject__Group_2__3__Impl ;
    public final void rule__JsonObject__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3094:1: ( rule__JsonObject__Group_2__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3095:2: rule__JsonObject__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__3__Impl_in_rule__JsonObject__Group_2__36173);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3101:1: rule__JsonObject__Group_2__3__Impl : ( ( rule__JsonObject__ValuesAssignment_2_3 ) ) ;
    public final void rule__JsonObject__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3105:1: ( ( ( rule__JsonObject__ValuesAssignment_2_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3106:1: ( ( rule__JsonObject__ValuesAssignment_2_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3106:1: ( ( rule__JsonObject__ValuesAssignment_2_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3107:1: ( rule__JsonObject__ValuesAssignment_2_3 )
            {
             before(grammarAccess.getJsonObjectAccess().getValuesAssignment_2_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3108:1: ( rule__JsonObject__ValuesAssignment_2_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3108:2: rule__JsonObject__ValuesAssignment_2_3
            {
            pushFollow(FOLLOW_rule__JsonObject__ValuesAssignment_2_3_in_rule__JsonObject__Group_2__3__Impl6200);
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


    // $ANTLR start "rule__Xplatform__NameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3127:1: rule__Xplatform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Xplatform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3131:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3132:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3132:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3133:1: RULE_ID
            {
             before(grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Xplatform__NameAssignment_16243); 
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


    // $ANTLR start "rule__Xplatform__MethodAssignment_3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3142:1: rule__Xplatform__MethodAssignment_3 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__Xplatform__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3146:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3147:1: ( RULE_RESTFUL_METHODS )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3147:1: ( RULE_RESTFUL_METHODS )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3148:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__Xplatform__MethodAssignment_36274); 
             after(grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__MethodAssignment_3"


    // $ANTLR start "rule__Xplatform__UriAssignment_5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3157:1: rule__Xplatform__UriAssignment_5 : ( ruleURI ) ;
    public final void rule__Xplatform__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3161:1: ( ( ruleURI ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3162:1: ( ruleURI )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3162:1: ( ruleURI )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3163:1: ruleURI
            {
             before(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__Xplatform__UriAssignment_56305);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__UriAssignment_5"


    // $ANTLR start "rule__Xplatform__RequestHeadersAssignment_6_4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3172:1: rule__Xplatform__RequestHeadersAssignment_6_4 : ( ruleXplatformHeader ) ;
    public final void rule__Xplatform__RequestHeadersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3176:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3177:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3177:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3178:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__Xplatform__RequestHeadersAssignment_6_46336);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__RequestHeadersAssignment_6_4"


    // $ANTLR start "rule__Xplatform__ResponseHeadersAssignment_6_5_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3187:1: rule__Xplatform__ResponseHeadersAssignment_6_5_2 : ( ruleXplatformHeader ) ;
    public final void rule__Xplatform__ResponseHeadersAssignment_6_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3191:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3192:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3192:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3193:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__Xplatform__ResponseHeadersAssignment_6_5_26367);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__ResponseHeadersAssignment_6_5_2"


    // $ANTLR start "rule__Xplatform__JsonToClientAssignment_7_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3202:1: rule__Xplatform__JsonToClientAssignment_7_2 : ( ruleXplatformJson ) ;
    public final void rule__Xplatform__JsonToClientAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3206:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3207:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3207:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3208:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToClientAssignment_7_26398);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__JsonToClientAssignment_7_2"


    // $ANTLR start "rule__Xplatform__JsonToServerAssignment_7_3_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3217:1: rule__Xplatform__JsonToServerAssignment_7_3_2 : ( ruleXplatformJson ) ;
    public final void rule__Xplatform__JsonToServerAssignment_7_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3221:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3222:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3222:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3223:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToServerAssignment_7_3_26429);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__JsonToServerAssignment_7_3_2"


    // $ANTLR start "rule__URI__UriParameterAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3232:1: rule__URI__UriParameterAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__URI__UriParameterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3236:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3237:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3237:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3238:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getUriParameterIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__UriParameterAssignment_1_16460); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3247:1: rule__XplatformHeader__HeaderKeyValuesAssignment_2 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3251:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3252:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3252:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3253:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_26491);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3262:1: rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3266:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3267:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3267:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3268:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_3_16522);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3277:1: rule__XplatformHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3281:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3282:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3282:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3283:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_06553); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3292:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3296:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3297:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3297:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3298:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_06584); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3307:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 : ( RULE_XPLATFORM_HEADER_PARAMETER ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3311:1: ( ( RULE_XPLATFORM_HEADER_PARAMETER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3312:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3312:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3313:1: RULE_XPLATFORM_HEADER_PARAMETER
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
            match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_16615); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3322:1: rule__XplatformJson__TypeAssignment_0_1 : ( ruleJsonType ) ;
    public final void rule__XplatformJson__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3326:1: ( ( ruleJsonType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3327:1: ( ruleJsonType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3327:1: ( ruleJsonType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3328:1: ruleJsonType
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_16646);
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


    // $ANTLR start "rule__XplatformJson__MetaTypeAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3337:1: rule__XplatformJson__MetaTypeAssignment_1 : ( ruleJsonMetaType ) ;
    public final void rule__XplatformJson__MetaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3341:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3342:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3342:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3343:1: ruleJsonMetaType
            {
             before(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_16677);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3352:1: rule__XplatformJson__CompositeAssignment_2_0 : ( ruleJsonObject ) ;
    public final void rule__XplatformJson__CompositeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3356:1: ( ( ruleJsonObject ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3357:1: ( ruleJsonObject )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3357:1: ( ruleJsonObject )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3358:1: ruleJsonObject
            {
             before(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleJsonObject_in_rule__XplatformJson__CompositeAssignment_2_06708);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3367:1: rule__JsonMetaArray__MetaTypeAssignment_1 : ( ruleJsonMetaType ) ;
    public final void rule__JsonMetaArray__MetaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3371:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3372:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3372:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3373:1: ruleJsonMetaType
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_16739);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3382:1: rule__JsonMetaType__ScalarAssignment_0 : ( ruleJsonMetaScalarType ) ;
    public final void rule__JsonMetaType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3386:1: ( ( ruleJsonMetaScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3387:1: ( ruleJsonMetaScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3387:1: ( ruleJsonMetaScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3388:1: ruleJsonMetaScalarType
            {
             before(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_06770);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3397:1: rule__JsonMetaType__CompositeAssignment_1 : ( ruleJsonMetaArray ) ;
    public final void rule__JsonMetaType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3401:1: ( ( ruleJsonMetaArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3402:1: ( ruleJsonMetaArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3402:1: ( ruleJsonMetaArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3403:1: ruleJsonMetaArray
            {
             before(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_16801);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3412:1: rule__JsonCompositeType__CompositeAssignment : ( ruleJsonArray ) ;
    public final void rule__JsonCompositeType__CompositeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3416:1: ( ( ruleJsonArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3417:1: ( ruleJsonArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3417:1: ( ruleJsonArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3418:1: ruleJsonArray
            {
             before(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment6832);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3427:1: rule__JsonType__ScalarAssignment_0 : ( ruleJsonScalarType ) ;
    public final void rule__JsonType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3431:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3432:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3432:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3433:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_06863);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3442:1: rule__JsonType__CompositeAssignment_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3446:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3447:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3447:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3448:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_16894);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3457:1: rule__JsonScalarType__BoolAssignment_0 : ( RULE_JSON_LITERAL_BOOLEAN ) ;
    public final void rule__JsonScalarType__BoolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3461:1: ( ( RULE_JSON_LITERAL_BOOLEAN ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3462:1: ( RULE_JSON_LITERAL_BOOLEAN )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3462:1: ( RULE_JSON_LITERAL_BOOLEAN )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3463:1: RULE_JSON_LITERAL_BOOLEAN
            {
             before(grammarAccess.getJsonScalarTypeAccess().getBoolJSON_LITERAL_BOOLEANTerminalRuleCall_0_0()); 
            match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_06925); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3472:1: rule__JsonScalarType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__JsonScalarType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3476:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3477:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3477:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3478:1: RULE_STRING
            {
             before(grammarAccess.getJsonScalarTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_16956); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3487:1: rule__JsonScalarType__NumberAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__JsonScalarType__NumberAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3491:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3492:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3492:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3493:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_06987); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3502:1: rule__JsonScalarType__NullAssignment_3 : ( RULE_JSON_LITERAL_NULL ) ;
    public final void rule__JsonScalarType__NullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3506:1: ( ( RULE_JSON_LITERAL_NULL ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3507:1: ( RULE_JSON_LITERAL_NULL )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3507:1: ( RULE_JSON_LITERAL_NULL )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3508:1: RULE_JSON_LITERAL_NULL
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 
            match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_37018); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3517:1: rule__JsonArray__ElementsAssignment_0_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3521:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3522:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3522:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3523:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_17049);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3532:1: rule__JsonArray__ElementsAssignment_0_2_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3536:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3537:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3537:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3538:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_2_17080);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3547:1: rule__JsonArray__CompositesAssignment_1_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3551:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3552:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3552:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3553:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_17111);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3562:1: rule__JsonArray__CompositesAssignment_1_2_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3566:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3567:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3567:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3568:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_2_17142);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3577:1: rule__JsonObject__KeysAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__JsonObject__KeysAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3581:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3582:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3582:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3583:1: RULE_STRING
            {
             before(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_1_07173); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3592:1: rule__JsonObject__ValuesAssignment_1_2 : ( ruleXplatformJson ) ;
    public final void rule__JsonObject__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3596:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3597:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3597:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3598:1: ruleXplatformJson
            {
             before(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_1_27204);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3607:1: rule__JsonObject__KeysAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__JsonObject__KeysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3611:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3612:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3612:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3613:1: RULE_STRING
            {
             before(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_2_17235); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3622:1: rule__JsonObject__ValuesAssignment_2_3 : ( ruleXplatformJson ) ;
    public final void rule__JsonObject__ValuesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3626:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3627:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3627:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3628:1: ruleXplatformJson
            {
             before(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_2_37266);
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
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0_in_ruleJsonObject814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_in_rule__XplatformJson__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__0_in_rule__XplatformJson__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Xplatform__Group__0__Impl1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11345 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__2_in_rule__Xplatform__Group__11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__NameAssignment_1_in_rule__Xplatform__Group__1__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__2__Impl_in_rule__Xplatform__Group__21405 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__3_in_rule__Xplatform__Group__21408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Xplatform__Group__2__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__3__Impl_in_rule__Xplatform__Group__31467 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__4_in_rule__Xplatform__Group__31470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__MethodAssignment_3_in_rule__Xplatform__Group__3__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__4__Impl_in_rule__Xplatform__Group__41527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__5_in_rule__Xplatform__Group__41530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Xplatform__Group__4__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__5__Impl_in_rule__Xplatform__Group__51589 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__6_in_rule__Xplatform__Group__51592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__UriAssignment_5_in_rule__Xplatform__Group__5__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__6__Impl_in_rule__Xplatform__Group__61649 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__7_in_rule__Xplatform__Group__61652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__0_in_rule__Xplatform__Group__6__Impl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__7__Impl_in_rule__Xplatform__Group__71710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__0_in_rule__Xplatform__Group__7__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__0__Impl_in_rule__Xplatform__Group_6__01784 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__1_in_rule__Xplatform__Group_6__01787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Xplatform__Group_6__0__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__1__Impl_in_rule__Xplatform__Group_6__11846 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__2_in_rule__Xplatform__Group_6__11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Xplatform__Group_6__1__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__2__Impl_in_rule__Xplatform__Group_6__21908 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__3_in_rule__Xplatform__Group_6__21911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Xplatform__Group_6__2__Impl1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__3__Impl_in_rule__Xplatform__Group_6__31970 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__4_in_rule__Xplatform__Group_6__31973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Xplatform__Group_6__3__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__4__Impl_in_rule__Xplatform__Group_6__42032 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__5_in_rule__Xplatform__Group_6__42035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__RequestHeadersAssignment_6_4_in_rule__Xplatform__Group_6__4__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6__5__Impl_in_rule__Xplatform__Group_6__52092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_5__0_in_rule__Xplatform__Group_6__5__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_5__0__Impl_in_rule__Xplatform__Group_6_5__02162 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_5__1_in_rule__Xplatform__Group_6_5__02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Xplatform__Group_6_5__0__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_5__1__Impl_in_rule__Xplatform__Group_6_5__12224 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_5__2_in_rule__Xplatform__Group_6_5__12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Xplatform__Group_6_5__1__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_6_5__2__Impl_in_rule__Xplatform__Group_6_5__22286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__ResponseHeadersAssignment_6_5_2_in_rule__Xplatform__Group_6_5__2__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__0__Impl_in_rule__Xplatform__Group_7__02349 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__1_in_rule__Xplatform__Group_7__02352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Xplatform__Group_7__0__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__1__Impl_in_rule__Xplatform__Group_7__12411 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__2_in_rule__Xplatform__Group_7__12414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Xplatform__Group_7__1__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__2__Impl_in_rule__Xplatform__Group_7__22473 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__3_in_rule__Xplatform__Group_7__22476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__JsonToClientAssignment_7_2_in_rule__Xplatform__Group_7__2__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__3__Impl_in_rule__Xplatform__Group_7__32533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_3__0_in_rule__Xplatform__Group_7__3__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_3__0__Impl_in_rule__Xplatform__Group_7_3__02599 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_3__1_in_rule__Xplatform__Group_7_3__02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Xplatform__Group_7_3__0__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_3__1__Impl_in_rule__Xplatform__Group_7_3__12661 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_3__2_in_rule__Xplatform__Group_7_3__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Xplatform__Group_7_3__1__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_3__2__Impl_in_rule__Xplatform__Group_7_3__22723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__JsonToServerAssignment_7_3_2_in_rule__Xplatform__Group_7_3__2__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02786 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2819 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl2832 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__02927 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__02930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__URI__Group_1__0__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__12989 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__12992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__UriParameterAssignment_1_1_in_rule__URI__Group_1__1__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__URI__Group_1__2__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3139 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03178 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformHeader__Group__0__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13240 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__XplatformHeader__Group__1__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__23302 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__23305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_2_in_rule__XplatformHeader__Group__2__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__33362 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__33365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__0_in_rule__XplatformHeader__Group__3__Impl3392 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__43423 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__43426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformHeader__Group__4__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__53488 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__53491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformHeader__Group__5__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__63550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformHeader__Group__6__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__0__Impl_in_rule__XplatformHeader__Group_3__03623 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__1_in_rule__XplatformHeader__Group_3__03626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformHeader__Group_3__0__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__1__Impl_in_rule__XplatformHeader__Group_3__13685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_1_in_rule__XplatformHeader__Group_3__1__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__03746 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__03749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__13806 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__23868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__03931 = new BitSet(new long[]{0x0000000400000D20L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__03934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformJson__Group_0__0__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__TypeAssignment_0_1_in_rule__XplatformJson__Group_0__1__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__0__Impl_in_rule__XplatformJson__Group_2__04054 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__1_in_rule__XplatformJson__Group_2__04057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__CompositeAssignment_2_0_in_rule__XplatformJson__Group_2__0__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__1__Impl_in_rule__XplatformJson__Group_2__14114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformJson__Group_2__1__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__04177 = new BitSet(new long[]{0x0000000400038000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__04180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonMetaArray__Group__0__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__14239 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__14242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__24299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonMetaArray__Group__2__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__04364 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__04367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__14424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__04486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__04489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonScalarType__Group_2_1__0__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__04608 = new BitSet(new long[]{0x0000000000000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__04611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_0__0__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__14670 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__14673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementsAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__24730 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__24733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl4760 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__34791 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__4_in_rule__JsonArray__Group_0__34794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_0__3__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__4__Impl_in_rule__JsonArray__Group_0__44856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group_0__4__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__04925 = new BitSet(new long[]{0x0000000000000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__04928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_0_2__0__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__14987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementsAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__05048 = new BitSet(new long[]{0x0000000400000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__05051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_1__0__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__15110 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositesAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__25170 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__25173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl5200 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__35231 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__4_in_rule__JsonArray__Group_1__35234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_1__3__Impl5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__4__Impl_in_rule__JsonArray__Group_1__45296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group_1__4__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__05365 = new BitSet(new long[]{0x0000000400000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__05368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_1_2__0__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__15427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositesAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__05488 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__05491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__JsonObject__Group__0__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__15550 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__15553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__0_in_rule__JsonObject__Group__1__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__25610 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__25613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__35670 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__35673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonObject__Group__3__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__45735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__JsonObject__Group__4__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__0__Impl_in_rule__JsonObject__Group_1__05804 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__1_in_rule__JsonObject__Group_1__05807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeysAssignment_1_0_in_rule__JsonObject__Group_1__0__Impl5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__1__Impl_in_rule__JsonObject__Group_1__15864 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__2_in_rule__JsonObject__Group_1__15867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JsonObject__Group_1__1__Impl5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__2__Impl_in_rule__JsonObject__Group_1__25926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__ValuesAssignment_1_2_in_rule__JsonObject__Group_1__2__Impl5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__05989 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__05992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonObject__Group_2__0__Impl6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__16051 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__2_in_rule__JsonObject__Group_2__16054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeysAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__2__Impl_in_rule__JsonObject__Group_2__26111 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__3_in_rule__JsonObject__Group_2__26114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JsonObject__Group_2__2__Impl6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__3__Impl_in_rule__JsonObject__Group_2__36173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__ValuesAssignment_2_3_in_rule__JsonObject__Group_2__3__Impl6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Xplatform__NameAssignment_16243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__Xplatform__MethodAssignment_36274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Xplatform__UriAssignment_56305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__Xplatform__RequestHeadersAssignment_6_46336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__Xplatform__ResponseHeadersAssignment_6_5_26367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToClientAssignment_7_26398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToServerAssignment_7_3_26429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__UriParameterAssignment_1_16460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_26491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_3_16522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_06553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_06584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_16615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_16646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_16677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__XplatformJson__CompositeAssignment_2_06708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_16739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_06770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_16801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_06863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_16894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_06925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_16956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_06987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_37018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_17049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_2_17080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_17111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_2_17142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_1_07173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_1_27204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_2_17235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_2_37266 = new BitSet(new long[]{0x0000000000000002L});

}