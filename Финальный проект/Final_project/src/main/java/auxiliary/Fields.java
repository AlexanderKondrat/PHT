package auxiliary;

import org.apache.log4j.Logger;

public class Fields {
	private String login = "SELECT Login FROM users WHERE ID=1";
	private String loginNotCor = "SELECT Login FROM users WHERE ID=2";
	private String passCorr = "SELECT Password FROM users WHERE ID=1";
	private String passNotCorr = "SELECT Login FROM users WHERE ID=2";
	private String loginS = "SELECT Login FROM users WHERE ID=3";
	private static final Logger log = Logger.getLogger(Fields.class);

	private String text;
	private String topic;
	private String URL;

	public String getLogin() {
		return login;
	}
	
	public String getLoginS() {
		return loginS;
	}


	public String getPassCorr() {
		return passCorr;
	}

	public String getPassNotCorr() {
		return passNotCorr;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getLoginNotCor() {
		return loginNotCor;
	}

	public static Logger getLog() {
		return log;
	}

}
