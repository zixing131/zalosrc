package me0;

import am.C0928o0;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import fn0.AbstractC19074t;
import gm0.AbstractC19509c;
import ho0.AbstractC20110a;
import on0.C24321d;
import org.json.JSONObject;
import p557ut.AbstractC27364a;

/* renamed from: me0.y1 */
/* loaded from: classes4.dex */
public final class C23267y1 {

    /* renamed from: a */
    private double f112765a;

    /* renamed from: b */
    private double f112766b;

    /* renamed from: c */
    private boolean f112767c;

    /* renamed from: a */
    public final C23267y1 m120024a(boolean z11) {
        this.f112767c = z11;
        return this;
    }

    /* renamed from: b */
    public final C23267y1 m120025b(double d11, double d12) {
        this.f112765a = d11;
        this.f112766b = d12;
        return this;
    }

    /* renamed from: c */
    public final void m120026c(C23257x1 c23257x1) {
        boolean z11;
        AbstractC19074t.m100208f(c23257x1, "exif");
        long currentTimeMillis = System.currentTimeMillis();
        double d11 = this.f112765a;
        if (d11 == 0.0d || this.f112766b == 0.0d) {
            z11 = false;
        } else {
            c23257x1.m119905R("GPSLatitude", AbstractC23085h2.m118417a(d11));
            c23257x1.m119905R("GPSLatitudeRef", AbstractC23085h2.m118418b(this.f112765a));
            c23257x1.m119905R("GPSLongitude", AbstractC23085h2.m118417a(this.f112766b));
            c23257x1.m119905R("GPSLongitudeRef", AbstractC23085h2.m118419c(this.f112766b));
            AbstractC20110a.f98889a.mo104548a("GEOTAGGED Lat=%f-Lng=%f", Double.valueOf(this.f112765a), Double.valueOf(this.f112766b));
            z11 = true;
        }
        String m4439h = C0928o0.m4439h(C0928o0.a.Companion.m4447a(), false, 2, null);
        if (this.f112767c && !TextUtils.isEmpty(m4439h) && !c23257x1.m119912x("ImageDescription")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("zcid", CoreUtils.m93451f());
                jSONObject.put("uid", CoreUtility.f89233i);
                jSONObject.put("version", String.valueOf(CoreUtility.f89236l));
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "data.toString()");
                byte[] bytes = jSONObject2.getBytes(C24321d.f117408b);
                AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
                String m101979b = AbstractC19509c.m101979b(AbstractC27364a.m140202a(bytes, m4439h));
                c23257x1.m119905R("ImageDescription", m101979b);
                AbstractC20110a.f98889a.mo104548a("writeExif imageDescription: %s", m101979b);
            } catch (Throwable unused) {
            }
            c23257x1.m119904P();
            AbstractC20110a.f98889a.mo104548a("writeExif in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        if (!z11) {
            return;
        }
        c23257x1.m119904P();
        AbstractC20110a.f98889a.mo104548a("writeExif in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
