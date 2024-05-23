package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import au.AbstractC2379w;
import ck.C3560a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7050e3;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.PreferencesProvider;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.p077ui.zviews.StartUpView;
import com.zing.zalo.p077ui.zviews.ZVDialogConfirmLockAccount;
import com.zing.zalo.p077ui.zviews.ZVDialogLockAccountSuccess;
import com.zing.zalo.p077ui.zviews.ZVDialogViewLockAccount;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import fh0.AbstractC18942g;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23178p7;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23225u;
import me0.C23269y3;
import mm0.AbstractC23349d;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.AbstractC23775p0;
import p588vw.C28655u;
import wl0.InterfaceC29091d;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class StartUpView extends BaseZaloView implements ZaloView.InterfaceC17426k, View.OnClickListener, InterfaceC0733x {

    /* renamed from: N0 */
    ImageView f77817N0;

    /* renamed from: O0 */
    TextView f77818O0;

    /* renamed from: P0 */
    View f77819P0;

    /* renamed from: Q0 */
    RobotoTextView f77820Q0;

    /* renamed from: R0 */
    RobotoTextView f77821R0;

    /* renamed from: S0 */
    View f77822S0;

    /* renamed from: T0 */
    ViewPager f77823T0;

    /* renamed from: U0 */
    SlidingTabLayout f77824U0;

    /* renamed from: V0 */
    ImageView f77825V0;

    /* renamed from: W0 */
    String[] f77826W0;

    /* renamed from: X0 */
    boolean f77827X0;

    /* renamed from: Y0 */
    String f77828Y0;

    /* renamed from: d1 */
    C3560a f77833d1;

    /* renamed from: i1 */
    ZVDialogConfirmLockAccount f77838i1;

    /* renamed from: M0 */
    final String f77816M0 = StartUpView.class.getSimpleName();

    /* renamed from: Z0 */
    boolean f77829Z0 = false;

    /* renamed from: a1 */
    InterfaceC20094a f77830a1 = new C15083b();

    /* renamed from: b1 */
    boolean f77831b1 = false;

    /* renamed from: c1 */
    boolean f77832c1 = false;

    /* renamed from: e1 */
    boolean f77834e1 = false;

    /* renamed from: f1 */
    boolean f77835f1 = false;

    /* renamed from: g1 */
    boolean f77836g1 = false;

    /* renamed from: h1 */
    boolean f77837h1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.StartUpView$a */
    /* loaded from: classes6.dex */
    class C15082a implements ViewPager.InterfaceC6875j {
        C15082a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            int i13 = i11 % 5;
            if (i13 == 3) {
                StartUpView.this.f77825V0.setTranslationX(-i12);
            } else if (i13 == 4) {
                StartUpView.this.f77825V0.setTranslationX(AbstractC23136l9.m118722k0() - i12);
            } else {
                StartUpView.this.f77825V0.setTranslationX(0.0f);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            if (i11 % 5 == 4) {
                AbstractC23309i.m122372rw(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StartUpView$b */
    /* loaded from: classes6.dex */
    class C15083b implements InterfaceC20094a {
        C15083b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = StartUpView.this.f77816M0;
            StartUpView.this.f77827X0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String string;
            String string2;
            String string3;
            boolean z11;
            boolean z12;
            String str = StartUpView.this.f77816M0;
            StartUpView.this.f77827X0 = false;
            JSONObject jSONObject = (JSONObject) obj;
            new JSONArray();
            try {
                if (!jSONObject.isNull("data")) {
                    JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("countries");
                    if (jSONArray.length() > 0) {
                        C7960e.m41971c6().m42506q4();
                    }
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                        if (jSONObject2.isNull("iso_country_code")) {
                            string = "";
                        } else {
                            string = jSONObject2.getString("iso_country_code");
                        }
                        if (jSONObject2.isNull("country_code")) {
                            string2 = "";
                        } else {
                            string2 = jSONObject2.getString("country_code");
                        }
                        if (jSONObject2.isNull("country_name")) {
                            string3 = "";
                        } else {
                            string3 = jSONObject2.getString("country_name");
                        }
                        if (!jSONObject2.isNull("sms") && jSONObject2.getBoolean("sms")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!jSONObject2.isNull("voice") && jSONObject2.getBoolean("voice")) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z13 = z11;
                        C7960e.m41971c6().m42424i9(new C28655u(string3, string, string2, i11, z13, z12));
                    }
                }
                AbstractC23309i.m121885ey(System.currentTimeMillis());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StartUpView$c */
    /* loaded from: classes6.dex */
    public class C15084c implements InterfaceC20094a {
        C15084c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StartUpView.this.f77832c1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                if (!AbstractC23304d.f113382f0.get() && (optJSONObject = ((JSONObject) obj).optJSONObject("data").optJSONObject("features")) != null) {
                    AbstractC23309i.m120834Cn(optJSONObject.optInt("enable_username_for_startup_flow", 1));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            StartUpView.this.f77832c1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StartUpView$d */
    /* loaded from: classes6.dex */
    public class C15085d implements InterfaceC20094a {
        C15085d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m84466e() {
            StartUpView startUpView = StartUpView.this;
            startUpView.f77837h1 = false;
            startUpView.f77829Z0 = true;
            AbstractC23309i.m122248oj("");
            StartUpView.this.m84439XM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m84467f() {
            StartUpView.this.f72421L0.showDialog(2);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StartUpView startUpView = StartUpView.this;
            startUpView.f77837h1 = false;
            startUpView.f72421L0.mo49315c4();
            StartUpView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.tl0
                @Override // java.lang.Runnable
                public final void run() {
                    StartUpView.C15085d.this.m84467f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            StartUpView.this.f72421L0.mo49315c4();
            StartUpView.this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sl0
                @Override // java.lang.Runnable
                public final void run() {
                    StartUpView.C15085d.this.m84466e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StartUpView$e */
    /* loaded from: classes6.dex */
    public class RunnableC15086e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f77843p;

        RunnableC15086e(String str) {
            this.f77843p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_URL", this.f77843p);
            StartUpView.this.m92676n2().mo35573l4(WebInAppView.class, bundle, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m84417AM() {
        try {
            if (!C7960e.m41971c6().m42583x9() && System.currentTimeMillis() - AbstractC23309i.m121119Kc() <= 86400000) {
                return;
            }
            m84463zM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m84418BM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m84438WM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m84419CM(InterfaceC17463d interfaceC17463d) {
        m84438WM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public /* synthetic */ void m84420DM(View view) {
        AbstractC23304d.f113382f0.set(true);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        if (this.f72421L0.m92662fJ() != null) {
            this.f72421L0.m92662fJ().m93069k2(UpdateNameView.class, bundle, 1, true);
        }
        try {
            int currentItem = (this.f77823T0.getCurrentItem() % 5) + 1;
            String str = AbstractC18458a.f93019a;
            if (!TextUtils.isEmpty(str)) {
                int i11 = 0;
                while (true) {
                    String[] strArr = this.f77826W0;
                    if (i11 < strArr.length) {
                        if (str.equals(strArr[i11])) {
                            AbstractC23647d.m123897g(String.format("38501%d%d", Integer.valueOf(currentItem), Integer.valueOf(i11 + 1)));
                            return;
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public /* synthetic */ void m84421EM(View view) {
        AbstractC23304d.f113382f0.set(true);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromStartUp", true);
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        this.f72421L0.m92662fJ().m93069k2(LoginView.class, bundle, 1, true);
        try {
            int currentItem = (this.f77823T0.getCurrentItem() % 5) + 1;
            String str = AbstractC18458a.f93019a;
            if (!TextUtils.isEmpty(str)) {
                int i11 = 0;
                while (true) {
                    String[] strArr = this.f77826W0;
                    if (i11 < strArr.length) {
                        if (str.equals(strArr[i11])) {
                            AbstractC23647d.m123897g(String.format("38500%d%d", Integer.valueOf(currentItem), Integer.valueOf(i11 + 1)));
                            return;
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public /* synthetic */ void m84422FM(C7050e3 c7050e3, View view) {
        ViewPager viewPager = this.f77823T0;
        viewPager.setCurrentItem(Math.min(viewPager.getCurrentItem() + 1, c7050e3.mo35335g() - 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static /* synthetic */ boolean m84423GM(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m84424HM() {
        try {
            AbstractC2379w.m12430d(this.f72421L0.m92676n2().getCurrentFocus());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m84425IM(InterfaceC29091d interfaceC29091d) {
        this.f77836g1 = false;
        m84438WM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m84426JM(InterfaceC29091d interfaceC29091d, int i11) {
        try {
            C3560a c3560a = this.f77833d1;
            if (c3560a != null) {
                int i12 = c3560a.f15071e;
                if (i12 == 1) {
                    if (C23055e5.m118272g(true)) {
                        this.f72421L0.mo46829Y();
                        C0766k c0766k = new C0766k();
                        c0766k.mo1704o8(new C15085d());
                        this.f77837h1 = true;
                        boolean m86900SK = this.f77838i1.m86900SK();
                        this.f77835f1 = m86900SK;
                        C3560a c3560a2 = this.f77833d1;
                        c0766k.mo1608bb(c3560a2.f15075i, c3560a2.f15076j, c3560a2.f15070d, m86900SK);
                    } else {
                        m84438WM(true);
                    }
                } else if (i12 == 2) {
                    Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f77833d1.f15072f));
                    intent.putExtra("sms_body", this.f77833d1.f15073g);
                    this.f72421L0.startActivityForResult(intent, 4534);
                }
            }
            this.f77836g1 = false;
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public /* synthetic */ void m84427KM(InterfaceC29091d interfaceC29091d, int i11) {
        try {
            this.f77836g1 = false;
            m84438WM(true);
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static /* synthetic */ void m84428LM() {
        AbstractC23775p0.m124198c("default", String.valueOf(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ void m84429MM() {
        if (!this.f77831b1) {
            C3560a c3560a = this.f77833d1;
            c3560a.f15074h = 0;
            AbstractC23309i.m122248oj(c3560a.m18092f().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m84430NM(InterfaceC29091d interfaceC29091d, int i11) {
        try {
            m84437VM();
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
            AbstractC23775p0.m124198c("default", String.valueOf(3));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m84431OM(InterfaceC29091d interfaceC29091d, int i11) {
        if (interfaceC29091d != null) {
            try {
                interfaceC29091d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f77829Z0 = true;
        AbstractC23309i.m122248oj("");
        AbstractC23775p0.m124198c("default", String.valueOf(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m84432PM(InterfaceC29091d interfaceC29091d, int i11) {
        try {
            this.f77829Z0 = true;
            AbstractC23309i.m122248oj("");
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public /* synthetic */ void m84433QM(InterfaceC29091d interfaceC29091d) {
        try {
            this.f77829Z0 = true;
            AbstractC23309i.m122248oj("");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public /* synthetic */ void m84434RM(InterfaceC29091d interfaceC29091d, int i11) {
        this.f77834e1 = false;
        if (interfaceC29091d != null) {
            interfaceC29091d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public /* synthetic */ void m84435SM(InterfaceC29091d interfaceC29091d) {
        this.f77834e1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public /* synthetic */ void m84436TM(InterfaceC29091d interfaceC29091d, int i11) {
        try {
            this.f77834e1 = false;
            if (interfaceC29091d != null) {
                interfaceC29091d.dismiss();
            }
            Bundle bundle = new Bundle();
            String m120742A5 = AbstractC23309i.m120742A5();
            if (!TextUtils.isEmpty(m120742A5)) {
                bundle.putString("extra_account", m120742A5);
            }
            bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            this.f72421L0.m92662fJ().m93069k2(GetPasswordView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VM */
    private void m84437VM() {
        int i11;
        ZVDialogConfirmLockAccount zVDialogConfirmLockAccount = (ZVDialogConfirmLockAccount) this.f72421L0.m92662fJ().m92996E0("TAG_CONFIRM_LOCK_ACCOUNT_ZVDIALOG");
        this.f77838i1 = zVDialogConfirmLockAccount;
        if (zVDialogConfirmLockAccount != null) {
            zVDialogConfirmLockAccount.dismiss();
        }
        ZVDialogConfirmLockAccount.C15378a c15378a = new ZVDialogConfirmLockAccount.C15378a();
        ZVDialogConfirmLockAccount.C15378a c15378a2 = (ZVDialogConfirmLockAccount.C15378a) c15378a.mo77087g(new InterfaceC29091d.a() { // from class: com.zing.zalo.ui.zviews.gl0
            @Override // wl0.InterfaceC29091d.a
            /* renamed from: a */
            public final void mo87277a(InterfaceC29091d interfaceC29091d) {
                StartUpView.this.m84425IM(interfaceC29091d);
            }
        });
        C3560a c3560a = this.f77833d1;
        if (c3560a != null) {
            i11 = c3560a.f15078l;
        } else {
            i11 = 1;
        }
        c15378a2.m86909v(i11).m86908u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_confirm_lock_account), new InterfaceC29091d.b() { // from class: com.zing.zalo.ui.zviews.hl0
            @Override // wl0.InterfaceC29091d.b
            /* renamed from: a */
            public final void mo87262a(InterfaceC29091d interfaceC29091d, int i12) {
                StartUpView.this.m84426JM(interfaceC29091d, i12);
            }
        }).m86907t(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC29091d.b() { // from class: com.zing.zalo.ui.zviews.il0
            @Override // wl0.InterfaceC29091d.b
            /* renamed from: a */
            public final void mo87262a(InterfaceC29091d interfaceC29091d, int i12) {
                StartUpView.this.m84427KM(interfaceC29091d, i12);
            }
        });
        ZVDialogConfirmLockAccount m86906s = c15378a.m86906s();
        this.f77838i1 = m86906s;
        this.f77836g1 = true;
        m86906s.m92622OK(m92662fJ(), "TAG_CONFIRM_LOCK_ACCOUNT_ZVDIALOG");
    }

    /* renamed from: WM */
    private void m84438WM(boolean z11) {
        if (this.f77833d1 == null) {
            return;
        }
        try {
            ZVDialogViewLockAccount zVDialogViewLockAccount = (ZVDialogViewLockAccount) this.f72421L0.m92662fJ().m92996E0("TAG_LOCK_ACCOUNT_ZVDIALOG");
            if (zVDialogViewLockAccount != null) {
                if (z11) {
                    zVDialogViewLockAccount.dismiss();
                }
                if (zVDialogViewLockAccount.m92621MK() || z11) {
                    zVDialogViewLockAccount = null;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            C3560a c3560a = this.f77833d1;
            long j11 = c3560a.f15077k;
            if (currentTimeMillis > j11 && j11 > 0) {
                AbstractC23775p0.m124198c("default", String.valueOf(3));
                this.f77829Z0 = true;
                AbstractC23309i.m122248oj("");
                this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ql0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StartUpView.m84428LM();
                    }
                }, 1000L);
                return;
            }
            if (zVDialogViewLockAccount == null) {
                Spanned fromHtml = Html.fromHtml(c3560a.m18087a());
                SpannableString spannableString = new SpannableString(fromHtml);
                Linkify.addLinks(spannableString, 6);
                String obj = fromHtml.toString();
                int indexOf = obj.indexOf("(");
                int indexOf2 = obj.indexOf(")", indexOf);
                if (indexOf >= 0 && indexOf2 > indexOf) {
                    int i11 = indexOf + 1;
                    String trim = obj.substring(i11, indexOf2).trim();
                    if (trim.startsWith("http")) {
                        spannableString.setSpan(new C23225u.a(i11, indexOf2, new RunnableC15086e(trim)), i11, indexOf2, 33);
                    }
                }
                C3560a c3560a2 = this.f77833d1;
                if (c3560a2.f15071e == 2 && (c3560a2.f15072f == 0 || TextUtils.isEmpty(c3560a2.f15073g))) {
                    this.f77833d1.f15071e = 1;
                }
                ZVDialogViewLockAccount.C15381b c15381b = new ZVDialogViewLockAccount.C15381b();
                C3560a c3560a3 = this.f77833d1;
                int i12 = c3560a3.f15071e;
                if (i12 != 2 && (i12 != 1 || TextUtils.isEmpty(c3560a3.f15070d))) {
                    c15381b.m86931A(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_lock_account)).m86938z(spannableString).m86937y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC29091d.b() { // from class: com.zing.zalo.ui.zviews.bl0
                        @Override // wl0.InterfaceC29091d.b
                        /* renamed from: a */
                        public final void mo87262a(InterfaceC29091d interfaceC29091d, int i13) {
                            StartUpView.this.m84432PM(interfaceC29091d, i13);
                        }
                    }).mo77087g(new InterfaceC29091d.a() { // from class: com.zing.zalo.ui.zviews.cl0
                        @Override // wl0.InterfaceC29091d.a
                        /* renamed from: a */
                        public final void mo87277a(InterfaceC29091d interfaceC29091d) {
                            StartUpView.this.m84433QM(interfaceC29091d);
                        }
                    });
                    AbstractC23775p0.m124198c("default", String.valueOf(3));
                    c15381b.m86936w().m92622OK(m92662fJ(), "TAG_LOCK_ACCOUNT_ZVDIALOG");
                }
                ((ZVDialogViewLockAccount.C15381b) ((ZVDialogViewLockAccount.C15381b) c15381b.m86931A(this.f77833d1.m18088b()).m86938z(spannableString).mo77085e(false)).mo77086f(false)).m86935E(this.f77833d1.f15074h).m86934D(this.f77833d1.f15077k).m86933C(new ZVDialogViewLockAccount.InterfaceC15382c() { // from class: com.zing.zalo.ui.zviews.rl0
                    @Override // com.zing.zalo.p077ui.zviews.ZVDialogViewLockAccount.InterfaceC15382c
                    /* renamed from: a */
                    public final void mo86939a() {
                        StartUpView.this.m84429MM();
                    }
                }).m86932B(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_lock_account), new InterfaceC29091d.b() { // from class: com.zing.zalo.ui.zviews.zk0
                    @Override // wl0.InterfaceC29091d.b
                    /* renamed from: a */
                    public final void mo87262a(InterfaceC29091d interfaceC29091d, int i13) {
                        StartUpView.this.m84430NM(interfaceC29091d, i13);
                    }
                }).m86937y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC29091d.b() { // from class: com.zing.zalo.ui.zviews.al0
                    @Override // wl0.InterfaceC29091d.b
                    /* renamed from: a */
                    public final void mo87262a(InterfaceC29091d interfaceC29091d, int i13) {
                        StartUpView.this.m84431OM(interfaceC29091d, i13);
                    }
                });
                c15381b.m86936w().m92622OK(m92662fJ(), "TAG_LOCK_ACCOUNT_ZVDIALOG");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public void m84439XM() {
        ZVDialogLockAccountSuccess zVDialogLockAccountSuccess = (ZVDialogLockAccountSuccess) this.f72421L0.m92662fJ().m92996E0("TAG_LOCK_ACCOUNT_SUCCESS_ZVDIALOG");
        if (zVDialogLockAccountSuccess != null) {
            zVDialogLockAccountSuccess.dismiss();
        }
        ZVDialogLockAccountSuccess.C15379a c15379a = new ZVDialogLockAccountSuccess.C15379a();
        c15379a.m86915s(this.f77835f1);
        if (this.f77835f1) {
            c15379a.m86914r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_get_password), new InterfaceC29091d.b() { // from class: com.zing.zalo.ui.zviews.dl0
                @Override // wl0.InterfaceC29091d.b
                /* renamed from: a */
                public final void mo87262a(InterfaceC29091d interfaceC29091d, int i11) {
                    StartUpView.this.m84436TM(interfaceC29091d, i11);
                }
            });
        } else {
            c15379a.m86914r(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC29091d.b() { // from class: com.zing.zalo.ui.zviews.el0
                @Override // wl0.InterfaceC29091d.b
                /* renamed from: a */
                public final void mo87262a(InterfaceC29091d interfaceC29091d, int i11) {
                    StartUpView.this.m84434RM(interfaceC29091d, i11);
                }
            });
        }
        c15379a.mo77087g(new InterfaceC29091d.a() { // from class: com.zing.zalo.ui.zviews.fl0
            @Override // wl0.InterfaceC29091d.a
            /* renamed from: a */
            public final void mo87277a(InterfaceC29091d interfaceC29091d) {
                StartUpView.this.m84435SM(interfaceC29091d);
            }
        });
        ZVDialogLockAccountSuccess m86913q = c15379a.m86913q();
        this.f77834e1 = true;
        m86913q.m92622OK(m92662fJ(), "TAG_LOCK_ACCOUNT_SUCCESS_ZVDIALOG");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C13778s1.m76971l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lock_account_error)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.yk0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    StartUpView.this.m84418BM(interfaceC17463d, i12);
                }
            }).m43167p(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.jl0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    StartUpView.this.m84419CM(interfaceC17463d);
                }
            });
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lock_account_success)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.start_up_view, viewGroup, false);
        this.f77822S0 = inflate;
        this.f77817N0 = (ImageView) inflate.findViewById(AbstractC6918a0.imvAppLogo);
        TextView textView = (TextView) this.f77822S0.findViewById(AbstractC6918a0.btnRegisterUsingPhoneNumber);
        this.f77818O0 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.kl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartUpView.this.m84420DM(view);
            }
        });
        View findViewById = this.f77822S0.findViewById(AbstractC6918a0.btnLogin);
        this.f77819P0 = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ll0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartUpView.this.m84421EM(view);
            }
        });
        String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language);
        this.f77826W0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
        this.f77820Q0 = (RobotoTextView) this.f77822S0.findViewById(AbstractC6918a0.str_language_applied_vi);
        RobotoTextView robotoTextView = (RobotoTextView) this.f77822S0.findViewById(AbstractC6918a0.str_language_applied_en);
        this.f77821R0 = robotoTextView;
        RobotoTextView[] robotoTextViewArr = new RobotoTextView[this.f77826W0.length];
        robotoTextViewArr[0] = this.f77820Q0;
        robotoTextViewArr[1] = robotoTextView;
        String str = AbstractC18458a.f93019a;
        this.f77828Y0 = str;
        boolean z11 = !TextUtils.isEmpty(str);
        for (int i11 = 0; i11 < this.f77826W0.length; i11++) {
            RobotoTextView robotoTextView2 = robotoTextViewArr[i11];
            if (robotoTextView2 != null) {
                robotoTextView2.setText(m118755v0[i11]);
                robotoTextViewArr[i11].setOnClickListener(this);
                if (z11) {
                    boolean equals = this.f77828Y0.equals(this.f77826W0[i11]);
                    robotoTextViewArr[i11].setEnabled(!equals);
                    robotoTextViewArr[i11].setTextStyleBold(equals);
                }
            }
        }
        ImageView imageView = (ImageView) this.f77822S0.findViewById(AbstractC6918a0.imgZalo);
        this.f77825V0 = imageView;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        if (marginLayoutParams != null) {
            if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
                marginLayoutParams.topMargin = AbstractC23222t7.f112576o + AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
            } else {
                marginLayoutParams.topMargin = AbstractC23222t7.f112576o;
            }
        }
        this.f77823T0 = (ViewPager) this.f77822S0.findViewById(AbstractC6918a0.viewpager);
        final C7050e3 c7050e3 = new C7050e3();
        c7050e3.m36029y(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartUpView.this.m84422FM(c7050e3, view);
            }
        });
        this.f77823T0.setAdapter(c7050e3);
        if (AbstractC23309i.m121123Kg()) {
            this.f77823T0.setCurrentItem(499);
        } else {
            this.f77823T0.setCurrentItem(0);
        }
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) this.f77822S0.findViewById(AbstractC6918a0.sliding_tabs);
        this.f77824U0 = slidingTabLayout;
        slidingTabLayout.f69624v = 5;
        slidingTabLayout.setViewPager(this.f77823T0);
        this.f77824U0.setSelectedIndicatorColors(-16741121);
        this.f77824U0.setEnableDivider(true);
        this.f77824U0.setDividerColors(0);
        this.f77824U0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.nl0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m84423GM;
                m84423GM = StartUpView.m84423GM(view, motionEvent);
                return m84423GM;
            }
        });
        this.f77823T0.addOnPageChangeListener(new C15082a());
        if (this.f72421L0.m92642L3() != null && (this.f72421L0.m92642L3().getBoolean("BOL_EXTRA_LOGOUT_GET_FLOW_LOGIN", false) || System.currentTimeMillis() - AbstractC23309i.m121744b7() > 3600000)) {
            m84462yM();
        }
        return this.f77822S0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putBoolean("isCloseDialog", this.f77829Z0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            this.f77831b1 = false;
            if (!this.f77834e1 && !this.f77836g1 && !this.f77837h1 && !this.f77829Z0 && this.f77833d1 != null) {
                m84438WM(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: UM */
    void m84461UM() {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.setClassName(this.f72421L0.m92648SI(), "com.zing.zalo.ui.SplashActivity");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.addFlags(268435456);
            intent.addFlags(2097152);
            if (Build.VERSION.SDK_INT < 26) {
                Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                intent2.putExtra("duplicate", false);
                intent2.putExtra("android.intent.extra.shortcut.NAME", AbstractC23136l9.m118743r0(AbstractC8020f0.app_name));
                intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this.f72421L0.m92648SI(), AbstractC16803z.icon));
                this.f72421L0.m92648SI().sendBroadcast(intent2);
            } else if (AbstractC18942g.m99253i() && AbstractC18942g.m99250f() != null && AbstractC18942g.m99250f().contains("SAMSUNG")) {
                AbstractC23178p7.m119404c(getContext(), AbstractC23178p7.m119408g(getContext(), "zalo-launcher-shortcut", AbstractC16803z.icon, AbstractC23136l9.m118743r0(AbstractC8020f0.app_name), intent));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f77831b1 = true;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        if (MainApplication.getAppContext() == null || CoreUtility.getAppContext() == null) {
            this.f72421L0.m92662fJ().m93069k2(DeviceRestartView.class, null, 2, true);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StartUpView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 4534) {
            m84438WM(true);
        } else {
            super.onActivityResult(i11, i12, intent);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.str_language_applied_vi) {
            view.setEnabled(false);
            this.f77821R0.setEnabled(true);
            String[] strArr = this.f77826W0;
            if (strArr.length > 0) {
                str = strArr[0];
            }
            str = null;
        } else {
            if (id2 == AbstractC6918a0.str_language_applied_en) {
                view.setEnabled(false);
                this.f77820Q0.setEnabled(true);
                String[] strArr2 = this.f77826W0;
                if (strArr2.length > 1) {
                    str = strArr2[1];
                }
            }
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            AbstractC23647d.m123906p("19700");
            C23269y3.m120035a(str);
            AbstractC23647d.m123893c();
            ((BaseZaloActivity) this.f72421L0.m92648SI()).recreate();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        Handler handler = this.f72827B0;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.pl0
                @Override // java.lang.Runnable
                public final void run() {
                    StartUpView.this.m84424HM();
                }
            }, 200L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            if (AbstractC23309i.m121514V0()) {
                AbstractC23309i.m121908fj(false);
                m84461UM();
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.ol0
                @Override // java.lang.Runnable
                public final void run() {
                    StartUpView.this.m84417AM();
                }
            });
            if (bundle == null && PreferencesProvider.f43165t) {
                IOErrorInfoView.m80767fM(this.f72421L0.m92662fJ());
            }
            if (bundle != null) {
                this.f77829Z0 = bundle.getBoolean("isCloseDialog", false);
            }
            this.f77833d1 = null;
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("extraKickOutData") && !this.f77829Z0) {
                JSONObject jSONObject = new JSONObject(m92642L3.getString("extraKickOutData"));
                C3560a c3560a = new C3560a(jSONObject);
                this.f77833d1 = c3560a;
                if (c3560a.f15071e > 0) {
                    AbstractC23309i.m122248oj(jSONObject.toString());
                }
            }
            if (this.f77833d1 == null) {
                try {
                    String m121851e1 = AbstractC23309i.m121851e1();
                    if (!TextUtils.isEmpty(m121851e1)) {
                        this.f77833d1 = new C3560a(new JSONObject(m121851e1));
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            ZVDialogLockAccountSuccess zVDialogLockAccountSuccess = (ZVDialogLockAccountSuccess) this.f72421L0.m92662fJ().m92996E0("TAG_LOCK_ACCOUNT_SUCCESS_ZVDIALOG");
            if (zVDialogLockAccountSuccess != null) {
                this.f77834e1 = true;
                this.f77835f1 = zVDialogLockAccountSuccess.f79527I0;
                m84439XM();
            }
            if (((ZVDialogConfirmLockAccount) this.f72421L0.m92662fJ().m92996E0("TAG_CONFIRM_LOCK_ACCOUNT_ZVDIALOG")) != null) {
                this.f77836g1 = true;
                m84437VM();
            }
            ZVDialogViewLockAccount zVDialogViewLockAccount = (ZVDialogViewLockAccount) this.f72421L0.m92662fJ().m92996E0("TAG_LOCK_ACCOUNT_ZVDIALOG");
            if (zVDialogViewLockAccount != null) {
                zVDialogViewLockAccount.dismiss();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: yM */
    void m84462yM() {
        String str;
        try {
            if (this.f77832c1) {
                return;
            }
            String str2 = "0";
            try {
                str = AbstractC23309i.m121037I4();
                try {
                    str2 = AbstractC23349d.m122766d() + "";
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15084c());
                    AbstractC23309i.m122663zr(System.currentTimeMillis());
                    this.f77832c1 = true;
                    c0766k.mo1538T4(str2, str, "", "");
                }
            } catch (Exception e12) {
                e = e12;
                str = "";
            }
            C0766k c0766k2 = new C0766k();
            c0766k2.mo1704o8(new C15084c());
            AbstractC23309i.m122663zr(System.currentTimeMillis());
            this.f77832c1 = true;
            c0766k2.mo1538T4(str2, str, "", "");
        } catch (Exception e13) {
            e13.printStackTrace();
            this.f77832c1 = false;
        }
    }

    /* renamed from: zM */
    void m84463zM() {
        if (this.f77827X0) {
            return;
        }
        this.f77827X0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(this.f77830a1);
        c0766k.mo1482M4(AbstractC23309i.m121704a5(), true);
    }
}
