/**
 * Repository.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.settings.forms;


/**
 *  Repository bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Repository implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Repository
       Namespace URI = http://maven.apache.org/SETTINGS/1.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for Releases
     */
    protected sk.itcloud.maven.settings.form.RepositoryPolicy localReleases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReleasesTracker = false;

    /**
     * field for Snapshots
     */
    protected sk.itcloud.maven.settings.form.RepositoryPolicy localSnapshots;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSnapshotsTracker = false;

    /**
     * field for Id
     */
    protected java.lang.String localId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTracker = false;

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * field for Url
     */
    protected java.lang.String localUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUrlTracker = false;

    /**
     * field for Layout
     */
    protected java.lang.String localLayout = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "default");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLayoutTracker = false;

    public boolean isReleasesSpecified() {
        return localReleasesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.RepositoryPolicy
     */
    public sk.itcloud.maven.settings.form.RepositoryPolicy getReleases() {
        return localReleases;
    }

    /**
     * Auto generated setter method
     * @param param Releases
     */
    public void setReleases(
        sk.itcloud.maven.settings.form.RepositoryPolicy param) {
        localReleasesTracker = param != null;

        this.localReleases = param;
    }

    public boolean isSnapshotsSpecified() {
        return localSnapshotsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.RepositoryPolicy
     */
    public sk.itcloud.maven.settings.form.RepositoryPolicy getSnapshots() {
        return localSnapshots;
    }

    /**
     * Auto generated setter method
     * @param param Snapshots
     */
    public void setSnapshots(
        sk.itcloud.maven.settings.form.RepositoryPolicy param) {
        localSnapshotsTracker = param != null;

        this.localSnapshots = param;
    }

    public boolean isIdSpecified() {
        return localIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getId() {
        return localId;
    }

    /**
     * Auto generated setter method
     * @param param Id
     */
    public void setId(java.lang.String param) {
        localIdTracker = param != null;

        this.localId = param;
    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;
    }

    public boolean isUrlSpecified() {
        return localUrlTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUrl() {
        return localUrl;
    }

    /**
     * Auto generated setter method
     * @param param Url
     */
    public void setUrl(java.lang.String param) {
        localUrlTracker = param != null;

        this.localUrl = param;
    }

    public boolean isLayoutSpecified() {
        return localLayoutTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLayout() {
        return localLayout;
    }

    /**
     * Auto generated setter method
     * @param param Layout
     */
    public void setLayout(java.lang.String param) {
        localLayoutTracker = param != null;

        this.localLayout = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://maven.apache.org/SETTINGS/1.0.0");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Repository", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Repository", xmlWriter);
            }
        }

        if (localReleasesTracker) {
            if (localReleases == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "releases cannot be null!!");
            }

            localReleases.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "releases"),
                xmlWriter);
        }

        if (localSnapshotsTracker) {
            if (localSnapshots == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "snapshots cannot be null!!");
            }

            localSnapshots.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "snapshots"),
                xmlWriter);
        }

        if (localIdTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "id", xmlWriter);

            if (localId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localId);
            }

            xmlWriter.writeEndElement();
        }

        if (localNameTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localUrlTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "url", xmlWriter);

            if (localUrl == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "url cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localUrl);
            }

            xmlWriter.writeEndElement();
        }

        if (localLayoutTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "layout", xmlWriter);

            if (localLayout == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "layout cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLayout);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://maven.apache.org/SETTINGS/1.0.0")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static Repository parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Repository object = new Repository();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"Repository".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Repository) sk.itcloud.maven.settings.form.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {
                        if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "releases").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "releases").equals(
                                    reader.getName())) {
                            object.setReleases(sk.itcloud.maven.settings.form.RepositoryPolicy.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "snapshots").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "snapshots").equals(
                                    reader.getName())) {
                            object.setSnapshots(sk.itcloud.maven.settings.form.RepositoryPolicy.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "id").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "id").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "id" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "name").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "name").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "name" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "url").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "url").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "url" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUrl(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "layout").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "layout").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "layout" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLayout(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else {
                            // 3 - A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
