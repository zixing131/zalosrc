package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.settings.SwitchAccountView;
import com.zing.zalo.p077ui.zviews.ChangePasswordView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import me0.C23055e5;
import mm0.AbstractC23352g;
import mm0.AbstractC23353h;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32234k;

/* loaded from: classes6.dex */
public class ChangePasswordView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f72603P0;

    /* renamed from: Q0 */
    CustomEditText f72604Q0;

    /* renamed from: R0 */
    TextView f72605R0;

    /* renamed from: S0 */
    CustomEditText f72606S0;

    /* renamed from: T0 */
    TextView f72607T0;

    /* renamed from: U0 */
    CustomEditText f72608U0;

    /* renamed from: V0 */
    TextView f72609V0;

    /* renamed from: W0 */
    TextView f72610W0;

    /* renamed from: X0 */
    TextView f72611X0;

    /* renamed from: Y0 */
    TextView f72612Y0;

    /* renamed from: Z0 */
    TextView f72613Z0;

    /* renamed from: a1 */
    TextView f72614a1;

    /* renamed from: t1 */
    int f72633t1;

    /* renamed from: b1 */
    String f72615b1 = "";

    /* renamed from: c1 */
    boolean f72616c1 = false;

    /* renamed from: d1 */
    boolean f72617d1 = false;

    /* renamed from: e1 */
    boolean f72618e1 = false;

    /* renamed from: f1 */
    int f72619f1 = 0;

    /* renamed from: g1 */
    boolean f72620g1 = false;

    /* renamed from: h1 */
    boolean f72621h1 = false;

    /* renamed from: i1 */
    String f72622i1 = "";

    /* renamed from: j1 */
    boolean f72623j1 = true;

    /* renamed from: k1 */
    boolean f72624k1 = true;

    /* renamed from: l1 */
    boolean f72625l1 = true;

    /* renamed from: m1 */
    String f72626m1 = "";

    /* renamed from: n1 */
    String f72627n1 = "";

    /* renamed from: o1 */
    String f72628o1 = "";

    /* renamed from: p1 */
    Drawable f72629p1 = AbstractC23136l9.m118663M(AbstractC16803z.icn_forgotpass_delete_error);

    /* renamed from: q1 */
    Drawable f72630q1 = AbstractC23136l9.m118663M(AbstractC16803z.icn_forgotpass_check);

    /* renamed from: r1 */
    Drawable f72631r1 = AbstractC23136l9.m118663M(AbstractC16803z.icn_forgotpass_delete);

    /* renamed from: s1 */
    View.OnFocusChangeListener f72632s1 = new ViewOnFocusChangeListenerC14138b();

    /* renamed from: u1 */
    boolean f72634u1 = false;

    /* renamed from: v1 */
    C0766k f72635v1 = new C0766k();

    /* renamed from: w1 */
    InterfaceC20094a f72636w1 = new C14142f();

    /* renamed from: x1 */
    C0766k f72637x1 = new C0766k();

    /* renamed from: y1 */
    InterfaceC20094a f72638y1 = new C14143g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ChangePasswordView$a */
    /* loaded from: classes6.dex */
    public class C14137a extends AbstractC18391a {
        C14137a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (ChangePasswordView.this.f72604Q0.getText() == editable) {
                ChangePasswordView changePasswordView = ChangePasswordView.this;
                if (!changePasswordView.f72623j1 && !changePasswordView.f72626m1.equals(editable.toString())) {
                    ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                    changePasswordView2.f72623j1 = true;
                    changePasswordView2.f72611X0.setVisibility(8);
                    ChangePasswordView.this.f72604Q0.setRightDrawable(null);
                    CustomEditText customEditText = ChangePasswordView.this.f72604Q0;
                    if (customEditText.f83177K) {
                        i14 = AbstractC16803z.edt_active;
                    } else {
                        i14 = AbstractC16803z.edt_normal;
                    }
                    customEditText.setBackgroundResource(i14);
                    ChangePasswordView changePasswordView3 = ChangePasswordView.this;
                    changePasswordView3.f72604Q0.setClearDrawable(changePasswordView3.f72631r1);
                    ChangePasswordView.this.f72604Q0.m87733I();
                }
                ChangePasswordView.this.f72626m1 = editable.toString();
            }
            if (ChangePasswordView.this.f72606S0.getText() == editable) {
                if (!ChangePasswordView.this.f72627n1.equals(editable.toString())) {
                    ChangePasswordView changePasswordView4 = ChangePasswordView.this;
                    if (!changePasswordView4.f72624k1) {
                        changePasswordView4.f72624k1 = true;
                        changePasswordView4.f72612Y0.setVisibility(8);
                        ChangePasswordView.this.f72606S0.setRightDrawable(null);
                        CustomEditText customEditText2 = ChangePasswordView.this.f72606S0;
                        if (customEditText2.f83177K) {
                            i13 = AbstractC16803z.edt_active;
                        } else {
                            i13 = AbstractC16803z.edt_normal;
                        }
                        customEditText2.setBackgroundResource(i13);
                        ChangePasswordView changePasswordView5 = ChangePasswordView.this;
                        changePasswordView5.f72606S0.setClearDrawable(changePasswordView5.f72631r1);
                        ChangePasswordView.this.f72606S0.m87733I();
                    }
                    ChangePasswordView changePasswordView6 = ChangePasswordView.this;
                    if (!changePasswordView6.f72625l1) {
                        changePasswordView6.f72625l1 = true;
                        changePasswordView6.f72613Z0.setVisibility(8);
                        ChangePasswordView.this.f72608U0.setRightDrawable(null);
                        CustomEditText customEditText3 = ChangePasswordView.this.f72608U0;
                        if (customEditText3.f83177K) {
                            i12 = AbstractC16803z.edt_active;
                        } else {
                            i12 = AbstractC16803z.edt_normal;
                        }
                        customEditText3.setBackgroundResource(i12);
                        ChangePasswordView changePasswordView7 = ChangePasswordView.this;
                        changePasswordView7.f72608U0.setClearDrawable(changePasswordView7.f72631r1);
                        ChangePasswordView.this.f72608U0.m87733I();
                    }
                }
                ChangePasswordView.this.f72627n1 = editable.toString();
            }
            if (ChangePasswordView.this.f72608U0.getText() == editable) {
                ChangePasswordView changePasswordView8 = ChangePasswordView.this;
                if (!changePasswordView8.f72625l1 && !changePasswordView8.f72628o1.equals(editable.toString())) {
                    ChangePasswordView changePasswordView9 = ChangePasswordView.this;
                    changePasswordView9.f72625l1 = true;
                    changePasswordView9.f72613Z0.setVisibility(8);
                    ChangePasswordView.this.f72608U0.setRightDrawable(null);
                    CustomEditText customEditText4 = ChangePasswordView.this.f72608U0;
                    if (customEditText4.f83177K) {
                        i11 = AbstractC16803z.edt_active;
                    } else {
                        i11 = AbstractC16803z.edt_normal;
                    }
                    customEditText4.setBackgroundResource(i11);
                    ChangePasswordView changePasswordView10 = ChangePasswordView.this;
                    changePasswordView10.f72608U0.setClearDrawable(changePasswordView10.f72631r1);
                    ChangePasswordView.this.f72608U0.m87733I();
                }
                ChangePasswordView.this.f72628o1 = editable.toString();
            }
            if (ChangePasswordView.this.f72604Q0.length() == 0) {
                ChangePasswordView.this.f72604Q0.setRightDrawable(null);
            }
            if (ChangePasswordView.this.f72606S0.length() == 0) {
                ChangePasswordView.this.f72606S0.setRightDrawable(null);
            }
            if (ChangePasswordView.this.f72608U0.length() == 0) {
                ChangePasswordView.this.f72608U0.setRightDrawable(null);
            }
            ChangePasswordView.this.m78709nM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChangePasswordView$b */
    /* loaded from: classes6.dex */
    class ViewOnFocusChangeListenerC14138b implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC14138b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            Drawable drawable = null;
            try {
                if (z11) {
                    ChangePasswordView changePasswordView = ChangePasswordView.this;
                    CustomEditText customEditText = changePasswordView.f72604Q0;
                    if (view == customEditText) {
                        if (changePasswordView.f72623j1) {
                            customEditText.setRightDrawable(null);
                            ChangePasswordView.this.f72611X0.setVisibility(8);
                            ChangePasswordView.this.f72604Q0.setEnableClearText(true);
                            ChangePasswordView.this.f72604Q0.setBackgroundResource(AbstractC16803z.edt_active);
                            return;
                        }
                        return;
                    }
                    CustomEditText customEditText2 = changePasswordView.f72606S0;
                    if (view == customEditText2) {
                        if (changePasswordView.f72624k1) {
                            customEditText2.setRightDrawable(null);
                            ChangePasswordView.this.f72612Y0.setVisibility(8);
                            ChangePasswordView.this.f72606S0.setEnableClearText(true);
                            ChangePasswordView.this.f72606S0.setBackgroundResource(AbstractC16803z.edt_active);
                            return;
                        }
                        return;
                    }
                    CustomEditText customEditText3 = changePasswordView.f72608U0;
                    if (view == customEditText3 && changePasswordView.f72625l1) {
                        customEditText3.setRightDrawable(null);
                        ChangePasswordView.this.f72613Z0.setVisibility(8);
                        ChangePasswordView.this.f72608U0.setBackgroundResource(AbstractC16803z.edt_active);
                        return;
                    }
                    return;
                }
                ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                CustomEditText customEditText4 = changePasswordView2.f72604Q0;
                if (view == customEditText4) {
                    if (changePasswordView2.f72623j1) {
                        customEditText4.setBackgroundResource(AbstractC16803z.edt_normal);
                    }
                    if (!TextUtils.isEmpty(ChangePasswordView.this.f72604Q0.getText())) {
                        ChangePasswordView changePasswordView3 = ChangePasswordView.this;
                        changePasswordView3.m78710oM(changePasswordView3.f72604Q0.getText().toString());
                        return;
                    }
                    return;
                }
                CustomEditText customEditText5 = changePasswordView2.f72606S0;
                if (view == customEditText5) {
                    if (changePasswordView2.f72624k1) {
                        customEditText5.setBackgroundResource(AbstractC16803z.edt_normal);
                    }
                    if (!TextUtils.isEmpty(ChangePasswordView.this.f72606S0.getText())) {
                        ChangePasswordView changePasswordView4 = ChangePasswordView.this;
                        String m78702gM = changePasswordView4.m78702gM(changePasswordView4.f72606S0.getText().toString());
                        if (TextUtils.isEmpty(m78702gM)) {
                            ChangePasswordView changePasswordView5 = ChangePasswordView.this;
                            changePasswordView5.m78703hM(changePasswordView5.f72606S0.getText().toString());
                            return;
                        }
                        CustomEditText customEditText6 = ChangePasswordView.this.f72606S0;
                        if (customEditText6.length() != 0) {
                            drawable = ChangePasswordView.this.f72629p1;
                        }
                        customEditText6.setRightDrawable(drawable);
                        ChangePasswordView.this.f72606S0.setBackgroundResource(AbstractC16803z.edt_error);
                        ChangePasswordView.this.f72606S0.setEnableClearText(true);
                        ChangePasswordView changePasswordView6 = ChangePasswordView.this;
                        changePasswordView6.f72606S0.setClearDrawable(changePasswordView6.f72629p1);
                        ChangePasswordView changePasswordView7 = ChangePasswordView.this;
                        changePasswordView7.f72624k1 = false;
                        changePasswordView7.f72612Y0.setText(m78702gM);
                        ChangePasswordView.this.f72612Y0.setVisibility(0);
                        return;
                    }
                    return;
                }
                CustomEditText customEditText7 = changePasswordView2.f72608U0;
                if (view == customEditText7 && changePasswordView2.f72625l1) {
                    customEditText7.setBackgroundResource(AbstractC16803z.edt_normal);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ChangePasswordView$c */
    /* loaded from: classes6.dex */
    public class C14139c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f72641a;

        C14139c(String str) {
            this.f72641a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m78713e(String str) {
            try {
                if (!ChangePasswordView.this.m92677nJ() && str.equals(ChangePasswordView.this.f72604Q0.getText().toString())) {
                    ChangePasswordView changePasswordView = ChangePasswordView.this;
                    CustomEditText customEditText = changePasswordView.f72604Q0;
                    if (!customEditText.f83177K) {
                        changePasswordView.f72623j1 = true;
                        customEditText.setRightDrawable(changePasswordView.f72630q1);
                        ChangePasswordView.this.f72604Q0.setEnableClearText(false);
                        ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                        changePasswordView2.f72604Q0.setClearDrawable(changePasswordView2.f72631r1);
                        ChangePasswordView.this.f72604Q0.m87733I();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78714f(String str, C20096c c20096c) {
            Drawable drawable;
            try {
                if (!ChangePasswordView.this.m92677nJ() && str.equals(ChangePasswordView.this.f72604Q0.getText().toString()) && !ChangePasswordView.this.f72604Q0.f83177K && c20096c.m104491c() == 2017) {
                    ChangePasswordView.this.f72611X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_password_old_dont_match));
                    ChangePasswordView.this.f72611X0.setVisibility(0);
                    ChangePasswordView changePasswordView = ChangePasswordView.this;
                    changePasswordView.f72623j1 = false;
                    CustomEditText customEditText = changePasswordView.f72604Q0;
                    if (customEditText.length() != 0) {
                        drawable = ChangePasswordView.this.f72629p1;
                    } else {
                        drawable = null;
                    }
                    customEditText.setRightDrawable(drawable);
                    ChangePasswordView.this.f72604Q0.setBackgroundResource(AbstractC16803z.edt_error);
                    ChangePasswordView.this.f72604Q0.setEnableClearText(true);
                    ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                    changePasswordView2.f72604Q0.setClearDrawable(changePasswordView2.f72629p1);
                    ChangePasswordView.this.f72604Q0.m87733I();
                    ChangePasswordView.this.m78709nM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            if (ChangePasswordView.this.m92676n2() != null) {
                InterfaceC27218a m92676n2 = ChangePasswordView.this.m92676n2();
                final String str = this.f72641a;
                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.e5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChangePasswordView.C14139c.this.m78714f(str, c20096c);
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (ChangePasswordView.this.m92676n2() != null) {
                InterfaceC27218a m92676n2 = ChangePasswordView.this.m92676n2();
                final String str = this.f72641a;
                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.d5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChangePasswordView.C14139c.this.m78713e(str);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ChangePasswordView$d */
    /* loaded from: classes6.dex */
    public class C14140d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f72643a;

        C14140d(String str) {
            this.f72643a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m78717e(String str) {
            try {
                if (!ChangePasswordView.this.m92677nJ() && str.equals(ChangePasswordView.this.f72606S0.getText().toString())) {
                    ChangePasswordView changePasswordView = ChangePasswordView.this;
                    CustomEditText customEditText = changePasswordView.f72606S0;
                    if (!customEditText.f83177K) {
                        changePasswordView.f72624k1 = true;
                        customEditText.setRightDrawable(changePasswordView.f72630q1);
                        ChangePasswordView.this.f72606S0.setEnableClearText(false);
                        ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                        changePasswordView2.f72606S0.setClearDrawable(changePasswordView2.f72631r1);
                        ChangePasswordView.this.f72606S0.m87733I();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78718f(C20096c c20096c, String str, String str2) {
            Drawable drawable;
            try {
                if (!ChangePasswordView.this.m92677nJ() && c20096c.m104491c() == 2025 && str.equals(ChangePasswordView.this.f72606S0.getText().toString())) {
                    ChangePasswordView changePasswordView = ChangePasswordView.this;
                    CustomEditText customEditText = changePasswordView.f72606S0;
                    if (!customEditText.f83177K) {
                        changePasswordView.f72624k1 = false;
                        if (customEditText.length() != 0) {
                            drawable = ChangePasswordView.this.f72629p1;
                        } else {
                            drawable = null;
                        }
                        customEditText.setRightDrawable(drawable);
                        ChangePasswordView.this.f72606S0.setBackgroundResource(AbstractC16803z.edt_error);
                        ChangePasswordView.this.f72606S0.setEnableClearText(true);
                        ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                        changePasswordView2.f72606S0.setClearDrawable(changePasswordView2.f72629p1);
                        ChangePasswordView.this.f72606S0.m87733I();
                        ChangePasswordView.this.f72612Y0.setText(str2);
                        ChangePasswordView.this.f72612Y0.setVisibility(0);
                        ChangePasswordView.this.m78709nM();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                final String optString = new JSONObject(c20096c.m104490b()).optString("error_message_localize", "");
                if (ChangePasswordView.this.m92676n2() != null) {
                    InterfaceC27218a m92676n2 = ChangePasswordView.this.m92676n2();
                    final String str = this.f72643a;
                    m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.f5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChangePasswordView.C14140d.this.m78718f(c20096c, str, optString);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (ChangePasswordView.this.m92676n2() != null) {
                InterfaceC27218a m92676n2 = ChangePasswordView.this.m92676n2();
                final String str = this.f72643a;
                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.g5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChangePasswordView.C14140d.this.m78717e(str);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ChangePasswordView$e */
    /* loaded from: classes6.dex */
    class C14141e extends ZdsActionBar.AbstractC16987c {
        C14141e() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            ChangePasswordView.this.m78706kM();
            AbstractC23647d.m123897g("37159");
            ChangePasswordView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ChangePasswordView$f */
    /* loaded from: classes6.dex */
    public class C14142f implements InterfaceC20094a {
        C14142f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78722f() {
            ChangePasswordView.this.f72421L0.mo49315c4();
            try {
                ChangePasswordView.this.m78706kM();
                ChangePasswordView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ void m78723g(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e3 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:2:0x0000, B:4:0x000d, B:7:0x0060, B:10:0x006c, B:12:0x0072, B:14:0x007a, B:16:0x008f, B:18:0x00a9, B:19:0x00ad, B:20:0x00ee, B:24:0x00d1, B:25:0x00dd, B:27:0x00e3, B:28:0x0017, B:30:0x0037, B:31:0x003d), top: B:1:0x0000 }] */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m78724h(C20096c c20096c) {
            Drawable drawable;
            try {
                Drawable drawable2 = null;
                if (c20096c.m104491c() != 2017) {
                    if (c20096c.m104491c() == 2053) {
                    }
                    if (TextUtils.isEmpty(c20096c.m104490b()) && (c20096c.m104491c() == 2053 || c20096c.m104491c() == 2025)) {
                        String optString = new JSONObject(c20096c.m104490b()).optString("error_message", "");
                        if (!TextUtils.isEmpty(optString)) {
                            ChangePasswordView.this.f72612Y0.setText(optString);
                            ChangePasswordView.this.f72612Y0.setVisibility(0);
                            ChangePasswordView changePasswordView = ChangePasswordView.this;
                            changePasswordView.f72624k1 = false;
                            CustomEditText customEditText = changePasswordView.f72606S0;
                            if (customEditText.length() != 0) {
                                drawable2 = ChangePasswordView.this.f72629p1;
                            }
                            customEditText.setRightDrawable(drawable2);
                            ChangePasswordView.this.f72606S0.setBackgroundResource(AbstractC16803z.edt_error);
                            ChangePasswordView.this.f72606S0.setEnableClearText(true);
                            ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                            changePasswordView2.f72606S0.setClearDrawable(changePasswordView2.f72629p1);
                            ChangePasswordView.this.f72606S0.m87734J(false);
                        } else {
                            ToastUtils.showMess(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                        }
                    } else if (c20096c.m104491c() != 2017) {
                        ToastUtils.showMess(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                    }
                    ChangePasswordView.this.m78709nM();
                }
                ChangePasswordView.this.f72611X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_password_old_dont_match));
                ChangePasswordView.this.f72611X0.setVisibility(0);
                ChangePasswordView changePasswordView3 = ChangePasswordView.this;
                changePasswordView3.f72623j1 = false;
                CustomEditText customEditText2 = changePasswordView3.f72604Q0;
                if (customEditText2.length() != 0) {
                    drawable = ChangePasswordView.this.f72629p1;
                } else {
                    drawable = null;
                }
                customEditText2.setRightDrawable(drawable);
                ChangePasswordView.this.f72604Q0.setBackgroundResource(AbstractC16803z.edt_error);
                ChangePasswordView.this.f72604Q0.setEnableClearText(true);
                ChangePasswordView changePasswordView4 = ChangePasswordView.this;
                changePasswordView4.f72604Q0.setClearDrawable(changePasswordView4.f72629p1);
                ChangePasswordView.this.f72604Q0.m87734J(false);
                if (TextUtils.isEmpty(c20096c.m104490b())) {
                }
                if (c20096c.m104491c() != 2017) {
                }
                ChangePasswordView.this.m78709nM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            ChangePasswordView changePasswordView = ChangePasswordView.this;
            changePasswordView.f72634u1 = false;
            changePasswordView.f72421L0.mo78960q3();
            if (!AbstractC23216t1.m119643h(ChangePasswordView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.i5
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    ChangePasswordView.C14142f.m78723g(str);
                }
            }) && ChangePasswordView.this.f72421L0.m92676n2() != null) {
                ChangePasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChangePasswordView.C14142f.this.m78724h(c20096c);
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ChangePasswordView.this.f72634u1 = false;
            AbstractC23304d.f113346X0 = 1;
            AbstractC23309i.m122550wp(1);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_hint_changePassSuccessful));
            if (ChangePasswordView.this.f72421L0.m92676n2() != null) {
                ChangePasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChangePasswordView.C14142f.this.m78722f();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ChangePasswordView$g */
    /* loaded from: classes6.dex */
    public class C14143g implements InterfaceC20094a {
        C14143g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m78729g(boolean z11) {
            try {
                ChangePasswordView.this.f72421L0.mo49315c4();
                ChangePasswordView.this.m78706kM();
                ChangePasswordView changePasswordView = ChangePasswordView.this;
                if (changePasswordView.f72620g1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_hint_setPassSuccessful));
                    if (z11) {
                        ChangePasswordView.this.mo50035CK(-1, null);
                        ChangePasswordView.this.finish();
                    }
                } else if (changePasswordView.f72619f1 == 2) {
                    changePasswordView.f72421L0.showDialog(1);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_hint_setPassSuccessful));
                    ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                    int i11 = changePasswordView2.f72619f1;
                    if (i11 != 0 && i11 != 1) {
                        if (i11 == 4) {
                            changePasswordView2.f72421L0.mo50035CK(-1, null);
                            ChangePasswordView.this.finish();
                        }
                    }
                    if (changePasswordView2.f72618e1) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                        ChangePasswordView.this.f72421L0.m92676n2().mo35579p().m93069k2(SwitchAccountView.class, bundle, 1, true);
                    } else {
                        changePasswordView2.finish();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static /* synthetic */ void m78730h(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m78731i(C20096c c20096c) {
            Drawable drawable;
            try {
                if (TextUtils.isEmpty(c20096c.m104490b()) || (c20096c.m104491c() != 2053 && c20096c.m104491c() != 2025)) {
                    ToastUtils.showMess(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                    ChangePasswordView.this.m78709nM();
                }
                String optString = new JSONObject(c20096c.m104490b()).optString("error_message", "");
                if (!TextUtils.isEmpty(optString)) {
                    ChangePasswordView.this.f72612Y0.setText(optString);
                    ChangePasswordView.this.f72612Y0.setVisibility(0);
                    ChangePasswordView changePasswordView = ChangePasswordView.this;
                    changePasswordView.f72624k1 = false;
                    CustomEditText customEditText = changePasswordView.f72606S0;
                    if (customEditText.length() != 0) {
                        drawable = ChangePasswordView.this.f72629p1;
                    } else {
                        drawable = null;
                    }
                    customEditText.setRightDrawable(drawable);
                    ChangePasswordView.this.f72606S0.setBackgroundResource(AbstractC16803z.edt_error);
                    ChangePasswordView.this.f72606S0.setEnableClearText(true);
                    ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                    changePasswordView2.f72606S0.setClearDrawable(changePasswordView2.f72629p1);
                    ChangePasswordView.this.f72606S0.m87734J(false);
                } else {
                    ToastUtils.showMess(AbstractC23161o1.m119318c(c20096c.m104491c(), ""));
                }
                ChangePasswordView.this.m78709nM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m78732j() {
            try {
                ChangePasswordView.this.m78706kM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            InterfaceC27218a m92676n2;
            Runnable runnable;
            ChangePasswordView changePasswordView;
            ChangePasswordView changePasswordView2 = ChangePasswordView.this;
            changePasswordView2.f72634u1 = false;
            changePasswordView2.f72421L0.mo78960q3();
            try {
                if (AbstractC23216t1.m119643h(ChangePasswordView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.k5
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        ChangePasswordView.C14143g.m78730h(str);
                    }
                })) {
                    return;
                }
                try {
                    if (ChangePasswordView.this.f72421L0.m92676n2() != null) {
                        ChangePasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.l5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ChangePasswordView.C14143g.this.m78731i(c20096c);
                            }
                        });
                    }
                    changePasswordView = ChangePasswordView.this;
                    changePasswordView.f72634u1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    ChangePasswordView changePasswordView3 = ChangePasswordView.this;
                    changePasswordView3.f72634u1 = false;
                    if (changePasswordView3.f72421L0.m92676n2() != null) {
                        m92676n2 = ChangePasswordView.this.f72421L0.m92676n2();
                        runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.m5
                            @Override // java.lang.Runnable
                            public final void run() {
                                ChangePasswordView.C14143g.this.m78732j();
                            }
                        };
                    } else {
                        return;
                    }
                }
                if (changePasswordView.f72421L0.m92676n2() != null) {
                    m92676n2 = ChangePasswordView.this.f72421L0.m92676n2();
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.m5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChangePasswordView.C14143g.this.m78732j();
                        }
                    };
                    m92676n2.runOnUiThread(runnable);
                }
            } catch (Throwable th2) {
                ChangePasswordView changePasswordView4 = ChangePasswordView.this;
                changePasswordView4.f72634u1 = false;
                if (changePasswordView4.f72421L0.m92676n2() != null) {
                    ChangePasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.m5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChangePasswordView.C14143g.this.m78732j();
                        }
                    });
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final boolean z11 = false;
            try {
                try {
                    try {
                        AbstractC23304d.f113346X0 = 1;
                        AbstractC23309i.m122550wp(1);
                        ChangePasswordView changePasswordView = ChangePasswordView.this;
                        final boolean z12 = changePasswordView.f72620g1;
                        changePasswordView.f72634u1 = false;
                        if (changePasswordView.f72421L0.m92676n2() != null) {
                            ChangePasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.n5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChangePasswordView.C14143g.this.m78729g(z12);
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        ChangePasswordView changePasswordView2 = ChangePasswordView.this;
                        changePasswordView2.f72634u1 = false;
                        try {
                            if (changePasswordView2.f72421L0.m92676n2() != null) {
                                ChangePasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.n5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ChangePasswordView.C14143g.this.m78729g(z11);
                                    }
                                });
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            } catch (Exception e13) {
                e13.printStackTrace();
                ChangePasswordView changePasswordView3 = ChangePasswordView.this;
                changePasswordView3.f72634u1 = false;
                if (changePasswordView3.f72421L0.m92676n2() != null) {
                    ChangePasswordView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.n5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChangePasswordView.C14143g.this.m78729g(z11);
                        }
                    });
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (this.f72421L0.m92642L3() != null) {
            this.f72619f1 = this.f72421L0.m92642L3().getInt("password_mode", 0);
            this.f72620g1 = this.f72421L0.m92642L3().getBoolean("logout_case", false);
            this.f72621h1 = this.f72421L0.m92642L3().getBoolean("isForceUpdatePassword", false);
            this.f72618e1 = this.f72421L0.m92642L3().getBoolean("extra_switch_account", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_update_password)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_hint_dlg_setPassSuccessful)).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_done_reset_new_pass), this);
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.changepass_view, viewGroup, false);
        m78708mM(inflate);
        m78707lM();
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                interfaceC17463d.dismiss();
                Bundle bundle = new Bundle();
                bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                this.f72421L0.m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setLeadingFunctionCallback(new C14141e());
                int i11 = this.f72619f1;
                if (i11 != 0 && i11 != 1 && i11 != 4) {
                    if (i11 == 2) {
                        m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_title_reset_pass));
                        if (!this.f72621h1) {
                            this.f72614a1.setVisibility(0);
                        } else {
                            this.f72614a1.setVisibility(8);
                        }
                    } else if (i11 == 3) {
                        m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_titleABS_changePass));
                    }
                }
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_titleABS_setPass));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            if (m92676n2() instanceof Activity) {
                this.f72633t1 = m92676n2().getWindow().getAttributes().softInputMode;
                m92676n2().mo35554O(20);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        try {
            if (this.f72633t1 == 0) {
                this.f72633t1 = 32;
            }
            if (m92676n2() instanceof Activity) {
                m92676n2().mo35554O(this.f72633t1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (z12) {
                try {
                    if (this.f72421L0.m92683qJ()) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (this.f72603P0.getVisibility() == 0) {
                AbstractC2379w.m12432f(this.f72604Q0);
            } else {
                AbstractC2379w.m12432f(this.f72606S0);
            }
        }
    }

    /* renamed from: Z4 */
    void m78701Z4() {
        try {
            if (this.f72619f1 == 3) {
                this.f72604Q0.requestFocus();
                AbstractC2379w.m12434h(this.f72604Q0);
            } else {
                this.f72606S0.requestFocus();
                AbstractC2379w.m12434h(this.f72606S0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gM */
    String m78702gM(String str) {
        JSONArray optJSONArray;
        Matcher matcher;
        String str2 = "";
        if (!TextUtils.isEmpty(this.f72622i1) && !this.f72622i1.equalsIgnoreCase("null")) {
            try {
                JSONObject jSONObject = new JSONObject(this.f72622i1);
                if (jSONObject.has("listRegex") && !jSONObject.isNull("listRegex") && (optJSONArray = jSONObject.optJSONArray("listRegex")) != null && optJSONArray.length() > 0) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 != null) {
                                String optString = jSONObject2.optString("regex");
                                JSONObject optJSONObject = jSONObject2.optJSONObject("errorlang");
                                if (!TextUtils.isEmpty(optString)) {
                                    Pattern compile = Pattern.compile(optString);
                                    if (compile != null) {
                                        matcher = compile.matcher(str);
                                    } else {
                                        matcher = null;
                                    }
                                    if (matcher != null && !matcher.matches()) {
                                        if (!TextUtils.isEmpty(AbstractC18458a.f93019a) && optJSONObject.has(AbstractC18458a.f93019a) && !optJSONObject.isNull(AbstractC18458a.f93019a)) {
                                            str2 = optJSONObject.optString(AbstractC18458a.f93019a);
                                        } else if (optJSONObject.has("en") && !optJSONObject.isNull("en")) {
                                            str2 = optJSONObject.optString("en");
                                        }
                                        this.f72609V0.setEnabled(false);
                                        AbstractC23647d.m123897g("3716" + (i11 + 1));
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return str2;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChangePasswordView";
    }

    /* renamed from: hM */
    void m78703hM(String str) {
        try {
            if (C23055e5.m118271f()) {
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile == null) {
                    contactProfile = new ContactProfile(AbstractC23309i.m121675Zd());
                }
                String m118276b = AbstractC23056e6.m118276b(contactProfile.f42455y, false, false);
                if (!TextUtils.isEmpty(m118276b) && !m118276b.equals(AbstractC23056e6.f112062a)) {
                    String m122790b = AbstractC23353h.m122790b(AbstractC23352g.m122788d(CoreUtility.f89225a + m118276b), str);
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14140d(str));
                    c0766k.mo1655ha(m118276b, m122790b);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iM */
    void m78704iM(String str, String str2) {
        if (!this.f72634u1 && C23055e5.m118272g(true)) {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile == null) {
                contactProfile = new ContactProfile(AbstractC23309i.m121675Zd());
            }
            String m118289o = AbstractC23056e6.m118289o(contactProfile.f42455y);
            String m122788d = AbstractC23352g.m122788d(CoreUtility.f89225a + m118289o);
            String m122790b = AbstractC23353h.m122790b(m122788d, str);
            this.f72615b1 = AbstractC23353h.m122790b(m122788d, str2);
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f72634u1 = true;
            this.f72635v1.mo1704o8(this.f72636w1);
            this.f72635v1.m1879y0(m118289o, m122790b, this.f72615b1);
        }
    }

    /* renamed from: jM */
    void m78705jM(String str) {
        if (!this.f72634u1 && C23055e5.m118272g(true)) {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile == null) {
                contactProfile = new ContactProfile(AbstractC23309i.m121675Zd());
            }
            String m118289o = AbstractC23056e6.m118289o(contactProfile.f42455y);
            this.f72615b1 = AbstractC23353h.m122790b(AbstractC23352g.m122788d(CoreUtility.f89225a + m118289o), str);
            this.f72421L0.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing), false);
            this.f72634u1 = true;
            this.f72637x1.mo1704o8(this.f72638y1);
            this.f72637x1.m1879y0(m118289o, "", this.f72615b1);
        }
    }

    /* renamed from: kM */
    public void m78706kM() {
        CustomEditText customEditText = this.f72606S0;
        if (customEditText != null) {
            AbstractC2379w.m12430d(customEditText);
        }
        CustomEditText customEditText2 = this.f72608U0;
        if (customEditText2 != null) {
            AbstractC2379w.m12430d(customEditText2);
        }
        CustomEditText customEditText3 = this.f72604Q0;
        if (customEditText3 != null) {
            AbstractC2379w.m12430d(customEditText3);
        }
    }

    /* renamed from: lM */
    void m78707lM() {
        int i11;
        try {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile == null) {
                contactProfile = new ContactProfile(AbstractC23309i.m121675Zd());
            }
            String m118276b = AbstractC23056e6.m118276b(contactProfile.f42455y, false, false);
            if (TextUtils.isEmpty(m118276b) || m118276b.equals(AbstractC23056e6.f112062a)) {
                AbstractC23309i.m121541Vr(0L);
            }
            this.f72614a1.setVisibility(8);
            String m120778B4 = AbstractC23309i.m120778B4();
            String str = "";
            if (!TextUtils.isEmpty(m120778B4)) {
                str = new JSONObject(m120778B4).optString(AbstractC18458a.f93019a);
            }
            if (TextUtils.isEmpty(str)) {
                if (AbstractC23309i.m122577xf()) {
                    i11 = AbstractC8020f0.str_hint_update_password;
                } else {
                    i11 = AbstractC8020f0.str_hint_update_password_off_username;
                }
                str = AbstractC23136l9.m118743r0(i11);
            }
            this.f72610W0.setText(str);
            int i12 = this.f72619f1;
            if (i12 != 0 && i12 != 1 && i12 != 2 && i12 != 4) {
                if (i12 == 3) {
                    this.f72603P0.setVisibility(0);
                    this.f72607T0.setVisibility(8);
                    AbstractC23647d.m123897g("37153");
                }
                this.f72606S0.setHint(AbstractC8020f0.str_hint_input_new_password);
                this.f72608U0.setHint(AbstractC8020f0.login_new_password_confirm);
                this.f72609V0.setText(AbstractC8020f0.str_cap_update);
                m78701Z4();
                this.f72622i1 = AbstractC23309i.m121412S9();
            }
            if (i12 != 1) {
                if (i12 == 4) {
                    this.f72614a1.setVisibility(0);
                } else if (i12 == 2 && !this.f72621h1) {
                    this.f72614a1.setVisibility(0);
                }
            }
            this.f72603P0.setVisibility(8);
            this.f72607T0.setVisibility(0);
            AbstractC23647d.m123897g("37154");
            this.f72606S0.setHint(AbstractC8020f0.str_hint_input_new_password);
            this.f72608U0.setHint(AbstractC8020f0.login_new_password_confirm);
            this.f72609V0.setText(AbstractC8020f0.str_cap_update);
            m78701Z4();
            this.f72622i1 = AbstractC23309i.m121412S9();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m78708mM(View view) {
        this.f72603P0 = (LinearLayout) view.findViewById(AbstractC6918a0.layout_old_pass);
        this.f72604Q0 = (CustomEditText) view.findViewById(AbstractC6918a0.et_oldpass);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tv_show_hide_old_password);
        this.f72605R0 = textView;
        textView.setOnClickListener(this);
        this.f72606S0 = (CustomEditText) view.findViewById(AbstractC6918a0.et_newpass);
        this.f72607T0 = (TextView) view.findViewById(AbstractC6918a0.tv_show_hide_new_password);
        this.f72608U0 = (CustomEditText) view.findViewById(AbstractC6918a0.et_newpass_confirm);
        this.f72607T0.setOnClickListener(this);
        C14137a c14137a = new C14137a();
        this.f72604Q0.addTextChangedListener(c14137a);
        this.f72606S0.addTextChangedListener(c14137a);
        this.f72608U0.addTextChangedListener(c14137a);
        this.f72610W0 = (TextView) view.findViewById(AbstractC6918a0.tv_hint_to_set_password);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.layoutdismissrenewpass);
        this.f72614a1 = textView2;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        this.f72614a1.setOnClickListener(this);
        TextView textView3 = (TextView) view.findViewById(AbstractC6918a0.tvError1);
        this.f72611X0 = textView3;
        textView3.setVisibility(8);
        TextView textView4 = (TextView) view.findViewById(AbstractC6918a0.tvError2);
        this.f72612Y0 = textView4;
        textView4.setVisibility(8);
        TextView textView5 = (TextView) view.findViewById(AbstractC6918a0.tvError3);
        this.f72613Z0 = textView5;
        textView5.setVisibility(8);
        TextView textView6 = (TextView) view.findViewById(AbstractC6918a0.layout_dochangepass);
        this.f72609V0 = textView6;
        textView6.setOnClickListener(this);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.c5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC2379w.m12432f(view2);
            }
        };
        CustomEditText customEditText = this.f72604Q0;
        Typeface typeface = Typeface.DEFAULT;
        customEditText.setTypeface(typeface);
        this.f72606S0.setTypeface(typeface);
        this.f72608U0.setTypeface(typeface);
        this.f72604Q0.setClearDrawable(this.f72631r1);
        this.f72606S0.setClearDrawable(this.f72631r1);
        this.f72608U0.setClearDrawable(this.f72631r1);
        this.f72604Q0.setFocusChangeListener(this.f72632s1);
        this.f72606S0.setFocusChangeListener(this.f72632s1);
        this.f72608U0.setFocusChangeListener(this.f72632s1);
        this.f72604Q0.setDeleteClickListener(onClickListener);
        this.f72606S0.setDeleteClickListener(onClickListener);
        this.f72608U0.setDeleteClickListener(onClickListener);
        try {
            AbstractC32234k.m155469a(this.f72604Q0, AbstractC16803z.chat_bar_text_cursor);
            AbstractC32234k.m155469a(this.f72606S0, AbstractC16803z.chat_bar_text_cursor);
            AbstractC32234k.m155469a(this.f72608U0, AbstractC16803z.chat_bar_text_cursor);
        } catch (Exception unused) {
        }
        m78709nM();
    }

    /* renamed from: nM */
    void m78709nM() {
        try {
            boolean z11 = false;
            if (this.f72603P0.getVisibility() == 0) {
                TextView textView = this.f72609V0;
                if (this.f72623j1 && this.f72624k1 && this.f72625l1 && this.f72604Q0.length() > 0 && this.f72606S0.length() > 0 && this.f72608U0.length() > 0) {
                    z11 = true;
                }
                textView.setEnabled(z11);
                return;
            }
            TextView textView2 = this.f72609V0;
            if (this.f72624k1 && this.f72625l1 && this.f72606S0.length() > 0 && this.f72608U0.length() > 0) {
                z11 = true;
            }
            textView2.setEnabled(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m78710oM(String str) {
        try {
            if (C23055e5.m118271f()) {
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile == null) {
                    contactProfile = new ContactProfile(AbstractC23309i.m121675Zd());
                }
                String m118276b = AbstractC23056e6.m118276b(contactProfile.f42455y, false, false);
                if (!TextUtils.isEmpty(m118276b) && !m118276b.equals(AbstractC23056e6.f112062a)) {
                    String m122790b = AbstractC23353h.m122790b(AbstractC23352g.m122788d(CoreUtility.f89225a + m118276b), str);
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14139c(str));
                    c0766k.mo1747u3(m122790b, 1, -1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.tv_show_hide_old_password) {
                boolean z11 = !this.f72616c1;
                this.f72616c1 = z11;
                if (z11) {
                    this.f72604Q0.setInputType(145);
                    CustomEditText customEditText = this.f72604Q0;
                    customEditText.setSelection(customEditText.getText().length());
                    this.f72606S0.setInputType(145);
                    this.f72608U0.setInputType(145);
                    CustomEditText customEditText2 = this.f72606S0;
                    customEditText2.setSelection(customEditText2.getText().length());
                    CustomEditText customEditText3 = this.f72608U0;
                    customEditText3.setSelection(customEditText3.getText().length());
                    this.f72605R0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_hide_password));
                    AbstractC23647d.m123897g("37157");
                } else {
                    this.f72604Q0.setInputType(129);
                    CustomEditText customEditText4 = this.f72604Q0;
                    customEditText4.setSelection(customEditText4.getText().length());
                    this.f72606S0.setInputType(129);
                    this.f72608U0.setInputType(129);
                    CustomEditText customEditText5 = this.f72606S0;
                    customEditText5.setSelection(customEditText5.getText().length());
                    CustomEditText customEditText6 = this.f72608U0;
                    customEditText6.setSelection(customEditText6.getText().length());
                    this.f72605R0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_show_password));
                    AbstractC23647d.m123897g("37156");
                }
                this.f72604Q0.setTypeface(Typeface.DEFAULT);
                return;
            }
            if (id2 == AbstractC6918a0.tv_show_hide_new_password) {
                boolean z12 = !this.f72617d1;
                this.f72617d1 = z12;
                if (z12) {
                    this.f72606S0.setInputType(145);
                    this.f72608U0.setInputType(145);
                    CustomEditText customEditText7 = this.f72606S0;
                    customEditText7.setSelection(customEditText7.getText().length());
                    CustomEditText customEditText8 = this.f72608U0;
                    customEditText8.setSelection(customEditText8.getText().length());
                    this.f72607T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_hide_password));
                    AbstractC23647d.m123897g("37157");
                } else {
                    this.f72606S0.setInputType(129);
                    this.f72608U0.setInputType(129);
                    CustomEditText customEditText9 = this.f72606S0;
                    customEditText9.setSelection(customEditText9.getText().length());
                    CustomEditText customEditText10 = this.f72608U0;
                    customEditText10.setSelection(customEditText10.getText().length());
                    this.f72607T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.startup_show_password));
                    AbstractC23647d.m123897g("37156");
                }
                CustomEditText customEditText11 = this.f72606S0;
                Typeface typeface = Typeface.DEFAULT;
                customEditText11.setTypeface(typeface);
                this.f72608U0.setTypeface(typeface);
                return;
            }
            if (id2 == AbstractC6918a0.layoutdismissrenewpass) {
                if (this.f72619f1 == 4) {
                    m78706kM();
                    finish();
                    return;
                }
                AbstractC23647d.m123906p("19600");
                AbstractC23304d.f113346X0 = 0;
                AbstractC23309i.m122550wp(0);
                m78706kM();
                Bundle bundle = new Bundle();
                bundle.putBoolean("isIgnoreUpdatePassword", true);
                bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                this.f72421L0.m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
                AbstractC23647d.m123893c();
                return;
            }
            if (id2 == AbstractC6918a0.layout_dochangepass) {
                AbstractC23647d.m123897g("37158");
                CustomEditText customEditText12 = this.f72606S0;
                String str2 = "";
                if (customEditText12 == null) {
                    str = "";
                } else {
                    str = customEditText12.getText().toString();
                }
                CustomEditText customEditText13 = this.f72608U0;
                if (customEditText13 != null) {
                    str2 = customEditText13.getText().toString();
                }
                int i11 = this.f72619f1;
                if (i11 == 3) {
                    if (!str.equals(str2)) {
                        this.f72625l1 = false;
                        TextView textView = this.f72613Z0;
                        if (textView != null) {
                            textView.setVisibility(0);
                            this.f72613Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.login_password_confirm_failed));
                        }
                        CustomEditText customEditText14 = this.f72608U0;
                        if (customEditText14 != null) {
                            customEditText14.setRightDrawable(this.f72629p1);
                            this.f72608U0.setBackgroundResource(AbstractC16803z.edt_error);
                            this.f72608U0.setClearDrawable(this.f72629p1);
                            this.f72608U0.m87734J(false);
                        }
                        this.f72609V0.setEnabled(false);
                        AbstractC23647d.m123897g("37155");
                        return;
                    }
                    String m78702gM = m78702gM(str);
                    if (!TextUtils.isEmpty(m78702gM)) {
                        this.f72624k1 = false;
                        TextView textView2 = this.f72612Y0;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            this.f72612Y0.setText(m78702gM);
                        }
                        CustomEditText customEditText15 = this.f72606S0;
                        if (customEditText15 != null) {
                            customEditText15.setRightDrawable(this.f72629p1);
                            this.f72606S0.setBackgroundResource(AbstractC16803z.edt_error);
                            this.f72606S0.setClearDrawable(this.f72629p1);
                            this.f72606S0.m87734J(false);
                        }
                        this.f72609V0.setEnabled(false);
                        return;
                    }
                    m78704iM(this.f72604Q0.getText().toString(), this.f72606S0.getText().toString());
                    return;
                }
                if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 4) {
                    if (i11 == 2 && !this.f72621h1) {
                        AbstractC23647d.m123906p("19601");
                        AbstractC23647d.m123893c();
                    }
                    if (!str.equals(str2)) {
                        this.f72625l1 = false;
                        TextView textView3 = this.f72613Z0;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            this.f72613Z0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.login_password_confirm_failed));
                        }
                        CustomEditText customEditText16 = this.f72608U0;
                        if (customEditText16 != null) {
                            customEditText16.setRightDrawable(this.f72629p1);
                            this.f72608U0.setBackgroundResource(AbstractC16803z.edt_error);
                            this.f72608U0.setClearDrawable(this.f72629p1);
                            this.f72608U0.m87734J(false);
                        }
                        this.f72609V0.setEnabled(false);
                        AbstractC23647d.m123897g("37155");
                        return;
                    }
                    String m78702gM2 = m78702gM(str);
                    if (!TextUtils.isEmpty(m78702gM2)) {
                        this.f72624k1 = false;
                        TextView textView4 = this.f72612Y0;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            this.f72612Y0.setText(m78702gM2);
                        }
                        CustomEditText customEditText17 = this.f72606S0;
                        if (customEditText17 != null) {
                            customEditText17.setRightDrawable(this.f72629p1);
                            this.f72606S0.setBackgroundResource(AbstractC16803z.edt_error);
                            this.f72606S0.setClearDrawable(this.f72629p1);
                            this.f72606S0.m87734J(false);
                        }
                        this.f72609V0.setEnabled(false);
                        return;
                    }
                    m78705jM(this.f72606S0.getText().toString());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("37159");
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
