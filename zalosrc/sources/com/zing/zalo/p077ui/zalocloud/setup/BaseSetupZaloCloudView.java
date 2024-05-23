package com.zing.zalo.p077ui.zalocloud.setup;

import am.AbstractC0924m0;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.BackupKeySetupView;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.password.PasswordVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.PinCodeVerificationView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hc0.EnumC19985o;
import kotlin.NoWhenBranchMatchedException;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;

/* loaded from: classes6.dex */
public abstract class BaseSetupZaloCloudView<T extends ViewDataBinding> extends BaseZCloudView<T> {

    /* renamed from: R0 */
    private boolean f71938R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f71939S0;

    /* renamed from: T0 */
    private boolean f71940T0;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.BaseSetupZaloCloudView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13963a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71941a;

        static {
            int[] iArr = new int[EnumC19985o.values().length];
            try {
                iArr[EnumC19985o.f98288q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC19985o.f98289r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC19985o.f98290s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC19985o.f98291t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC19985o.f98292u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC19985o.f98293v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC19985o.f98294w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC19985o.f98295x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC19985o.f98297z.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC19985o.f98296y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC19985o.f98283A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC19985o.f98284B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC19985o.f98285C.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f71941a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.BaseSetupZaloCloudView$b */
    /* loaded from: classes6.dex */
    static final class C13964b extends AbstractC19075u implements InterfaceC18494a {
        C13964b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14008d mo12V4() {
            ZaloView m92690uK = BaseSetupZaloCloudView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C14008d) new C1802w0(m92690uK).m9378a(C14008d.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.BaseSetupZaloCloudView$c */
    /* loaded from: classes6.dex */
    public static final class C13965c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13965c f71943q = new C13965c();

        C13965c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo12V4() {
            return Long.valueOf(AbstractC0924m0.m3804f8());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.BaseSetupZaloCloudView$d */
    /* loaded from: classes6.dex */
    public static final class C13966d extends AbstractC19075u implements InterfaceC18494a {
        C13966d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77753a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77753a() {
            AbstractC0924m0.m4183rr(BaseSetupZaloCloudView.this.m77757mM().mo124314i());
        }
    }

    public BaseSetupZaloCloudView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13964b());
        this.f71939S0 = m129210a;
    }

    /* renamed from: vM */
    public static /* synthetic */ String m77745vM(BaseSetupZaloCloudView baseSetupZaloCloudView, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            return baseSetupZaloCloudView.m77749uM(z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrackingSource");
    }

    /* renamed from: xM */
    public static /* synthetic */ void m77746xM(BaseSetupZaloCloudView baseSetupZaloCloudView, EnumC19985o enumC19985o, Bundle bundle, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            baseSetupZaloCloudView.m77750wM(enumC19985o, bundle);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToNextScreen");
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        this.f71940T0 = m77748tM().m77934h0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: sM */
    public final boolean m77747sM() {
        return this.f71938R0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: tM */
    public final C14008d m77748tM() {
        return (C14008d) this.f71939S0.getValue();
    }

    /* renamed from: uM */
    public final String m77749uM(boolean z11) {
        if (m77748tM().m77929b0()) {
            return "change_pass";
        }
        if (z11 && m77748tM().m77933g0()) {
            return "resume";
        }
        return "setup";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: wM */
    public final void m77750wM(EnumC19985o enumC19985o, Bundle bundle) {
        AbstractC19074t.m100208f(enumC19985o, "screen");
        Class cls = CheckListSetupZCloudView.class;
        switch (C13963a.f71941a[enumC19985o.ordinal()]) {
            case 1:
                break;
            case 2:
                AbstractC23306f.m120636Y1().m128510B(enumC19985o);
                cls = KeepBackupDataZCloudView.class;
                break;
            case 3:
                cls = ZaloCloudEncryptionSetupIntroView.class;
                break;
            case 4:
                cls = ZCloudSetupSelectPwdView.class;
                break;
            case 5:
                cls = PasswordVerificationView.class;
                break;
            case 6:
                cls = PinCodeVerificationView.class;
                break;
            case 7:
                cls = PassphraseVerificationView.class;
                break;
            case 8:
                m77754gM(C13965c.f71943q, new C13966d());
                cls = BackupKeySetupView.class;
                break;
            case 9:
                m77748tM().m77936j0(BackupKeySetupView.EnumC11021b.f55687r);
                cls = PinCodeSetupContainerView.class;
                break;
            case 10:
                m77748tM().m77936j0(BackupKeySetupView.EnumC11021b.f55688s);
                cls = PassphraseSetupContainerView.class;
                break;
            case 11:
                cls = ZCloudConnectFeaturesView.class;
                break;
            case 12:
                AbstractC23306f.m120636Y1().m128510B(enumC19985o);
                break;
            case 13:
                finish();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
        C26676b.m136957g("CommonZaloview", "navigateToNextScreen(): screen=" + enumC19985o + ", nextScreen=" + cls, null, 4, null);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(cls, bundle, 1, true);
        }
    }
}
