package qg0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.security.Key;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qg0.AbstractC25270e;
import sg0.AbstractC26246b;
import sg0.C26245a;

/* renamed from: qg0.f */
/* loaded from: classes7.dex */
public final class C25271f {

    /* renamed from: a */
    public static final C25271f f121221a = new C25271f();

    /* renamed from: b */
    private static final InterfaceC24854k f121222b;

    /* renamed from: qg0.f$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f121223q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25273h mo12V4() {
            return AbstractC23306f.m120659e2();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f121223q);
        f121222b = m129210a;
    }

    private C25271f() {
    }

    /* renamed from: c */
    private final C25273h m130793c() {
        return (C25273h) f121222b.getValue();
    }

    /* renamed from: a */
    public final AbstractC25270e m130794a(String str, int i11) {
        AbstractC19074t.m100208f(str, "keyBundle");
        return m130793c().m130812d(i11).mo130805h(C26245a.f124654a.m134943a(str), "AES", 3);
    }

    /* renamed from: b */
    public final AbstractC25270e m130795b(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "keyBundle");
        return m130793c().m130813e(i11, i12).mo130805h(C26245a.f124654a.m134943a(str), "AES", 3);
    }

    /* renamed from: d */
    public final AbstractC25270e m130796d(String str, int i11) {
        AbstractC19074t.m100208f(str, "json");
        JSONObject jSONObject = new JSONObject(str);
        C26245a c26245a = C26245a.f124654a;
        String optString = jSONObject.optString("key");
        AbstractC19074t.m100207e(optString, "optString(...)");
        Key m134945c = c26245a.m134945c(AbstractC26246b.m134964c(optString), "AES", 3);
        if (i11 != 1) {
            if (i11 == 2) {
                String optString2 = jSONObject.optString("iv");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                return new AbstractC25270e.b(m134945c, AbstractC26246b.m134964c(optString2));
            }
            throw new IllegalArgumentException("Not support algorithm version = " + i11);
        }
        String optString3 = jSONObject.optString("iv");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        byte[] m134964c = AbstractC26246b.m134964c(optString3);
        String optString4 = jSONObject.optString("tag");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        return new AbstractC25270e.a(m134945c, m134964c, AbstractC26246b.m134964c(optString4));
    }

    /* renamed from: e */
    public final AbstractC25270e m130797e(String str, int i11) {
        AbstractC19074t.m100208f(str, "keyBundle");
        Key m130784b = m130793c().m130812d(i11).m130784b(C26245a.f124654a.m134943a(str), "AES", 3);
        AbstractC19074t.m100206d(m130784b, "null cannot be cast to non-null type com.zing.zalo.zalocloud.cryptography.key.ZaloCloudMediaEncryptionKey");
        return (AbstractC25270e) m130784b;
    }

    /* renamed from: f */
    public final AbstractC25270e m130798f(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "keyBundle");
        Key m130784b = m130793c().m130813e(i11, i12).m130784b(C26245a.f124654a.m134943a(str), "AES", 3);
        AbstractC19074t.m100206d(m130784b, "null cannot be cast to non-null type com.zing.zalo.zalocloud.cryptography.key.ZaloCloudMediaEncryptionKey");
        return (AbstractC25270e) m130784b;
    }

    /* renamed from: g */
    public final String m130799g(AbstractC25270e abstractC25270e) {
        AbstractC19074t.m100208f(abstractC25270e, "key");
        return AbstractC26246b.m134963b(m130793c().m130812d(abstractC25270e.m130786a()).mo130733e(abstractC25270e.mo130787b()));
    }
}
