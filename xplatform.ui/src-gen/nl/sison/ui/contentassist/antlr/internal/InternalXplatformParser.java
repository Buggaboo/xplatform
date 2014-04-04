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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_INT", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_STRING", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'boolean'", "'number'", "'string'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'{'", "'}'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'.'", "'platform'", "'enum'", "'map'"
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
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=11;
    public static final int T__38=38;
    public static final int T__39=39;
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


    // $ANTLR start "entryRuleXplatformResource"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:424:1: entryRuleXplatformResource : ruleXplatformResource EOF ;
    public final void entryRuleXplatformResource() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:425:1: ( ruleXplatformResource EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:426:1: ruleXplatformResource EOF
            {
             before(grammarAccess.getXplatformResourceRule()); 
            pushFollow(FOLLOW_ruleXplatformResource_in_entryRuleXplatformResource841);
            ruleXplatformResource();

            state._fsp--;

             after(grammarAccess.getXplatformResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformResource848); 

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
    // $ANTLR end "entryRuleXplatformResource"


    // $ANTLR start "ruleXplatformResource"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:433:1: ruleXplatformResource : ( ( rule__XplatformResource__Group__0 ) ) ;
    public final void ruleXplatformResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:437:2: ( ( ( rule__XplatformResource__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__XplatformResource__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:438:1: ( ( rule__XplatformResource__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:439:1: ( rule__XplatformResource__Group__0 )
            {
             before(grammarAccess.getXplatformResourceAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:1: ( rule__XplatformResource__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:440:2: rule__XplatformResource__Group__0
            {
            pushFollow(FOLLOW_rule__XplatformResource__Group__0_in_ruleXplatformResource874);
            rule__XplatformResource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXplatformResource"


    // $ANTLR start "entryRulePlatform"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:452:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:453:1: ( rulePlatform EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:454:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform901);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform908); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:461:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:465:2: ( ( ( rule__Platform__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:466:1: ( ( rule__Platform__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:466:1: ( ( rule__Platform__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:467:1: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:468:1: ( rule__Platform__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:468:2: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_rule__Platform__Group__0_in_rulePlatform934);
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


    // $ANTLR start "entryRuleType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:480:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:481:1: ( ruleType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:482:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType961);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType968); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:489:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:493:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:494:1: ( ( rule__Type__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:494:1: ( ( rule__Type__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:495:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:496:1: ( rule__Type__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:496:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType994);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnumInstance"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:508:1: entryRuleEnumInstance : ruleEnumInstance EOF ;
    public final void entryRuleEnumInstance() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:509:1: ( ruleEnumInstance EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:510:1: ruleEnumInstance EOF
            {
             before(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance1021);
            ruleEnumInstance();

            state._fsp--;

             after(grammarAccess.getEnumInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance1028); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:517:1: ruleEnumInstance : ( ( rule__EnumInstance__Group__0 ) ) ;
    public final void ruleEnumInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:521:2: ( ( ( rule__EnumInstance__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:522:1: ( ( rule__EnumInstance__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:522:1: ( ( rule__EnumInstance__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:523:1: ( rule__EnumInstance__Group__0 )
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:524:1: ( rule__EnumInstance__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:524:2: rule__EnumInstance__Group__0
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance1054);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:536:1: entryRuleMapInstance : ruleMapInstance EOF ;
    public final void entryRuleMapInstance() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:537:1: ( ruleMapInstance EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:538:1: ruleMapInstance EOF
            {
             before(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance1081);
            ruleMapInstance();

            state._fsp--;

             after(grammarAccess.getMapInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance1088); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:545:1: ruleMapInstance : ( ( rule__MapInstance__Group__0 ) ) ;
    public final void ruleMapInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:549:2: ( ( ( rule__MapInstance__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:550:1: ( ( rule__MapInstance__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:550:1: ( ( rule__MapInstance__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:551:1: ( rule__MapInstance__Group__0 )
            {
             before(grammarAccess.getMapInstanceAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:552:1: ( rule__MapInstance__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:552:2: rule__MapInstance__Group__0
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance1114);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:564:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:565:1: ( ruleStringList EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:566:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList1141);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList1148); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:573:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:577:2: ( ( ( rule__StringList__Group__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:578:1: ( ( rule__StringList__Group__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:578:1: ( ( rule__StringList__Group__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:579:1: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:580:1: ( rule__StringList__Group__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:580:2: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_rule__StringList__Group__0_in_ruleStringList1174);
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


    // $ANTLR start "entryRuleValueType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:594:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:595:1: ( ruleValueType EOF )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:596:1: ruleValueType EOF
            {
             before(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_ruleValueType_in_entryRuleValueType1203);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getValueTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueType1210); 

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
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:603:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:607:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:608:1: ( ( rule__ValueType__Alternatives ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:608:1: ( ( rule__ValueType__Alternatives ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:609:1: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:610:1: ( rule__ValueType__Alternatives )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:610:2: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueType__Alternatives_in_ruleValueType1236);
            rule__ValueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "rule__XplatformHeaderKeyValuePair__Alternatives_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:622:1: rule__XplatformHeaderKeyValuePair__Alternatives_2 : ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) );
    public final void rule__XplatformHeaderKeyValuePair__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:626:1: ( ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) ) | ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:627:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:627:1: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:628:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:629:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:629:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_21272);
                    rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:633:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:633:6: ( ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:634:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueAssignment_2_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:635:1: ( rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:635:2: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_21290);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:644:1: rule__XplatformJson__Alternatives : ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__MetaTypeAssignment_1 ) ) | ( ( rule__XplatformJson__Group_2__0 ) ) );
    public final void rule__XplatformJson__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:648:1: ( ( ( rule__XplatformJson__Group_0__0 ) ) | ( ( rule__XplatformJson__MetaTypeAssignment_1 ) ) | ( ( rule__XplatformJson__Group_2__0 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:649:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:649:1: ( ( rule__XplatformJson__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:650:1: ( rule__XplatformJson__Group_0__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:651:1: ( rule__XplatformJson__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:651:2: rule__XplatformJson__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives1323);
                    rule__XplatformJson__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:655:6: ( ( rule__XplatformJson__MetaTypeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:655:6: ( ( rule__XplatformJson__MetaTypeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:656:1: ( rule__XplatformJson__MetaTypeAssignment_1 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:657:1: ( rule__XplatformJson__MetaTypeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:657:2: rule__XplatformJson__MetaTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_in_rule__XplatformJson__Alternatives1341);
                    rule__XplatformJson__MetaTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXplatformJsonAccess().getMetaTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:661:6: ( ( rule__XplatformJson__Group_2__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:661:6: ( ( rule__XplatformJson__Group_2__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:662:1: ( rule__XplatformJson__Group_2__0 )
                    {
                     before(grammarAccess.getXplatformJsonAccess().getGroup_2()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:663:1: ( rule__XplatformJson__Group_2__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:663:2: rule__XplatformJson__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__XplatformJson__Group_2__0_in_rule__XplatformJson__Alternatives1359);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:672:1: rule__JsonMetaScalarType__Alternatives : ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) );
    public final void rule__JsonMetaScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:676:1: ( ( 'boolean' ) | ( 'number' ) | ( 'string' ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:677:1: ( 'boolean' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:677:1: ( 'boolean' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:678:1: 'boolean'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives1393); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:685:6: ( 'number' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:685:6: ( 'number' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:686:1: 'number'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives1413); 
                     after(grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:693:6: ( 'string' )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:693:6: ( 'string' )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:694:1: 'string'
                    {
                     before(grammarAccess.getJsonMetaScalarTypeAccess().getStringKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1433); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:706:1: rule__JsonMetaType__Alternatives : ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) );
    public final void rule__JsonMetaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:710:1: ( ( ( rule__JsonMetaType__ScalarAssignment_0 ) ) | ( ( rule__JsonMetaType__CompositeAssignment_1 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:711:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:711:1: ( ( rule__JsonMetaType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:712:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:713:1: ( rule__JsonMetaType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:713:2: rule__JsonMetaType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1467);
                    rule__JsonMetaType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonMetaTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:717:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:717:6: ( ( rule__JsonMetaType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:718:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonMetaTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:719:1: ( rule__JsonMetaType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:719:2: rule__JsonMetaType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1485);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:728:1: rule__JsonType__Alternatives : ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) );
    public final void rule__JsonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:732:1: ( ( ( rule__JsonType__ScalarAssignment_0 ) ) | ( ( rule__JsonType__CompositeAssignment_1 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:733:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:733:1: ( ( rule__JsonType__ScalarAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:734:1: ( rule__JsonType__ScalarAssignment_0 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:735:1: ( rule__JsonType__ScalarAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:735:2: rule__JsonType__ScalarAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1518);
                    rule__JsonType__ScalarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonTypeAccess().getScalarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:739:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:739:6: ( ( rule__JsonType__CompositeAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:740:1: ( rule__JsonType__CompositeAssignment_1 )
                    {
                     before(grammarAccess.getJsonTypeAccess().getCompositeAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:741:1: ( rule__JsonType__CompositeAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:741:2: rule__JsonType__CompositeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1536);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:750:1: rule__JsonScalarType__Alternatives : ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) );
    public final void rule__JsonScalarType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:754:1: ( ( ( rule__JsonScalarType__BoolAssignment_0 ) ) | ( ( rule__JsonScalarType__StringAssignment_1 ) ) | ( ( rule__JsonScalarType__Group_2__0 ) ) | ( ( rule__JsonScalarType__NullAssignment_3 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:755:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:755:1: ( ( rule__JsonScalarType__BoolAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:756:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:757:1: ( rule__JsonScalarType__BoolAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:757:2: rule__JsonScalarType__BoolAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1569);
                    rule__JsonScalarType__BoolAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getBoolAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:761:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:761:6: ( ( rule__JsonScalarType__StringAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:762:1: ( rule__JsonScalarType__StringAssignment_1 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:763:1: ( rule__JsonScalarType__StringAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:763:2: rule__JsonScalarType__StringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1587);
                    rule__JsonScalarType__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:767:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:767:6: ( ( rule__JsonScalarType__Group_2__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:768:1: ( rule__JsonScalarType__Group_2__0 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:769:1: ( rule__JsonScalarType__Group_2__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:769:2: rule__JsonScalarType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1605);
                    rule__JsonScalarType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonScalarTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:773:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:773:6: ( ( rule__JsonScalarType__NullAssignment_3 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:774:1: ( rule__JsonScalarType__NullAssignment_3 )
                    {
                     before(grammarAccess.getJsonScalarTypeAccess().getNullAssignment_3()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:775:1: ( rule__JsonScalarType__NullAssignment_3 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:775:2: rule__JsonScalarType__NullAssignment_3
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1623);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:784:1: rule__JsonArray__Alternatives : ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) );
    public final void rule__JsonArray__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:788:1: ( ( ( rule__JsonArray__Group_0__0 ) ) | ( ( rule__JsonArray__Group_1__0 ) ) )
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
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:789:1: ( ( rule__JsonArray__Group_0__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:789:1: ( ( rule__JsonArray__Group_0__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:790:1: ( rule__JsonArray__Group_0__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:791:1: ( rule__JsonArray__Group_0__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:791:2: rule__JsonArray__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1656);
                    rule__JsonArray__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonArrayAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:795:6: ( ( rule__JsonArray__Group_1__0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:795:6: ( ( rule__JsonArray__Group_1__0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:796:1: ( rule__JsonArray__Group_1__0 )
                    {
                     before(grammarAccess.getJsonArrayAccess().getGroup_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:797:1: ( rule__JsonArray__Group_1__0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:797:2: rule__JsonArray__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1674);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:806:1: rule__Type__Alternatives : ( ( ruleMapInstance ) | ( ruleEnumInstance ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:810:1: ( ( ruleMapInstance ) | ( ruleEnumInstance ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:811:1: ( ruleMapInstance )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:811:1: ( ruleMapInstance )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:812:1: ruleMapInstance
                    {
                     before(grammarAccess.getTypeAccess().getMapInstanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMapInstance_in_rule__Type__Alternatives1707);
                    ruleMapInstance();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMapInstanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:817:6: ( ruleEnumInstance )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:817:6: ( ruleEnumInstance )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:818:1: ruleEnumInstance
                    {
                     before(grammarAccess.getTypeAccess().getEnumInstanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumInstance_in_rule__Type__Alternatives1724);
                    ruleEnumInstance();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumInstanceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ValueType__Alternatives"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:828:1: rule__ValueType__Alternatives : ( ( ( rule__ValueType__StringAssignment_0 ) ) | ( ( rule__ValueType__StringListAssignment_1 ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:832:1: ( ( ( rule__ValueType__StringAssignment_0 ) ) | ( ( rule__ValueType__StringListAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:833:1: ( ( rule__ValueType__StringAssignment_0 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:833:1: ( ( rule__ValueType__StringAssignment_0 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:834:1: ( rule__ValueType__StringAssignment_0 )
                    {
                     before(grammarAccess.getValueTypeAccess().getStringAssignment_0()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:835:1: ( rule__ValueType__StringAssignment_0 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:835:2: rule__ValueType__StringAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ValueType__StringAssignment_0_in_rule__ValueType__Alternatives1756);
                    rule__ValueType__StringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueTypeAccess().getStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:839:6: ( ( rule__ValueType__StringListAssignment_1 ) )
                    {
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:839:6: ( ( rule__ValueType__StringListAssignment_1 ) )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:840:1: ( rule__ValueType__StringListAssignment_1 )
                    {
                     before(grammarAccess.getValueTypeAccess().getStringListAssignment_1()); 
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:841:1: ( rule__ValueType__StringListAssignment_1 )
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:841:2: rule__ValueType__StringListAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ValueType__StringListAssignment_1_in_rule__ValueType__Alternatives1774);
                    rule__ValueType__StringListAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueTypeAccess().getStringListAssignment_1()); 

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
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__Xplatform__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:852:1: rule__Xplatform__Group__0 : rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 ;
    public final void rule__Xplatform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:856:1: ( rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:857:2: rule__Xplatform__Group__0__Impl rule__Xplatform__Group__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01805);
            rule__Xplatform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01808);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:864:1: rule__Xplatform__Group__0__Impl : ( ( rule__Xplatform__ResourceAssignment_0 ) ) ;
    public final void rule__Xplatform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:868:1: ( ( ( rule__Xplatform__ResourceAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:869:1: ( ( rule__Xplatform__ResourceAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:869:1: ( ( rule__Xplatform__ResourceAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:870:1: ( rule__Xplatform__ResourceAssignment_0 )
            {
             before(grammarAccess.getXplatformAccess().getResourceAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:871:1: ( rule__Xplatform__ResourceAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:871:2: rule__Xplatform__ResourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Xplatform__ResourceAssignment_0_in_rule__Xplatform__Group__0__Impl1835);
            rule__Xplatform__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getResourceAssignment_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:881:1: rule__Xplatform__Group__1 : rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2 ;
    public final void rule__Xplatform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:885:1: ( rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:886:2: rule__Xplatform__Group__1__Impl rule__Xplatform__Group__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11865);
            rule__Xplatform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__2_in_rule__Xplatform__Group__11868);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:893:1: rule__Xplatform__Group__1__Impl : ( 'call' ) ;
    public final void rule__Xplatform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:897:1: ( ( 'call' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:898:1: ( 'call' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:898:1: ( 'call' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:899:1: 'call'
            {
             before(grammarAccess.getXplatformAccess().getCallKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Xplatform__Group__1__Impl1896); 
             after(grammarAccess.getXplatformAccess().getCallKeyword_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:912:1: rule__Xplatform__Group__2 : rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3 ;
    public final void rule__Xplatform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:916:1: ( rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:917:2: rule__Xplatform__Group__2__Impl rule__Xplatform__Group__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__2__Impl_in_rule__Xplatform__Group__21927);
            rule__Xplatform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__3_in_rule__Xplatform__Group__21930);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:924:1: rule__Xplatform__Group__2__Impl : ( ( rule__Xplatform__NameAssignment_2 ) ) ;
    public final void rule__Xplatform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:928:1: ( ( ( rule__Xplatform__NameAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:929:1: ( ( rule__Xplatform__NameAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:929:1: ( ( rule__Xplatform__NameAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:930:1: ( rule__Xplatform__NameAssignment_2 )
            {
             before(grammarAccess.getXplatformAccess().getNameAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:931:1: ( rule__Xplatform__NameAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:931:2: rule__Xplatform__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Xplatform__NameAssignment_2_in_rule__Xplatform__Group__2__Impl1957);
            rule__Xplatform__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:941:1: rule__Xplatform__Group__3 : rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4 ;
    public final void rule__Xplatform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:945:1: ( rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:946:2: rule__Xplatform__Group__3__Impl rule__Xplatform__Group__4
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__3__Impl_in_rule__Xplatform__Group__31987);
            rule__Xplatform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__4_in_rule__Xplatform__Group__31990);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:953:1: rule__Xplatform__Group__3__Impl : ( ':' ) ;
    public final void rule__Xplatform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:957:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:958:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:958:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:959:1: ':'
            {
             before(grammarAccess.getXplatformAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Xplatform__Group__3__Impl2018); 
             after(grammarAccess.getXplatformAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:972:1: rule__Xplatform__Group__4 : rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5 ;
    public final void rule__Xplatform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:976:1: ( rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:977:2: rule__Xplatform__Group__4__Impl rule__Xplatform__Group__5
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__4__Impl_in_rule__Xplatform__Group__42049);
            rule__Xplatform__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__5_in_rule__Xplatform__Group__42052);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:984:1: rule__Xplatform__Group__4__Impl : ( ( rule__Xplatform__MethodAssignment_4 ) ) ;
    public final void rule__Xplatform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:988:1: ( ( ( rule__Xplatform__MethodAssignment_4 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:989:1: ( ( rule__Xplatform__MethodAssignment_4 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:989:1: ( ( rule__Xplatform__MethodAssignment_4 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:990:1: ( rule__Xplatform__MethodAssignment_4 )
            {
             before(grammarAccess.getXplatformAccess().getMethodAssignment_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:991:1: ( rule__Xplatform__MethodAssignment_4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:991:2: rule__Xplatform__MethodAssignment_4
            {
            pushFollow(FOLLOW_rule__Xplatform__MethodAssignment_4_in_rule__Xplatform__Group__4__Impl2079);
            rule__Xplatform__MethodAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getMethodAssignment_4()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1001:1: rule__Xplatform__Group__5 : rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6 ;
    public final void rule__Xplatform__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1005:1: ( rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1006:2: rule__Xplatform__Group__5__Impl rule__Xplatform__Group__6
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__5__Impl_in_rule__Xplatform__Group__52109);
            rule__Xplatform__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__6_in_rule__Xplatform__Group__52112);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1013:1: rule__Xplatform__Group__5__Impl : ( 'from' ) ;
    public final void rule__Xplatform__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1017:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1018:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1018:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1019:1: 'from'
            {
             before(grammarAccess.getXplatformAccess().getFromKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Xplatform__Group__5__Impl2140); 
             after(grammarAccess.getXplatformAccess().getFromKeyword_5()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1032:1: rule__Xplatform__Group__6 : rule__Xplatform__Group__6__Impl rule__Xplatform__Group__7 ;
    public final void rule__Xplatform__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1036:1: ( rule__Xplatform__Group__6__Impl rule__Xplatform__Group__7 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1037:2: rule__Xplatform__Group__6__Impl rule__Xplatform__Group__7
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__6__Impl_in_rule__Xplatform__Group__62171);
            rule__Xplatform__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__7_in_rule__Xplatform__Group__62174);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1044:1: rule__Xplatform__Group__6__Impl : ( ( rule__Xplatform__UriAssignment_6 ) ) ;
    public final void rule__Xplatform__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1048:1: ( ( ( rule__Xplatform__UriAssignment_6 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1049:1: ( ( rule__Xplatform__UriAssignment_6 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1049:1: ( ( rule__Xplatform__UriAssignment_6 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1050:1: ( rule__Xplatform__UriAssignment_6 )
            {
             before(grammarAccess.getXplatformAccess().getUriAssignment_6()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1051:1: ( rule__Xplatform__UriAssignment_6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1051:2: rule__Xplatform__UriAssignment_6
            {
            pushFollow(FOLLOW_rule__Xplatform__UriAssignment_6_in_rule__Xplatform__Group__6__Impl2201);
            rule__Xplatform__UriAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getUriAssignment_6()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1061:1: rule__Xplatform__Group__7 : rule__Xplatform__Group__7__Impl rule__Xplatform__Group__8 ;
    public final void rule__Xplatform__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1065:1: ( rule__Xplatform__Group__7__Impl rule__Xplatform__Group__8 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1066:2: rule__Xplatform__Group__7__Impl rule__Xplatform__Group__8
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__7__Impl_in_rule__Xplatform__Group__72231);
            rule__Xplatform__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group__8_in_rule__Xplatform__Group__72234);
            rule__Xplatform__Group__8();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1073:1: rule__Xplatform__Group__7__Impl : ( ( rule__Xplatform__Group_7__0 )? ) ;
    public final void rule__Xplatform__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1077:1: ( ( ( rule__Xplatform__Group_7__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1078:1: ( ( rule__Xplatform__Group_7__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1078:1: ( ( rule__Xplatform__Group_7__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1079:1: ( rule__Xplatform__Group_7__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_7()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1080:1: ( rule__Xplatform__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1080:2: rule__Xplatform__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_7__0_in_rule__Xplatform__Group__7__Impl2261);
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


    // $ANTLR start "rule__Xplatform__Group__8"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1090:1: rule__Xplatform__Group__8 : rule__Xplatform__Group__8__Impl ;
    public final void rule__Xplatform__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1094:1: ( rule__Xplatform__Group__8__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1095:2: rule__Xplatform__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group__8__Impl_in_rule__Xplatform__Group__82292);
            rule__Xplatform__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__8"


    // $ANTLR start "rule__Xplatform__Group__8__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1101:1: rule__Xplatform__Group__8__Impl : ( ( rule__Xplatform__Group_8__0 )? ) ;
    public final void rule__Xplatform__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1105:1: ( ( ( rule__Xplatform__Group_8__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1106:1: ( ( rule__Xplatform__Group_8__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1106:1: ( ( rule__Xplatform__Group_8__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1107:1: ( rule__Xplatform__Group_8__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_8()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1108:1: ( rule__Xplatform__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1108:2: rule__Xplatform__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_8__0_in_rule__Xplatform__Group__8__Impl2319);
                    rule__Xplatform__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group__8__Impl"


    // $ANTLR start "rule__Xplatform__Group_7__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1136:1: rule__Xplatform__Group_7__0 : rule__Xplatform__Group_7__0__Impl rule__Xplatform__Group_7__1 ;
    public final void rule__Xplatform__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1140:1: ( rule__Xplatform__Group_7__0__Impl rule__Xplatform__Group_7__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1141:2: rule__Xplatform__Group_7__0__Impl rule__Xplatform__Group_7__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__0__Impl_in_rule__Xplatform__Group_7__02368);
            rule__Xplatform__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__1_in_rule__Xplatform__Group_7__02371);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1148:1: rule__Xplatform__Group_7__0__Impl : ( 'with' ) ;
    public final void rule__Xplatform__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1152:1: ( ( 'with' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1153:1: ( 'with' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1153:1: ( 'with' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1154:1: 'with'
            {
             before(grammarAccess.getXplatformAccess().getWithKeyword_7_0()); 
            match(input,21,FOLLOW_21_in_rule__Xplatform__Group_7__0__Impl2399); 
             after(grammarAccess.getXplatformAccess().getWithKeyword_7_0()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1167:1: rule__Xplatform__Group_7__1 : rule__Xplatform__Group_7__1__Impl rule__Xplatform__Group_7__2 ;
    public final void rule__Xplatform__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1171:1: ( rule__Xplatform__Group_7__1__Impl rule__Xplatform__Group_7__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1172:2: rule__Xplatform__Group_7__1__Impl rule__Xplatform__Group_7__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__1__Impl_in_rule__Xplatform__Group_7__12430);
            rule__Xplatform__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__2_in_rule__Xplatform__Group_7__12433);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1179:1: rule__Xplatform__Group_7__1__Impl : ( 'headers' ) ;
    public final void rule__Xplatform__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1183:1: ( ( 'headers' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1184:1: ( 'headers' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1184:1: ( 'headers' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1185:1: 'headers'
            {
             before(grammarAccess.getXplatformAccess().getHeadersKeyword_7_1()); 
            match(input,22,FOLLOW_22_in_rule__Xplatform__Group_7__1__Impl2461); 
             after(grammarAccess.getXplatformAccess().getHeadersKeyword_7_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1198:1: rule__Xplatform__Group_7__2 : rule__Xplatform__Group_7__2__Impl rule__Xplatform__Group_7__3 ;
    public final void rule__Xplatform__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1202:1: ( rule__Xplatform__Group_7__2__Impl rule__Xplatform__Group_7__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1203:2: rule__Xplatform__Group_7__2__Impl rule__Xplatform__Group_7__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__2__Impl_in_rule__Xplatform__Group_7__22492);
            rule__Xplatform__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__3_in_rule__Xplatform__Group_7__22495);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1210:1: rule__Xplatform__Group_7__2__Impl : ( 'from' ) ;
    public final void rule__Xplatform__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1214:1: ( ( 'from' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1215:1: ( 'from' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1215:1: ( 'from' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1216:1: 'from'
            {
             before(grammarAccess.getXplatformAccess().getFromKeyword_7_2()); 
            match(input,20,FOLLOW_20_in_rule__Xplatform__Group_7__2__Impl2523); 
             after(grammarAccess.getXplatformAccess().getFromKeyword_7_2()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1229:1: rule__Xplatform__Group_7__3 : rule__Xplatform__Group_7__3__Impl rule__Xplatform__Group_7__4 ;
    public final void rule__Xplatform__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1233:1: ( rule__Xplatform__Group_7__3__Impl rule__Xplatform__Group_7__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1234:2: rule__Xplatform__Group_7__3__Impl rule__Xplatform__Group_7__4
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__3__Impl_in_rule__Xplatform__Group_7__32554);
            rule__Xplatform__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__4_in_rule__Xplatform__Group_7__32557);
            rule__Xplatform__Group_7__4();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1241:1: rule__Xplatform__Group_7__3__Impl : ( 'request' ) ;
    public final void rule__Xplatform__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1245:1: ( ( 'request' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1246:1: ( 'request' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1246:1: ( 'request' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1247:1: 'request'
            {
             before(grammarAccess.getXplatformAccess().getRequestKeyword_7_3()); 
            match(input,23,FOLLOW_23_in_rule__Xplatform__Group_7__3__Impl2585); 
             after(grammarAccess.getXplatformAccess().getRequestKeyword_7_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Xplatform__Group_7__4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1260:1: rule__Xplatform__Group_7__4 : rule__Xplatform__Group_7__4__Impl rule__Xplatform__Group_7__5 ;
    public final void rule__Xplatform__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1264:1: ( rule__Xplatform__Group_7__4__Impl rule__Xplatform__Group_7__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1265:2: rule__Xplatform__Group_7__4__Impl rule__Xplatform__Group_7__5
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__4__Impl_in_rule__Xplatform__Group_7__42616);
            rule__Xplatform__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7__5_in_rule__Xplatform__Group_7__42619);
            rule__Xplatform__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__4"


    // $ANTLR start "rule__Xplatform__Group_7__4__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1272:1: rule__Xplatform__Group_7__4__Impl : ( ( rule__Xplatform__RequestHeadersAssignment_7_4 ) ) ;
    public final void rule__Xplatform__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1276:1: ( ( ( rule__Xplatform__RequestHeadersAssignment_7_4 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1277:1: ( ( rule__Xplatform__RequestHeadersAssignment_7_4 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1277:1: ( ( rule__Xplatform__RequestHeadersAssignment_7_4 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1278:1: ( rule__Xplatform__RequestHeadersAssignment_7_4 )
            {
             before(grammarAccess.getXplatformAccess().getRequestHeadersAssignment_7_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1279:1: ( rule__Xplatform__RequestHeadersAssignment_7_4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1279:2: rule__Xplatform__RequestHeadersAssignment_7_4
            {
            pushFollow(FOLLOW_rule__Xplatform__RequestHeadersAssignment_7_4_in_rule__Xplatform__Group_7__4__Impl2646);
            rule__Xplatform__RequestHeadersAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getRequestHeadersAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__4__Impl"


    // $ANTLR start "rule__Xplatform__Group_7__5"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1289:1: rule__Xplatform__Group_7__5 : rule__Xplatform__Group_7__5__Impl ;
    public final void rule__Xplatform__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1293:1: ( rule__Xplatform__Group_7__5__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1294:2: rule__Xplatform__Group_7__5__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7__5__Impl_in_rule__Xplatform__Group_7__52676);
            rule__Xplatform__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__5"


    // $ANTLR start "rule__Xplatform__Group_7__5__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1300:1: rule__Xplatform__Group_7__5__Impl : ( ( rule__Xplatform__Group_7_5__0 )? ) ;
    public final void rule__Xplatform__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1304:1: ( ( ( rule__Xplatform__Group_7_5__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1305:1: ( ( rule__Xplatform__Group_7_5__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1305:1: ( ( rule__Xplatform__Group_7_5__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1306:1: ( rule__Xplatform__Group_7_5__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_7_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1307:1: ( rule__Xplatform__Group_7_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1307:2: rule__Xplatform__Group_7_5__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_7_5__0_in_rule__Xplatform__Group_7__5__Impl2703);
                    rule__Xplatform__Group_7_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7__5__Impl"


    // $ANTLR start "rule__Xplatform__Group_7_5__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1329:1: rule__Xplatform__Group_7_5__0 : rule__Xplatform__Group_7_5__0__Impl rule__Xplatform__Group_7_5__1 ;
    public final void rule__Xplatform__Group_7_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1333:1: ( rule__Xplatform__Group_7_5__0__Impl rule__Xplatform__Group_7_5__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1334:2: rule__Xplatform__Group_7_5__0__Impl rule__Xplatform__Group_7_5__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7_5__0__Impl_in_rule__Xplatform__Group_7_5__02746);
            rule__Xplatform__Group_7_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7_5__1_in_rule__Xplatform__Group_7_5__02749);
            rule__Xplatform__Group_7_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_5__0"


    // $ANTLR start "rule__Xplatform__Group_7_5__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1341:1: rule__Xplatform__Group_7_5__0__Impl : ( 'and' ) ;
    public final void rule__Xplatform__Group_7_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1345:1: ( ( 'and' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1346:1: ( 'and' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1346:1: ( 'and' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1347:1: 'and'
            {
             before(grammarAccess.getXplatformAccess().getAndKeyword_7_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Xplatform__Group_7_5__0__Impl2777); 
             after(grammarAccess.getXplatformAccess().getAndKeyword_7_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_5__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_7_5__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1360:1: rule__Xplatform__Group_7_5__1 : rule__Xplatform__Group_7_5__1__Impl rule__Xplatform__Group_7_5__2 ;
    public final void rule__Xplatform__Group_7_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1364:1: ( rule__Xplatform__Group_7_5__1__Impl rule__Xplatform__Group_7_5__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1365:2: rule__Xplatform__Group_7_5__1__Impl rule__Xplatform__Group_7_5__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7_5__1__Impl_in_rule__Xplatform__Group_7_5__12808);
            rule__Xplatform__Group_7_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_7_5__2_in_rule__Xplatform__Group_7_5__12811);
            rule__Xplatform__Group_7_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_5__1"


    // $ANTLR start "rule__Xplatform__Group_7_5__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1372:1: rule__Xplatform__Group_7_5__1__Impl : ( 'response' ) ;
    public final void rule__Xplatform__Group_7_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1376:1: ( ( 'response' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1377:1: ( 'response' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1377:1: ( 'response' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1378:1: 'response'
            {
             before(grammarAccess.getXplatformAccess().getResponseKeyword_7_5_1()); 
            match(input,25,FOLLOW_25_in_rule__Xplatform__Group_7_5__1__Impl2839); 
             after(grammarAccess.getXplatformAccess().getResponseKeyword_7_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_5__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_7_5__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1391:1: rule__Xplatform__Group_7_5__2 : rule__Xplatform__Group_7_5__2__Impl ;
    public final void rule__Xplatform__Group_7_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1395:1: ( rule__Xplatform__Group_7_5__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1396:2: rule__Xplatform__Group_7_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_7_5__2__Impl_in_rule__Xplatform__Group_7_5__22870);
            rule__Xplatform__Group_7_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_5__2"


    // $ANTLR start "rule__Xplatform__Group_7_5__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1402:1: rule__Xplatform__Group_7_5__2__Impl : ( ( rule__Xplatform__ResponseHeadersAssignment_7_5_2 ) ) ;
    public final void rule__Xplatform__Group_7_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1406:1: ( ( ( rule__Xplatform__ResponseHeadersAssignment_7_5_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1407:1: ( ( rule__Xplatform__ResponseHeadersAssignment_7_5_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1407:1: ( ( rule__Xplatform__ResponseHeadersAssignment_7_5_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1408:1: ( rule__Xplatform__ResponseHeadersAssignment_7_5_2 )
            {
             before(grammarAccess.getXplatformAccess().getResponseHeadersAssignment_7_5_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1409:1: ( rule__Xplatform__ResponseHeadersAssignment_7_5_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1409:2: rule__Xplatform__ResponseHeadersAssignment_7_5_2
            {
            pushFollow(FOLLOW_rule__Xplatform__ResponseHeadersAssignment_7_5_2_in_rule__Xplatform__Group_7_5__2__Impl2897);
            rule__Xplatform__ResponseHeadersAssignment_7_5_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getResponseHeadersAssignment_7_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_7_5__2__Impl"


    // $ANTLR start "rule__Xplatform__Group_8__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1425:1: rule__Xplatform__Group_8__0 : rule__Xplatform__Group_8__0__Impl rule__Xplatform__Group_8__1 ;
    public final void rule__Xplatform__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1429:1: ( rule__Xplatform__Group_8__0__Impl rule__Xplatform__Group_8__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1430:2: rule__Xplatform__Group_8__0__Impl rule__Xplatform__Group_8__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_8__0__Impl_in_rule__Xplatform__Group_8__02933);
            rule__Xplatform__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_8__1_in_rule__Xplatform__Group_8__02936);
            rule__Xplatform__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__0"


    // $ANTLR start "rule__Xplatform__Group_8__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1437:1: rule__Xplatform__Group_8__0__Impl : ( 'client' ) ;
    public final void rule__Xplatform__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1441:1: ( ( 'client' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1442:1: ( 'client' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1442:1: ( 'client' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1443:1: 'client'
            {
             before(grammarAccess.getXplatformAccess().getClientKeyword_8_0()); 
            match(input,26,FOLLOW_26_in_rule__Xplatform__Group_8__0__Impl2964); 
             after(grammarAccess.getXplatformAccess().getClientKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_8__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1456:1: rule__Xplatform__Group_8__1 : rule__Xplatform__Group_8__1__Impl rule__Xplatform__Group_8__2 ;
    public final void rule__Xplatform__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1460:1: ( rule__Xplatform__Group_8__1__Impl rule__Xplatform__Group_8__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1461:2: rule__Xplatform__Group_8__1__Impl rule__Xplatform__Group_8__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_8__1__Impl_in_rule__Xplatform__Group_8__12995);
            rule__Xplatform__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_8__2_in_rule__Xplatform__Group_8__12998);
            rule__Xplatform__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__1"


    // $ANTLR start "rule__Xplatform__Group_8__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1468:1: rule__Xplatform__Group_8__1__Impl : ( 'expects' ) ;
    public final void rule__Xplatform__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1472:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1473:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1473:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1474:1: 'expects'
            {
             before(grammarAccess.getXplatformAccess().getExpectsKeyword_8_1()); 
            match(input,27,FOLLOW_27_in_rule__Xplatform__Group_8__1__Impl3026); 
             after(grammarAccess.getXplatformAccess().getExpectsKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_8__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1487:1: rule__Xplatform__Group_8__2 : rule__Xplatform__Group_8__2__Impl rule__Xplatform__Group_8__3 ;
    public final void rule__Xplatform__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1491:1: ( rule__Xplatform__Group_8__2__Impl rule__Xplatform__Group_8__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1492:2: rule__Xplatform__Group_8__2__Impl rule__Xplatform__Group_8__3
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_8__2__Impl_in_rule__Xplatform__Group_8__23057);
            rule__Xplatform__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_8__3_in_rule__Xplatform__Group_8__23060);
            rule__Xplatform__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__2"


    // $ANTLR start "rule__Xplatform__Group_8__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1499:1: rule__Xplatform__Group_8__2__Impl : ( ( rule__Xplatform__JsonToClientAssignment_8_2 ) ) ;
    public final void rule__Xplatform__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1503:1: ( ( ( rule__Xplatform__JsonToClientAssignment_8_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1504:1: ( ( rule__Xplatform__JsonToClientAssignment_8_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1504:1: ( ( rule__Xplatform__JsonToClientAssignment_8_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1505:1: ( rule__Xplatform__JsonToClientAssignment_8_2 )
            {
             before(grammarAccess.getXplatformAccess().getJsonToClientAssignment_8_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1506:1: ( rule__Xplatform__JsonToClientAssignment_8_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1506:2: rule__Xplatform__JsonToClientAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Xplatform__JsonToClientAssignment_8_2_in_rule__Xplatform__Group_8__2__Impl3087);
            rule__Xplatform__JsonToClientAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getJsonToClientAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__2__Impl"


    // $ANTLR start "rule__Xplatform__Group_8__3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1516:1: rule__Xplatform__Group_8__3 : rule__Xplatform__Group_8__3__Impl ;
    public final void rule__Xplatform__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1520:1: ( rule__Xplatform__Group_8__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1521:2: rule__Xplatform__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_8__3__Impl_in_rule__Xplatform__Group_8__33117);
            rule__Xplatform__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__3"


    // $ANTLR start "rule__Xplatform__Group_8__3__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1527:1: rule__Xplatform__Group_8__3__Impl : ( ( rule__Xplatform__Group_8_3__0 )? ) ;
    public final void rule__Xplatform__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1531:1: ( ( ( rule__Xplatform__Group_8_3__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1532:1: ( ( rule__Xplatform__Group_8_3__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1532:1: ( ( rule__Xplatform__Group_8_3__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1533:1: ( rule__Xplatform__Group_8_3__0 )?
            {
             before(grammarAccess.getXplatformAccess().getGroup_8_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1534:1: ( rule__Xplatform__Group_8_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1534:2: rule__Xplatform__Group_8_3__0
                    {
                    pushFollow(FOLLOW_rule__Xplatform__Group_8_3__0_in_rule__Xplatform__Group_8__3__Impl3144);
                    rule__Xplatform__Group_8_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXplatformAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8__3__Impl"


    // $ANTLR start "rule__Xplatform__Group_8_3__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1552:1: rule__Xplatform__Group_8_3__0 : rule__Xplatform__Group_8_3__0__Impl rule__Xplatform__Group_8_3__1 ;
    public final void rule__Xplatform__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1556:1: ( rule__Xplatform__Group_8_3__0__Impl rule__Xplatform__Group_8_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1557:2: rule__Xplatform__Group_8_3__0__Impl rule__Xplatform__Group_8_3__1
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_8_3__0__Impl_in_rule__Xplatform__Group_8_3__03183);
            rule__Xplatform__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_8_3__1_in_rule__Xplatform__Group_8_3__03186);
            rule__Xplatform__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8_3__0"


    // $ANTLR start "rule__Xplatform__Group_8_3__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1564:1: rule__Xplatform__Group_8_3__0__Impl : ( 'server' ) ;
    public final void rule__Xplatform__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1568:1: ( ( 'server' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1569:1: ( 'server' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1569:1: ( 'server' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1570:1: 'server'
            {
             before(grammarAccess.getXplatformAccess().getServerKeyword_8_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Xplatform__Group_8_3__0__Impl3214); 
             after(grammarAccess.getXplatformAccess().getServerKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8_3__0__Impl"


    // $ANTLR start "rule__Xplatform__Group_8_3__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1583:1: rule__Xplatform__Group_8_3__1 : rule__Xplatform__Group_8_3__1__Impl rule__Xplatform__Group_8_3__2 ;
    public final void rule__Xplatform__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1587:1: ( rule__Xplatform__Group_8_3__1__Impl rule__Xplatform__Group_8_3__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1588:2: rule__Xplatform__Group_8_3__1__Impl rule__Xplatform__Group_8_3__2
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_8_3__1__Impl_in_rule__Xplatform__Group_8_3__13245);
            rule__Xplatform__Group_8_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Xplatform__Group_8_3__2_in_rule__Xplatform__Group_8_3__13248);
            rule__Xplatform__Group_8_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8_3__1"


    // $ANTLR start "rule__Xplatform__Group_8_3__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1595:1: rule__Xplatform__Group_8_3__1__Impl : ( 'expects' ) ;
    public final void rule__Xplatform__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1599:1: ( ( 'expects' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1600:1: ( 'expects' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1600:1: ( 'expects' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1601:1: 'expects'
            {
             before(grammarAccess.getXplatformAccess().getExpectsKeyword_8_3_1()); 
            match(input,27,FOLLOW_27_in_rule__Xplatform__Group_8_3__1__Impl3276); 
             after(grammarAccess.getXplatformAccess().getExpectsKeyword_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8_3__1__Impl"


    // $ANTLR start "rule__Xplatform__Group_8_3__2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1614:1: rule__Xplatform__Group_8_3__2 : rule__Xplatform__Group_8_3__2__Impl ;
    public final void rule__Xplatform__Group_8_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1618:1: ( rule__Xplatform__Group_8_3__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1619:2: rule__Xplatform__Group_8_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Xplatform__Group_8_3__2__Impl_in_rule__Xplatform__Group_8_3__23307);
            rule__Xplatform__Group_8_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8_3__2"


    // $ANTLR start "rule__Xplatform__Group_8_3__2__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1625:1: rule__Xplatform__Group_8_3__2__Impl : ( ( rule__Xplatform__JsonToServerAssignment_8_3_2 ) ) ;
    public final void rule__Xplatform__Group_8_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1629:1: ( ( ( rule__Xplatform__JsonToServerAssignment_8_3_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1630:1: ( ( rule__Xplatform__JsonToServerAssignment_8_3_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1630:1: ( ( rule__Xplatform__JsonToServerAssignment_8_3_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1631:1: ( rule__Xplatform__JsonToServerAssignment_8_3_2 )
            {
             before(grammarAccess.getXplatformAccess().getJsonToServerAssignment_8_3_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1632:1: ( rule__Xplatform__JsonToServerAssignment_8_3_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1632:2: rule__Xplatform__JsonToServerAssignment_8_3_2
            {
            pushFollow(FOLLOW_rule__Xplatform__JsonToServerAssignment_8_3_2_in_rule__Xplatform__Group_8_3__2__Impl3334);
            rule__Xplatform__JsonToServerAssignment_8_3_2();

            state._fsp--;


            }

             after(grammarAccess.getXplatformAccess().getJsonToServerAssignment_8_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__Group_8_3__2__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1648:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1652:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1653:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03370);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03373);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1660:1: rule__URI__Group__0__Impl : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1664:1: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1665:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1665:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1666:1: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1666:1: ( ( RULE_ANY_OTHER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1667:1: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1668:1: ( RULE_ANY_OTHER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1668:3: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3403); 

            }

             after(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1671:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1672:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1673:1: ( RULE_ANY_OTHER )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANY_OTHER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1673:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3416); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1684:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1688:1: ( rule__URI__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1689:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13449);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1695:1: rule__URI__Group__1__Impl : ( ( rule__URI__Group_1__0 )? ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1699:1: ( ( ( rule__URI__Group_1__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1700:1: ( ( rule__URI__Group_1__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1700:1: ( ( rule__URI__Group_1__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1701:1: ( rule__URI__Group_1__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1702:1: ( rule__URI__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1702:2: rule__URI__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3476);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1716:1: rule__URI__Group_1__0 : rule__URI__Group_1__0__Impl rule__URI__Group_1__1 ;
    public final void rule__URI__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1720:1: ( rule__URI__Group_1__0__Impl rule__URI__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1721:2: rule__URI__Group_1__0__Impl rule__URI__Group_1__1
            {
            pushFollow(FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03511);
            rule__URI__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03514);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1728:1: rule__URI__Group_1__0__Impl : ( '{' ) ;
    public final void rule__URI__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1732:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1733:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1733:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1734:1: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__URI__Group_1__0__Impl3542); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1747:1: rule__URI__Group_1__1 : rule__URI__Group_1__1__Impl rule__URI__Group_1__2 ;
    public final void rule__URI__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1751:1: ( rule__URI__Group_1__1__Impl rule__URI__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1752:2: rule__URI__Group_1__1__Impl rule__URI__Group_1__2
            {
            pushFollow(FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13573);
            rule__URI__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13576);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1759:1: rule__URI__Group_1__1__Impl : ( ( rule__URI__UriParameterAssignment_1_1 ) ) ;
    public final void rule__URI__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1763:1: ( ( ( rule__URI__UriParameterAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1764:1: ( ( rule__URI__UriParameterAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1764:1: ( ( rule__URI__UriParameterAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1765:1: ( rule__URI__UriParameterAssignment_1_1 )
            {
             before(grammarAccess.getURIAccess().getUriParameterAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1766:1: ( rule__URI__UriParameterAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1766:2: rule__URI__UriParameterAssignment_1_1
            {
            pushFollow(FOLLOW_rule__URI__UriParameterAssignment_1_1_in_rule__URI__Group_1__1__Impl3603);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1776:1: rule__URI__Group_1__2 : rule__URI__Group_1__2__Impl rule__URI__Group_1__3 ;
    public final void rule__URI__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1780:1: ( rule__URI__Group_1__2__Impl rule__URI__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1781:2: rule__URI__Group_1__2__Impl rule__URI__Group_1__3
            {
            pushFollow(FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23633);
            rule__URI__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23636);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1788:1: rule__URI__Group_1__2__Impl : ( '}' ) ;
    public final void rule__URI__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1792:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1793:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1793:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1794:1: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,30,FOLLOW_30_in_rule__URI__Group_1__2__Impl3664); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1807:1: rule__URI__Group_1__3 : rule__URI__Group_1__3__Impl ;
    public final void rule__URI__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1811:1: ( rule__URI__Group_1__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1812:2: rule__URI__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33695);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1818:1: rule__URI__Group_1__3__Impl : ( ( RULE_ANY_OTHER )* ) ;
    public final void rule__URI__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1822:1: ( ( ( RULE_ANY_OTHER )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1823:1: ( ( RULE_ANY_OTHER )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1823:1: ( ( RULE_ANY_OTHER )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1824:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1825:1: ( RULE_ANY_OTHER )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANY_OTHER) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1825:3: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3723); 

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


    // $ANTLR start "rule__XplatformHeader__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1843:1: rule__XplatformHeader__Group__0 : rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 ;
    public final void rule__XplatformHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1847:1: ( rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1848:2: rule__XplatformHeader__Group__0__Impl rule__XplatformHeader__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03762);
            rule__XplatformHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03765);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1855:1: rule__XplatformHeader__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1859:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1860:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1860:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1861:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__XplatformHeader__Group__0__Impl3793); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1874:1: rule__XplatformHeader__Group__1 : rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 ;
    public final void rule__XplatformHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1878:1: ( rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1879:2: rule__XplatformHeader__Group__1__Impl rule__XplatformHeader__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13824);
            rule__XplatformHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13827);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1886:1: rule__XplatformHeader__Group__1__Impl : ( '{' ) ;
    public final void rule__XplatformHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1890:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1891:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1891:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1892:1: '{'
            {
             before(grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__XplatformHeader__Group__1__Impl3855); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1905:1: rule__XplatformHeader__Group__2 : rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 ;
    public final void rule__XplatformHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1909:1: ( rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1910:2: rule__XplatformHeader__Group__2__Impl rule__XplatformHeader__Group__3
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__23886);
            rule__XplatformHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__23889);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1917:1: rule__XplatformHeader__Group__2__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) ) ;
    public final void rule__XplatformHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1921:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1922:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1922:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1923:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1924:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1924:2: rule__XplatformHeader__HeaderKeyValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_2_in_rule__XplatformHeader__Group__2__Impl3916);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1934:1: rule__XplatformHeader__Group__3 : rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 ;
    public final void rule__XplatformHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1938:1: ( rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1939:2: rule__XplatformHeader__Group__3__Impl rule__XplatformHeader__Group__4
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__33946);
            rule__XplatformHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__33949);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1946:1: rule__XplatformHeader__Group__3__Impl : ( ( rule__XplatformHeader__Group_3__0 )* ) ;
    public final void rule__XplatformHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1950:1: ( ( ( rule__XplatformHeader__Group_3__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1951:1: ( ( rule__XplatformHeader__Group_3__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1951:1: ( ( rule__XplatformHeader__Group_3__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1952:1: ( rule__XplatformHeader__Group_3__0 )*
            {
             before(grammarAccess.getXplatformHeaderAccess().getGroup_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1953:1: ( rule__XplatformHeader__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_STRING) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1953:2: rule__XplatformHeader__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__XplatformHeader__Group_3__0_in_rule__XplatformHeader__Group__3__Impl3976);
            	    rule__XplatformHeader__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1963:1: rule__XplatformHeader__Group__4 : rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 ;
    public final void rule__XplatformHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1967:1: ( rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1968:2: rule__XplatformHeader__Group__4__Impl rule__XplatformHeader__Group__5
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__44007);
            rule__XplatformHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__44010);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1975:1: rule__XplatformHeader__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__XplatformHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1979:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1980:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1980:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1981:1: ( ',' )?
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1982:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1983:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__XplatformHeader__Group__4__Impl4039); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1994:1: rule__XplatformHeader__Group__5 : rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 ;
    public final void rule__XplatformHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1998:1: ( rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:1999:2: rule__XplatformHeader__Group__5__Impl rule__XplatformHeader__Group__6
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__54072);
            rule__XplatformHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__54075);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2006:1: rule__XplatformHeader__Group__5__Impl : ( '}' ) ;
    public final void rule__XplatformHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2010:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2011:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2011:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2012:1: '}'
            {
             before(grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__XplatformHeader__Group__5__Impl4103); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2025:1: rule__XplatformHeader__Group__6 : rule__XplatformHeader__Group__6__Impl ;
    public final void rule__XplatformHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2029:1: ( rule__XplatformHeader__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2030:2: rule__XplatformHeader__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__64134);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2036:1: rule__XplatformHeader__Group__6__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2040:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2041:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2041:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2042:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__XplatformHeader__Group__6__Impl4162); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2069:1: rule__XplatformHeader__Group_3__0 : rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1 ;
    public final void rule__XplatformHeader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2073:1: ( rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2074:2: rule__XplatformHeader__Group_3__0__Impl rule__XplatformHeader__Group_3__1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__0__Impl_in_rule__XplatformHeader__Group_3__04207);
            rule__XplatformHeader__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__1_in_rule__XplatformHeader__Group_3__04210);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2081:1: rule__XplatformHeader__Group_3__0__Impl : ( ',' ) ;
    public final void rule__XplatformHeader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2085:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2086:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2086:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2087:1: ','
            {
             before(grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__XplatformHeader__Group_3__0__Impl4238); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2100:1: rule__XplatformHeader__Group_3__1 : rule__XplatformHeader__Group_3__1__Impl ;
    public final void rule__XplatformHeader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2104:1: ( rule__XplatformHeader__Group_3__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2105:2: rule__XplatformHeader__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeader__Group_3__1__Impl_in_rule__XplatformHeader__Group_3__14269);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2111:1: rule__XplatformHeader__Group_3__1__Impl : ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) ) ;
    public final void rule__XplatformHeader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2115:1: ( ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2116:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2116:1: ( ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2117:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 )
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesAssignment_3_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2118:1: ( rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2118:2: rule__XplatformHeader__HeaderKeyValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_1_in_rule__XplatformHeader__Group_3__1__Impl4296);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2132:1: rule__XplatformHeaderKeyValuePair__Group__0 : rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2136:1: ( rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2137:2: rule__XplatformHeaderKeyValuePair__Group__0__Impl rule__XplatformHeaderKeyValuePair__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__04330);
            rule__XplatformHeaderKeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__04333);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2144:1: rule__XplatformHeaderKeyValuePair__Group__0__Impl : ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2148:1: ( ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2149:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2149:1: ( ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2150:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeyAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2151:1: ( rule__XplatformHeaderKeyValuePair__KeyAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2151:2: rule__XplatformHeaderKeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl4360);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2161:1: rule__XplatformHeaderKeyValuePair__Group__1 : rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2165:1: ( rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2166:2: rule__XplatformHeaderKeyValuePair__Group__1__Impl rule__XplatformHeaderKeyValuePair__Group__2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__14390);
            rule__XplatformHeaderKeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__14393);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2173:1: rule__XplatformHeaderKeyValuePair__Group__1__Impl : ( '=' ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2177:1: ( ( '=' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2178:1: ( '=' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2178:1: ( '=' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2179:1: '='
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl4421); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2192:1: rule__XplatformHeaderKeyValuePair__Group__2 : rule__XplatformHeaderKeyValuePair__Group__2__Impl ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2196:1: ( rule__XplatformHeaderKeyValuePair__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2197:2: rule__XplatformHeaderKeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__24452);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2203:1: rule__XplatformHeaderKeyValuePair__Group__2__Impl : ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) ;
    public final void rule__XplatformHeaderKeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2207:1: ( ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2208:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2208:1: ( ( rule__XplatformHeaderKeyValuePair__Alternatives_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2209:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getAlternatives_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2210:1: ( rule__XplatformHeaderKeyValuePair__Alternatives_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2210:2: rule__XplatformHeaderKeyValuePair__Alternatives_2
            {
            pushFollow(FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl4479);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2226:1: rule__XplatformJson__Group_0__0 : rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 ;
    public final void rule__XplatformJson__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2230:1: ( rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2231:2: rule__XplatformJson__Group_0__0__Impl rule__XplatformJson__Group_0__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__04515);
            rule__XplatformJson__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__04518);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2238:1: rule__XplatformJson__Group_0__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2242:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2243:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2243:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2244:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__XplatformJson__Group_0__0__Impl4546); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2257:1: rule__XplatformJson__Group_0__1 : rule__XplatformJson__Group_0__1__Impl ;
    public final void rule__XplatformJson__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2261:1: ( rule__XplatformJson__Group_0__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2262:2: rule__XplatformJson__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__14577);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2268:1: rule__XplatformJson__Group_0__1__Impl : ( ( rule__XplatformJson__TypeAssignment_0_1 ) ) ;
    public final void rule__XplatformJson__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2272:1: ( ( ( rule__XplatformJson__TypeAssignment_0_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2273:1: ( ( rule__XplatformJson__TypeAssignment_0_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2273:1: ( ( rule__XplatformJson__TypeAssignment_0_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2274:1: ( rule__XplatformJson__TypeAssignment_0_1 )
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeAssignment_0_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2275:1: ( rule__XplatformJson__TypeAssignment_0_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2275:2: rule__XplatformJson__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__XplatformJson__TypeAssignment_0_1_in_rule__XplatformJson__Group_0__1__Impl4604);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2289:1: rule__XplatformJson__Group_2__0 : rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1 ;
    public final void rule__XplatformJson__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2293:1: ( rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2294:2: rule__XplatformJson__Group_2__0__Impl rule__XplatformJson__Group_2__1
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_2__0__Impl_in_rule__XplatformJson__Group_2__04638);
            rule__XplatformJson__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformJson__Group_2__1_in_rule__XplatformJson__Group_2__04641);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2301:1: rule__XplatformJson__Group_2__0__Impl : ( ( rule__XplatformJson__CompositeAssignment_2_0 ) ) ;
    public final void rule__XplatformJson__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2305:1: ( ( ( rule__XplatformJson__CompositeAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2306:1: ( ( rule__XplatformJson__CompositeAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2306:1: ( ( rule__XplatformJson__CompositeAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2307:1: ( rule__XplatformJson__CompositeAssignment_2_0 )
            {
             before(grammarAccess.getXplatformJsonAccess().getCompositeAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2308:1: ( rule__XplatformJson__CompositeAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2308:2: rule__XplatformJson__CompositeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__XplatformJson__CompositeAssignment_2_0_in_rule__XplatformJson__Group_2__0__Impl4668);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2318:1: rule__XplatformJson__Group_2__1 : rule__XplatformJson__Group_2__1__Impl ;
    public final void rule__XplatformJson__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2322:1: ( rule__XplatformJson__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2323:2: rule__XplatformJson__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformJson__Group_2__1__Impl_in_rule__XplatformJson__Group_2__14698);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2329:1: rule__XplatformJson__Group_2__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__XplatformJson__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2333:1: ( ( '\\'\\'\\'' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2334:1: ( '\\'\\'\\'' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2334:1: ( '\\'\\'\\'' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2335:1: '\\'\\'\\''
            {
             before(grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_2_1()); 
            match(input,31,FOLLOW_31_in_rule__XplatformJson__Group_2__1__Impl4726); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2352:1: rule__JsonMetaArray__Group__0 : rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 ;
    public final void rule__JsonMetaArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2356:1: ( rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2357:2: rule__JsonMetaArray__Group__0__Impl rule__JsonMetaArray__Group__1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__04761);
            rule__JsonMetaArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__04764);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2364:1: rule__JsonMetaArray__Group__0__Impl : ( '[' ) ;
    public final void rule__JsonMetaArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2368:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2369:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2369:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2370:1: '['
            {
             before(grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonMetaArray__Group__0__Impl4792); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2383:1: rule__JsonMetaArray__Group__1 : rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 ;
    public final void rule__JsonMetaArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2387:1: ( rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2388:2: rule__JsonMetaArray__Group__1__Impl rule__JsonMetaArray__Group__2
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__14823);
            rule__JsonMetaArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__14826);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2395:1: rule__JsonMetaArray__Group__1__Impl : ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) ;
    public final void rule__JsonMetaArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2399:1: ( ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2400:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2400:1: ( ( rule__JsonMetaArray__MetaTypeAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2401:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2402:1: ( rule__JsonMetaArray__MetaTypeAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2402:2: rule__JsonMetaArray__MetaTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl4853);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2412:1: rule__JsonMetaArray__Group__2 : rule__JsonMetaArray__Group__2__Impl ;
    public final void rule__JsonMetaArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2416:1: ( rule__JsonMetaArray__Group__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2417:2: rule__JsonMetaArray__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__24883);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2423:1: rule__JsonMetaArray__Group__2__Impl : ( ']' ) ;
    public final void rule__JsonMetaArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2427:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2428:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2428:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2429:1: ']'
            {
             before(grammarAccess.getJsonMetaArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__JsonMetaArray__Group__2__Impl4911); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2448:1: rule__JsonScalarType__Group_2__0 : rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 ;
    public final void rule__JsonScalarType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2452:1: ( rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2453:2: rule__JsonScalarType__Group_2__0__Impl rule__JsonScalarType__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__04948);
            rule__JsonScalarType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__04951);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2460:1: rule__JsonScalarType__Group_2__0__Impl : ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) ;
    public final void rule__JsonScalarType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2464:1: ( ( ( rule__JsonScalarType__NumberAssignment_2_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2465:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2465:1: ( ( rule__JsonScalarType__NumberAssignment_2_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2466:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberAssignment_2_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2467:1: ( rule__JsonScalarType__NumberAssignment_2_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2467:2: rule__JsonScalarType__NumberAssignment_2_0
            {
            pushFollow(FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl4978);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2477:1: rule__JsonScalarType__Group_2__1 : rule__JsonScalarType__Group_2__1__Impl ;
    public final void rule__JsonScalarType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2481:1: ( rule__JsonScalarType__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2482:2: rule__JsonScalarType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__15008);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2488:1: rule__JsonScalarType__Group_2__1__Impl : ( ( rule__JsonScalarType__Group_2_1__0 )? ) ;
    public final void rule__JsonScalarType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2492:1: ( ( ( rule__JsonScalarType__Group_2_1__0 )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2493:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2493:1: ( ( rule__JsonScalarType__Group_2_1__0 )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2494:1: ( rule__JsonScalarType__Group_2_1__0 )?
            {
             before(grammarAccess.getJsonScalarTypeAccess().getGroup_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2495:1: ( rule__JsonScalarType__Group_2_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2495:2: rule__JsonScalarType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl5035);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2509:1: rule__JsonScalarType__Group_2_1__0 : rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 ;
    public final void rule__JsonScalarType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2513:1: ( rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2514:2: rule__JsonScalarType__Group_2_1__0__Impl rule__JsonScalarType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__05070);
            rule__JsonScalarType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__05073);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2521:1: rule__JsonScalarType__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__JsonScalarType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2525:1: ( ( '.' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2526:1: ( '.' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2526:1: ( '.' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2527:1: '.'
            {
             before(grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0()); 
            match(input,36,FOLLOW_36_in_rule__JsonScalarType__Group_2_1__0__Impl5101); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2540:1: rule__JsonScalarType__Group_2_1__1 : rule__JsonScalarType__Group_2_1__1__Impl ;
    public final void rule__JsonScalarType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2544:1: ( rule__JsonScalarType__Group_2_1__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2545:2: rule__JsonScalarType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__15132);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2551:1: rule__JsonScalarType__Group_2_1__1__Impl : ( RULE_INT ) ;
    public final void rule__JsonScalarType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2555:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2556:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2556:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2557:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl5159); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2572:1: rule__JsonArray__Group_0__0 : rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 ;
    public final void rule__JsonArray__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2576:1: ( rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2577:2: rule__JsonArray__Group_0__0__Impl rule__JsonArray__Group_0__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__05192);
            rule__JsonArray__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__05195);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2584:1: rule__JsonArray__Group_0__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2588:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2589:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2589:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2590:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_0__0__Impl5223); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2603:1: rule__JsonArray__Group_0__1 : rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 ;
    public final void rule__JsonArray__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2607:1: ( rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2608:2: rule__JsonArray__Group_0__1__Impl rule__JsonArray__Group_0__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__15254);
            rule__JsonArray__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__15257);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2615:1: rule__JsonArray__Group_0__1__Impl : ( ( rule__JsonArray__ElementsAssignment_0_1 ) ) ;
    public final void rule__JsonArray__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2619:1: ( ( ( rule__JsonArray__ElementsAssignment_0_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2620:1: ( ( rule__JsonArray__ElementsAssignment_0_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2620:1: ( ( rule__JsonArray__ElementsAssignment_0_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2621:1: ( rule__JsonArray__ElementsAssignment_0_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2622:1: ( rule__JsonArray__ElementsAssignment_0_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2622:2: rule__JsonArray__ElementsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementsAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl5284);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2632:1: rule__JsonArray__Group_0__2 : rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 ;
    public final void rule__JsonArray__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2636:1: ( rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2637:2: rule__JsonArray__Group_0__2__Impl rule__JsonArray__Group_0__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__25314);
            rule__JsonArray__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__25317);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2644:1: rule__JsonArray__Group_0__2__Impl : ( ( rule__JsonArray__Group_0_2__0 )* ) ;
    public final void rule__JsonArray__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2648:1: ( ( ( rule__JsonArray__Group_0_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2649:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2649:1: ( ( rule__JsonArray__Group_0_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2650:1: ( rule__JsonArray__Group_0_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_0_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2651:1: ( rule__JsonArray__Group_0_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_INT||LA20_1==RULE_STRING||(LA20_1>=RULE_JSON_LITERAL_BOOLEAN && LA20_1<=RULE_JSON_LITERAL_NULL)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2651:2: rule__JsonArray__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl5344);
            	    rule__JsonArray__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2661:1: rule__JsonArray__Group_0__3 : rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4 ;
    public final void rule__JsonArray__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2665:1: ( rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2666:2: rule__JsonArray__Group_0__3__Impl rule__JsonArray__Group_0__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__35375);
            rule__JsonArray__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0__4_in_rule__JsonArray__Group_0__35378);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2673:1: rule__JsonArray__Group_0__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2677:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2678:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2678:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2679:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2680:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2681:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__JsonArray__Group_0__3__Impl5407); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2692:1: rule__JsonArray__Group_0__4 : rule__JsonArray__Group_0__4__Impl ;
    public final void rule__JsonArray__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2696:1: ( rule__JsonArray__Group_0__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2697:2: rule__JsonArray__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0__4__Impl_in_rule__JsonArray__Group_0__45440);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2703:1: rule__JsonArray__Group_0__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2707:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2708:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2708:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2709:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4()); 
            match(input,35,FOLLOW_35_in_rule__JsonArray__Group_0__4__Impl5468); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2732:1: rule__JsonArray__Group_0_2__0 : rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 ;
    public final void rule__JsonArray__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2736:1: ( rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2737:2: rule__JsonArray__Group_0_2__0__Impl rule__JsonArray__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__05509);
            rule__JsonArray__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__05512);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2744:1: rule__JsonArray__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2748:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2749:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2749:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2750:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0()); 
            match(input,32,FOLLOW_32_in_rule__JsonArray__Group_0_2__0__Impl5540); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2763:1: rule__JsonArray__Group_0_2__1 : rule__JsonArray__Group_0_2__1__Impl ;
    public final void rule__JsonArray__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2767:1: ( rule__JsonArray__Group_0_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2768:2: rule__JsonArray__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__15571);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2774:1: rule__JsonArray__Group_0_2__1__Impl : ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) ) ;
    public final void rule__JsonArray__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2778:1: ( ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2779:1: ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2779:1: ( ( rule__JsonArray__ElementsAssignment_0_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2780:1: ( rule__JsonArray__ElementsAssignment_0_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getElementsAssignment_0_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2781:1: ( rule__JsonArray__ElementsAssignment_0_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2781:2: rule__JsonArray__ElementsAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__ElementsAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl5598);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2795:1: rule__JsonArray__Group_1__0 : rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 ;
    public final void rule__JsonArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2799:1: ( rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2800:2: rule__JsonArray__Group_1__0__Impl rule__JsonArray__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__05632);
            rule__JsonArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__05635);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2807:1: rule__JsonArray__Group_1__0__Impl : ( '[' ) ;
    public final void rule__JsonArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2811:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2812:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2812:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2813:1: '['
            {
             before(grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__JsonArray__Group_1__0__Impl5663); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2826:1: rule__JsonArray__Group_1__1 : rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 ;
    public final void rule__JsonArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2830:1: ( rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2831:2: rule__JsonArray__Group_1__1__Impl rule__JsonArray__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__15694);
            rule__JsonArray__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__15697);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2838:1: rule__JsonArray__Group_1__1__Impl : ( ( rule__JsonArray__CompositesAssignment_1_1 ) ) ;
    public final void rule__JsonArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2842:1: ( ( ( rule__JsonArray__CompositesAssignment_1_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2843:1: ( ( rule__JsonArray__CompositesAssignment_1_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2843:1: ( ( rule__JsonArray__CompositesAssignment_1_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2844:1: ( rule__JsonArray__CompositesAssignment_1_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2845:1: ( rule__JsonArray__CompositesAssignment_1_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2845:2: rule__JsonArray__CompositesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositesAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl5724);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2855:1: rule__JsonArray__Group_1__2 : rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 ;
    public final void rule__JsonArray__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2859:1: ( rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2860:2: rule__JsonArray__Group_1__2__Impl rule__JsonArray__Group_1__3
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__25754);
            rule__JsonArray__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__25757);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2867:1: rule__JsonArray__Group_1__2__Impl : ( ( rule__JsonArray__Group_1_2__0 )* ) ;
    public final void rule__JsonArray__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2871:1: ( ( ( rule__JsonArray__Group_1_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2872:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2872:1: ( ( rule__JsonArray__Group_1_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2873:1: ( rule__JsonArray__Group_1_2__0 )*
            {
             before(grammarAccess.getJsonArrayAccess().getGroup_1_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2874:1: ( rule__JsonArray__Group_1_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==34) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2874:2: rule__JsonArray__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl5784);
            	    rule__JsonArray__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2884:1: rule__JsonArray__Group_1__3 : rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4 ;
    public final void rule__JsonArray__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2888:1: ( rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2889:2: rule__JsonArray__Group_1__3__Impl rule__JsonArray__Group_1__4
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__35815);
            rule__JsonArray__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1__4_in_rule__JsonArray__Group_1__35818);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2896:1: rule__JsonArray__Group_1__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonArray__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2900:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2901:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2901:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2902:1: ( ',' )?
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2903:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2904:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__JsonArray__Group_1__3__Impl5847); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2915:1: rule__JsonArray__Group_1__4 : rule__JsonArray__Group_1__4__Impl ;
    public final void rule__JsonArray__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2919:1: ( rule__JsonArray__Group_1__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2920:2: rule__JsonArray__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1__4__Impl_in_rule__JsonArray__Group_1__45880);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2926:1: rule__JsonArray__Group_1__4__Impl : ( ']' ) ;
    public final void rule__JsonArray__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2930:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2931:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2931:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2932:1: ']'
            {
             before(grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,35,FOLLOW_35_in_rule__JsonArray__Group_1__4__Impl5908); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2955:1: rule__JsonArray__Group_1_2__0 : rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 ;
    public final void rule__JsonArray__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2959:1: ( rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2960:2: rule__JsonArray__Group_1_2__0__Impl rule__JsonArray__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__05949);
            rule__JsonArray__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__05952);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2967:1: rule__JsonArray__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JsonArray__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2971:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2972:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2972:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2973:1: ','
            {
             before(grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0()); 
            match(input,32,FOLLOW_32_in_rule__JsonArray__Group_1_2__0__Impl5980); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2986:1: rule__JsonArray__Group_1_2__1 : rule__JsonArray__Group_1_2__1__Impl ;
    public final void rule__JsonArray__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2990:1: ( rule__JsonArray__Group_1_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2991:2: rule__JsonArray__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__16011);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:2997:1: rule__JsonArray__Group_1_2__1__Impl : ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) ) ;
    public final void rule__JsonArray__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3001:1: ( ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3002:1: ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3002:1: ( ( rule__JsonArray__CompositesAssignment_1_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3003:1: ( rule__JsonArray__CompositesAssignment_1_2_1 )
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesAssignment_1_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3004:1: ( rule__JsonArray__CompositesAssignment_1_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3004:2: rule__JsonArray__CompositesAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__JsonArray__CompositesAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl6038);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3018:1: rule__JsonObject__Group__0 : rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 ;
    public final void rule__JsonObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3022:1: ( rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3023:2: rule__JsonObject__Group__0__Impl rule__JsonObject__Group__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__06072);
            rule__JsonObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__06075);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3030:1: rule__JsonObject__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3034:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3035:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3035:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3036:1: '{'
            {
             before(grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__JsonObject__Group__0__Impl6103); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3049:1: rule__JsonObject__Group__1 : rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 ;
    public final void rule__JsonObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3053:1: ( rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3054:2: rule__JsonObject__Group__1__Impl rule__JsonObject__Group__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__16134);
            rule__JsonObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__16137);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3061:1: rule__JsonObject__Group__1__Impl : ( ( rule__JsonObject__Group_1__0 ) ) ;
    public final void rule__JsonObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3065:1: ( ( ( rule__JsonObject__Group_1__0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3066:1: ( ( rule__JsonObject__Group_1__0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3066:1: ( ( rule__JsonObject__Group_1__0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3067:1: ( rule__JsonObject__Group_1__0 )
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3068:1: ( rule__JsonObject__Group_1__0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3068:2: rule__JsonObject__Group_1__0
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__0_in_rule__JsonObject__Group__1__Impl6164);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3078:1: rule__JsonObject__Group__2 : rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 ;
    public final void rule__JsonObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3082:1: ( rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3083:2: rule__JsonObject__Group__2__Impl rule__JsonObject__Group__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__26194);
            rule__JsonObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__26197);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3090:1: rule__JsonObject__Group__2__Impl : ( ( rule__JsonObject__Group_2__0 )* ) ;
    public final void rule__JsonObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3094:1: ( ( ( rule__JsonObject__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3095:1: ( ( rule__JsonObject__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3095:1: ( ( rule__JsonObject__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3096:1: ( rule__JsonObject__Group_2__0 )*
            {
             before(grammarAccess.getJsonObjectAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3097:1: ( rule__JsonObject__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_STRING) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3097:2: rule__JsonObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl6224);
            	    rule__JsonObject__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3107:1: rule__JsonObject__Group__3 : rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 ;
    public final void rule__JsonObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3111:1: ( rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3112:2: rule__JsonObject__Group__3__Impl rule__JsonObject__Group__4
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__36255);
            rule__JsonObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__36258);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3119:1: rule__JsonObject__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__JsonObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3123:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3124:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3124:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3125:1: ( ',' )?
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3126:1: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3127:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__JsonObject__Group__3__Impl6287); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3138:1: rule__JsonObject__Group__4 : rule__JsonObject__Group__4__Impl ;
    public final void rule__JsonObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3142:1: ( rule__JsonObject__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3143:2: rule__JsonObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__46320);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3149:1: rule__JsonObject__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3153:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3154:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3154:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3155:1: '}'
            {
             before(grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__JsonObject__Group__4__Impl6348); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3178:1: rule__JsonObject__Group_1__0 : rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1 ;
    public final void rule__JsonObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3182:1: ( rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3183:2: rule__JsonObject__Group_1__0__Impl rule__JsonObject__Group_1__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__0__Impl_in_rule__JsonObject__Group_1__06389);
            rule__JsonObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_1__1_in_rule__JsonObject__Group_1__06392);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3190:1: rule__JsonObject__Group_1__0__Impl : ( ( rule__JsonObject__KeysAssignment_1_0 ) ) ;
    public final void rule__JsonObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3194:1: ( ( ( rule__JsonObject__KeysAssignment_1_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3195:1: ( ( rule__JsonObject__KeysAssignment_1_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3195:1: ( ( rule__JsonObject__KeysAssignment_1_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3196:1: ( rule__JsonObject__KeysAssignment_1_0 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeysAssignment_1_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3197:1: ( rule__JsonObject__KeysAssignment_1_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3197:2: rule__JsonObject__KeysAssignment_1_0
            {
            pushFollow(FOLLOW_rule__JsonObject__KeysAssignment_1_0_in_rule__JsonObject__Group_1__0__Impl6419);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3207:1: rule__JsonObject__Group_1__1 : rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2 ;
    public final void rule__JsonObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3211:1: ( rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3212:2: rule__JsonObject__Group_1__1__Impl rule__JsonObject__Group_1__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__1__Impl_in_rule__JsonObject__Group_1__16449);
            rule__JsonObject__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_1__2_in_rule__JsonObject__Group_1__16452);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3219:1: rule__JsonObject__Group_1__1__Impl : ( ':' ) ;
    public final void rule__JsonObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3223:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3224:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3224:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3225:1: ':'
            {
             before(grammarAccess.getJsonObjectAccess().getColonKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__JsonObject__Group_1__1__Impl6480); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3238:1: rule__JsonObject__Group_1__2 : rule__JsonObject__Group_1__2__Impl ;
    public final void rule__JsonObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3242:1: ( rule__JsonObject__Group_1__2__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3243:2: rule__JsonObject__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_1__2__Impl_in_rule__JsonObject__Group_1__26511);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3249:1: rule__JsonObject__Group_1__2__Impl : ( ( rule__JsonObject__ValuesAssignment_1_2 ) ) ;
    public final void rule__JsonObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3253:1: ( ( ( rule__JsonObject__ValuesAssignment_1_2 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3254:1: ( ( rule__JsonObject__ValuesAssignment_1_2 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3254:1: ( ( rule__JsonObject__ValuesAssignment_1_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3255:1: ( rule__JsonObject__ValuesAssignment_1_2 )
            {
             before(grammarAccess.getJsonObjectAccess().getValuesAssignment_1_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3256:1: ( rule__JsonObject__ValuesAssignment_1_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3256:2: rule__JsonObject__ValuesAssignment_1_2
            {
            pushFollow(FOLLOW_rule__JsonObject__ValuesAssignment_1_2_in_rule__JsonObject__Group_1__2__Impl6538);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3272:1: rule__JsonObject__Group_2__0 : rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 ;
    public final void rule__JsonObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3276:1: ( rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3277:2: rule__JsonObject__Group_2__0__Impl rule__JsonObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__06574);
            rule__JsonObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__06577);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3284:1: rule__JsonObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3288:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3289:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3289:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3290:1: ','
            {
             before(grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__JsonObject__Group_2__0__Impl6605); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3303:1: rule__JsonObject__Group_2__1 : rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 ;
    public final void rule__JsonObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3307:1: ( rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3308:2: rule__JsonObject__Group_2__1__Impl rule__JsonObject__Group_2__2
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__16636);
            rule__JsonObject__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__2_in_rule__JsonObject__Group_2__16639);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3315:1: rule__JsonObject__Group_2__1__Impl : ( ( rule__JsonObject__KeysAssignment_2_1 ) ) ;
    public final void rule__JsonObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3319:1: ( ( ( rule__JsonObject__KeysAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3320:1: ( ( rule__JsonObject__KeysAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3320:1: ( ( rule__JsonObject__KeysAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3321:1: ( rule__JsonObject__KeysAssignment_2_1 )
            {
             before(grammarAccess.getJsonObjectAccess().getKeysAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3322:1: ( rule__JsonObject__KeysAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3322:2: rule__JsonObject__KeysAssignment_2_1
            {
            pushFollow(FOLLOW_rule__JsonObject__KeysAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl6666);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3332:1: rule__JsonObject__Group_2__2 : rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3 ;
    public final void rule__JsonObject__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3336:1: ( rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3337:2: rule__JsonObject__Group_2__2__Impl rule__JsonObject__Group_2__3
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__2__Impl_in_rule__JsonObject__Group_2__26696);
            rule__JsonObject__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JsonObject__Group_2__3_in_rule__JsonObject__Group_2__26699);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3344:1: rule__JsonObject__Group_2__2__Impl : ( ':' ) ;
    public final void rule__JsonObject__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3348:1: ( ( ':' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3349:1: ( ':' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3349:1: ( ':' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3350:1: ':'
            {
             before(grammarAccess.getJsonObjectAccess().getColonKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__JsonObject__Group_2__2__Impl6727); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3363:1: rule__JsonObject__Group_2__3 : rule__JsonObject__Group_2__3__Impl ;
    public final void rule__JsonObject__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3367:1: ( rule__JsonObject__Group_2__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3368:2: rule__JsonObject__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__JsonObject__Group_2__3__Impl_in_rule__JsonObject__Group_2__36758);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3374:1: rule__JsonObject__Group_2__3__Impl : ( ( rule__JsonObject__ValuesAssignment_2_3 ) ) ;
    public final void rule__JsonObject__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3378:1: ( ( ( rule__JsonObject__ValuesAssignment_2_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3379:1: ( ( rule__JsonObject__ValuesAssignment_2_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3379:1: ( ( rule__JsonObject__ValuesAssignment_2_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3380:1: ( rule__JsonObject__ValuesAssignment_2_3 )
            {
             before(grammarAccess.getJsonObjectAccess().getValuesAssignment_2_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3381:1: ( rule__JsonObject__ValuesAssignment_2_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3381:2: rule__JsonObject__ValuesAssignment_2_3
            {
            pushFollow(FOLLOW_rule__JsonObject__ValuesAssignment_2_3_in_rule__JsonObject__Group_2__3__Impl6785);
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


    // $ANTLR start "rule__XplatformResource__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3399:1: rule__XplatformResource__Group__0 : rule__XplatformResource__Group__0__Impl rule__XplatformResource__Group__1 ;
    public final void rule__XplatformResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3403:1: ( rule__XplatformResource__Group__0__Impl rule__XplatformResource__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3404:2: rule__XplatformResource__Group__0__Impl rule__XplatformResource__Group__1
            {
            pushFollow(FOLLOW_rule__XplatformResource__Group__0__Impl_in_rule__XplatformResource__Group__06823);
            rule__XplatformResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XplatformResource__Group__1_in_rule__XplatformResource__Group__06826);
            rule__XplatformResource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformResource__Group__0"


    // $ANTLR start "rule__XplatformResource__Group__0__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3411:1: rule__XplatformResource__Group__0__Impl : ( ( rule__XplatformResource__PlatformAssignment_0 ) ) ;
    public final void rule__XplatformResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3415:1: ( ( ( rule__XplatformResource__PlatformAssignment_0 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3416:1: ( ( rule__XplatformResource__PlatformAssignment_0 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3416:1: ( ( rule__XplatformResource__PlatformAssignment_0 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3417:1: ( rule__XplatformResource__PlatformAssignment_0 )
            {
             before(grammarAccess.getXplatformResourceAccess().getPlatformAssignment_0()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3418:1: ( rule__XplatformResource__PlatformAssignment_0 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3418:2: rule__XplatformResource__PlatformAssignment_0
            {
            pushFollow(FOLLOW_rule__XplatformResource__PlatformAssignment_0_in_rule__XplatformResource__Group__0__Impl6853);
            rule__XplatformResource__PlatformAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXplatformResourceAccess().getPlatformAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformResource__Group__0__Impl"


    // $ANTLR start "rule__XplatformResource__Group__1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3428:1: rule__XplatformResource__Group__1 : rule__XplatformResource__Group__1__Impl ;
    public final void rule__XplatformResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3432:1: ( rule__XplatformResource__Group__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3433:2: rule__XplatformResource__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__XplatformResource__Group__1__Impl_in_rule__XplatformResource__Group__16883);
            rule__XplatformResource__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformResource__Group__1"


    // $ANTLR start "rule__XplatformResource__Group__1__Impl"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3439:1: rule__XplatformResource__Group__1__Impl : ( ( ( rule__XplatformResource__TypesAssignment_1 ) ) ( ( rule__XplatformResource__TypesAssignment_1 )* ) ) ;
    public final void rule__XplatformResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3443:1: ( ( ( ( rule__XplatformResource__TypesAssignment_1 ) ) ( ( rule__XplatformResource__TypesAssignment_1 )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3444:1: ( ( ( rule__XplatformResource__TypesAssignment_1 ) ) ( ( rule__XplatformResource__TypesAssignment_1 )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3444:1: ( ( ( rule__XplatformResource__TypesAssignment_1 ) ) ( ( rule__XplatformResource__TypesAssignment_1 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3445:1: ( ( rule__XplatformResource__TypesAssignment_1 ) ) ( ( rule__XplatformResource__TypesAssignment_1 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3445:1: ( ( rule__XplatformResource__TypesAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3446:1: ( rule__XplatformResource__TypesAssignment_1 )
            {
             before(grammarAccess.getXplatformResourceAccess().getTypesAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3447:1: ( rule__XplatformResource__TypesAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3447:2: rule__XplatformResource__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__XplatformResource__TypesAssignment_1_in_rule__XplatformResource__Group__1__Impl6912);
            rule__XplatformResource__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXplatformResourceAccess().getTypesAssignment_1()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3450:1: ( ( rule__XplatformResource__TypesAssignment_1 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3451:1: ( rule__XplatformResource__TypesAssignment_1 )*
            {
             before(grammarAccess.getXplatformResourceAccess().getTypesAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3452:1: ( rule__XplatformResource__TypesAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=38 && LA26_0<=39)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3452:2: rule__XplatformResource__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__XplatformResource__TypesAssignment_1_in_rule__XplatformResource__Group__1__Impl6924);
            	    rule__XplatformResource__TypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getXplatformResourceAccess().getTypesAssignment_1()); 

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
    // $ANTLR end "rule__XplatformResource__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3467:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3471:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3472:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__06961);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__06964);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3479:1: rule__Platform__Group__0__Impl : ( 'platform' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3483:1: ( ( 'platform' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3484:1: ( 'platform' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3484:1: ( 'platform' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3485:1: 'platform'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Platform__Group__0__Impl6992); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3498:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3502:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3503:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__17023);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__17026);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3510:1: rule__Platform__Group__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3514:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3515:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3515:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3516:1: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Platform__Group__1__Impl7054); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3529:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3533:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3534:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__27085);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__27088);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3541:1: rule__Platform__Group__2__Impl : ( ( ( rule__Platform__PlatformsAssignment_2 ) ) ( ( rule__Platform__PlatformsAssignment_2 )* ) ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3545:1: ( ( ( ( rule__Platform__PlatformsAssignment_2 ) ) ( ( rule__Platform__PlatformsAssignment_2 )* ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3546:1: ( ( ( rule__Platform__PlatformsAssignment_2 ) ) ( ( rule__Platform__PlatformsAssignment_2 )* ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3546:1: ( ( ( rule__Platform__PlatformsAssignment_2 ) ) ( ( rule__Platform__PlatformsAssignment_2 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3547:1: ( ( rule__Platform__PlatformsAssignment_2 ) ) ( ( rule__Platform__PlatformsAssignment_2 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3547:1: ( ( rule__Platform__PlatformsAssignment_2 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3548:1: ( rule__Platform__PlatformsAssignment_2 )
            {
             before(grammarAccess.getPlatformAccess().getPlatformsAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3549:1: ( rule__Platform__PlatformsAssignment_2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3549:2: rule__Platform__PlatformsAssignment_2
            {
            pushFollow(FOLLOW_rule__Platform__PlatformsAssignment_2_in_rule__Platform__Group__2__Impl7117);
            rule__Platform__PlatformsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getPlatformsAssignment_2()); 

            }

            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3552:1: ( ( rule__Platform__PlatformsAssignment_2 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3553:1: ( rule__Platform__PlatformsAssignment_2 )*
            {
             before(grammarAccess.getPlatformAccess().getPlatformsAssignment_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3554:1: ( rule__Platform__PlatformsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3554:2: rule__Platform__PlatformsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Platform__PlatformsAssignment_2_in_rule__Platform__Group__2__Impl7129);
            	    rule__Platform__PlatformsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getPlatformsAssignment_2()); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3565:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3569:1: ( rule__Platform__Group__3__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3570:2: rule__Platform__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__37162);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3576:1: rule__Platform__Group__3__Impl : ( '}' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3580:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3581:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3581:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3582:1: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Platform__Group__3__Impl7190); 
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


    // $ANTLR start "rule__EnumInstance__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3603:1: rule__EnumInstance__Group__0 : rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 ;
    public final void rule__EnumInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3607:1: ( rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3608:2: rule__EnumInstance__Group__0__Impl rule__EnumInstance__Group__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__07229);
            rule__EnumInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__07232);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3615:1: rule__EnumInstance__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3619:1: ( ( 'enum' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3620:1: ( 'enum' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3620:1: ( 'enum' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3621:1: 'enum'
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__EnumInstance__Group__0__Impl7260); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3634:1: rule__EnumInstance__Group__1 : rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 ;
    public final void rule__EnumInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3638:1: ( rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3639:2: rule__EnumInstance__Group__1__Impl rule__EnumInstance__Group__2
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__17291);
            rule__EnumInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__17294);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3646:1: rule__EnumInstance__Group__1__Impl : ( ( rule__EnumInstance__EnumNameAssignment_1 ) ) ;
    public final void rule__EnumInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3650:1: ( ( ( rule__EnumInstance__EnumNameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3651:1: ( ( rule__EnumInstance__EnumNameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3651:1: ( ( rule__EnumInstance__EnumNameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3652:1: ( rule__EnumInstance__EnumNameAssignment_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3653:1: ( rule__EnumInstance__EnumNameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3653:2: rule__EnumInstance__EnumNameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__EnumNameAssignment_1_in_rule__EnumInstance__Group__1__Impl7321);
            rule__EnumInstance__EnumNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumInstanceAccess().getEnumNameAssignment_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3663:1: rule__EnumInstance__Group__2 : rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 ;
    public final void rule__EnumInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3667:1: ( rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3668:2: rule__EnumInstance__Group__2__Impl rule__EnumInstance__Group__3
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__27351);
            rule__EnumInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__27354);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3675:1: rule__EnumInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3679:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3680:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3680:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3681:1: '{'
            {
             before(grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__EnumInstance__Group__2__Impl7382); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3694:1: rule__EnumInstance__Group__3 : rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 ;
    public final void rule__EnumInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3698:1: ( rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3699:2: rule__EnumInstance__Group__3__Impl rule__EnumInstance__Group__4
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__37413);
            rule__EnumInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__37416);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3706:1: rule__EnumInstance__Group__3__Impl : ( ( rule__EnumInstance__ValuesAssignment_3 ) ) ;
    public final void rule__EnumInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3710:1: ( ( ( rule__EnumInstance__ValuesAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3711:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3711:1: ( ( rule__EnumInstance__ValuesAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3712:1: ( rule__EnumInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3713:1: ( rule__EnumInstance__ValuesAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3713:2: rule__EnumInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl7443);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3723:1: rule__EnumInstance__Group__4 : rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 ;
    public final void rule__EnumInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3727:1: ( rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3728:2: rule__EnumInstance__Group__4__Impl rule__EnumInstance__Group__5
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__47473);
            rule__EnumInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__47476);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3735:1: rule__EnumInstance__Group__4__Impl : ( ( rule__EnumInstance__Group_4__0 )* ) ;
    public final void rule__EnumInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3739:1: ( ( ( rule__EnumInstance__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3740:1: ( ( rule__EnumInstance__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3740:1: ( ( rule__EnumInstance__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3741:1: ( rule__EnumInstance__Group_4__0 )*
            {
             before(grammarAccess.getEnumInstanceAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3742:1: ( rule__EnumInstance__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3742:2: rule__EnumInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl7503);
            	    rule__EnumInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3752:1: rule__EnumInstance__Group__5 : rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 ;
    public final void rule__EnumInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3756:1: ( rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3757:2: rule__EnumInstance__Group__5__Impl rule__EnumInstance__Group__6
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__57534);
            rule__EnumInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__57537);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3764:1: rule__EnumInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__EnumInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3768:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3769:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3769:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3770:1: ( ',' )?
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3771:1: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3772:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__EnumInstance__Group__5__Impl7566); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3783:1: rule__EnumInstance__Group__6 : rule__EnumInstance__Group__6__Impl ;
    public final void rule__EnumInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3787:1: ( rule__EnumInstance__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3788:2: rule__EnumInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__67599);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3794:1: rule__EnumInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__EnumInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3798:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3799:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3799:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3800:1: '}'
            {
             before(grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__EnumInstance__Group__6__Impl7627); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3827:1: rule__EnumInstance__Group_4__0 : rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 ;
    public final void rule__EnumInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3831:1: ( rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3832:2: rule__EnumInstance__Group_4__0__Impl rule__EnumInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__07672);
            rule__EnumInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__07675);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3839:1: rule__EnumInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3843:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3844:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3844:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3845:1: ','
            {
             before(grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__EnumInstance__Group_4__0__Impl7703); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3858:1: rule__EnumInstance__Group_4__1 : rule__EnumInstance__Group_4__1__Impl ;
    public final void rule__EnumInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3862:1: ( rule__EnumInstance__Group_4__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3863:2: rule__EnumInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__17734);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3869:1: rule__EnumInstance__Group_4__1__Impl : ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3873:1: ( ( ( rule__EnumInstance__ValuesAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3874:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3874:1: ( ( rule__EnumInstance__ValuesAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3875:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3876:1: ( rule__EnumInstance__ValuesAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3876:2: rule__EnumInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl7761);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3890:1: rule__MapInstance__Group__0 : rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 ;
    public final void rule__MapInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3894:1: ( rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3895:2: rule__MapInstance__Group__0__Impl rule__MapInstance__Group__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__07795);
            rule__MapInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__07798);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3902:1: rule__MapInstance__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3906:1: ( ( 'map' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3907:1: ( 'map' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3907:1: ( 'map' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3908:1: 'map'
            {
             before(grammarAccess.getMapInstanceAccess().getMapKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__MapInstance__Group__0__Impl7826); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3921:1: rule__MapInstance__Group__1 : rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 ;
    public final void rule__MapInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3925:1: ( rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3926:2: rule__MapInstance__Group__1__Impl rule__MapInstance__Group__2
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__17857);
            rule__MapInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__17860);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3933:1: rule__MapInstance__Group__1__Impl : ( ( rule__MapInstance__MapNameAssignment_1 ) ) ;
    public final void rule__MapInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3937:1: ( ( ( rule__MapInstance__MapNameAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3938:1: ( ( rule__MapInstance__MapNameAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3938:1: ( ( rule__MapInstance__MapNameAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3939:1: ( rule__MapInstance__MapNameAssignment_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getMapNameAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3940:1: ( rule__MapInstance__MapNameAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3940:2: rule__MapInstance__MapNameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapInstance__MapNameAssignment_1_in_rule__MapInstance__Group__1__Impl7887);
            rule__MapInstance__MapNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getMapNameAssignment_1()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3950:1: rule__MapInstance__Group__2 : rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 ;
    public final void rule__MapInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3954:1: ( rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3955:2: rule__MapInstance__Group__2__Impl rule__MapInstance__Group__3
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__27917);
            rule__MapInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__27920);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3962:1: rule__MapInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__MapInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3966:1: ( ( '{' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3967:1: ( '{' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3967:1: ( '{' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3968:1: '{'
            {
             before(grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__MapInstance__Group__2__Impl7948); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3981:1: rule__MapInstance__Group__3 : rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 ;
    public final void rule__MapInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3985:1: ( rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3986:2: rule__MapInstance__Group__3__Impl rule__MapInstance__Group__4
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__37979);
            rule__MapInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__37982);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3993:1: rule__MapInstance__Group__3__Impl : ( ( rule__MapInstance__ValuesAssignment_3 ) ) ;
    public final void rule__MapInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3997:1: ( ( ( rule__MapInstance__ValuesAssignment_3 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3998:1: ( ( rule__MapInstance__ValuesAssignment_3 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3998:1: ( ( rule__MapInstance__ValuesAssignment_3 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:3999:1: ( rule__MapInstance__ValuesAssignment_3 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4000:1: ( rule__MapInstance__ValuesAssignment_3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4000:2: rule__MapInstance__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_3_in_rule__MapInstance__Group__3__Impl8009);
            rule__MapInstance__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getValuesAssignment_3()); 

            }


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4010:1: rule__MapInstance__Group__4 : rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 ;
    public final void rule__MapInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4014:1: ( rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4015:2: rule__MapInstance__Group__4__Impl rule__MapInstance__Group__5
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__48039);
            rule__MapInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__48042);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4022:1: rule__MapInstance__Group__4__Impl : ( ( rule__MapInstance__Group_4__0 )* ) ;
    public final void rule__MapInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4026:1: ( ( ( rule__MapInstance__Group_4__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4027:1: ( ( rule__MapInstance__Group_4__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4027:1: ( ( rule__MapInstance__Group_4__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4028:1: ( rule__MapInstance__Group_4__0 )*
            {
             before(grammarAccess.getMapInstanceAccess().getGroup_4()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4029:1: ( rule__MapInstance__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_ID) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4029:2: rule__MapInstance__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl8069);
            	    rule__MapInstance__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4039:1: rule__MapInstance__Group__5 : rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 ;
    public final void rule__MapInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4043:1: ( rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4044:2: rule__MapInstance__Group__5__Impl rule__MapInstance__Group__6
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__58100);
            rule__MapInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__58103);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4051:1: rule__MapInstance__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__MapInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4055:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4056:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4056:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4057:1: ( ',' )?
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_5()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4058:1: ( ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4059:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__MapInstance__Group__5__Impl8132); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4070:1: rule__MapInstance__Group__6 : rule__MapInstance__Group__6__Impl ;
    public final void rule__MapInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4074:1: ( rule__MapInstance__Group__6__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4075:2: rule__MapInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__68165);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4081:1: rule__MapInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__MapInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4085:1: ( ( '}' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4086:1: ( '}' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4086:1: ( '}' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4087:1: '}'
            {
             before(grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__MapInstance__Group__6__Impl8193); 
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


    // $ANTLR start "rule__MapInstance__Group_4__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4114:1: rule__MapInstance__Group_4__0 : rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 ;
    public final void rule__MapInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4118:1: ( rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4119:2: rule__MapInstance__Group_4__0__Impl rule__MapInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__08238);
            rule__MapInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__08241);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4126:1: rule__MapInstance__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MapInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4130:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4131:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4131:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4132:1: ','
            {
             before(grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__MapInstance__Group_4__0__Impl8269); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4145:1: rule__MapInstance__Group_4__1 : rule__MapInstance__Group_4__1__Impl ;
    public final void rule__MapInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4149:1: ( rule__MapInstance__Group_4__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4150:2: rule__MapInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__18300);
            rule__MapInstance__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4156:1: rule__MapInstance__Group_4__1__Impl : ( ( rule__MapInstance__ValuesAssignment_4_1 ) ) ;
    public final void rule__MapInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4160:1: ( ( ( rule__MapInstance__ValuesAssignment_4_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4161:1: ( ( rule__MapInstance__ValuesAssignment_4_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4161:1: ( ( rule__MapInstance__ValuesAssignment_4_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4162:1: ( rule__MapInstance__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4163:1: ( rule__MapInstance__ValuesAssignment_4_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4163:2: rule__MapInstance__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MapInstance__ValuesAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl8327);
            rule__MapInstance__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringList__Group__0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4177:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4181:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4182:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__08361);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__08364);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4189:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4193:1: ( ( '[' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4194:1: ( '[' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4194:1: ( '[' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4195:1: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__StringList__Group__0__Impl8392); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4208:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4212:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4213:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__18423);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__18426);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4220:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4224:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4225:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4225:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4226:1: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4227:1: ( rule__StringList__ValuesAssignment_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4227:2: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl8453);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4237:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4241:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4242:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__28483);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__28486);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4249:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4253:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4254:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4254:1: ( ( rule__StringList__Group_2__0 )* )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4255:1: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4256:1: ( rule__StringList__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_STRING) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4256:2: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl8513);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4266:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl rule__StringList__Group__4 ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4270:1: ( rule__StringList__Group__3__Impl rule__StringList__Group__4 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4271:2: rule__StringList__Group__3__Impl rule__StringList__Group__4
            {
            pushFollow(FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__38544);
            rule__StringList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__38547);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4278:1: rule__StringList__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4282:1: ( ( ( ',' )? ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4283:1: ( ( ',' )? )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4283:1: ( ( ',' )? )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4284:1: ( ',' )?
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_3()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4285:1: ( ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4286:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__StringList__Group__3__Impl8576); 

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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4297:1: rule__StringList__Group__4 : rule__StringList__Group__4__Impl ;
    public final void rule__StringList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4301:1: ( rule__StringList__Group__4__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4302:2: rule__StringList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__48609);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4308:1: rule__StringList__Group__4__Impl : ( ']' ) ;
    public final void rule__StringList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4312:1: ( ( ']' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4313:1: ( ']' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4313:1: ( ']' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4314:1: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__StringList__Group__4__Impl8637); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4337:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4341:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4342:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__08678);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__08681);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4349:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4353:1: ( ( ',' ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4354:1: ( ',' )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4354:1: ( ',' )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4355:1: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__StringList__Group_2__0__Impl8709); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4368:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4372:1: ( rule__StringList__Group_2__1__Impl )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4373:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18740);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4379:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4383:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4384:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4384:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4385:1: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4386:1: ( rule__StringList__ValuesAssignment_2_1 )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4386:2: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8767);
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


    // $ANTLR start "rule__Xplatform__ResourceAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4402:1: rule__Xplatform__ResourceAssignment_0 : ( ruleXplatformResource ) ;
    public final void rule__Xplatform__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4406:1: ( ( ruleXplatformResource ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4407:1: ( ruleXplatformResource )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4407:1: ( ruleXplatformResource )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4408:1: ruleXplatformResource
            {
             before(grammarAccess.getXplatformAccess().getResourceXplatformResourceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleXplatformResource_in_rule__Xplatform__ResourceAssignment_08807);
            ruleXplatformResource();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getResourceXplatformResourceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__ResourceAssignment_0"


    // $ANTLR start "rule__Xplatform__NameAssignment_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4417:1: rule__Xplatform__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Xplatform__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4421:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4422:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4422:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4423:1: RULE_ID
            {
             before(grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Xplatform__NameAssignment_28838); 
             after(grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__NameAssignment_2"


    // $ANTLR start "rule__Xplatform__MethodAssignment_4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4432:1: rule__Xplatform__MethodAssignment_4 : ( RULE_RESTFUL_METHODS ) ;
    public final void rule__Xplatform__MethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4436:1: ( ( RULE_RESTFUL_METHODS ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4437:1: ( RULE_RESTFUL_METHODS )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4437:1: ( RULE_RESTFUL_METHODS )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4438:1: RULE_RESTFUL_METHODS
            {
             before(grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_4_0()); 
            match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_rule__Xplatform__MethodAssignment_48869); 
             after(grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__MethodAssignment_4"


    // $ANTLR start "rule__Xplatform__UriAssignment_6"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4447:1: rule__Xplatform__UriAssignment_6 : ( ruleURI ) ;
    public final void rule__Xplatform__UriAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4451:1: ( ( ruleURI ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4452:1: ( ruleURI )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4452:1: ( ruleURI )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4453:1: ruleURI
            {
             before(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__Xplatform__UriAssignment_68900);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__UriAssignment_6"


    // $ANTLR start "rule__Xplatform__RequestHeadersAssignment_7_4"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4462:1: rule__Xplatform__RequestHeadersAssignment_7_4 : ( ruleXplatformHeader ) ;
    public final void rule__Xplatform__RequestHeadersAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4466:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4467:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4467:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4468:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__Xplatform__RequestHeadersAssignment_7_48931);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__RequestHeadersAssignment_7_4"


    // $ANTLR start "rule__Xplatform__ResponseHeadersAssignment_7_5_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4477:1: rule__Xplatform__ResponseHeadersAssignment_7_5_2 : ( ruleXplatformHeader ) ;
    public final void rule__Xplatform__ResponseHeadersAssignment_7_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4481:1: ( ( ruleXplatformHeader ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4482:1: ( ruleXplatformHeader )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4482:1: ( ruleXplatformHeader )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4483:1: ruleXplatformHeader
            {
             before(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_7_5_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_rule__Xplatform__ResponseHeadersAssignment_7_5_28962);
            ruleXplatformHeader();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_7_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__ResponseHeadersAssignment_7_5_2"


    // $ANTLR start "rule__Xplatform__JsonToClientAssignment_8_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4492:1: rule__Xplatform__JsonToClientAssignment_8_2 : ( ruleXplatformJson ) ;
    public final void rule__Xplatform__JsonToClientAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4496:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4497:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4497:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4498:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToClientAssignment_8_28993);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__JsonToClientAssignment_8_2"


    // $ANTLR start "rule__Xplatform__JsonToServerAssignment_8_3_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4507:1: rule__Xplatform__JsonToServerAssignment_8_3_2 : ( ruleXplatformJson ) ;
    public final void rule__Xplatform__JsonToServerAssignment_8_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4511:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4512:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4512:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4513:1: ruleXplatformJson
            {
             before(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_8_3_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToServerAssignment_8_3_29024);
            ruleXplatformJson();

            state._fsp--;

             after(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_8_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xplatform__JsonToServerAssignment_8_3_2"


    // $ANTLR start "rule__URI__UriParameterAssignment_1_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4522:1: rule__URI__UriParameterAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__URI__UriParameterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4526:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4527:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4527:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4528:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getUriParameterIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__UriParameterAssignment_1_19055); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4537:1: rule__XplatformHeader__HeaderKeyValuesAssignment_2 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4541:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4542:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4542:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4543:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_29086);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4552:1: rule__XplatformHeader__HeaderKeyValuesAssignment_3_1 : ( ruleXplatformHeaderKeyValuePair ) ;
    public final void rule__XplatformHeader__HeaderKeyValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4556:1: ( ( ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4557:1: ( ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4557:1: ( ruleXplatformHeaderKeyValuePair )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4558:1: ruleXplatformHeaderKeyValuePair
            {
             before(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_3_19117);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4567:1: rule__XplatformHeaderKeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4571:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4572:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4572:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4573:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_09148); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4582:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4586:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4587:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4587:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4588:1: RULE_STRING
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_09179); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4597:1: rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1 : ( RULE_XPLATFORM_HEADER_PARAMETER ) ;
    public final void rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4601:1: ( ( RULE_XPLATFORM_HEADER_PARAMETER ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4602:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4602:1: ( RULE_XPLATFORM_HEADER_PARAMETER )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4603:1: RULE_XPLATFORM_HEADER_PARAMETER
            {
             before(grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
            match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_19210); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4612:1: rule__XplatformJson__TypeAssignment_0_1 : ( ruleJsonType ) ;
    public final void rule__XplatformJson__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4616:1: ( ( ruleJsonType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4617:1: ( ruleJsonType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4617:1: ( ruleJsonType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4618:1: ruleJsonType
            {
             before(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_19241);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4627:1: rule__XplatformJson__MetaTypeAssignment_1 : ( ruleJsonMetaType ) ;
    public final void rule__XplatformJson__MetaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4631:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4632:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4632:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4633:1: ruleJsonMetaType
            {
             before(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_19272);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4642:1: rule__XplatformJson__CompositeAssignment_2_0 : ( ruleJsonObject ) ;
    public final void rule__XplatformJson__CompositeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4646:1: ( ( ruleJsonObject ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4647:1: ( ruleJsonObject )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4647:1: ( ruleJsonObject )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4648:1: ruleJsonObject
            {
             before(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleJsonObject_in_rule__XplatformJson__CompositeAssignment_2_09303);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4657:1: rule__JsonMetaArray__MetaTypeAssignment_1 : ( ruleJsonMetaType ) ;
    public final void rule__JsonMetaArray__MetaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4661:1: ( ( ruleJsonMetaType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4662:1: ( ruleJsonMetaType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4662:1: ( ruleJsonMetaType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4663:1: ruleJsonMetaType
            {
             before(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_19334);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4672:1: rule__JsonMetaType__ScalarAssignment_0 : ( ruleJsonMetaScalarType ) ;
    public final void rule__JsonMetaType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4676:1: ( ( ruleJsonMetaScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4677:1: ( ruleJsonMetaScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4677:1: ( ruleJsonMetaScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4678:1: ruleJsonMetaScalarType
            {
             before(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_09365);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4687:1: rule__JsonMetaType__CompositeAssignment_1 : ( ruleJsonMetaArray ) ;
    public final void rule__JsonMetaType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4691:1: ( ( ruleJsonMetaArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4692:1: ( ruleJsonMetaArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4692:1: ( ruleJsonMetaArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4693:1: ruleJsonMetaArray
            {
             before(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_19396);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4702:1: rule__JsonCompositeType__CompositeAssignment : ( ruleJsonArray ) ;
    public final void rule__JsonCompositeType__CompositeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4706:1: ( ( ruleJsonArray ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4707:1: ( ruleJsonArray )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4707:1: ( ruleJsonArray )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4708:1: ruleJsonArray
            {
             before(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment9427);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4717:1: rule__JsonType__ScalarAssignment_0 : ( ruleJsonScalarType ) ;
    public final void rule__JsonType__ScalarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4721:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4722:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4722:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4723:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_09458);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4732:1: rule__JsonType__CompositeAssignment_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonType__CompositeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4736:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4737:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4737:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4738:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_19489);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4747:1: rule__JsonScalarType__BoolAssignment_0 : ( RULE_JSON_LITERAL_BOOLEAN ) ;
    public final void rule__JsonScalarType__BoolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4751:1: ( ( RULE_JSON_LITERAL_BOOLEAN ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4752:1: ( RULE_JSON_LITERAL_BOOLEAN )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4752:1: ( RULE_JSON_LITERAL_BOOLEAN )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4753:1: RULE_JSON_LITERAL_BOOLEAN
            {
             before(grammarAccess.getJsonScalarTypeAccess().getBoolJSON_LITERAL_BOOLEANTerminalRuleCall_0_0()); 
            match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_09520); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4762:1: rule__JsonScalarType__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__JsonScalarType__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4766:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4767:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4767:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4768:1: RULE_STRING
            {
             before(grammarAccess.getJsonScalarTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_19551); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4777:1: rule__JsonScalarType__NumberAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__JsonScalarType__NumberAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4781:1: ( ( RULE_INT ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4782:1: ( RULE_INT )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4782:1: ( RULE_INT )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4783:1: RULE_INT
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNumberINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_09582); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4792:1: rule__JsonScalarType__NullAssignment_3 : ( RULE_JSON_LITERAL_NULL ) ;
    public final void rule__JsonScalarType__NullAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4796:1: ( ( RULE_JSON_LITERAL_NULL ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4797:1: ( RULE_JSON_LITERAL_NULL )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4797:1: ( RULE_JSON_LITERAL_NULL )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4798:1: RULE_JSON_LITERAL_NULL
            {
             before(grammarAccess.getJsonScalarTypeAccess().getNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 
            match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_39613); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4807:1: rule__JsonArray__ElementsAssignment_0_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4811:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4812:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4812:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4813:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_19644);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4822:1: rule__JsonArray__ElementsAssignment_0_2_1 : ( ruleJsonScalarType ) ;
    public final void rule__JsonArray__ElementsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4826:1: ( ( ruleJsonScalarType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4827:1: ( ruleJsonScalarType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4827:1: ( ruleJsonScalarType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4828:1: ruleJsonScalarType
            {
             before(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_2_19675);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4837:1: rule__JsonArray__CompositesAssignment_1_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4841:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4842:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4842:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4843:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_19706);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4852:1: rule__JsonArray__CompositesAssignment_1_2_1 : ( ruleJsonCompositeType ) ;
    public final void rule__JsonArray__CompositesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4856:1: ( ( ruleJsonCompositeType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4857:1: ( ruleJsonCompositeType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4857:1: ( ruleJsonCompositeType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4858:1: ruleJsonCompositeType
            {
             before(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_2_19737);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4867:1: rule__JsonObject__KeysAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__JsonObject__KeysAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4871:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4872:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4872:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4873:1: RULE_STRING
            {
             before(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_1_09768); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4882:1: rule__JsonObject__ValuesAssignment_1_2 : ( ruleXplatformJson ) ;
    public final void rule__JsonObject__ValuesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4886:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4887:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4887:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4888:1: ruleXplatformJson
            {
             before(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_1_29799);
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4897:1: rule__JsonObject__KeysAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__JsonObject__KeysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4901:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4902:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4902:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4903:1: RULE_STRING
            {
             before(grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_2_19830); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4912:1: rule__JsonObject__ValuesAssignment_2_3 : ( ruleXplatformJson ) ;
    public final void rule__JsonObject__ValuesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4916:1: ( ( ruleXplatformJson ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4917:1: ( ruleXplatformJson )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4917:1: ( ruleXplatformJson )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4918:1: ruleXplatformJson
            {
             before(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_2_39861);
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


    // $ANTLR start "rule__XplatformResource__PlatformAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4927:1: rule__XplatformResource__PlatformAssignment_0 : ( rulePlatform ) ;
    public final void rule__XplatformResource__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4931:1: ( ( rulePlatform ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4932:1: ( rulePlatform )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4932:1: ( rulePlatform )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4933:1: rulePlatform
            {
             before(grammarAccess.getXplatformResourceAccess().getPlatformPlatformParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePlatform_in_rule__XplatformResource__PlatformAssignment_09892);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getXplatformResourceAccess().getPlatformPlatformParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformResource__PlatformAssignment_0"


    // $ANTLR start "rule__XplatformResource__TypesAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4942:1: rule__XplatformResource__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__XplatformResource__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4946:1: ( ( ruleType ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4947:1: ( ruleType )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4947:1: ( ruleType )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4948:1: ruleType
            {
             before(grammarAccess.getXplatformResourceAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__XplatformResource__TypesAssignment_19923);
            ruleType();

            state._fsp--;

             after(grammarAccess.getXplatformResourceAccess().getTypesTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XplatformResource__TypesAssignment_1"


    // $ANTLR start "rule__Platform__PlatformsAssignment_2"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4957:1: rule__Platform__PlatformsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Platform__PlatformsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4961:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4962:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4962:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4963:1: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getPlatformsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Platform__PlatformsAssignment_29954); 
             after(grammarAccess.getPlatformAccess().getPlatformsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__PlatformsAssignment_2"


    // $ANTLR start "rule__EnumInstance__EnumNameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4972:1: rule__EnumInstance__EnumNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__EnumNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4976:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4977:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4977:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4978:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getEnumNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__EnumNameAssignment_19985); 
             after(grammarAccess.getEnumInstanceAccess().getEnumNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumInstance__EnumNameAssignment_1"


    // $ANTLR start "rule__EnumInstance__ValuesAssignment_3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4987:1: rule__EnumInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4991:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4992:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4992:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:4993:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_310016); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5002:1: rule__EnumInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5006:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5007:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5007:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5008:1: RULE_ID
            {
             before(grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_110047); 
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


    // $ANTLR start "rule__MapInstance__MapNameAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5017:1: rule__MapInstance__MapNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__MapNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5021:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5022:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5022:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5023:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getMapNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__MapNameAssignment_110078); 
             after(grammarAccess.getMapInstanceAccess().getMapNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__MapNameAssignment_1"


    // $ANTLR start "rule__MapInstance__ValuesAssignment_3"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5032:1: rule__MapInstance__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__MapInstance__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5036:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5037:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5037:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5038:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__ValuesAssignment_310109); 
             after(grammarAccess.getMapInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__ValuesAssignment_3"


    // $ANTLR start "rule__MapInstance__ValuesAssignment_4_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5047:1: rule__MapInstance__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__MapInstance__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5051:1: ( ( RULE_ID ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5052:1: ( RULE_ID )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5052:1: ( RULE_ID )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5053:1: RULE_ID
            {
             before(grammarAccess.getMapInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapInstance__ValuesAssignment_4_110140); 
             after(grammarAccess.getMapInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapInstance__ValuesAssignment_4_1"


    // $ANTLR start "rule__StringList__ValuesAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5062:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5066:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5067:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5067:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5068:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_110171); 
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
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5077:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5081:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5082:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5082:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5083:1: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_110202); 
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


    // $ANTLR start "rule__ValueType__StringAssignment_0"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5094:1: rule__ValueType__StringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ValueType__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5098:1: ( ( RULE_STRING ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5099:1: ( RULE_STRING )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5099:1: ( RULE_STRING )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5100:1: RULE_STRING
            {
             before(grammarAccess.getValueTypeAccess().getStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValueType__StringAssignment_010235); 
             after(grammarAccess.getValueTypeAccess().getStringSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__StringAssignment_0"


    // $ANTLR start "rule__ValueType__StringListAssignment_1"
    // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5109:1: rule__ValueType__StringListAssignment_1 : ( ruleStringList ) ;
    public final void rule__ValueType__StringListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5113:1: ( ( ruleStringList ) )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5114:1: ( ruleStringList )
            {
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5114:1: ( ruleStringList )
            // ../xplatform.ui/src-gen/nl/sison/ui/contentassist/antlr/internal/InternalXplatform.g:5115:1: ruleStringList
            {
             before(grammarAccess.getValueTypeAccess().getStringListStringListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStringList_in_rule__ValueType__StringListAssignment_110266);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getValueTypeAccess().getStringListStringListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__StringListAssignment_1"

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
    public static final BitSet FOLLOW_ruleXplatformResource_in_entryRuleXplatformResource841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformResource848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResource__Group__0_in_ruleXplatformResource874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0_in_rulePlatform934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0_in_ruleEnumInstance1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0_in_ruleMapInstance1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0_in_ruleStringList1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_entryRuleValueType1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueType1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__Alternatives_in_ruleValueType1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_0_in_rule__XplatformHeaderKeyValuePair__Alternatives_21272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_1_in_rule__XplatformHeaderKeyValuePair__Alternatives_21290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0_in_rule__XplatformJson__Alternatives1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__MetaTypeAssignment_1_in_rule__XplatformJson__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__0_in_rule__XplatformJson__Alternatives1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JsonMetaScalarType__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JsonMetaScalarType__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JsonMetaScalarType__Alternatives1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__ScalarAssignment_0_in_rule__JsonMetaType__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaType__CompositeAssignment_1_in_rule__JsonMetaType__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__ScalarAssignment_0_in_rule__JsonType__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonType__CompositeAssignment_1_in_rule__JsonType__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__BoolAssignment_0_in_rule__JsonScalarType__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__StringAssignment_1_in_rule__JsonScalarType__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0_in_rule__JsonScalarType__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NullAssignment_3_in_rule__JsonScalarType__Alternatives1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0_in_rule__JsonArray__Alternatives1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0_in_rule__JsonArray__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_rule__Type__Alternatives1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_rule__Type__Alternatives1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__StringAssignment_0_in_rule__ValueType__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__StringListAssignment_1_in_rule__ValueType__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__0__Impl_in_rule__Xplatform__Group__01805 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1_in_rule__Xplatform__Group__01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__ResourceAssignment_0_in_rule__Xplatform__Group__0__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__1__Impl_in_rule__Xplatform__Group__11865 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__2_in_rule__Xplatform__Group__11868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Xplatform__Group__1__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__2__Impl_in_rule__Xplatform__Group__21927 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__3_in_rule__Xplatform__Group__21930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__NameAssignment_2_in_rule__Xplatform__Group__2__Impl1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__3__Impl_in_rule__Xplatform__Group__31987 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__4_in_rule__Xplatform__Group__31990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Xplatform__Group__3__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__4__Impl_in_rule__Xplatform__Group__42049 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__5_in_rule__Xplatform__Group__42052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__MethodAssignment_4_in_rule__Xplatform__Group__4__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__5__Impl_in_rule__Xplatform__Group__52109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__6_in_rule__Xplatform__Group__52112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Xplatform__Group__5__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__6__Impl_in_rule__Xplatform__Group__62171 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__7_in_rule__Xplatform__Group__62174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__UriAssignment_6_in_rule__Xplatform__Group__6__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__7__Impl_in_rule__Xplatform__Group__72231 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__8_in_rule__Xplatform__Group__72234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__0_in_rule__Xplatform__Group__7__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group__8__Impl_in_rule__Xplatform__Group__82292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__0_in_rule__Xplatform__Group__8__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__0__Impl_in_rule__Xplatform__Group_7__02368 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__1_in_rule__Xplatform__Group_7__02371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Xplatform__Group_7__0__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__1__Impl_in_rule__Xplatform__Group_7__12430 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__2_in_rule__Xplatform__Group_7__12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Xplatform__Group_7__1__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__2__Impl_in_rule__Xplatform__Group_7__22492 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__3_in_rule__Xplatform__Group_7__22495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Xplatform__Group_7__2__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__3__Impl_in_rule__Xplatform__Group_7__32554 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__4_in_rule__Xplatform__Group_7__32557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Xplatform__Group_7__3__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__4__Impl_in_rule__Xplatform__Group_7__42616 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__5_in_rule__Xplatform__Group_7__42619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__RequestHeadersAssignment_7_4_in_rule__Xplatform__Group_7__4__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7__5__Impl_in_rule__Xplatform__Group_7__52676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_5__0_in_rule__Xplatform__Group_7__5__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_5__0__Impl_in_rule__Xplatform__Group_7_5__02746 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_5__1_in_rule__Xplatform__Group_7_5__02749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Xplatform__Group_7_5__0__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_5__1__Impl_in_rule__Xplatform__Group_7_5__12808 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_5__2_in_rule__Xplatform__Group_7_5__12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Xplatform__Group_7_5__1__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_7_5__2__Impl_in_rule__Xplatform__Group_7_5__22870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__ResponseHeadersAssignment_7_5_2_in_rule__Xplatform__Group_7_5__2__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__0__Impl_in_rule__Xplatform__Group_8__02933 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__1_in_rule__Xplatform__Group_8__02936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Xplatform__Group_8__0__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__1__Impl_in_rule__Xplatform__Group_8__12995 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__2_in_rule__Xplatform__Group_8__12998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Xplatform__Group_8__1__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__2__Impl_in_rule__Xplatform__Group_8__23057 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__3_in_rule__Xplatform__Group_8__23060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__JsonToClientAssignment_8_2_in_rule__Xplatform__Group_8__2__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8__3__Impl_in_rule__Xplatform__Group_8__33117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8_3__0_in_rule__Xplatform__Group_8__3__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8_3__0__Impl_in_rule__Xplatform__Group_8_3__03183 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8_3__1_in_rule__Xplatform__Group_8_3__03186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Xplatform__Group_8_3__0__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8_3__1__Impl_in_rule__Xplatform__Group_8_3__13245 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8_3__2_in_rule__Xplatform__Group_8_3__13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Xplatform__Group_8_3__1__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__Group_8_3__2__Impl_in_rule__Xplatform__Group_8_3__23307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Xplatform__JsonToServerAssignment_8_3_2_in_rule__Xplatform__Group_8_3__2__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__03370 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__03373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3403 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group__0__Impl3416 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__13449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0_in_rule__URI__Group__1__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__0__Impl_in_rule__URI__Group_1__03511 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1_in_rule__URI__Group_1__03514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__URI__Group_1__0__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__1__Impl_in_rule__URI__Group_1__13573 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2_in_rule__URI__Group_1__13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__UriParameterAssignment_1_1_in_rule__URI__Group_1__1__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__2__Impl_in_rule__URI__Group_1__23633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3_in_rule__URI__Group_1__23636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__URI__Group_1__2__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_1__3__Impl_in_rule__URI__Group_1__33695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__URI__Group_1__3__Impl3723 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__0__Impl_in_rule__XplatformHeader__Group__03762 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1_in_rule__XplatformHeader__Group__03765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformHeader__Group__0__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__1__Impl_in_rule__XplatformHeader__Group__13824 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2_in_rule__XplatformHeader__Group__13827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__XplatformHeader__Group__1__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__2__Impl_in_rule__XplatformHeader__Group__23886 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3_in_rule__XplatformHeader__Group__23889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_2_in_rule__XplatformHeader__Group__2__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__3__Impl_in_rule__XplatformHeader__Group__33946 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4_in_rule__XplatformHeader__Group__33949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__0_in_rule__XplatformHeader__Group__3__Impl3976 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__4__Impl_in_rule__XplatformHeader__Group__44007 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5_in_rule__XplatformHeader__Group__44010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformHeader__Group__4__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__5__Impl_in_rule__XplatformHeader__Group__54072 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6_in_rule__XplatformHeader__Group__54075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__XplatformHeader__Group__5__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group__6__Impl_in_rule__XplatformHeader__Group__64134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformHeader__Group__6__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__0__Impl_in_rule__XplatformHeader__Group_3__04207 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__1_in_rule__XplatformHeader__Group_3__04210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__XplatformHeader__Group_3__0__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__Group_3__1__Impl_in_rule__XplatformHeader__Group_3__14269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeader__HeaderKeyValuesAssignment_3_1_in_rule__XplatformHeader__Group_3__1__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__0__Impl_in_rule__XplatformHeaderKeyValuePair__Group__04330 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1_in_rule__XplatformHeaderKeyValuePair__Group__04333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__KeyAssignment_0_in_rule__XplatformHeaderKeyValuePair__Group__0__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__1__Impl_in_rule__XplatformHeaderKeyValuePair__Group__14390 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2_in_rule__XplatformHeaderKeyValuePair__Group__14393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__XplatformHeaderKeyValuePair__Group__1__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Group__2__Impl_in_rule__XplatformHeaderKeyValuePair__Group__24452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformHeaderKeyValuePair__Alternatives_2_in_rule__XplatformHeaderKeyValuePair__Group__2__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__0__Impl_in_rule__XplatformJson__Group_0__04515 = new BitSet(new long[]{0x0000000400000D20L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1_in_rule__XplatformJson__Group_0__04518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformJson__Group_0__0__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_0__1__Impl_in_rule__XplatformJson__Group_0__14577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__TypeAssignment_0_1_in_rule__XplatformJson__Group_0__1__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__0__Impl_in_rule__XplatformJson__Group_2__04638 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__1_in_rule__XplatformJson__Group_2__04641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__CompositeAssignment_2_0_in_rule__XplatformJson__Group_2__0__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformJson__Group_2__1__Impl_in_rule__XplatformJson__Group_2__14698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__XplatformJson__Group_2__1__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__0__Impl_in_rule__JsonMetaArray__Group__04761 = new BitSet(new long[]{0x0000000400038000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1_in_rule__JsonMetaArray__Group__04764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonMetaArray__Group__0__Impl4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__1__Impl_in_rule__JsonMetaArray__Group__14823 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2_in_rule__JsonMetaArray__Group__14826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__MetaTypeAssignment_1_in_rule__JsonMetaArray__Group__1__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonMetaArray__Group__2__Impl_in_rule__JsonMetaArray__Group__24883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonMetaArray__Group__2__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__0__Impl_in_rule__JsonScalarType__Group_2__04948 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1_in_rule__JsonScalarType__Group_2__04951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__NumberAssignment_2_0_in_rule__JsonScalarType__Group_2__0__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2__1__Impl_in_rule__JsonScalarType__Group_2__15008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0_in_rule__JsonScalarType__Group_2__1__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__0__Impl_in_rule__JsonScalarType__Group_2_1__05070 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1_in_rule__JsonScalarType__Group_2_1__05073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JsonScalarType__Group_2_1__0__Impl5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonScalarType__Group_2_1__1__Impl_in_rule__JsonScalarType__Group_2_1__15132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__Group_2_1__1__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__0__Impl_in_rule__JsonArray__Group_0__05192 = new BitSet(new long[]{0x0000000000000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1_in_rule__JsonArray__Group_0__05195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_0__0__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__1__Impl_in_rule__JsonArray__Group_0__15254 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2_in_rule__JsonArray__Group_0__15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementsAssignment_0_1_in_rule__JsonArray__Group_0__1__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__2__Impl_in_rule__JsonArray__Group_0__25314 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3_in_rule__JsonArray__Group_0__25317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0_in_rule__JsonArray__Group_0__2__Impl5344 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__3__Impl_in_rule__JsonArray__Group_0__35375 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__4_in_rule__JsonArray__Group_0__35378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_0__3__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0__4__Impl_in_rule__JsonArray__Group_0__45440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group_0__4__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__0__Impl_in_rule__JsonArray__Group_0_2__05509 = new BitSet(new long[]{0x0000000000000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1_in_rule__JsonArray__Group_0_2__05512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_0_2__0__Impl5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_0_2__1__Impl_in_rule__JsonArray__Group_0_2__15571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__ElementsAssignment_0_2_1_in_rule__JsonArray__Group_0_2__1__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__0__Impl_in_rule__JsonArray__Group_1__05632 = new BitSet(new long[]{0x0000000400000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1_in_rule__JsonArray__Group_1__05635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JsonArray__Group_1__0__Impl5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__1__Impl_in_rule__JsonArray__Group_1__15694 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2_in_rule__JsonArray__Group_1__15697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositesAssignment_1_1_in_rule__JsonArray__Group_1__1__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__2__Impl_in_rule__JsonArray__Group_1__25754 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3_in_rule__JsonArray__Group_1__25757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0_in_rule__JsonArray__Group_1__2__Impl5784 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__3__Impl_in_rule__JsonArray__Group_1__35815 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__4_in_rule__JsonArray__Group_1__35818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_1__3__Impl5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1__4__Impl_in_rule__JsonArray__Group_1__45880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JsonArray__Group_1__4__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__0__Impl_in_rule__JsonArray__Group_1_2__05949 = new BitSet(new long[]{0x0000000400000D20L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1_in_rule__JsonArray__Group_1_2__05952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonArray__Group_1_2__0__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__Group_1_2__1__Impl_in_rule__JsonArray__Group_1_2__16011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonArray__CompositesAssignment_1_2_1_in_rule__JsonArray__Group_1_2__1__Impl6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__0__Impl_in_rule__JsonObject__Group__06072 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1_in_rule__JsonObject__Group__06075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__JsonObject__Group__0__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__1__Impl_in_rule__JsonObject__Group__16134 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2_in_rule__JsonObject__Group__16137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__0_in_rule__JsonObject__Group__1__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__2__Impl_in_rule__JsonObject__Group__26194 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3_in_rule__JsonObject__Group__26197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0_in_rule__JsonObject__Group__2__Impl6224 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__3__Impl_in_rule__JsonObject__Group__36255 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4_in_rule__JsonObject__Group__36258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonObject__Group__3__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group__4__Impl_in_rule__JsonObject__Group__46320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__JsonObject__Group__4__Impl6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__0__Impl_in_rule__JsonObject__Group_1__06389 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__1_in_rule__JsonObject__Group_1__06392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeysAssignment_1_0_in_rule__JsonObject__Group_1__0__Impl6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__1__Impl_in_rule__JsonObject__Group_1__16449 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__2_in_rule__JsonObject__Group_1__16452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JsonObject__Group_1__1__Impl6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_1__2__Impl_in_rule__JsonObject__Group_1__26511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__ValuesAssignment_1_2_in_rule__JsonObject__Group_1__2__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__0__Impl_in_rule__JsonObject__Group_2__06574 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1_in_rule__JsonObject__Group_2__06577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__JsonObject__Group_2__0__Impl6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__1__Impl_in_rule__JsonObject__Group_2__16636 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__2_in_rule__JsonObject__Group_2__16639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__KeysAssignment_2_1_in_rule__JsonObject__Group_2__1__Impl6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__2__Impl_in_rule__JsonObject__Group_2__26696 = new BitSet(new long[]{0x00000004A0038000L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__3_in_rule__JsonObject__Group_2__26699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JsonObject__Group_2__2__Impl6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__Group_2__3__Impl_in_rule__JsonObject__Group_2__36758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JsonObject__ValuesAssignment_2_3_in_rule__JsonObject__Group_2__3__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResource__Group__0__Impl_in_rule__XplatformResource__Group__06823 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__XplatformResource__Group__1_in_rule__XplatformResource__Group__06826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResource__PlatformAssignment_0_in_rule__XplatformResource__Group__0__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResource__Group__1__Impl_in_rule__XplatformResource__Group__16883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XplatformResource__TypesAssignment_1_in_rule__XplatformResource__Group__1__Impl6912 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_rule__XplatformResource__TypesAssignment_1_in_rule__XplatformResource__Group__1__Impl6924 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__0__Impl_in_rule__Platform__Group__06961 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__1_in_rule__Platform__Group__06964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Platform__Group__0__Impl6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__1__Impl_in_rule__Platform__Group__17023 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Platform__Group__2_in_rule__Platform__Group__17026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Platform__Group__1__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__Group__2__Impl_in_rule__Platform__Group__27085 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Platform__Group__3_in_rule__Platform__Group__27088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Platform__PlatformsAssignment_2_in_rule__Platform__Group__2__Impl7117 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Platform__PlatformsAssignment_2_in_rule__Platform__Group__2__Impl7129 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Platform__Group__3__Impl_in_rule__Platform__Group__37162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Platform__Group__3__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__0__Impl_in_rule__EnumInstance__Group__07229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1_in_rule__EnumInstance__Group__07232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EnumInstance__Group__0__Impl7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__1__Impl_in_rule__EnumInstance__Group__17291 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2_in_rule__EnumInstance__Group__17294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__EnumNameAssignment_1_in_rule__EnumInstance__Group__1__Impl7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__2__Impl_in_rule__EnumInstance__Group__27351 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3_in_rule__EnumInstance__Group__27354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumInstance__Group__2__Impl7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__3__Impl_in_rule__EnumInstance__Group__37413 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4_in_rule__EnumInstance__Group__37416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_3_in_rule__EnumInstance__Group__3__Impl7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__4__Impl_in_rule__EnumInstance__Group__47473 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5_in_rule__EnumInstance__Group__47476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0_in_rule__EnumInstance__Group__4__Impl7503 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__5__Impl_in_rule__EnumInstance__Group__57534 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6_in_rule__EnumInstance__Group__57537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EnumInstance__Group__5__Impl7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group__6__Impl_in_rule__EnumInstance__Group__67599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumInstance__Group__6__Impl7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__0__Impl_in_rule__EnumInstance__Group_4__07672 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1_in_rule__EnumInstance__Group_4__07675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EnumInstance__Group_4__0__Impl7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__Group_4__1__Impl_in_rule__EnumInstance__Group_4__17734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumInstance__ValuesAssignment_4_1_in_rule__EnumInstance__Group_4__1__Impl7761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__0__Impl_in_rule__MapInstance__Group__07795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1_in_rule__MapInstance__Group__07798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MapInstance__Group__0__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__1__Impl_in_rule__MapInstance__Group__17857 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2_in_rule__MapInstance__Group__17860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__MapNameAssignment_1_in_rule__MapInstance__Group__1__Impl7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__2__Impl_in_rule__MapInstance__Group__27917 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3_in_rule__MapInstance__Group__27920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MapInstance__Group__2__Impl7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__3__Impl_in_rule__MapInstance__Group__37979 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4_in_rule__MapInstance__Group__37982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_3_in_rule__MapInstance__Group__3__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__4__Impl_in_rule__MapInstance__Group__48039 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5_in_rule__MapInstance__Group__48042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0_in_rule__MapInstance__Group__4__Impl8069 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__5__Impl_in_rule__MapInstance__Group__58100 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6_in_rule__MapInstance__Group__58103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MapInstance__Group__5__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group__6__Impl_in_rule__MapInstance__Group__68165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MapInstance__Group__6__Impl8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__0__Impl_in_rule__MapInstance__Group_4__08238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1_in_rule__MapInstance__Group_4__08241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MapInstance__Group_4__0__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__Group_4__1__Impl_in_rule__MapInstance__Group_4__18300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapInstance__ValuesAssignment_4_1_in_rule__MapInstance__Group_4__1__Impl8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__0__Impl_in_rule__StringList__Group__08361 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__StringList__Group__1_in_rule__StringList__Group__08364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringList__Group__0__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__1__Impl_in_rule__StringList__Group__18423 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__2_in_rule__StringList__Group__18426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_1_in_rule__StringList__Group__1__Impl8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__2__Impl_in_rule__StringList__Group__28483 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__3_in_rule__StringList__Group__28486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0_in_rule__StringList__Group__2__Impl8513 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__3__Impl_in_rule__StringList__Group__38544 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__StringList__Group__4_in_rule__StringList__Group__38547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringList__Group__3__Impl8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group__4__Impl_in_rule__StringList__Group__48609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringList__Group__4__Impl8637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__0__Impl_in_rule__StringList__Group_2__08678 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1_in_rule__StringList__Group_2__08681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringList__Group_2__0__Impl8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__Group_2__1__Impl_in_rule__StringList__Group_2__18740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringList__ValuesAssignment_2_1_in_rule__StringList__Group_2__1__Impl8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResource_in_rule__Xplatform__ResourceAssignment_08807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Xplatform__NameAssignment_28838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_rule__Xplatform__MethodAssignment_48869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Xplatform__UriAssignment_68900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__Xplatform__RequestHeadersAssignment_7_48931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_rule__Xplatform__ResponseHeadersAssignment_7_5_28962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToClientAssignment_8_28993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__Xplatform__JsonToServerAssignment_8_3_29024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__UriParameterAssignment_1_19055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_29086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_rule__XplatformHeader__HeaderKeyValuesAssignment_3_19117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__KeyAssignment_09148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_09179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_rule__XplatformHeaderKeyValuePair__ValueAssignment_2_19210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_rule__XplatformJson__TypeAssignment_0_19241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__XplatformJson__MetaTypeAssignment_19272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_rule__XplatformJson__CompositeAssignment_2_09303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_rule__JsonMetaArray__MetaTypeAssignment_19334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_rule__JsonMetaType__ScalarAssignment_09365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_rule__JsonMetaType__CompositeAssignment_19396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_rule__JsonCompositeType__CompositeAssignment9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonType__ScalarAssignment_09458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonType__CompositeAssignment_19489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_rule__JsonScalarType__BoolAssignment_09520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonScalarType__StringAssignment_19551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__JsonScalarType__NumberAssignment_2_09582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_rule__JsonScalarType__NullAssignment_39613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_19644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_rule__JsonArray__ElementsAssignment_0_2_19675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_19706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_rule__JsonArray__CompositesAssignment_1_2_19737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_1_09768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_1_29799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JsonObject__KeysAssignment_2_19830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_rule__JsonObject__ValuesAssignment_2_39861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_rule__XplatformResource__PlatformAssignment_09892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__XplatformResource__TypesAssignment_19923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Platform__PlatformsAssignment_29954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__EnumNameAssignment_19985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_310016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumInstance__ValuesAssignment_4_110047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__MapNameAssignment_110078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__ValuesAssignment_310109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapInstance__ValuesAssignment_4_110140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_110171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringList__ValuesAssignment_2_110202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValueType__StringAssignment_010235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_rule__ValueType__StringListAssignment_110266 = new BitSet(new long[]{0x0000000000000002L});

}