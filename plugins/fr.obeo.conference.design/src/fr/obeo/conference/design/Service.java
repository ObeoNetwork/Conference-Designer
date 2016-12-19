package fr.obeo.conference.design;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

public class Service {
	public IStatus validate(EObject eObject) {
		return new Status(IStatus.ERROR, "plugintest", "This does not work");
	}
}
