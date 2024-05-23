package p588vw;

import android.content.res.XmlResourceParser;
import android.telephony.TelephonyManager;
import com.zing.zalo.AbstractC8925i0;
import com.zing.zalo.MainApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: vw.m */
/* loaded from: classes4.dex */
public final class C28647m {

    /* renamed from: d */
    private static volatile C28647m f132806d;

    /* renamed from: a */
    private final TreeMap f132807a = new TreeMap();

    /* renamed from: b */
    private final ArrayList f132808b = new ArrayList();

    /* renamed from: c */
    private final ArrayList f132809c = new ArrayList();

    private C28647m() {
        m143326e();
    }

    /* renamed from: c */
    public static synchronized C28647m m143325c() {
        C28647m c28647m;
        synchronized (C28647m.class) {
            try {
                if (f132806d == null) {
                    synchronized (C28647m.class) {
                        try {
                            if (f132806d == null) {
                                f132806d = new C28647m();
                            }
                        } finally {
                        }
                    }
                }
                c28647m = f132806d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28647m;
    }

    /* renamed from: e */
    private void m143326e() {
        try {
            XmlResourceParser xml = MainApplication.getAppContext().getResources().getXml(AbstractC8925i0.itcountrycodes);
            int i11 = -1;
            int i12 = 0;
            while (i11 != 1) {
                if (i11 == 2) {
                    if (xml.getName().equals("item")) {
                        String attributeValue = xml.getAttributeValue(null, "country");
                        String str = xml.getAttributeValue(null, "isocountrycodes").split("/")[0];
                        C28655u c28655u = new C28655u(attributeValue, str, xml.getAttributeValue(null, "countrycode"), i12, false, false);
                        this.f132807a.put(str, c28655u);
                        this.f132808b.add(c28655u);
                        this.f132809c.add(c28655u.m143391b());
                        i12++;
                    }
                }
                try {
                    try {
                        try {
                            i11 = xml.next();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                } catch (XmlPullParserException e13) {
                    e13.printStackTrace();
                }
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    /* renamed from: a */
    public ArrayList m143327a() {
        return this.f132808b;
    }

    /* renamed from: b */
    public TreeMap m143328b() {
        return this.f132807a;
    }

    /* renamed from: d */
    public String m143329d() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) MainApplication.getAppContext().getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimCountryIso().toUpperCase();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
