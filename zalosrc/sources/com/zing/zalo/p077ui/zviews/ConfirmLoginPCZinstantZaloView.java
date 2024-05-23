package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import au.AbstractC2345f;
import au.AbstractC2379w;
import bg0.C2797c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.ConfirmLoginPCZinstantZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19057i0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.concurrent.Executor;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p429pv.C24911a;
import p542ub.InterfaceC27218a;
import p716zh.C31877d;
import pm0.C24848g0;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class ConfirmLoginPCZinstantZaloView extends ZinstantZaloView {
    public static final C14191a Companion = new C14191a(null);

    /* renamed from: D1 */
    private static boolean f72985D1 = true;

    /* renamed from: A1 */
    private long f72986A1;

    /* renamed from: B1 */
    private int f72987B1;

    /* renamed from: C1 */
    private BiometricWrapper f72988C1;

    /* renamed from: s1 */
    private String f72989s1;

    /* renamed from: t1 */
    private boolean f72990t1;

    /* renamed from: u1 */
    private Bundle f72991u1;

    /* renamed from: v1 */
    private boolean f72992v1;

    /* renamed from: w1 */
    private boolean f72993w1;

    /* renamed from: y1 */
    private boolean f72995y1;

    /* renamed from: x1 */
    private final C2797c f72994x1 = new C2797c(AbstractC0837p0.Companion.m2237f());

    /* renamed from: z1 */
    private final AbstractC28207v1.j0 f72996z1 = new AbstractC28207v1.j0() { // from class: com.zing.zalo.ui.zviews.z9
        @Override // vg.AbstractC28207v1.j0
        /* renamed from: a */
        public final void mo87297a(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
            ConfirmLoginPCZinstantZaloView.m79124KN(ConfirmLoginPCZinstantZaloView.this, zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
        }
    };

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmLoginPCZinstantZaloView$a */
    /* loaded from: classes6.dex */
    public static final class C14191a {
        private C14191a() {
        }

        public /* synthetic */ C14191a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m79150a() {
            return ConfirmLoginPCZinstantZaloView.f72985D1;
        }

        /* renamed from: b */
        public final void m79151b(boolean z11) {
            ConfirmLoginPCZinstantZaloView.f72985D1 = z11;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmLoginPCZinstantZaloView$b */
    /* loaded from: classes6.dex */
    public static final class C14192b extends BiometricWrapper.AbstractC7309a {

        /* renamed from: a */
        final /* synthetic */ C19057i0 f72997a;

        /* renamed from: b */
        final /* synthetic */ ConfirmLoginPCZinstantZaloView f72998b;

        /* renamed from: c */
        final /* synthetic */ boolean f72999c;

        C14192b(C19057i0 c19057i0, ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView, boolean z11) {
            this.f72997a = c19057i0;
            this.f72998b = confirmLoginPCZinstantZaloView;
            this.f72999c = z11;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            int i12;
            String m118743r0;
            super.mo37276a(i11, charSequence);
            long currentTimeMillis = System.currentTimeMillis() - this.f72997a.f94939p;
            if (currentTimeMillis < 1000 && ConfirmLoginPCZinstantZaloView.Companion.m79150a() && i11 != 10 && i11 != 13) {
                AbstractC20887g.m109236n(17010, " Authentication failed due to Error: errorCode: " + i11 + ", errorString: " + ((Object) charSequence) + ". End Authentication.", null, 17015, currentTimeMillis, 0, 36, null);
                if (AbstractC23165o5.m119333b()) {
                    AbstractC20887g.m109236n(17010, " Force navigate to app authentication.", null, 0, currentTimeMillis, 0, 44, null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("case_passcode_process", 3);
                    C17487o0 m92662fJ = this.f72998b.f72421L0.m92662fJ();
                    if (m92662fJ != null) {
                        m92662fJ.m93066i2(PasscodeView.class, bundle, 2132, 1, true);
                        return;
                    }
                    return;
                }
                AbstractC20887g.m109236n(17010, " Force bypass ", null, 0, currentTimeMillis, 0, 44, null);
                ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView = this.f72998b;
                confirmLoginPCZinstantZaloView.m79145EN(confirmLoginPCZinstantZaloView.f72989s1, 1);
                return;
            }
            ConfirmLoginPCZinstantZaloView.Companion.m79151b(false);
            if (i11 != 10 && i11 != 13 && i11 != 3) {
                if (!this.f72999c && Build.VERSION.SDK_INT > 28) {
                    AbstractC20887g.m109236n(17010, " Start authentication using Passcode", null, 17011, 0L, 0, 52, null);
                    this.f72998b.m79118DN(true);
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
            this.f72998b.m79143AN(i12);
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: b */
        public void mo37277b() {
            String str;
            super.mo37277b();
            long currentTimeMillis = System.currentTimeMillis() - this.f72997a.f94939p;
            ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView = this.f72998b;
            confirmLoginPCZinstantZaloView.m79143AN(confirmLoginPCZinstantZaloView.m79147sN() + 1);
            ConfirmLoginPCZinstantZaloView.Companion.m79151b(false);
            AbstractC20887g.m109236n(17010, " Authentication FAILED attempts: " + this.f72998b.m79147sN() + ".", null, 17014, currentTimeMillis, 0, 36, null);
            if (this.f72998b.m79147sN() >= 3) {
                if (this.f72999c) {
                    str = "Passcode";
                } else {
                    str = "Biometric";
                }
                AbstractC20887g.m109236n(17010, " Authentication by " + str + " has CANCELLED due to too many failed attempts. End Authentication.", null, 17013, currentTimeMillis, 0, 36, null);
                BiometricWrapper m79148tN = this.f72998b.m79148tN();
                if (m79148tN != null) {
                    m79148tN.m37274c();
                }
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            String str;
            AbstractC19074t.m100208f(c7310b, "authenticationResult");
            super.mo37278c(c7310b);
            long currentTimeMillis = System.currentTimeMillis() - this.f72997a.f94939p;
            this.f72998b.m79143AN(0);
            if (this.f72999c) {
                str = "Passcode";
            } else {
                str = "Biometric";
            }
            AbstractC20887g.m109236n(17010, " Authentication SUCCESSFULLY using " + str + ". End Authentication.", null, 17012, currentTimeMillis, 0, 36, null);
            ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView = this.f72998b;
            confirmLoginPCZinstantZaloView.m79145EN(confirmLoginPCZinstantZaloView.f72989s1, 1);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ConfirmLoginPCZinstantZaloView$c */
    /* loaded from: classes6.dex */
    public static final class C14193c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73000a;

        /* renamed from: b */
        final /* synthetic */ ConfirmLoginPCZinstantZaloView f73001b;

        /* renamed from: c */
        final /* synthetic */ int f73002c;

        C14193c(String str, ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView, int i11) {
            this.f73000a = str;
            this.f73001b = confirmLoginPCZinstantZaloView;
            this.f73002c = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m79154e(ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView) {
            AbstractC19074t.m100208f(confirmLoginPCZinstantZaloView, "this$0");
            try {
                try {
                    confirmLoginPCZinstantZaloView.m79140xN();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("ConfirmLoginPCZinstantZaloView", e11.toString());
                }
            } finally {
                confirmLoginPCZinstantZaloView.f72992v1 = false;
                confirmLoginPCZinstantZaloView.mo49315c4();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m79155f(ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView, C20096c c20096c, int i11) {
            AbstractC19074t.m100208f(confirmLoginPCZinstantZaloView, "this$0");
            try {
                try {
                    confirmLoginPCZinstantZaloView.m79139wN(c20096c, i11);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("ConfirmLoginPCZinstantZaloView", e11.toString());
                }
            } finally {
                confirmLoginPCZinstantZaloView.f72992v1 = false;
                confirmLoginPCZinstantZaloView.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            C24911a.f119528a.m129578a(this.f73000a);
            final ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView = this.f73001b;
            final int i11 = this.f73002c;
            confirmLoginPCZinstantZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ca
                @Override // java.lang.Runnable
                public final void run() {
                    ConfirmLoginPCZinstantZaloView.C14193c.m79155f(ConfirmLoginPCZinstantZaloView.this, c20096c, i11);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            final ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView = this.f73001b;
            confirmLoginPCZinstantZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.da
                @Override // java.lang.Runnable
                public final void run() {
                    ConfirmLoginPCZinstantZaloView.C14193c.m79154e(ConfirmLoginPCZinstantZaloView.this);
                }
            });
        }
    }

    /* renamed from: CN */
    private final void m79117CN() {
        C17487o0 mo35579p;
        Bundle bundle = this.f72991u1;
        if (bundle != null) {
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93066i2(PcLoginView.class, bundle, 1605, 1, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public final void m79118DN(boolean z11) {
        BiometricWrapper.C7312d m37291a;
        BiometricWrapper biometricWrapper;
        try {
            Executor m6967i = AbstractC1388a.m6967i(m92689tK());
            AbstractC19074t.m100207e(m6967i, "getMainExecutor(...)");
            C19057i0 c19057i0 = new C19057i0();
            this.f72988C1 = new BiometricWrapper(m92689tK(), m6967i, new C14192b(c19057i0, this, z11));
            if (z11) {
                m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37295e(true).m37291a();
            } else {
                m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37296f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel)).m37293c(false).m37298h(true).m37291a();
            }
            AbstractC19074t.m100205c(m37291a);
            if ((m92648SI() instanceof ZaloActivity) && (biometricWrapper = this.f72988C1) != null) {
                Context m92648SI = m92648SI();
                AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
                biometricWrapper.m37275d(((ZaloActivity) m92648SI).getLifecycle());
            }
            c19057i0.f94939p = System.currentTimeMillis();
            BiometricWrapper biometricWrapper2 = this.f72988C1;
            if (biometricWrapper2 != null) {
                biometricWrapper2.m37273a(m37291a, null, false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            e11.printStackTrace();
            AbstractC20887g.m109236n(17010, "Authentication Error: " + C24848g0.f119245a + ". End Authentication.", null, 17015, System.currentTimeMillis(), 0, 36, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public static final void m79119FN(final ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView, final String str, final int i11) {
        AbstractC19074t.m100208f(confirmLoginPCZinstantZaloView, "this$0");
        final String m129579b = C24911a.f119528a.m129579b();
        confirmLoginPCZinstantZaloView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ba
            @Override // java.lang.Runnable
            public final void run() {
                ConfirmLoginPCZinstantZaloView.m79120GN(ConfirmLoginPCZinstantZaloView.this, str, i11, m129579b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static final void m79120GN(ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView, String str, int i11, String str2) {
        AbstractC19074t.m100208f(confirmLoginPCZinstantZaloView, "this$0");
        AbstractC19074t.m100208f(str2, "$keyValidateTransferMsg");
        confirmLoginPCZinstantZaloView.m79121HN(str, i11, str2);
    }

    /* renamed from: HN */
    private final void m79121HN(String str, int i11, String str2) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14193c(str2, this, i11));
            c0766k.mo1618d5(str, (byte) i11, str2);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d("ConfirmLoginPCZinstantZaloView", e11.toString());
            mo49315c4();
            this.f72992v1 = false;
        }
    }

    /* renamed from: IN */
    private final void m79122IN(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("action");
            this.f72995y1 = jSONObject.optBoolean("is_confirm_transfer_msg", false);
            m79136rN(optInt);
        }
    }

    /* renamed from: JN */
    private final void m79123JN() {
        String str = this.f72989s1;
        if (str != null && str.length() != 0) {
            return;
        }
        AbstractC23350e.m122774d("ConfirmLoginPCZinstantZaloView", "Login PC: Missing token id");
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public static final void m79124KN(ConfirmLoginPCZinstantZaloView confirmLoginPCZinstantZaloView, ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
        AbstractC19074t.m100208f(confirmLoginPCZinstantZaloView, "this$0");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("processCommonAction: action=");
            sb2.append(str);
            sb2.append(", actionType=");
            sb2.append(i11);
            sb2.append(", itemData=");
            sb2.append(str2);
            if (str != null && str.length() != 0) {
                if (AbstractC19074t.m100204b(str, "action.zinstant.login.pc")) {
                    confirmLoginPCZinstantZaloView.m79122IN(str2);
                } else if (AbstractC19074t.m100204b(str, "action.open.zinstantview")) {
                    if (str2 != null) {
                        AbstractC28207v1.m141879I0(new JSONObject(str2), confirmLoginPCZinstantZaloView.m92692wK(), null, null, null, 1605, new v81(confirmLoginPCZinstantZaloView.f72991u1), 134217728);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("ConfirmLoginPCZinstantZaloView", e11.toString());
        }
    }

    /* renamed from: qN */
    private final boolean m79135qN() {
        C17487o0 mo35579p;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 == null || (mo35579p = m92676n2.mo35579p()) == null || mo35579p.m93029Q(MainTabView.class) || mo35579p.m93018M0() != 1) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        mo35579p.m93069k2(MainTabView.class, bundle, 2, true);
        return true;
    }

    /* renamed from: rN */
    private final void m79136rN(int i11) {
        if (System.currentTimeMillis() < this.f72986A1) {
            return;
        }
        this.f72986A1 = System.currentTimeMillis() + ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        if (this.f72992v1) {
            mo46829Y();
            return;
        }
        if (this.f72990t1 && i11 == 1 && AbstractC2345f.m12312a(MainApplication.Companion.m35500c())) {
            AbstractC20887g.m109236n(17010, " Start authentication using Biometric", null, 17011, 0L, 0, 52, null);
            m79118DN(false);
            return;
        }
        if (this.f72990t1 && i11 == 1 && AbstractC23165o5.m119333b()) {
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
        } else if (!this.f72990t1) {
            AbstractC20887g.m109236n(17010, " Not start authentication. Two factor authentication was disable", null, 0, 0L, 0, 60, null);
        } else {
            AbstractC20887g.m109236n(17010, " Force bypass without show Biometrics; decide: " + i11 + " isSupportBiometric :" + AbstractC2345f.m12313b(MainApplication.Companion.m35500c()) + " isAppUsePassCode :" + AbstractC23165o5.m119333b(), null, 0, 0L, 0, 60, null);
        }
        m79145EN(this.f72989s1, i11);
    }

    /* renamed from: uN */
    private final void m79137uN() {
        m79141yN();
        m79123JN();
        mo79514dN(this.f72996z1);
    }

    /* renamed from: vN */
    private final void m79138vN(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (!m79135qN()) {
                    finish();
                    return;
                }
                return;
            }
            m79117CN();
            return;
        }
        if (!this.f72993w1) {
            this.f72993w1 = true;
            m79136rN(0);
        }
        if (!m79135qN()) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public final void m79139wN(C20096c c20096c, int i11) {
        boolean z11;
        String str;
        int i12 = 1;
        if (i11 == 1) {
            ToastUtils.m89265m(c20096c);
        }
        if (c20096c != null && c20096c.m104491c() == 50001 && i11 != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            this.f72993w1 = false;
        }
        JSONObject jSONObject = new JSONObject();
        if (!z11) {
            i12 = 2;
        }
        jSONObject.put("result", i12);
        if (c20096c != null) {
            str = c20096c.m104492d();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        } else {
            AbstractC19074t.m100205c(str);
        }
        jSONObject.put("message", str);
        m87243VM("action.zinstant.login.pc.completed", jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public final void m79140xN() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", 0);
        mo50035CK(-1, null);
        m87243VM("action.zinstant.login.pc.completed", jSONObject.toString());
    }

    /* renamed from: yN */
    private final void m79141yN() {
        String str;
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            Bundle bundle = m92642L3.getBundle("extra_bundle_login_pc");
            this.f72991u1 = bundle;
            boolean z11 = true;
            if (bundle != null && bundle.containsKey("extra_pc_token")) {
                Bundle bundle2 = this.f72991u1;
                if (bundle2 != null) {
                    str = bundle2.getString("extra_pc_token");
                } else {
                    str = null;
                }
                this.f72989s1 = str;
            }
            Bundle bundle3 = this.f72991u1;
            if (bundle3 != null && bundle3.containsKey("EXTRA_ENABLE_2FA")) {
                Bundle bundle4 = this.f72991u1;
                if (bundle4 == null || !bundle4.getBoolean("EXTRA_ENABLE_2FA", false)) {
                    z11 = false;
                }
                this.f72990t1 = z11;
            }
        }
    }

    /* renamed from: zN */
    private final void m79142zN(Bundle bundle) {
        Bundle m92642L3;
        if (bundle == null && (m92642L3 = m92642L3()) != null) {
            m92642L3.putBundle("extra_bundle_login_pc", this.f72991u1);
        }
    }

    /* renamed from: AN */
    public final void m79143AN(int i11) {
        this.f72987B1 = i11;
    }

    /* renamed from: BN */
    public final void m79144BN(Bundle bundle) {
        this.f72991u1 = bundle;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        View view;
        super.mo37111CJ(bundle);
        m79142zN(bundle);
        m79137uN();
        if (this.f72421L0.m92676n2() != null) {
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null) {
                view = m92676n2.getCurrentFocus();
            } else {
                view = null;
            }
            AbstractC2379w.m12430d(view);
        }
    }

    /* renamed from: EN */
    public final void m79145EN(final String str, final int i11) {
        if (this.f72992v1) {
            mo46829Y();
            return;
        }
        this.f72992v1 = true;
        this.f72993w1 = true;
        if (i11 == 1) {
            mo46829Y();
        }
        if (i11 == 1 && this.f72995y1) {
            this.f72994x1.mo13474a(new Runnable() { // from class: com.zing.zalo.ui.zviews.aa
                @Override // java.lang.Runnable
                public final void run() {
                    ConfirmLoginPCZinstantZaloView.m79119FN(ConfirmLoginPCZinstantZaloView.this, str, i11);
                }
            });
        } else {
            m79121HN(str, i11, "");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView
    /* renamed from: RM */
    public void mo79146RM(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "dataModel");
        super.mo79146RM(bundle);
        mo60305zK(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.putBundle("extra_bundle_login_pc", this.f72991u1);
        }
        m79137uN();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ConfirmLoginPCZinstantZaloView";
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
                m79145EN(this.f72989s1, 1);
                return;
            }
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    /* renamed from: sN */
    public final int m79147sN() {
        return this.f72987B1;
    }

    /* renamed from: tN */
    public final BiometricWrapper m79148tN() {
        return this.f72988C1;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView
    /* renamed from: uM */
    protected void mo79149uM(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("exitType=");
        sb2.append(i11);
        m79138vN(i11);
    }
}
