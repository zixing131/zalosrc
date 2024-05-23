package vg;

import android.graphics.Bitmap;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Map;
import ln0.AbstractC22543l;
import md.C22986b;
import md.EnumC22985a;
import md.EnumC22987c;
import org.json.JSONObject;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;

/* renamed from: vg.a */
/* loaded from: classes3.dex */
public final class C28006a {
    /* renamed from: a */
    public final Bitmap m141159a(String str) {
        int m116584g;
        int i11;
        int m116584g2;
        int i12;
        Map m131407l;
        AbstractC19074t.m100208f(str, "jsonString");
        C22986b c22986b = C22986b.f111775a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("content", "");
            AbstractC19074t.m100205c(optString);
            if (optString.length() != 0) {
                m116584g = AbstractC22543l.m116584g(jSONObject.optInt("width", 300), 1080);
                if (m116584g <= 0) {
                    i11 = 300;
                } else {
                    i11 = m116584g;
                }
                m116584g2 = AbstractC22543l.m116584g(jSONObject.optInt("height", 300), 1080);
                if (m116584g2 <= 0) {
                    i12 = 300;
                } else {
                    i12 = m116584g2;
                }
                int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
                if (optInt < 0 || optInt >= 13) {
                    optInt = 0;
                }
                EnumC22985a m117750a = EnumC22985a.Companion.m117750a(optInt);
                if (m117750a != null) {
                    String optString2 = jSONObject.optString("bg_color", "#FFFFFF");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    String optString3 = jSONObject.optString("fg_color", "#000000");
                    AbstractC19074t.m100207e(optString3, "optString(...)");
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a(EnumC22987c.BACKGROUND_COLOR, optString2), AbstractC24866w.m129235a(EnumC22987c.FOREGROUND_COLOR, optString3));
                    return c22986b.m117752a(optString, m117750a, i11, i12, m131407l);
                }
                throw new IllegalArgumentException("Barcode type is missing or illegal: " + optInt);
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("GenBarcode").mo104552e(e11);
            return null;
        } catch (OutOfMemoryError e12) {
            AbstractC20110a.f98889a.m104564x("GenBarcode").mo104552e(e12);
            return null;
        }
    }
}
