//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.05 at 12:17:15 PM CET
//

package sk.itcloud.maven.model.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 4, columns = 2, cancelButtonVisible = false, commitButtonVisible = false, title = "Countinuos Integration")
public class CiManagement implements Serializable
{

	@FormField(title = "System", location = "1,0", required = true, requiredFieldErrorMessage = "Please enter CI System")
	protected String system;

	@FormField(title = "Url", location = "1,1", required = true, requiredFieldErrorMessage = "Please enter CI Url")
	protected String url;

	protected CiManagement.Notifiers notifiers;

	/**
	 * Gets the value of the system property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSystem()
	{
		return system;
	}

	/**
	 * Sets the value of the system property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSystem(String value)
	{
		this.system = value;
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
	 * Gets the value of the notifiers property.
	 * 
	 * @return possible object is {@link CiManagement.Notifiers }
	 * 
	 */
	public CiManagement.Notifiers getNotifiers()
	{
		return notifiers;
	}

	/**
	 * Sets the value of the notifiers property.
	 * 
	 * @param value
	 *            allowed object is {@link CiManagement.Notifiers }
	 * 
	 */
	public void setNotifiers(CiManagement.Notifiers value)
	{
		this.notifiers = value;
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
	 *         &lt;element name="notifier" type="{http://maven.apache.org/POM/4.0.0}Notifier" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Notifiers
	{

		protected List<Notifier> notifier;

		/**
		 * Gets the value of the notifier property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the notifier property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getNotifier().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Notifier }
		 * 
		 * 
		 */
		public List<Notifier> getNotifier()
		{
			if (notifier == null)
			{
				notifier = new ArrayList<Notifier>();
			}
			return this.notifier;
		}

	}

}