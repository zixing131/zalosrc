package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.content.AbstractC1388a;
import androidx.core.text.AbstractC1463b;
import au.AbstractC2345f;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.PcLoginView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19057i0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Locale;
import java.util.concurrent.Executor;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23244v8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p649xl.C29819g9;
import pm0.C24848g0;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class PcLoginView extends SlidableZaloView implements ZaloView.InterfaceC17418c, InterfaceC0733x {
    public static final C14716a Companion = new C14716a(null);

    /* renamed from: e1 */
    private static boolean f75820e1 = true;

    /* renamed from: P0 */
    private volatile boolean f75821P0;

    /* renamed from: Q0 */
    private boolean f75822Q0;

    /* renamed from: R0 */
    private String f75823R0;

    /* renamed from: S0 */
    private String f75824S0;

    /* renamed from: T0 */
    private String f75825T0;

    /* renamed from: U0 */
    private String f75826U0;

    /* renamed from: V0 */
    private boolean f75827V0;

    /* renamed from: W0 */
    private int f75828W0 = 1;

    /* renamed from: X0 */
    private String f75829X0;

    /* renamed from: Y0 */
    private String f75830Y0;

    /* renamed from: Z0 */
    private C23528a f75831Z0;

    /* renamed from: a1 */
    private C29819g9 f75832a1;

    /* renamed from: b1 */
    private long f75833b1;

    /* renamed from: c1 */
    private int f75834c1;

    /* renamed from: d1 */
    private BiometricWrapper f75835d1;

    /* renamed from: com.zing.zalo.ui.zviews.PcLoginView$a */
    /* loaded from: classes6.dex */
    public static final class C14716a {
        private C14716a() {
        }

        public /* synthetic */ C14716a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m82524a() {
            return PcLoginView.f75820e1;
        }

        /* renamed from: b */
        public final void m82525b(boolean z11) {
            PcLoginView.f75820e1 = z11;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PcLoginView$b */
    /* loaded from: classes6.dex */
    public static final class C14717b extends C23999j {
        C14717b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            C29819g9 c29819g9 = null;
            if (c3979l != null) {
                PcLoginView pcLoginView = PcLoginView.this;
                C29819g9 c29819g92 = pcLoginView.f75832a1;
                if (c29819g92 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29819g9 = c29819g92;
                }
                pcLoginView.m82500JM(c29819g9.f137878q, c3979l);
                return;
            }
            PcLoginView pcLoginView2 = PcLoginView.this;
            C29819g9 c29819g93 = pcLoginView2.f75832a1;
            if (c29819g93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29819g9 = c29819g93;
            }
            pcLoginView2.m82518wM(c29819g9.f137878q);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PcLoginView$c */
    /* loaded from: classes6.dex */
    public static final class C14718c extends BiometricWrapper.AbstractC7309a {

        /* renamed from: a */
        final /* synthetic */ C19057i0 f75837a;

        /* renamed from: b */
        final /* synthetic */ PcLoginView f75838b;

        /* renamed from: c */
        final /* synthetic */ boolean f75839c;

        C14718c(C19057i0 c19057i0, PcLoginView pcLoginView, boolean z11) {
            this.f75837a = c19057i0;
            this.f75838b = pcLoginView;
            this.f75839c = z11;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            int i12;
            String m118743r0;
            super.mo37276a(i11, charSequence);
            long currentTimeMillis = System.currentTimeMillis() - this.f75837a.f94939p;
            if (currentTimeMillis < 1000 && PcLoginView.Companion.m82524a() && i11 != 10 && i11 != 13) {
                AbstractC20887g.m109236n(17010, " Authentication failed due to Error: errorCode: " + i11 + ", errorString: " + ((Object) charSequence) + ". End Authentication.", null, 17015, currentTimeMillis, 0, 36, null);
                if (AbstractC23165o5.m119333b()) {
                    AbstractC20887g.m109236n(17010, " Force navigate to app authentication.", null, 0, currentTimeMillis, 0, 44, null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("case_passcode_process", 3);
                    C17487o0 m92662fJ = this.f75838b.f72421L0.m92662fJ();
                    if (m92662fJ != null) {
                        m92662fJ.m93066i2(PasscodeView.class, bundle, 2132, 1, true);
                        return;
                    }
                    return;
                }
                AbstractC20887g.m109236n(17010, " Force bypass ", null, 0, currentTimeMillis, 0, 44, null);
                PcLoginView pcLoginView = this.f75838b;
                pcLoginView.m82521LM(pcLoginView.f75823R0, 1);
                return;
            }
            PcLoginView.Companion.m82525b(false);
            if (i11 != 10 && i11 != 13 && i11 != 3) {
                if (!this.f75839c && Build.VERSION.SDK_INT > 28) {
                    AbstractC20887g.m109236n(17010, " Start authentication using Passcode", null, 17011, 0L, 0, 52, null);
                    this.f75838b.m82501KM(true);
                    i12 = 0;
                } else {
                    i12 = 0;
                    AbstractC20887g.m109236n(17010, " Authentication Error: errorCode: " + i11 + ", errorString: " + ((Object) charSequence) + ". End Authentication.", null, 17015, currentTimeMillis, 0, 36, null);
                    if (charSequence != null && charSequence.length() != 0) {
                        m118743r0 = charSequence.toString();
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo);
                    }
                    ToastUtils.showMess(m118743r0);
                }
            } else {
                i12 = 0;
                AbstractC20887g.m109236n(17010, " Authentication Error: errorCode: " + i11 + ", errorString: " + ((Object) charSequence) + ". End Authentication.", null, 17015, currentTimeMillis, 0, 36, null);
            }
            this.f75838b.m82520IM(i12);
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: b */
        public void mo37277b() {
            String str;
            super.mo37277b();
            long currentTimeMillis = System.currentTimeMillis() - this.f75837a.f94939p;
            PcLoginView pcLoginView = this.f75838b;
            pcLoginView.m82520IM(pcLoginView.m82522xM() + 1);
            AbstractC20887g.m109236n(17010, " Authentication FAILED attempts: " + this.f75838b.m82522xM() + ".", null, 17014, currentTimeMillis, 0, 36, null);
            if (this.f75838b.m82522xM() >= 3) {
                if (this.f75839c) {
                    str = "Passcode";
                } else {
                    str = "Biometric";
                }
                AbstractC20887g.m109236n(17010, " Authentication by " + str + " has CANCELLED due to too many failed attempts. End Authentication.", null, 17013, currentTimeMillis, 0, 36, null);
                BiometricWrapper m82523yM = this.f75838b.m82523yM();
                if (m82523yM != null) {
                    m82523yM.m37274c();
                }
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            String str;
            AbstractC19074t.m100208f(c7310b, "authenticationResult");
            super.mo37278c(c7310b);
            long currentTimeMillis = System.currentTimeMillis() - this.f75837a.f94939p;
            this.f75838b.m82520IM(0);
            PcLoginView.Companion.m82525b(false);
            if (this.f75839c) {
                str = "Passcode";
            } else {
                str = "Biometric";
            }
            AbstractC20887g.m109236n(17010, " Authentication SUCCESSFULLY using " + str + ". End Authentication.", null, 17012, currentTimeMillis, 0, 36, null);
            PcLoginView pcLoginView = this.f75838b;
            pcLoginView.m82521LM(pcLoginView.f75823R0, 1);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PcLoginView$d */
    /* loaded from: classes6.dex */
    public static final class C14719d implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f75841b;

        C14719d(int i11) {
            this.f75841b = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* renamed from: e */
        public static final void m82528e(PcLoginView pcLoginView) {
            AbstractC19074t.m100208f(pcLoginView, "this$0");
            try {
                try {
                    pcLoginView.m82498GM();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("PcLoginView", e11.toString());
                }
            } finally {
                pcLoginView.f75821P0 = false;
                pcLoginView.f72421L0.mo49315c4();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* renamed from: f */
        public static final void m82529f(PcLoginView pcLoginView, C20096c c20096c, int i11) {
            AbstractC19074t.m100208f(pcLoginView, "this$0");
            try {
                try {
                    pcLoginView.m82497FM(c20096c, i11);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("PcLoginView", e11.toString());
                }
            } finally {
                pcLoginView.f75821P0 = false;
                pcLoginView.f72421L0.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            PcLoginView pcLoginView = PcLoginView.this;
            pcLoginView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.y30

                /* renamed from: q */
                public final /* synthetic */ C20096c f82699q;

                /* renamed from: r */
                public final /* synthetic */ int f82700r;

                public /* synthetic */ y30(C20096c c20096c2, int i11) {
                    r2 = c20096c2;
                    r3 = i11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PcLoginView.C14719d.m82529f(PcLoginView.this, r2, r3);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            PcLoginView pcLoginView = PcLoginView.this;
            pcLoginView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.z30
                public /* synthetic */ z30() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PcLoginView.C14719d.m82528e(PcLoginView.this);
                }
            });
        }
    }

    /* renamed from: AM */
    public static final void m82492AM(PcLoginView pcLoginView, View view) {
        AbstractC19074t.m100208f(pcLoginView, "this$0");
        pcLoginView.m82517vM(1);
    }

    /* renamed from: BM */
    public static final void m82493BM(PcLoginView pcLoginView, View view) {
        AbstractC19074t.m100208f(pcLoginView, "this$0");
        pcLoginView.m82517vM(0);
    }

    /* renamed from: CM */
    public static final void m82494CM(PcLoginView pcLoginView, RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(pcLoginView, "this$0");
        AbstractC19074t.m100208f(robotoTextView, "$this_apply");
        try {
            String str = pcLoginView.f75829X0;
            if (str != null) {
                Spanned m7440a = AbstractC1463b.m7440a(str, 0);
                AbstractC19074t.m100207e(m7440a, "fromHtml(...)");
                pcLoginView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w30

                    /* renamed from: q */
                    public final /* synthetic */ Spanned f82478q;

                    public /* synthetic */ w30(Spanned m7440a2) {
                        r2 = m7440a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PcLoginView.m82495DM(RobotoTextView.this, r2);
                    }
                });
            }
        } catch (Exception e11) {
            String str2 = pcLoginView.f75824S0;
            if (str2 != null && str2.length() != 0) {
                pcLoginView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.x30

                    /* renamed from: q */
                    public final /* synthetic */ PcLoginView f82590q;

                    public /* synthetic */ x30(PcLoginView pcLoginView2) {
                        r2 = pcLoginView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PcLoginView.m82496EM(RobotoTextView.this, r2);
                    }
                });
            }
            e11.printStackTrace();
        }
    }

    /* renamed from: DM */
    public static final void m82495DM(RobotoTextView robotoTextView, Spanned spanned) {
        AbstractC19074t.m100208f(robotoTextView, "$this_apply");
        AbstractC19074t.m100208f(spanned, "$spannedMsgHtml");
        robotoTextView.setText(spanned);
    }

    /* renamed from: EM */
    public static final void m82496EM(RobotoTextView robotoTextView, PcLoginView pcLoginView) {
        AbstractC19074t.m100208f(robotoTextView, "$this_apply");
        AbstractC19074t.m100208f(pcLoginView, "this$0");
        robotoTextView.setText(pcLoginView.f75824S0);
    }

    /* renamed from: FM */
    public final void m82497FM(C20096c c20096c, int i11) {
        if (this.f72421L0.m92674mJ() && !this.f72421L0.m92681pJ() && this.f72421L0.m92648SI() != null) {
            if (i11 == 1) {
                ToastUtils.m89265m(c20096c);
            }
            if (i11 != 0 && (c20096c == null || c20096c.m104491c() == 50001)) {
                this.f75822Q0 = false;
            } else {
                finish();
            }
        }
    }

    /* renamed from: GM */
    public final void m82498GM() {
        if (this.f72421L0.m92674mJ() && !this.f72421L0.m92681pJ() && this.f72421L0.m92648SI() != null) {
            this.f72421L0.mo50035CK(-1, null);
            finish();
        }
    }

    /* renamed from: HM */
    private final void m82499HM() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_pc_token")) {
                this.f75823R0 = m92642L3.getString("extra_pc_token");
            }
            if (m92642L3.containsKey("extra_pc_msg")) {
                this.f75824S0 = m92642L3.getString("extra_pc_msg");
            }
            if (m92642L3.containsKey("extra_popup_actionbutton")) {
                this.f75825T0 = m92642L3.getString("extra_popup_actionbutton");
            }
            if (m92642L3.containsKey("extra_confirm_before_sync")) {
                this.f75828W0 = m92642L3.getInt("extra_confirm_before_sync");
            }
            if (m92642L3.containsKey("extra_pc_msg_html")) {
                this.f75829X0 = m92642L3.getString("extra_pc_msg_html");
            }
            if (m92642L3.containsKey("extra_confirm_image")) {
                this.f75830Y0 = m92642L3.getString("extra_confirm_image");
            }
            if (m92642L3.containsKey("extra_deny_btn_text")) {
                this.f75826U0 = m92642L3.getString("extra_deny_btn_text");
            }
            if (m92642L3.containsKey("EXTRA_ENABLE_2FA")) {
                this.f75827V0 = m92642L3.getBoolean("EXTRA_ENABLE_2FA", false);
            }
        }
    }

    /* renamed from: JM */
    public final void m82500JM(RecyclingImageView recyclingImageView, C3979l c3979l) {
        LinearLayout.LayoutParams layoutParams;
        if (recyclingImageView != null) {
            try {
                ViewGroup.LayoutParams layoutParams2 = recyclingImageView.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.width = AbstractC23136l9.m118742r(140.0f);
                    layoutParams.height = AbstractC23136l9.m118742r(140.0f);
                    recyclingImageView.setLayoutParams(layoutParams);
                }
                recyclingImageView.setImageInfo(c3979l);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: KM */
    public final void m82501KM(boolean z11) {
        BiometricWrapper.C7312d m37291a;
        BiometricWrapper biometricWrapper;
        try {
            Executor m6967i = AbstractC1388a.m6967i(m92689tK());
            AbstractC19074t.m100207e(m6967i, "getMainExecutor(...)");
            C19057i0 c19057i0 = new C19057i0();
            this.f75835d1 = new BiometricWrapper(m92689tK(), m6967i, new C14718c(c19057i0, this, z11));
            if (z11) {
                m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37295e(true).m37291a();
            } else {
                m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37296f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel)).m37293c(false).m37298h(true).m37291a();
            }
            AbstractC19074t.m100205c(m37291a);
            if ((m92648SI() instanceof ZaloActivity) && (biometricWrapper = this.f75835d1) != null) {
                Context m92648SI = m92648SI();
                AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
                biometricWrapper.m37275d(((ZaloActivity) m92648SI).getLifecycle());
            }
            c19057i0.f94939p = System.currentTimeMillis();
            BiometricWrapper biometricWrapper2 = this.f75835d1;
            if (biometricWrapper2 != null) {
                biometricWrapper2.m37273a(m37291a, null, false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            e11.printStackTrace();
            AbstractC20887g.m109236n(17010, "Authentication Error: " + C24848g0.f119245a + ". End Authentication.", null, 17015, System.currentTimeMillis(), 0, 36, null);
        }
    }

    /* renamed from: vM */
    private final void m82517vM(int i11) {
        if (System.currentTimeMillis() < this.f75833b1) {
            return;
        }
        this.f75833b1 = System.currentTimeMillis() + ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        if (this.f75821P0) {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.loading));
            return;
        }
        if (this.f75827V0 && i11 == 1 && AbstractC2345f.m12312a(MainApplication.Companion.m35500c())) {
            AbstractC20887g.m109236n(17010, " Start authentication using Biometric", null, 17011, 0L, 0, 52, null);
            m82501KM(false);
            return;
        }
        if (this.f75827V0 && i11 == 1 && AbstractC23165o5.m119333b()) {
            AbstractC20887g.m109236n(17010, " Start authentication using Passcode", null, 17011, 0L, 0, 52, null);
            Bundle bundle = new Bundle();
            bundle.putInt("case_passcode_process", 3);
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(PasscodeView.class, bundle, 2132, 1, true);
                return;
            }
            return;
        }
        if (i11 == 0) {
            AbstractC20887g.m109236n(17010, " Not start authentication. The login was denied by user", null, 0, 0L, 0, 60, null);
        } else if (!this.f75827V0) {
            AbstractC20887g.m109236n(17010, " Not start authentication. Two factor authentication was disable", null, 0, 0L, 0, 60, null);
        } else {
            AbstractC20887g.m109236n(17010, " Force bypass without show Biometrics; decide: " + i11 + " isSupportBiometric :" + AbstractC2345f.m12313b(MainApplication.Companion.m35500c()) + " isAppUsePassCode :" + AbstractC23165o5.m119333b(), null, 0, 0L, 0, 60, null);
        }
        m82521LM(this.f75823R0, i11);
    }

    /* renamed from: wM */
    public final void m82518wM(ImageView imageView) {
        if (imageView != null) {
            imageView.setImageResource(AbstractC16803z.im_monitorpc);
        }
    }

    /* renamed from: zM */
    private final void m82519zM() {
        String upperCase;
        C23528a c23528a;
        C29819g9 c29819g9 = this.f75832a1;
        C29819g9 c29819g92 = null;
        if (c29819g9 == null) {
            AbstractC19074t.m100223u("binding");
            c29819g9 = null;
        }
        RobotoTextView robotoTextView = c29819g9.f137881t;
        String str = this.f75825T0;
        if (str != null && str.length() != 0) {
            upperCase = this.f75825T0;
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_loginpc_dialog_positive_button);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            upperCase = m118743r0.toUpperCase(locale);
            AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        }
        robotoTextView.setText(upperCase);
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.t30
            public /* synthetic */ t30() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PcLoginView.m82492AM(PcLoginView.this, view);
            }
        });
        C29819g9 c29819g93 = this.f75832a1;
        if (c29819g93 == null) {
            AbstractC19074t.m100223u("binding");
            c29819g93 = null;
        }
        RobotoTextView robotoTextView2 = c29819g93.f137880s;
        robotoTextView2.setPaintFlags(robotoTextView2.getPaintFlags() | 8);
        String str2 = this.f75826U0;
        if (str2 != null && str2.length() != 0) {
            try {
                robotoTextView2.setText(AbstractC23244v8.m119739c(this.f75826U0));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } else {
            robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_loginpc_dialog_negative_button));
        }
        robotoTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.u30
            public /* synthetic */ u30() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PcLoginView.m82493BM(PcLoginView.this, view);
            }
        });
        C29819g9 c29819g94 = this.f75832a1;
        if (c29819g94 == null) {
            AbstractC19074t.m100223u("binding");
            c29819g94 = null;
        }
        RobotoTextView robotoTextView3 = c29819g94.f137879r;
        String str3 = this.f75829X0;
        if (str3 != null && str3.length() != 0) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.v30

                /* renamed from: q */
                public final /* synthetic */ RobotoTextView f82370q;

                public /* synthetic */ v30(RobotoTextView robotoTextView32) {
                    r2 = robotoTextView32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PcLoginView.m82494CM(PcLoginView.this, r2);
                }
            });
        } else {
            String str4 = this.f75824S0;
            if (str4 != null && str4.length() != 0) {
                robotoTextView32.setText(this.f75824S0);
            }
        }
        C29819g9 c29819g95 = this.f75832a1;
        if (c29819g95 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29819g92 = c29819g95;
        }
        RecyclingImageView recyclingImageView = c29819g92.f137878q;
        ViewGroup.LayoutParams layoutParams = recyclingImageView.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, AbstractC23136l9.m118742r(90.0f) + AbstractC32226c.m155405d(this.f72421L0.m92676n2()), 0, 0);
        recyclingImageView.setLayoutParams(layoutParams2);
        String str5 = this.f75830Y0;
        if (str5 != null && str5.length() != 0) {
            try {
                this.f75831Z0 = new C23528a(this.f72421L0.getContext());
                C24003n c24003n = new C24003n(0, null, 0, false, 0, false, null, 127, null);
                c24003n.f116275p = true;
                c24003n.f116276q = true;
                c24003n.f116262c = AbstractC23006a0.f111912c;
                c24003n.f116261b = AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.im_monitorpc);
                c24003n.f116260a = AbstractC23136l9.m118742r(140.0f);
                c24003n.f116266g = C23278z2.m120110a();
                C23528a c23528a2 = this.f75831Z0;
                if (c23528a2 != null && (c23528a = (C23528a) c23528a2.m123612r(recyclingImageView)) != null) {
                    return;
                }
                return;
            } catch (Exception e12) {
                m82518wM(recyclingImageView);
                e12.printStackTrace();
                return;
            }
        }
        m82518wM(recyclingImageView);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m82499HM();
        String str = this.f75823R0;
        if (str != null && str.length() != 0) {
            return;
        }
        AbstractC23350e.m122774d("PcLoginView", "Login PC: Missing token id");
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29819g9 m147990c = C29819g9.m147990c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147990c, "inflate(...)");
        this.f75832a1 = m147990c;
        m82519zM();
        C29819g9 c29819g9 = this.f75832a1;
        if (c29819g9 == null) {
            AbstractC19074t.m100223u("binding");
            c29819g9 = null;
        }
        ScrollView root = c29819g9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: IM */
    public final void m82520IM(int i11) {
        this.f75834c1 = i11;
    }

    /* renamed from: LM */
    public final void m82521LM(String str, int i11) {
        try {
            if (this.f75821P0) {
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.loading));
                return;
            }
            this.f75822Q0 = true;
            if (i11 == 1) {
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.loading));
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14719d(i11));
            this.f75821P0 = true;
            c0766k.mo1618d5(str, (byte) i11, "");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d("PcLoginView", e11.toString());
            this.f72421L0.mo49315c4();
            this.f75821P0 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11 && !this.f75822Q0) {
            this.f75822Q0 = true;
            m82517vM(0);
        }
        super.mo59740N7(z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                if (!this.f75822Q0) {
                    this.f75822Q0 = true;
                    m82517vM(0);
                }
                finish();
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle("");
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PcLoginView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onActivityResult: requestCode=");
        sb2.append(i11);
        sb2.append(", resultCode=");
        sb2.append(i12);
        sb2.append(", data=");
        sb2.append(intent);
        if (i11 == 2132) {
            if (i12 == -1) {
                m82521LM(this.f75823R0, 1);
                return;
            }
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 != 4) {
            return false;
        }
        if (!this.f75822Q0) {
            this.f75822Q0 = true;
            m82517vM(0);
        }
        finish();
        return true;
    }

    /* renamed from: xM */
    public final int m82522xM() {
        return this.f75834c1;
    }

    /* renamed from: yM */
    public final BiometricWrapper m82523yM() {
        return this.f75835d1;
    }
}
