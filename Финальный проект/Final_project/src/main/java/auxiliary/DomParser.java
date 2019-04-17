package auxiliary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DomParser {
	public List<Fields> parse(Document document) throws FileNotFoundException, XMLStreamException {
		NodeList nodeList = document.getElementsByTagName("Other");
		List<Fields> values = new ArrayList<Fields>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			values.add(getFields(nodeList.item(i)));
		}
		return values;
	}

	private static Fields getFields(Node node) {
		Fields values = new Fields();
		Element element = (Element) node;
		values.setURL(getTagValue("URL", element));
		values.setTopic(getTagValue("topic", element));
		values.setText(getTagValue("text", element));
		return values;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}

	public static String getXML(String info)
			throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		String OTHERS_XML = "other.xml";
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(OTHERS_XML);
		List<Fields> values = new DomParser().parse(document);
		switch (info) {
		case "URL":
			return values.get(0).getURL();
		case "Topic":
			return values.get(0).getTopic();
		case "Text":
			return values.get(0).getText();
		}
		return null;

	}




}
