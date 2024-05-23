package tb0;

import ac.C0697c0;
import ac.C0732w;
import ah0.C0860a;
import am.AbstractC0924m0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AbstractC1364q;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7362x0;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.biometric.C7321d;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.zalocloud.graceperiod.ZCloudGPContainerView;
import com.zing.zalo.p077ui.zalocloud.lock.ZCloudLockedVerificationView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudPaymentSetupView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudPurchaseWelcomeView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.p077ui.zviews.t81;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.info.C16806a;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import dh0.C17932a;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gu.AbstractC19601a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23152n3;
import me0.C23055e5;
import nl.C23870a;
import org.json.JSONObject;
import p320ld.C22447s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.AbstractC23775p0;
import p363nh.C23750d;
import p542ub.InterfaceC27218a;
import pg0.C24747a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import si.C26263i;
import tg0.C26676b;
import vg.AbstractC28207v1;
import vm0.AbstractC28298d;
import wg0.C28989l;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import zg0.C31831a;

/* renamed from: tb0.l */
/* loaded from: classes6.dex */
public final class C26626l {
    public static final b Companion = new b(null);

    /* renamed from: j */
    private static final InterfaceC24854k f126038j;

    /* renamed from: a */
    private final C16805b f126039a;

    /* renamed from: b */
    private final C31831a f126040b;

    /* renamed from: c */
    private final C23870a f126041c;

    /* renamed from: d */
    private final C16806a f126042d;

    /* renamed from: e */
    private final C0860a f126043e;

    /* renamed from: f */
    private final C24747a f126044f;

    /* renamed from: g */
    private boolean f126045g;

    /* renamed from: h */
    private boolean f126046h;

    /* renamed from: i */
    private boolean f126047i;

    /* renamed from: tb0.l$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f126048q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C26626l mo12V4() {
            return c.f126049a.m136713a();
        }
    }

    /* renamed from: tb0.l$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C26626l m136712a() {
            return (C26626l) C26626l.f126038j.getValue();
        }
    }

    /* renamed from: tb0.l$c */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f126049a = new c();

        /* renamed from: b */
        private static final C26626l f126050b;

        static {
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            C31831a m120687l2 = AbstractC23306f.m120687l2();
            AbstractC19074t.m100207e(m120687l2, "provideZaloCloudSettings(...)");
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C16806a m120643a2 = AbstractC23306f.m120643a2();
            AbstractC19074t.m100207e(m120643a2, "provideZaloCloudInfoManager(...)");
            C0860a m120691m2 = AbstractC23306f.m120691m2();
            AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
            C24747a m120636Y1 = AbstractC23306f.m120636Y1();
            AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
            f126050b = new C26626l(m120633X1, m120687l2, m120679j2, m120643a2, m120691m2, m120636Y1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C26626l m136713a() {
            return f126050b;
        }
    }

    /* renamed from: tb0.l$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f126051t;

        /* renamed from: v */
        final /* synthetic */ boolean f126053v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18509p f126054w;

        /* renamed from: tb0.l$d$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f126055t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18509p f126056u;

            /* renamed from: v */
            final /* synthetic */ boolean f126057v;

            /* renamed from: w */
            final /* synthetic */ C26626l f126058w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18509p interfaceC18509p, boolean z11, C26626l c26626l, Continuation continuation) {
                super(2, continuation);
                this.f126056u = interfaceC18509p;
                this.f126057v = z11;
                this.f126058w = c26626l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f126056u, this.f126057v, this.f126058w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f126055t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f126056u.mo240pC(AbstractC29094b.m145339a(this.f126057v), AbstractC29094b.m145342d(this.f126058w.f126041c.m124839w0()));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f126053v = z11;
            this.f126054w = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f126053v, this.f126054w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f126051t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                boolean m136688w = C26626l.this.m136688w(this.f126053v);
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                a aVar = new a(this.f126054w, m136688w, C26626l.this, null);
                this.f126051t = 1;
                if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                    return m142578e;
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

    /* renamed from: tb0.l$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f126059q = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m136716a(int i11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m136716a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tb0.l$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f126060q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m136717a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m136717a() {
        }
    }

    /* renamed from: tb0.l$g */
    /* loaded from: classes6.dex */
    public static final class g extends BiometricWrapper.AbstractC7309a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f126061a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18494a f126062b;

        g(InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a) {
            this.f126061a = interfaceC18505l;
            this.f126062b = interfaceC18494a;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            super.mo37276a(i11, charSequence);
            C26676b.m136957g("SMLZCloudUIHandler", "Biometric verify error: onAuthenticationError errorCode: " + i11, null, 4, null);
            InterfaceC18505l interfaceC18505l = this.f126061a;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Integer.valueOf(i11));
                return;
            }
            if (i11 != 5 && i11 != 10) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo) + ".");
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            AbstractC19074t.m100208f(c7310b, "authenticationResult");
            super.mo37278c(c7310b);
            this.f126062b.mo12V4();
        }
    }

    /* renamed from: tb0.l$h */
    /* loaded from: classes6.dex */
    public static final class h extends BiometricWrapper.AbstractC7309a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f126063a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18494a f126064b;

        h(InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a) {
            this.f126063a = interfaceC18505l;
            this.f126064b = interfaceC18494a;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            super.mo37276a(i11, charSequence);
            C26676b.m136957g("SMLZCloudUIHandler", "Biometric verify error: showBiometricAuthWithoutDeviceCredential() onAuthenticationError errorCode: " + i11, null, 4, null);
            InterfaceC18505l interfaceC18505l = this.f126063a;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Integer.valueOf(i11));
                return;
            }
            if (i11 != 5 && i11 != 10) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo) + ".");
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            AbstractC19074t.m100208f(c7310b, "authenticationResult");
            super.mo37278c(c7310b);
            this.f126064b.mo12V4();
        }
    }

    /* renamed from: tb0.l$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f126065q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m136718a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m136718a() {
        }
    }

    /* renamed from: tb0.l$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f126066q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m136719a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m136719a() {
        }
    }

    /* renamed from: tb0.l$k */
    /* loaded from: classes6.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final k f126067q = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m136720a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            AbstractC23306f.m120667g2().m144756G(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m136720a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tb0.l$l */
    /* loaded from: classes6.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final l f126068q = new l();

        l() {
            super(2);
        }

        /* renamed from: a */
        public final void m136721a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_unknown));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m136721a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tb0.l$m */
    /* loaded from: classes6.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ boolean f126069q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z11) {
            super(1);
            this.f126069q = z11;
        }

        /* renamed from: a */
        public final void m136722a(C17487o0 c17487o0) {
            AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_IS_SUCCESS", this.f126069q);
            C24848g0 c24848g0 = C24848g0.f119245a;
            c17487o0.m93069k2(ZCloudGPContainerView.class, bundle, 1, true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m136722a((C17487o0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tb0.l$n */
    /* loaded from: classes6.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f126070q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z11) {
            super(0);
            this.f126070q = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m136723a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m136723a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_IS_SUCCESS", this.f126070q);
            Intent m119014P = AbstractC23152n3.m119014P(ZCloudGPContainerView.class, bundle, false);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            MainApplication.Companion.m35500c().startActivity(m119014P);
        }
    }

    /* renamed from: tb0.l$o */
    /* loaded from: classes6.dex */
    public static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f126071t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f126073v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18494a f126074w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC18494a f126075x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC18494a f126076y;

        /* renamed from: tb0.l$o$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ C26626l f126077q;

            /* renamed from: r */
            final /* synthetic */ InterfaceC18505l f126078r;

            /* renamed from: s */
            final /* synthetic */ InterfaceC18494a f126079s;

            /* renamed from: t */
            final /* synthetic */ InterfaceC18494a f126080t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18494a f126081u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C26626l c26626l, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18494a interfaceC18494a3) {
                super(2);
                this.f126077q = c26626l;
                this.f126078r = interfaceC18505l;
                this.f126079s = interfaceC18494a;
                this.f126080t = interfaceC18494a2;
                this.f126081u = interfaceC18494a3;
            }

            /* renamed from: a */
            public final void m136725a(boolean z11, long j11) {
                if (!this.f126077q.f126044f.m128520b()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_setup_error));
                    return;
                }
                if (z11) {
                    this.f126078r.mo205i9(Long.valueOf(j11));
                    return;
                }
                if (this.f126077q.f126044f.m128530o()) {
                    this.f126079s.mo12V4();
                    return;
                }
                if (this.f126077q.f126044f.m128529n()) {
                    this.f126080t.mo12V4();
                    return;
                }
                if (AbstractC3489d.m17513u()) {
                    this.f126081u.mo12V4();
                } else if (AbstractC3489d.m17505m()) {
                    this.f126077q.m136666c0();
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_setup_error));
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m136725a(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18494a interfaceC18494a3, Continuation continuation) {
            super(2, continuation);
            this.f126073v = interfaceC18505l;
            this.f126074w = interfaceC18494a;
            this.f126075x = interfaceC18494a2;
            this.f126076y = interfaceC18494a3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(this.f126073v, this.f126074w, this.f126075x, this.f126076y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f126071t == 0) {
                AbstractC24862s.m129228b(obj);
                C26626l c26626l = C26626l.this;
                c26626l.m136707r(true, new a(c26626l, this.f126073v, this.f126074w, this.f126075x, this.f126076y));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f126048q);
        f126038j = m129210a;
    }

    public C26626l(C16805b c16805b, C31831a c31831a, C23870a c23870a, C16806a c16806a, C0860a c0860a, C24747a c24747a) {
        AbstractC19074t.m100208f(c16805b, "cloudConfigs");
        AbstractC19074t.m100208f(c31831a, "cloudSettings");
        AbstractC19074t.m100208f(c23870a, "cloudRepo");
        AbstractC19074t.m100208f(c16806a, "cloudInfoManager");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        AbstractC19074t.m100208f(c24747a, "criticalCaseManager");
        this.f126039a = c16805b;
        this.f126040b = c31831a;
        this.f126041c = c23870a;
        this.f126042d = c16806a;
        this.f126043e = c0860a;
        this.f126044f = c24747a;
    }

    /* renamed from: A */
    public static final void m136648A(InterfaceC27218a interfaceC27218a, Bundle bundle) {
        AbstractC19074t.m100208f(interfaceC27218a, "$activity");
        AbstractC19074t.m100208f(bundle, "$extras");
        C17487o0 mo35579p = interfaceC27218a.mo35579p();
        if (mo35579p.m93012K0() == null) {
            mo35579p.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
        } else {
            if (mo35579p.m92993D0(ZCloudSetupContainerView.class) != null) {
                return;
            }
            mo35579p.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
        }
    }

    /* renamed from: G */
    public static /* synthetic */ void m136649G(C26626l c26626l, InterfaceC27218a interfaceC27218a, Context context, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC18505l = e.f126059q;
        }
        InterfaceC18505l interfaceC18505l3 = interfaceC18505l;
        if ((i11 & 8) != 0) {
            interfaceC18494a = f.f126060q;
        }
        InterfaceC18494a interfaceC18494a2 = interfaceC18494a;
        if ((i11 & 16) != 0) {
            interfaceC18505l2 = null;
        }
        c26626l.m136694F(interfaceC27218a, context, interfaceC18505l3, interfaceC18494a2, interfaceC18505l2);
    }

    /* renamed from: H */
    private final void m136650H(InterfaceC27218a interfaceC27218a, Context context, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l2) {
        try {
            int m37307b = C7321d.m37305c(context).m37307b(33023);
            if (m37307b != 11 && m37307b != 12) {
                if (m37307b == 0) {
                    BiometricWrapper biometricWrapper = new BiometricWrapper(context, AbstractC1388a.m6967i(context), new h(interfaceC18505l2, interfaceC18494a));
                    if (interfaceC27218a instanceof ZaloActivity) {
                        biometricWrapper.m37275d(((ZaloActivity) interfaceC27218a).getLifecycle());
                    }
                    BiometricWrapper.C7312d m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37296f(AbstractC23136l9.m118743r0(AbstractC7362x0.fingerprint_close)).m37293c(false).m37298h(true).m37291a();
                    AbstractC19074t.m100207e(m37291a, "build(...)");
                    biometricWrapper.m37273a(m37291a, null, false);
                    return;
                }
                C26676b.m136957g("SMLZCloudUIHandler", "Biometric verify error: showBiometricAuthWithoutDeviceCredential(): constantAuthentication=" + m37307b, null, 4, null);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo) + "..");
                return;
            }
            interfaceC18505l.mo205i9(Integer.valueOf(m37307b));
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
            C26676b.m136955e("SMLZCloudUIHandler", "Biometric verify error - showBiometricAuthWithoutDeviceCredential(): " + e11.getMessage(), C26676b.b.f126335t);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo) + "...");
        }
    }

    /* renamed from: J */
    public static /* synthetic */ void m136651J(C26626l c26626l, Context context, C17487o0 c17487o0, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC18494a = i.f126065q;
        }
        if ((i11 & 8) != 0) {
            interfaceC18494a2 = j.f126066q;
        }
        c26626l.m136695I(context, c17487o0, interfaceC18494a, interfaceC18494a2);
    }

    /* renamed from: K */
    public static final void m136652K(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onPositiveButtonClick");
        interfaceC18494a.mo12V4();
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: L */
    public static final void m136653L(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onNegativeButtonClick");
        interfaceC18494a.mo12V4();
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: N */
    public static final void m136654N(String str, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(str, "$source");
        C26676b.f126324a.m137003q(str);
        AbstractC23306f.m120692n().m133045d(18, k.f126067q, l.f126068q);
    }

    /* renamed from: O */
    public static final void m136655O(InterfaceC17463d interfaceC17463d, int i11) {
        C26676b.f126324a.m137000n();
    }

    /* renamed from: P */
    public static final void m136656P(InterfaceC17463d interfaceC17463d) {
        C0697c0.Companion.m1048b().m1035h("ZCloudMigrationDeleteCorruptedBackupPopup");
    }

    /* renamed from: S */
    public static final void m136657S(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$onPositiveButtonClicked");
        interfaceC17463d.dismiss();
        interfaceC18494a.mo12V4();
    }

    /* renamed from: T */
    public static final void m136658T(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: W */
    public static /* synthetic */ void m136659W(C26626l c26626l, C17487o0 c17487o0, InterfaceC27218a interfaceC27218a, long j11, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        boolean z14;
        boolean z15;
        boolean z16;
        if ((i11 & 8) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i11 & 16) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        if ((i11 & 32) != 0) {
            z16 = false;
        } else {
            z16 = z13;
        }
        c26626l.m136700V(c17487o0, interfaceC27218a, j11, z14, z15, z16);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m136660Y(C26626l c26626l, InterfaceC27218a interfaceC27218a, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        c26626l.m136701X(interfaceC27218a, i11);
    }

    /* renamed from: Z */
    private final void m136661Z() {
        C26676b.m136957g("SMLZCloudUIHandler", "showOnboardingSetupScreen()", null, 4, null);
        AbstractC19444a.m101697e(new Runnable() { // from class: tb0.f
            public /* synthetic */ RunnableC26620f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26626l.m136663a0(C26626l.this);
            }
        });
    }

    /* renamed from: a0 */
    public static final void m136663a0(C26626l c26626l) {
        AbstractC19074t.m100208f(c26626l, "this$0");
        if (!AbstractC0924m0.m4079od()) {
            c26626l.m136668d0();
        } else {
            m136689z(c26626l, false, false, 3, null);
        }
    }

    /* renamed from: c0 */
    public final void m136666c0() {
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        if (m57112d == null) {
            return;
        }
        if (this.f126043e.m2462m()) {
            m57112d.mo35579p().m93069k2(ZCloudPaymentSetupView.class, null, 1, true);
        } else {
            m136678j0(this, m57112d, 0, 2, null);
        }
    }

    /* renamed from: d0 */
    private final void m136668d0() {
        C26676b.m136958h("showPurchaseWelcomeScreen()", null, 2, null);
        try {
            InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
            if (m57112d != null) {
                m57112d.runOnUiThread(new Runnable() { // from class: tb0.i
                    public /* synthetic */ RunnableC26623i() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C26626l.m136670e0(InterfaceC27218a.this);
                    }
                });
                return;
            }
            throw new Exception("Can not find activity");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
            Intent m119012O = AbstractC23152n3.m119012O(ZCloudPurchaseWelcomeView.class, null);
            AbstractC19074t.m100207e(m119012O, "makeIntentShowZaloView(...)");
            MainApplication.Companion.m35500c().startActivity(m119012O);
        }
    }

    /* renamed from: e0 */
    public static final void m136670e0(InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(interfaceC27218a, "$activity");
        C17487o0 mo35579p = interfaceC27218a.mo35579p();
        if (mo35579p.m93012K0() == null || mo35579p.m92993D0(ZCloudPurchaseWelcomeView.class) == null) {
            mo35579p.m93069k2(ZCloudPurchaseWelcomeView.class, null, 1, true);
        }
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m136673g0(C26626l c26626l, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c26626l.m136703f0(z11);
    }

    /* renamed from: h0 */
    private final void m136675h0() {
        C26676b.m136958h("showRemindSetupNotification()", null, 2, null);
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_notif_transition_sent", null, null, null, 14, null);
        MainApplication.C6895a c6895a = MainApplication.Companion;
        C23750d c23750d = new C23750d(c6895a.m35500c());
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_ENTRY_POINT", 1);
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        Intent m119020S = AbstractC23152n3.m119020S(ZCloudPurchaseWelcomeView.class, bundle, true);
        AbstractC19074t.m100207e(m119020S, "makeIntentShowZaloViewShowMain(...)");
        c23750d.m6893u(PendingIntent.getActivity(c6895a.m35500c(), 0, m119020S, AbstractC19601a.Companion.m102574b(134217728)));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_complete_to_preserve_your_zalo_data);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_set_up_use_zcloud, C16805b.Companion.m89811a().m89800f());
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        c23750d.m6869V(new AbstractC1364q.d().m6828h(m118743r0));
        c23750d.mo6894v(m118743r0);
        c23750d.mo6895w(m118746s0);
        c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
        c23750d.m124165v0("zcloud_grateful_user_purchase_service");
        c23750d.m124147b0();
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m136678j0(C26626l c26626l, InterfaceC27218a interfaceC27218a, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        c26626l.m136704i0(interfaceC27218a, i11);
    }

    /* renamed from: s */
    private final void m136685s(InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a) {
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        if (m57112d == null) {
            C26676b.m136957g("SMLSyncFlowUtils", "Activity null", null, 4, null);
            this.f126044f.m128512D(true);
            interfaceC18494a.mo12V4();
            return;
        }
        m57112d.runOnUiThread(new Runnable() { // from class: tb0.c

            /* renamed from: q */
            public final /* synthetic */ InterfaceC27218a f126031q;

            public /* synthetic */ RunnableC26617c(InterfaceC27218a m57112d2) {
                r2 = m57112d2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26626l.m136686t(InterfaceC18505l.this, r2);
            }
        });
    }

    /* renamed from: t */
    public static final void m136686t(InterfaceC18505l interfaceC18505l, InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(interfaceC18505l, "$onUseZaloViewManager");
        C17487o0 mo35579p = interfaceC27218a.mo35579p();
        AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
        interfaceC18505l.mo205i9(mo35579p);
    }

    /* renamed from: v */
    public static final C26626l m136687v() {
        return Companion.m136712a();
    }

    /* renamed from: w */
    public final boolean m136688w(boolean z11) {
        if (AbstractC3489d.m17505m() || AbstractC3489d.m17512t()) {
            return false;
        }
        if ((!z11 || !this.f126041c.m124790R0()) && (!this.f126041c.m124790R0() || this.f126041c.m124788Q0())) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static /* synthetic */ void m136689z(C26626l c26626l, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        c26626l.m136710y(z11, z12);
    }

    /* renamed from: B */
    public final boolean m136690B() {
        return this.f126045g;
    }

    /* renamed from: C */
    public final boolean m136691C() {
        return this.f126047i;
    }

    /* renamed from: D */
    public final void m136692D(boolean z11) {
        this.f126045g = z11;
    }

    /* renamed from: E */
    public final void m136693E(boolean z11) {
        this.f126047i = z11;
    }

    /* renamed from: F */
    public final void m136694F(InterfaceC27218a interfaceC27218a, Context context, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l2) {
        AbstractC19074t.m100208f(interfaceC27218a, "currentAct");
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18505l, "onUnableToAuthentication");
        AbstractC19074t.m100208f(interfaceC18494a, "onAuthSuccess");
        try {
            int m37307b = C7321d.m37305c(context).m37307b(33023);
            if (m37307b != 11 && m37307b != 12) {
                if (m37307b == 0) {
                    BiometricWrapper biometricWrapper = new BiometricWrapper(context, AbstractC1388a.m6967i(context), new g(interfaceC18505l2, interfaceC18494a));
                    if (interfaceC27218a instanceof ZaloActivity) {
                        biometricWrapper.m37275d(((ZaloActivity) interfaceC27218a).getLifecycle());
                    }
                    BiometricWrapper.C7312d m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37295e(true).m37292b(33023).m37293c(false).m37298h(true).m37291a();
                    AbstractC19074t.m100207e(m37291a, "build(...)");
                    biometricWrapper.m37273a(m37291a, null, false);
                    return;
                }
                C26676b.m136957g("SMLZCloudUIHandler", "Biometric verify error: showBiometricAuth(): constantAuthentication=" + m37307b, null, 4, null);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo) + "..");
                return;
            }
            interfaceC18505l.mo205i9(Integer.valueOf(m37307b));
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
            C26676b.m136955e("SMLZCloudUIHandler", "Biometric verify error: " + e11.getMessage(), C26676b.b.f126335t);
            m136650H(interfaceC27218a, context, interfaceC18505l, interfaceC18494a, interfaceC18505l2);
        }
    }

    /* renamed from: I */
    public final void m136695I(Context context, C17487o0 c17487o0, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "onPositiveButtonClick");
        AbstractC19074t.m100208f(interfaceC18494a2, "onNegativeButtonClick");
        if (c17487o0 != null) {
            String string = context.getString(AbstractC8020f0.str_title_do_not_restore_conversation_data);
            AbstractC19074t.m100207e(string, "getString(...)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getString(AbstractC8020f0.str_title_no_see_old_data));
            for (int i11 = 0; i11 < 2; i11++) {
                sb2.append("\n");
            }
            sb2.append(context.getString(AbstractC8020f0.str_title_addition_info_no_see_old_data));
            String string2 = context.getString(AbstractC8020f0.str_btn_back);
            AbstractC19074t.m100207e(string2, "getString(...)");
            String string3 = context.getString(AbstractC8020f0.str_restore_skip_popup_skip_btn);
            AbstractC19074t.m100207e(string3, "getString(...)");
            new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("RestoreBackupConfirmSkip").m90918B(string).m90949z(sb2).m90947x("restore_bk_confirm_skip_yes").m90943t(string3, new InterfaceC17463d.d() { // from class: tb0.g
                public /* synthetic */ C26621g() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    C26626l.m136652K(InterfaceC18494a.this, interfaceC17463d, i12);
                }
            }).m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger).m90937n("restore_bk_confirm_skip_no").m90934k(string2, new InterfaceC17463d.d() { // from class: tb0.h
                public /* synthetic */ C26622h() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    C26626l.m136653L(InterfaceC18494a.this, interfaceC17463d, i12);
                }
            }).m90927d().mo13822K();
        }
    }

    /* renamed from: M */
    public final void m136696M(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "source");
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null);
        C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_delete_backup_dialog_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        C16972e0.a m90918B = m90932i.m90918B(m118743r0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_delete_backup_dialog_desc);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        C16972e0.a m90928e = m90918B.m90949z(m118743r02).m90920D(inflate).m90921E(true).m90928e(true);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.delete);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        C16972e0 m90927d = m90928e.m90943t(m118743r03, new InterfaceC17463d.d() { // from class: tb0.j

            /* renamed from: p */
            public final /* synthetic */ String f126037p;

            public /* synthetic */ C26624j(String str2) {
                r1 = str2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C26626l.m136654N(r1, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: tb0.k
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C26626l.m136655O(interfaceC17463d, i11);
            }
        }).m90927d();
        m90927d.m92855F(new InterfaceC17463d.e() { // from class: tb0.b
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                C26626l.m136656P(interfaceC17463d);
            }
        });
        m90927d.mo13822K();
        C0697c0.Companion.m1048b().m1044v("ZCloudMigrationDeleteCorruptedBackupPopup", true);
    }

    /* renamed from: Q */
    public final void m136697Q(InterfaceC27218a interfaceC27218a, int i11, AbstractC28207v1.j0 j0Var) {
        AbstractC19074t.m100208f(interfaceC27218a, "currentAct");
        AbstractC19074t.m100208f(j0Var, "actionDelegate");
        try {
            AbstractC28207v1.m141875H0(new JSONObject("{\n                      \"data\": {\n                            \"ZInstantAPIInfo\": {\n                                \"httpType\": 1,\n                                   \"zinstantdata_id\": \"templateId=12706&product=thienlv\",\n                                   \"url\": \"https://universal-zinstant.api.zaloapp.com/api/build/common\"\n                                },\n                                \"typeView\": 3,\n                                \"view_key\": \"sm_subscription\",\n                                \"disableBack\": false,\n                                \"handle_on_back_pressed\": true,\n                                \"disableSlideToBack\": true,\n                                \"occupyStatusBar\": true\n                            }\n                      }"), interfaceC27218a, null, null, j0Var, i11, new t81());
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
        }
    }

    /* renamed from: R */
    public final void m136698R(Context context, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "onPositiveButtonClicked");
        C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_dismiss_setup_dialog_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        C16972e0.a m90918B = m90932i.m90918B(m118743r0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_dismiss_setup_dialog_description);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        m90918B.m90949z(m118743r02).m90921E(true).m90942s(AbstractC8020f0.str_leave, new InterfaceC17463d.d() { // from class: tb0.d
            public /* synthetic */ C26618d() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C26626l.m136657S(InterfaceC18494a.this, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_stay, new InterfaceC17463d.d() { // from class: tb0.e
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C26626l.m136658T(interfaceC17463d, i11);
            }
        }).m90927d().mo13822K();
    }

    /* renamed from: U */
    public final void m136699U(C17487o0 c17487o0, InterfaceC27218a interfaceC27218a, long j11, boolean z11) {
        m136659W(this, c17487o0, interfaceC27218a, j11, z11, false, false, 48, null);
    }

    /* renamed from: V */
    public final void m136700V(C17487o0 c17487o0, InterfaceC27218a interfaceC27218a, long j11, boolean z11, boolean z12, boolean z13) {
        ZCloudLockedVerificationView.EnumC13927b enumC13927b;
        ZCloudLockedVerificationView.C13926a c13926a = ZCloudLockedVerificationView.Companion;
        if (z11) {
            enumC13927b = ZCloudLockedVerificationView.EnumC13927b.f71842r;
        } else if (z12) {
            enumC13927b = ZCloudLockedVerificationView.EnumC13927b.f71841q;
        } else if (z13) {
            enumC13927b = ZCloudLockedVerificationView.EnumC13927b.f71843s;
        } else {
            enumC13927b = ZCloudLockedVerificationView.EnumC13927b.f71840p;
        }
        Bundle m77598b = c13926a.m77598b(j11, enumC13927b);
        if (z11) {
            if (interfaceC27218a != null) {
                interfaceC27218a.mo35573l4(ZCloudLockedVerificationView.class, m77598b, 1, true);
            }
        } else if (c17487o0 != null) {
            c17487o0.m93069k2(ZCloudLockedVerificationView.class, m77598b, 1, true);
        }
    }

    /* renamed from: X */
    public final void m136701X(InterfaceC27218a interfaceC27218a, int i11) {
        AbstractC19074t.m100208f(interfaceC27218a, "currentAct");
        try {
            this.f126042d.m89835c();
            AbstractC28207v1.m141875H0(new JSONObject("{\n                  \"data\": {\n                    \"ZInstantAPIInfo\": {\n                      \"httpType\": 1,\n                      \"url\": \"https://universal-zinstant.api.zaloapp.com/api/build/common\",\n                      \"zinstantdata_id\": \"templateId=13085&product=sm_management\"\n                    },\n                    \"title\": \"Quản lý gói\",\n                    \"title_en\": \"Manage subscription\",\n                    \"typeView\": 0\n                  }\n                }"), interfaceC27218a, null, null, null, i11, new t81());
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
        }
    }

    /* renamed from: b0 */
    public final void m136702b0(int i11) {
        String str = "showOnboardingSetupUI(): targetPlan=" + i11 + ", bTrackAppStopped=" + AbstractC23304d.f113330T0;
        C26676b.b bVar = C26676b.b.f126331p;
        C26676b.m136955e("SMLZCloudUIHandler", str, bVar);
        if (this.f126044f.m128536u()) {
            C26676b.m136955e("SMLZCloudUIHandler", "Skip handle showOnboardingSetupUI(): User dismiss setup screen before", bVar);
            m136708u();
        } else if (C28989l.Companion.m144770b(AbstractC23138m0.Companion.m118775b()).m144766u()) {
            C26676b.m136955e("SMLZCloudUIHandler", "Skip handle showOnboardingSetupUI(): Data is migrating", bVar);
            m136708u();
        } else if (AbstractC23304d.f113330T0) {
            this.f126046h = true;
            m136675h0();
        } else {
            m136661Z();
        }
    }

    /* renamed from: f0 */
    public final void m136703f0(boolean z11) {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        if (!ZaloCloudRecoverCloudMediaWorker.Companion.m90202l()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_battery));
        } else {
            m136685s(new m(z11), new n(z11));
        }
    }

    /* renamed from: i0 */
    public final void m136704i0(InterfaceC27218a interfaceC27218a, int i11) {
        AbstractC19074t.m100208f(interfaceC27218a, "currentAct");
        try {
            AbstractC28207v1.m141875H0(new JSONObject("{\n                      \"data\": {\n                            \"ZInstantAPIInfo\": {\n                                \"httpType\": 1,\n                                   \"zinstantdata_id\": \"templateId=12706&product=thienlv\",\n                                   \"url\": \"https://universal-zinstant.api.zaloapp.com/api/build/common\"\n                                },\n                                \"typeView\": 3,\n                                \"view_key\": \"sm_subscription\",\n                                \"disableBack\": false,\n                                \"handle_on_back_pressed\": true,\n                                \"disableSlideToBack\": true,\n                                \"occupyStatusBar\": true\n                            }\n                      }"), interfaceC27218a, null, null, null, i11, new t81());
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
        }
    }

    /* renamed from: k0 */
    public final void m136705k0(InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2, InterfaceC18494a interfaceC18494a3) {
        AbstractC19074t.m100208f(interfaceC18505l, "onShowLockView");
        AbstractC19074t.m100208f(interfaceC18494a, "onShowConnectZCloud");
        AbstractC19074t.m100208f(interfaceC18494a2, "onShowSetupZCloud");
        AbstractC19074t.m100208f(interfaceC18494a3, "onShowZCloudHome");
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new o(interfaceC18505l, interfaceC18494a, interfaceC18494a2, interfaceC18494a3, null), 3, null);
    }

    /* renamed from: q */
    public final void m136706q() {
        C26676b.m136958h("checkShowSetupScreenOnStartup()", null, 2, null);
        AbstractC23775p0.m124197b("zcloud_grateful_user_purchase_service");
        if (!this.f126046h) {
            return;
        }
        this.f126046h = false;
        try {
            m136661Z();
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
        }
    }

    /* renamed from: r */
    public final void m136707r(boolean z11, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "onResult");
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), C17932a.f90528a.m94572a(), null, new d(z11, interfaceC18509p, null), 2, null);
    }

    /* renamed from: u */
    public final void m136708u() {
        C26676b.m136957g("SMLZCloudUIHandler", "clearRemindSetupNotification()", null, 4, null);
        this.f126046h = false;
        AbstractC23775p0.m124197b("zcloud_grateful_user_purchase_service");
    }

    /* renamed from: x */
    public final void m136709x(boolean z11) {
        m136689z(this, z11, false, 2, null);
    }

    /* renamed from: y */
    public final void m136710y(boolean z11, boolean z12) {
        C26676b.m136957g("SMLZCloudUIHandler", "navigateToUISetupFlow(): isRestartFlow=" + z11 + ", isRemoveBelow=" + z12, null, 4, null);
        boolean m116047m0 = C22447s.m116047m0(C26263i.m135058w(), false, 2, null);
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_STILL_NOT_RESTORE_OLD_BACKUP", m116047m0);
        bundle.putBoolean("ARG_IS_RESTART_FLOW", z11);
        bundle.putBoolean("ARG_IS_FROM_RESET_CLOUD_FLOW", false);
        if (z12) {
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        }
        m136708u();
        try {
            InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
            if (m57112d != null) {
                m57112d.runOnUiThread(new Runnable() { // from class: tb0.a

                    /* renamed from: q */
                    public final /* synthetic */ Bundle f126029q;

                    public /* synthetic */ RunnableC26615a(Bundle bundle2) {
                        r2 = bundle2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C26626l.m136648A(InterfaceC27218a.this, r2);
                    }
                });
                return;
            }
            throw new Exception("Can not find activity");
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudUIHandler", e11);
            bundle2.putBoolean("ARG_IS_CLEAR_ALL_BACKSTACK", true);
            Intent m119014P = AbstractC23152n3.m119014P(ZCloudSetupContainerView.class, bundle2, false);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            MainApplication.Companion.m35500c().startActivity(m119014P);
        }
    }
}
