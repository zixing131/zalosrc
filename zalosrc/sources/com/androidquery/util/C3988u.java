package com.androidquery.util;

import android.util.Xml;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.androidquery.util.u */
/* loaded from: classes2.dex */
public class C3988u {

    /* renamed from: a */
    private Element f15781a;

    public C3988u(InputStream inputStream) {
        try {
            this.f15781a = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (IOException e11) {
            throw new SAXException(e11);
        } catch (ParserConfigurationException e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: a */
    private String m18882a(Element element, int i11) {
        String str;
        try {
            XmlSerializer newSerializer = Xml.newSerializer();
            StringWriter stringWriter = new StringWriter();
            newSerializer.setOutput(stringWriter);
            newSerializer.startDocument("utf-8", null);
            if (i11 > 0) {
                char[] cArr = new char[i11];
                Arrays.fill(cArr, ' ');
                str = new String(cArr);
            } else {
                str = null;
            }
            m18883b(this.f15781a, newSerializer, 0, str);
            newSerializer.endDocument();
            return stringWriter.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private void m18883b(Element element, XmlSerializer xmlSerializer, int i11, String str) {
        String tagName = element.getTagName();
        m18885e(xmlSerializer, i11, str);
        xmlSerializer.startTag("", tagName);
        if (element.hasAttributes()) {
            NamedNodeMap attributes = element.getAttributes();
            for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                Attr attr = (Attr) attributes.item(i12);
                xmlSerializer.attribute("", attr.getName(), attr.getValue());
            }
        }
        if (element.hasChildNodes()) {
            NodeList childNodes = element.getChildNodes();
            int i13 = 0;
            for (int i14 = 0; i14 < childNodes.getLength(); i14++) {
                Node item = childNodes.item(i14);
                short nodeType = item.getNodeType();
                if (nodeType != 1) {
                    if (nodeType != 3) {
                        if (nodeType == 4) {
                            xmlSerializer.cdsect(m18884c(item));
                        }
                    } else {
                        xmlSerializer.text(m18884c(item));
                    }
                } else {
                    m18883b((Element) item, xmlSerializer, i11 + 1, str);
                    i13++;
                }
            }
            if (i13 > 0) {
                m18885e(xmlSerializer, i11, str);
            }
        }
        xmlSerializer.endTag("", tagName);
    }

    /* renamed from: c */
    private String m18884c(Node node) {
        String nodeValue;
        short nodeType = node.getNodeType();
        if (nodeType != 3) {
            if (nodeType != 4) {
                nodeValue = null;
            } else {
                nodeValue = node.getNodeValue();
            }
        } else {
            nodeValue = node.getNodeValue();
            if (nodeValue != null) {
                nodeValue = nodeValue.trim();
            }
        }
        if (nodeValue == null) {
            return "";
        }
        return nodeValue;
    }

    /* renamed from: e */
    private void m18885e(XmlSerializer xmlSerializer, int i11, String str) {
        if (str != null) {
            xmlSerializer.text("\n");
            for (int i12 = 0; i12 < i11; i12++) {
                xmlSerializer.text(str);
            }
        }
    }

    /* renamed from: d */
    public String m18886d(int i11) {
        return m18882a(this.f15781a, i11);
    }

    public String toString() {
        return m18886d(0);
    }
}
