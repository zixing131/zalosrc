package com.google.android.gms.internal.ads;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.gms.internal.ads.f1 */
/* loaded from: classes2.dex */
abstract class AbstractC4485f1 {

    /* renamed from: a */
    private static final String[] f19920a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f19921b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f19922c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:            if (r7 == (-1)) goto L21;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4301a1 m21862a(String str) {
        long j11;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (ha2.m22771c(newPullParser, "x:xmpmeta")) {
                c83 m20832w = c83.m20832w();
                long j12 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (ha2.m22771c(newPullParser, "rdf:Description")) {
                        String[] strArr = f19920a;
                        int i11 = 0;
                        for (int i12 = 0; i12 < 4; i12++) {
                            String m22769a = ha2.m22769a(newPullParser, strArr[i12]);
                            if (m22769a != null) {
                                if (Integer.parseInt(m22769a) != 1) {
                                    return null;
                                }
                                String[] strArr2 = f19921b;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= 4) {
                                        break;
                                    }
                                    String m22769a2 = ha2.m22769a(newPullParser, strArr2[i13]);
                                    if (m22769a2 != null) {
                                        j11 = Long.parseLong(m22769a2);
                                    } else {
                                        i13++;
                                    }
                                }
                                j11 = -9223372036854775807L;
                                String[] strArr3 = f19922c;
                                while (true) {
                                    if (i11 < 2) {
                                        String m22769a3 = ha2.m22769a(newPullParser, strArr3[i11]);
                                        if (m22769a3 != null) {
                                            m20832w = c83.m20834z(new C5226z0("image/jpeg", "Primary", 0L, 0L), new C5226z0("video/mp4", "MotionPhoto", Long.parseLong(m22769a3), 0L));
                                            break;
                                        }
                                        i11++;
                                    } else {
                                        m20832w = c83.m20832w();
                                        break;
                                    }
                                }
                                j12 = j11;
                            }
                        }
                        return null;
                    }
                    if (ha2.m22771c(newPullParser, "Container:Directory")) {
                        m20832w = m21863b(newPullParser, "Container", "Item");
                    } else if (ha2.m22771c(newPullParser, "GContainer:Directory")) {
                        m20832w = m21863b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!ha2.m22770b(newPullParser, "x:xmpmeta"));
                if (m20832w.isEmpty()) {
                    return null;
                }
                return new C4301a1(j12, m20832w);
            }
            throw zzbu.m28711a("Couldn't find xmp metadata", null);
        } catch (zzbu | NumberFormatException | XmlPullParserException unused) {
            lr1.m24356e("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static c83 m21863b(XmlPullParser xmlPullParser, String str, String str2) {
        long j11;
        long j12;
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        z73 m20826p = c83.m20826p();
        do {
            xmlPullParser.next();
            if (ha2.m22771c(xmlPullParser, concat)) {
                String m22769a = ha2.m22769a(xmlPullParser, str2.concat(":Mime"));
                String m22769a2 = ha2.m22769a(xmlPullParser, str2.concat(":Semantic"));
                String m22769a3 = ha2.m22769a(xmlPullParser, str2.concat(":Length"));
                String m22769a4 = ha2.m22769a(xmlPullParser, str2.concat(":Padding"));
                if (m22769a != null && m22769a2 != null) {
                    if (m22769a3 != null) {
                        j11 = Long.parseLong(m22769a3);
                    } else {
                        j11 = 0;
                    }
                    if (m22769a4 != null) {
                        j12 = Long.parseLong(m22769a4);
                    } else {
                        j12 = 0;
                    }
                    m20826p.m28452f(new C5226z0(m22769a, m22769a2, j11, j12));
                } else {
                    return c83.m20832w();
                }
            }
        } while (!ha2.m22770b(xmlPullParser, concat2));
        return m20826p.m28454h();
    }
}
