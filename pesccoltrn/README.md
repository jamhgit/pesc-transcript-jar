This project aims to provide a java library for the manipulation of PESC's CollegeTranscript, HighSchoolTranscript, TranscriptRequest, TranscriptResponse and AdmissionsApplication Objects, as well as all of their child objects.  The rationale is that by using this library in your development IDE, you will get an easy and automatic way to:

+ Create transcripts that are complient with PESC schemas.

+ Marshal to a PESC Complient XML file.

+ Unmarshal from a PESC XML file to a plain-old java object.

+ Perform validation against the PESC published schemas.


In addition, in an IDE such as Eclipse, you will be able to:

+ Use factories to create these objects.

+ Have autocompletion on the fields of all objects.


For an example of use, refer to the test code under the test subdirectory.

The built jar (jdk 1.8) is provided under the target subdirectory.

The dependent jars are also provided under the thirdparty subdirectory, but you should be ablt to use any subsequent version of these.

A maven pom file is provided that builds a jar under the target subdirectory.


There is an experimental JSON support in the client directory along with the top level JSON schemas.  These are not validated against PESC XML schemas!


Enjoy,
Jam


For more info:

http://www.pesc.org

http://www.bccampus.ca

