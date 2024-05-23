package com.zing.zalo.p077ui.backuprestore.encryption.verification.pin;

import ac.C0732w;
import ah0.C0860a;
import ch0.AbstractC3489d;
import com.zing.zalo.data.zalocloud.model.api.CloudKeyResponse;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.C11107b;
import com.zing.zalo.utils.ToastUtils;
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
import v40.InterfaceC27525a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.a */
/* loaded from: classes5.dex */
public final class C11106a extends AbstractC19962a implements InterfaceC19966e {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C24747a f55903A;

    /* renamed from: B */
    private final C24199c f55904B;

    /* renamed from: C */
    private final C25806c f55905C;

    /* renamed from: D */
    private C11107b.b f55906D;

    /* renamed from: E */
    private CloudKeyResponse f55907E;

    /* renamed from: F */
    private boolean f55908F;

    /* renamed from: t */
    private final C21275a f55909t;

    /* renamed from: u */
    private final C24720a f55910u;

    /* renamed from: v */
    private final C25724a f55911v;

    /* renamed from: w */
    private final C0860a f55912w;

    /* renamed from: x */
    private final C21719b f55913x;

    /* renamed from: y */
    private final C25268c f55914y;

    /* renamed from: z */
    private final C23870a f55915z;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.a$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55916a;

        static {
            int[] iArr = new int[C11107b.b.values().length];
            try {
                iArr[C11107b.b.f55929r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C11107b.b.f55927p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C11107b.b.f55928q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C11107b.b.f55930s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C11107b.b.f55931t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C11107b.b.f55932u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C11107b.b.f55933v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f55916a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55917t;

        /* renamed from: v */
        final /* synthetic */ String f55919v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation continuation) {
            super(2, continuation);
            this.f55919v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f55919v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55917t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C11106a c11106a = C11106a.this;
                String str = this.f55919v;
                this.f55917t = 1;
                obj = c11106a.m57958iq(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((InterfaceC27525a) C11106a.this.m103742Dp()).mo49315c4();
            if (booleanValue) {
                C11106a.this.m57954eq(this.f55919v);
            } else {
                C11106a.this.m57953dq();
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
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f55920t;

        /* renamed from: u */
        final /* synthetic */ String f55921u;

        /* renamed from: v */
        final /* synthetic */ C11106a f55922v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, C11106a c11106a, Continuation continuation) {
            super(2, continuation);
            this.f55921u = str;
            this.f55922v = c11106a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f55921u, this.f55922v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55920t;
            boolean z11 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26220b.m134826i("SMLPinCodeVerification", "verifyPinCodeAndFetchCloudKey(): " + C26245a.f124654a.m134956q(this.f55921u), null, 4, null);
                C25268c c25268c = this.f55922v.f55914y;
                String str = this.f55921u;
                this.f55920t = 1;
                obj = c25268c.m130760h(str, 2, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            CloudKeyResponse cloudKeyResponse = (CloudKeyResponse) obj;
            this.f55922v.f55907E = cloudKeyResponse;
            if (cloudKeyResponse == null || cloudKeyResponse.m41287j()) {
                z11 = false;
            }
            return AbstractC29094b.m145339a(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11106a(InterfaceC27525a interfaceC27525a, C21275a c21275a, C24720a c24720a, C25724a c25724a, C0860a c0860a, C21719b c21719b, C25268c c25268c, C23870a c23870a, C24747a c24747a, C24199c c24199c, C25806c c25806c) {
        super(interfaceC27525a);
        AbstractC19074t.m100208f(interfaceC27525a, "mvpView");
        AbstractC19074t.m100208f(c21275a, "commonRepo");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        AbstractC19074t.m100208f(c21719b, "cloudManager");
        AbstractC19074t.m100208f(c25268c, "cloudKeyManager");
        AbstractC19074t.m100208f(c23870a, "cloudRepo");
        AbstractC19074t.m100208f(c24747a, "criticalCaseManager");
        AbstractC19074t.m100208f(c24199c, "backupRestoreManager");
        AbstractC19074t.m100208f(c25806c, "backupRestoreRepo");
        this.f55909t = c21275a;
        this.f55910u = c24720a;
        this.f55911v = c25724a;
        this.f55912w = c0860a;
        this.f55913x = c21719b;
        this.f55914y = c25268c;
        this.f55915z = c23870a;
        this.f55903A = c24747a;
        this.f55904B = c24199c;
        this.f55905C = c25806c;
    }

    /* renamed from: Op */
    private final boolean m57945Op() {
        if (AbstractC3489d.m17509q() && !m57952Yp() && !AbstractC3489d.m17512t()) {
            return true;
        }
        return false;
    }

    /* renamed from: Qp */
    private final void m57946Qp() {
        this.f55913x.m112075g();
    }

    /* renamed from: Rp */
    private final void m57947Rp() {
        C26220b.m134826i("SMLPinCodeVerification", "handleCloudRestore()", null, 4, null);
        this.f55905C.m133040U(EnumC25220d.f120982s);
        this.f55910u.m128408Z(false);
        m57957hq();
        m57946Qp();
        ((InterfaceC27525a) m103742Dp()).mo57927g();
    }

    /* renamed from: Sp */
    private final void m57948Sp() {
        C26220b.m134826i("SMLPinCodeVerification", "handleEmptyBackupInfo()", null, 4, null);
        ((InterfaceC27525a) m103742Dp()).mo57927g();
    }

    /* renamed from: Tp */
    private final void m57949Tp() {
        C26220b.m134826i("SMLPinCodeVerification", "handleNormalRestore()", null, 4, null);
        ((InterfaceC27525a) m103742Dp()).mo57918D1();
    }

    /* renamed from: Wp */
    private final void m57950Wp() {
        C26220b.m134826i("SMLPinCodeVerification", "handleOnlyConnectCloud()", null, 4, null);
        this.f55905C.m133040U(EnumC25220d.f120982s);
        this.f55910u.m128408Z(false);
        C22447s.f109797a.m116071J0();
        m57946Qp();
        ((InterfaceC27525a) m103742Dp()).mo57927g();
    }

    /* renamed from: Xp */
    private final void m57951Xp() {
        C26220b.m134826i("SMLPinCodeVerification", "handleVerifyOnboardingSetup()", null, 4, null);
        ((InterfaceC27525a) m103742Dp()).mo57923R8(true, true);
    }

    /* renamed from: Yp */
    private final boolean m57952Yp() {
        if (this.f55906D == C11107b.b.f55930s) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dq */
    public final void m57953dq() {
        String str;
        C24848g0 c24848g0 = null;
        C26220b.m134826i("SMLPinCodeVerification", "onPinCodeNotMatch(): fromFlow=" + this.f55906D + ", fetchKeyResponse=" + this.f55907E, null, 4, null);
        C0732w m1189a = C0732w.Companion.m1189a();
        if (AbstractC3489d.m17514v()) {
            str = "zcloud_restore_pin_wrong";
        } else {
            str = "restore_bk_pwpin_wrong_pw";
        }
        C0732w.m1177r(m1189a, str, null, null, null, 14, null);
        ((InterfaceC27525a) m103742Dp()).mo57919Fr();
        CloudKeyResponse cloudKeyResponse = this.f55907E;
        if (cloudKeyResponse != null) {
            if (cloudKeyResponse.m41289l()) {
                m57956gq(cloudKeyResponse);
            } else if (cloudKeyResponse.m41288k()) {
                ToastUtils.m89262j();
            } else {
                ((InterfaceC27525a) m103742Dp()).mo57929y2(cloudKeyResponse.m41281d());
            }
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            ((InterfaceC27525a) m103742Dp()).mo57920Hk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eq */
    public final void m57954eq(String str) {
        String str2;
        C26220b.m134826i("SMLPinCodeVerification", "onPinCodeVerified(): fromFlow=" + this.f55906D, null, 4, null);
        C0732w.b bVar = C0732w.Companion;
        C0732w m1189a = bVar.m1189a();
        if (AbstractC3489d.m17514v()) {
            str2 = "zcloud_restore_pin_correct";
        } else {
            str2 = "restore_bk_pwpin_correct_pw";
        }
        C0732w.m1177r(m1189a, str2, null, null, null, 14, null);
        C11107b.b bVar2 = this.f55906D;
        if (bVar2 != null) {
            switch (b.f55916a[bVar2.ordinal()]) {
                case 1:
                    m57949Tp();
                    return;
                case 2:
                case 3:
                    C26220b.m134826i("SMLPinCodeVerification", "completeOnboardingSetup(): onPinCodeVerified", null, 4, null);
                    AbstractC23306f.m120636Y1().m128523g();
                    if (this.f55908F && this.f55911v.m132682Y()) {
                        m57947Rp();
                        return;
                    } else {
                        m57950Wp();
                        return;
                    }
                case 4:
                    m57951Xp();
                    return;
                case 5:
                    m57948Sp();
                    return;
                case 6:
                    C0732w.m1177r(bVar.m1189a(), "zcloud_code_change_remain_pin_pass", null, null, null, 14, null);
                    ((InterfaceC27525a) m103742Dp()).mo57926Z0();
                    return;
                case 7:
                    ((InterfaceC27525a) m103742Dp()).mo57924U1();
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: fq */
    private final void m57955fq(String str) {
        if (!AbstractC3489d.m17501i() && !AbstractC3489d.m17512t()) {
            this.f55911v.m132672M(str);
        } else {
            this.f55911v.m132676Q(str);
        }
    }

    /* renamed from: gq */
    private final void m57956gq(CloudKeyResponse cloudKeyResponse) {
        if (cloudKeyResponse.m41281d() == -212) {
            if (this.f55906D == C11107b.b.f55932u) {
                ((InterfaceC27525a) m103742Dp()).mo57922Pb(cloudKeyResponse.m41286i());
                return;
            }
            this.f55915z.m124820n1(cloudKeyResponse.m41284g());
            this.f55915z.m124824p1(cloudKeyResponse.m41286i());
            this.f55915z.m124845y1(0L);
            ((InterfaceC27525a) m103742Dp()).mo57930zj(cloudKeyResponse.m41286i());
            return;
        }
        if (cloudKeyResponse.m41290m()) {
            ((InterfaceC27525a) m103742Dp()).mo57925Vi(cloudKeyResponse.m41278a());
        } else {
            ((InterfaceC27525a) m103742Dp()).mo57920Hk();
        }
    }

    /* renamed from: hq */
    private final void m57957hq() {
        C22447s.f109797a.m116071J0();
        C26263i.m135055u().m135085r0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iq */
    public final Object m57958iq(String str, Continuation continuation) {
        if (m57945Op()) {
            return m57959jq(str, continuation);
        }
        return AbstractC29094b.m145339a(m57960kq(str));
    }

    /* renamed from: jq */
    private final Object m57959jq(String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(str, this, null), continuation);
    }

    /* renamed from: kq */
    private final boolean m57960kq(String str) {
        C26220b.m134826i("SMLPinCodeVerification", "verifyPinCodeWithBackupInfo(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        boolean m132681W = this.f55911v.m132681W(str, 2);
        if (m57952Yp()) {
            this.f55903A.m128513E(2, str);
        } else {
            m57955fq(str);
        }
        return m132681W;
    }

    /* renamed from: Pp */
    public void m57961Pp(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onAccept");
        this.f55904B.m126154d(interfaceC18494a);
    }

    /* renamed from: Zp */
    public void m57962Zp(C11107b c11107b, InterfaceC19968g interfaceC19968g) {
        C11107b.b bVar;
        boolean z11;
        String str;
        super.mo995Nd(c11107b, interfaceC19968g);
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        } else {
            bVar = null;
        }
        this.f55906D = bVar;
        if (c11107b != null) {
            z11 = c11107b.m57970c();
        } else {
            z11 = false;
        }
        this.f55908F = z11;
        C11107b.b bVar2 = this.f55906D;
        if (bVar2 != null) {
            str = bVar2.name();
        } else {
            str = null;
        }
        C26220b.m134826i("SMLPinCodeVerification", "onAttach(): fromFlow=" + str, null, 4, null);
    }

    /* renamed from: aq */
    public void m57963aq(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "pinCode");
        C26220b.m134826i("SMLPinCodeVerification", "onBtnContinueClick(): " + C26245a.f124654a.m134956q(str), null, 4, null);
        if (!C23055e5.m118272g(true)) {
            return;
        }
        C0732w m1189a = C0732w.Companion.m1189a();
        if (AbstractC3489d.m17514v()) {
            str2 = "zcloud_restore_pin_back";
        } else {
            str2 = "restore_bk_pwpin_next";
        }
        C0732w.m1177r(m1189a, str2, null, null, null, 14, null);
        this.f55907E = null;
        ((InterfaceC27525a) m103742Dp()).mo46829Y();
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(this), null, null, new c(str, null), 3, null);
    }

    /* renamed from: bq */
    public void m57964bq() {
        String str;
        C26220b.m134826i("SMLPinCodeVerification", "onBtnForgotPasswordClick(): fromFlow=" + this.f55906D, null, 4, null);
        C0732w m1189a = C0732w.Companion.m1189a();
        if (AbstractC3489d.m17514v()) {
            str = "zcloud_restore_pin_forget";
        } else {
            str = "restore_bk_pwpin_forget";
        }
        C0732w.m1177r(m1189a, str, null, null, null, 14, null);
        C11107b.b bVar = this.f55906D;
        if (bVar != null && b.f55916a[bVar.ordinal()] == 4) {
            ((InterfaceC27525a) m103742Dp()).mo57928x1();
        } else {
            ((InterfaceC27525a) m103742Dp()).mo57921P3(this.f55909t.m110204g().m116319k());
        }
    }

    /* renamed from: cq */
    public void m57965cq() {
        C26220b.m134826i("SMLPinCodeVerification", "onDeleteBackup()", null, 4, null);
        C26263i.m135055u().m135082n();
        AbstractC23647d.m123897g("5811300");
    }
}
