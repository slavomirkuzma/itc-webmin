//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.05 at 12:17:15 PM CET
//

package sk.itcloud.maven.model.form;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 4, columns = 1, cancelButtonVisible = false, commitButtonVisible = false, title = "Repository")
public class Repository implements Serializable
{

	protected RepositoryPolicy releases;
	protected RepositoryPolicy snapshots;

	@FormField(title = "Id", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String id;

	@FormField(title = "Name", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String name;

	@FormField(title = "Url", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter")
	protected String url;

	@FormField(title = "Layout", location = "0,3", required = true, requiredFieldErrorMessage = "Please enter")
	protected String layout = "defaul";

	/**
	 * Gets the value of the releases property.
	 * 
	 * @return possible object is {@link RepositoryPolicy }
	 * 
	 */
	public RepositoryPolicy getReleases()
	{
		return releases;
	}

	/**
	 * Sets the value of the releases property.
	 * 
	 * @param value
	 *            allowed object is {@link RepositoryPolicy }
	 * 
	 */
	public void setReleases(RepositoryPolicy value)
	{
		this.releases = value;
	}

	/**
	 * Gets the value of the snapshots property.
	 * 
	 * @return possible object is {@link RepositoryPolicy }
	 * 
	 */
	public RepositoryPolicy getSnapshots()
	{
		return snapshots;
	}

	/**
	 * Sets the value of the snapshots property.
	 * 
	 * @param value
	 *            allowed object is {@link RepositoryPolicy }
	 * 
	 */
	public void setSnapshots(RepositoryPolicy value)
	{
		this.snapshots = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value)
	{
		this.id = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value)
	{
		this.name = value;
	}

	/**
	 * Gets the value of the url property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * Sets the value of the url property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUrl(String value)
	{
		this.url = value;
	}

	/**
	 * Gets the value of the layout property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLayout()
	{
		return layout;
	}

	/**
	 * Sets the value of the layout property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLayout(String value)
	{
		this.layout = value;
	}

}
