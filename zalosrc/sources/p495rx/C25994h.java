package p495rx;

import ag0.AbstractC0837p0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: rx.h */
/* loaded from: classes4.dex */
public final class C25994h {

    /* renamed from: a */
    public static final C25994h f124017a = new C25994h();

    /* renamed from: b */
    private static final HashMap f124018b = new HashMap();

    private C25994h() {
    }

    /* renamed from: f */
    public static final void m133913f() {
        C7960e.m41971c6().m42549u4();
    }

    /* renamed from: k */
    public static final void m133914k() {
        ArrayList m42462m5 = C7960e.m41971c6().m42462m5();
        HashMap hashMap = f124018b;
        synchronized (hashMap) {
            try {
                hashMap.clear();
                int size = m42462m5.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C26000n c26000n = (C26000n) m42462m5.get(i11);
                    HashMap hashMap2 = f124018b;
                    String m133962n = c26000n.m133962n();
                    AbstractC19074t.m100205c(c26000n);
                    hashMap2.put(m133962n, c26000n);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public static final void m133915m(String str) {
        AbstractC19074t.m100208f(str, "$conversationId");
        C7960e.m41971c6().m42556uc(str);
    }

    /* renamed from: p */
    public static final void m133916p() {
        C7960e.m41971c6().m42396g0();
    }

    /* renamed from: e */
    public final void m133917e() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.f
            @Override // java.lang.Runnable
            public final void run() {
                C25994h.m133913f();
            }
        });
        f124018b.clear();
    }

    /* renamed from: g */
    public final void m133918g(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        try {
            m133919h(str).m133960l();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: h */
    public final synchronized C26000n m133919h(String str) {
        C26000n c26000n;
        AbstractC19074t.m100208f(str, "conversationId");
        HashMap hashMap = f124018b;
        c26000n = (C26000n) hashMap.get(str);
        if (c26000n == null) {
            c26000n = new C26000n(str, true);
            hashMap.put(str, c26000n);
        }
        return c26000n;
    }

    /* renamed from: i */
    public final void m133920i(String str, long j11, long j12, String str2, String str3, int i11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "conversationId");
        try {
            C26000n m133919h = m133919h(str);
            AbstractC19074t.m100205c(str2);
            m133919h.m133970w(j11, j12, str2, str3, i11, new C7904b(jSONObject, str));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    public final void m133921j() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.e
            @Override // java.lang.Runnable
            public final void run() {
                C25994h.m133914k();
            }
        });
    }

    /* renamed from: l */
    public final void m133922l(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.d

            /* renamed from: p */
            public final /* synthetic */ String f124016p;

            public /* synthetic */ RunnableC25990d(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25994h.m133915m(r1);
            }
        });
        f124018b.remove(str2);
    }

    /* renamed from: n */
    public final void m133923n(String str, long j11, long j12, String str2, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "conversationId");
        try {
            C26000n m133919h = m133919h(str);
            AbstractC19074t.m100205c(str2);
            m133919h.m133951F(j11, j12, str2, arrayList);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o */
    public final void m133924o() {
        try {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: rx.g
                @Override // java.lang.Runnable
                public final void run() {
                    C25994h.m133916p();
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q */
    public final void m133925q(String str, long j11, long j12, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "conversationId");
        try {
            C26000n m133919h = m133919h(str);
            AbstractC19074t.m100205c(str2);
            m133919h.m133956R(j11, j12, str2, str3, i11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    public final void m133926r(String str, long j11, long j12, String str2, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "conversationId");
        try {
            C26000n m133919h = m133919h(str);
            AbstractC19074t.m100205c(str2);
            m133919h.m133957S(j11, j12, str2, new C7904b(jSONObject, str));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
