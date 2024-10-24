package com.cavoq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XmlNode {

	private String tagName;
	private Map<String, String> attributes;
	private List<XmlNode> children;
	private String textContent;

	public XmlNode(String tagName) {
		this.tagName = tagName;
		this.attributes = new HashMap<>();
		this.children = new ArrayList<>();
	}

	public String getTagName() {
		return tagName;
	}

	public void setAttribute(String name, String value) {
		attributes.put(name, value);
	}

	public String getAttribute(String name) {
		return attributes.get(name);
	}

	public List<XmlNode> getChildren() {
		return children;
	}

	public void addChild(XmlNode child) {
		children.add(child);
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	@Override
	public String toString() {
		return "XmlNode{" + "tagName='" + tagName + '\'' + ", attributes=" + attributes + ", children=" + children
				+ ", textContent='" + textContent + '\'' + '}';
	}
}
