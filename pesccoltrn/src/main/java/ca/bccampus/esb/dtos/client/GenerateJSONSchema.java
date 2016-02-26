package ca.bccampus.esb.dtos.client;

import org.json.JSONObject;

import pl.zientarski.SchemaMapper;

public class GenerateJSONSchema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JSONObject schema = new SchemaMapper().toJsonSchema4(org.pesc.message.collegetranscript.v1_6.CollegeTranscript.class, true);
		// JSONObject schema = new SchemaMapper().toJsonSchema4(org.pesc.message.highschooltranscript.v1_5.HighSchoolTranscript.class, true);
		// JSONObject schema = new SchemaMapper().toJsonSchema4(org.pesc.message.admissionsapplication.v1_3.AdmissionsApplication.class, true);
		// JSONObject schema = new SchemaMapper().toJsonSchema4(org.pesc.message.transcriptrequest.v1_4.TranscriptRequest.class, true);
		JSONObject schema = new SchemaMapper().toJsonSchema4(org.pesc.message.transcriptresponse.v1_4.TranscriptResponse.class, true);
		
		System.out.println(schema.toString());
	}
}
