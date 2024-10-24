package com.cavoq.test;

import com.cavoq.XmlNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class XmlNodeTest {

	private XmlNode node;

	@BeforeEach
	public void setUp() {
		node = new XmlNode("testTag");
	}

	@Test
	public void testTagName() {
		assertEquals("testTag", node.getTagName());
	}

	@Test
	public void testSetAttribute() {
		node.setAttribute("attr1", "value1");
		assertEquals("value1", node.getAttribute("attr1"));
	}

	@Test
	public void testGetAttributeReturnsNullForNonExistent() {
		assertNull(node.getAttribute("nonExistent"));
	}

	@Test
	public void testAddChild() {
		XmlNode childNode = new XmlNode("childTag");
		node.addChild(childNode);

		List<XmlNode> children = node.getChildren();
		assertEquals(1, children.size());
		assertEquals("childTag", children.get(0).getTagName());
	}

	@Test
	public void testSetTextContent() {
		String text = "This is some text content.";
		node.setTextContent(text);
		assertEquals(text, node.getTextContent());
	}

	@Test
	public void testToString() {
		node.setAttribute("attr1", "value1");
		node.setTextContent("Some text");
		String expectedStart = "XmlNode{tagName='testTag', attributes={attr1=value1}, children=[], textContent='Some text'";
		String str = node.toString();
		assertTrue(str.startsWith(expectedStart));
	}
}