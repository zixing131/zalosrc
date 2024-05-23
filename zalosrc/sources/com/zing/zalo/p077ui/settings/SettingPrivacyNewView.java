package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0852x;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.settings.SettingPrivacyNewView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.PhoneBookView;
import com.zing.zalo.p077ui.zviews.SettingFontSizeView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.HashMap;
import kz.AbstractC21970a;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23152n3;
import me0.AbstractC23193r0;
import me0.AbstractC23217t2;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23269y3;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p716zh.C31849b1;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;

/* loaded from: classes6.dex */
public class SettingPrivacyNewView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: Q0 */
    LinearLayout f67840Q0;

    /* renamed from: R0 */
    LinearLayout f67841R0;

    /* renamed from: S0 */
    LinearLayout f67842S0;

    /* renamed from: T0 */
    LinearLayout f67843T0;

    /* renamed from: U0 */
    LinearLayout f67844U0;

    /* renamed from: V0 */
    LinearLayout f67845V0;

    /* renamed from: W0 */
    LinearLayout f67846W0;

    /* renamed from: X0 */
    StencilSwitch f67847X0;

    /* renamed from: Y0 */
    CheckBox f67848Y0;

    /* renamed from: Z0 */
    CheckBox f67849Z0;

    /* renamed from: a1 */
    StencilSwitch f67850a1;

    /* renamed from: b1 */
    LinearLayout f67851b1;

    /* renamed from: c1 */
    RecyclingImageView f67852c1;

    /* renamed from: d1 */
    RecyclingImageView f67853d1;

    /* renamed from: e1 */
    TextView f67854e1;

    /* renamed from: f1 */
    ScrollViewVisibleChildViewDetector f67855f1;

    /* renamed from: g1 */
    LinearLayout f67856g1;

    /* renamed from: h1 */
    TextView f67857h1;

    /* renamed from: i1 */
    HightLightSettingView f67858i1;

    /* renamed from: m1 */
    String[] f67862m1;

    /* renamed from: n1 */
    int f67863n1;

    /* renamed from: o1 */
    int f67864o1;

    /* renamed from: p1 */
    String[] f67865p1;

    /* renamed from: q1 */
    String[] f67866q1;

    /* renamed from: r1 */
    String[] f67867r1;

    /* renamed from: v1 */
    String[] f67871v1;

    /* renamed from: w1 */
    int f67872w1;

    /* renamed from: x1 */
    int f67873x1;

    /* renamed from: P0 */
    int f67839P0 = 0;

    /* renamed from: j1 */
    int f67859j1 = -1;

    /* renamed from: k1 */
    int f67860k1 = 0;

    /* renamed from: l1 */
    final sh0 f67861l1 = new sh0();

    /* renamed from: s1 */
    int f67868s1 = 0;

    /* renamed from: t1 */
    int f67869t1 = -1;

    /* renamed from: u1 */
    int f67870u1 = -1;

    /* renamed from: y1 */
    private final SensitiveData f67874y1 = new SensitiveData("phonebook_sync_scan_on_auto_submit", "phonebook_sync");

    /* renamed from: z1 */
    boolean f67875z1 = false;

    /* renamed from: A1 */
    boolean f67831A1 = false;

    /* renamed from: B1 */
    private final InterfaceC0765j f67832B1 = new C0766k();

    /* renamed from: C1 */
    private final InterfaceC20094a f67833C1 = new C13164a();

    /* renamed from: D1 */
    boolean f67834D1 = false;

    /* renamed from: E1 */
    private final InterfaceC0765j f67835E1 = new C0766k();

    /* renamed from: F1 */
    private final InterfaceC20094a f67836F1 = new C13165b();

    /* renamed from: G1 */
    private final InterfaceC0765j f67837G1 = new C0766k();

    /* renamed from: H1 */
    private final InterfaceC20094a f67838H1 = new C13166c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingPrivacyNewView$a */
    /* loaded from: classes6.dex */
    public class C13164a implements InterfaceC20094a {
        C13164a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74047d() {
            try {
                SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
                int i11 = settingPrivacyNewView.f67869t1;
                AbstractC23148n.m118851y(i11, settingPrivacyNewView.f67870u1, i11);
                try {
                    SettingPrivacyNewView settingPrivacyNewView2 = SettingPrivacyNewView.this;
                    int i12 = settingPrivacyNewView2.f67869t1;
                    if (i12 == 12) {
                        settingPrivacyNewView2.f67863n1 = settingPrivacyNewView2.f67870u1;
                    } else if (i12 == 31) {
                        int i13 = settingPrivacyNewView2.f67870u1;
                        settingPrivacyNewView2.f67873x1 = i13;
                        settingPrivacyNewView2.f67857h1.setText(settingPrivacyNewView2.f67865p1[i13]);
                        C23212s8.m119595b(SettingPrivacyNewView.this.m92648SI());
                        if (Build.VERSION.SDK_INT < 23) {
                            AbstractC23152n3.m118985A0(null);
                            AbstractC23193r0.m119508q();
                        }
                    }
                    SettingPrivacyNewView settingPrivacyNewView3 = SettingPrivacyNewView.this;
                    if (settingPrivacyNewView3.f67839P0 == 2 && settingPrivacyNewView3.f67869t1 == 10) {
                        C18644n.m98524E();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingPrivacyNewView.this.m74040FM();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
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
                    SettingPrivacyNewView.this.m74041GM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
                settingPrivacyNewView.f67831A1 = false;
                settingPrivacyNewView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingPrivacyNewView settingPrivacyNewView2 = SettingPrivacyNewView.this;
                settingPrivacyNewView2.f67831A1 = false;
                settingPrivacyNewView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingPrivacyNewView.this.f72421L0.m92676n2() != null) {
                        SettingPrivacyNewView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.a0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingPrivacyNewView.C13164a.this.m74047d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
                settingPrivacyNewView.f67831A1 = false;
                settingPrivacyNewView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingPrivacyNewView$b */
    /* loaded from: classes6.dex */
    public class C13165b implements InterfaceC20094a {
        C13165b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m74051f() {
            try {
                SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
                C23269y3.m120035a(settingPrivacyNewView.f67867r1[settingPrivacyNewView.f67868s1]);
                AbstractC21970a.m114741j(0L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m74052g() {
            ((BaseZaloActivity) SettingPrivacyNewView.this.f72421L0.m92648SI()).recreate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m74053h() {
            int i11 = 0;
            while (true) {
                try {
                    String[] strArr = SettingPrivacyNewView.this.f67867r1;
                    if (i11 < strArr.length) {
                        if (AbstractC18458a.f93019a.equals(strArr[i11])) {
                            SettingPrivacyNewView.this.f67868s1 = i11;
                            return;
                        }
                        i11++;
                    } else {
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
            settingPrivacyNewView.f67834D1 = false;
            settingPrivacyNewView.f72421L0.mo78960q3();
            if (c20096c.m104491c() == 515) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
            }
            if (SettingPrivacyNewView.this.f72421L0.m92676n2() != null) {
                SettingPrivacyNewView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingPrivacyNewView.C13165b.this.m74053h();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
            settingPrivacyNewView.f67834D1 = false;
            settingPrivacyNewView.f72421L0.mo78960q3();
            if (SettingPrivacyNewView.this.f72421L0.m92676n2() != null) {
                SettingPrivacyNewView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingPrivacyNewView.C13165b.this.m74051f();
                    }
                });
                C23269y3.m120040i(SettingPrivacyNewView.this.f72421L0.m92648SI());
                AbstractC20826v0.m108770L0(true);
                AbstractC0924m0.m2943Bm(true);
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.settings.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingPrivacyNewView.C13165b.this.m74052g();
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingPrivacyNewView$c */
    /* loaded from: classes6.dex */
    class C13166c implements InterfaceC20094a {
        C13166c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
            settingPrivacyNewView.f67875z1 = false;
            settingPrivacyNewView.m74041GM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingPrivacyNewView.this.f67875z1 = false;
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
            SettingPrivacyNewView.this.m74041GM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingPrivacyNewView$d */
    /* loaded from: classes6.dex */
    public class RunnableC13167d implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f67879p;

        RunnableC13167d(View view) {
            this.f67879p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (SettingPrivacyNewView.this.f67861l1.m87411l(this.f67879p, this)) {
                    return;
                }
                SettingPrivacyNewView settingPrivacyNewView = SettingPrivacyNewView.this;
                int i11 = settingPrivacyNewView.f67839P0;
                LinearLayout linearLayout = null;
                if (i11 == 2) {
                    int i12 = settingPrivacyNewView.f67859j1;
                    if (i12 != 28) {
                        if (i12 != 77) {
                            if (i12 == 102) {
                                linearLayout = settingPrivacyNewView.f67845V0;
                            }
                        } else {
                            linearLayout = settingPrivacyNewView.f67843T0;
                        }
                    } else {
                        linearLayout = settingPrivacyNewView.f67844U0;
                    }
                } else if (i11 == 3) {
                    int i13 = settingPrivacyNewView.f67859j1;
                    if (i13 != 79) {
                        if (i13 != 80) {
                            if (i13 == 97) {
                                linearLayout = settingPrivacyNewView.f67842S0;
                            }
                        } else {
                            linearLayout = settingPrivacyNewView.f67841R0;
                        }
                    } else {
                        linearLayout = settingPrivacyNewView.f67840Q0;
                    }
                }
                settingPrivacyNewView.f67861l1.m87409j(linearLayout, settingPrivacyNewView.f67858i1, settingPrivacyNewView.f67860k1);
                SettingPrivacyNewView.this.m74019MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m74014AM(InterfaceC17463d interfaceC17463d, int i11) {
        String str;
        int i12;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (!this.f67867r1[i11].equals(AbstractC18458a.f93019a)) {
            this.f67868s1 = i11;
            if (this.f67867r1[i11].equals("vi")) {
                i12 = 0;
                str = "37611";
            } else if (this.f67867r1[i11].equals("en")) {
                i12 = 1;
                str = "37612";
            } else {
                str = "";
                i12 = -1;
            }
            if (!TextUtils.isEmpty(str)) {
                AbstractC23647d.m123906p(str);
                AbstractC23647d.m123893c();
            }
            if (i12 != -1) {
                m74042Ie(11, i12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ boolean m74015BM(View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(this.f72421L0.m92651WI().getDrawable(((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m74016CM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f67863n1 != i11) {
            this.f67863n1 = i11;
            m74044o3(12, i11);
            int i12 = this.f67863n1;
            if (i12 == 0) {
                AbstractC23647d.m123906p("37630");
                AbstractC23647d.m123893c();
            } else if (i12 == 1) {
                AbstractC23647d.m123906p("37631");
                AbstractC23647d.m123893c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ boolean m74017DM(View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(this.f72421L0.m92651WI().getDrawable(((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m74018EM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (AbstractC23309i.m122165mb() != i11) {
            m74044o3(31, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m74019MA() {
        this.f67859j1 = -1;
        this.f67860k1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m74020Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f67859j1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f67860k1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public void m74033sM() {
        try {
            int i11 = this.f67839P0;
            if (i11 == 2) {
                AbstractC26084s.m134251H(this.f67844U0, 28);
                AbstractC26084s.m134251H(this.f67843T0, 77);
                AbstractC26084s.m134251H(this.f67845V0, 102);
                this.f67861l1.m87405e(this, 44);
            } else if (i11 == 3) {
                AbstractC26084s.m134251H(this.f67840Q0, 79);
                AbstractC26084s.m134251H(this.f67841R0, 80);
                AbstractC26084s.m134251H(this.f67842S0, 97);
                AbstractC26084s.m134251H(this.f67846W0, 78);
                this.f67861l1.m87405e(this, 45);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingPrivacyNewView", e11);
        }
    }

    /* renamed from: tM */
    private void m74034tM(View view) {
        if (this.f67859j1 >= 0) {
            view.postDelayed(new RunnableC13167d(view), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ boolean m74035vM(View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(this.f72421L0.m92651WI().getDrawable(((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m74036wM(int i11) {
        if (this.f67872w1 != i11) {
            this.f67872w1 = i11;
            m74044o3(10, i11);
            int i12 = this.f67872w1;
            if (i12 == 0) {
                AbstractC23647d.m123906p("37511");
                AbstractC23647d.m123893c();
            } else if (i12 == 1) {
                AbstractC23647d.m123906p("37512");
                AbstractC23647d.m123893c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m74037xM(InterfaceC17463d interfaceC17463d, final int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: la0.k4
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivacyNewView.this.m74036wM(i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static /* synthetic */ void m74038yM(KeyEventCallbackC17462c keyEventCallbackC17462c, InterfaceC17463d interfaceC17463d) {
        int identifier;
        try {
            if (AbstractC23309i.m122089kb() == 0 && (identifier = Resources.getSystem().getIdentifier("alertTitle", "id", "android")) > 0) {
                View m92864h = keyEventCallbackC17462c.m92864h(identifier);
                if (m92864h instanceof TextView) {
                    ((TextView) m92864h).setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 5));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingPrivacyNewView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ boolean m74039zM(View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(this.f72421L0.m92651WI().getDrawable(((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f67839P0 = m92642L3.getInt("EXTRA_SETTING", 0);
            }
            m74020Vp();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 2;
        int i17 = 0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        int length = this.f67865p1.length;
                        int i18 = Build.VERSION.SDK_INT;
                        if (i18 < 29) {
                            length--;
                        }
                        int m122165mb = AbstractC23309i.m122165mb();
                        if (m122165mb >= 0 && m122165mb <= length - 1) {
                            i16 = m122165mb;
                        } else if (i18 < 29) {
                            i16 = 0;
                        }
                        int[] iArr = new int[length];
                        ArrayList arrayList = new ArrayList();
                        while (i17 < length) {
                            if (i17 != i16) {
                                i15 = AbstractC16803z.btn_radio_off_holo_light;
                            } else {
                                i15 = AbstractC16803z.btn_radio_on_holo_light;
                            }
                            iArr[i17] = i15;
                            HashMap hashMap = new HashMap();
                            hashMap.put("name", this.f67865p1[i17]);
                            hashMap.put("icon", Integer.valueOf(iArr[i17]));
                            arrayList.add(hashMap);
                            i17++;
                        }
                        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
                        simpleAdapter.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: la0.s4
                            @Override // android.widget.SimpleAdapter.ViewBinder
                            public final boolean setViewValue(View view, Object obj, String str) {
                                boolean m74017DM;
                                m74017DM = SettingPrivacyNewView.this.m74017DM(view, obj, str);
                                return m74017DM;
                            }
                        });
                        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                        aVar.m43172u(m92652XI(AbstractC8020f0.str_theme_setting_select_theme));
                        aVar.m43155d(true);
                        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: la0.j4
                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i19) {
                                SettingPrivacyNewView.this.m74018EM(interfaceC17463d, i19);
                            }
                        });
                        return aVar.m43152a();
                    }
                    int length2 = this.f67871v1.length;
                    int i19 = this.f67872w1;
                    if (i19 < 0 || i19 > length2 - 1) {
                        this.f67872w1 = 0;
                    }
                    int[] iArr2 = new int[length2];
                    ArrayList arrayList2 = new ArrayList();
                    while (i17 < length2) {
                        if (i17 != this.f67872w1) {
                            i14 = AbstractC16803z.btn_radio_off_holo_light;
                        } else {
                            i14 = AbstractC16803z.btn_radio_on_holo_light;
                        }
                        iArr2[i17] = i14;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("name", this.f67871v1[i17]);
                        hashMap2.put("icon", Integer.valueOf(iArr2[i17]));
                        arrayList2.add(hashMap2);
                        i17++;
                    }
                    SimpleAdapter simpleAdapter2 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList2, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
                    simpleAdapter2.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: la0.l4
                        @Override // android.widget.SimpleAdapter.ViewBinder
                        public final boolean setViewValue(View view, Object obj, String str) {
                            boolean m74035vM;
                            m74035vM = SettingPrivacyNewView.this.m74035vM(view, obj, str);
                            return m74035vM;
                        }
                    });
                    C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                    aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dlgchooseShowFriendOption));
                    aVar2.m43173v(100);
                    aVar2.m43155d(true);
                    aVar2.m43153b(simpleAdapter2, new InterfaceC17463d.d() { // from class: la0.m4
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i21) {
                            SettingPrivacyNewView.this.m74037xM(interfaceC17463d, i21);
                        }
                    });
                    final C8009j m43152a = aVar2.m43152a();
                    m43152a.mo88280H(new InterfaceC17463d.g() { // from class: la0.n4
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
                        /* renamed from: a */
                        public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                            SettingPrivacyNewView.m74038yM(KeyEventCallbackC17462c.this, interfaceC17463d);
                        }
                    });
                    return m43152a;
                }
                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                aVar3.m43171t(AbstractC8020f0.str_titleDlg2);
                aVar3.m43161j(AbstractC8020f0.font_changed_warning_dialog_message);
                aVar3.m43169r(AbstractC8020f0.str_ok, this);
                aVar3.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
                return aVar3.m43152a();
            }
            int length3 = this.f67862m1.length;
            int i21 = this.f67863n1;
            if (i21 < 0 || i21 > length3 - 1) {
                this.f67863n1 = 0;
            }
            int[] iArr3 = new int[length3];
            ArrayList arrayList3 = new ArrayList();
            while (i17 < length3) {
                if (i17 != this.f67863n1) {
                    i13 = AbstractC16803z.btn_radio_off_holo_light;
                } else {
                    i13 = AbstractC16803z.btn_radio_on_holo_light;
                }
                iArr3[i17] = i13;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("name", this.f67862m1[i17]);
                hashMap3.put("icon", Integer.valueOf(iArr3[i17]));
                arrayList3.add(hashMap3);
                i17++;
            }
            SimpleAdapter simpleAdapter3 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList3, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
            simpleAdapter3.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: la0.q4
                @Override // android.widget.SimpleAdapter.ViewBinder
                public final boolean setViewValue(View view, Object obj, String str) {
                    boolean m74015BM;
                    m74015BM = SettingPrivacyNewView.this.m74015BM(view, obj, str);
                    return m74015BM;
                }
            });
            C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
            aVar4.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_setting_font));
            aVar4.m43155d(true);
            aVar4.m43153b(simpleAdapter3, new InterfaceC17463d.d() { // from class: la0.r4
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i22) {
                    SettingPrivacyNewView.this.m74016CM(interfaceC17463d, i22);
                }
            });
            return aVar4.m43152a();
        }
        int[] iArr4 = {AbstractC16803z.f85304vn, AbstractC16803z.f85303us};
        String[] strArr = this.f67866q1;
        if (strArr.length <= 2) {
            i16 = strArr.length;
        }
        int i22 = this.f67868s1;
        if (i22 < 0 || i22 > i16 - 1) {
            this.f67868s1 = 0;
        }
        int[] iArr5 = new int[i16];
        ArrayList arrayList4 = new ArrayList();
        while (i17 < i16) {
            if (i17 != this.f67868s1) {
                i12 = AbstractC16803z.btn_radio_off_holo_light;
            } else {
                i12 = AbstractC16803z.btn_radio_on_holo_light;
            }
            iArr5[i17] = i12;
            HashMap hashMap4 = new HashMap();
            hashMap4.put("resource", Integer.valueOf(iArr4[i17]));
            hashMap4.put("name", this.f67866q1[i17]);
            hashMap4.put("icon", Integer.valueOf(iArr5[i17]));
            arrayList4.add(hashMap4);
            i17++;
        }
        SimpleAdapter simpleAdapter4 = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList4, AbstractC7409c0.dialog_menu_item, new String[]{"resource", "name", "icon"}, new int[]{AbstractC6918a0.ic_describe, AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
        simpleAdapter4.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: la0.o4
            @Override // android.widget.SimpleAdapter.ViewBinder
            public final boolean setViewValue(View view, Object obj, String str) {
                boolean m74039zM;
                m74039zM = SettingPrivacyNewView.this.m74039zM(view, obj, str);
                return m74039zM;
            }
        });
        C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
        aVar5.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting16));
        aVar5.m43155d(true);
        aVar5.m43153b(simpleAdapter4, new InterfaceC17463d.d() { // from class: la0.p4
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i23) {
                SettingPrivacyNewView.this.m74014AM(interfaceC17463d, i23);
            }
        });
        return aVar5.m43152a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: FM */
    public void m74040FM() {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        try {
            int i13 = this.f67839P0;
            if (i13 == 2) {
                this.f67872w1 = AbstractC23309i.m122127lb();
                this.f67847X0.setChecked(AbstractC23057e7.m118297d());
                return;
            }
            if (i13 == 3) {
                this.f67863n1 = AbstractC23309i.m122089kb();
                int m122165mb = AbstractC23309i.m122165mb();
                this.f67873x1 = m122165mb;
                boolean z13 = false;
                if (Build.VERSION.SDK_INT >= 29) {
                    if (m122165mb < 0 || m122165mb > 2) {
                        this.f67873x1 = 2;
                    }
                } else if (m122165mb < 0 || m122165mb > 1) {
                    this.f67873x1 = 0;
                }
                int i14 = this.f67873x1;
                if (i14 == 2) {
                    i14 = C23212s8.m119601h();
                }
                RecyclingImageView recyclingImageView = this.f67852c1;
                if (i14 == 0) {
                    i11 = AbstractC16803z.bg_select_theme;
                } else {
                    i11 = AbstractC17466e.transparent;
                }
                recyclingImageView.setBackgroundResource(i11);
                RecyclingImageView recyclingImageView2 = this.f67853d1;
                if (i14 == 1) {
                    i12 = AbstractC16803z.bg_select_theme;
                } else {
                    i12 = AbstractC17466e.transparent;
                }
                recyclingImageView2.setBackgroundResource(i12);
                StencilSwitch stencilSwitch = this.f67850a1;
                if (this.f67873x1 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                stencilSwitch.setChecked(z11);
                CheckBox checkBox = this.f67848Y0;
                if (i14 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                checkBox.setChecked(z12);
                CheckBox checkBox2 = this.f67849Z0;
                if (i14 == 1) {
                    z13 = true;
                }
                checkBox2.setChecked(z13);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        int i11 = this.f67839P0;
        if (i11 == 2) {
            view = layoutInflater.inflate(AbstractC7409c0.setting_contact_view, viewGroup, false);
        } else if (i11 == 3) {
            view = layoutInflater.inflate(AbstractC7409c0.setting_language_view, viewGroup, false);
        } else {
            view = new View(this.f72421L0.m92648SI());
        }
        m74045uM(view);
        return view;
    }

    /* renamed from: GM */
    void m74041GM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.z
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivacyNewView.this.m74040FM();
                }
            });
        }
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67861l1.m87408i());
        }
    }

    /* renamed from: Ie */
    void m74042Ie(int i11, int i12) {
        try {
            if (this.f67834D1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67834D1 = true;
                this.f67835E1.mo1704o8(this.f67836F1);
                this.f67835E1.mo1699o3(i11, i12);
            } else {
                int i13 = 0;
                this.f67834D1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                while (true) {
                    String[] strArr = this.f67867r1;
                    if (i13 < strArr.length) {
                        if (AbstractC18458a.f93019a.equals(strArr[i13])) {
                            this.f67868s1 = i13;
                            break;
                        }
                        i13++;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 3 && i11 == -1) {
                interfaceC17463d.dismiss();
                int i12 = this.f67863n1;
                int i13 = this.f67864o1;
                if (i12 != i13) {
                    this.f67863n1 = i13;
                    m74044o3(12, i13);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m74020Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m74034tM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67861l1.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m74033sM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f67855f1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    /* renamed from: Vx */
    void m74043Vx() {
        if (this.f67875z1) {
            return;
        }
        if (C23055e5.m118271f()) {
            this.f67875z1 = true;
            this.f67837G1.mo1704o8(this.f67838H1);
            this.f67837G1.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        this.f67875z1 = false;
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
        m74041GM();
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        int i12 = this.f67839P0;
        if (i12 == 2) {
            if (i11 == AbstractC6918a0.ll_auto_update_phone_book) {
                return 28;
            }
            if (i11 == AbstractC6918a0.ll_update_phone_book) {
                return 102;
            }
            return i11 == AbstractC6918a0.ll_show_active_friend ? 77 : -10;
        }
        if (i12 != 3) {
            return -10;
        }
        if (i11 == AbstractC6918a0.ll_setting_language) {
            return 79;
        }
        if (i11 == AbstractC6918a0.ll_setting_font) {
            return 80;
        }
        if (i11 == AbstractC6918a0.ll_setting_font_size) {
            return 97;
        }
        return i11 == AbstractC6918a0.ll_setting_theme_selector ? 78 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingPrivacyNewView";
    }

    /* renamed from: o3 */
    void m74044o3(int i11, int i12) {
        try {
            if (this.f67831A1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67869t1 = i11;
                this.f67870u1 = i12;
                this.f67831A1 = true;
                this.f67832B1.mo1704o8(this.f67833C1);
                this.f67832B1.mo1699o3(i11, i12);
            } else {
                this.f67831A1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m74040FM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 999) {
            m74041GM();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        try {
            int i11 = this.f67839P0;
            if (i11 == 2) {
                int id2 = view.getId();
                if (id2 == AbstractC6918a0.ll_show_active_friend) {
                    this.f72421L0.showDialog(4);
                    AbstractC26084s.m134269q(0, 77);
                    C0815e1.m2079N(77, 1, 0, 0, 0);
                    return;
                }
                if (id2 == AbstractC6918a0.ll_update_phone_book) {
                    this.f72421L0.m92662fJ().m93066i2(PhoneBookView.class, null, 999, 1, true);
                    AbstractC26084s.m134269q(0, 102);
                    C0815e1.m2079N(102, 1, 0, 0, 0);
                    return;
                }
                if (id2 == AbstractC6918a0.ll_auto_update_phone_book) {
                    this.f67847X0.setChecked(!r11.isChecked());
                    AbstractC26084s.m134269q(0, 28);
                    boolean isChecked = this.f67847X0.isChecked();
                    AbstractC23309i.m121139Kw(4);
                    AbstractC23057e7.m118305l(isChecked);
                    if (isChecked) {
                        Context m92648SI = this.f72421L0.m92648SI();
                        String[] strArr = AbstractC23034c6.f112032i;
                        if (AbstractC23034c6.m118167n(m92648SI, strArr) == 0) {
                            AbstractC0852x.m2338O(this.f67874y1);
                        } else {
                            AbstractC23034c6.m118184v0(this, strArr, 108);
                        }
                    }
                    C0815e1.m2079N(28, 1, 0, 0, 0);
                    if (isChecked) {
                        str = "37502";
                    } else {
                        str = "37501";
                    }
                    AbstractC23647d.m123906p(str);
                    AbstractC23647d.m123893c();
                    return;
                }
                if (id2 == AbstractC6918a0.sw_auto_update_phone_book) {
                    this.f67847X0.setChecked(!r11.isChecked());
                    AbstractC26084s.m134269q(0, 28);
                    boolean isChecked2 = this.f67847X0.isChecked();
                    AbstractC23309i.m121139Kw(4);
                    AbstractC23057e7.m118305l(isChecked2);
                    if (isChecked2) {
                        Context m92648SI2 = this.f72421L0.m92648SI();
                        String[] strArr2 = AbstractC23034c6.f112032i;
                        if (AbstractC23034c6.m118167n(m92648SI2, strArr2) == 0) {
                            AbstractC0852x.m2338O(this.f67874y1);
                        } else {
                            AbstractC23034c6.m118184v0(this, strArr2, 108);
                        }
                    }
                    C0815e1.m2079N(28, 1, 0, 0, 0);
                    return;
                }
                return;
            }
            if (i11 == 3) {
                int id3 = view.getId();
                if (id3 == AbstractC6918a0.ll_setting_language) {
                    this.f72421L0.showDialog(1);
                    AbstractC23647d.m123906p("37610");
                    AbstractC23647d.m123893c();
                    AbstractC26084s.m134269q(0, 79);
                    C0815e1.m2079N(79, 1, 0, 0, 0);
                    return;
                }
                if (id3 == AbstractC6918a0.ll_setting_font) {
                    this.f72421L0.showDialog(2);
                    AbstractC26084s.m134269q(0, 80);
                    C0815e1.m2079N(80, 1, 0, 0, 0);
                    return;
                }
                if (id3 == AbstractC6918a0.ll_setting_font_size) {
                    AbstractC23647d.m123897g("110000");
                    this.f72421L0.m92676n2().mo35579p().m93069k2(SettingFontSizeView.class, null, 1, true);
                    AbstractC26084s.m134269q(0, 97);
                    C0815e1.m2079N(97, 1, 0, 0, 0);
                    return;
                }
                if (id3 == AbstractC6918a0.ll_setting_theme) {
                    this.f72421L0.showDialog(5);
                    return;
                }
                if (id3 != AbstractC6918a0.ll_auto_theme && id3 != AbstractC6918a0.sw_auto_theme) {
                    if (id3 == AbstractC6918a0.ll_theme_light) {
                        if (this.f67873x1 != 0) {
                            this.f67848Y0.setChecked(true);
                            this.f67849Z0.setChecked(false);
                            m74044o3(31, 0);
                        }
                        AbstractC26084s.m134269q(0, 78);
                        return;
                    }
                    if (id3 == AbstractC6918a0.ll_theme_dark) {
                        if (this.f67873x1 != 1) {
                            this.f67848Y0.setChecked(false);
                            this.f67849Z0.setChecked(true);
                            m74044o3(31, 1);
                        }
                        AbstractC26084s.m134269q(0, 78);
                        return;
                    }
                    if (id3 == AbstractC6918a0.ll_setting_theme_selector) {
                        AbstractC26084s.m134269q(0, 78);
                        return;
                    }
                    return;
                }
                this.f67850a1.setChecked(!r11.isChecked());
                if (this.f67850a1.isChecked()) {
                    if (this.f67873x1 != 2) {
                        this.f67848Y0.setChecked(false);
                        this.f67849Z0.setChecked(false);
                        m74044o3(31, 2);
                        return;
                    }
                    return;
                }
                if (C23212s8.m119603k()) {
                    this.f67848Y0.setChecked(true);
                    this.f67849Z0.setChecked(false);
                    m74044o3(31, 0);
                } else if (C23212s8.m119602i()) {
                    this.f67848Y0.setChecked(false);
                    this.f67849Z0.setChecked(true);
                    m74044o3(31, 1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (this.f67839P0 == 2) {
            super.onRequestPermissionsResult(i11, strArr, iArr);
            if (i11 == 108 && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
                AbstractC0852x.m2338O(this.f67874y1);
                C31849b1.m153097n().m153106h(true);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            if (this.f67839P0 == 0) {
                new Handler(Looper.getMainLooper()).postDelayed(this.f88750Q, 50L);
            }
        } catch (Resources.NotFoundException e11) {
            e11.printStackTrace();
        }
        this.f67861l1.m87413s();
    }

    /* renamed from: uM */
    void m74045uM(View view) {
        int i11;
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f67855f1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f67858i1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f67861l1.m87415u(this.f67855f1);
            int i12 = this.f67839P0;
            if (i12 == 2) {
                this.f67843T0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_show_active_friend);
                this.f67844U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_auto_update_phone_book);
                this.f67845V0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_update_phone_book);
                this.f67847X0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_auto_update_phone_book);
                this.f67843T0.setOnClickListener(this);
                this.f67844U0.setOnClickListener(this);
                this.f67845V0.setOnClickListener(this);
                this.f67847X0.setOnClickListener(this);
                AbstractC23309i.m121148L4();
                this.f67871v1 = this.f72421L0.m92651WI().getStringArray(AbstractC16775v.array_show_active_friend);
                this.f67872w1 = AbstractC23309i.m122127lb();
                this.f67844U0.setOnClickListener(this);
                this.f67847X0.setOnClickListener(this);
                this.f67845V0.setOnClickListener(this);
                int i13 = this.f67872w1;
                if (i13 >= 0) {
                    if (i13 > this.f67871v1.length - 1) {
                    }
                    this.f67843T0.setOnClickListener(this);
                    m74040FM();
                    m74043Vx();
                }
                this.f67872w1 = 0;
                this.f67843T0.setOnClickListener(this);
                m74040FM();
                m74043Vx();
            } else if (i12 == 3) {
                this.f67855f1.setScanMode(0);
                this.f67840Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_language);
                this.f67841R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_font);
                this.f67842S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_font_size);
                this.f67854e1 = (TextView) view.findViewById(AbstractC6918a0.tv_setting_font_des);
                this.f67856g1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_theme);
                this.f67857h1 = (TextView) view.findViewById(AbstractC6918a0.tv_setting_theme_des);
                this.f67851b1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_auto_theme);
                this.f67848Y0 = (CheckBox) view.findViewById(AbstractC6918a0.checkbox_light);
                this.f67849Z0 = (CheckBox) view.findViewById(AbstractC6918a0.checkbox_dark);
                this.f67852c1 = (RecyclingImageView) view.findViewById(AbstractC6918a0.img_theme_light);
                this.f67853d1 = (RecyclingImageView) view.findViewById(AbstractC6918a0.img_theme_dark);
                this.f67850a1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_auto_theme);
                this.f67846W0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_theme_selector);
                View findViewById = view.findViewById(AbstractC6918a0.layout_auto_theme);
                if (Build.VERSION.SDK_INT >= 29) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                findViewById.setVisibility(i11);
                this.f67851b1.setOnClickListener(this);
                this.f67850a1.setOnClickListener(this);
                this.f67840Q0.setOnClickListener(this);
                this.f67841R0.setOnClickListener(this);
                this.f67856g1.setOnClickListener(this);
                this.f67846W0.setOnClickListener(this);
                if (AbstractC23309i.m122376s()) {
                    this.f67842S0.setOnClickListener(this);
                } else {
                    this.f67842S0.setVisibility(8);
                    view.findViewById(AbstractC6918a0.setting_font_size_line).setVisibility(8);
                }
                AbstractC23309i.m121148L4();
                this.f67866q1 = this.f72421L0.m92651WI().getStringArray(AbstractC16775v.array_language);
                this.f67867r1 = this.f72421L0.m92651WI().getStringArray(AbstractC16775v.array_language_as_code);
                this.f67862m1 = this.f72421L0.m92651WI().getStringArray(AbstractC16775v.array_font_setting);
                int m122089kb = AbstractC23309i.m122089kb();
                this.f67863n1 = m122089kb;
                if (m122089kb < 0 || m122089kb > this.f67862m1.length - 1) {
                    this.f67863n1 = 0;
                }
                this.f67854e1.setText(this.f67862m1[this.f67863n1]);
                int i14 = 0;
                while (true) {
                    String[] strArr = this.f67867r1;
                    if (i14 >= strArr.length) {
                        break;
                    }
                    if (AbstractC18458a.f93019a.equals(strArr[i14])) {
                        this.f67868s1 = i14;
                        break;
                    }
                    i14++;
                }
                this.f67865p1 = this.f72421L0.m92651WI().getStringArray(AbstractC16775v.array_uimode_option);
                int m122165mb = AbstractC23309i.m122165mb();
                this.f67873x1 = m122165mb;
                if (Build.VERSION.SDK_INT >= 29) {
                    if (m122165mb < 0 || m122165mb > 2) {
                        this.f67873x1 = 2;
                    }
                } else if (m122165mb < 0 || m122165mb > 1) {
                    this.f67873x1 = 0;
                }
                this.f67857h1.setText(this.f67865p1[this.f67873x1]);
                view.findViewById(AbstractC6918a0.ll_theme_light).setOnClickListener(this);
                view.findViewById(AbstractC6918a0.ll_theme_dark).setOnClickListener(this);
                m74040FM();
                m74043Vx();
            }
            m74034tM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.i4
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivacyNewView.this.m74033sM();
                }
            });
        }
    }
}
