//package basic_core;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//
//import com.discovery.core.base.TestBase;
//import com.discovery.core.enums.ReportingLevels;
//import com.discovery.core.enums.StringTypes;
//import com.discovery.core.jsons.JsonArray;
//import com.discovery.core.jsons.JsonObject;
//import com.discovery.core.utils.Random;
//import com.discovery.core.utils.ReadWriteFiles;
//import com.discovery.scenarioSteps.gcr.api.ObjectsScenarioSteps;
//
//import io.restassured.response.Response; 
//
//public class GcrObjTransformFilterScenarioSteps extends TestBase {
//	
//	public GcrObjTransformFilterScenarioSteps() {
//		super(ReportingLevels.CLASS, 0);
//	}
//	
//	protected Response postResponse;
//	protected Response getResponseAfterCreate;
//	protected Response getResponseUsingTransfromFilter;
//
//	protected String postPayloadFilePath;
//	protected String postPayloadJsonStr;
//	//protected String transform = "[].%7BobjectType:objectType,networkOwner:networkOwner,showTitle:hiveMetadata.showTitle,returnsNull:foo,frameRate:frameRate%7D";
//	protected String transform = "[].%7BobjectType:objectType,networkOwner:networkOwner,clock:clock,showTitle:hiveMetadata.showTitle,returnsNull:foo,frameRate:frameRate%7D";
// 
//	
//	JsonObject payload;
//	
//	protected String randomLegacyCutIdType;
//	
//	@BeforeClass (alwaysRun = true)
//	protected void gcrObjTransformFilter() {
//		try {			
//			
//			postPayloadFilePath = testDataDir + "/BasicGcrObject.json";
//			postPayloadJsonStr = ReadWriteFiles.fileToString(postPayloadFilePath);
//
//		} catch (Exception e) {
//			logException(test, e);
//		}		
//	}
//	
//	protected ObjectsScenarioSteps objectsScenarioSteps;
//	
//	@BeforeMethod (alwaysRun = true)
//	protected void createGcrObjMethodSetup() {
//		try {
//
//			objectsScenarioSteps = new ObjectsScenarioSteps(test);
//			
//		} catch (Exception e) {
//			
//			logException(test, e);
//		}	
//	}
//	
//	protected void createGcrObject() throws IOException {
//		payload = new JsonObject(new File(postPayloadFilePath));
//		randomLegacyCutIdType = "automation-" + Random.getUUIString(5, 5, "-", StringTypes.ALPHANUMERIC);
//		payload.add("legacyCutIdType", randomLegacyCutIdType);
//		postResponse = objectsScenarioSteps.postObject(payload.toString());
//		softAssert(test, postResponse.statusCode() == 200, "Response code for a valid post call returns HTTP 200");
//		getResponseAfterCreate = objectsScenarioSteps.getGcrObjectUsingLegacyCutIdTypeFilter(randomLegacyCutIdType);
//		softAssert(test, getResponseAfterCreate.statusCode() == 200, "Response code for a valid get call to objects endpoint's  using legacyCutIdType returns HTTP 200");
//	}
//	
//	protected void getGcrObjectUsingTransformFilter() throws UnsupportedEncodingException {
//		getResponseUsingTransfromFilter = objectsScenarioSteps.getTransformFilterResponse(transform, randomLegacyCutIdType);
//	}
//	
//	protected void validateTransformFilterResponseCode() {
//		assertTrue(test, getResponseUsingTransfromFilter.statusCode() == 200, "Response code for a valid get call to objects endpoint's  using legacyCutIdType and transform returns HTTP 200");
//	}
//	
//	
//	protected void validateNumberOfObjectsInResponse() {
//		assertTrue(test, getResponseUsingTransfromFilter.jsonPath().getList(".").size() == 1, "Validating Number Of Objects in Response code");
//
//	}
//
//	protected void validatePropertiesInResponse() throws IOException {
//		//validate the correct properties are in ressponse
////		String jsonString = getResponseUsingTransfromFilter.jsonPath().getList(".").get(0).toString();
////		System.out.println("this is sthe json string\n" +jsonString);
////		JsonObject jsonObject = new JsonObject(jsonString);
////		System.out.println("***************************************jsonObject "+jsonObject.keySet().size());
////		for (String key: jsonObject.keySet()) {
////			LOGGER.warning(key);
////		}
////		
//		//validate the data of these properties
////		List<Object> map = getResponseUsingTransfromFilter.jsonPath().getMap(".[0]").keySet();
////		System.out.println(map);
////		System.out.println("map statrt");
////		System.out.println( getResponseUsingTransfromFilter.jsonPath().getMap("[0]").keySet().size());
////		System.out.println("map stend");
//		
////		JsonObject jsonValue = new JsonObject();
////		jsonValue.add("frameRate", 29.97);
////		jsonValue.add("objectType", "Output");
//		 
////		Set<Object> expectedSetValue = new HashSet<Object>();
//		LinkedHashMap<Object, Object> networkOwnerValue = new LinkedHashMap<Object, Object>();
//		networkOwnerValue.put("abbreviation", "SCI-US");
//		networkOwnerValue.put("id", 48);
//		networkOwnerValue.put("name", "Science - US");
//		networkOwnerValue.put("type", "pds");
//		
////		LinkedHashMap<Object, Object> clockValue = new LinkedHashMap<Object, Object>();
////		clockValue.put("alternateSlotLengths", 180);
////		clockValue.put("alternateSlotLengths", -240);
//
//		ArrayList<Object> alternateSlotLengths = new ArrayList<Object>();
//		alternateSlotLengths.add(0, 180);
//		alternateSlotLengths.add(1, -240);
//		
//		LinkedHashMap<Object, Object> alternateSlotLengthsValue = new LinkedHashMap<Object, Object>();
//		alternateSlotLengthsValue.put("alternateSlotLengths", alternateSlotLengths);
//
//		
//		HashMap<Object, Object> expectedMapValue = new LinkedHashMap<Object, Object>();
//		expectedMapValue.put("frameRate", 29.97F);
//		expectedMapValue.put("objectType", "Output");
//		expectedMapValue.put("networkOwner", networkOwnerValue);
//		expectedMapValue.put("showTitle", "What on Earth?");
//		expectedMapValue.put("returnsNull", null);
//		expectedMapValue.put("clock", alternateSlotLengthsValue);
//
//		
//		System.out.println("***************** Set Value 1 ************\n" + expectedMapValue);
//		
//		HashMap<Object, Object> actualMapValue = (HashMap<Object, Object>) getResponseUsingTransfromFilter.jsonPath().getMap("[0]");
//		System.out.println("***************Set Value 2**********************\n" + actualMapValue);
//		
//		System.out.println("The type of expected clock" + expectedMapValue.get("clock").getClass().getSimpleName());
//		System.out.println("The type of actual clock" + actualMapValue.get("clock").getClass().getSimpleName());
//		
//		if(expectedMapValue.equals(actualMapValue)) {
//			System.out.println("Value matches");
//		} else {
//			System.out.println("No match");;
//		}
//
//	}
//	
//	
//}
