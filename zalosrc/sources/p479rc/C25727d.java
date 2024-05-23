package p479rc;

import ac.C0708i;
import ac.C0732w;
import am.AbstractC0924m0;
import android.os.Handler;
import android.os.Message;
import androidx.work.AbstractC2144f;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mg0.AbstractC23291c;
import nl.C23870a;
import org.json.JSONObject;
import p297kd.C21688c;
import p320ld.C22440l;
import p348mi.AbstractC23306f;
import p387oc.C24199c;
import p484ri.C25806c;
import p586vt.AbstractC28618c;
import p586vt.AbstractC28626k;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qg0.C25268c;
import sc.C26220b;
import sg0.C26245a;
import si.C26263i;
import sl.C26316a;
import tg0.C26675a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: rc.d */
/* loaded from: classes3.dex */
public final class C25727d {

    /* renamed from: A */
    private static C25727d f122781A;
    public static final c Companion = new c(null);

    /* renamed from: w */
    private static boolean f122782w;

    /* renamed from: x */
    private static final ConcurrentHashMap f122783x;

    /* renamed from: y */
    private static final MutableStateFlow f122784y;

    /* renamed from: z */
    private static final StateFlow f122785z;

    /* renamed from: a */
    private final CoroutineScope f122786a;

    /* renamed from: b */
    private final String f122787b;

    /* renamed from: c */
    private final int f122788c;

    /* renamed from: d */
    private final boolean f122789d;

    /* renamed from: e */
    private final InterfaceC18505l f122790e;

    /* renamed from: f */
    private long f122791f;

    /* renamed from: g */
    private final InterfaceC24854k f122792g;

    /* renamed from: h */
    private final InterfaceC24854k f122793h;

    /* renamed from: i */
    private final InterfaceC24854k f122794i;

    /* renamed from: j */
    private final InterfaceC24854k f122795j;

    /* renamed from: k */
    private final InterfaceC24854k f122796k;

    /* renamed from: l */
    private final InterfaceC24854k f122797l;

    /* renamed from: m */
    private b f122798m;

    /* renamed from: n */
    private boolean f122799n;

    /* renamed from: o */
    private e f122800o;

    /* renamed from: p */
    private final InterfaceC24854k f122801p;

    /* renamed from: q */
    private final InterfaceC24854k f122802q;

    /* renamed from: r */
    private boolean f122803r;

    /* renamed from: s */
    private final r f122804s;

    /* renamed from: t */
    private int f122805t;

    /* renamed from: u */
    private int f122806u;

    /* renamed from: v */
    private final Handler f122807v;

    /* renamed from: rc.d$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f122808q = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m132774a(Boolean bool) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m132774a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rc.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends Enum {
        public static final a Companion;

        /* renamed from: p */
        public static final b f122809p = new b("START", 0);

        /* renamed from: q */
        public static final b f122810q = new b("DELETE_BACKUP", 1);

        /* renamed from: r */
        public static final b f122811r = new b("UPDATE_BACKUP_KEY_LOCAL", 2);

        /* renamed from: s */
        public static final b f122812s = new b("UPDATE_BACKUP_KEY_SERVER", 3);

        /* renamed from: t */
        public static final b f122813t = new b("CREATE_NEW_BACKUP", 4);

        /* renamed from: u */
        public static final b f122814u = new b("ERROR", 5);

        /* renamed from: v */
        public static final b f122815v = new b("SUCCESS", 6);

        /* renamed from: w */
        private static final /* synthetic */ b[] f122816w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f122817x;

        /* renamed from: rc.d$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m132776a(Integer num) {
                b bVar;
                b[] values = b.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        bVar = values[i11];
                        int ordinal = bVar.ordinal();
                        if (num != null && ordinal == num.intValue()) {
                            break;
                        }
                        i11++;
                    } else {
                        bVar = null;
                        break;
                    }
                }
                if (bVar == null) {
                    return b.f122809p;
                }
                return bVar;
            }
        }

        static {
            b[] m132775b = m132775b();
            f122816w = m132775b;
            f122817x = AbstractC30166b.m148796a(m132775b);
            Companion = new a(null);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m132775b() {
            return new b[]{f122809p, f122810q, f122811r, f122812s, f122813t, f122814u, f122815v};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f122816w.clone();
        }
    }

    /* renamed from: rc.d$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        public final d m132779d() {
            String m3450T7 = AbstractC0924m0.m3450T7();
            AbstractC19074t.m100205c(m3450T7);
            if (m3450T7.length() > 0) {
                return d.Companion.m132798a(new JSONObject(m3450T7));
            }
            return null;
        }

        /* renamed from: k */
        public final void m132780k(String str) {
            C26220b.m134826i("SMLChangeBackupKey", str, null, 4, null);
        }

        /* renamed from: c */
        public final void m132781c() {
            m132780k("clearAllSnapshotData()");
            AbstractC0924m0.m3733cr("");
            AbstractC0924m0.m3615Yr("");
            AbstractC0924m0.m3586Xr("");
        }

        /* renamed from: e */
        public final int m132782e() {
            return ((AbstractC23291c) m132783f().getValue()).mo120404a();
        }

        /* renamed from: f */
        public final StateFlow m132783f() {
            return C25727d.f122785z;
        }

        /* renamed from: g */
        public final boolean m132784g() {
            b bVar;
            C25727d c25727d = C25727d.f122781A;
            if (c25727d != null) {
                bVar = c25727d.f122798m;
            } else {
                bVar = null;
            }
            if (bVar == b.f122814u) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final boolean m132785h() {
            return C25727d.f122782w;
        }

        /* renamed from: i */
        public final boolean m132786i() {
            C25727d c25727d = C25727d.f122781A;
            if (c25727d == null || c25727d.f122798m == b.f122815v || c25727d.f122798m == b.f122814u) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final boolean m132787j() {
            b bVar;
            C25727d c25727d = C25727d.f122781A;
            if (c25727d != null) {
                bVar = c25727d.f122798m;
            } else {
                bVar = null;
            }
            if (bVar == b.f122815v) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public final void m132788l() {
            C25727d.f122784y.mo113433d(AbstractC23291c.b.f113053b);
            m132780k("resetState(): " + C25727d.f122784y.getValue());
        }

        /* renamed from: m */
        public final void m132789m() {
            if (!C23055e5.m118272g(true)) {
                return;
            }
            try {
                d m132779d = m132779d();
                if (m132779d != null) {
                    if (!m132779d.m132796f()) {
                        C25727d.Companion.m132780k("Retry change key: Data is INVALID: " + m132779d);
                        return;
                    }
                    C25727d.Companion.m132780k("Retry change key: rawKey " + C26245a.f124654a.m134956q(m132779d.m132793c()) + ", en-type: " + m132779d.m132794d() + ", phase: " + m132779d.m132791a());
                    new C25727d(C17933b.f90533a.m94579d(), m132779d.m132793c(), m132779d.m132794d(), true, null, 16, null).m132773i0();
                }
            } catch (Exception e11) {
                C26220b.m134821d("SMLChangeBackupKey", e11);
                C25727d.f122782w = false;
            }
        }

        /* renamed from: n */
        public final void m132790n() {
            try {
                if (!AbstractC23306f.m120633X1().m89807v()) {
                    m132780k("validateState(): Skipped, cause: Zalo cloud config isn't enable!");
                    m132788l();
                    return;
                }
                if (AbstractC23306f.m120691m2().m2466q() && AbstractC0924m0.m3629Zc()) {
                    m132780k("validateState(): Skipped, cause: Paid user and CC6!");
                    m132788l();
                    return;
                }
                String m3450T7 = AbstractC0924m0.m3450T7();
                AbstractC19074t.m100205c(m3450T7);
                if (m3450T7.length() > 0) {
                    d m132798a = d.Companion.m132798a(new JSONObject(m3450T7));
                    if (m132798a.m132794d() != -1) {
                        C25727d.f122784y.mo113433d(new AbstractC23291c.a(m132798a.m132792b(), "unknown"));
                    }
                    m132780k("validateState(): RETRY, currentState=" + C25727d.f122784y.getValue());
                    return;
                }
                if (C25727d.f122784y.getValue() instanceof AbstractC23291c.b) {
                    C25727d.f122784y.mo113433d(C25727d.f122784y.getValue());
                    m132780k("validateState(): NORMAL, currentState=" + C25727d.f122784y.getValue());
                }
            } catch (Exception e11) {
                C26220b.m134821d("SMLChangeBackupKey", e11);
            }
        }
    }

    /* renamed from: rc.d$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final String f122818a;

        /* renamed from: b */
        private final int f122819b;

        /* renamed from: c */
        private final int f122820c;

        /* renamed from: d */
        private final int f122821d;

        /* renamed from: e */
        private final boolean f122822e;

        /* renamed from: rc.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m132798a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "jsonObject");
                String optString = jSONObject.optString("RAW_BACKUP_KEY");
                int optInt = jSONObject.optInt("ENCRYPT_TYPE", -1);
                int optInt2 = jSONObject.optInt("PROCESS", 0);
                int optInt3 = jSONObject.optInt("CURRENT_PHASE", 0);
                boolean optBoolean = jSONObject.optBoolean("HAS_BACKUP_BEFORE", false);
                AbstractC19074t.m100205c(optString);
                return new d(optString, optInt, optInt2, optInt3, optBoolean);
            }
        }

        public d(String str, int i11, int i12, int i13, boolean z11) {
            AbstractC19074t.m100208f(str, "rawBackupKey");
            this.f122818a = str;
            this.f122819b = i11;
            this.f122820c = i12;
            this.f122821d = i13;
            this.f122822e = z11;
        }

        /* renamed from: a */
        public final int m132791a() {
            return this.f122821d;
        }

        /* renamed from: b */
        public final int m132792b() {
            return this.f122820c;
        }

        /* renamed from: c */
        public final String m132793c() {
            return this.f122818a;
        }

        /* renamed from: d */
        public final int m132794d() {
            return this.f122819b;
        }

        /* renamed from: e */
        public final boolean m132795e() {
            return this.f122822e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f122818a, dVar.f122818a) && this.f122819b == dVar.f122819b && this.f122820c == dVar.f122820c && this.f122821d == dVar.f122821d && this.f122822e == dVar.f122822e;
        }

        /* renamed from: f */
        public final boolean m132796f() {
            if (this.f122818a.length() > 0 && this.f122819b != -1 && this.f122821d >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final JSONObject m132797g() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("RAW_BACKUP_KEY", this.f122818a);
            jSONObject.put("ENCRYPT_TYPE", this.f122819b);
            jSONObject.put("PROCESS", this.f122820c);
            jSONObject.put("CURRENT_PHASE", this.f122821d);
            jSONObject.put("HAS_BACKUP_BEFORE", this.f122822e);
            return jSONObject;
        }

        public int hashCode() {
            return (((((((this.f122818a.hashCode() * 31) + this.f122819b) * 31) + this.f122820c) * 31) + this.f122821d) * 31) + AbstractC2144f.m11520a(this.f122822e);
        }

        public String toString() {
            return "DataRetry(rawBackupKey=" + this.f122818a + ", type=" + this.f122819b + ", process=" + this.f122820c + ", currentPhase=" + this.f122821d + ", isExistBackupBefore=" + this.f122822e + ")";
        }
    }

    /* renamed from: rc.d$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final String f122823a;

        /* renamed from: b */
        private final String f122824b;

        /* renamed from: c */
        private final int f122825c;

        /* renamed from: rc.d$e$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final e m132802a(String str) {
                AbstractC19074t.m100208f(str, "jsonStr");
                if (str.length() == 0) {
                    return new e("", "", -1);
                }
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("ENCRYPTED_PRIVATE_KEY");
                String optString2 = jSONObject.optString("BACKUP_KEY_HASH");
                int optInt = jSONObject.optInt("ENCRYPT_TYPE", -1);
                AbstractC19074t.m100205c(optString);
                AbstractC19074t.m100205c(optString2);
                return new e(optString, optString2, optInt);
            }
        }

        public e(String str, String str2, int i11) {
            AbstractC19074t.m100208f(str, "encryptedPrivateKey");
            AbstractC19074t.m100208f(str2, "backupKeyHash");
            this.f122823a = str;
            this.f122824b = str2;
            this.f122825c = i11;
        }

        /* renamed from: a */
        public final String m132799a() {
            return this.f122824b;
        }

        /* renamed from: b */
        public final boolean m132800b() {
            if (this.f122823a.length() > 0 && this.f122824b.length() > 0 && this.f122825c != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final JSONObject m132801c() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ENCRYPTED_PRIVATE_KEY", this.f122823a);
            jSONObject.put("BACKUP_KEY_HASH", this.f122824b);
            jSONObject.put("ENCRYPT_TYPE", this.f122825c);
            return jSONObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC19074t.m100204b(this.f122823a, eVar.f122823a) && AbstractC19074t.m100204b(this.f122824b, eVar.f122824b) && this.f122825c == eVar.f122825c;
        }

        public int hashCode() {
            return (((this.f122823a.hashCode() * 31) + this.f122824b.hashCode()) * 31) + this.f122825c;
        }

        public String toString() {
            return "SnapshotKeyData(encryptedPrivateKey=" + this.f122823a + ", backupKeyHash=" + this.f122824b + ", type=" + this.f122825c + ")";
        }
    }

    /* renamed from: rc.d$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f122826a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f122809p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f122810q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f122811r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f122812s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f122813t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f122814u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f122815v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f122826a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f122827q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25724a mo12V4() {
            return AbstractC23306f.m120668h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f122828q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C26263i mo12V4() {
            return C26263i.m135055u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f122829q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24199c mo12V4() {
            return AbstractC23306f.m120684l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f122830q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25806c mo12V4() {
            return AbstractC23306f.m120692n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f122831q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25268c mo12V4() {
            return AbstractC23306f.m120647b2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f122832q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23870a mo12V4() {
            return AbstractC23306f.m120679j2();
        }
    }

    /* renamed from: rc.d$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class m extends C19071q implements InterfaceC18505l {
        m(Object obj) {
            super(1, obj, C25727d.class, "handleDeleteBkSuccess", "handleDeleteBkSuccess(Lkotlin/Unit;)V", 0);
        }

        /* renamed from: h */
        public final void m132809h(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "p0");
            ((C25727d) this.f94922q).m132723O(c24848g0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m132809h((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rc.d$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class n extends C19071q implements InterfaceC18509p {
        n(Object obj) {
            super(2, obj, C25727d.class, "handleDeleteBkError", "handleDeleteBkError(ILjava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m132810h(int i11, String str) {
            AbstractC19074t.m100208f(str, "p1");
            ((C25727d) this.f94922q).m132722N(i11, str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m132810h(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rc.d$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122833t;

        /* renamed from: v */
        final /* synthetic */ C26316a f122835v;

        /* renamed from: rc.d$o$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ C25727d f122836q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C25727d c25727d) {
                super(2);
                this.f122836q = c25727d;
            }

            /* renamed from: a */
            public final void m132812a(int i11, String str) {
                AbstractC19074t.m100208f(str, "msg");
                C25727d.m132750h0(this.f122836q, 0, 1, null);
                this.f122836q.m132719K(i11, str);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m132812a(((Number) obj).intValue(), (String) obj2);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C26316a c26316a, Continuation continuation) {
            super(2, continuation);
            this.f122835v = c26316a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(this.f122835v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122833t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m132714F = C25727d.this.m132714F();
                C26316a c26316a = this.f122835v;
                a aVar = new a(C25727d.this);
                this.f122833t = 1;
                obj = m132714F.m124836v(c26316a, aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                if (AbstractC3489d.m17515w() || ((C26263i.m135058w() != null && (!C25727d.this.m132709A().m132668G() || !C25727d.this.m132711C().m126159l())) || (!C25727d.this.f122803r && AbstractC3489d.m17514v()))) {
                    C25727d.this.m132718J();
                } else {
                    C25727d c25727d = C25727d.this;
                    b bVar = b.f122813t;
                    c25727d.m132748g0(bVar.ordinal());
                    C25727d.m132738b0(C25727d.this, bVar, 0L, 2, null);
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$p */
    /* loaded from: classes3.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18494a {
        p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            boolean z11;
            if (!C25727d.this.m132734Z() && !AbstractC3489d.m17512t()) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rc.d$q */
    /* loaded from: classes3.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final q f122838q = new q();

        q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            boolean z11;
            if (AbstractC3489d.m17501i() && !AbstractC3489d.m17512t()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: rc.d$r */
    /* loaded from: classes3.dex */
    public static final class r implements InterfaceC28625j {
        r() {
        }

        @Override // p586vt.InterfaceC28625j
        /* renamed from: lk */
        public void mo57172lk(AbstractC28627l abstractC28627l) {
            AbstractC28618c abstractC28618c;
            int i11;
            C21688c.b bVar = (C21688c.b) abstractC28627l;
            if (bVar == null) {
                return;
            }
            C22440l.f109789p.mo57172lk(bVar);
            if (bVar.f132722a != 0) {
                int i12 = bVar.f105263d;
                if (C25727d.this.m132734Z()) {
                    i11 = 60;
                } else {
                    i11 = 70;
                }
                int i13 = (i11 * i12) / 100;
                C25727d c25727d = C25727d.this;
                c25727d.f122805t = c25727d.f122806u + i13;
                C25727d.this.m132770x();
            }
            if (bVar.f132722a == 17) {
                AbstractC28626k m143178a = bVar.m143178a();
                if (m143178a != null && m143178a.m143172f()) {
                    C25727d.this.m132718J();
                    return;
                }
                C25727d c25727d2 = C25727d.this;
                AbstractC28626k m143178a2 = bVar.m143178a();
                if (m143178a2 != null) {
                    abstractC28618c = m143178a2.m143169b();
                } else {
                    abstractC28618c = null;
                }
                c25727d2.m132717I(abstractC28618c);
            }
        }
    }

    static {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f122783x = concurrentHashMap;
        String str = CoreUtility.f89233i;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = StateFlowKt.m113503a(AbstractC23291c.b.f113053b)))) != null) {
            obj = putIfAbsent;
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) obj;
        f122784y = mutableStateFlow;
        AbstractC19074t.m100207e(mutableStateFlow, "currentState");
        f122785z = FlowKt.m113284b(mutableStateFlow);
    }

    public C25727d(CoroutineScope coroutineScope, String str, int i11, boolean z11, InterfaceC18505l interfaceC18505l) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(str, "rawBackupKey");
        AbstractC19074t.m100208f(interfaceC18505l, "onComplete");
        this.f122786a = coroutineScope;
        this.f122787b = str;
        this.f122788c = i11;
        this.f122789d = z11;
        this.f122790e = interfaceC18505l;
        this.f122791f = -1L;
        m129210a = AbstractC24856m.m129210a(h.f122828q);
        this.f122792g = m129210a;
        m129210a2 = AbstractC24856m.m129210a(j.f122830q);
        this.f122793h = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(l.f122832q);
        this.f122794i = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(k.f122831q);
        this.f122795j = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(g.f122827q);
        this.f122796k = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(i.f122829q);
        this.f122797l = m129210a6;
        this.f122798m = b.f122809p;
        m129210a7 = AbstractC24856m.m129210a(q.f122838q);
        this.f122801p = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new p());
        this.f122802q = m129210a8;
        Companion.m132780k("Initializing...");
        f122781A = this;
        this.f122804s = new r();
        this.f122807v = new Handler(new Handler.Callback() { // from class: rc.c
            public /* synthetic */ C25726c() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m132768v;
                m132768v = C25727d.m132768v(C25727d.this, message);
                return m132768v;
            }
        });
    }

    /* renamed from: A */
    public final C25724a m132709A() {
        return (C25724a) this.f122796k.getValue();
    }

    /* renamed from: B */
    private final C26263i m132710B() {
        return (C26263i) this.f122792g.getValue();
    }

    /* renamed from: C */
    public final C24199c m132711C() {
        return (C24199c) this.f122797l.getValue();
    }

    /* renamed from: D */
    private final C25806c m132712D() {
        return (C25806c) this.f122793h.getValue();
    }

    /* renamed from: E */
    private final C25268c m132713E() {
        return (C25268c) this.f122795j.getValue();
    }

    /* renamed from: F */
    public final C23870a m132714F() {
        return (C23870a) this.f122794i.getValue();
    }

    /* renamed from: G */
    private final int m132715G() {
        if (m132732X()) {
            return m132709A().m132665A();
        }
        return m132709A().m132696q();
    }

    /* renamed from: H */
    private final String m132716H() {
        if (m132732X()) {
            return m132709A().m132697w().m132706c();
        }
        return m132709A().m132694o().m132706c();
    }

    /* renamed from: I */
    public final void m132717I(AbstractC28618c abstractC28618c) {
        Companion.m132780k("handleBackupNewKeyError(): errorInfo=" + abstractC28618c);
        m132738b0(this, b.f122814u, 0L, 2, null);
    }

    /* renamed from: J */
    public final void m132718J() {
        m132738b0(this, b.f122815v, 0L, 2, null);
    }

    /* renamed from: K */
    public final void m132719K(int i11, String str) {
        Companion.m132780k("handleChangeBackupKeyError(): code=" + i11 + ", msg=" + str);
        C26675a.m136890L(C26675a.f126213a, 1504122, i11, str, null, 0L, 0L, 56, null);
        m132738b0(this, b.f122814u, 0L, 2, null);
    }

    /* renamed from: L */
    private final boolean m132720L() {
        int i11;
        int i12;
        Companion.m132780k("handleCreateNewBackup()");
        if (m132734Z()) {
            i11 = 40;
        } else {
            i11 = 30;
        }
        this.f122805t = i11;
        this.f122806u = i11;
        if (m132710B().m135071M()) {
            if (!this.f122799n) {
                m132736a0(this.f122798m, 2000L);
            }
        } else {
            if (m132734Z()) {
                i12 = 21;
            } else {
                i12 = 20;
            }
            if (!C26263i.m135055u().m135085r0(i12)) {
                m132738b0(this, b.f122814u, 0L, 2, null);
            }
            this.f122799n = true;
        }
        m132770x();
        return false;
    }

    /* renamed from: M */
    private final boolean m132721M() {
        c cVar = Companion;
        cVar.m132780k("handleDeleteBackup()");
        this.f122805t = 10;
        if (!m132734Z() || !AbstractC3489d.m17508p()) {
            cVar.m132780k("skipped, delete backup, paid && opt-out");
            m132738b0(this, b.f122811r, 0L, 2, null);
            return false;
        }
        m132712D().m133045d(1, new m(this), new n(this));
        return false;
    }

    /* renamed from: N */
    public final void m132722N(int i11, String str) {
        Companion.m132780k("handleDeleteBkError(): code=" + i11 + ", msg=" + str);
        this.f122805t = this.f122805t + 10;
        m132750h0(this, 0, 1, null);
        C26675a.m136890L(C26675a.f126213a, 1504121, i11, str, null, 0L, 0L, 56, null);
        m132738b0(this, b.f122814u, 0L, 2, null);
    }

    /* renamed from: O */
    public final void m132723O(C24848g0 c24848g0) {
        m132710B().m135092z0(null, "");
        m132712D().m133036P("");
        this.f122805t += 10;
        m132770x();
        m132738b0(this, b.f122811r, 0L, 2, null);
        this.f122790e.mo205i9(null);
    }

    /* renamed from: P */
    private final boolean m132724P() {
        Companion.m132780k("handleError()");
        m132769w("unknown");
        m132755k0();
        this.f122790e.mo205i9(Boolean.FALSE);
        C26675a.m136890L(C26675a.f126213a, 1504120, -1, null, null, this.f122791f, 0L, 44, null);
        return true;
    }

    /* renamed from: Q */
    private final void m132725Q() {
        Companion.m132780k("handlePreStart()");
        m132746f0();
        m132750h0(this, 0, 1, null);
        m132738b0(this, b.f122809p, 0L, 2, null);
    }

    /* renamed from: R */
    private final void m132726R() {
        C24848g0 c24848g0;
        boolean z11;
        c cVar = Companion;
        d m132779d = cVar.m132779d();
        if (m132779d != null) {
            if (!m132779d.m132795e() && C26263i.m135058w() == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f122803r = z11;
            b m132776a = b.Companion.m132776a(Integer.valueOf(m132779d.m132791a()));
            int i11 = f.f122826a[m132776a.ordinal()];
            if (i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    m132725Q();
                } else {
                    m132731W();
                    m132753j0(m132776a);
                }
            } else {
                m132731W();
                m132744e0();
                e eVar = this.f122800o;
                if (eVar == null || !eVar.m132800b()) {
                    cVar.m132780k("Snapshot is INVALID. --> Try to restart the Change Key flow");
                    m132725Q();
                } else {
                    m132753j0(m132776a);
                }
            }
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            m132725Q();
        }
    }

    /* renamed from: S */
    private final boolean m132727S() {
        b bVar;
        Companion.m132780k("handleStartChangeKey()");
        this.f122805t = 0;
        m132731W();
        this.f122805t += 10;
        m132770x();
        if (m132734Z() && AbstractC3489d.m17508p()) {
            bVar = b.f122810q;
        } else {
            bVar = b.f122811r;
        }
        m132738b0(this, bVar, 0L, 2, null);
        return false;
    }

    /* renamed from: T */
    private final boolean m132728T() {
        c cVar = Companion;
        cVar.m132780k("handleSuccess()");
        m132755k0();
        int i11 = this.f122788c;
        if (i11 != 2) {
            if (i11 == 3) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_code_change_success_64", null, null, null, 14, null);
            }
        } else {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_code_change_success_pin", null, null, null, 14, null);
        }
        m132772z();
        this.f122790e.mo205i9(Boolean.TRUE);
        cVar.m132781c();
        m132742d0();
        C26675a.m136891O(C26675a.f126213a, 1504120, null, this.f122791f, 0L, 10, null);
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1073d("start_time", this.f122791f);
        c0708i.m1073d("end_time", System.currentTimeMillis());
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, "zcloud_code_change_backup_complete", "", c0708i, null, 8, null);
        return true;
    }

    /* renamed from: U */
    private final boolean m132729U() {
        int i11;
        int i12;
        b bVar;
        Companion.m132780k("handleUpdateBackupKeyLocal()");
        if (m132734Z()) {
            i11 = 20;
        } else {
            i11 = 10;
        }
        this.f122805t = i11;
        int i13 = this.f122788c;
        if (i13 != 2) {
            if (i13 == 3) {
                if (m132732X()) {
                    m132709A().m132677R(this.f122787b);
                } else {
                    m132709A().m132673N(this.f122787b);
                }
            }
        } else if (m132732X()) {
            m132709A().m132676Q(this.f122787b);
        } else {
            m132709A().m132672M(this.f122787b);
        }
        m132750h0(this, 0, 1, null);
        if (!m132734Z()) {
            this.f122790e.mo205i9(null);
        }
        if (m132734Z()) {
            i12 = this.f122805t + 10;
        } else {
            i12 = this.f122805t + 20;
        }
        this.f122805t = i12;
        m132770x();
        if (m132734Z()) {
            bVar = b.f122812s;
        } else if (AbstractC3489d.m17512t() && C26263i.m135058w() == null) {
            this.f122805t += 69;
            m132770x();
            bVar = b.f122815v;
        } else {
            bVar = b.f122813t;
        }
        m132738b0(this, bVar, 0L, 2, null);
        return false;
    }

    /* renamed from: V */
    private final boolean m132730V() {
        String str;
        String m130762o = m132713E().m130762o();
        String m132716H = m132716H();
        e eVar = this.f122800o;
        if (eVar == null || (str = eVar.m132799a()) == null) {
            str = "";
        }
        C26316a c26316a = new C26316a(str, m130762o, m132716H, this.f122788c);
        Companion.m132780k("handleUpdateBackupKeyServer(): params=" + c26316a);
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new o(c26316a, null), 3, null);
        return false;
    }

    /* renamed from: W */
    private final void m132731W() {
        this.f122791f = System.currentTimeMillis();
        this.f122799n = false;
        m132740c0();
    }

    /* renamed from: X */
    private final boolean m132732X() {
        return ((Boolean) this.f122802q.getValue()).booleanValue();
    }

    /* renamed from: Y */
    public static final boolean m132733Y() {
        return Companion.m132786i();
    }

    /* renamed from: Z */
    public final boolean m132734Z() {
        return ((Boolean) this.f122801p.getValue()).booleanValue();
    }

    /* renamed from: a0 */
    private final void m132736a0(b bVar, long j11) {
        Companion.m132780k("notifyCurrentPhase(): " + bVar.name());
        this.f122798m = bVar;
        if (j11 != 0) {
            this.f122807v.sendEmptyMessageDelayed(bVar.ordinal(), j11);
        } else {
            this.f122807v.sendEmptyMessage(bVar.ordinal());
        }
    }

    /* renamed from: b0 */
    static /* synthetic */ void m132738b0(C25727d c25727d, b bVar, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1000;
        }
        c25727d.m132736a0(bVar, j11);
    }

    /* renamed from: c0 */
    private final void m132740c0() {
        C21688c.Companion.m111854a().m111849u(this.f122804s, "SYNC_MES");
    }

    /* renamed from: d0 */
    private final void m132742d0() {
        m132771y(AbstractC23291c.b.f113053b);
    }

    /* renamed from: e0 */
    private final void m132744e0() {
        JSONObject jSONObject;
        String m2958C8 = AbstractC0924m0.m2958C8();
        e.a aVar = e.Companion;
        AbstractC19074t.m100205c(m2958C8);
        e m132802a = aVar.m132802a(m2958C8);
        this.f122800o = m132802a;
        c cVar = Companion;
        if (m132802a != null) {
            jSONObject = m132802a.m132801c();
        } else {
            jSONObject = null;
        }
        cVar.m132780k("retrieveOldKeyFromSnapshot(): oldKeyStr=" + m2958C8 + ", " + jSONObject);
    }

    /* renamed from: f0 */
    private final void m132746f0() {
        String str;
        if (this.f122798m.compareTo(b.f122810q) > 0) {
            Companion.m132780k("snapShotOldKey(): Wrong phase [" + this.f122798m + "]");
            return;
        }
        if (AbstractC3489d.m17509q()) {
            str = m132713E().m130762o();
        } else {
            str = "";
        }
        e eVar = new e(str, m132716H(), m132715G());
        AbstractC0924m0.m3615Yr(eVar.m132801c().toString());
        this.f122800o = eVar;
        Companion.m132780k("snapShotOldKey(): " + eVar);
    }

    /* renamed from: g0 */
    public final void m132748g0(int i11) {
        AbstractC0924m0.m3733cr(new d(this.f122787b, this.f122788c, this.f122805t, i11, this.f122803r).m132797g().toString());
        Companion.m132780k("snapshotPhaseHandle(): rawKey " + C26245a.f124654a.m134956q(this.f122787b) + ", en-type: " + this.f122788c + ", phase: " + i11);
    }

    /* renamed from: h0 */
    static /* synthetic */ void m132750h0(C25727d c25727d, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = c25727d.f122798m.ordinal();
        }
        c25727d.m132748g0(i11);
    }

    /* renamed from: j0 */
    private final void m132753j0(b bVar) {
        m132738b0(this, bVar, 0L, 2, null);
    }

    /* renamed from: k0 */
    private final void m132755k0() {
        C21688c.Companion.m111854a().m111851x(this.f122804s, "SYNC_MES");
    }

    /* renamed from: l0 */
    public static final void m132757l0() {
        Companion.m132790n();
    }

    /* renamed from: m0 */
    private final void m132759m0() {
        if (C23055e5.m118273h(false, 1, null)) {
            return;
        }
        Companion.m132780k("Network isn't available! phase=" + this.f122798m.name() + " ");
        this.f122798m = b.f122814u;
    }

    /* renamed from: v */
    public static final boolean m132768v(C25727d c25727d, Message message) {
        AbstractC19074t.m100208f(c25727d, "this$0");
        AbstractC19074t.m100208f(message, "it");
        Companion.m132780k("Handler Message: " + c25727d.f122798m);
        c25727d.m132759m0();
        try {
            switch (f.f122826a[c25727d.f122798m.ordinal()]) {
                case 1:
                    return c25727d.m132727S();
                case 2:
                    return c25727d.m132721M();
                case 3:
                    return c25727d.m132729U();
                case 4:
                    return c25727d.m132730V();
                case 5:
                    return c25727d.m132720L();
                case 6:
                    return c25727d.m132724P();
                case 7:
                    return c25727d.m132728T();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e11) {
            C26220b.m134821d("SMLChangeBackupKey", e11);
            return c25727d.m132724P();
        }
    }

    /* renamed from: w */
    private final void m132769w(String str) {
        m132771y(new AbstractC23291c.a(this.f122805t, str));
    }

    /* renamed from: x */
    public final void m132770x() {
        m132771y(new AbstractC23291c.c(this.f122805t));
    }

    /* renamed from: y */
    private final void m132771y(AbstractC23291c abstractC23291c) {
        Companion.m132780k("emitState(): phase=" + this.f122798m.name() + ", state=" + abstractC23291c);
        f122784y.mo113433d(abstractC23291c);
    }

    /* renamed from: z */
    private final void m132772z() {
        m132771y(AbstractC23291c.d.f113055b);
    }

    /* renamed from: i0 */
    public final void m132773i0() {
        boolean z11;
        if (!C26263i.m135055u().m135071M()) {
            Companion.m132780k("────────── START CHANGE BACKUP KEY ──────────");
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_code_change_backup_start", null, null, null, 14, null);
            m132742d0();
            boolean z12 = this.f122789d;
            f122782w = z12;
            if (z12) {
                m132726R();
                return;
            }
            if (C26263i.m135058w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f122803r = z11;
            m132725Q();
            return;
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_notice_change_protect_code_when_syncing));
    }

    public /* synthetic */ C25727d(CoroutineScope coroutineScope, String str, int i11, boolean z11, InterfaceC18505l interfaceC18505l, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? C17933b.f90533a.m94579d() : coroutineScope, str, i11, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? a.f122808q : interfaceC18505l);
    }
}
