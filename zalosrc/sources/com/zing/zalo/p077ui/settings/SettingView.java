package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b50.AbstractC2557e;
import b50.C2556d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.bottomsheet.LogoutConfirmView;
import com.zing.zalo.p077ui.call.SettingCallView;
import com.zing.zalo.p077ui.settings.SettingView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.zviews.ChangePasswordView;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.NotChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.SearchSettingView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import j30.C20912a;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23148n;
import me0.AbstractC23179p8;
import me0.AbstractC23216t1;
import me0.AbstractC23217t2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p128ed.C18389d;
import p248iy.AbstractC20887g;
import p320ld.C22436h;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p716zh.C32017m4;
import r00.AbstractC25598c;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import sa0.C26209i;
import vg.AbstractC28025b8;
import vg.C28212v6;
import za0.C31747a;

/* loaded from: classes6.dex */
public class SettingView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: r1 */
    public static final String f68009r1 = "SettingView";

    /* renamed from: P0 */
    private LinearLayout f68010P0;

    /* renamed from: Q0 */
    private LinearLayout f68011Q0;

    /* renamed from: R0 */
    private LinearLayout f68012R0;

    /* renamed from: S0 */
    private LinearLayout f68013S0;

    /* renamed from: T0 */
    private LinearLayout f68014T0;

    /* renamed from: U0 */
    private LinearLayout f68015U0;

    /* renamed from: V0 */
    private LinearLayout f68016V0;

    /* renamed from: W0 */
    private LinearLayout f68017W0;

    /* renamed from: X0 */
    private LinearLayout f68018X0;

    /* renamed from: Y0 */
    private LinearLayout f68019Y0;

    /* renamed from: Z0 */
    private LinearLayout f68020Z0;

    /* renamed from: a1 */
    private LinearLayout f68021a1;

    /* renamed from: b1 */
    private LinearLayout f68022b1;

    /* renamed from: c1 */
    private LinearLayout f68023c1;

    /* renamed from: d1 */
    private ScrollViewVisibleChildViewDetector f68024d1;

    /* renamed from: e1 */
    HightLightSettingView f68025e1;

    /* renamed from: o1 */
    ActionBarMenuItem f68035o1;

    /* renamed from: p1 */
    C13306b f68036p1;

    /* renamed from: f1 */
    int f68026f1 = -1;

    /* renamed from: g1 */
    int f68027g1 = 0;

    /* renamed from: h1 */
    final sh0 f68028h1 = new sh0();

    /* renamed from: i1 */
    String f68029i1 = "";

    /* renamed from: j1 */
    final Object f68030j1 = new Object();

    /* renamed from: k1 */
    boolean f68031k1 = false;

    /* renamed from: l1 */
    private boolean f68032l1 = false;

    /* renamed from: m1 */
    private final Object f68033m1 = new Object();

    /* renamed from: n1 */
    boolean f68034n1 = false;

    /* renamed from: q1 */
    C13306b.c f68037q1 = new C13193d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingView$a */
    /* loaded from: classes6.dex */
    public class RunnableC13190a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f68038p;

        RunnableC13190a(View view) {
            this.f68038p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingView.this.f68028h1.m87411l(this.f68038p, this)) {
                    return;
                }
                SettingView settingView = SettingView.this;
                int i11 = settingView.f68026f1;
                if (i11 == 104) {
                    linearLayout = settingView.f68022b1;
                } else if (i11 != 109) {
                    switch (i11) {
                        case 37:
                            linearLayout = settingView.f68010P0;
                            break;
                        case 38:
                            linearLayout = settingView.f68011Q0;
                            break;
                        case 39:
                            linearLayout = settingView.f68020Z0;
                            break;
                        case 40:
                            linearLayout = settingView.f68012R0;
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                            linearLayout = settingView.f68013S0;
                            break;
                        case 42:
                            linearLayout = settingView.f68014T0;
                            break;
                        case 43:
                            linearLayout = settingView.f68015U0;
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                            linearLayout = settingView.f68016V0;
                            break;
                        case 45:
                            linearLayout = settingView.f68017W0;
                            break;
                        case 46:
                            linearLayout = settingView.f68018X0;
                            break;
                        case 47:
                            linearLayout = settingView.f68021a1;
                            break;
                        case 48:
                            linearLayout = settingView.f68019Y0;
                            break;
                        default:
                            linearLayout = null;
                            break;
                    }
                } else {
                    linearLayout = settingView.f68023c1;
                }
                SettingView settingView2 = SettingView.this;
                settingView2.f68028h1.m87409j(linearLayout, settingView2.f68025e1, settingView2.f68027g1);
                SettingView.this.m74267MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingView$b */
    /* loaded from: classes6.dex */
    public class C13191b implements InterfaceC20094a {
        C13191b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m74293e(boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            try {
                if (!SettingView.this.f72421L0.m92677nJ() && !SettingView.this.f72421L0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        bundle.putInt("source_type_change_phone", 1);
                        SettingView.this.f72421L0.m92676n2().mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    SettingView.this.f72421L0.m92662fJ().m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m74294f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (SettingView.this.f68030j1) {
                    SettingView settingView = SettingView.this;
                    settingView.f68031k1 = false;
                    settingView.f72421L0.mo49315c4();
                }
                if (SettingView.this.f72421L0.m92677nJ() || SettingView.this.f72421L0.m92681pJ() || AbstractC23216t1.m119643h(SettingView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.k0
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SettingView.C13191b.m74294f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final boolean z11;
            final boolean z12;
            final boolean z13;
            try {
                synchronized (SettingView.this.f68030j1) {
                    SettingView settingView = SettingView.this;
                    settingView.f68031k1 = false;
                    settingView.f72421L0.mo49315c4();
                }
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObject.optInt("error_code", -999) == 0 && optJSONObject != null) {
                        boolean optBoolean = optJSONObject.optBoolean("isset_pwd");
                        AbstractC23304d.f113346X0 = optBoolean ? 1 : 0;
                        AbstractC23309i.m122550wp(optBoolean ? 1 : 0);
                        if (optJSONObject.optInt("allow_change_phonenumber") == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (optJSONObject.optInt("unmap_profile", 0) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (optJSONObject.optInt("bypass_verify_pwd", 0) == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        final JSONArray optJSONArray = optJSONObject.optJSONArray("valid_error");
                        if (SettingView.this.f72421L0.m92676n2() != null) {
                            SettingView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.j0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingView.C13191b.this.m74293e(z11, z12, z13, optJSONArray);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingView$c */
    /* loaded from: classes6.dex */
    public class C13192c implements InterfaceC20094a {
        C13192c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m74300h() {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("password_mode", 0);
                bundle.putBoolean("logout_case", true);
                SettingView.this.f72421L0.m92662fJ().m93066i2(ChangePasswordView.class, bundle, 3231, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m74301i() {
            SettingView.this.f68029i1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap);
            SettingView.this.f72421L0.showDialog(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m74302j() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                SettingView.this.f72421L0.m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ void m74303k(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m74304l() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                SettingView.this.f72421L0.m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (AbstractC23216t1.m119643h(SettingView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.l0
                        @Override // me0.AbstractC23216t1.d
                        /* renamed from: a */
                        public final void mo68088a(String str) {
                            SettingView.C13192c.m74303k(str);
                        }
                    })) {
                        synchronized (SettingView.this.f68033m1) {
                            SettingView.this.f68032l1 = false;
                            SettingView.this.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    int m104491c = c20096c.m104491c();
                    if (m104491c != 2003 && m104491c != 2004 && m104491c != 2001 && m104491c != 2002 && m104491c != 2020 && m104491c != 2028) {
                        ToastUtils.m89263k(c20096c);
                        synchronized (SettingView.this.f68033m1) {
                            SettingView.this.f68032l1 = false;
                            SettingView.this.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    AbstractC23179p8.m119426l(CoreUtility.f89233i);
                    AbstractC20887g.m109232j(CoreUtility.f89233i, 9015, "", 0L, 9021, CoreUtility.f89236l);
                    AbstractC23148n.m118852z();
                    AbstractC23138m0.m118771c(false);
                    if (SettingView.this.f72421L0.m92676n2() != null) {
                        SettingView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.m0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingView.C13192c.this.m74304l();
                            }
                        });
                    }
                    synchronized (SettingView.this.f68033m1) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (SettingView.this.f68033m1) {
                        SettingView.this.f68032l1 = false;
                        SettingView.this.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (SettingView.this.f68033m1) {
                    SettingView.this.f68032l1 = false;
                    SettingView.this.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        i12 = optJSONObject.optInt("unmap_profile", 0);
                        i11 = optJSONObject.optInt("is_set", 1);
                    } else {
                        i11 = 1;
                        i12 = 0;
                    }
                    if (i11 == 0) {
                        if (SettingView.this.f72421L0.m92676n2() != null) {
                            SettingView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.n0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingView.C13192c.this.m74300h();
                                }
                            });
                        }
                    } else if (i12 == 1) {
                        if (SettingView.this.f72421L0.m92676n2() != null) {
                            SettingView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.o0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingView.C13192c.this.m74301i();
                                }
                            });
                        }
                    } else {
                        AbstractC23179p8.m119426l(CoreUtility.f89233i);
                        AbstractC20887g.m109232j(CoreUtility.f89233i, 9015, "", 0L, 9021, CoreUtility.f89236l);
                        AbstractC23148n.m118852z();
                        AbstractC23138m0.m118771c(false);
                        if (SettingView.this.f72421L0.m92676n2() != null) {
                            SettingView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.p0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingView.C13192c.this.m74302j();
                                }
                            });
                        }
                    }
                    synchronized (SettingView.this.f68033m1) {
                        SettingView.this.f68032l1 = false;
                        SettingView.this.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (SettingView.this.f68033m1) {
                        SettingView.this.f68032l1 = false;
                        SettingView.this.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (SettingView.this.f68033m1) {
                    SettingView.this.f68032l1 = false;
                    SettingView.this.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingView$d */
    /* loaded from: classes6.dex */
    class C13193d extends C13306b.c {
        C13193d() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: b */
        public void mo74255b(C26209i c26209i, String str, C28212v6 c28212v6) {
            boolean z11;
            if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131580f) {
                z11 = true;
            } else {
                z11 = false;
            }
            str.hashCode();
            if (str.equals("tip.suggestion.search.setting")) {
                SettingView.this.f68035o1.setEnableNoti(z11);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return new String[]{"tip.suggestion.search.setting"};
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if (!str.equals("tip.suggestion.search.setting")) {
                return null;
            }
            return new C26209i(SettingView.this.f68035o1);
        }
    }

    /* renamed from: AM */
    private void m74260AM() {
        try {
            if (this.f68020Z0.getTag() != null) {
                int intValue = ((Integer) this.f68020Z0.getTag()).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                C2556d.m12981o().m13007x(4);
                            }
                        } else {
                            C18389d.m97403c();
                        }
                    } else {
                        C22436h.f109760a.m115915G();
                    }
                } else {
                    AbstractC26084s.m134269q(0, 39);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: BM */
    private void m74261BM(View view) {
        try {
            if (this.f68026f1 >= 0) {
                view.postDelayed(new RunnableC13190a(view), 300L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CM */
    private void m74262CM(View view) {
        if (!C20912a.m109395e().m109406m()) {
            this.f68023c1.setVisibility(8);
            view.findViewById(AbstractC6918a0.line_setting_storage_usage).setVisibility(8);
        } else if (C20912a.m109395e().m109409p() && AbstractC23306f.m120567B1().m99704i()) {
            view.findViewById(AbstractC6918a0.iv_warning_storage).setVisibility(0);
        }
    }

    /* renamed from: EM */
    private void m74263EM() {
        m74266HM();
        AbstractC26084s.m134269q(0, 48);
        C0815e1.m2075D();
        C0815e1.m2079N(48, 1, 0, 0, 0);
        AbstractC23647d.m123897g("37800");
    }

    /* renamed from: FM */
    private void m74264FM(int i11) {
        if (i11 == 1) {
            AbstractC23647d.m123897g("37801");
            m74287yM();
        } else if (i11 == 2) {
            m74265GM();
        }
    }

    /* renamed from: GM */
    private void m74265GM() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SOURCE_ACTION", -1);
        C22438j.m115953v(m92693xK(), bundle);
    }

    /* renamed from: HM */
    private void m74266HM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        m92693xK().mo89694j2(LogoutConfirmView.class, bundle, 2212, "LogoutConfirmView", 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m74267MA() {
        this.f68026f1 = -1;
        this.f68027g1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m74268Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f68026f1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f68027g1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* renamed from: yM */
    private void m74287yM() {
        synchronized (this.f68033m1) {
            try {
                if (this.f68032l1) {
                    this.f72421L0.mo49282B8(null, false);
                    return;
                }
                this.f68032l1 = true;
                this.f72421L0.mo49282B8(null, false);
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C13192c());
                c0766k.mo1436G7();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public void m74288zM() {
        boolean z11;
        try {
            AbstractC26084s.m134251H(this.f68010P0, 37);
            AbstractC26084s.m134251H(this.f68011Q0, 38);
            boolean z12 = false;
            if (AbstractC26084s.m134251H(this.f68020Z0, 39) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC26084s.m134251H(this.f68012R0, 40);
            AbstractC26084s.m134251H(this.f68013S0, 41);
            AbstractC26084s.m134251H(this.f68014T0, 42);
            AbstractC26084s.m134251H(this.f68023c1, 109);
            AbstractC26084s.m134251H(this.f68015U0, 43);
            AbstractC26084s.m134251H(this.f68016V0, 44);
            AbstractC26084s.m134251H(this.f68017W0, 45);
            if (AbstractC26084s.m134251H(this.f68018X0, 46) != null) {
                z12 = true;
            }
            AbstractC26084s.m134251H(this.f68021a1, 47);
            AbstractC26084s.m134251H(this.f68019Y0, 48);
            AbstractC26084s.m134251H(this.f68022b1, 104);
            this.f68028h1.m87405e(this, 36);
            if (!z12) {
                AbstractC25598c.m132227a(this.f68018X0, AbstractC6918a0.icon_setting_reminder);
            }
            if (z11) {
                this.f68020Z0.setTag(1);
                return;
            }
            if (C22447s.m116040j(this.f68020Z0, AbstractC6918a0.icon_setting_reminder) >= 0) {
                this.f68020Z0.setTag(2);
                return;
            }
            if (C22436h.f109760a.m115922r()) {
                this.f68020Z0.setTag(null);
                return;
            }
            if (C22447s.m116036h(this.f68020Z0, AbstractC6918a0.icon_setting_reminder) >= 0) {
                this.f68020Z0.setTag(3);
                return;
            }
            if (C18389d.m97401a()) {
                this.f68020Z0.setTag(null);
            } else if (AbstractC2557e.m13010b(this.f68020Z0, AbstractC6918a0.icon_setting_reminder) >= 0) {
                this.f68020Z0.setTag(4);
            } else {
                this.f68020Z0.setTag(null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f68009r1, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m74268Vp();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 2) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.content_dialog_unmap, (ViewGroup) null, false);
        aVar.m43177z(inflate);
        if (!TextUtils.isEmpty(this.f68029i1)) {
            ((TextView) inflate.findViewById(AbstractC6918a0.tvContent)).setText(this.f68029i1);
        }
        inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(this);
        inflate.findViewById(AbstractC6918a0.btn_change_phone).setOnClickListener(this);
        inflate.findViewById(AbstractC6918a0.see_more).setOnClickListener(this);
        return aVar.m43152a();
    }

    /* renamed from: DM */
    void m74289DM(View view) {
        try {
            this.f68010P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_private);
            this.f68011Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_manage_account);
            this.f68012R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_notification);
            this.f68013S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_message);
            this.f68014T0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_call);
            this.f68020Z0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_backuprestore_message);
            this.f68015U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_timeline);
            this.f68016V0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_contact);
            this.f68017W0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_language);
            this.f68018X0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_about);
            this.f68019Y0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_logout);
            this.f68021a1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_switch_account);
            this.f68022b1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_theme);
            this.f68023c1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_storage_usage);
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.main_scroll_view);
            this.f68024d1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f68028h1.m87415u(this.f68024d1);
            this.f68010P0.setOnClickListener(this);
            this.f68011Q0.setOnClickListener(this);
            this.f68012R0.setOnClickListener(this);
            this.f68013S0.setOnClickListener(this);
            this.f68014T0.setOnClickListener(this);
            this.f68020Z0.setOnClickListener(this);
            this.f68015U0.setOnClickListener(this);
            this.f68016V0.setOnClickListener(this);
            this.f68017W0.setOnClickListener(this);
            this.f68018X0.setOnClickListener(this);
            this.f68019Y0.setOnClickListener(this);
            this.f68021a1.setOnClickListener(this);
            this.f68022b1.setOnClickListener(this);
            this.f68023c1.setOnClickListener(this);
            if (AbstractC23309i.m121529Vf()) {
                this.f68021a1.setVisibility(0);
                view.findViewById(AbstractC6918a0.line_switch_account).setVisibility(0);
            } else {
                this.f68021a1.setVisibility(8);
                view.findViewById(AbstractC6918a0.line_switch_account).setVisibility(8);
            }
            m74262CM(view);
            if (!AbstractC23306f.m120676j().m128396M()) {
                this.f68020Z0.setVisibility(8);
            } else {
                this.f68020Z0.setVisibility(0);
            }
            this.f68025e1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            m74261BM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (AbstractC23309i.m121011Hf() && actionBarMenu != null) {
            actionBarMenu.m92750r();
            this.f68035o1 = actionBarMenu.m92738e(AbstractC6918a0.menu_item_search, AbstractC16803z.icn_header_search);
            C13306b c13306b = this.f68036p1;
            if (c13306b != null) {
                c13306b.m74714z("tip.suggestion.search.setting", 200);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        m92637BK(true);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_view, viewGroup, false);
        m74289DM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f68028h1.m87408i());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m74268Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m74261BM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == 16908332) {
                if (this.f68032l1) {
                    return true;
                }
            } else if (i11 == AbstractC6918a0.menu_item_search) {
                AbstractC23647d.m123897g("800000");
                m92662fJ().m93069k2(SearchSettingView.class, null, 1, true);
                AbstractC28025b8.m141442M("tip.suggestion.search.setting");
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f68036p1;
        if (c13306b != null) {
            c13306b.m74709u();
        }
        this.f68028h1.m87414t();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m74288zM();
        AbstractC26084s.m134256d(this);
        C23744a.m124114c().m124115b(this, 6003);
        C23744a.m124114c().m124115b(this, 6024);
        C23744a.m124114c().m124115b(this, 6026);
        C23744a.m124114c().m124115b(this, 6025);
        C13306b c13306b = this.f68036p1;
        if (c13306b != null) {
            c13306b.m74697c(this.f68037q1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        C23744a.m124114c().m124117e(this, 6003);
        C23744a.m124114c().m124117e(this, 6024);
        C23744a.m124114c().m124117e(this, 6025);
        C23744a.m124114c().m124117e(this, 6026);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f68024d1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
        C13306b c13306b = this.f68036p1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (!z12 || this.f72421L0.m92683qJ()) {
                this.f68036p1.m74699e("tip.any");
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        C13306b c13306b = new C13306b(m92648SI());
        this.f68036p1 = c13306b;
        c13306b.m74687C((ViewGroup) m92656bJ());
    }

    /* renamed from: a7 */
    void m74290a7() {
        try {
            synchronized (this.f68030j1) {
                try {
                    if (this.f68031k1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    synchronized (this.f68030j1) {
                        this.f68031k1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C13191b());
                    c0766k.mo1743t7(1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_setting_private) {
            return 37;
        }
        if (i11 == AbstractC6918a0.ll_setting_manage_account) {
            return 38;
        }
        if (i11 == AbstractC6918a0.ll_setting_backuprestore_message) {
            return 39;
        }
        if (i11 == AbstractC6918a0.ll_setting_notification) {
            return 40;
        }
        if (i11 == AbstractC6918a0.ll_setting_message) {
            return 41;
        }
        if (i11 == AbstractC6918a0.ll_setting_call) {
            return 42;
        }
        if (i11 == AbstractC6918a0.ll_setting_storage_usage) {
            return 109;
        }
        if (i11 == AbstractC6918a0.ll_setting_timeline) {
            return 43;
        }
        if (i11 == AbstractC6918a0.ll_setting_contact) {
            return 44;
        }
        if (i11 == AbstractC6918a0.ll_setting_language) {
            return 45;
        }
        if (i11 == AbstractC6918a0.ll_setting_about) {
            return 46;
        }
        if (i11 == AbstractC6918a0.ll_switch_account) {
            return 47;
        }
        if (i11 == AbstractC6918a0.ll_setting_logout) {
            return 48;
        }
        return i11 == AbstractC6918a0.ll_setting_theme ? 104 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f68009r1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == 2212) {
                m74264FM(i12);
            } else if (i11 == 3231 && i12 == -1) {
                m74287yM();
            } else {
                super.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.ll_setting_private) {
            this.f72421L0.m92662fJ().m93069k2(SettingPrivateView.class, null, 1, true);
            C0815e1.m2079N(37, 1, 0, 0, 0);
            C32017m4.m154326S().m154359e0("37000");
            AbstractC26084s.m134269q(0, 37);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_manage_account) {
            this.f72421L0.m92662fJ().m93069k2(SettingAccountAndSecurityView.class, null, 1, true);
            C0815e1.m2079N(38, 1, 0, 0, 0);
            C32017m4.m154326S().m154359e0("37100");
            AbstractC26084s.m134269q(0, 38);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_notification) {
            this.f72421L0.m92662fJ().m93069k2(SettingNotificationView.class, null, 1, true);
            C0815e1.m2079N(40, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37200");
            AbstractC23647d.m123893c();
            AbstractC26084s.m134269q(0, 40);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_theme) {
            this.f72421L0.m92662fJ().m93069k2(SettingDarkModeView.class, null, 1, true);
            C0815e1.m2079N(104, 1, 0, 0, 0);
            AbstractC23647d.m123897g("37182");
            AbstractC26084s.m134269q(0, 104);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_message) {
            this.f72421L0.m92662fJ().m93069k2(SettingMessageView.class, null, 1, true);
            C0815e1.m2079N(41, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37300");
            AbstractC23647d.m123893c();
            AbstractC26084s.m134269q(0, 41);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_call) {
            this.f72421L0.m92662fJ().m93069k2(SettingCallView.class, null, 1, true);
            C0815e1.m2079N(42, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37900");
            AbstractC23647d.m123893c();
            AbstractC26084s.m134269q(0, 42);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_timeline) {
            this.f72421L0.m92662fJ().m93069k2(SettingTimelineV2View.class, null, 1, true);
            C0815e1.m2079N(43, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37400");
            AbstractC23647d.m123893c();
            AbstractC26084s.m134269q(0, 43);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_contact) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SETTING", 2);
            this.f72421L0.m92662fJ().m93069k2(SettingPrivacyNewView.class, bundle, 1, true);
            C0815e1.m2079N(44, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37500");
            AbstractC23647d.m123893c();
            AbstractC26084s.m134269q(0, 44);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_language) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("EXTRA_SETTING", 3);
            this.f72421L0.m92662fJ().m93069k2(SettingPrivacyNewView.class, bundle2, 1, true);
            C0815e1.m2079N(45, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37600");
            AbstractC23647d.m123893c();
            AbstractC26084s.m134269q(0, 45);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_about) {
            this.f72421L0.m92662fJ().m93069k2(AboutView.class, null, 1, true);
            C0815e1.m2079N(46, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37700");
            AbstractC23647d.m123893c();
            AbstractC26084s.m134269q(0, 46);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_logout) {
            m74263EM();
            return;
        }
        if (id2 == AbstractC6918a0.ll_switch_account) {
            AbstractC23647d.m123897g("36001");
            this.f72421L0.m92676n2().mo35573l4(SwitchAccountView.class, null, 1, true);
            C0815e1.m2079N(47, 1, 0, 0, 0);
            AbstractC26084s.m134269q(0, 47);
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_backuprestore_message) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("EXTRA_SOURCE_ACTION", C2556d.m12981o().m12999m() ? 1 : 0);
            C22438j.m115953v(this.f72421L0.m92662fJ(), bundle3);
            C0815e1.m2079N(39, 1, 0, 0, 0);
            AbstractC23647d.m123906p("37802");
            AbstractC23647d.m123893c();
            m74260AM();
            return;
        }
        if (id2 == AbstractC6918a0.btn_change_phone) {
            this.f72421L0.removeDialog(2);
            m74290a7();
            AbstractC23647d.m123897g("199719");
            return;
        }
        if (id2 == AbstractC6918a0.btn_close) {
            this.f72421L0.removeDialog(2);
            AbstractC23647d.m123897g("199720");
            return;
        }
        if (id2 == AbstractC6918a0.see_more) {
            this.f72421L0.removeDialog(2);
            Bundle bundle4 = new Bundle();
            bundle4.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
            ZaloWebView.m87105iS(this.f72421L0.m92676n2(), AbstractC23306f.m120583H().m110204g().f110080o, bundle4);
            AbstractC23647d.m123897g("199718");
            return;
        }
        if (id2 == AbstractC6918a0.ll_setting_storage_usage) {
            if (C20912a.m109395e().m109405l()) {
                this.f72421L0.m92662fJ().m93069k2(ToolStorageView.class, null, 1, true);
            } else {
                this.f72421L0.m92662fJ().m93069k2(StorageSummaryView.class, null, 1, true);
            }
            C0815e1.m2079N(109, 1, 0, 0, 0);
            AbstractC26084s.m134269q(0, 109);
            AbstractC23647d.m123897g("711220");
            C31747a.m152721t("setting");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f68032l1) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f68036p1;
        if (c13306b != null) {
            c13306b.m74710v();
        }
        this.f68028h1.m87413s();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 6000 && i11 != 6003) {
            switch (i11) {
                case 6024:
                case 6025:
                case 6026:
                    break;
                default:
                    return;
            }
        }
        if (m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.f7
                @Override // java.lang.Runnable
                public final void run() {
                    SettingView.this.m74288zM();
                }
            });
        }
    }
}
