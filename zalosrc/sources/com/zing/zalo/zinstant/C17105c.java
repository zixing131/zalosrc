package com.zing.zalo.zinstant;

import com.zing.zalo.preferences.C9050b;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.AbstractC20130d;
import org.json.JSONObject;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.zinstant.c */
/* loaded from: classes7.dex */
public final class C17105c {

    /* renamed from: a */
    public static final C17105c f87481a = new C17105c();

    /* renamed from: b */
    private static final InterfaceC24854k f87482b;

    /* renamed from: com.zing.zalo.zinstant.c$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f87483q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9050b mo12V4() {
            C9050b m48455n = C9050b.m48455n(CoreUtility.f89233i, AbstractC20130d.m104863X());
            AbstractC19074t.m100207e(m48455n, "makeInstance(...)");
            return m48455n;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f87483q);
        f87482b = m129210a;
    }

    private C17105c() {
    }

    /* renamed from: b */
    private final C9050b m91461b() {
        return (C9050b) f87482b.getValue();
    }

    /* renamed from: a */
    public final String m91462a(String str, String str2) {
        String mo48444e;
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "encryptedText");
        if (!m91461b().mo48445f(str) || (mo48444e = m91461b().mo48444e(str)) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(mo48444e);
        if (!jSONObject.has(str2)) {
            return null;
        }
        return jSONObject.getString(str2);
    }

    /* renamed from: c */
    public final void m91463c(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "encryptedText");
        AbstractC19074t.m100208f(str3, "decryptedText");
        if (m91461b().mo48445f(str)) {
            String mo48444e = m91461b().mo48444e(str);
            if (mo48444e != null) {
                JSONObject jSONObject = new JSONObject(mo48444e);
                jSONObject.put(str2, str3);
                f87481a.m91461b().mo48442c(str, jSONObject.toString());
                return;
            }
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(str2, str3);
        m91461b().mo48442c(str, jSONObject2.toString());
    }
}
