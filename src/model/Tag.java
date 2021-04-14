package model;
import java.util.*;
import java.io.*;
/**
 * The Tag class represents a <name, value> Tag used to tag Photos with
 * @author Param Thakker
 * @author Jonathan Lu
 *
 */
public class Tag implements Serializable {

	private static final long serialVersionUID = 3430529772963736249L;
	/**
	 * the name of the Tag
	 */
	public String tagName;
	/**
	 * the value of the Tag
	 */
	public String tagValue;
	/**
	 * Constuctor with 2 arguments
	 * @param name the name of the Tag
	 * @param value the value of the Tag
	 */
	public Tag(String name, String value) {
		this.tagName=name;
		this.tagValue=value;
	}
	/**
	 * gets the name of the Tag
	 * @return the String name of the Tag
	 */
	public String getTagName() {
		return this.tagName;
	}
	/**
	 * gets the value of the Tag
	 * @return the String value of the Tag
	 */
	public String getTagValue() {
		return this.tagValue;
	}
	@Override
	public String toString() {
		return this.tagName + ":" + this.tagValue;
	}
}
