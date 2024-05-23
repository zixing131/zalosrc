package p258j7;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: j7.b0 */
/* loaded from: classes3.dex */
abstract class AbstractC20941b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final C20959k0 m109465a(XmlPullParser xmlPullParser, C20955i0 c20955i0) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (!xmlPullParser.getName().equals("splits")) {
                        m109467c(xmlPullParser, c20955i0);
                    } else {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String m109466b = m109466b("name", xmlPullParser, c20955i0);
                                    if (m109466b != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (!xmlPullParser.getName().equals("language")) {
                                                    m109467c(xmlPullParser, c20955i0);
                                                } else {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String m109466b2 = m109466b("key", xmlPullParser, c20955i0);
                                                                String m109466b3 = m109466b("split", xmlPullParser, c20955i0);
                                                                m109467c(xmlPullParser, c20955i0);
                                                                if (m109466b2 != null && m109466b3 != null) {
                                                                    c20955i0.m109498a(m109466b, m109466b2, m109466b3);
                                                                }
                                                            } else {
                                                                m109467c(xmlPullParser, c20955i0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        m109467c(xmlPullParser, c20955i0);
                                    }
                                } else {
                                    m109467c(xmlPullParser, c20955i0);
                                }
                            }
                        }
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return c20955i0.m109499b();
    }

    /* renamed from: b */
    private static final String m109466b(String str, XmlPullParser xmlPullParser, C20955i0 c20955i0) {
        for (int i11 = 0; i11 < xmlPullParser.getAttributeCount(); i11++) {
            if (xmlPullParser.getAttributeName(i11).equals(str)) {
                return xmlPullParser.getAttributeValue(i11);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static final void m109467c(XmlPullParser xmlPullParser, C20955i0 c20955i0) {
        int i11 = 1;
        while (i11 != 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i11--;
                }
            } else {
                i11++;
            }
        }
    }
}
