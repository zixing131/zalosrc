package com.zing.zalo.p077ui.zalocloud.setup;

import ac.C0708i;
import ac.C0732w;
import am.AbstractC0924m0;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.BackupKeySetupView;
import com.zing.zalo.p077ui.zalocloud.setup.AbstractC14007c;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ke0.C21699a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import og0.C24252c;
import og0.EnumC24251b;
import p205hc.C19964c;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p479rc.C25724a;
import p479rc.C25727d;
import p487rl.C25826g;
import pg0.C24747a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qg0.C25268c;
import si.C26263i;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wg0.C28989l;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.zalocloud.setup.d */
/* loaded from: classes6.dex */
public final class C14008d extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private BackupKeySetupView.EnumC11021b f72025A;

    /* renamed from: B */
    private boolean f72026B;

    /* renamed from: C */
    private boolean f72027C;

    /* renamed from: D */
    private boolean f72028D;

    /* renamed from: E */
    private boolean f72029E;

    /* renamed from: F */
    private final EnumMap f72030F;

    /* renamed from: G */
    private boolean f72031G;

    /* renamed from: H */
    private boolean f72032H;

    /* renamed from: s */
    private final C21699a f72033s;

    /* renamed from: t */
    private final C25724a f72034t;

    /* renamed from: u */
    private final C25268c f72035u;

    /* renamed from: v */
    private final C24747a f72036v;

    /* renamed from: w */
    private final C28989l f72037w;

    /* renamed from: x */
    private final C1761c0 f72038x;

    /* renamed from: y */
    private final C1761c0 f72039y;

    /* renamed from: z */
    private boolean f72040z;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.d$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f72041a;

        static {
            int[] iArr = new int[EnumC24251b.values().length];
            try {
                iArr[EnumC24251b.f117146q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24251b.f117148s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24251b.f117147r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72041a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.d$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f72042q = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77941a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77941a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.d$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final d f72043q = new d();

        d() {
            super(2);
        }

        /* renamed from: a */
        public final void m77942a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m77942a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.d$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f72044t;

        /* renamed from: v */
        final /* synthetic */ String f72046v;

        /* renamed from: w */
        final /* synthetic */ int f72047w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, int i11, Continuation continuation) {
            super(2, continuation);
            this.f72046v = str;
            this.f72047w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f72046v, this.f72047w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f72044t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C14008d.this.m77917Q();
                int m126595a = C24252c.f117152a.m126595a(C14008d.this.m77923U());
                C14008d c14008d = C14008d.this;
                String str = this.f72046v;
                int i13 = this.f72047w;
                this.f72044t = 1;
                obj = c14008d.m77918S(str, m126595a, i13, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                EnumMap m77923U = C14008d.this.m77923U();
                EnumC24251b enumC24251b = EnumC24251b.f117148s;
                C25826g c25826g = (C25826g) m77923U.get(enumC24251b);
                if (c25826g != null) {
                    if (!c25826g.m133200a()) {
                        c25826g = null;
                    }
                    if (c25826g != null) {
                        C14008d c14008d2 = C14008d.this;
                        C24720a m120676j = AbstractC23306f.m120676j();
                        if (c14008d2.m77928a0()) {
                            i11 = 11;
                        } else {
                            i11 = -7;
                        }
                        m120676j.m128407Y(i11);
                    }
                }
                C14008d.this.m77920o0();
                if (!C24252c.f117152a.m126600f(enumC24251b)) {
                    C14008d.this.m77919Y();
                }
                C14008d.this.m77939m0();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.str_zcloud_setup_error, new Object[0]);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C14008d(C21699a c21699a, C25724a c25724a, C25268c c25268c, C24747a c24747a, C28989l c28989l) {
        AbstractC19074t.m100208f(c21699a, "zCloudOptInUseCase");
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        AbstractC19074t.m100208f(c25268c, "cloudKeyManager");
        AbstractC19074t.m100208f(c24747a, "criticalCaseManager");
        AbstractC19074t.m100208f(c28989l, "onboardingJobManager");
        this.f72033s = c21699a;
        this.f72034t = c25724a;
        this.f72035u = c25268c;
        this.f72036v = c24747a;
        this.f72037w = c28989l;
        this.f72038x = new C1761c0();
        this.f72039y = new C1761c0();
        this.f72025A = BackupKeySetupView.EnumC11021b.f55686q;
        this.f72030F = new EnumMap(EnumC24251b.class);
        this.f72031G = true;
    }

    /* renamed from: Q */
    public final void m77917Q() {
        C25727d.c cVar = C25727d.Companion;
        cVar.m132781c();
        cVar.m132788l();
    }

    /* renamed from: S */
    public final Object m77918S(String str, int i11, int i12, Continuation continuation) {
        if (i12 != 2) {
            if (i12 == 3) {
                this.f72034t.m132677R(str);
                this.f72034t.m132673N(str);
            }
        } else {
            this.f72034t.m132676Q(str);
            this.f72034t.m132672M(str);
        }
        return this.f72035u.m130758e(i11, continuation);
    }

    /* renamed from: Y */
    public final void m77919Y() {
        AbstractC23306f.m120692n().m133045d(1, c.f72042q, d.f72043q);
    }

    /* renamed from: o0 */
    public final void m77920o0() {
        String str;
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        Iterator it = this.f72030F.entrySet().iterator();
        int i11 = 3;
        while (true) {
            int i12 = 1;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                EnumC24251b enumC24251b = (EnumC24251b) entry.getKey();
                C25826g c25826g = (C25826g) entry.getValue();
                if (!c25826g.m133200a()) {
                    i11--;
                }
                if (enumC24251b == null) {
                    return;
                }
                AbstractC19074t.m100205c(enumC24251b);
                int i13 = b.f72041a[enumC24251b.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            c0708i.m1072c("my_cloud", c25826g.m133200a() ? 1 : 0);
                        }
                    } else {
                        c0708i.m1072c("backup_text", c25826g.m133200a() ? 1 : 0);
                    }
                } else {
                    c0708i.m1072c("cloud_media", c25826g.m133200a() ? 1 : 0);
                }
            } else {
                if (i11 != EnumC24251b.values().length) {
                    i12 = 0;
                }
                c0708i.m1072c("opt_in_all", i12);
                c0708i.m1073d("ts_config_feature", AbstractC0924m0.m3566X7());
                c0708i.m1073d("ts_start_connect", AbstractC0924m0.m3834g8());
                if (this.f72026B) {
                    str = "resume";
                } else {
                    str = "setup";
                }
                c0708i.m1075f("source", str);
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "zcloud_start_connection", null, c0708i, null, 10, null);
                return;
            }
        }
    }

    /* renamed from: R */
    public final void m77921R(boolean z11, boolean z12) {
        C26676b.m136957g("ZCloudSetupContainerViewModel", "completeOnboardingSetup(): complete setup flow", null, 4, null);
        this.f72036v.m128523g();
        if (C24252c.f117152a.m126599e() && z12) {
            this.f72037w.m144759N(!z11);
        }
        this.f72039y.mo9221n(new C19964c(AbstractC14007c.a.f72020a));
    }

    /* renamed from: T */
    public final void m77922T() {
        this.f72039y.mo9221n(new C19964c(AbstractC14007c.b.f72021a));
    }

    /* renamed from: U */
    public final EnumMap m77923U() {
        return this.f72030F;
    }

    /* renamed from: V */
    public final BackupKeySetupView.EnumC11021b m77924V() {
        return this.f72025A;
    }

    /* renamed from: W */
    public final void m77925W(Bundle bundle) {
        int i11;
        if (bundle == null || !bundle.getBoolean("ARG_IS_INIT")) {
            this.f72039y.mo9221n(new C19964c(AbstractC14007c.c.f72022a));
        }
        BackupKeySetupView.EnumC11021b.a aVar = BackupKeySetupView.EnumC11021b.Companion;
        if (bundle != null) {
            i11 = bundle.getInt("ARG_PWD_TYPE");
        } else {
            i11 = 0;
        }
        this.f72025A = aVar.m57580a(i11);
    }

    /* renamed from: X */
    public final LiveData m77926X() {
        return this.f72039y;
    }

    /* renamed from: Z */
    public final void m77927Z(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f72040z = z11;
        this.f72026B = z12;
        this.f72027C = z13;
        this.f72029E = z14;
        this.f72028D = z15;
        this.f72032H = z16;
    }

    /* renamed from: a0 */
    public final boolean m77928a0() {
        return this.f72031G;
    }

    /* renamed from: b0 */
    public final boolean m77929b0() {
        return this.f72027C;
    }

    /* renamed from: c0 */
    public final boolean m77930c0() {
        return this.f72032H;
    }

    /* renamed from: e0 */
    public final boolean m77931e0() {
        return this.f72029E;
    }

    /* renamed from: f0 */
    public final boolean m77932f0() {
        return this.f72028D;
    }

    /* renamed from: g0 */
    public final boolean m77933g0() {
        return this.f72026B;
    }

    /* renamed from: h0 */
    public final boolean m77934h0() {
        return this.f72040z;
    }

    /* renamed from: i0 */
    public final void m77935i0(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        bundle.putBoolean("ARG_IS_INIT", true);
        bundle.putInt("ARG_PWD_TYPE", this.f72025A.m57579c());
    }

    /* renamed from: j0 */
    public final void m77936j0(BackupKeySetupView.EnumC11021b enumC11021b) {
        AbstractC19074t.m100208f(enumC11021b, "secretPhrase");
        this.f72025A = enumC11021b;
    }

    /* renamed from: k0 */
    public final void m77937k0(String str, int i11) {
        AbstractC19074t.m100208f(str, "key");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e(str, i11, null), 3, null);
    }

    /* renamed from: l0 */
    public final void m77938l0(HashMap hashMap, boolean z11) {
        AbstractC19074t.m100208f(hashMap, "items");
        this.f72030F.clear();
        this.f72030F.putAll(hashMap);
        this.f72031G = z11;
    }

    /* renamed from: m0 */
    public final void m77939m0() {
        TargetBackupInfo m135058w = C26263i.m135058w();
        if (!(!C22447s.m116047m0(m135058w, false, 2, null)) && m135058w != null) {
            this.f72039y.mo9221n(new C19964c(AbstractC14007c.d.f72023a));
        } else {
            m77921R(false, true);
        }
    }

    /* renamed from: n0 */
    public final void m77940n0() {
        this.f72039y.mo9221n(new C19964c(AbstractC14007c.e.f72024a));
    }
}
