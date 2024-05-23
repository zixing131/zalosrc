package p445qe;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0804b;
import ag0.C0815e1;
import am.AbstractC0924m0;
import bp0.AbstractC3096i0;
import com.zing.zalo.control.ContactProfile;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p394oj.C24275a;
import p716zh.C31853b5;
import p716zh.C31879d1;
import p716zh.C31894e1;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: qe.a */
/* loaded from: classes3.dex */
public final class C25244a {

    /* renamed from: a */
    public static final C25244a f121072a = new C25244a();

    /* renamed from: b */
    private static final InterfaceC24854k f121073b;

    /* renamed from: c */
    private static volatile boolean f121074c;

    /* renamed from: d */
    private static volatile C31853b5 f121075d;

    /* renamed from: e */
    private static volatile int f121076e;

    /* renamed from: qe.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121077t;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f121077t == 0) {
                AbstractC24862s.m129228b(obj);
                C25244a c25244a = C25244a.f121072a;
                C25244a.f121076e = AbstractC0924m0.m4221t5();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121078t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            String m2897A5;
            boolean m127128x;
            AbstractC28298d.m142578e();
            if (this.f121078t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    m2897A5 = AbstractC0924m0.m2897A5();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                if (m2897A5 != null) {
                    m127128x = AbstractC24341v.m127128x(m2897A5);
                    if (!m127128x) {
                        C25244a.f121075d.clear();
                        JSONArray jSONArray = new JSONArray(m2897A5);
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            if (jSONObject.has("userId")) {
                                ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, jSONObject.optString("userId"), false, 2, null);
                                if (m141800i == null) {
                                    C31853b5 c31853b5 = C25244a.f121075d;
                                    C25244a c25244a = C25244a.f121072a;
                                    AbstractC19074t.m100205c(jSONObject);
                                    c31853b5.add(c25244a.m130641u(jSONObject));
                                } else {
                                    C25244a.f121075d.add(m141800i);
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f121079q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0766k mo12V4() {
            return new C0766k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qe.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121080t;

        /* renamed from: u */
        final /* synthetic */ String f121081u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation continuation) {
            super(2, continuation);
            this.f121081u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f121081u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            C25244a c25244a;
            AbstractC28298d.m142578e();
            if (this.f121080t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    c25244a = C25244a.f121072a;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    e11.printStackTrace();
                }
                if (!c25244a.m130656t(this.f121081u)) {
                    return C24848g0.f119245a;
                }
                if (AbstractC23304d.f113360a2) {
                    C31879d1 m130636m = c25244a.m130636m(this.f121081u);
                    m130636m.m153204q(1L);
                    m130636m.m153199k();
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qe.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121082t;

        /* renamed from: u */
        final /* synthetic */ String f121083u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation continuation) {
            super(2, continuation);
            this.f121083u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f121083u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f121082t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                if (!AbstractC23304d.f113360a2) {
                    return C24848g0.f119245a;
                }
                C24275a m2032f = C0804b.m2025g().m2032f(this.f121083u);
                if (m2032f != null) {
                    String str = this.f121083u;
                    if (m2032f.m126772i()) {
                        C25244a c25244a = C25244a.f121072a;
                        C31879d1 m130636m = c25244a.m130636m(str);
                        long m153195g = m130636m.m153195g();
                        m130636m.m153203p(System.currentTimeMillis());
                        if (c25244a.m130637n(m153195g) > 300000) {
                            return C24848g0.f119245a;
                        }
                        if (m130636m.m153197i() == 0) {
                            m130636m.m153205r(System.currentTimeMillis());
                            m130636m.m153199k();
                        }
                    }
                }
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

    /* renamed from: qe.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121084t;

        /* renamed from: u */
        final /* synthetic */ String f121085u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation continuation) {
            super(2, continuation);
            this.f121085u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f121085u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f121084t == 0) {
                AbstractC24862s.m129228b(obj);
                C31879d1 m130636m = C25244a.f121072a.m130636m(this.f121085u);
                m130636m.m153204q(-1L);
                m130636m.m153199k();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121086t;

        /* renamed from: u */
        final /* synthetic */ String f121087u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Continuation continuation) {
            super(2, continuation);
            this.f121087u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f121087u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f121086t == 0) {
                AbstractC24862s.m129228b(obj);
                C31879d1 m130636m = C25244a.f121072a.m130636m(this.f121087u);
                m130636m.m153205r(-1L);
                m130636m.m153199k();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121088t;

        /* renamed from: u */
        final /* synthetic */ JSONArray f121089u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(JSONArray jSONArray, Continuation continuation) {
            super(2, continuation);
            this.f121089u = jSONArray;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f121089u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121088t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ArrayList arrayList = new ArrayList();
                int length = this.f121089u.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject optJSONObject = this.f121089u.optJSONObject(i12);
                    AbstractC19074t.m100207e(optJSONObject, "optJSONObject(...)");
                    arrayList.add(optJSONObject);
                }
                C25244a c25244a = C25244a.f121072a;
                this.f121088t = 1;
                if (c25244a.m130618I(arrayList, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121090t;

        /* renamed from: u */
        final /* synthetic */ List f121091u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, Continuation continuation) {
            super(2, continuation);
            this.f121091u = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f121091u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f121090t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    JSONArray jSONArray = new JSONArray();
                    C25244a.f121075d.clear();
                    for (JSONObject jSONObject : this.f121091u) {
                        if (jSONObject.has("userId")) {
                            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, jSONObject.optString("userId"), false, 2, null);
                            if (m141800i != null) {
                                C25244a.f121075d.add(m141800i);
                                jSONArray.put(C25244a.f121072a.m130635l(m141800i));
                            } else {
                                C25244a.f121075d.add(C25244a.f121072a.m130641u(jSONObject));
                                jSONArray.put(jSONObject);
                            }
                        }
                    }
                    AbstractC0924m0.m3292Nn(jSONArray.toString());
                } catch (Exception e11) {
                    e11.printStackTrace();
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121092t;

        /* renamed from: u */
        final /* synthetic */ int f121093u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11, Continuation continuation) {
            super(2, continuation);
            this.f121093u = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f121093u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121092t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25244a c25244a = C25244a.f121072a;
                int i12 = this.f121093u;
                this.f121092t = 1;
                if (c25244a.m130621L(i12, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121094t;

        /* renamed from: u */
        final /* synthetic */ int f121095u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i11, Continuation continuation) {
            super(2, continuation);
            this.f121095u = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f121095u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f121094t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC0924m0.m3060Fn(this.f121095u);
                C25244a c25244a = C25244a.f121072a;
                C25244a.f121076e = this.f121095u;
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121096t;

        /* renamed from: u */
        final /* synthetic */ int f121097u;

        /* renamed from: v */
        final /* synthetic */ List f121098v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i11, List list, Continuation continuation) {
            super(2, continuation);
            this.f121097u = i11;
            this.f121098v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f121097u, this.f121098v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121096t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C25244a c25244a = C25244a.f121072a;
                int i12 = this.f121097u;
                this.f121096t = 1;
                if (c25244a.m130621L(i12, this) == m142578e) {
                    return m142578e;
                }
            }
            C25244a c25244a2 = C25244a.f121072a;
            List list = this.f121098v;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new JSONObject().put("userId", (String) it.next()));
            }
            this.f121096t = 2;
            if (c25244a2.m130618I(arrayList, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qe.a$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f121099a;

        /* renamed from: b */
        final /* synthetic */ int f121100b;

        /* renamed from: c */
        final /* synthetic */ List f121101c;

        /* renamed from: qe.a$m$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f121102t;

            /* renamed from: u */
            final /* synthetic */ int f121103u;

            /* renamed from: v */
            final /* synthetic */ List f121104v;

            /* renamed from: w */
            final /* synthetic */ InterfaceC18505l f121105w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, List list, InterfaceC18505l interfaceC18505l, Continuation continuation) {
                super(2, continuation);
                this.f121103u = i11;
                this.f121104v = list;
                this.f121105w = interfaceC18505l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f121103u, this.f121104v, this.f121105w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f121102t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    int i12 = this.f121103u;
                    if ((i12 == 2 || i12 == 1) && i12 != C25244a.f121076e) {
                        AbstractC23304d.f113365b2 = false;
                        AbstractC23309i.m122469ui(0);
                        AbstractC23309i.m122543wi(0L);
                    }
                    C25244a c25244a = C25244a.f121072a;
                    int i13 = this.f121103u;
                    List list = this.f121104v;
                    this.f121102t = 1;
                    if (c25244a.m130622M(i13, list, this) == m142578e) {
                        return m142578e;
                    }
                }
                InterfaceC18505l interfaceC18505l = this.f121105w;
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(AbstractC29094b.m145339a(true));
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        m(InterfaceC18505l interfaceC18505l, int i11, List list) {
            this.f121099a = interfaceC18505l;
            this.f121100b = i11;
            this.f121101c = list;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC18505l interfaceC18505l = this.f121099a;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Boolean.FALSE);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC18505l interfaceC18505l;
            JSONObject optJSONObject;
            boolean z11 = false;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    int i11 = this.f121100b;
                    List list = this.f121101c;
                    InterfaceC18505l interfaceC18505l2 = this.f121099a;
                    if (optJSONObject.optBoolean("results")) {
                        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new a(i11, list, interfaceC18505l2, null), 3, null);
                        z11 = true;
                    }
                }
            }
            if (!z11 && (interfaceC18505l = this.f121099a) != null) {
                interfaceC18505l.mo205i9(Boolean.valueOf(z11));
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(c.f121079q);
        f121073b = m129210a;
        f121075d = new C31853b5();
        f121076e = 2;
    }

    private C25244a() {
    }

    /* renamed from: B */
    public static final int m130615B() {
        return AbstractC3096i0.m15527a0(m130642v() - f121072a.m130654p().size(), 0);
    }

    /* renamed from: D */
    public static final Job m130616D(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "callerId");
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new d(str, null), 3, null);
        return m112540d;
    }

    /* renamed from: E */
    public static final Job m130617E(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "callerId");
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new e(str, null), 3, null);
        return m112540d;
    }

    /* renamed from: I */
    public final Object m130618I(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new i(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: J */
    public static final Job m130619J(JSONArray jSONArray) {
        Job m112540d;
        AbstractC19074t.m100208f(jSONArray, "mutedUsers");
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new h(jSONArray, null), 3, null);
        return m112540d;
    }

    /* renamed from: K */
    public static final Job m130620K(int i11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new j(i11, null), 3, null);
        return m112540d;
    }

    /* renamed from: L */
    public final Object m130621L(int i11, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new k(i11, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: M */
    public final Object m130622M(int i11, List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new l(i11, list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: Q */
    public static final void m130623Q(boolean z11, InterfaceC18505l interfaceC18505l) {
        int m131511r;
        C25244a c25244a = f121072a;
        C31853b5 c31853b5 = f121075d;
        m131511r = AbstractC25370t.m131511r(c31853b5, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator<E> it = c31853b5.iterator();
        while (it.hasNext()) {
            String str = ((ContactProfile) it.next()).f42434r;
            AbstractC19074t.m100207e(str, "uid");
            arrayList.add(str);
        }
        c25244a.m130653P(z11, arrayList, interfaceC18505l);
    }

    /* renamed from: k */
    public static final void m130634k(List list, InterfaceC18505l interfaceC18505l) {
        int m131511r;
        List m131222v0;
        AbstractC19074t.m100208f(list, "uIds");
        C25244a c25244a = f121072a;
        boolean m130639q = m130639q();
        List list2 = list;
        C31853b5 c31853b5 = f121075d;
        m131511r = AbstractC25370t.m131511r(c31853b5, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator<E> it = c31853b5.iterator();
        while (it.hasNext()) {
            String str = ((ContactProfile) it.next()).f42434r;
            AbstractC19074t.m100207e(str, "uid");
            arrayList.add(str);
        }
        m131222v0 = AbstractC25332a0.m131222v0(list2, arrayList);
        c25244a.m130653P(m130639q, m131222v0, interfaceC18505l);
    }

    /* renamed from: l */
    public final JSONObject m130635l(ContactProfile contactProfile) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", contactProfile.mo2478b());
        jSONObject.put("displayName", contactProfile.m40383Q(true, false));
        jSONObject.put("avatar", contactProfile.f42446v);
        return jSONObject;
    }

    /* renamed from: m */
    public final C31879d1 m130636m(String str) {
        return C31894e1.f146524a.m153254a(str);
    }

    /* renamed from: n */
    public final long m130637n(long j11) {
        return System.currentTimeMillis() - j11;
    }

    /* renamed from: o */
    private final InterfaceC0765j m130638o() {
        return (InterfaceC0765j) f121073b.getValue();
    }

    /* renamed from: q */
    public static final boolean m130639q() {
        return m130640r(false);
    }

    /* renamed from: r */
    public static final boolean m130640r(boolean z11) {
        if (!AbstractC23304d.f113347X1) {
            return true;
        }
        if (z11) {
            f121076e = AbstractC0924m0.m4221t5();
        }
        if (f121076e != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final ContactProfile m130641u(JSONObject jSONObject) {
        ContactProfile contactProfile = new ContactProfile();
        contactProfile.f42434r = jSONObject.optString("userId");
        contactProfile.f42437s = jSONObject.optString("displayName");
        contactProfile.f42446v = jSONObject.optString("avatar");
        return contactProfile;
    }

    /* renamed from: v */
    public static final int m130642v() {
        int i11 = AbstractC23304d.f113355Z1;
        if (i11 <= 0) {
            return 100;
        }
        return i11;
    }

    /* renamed from: w */
    private final Job m130643w() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new a(null), 3, null);
        return m112540d;
    }

    /* renamed from: x */
    private final Job m130644x() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new b(null), 3, null);
        return m112540d;
    }

    /* renamed from: z */
    public static final void m130645z(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        C0815e1.m2075D().m2100V(new C23648e(46, str, 0, "call_mute_add", new String[0]), false);
    }

    /* renamed from: A */
    public final void m130646A(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        C0815e1.m2075D().m2100V(new C23648e(46, str, 0, "call_mute_delete", new String[0]), false);
    }

    /* renamed from: C */
    public final void m130647C(String str) {
        AbstractC19074t.m100208f(str, "chatUid");
        C31879d1 m130636m = m130636m(str);
        if (m130636m.m153196h() == 1) {
            m130636m.m153204q(System.currentTimeMillis());
            m130636m.m153199k();
        }
    }

    /* renamed from: F */
    public final void m130648F(String str, InterfaceC18505l interfaceC18505l) {
        int m131511r;
        List m131187O0;
        AbstractC19074t.m100208f(str, "uid");
        C31853b5 c31853b5 = f121075d;
        m131511r = AbstractC25370t.m131511r(c31853b5, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator<E> it = c31853b5.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContactProfile) it.next()).f42434r);
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList);
        m131187O0.remove(str);
        f121072a.m130653P(m130639q(), m131187O0, interfaceC18505l);
    }

    /* renamed from: G */
    public final Job m130649G(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "chatUid");
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new f(str, null), 3, null);
        return m112540d;
    }

    /* renamed from: H */
    public final Job m130650H(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "chatUid");
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new g(str, null), 3, null);
        return m112540d;
    }

    /* renamed from: N */
    public final boolean m130651N(String str) {
        AbstractC19074t.m100208f(str, "chatUid");
        long m153196h = m130636m(str).m153196h();
        if (AbstractC23304d.f113360a2) {
            C25244a c25244a = f121072a;
            if (c25244a.m130656t(str) && (m153196h == 1 || c25244a.m130637n(m153196h) < 86400000)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public final boolean m130652O(String str) {
        AbstractC19074t.m100208f(str, "chatUId");
        if (AbstractC23304d.f113360a2 && !m130656t(str) && m130636m(str).m153197i() != -1 && m130637n(m130636m(str).m153197i()) < 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final void m130653P(boolean z11, List list, InterfaceC18505l interfaceC18505l) {
        int i11;
        AbstractC19074t.m100208f(list, "mutedUIDs");
        if (z11) {
            if (list.isEmpty()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        } else {
            i11 = 0;
        }
        InterfaceC0765j m130638o = m130638o();
        m130638o.mo1704o8(new m(interfaceC18505l, i11, list));
        m130638o.mo1562W4(44, i11, list);
    }

    /* renamed from: p */
    public final C31853b5 m130654p() {
        return f121075d;
    }

    /* renamed from: s */
    public final boolean m130655s() {
        return AbstractC23304d.f113351Y1;
    }

    /* renamed from: t */
    public final boolean m130656t(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return f121075d.m153137g(str);
    }

    /* renamed from: y */
    public final void m130657y() {
        if (f121074c) {
            return;
        }
        m130644x();
        m130643w();
    }
}
