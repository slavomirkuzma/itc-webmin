//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.08 at 11:05:04 AM CET
//

package sk.itcloud.maven.settings.form;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 6, columns = 1, cancelButtonVisible = false, commitButtonVisible = false, title = "Profile")
public class Profile
{

	protected Activation activation;
	protected Profile.Properties properties;
	protected Profile.Repositories repositories;
	protected Profile.PluginRepositories pluginRepositories;

	@FormField(title = "Id", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String id;

	/**
	 * Gets the value of the activation property.
	 * 
	 * @return possible object is {@link Activation }
	 * 
	 */
	public Activation getActivation()
	{
		return activation;
	}

	/**
	 * Sets the value of the activation property.
	 * 
	 * @param value
	 *            allowed object is {@link Activation }
	 * 
	 */
	public void setActivation(Activation value)
	{
		this.activation = value;
	}

	/**
	 * Gets the value of the properties property.
	 * 
	 * @return possible object is {@link Profile.Properties }
	 * 
	 */
	public Profile.Properties getProperties()
	{
		return properties;
	}

	/**
	 * Sets the value of the properties property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.Properties }
	 * 
	 */
	public void setProperties(Profile.Properties value)
	{
		this.properties = value;
	}

	/**
	 * Gets the value of the repositories property.
	 * 
	 * @return possible object is {@link Profile.Repositories }
	 * 
	 */
	public Profile.Repositories getRepositories()
	{
		return repositories;
	}

	/**
	 * Sets the value of the repositories property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.Repositories }
	 * 
	 */
	public void setRepositories(Profile.Repositories value)
	{
		this.repositories = value;
	}

	/**
	 * Gets the value of the pluginRepositories property.
	 * 
	 * @return possible object is {@link Profile.PluginRepositories }
	 * 
	 */
	public Profile.PluginRepositories getPluginRepositories()
	{
		return pluginRepositories;
	}

	/**
	 * Sets the value of the pluginRepositories property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.PluginRepositories }
	 * 
	 */
	public void setPluginRepositories(Profile.PluginRepositories value)
	{
		this.pluginRepositories = value;
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
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="pluginRepository" type="{http://maven.apache.org/SETTINGS/1.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class PluginRepositories
	{

		protected List<Repository> pluginRepository;

		/**
		 * Gets the value of the pluginRepository property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the pluginRepository property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPluginRepository().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Repository }
		 * 
		 * 
		 */
		public List<Repository> getPluginRepository()
		{
			if (pluginRepository == null)
			{
				pluginRepository = new ArrayList<Repository>();
			}
			return this.pluginRepository;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Properties
	{
		protected List<Element> any;

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the any property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAny().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Element }
		 * 
		 * 
		 */
		public List<Element> getAny()
		{
			if (any == null)
			{
				any = new ArrayList<Element>();
			}
			return this.any;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="repository" type="{http://maven.apache.org/SETTINGS/1.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Repositories
	{

		protected List<Repository> repository;

		/**
		 * Gets the value of the repository property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the repository property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getRepository().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Repository }
		 * 
		 * 
		 */
		public List<Repository> getRepository()
		{
			if (repository == null)
			{
				repository = new ArrayList<Repository>();
			}
			return this.repository;
		}

	}

}
