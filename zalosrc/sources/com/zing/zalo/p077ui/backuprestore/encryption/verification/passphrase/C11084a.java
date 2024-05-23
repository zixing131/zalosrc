package com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase;

import ac.C0732w;
import ah0.C0860a;
import ch0.AbstractC3489d;
import com.zing.zalo.data.zalocloud.model.api.CloudKeyResponse;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.C11085b;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.backupkey.SecureOption;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kg0.C21719b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.C23055e5;
import mg0.C23290b;
import mg0.C23293e;
import nl.C23870a;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19966e;
import p205hc.InterfaceC19968g;
import p236ic.AbstractC20504a;
import p269jj.C21275a;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p387oc.C24199c;
import p421pc.C24720a;
import p443qc.EnumC25220d;
import p479rc.C25724a;
import p484ri.C25806c;
import pg0.C24747a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qg0.C25268c;
import sc.C26220b;
import sg0.C26245a;
import si.C26263i;
import t40.InterfaceC26478a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.a */
/* loaded from: classes5.dex */
public final class C11084a extends AbstractC19962a implements InterfaceC19966e {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C23870a f55833A;

    /* renamed from: B */
    private final C24747a f55834B;

    /* renamed from: C */
    private final C24199c f55835C;

    /* renamed from: D */
    private final C25806c f55836D;

    /* renamed from: E */
    private C11085b.b f55837E;

    /* renamed from: F */
    private CloudKeyResponse f55838F;

    /* renamed from: G */
    private boolean f55839G;

    /* renamed from: t */
    private final C21275a f55840t;

    /* renamed from: u */
    private final C23290b f55841u;

    /* renamed from: v */
    private final C24720a f55842v;

    /* renamed from: w */
    private final C25724a f55843w;

    /* renamed from: x */
    private final C0860a f55844x;

    /* renamed from: y */
    private final C21719b f55845y;

    /* renamed from: z */
    private final C25268c f55846z;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.a$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55847a;

        static {
            int[] iArr = new int[C11085b.b.values().length];
            try {
                iArr[C11085b.b.f55862r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C11085b.b.f55860p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C11085b.b.f55861q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C11085b.b.f55863s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C11085b.b.f55864t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C11085b.b.f55865u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C11085b.b.f55866v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f55847a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55848t;

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
            int i11 = this.f55848t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23290b c23290b = C11084a.this.f55841u;
                this.f55848t = 1;
                obj = c23290b.m120397d(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C23293e.b bVar = (C23293e.b) obj;
            C0732w.b bVar2 = C0732w.Companion;
            C0732w.m1177r(bVar2.m1189a(), "zcloud_restore_64key_ggdrive", null, null, null, 14, null);
            if (bVar instanceof C23293e.b.C32898b) {
                SecureOption m120418a = ((C23293e.b.C32898b) bVar).m120418a();
                if (m120418a.m89741b() == 3) {
                    C0732w.m1177r(bVar2.m1189a(), "zcloud_restore_64key_ggdrive_found", null, null, null, 14, null);
                    ((InterfaceC26478a) C11084a.this.m103742Dp()).mo57809TC(m120418a.m89740a());
                } else if (m120418a.m89741b() == 2) {
                    C0732w.m1177r(bVar2.m1189a(), "zcloud_restore_64key_ggdrive_found", null, null, null, 14, null);
                    ((InterfaceC26478a) C11084a.this.m103742Dp()).mo57809TC(m120418a.m89740a());
                }
            } else if (bVar instanceof C23293e.b.a) {
                C0732w.m1177r(bVar2.m1189a(), "zcloud_restore_64key_ggdrive_notfound", null, null, null, 14, null);
                ((InterfaceC26478a) C11084a.this.m103742Dp()).mo57817oA();
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55850t;

        /* renamed from: v */
        final /* synthetic */ String f55852v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation continuation) {
            super(2, continuation);
            this.f55852v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f55852v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55850t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C11084a c11084a = C11084a.this;
                String str = this.f55852v;
                this.f55850t = 1;
                obj = c11084a.m57850mq(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((InterfaceC26478a) C11084a.this.m103742Dp()).mo49315c4();
            if (booleanValue) {
                C11084a.this.m57846iq(this.f55852v);
            } else {
                C11084a.this.m57845hq();
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.passphrase.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55853t;

        /* renamed from: u */
        final /* synthetic */ String f55854u;

        /* renamed from: v */
        final /* synthetic */ C11084a f55855v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, C11084a c11084a, Continuation continuation) {
            super(2, continuation);
            this.f55854u = str;
            this.f55855v = c11084a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f55854u, this.f55855v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55853t;
            boolean z11 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26220b.m134826i("SMLPassphraseVerification", "verifyPassphraseAndFetchCloudKey(): " + C26245a.f124654a.m134956q(this.f55854u), null, 4, null);
                C25268c c25268c = this.f55855v.f55846z;
                String str = this.f55854u;
                this.f55853t = 1;
                obj = c25268c.m130760h(str, 3, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            CloudKeyResponse cloudKeyResponse = (CloudKeyResponse) obj;
            this.f55855v.f55838F = cloudKeyResponse;
            if (cloudKeyResponse == null || cloudKeyResponse.m41287j()) {
                z11 = false;
            }
            return AbstractC29094b.m145339a(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11084a(InterfaceC26478a interfaceC26478a, C21275a c21275a, C23290b c23290b, C24720a c24720a, C25724a c25724a, C0860a c0860a, C21719b c21719b, C25268c c25268c, C23870a c23870a, C24747a c24747a, C24199c c24199c, C25806c c25806c) {
        super(interfaceC26478a);
        AbstractC19074t.m100208f(interfaceC26478a, "mvpView");
        AbstractC19074t.m100208f(c21275a, "commonRepo");
        AbstractC19074t.m100208f(c23290b, "backupKeyManager");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        AbstractC19074t.m100208f(c21719b, "cloudManager");
        AbstractC19074t.m100208f(c25268c, "cloudKeyManager");
        AbstractC19074t.m100208f(c23870a, "cloudRepo");
        AbstractC19074t.m100208f(c24747a, "criticalCaseManager");
        AbstractC19074t.m100208f(c24199c, "backupRestoreManager");
        AbstractC19074t.m100208f(c25806c, "backupRestoreRepo");
        this.f55840t = c21275a;
        this.f55841u = c23290b;
        this.f55842v = c24720a;
        this.f55843w = c25724a;
        this.f55844x = c0860a;
        this.f55845y = c21719b;
        this.f55846z = c25268c;
        this.f55833A = c23870a;
        this.f55834B = c24747a;
        this.f55835C = c24199c;
        this.f55836D = c25806c;
    }

    /* renamed from: Pp */
    private final boolean m57836Pp() {
        if (AbstractC3489d.m17509q() && !m57844cq() && !AbstractC3489d.m17512t()) {
            return true;
        }
        return false;
    }

    /* renamed from: Sp */
    private final void m57837Sp() {
        this.f55845y.m112075g();
    }

    /* renamed from: Wp */
    private final void m57838Wp() {
        ((InterfaceC26478a) m103742Dp()).mo57811Z0();
    }

    /* renamed from: Xp */
    private final void m57839Xp() {
        C26220b.m134826i("SMLPassphraseVerification", "handleCloudRestore()", null, 4, null);
        this.f55836D.m133040U(EnumC25220d.f120982s);
        this.f55842v.m128408Z(false);
        m57849lq();
        m57837Sp();
        ((InterfaceC26478a) m103742Dp()).mo57814g();
    }

    /* renamed from: Yp */
    private final void m57840Yp() {
        C26220b.m134826i("SMLPassphraseVerification", "handleEmptyBackupInfo()", null, 4, null);
        ((InterfaceC26478a) m103742Dp()).mo57814g();
    }

    /* renamed from: Zp */
    private final void m57841Zp() {
        C26220b.m134826i("SMLPassphraseVerification", "handleNormalRestore()", null, 4, null);
        ((InterfaceC26478a) m103742Dp()).mo57807D1();
    }

    /* renamed from: aq */
    private final void m57842aq() {
        C26220b.m134826i("SMLPassphraseVerification", "handleOnlyConnectCloud()", null, 4, null);
        this.f55836D.m133040U(EnumC25220d.f120982s);
        this.f55842v.m128408Z(false);
        C22447s.f109797a.m116071J0();
        m57837Sp();
        ((InterfaceC26478a) m103742Dp()).mo57814g();
    }

    /* renamed from: bq */
    private final void m57843bq() {
        C26220b.m134826i("SMLPassphraseVerification", "handleVerifyOnboardingSetup()", null, 4, null);
        ((InterfaceC26478a) m103742Dp()).mo57813bl(true, true);
    }

    /* renamed from: cq */
    private final boolean m57844cq() {
        if (this.f55837E == C11085b.b.f55863s) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hq */
    public final void m57845hq() {
        C24848g0 c24848g0 = null;
        C26220b.m134826i("SMLPassphraseVerification", "onPassphraseNotMatch(): fromFlow=" + this.f55837E + ", fetchKeyResponse=" + this.f55838F, null, 4, null);
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_64key_wrong", null, null, null, 14, null);
        CloudKeyResponse cloudKeyResponse = this.f55838F;
        if (cloudKeyResponse != null) {
            if (cloudKeyResponse.m41289l()) {
                m57848kq(cloudKeyResponse);
            } else if (cloudKeyResponse.m41288k()) {
                ToastUtils.m89262j();
            } else {
                ((InterfaceC26478a) m103742Dp()).mo57820y2(cloudKeyResponse.m41281d());
            }
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            ((InterfaceC26478a) m103742Dp()).mo57812Ze();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iq */
    public final void m57846iq(String str) {
        String str2;
        C11085b.b bVar = this.f55837E;
        if (bVar != null) {
            str2 = bVar.name();
        } else {
            str2 = null;
        }
        C26220b.m134826i("SMLPassphraseVerification", "onPassphraseVerified(): fromFlow=" + str2, null, 4, null);
        C0732w.b bVar2 = C0732w.Companion;
        C0732w.m1177r(bVar2.m1189a(), "zcloud_restore_64key_correct", null, null, null, 14, null);
        C11085b.b bVar3 = this.f55837E;
        if (bVar3 != null) {
            switch (b.f55847a[bVar3.ordinal()]) {
                case 1:
                    m57841Zp();
                    return;
                case 2:
                case 3:
                    C26220b.m134826i("SMLPassphraseVerification", "completeOnboardingSetup(): onPassphraseVerified", null, 4, null);
                    AbstractC23306f.m120636Y1().m128523g();
                    if (this.f55839G && this.f55843w.m132682Y()) {
                        m57839Xp();
                        return;
                    } else {
                        m57842aq();
                        return;
                    }
                case 4:
                    m57843bq();
                    return;
                case 5:
                    m57840Yp();
                    return;
                case 6:
                    C0732w.m1177r(bVar2.m1189a(), "zcloud_code_change_remain_64_pass", null, null, null, 14, null);
                    m57838Wp();
                    return;
                case 7:
                    ((InterfaceC26478a) m103742Dp()).mo57810U1();
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: jq */
    private final void m57847jq(String str) {
        if (!AbstractC3489d.m17501i() && !AbstractC3489d.m17512t()) {
            this.f55843w.m132673N(str);
        } else {
            this.f55843w.m132677R(str);
        }
    }

    /* renamed from: kq */
    private final void m57848kq(CloudKeyResponse cloudKeyResponse) {
        if (cloudKeyResponse.m41290m()) {
            ((InterfaceC26478a) m103742Dp()).mo57815gm(cloudKeyResponse.m41278a());
        } else {
            ((InterfaceC26478a) m103742Dp()).mo57812Ze();
        }
    }

    /* renamed from: lq */
    private final void m57849lq() {
        C22447s.f109797a.m116071J0();
        C26263i.m135055u().m135085r0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mq */
    public final Object m57850mq(String str, Continuation continuation) {
        if (m57836Pp()) {
            return m57851nq(str, continuation);
        }
        return AbstractC29094b.m145339a(m57852oq(str));
    }

    /* renamed from: nq */
    private final Object m57851nq(String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new e(str, this, null), continuation);
    }

    /* renamed from: oq */
    private final boolean m57852oq(String str) {
        C26220b.m134826i("SMLPassphraseVerification", "verifyPassphraseWithBackupInfo(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        boolean m132681W = this.f55843w.m132681W(str, 3);
        if (m57844cq()) {
            this.f55834B.m128513E(3, str);
        } else {
            m57847jq(str);
        }
        return m132681W;
    }

    /* renamed from: Qp */
    public void m57853Qp(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onAccept");
        this.f55835C.m126154d(interfaceC18494a);
    }

    /* renamed from: Rp */
    public void m57854Rp() {
        ((InterfaceC26478a) m103742Dp()).mo57816mx();
    }

    /* renamed from: Tp */
    public void m57855Tp() {
        BuildersKt__Builders_commonKt.m112540d(((InterfaceC26478a) m103742Dp()).mo57818vC(), null, null, new c(null), 3, null);
    }

    /* renamed from: dq */
    public void m57856dq(C11085b c11085b, InterfaceC19968g interfaceC19968g) {
        C11085b.b bVar;
        boolean z11;
        String str;
        super.mo995Nd(c11085b, interfaceC19968g);
        if (c11085b != null) {
            bVar = c11085b.m57863a();
        } else {
            bVar = null;
        }
        this.f55837E = bVar;
        if (c11085b != null) {
            z11 = c11085b.m57865c();
        } else {
            z11 = false;
        }
        this.f55839G = z11;
        C11085b.b bVar2 = this.f55837E;
        if (bVar2 != null) {
            str = bVar2.name();
        } else {
            str = null;
        }
        C26220b.m134826i("SMLPassphraseVerification", "onAttach(): fromFlow=" + str, null, 4, null);
    }

    /* renamed from: eq */
    public void m57857eq(String str) {
        AbstractC19074t.m100208f(str, "passphrase");
        C26220b.m134826i("SMLPassphraseVerification", "onBtnContinueClick(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        if (!C23055e5.m118272g(true)) {
            return;
        }
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_64key_next", null, null, null, 14, null);
        this.f55838F = null;
        ((InterfaceC26478a) m103742Dp()).mo46829Y();
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new d(str, null), 3, null);
    }

    /* renamed from: fq */
    public void m57858fq() {
        C26220b.m134826i("SMLPassphraseVerification", "onBtnForgotPasswordClick(): fromFlow=" + this.f55837E, null, 4, null);
        C11085b.b bVar = this.f55837E;
        if (bVar != null && b.f55847a[bVar.ordinal()] == 4) {
            ((InterfaceC26478a) m103742Dp()).mo57819x1();
        } else {
            ((InterfaceC26478a) m103742Dp()).mo57808P3(this.f55840t.m110204g().m116319k());
        }
    }

    /* renamed from: gq */
    public void m57859gq() {
        C26220b.m134826i("SMLPassphraseVerification", "onDeleteBackup()", null, 4, null);
        C26263i.m135055u().m135082n();
        AbstractC23647d.m123897g("5811300");
    }
}
