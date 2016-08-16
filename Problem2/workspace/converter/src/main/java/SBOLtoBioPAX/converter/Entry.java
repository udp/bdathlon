package SBOLtoBioPAX.converter;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.naming.InitialContext;

import org.sbolstandard.core2.SBOLConversionException;
import org.sbolstandard.core2.SBOLDocument;
import org.sbolstandard.core2.SBOLValidationException;


public class Entry {
    public static void main( String[] args ) throws URISyntaxException, SBOLValidationException, IOException, SBOLConversionException {
    	RepressionModel model = new RepressionModel();	
    	model.writeSBOL();
    }
}
