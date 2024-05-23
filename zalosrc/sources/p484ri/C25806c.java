package p484ri;

import ag0.AbstractC0837p0;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.InterfaceC20094a;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p297kd.C21690e;
import p443qc.EnumC25220d;
import p525ti.C26700a;
import p548ui.C27271a;
import p548ui.C27273c;
import p610wi.C29048b;
import p610wi.InterfaceC29047a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;
import sc.C26220b;
import si.C26270p;
import si.InterfaceC26269o;

/* renamed from: ri.c */
/* loaded from: classes3.dex */
public final class C25806c {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static final InterfaceC24854k f123077f;

    /* renamed from: a */
    private final InterfaceC26269o f123078a;

    /* renamed from: b */
    private final InterfaceC29047a f123079b;

    /* renamed from: c */
    private C21690e f123080c;

    /* renamed from: d */
    private String f123081d;

    /* renamed from: e */
    private final Map f123082e;

    /* renamed from: ri.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f123083q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25806c mo12V4() {
            return c.f123084a.m133067a();
        }
    }

    /* renamed from: ri.c$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25806c m133066a() {
            return (C25806c) C25806c.f123077f.getValue();
        }
    }

    /* renamed from: ri.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f123084a = new c();

        /* renamed from: b */
        private static final C25806c f123085b = new C25806c(new C26270p(), new C29048b());

        private c() {
        }

        /* renamed from: a */
        public final C25806c m133067a() {
            return f123085b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f123083q);
        f123077f = m129210a;
    }

    public C25806c(InterfaceC26269o interfaceC26269o, InterfaceC29047a interfaceC29047a) {
        AbstractC19074t.m100208f(interfaceC26269o, "localDataSource");
        AbstractC19074t.m100208f(interfaceC29047a, "apiHelper");
        this.f123078a = interfaceC26269o;
        this.f123079b = interfaceC29047a;
        this.f123082e = new LinkedHashMap();
    }

    /* renamed from: C */
    private final Map m133014C(String str) {
        Map m131404i;
        Map m131415t;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str.length() > 0) {
                Iterator<String> keys = new JSONObject(str).keys();
                AbstractC19074t.m100207e(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    AbstractC19074t.m100205c(next);
                    linkedHashMap.put(next, Long.valueOf(r1.optInt(next)));
                }
                m131415t = AbstractC25363p0.m131415t(linkedHashMap);
                return m131415t;
            }
        } catch (Exception e11) {
            C26220b.m134819b(new Exception("Input: " + str + ", exception info: " + e11.getMessage()));
        }
        m131404i = AbstractC25363p0.m131404i();
        return m131404i;
    }

    /* renamed from: H */
    private final void m133015H() {
        String jSONObject;
        try {
            Map map = this.f123082e;
            if (map != null && (jSONObject = new JSONObject(map).toString()) != null) {
                this.f123078a.mo135113e(jSONObject);
            }
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreRepository", e11);
        }
    }

    /* renamed from: Q */
    public static final void m133016Q(C25806c c25806c, String str) {
        AbstractC19074t.m100208f(c25806c, "this$0");
        AbstractC19074t.m100208f(str, "$jsonString");
        c25806c.f123078a.mo135117i(str);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m133017Y(C25806c c25806c, C27271a c27271a, String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        c25806c.m133043X(c27271a, str, interfaceC18505l, interfaceC18509p, interfaceC18505l2);
    }

    /* renamed from: g */
    private final void m133020g() {
        try {
            String mo135130v = this.f123078a.mo135130v();
            if (mo135130v.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(mo135130v);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                AbstractC19074t.m100205c(next);
                Object obj = jSONObject.get(next);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(next, (String) obj);
            }
            this.f123082e.putAll(linkedHashMap);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreRepository", e11);
        }
    }

    /* renamed from: k */
    private final Map m133021k() {
        return m133014C(this.f123078a.mo135121m());
    }

    /* renamed from: n */
    public static final C25806c m133022n() {
        return Companion.m133066a();
    }

    /* renamed from: A */
    public final boolean m133023A() {
        if (this.f123078a.mo135131w() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m133024B() {
        return this.f123078a.mo135112d();
    }

    /* renamed from: D */
    public final String m133025D(String str) {
        AbstractC19074t.m100208f(str, "dbFilePath");
        return this.f123078a.mo135128t(str);
    }

    /* renamed from: E */
    public final void m133026E(File file, int i11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(file, "backupFile");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f123079b.mo145038d(file, i11, m133051l(), interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: F */
    public final void m133027F() {
        if (m133057s() != 0) {
            m133035O(0L);
        }
    }

    /* renamed from: G */
    public final void m133028G(String str, long j11) {
        AbstractC19074t.m100208f(str, "email");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : m133021k().entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        jSONObject.put(str, j11);
        InterfaceC26269o interfaceC26269o = this.f123078a;
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        interfaceC26269o.mo135103A(jSONObject2);
    }

    /* renamed from: I */
    public final void m133029I(long j11) {
        this.f123078a.mo135134z(j11);
    }

    /* renamed from: J */
    public final void m133030J(int i11) {
        this.f123078a.mo135122n(i11);
    }

    /* renamed from: K */
    public final void m133031K(int i11) {
        this.f123078a.mo135126r(i11);
    }

    /* renamed from: L */
    public final void m133032L(long j11) {
        this.f123078a.mo135109a(j11);
    }

    /* renamed from: M */
    public final void m133033M(long j11) {
        this.f123078a.mo135129u(j11);
    }

    /* renamed from: N */
    public final void m133034N(int i11) {
        this.f123078a.mo135105C(i11);
    }

    /* renamed from: O */
    public final void m133035O(long j11) {
        this.f123078a.mo135132x(j11);
        C26220b.m134826i("SMLBackupRestoreRepository", "setStartTimeRemindRestoreBanner(" + j11 + ")", null, 4, null);
    }

    /* renamed from: P */
    public final void m133036P(String str) {
        AbstractC19074t.m100208f(str, "jsonString");
        this.f123080c = C21690e.Companion.m111901a(str);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ri.b

            /* renamed from: q */
            public final /* synthetic */ String f123076q;

            public /* synthetic */ RunnableC25805b(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25806c.m133016Q(C25806c.this, r2);
            }
        });
    }

    /* renamed from: R */
    public final void m133037R(String str) {
        if (str == null) {
            str = "";
        }
        this.f123081d = str;
        this.f123078a.mo135115g(str);
    }

    /* renamed from: S */
    public final void m133038S(int i11) {
        this.f123078a.mo135114f(i11);
    }

    /* renamed from: T */
    public final void m133039T(boolean z11) {
        this.f123078a.mo135124p(z11);
    }

    /* renamed from: U */
    public final void m133040U(EnumC25220d enumC25220d) {
        AbstractC19074t.m100208f(enumC25220d, "config");
        this.f123078a.mo135123o(enumC25220d);
    }

    /* renamed from: V */
    public final void m133041V(JSONObject jSONObject, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(jSONObject, "backupMediaInfo");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f123079b.mo145040f(jSONObject, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: W */
    public final void m133042W() {
        this.f123078a.mo135106D();
    }

    /* renamed from: X */
    public final void m133043X(C27271a c27271a, String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l2) {
        AbstractC19074t.m100208f(c27271a, "params");
        AbstractC19074t.m100208f(str, "targetUrl");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        AbstractC19074t.m100208f(interfaceC18505l2, "onProgress");
        this.f123079b.mo145039e(c27271a, str, interfaceC18505l, interfaceC18509p, interfaceC18505l2);
    }

    /* renamed from: c */
    public final void m133044c() {
        C26220b.m134826i("SMLBackupRestoreRepository", "clearAllMemCache()", null, 4, null);
        this.f123080c = null;
        this.f123081d = null;
    }

    /* renamed from: d */
    public final void m133045d(int i11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f123079b.mo145037c(i11, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: e */
    public final void m133046e(C27273c c27273c, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c27273c, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onProgress");
        AbstractC19074t.m100208f(interfaceC18505l2, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f123079b.mo145041g(c27273c, interfaceC18505l, interfaceC18505l2, interfaceC18509p);
    }

    /* renamed from: f */
    public final void m133047f() {
    }

    /* renamed from: h */
    public final long m133048h() {
        return this.f123078a.mo135127s();
    }

    /* renamed from: i */
    public final void m133049i(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f123079b.mo145036b(interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: j */
    public final long m133050j(String str) {
        AbstractC19074t.m100208f(str, "email");
        Long l11 = (Long) m133021k().get(str);
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    /* renamed from: l */
    public final int m133051l() {
        return this.f123078a.mo135108F();
    }

    /* renamed from: m */
    public final C26700a m133052m(String str) {
        AbstractC19074t.m100208f(str, "modelCode");
        String str2 = (String) this.f123082e.get(str);
        if (str2 != null) {
            return new C26700a(str, str2);
        }
        return null;
    }

    /* renamed from: o */
    public final C21690e m133053o() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            if (this.f123080c == null) {
                this.f123080c = this.f123078a.mo135133y();
            }
            return this.f123080c;
        }
        return null;
    }

    /* renamed from: p */
    public final long m133054p() {
        return this.f123078a.mo135120l();
    }

    /* renamed from: q */
    public final long m133055q() {
        return this.f123078a.mo135110b();
    }

    /* renamed from: r */
    public final int m133056r() {
        return this.f123078a.mo135119k();
    }

    /* renamed from: s */
    public final long m133057s() {
        return this.f123078a.mo135111c();
    }

    /* renamed from: t */
    public final String m133058t() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            if (this.f123081d == null) {
                this.f123081d = this.f123078a.mo135118j();
            }
            String str2 = this.f123081d;
            AbstractC19074t.m100206d(str2, "null cannot be cast to non-null type kotlin.String");
            return str2;
        }
        return "";
    }

    /* renamed from: u */
    public final void m133059u(InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(interfaceC20094a, "listener");
        this.f123079b.mo145035a(interfaceC20094a);
    }

    /* renamed from: v */
    public final long m133060v() {
        return this.f123078a.mo135104B();
    }

    /* renamed from: w */
    public final int m133061w() {
        return this.f123078a.mo135107E();
    }

    /* renamed from: x */
    public final int m133062x() {
        return this.f123078a.mo135116h();
    }

    /* renamed from: y */
    public final EnumC25220d m133063y() {
        return this.f123078a.mo135125q();
    }

    /* renamed from: z */
    public final void m133064z(C26700a c26700a) {
        AbstractC19074t.m100208f(c26700a, "deviceInfo");
        if (this.f123082e.isEmpty()) {
            m133020g();
        }
        if (!this.f123082e.containsKey(c26700a.m137264b())) {
            this.f123082e.put(c26700a.m137264b(), c26700a.m137263a());
            m133015H();
        }
    }
}
