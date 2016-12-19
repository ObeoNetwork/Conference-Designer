import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class Main {
    public static void main(String[] args) {
        EClass eClass = EcoreFactory.eINSTANCE.createEClass();
        EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
        eClass.getEAnnotations().add(eAnnotation);

        List<EAnnotation> annotations = new ArrayList<>();
        EAnnotation secondEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
        annotations.add(secondEAnnotation);

        eClass.eSet(EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS, secondEAnnotation);

        EList<EAnnotation> eAnnotations = eClass.getEAnnotations();
        System.out.println(eAnnotations);
    }
}
