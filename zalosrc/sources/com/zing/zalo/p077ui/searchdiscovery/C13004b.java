package com.zing.zalo.p077ui.searchdiscovery;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import ai.C0862b;
import am.AbstractC0939u;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import bg0.C2797c;
import ca0.C3388f;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.searchdiscovery.C13004b;
import com.zing.zalo.zinstant.C17244x0;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import ga0.C19310b1;
import ga0.C19322f1;
import gw.C19669z;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import lk0.InterfaceC22508f;
import me0.C23024b7;
import me0.C23282z6;
import mm0.AbstractC23350e;
import n00.C23507a;
import n00.C23508b;
import n00.C23513g;
import o00.C23976b;
import org.json.JSONObject;
import p140ev.C18620i;
import p205hc.AbstractC19963b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p405ov.C24561c;
import p534u1.AbstractC26941a;
import p578vk.AbstractC28275a;
import p604wb.C28905e;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import sk.C26302c;
import vg.AbstractC28025b8;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.searchdiscovery.b */
/* loaded from: classes6.dex */
public final class C13004b extends AbstractC19963b implements InterfaceC18319c {
    public static final a Companion = new a(null);

    /* renamed from: D */
    private final InterfaceC24854k f67193D;

    /* renamed from: E */
    private final C1761c0 f67194E;

    /* renamed from: F */
    private final C1761c0 f67195F;

    /* renamed from: G */
    private C23508b f67196G;

    /* renamed from: H */
    private C23513g f67197H;

    /* renamed from: t */
    private final C1761c0 f67198t = new C1761c0();

    /* renamed from: u */
    private final C1761c0 f67199u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f67200v = new C1761c0();

    /* renamed from: w */
    private final C1761c0 f67201w = new C1761c0();

    /* renamed from: x */
    private final C1761c0 f67202x = new C1761c0();

    /* renamed from: y */
    private final C1761c0 f67203y = new C1761c0();

    /* renamed from: z */
    private final C1761c0 f67204z = new C1761c0();

    /* renamed from: A */
    private final C1761c0 f67190A = new C1761c0();

    /* renamed from: B */
    private final C26302c f67191B = new C26302c();

    /* renamed from: C */
    private final C2797c f67192C = new C2797c(AbstractC0837p0.Companion.m2237f());

    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$b */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a */
        private final String f67205a;

        /* renamed from: b */
        private final String f67206b;

        /* renamed from: c */
        private final JSONObject f67207c;

        public b(String str, String str2, JSONObject jSONObject) {
            AbstractC19074t.m100208f(str, "action");
            AbstractC19074t.m100208f(str2, "data");
            this.f67205a = str;
            this.f67206b = str2;
            this.f67207c = jSONObject;
        }

        /* renamed from: a */
        public final String m73034a() {
            return this.f67205a;
        }

        /* renamed from: b */
        public final String m73035b() {
            return this.f67206b;
        }

        /* renamed from: c */
        public final JSONObject m73036c() {
            return this.f67207c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f67205a, bVar.f67205a) && AbstractC19074t.m100204b(this.f67206b, bVar.f67206b) && AbstractC19074t.m100204b(this.f67207c, bVar.f67207c);
        }

        public int hashCode() {
            int hashCode = ((this.f67205a.hashCode() * 31) + this.f67206b.hashCode()) * 31;
            JSONObject jSONObject = this.f67207c;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "ExternalActionData(action=" + this.f67205a + ", data=" + this.f67206b + ", subData=" + this.f67207c + ")";
        }

        public /* synthetic */ b(String str, String str2, JSONObject jSONObject, int i11, AbstractC19060k abstractC19060k) {
            this(str, str2, (i11 & 4) != 0 ? null : jSONObject);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$c */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a */
        private final C0862b f67208a;

        /* renamed from: b */
        private final C18620i f67209b;

        public c(C0862b c0862b, C18620i c18620i) {
            AbstractC19074t.m100208f(c0862b, "profile");
            this.f67208a = c0862b;
            this.f67209b = c18620i;
        }

        /* renamed from: a */
        public final C0862b m73037a() {
            return this.f67208a;
        }

        /* renamed from: b */
        public final C18620i m73038b() {
            return this.f67209b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f67208a, cVar.f67208a) && AbstractC19074t.m100204b(this.f67209b, cVar.f67209b);
        }

        public int hashCode() {
            int hashCode = this.f67208a.hashCode() * 31;
            C18620i c18620i = this.f67209b;
            return hashCode + (c18620i == null ? 0 : c18620i.hashCode());
        }

        public String toString() {
            return "OpenMiniAppInfo(profile=" + this.f67208a + ", source=" + this.f67209b + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$d */
    /* loaded from: classes6.dex */
    public static final class d implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C13004b();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f67210t;

        /* renamed from: v */
        final /* synthetic */ b f67212v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f67212v = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f67212v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f67210t == 0) {
                AbstractC24862s.m129228b(obj);
                C13004b.this.f67200v.mo9224q(this.f67212v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f67213a;

        /* renamed from: b */
        final /* synthetic */ C13004b f67214b;

        f(ContactProfile contactProfile, C13004b c13004b) {
            this.f67213a = contactProfile;
            this.f67214b = c13004b;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C19310b1.m101067k(this.f67213a);
            C7960e.m41971c6().m42211N7(this.f67213a.f42434r, System.currentTimeMillis());
            if (C28203u6.m141798e(C28203u6.f131407a, this.f67213a.f42434r, null, 2, null) == null) {
                C7960e m41971c6 = C7960e.m41971c6();
                ContactProfile contactProfile = this.f67213a;
                m41971c6.m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
            }
            C7960e m41971c62 = C7960e.m41971c6();
            String m73023b0 = this.f67214b.m73023b0();
            ContactProfile contactProfile2 = this.f67213a;
            m41971c62.m42423i8(m73023b0, contactProfile2.f42434r, contactProfile2.m40383Q(true, false), this.f67213a.f42365O1);
            C19310b1.m101066j(this.f67214b.m73023b0());
            this.f67214b.m73017P0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f67215q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(C19322f1.f95950a.m101150g());
        }
    }

    /* renamed from: com.zing.zalo.ui.searchdiscovery.b$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f67216t;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f67216t == 0) {
                AbstractC24862s.m129228b(obj);
                C23508b c23508b = C13004b.this.f67196G;
                if (c23508b != null) {
                    c23508b.m101436c();
                }
                C13004b c13004b = C13004b.this;
                C23508b c23508b2 = new C23508b(c13004b, null, 2, null);
                c23508b2.m101442j();
                c13004b.f67196G = c23508b2;
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C13004b() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(g.f67215q);
        this.f67193D = m129210a;
        this.f67194E = new C1761c0();
        this.f67195F = new C1761c0();
    }

    /* renamed from: A0 */
    public static final void m72977A0(C13004b c13004b, JSONObject jSONObject) {
        AbstractC19074t.m100208f(c13004b, "this$0");
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        c13004b.m72991a0(new b("js.action.globalsearch", jSONObject2, jSONObject));
    }

    /* renamed from: M0 */
    private final void m72978M0(ContactProfile contactProfile) {
        try {
            TrackingSource trackingSource = new TrackingSource(273);
            trackingSource.m40677a("sourceView", 11);
            int i11 = contactProfile.f42350J1;
            if (i11 != -1) {
                trackingSource.m40677a("campaignId", Integer.valueOf(i11));
                trackingSource.m40677a("srcId", Integer.valueOf(contactProfile.f42376S0));
                trackingSource.m40677a("tracking_src", contactProfile.f42422m0);
            }
            C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
        }
    }

    /* renamed from: S0 */
    private final void m72984S0() {
        String str;
        C3388f c3388f = C3388f.f14324a;
        C26302c c26302c = this.f67191B;
        C13003a c13003a = (C13003a) m103747M();
        if (c13003a == null || (str = c13003a.m72974a()) == null) {
            str = "0";
        }
        c3388f.m17058j(c26302c, str);
    }

    /* renamed from: U0 */
    public static final void m72987U0(C13004b c13004b, String str, b bVar) {
        AbstractC19074t.m100208f(c13004b, "this$0");
        AbstractC19074t.m100208f(str, "$keyword");
        c13004b.m72991a0(c13004b.m72990X(str, bVar));
    }

    /* renamed from: X */
    private final b m72990X(String str, b bVar) {
        JSONObject jSONObject;
        if (bVar == null || (jSONObject = bVar.m73036c()) == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("keyword", str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return new b("js.action.globalsearch", jSONObject2, jSONObject);
    }

    /* renamed from: a0 */
    private final void m72991a0(b bVar) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new e(bVar, null), 2, null);
    }

    /* renamed from: k0 */
    private final int m72992k0() {
        return ((Number) this.f67193D.getValue()).intValue();
    }

    /* renamed from: n0 */
    private final void m72993n0(String str) {
        if (str == null) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ba0.i

            /* renamed from: q */
            public final /* synthetic */ String f10703q;

            public /* synthetic */ RunnableC2679i(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13004b.m72994o0(C13004b.this, r2);
            }
        });
    }

    /* renamed from: o0 */
    public static final void m72994o0(C13004b c13004b, String str) {
        Object m129218b;
        String optString;
        AbstractC19074t.m100208f(c13004b, "this$0");
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(new JSONObject(str));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        JSONObject jSONObject = (JSONObject) m129218b;
        if (jSONObject != null && (optString = jSONObject.optString("query")) != null) {
            c13004b.f67204z.mo9221n(optString);
        }
    }

    /* renamed from: p0 */
    private final void m72995p0(ContactProfile contactProfile) {
        m73003x0(contactProfile);
        if (contactProfile.f42350J1 != -1) {
            m73004y0(contactProfile);
        }
        if (!C21927m.m114302u().m114318P(contactProfile.f42434r) && !C19669z.f97573U.containsKey(contactProfile.f42434r)) {
            m72978M0(contactProfile);
            this.f67202x.mo9221n(contactProfile);
        } else {
            this.f67191B.m135414o("1");
            this.f67201w.mo9221n(contactProfile);
        }
    }

    /* renamed from: q0 */
    private final void m72996q0(String str, boolean z11) {
        if (str == null) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ba0.m

            /* renamed from: p */
            public final /* synthetic */ String f10711p;

            /* renamed from: q */
            public final /* synthetic */ boolean f10712q;

            /* renamed from: r */
            public final /* synthetic */ C13004b f10713r;

            public /* synthetic */ RunnableC2683m(String str2, boolean z112, C13004b this) {
                r1 = str2;
                r2 = z112;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13004b.m72997r0(r1, r2, r3);
            }
        });
    }

    /* renamed from: r0 */
    public static final void m72997r0(String str, boolean z11, C13004b c13004b) {
        C18620i c18620i;
        AbstractC19074t.m100208f(c13004b, "this$0");
        try {
            C0862b m125473b = C23976b.f116043a.m125473b(new JSONObject(str));
            if (m125473b == null) {
                return;
            }
            if (z11) {
                c18620i = C18620i.f93668K;
            } else {
                c18620i = C18620i.f93669L;
            }
            c13004b.f67203y.mo9221n(new c(m125473b, c18620i));
            c13004b.m73002w0(m125473b, z11);
            c13004b.m73017P0();
            c13004b.f67190A.mo9221n(C24848g0.f119245a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
        }
    }

    /* renamed from: s0 */
    private final void m72998s0(String str) {
        AbstractC28275a.g gVar;
        if (str == null) {
            return;
        }
        C19059j0 c19059j0 = new C19059j0();
        try {
            String optString = new JSONObject(str).optString("uid");
            List m135390b = this.f67191B.m135407h().m135390b();
            if (m135390b != null) {
                for (Object obj : m135390b) {
                    if (AbstractC19074t.m100204b(((AbstractC28275a.g) obj).m142475c().mo2478b(), optString)) {
                        gVar = (AbstractC28275a.g) obj;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            gVar = null;
            if (gVar != null && (gVar.m142475c() instanceof ContactProfile)) {
                c19059j0.f94941p = gVar.m142475c();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
        }
        if (c19059j0.f94941p == null) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ba0.j

            /* renamed from: q */
            public final /* synthetic */ C19059j0 f10705q;

            public /* synthetic */ RunnableC2680j(C19059j0 c19059j02) {
                r2 = c19059j02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13004b.m72999t0(C13004b.this, r2);
            }
        });
    }

    /* renamed from: t0 */
    public static final void m72999t0(C13004b c13004b, C19059j0 c19059j0) {
        AbstractC19074t.m100208f(c13004b, "this$0");
        AbstractC19074t.m100208f(c19059j0, "$oaProfileClicked");
        try {
            c13004b.m72995p0((ContactProfile) c19059j0.f94941p);
            c13004b.f67190A.mo9221n(C24848g0.f119245a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
        }
    }

    /* renamed from: u0 */
    private final void m73000u0(String str) {
        if (str == null) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ba0.n

            /* renamed from: p */
            public final /* synthetic */ String f10714p;

            /* renamed from: q */
            public final /* synthetic */ C13004b f10715q;

            public /* synthetic */ RunnableC2684n(String str2, C13004b this) {
                r1 = str2;
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13004b.m73001v0(r1, r2);
            }
        });
    }

    /* renamed from: v0 */
    public static final void m73001v0(String str, C13004b c13004b) {
        AbstractC19074t.m100208f(c13004b, "this$0");
        try {
            ContactProfile m125472a = C23976b.f116043a.m125472a(new JSONObject(str));
            if (m125472a == null) {
                return;
            }
            c13004b.m72995p0(m125472a);
            c13004b.f67190A.mo9221n(C24848g0.f119245a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
        }
    }

    /* renamed from: w0 */
    private final void m73002w0(C0862b c0862b, boolean z11) {
        C7960e m41971c6 = C7960e.m41971c6();
        m41971c6.m42211N7(c0862b.mo2478b(), System.currentTimeMillis());
        m41971c6.m42423i8(m73023b0(), c0862b.mo2478b(), c0862b.mo2475c(), c0862b.mo2481g());
        if (z11) {
            C19310b1.m101066j(m73023b0());
        }
    }

    /* renamed from: x0 */
    private final void m73003x0(ContactProfile contactProfile) {
        C0824j.m2153b(new f(contactProfile, this));
    }

    /* renamed from: y0 */
    private final void m73004y0(ContactProfile contactProfile) {
        C28905e.m144373n().m144399u(String.valueOf(contactProfile.f42350J1), 20, 96, contactProfile.f42376S0, System.currentTimeMillis(), contactProfile.f42422m0);
    }

    /* renamed from: B0 */
    public final LiveData m73005B0() {
        return this.f67199u;
    }

    /* renamed from: C0 */
    public final void m73006C0() {
        C24848g0 c24848g0;
        try {
            InterfaceC22508f m92064b = new C17244x0(47, new JSONObject(C19322f1.f95950a.m101151h())).m92064b();
            if (m92064b != null) {
                C24561c.m127942b("SearchDiscovery", "Success build zinstant data");
                this.f67198t.mo9221n(m92064b);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                C24561c.m127942b("SearchDiscovery", "Error build zinstant data");
                this.f67199u.mo9221n(Boolean.TRUE);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
            this.f67199u.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: D0 */
    public final void m73007D0() {
        this.f67190A.mo9224q(C24848g0.f119245a);
        this.f67191B.m135414o("2");
    }

    /* renamed from: E0 */
    public final void m73008E0() {
        this.f67191B.m135414o("3");
        C1761c0 c1761c0 = this.f67190A;
        C24848g0 c24848g0 = C24848g0.f119245a;
        c1761c0.mo9224q(c24848g0);
        this.f67195F.mo9224q(c24848g0);
        AbstractC28025b8.m141442M("tip.globalsearch.qr");
    }

    /* renamed from: F0 */
    public final void m73009F0() {
        this.f67191B.m135414o("2");
    }

    /* renamed from: G0 */
    public final void m73010G0(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        bundle.putLong("EXTRA_SEARCH_SESSION_ID", this.f67191B.m135411l());
    }

    /* renamed from: I0 */
    public final void m73011I0() {
        C23282z6.m120365a(4096);
        C23024b7.m118045a();
    }

    /* renamed from: J0 */
    public final void m73012J0() {
        try {
            this.f67190A.mo9224q(C24848g0.f119245a);
            C23513g c23513g = this.f67197H;
            if (c23513g != null) {
                c23513g.m101436c();
            }
            C3388f c3388f = C3388f.f14324a;
            c3388f.m17059o();
            c3388f.m17056f(this.f67191B);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: K0 */
    public final void m73013K0(Bundle bundle) {
        if (bundle == null) {
            m72984S0();
            return;
        }
        Long valueOf = Long.valueOf(bundle.getLong("EXTRA_SEARCH_SESSION_ID"));
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.f67191B.m135422w(valueOf.longValue());
        }
    }

    /* renamed from: L0 */
    public final boolean m73014L0(String str, String str2, boolean z11) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1080939983:
                    if (str.equals("action.globalsearch.result.click_ma")) {
                        m72996q0(str2, z11);
                        return true;
                    }
                    return false;
                case -1080939921:
                    if (str.equals("action.globalsearch.result.click_oa")) {
                        m73000u0(str2);
                        return true;
                    }
                    return false;
                case 1260005534:
                    if (str.equals("action.globalsearch.prestate.click_oa")) {
                        m72998s0(str2);
                        return true;
                    }
                    return false;
                case 1522565683:
                    if (str.equals("action.globalsearch.search")) {
                        m72993n0(str2);
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }
        return false;
    }

    /* renamed from: N0 */
    public final void m73015N0(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f67191B.m135415p(str);
    }

    /* renamed from: O0 */
    public final void m73016O0(String str) {
        AbstractC19074t.m100208f(str, "dataCopied");
        this.f67191B.m135416q(str);
    }

    /* renamed from: P0 */
    public final void m73017P0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new h(null), 2, null);
    }

    /* renamed from: Q0 */
    public final void m73018Q0() {
        if (m72992k0() == 1) {
            this.f67194E.mo9224q(new b("js.action.globalsearch.startsearch", m73023b0(), null, 4, null));
            return;
        }
        C23513g c23513g = this.f67197H;
        if (c23513g != null) {
            c23513g.m101436c();
        }
        C23513g c23513g2 = new C23513g(this, m73023b0());
        c23513g2.m101442j();
        this.f67197H = c23513g2;
    }

    /* renamed from: R0 */
    public final void m73019R0() {
        C3388f.f14324a.m17057h(this.f67191B);
    }

    /* renamed from: T0 */
    public final void m73020T0(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        this.f67192C.mo13474a(new Runnable() { // from class: ba0.l

            /* renamed from: q */
            public final /* synthetic */ String f10709q;

            /* renamed from: r */
            public final /* synthetic */ C13004b.b f10710r;

            public /* synthetic */ RunnableC2682l(String str2, C13004b.b bVar) {
                r2 = str2;
                r3 = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13004b.m72987U0(C13004b.this, r2, r3);
            }
        });
    }

    /* renamed from: Y */
    public final void m73021Y() {
        if (m72992k0() == 1) {
            this.f67194E.mo9224q(new b("js.action.globalsearch.startsearch", "", null, 4, null));
            return;
        }
        C23513g c23513g = this.f67197H;
        if (c23513g != null) {
            c23513g.m101436c();
        }
        this.f67197H = null;
    }

    /* renamed from: Z */
    public final void m73022Z() {
        new C23507a(this, "", new C18316b("ACTION_SEARCH_DISCOVERY_TASK_RESULT_CLEAR_DATA", null, null, null, 14, null)).m101442j();
    }

    /* renamed from: b0 */
    public final String m73023b0() {
        return this.f67191B.m135401b();
    }

    /* renamed from: c0 */
    public final LiveData m73024c0() {
        return this.f67194E;
    }

    /* renamed from: e0 */
    public final LiveData m73025e0() {
        return this.f67200v;
    }

    /* renamed from: f0 */
    public final LiveData m73026f0() {
        return this.f67190A;
    }

    /* renamed from: g0 */
    public final LiveData m73027g0() {
        return this.f67201w;
    }

    /* renamed from: h0 */
    public final LiveData m73028h0() {
        return this.f67203y;
    }

    /* renamed from: i0 */
    public final LiveData m73029i0() {
        return this.f67202x;
    }

    /* renamed from: j0 */
    public final LiveData m73030j0() {
        return this.f67195F;
    }

    /* renamed from: l0 */
    public final LiveData m73031l0() {
        return this.f67204z;
    }

    /* renamed from: m0 */
    public final LiveData m73032m0() {
        return this.f67198t;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: z0 */
    public C18316b mo205i9(C18316b c18316b) {
        JSONObject jSONObject;
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "Search.GetSearchSessionData")) {
            return new C18316b("Search.GetSearchSessionData", this.f67191B, null, null, 12, null);
        }
        if (AbstractC19074t.m100204b(m97246b, "SearchDiscovery.Task.SubmitData")) {
            Object m97245a = c18316b.m97245a();
            if (m97245a instanceof JSONObject) {
                jSONObject = (JSONObject) m97245a;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                this.f67192C.mo13474a(new Runnable() { // from class: ba0.k

                    /* renamed from: q */
                    public final /* synthetic */ JSONObject f10707q;

                    public /* synthetic */ RunnableC2681k(JSONObject jSONObject2) {
                        r2 = jSONObject2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C13004b.m72977A0(C13004b.this, r2);
                    }
                });
            }
        }
        return null;
    }
}
