/*
* generated by Xtext
*/
package nl.sison.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractXplatformJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(nl.sison.xplatform.XplatformPackage.eINSTANCE);
		return result;
	}

}