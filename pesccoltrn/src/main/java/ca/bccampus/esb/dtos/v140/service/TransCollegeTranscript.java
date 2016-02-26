package ca.bccampus.esb.dtos.v140.service;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.xml.sax.InputSource;

import org.pesc.message.collegetranscript.v1_6.CollegeTranscript;



/**
 * Transformer for CollegeTranscript to String and back
 * 
 * @author jam
 */

public class TransCollegeTranscript {
	
	// for each class pre-instantiate the jaxb context statically so that it performs thread safety
	static final JAXBContext _jaxbContext = initContext();
	
	private static JAXBContext initContext() {
		try {
			return JAXBContext.newInstance(org.pesc.message.collegetranscript.v1_6.CollegeTranscript.class);
		}
		catch (Exception e) {
			return null;
		}
	}
		
	/**
	 * Marshall using jaxb
	 * @param src: CollegeTranscript
	 * @param encoding: not used
	 * @return XML String
	 */
	
	public synchronized Object marshall(Object src, String encoding) throws Exception
	{
		String sxml = null;
		try {
			Marshaller marshaller = _jaxbContext.createMarshaller();
			if (encoding != null)
				marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
			else
				marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			CollegeTranscript request = (CollegeTranscript) src;
			StringWriter sw = new StringWriter();
		    marshaller.marshal(request, sw);
		    sxml = sw.toString();
		}
		catch (JAXBException e) {
			// Throwable cause = e.getCause();
  			JAXBException newe = new JAXBException(e);
			sxml = null;
			throw newe;
		}
		return sxml;
	}
	
	public synchronized Object unmarshall (Object src, String encoding) throws Exception
	{
		CollegeTranscript request = null;
		String sxml = null;
		try {
			Unmarshaller unmarshaller = _jaxbContext.createUnmarshaller();
			sxml = (String) src;
			request = (CollegeTranscript) unmarshaller.unmarshal (new InputSource(new StringReader(sxml)));
		}
		catch (JAXBException e) {
			// Throwable cause = e.getCause();
			JAXBException newe = new JAXBException(e);
			request = null;
			throw newe;
		}
		return request;
	}	
	
}
