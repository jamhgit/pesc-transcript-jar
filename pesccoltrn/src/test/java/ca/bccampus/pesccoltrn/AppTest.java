package ca.bccampus.pesccoltrn;

import org.pesc.sector.academicrecord.v1_9.AcademicRecordType;
import org.pesc.sector.academicrecord.v1_9.CourseType;
import org.pesc.sector.academicrecord.v1_9.OrganizationType;
import org.pesc.sector.academicrecord.v1_9.PersonType;
import org.pesc.sector.academicrecord.v1_9.SourceDestinationType;
import org.pesc.sector.academicrecord.v1_9.StudentType;
import org.pesc.sector.academicrecord.v1_9.TransmissionDataType;

import org.pesc.core.coremain.v1_14.GenderType;
import org.pesc.core.coremain.v1_14.HealthType;

import org.pesc.message.collegetranscript.v1_6.CollegeTranscript;
import org.pesc.message.collegetranscript.v1_6.ObjectFactory;

import ca.bccampus.esb.dtos.v140.service.TransCollegeTranscript;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Example of use
     */
    public void testApp()
    {
    	ObjectFactory colfactory = new ObjectFactory();
        org.pesc.sector.academicrecord.v1_9.ObjectFactory acafactory = new org.pesc.sector.academicrecord.v1_9.ObjectFactory();
        org.pesc.core.coremain.v1_14.ObjectFactory corefactory = new org.pesc.core.coremain.v1_14.ObjectFactory();

        // create a PESC College Transcript
        CollegeTranscript transcript = colfactory.createCollegeTranscript();

        // fill a college transcript
        StudentType student = acafactory.createStudentType();
        transcript.setStudent(student);
        PersonType person = acafactory.createPersonType();
        student.setPerson(person);

        // set the birthday
        person.setBirth(corefactory.createBirthType());
        try {
            javax.xml.datatype.DatatypeFactory xmlFactory = javax.xml.datatype.DatatypeFactory.newInstance();
            javax.xml.datatype.XMLGregorianCalendar date = xmlFactory.newXMLGregorianCalendar();
            person.getBirth().setBirthDate(date);
        }
        catch (Exception e) {}

        // set gender
        // the following is an example of how enumerations work in PESC,
        // if "Male" is not in the list of enums, we get an exception
        try {
            GenderType gender = corefactory.createGenderType();
            gender.setGenderCode(org.pesc.core.coremain.v1_14.GenderCodeType.fromValue("Male"));
            person.setGender(gender);
        }
        catch (Exception e) {}

        // etc..
        HealthType healthType = corefactory.createHealthType();
        student.setHealth(healthType);

        // transmission type
        TransmissionDataType transmission = acafactory.createTransmissionDataType();
        transcript.setTransmissionData(transmission);
        transmission.setDocumentID("Some ID");
        SourceDestinationType destType = acafactory.createSourceDestinationType();
        OrganizationType orgType = acafactory.createOrganizationType();
        orgType.setFICE("FICE value");
        destType.setOrganization(orgType);
        
        // set the transcript's transmission type
        transcript.setTransmissionData(transmission);
        
        AcademicRecordType acarecord = acafactory.createAcademicRecordType();
        CourseType course = acafactory.createCourseType();
        course.setAgencyCourseID("Course ID");
        course.setCourseAcademicGrade("A");
        
        // set the transcript's AcademicRecord
        transcript.getStudent().getAcademicRecord().add(acarecord);
        
        // create the XML string from the transcript
        TransCollegeTranscript trans = new TransCollegeTranscript();
        try {
            String sxml = (String) trans.marshall(transcript, null);
            System.out.println("Got:\n" + sxml);
            assertTrue(true);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " " + ((e.getCause() != null) ? e.getCause() : ""));
            assertTrue(false);
        }
    }
}
