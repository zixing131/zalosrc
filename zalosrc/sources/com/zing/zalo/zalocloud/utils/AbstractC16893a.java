package com.zing.zalo.zalocloud.utils;

import ch0.AbstractC3488c;
import com.zing.zalo.data.zalocloud.model.api.EncryptInfo;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17969i0;
import dj.C17981m0;
import dj.C17990p0;
import dj.C18009w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import me0.AbstractC23041d2;
import on0.AbstractC24341v;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p613wl.C29085a;
import qg0.AbstractC25270e;
import qg0.C25271f;
import tg0.C26676b;
import un0.AbstractC27323a;
import un0.AbstractC27331i;

/* renamed from: com.zing.zalo.zalocloud.utils.a */
/* loaded from: classes7.dex */
public abstract class AbstractC16893a {
    /* renamed from: a */
    public static final int m90324a(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        if (m90329f(c25821b)) {
            return 6;
        }
        return 3;
    }

    /* renamed from: b */
    public static final AbstractC25270e m90325b(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        if (c25821b.m133144g() != null) {
            return C25271f.f121221a.m130796d(c25821b.m133144g().m133162b(), c25821b.m133144g().m133161a());
        }
        if (c25821b.m133155r()) {
            return AbstractC3488c.m17490m(c25821b.m133146i());
        }
        C26676b.m136956f("CloudMediaItem: `encryptInfo` is NULL, try to get fallback key: msgId=" + c25821b.m133146i(), C26676b.b.f126335t);
        return m90337n(c25821b);
    }

    /* renamed from: c */
    public static final MediaExtInfo m90326c(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        if (c25821b.m133140c() != null) {
            return c25821b.m133140c();
        }
        MediaExtInfo m90335l = m90335l(c25821b);
        if (m90335l != null) {
            c25821b.m133158u(m90335l);
            return m90335l;
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m90327d(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        return AbstractC19646n0.m102995k1(c25821b.m133147j());
    }

    /* renamed from: e */
    public static final boolean m90328e(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        return AbstractC19646n0.m103003m1(c25821b.m133147j());
    }

    /* renamed from: f */
    public static final boolean m90329f(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        return AbstractC25495a.m132079d(c25821b.m133146i().m41048l());
    }

    /* renamed from: g */
    public static final boolean m90330g(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        return AbstractC19646n0.m103031t1(c25821b.m133147j());
    }

    /* renamed from: h */
    public static final boolean m90331h(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        return AbstractC19646n0.m102886D1(c25821b.m133147j());
    }

    /* renamed from: i */
    public static final boolean m90332i(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "<this>");
        return AbstractC19646n0.m102889E1(c25821b.m133147j());
    }

    /* renamed from: j */
    private static final MediaExtInfo m90333j(int i11, String str) {
        KSerializer m90323a = MediaExtInfo.Companion.m90323a(i11);
        if (m90323a != null) {
            return (MediaExtInfo) C29085a.f134890a.m145315b().m139867d(m90323a, str);
        }
        return null;
    }

    /* renamed from: k */
    private static final MediaExtInfo m90334k(int i11, JsonElement jsonElement) {
        KSerializer m90323a = MediaExtInfo.Companion.m90323a(i11);
        if (m90323a != null) {
            return (MediaExtInfo) C29085a.f134890a.m145315b().m139866c(m90323a, jsonElement);
        }
        return null;
    }

    /* renamed from: l */
    public static final MediaExtInfo m90335l(C25821b c25821b) {
        String str;
        MediaExtInfo m90334k;
        AbstractC19074t.m100208f(c25821b, "<this>");
        if (c25821b.m133145h().m133165b() != null) {
            str = c25821b.m133145h().m133165b();
        } else if (c25821b.m133155r()) {
            str = AbstractC3488c.m17482e(c25821b.m133146i());
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            JsonObject m139916m = AbstractC27331i.m139916m(C29085a.f134890a.m145315b().m139871h(str));
            if (m139916m.containsKey("data")) {
                C26676b.m136958h("Media ext info didn't decrypted before, try to decrypt from raw response", null, 2, null);
                m90334k = m90338o(c25821b.m133147j(), m139916m);
            } else {
                m90334k = m90334k(c25821b.m133147j(), m139916m);
            }
            return m90334k;
        } catch (Exception e11) {
            C26676b.m136953c(e11);
            return null;
        }
    }

    /* renamed from: m */
    public static final MediaExtInfo m90336m(C17969i0 c17969i0) {
        boolean m127128x;
        AbstractC19074t.m100208f(c17969i0, "<this>");
        if (c17969i0 instanceof C18009w0) {
            C18009w0 c18009w0 = (C18009w0) c17969i0;
            return new MediaExtInfo.Photo(c18009w0.m95787u(), c18009w0.m95785s(), 0, 0);
        }
        if (c17969i0 instanceof C17961f1) {
            C17961f1 c17961f1 = (C17961f1) c17969i0;
            return new MediaExtInfo.Video(c17961f1.m95456J(), c17961f1.m95514z(), 0, 0, c17961f1.m95508w());
        }
        if (c17969i0 instanceof C17990p0) {
            String str = c17969i0.f91011p;
            C17990p0 c17990p0 = (C17990p0) c17969i0;
            int i11 = c17990p0.f91123L;
            String str2 = c17990p0.f91124M;
            AbstractC19074t.m100207e(str2, "mFileData");
            String str3 = c17990p0.f91115D;
            AbstractC19074t.m100207e(str3, "mFileExt");
            return new MediaExtInfo.File(str, (String) null, i11, str2, str3, 2, (AbstractC19060k) null);
        }
        String str4 = null;
        if (c17969i0 instanceof C17964g1) {
            C17964g1 c17964g1 = (C17964g1) c17969i0;
            long m95530g = c17964g1.m95530g();
            String m95534l = c17964g1.m95534l();
            m127128x = AbstractC24341v.m127128x(m95534l);
            if (!m127128x) {
                str4 = m95534l;
            }
            if (str4 == null) {
                str4 = c17969i0.f91014s;
            }
            String m118221t = AbstractC23041d2.m118221t(str4, false);
            AbstractC19074t.m100207e(m118221t, "getFileExtension(...)");
            return new MediaExtInfo.Voice(m95530g, m118221t);
        }
        if (c17969i0 instanceof C17981m0) {
            C17981m0 c17981m0 = (C17981m0) c17969i0;
            return new MediaExtInfo.Doodle(c17981m0.f91074B, c17981m0.f91075C);
        }
        C26676b.m136958h("getCloudMediaExtInfo(): Unsupported on parsing chat rich content to media ext info on class " + c17969i0.getClass().getSimpleName(), null, 2, null);
        return null;
    }

    /* renamed from: n */
    private static final AbstractC25270e m90337n(C25821b c25821b) {
        String m133148k;
        AbstractC25270e abstractC25270e = null;
        try {
            m133148k = c25821b.m133148k();
        } catch (Exception e11) {
            C26676b.m136953c(e11);
            C26676b.m136956f("CloudMediaItem: getFallbackEncryptionKey(): " + e11, C26676b.b.f126335t);
        }
        if (m133148k != null && m133148k.length() != 0) {
            AbstractC27323a.a aVar = AbstractC27323a.f128573d;
            String m133148k2 = c25821b.m133148k();
            aVar.mo131586a();
            C25821b.a m17491n = AbstractC3488c.m17491n((EncryptInfo) aVar.m139867d(EncryptInfo.Companion.serializer(), m133148k2));
            if (m17491n != null) {
                abstractC25270e = C25271f.f121221a.m130796d(m17491n.m133162b(), m17491n.m133161a());
            } else {
                C26676b.m136958h("CloudMediaItem: [0]getFallbackEncryptionKey(): return null", null, 2, null);
            }
            return abstractC25270e;
        }
        C26676b.m136958h("CloudMediaItem: [1]getFallbackEncryptionKey(): return null", null, 2, null);
        return abstractC25270e;
    }

    /* renamed from: o */
    private static final MediaExtInfo m90338o(int i11, JsonObject jsonObject) {
        com.zing.zalo.data.zalocloud.model.api.MediaExtInfo mediaExtInfo;
        try {
            mediaExtInfo = (com.zing.zalo.data.zalocloud.model.api.MediaExtInfo) C29085a.f134890a.m145315b().m139866c(com.zing.zalo.data.zalocloud.model.api.MediaExtInfo.Companion.serializer(), jsonObject);
        } catch (Exception e11) {
            C26676b.m136958h("tryToParseEncryptedMediaExtInfo(): Error while parsing encrypted media ext info, json=" + jsonObject + ", errMsg=" + e11.getMessage(), null, 2, null);
            mediaExtInfo = null;
        }
        if (mediaExtInfo == null) {
            return null;
        }
        try {
            return m90333j(i11, AbstractC3488c.m17489l(mediaExtInfo));
        } catch (Exception e12) {
            C26676b.m136953c(e12);
            return null;
        }
    }
}
