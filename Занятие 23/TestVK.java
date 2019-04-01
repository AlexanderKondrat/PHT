package PHT.Today;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestVK {
	String method;
	HttpClient client = HttpClientBuilder.create().build();
	URIBuilder builder;
	HttpGet request;
	HttpResponse response;
	String status;
	static String idMessage = null;

	@Test
	public void addPost() throws URISyntaxException, ClientProtocolException, IOException {
		NoCopyPaste("https://api.vk.com/method/wall.post?v=5.92&", "message", "ADD POST", "attachments",
				"photo-67264808_456240513");
		Assert.assertFalse(status.contains("error"));
	}

	@Test
	public void editPost() throws ClientProtocolException, IOException, URISyntaxException {
		NoCopyPaste("https://api.vk.com/method/wall.edit?v=5.92&", "message", "EDIT POST", "post_id", idMessage);
		Assert.assertFalse(status.contains("error"));
	}

	@Test
	public void deletePost() throws ClientProtocolException, IOException, URISyntaxException {
		NoCopyPaste("https://api.vk.com/method/wall.delete?v=5.92&", "post_id", idMessage);
		Assert.assertFalse(status.contains("error"));
	}

	public String NoCopyPaste(String method, String param1, String value1)
			throws URISyntaxException, ClientProtocolException, IOException {
		builder = new URIBuilder(method);
		builder.setParameter("access_token",
				"cf03f4d1083ec0bb6cca6cbac3666f9685e91523f2c6be8ce74b73bff50df5846d6625fccf887e609fa04")
				.setParameter("owner_id", "220116232").setParameter(param1, value1);
		request = new HttpGet(builder.build());
		response = client.execute(request);
		status = EntityUtils.toString(response.getEntity());
		response.getEntity();
		return status;
	}

	public String NoCopyPaste(String method, String param1, String value1, String param2, String value2)
			throws URISyntaxException, ClientProtocolException, IOException {
		builder = new URIBuilder(method);
		builder.setParameter("access_token",
				"cf03f4d1083ec0bb6cca6cbac3666f9685e91523f2c6be8ce74b73bff50df5846d6625fccf887e609fa04") //unlimited token
				.setParameter("owner_id", "220116232").setParameter(param1, value1).setParameter(param2, value2);
		request = new HttpGet(builder.build());
		response = client.execute(request);
		status = EntityUtils.toString(response.getEntity());
		if (idMessage == null) {
			idMessage = status.replaceAll("[^0-9]", "");
		}
		return status;
	}

}