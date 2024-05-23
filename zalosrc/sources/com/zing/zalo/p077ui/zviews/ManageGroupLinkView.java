package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import au.AbstractC2379w;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.moduleview.p078qr.share.ShareGroupHeaderModuleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ZSnackBar;
import com.zing.zalo.p077ui.zviews.ManageGroupLinkView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.C23278z2;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p239ih.C20556f;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p379o3.C23994e;
import p379o3.C23995f;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;
import p716zh.C31973j5;
import p80.C24677a;
import pm0.C24848g0;
import sy.AbstractC26412d;
import th.C26691l;

/* loaded from: classes6.dex */
public class ManageGroupLinkView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: B1 */
    private final boolean f74934B1;

    /* renamed from: C1 */
    private final int f74935C1;

    /* renamed from: D1 */
    private final int f74936D1;

    /* renamed from: E1 */
    private C31973j5 f74937E1;

    /* renamed from: F1 */
    private final AtomicBoolean f74938F1;

    /* renamed from: P0 */
    String f74939P0;

    /* renamed from: Q0 */
    boolean f74940Q0;

    /* renamed from: S0 */
    View f74942S0;

    /* renamed from: T0 */
    RobotoTextView f74943T0;

    /* renamed from: U0 */
    RobotoTextView f74944U0;

    /* renamed from: V0 */
    View f74945V0;

    /* renamed from: W0 */
    RecyclingImageView f74946W0;

    /* renamed from: X0 */
    ProgressBar f74947X0;

    /* renamed from: Y0 */
    View f74948Y0;

    /* renamed from: Z0 */
    View f74949Z0;

    /* renamed from: a1 */
    View f74950a1;

    /* renamed from: b1 */
    View f74951b1;

    /* renamed from: c1 */
    boolean f74952c1;

    /* renamed from: d1 */
    String f74953d1;

    /* renamed from: e1 */
    String f74954e1;

    /* renamed from: g1 */
    MultiStateView f74956g1;

    /* renamed from: h1 */
    ActionBarMenuItem f74957h1;

    /* renamed from: j1 */
    String f74959j1;

    /* renamed from: k1 */
    String f74960k1;

    /* renamed from: l1 */
    String f74961l1;

    /* renamed from: m1 */
    C3979l f74962m1;

    /* renamed from: n1 */
    C3979l f74963n1;

    /* renamed from: o1 */
    C3979l f74964o1;

    /* renamed from: p1 */
    C23528a f74965p1;

    /* renamed from: q1 */
    C3977j f74966q1;

    /* renamed from: r1 */
    C3977j f74967r1;

    /* renamed from: s1 */
    C3977j f74968s1;

    /* renamed from: v1 */
    ViewSwitcher f74971v1;

    /* renamed from: w1 */
    View f74972w1;

    /* renamed from: x1 */
    View f74973x1;

    /* renamed from: R0 */
    boolean f74941R0 = false;

    /* renamed from: f1 */
    boolean f74955f1 = false;

    /* renamed from: i1 */
    boolean f74958i1 = false;

    /* renamed from: t1 */
    ShareGroupHeaderModuleView f74969t1 = null;

    /* renamed from: u1 */
    View f74970u1 = null;

    /* renamed from: y1 */
    int f74974y1 = 0;

    /* renamed from: z1 */
    boolean f74975z1 = false;

    /* renamed from: A1 */
    String f74933A1 = "";

    /* renamed from: com.zing.zalo.ui.zviews.ManageGroupLinkView$a */
    /* loaded from: classes6.dex */
    public class C14561a extends C23999j {
        C14561a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    try {
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    if (c3979l.m18839c() != null) {
                        ManageGroupLinkView.this.f74946W0.setVisibility(0);
                        ManageGroupLinkView.this.f74946W0.setImageInfo(c3979l);
                        ManageGroupLinkView.this.f74962m1 = c3979l;
                        ManageGroupLinkView.this.m81520JM(false);
                    }
                } catch (Throwable th2) {
                    RecyclingImageView recyclingImageView = ManageGroupLinkView.this.f74946W0;
                    recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.decor_qrcode));
                    ManageGroupLinkView.this.m81520JM(false);
                    throw th2;
                }
            }
            RecyclingImageView recyclingImageView2 = ManageGroupLinkView.this.f74946W0;
            recyclingImageView2.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView2.getContext(), AbstractC16803z.decor_qrcode));
            ManageGroupLinkView.this.m81520JM(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageGroupLinkView$b */
    /* loaded from: classes6.dex */
    public class C14562b implements InterfaceC20094a {
        C14562b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m81527d(C20096c c20096c) {
            MultiStateView.EnumC15915f enumC15915f;
            String m104492d;
            try {
                MultiStateView multiStateView = ManageGroupLinkView.this.f74956g1;
                if (multiStateView != null) {
                    multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                    MultiStateView multiStateView2 = ManageGroupLinkView.this.f74956g1;
                    if (c20096c.m104491c() == 50001) {
                        enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                    } else {
                        enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                    }
                    multiStateView2.setErrorType(enumC15915f);
                    MultiStateView multiStateView3 = ManageGroupLinkView.this.f74956g1;
                    if (c20096c.m104491c() == 50001) {
                        m104492d = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                    } else {
                        m104492d = c20096c.m104492d();
                    }
                    multiStateView3.setErrorTitleString(m104492d);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                ManageGroupLinkView.this.f74958i1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ManageGroupLinkView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.vw

                /* renamed from: q */
                public final /* synthetic */ C20096c f82454q;

                public /* synthetic */ RunnableC16280vw(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ManageGroupLinkView.C14562b.this.m81527d(r2);
                }
            });
            ManageGroupLinkView.this.f74958i1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                ManageGroupLinkView manageGroupLinkView = ManageGroupLinkView.this;
                boolean z11 = true;
                if (jSONObject.optInt("enable") != 1) {
                    z11 = false;
                }
                manageGroupLinkView.f74952c1 = z11;
                ManageGroupLinkView manageGroupLinkView2 = ManageGroupLinkView.this;
                if (manageGroupLinkView2.f74952c1) {
                    manageGroupLinkView2.f74953d1 = jSONObject.optString("link");
                    ManageGroupLinkView.this.f74960k1 = jSONObject.optString("qrImgLink");
                    if (ManageGroupLinkView.this.f74934B1) {
                        if (!ManageGroupLinkView.this.m81509uM()) {
                            ManageGroupLinkView.this.f74961l1 = jSONObject.optString("qrBackgroundLinkEn", "");
                        }
                        if (ManageGroupLinkView.this.m81509uM() || TextUtils.isEmpty(ManageGroupLinkView.this.f74961l1)) {
                            ManageGroupLinkView.this.f74961l1 = jSONObject.optString("qrBackgroundLink", "");
                        }
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("info");
                    if (optJSONObject != null) {
                        ManageGroupLinkView.this.f74954e1 = optJSONObject.optString("desc");
                    }
                    ManageGroupLinkView manageGroupLinkView3 = ManageGroupLinkView.this;
                    String str = manageGroupLinkView3.f74953d1;
                    manageGroupLinkView3.f74959j1 = str;
                    if (!TextUtils.isEmpty(str)) {
                        if (ManageGroupLinkView.this.f74959j1.contains("http://")) {
                            ManageGroupLinkView manageGroupLinkView4 = ManageGroupLinkView.this;
                            manageGroupLinkView4.f74959j1 = manageGroupLinkView4.f74959j1.replace("http://", "");
                        } else if (ManageGroupLinkView.this.f74959j1.contains("https://")) {
                            ManageGroupLinkView manageGroupLinkView5 = ManageGroupLinkView.this;
                            manageGroupLinkView5.f74959j1 = manageGroupLinkView5.f74959j1.replace("https://", "");
                        }
                    }
                }
                ManageGroupLinkView.this.m81516DM();
                ManageGroupLinkView.this.f74958i1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                ManageGroupLinkView.this.f74958i1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageGroupLinkView$c */
    /* loaded from: classes6.dex */
    public class C14563c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f74978a;

        C14563c(boolean z11) {
            this.f74978a = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ManageGroupLinkView.this.f72421L0.mo49315c4();
            if (c20096c != null) {
                ToastUtils.showMess(c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                ManageGroupLinkView.this.f72421L0.mo49315c4();
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                ManageGroupLinkView manageGroupLinkView = ManageGroupLinkView.this;
                boolean z11 = true;
                if (jSONObject.optInt("enable") != 1) {
                    z11 = false;
                }
                manageGroupLinkView.f74952c1 = z11;
                ManageGroupLinkView manageGroupLinkView2 = ManageGroupLinkView.this;
                if (manageGroupLinkView2.f74952c1) {
                    manageGroupLinkView2.f74953d1 = jSONObject.optString("link");
                    ManageGroupLinkView.this.f74960k1 = jSONObject.optString("qrImgLink");
                    if (ManageGroupLinkView.this.f74934B1) {
                        if (!ManageGroupLinkView.this.m81509uM()) {
                            ManageGroupLinkView.this.f74961l1 = jSONObject.optString("qrBackgroundLinkEn", "");
                        }
                        if (ManageGroupLinkView.this.m81509uM() || TextUtils.isEmpty(ManageGroupLinkView.this.f74961l1)) {
                            ManageGroupLinkView.this.f74961l1 = jSONObject.optString("qrBackgroundLink", "");
                        }
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("info");
                    if (optJSONObject != null) {
                        ManageGroupLinkView.this.f74954e1 = optJSONObject.optString("desc");
                    }
                    ManageGroupLinkView manageGroupLinkView3 = ManageGroupLinkView.this;
                    String str = manageGroupLinkView3.f74953d1;
                    manageGroupLinkView3.f74959j1 = str;
                    if (!TextUtils.isEmpty(str)) {
                        if (ManageGroupLinkView.this.f74959j1.contains("http://")) {
                            ManageGroupLinkView manageGroupLinkView4 = ManageGroupLinkView.this;
                            manageGroupLinkView4.f74959j1 = manageGroupLinkView4.f74959j1.replace("http://", "");
                        } else if (ManageGroupLinkView.this.f74959j1.contains("https://")) {
                            ManageGroupLinkView manageGroupLinkView5 = ManageGroupLinkView.this;
                            manageGroupLinkView5.f74959j1 = manageGroupLinkView5.f74959j1.replace("https://", "");
                        }
                    }
                    C31973j5 m4472f = C0943w.m4462l().m4472f(ManageGroupLinkView.this.f74939P0);
                    if (m4472f != null) {
                        m4472f.m153714E0(ManageGroupLinkView.this.f74953d1);
                        C0943w.m4462l().m4483w(m4472f);
                    }
                    if (ManageGroupLinkView.this.f74955f1) {
                        Intent intent = new Intent();
                        intent.putExtra("RESULT_DATA", ManageGroupLinkView.this.f74953d1);
                        ManageGroupLinkView.this.f72421L0.mo50035CK(-1, intent);
                        ManageGroupLinkView.this.f72421L0.finish();
                        return;
                    }
                }
                ManageGroupLinkView.this.m81516DM();
                if (this.f74978a) {
                    ToastUtils.m89266n(AbstractC8020f0.str_reset_group_link_success, new Object[0]);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.str_create_group_link_success, new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageGroupLinkView$d */
    /* loaded from: classes6.dex */
    public class C14564d implements InterfaceC20094a {
        C14564d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ManageGroupLinkView.this.f72421L0.mo49315c4();
            if (c20096c != null) {
                ToastUtils.showMess(c20096c.m104492d());
            }
            ManageGroupLinkView.this.m81516DM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                ManageGroupLinkView.this.f72421L0.mo49315c4();
                ManageGroupLinkView manageGroupLinkView = ManageGroupLinkView.this;
                manageGroupLinkView.f74952c1 = false;
                manageGroupLinkView.f74953d1 = "";
                manageGroupLinkView.f74954e1 = "";
                manageGroupLinkView.f74960k1 = "";
                C31973j5 m4472f = C0943w.m4462l().m4472f(ManageGroupLinkView.this.f74939P0);
                if (m4472f != null) {
                    m4472f.m153714E0("");
                    C0943w.m4462l().m4483w(m4472f);
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_group_link_success));
                ManageGroupLinkView.this.f72421L0.finish();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageGroupLinkView$e */
    /* loaded from: classes6.dex */
    public class C14565e extends C23994e {
        C14565e() {
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1 */
        public void mo1932C(String str, File file, C23995f c23995f) {
            if (file != null) {
                try {
                    if (file.exists() && c23995f.m125657h() == 200) {
                        AbstractC23152n3.m119011N0(ManageGroupLinkView.this.f72421L0.m92676n2(), file.getAbsolutePath(), true, false, -1);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageGroupLinkView$f */
    /* loaded from: classes6.dex */
    public class C14566f extends C23999j {
        C14566f() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            ManageGroupLinkView.this.f74964o1 = c3979l;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ManageGroupLinkView$g */
    /* loaded from: classes6.dex */
    public class C14567g extends C23999j {
        C14567g() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            ManageGroupLinkView.this.f74963n1 = c3979l;
        }
    }

    public ManageGroupLinkView() {
        int i11;
        int i12;
        boolean z11 = C26691l.m137131d() == 1;
        this.f74934B1 = z11;
        if (z11) {
            i11 = AbstractC8020f0.str_qr_share_group_action_copy;
        } else {
            i11 = AbstractC8020f0.str_copy_group_link;
        }
        this.f74935C1 = i11;
        if (z11) {
            i12 = AbstractC8020f0.str_qr_my_qr_share;
        } else {
            i12 = AbstractC8020f0.str_share_group_link;
        }
        this.f74936D1 = i12;
        this.f74937E1 = null;
        this.f74938F1 = new AtomicBoolean(false);
    }

    /* renamed from: AM */
    public static /* synthetic */ void m81493AM(String str, Context context) {
        try {
            AbstractC23152n3.m119036c0(context, new C20556f(str));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: BM */
    private void m81494BM() {
        C31973j5 c31973j5;
        if (this.f74934B1 && (c31973j5 = this.f74937E1) != null) {
            String m153756e = c31973j5.m153756e();
            if (!TextUtils.isEmpty(m153756e)) {
                if (this.f74967r1 == null) {
                    this.f74967r1 = new C3977j(m92689tK());
                }
                ((C23528a) this.f74965p1.m123612r(this.f74967r1)).m123579C(m153756e, C23278z2.m120143n(), new C14567g());
            }
        }
    }

    /* renamed from: EM */
    private void m81495EM() {
        if (this.f74934B1 && !TextUtils.isEmpty(this.f74961l1)) {
            if (this.f74968s1 == null) {
                this.f74968s1 = new C3977j(m92689tK());
            }
            ((C23528a) this.f74965p1.m123612r(this.f74968s1)).m123585I(this.f74961l1, true, true, AbstractC23136l9.m118742r(420.0f), 0, new C14566f(), C23278z2.m120110a());
        }
    }

    /* renamed from: GM */
    private void m81496GM() {
        m81494BM();
        m81495EM();
    }

    /* renamed from: KM */
    private void m81497KM() {
        if (TextUtils.isEmpty(this.f74960k1)) {
            return;
        }
        String m81508qM = m81508qM(true);
        if (!TextUtils.isEmpty(m81508qM)) {
            Bundle bundle = new Bundle();
            bundle.putString("imagePathUri", m81508qM);
            bundle.putBoolean("bol_share_in_app", true);
            bundle.putBoolean("btn_extra_show_hide_post_feed", true);
            m92693xK().m93069k2(ShareView.class, bundle, 1, true);
        }
    }

    /* renamed from: MM */
    private void m81498MM(String str) {
        try {
            Context context = getContext();
            InterfaceC27218a m92676n2 = m92676n2();
            if (context != null && m92676n2 != null) {
                if (m92676n2.mo35576n3()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_share_group_qr_code_downloaded));
                } else {
                    ZSnackBar.Companion.m75985a(m92689tK(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_share_group_qr_code_downloaded), AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_share_group_action_view), new Runnable() { // from class: com.zing.zalo.ui.zviews.uw

                        /* renamed from: p */
                        public final /* synthetic */ String f82343p;

                        /* renamed from: q */
                        public final /* synthetic */ Context f82344q;

                        public /* synthetic */ RunnableC16243uw(String str2, Context context2) {
                            r1 = str2;
                            r2 = context2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ManageGroupLinkView.m81493AM(r1, r2);
                        }
                    }).m75984j(m92676n2.mo35579p());
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: oM */
    private View m81507oM(LayoutInflater layoutInflater, LinearLayout linearLayout, int i11, int i12, int i13, int i14, ViewGroup.LayoutParams layoutParams) {
        View inflate = layoutInflater.inflate(i11, (ViewGroup) linearLayout, false);
        inflate.setId(i12);
        inflate.setOnClickListener(this);
        linearLayout.addView(inflate, layoutParams);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(AbstractC6918a0.manage_group_link_function_btn_img);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.manage_group_link_function_btn_text);
        appCompatImageView.setImageResource(i13);
        textView.setText(i14);
        return inflate;
    }

    /* renamed from: qM */
    private String m81508qM(boolean z11) {
        String str;
        Context m92689tK = m92689tK();
        C3979l c3979l = this.f74963n1;
        C3979l c3979l2 = this.f74962m1;
        C3979l c3979l3 = this.f74964o1;
        int i11 = AbstractC16803z.ic_ava_group;
        String str2 = AbstractC23352g.m122788d(this.f74960k1) + ".jpg";
        AtomicBoolean atomicBoolean = this.f74938F1;
        String m153793y = this.f74937E1.m153793y();
        if (m81509uM()) {
            str = "Nhóm Zalo";
        } else {
            str = "Zalo group";
        }
        return AbstractC26412d.m136217f(m92689tK, c3979l, c3979l2, c3979l3, i11, str2, z11, atomicBoolean, m153793y, str, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.qw
            public /* synthetic */ C16071qw() {
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m81510vM;
                m81510vM = ManageGroupLinkView.this.m81510vM((String) obj);
                return m81510vM;
            }
        });
    }

    /* renamed from: uM */
    public boolean m81509uM() {
        return "vi".equals(AbstractC18458a.f93019a);
    }

    /* renamed from: vM */
    public /* synthetic */ C24848g0 m81510vM(String str) {
        m81498MM(str);
        return null;
    }

    /* renamed from: wM */
    public /* synthetic */ void m81511wM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == this.f74935C1) {
            if (!TextUtils.isEmpty(this.f74953d1)) {
                ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(m92648SI(), this.f74953d1, new SensitiveData("clipboard_copy_link_invited_group", "comm_csc"));
                AbstractC23647d.m123897g("10300108");
                return;
            }
            return;
        }
        if (intValue == this.f74936D1 && !TextUtils.isEmpty(this.f74953d1)) {
            AbstractC23152n3.m119015P0(this.f72421L0.m92676n2(), this.f74953d1, "", true, true, "");
            AbstractC23647d.m123897g("10300109");
        }
    }

    /* renamed from: xM */
    public /* synthetic */ void m81512xM(View view) {
        if (this.f74974y1 != 0) {
            this.f74972w1.setSelected(true);
            this.f74973x1.setSelected(false);
            this.f74974y1 = 0;
            this.f74943T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_share_group_qr_hint));
            ViewSwitcher viewSwitcher = this.f74971v1;
            viewSwitcher.setInAnimation(viewSwitcher.getContext(), AbstractC10919t.slide_left_in_alpha);
            ViewSwitcher viewSwitcher2 = this.f74971v1;
            viewSwitcher2.setOutAnimation(viewSwitcher2.getContext(), AbstractC10919t.slide_right_out_alpha);
            this.f74971v1.showPrevious();
            AbstractC23647d.m123897g("10300116");
        }
    }

    /* renamed from: yM */
    public /* synthetic */ void m81513yM(View view) {
        if (this.f74974y1 != 1) {
            this.f74972w1.setSelected(false);
            this.f74973x1.setSelected(true);
            this.f74974y1 = 1;
            this.f74943T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_qr_share_group_link_hint));
            ViewSwitcher viewSwitcher = this.f74971v1;
            viewSwitcher.setInAnimation(viewSwitcher.getContext(), AbstractC10919t.story_intro_slide_right_in);
            ViewSwitcher viewSwitcher2 = this.f74971v1;
            viewSwitcher2.setOutAnimation(viewSwitcher2.getContext(), AbstractC10919t.story_intro_slide_left_out);
            this.f74971v1.showNext();
            AbstractC23647d.m123897g("10300118");
        }
    }

    /* renamed from: zM */
    public /* synthetic */ void m81514zM(View view) {
        if (this.f74940Q0) {
            m81522pM(false);
            return;
        }
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74939P0);
        if (m4472f != null) {
            AbstractC23211s7.m119572e(m4472f.m153758f(), m92676n2(), "");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_IS_COMMUNITY")) {
            this.f74941R0 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY");
        }
        if (this.f72421L0.m92676n2() != null) {
            AbstractC2379w.m12430d(this.f72421L0.m92676n2().getCurrentFocus());
        }
        this.f72421L0.m92637BK(true);
        this.f74965p1 = new C23528a(this.f72421L0.m92648SI());
    }

    /* renamed from: CM */
    public void m81515CM() {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        try {
            if (m92674mJ() && !m92681pJ() && !m92677nJ()) {
                int i19 = 8;
                this.f74956g1.setVisibility(8);
                ActionBarMenuItem actionBarMenuItem = this.f74957h1;
                boolean z14 = false;
                if (actionBarMenuItem != null) {
                    if (this.f74952c1 && this.f74940Q0) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    actionBarMenuItem.setVisibility(i18);
                }
                if (!this.f74952c1) {
                    this.f74956g1.setVisibility(0);
                    this.f74956g1.setEnableBtnEmpty(true);
                    this.f74956g1.setEmptyOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.mw
                        public /* synthetic */ ViewOnClickListenerC15922mw() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ManageGroupLinkView.this.m81514zM(view);
                        }
                    });
                    this.f74956g1.setState(MultiStateView.EnumC15914e.EMPTY);
                    if (this.f74934B1) {
                        boolean z15 = this.f74940Q0;
                        if (z15) {
                            i15 = AbstractC8020f0.str_qr_share_group_empty_title_admin;
                        } else {
                            i15 = AbstractC8020f0.str_qr_share_group_empty_title_member;
                        }
                        if (z15) {
                            i16 = AbstractC8020f0.str_qr_share_group_empty_desc_admin;
                        } else {
                            i16 = AbstractC8020f0.str_qr_share_group_empty_desc_member;
                        }
                        if (z15) {
                            i17 = AbstractC8020f0.str_qr_share_group_empty_action_admin;
                        } else {
                            i17 = AbstractC8020f0.str_qr_share_group_empty_action_member;
                        }
                        this.f74956g1.setEmptyViewString(AbstractC23136l9.m118743r0(i15));
                        ((RobotoTextView) this.f74956g1.getEmptyView().findViewById(AbstractC6918a0.tvEmptyDesc)).setText(i16);
                        this.f74956g1.setEmptyImageResourceId(AbstractC16803z.ic_im_create_qr_link);
                        this.f74956g1.setBtnEmptyString(AbstractC23136l9.m118743r0(i17));
                    } else {
                        boolean z16 = this.f74941R0;
                        if (z16) {
                            i12 = AbstractC8020f0.str_hint_enable_community_link_for_owner;
                        } else {
                            i12 = AbstractC8020f0.str_hint_enable_group_link_for_owner;
                        }
                        if (z16) {
                            i13 = AbstractC8020f0.str_hint_enable_community_link_for_member;
                        } else {
                            i13 = AbstractC8020f0.str_hint_enable_group_link_for_member;
                        }
                        MultiStateView multiStateView = this.f74956g1;
                        if (!this.f74940Q0) {
                            i12 = i13;
                        }
                        multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i12));
                        this.f74956g1.setEmptyImageResourceId(AbstractC16803z.illus_empty_share_group);
                        this.f74956g1.m87366h(AbstractC23136l9.m118742r(25.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(25.0f), AbstractC23136l9.m118742r(8.0f));
                        MultiStateView multiStateView2 = this.f74956g1;
                        if (this.f74940Q0) {
                            i14 = AbstractC8020f0.str_btn_action_reactivate_group_link;
                        } else if (this.f74941R0) {
                            i14 = AbstractC8020f0.str_btn_contact_community_owner;
                        } else {
                            i14 = AbstractC8020f0.str_btn_contact_group_owner;
                        }
                        multiStateView2.setBtnEmptyString(AbstractC23136l9.m118743r0(i14));
                    }
                }
                View view = this.f74942S0;
                if (this.f74952c1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                view.setVisibility(i11);
                RobotoTextView robotoTextView = this.f74943T0;
                if (this.f74952c1) {
                    i19 = 0;
                }
                robotoTextView.setVisibility(i19);
                boolean z17 = !TextUtils.isEmpty(this.f74959j1);
                if (z17) {
                    this.f74944U0.setText(this.f74959j1);
                }
                View view2 = this.f74948Y0;
                if (this.f74952c1 && z17) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m81519IM(view2, z11);
                View view3 = this.f74949Z0;
                if (this.f74952c1 && z17) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m81519IM(view3, z12);
                View view4 = this.f74951b1;
                if (this.f74952c1 && z17) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                m81519IM(view4, z13);
                View view5 = this.f74950a1;
                if (this.f74952c1 && z17) {
                    z14 = true;
                }
                m81519IM(view5, z14);
                m81517FM();
                m81518HM();
                m81496GM();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", AbstractC23136l9.m118743r0(this.f74935C1));
                    hashMap.put("id", Integer.valueOf(this.f74935C1));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", AbstractC23136l9.m118743r0(this.f74936D1));
                    hashMap2.put("id", Integer.valueOf(this.f74936D1));
                    if (this.f74934B1) {
                        arrayList.add(hashMap2);
                        arrayList.add(hashMap);
                    } else {
                        arrayList.add(hashMap);
                        arrayList.add(hashMap2);
                    }
                    if (!arrayList.isEmpty()) {
                        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                        aVar.m43155d(true);
                        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.pw

                            /* renamed from: q */
                            public final /* synthetic */ SimpleAdapter f81636q;

                            public /* synthetic */ C16034pw(SimpleAdapter simpleAdapter2) {
                                r2 = simpleAdapter2;
                            }

                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                ManageGroupLinkView.this.m81511wM(r2, interfaceC17463d, i12);
                            }
                        });
                        return aVar.m43152a();
                    }
                }
                return super.mo39014DJ(i11);
            }
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            int i12 = AbstractC8020f0.str_msg_confirm_delete_group_link_v2;
            if (this.f74941R0) {
                i12 = AbstractC8020f0.str_msg_confirm_delete_community_link;
            }
            aVar2.m43159h(5).m43162k(AbstractC23136l9.m118743r0(i12)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm), this);
            return aVar2.m43152a();
        }
        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
        aVar3.m43159h(5).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_confirm_reset_group_link_v2)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm), this);
        return aVar3.m43152a();
    }

    /* renamed from: DM */
    void m81516DM() {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.ow
            public /* synthetic */ RunnableC15997ow() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ManageGroupLinkView.this.m81515CM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        boolean z11;
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        if (C0943w.m4462l().m4472f(this.f74939P0) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
        this.f74957h1 = m92738e;
        if (this.f74941R0) {
            m92738e.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_reset, AbstractC8020f0.str_option_reset_community_link));
        } else {
            m92738e.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_reset, AbstractC8020f0.str_opt_menu_reset_group_link));
        }
        if (z11) {
            if (this.f74941R0) {
                this.f74957h1.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_revoke, AbstractC8020f0.str_option_revoke_community_link));
            } else {
                this.f74957h1.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_revoke, AbstractC8020f0.str_opt_menu_revoke_group_link));
            }
        }
        this.f74957h1.setVisibility(8);
    }

    /* renamed from: FM */
    void m81517FM() {
        if (TextUtils.isEmpty(this.f74960k1)) {
            RecyclingImageView recyclingImageView = this.f74946W0;
            recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.decor_qrcode));
        } else {
            m81520JM(true);
            if (this.f74966q1 == null) {
                this.f74966q1 = new C3977j(this.f72421L0.getContext());
            }
            ((C23528a) this.f74965p1.m123612r(this.f74966q1)).m123585I(this.f74960k1, true, true, 400, 0, new C14561a(), C23278z2.m120110a());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        View inflate = layoutInflater.inflate(AbstractC7409c0.manage_group_link_view, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(AbstractC6918a0.content_layout);
        Context context = viewGroup2.getContext();
        if (this.f74934B1) {
            i11 = AbstractC7409c0.manage_group_link_view_new;
        } else {
            i11 = AbstractC7409c0.manage_group_link_view_legacy;
        }
        View.inflate(context, i11, viewGroup2);
        this.f74942S0 = inflate.findViewById(AbstractC6918a0.group_link_activated_layout);
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_group_link_info);
        this.f74943T0 = robotoTextView;
        if (this.f74941R0) {
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_share_community_link));
        }
        RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_group_link_url);
        this.f74944U0 = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
        this.f74946W0 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.imv_group_qr);
        MultiStateView multiStateView = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        this.f74956g1 = multiStateView;
        multiStateView.bringToFront();
        if (!this.f74934B1) {
            int m118722k0 = AbstractC23136l9.m118722k0() / 3;
            ViewGroup.LayoutParams layoutParams = this.f74946W0.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = m118722k0;
                layoutParams.height = m118722k0;
            }
        } else {
            this.f74956g1.setEmptyLayoutResourceId(AbstractC7409c0.layout_empty_qr_business_share_group);
        }
        this.f74947X0 = (ProgressBar) inflate.findViewById(AbstractC6918a0.pb_group_qrcode_loading);
        View findViewById = inflate.findViewById(AbstractC6918a0.tv_custom_group_link);
        this.f74945V0 = findViewById;
        findViewById.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(AbstractC6918a0.ll_group_link_manage_functions);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 1.0f;
        if (this.f74934B1) {
            this.f74969t1 = (ShareGroupHeaderModuleView) inflate.findViewById(AbstractC6918a0.share_group_header_layout);
            this.f74970u1 = inflate.findViewById(AbstractC6918a0.skeletonHeaderLayout);
            this.f74971v1 = (ViewSwitcher) inflate.findViewById(AbstractC6918a0.vs_container_main_layout);
            this.f74972w1 = inflate.findViewById(AbstractC6918a0.tab_primary);
            this.f74973x1 = inflate.findViewById(AbstractC6918a0.tab_secondary);
            this.f74972w1.setSelected(true);
            this.f74974y1 = 0;
            this.f74972w1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.rw
                public /* synthetic */ ViewOnClickListenerC16109rw() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageGroupLinkView.this.m81512xM(view);
                }
            });
            this.f74973x1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.sw
                public /* synthetic */ ViewOnClickListenerC16169sw() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageGroupLinkView.this.m81513yM(view);
                }
            });
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(AbstractC6918a0.ll_group_link_manage_functions_secondary);
            int i12 = AbstractC7409c0.manage_group_link_function_button_new;
            this.f74949Z0 = m81507oM(layoutInflater, linearLayout2, i12, AbstractC6918a0.manage_group_link_btn_share_link, AbstractC16803z.ic_my_qr_share, AbstractC8020f0.str_qr_my_qr_share, layoutParams2);
            this.f74948Y0 = m81507oM(layoutInflater, linearLayout2, i12, AbstractC6918a0.manage_group_link_btn_copy_link, AbstractC16803z.ic_qr_bussiness_btn_copy, AbstractC8020f0.str_qr_share_group_action_copy, layoutParams2);
            this.f74951b1 = m81507oM(layoutInflater, linearLayout, i12, AbstractC6918a0.manage_group_link_btn_share_qr_code, AbstractC16803z.ic_my_qr_share, AbstractC8020f0.str_qr_my_qr_share, layoutParams2);
            this.f74950a1 = m81507oM(layoutInflater, linearLayout, i12, AbstractC6918a0.manage_group_link_btn_download_qr, AbstractC16803z.ic_qr_bussiness_btn_download, AbstractC8020f0.str_qr_share_group_action_download, layoutParams2);
        } else {
            int i13 = AbstractC7409c0.manage_group_link_function_button;
            this.f74948Y0 = m81507oM(layoutInflater, linearLayout, i13, AbstractC6918a0.manage_group_link_btn_copy_link, AbstractC16803z.icn_qr_copylink, AbstractC8020f0.str_copy_group_link, layoutParams2);
            this.f74949Z0 = m81507oM(layoutInflater, linearLayout, i13, AbstractC6918a0.manage_group_link_btn_share_link, AbstractC16803z.icn_qr_sharelink, AbstractC8020f0.str_share_group_link, layoutParams2);
        }
        this.f74956g1.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.tw
            public /* synthetic */ C16206tw() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                ManageGroupLinkView.this.m81524sM();
            }
        });
        this.f74956g1.setVisibility(0);
        this.f74956g1.setState(MultiStateView.EnumC15914e.LOADING);
        return inflate;
    }

    /* renamed from: HM */
    void m81518HM() {
        ShareGroupHeaderModuleView shareGroupHeaderModuleView;
        if (!this.f74934B1 || this.f74937E1 == null || (shareGroupHeaderModuleView = this.f74969t1) == null) {
            return;
        }
        C24677a module = shareGroupHeaderModuleView.getModule();
        module.m128235o1().m115437u1(this.f74937E1);
        module.m128236p1().m111959G1(this.f74937E1.m153793y());
        module.m128237q1().m111959G1(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_info_num_member_groups), Integer.valueOf(this.f74937E1.m153732O())));
        this.f74969t1.setVisibility(0);
        this.f74970u1.setVisibility(8);
    }

    /* renamed from: IM */
    void m81519IM(View view, boolean z11) {
        float f11;
        if (view != null) {
            view.setEnabled(z11);
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            view.setAlpha(f11);
        }
    }

    /* renamed from: JM */
    void m81520JM(boolean z11) {
        int i11;
        float f11;
        ProgressBar progressBar = this.f74947X0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        progressBar.setVisibility(i11);
        RecyclingImageView recyclingImageView = this.f74946W0;
        if (z11) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        recyclingImageView.setAlpha(f11);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 1) {
            if (mo92862f == 2 && i11 == -1) {
                interfaceC17463d.dismiss();
                m81523rM();
                return;
            }
            return;
        }
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            m81522pM(true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 52);
        C23744a.m124114c().m124117e(this, 51);
        C23744a.m124114c().m124117e(this, 151);
    }

    /* renamed from: LM */
    void m81521LM() {
        try {
            if (TextUtils.isEmpty(this.f74960k1)) {
                return;
            }
            File file = new File(AbstractC20130d.m104905y(), AbstractC23352g.m122788d(this.f74960k1) + ".jpg");
            if (file.exists() && file.length() > 0) {
                AbstractC23152n3.m119011N0(this.f72421L0.m92676n2(), file.getAbsolutePath(), true, false, -1);
            } else {
                file.delete();
                this.f74965p1.m123600e(this.f74960k1, file, new C14565e());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            this.f72421L0.finish();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_reset) {
            this.f72421L0.showDialog(1);
            AbstractC23647d.m123897g("10300113");
            return true;
        }
        if (i11 == AbstractC6918a0.menu_revoke) {
            this.f72421L0.showDialog(2);
            AbstractC23647d.m123897g("10300114");
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        int i11;
        try {
            super.mo37493TJ();
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                if (this.f74941R0) {
                    actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_bar_title_invite_to_community_via_link));
                } else {
                    if (this.f74934B1) {
                        i11 = AbstractC8020f0.str_qr_share_group_title;
                    } else {
                        i11 = AbstractC8020f0.str_open_group_link;
                    }
                    actionBar.setTitle(AbstractC23136l9.m118743r0(i11));
                }
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageGroupLinkView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 301 && i12 == -1) {
            try {
                AbstractC23304d.f113452w2 = true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.manage_group_link_btn_copy_link) {
                if (!TextUtils.isEmpty(this.f74953d1)) {
                    ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(m92648SI(), this.f74953d1, new SensitiveData("clipboard_copy_link_invited_group", "comm_csc"));
                    AbstractC23647d.m123897g("10300104");
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.manage_group_link_btn_share_link) {
                if (!TextUtils.isEmpty(this.f74953d1)) {
                    AbstractC23152n3.m119015P0(this.f72421L0.m92676n2(), this.f74953d1, "", true, true, "");
                    AbstractC23647d.m123897g("10300105");
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.manage_group_link_btn_share_qr_code) {
                if (this.f74934B1) {
                    m81497KM();
                } else {
                    m81521LM();
                }
                AbstractC23647d.m123897g("10300106");
                return;
            }
            if (id2 == AbstractC6918a0.tv_group_link_url) {
                this.f72421L0.showDialog(3);
                AbstractC23647d.m123897g("10300107");
                return;
            }
            if (id2 == AbstractC6918a0.tv_custom_group_link) {
                if (AbstractC23034c6.m118121G()) {
                    m81508qM(false);
                    return;
                } else {
                    AbstractC23034c6.m118186w0(this.f72421L0.m92692wK(), AbstractC23034c6.f112029f, 151);
                    return;
                }
            }
            if (id2 == AbstractC6918a0.manage_group_link_btn_download_qr) {
                if (AbstractC23034c6.m118121G()) {
                    m81508qM(false);
                    AbstractC23647d.m123897g("10300117");
                } else {
                    AbstractC23034c6.m118186w0(this.f72421L0.m92692wK(), AbstractC23034c6.f112029f, 151);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (AbstractC23304d.f113452w2) {
            m81524sM();
            AbstractC23304d.f113452w2 = false;
        }
    }

    /* renamed from: pM */
    void m81522pM(boolean z11) {
        if (!TextUtils.isEmpty(this.f74939P0)) {
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14563c(z11));
            c0766k.mo1411D6(this.f74939P0, true);
        }
    }

    /* renamed from: rM */
    void m81523rM() {
        if (!TextUtils.isEmpty(this.f74939P0)) {
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14564d());
            c0766k.mo1759v7(this.f74939P0);
        }
    }

    /* renamed from: sM */
    public void m81524sM() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.nw
            public /* synthetic */ RunnableC15959nw() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ManageGroupLinkView.this.m81525tM();
            }
        });
    }

    /* renamed from: tM */
    public void m81525tM() {
        if (this.f74958i1) {
            return;
        }
        this.f74958i1 = true;
        if (!TextUtils.isEmpty(this.f74939P0)) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14562b());
            c0766k.mo1780y3(this.f74939P0);
        }
        if (this.f74934B1) {
            this.f74937E1 = C0943w.m4462l().m4472f(this.f74939P0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 51) {
            if (i11 != 52) {
                if (i11 == 151 && objArr.length > 0) {
                    Object obj = objArr[0];
                    if ((obj instanceof String) && TextUtils.equals((String) obj, this.f74939P0)) {
                        m81524sM();
                        return;
                    }
                    return;
                }
                return;
            }
            if (AbstractC23184q2.m119459q(this.f74939P0, i11, objArr)) {
                finish();
                return;
            }
            return;
        }
        AbstractC26412d.m136216e(this.f74939P0, i11, objArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("EXTRA_IS_FINISH_VIEW")) {
                this.f74955f1 = m92642L3.getBoolean("EXTRA_IS_FINISH_VIEW", false);
            }
            if (m92642L3.containsKey("BOL_EXTRA_HAVE_ADMIN_ROLE")) {
                this.f74940Q0 = m92642L3.getBoolean("BOL_EXTRA_HAVE_ADMIN_ROLE");
            }
            this.f74933A1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            String string = m92642L3.getString("STR_EXTRA_GROUP_LINK_URL", this.f74953d1);
            this.f74953d1 = string;
            boolean z11 = !TextUtils.isEmpty(string);
            this.f74952c1 = z11;
            if (this.f74953d1 != null && !z11) {
                m81515CM();
            }
            m81519IM(this.f74948Y0, false);
            m81519IM(this.f74949Z0, false);
            m81519IM(this.f74950a1, false);
            m81519IM(this.f74951b1, false);
            if (m92642L3.containsKey("extra_group_id")) {
                this.f74939P0 = m92642L3.getString("extra_group_id");
                m81524sM();
            }
        }
        this.f72421L0.invalidateOptionsMenu();
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74939P0);
        String str2 = this.f74933A1;
        if (m4472f != null && TextUtils.isEmpty(m4472f.m153773n())) {
            str = "gr_link_off";
        } else {
            str = "gr_link_on";
        }
        C0815e1.m2075D().m2100V(new C23648e(5, str2, 1, str, "2"), false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 52);
        C23744a.m124114c().m124115b(this, 51);
        C23744a.m124114c().m124115b(this, 151);
    }
}
