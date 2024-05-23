package com.zing.zalo.p077ui.backuprestore.encryption.setup.pin;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import c50.C3290a;
import c50.EnumC3291b;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.pin.AbstractC11066a;
import com.zing.zalo.p077ui.zalocloud.bottomsheet.ChangeProtectCodeRecognitionSheetView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p205hc.C19964c;
import p479rc.C25724a;
import p479rc.C25727d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qg0.C25268c;
import si.C26263i;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.b */
/* loaded from: classes5.dex */
public final class C11067b extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private boolean f55786A;

    /* renamed from: s */
    private final C25724a f55787s;

    /* renamed from: t */
    private final C25268c f55788t;

    /* renamed from: u */
    private final AbstractC27323a f55789u;

    /* renamed from: v */
    private boolean f55790v;

    /* renamed from: w */
    private final C1761c0 f55791w;

    /* renamed from: x */
    private final C1761c0 f55792x;

    /* renamed from: y */
    private String f55793y;

    /* renamed from: z */
    private boolean f55794z;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.b$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55796t;

            /* renamed from: u */
            final /* synthetic */ C11067b f55797u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C11067b c11067b, Continuation continuation) {
                super(2, continuation);
                this.f55797u = c11067b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f55797u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f55796t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f55797u.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(this.f55797u.m57737U(), false, false, false, 6, null));
                    this.f55797u.f55792x.mo9221n(new C19964c(AbstractC11066a.g.f55785a));
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

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m57755a(Boolean bool) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(C11067b.this), Dispatchers.m112681c(), null, new a(C11067b.this, null), 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57755a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.b$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f55798q = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m57757a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139879d(true);
            c27326d.m139881f(true);
            c27326d.m139878c(true);
            c27326d.m139882g(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57757a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    public C11067b(C25724a c25724a, C25268c c25268c) {
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        AbstractC19074t.m100208f(c25268c, "cloudKeyManager");
        this.f55787s = c25724a;
        this.f55788t = c25268c;
        this.f55789u = AbstractC27336n.m139941b(null, c.f55798q, 1, null);
        this.f55791w = new C1761c0();
        this.f55792x = new C1761c0();
        this.f55793y = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final PinCodeSetupContainerViewState m57737U() {
        PinCodeSetupContainerViewState pinCodeSetupContainerViewState = (PinCodeSetupContainerViewState) m57744W().mo9215f();
        if (pinCodeSetupContainerViewState == null) {
            return new PinCodeSetupContainerViewState(false, false, false, 7, (AbstractC19060k) null);
        }
        return pinCodeSetupContainerViewState;
    }

    /* renamed from: P */
    public final void m57738P() {
        this.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(m57737U(), true, false, false, 6, null));
        ChangeProtectCodeRecognitionSheetView.Companion.m77096a();
        new C25727d(AbstractC1798u0.m9374a(this), this.f55793y, 2, false, new b(), 8, null).m132773i0();
    }

    /* renamed from: Q */
    public final void m57739Q(String str, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(str, "inputPin");
        AbstractC19074t.m100208f(interfaceC18494a, "onError");
        if (AbstractC19074t.m100204b(str, this.f55793y)) {
            m57749b0();
        } else {
            interfaceC18494a.mo12V4();
            this.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(m57737U(), false, true, false, 5, null));
        }
    }

    /* renamed from: R */
    public final void m57740R() {
        this.f55792x.mo9221n(new C19964c(AbstractC11066a.a.f55779a));
    }

    /* renamed from: S */
    public final void m57741S() {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        this.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(m57737U(), true, false, false, 6, null));
        this.f55787s.m132676Q(this.f55793y);
        C26263i.m135055u().m135085r0(16);
        this.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(m57737U(), false, false, false, 6, null));
        this.f55792x.mo9221n(new C19964c(AbstractC11066a.g.f55785a));
    }

    /* renamed from: T */
    public final void m57742T() {
        this.f55792x.mo9221n(new C19964c(AbstractC11066a.b.f55780a));
    }

    /* renamed from: V */
    public final LiveData m57743V() {
        return this.f55792x;
    }

    /* renamed from: W */
    public final LiveData m57744W() {
        return this.f55791w;
    }

    /* renamed from: X */
    public final void m57745X(Bundle bundle, boolean z11, boolean z12) {
        String string;
        boolean z13;
        String str = null;
        String str2 = "";
        if (bundle != null) {
            try {
                string = bundle.getString("ARG_STATE", "");
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLPinCodeSetupContainerViewModel", e11);
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            AbstractC27323a abstractC27323a = this.f55789u;
            abstractC27323a.mo131586a();
            this.f55791w.mo9224q((PinCodeSetupContainerViewState) abstractC27323a.m139867d(PinCodeSetupContainerViewState.Companion.serializer(), string));
        }
        if (bundle != null) {
            str = bundle.getString("ARG_PIN", "");
        }
        if (str != null) {
            str2 = str;
        }
        this.f55793y = str2;
        if (bundle != null) {
            z13 = bundle.getBoolean("ARG_IS_INIT");
        } else {
            z13 = false;
        }
        this.f55794z = z11;
        this.f55786A = z12;
        if (!z13) {
            this.f55792x.mo9221n(new C19964c(AbstractC11066a.c.f55781a));
        }
    }

    /* renamed from: Y */
    public final boolean m57746Y() {
        return this.f55794z;
    }

    /* renamed from: Z */
    public final boolean m57747Z() {
        return this.f55786A;
    }

    /* renamed from: a0 */
    public final void m57748a0() {
        this.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(m57737U(), false, false, false, 5, null));
        this.f55792x.mo9221n(new C19964c(AbstractC11066a.d.f55782a));
    }

    /* renamed from: b0 */
    public final void m57749b0() {
        this.f55792x.mo9221n(new C19964c(AbstractC11066a.e.f55783a));
    }

    /* renamed from: c0 */
    public final EnumC3291b m57750c0(String str, boolean z11) {
        EnumC3291b m16709b;
        AbstractC19074t.m100208f(str, "input");
        if (z11) {
            m16709b = C3290a.f14080a.m16708a(this.f55793y, str);
        } else {
            this.f55793y = str;
            m16709b = C3290a.f14080a.m16709b(str, 6);
        }
        if (m16709b == EnumC3291b.f14086u) {
            this.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(m57737U(), false, true, false, 5, null));
        }
        return m16709b;
    }

    /* renamed from: e0 */
    public final void m57751e0(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        bundle.putString("ARG_PIN", this.f55793y);
        AbstractC27323a abstractC27323a = this.f55789u;
        PinCodeSetupContainerViewState m57737U = m57737U();
        abstractC27323a.mo131586a();
        bundle.putString("ARG_STATE", abstractC27323a.mo131597b(PinCodeSetupContainerViewState.Companion.serializer(), m57737U));
        bundle.putBoolean("ARG_IS_INIT", true);
    }

    /* renamed from: f0 */
    public final void m57752f0() {
        this.f55792x.mo9221n(new C19964c(new AbstractC11066a.f(this.f55793y)));
    }

    /* renamed from: g0 */
    public final void m57753g0(boolean z11) {
        this.f55790v = z11;
    }

    /* renamed from: h0 */
    public final void m57754h0(boolean z11) {
        this.f55791w.mo9221n(PinCodeSetupContainerViewState.m57696b(m57737U(), false, false, z11, 3, null));
    }
}
