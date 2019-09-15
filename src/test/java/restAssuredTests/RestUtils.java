package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	private static String title="foo";
	private static String id="101";
	private static String body="body";
	private static String userId="1";
	

	public void setId(String id)
	{
		id=this.id;
	}
	
	public static String getId()
	{
		//String generatedString=RandomStringUtils.randomAlphabetic(1);
		return id;
		
	}
	public void setTitle(String title) {
		title=this.title;
	}
	public static String getTitle()
	{
		//String generatedString=RandomStringUtils.randomAlphabetic(1);
		return title;
		
	}
	public void setBody(String body)
	{
		body=this.body;
	}
	public static String getBody()
	{//String generatedString=RandomStringUtils.randomAlphabetic(3);
		return body;
		
	}
	public void setUserId(String userId)
	{userId=this.userId;
		
	}
	public static String getuserId()
	{
		return userId;
	}
	
	/*public static String getUSerId()
	{	String generatedString=RandomStringUtils.randomAlphabetic(3);
	return (generatedString);

		
	}*/
}
