package sc;

import ag0.C0815e1;
import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20128b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p387oc.C24199c;
import p421pc.C24720a;
import p484ri.C25806c;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import si.C26263i;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: sc.a */
/* loaded from: classes3.dex */
public final class C26219a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f124557a;

    /* renamed from: b */
    private final InterfaceC24854k f124558b;

    /* renamed from: c */
    private final InterfaceC24854k f124559c;

    /* renamed from: d */
    private final InterfaceC24854k f124560d;

    /* renamed from: e */
    private final InterfaceC24854k f124561e;

    /* renamed from: f */
    private final InterfaceC24854k f124562f;

    /* renamed from: sc.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: sc.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f124563q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24720a mo12V4() {
            C24720a m120676j = AbstractC23306f.m120676j();
            AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
            return m120676j;
        }
    }

    /* renamed from: sc.a$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f124564q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24199c mo12V4() {
            C24199c m120684l = AbstractC23306f.m120684l();
            AbstractC19074t.m100207e(m120684l, "provideBackupRestoreManager(...)");
            return m120684l;
        }
    }

    /* renamed from: sc.a$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f124565q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25806c mo12V4() {
            C25806c m120692n = AbstractC23306f.m120692n();
            AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
            return m120692n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sc.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f124566s;

        /* renamed from: t */
        Object f124567t;

        /* renamed from: u */
        Object f124568u;

        /* renamed from: v */
        /* synthetic */ Object f124569v;

        /* renamed from: x */
        int f124571x;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f124569v = obj;
            this.f124571x |= Integer.MIN_VALUE;
            return C26219a.this.m134787e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sc.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f124572s;

        /* renamed from: t */
        Object f124573t;

        /* renamed from: u */
        Object f124574u;

        /* renamed from: v */
        Object f124575v;

        /* renamed from: w */
        Object f124576w;

        /* renamed from: x */
        /* synthetic */ Object f124577x;

        /* renamed from: z */
        int f124579z;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f124577x = obj;
            this.f124579z |= Integer.MIN_VALUE;
            return C26219a.this.m134788f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sc.a$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f124580t;

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f124580t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26219a c26219a = C26219a.this;
                this.f124580t = 1;
                if (c26219a.m134782C(this) == m142578e) {
                    return m142578e;
                }
            }
            AbstractC0924m0.m3288Nj(C26219a.this.m134803v().mo124314i());
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sc.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f124582s;

        /* renamed from: u */
        int f124584u;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f124582s = obj;
            this.f124584u |= Integer.MIN_VALUE;
            return C26219a.this.m134782C(this);
        }
    }

    /* renamed from: sc.a$i */
    /* loaded from: classes3.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f124585q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TargetBackupInfo mo12V4() {
            return C26263i.m135058w();
        }
    }

    /* renamed from: sc.a$j */
    /* loaded from: classes3.dex */
    static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f124586q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    public C26219a() {
        this(0L, 1, null);
    }

    /* renamed from: A */
    private final int m134780A() {
        return AbstractC3489d.m17513u() ? 1 : 0;
    }

    /* renamed from: B */
    private final boolean m134781B() {
        if (m134803v().mo124314i() - AbstractC0924m0.m3329P2() > this.f124557a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:            r8 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:            sc.C26220b.m134821d("SMLBackupInfoLog", r8);     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m134782C(Continuation continuation) {
        h hVar;
        Object m142578e;
        int i11;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f124584u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f124584u = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f124582s;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f124584u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    hVar.f124584u = 1;
                    obj = m134788f(hVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                String jSONObject = ((JSONObject) obj).toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                C26220b.m134826i("SMLBackupInfoLog", "Submit log Backup Info: " + jSONObject, null, 4, null);
                C0815e1.m2075D().m2099U(3, 1, 46, "", "1", jSONObject);
                return C24848g0.f119245a;
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f124582s;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f124584u;
        if (i11 == 0) {
        }
        String jSONObject2 = ((JSONObject) obj2).toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        C26220b.m134826i("SMLBackupInfoLog", "Submit log Backup Info: " + jSONObject2, null, 4, null);
        C0815e1.m2075D().m2099U(3, 1, 46, "", "1", jSONObject2);
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m134787e(Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f124571x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f124571x = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f124569v;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f124571x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        jSONObject = (JSONObject) eVar.f124568u;
                        str = (String) eVar.f124567t;
                        jSONObject2 = (JSONObject) eVar.f124566s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("backup_time", m134795n());
                    jSONObject3.put("file_size", m134801t());
                    jSONObject3.put("total_message", m134806y());
                    jSONObject3.put("total_backed_up_message", m134804w());
                    if (!AbstractC3489d.m17513u()) {
                        jSONObject3.put("total_backed_up_photo", m134805x());
                        eVar.f124566s = jSONObject3;
                        str = "total_remaining_photo";
                        eVar.f124567t = "total_remaining_photo";
                        eVar.f124568u = jSONObject3;
                        eVar.f124571x = 1;
                        Object m134807z = m134807z(eVar);
                        if (m134807z == m142578e) {
                            return m142578e;
                        }
                        jSONObject = jSONObject3;
                        obj = m134807z;
                        jSONObject2 = jSONObject;
                    } else {
                        return jSONObject3;
                    }
                }
                jSONObject.put(str, ((Number) obj).longValue());
                return jSONObject2;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f124569v;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f124571x;
        if (i11 == 0) {
        }
        jSONObject.put(str, ((Number) obj2).longValue());
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m134788f(Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        C26219a c26219a;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f124579z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f124579z = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f124577x;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f124579z;
                if (i11 == 0) {
                    if (i11 == 1) {
                        jSONObject = (JSONObject) fVar.f124576w;
                        str = (String) fVar.f124575v;
                        jSONObject2 = (JSONObject) fVar.f124574u;
                        jSONObject3 = (JSONObject) fVar.f124573t;
                        c26219a = (C26219a) fVar.f124572s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("user_info", m134790h());
                    fVar.f124572s = this;
                    fVar.f124573t = jSONObject4;
                    fVar.f124574u = jSONObject4;
                    str = "backup_info";
                    fVar.f124575v = "backup_info";
                    fVar.f124576w = jSONObject4;
                    fVar.f124579z = 1;
                    Object m134787e = m134787e(fVar);
                    if (m134787e == m142578e) {
                        return m142578e;
                    }
                    jSONObject = jSONObject4;
                    jSONObject2 = jSONObject;
                    jSONObject3 = jSONObject2;
                    obj = m134787e;
                    c26219a = this;
                }
                jSONObject.put(str, obj);
                jSONObject2.put("backup_setting", c26219a.m134789g());
                return jSONObject3;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f124577x;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f124579z;
        if (i11 == 0) {
        }
        jSONObject.put(str, obj2);
        jSONObject2.put("backup_setting", c26219a.m134789g());
        return jSONObject3;
    }

    /* renamed from: g */
    private final JSONObject m134789g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_enable_backup_media", m134797p());
        jSONObject.put("is_e2ee_enable", m134798q());
        jSONObject.put("is_auto_backup_active", m134791j());
        jSONObject.put("is_encrypted_backup", m134799r());
        return jSONObject;
    }

    /* renamed from: h */
    private final JSONObject m134790h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_type", m134780A());
        jSONObject.put("model_code", C20128b.m104758e(false, 1, null));
        jSONObject.put("is_exist_backup", m134800s());
        jSONObject.put("is_data_restored", m134796o());
        return jSONObject;
    }

    /* renamed from: j */
    private final int m134791j() {
        return m134792k().m128392I() ? 1 : 0;
    }

    /* renamed from: k */
    private final C24720a m134792k() {
        return (C24720a) this.f124560d.getValue();
    }

    /* renamed from: l */
    private final C24199c m134793l() {
        return (C24199c) this.f124559c.getValue();
    }

    /* renamed from: m */
    private final C25806c m134794m() {
        return (C25806c) this.f124561e.getValue();
    }

    /* renamed from: n */
    private final long m134795n() {
        TargetBackupInfo m134802u = m134802u();
        if (m134802u != null) {
            return m134802u.m40952h();
        }
        return 0L;
    }

    /* renamed from: o */
    private final int m134796o() {
        return m134793l().m126159l() ? 1 : 0;
    }

    /* renamed from: p */
    private final int m134797p() {
        return C22447s.m116057s(m134802u()) ? 1 : 0;
    }

    /* renamed from: q */
    private final int m134798q() {
        TargetBackupInfo m134802u = m134802u();
        if (m134802u == null || m134802u.m40945a() != 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: r */
    private final int m134799r() {
        TargetBackupInfo m134802u = m134802u();
        int i11 = 0;
        if (m134802u != null && m134802u.m40953i() == 0) {
            i11 = 1;
        }
        return i11 ^ 1;
    }

    /* renamed from: s */
    private final int m134800s() {
        if (m134802u() != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: t */
    private final long m134801t() {
        TargetBackupInfo m134802u = m134802u();
        if (m134802u != null) {
            return m134802u.m40960p();
        }
        return 0L;
    }

    /* renamed from: u */
    private final TargetBackupInfo m134802u() {
        return (TargetBackupInfo) this.f124562f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final InterfaceC23792b m134803v() {
        return (InterfaceC23792b) this.f124558b.getValue();
    }

    /* renamed from: w */
    private final long m134804w() {
        JSONObject m40955k;
        JSONObject optJSONObject;
        TargetBackupInfo m134802u = m134802u();
        if (m134802u != null && (m40955k = m134802u.m40955k()) != null && (optJSONObject = m40955k.optJSONObject("backup_db")) != null) {
            return optJSONObject.optInt("msg_total");
        }
        return 0L;
    }

    /* renamed from: x */
    private final long m134805x() {
        String str;
        C25806c m134794m = m134794m();
        TargetBackupInfo m134802u = m134802u();
        if (m134802u == null || (str = m134802u.m40959o()) == null) {
            str = "";
        }
        return m134794m.m133050j(str);
    }

    /* renamed from: y */
    private final long m134806y() {
        JSONObject m40955k;
        JSONObject optJSONObject;
        TargetBackupInfo m134802u = m134802u();
        if (m134802u != null && (m40955k = m134802u.m40955k()) != null && (optJSONObject = m40955k.optJSONObject("origin_db")) != null) {
            return optJSONObject.optInt("msg_total");
        }
        return 0L;
    }

    /* renamed from: z */
    private final Object m134807z(Continuation continuation) {
        return AbstractC29094b.m145342d(-1L);
    }

    /* renamed from: i */
    public final void m134808i() {
        if (m134802u() != null && m134781B()) {
            try {
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new g(null), 3, null);
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupInfoLog", e11);
            }
        }
    }

    public C26219a(long j11) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        this.f124557a = j11;
        m129210a = AbstractC24856m.m129210a(j.f124586q);
        this.f124558b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f124564q);
        this.f124559c = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(b.f124563q);
        this.f124560d = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(d.f124565q);
        this.f124561e = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(i.f124585q);
        this.f124562f = m129210a5;
    }

    public /* synthetic */ C26219a(long j11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 86400000L : j11);
    }
}
