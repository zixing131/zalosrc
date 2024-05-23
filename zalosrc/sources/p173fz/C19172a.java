package p173fz;

import android.content.Context;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import km0.InterfaceC21766a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONObject;
import p222hz.C20168b;
import p222hz.InterfaceC20167a;
import p334lz.AbstractC22691c;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: fz.a */
/* loaded from: classes.dex */
public final class C19172a {

    /* renamed from: a */
    public static final C19172a f95269a = new C19172a();

    /* renamed from: b */
    private static final JSONObject f95270b = new JSONObject();

    /* renamed from: c */
    private static final CoroutineExceptionHandler f95271c = new f(CoroutineExceptionHandler.f105837l);

    /* renamed from: d */
    private static final InterfaceC24854k f95272d = AbstractC24855l.m129208a(a.f95274q);

    /* renamed from: e */
    private static InterfaceC20167a f95273e;

    /* renamed from: fz.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f95274q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final CoroutineScope mo12V4() {
            return CoroutineScopeKt.m112637a(Dispatchers.m112681c().mo112823d0(SupervisorKt.m112864b(null, 1, null)).mo112823d0(C19172a.f95271c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fz.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95275t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18509p f95276u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f95276u = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f95276u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95275t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20167a interfaceC20167a = C19172a.f95273e;
                if (interfaceC20167a != null) {
                    InterfaceC18509p interfaceC18509p = this.f95276u;
                    this.f95275t = 1;
                    if (interfaceC20167a.mo105172i(interfaceC18509p, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fz.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95277t;

        /* renamed from: u */
        final /* synthetic */ JSONObject f95278u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18509p f95279v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f95278u = jSONObject;
            this.f95279v = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f95278u, this.f95279v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95277t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20167a interfaceC20167a = C19172a.f95273e;
                if (interfaceC20167a != null) {
                    JSONObject jSONObject = this.f95278u;
                    InterfaceC18509p interfaceC18509p = this.f95279v;
                    this.f95277t = 1;
                    if (interfaceC20167a.mo105175l(jSONObject, interfaceC18509p, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fz.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95280t;

        /* renamed from: u */
        final /* synthetic */ JSONObject f95281u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.f95281u = jSONObject;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f95281u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95280t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20167a interfaceC20167a = C19172a.f95273e;
                if (interfaceC20167a != null) {
                    JSONObject jSONObject = this.f95281u;
                    this.f95280t = 1;
                    if (interfaceC20167a.mo105173j(jSONObject, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fz.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95282t;

        /* renamed from: u */
        final /* synthetic */ JSONObject f95283u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18509p f95284v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JSONObject jSONObject, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f95283u = jSONObject;
            this.f95284v = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f95283u, this.f95284v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95282t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC20167a interfaceC20167a = C19172a.f95273e;
                if (interfaceC20167a != null) {
                    JSONObject jSONObject = this.f95283u;
                    InterfaceC18509p interfaceC18509p = this.f95284v;
                    this.f95282t = 1;
                    if (interfaceC20167a.mo105174k(jSONObject, interfaceC18509p, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: fz.a$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC27310a implements CoroutineExceptionHandler {
        public f(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC22691c.m117366c(th2);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f95274q);
        f95272d = m129210a;
    }

    private C19172a() {
    }

    /* renamed from: c */
    public static final void m100592c() {
        InterfaceC20167a interfaceC20167a = f95273e;
        if (interfaceC20167a != null) {
            interfaceC20167a.mo105169e();
        }
    }

    /* renamed from: d */
    public static final void m100593d(InterfaceC18509p interfaceC18509p) {
        BuildersKt__Builders_commonKt.m112540d(f95269a.m100597h(), null, null, new b(interfaceC18509p, null), 3, null);
    }

    /* renamed from: e */
    public static final void m100594e(JSONObject jSONObject, InterfaceC18509p interfaceC18509p) {
        BuildersKt__Builders_commonKt.m112540d(f95269a.m100597h(), null, null, new c(jSONObject, interfaceC18509p, null), 3, null);
    }

    /* renamed from: f */
    public static final void m100595f(JSONObject jSONObject) {
        BuildersKt__Builders_commonKt.m112540d(f95269a.m100597h(), null, null, new d(jSONObject, null), 3, null);
    }

    /* renamed from: g */
    public static final void m100596g(JSONObject jSONObject, InterfaceC18509p interfaceC18509p) {
        BuildersKt__Builders_commonKt.m112540d(f95269a.m100597h(), null, null, new e(jSONObject, interfaceC18509p, null), 3, null);
    }

    /* renamed from: h */
    private final CoroutineScope m100597h() {
        return (CoroutineScope) f95272d.getValue();
    }

    /* renamed from: i */
    public static final double m100598i(String str, double d11) {
        AbstractC19074t.m100208f(str, "key");
        InterfaceC20167a interfaceC20167a = f95273e;
        if (interfaceC20167a != null) {
            return interfaceC20167a.mo105167c(str, d11);
        }
        return d11;
    }

    /* renamed from: j */
    public static final int m100599j(String str) {
        AbstractC19074t.m100208f(str, "key");
        return m100601l(str, 0, 2, null);
    }

    /* renamed from: k */
    public static final int m100600k(String str, int i11) {
        AbstractC19074t.m100208f(str, "key");
        InterfaceC20167a interfaceC20167a = f95273e;
        if (interfaceC20167a != null) {
            return interfaceC20167a.mo105168d(str, i11);
        }
        return i11;
    }

    /* renamed from: l */
    public static /* synthetic */ int m100601l(String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m100600k(str, i11);
    }

    /* renamed from: m */
    public static final JSONObject m100602m(String str) {
        AbstractC19074t.m100208f(str, "key");
        return m100604o(str, null, 2, null);
    }

    /* renamed from: n */
    public static final JSONObject m100603n(String str, JSONObject jSONObject) {
        JSONObject mo105170g;
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jSONObject, "fallback");
        InterfaceC20167a interfaceC20167a = f95273e;
        if (interfaceC20167a != null && (mo105170g = interfaceC20167a.mo105170g(str, jSONObject)) != null) {
            return mo105170g;
        }
        return jSONObject;
    }

    /* renamed from: o */
    public static /* synthetic */ JSONObject m100604o(String str, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            jSONObject = f95270b;
        }
        return m100603n(str, jSONObject);
    }

    /* renamed from: p */
    public static final long m100605p(String str, long j11) {
        AbstractC19074t.m100208f(str, "key");
        InterfaceC20167a interfaceC20167a = f95273e;
        if (interfaceC20167a != null) {
            return interfaceC20167a.mo105165a(str, j11);
        }
        return j11;
    }

    /* renamed from: q */
    public static final String m100606q(String str) {
        AbstractC19074t.m100208f(str, "key");
        return m100608s(str, null, 2, null);
    }

    /* renamed from: r */
    public static final String m100607r(String str, String str2) {
        String mo105166b;
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "fallback");
        InterfaceC20167a interfaceC20167a = f95273e;
        if (interfaceC20167a != null && (mo105166b = interfaceC20167a.mo105166b(str, str2)) != null) {
            return mo105166b;
        }
        return str2;
    }

    /* renamed from: s */
    public static /* synthetic */ String m100608s(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        return m100607r(str, str2);
    }

    /* renamed from: t */
    public static final void m100609t(Context context, String str, InterfaceC21766a interfaceC21766a) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(interfaceC21766a, "networkProvider");
        AbstractC22691c.m117364a(AbstractC19074t.m100216n("init with uid=", str));
        f95273e = new C20168b(context, str, interfaceC21766a);
    }

    /* renamed from: u */
    public static final void m100610u(String str, InterfaceC21766a interfaceC21766a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(interfaceC21766a, "networkProvider");
        m100611v(null, str, interfaceC21766a, 1, null);
    }

    /* renamed from: v */
    public static /* synthetic */ void m100611v(Context context, String str, InterfaceC21766a interfaceC21766a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(context, "getAppContext()");
        }
        m100609t(context, str, interfaceC21766a);
    }

    /* renamed from: w */
    public static final JSONObject m100612w(JSONObject jSONObject) {
        JSONObject mo105171h;
        AbstractC19074t.m100208f(jSONObject, "json");
        InterfaceC20167a interfaceC20167a = f95273e;
        if (interfaceC20167a == null) {
            mo105171h = null;
        } else {
            mo105171h = interfaceC20167a.mo105171h(jSONObject);
        }
        if (mo105171h == null) {
            return new JSONObject();
        }
        return mo105171h;
    }
}
