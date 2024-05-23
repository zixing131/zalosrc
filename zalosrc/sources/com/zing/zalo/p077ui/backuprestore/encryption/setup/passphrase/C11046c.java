package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import c50.C3293d;
import c50.EnumC3292c;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.AbstractC11044a;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.AbstractC11045b;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet;
import com.zing.zalo.p077ui.zalocloud.bottomsheet.ChangeProtectCodeRecognitionSheetView;
import com.zing.zalo.zalocloud.backupkey.DriveKeyPayload;
import com.zing.zalo.zalocloud.backupkey.SecureOption;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mg0.C23290b;
import mg0.C23294f;
import mg0.EnumC23289a;
import p205hc.C19964c;
import p479rc.C25724a;
import p479rc.C25727d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q40.EnumC25120i;
import qg0.C25268c;
import si.C26263i;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c */
/* loaded from: classes5.dex */
public final class C11046c extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C1761c0 f55732A;

    /* renamed from: B */
    private boolean f55733B;

    /* renamed from: C */
    private boolean f55734C;

    /* renamed from: s */
    private final C23290b f55735s;

    /* renamed from: t */
    private final C25724a f55736t;

    /* renamed from: u */
    private final C25268c f55737u;

    /* renamed from: v */
    private boolean f55738v;

    /* renamed from: w */
    private final AbstractC27323a f55739w;

    /* renamed from: x */
    private final C1761c0 f55740x;

    /* renamed from: y */
    private final C1761c0 f55741y;

    /* renamed from: z */
    private final C1761c0 f55742z;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55743a;

        static {
            int[] iArr = new int[SaveBackupKeyBottomSheet.EnumC11042b.values().length];
            try {
                iArr[SaveBackupKeyBottomSheet.EnumC11042b.f55722s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SaveBackupKeyBottomSheet.EnumC11042b.f55721r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55743a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55744t;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55744t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23290b c23290b = C11046c.this.f55735s;
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                Object mo9215f = C11046c.this.m57666X().mo9215f();
                AbstractC19074t.m100205c(mo9215f);
                DriveKeyPayload driveKeyPayload = new DriveKeyPayload(str, new SecureOption(3, (String) mo9215f));
                this.f55744t = 1;
                obj = c23290b.m120398e(driveKeyPayload, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C23294f.b bVar = (C23294f.b) obj;
            if (bVar instanceof C23294f.b.C32899b) {
                C11046c.this.f55742z.mo9221n(new C19964c(new AbstractC11045b.a(EnumC25120i.f120645q)));
                C11046c.this.f55740x.mo9221n(C11046c.this.m57661W().m57596a(false));
            } else if (bVar instanceof C23294f.b.a) {
                if (((C23294f.b.a) bVar).m120431a() == EnumC23289a.f113039p) {
                    C11046c.this.f55742z.mo9221n(new C19964c(new AbstractC11045b.a(EnumC25120i.f120646r)));
                } else {
                    C11046c.this.f55742z.mo9221n(new C19964c(new AbstractC11045b.a(EnumC25120i.f120647s)));
                }
                C11046c.this.f55740x.mo9221n(C11046c.this.m57661W().m57596a(false));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55747t;

            /* renamed from: u */
            final /* synthetic */ C11046c f55748u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C11046c c11046c, Continuation continuation) {
                super(2, continuation);
                this.f55748u = c11046c;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f55748u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f55747t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f55748u.f55740x.mo9221n(this.f55748u.m57661W().m57596a(false));
                    this.f55748u.f55741y.mo9221n(new C19964c(AbstractC11044a.d.f55730a));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m57679a(Boolean bool) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(C11046c.this), Dispatchers.m112681c(), null, new a(C11046c.this, null), 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57679a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55749t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f55749t == 0) {
                AbstractC24862s.m129228b(obj);
                C11046c.this.f55740x.mo9221n(C11046c.this.m57661W().m57596a(false));
                C11046c.this.f55741y.mo9221n(new C19964c(AbstractC11044a.d.f55730a));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.c$f */
    /* loaded from: classes5.dex */
    static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f55751q = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m57682a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139879d(true);
            c27326d.m139881f(true);
            c27326d.m139878c(true);
            c27326d.m139882g(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57682a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    public C11046c(C23290b c23290b, C25724a c25724a, C25268c c25268c) {
        AbstractC19074t.m100208f(c23290b, "backupZCloudKeyManager");
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        AbstractC19074t.m100208f(c25268c, "cloudKeyManager");
        this.f55735s = c23290b;
        this.f55736t = c25724a;
        this.f55737u = c25268c;
        this.f55739w = AbstractC27336n.m139941b(null, f.f55751q, 1, null);
        this.f55740x = new C1761c0();
        this.f55741y = new C1761c0();
        this.f55742z = new C1761c0();
        this.f55732A = new C1761c0();
    }

    /* renamed from: U */
    private final void m57660U(String str) {
        this.f55740x.mo9221n(m57661W().m57596a(true));
        if (str.length() == 0) {
            str = C3293d.f14092a.m16712a(EnumC3292c.f14089p);
        }
        this.f55732A.mo9221n(str);
        this.f55740x.mo9221n(m57661W().m57596a(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final PassPhraseSetupContainerViewState m57661W() {
        PassPhraseSetupContainerViewState passPhraseSetupContainerViewState = (PassPhraseSetupContainerViewState) m57670b0().mo9215f();
        if (passPhraseSetupContainerViewState == null) {
            return new PassPhraseSetupContainerViewState(false, 1, (AbstractC19060k) null);
        }
        return passPhraseSetupContainerViewState;
    }

    /* renamed from: R */
    public final void m57662R() {
        this.f55740x.mo9221n(m57661W().m57596a(true));
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(null), 3, null);
    }

    /* renamed from: S */
    public final void m57663S() {
        this.f55740x.mo9221n(m57661W().m57596a(true));
        ChangeProtectCodeRecognitionSheetView.Companion.m77096a();
        CoroutineScope m9374a = AbstractC1798u0.m9374a(this);
        Object mo9215f = m57666X().mo9215f();
        AbstractC19074t.m100205c(mo9215f);
        new C25727d(m9374a, (String) mo9215f, 3, false, new d(), 8, null).m132773i0();
    }

    /* renamed from: T */
    public final void m57664T() {
        this.f55740x.mo9221n(m57661W().m57596a(true));
        String str = (String) m57666X().mo9215f();
        if (str != null) {
            this.f55736t.m132677R(str);
            C26263i.m135055u().m135085r0(16);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new e(null), 2, null);
        }
    }

    /* renamed from: V */
    public final LiveData m57665V() {
        return this.f55742z;
    }

    /* renamed from: X */
    public final LiveData m57666X() {
        return this.f55732A;
    }

    /* renamed from: Y */
    public final String m57667Y() {
        String str = (String) m57666X().mo9215f();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: Z */
    public final void m57668Z(Bundle bundle) {
        String str;
        String str2 = "";
        if (bundle != null && bundle.getBoolean("ARG_IS_INIT")) {
            if (bundle != null) {
                str = bundle.getString("ARG_PASSPHRASE", "");
            } else {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
        } else {
            this.f55741y.mo9221n(new C19964c(AbstractC11044a.a.f55727a));
        }
        m57660U(str2);
    }

    /* renamed from: a0 */
    public final LiveData m57669a0() {
        return this.f55741y;
    }

    /* renamed from: b0 */
    public final LiveData m57670b0() {
        return this.f55740x;
    }

    /* renamed from: c0 */
    public final void m57671c0(SaveBackupKeyBottomSheet.EnumC11042b enumC11042b) {
        AbstractC19074t.m100208f(enumC11042b, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        int i11 = b.f55743a[enumC11042b.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                this.f55741y.mo9221n(new C19964c(AbstractC11044a.c.f55729a));
                return;
            }
            return;
        }
        this.f55742z.mo9221n(new C19964c(new AbstractC11045b.a(EnumC25120i.f120644p)));
    }

    /* renamed from: e0 */
    public final boolean m57672e0() {
        return this.f55733B;
    }

    /* renamed from: f0 */
    public final boolean m57673f0() {
        return this.f55734C;
    }

    /* renamed from: g0 */
    public final void m57674g0(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        String str = (String) m57666X().mo9215f();
        if (str == null) {
            str = "";
        }
        bundle.putString("ARG_PASSPHRASE", str);
        bundle.putBoolean("ARG_IS_INIT", true);
    }

    /* renamed from: h0 */
    public final void m57675h0(boolean z11) {
        this.f55733B = z11;
    }

    /* renamed from: i0 */
    public final void m57676i0(boolean z11) {
        this.f55734C = z11;
    }

    /* renamed from: j0 */
    public final void m57677j0(boolean z11) {
        this.f55738v = z11;
    }
}
