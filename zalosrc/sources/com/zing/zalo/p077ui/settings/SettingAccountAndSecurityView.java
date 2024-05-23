package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.bottomsheet.LogoutConfirmView;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.AuthorisedAppsView;
import com.zing.zalo.p077ui.zviews.CancelDeactivateAccountView;
import com.zing.zalo.p077ui.zviews.ChangePasswordView;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.DeactivateAccountView;
import com.zing.zalo.p077ui.zviews.HistoryLoginView;
import com.zing.zalo.p077ui.zviews.NotChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.PassCodeSettingView;
import com.zing.zalo.p077ui.zviews.PasscodeView;
import com.zing.zalo.p077ui.zviews.SettingSecurityView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23148n;
import me0.AbstractC23165o5;
import me0.AbstractC23179p8;
import me0.AbstractC23216t1;
import me0.AbstractC23217t2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p00.C24594a;
import p133ek.AbstractC18458a;
import p248iy.AbstractC20887g;
import p320ld.C22438j;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;

/* loaded from: classes6.dex */
public class SettingAccountAndSecurityView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: A1 */
    public static boolean f67618A1 = false;

    /* renamed from: P0 */
    LinearLayout f67619P0;

    /* renamed from: Q0 */
    LinearLayout f67620Q0;

    /* renamed from: R0 */
    LinearLayout f67621R0;

    /* renamed from: S0 */
    LinearLayout f67622S0;

    /* renamed from: T0 */
    LinearLayout f67623T0;

    /* renamed from: U0 */
    LinearLayout f67624U0;

    /* renamed from: V0 */
    LinearLayout f67625V0;

    /* renamed from: W0 */
    LinearLayout f67626W0;

    /* renamed from: X0 */
    LinearLayout f67627X0;

    /* renamed from: Y0 */
    LinearLayout f67628Y0;

    /* renamed from: Z0 */
    StencilSwitch f67629Z0;

    /* renamed from: a1 */
    TextView f67630a1;

    /* renamed from: b1 */
    TextView f67631b1;

    /* renamed from: c1 */
    ScrollViewVisibleChildViewDetector f67632c1;

    /* renamed from: d1 */
    HightLightSettingView f67633d1;

    /* renamed from: i1 */
    private BiometricWrapper f67638i1;

    /* renamed from: e1 */
    int f67634e1 = -1;

    /* renamed from: f1 */
    int f67635f1 = 0;

    /* renamed from: g1 */
    final sh0 f67636g1 = new sh0();

    /* renamed from: h1 */
    private int f67637h1 = 0;

    /* renamed from: j1 */
    private int f67639j1 = 0;

    /* renamed from: k1 */
    private boolean f67640k1 = false;

    /* renamed from: l1 */
    private final InterfaceC0765j f67641l1 = new C0766k();

    /* renamed from: m1 */
    private final InterfaceC20094a f67642m1 = new C13130b();

    /* renamed from: n1 */
    private int f67643n1 = -1;

    /* renamed from: o1 */
    private int f67644o1 = -1;

    /* renamed from: p1 */
    private boolean f67645p1 = false;

    /* renamed from: q1 */
    private final InterfaceC0765j f67646q1 = new C0766k();

    /* renamed from: r1 */
    private final InterfaceC20094a f67647r1 = new C13131c();

    /* renamed from: s1 */
    String f67648s1 = "";

    /* renamed from: t1 */
    boolean f67649t1 = false;

    /* renamed from: u1 */
    boolean f67650u1 = false;

    /* renamed from: v1 */
    final Object f67651v1 = new Object();

    /* renamed from: w1 */
    boolean f67652w1 = false;

    /* renamed from: x1 */
    private boolean f67653x1 = false;

    /* renamed from: y1 */
    private final Object f67654y1 = new Object();

    /* renamed from: z1 */
    boolean f67655z1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$a */
    /* loaded from: classes6.dex */
    public class C13129a extends BiometricWrapper.AbstractC7309a {

        /* renamed from: a */
        final /* synthetic */ int f67656a;

        C13129a(int i11) {
            this.f67656a = i11;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            super.mo37276a(i11, charSequence);
            if (i11 != 5 && i11 != 10) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo));
            }
            SettingAccountAndSecurityView.this.f67637h1 = 0;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: b */
        public void mo37277b() {
            super.mo37277b();
            SettingAccountAndSecurityView.this.f67637h1++;
            if (SettingAccountAndSecurityView.this.f67637h1 >= 3) {
                SettingAccountAndSecurityView.this.f67638i1.m37274c();
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            super.mo37278c(c7310b);
            SettingAccountAndSecurityView.this.f67637h1 = 0;
            if (this.f67656a == 126) {
                SettingAccountAndSecurityView.this.m73716KM();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$b */
    /* loaded from: classes6.dex */
    class C13130b implements InterfaceC20094a {
        C13130b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingAccountAndSecurityView.this.f67640k1 = false;
            SettingAccountAndSecurityView.this.m73715JM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingAccountAndSecurityView.this.f67640k1 = false;
            AbstractC23309i.m122552wr(System.currentTimeMillis());
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                AbstractC23148n.m118844r(jSONObject);
                if (!jSONObject.isNull("privacy")) {
                    AbstractC23309i.m122593xv("GET_SUCCESSFUL");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            SettingAccountAndSecurityView.this.m73715JM();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$c */
    /* loaded from: classes6.dex */
    class C13131c implements InterfaceC20094a {
        C13131c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    SettingAccountAndSecurityView.this.m73715JM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingAccountAndSecurityView.this.f67645p1 = false;
                SettingAccountAndSecurityView.this.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingAccountAndSecurityView.this.f67645p1 = false;
                SettingAccountAndSecurityView.this.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    AbstractC23148n.m118851y(SettingAccountAndSecurityView.this.f67643n1, SettingAccountAndSecurityView.this.f67644o1, SettingAccountAndSecurityView.this.f67643n1);
                    SettingAccountAndSecurityView.this.m73715JM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingAccountAndSecurityView.this.f67645p1 = false;
                SettingAccountAndSecurityView.this.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$d */
    /* loaded from: classes6.dex */
    public class RunnableC13132d implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f67660p;

        RunnableC13132d(View view) {
            this.f67660p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingAccountAndSecurityView.this.f67636g1.m87411l(this.f67660p, this)) {
                    return;
                }
                SettingAccountAndSecurityView settingAccountAndSecurityView = SettingAccountAndSecurityView.this;
                int i11 = settingAccountAndSecurityView.f67634e1;
                if (i11 != 90) {
                    if (i11 != 121) {
                        if (i11 != 126) {
                            switch (i11) {
                                case 51:
                                    linearLayout = settingAccountAndSecurityView.f67620Q0;
                                    break;
                                case 52:
                                    linearLayout = settingAccountAndSecurityView.f67624U0;
                                    break;
                                case 53:
                                    linearLayout = settingAccountAndSecurityView.f67619P0;
                                    break;
                                case 54:
                                    linearLayout = settingAccountAndSecurityView.f67621R0;
                                    break;
                                case 55:
                                    linearLayout = settingAccountAndSecurityView.f67622S0;
                                    break;
                                case 56:
                                    linearLayout = settingAccountAndSecurityView.f67626W0;
                                    break;
                                case 57:
                                    linearLayout = settingAccountAndSecurityView.f67625V0;
                                    break;
                                default:
                                    linearLayout = null;
                                    break;
                            }
                        } else {
                            linearLayout = settingAccountAndSecurityView.f67628Y0;
                        }
                    } else {
                        linearLayout = settingAccountAndSecurityView.f67627X0;
                    }
                } else {
                    linearLayout = settingAccountAndSecurityView.f67623T0;
                }
                settingAccountAndSecurityView.f67636g1.m87409j(linearLayout, settingAccountAndSecurityView.f67633d1, settingAccountAndSecurityView.f67635f1);
                SettingAccountAndSecurityView.this.m73717MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$e */
    /* loaded from: classes6.dex */
    public class C13133e implements InterfaceC20094a {
        C13133e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m73746e(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.optInt("unmap_profile", 0) == 1) {
                        SettingAccountAndSecurityView.this.f67648s1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap_deactivate_account);
                        SettingAccountAndSecurityView.this.f72421L0.showDialog(3);
                        return;
                    }
                    if (AbstractC23304d.f113346X0 == 1) {
                        int optInt = jSONObject.optInt("deactivate_status", 0);
                        if (optInt == 0) {
                            SettingAccountAndSecurityView.this.f72421L0.m92676n2().mo35579p().m93069k2(DeactivateAccountView.class, null, 1, true);
                            return;
                        }
                        if (optInt == 1) {
                            AbstractC23647d.m123897g("36020");
                            long optLong = jSONObject.optLong("deactivate_datetime");
                            String optString = jSONObject.optString("deactivate_msg");
                            long optLong2 = jSONObject.optLong("confirm_time");
                            long optLong3 = jSONObject.optLong("current_time");
                            if (optLong2 > 0 && optLong > 0) {
                                Bundle bundle = new Bundle();
                                bundle.putString("EXTRA_DEACTIVATE_MESSAGE", optString);
                                bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_DATETIME", optLong);
                                bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_CONFIRMTIME", optLong2);
                                bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME", optLong3);
                                bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME_CLIENT", SystemClock.uptimeMillis());
                                bundle.putInt("source_action_cancel_deactivate", 0);
                                SettingAccountAndSecurityView.this.f72421L0.m92676n2().mo35579p().m93069k2(CancelDeactivateAccountView.class, bundle, 1, true);
                                return;
                            }
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.UNKNOWN_EXCEPTION_MSG));
                            return;
                        }
                        if (optInt == 2) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.acccount_has_been_deactivated));
                            return;
                        }
                        return;
                    }
                    SettingAccountAndSecurityView.this.f72421L0.removeDialog(1);
                    SettingAccountAndSecurityView.this.f72421L0.showDialog(1);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m73747f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (!SettingAccountAndSecurityView.this.f72421L0.m92677nJ() && !SettingAccountAndSecurityView.this.f72421L0.m92681pJ() && !AbstractC23216t1.m119643h(SettingAccountAndSecurityView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.g
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SettingAccountAndSecurityView.C13133e.m73747f(str);
                    }
                })) {
                    ToastUtils.m89265m(c20096c);
                }
            } finally {
                SettingAccountAndSecurityView settingAccountAndSecurityView = SettingAccountAndSecurityView.this;
                settingAccountAndSecurityView.f67649t1 = false;
                settingAccountAndSecurityView.f72421L0.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    final JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    if (jSONObject != null) {
                        i11 = jSONObject.optInt("is_set");
                    } else {
                        i11 = 0;
                    }
                    AbstractC23304d.f113346X0 = i11;
                    AbstractC23309i.m122550wp(i11);
                    if (SettingAccountAndSecurityView.this.f72421L0.m92676n2() != null) {
                        SettingAccountAndSecurityView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingAccountAndSecurityView.C13133e.this.m73746e(jSONObject);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingAccountAndSecurityView settingAccountAndSecurityView = SettingAccountAndSecurityView.this;
                settingAccountAndSecurityView.f67649t1 = false;
                settingAccountAndSecurityView.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                SettingAccountAndSecurityView settingAccountAndSecurityView2 = SettingAccountAndSecurityView.this;
                settingAccountAndSecurityView2.f67649t1 = false;
                settingAccountAndSecurityView2.f72421L0.mo49315c4();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$f */
    /* loaded from: classes6.dex */
    public class C13134f implements InterfaceC20094a {
        C13134f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m73749d() {
            try {
                TextView textView = SettingAccountAndSecurityView.this.f67631b1;
                if (textView != null) {
                    if (SettingAccountAndSecurityView.f67618A1) {
                        textView.setVisibility(8);
                        return;
                    }
                    String str = AbstractC23304d.f113368c0.f42455y;
                    if (!TextUtils.isEmpty(str)) {
                        str = AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
                    }
                    if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                        SettingAccountAndSecurityView.this.f67631b1.setText(str);
                        SettingAccountAndSecurityView.this.f67631b1.setVisibility(0);
                    } else {
                        SettingAccountAndSecurityView.this.f67631b1.setVisibility(8);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                boolean z11 = false;
                if (optJSONObject != null && optJSONObject.optInt("unmap_profile", 0) == 1) {
                    z11 = true;
                }
                SettingAccountAndSecurityView.f67618A1 = z11;
                if (SettingAccountAndSecurityView.this.f72421L0.m92648SI() != null) {
                    SettingAccountAndSecurityView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingAccountAndSecurityView.C13134f.this.m73749d();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$g */
    /* loaded from: classes6.dex */
    public class C13135g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f67664a;

        /* renamed from: b */
        final /* synthetic */ boolean f67665b;

        C13135g(boolean z11, boolean z12) {
            this.f67664a = z11;
            this.f67665b = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m73752e(JSONObject jSONObject, boolean z11, boolean z12) {
            int i11;
            boolean z13 = true;
            if (jSONObject != null) {
                try {
                } catch (Exception e11) {
                    e = e11;
                    z13 = false;
                    e.printStackTrace();
                    if (z13) {
                    }
                    SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                }
                if (jSONObject.optInt("unmap_profile", 0) == 1) {
                    SettingAccountAndSecurityView settingAccountAndSecurityView = SettingAccountAndSecurityView.this;
                    if (z11) {
                        i11 = AbstractC8020f0.str_content_dialog_unmap_change_pass;
                    } else {
                        i11 = AbstractC8020f0.str_content_dialog_unmap_deactivate_account;
                    }
                    settingAccountAndSecurityView.f67648s1 = AbstractC23136l9.m118743r0(i11);
                    SettingAccountAndSecurityView.this.f72421L0.showDialog(3);
                    SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                }
            }
            if (z11) {
                Bundle bundle = new Bundle();
                int i12 = AbstractC23304d.f113346X0;
                if (i12 == 1) {
                    bundle.putInt("password_mode", 3);
                } else if (i12 == 0) {
                    bundle.putInt("password_mode", 1);
                }
                SettingAccountAndSecurityView.this.f72421L0.m92662fJ().m93069k2(ChangePasswordView.class, bundle, 1, true);
            } else if (z12) {
                if (AbstractC23304d.f113346X0 == 0) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("extra_switch_account", true);
                    bundle2.putInt("password_mode", 1);
                    SettingAccountAndSecurityView.this.f72421L0.m92662fJ().m93069k2(ChangePasswordView.class, bundle2, 1, true);
                } else {
                    SettingAccountAndSecurityView.this.f72421L0.m92676n2().mo35579p().m93069k2(SwitchAccountView.class, null, 1, true);
                }
            } else {
                if (AbstractC23304d.f113346X0 == 1) {
                    try {
                        SettingAccountAndSecurityView.this.m73742xM();
                        return;
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        if (z13) {
                            return;
                        }
                        SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                    }
                }
                SettingAccountAndSecurityView.this.f72421L0.removeDialog(1);
                SettingAccountAndSecurityView.this.f72421L0.showDialog(1);
            }
            SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m73753f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (!SettingAccountAndSecurityView.this.f72421L0.m92677nJ() && !SettingAccountAndSecurityView.this.f72421L0.m92681pJ() && !AbstractC23216t1.m119643h(SettingAccountAndSecurityView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.k
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SettingAccountAndSecurityView.C13135g.m73753f(str);
                    }
                })) {
                    if (c20096c != null) {
                        ToastUtils.m89263k(c20096c);
                    }
                }
            } finally {
                SettingAccountAndSecurityView settingAccountAndSecurityView = SettingAccountAndSecurityView.this;
                settingAccountAndSecurityView.f67650u1 = false;
                settingAccountAndSecurityView.f72421L0.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    final JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        i11 = optJSONObject.optInt("is_set");
                    } else {
                        i11 = 0;
                    }
                    AbstractC23304d.f113346X0 = i11;
                    AbstractC23309i.m122550wp(i11);
                    if (SettingAccountAndSecurityView.this.f72421L0.m92648SI() != null) {
                        InterfaceC27218a m92676n2 = SettingAccountAndSecurityView.this.f72421L0.m92676n2();
                        final boolean z11 = this.f67664a;
                        final boolean z12 = this.f67665b;
                        m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingAccountAndSecurityView.C13135g.this.m73752e(optJSONObject, z11, z12);
                            }
                        });
                    } else {
                        SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                }
                SettingAccountAndSecurityView.this.f67650u1 = false;
            } catch (Throwable th2) {
                SettingAccountAndSecurityView.this.f67650u1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$h */
    /* loaded from: classes6.dex */
    public class C13136h implements InterfaceC20094a {
        C13136h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m73756e(boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            try {
                if (!SettingAccountAndSecurityView.this.f72421L0.m92677nJ() && !SettingAccountAndSecurityView.this.f72421L0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        bundle.putInt("source_type_change_phone", 1);
                        SettingAccountAndSecurityView.this.f72421L0.m92676n2().mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    SettingAccountAndSecurityView.this.f72421L0.m92662fJ().m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m73757f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (SettingAccountAndSecurityView.this.f67651v1) {
                    SettingAccountAndSecurityView settingAccountAndSecurityView = SettingAccountAndSecurityView.this;
                    settingAccountAndSecurityView.f67652w1 = false;
                    settingAccountAndSecurityView.f72421L0.mo49315c4();
                }
                if (SettingAccountAndSecurityView.this.f72421L0.m92677nJ() || SettingAccountAndSecurityView.this.f72421L0.m92681pJ() || AbstractC23216t1.m119643h(SettingAccountAndSecurityView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.m
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SettingAccountAndSecurityView.C13136h.m73757f(str);
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
                synchronized (SettingAccountAndSecurityView.this.f67651v1) {
                    SettingAccountAndSecurityView settingAccountAndSecurityView = SettingAccountAndSecurityView.this;
                    settingAccountAndSecurityView.f67652w1 = false;
                    settingAccountAndSecurityView.f72421L0.mo49315c4();
                }
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObject.optInt("error_code", -999) == 0 && optJSONObject != null) {
                        boolean optBoolean = optJSONObject.optBoolean("isset_pwd");
                        AbstractC23304d.f113346X0 = optBoolean ? 1 : 0;
                        AbstractC23309i.m122550wp(optBoolean ? 1 : 0);
                        if (optJSONObject.optInt("allow_change_phonenumber", 0) == 1) {
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
                        if (SettingAccountAndSecurityView.this.f72421L0.m92676n2() != null) {
                            SettingAccountAndSecurityView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingAccountAndSecurityView.C13136h.this.m73756e(z11, z12, z13, optJSONArray);
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
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$i */
    /* loaded from: classes6.dex */
    public class C13137i implements InterfaceC20094a {
        C13137i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m73763h() {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("password_mode", 0);
                bundle.putBoolean("logout_case", true);
                SettingAccountAndSecurityView.this.f72421L0.m92662fJ().m93066i2(ChangePasswordView.class, bundle, 3231, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m73764i() {
            SettingAccountAndSecurityView.this.f67648s1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap);
            SettingAccountAndSecurityView.this.f72421L0.showDialog(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m73765j() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                SettingAccountAndSecurityView.this.f72421L0.m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ void m73766k(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m73767l() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                SettingAccountAndSecurityView.this.f72421L0.m92662fJ().m93069k2(StartUpNewView.class, bundle, 2, true);
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
                    if (AbstractC23216t1.m119643h(SettingAccountAndSecurityView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.n
                        @Override // me0.AbstractC23216t1.d
                        /* renamed from: a */
                        public final void mo68088a(String str) {
                            SettingAccountAndSecurityView.C13137i.m73766k(str);
                        }
                    })) {
                        synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                            SettingAccountAndSecurityView.this.f67653x1 = false;
                            SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    int m104491c = c20096c.m104491c();
                    if (m104491c != 2003 && m104491c != 2004 && m104491c != 2001 && m104491c != 2002 && m104491c != 2020 && m104491c != 2028) {
                        ToastUtils.m89263k(c20096c);
                        synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                            SettingAccountAndSecurityView.this.f67653x1 = false;
                            SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                        }
                        return;
                    }
                    AbstractC23179p8.m119426l(CoreUtility.f89233i);
                    AbstractC20887g.m109232j(CoreUtility.f89233i, 9015, "", 0L, 9021, CoreUtility.f89236l);
                    AbstractC23148n.m118852z();
                    AbstractC23138m0.m118771c(false);
                    if (SettingAccountAndSecurityView.this.f72421L0.m92676n2() != null) {
                        SettingAccountAndSecurityView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingAccountAndSecurityView.C13137i.this.m73767l();
                            }
                        });
                    }
                    synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                        SettingAccountAndSecurityView.this.f67653x1 = false;
                        SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                    SettingAccountAndSecurityView.this.f67653x1 = false;
                    SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
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
                        if (SettingAccountAndSecurityView.this.f72421L0.m92676n2() != null) {
                            SettingAccountAndSecurityView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingAccountAndSecurityView.C13137i.this.m73763h();
                                }
                            });
                        }
                    } else if (i12 == 1) {
                        if (SettingAccountAndSecurityView.this.f72421L0.m92676n2() != null) {
                            SettingAccountAndSecurityView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.q
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingAccountAndSecurityView.C13137i.this.m73764i();
                                }
                            });
                        }
                    } else {
                        AbstractC23179p8.m119426l(CoreUtility.f89233i);
                        AbstractC20887g.m109232j(CoreUtility.f89233i, 9015, "", 0L, 9021, CoreUtility.f89236l);
                        AbstractC23148n.m118852z();
                        AbstractC23138m0.m118771c(false);
                        if (SettingAccountAndSecurityView.this.f72421L0.m92676n2() != null) {
                            SettingAccountAndSecurityView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SettingAccountAndSecurityView.C13137i.this.m73765j();
                                }
                            });
                        }
                    }
                    synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                        SettingAccountAndSecurityView.this.f67653x1 = false;
                        SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                        SettingAccountAndSecurityView.this.f67653x1 = false;
                        SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                    }
                }
            } catch (Throwable th2) {
                synchronized (SettingAccountAndSecurityView.this.f67654y1) {
                    SettingAccountAndSecurityView.this.f67653x1 = false;
                    SettingAccountAndSecurityView.this.f72421L0.mo49315c4();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityView$j */
    /* loaded from: classes6.dex */
    public class C13138j implements InterfaceC20094a {

        /* renamed from: a */
        String f67669a = "";

        C13138j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m73769d(long j11) {
            if (!TextUtils.isEmpty(this.f67669a) && C23793c.m124316k().mo124314i() <= j11) {
                SettingAccountAndSecurityView.this.f67630a1.setText(this.f67669a);
                SettingAccountAndSecurityView.this.f67630a1.setVisibility(0);
            } else {
                SettingAccountAndSecurityView.this.f67630a1.setVisibility(8);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingAccountAndSecurityView.this.f67655z1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("subTitle");
                    String str = "";
                    if (optJSONObject2 != null && optJSONObject2.has("vi")) {
                        this.f67669a = optJSONObject2.optString(AbstractC18458a.f93019a, "");
                    }
                    final long optLong = optJSONObject.optLong("endTime", 0L);
                    AbstractC0924m0.m4001lp(optLong);
                    SettingAccountAndSecurityView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.settings.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingAccountAndSecurityView.C13138j.this.m73769d(optLong);
                        }
                    });
                    if (optJSONObject2 != null) {
                        str = optJSONObject2.toString();
                    }
                    AbstractC0924m0.m3177Jo(str);
                    AbstractC0924m0.m3784ei(true);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingAccountAndSecurityView.this.f67655z1 = false;
            } catch (Throwable th2) {
                SettingAccountAndSecurityView.this.f67655z1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: AM */
    private void m73707AM(View view) {
        if (this.f67634e1 >= 0) {
            view.postDelayed(new RunnableC13132d(view), 300L);
        }
    }

    /* renamed from: CM */
    private void m73708CM() {
        m73713HM();
        AbstractC26084s.m134269q(0, 57);
        C0815e1.m2075D();
        C0815e1.m2079N(57, 1, 0, 0, 0);
    }

    /* renamed from: DM */
    private void m73709DM(int i11) {
        if (i11 == 1) {
            m73735vM();
        } else if (i11 == 2) {
            m73710EM();
        }
    }

    /* renamed from: EM */
    private void m73710EM() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SOURCE_ACTION", -1);
        C22438j.m115953v(m92693xK(), bundle);
    }

    /* renamed from: FM */
    private void m73711FM(int i11) {
        this.f67638i1 = new BiometricWrapper(getContext(), AbstractC1388a.m6967i(getContext()), new C13129a(i11));
        try {
            if (m92648SI() instanceof ZaloActivity) {
                this.f67638i1.m37275d(((ZaloActivity) m92648SI()).getLifecycle());
            }
            this.f67638i1.m37273a(new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37296f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel)).m37293c(false).m37298h(true).m37291a(), null, false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo));
        }
    }

    /* renamed from: GM */
    private void m73712GM() {
        this.f72421L0.showDialog(4);
    }

    /* renamed from: HM */
    private void m73713HM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        m92693xK().mo89694j2(LogoutConfirmView.class, bundle, 2212, "LogoutConfirmView", 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public void m73714IM() {
        try {
            StencilSwitch stencilSwitch = this.f67629Z0;
            boolean z11 = true;
            if (AbstractC0924m0.m3240M0() != 1) {
                z11 = false;
            }
            stencilSwitch.setChecked(z11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public void m73715JM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: la0.h1
                @Override // java.lang.Runnable
                public final void run() {
                    SettingAccountAndSecurityView.this.m73714IM();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public void m73716KM() {
        this.f67629Z0.setChecked(false);
        m73728o3(43, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m73717MA() {
        this.f67634e1 = -1;
        this.f67635f1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m73718Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f67634e1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f67635f1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* renamed from: Vx */
    private void m73719Vx() {
        if (this.f67640k1) {
            return;
        }
        if (C23055e5.m118271f()) {
            this.f67640k1 = true;
            this.f67641l1.mo1704o8(this.f67642m1);
            this.f67641l1.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        this.f67640k1 = false;
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
        m73715JM();
    }

    /* renamed from: o3 */
    private void m73728o3(int i11, int i12) {
        try {
            if (this.f67645p1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67643n1 = i11;
                this.f67644o1 = i12;
                this.f67645p1 = true;
                this.f67646q1.mo1704o8(this.f67647r1);
                this.f67646q1.mo1699o3(i11, i12);
            } else {
                this.f67645p1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m73714IM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    private void m73735vM() {
        synchronized (this.f67654y1) {
            try {
                if (this.f67653x1) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                this.f67653x1 = true;
                this.f72421L0.mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C13137i());
                c0766k.mo1436G7();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public void m73736wM() {
        try {
            AbstractC26084s.m134251H(this.f67620Q0, 51);
            AbstractC26084s.m134251H(this.f67624U0, 52);
            AbstractC26084s.m134251H(this.f67619P0, 53);
            AbstractC26084s.m134251H(this.f67621R0, 54);
            AbstractC26084s.m134251H(this.f67622S0, 55);
            AbstractC26084s.m134251H(this.f67626W0, 56);
            AbstractC26084s.m134251H(this.f67625V0, 57);
            AbstractC26084s.m134251H(this.f67623T0, 90);
            AbstractC26084s.m134251H(this.f67627X0, 121);
            AbstractC26084s.m134251H(this.f67628Y0, 126);
            this.f67636g1.m87405e(this, 38);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingAccountAndSecurityView", e11);
        }
    }

    /* renamed from: yM */
    private CharSequence m73737yM(int i11) {
        String m118743r0;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_desc);
        if (i11 != 1) {
            if (i11 != 2) {
                m118743r0 = "";
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_passcode_security);
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric_security);
        }
        if (!TextUtils.isEmpty(m118743r0)) {
            String str = m118743r02 + "\n\n";
            int length = str.length();
            String str2 = str + AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_note);
            int indexOf = str2.indexOf("#x#");
            if (indexOf >= 0) {
                str2 = str2.replace("#x#", "");
            }
            int indexOf2 = str2.indexOf("%1$s");
            if (indexOf2 >= 0) {
                str2 = String.format(str2, m118743r0);
            }
            SpannableString spannableString = new SpannableString(str2);
            if (indexOf >= 0) {
                spannableString.setSpan(new StyleSpan(1), length, indexOf, 33);
            }
            if (indexOf2 >= 0) {
                spannableString.setSpan(new StyleSpan(1), indexOf2, m118743r0.length() + indexOf2, 33);
            }
            return spannableString;
        }
        return m118743r02;
    }

    /* renamed from: BM */
    void m73738BM(View view) {
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f67632c1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f67633d1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f67636g1.m87415u(this.f67632c1);
            this.f67619P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_logout_on_pc);
            this.f67620Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_change_phone_number);
            this.f67621R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_change_password);
            this.f67622S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_set_pass_code);
            this.f67623T0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_authorised_app);
            this.f67624U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_deactivate);
            this.f67625V0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_logout);
            this.f67626W0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_switch_account);
            this.f67631b1 = (TextView) view.findViewById(AbstractC6918a0.tv_phone_number);
            this.f67627X0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_security);
            this.f67630a1 = (TextView) view.findViewById(AbstractC6918a0.tv_security_des);
            this.f67628Y0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_2fa_login);
            this.f67629Z0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_2fa_login);
            this.f67619P0.setOnClickListener(this);
            this.f67620Q0.setOnClickListener(this);
            this.f67621R0.setOnClickListener(this);
            this.f67622S0.setOnClickListener(this);
            this.f67623T0.setOnClickListener(this);
            this.f67624U0.setOnClickListener(this);
            this.f67625V0.setOnClickListener(this);
            this.f67626W0.setOnClickListener(this);
            this.f67627X0.setOnClickListener(this);
            this.f67628Y0.setOnClickListener(this);
            this.f67629Z0.setOnClickListener(this);
            if (AbstractC23309i.m121529Vf()) {
                this.f67626W0.setVisibility(0);
                view.findViewById(AbstractC6918a0.line_switch_account).setVisibility(0);
            } else {
                this.f67626W0.setVisibility(8);
                view.findViewById(AbstractC6918a0.line_switch_account).setVisibility(8);
            }
            this.f67620Q0.setVisibility(0);
            view.findViewById(AbstractC6918a0.change_phone_number_sep).setVisibility(0);
            if (AbstractC23309i.m121965h1() == 1) {
                this.f67624U0.setVisibility(0);
            } else {
                this.f67624U0.setVisibility(8);
            }
            if (AbstractC0924m0.m4016ma()) {
                this.f67627X0.setVisibility(0);
                view.findViewById(AbstractC6918a0.sep_security_hub).setVisibility(0);
            } else {
                this.f67627X0.setVisibility(8);
                view.findViewById(AbstractC6918a0.sep_security_hub).setVisibility(8);
            }
            if (AbstractC0924m0.m3530W0() == 1) {
                this.f67628Y0.setVisibility(0);
                view.findViewById(AbstractC6918a0.sep_ll_2fa_login).setVisibility(0);
            } else {
                this.f67628Y0.setVisibility(8);
                view.findViewById(AbstractC6918a0.sep_ll_2fa_login).setVisibility(8);
            }
            m73714IM();
            m73719Vx();
            m73707AM(view);
            m73741uM();
            if (!AbstractC0924m0.m3279Na()) {
                m73743zM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m73718Vp();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        CharSequence charSequence;
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                if (AbstractC0924m0.m3298O0() != 1) {
                    z11 = false;
                }
                try {
                    int m128082c = C24594a.m128082c(z11);
                    this.f67639j1 = m128082c;
                    charSequence = m73737yM(m128082c);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    charSequence = "";
                }
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_title)).m43173v(3).m43162k(charSequence).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_negative_btn), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_positive_btn), this);
                return aVar.m43152a();
            }
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.content_dialog_unmap, (ViewGroup) null, false);
            aVar2.m43177z(inflate);
            if (!TextUtils.isEmpty(this.f67648s1)) {
                ((TextView) inflate.findViewById(AbstractC6918a0.tvContent)).setText(this.f67648s1);
            }
            inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(this);
            inflate.findViewById(AbstractC6918a0.btn_change_phone).setOnClickListener(this);
            inflate.findViewById(AbstractC6918a0.see_more).setOnClickListener(this);
            return aVar2.m43152a();
        }
        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
        aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_deactive_account)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
        return aVar3.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_account_and_security_view, viewGroup, false);
        m73738BM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67636g1.m87408i());
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        if (interfaceC17463d != null) {
            i12 = interfaceC17463d.mo92862f();
        } else {
            i12 = 0;
        }
        if (i11 == -1) {
            if (i12 != 1) {
                if (i12 == 4) {
                    if (interfaceC17463d != null) {
                        interfaceC17463d.dismiss();
                    }
                    if (this.f67639j1 == 1 && C24594a.m128081b() == 1) {
                        m73711FM(126);
                        return;
                    }
                    if (this.f67639j1 == 2 && C24594a.m128082c(false) == 2) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("case_passcode_process", 3);
                        this.f72421L0.m92662fJ().m93066i2(PasscodeView.class, bundle, 1001, 1, true);
                        return;
                    }
                    m73716KM();
                    return;
                }
                return;
            }
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("password_mode", 1);
            this.f72421L0.m92662fJ().m93069k2(ChangePasswordView.class, bundle2, 1, true);
        }
    }

    /* renamed from: LM */
    void m73739LM(boolean z11, boolean z12) {
        String str;
        ContactProfile contactProfile;
        if (this.f67650u1) {
            return;
        }
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C13135g(z11, z12));
        if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
            str = AbstractC23304d.f113394i0;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (contactProfile = AbstractC23304d.f113368c0) != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
            str = AbstractC23304d.f113368c0.f42455y;
        }
        this.f67650u1 = true;
        c0766k.mo1402C5(str, AbstractC23309i.m121704a5(), AbstractC23309i.m121477U0());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m73718Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m73707AM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67636g1.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m73736wM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        if (this.f67650u1) {
            this.f72421L0.mo49315c4();
        }
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f67632c1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    /* renamed from: a7 */
    void m73740a7() {
        try {
            synchronized (this.f67651v1) {
                try {
                    if (this.f67652w1) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    synchronized (this.f67651v1) {
                        this.f67652w1 = true;
                        this.f72421L0.mo46829Y();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C13136h());
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
        if (i11 == AbstractC6918a0.ll_change_phone_number) {
            return 51;
        }
        if (i11 == AbstractC6918a0.ll_deactivate) {
            return 52;
        }
        if (i11 == AbstractC6918a0.ll_logout_on_pc) {
            return 53;
        }
        if (i11 == AbstractC6918a0.ll_change_password) {
            return 54;
        }
        if (i11 == AbstractC6918a0.ll_set_pass_code) {
            return 55;
        }
        if (i11 == AbstractC6918a0.ll_switch_account) {
            return 56;
        }
        if (i11 == AbstractC6918a0.ll_setting_logout) {
            return 57;
        }
        if (i11 == AbstractC6918a0.ll_authorised_app) {
            return 90;
        }
        if (i11 == AbstractC6918a0.ll_security) {
            return 121;
        }
        return i11 == AbstractC6918a0.ll_2fa_login ? 126 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingAccountAndSecurityView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == 2212) {
                m73709DM(i12);
            } else if (i11 == 3231 && i12 == -1) {
                m73735vM();
            } else if (i11 == 1001 && i12 == -1) {
                m73716KM();
            } else {
                super.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_logout_on_pc) {
                this.f72421L0.m92662fJ().m93069k2(HistoryLoginView.class, null, 1, true);
                AbstractC23647d.m123897g("5811163");
                AbstractC26084s.m134269q(0, 53);
                C0815e1.m2079N(53, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_change_phone_number) {
                AbstractC26084s.m134269q(0, 51);
                m73740a7();
                C0815e1.m2079N(51, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_change_password) {
                AbstractC26084s.m134269q(0, 54);
                m73739LM(true, false);
                C0815e1.m2079N(54, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_set_pass_code) {
                if (AbstractC23165o5.m119333b()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("case_passcode_process", 2);
                    this.f72421L0.m92662fJ().m93069k2(PasscodeView.class, bundle, 1, true);
                } else {
                    this.f72421L0.m92662fJ().m93069k2(PassCodeSettingView.class, null, 1, true);
                }
                AbstractC26084s.m134269q(0, 55);
                AbstractC23647d.m123906p("37140");
                AbstractC23647d.m123893c();
                C0815e1.m2079N(55, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_authorised_app) {
                this.f72421L0.m92662fJ().m93069k2(AuthorisedAppsView.class, null, 1, true);
                AbstractC26084s.m134269q(0, 90);
                C0815e1.m2079N(90, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_deactivate) {
                AbstractC26084s.m134269q(0, 52);
                C0815e1.m2079N(52, 1, 0, 0, 0);
                m73742xM();
                return;
            }
            if (id2 == AbstractC6918a0.ll_switch_account) {
                AbstractC23647d.m123897g("36002");
                this.f72421L0.m92676n2().mo35573l4(SwitchAccountView.class, null, 1, true);
                AbstractC26084s.m134269q(0, 56);
                C0815e1.m2079N(56, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.ll_setting_logout) {
                m73708CM();
                return;
            }
            if (id2 == AbstractC6918a0.ll_security) {
                this.f72421L0.m92676n2().mo35573l4(SettingSecurityView.class, null, 1, true);
                C0815e1.m2079N(121, 1, 0, 0, 0);
                return;
            }
            if (id2 == AbstractC6918a0.btn_change_phone) {
                this.f72421L0.removeDialog(3);
                m73740a7();
                AbstractC23647d.m123897g("199719");
                return;
            }
            if (id2 == AbstractC6918a0.btn_close) {
                this.f72421L0.removeDialog(3);
                AbstractC23647d.m123897g("199720");
                return;
            }
            if (id2 == AbstractC6918a0.see_more) {
                this.f72421L0.removeDialog(3);
                Bundle bundle2 = new Bundle();
                bundle2.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
                ZaloWebView.m87105iS(this.f72421L0.m92676n2(), AbstractC23306f.m120583H().m110204g().f110080o, bundle2);
                AbstractC23647d.m123897g("199718");
                return;
            }
            if (id2 == AbstractC6918a0.ll_2fa_login || id2 == AbstractC6918a0.sw_2fa_login) {
                if (this.f67629Z0.isChecked()) {
                    m73712GM();
                } else {
                    this.f67629Z0.setChecked(true);
                    m73728o3(43, 1);
                }
                AbstractC26084s.m134269q(0, 126);
                C0815e1.m2079N(126, 1, 0, 0, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        String str = "";
        super.onResume();
        try {
            this.f67636g1.m87413s();
            TextView textView = this.f67631b1;
            if (textView != null) {
                if (f67618A1) {
                    textView.setVisibility(8);
                } else {
                    String str2 = AbstractC23304d.f113368c0.f42455y;
                    if (!TextUtils.isEmpty(str2)) {
                        str2 = AbstractC23056e6.m118281g(str2, AbstractC23309i.m121704a5());
                    }
                    if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                        this.f67631b1.setText(str2);
                        this.f67631b1.setVisibility(0);
                    } else {
                        this.f67631b1.setVisibility(8);
                    }
                }
            }
            try {
                String m3742d6 = AbstractC0924m0.m3742d6();
                if (!TextUtils.isEmpty(m3742d6)) {
                    str = new JSONObject(m3742d6).optString(AbstractC18458a.f93019a, "");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            long m4367y6 = AbstractC0924m0.m4367y6();
            if (!TextUtils.isEmpty(str) && C23793c.m124316k().mo124314i() <= m4367y6) {
                this.f67630a1.setText(str);
                this.f67630a1.setVisibility(0);
                return;
            }
            this.f67630a1.setVisibility(8);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: uM */
    void m73741uM() {
        String str;
        ContactProfile contactProfile;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C13134f());
        if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
            str = AbstractC23304d.f113394i0;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (contactProfile = AbstractC23304d.f113368c0) != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
            str = AbstractC23304d.f113368c0.f42455y;
        }
        c0766k.mo1402C5(str, AbstractC23309i.m121704a5(), AbstractC23309i.m121477U0());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.g1
                @Override // java.lang.Runnable
                public final void run() {
                    SettingAccountAndSecurityView.this.m73736wM();
                }
            });
        }
    }

    /* renamed from: xM */
    void m73742xM() {
        if (this.f67649t1) {
            return;
        }
        try {
            if (!this.f72421L0.m78935DL()) {
                this.f72421L0.mo49282B8(null, false);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13133e());
            this.f67649t1 = true;
            c0766k.mo1488Ma();
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f67649t1 = false;
        }
    }

    /* renamed from: zM */
    void m73743zM() {
        if (this.f67655z1) {
            return;
        }
        this.f67655z1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C13138j());
        c0766k.mo1776x7(3);
    }
}
