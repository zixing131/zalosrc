package com.zing.zalo.p077ui.backuprestore.encryption.verification.pin;

import ac.C0732w;
import ah0.C0860a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ZAppCompatImageView;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.C11107b;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.PinCodeVerificationView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.lock.ZCloudLockedVerificationView;
import com.zing.zalo.p077ui.zalocloud.restore.ZCloudRestoreContainerView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC16975f0;
import com.zing.zalo.zdesign.component.OtpField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import gg0.AbstractC19444a;
import java.util.Arrays;
import kg0.C21719b;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import mj0.AbstractC23322a;
import nh0.C23793c;
import nl.C23870a;
import p269jj.C21275a;
import p297kd.C21688c;
import p320ld.C22436h;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p387oc.C24199c;
import p387oc.C24213q;
import p421pc.C24720a;
import p443qc.EnumC25220d;
import p479rc.C25724a;
import p484ri.C25806c;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p645xh.C29628e;
import p649xl.C29860ie;
import p649xl.C29878je;
import p649xl.C30143z;
import pg0.C24747a;
import pm0.C24848g0;
import qg0.C25268c;
import tb0.C26626l;
import tg0.C26676b;
import ui0.C27280g;
import v00.AbstractC27411f;
import v40.InterfaceC27525a;

/* loaded from: classes5.dex */
public final class PinCodeVerificationView extends SlidableZaloView implements InterfaceC27525a, View.OnClickListener {
    public static final C11095a Companion = new C11095a(null);

    /* renamed from: P0 */
    private C30143z f55888P0;

    /* renamed from: Q0 */
    private C11107b f55889Q0;

    /* renamed from: R0 */
    private final C11100f f55890R0 = new C11100f();

    /* renamed from: S0 */
    private C11106a f55891S0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$a */
    /* loaded from: classes5.dex */
    public static final class C11095a {
        private C11095a() {
        }

        public /* synthetic */ C11095a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11096b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55892a;

        static {
            int[] iArr = new int[C11107b.b.values().length];
            try {
                iArr[C11107b.b.f55927p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C11107b.b.f55928q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C11107b.b.f55929r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C11107b.b.f55931t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C11107b.b.f55930s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C11107b.b.f55933v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f55892a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C11097c extends C19071q implements InterfaceC18494a {
        C11097c(Object obj) {
            super(0, obj, PinCodeVerificationView.class, "onCloseView", "onCloseView()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57931h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m57931h() {
            ((PinCodeVerificationView) this.f94922q).m57911uM();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$d */
    /* loaded from: classes5.dex */
    public static final class C11098d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f55894q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m57933a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m57933a() {
                AbstractC23306f.m120692n().m133040U(EnumC25220d.f120981r);
            }
        }

        C11098d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57932a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57932a() {
            PinCodeVerificationView.this.m57912vM();
            C11106a c11106a = PinCodeVerificationView.this.f55891S0;
            if (c11106a == null) {
                AbstractC19074t.m100223u("presenter");
                c11106a = null;
            }
            c11106a.m57961Pp(a.f55894q);
            PinCodeVerificationView.this.m57911uM();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$e */
    /* loaded from: classes5.dex */
    public static final class C11099e extends AbstractC19075u implements InterfaceC18494a {
        C11099e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57934a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57934a() {
            PinCodeVerificationView.this.mo57927g();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$f */
    /* loaded from: classes5.dex */
    public static final class C11100f implements InterfaceC28625j {
        C11100f() {
        }

        /* renamed from: b */
        public static final void m57936b(PinCodeVerificationView pinCodeVerificationView) {
            C11107b.b bVar;
            boolean z11;
            AbstractC19074t.m100208f(pinCodeVerificationView, "this$0");
            pinCodeVerificationView.mo49315c4();
            C11107b c11107b = pinCodeVerificationView.f55889Q0;
            if (c11107b != null) {
                bVar = c11107b.m57968a();
            } else {
                bVar = null;
            }
            if (bVar == C11107b.b.f55930s) {
                z11 = true;
            } else {
                z11 = false;
            }
            pinCodeVerificationView.mo57923R8(false, z11);
        }

        @Override // p586vt.InterfaceC28625j
        /* renamed from: lk */
        public void mo57172lk(AbstractC28627l abstractC28627l) {
            C21688c.b bVar = (C21688c.b) abstractC28627l;
            if (bVar != null && bVar.f132722a == 22) {
                AbstractC19444a.m101697e(new Runnable() { // from class: v40.e
                    public /* synthetic */ RunnableC27529e() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PinCodeVerificationView.C11100f.m57936b(PinCodeVerificationView.this);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$g */
    /* loaded from: classes5.dex */
    public static final class C11101g implements TextView.OnEditorActionListener {

        /* renamed from: p */
        final /* synthetic */ OtpField f55897p;

        /* renamed from: q */
        final /* synthetic */ PinCodeVerificationView f55898q;

        C11101g(OtpField otpField, PinCodeVerificationView pinCodeVerificationView) {
            this.f55897p = otpField;
            this.f55898q = pinCodeVerificationView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            Editable text;
            if (i11 == 6 && (text = this.f55897p.getEditText().getText()) != null && text.length() == 6) {
                C30143z c30143z = this.f55898q.f55888P0;
                if (c30143z == null) {
                    AbstractC19074t.m100223u("binding");
                    c30143z = null;
                }
                c30143z.f140062r.performClick();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$h */
    /* loaded from: classes5.dex */
    public static final class C11102h implements TextWatcher {
        public C11102h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            C30143z c30143z = PinCodeVerificationView.this.f55888P0;
            if (c30143z == null) {
                AbstractC19074t.m100223u("binding");
                c30143z = null;
            }
            Button button = c30143z.f140062r;
            boolean z11 = false;
            if (charSequence != null && charSequence.length() == 6) {
                z11 = true;
            }
            button.setEnabled(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$i */
    /* loaded from: classes5.dex */
    public static final class C11103i extends AbstractC19075u implements InterfaceC18505l {
        C11103i() {
            super(1);
        }

        /* renamed from: a */
        public final void m57937a(int i11) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_code_change_no_bio", null, null, null, 14, null);
            PinCodeVerificationView.this.mo57926Z0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57937a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$j */
    /* loaded from: classes5.dex */
    public static final class C11104j extends AbstractC19075u implements InterfaceC18494a {
        C11104j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57938a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57938a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_code_change_bio_pass", null, null, null, 14, null);
            PinCodeVerificationView.this.mo57926Z0();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.verification.pin.PinCodeVerificationView$k */
    /* loaded from: classes5.dex */
    static final class C11105k extends AbstractC19075u implements InterfaceC18494a {
        C11105k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57939a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57939a() {
            PinCodeVerificationView.this.mo46829Y();
            C11106a c11106a = PinCodeVerificationView.this.f55891S0;
            if (c11106a == null) {
                AbstractC19074t.m100223u("presenter");
                c11106a = null;
            }
            c11106a.m57965cq();
        }
    }

    /* renamed from: BM */
    public static final void m57896BM(PinCodeVerificationView pinCodeVerificationView, Bundle bundle) {
        AbstractC19074t.m100208f(pinCodeVerificationView, "this$0");
        AbstractC19074t.m100208f(bundle, "$extras");
        try {
            C17487o0 m92662fJ = pinCodeVerificationView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    /* renamed from: oM */
    private final String m57905oM(long j11) {
        long mo124314i = (j11 - AbstractC23306f.m120579F1().mo124314i()) / 1000;
        long j12 = 3600;
        long j13 = mo124314i / j12;
        long j14 = (mo124314i % j12) / 60;
        StringBuilder sb2 = new StringBuilder();
        if (j13 >= 1) {
            if (j14 < 1) {
                int i11 = (int) j13;
                sb2.append(m92651WI().getQuantityString(AbstractC27411f.zch_time_hh_hours, i11, Integer.valueOf(i11)));
            } else {
                int i12 = ((int) j13) + 1;
                sb2.append(m92651WI().getQuantityString(AbstractC27411f.zch_time_hh_hours, i12, Integer.valueOf(i12)));
            }
        } else if (j14 > 0) {
            int i13 = (int) j14;
            sb2.append(m92651WI().getQuantityString(AbstractC27411f.zch_time_mm_minutes, i13, Integer.valueOf(i13)));
        } else {
            int i14 = (int) mo124314i;
            sb2.append(m92651WI().getQuantityString(AbstractC27411f.zch_time_ss_seconds, i14, Integer.valueOf(i14)));
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: pM */
    private final String m57906pM() {
        C30143z c30143z = this.f55888P0;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        return String.valueOf(c30143z.f140067w.getEditText().getText());
    }

    /* renamed from: qM */
    private final void m57907qM() {
        C11107b.b bVar;
        int i11;
        TargetBackupInfo m57969b;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C11107b c11107b = this.f55889Q0;
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = C11096b.f55892a[bVar.ordinal()];
        }
        switch (i11) {
            case 1:
            case 2:
                C26626l.m136651J(C26626l.Companion.m136712a(), context, m92662fJ(), new C11097c(this), null, 8, null);
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_pin_dimiss", null, null, null, 14, null);
                return;
            case 3:
                C11107b c11107b2 = this.f55889Q0;
                if (c11107b2 != null && (m57969b = c11107b2.m57969b()) != null) {
                    C24213q.Companion.m126205a().m126197E(m57969b, context, new C11098d());
                    return;
                }
                return;
            case 4:
                C29628e.m147249E0().m147293v1();
                mo57927g();
                C26626l.m136689z(C26626l.Companion.m136712a(), false, false, 3, null);
                return;
            case 5:
                C26626l.Companion.m136712a().m136698R(context, new C11099e());
                return;
            case 6:
                mo57924U1();
                return;
            default:
                return;
        }
    }

    /* renamed from: rM */
    private final void m57908rM() {
        C11107b.b bVar;
        C11107b c11107b = this.f55889Q0;
        C11106a c11106a = null;
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        } else {
            bVar = null;
        }
        if (bVar == C11107b.b.f55932u) {
            m57916zM();
            return;
        }
        C11106a c11106a2 = this.f55891S0;
        if (c11106a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            c11106a = c11106a2;
        }
        c11106a.m57964bq();
    }

    /* renamed from: sM */
    private final void m57909sM() {
        C30143z c30143z = this.f55888P0;
        C11107b.b bVar = null;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        ZdsActionBar zdsActionBar = c30143z.f140070z;
        View divider = zdsActionBar.getDivider();
        int i11 = -1;
        if (divider != null) {
            divider.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        C11107b c11107b = this.f55889Q0;
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        }
        if (bVar != null) {
            i11 = C11096b.f55892a[bVar.ordinal()];
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zdsActionBar.setTrailingType(ZdsActionBar.EnumC16990f.ICON.m91019c());
                Context m92689tK = m92689tK();
                AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                Drawable m139660c = C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_close_line_16, AbstractC2807a.btn_icon_tertiary_neutral);
                if (m139660c != null) {
                    zdsActionBar.setTrailingIconButton(m139660c);
                    zdsActionBar.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: v40.b
                        public /* synthetic */ ViewOnClickListenerC27526b() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PinCodeVerificationView.m57910tM(PinCodeVerificationView.this, view);
                        }
                    });
                    return;
                }
                return;
            default:
                zdsActionBar.setTrailingType(ZdsActionBar.EnumC16990f.NONE.m91019c());
                return;
        }
    }

    /* renamed from: tM */
    public static final void m57910tM(PinCodeVerificationView pinCodeVerificationView, View view) {
        AbstractC19074t.m100208f(pinCodeVerificationView, "this$0");
        pinCodeVerificationView.m57907qM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:            if (r1 == com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.C11107b.b.f55928q) goto L29;     */
    /* renamed from: uM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m57911uM() {
        C11107b.b bVar;
        C11107b c11107b = this.f55889Q0;
        C11107b.b bVar2 = null;
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        } else {
            bVar = null;
        }
        if (bVar != C11107b.b.f55927p) {
            C11107b c11107b2 = this.f55889Q0;
            if (c11107b2 != null) {
                bVar2 = c11107b2.m57968a();
            }
        }
        AbstractC23306f.m120636Y1().m128515G(true);
        AbstractC23306f.m120692n().m133040U(EnumC25220d.f120981r);
        AbstractC23306f.m120676j().m128408Z(false);
        mo57927g();
    }

    /* renamed from: vM */
    public final void m57912vM() {
        C22436h.f109760a.m115918n().mo13474a(new Runnable() { // from class: v40.d
            @Override // java.lang.Runnable
            public final void run() {
                PinCodeVerificationView.m57913wM();
            }
        });
        C22447s.f109797a.m116071J0();
        AbstractC23647d.m123897g("5580114");
    }

    /* renamed from: wM */
    public static final void m57913wM() {
        AbstractC23306f.m120692n().m133035O(C23793c.Companion.m124321a().mo124314i());
        C22436h.f109760a.m115911A(1, false);
    }

    /* renamed from: xM */
    private final void m57914xM() {
        C30143z c30143z = this.f55888P0;
        C30143z c30143z2 = null;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        c30143z.f140062r.setOnClickListener(this);
        C30143z c30143z3 = this.f55888P0;
        if (c30143z3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30143z2 = c30143z3;
        }
        c30143z2.f140063s.setOnClickListener(this);
    }

    /* renamed from: yM */
    private final void m57915yM() {
        C11107b.b bVar;
        m57909sM();
        C30143z c30143z = this.f55888P0;
        C30143z c30143z2 = null;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        OtpField otpField = c30143z.f140067w;
        otpField.setLongClickable(false);
        otpField.setShowingMode(EnumC16975f0.AUTO_HIDDEN);
        otpField.setTimeAnimAutoHidden(500L);
        otpField.getEditText().setMaxLength(6);
        otpField.getEditText().addTextChangedListener(new C11102h());
        otpField.getEditText().requestFocus();
        AbstractC2379w.m12432f(otpField.getEditText());
        otpField.getEditText().setImeOptions(6);
        otpField.getEditText().setOnEditorActionListener(new C11101g(otpField, this));
        C30143z c30143z3 = this.f55888P0;
        if (c30143z3 == null) {
            AbstractC19074t.m100223u("binding");
            c30143z3 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c30143z3.f140065u.f138209q;
        Context context = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_warning_solid_16, AbstractC2807a.support_error));
        C11107b c11107b = this.f55889Q0;
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        } else {
            bVar = null;
        }
        if (bVar == C11107b.b.f55932u) {
            C30143z c30143z4 = this.f55888P0;
            if (c30143z4 == null) {
                AbstractC19074t.m100223u("binding");
                c30143z4 = null;
            }
            c30143z4.f140069y.setText(m92652XI(AbstractC8020f0.str_title_enter_current_protect_code));
        }
        C30143z c30143z5 = this.f55888P0;
        if (c30143z5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30143z2 = c30143z5;
        }
        ZAppCompatImageView zAppCompatImageView2 = c30143z2.f140064t;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_solid_24, AbstractC2807a.accent_blue_icon));
    }

    /* renamed from: zM */
    private final void m57916zM() {
        Object m92648SI = m92648SI();
        if (m92648SI == null || !(m92648SI instanceof InterfaceC27218a)) {
            return;
        }
        C26626l m136712a = C26626l.Companion.m136712a();
        InterfaceC27218a interfaceC27218a = (InterfaceC27218a) m92648SI;
        Context context = interfaceC27218a.getContext();
        AbstractC19074t.m100205c(context);
        C26626l.m136649G(m136712a, interfaceC27218a, context, new C11103i(), new C11104j(), null, 16, null);
    }

    /* renamed from: AM */
    public void m57917AM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f55889Q0 = C11107b.Companion.m57971a(this.f72421L0.m92642L3());
        C21275a m120583H = AbstractC23306f.m120583H();
        AbstractC19074t.m100207e(m120583H, "provideCommonRepo(...)");
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        C25724a m120668h = AbstractC23306f.m120668h();
        AbstractC19074t.m100207e(m120668h, "provideBackupEncryptionManager(...)");
        C0860a m120691m2 = AbstractC23306f.m120691m2();
        AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
        C21719b m120655d2 = AbstractC23306f.m120655d2();
        AbstractC19074t.m100207e(m120655d2, "provideZaloCloudManager(...)");
        C25268c m120647b2 = AbstractC23306f.m120647b2();
        AbstractC19074t.m100207e(m120647b2, "provideZaloCloudKeyManager(...)");
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        C24747a m120636Y1 = AbstractC23306f.m120636Y1();
        AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
        C24199c m120684l = AbstractC23306f.m120684l();
        AbstractC19074t.m100207e(m120684l, "provideBackupRestoreManager(...)");
        C25806c m120692n = AbstractC23306f.m120692n();
        AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
        C11106a c11106a = new C11106a(this, m120583H, m120676j, m120668h, m120691m2, m120655d2, m120647b2, m120679j2, m120636Y1, m120684l, m120692n);
        this.f55891S0 = c11106a;
        c11106a.m57962Zp(this.f55889Q0, null);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: D1 */
    public void mo57918D1() {
        C11107b c11107b = this.f55889Q0;
        if (c11107b != null) {
            if (C11096b.f55892a[c11107b.m57968a().ordinal()] == 3) {
                mo50035CK(-1, null);
                finish();
            }
        }
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: Fr */
    public void mo57919Fr() {
        C30143z c30143z = this.f55888P0;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        c30143z.f140067w.getEditText().setText("");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30143z m148756c = C30143z.m148756c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m148756c, "inflate(...)");
        this.f55888P0 = m148756c;
        if (m148756c == null) {
            AbstractC19074t.m100223u("binding");
            m148756c = null;
        }
        RelativeLayout root = m148756c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: Hk */
    public void mo57920Hk() {
        C30143z c30143z = this.f55888P0;
        C30143z c30143z2 = null;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        c30143z.f140065u.getRoot().setVisibility(0);
        C30143z c30143z3 = this.f55888P0;
        if (c30143z3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30143z2 = c30143z3;
        }
        c30143z2.f140065u.f138210r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_incorrect_input_protect_code));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C21688c.Companion.m111854a().m111851x(this.f55890R0, "SYNC_MES");
        C30143z c30143z = this.f55888P0;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        AbstractC2379w.m12430d(c30143z.getRoot());
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: P3 */
    public void mo57921P3(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC23152n3.m119050j0(m92689tK(), str);
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: Pb */
    public void mo57922Pb(long j11) {
        C30143z c30143z = this.f55888P0;
        C30143z c30143z2 = null;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        c30143z.f140065u.getRoot().setVisibility(8);
        C30143z c30143z3 = this.f55888P0;
        if (c30143z3 == null) {
            AbstractC19074t.m100223u("binding");
            c30143z3 = null;
        }
        C29878je c29878je = c30143z3.f140066v;
        c29878je.getRoot().setVisibility(0);
        RobotoTextView robotoTextView = c29878je.f138349q;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_try_attempt_after_time);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m57905oM(j11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        C30143z c30143z4 = this.f55888P0;
        if (c30143z4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30143z2 = c30143z4;
        }
        c30143z2.f140067w.setEnabled(false);
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: R8 */
    public void mo57923R8(boolean z11, boolean z12) {
        C30143z c30143z = this.f55888P0;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        AbstractC2379w.m12430d(c30143z.getRoot());
        if (m92650VI() instanceof ZCloudSetupContainerView) {
            ZaloView m92650VI = m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView");
            ((ZCloudSetupContainerView) m92650VI).m77888xM().m77921R(z11, z12);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.str_zcloud_setup_error, new Object[0]);
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: U1 */
    public void mo57924U1() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 7340032);
        m92693xK().m93069k2(BackupDetailView.class, bundle, 1, true);
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: Vi */
    public void mo57925Vi(int i11) {
        C30143z c30143z = this.f55888P0;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        C29860ie c29860ie = c30143z.f140065u;
        c29860ie.getRoot().setVisibility(0);
        c29860ie.f138210r.setText(m92651WI().getQuantityString(AbstractC7921d0.str_title_incorrect_code_with_attempt_times, i11, Integer.valueOf(i11)));
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: Z0 */
    public void mo57926Z0() {
        C30143z c30143z = this.f55888P0;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        AbstractC2379w.m12430d(c30143z.getRoot());
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_CHANGE_KEY", true);
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        if (m57112d != null) {
            m57112d.runOnUiThread(new Runnable() { // from class: v40.c

                /* renamed from: q */
                public final /* synthetic */ Bundle f129500q;

                public /* synthetic */ RunnableC27527c(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PinCodeVerificationView.m57896BM(PinCodeVerificationView.this, r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C21688c.Companion.m111854a().m111849u(this.f55890R0, "SYNC_MES");
        m57915yM();
        m57914xM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        super.finish();
        if (AbstractC3489d.m17514v()) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_select_back", null, null, null, 14, null);
        }
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: g */
    public void mo57927g() {
        C11107b.b bVar;
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ZCloudSetupContainerView) {
            ZaloView m92650VI2 = m92650VI();
            AbstractC19074t.m100206d(m92650VI2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView");
            ((ZCloudSetupContainerView) m92650VI2).m77888xM().m77922T();
            return;
        }
        if (m92650VI instanceof ZCloudRestoreContainerView) {
            C11107b c11107b = this.f55889Q0;
            if (c11107b != null) {
                bVar = c11107b.m57968a();
            } else {
                bVar = null;
            }
            if (bVar == C11107b.b.f55927p) {
                ZaloView m92650VI3 = m92650VI();
                AbstractC19074t.m100206d(m92650VI3, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView");
                ((ZCloudRestoreContainerView) m92650VI3).m77686uM().m77717T();
                return;
            } else {
                ZaloView m92650VI4 = m92650VI();
                AbstractC19074t.m100206d(m92650VI4, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView");
                ((ZCloudRestoreContainerView) m92650VI4).m77686uM().m77710M();
                return;
            }
        }
        m57917AM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        C11107b.b bVar;
        if (AbstractC3489d.m17513u()) {
            return "ZCloudRestorePin";
        }
        C11107b c11107b = this.f55889Q0;
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        } else {
            bVar = null;
        }
        if (bVar == C11107b.b.f55932u) {
            return "ZCloudCodeChangeRemainPin";
        }
        return "RestoreBackupInputPwPin";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C30143z c30143z = this.f55888P0;
        C30143z c30143z2 = null;
        C11106a c11106a = null;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        if (AbstractC19074t.m100204b(view, c30143z.f140062r)) {
            C11106a c11106a2 = this.f55891S0;
            if (c11106a2 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                c11106a = c11106a2;
            }
            c11106a.m57963aq(m57906pM());
            return;
        }
        C30143z c30143z3 = this.f55888P0;
        if (c30143z3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30143z2 = c30143z3;
        }
        if (AbstractC19074t.m100204b(view, c30143z2.f140063s)) {
            m57908rM();
        }
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: x1 */
    public void mo57928x1() {
        C24213q m126205a = C24213q.Companion.m126205a();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C24213q.m126191v(m126205a, m92689tK, null, new C11105k(), 2, null);
    }

    @Override // v40.InterfaceC27525a
    /* renamed from: y2 */
    public void mo57929y2(int i11) {
        C30143z c30143z = this.f55888P0;
        if (c30143z == null) {
            AbstractC19074t.m100223u("binding");
            c30143z = null;
        }
        C29860ie c29860ie = c30143z.f140065u;
        c29860ie.getRoot().setVisibility(0);
        RobotoTextView robotoTextView = c29860ie.f138210r;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message_with_code);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:            if (r4 == com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.C11107b.b.f55928q) goto L41;     */
    @Override // v40.InterfaceC27525a
    /* renamed from: zj */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo57930zj(long j11) {
        C11107b.b bVar;
        boolean z11;
        ZCloudLockedVerificationView.EnumC13927b enumC13927b;
        C11107b.b bVar2;
        Bundle bundle = new Bundle();
        bundle.putLong("KEY_TIME_UNLOCKED_INFO", j11);
        C11107b c11107b = this.f55889Q0;
        C11107b.b bVar3 = null;
        if (c11107b != null) {
            bVar = c11107b.m57968a();
        } else {
            bVar = null;
        }
        if (bVar != C11107b.b.f55927p) {
            C11107b c11107b2 = this.f55889Q0;
            if (c11107b2 != null) {
                bVar2 = c11107b2.m57968a();
            } else {
                bVar2 = null;
            }
        }
        C11107b c11107b3 = this.f55889Q0;
        if (c11107b3 != null) {
            bVar3 = c11107b3.m57968a();
        }
        if (bVar3 == C11107b.b.f55928q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            enumC13927b = ZCloudLockedVerificationView.EnumC13927b.f71844t;
        } else {
            enumC13927b = ZCloudLockedVerificationView.EnumC13927b.f71841q;
        }
        bundle.putString("KEY_TRACKING_FLOW", enumC13927b.name());
        m92693xK().m93069k2(ZCloudLockedVerificationView.class, bundle, 1, true);
    }
}
