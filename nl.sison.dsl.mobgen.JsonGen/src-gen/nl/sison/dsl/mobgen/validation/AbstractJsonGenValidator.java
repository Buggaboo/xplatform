/*
 * generated by Xtext
 */
package nl.sison.dsl.mobgen.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractJsonGenValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(nl.sison.dsl.mobgen.jsonGen.JsonGenPackage.eINSTANCE);
		return result;
	}
}