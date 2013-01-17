/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.17 at 01:09:37 PM EST 
//


package org.s_ramp.xmlns._2010.s_ramp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsdlDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsdlDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://s-ramp.org/xmlns/2010/s-ramp}XmlDocument">
 *       &lt;sequence>
 *         &lt;element name="importedXsds" type="{http://s-ramp.org/xmlns/2010/s-ramp}xsdDocumentTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includedXsds" type="{http://s-ramp.org/xmlns/2010/s-ramp}xsdDocumentTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="redefinedXsds" type="{http://s-ramp.org/xmlns/2010/s-ramp}xsdDocumentTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="importedWsdls" type="{http://s-ramp.org/xmlns/2010/s-ramp}wsdlDocumentTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="xsdTargetNamespaces" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsdlDocument", propOrder = {
    "importedXsds",
    "includedXsds",
    "redefinedXsds",
    "importedWsdls"
})
public class WsdlDocument
    extends XmlDocument
    implements Serializable
{

    private static final long serialVersionUID = -6563640831682321142L;
    protected List<XsdDocumentTarget> importedXsds;
    protected List<XsdDocumentTarget> includedXsds;
    protected List<XsdDocumentTarget> redefinedXsds;
    protected List<WsdlDocumentTarget> importedWsdls;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String xsdTargetNamespaces;

    /**
     * Gets the value of the importedXsds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importedXsds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportedXsds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsdDocumentTarget }
     * 
     * 
     */
    public List<XsdDocumentTarget> getImportedXsds() {
        if (importedXsds == null) {
            importedXsds = new ArrayList<XsdDocumentTarget>();
        }
        return this.importedXsds;
    }

    /**
     * Gets the value of the includedXsds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedXsds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedXsds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsdDocumentTarget }
     * 
     * 
     */
    public List<XsdDocumentTarget> getIncludedXsds() {
        if (includedXsds == null) {
            includedXsds = new ArrayList<XsdDocumentTarget>();
        }
        return this.includedXsds;
    }

    /**
     * Gets the value of the redefinedXsds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redefinedXsds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedefinedXsds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsdDocumentTarget }
     * 
     * 
     */
    public List<XsdDocumentTarget> getRedefinedXsds() {
        if (redefinedXsds == null) {
            redefinedXsds = new ArrayList<XsdDocumentTarget>();
        }
        return this.redefinedXsds;
    }

    /**
     * Gets the value of the importedWsdls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importedWsdls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportedWsdls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsdlDocumentTarget }
     * 
     * 
     */
    public List<WsdlDocumentTarget> getImportedWsdls() {
        if (importedWsdls == null) {
            importedWsdls = new ArrayList<WsdlDocumentTarget>();
        }
        return this.importedWsdls;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the xsdTargetNamespaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsdTargetNamespaces() {
        return xsdTargetNamespaces;
    }

    /**
     * Sets the value of the xsdTargetNamespaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsdTargetNamespaces(String value) {
        this.xsdTargetNamespaces = value;
    }

}
