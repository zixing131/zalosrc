package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import gw.C19669z;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import mm0.AbstractC23352g;
import p131ei.C18434b;
import p161fg.C18922m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import vg.C28023b6;

/* loaded from: classes6.dex */
public class PasscodeView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: n1 */
    public static int f75794n1 = -1;

    /* renamed from: Q0 */
    TextView f75796Q0;

    /* renamed from: R0 */
    TextView f75797R0;

    /* renamed from: S0 */
    TextView f75798S0;

    /* renamed from: T0 */
    TextView f75799T0;

    /* renamed from: U0 */
    TextView f75800U0;

    /* renamed from: V0 */
    TextView f75801V0;

    /* renamed from: W0 */
    TextView f75802W0;

    /* renamed from: X0 */
    TextView f75803X0;

    /* renamed from: Y0 */
    TextView f75804Y0;

    /* renamed from: Z0 */
    TextView f75805Z0;

    /* renamed from: a1 */
    ImageButton f75806a1;

    /* renamed from: b1 */
    TextView f75807b1;

    /* renamed from: c1 */
    TextView f75808c1;

    /* renamed from: P0 */
    ImageView[] f75795P0 = new ImageView[4];

    /* renamed from: d1 */
    StringBuilder f75809d1 = new StringBuilder(4);

    /* renamed from: e1 */
    Handler f75810e1 = new Handler();

    /* renamed from: f1 */
    int f75811f1 = 0;

    /* renamed from: g1 */
    int f75812g1 = 0;

    /* renamed from: h1 */
    String f75813h1 = "";

    /* renamed from: i1 */
    boolean f75814i1 = false;

    /* renamed from: j1 */
    boolean f75815j1 = false;

    /* renamed from: k1 */
    boolean f75816k1 = false;

    /* renamed from: l1 */
    String f75817l1 = "";

    /* renamed from: m1 */
    boolean f75818m1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.PasscodeView$a */
    /* loaded from: classes6.dex */
    class C14715a extends ZdsActionBar.AbstractC16987c {
        C14715a() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            super.mo39913a();
            PasscodeView passcodeView = PasscodeView.this;
            passcodeView.f75814i1 = true;
            passcodeView.finish();
        }
    }

    /* renamed from: nM */
    public /* synthetic */ void m82481nM() {
        this.f72421L0.mo50035CK(-1, null);
        this.f75818m1 = false;
        finish();
    }

    /* renamed from: oM */
    public /* synthetic */ void m82482oM() {
        this.f75818m1 = false;
        finish();
    }

    /* renamed from: pM */
    public /* synthetic */ void m82483pM() {
        this.f75818m1 = false;
        int i11 = f75794n1;
        if (i11 == 2) {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            this.f72421L0.m92662fJ().m93069k2(PassCodeSettingView.class, bundle, 1, true);
        } else if (i11 == 3) {
            if (this.f75816k1 && AbstractC23304d.f113280G2 != null) {
                C18434b.m97679l().m97691w(AbstractC23304d.f113280G2);
                AbstractC23304d.f113280G2 = null;
                C19669z.m103146Y().m103198O0();
            }
            Intent intent = new Intent();
            intent.putExtra("EXTRA_MSG_RESULT_VERIFY", this.f75817l1);
            mo50035CK(-1, intent);
            finish();
        }
    }

    /* renamed from: qM */
    public /* synthetic */ void m82484qM() {
        this.f75818m1 = false;
        finish();
    }

    /* renamed from: rM */
    public /* synthetic */ void m82485rM(String str) {
        this.f75809d1.delete(0, 4);
        m82486lM(this.f75809d1.length());
        if (str != null) {
            this.f75807b1.setText(str);
        }
        this.f75818m1 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        f75794n1 = -1;
        if (this.f72421L0.m92642L3() != null) {
            f75794n1 = this.f72421L0.m92642L3().getInt("case_passcode_process", -1);
            this.f75816k1 = this.f72421L0.m92642L3().getBoolean("EXTRA_REMOVE_BANNER", false);
            this.f75817l1 = this.f72421L0.m92642L3().getString("EXTRA_MSG_RESULT_VERIFY", "");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.passcode_screen, viewGroup, false);
        m82487mM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        this.f75814i1 = false;
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setLeadingFunctionCallback(new C14715a());
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titlePssCodeAct));
                m82491vM(this.f75815j1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PasscodeView";
    }

    /* renamed from: lM */
    void m82486lM(int i11) {
        int i12 = 0;
        while (true) {
            ImageView[] imageViewArr = this.f75795P0;
            if (i12 < imageViewArr.length) {
                if (i12 < i11) {
                    imageViewArr[i12].setImageResource(AbstractC16803z.passcode_fill_img);
                } else {
                    imageViewArr[i12].setImageResource(AbstractC16803z.passcode_empty_img);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    /* renamed from: mM */
    void m82487mM(View view) {
        boolean z11 = false;
        this.f75795P0[0] = (ImageView) view.findViewById(AbstractC6918a0.code_1);
        this.f75795P0[1] = (ImageView) view.findViewById(AbstractC6918a0.code_2);
        this.f75795P0[2] = (ImageView) view.findViewById(AbstractC6918a0.code_3);
        this.f75795P0[3] = (ImageView) view.findViewById(AbstractC6918a0.code_4);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.keypad_0);
        this.f75796Q0 = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.keypad_1);
        this.f75797R0 = textView2;
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) view.findViewById(AbstractC6918a0.keypad_2);
        this.f75798S0 = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) view.findViewById(AbstractC6918a0.keypad_3);
        this.f75799T0 = textView4;
        textView4.setOnClickListener(this);
        TextView textView5 = (TextView) view.findViewById(AbstractC6918a0.keypad_4);
        this.f75800U0 = textView5;
        textView5.setOnClickListener(this);
        TextView textView6 = (TextView) view.findViewById(AbstractC6918a0.keypad_5);
        this.f75801V0 = textView6;
        textView6.setOnClickListener(this);
        TextView textView7 = (TextView) view.findViewById(AbstractC6918a0.keypad_6);
        this.f75802W0 = textView7;
        textView7.setOnClickListener(this);
        TextView textView8 = (TextView) view.findViewById(AbstractC6918a0.keypad_7);
        this.f75803X0 = textView8;
        textView8.setOnClickListener(this);
        TextView textView9 = (TextView) view.findViewById(AbstractC6918a0.keypad_8);
        this.f75804Y0 = textView9;
        textView9.setOnClickListener(this);
        TextView textView10 = (TextView) view.findViewById(AbstractC6918a0.keypad_9);
        this.f75805Z0 = textView10;
        textView10.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC6918a0.keypad_back);
        this.f75806a1 = imageButton;
        imageButton.setOnClickListener(this);
        TextView textView11 = (TextView) view.findViewById(AbstractC6918a0.tv_warning_off_chat_head);
        this.f75808c1 = textView11;
        if (textView11 != null) {
            if (AbstractC23309i.m122004i2() && f75794n1 == 0) {
                this.f75808c1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_passcode_hint_off_chat_bubbles));
                this.f75808c1.setVisibility(0);
            } else {
                this.f75808c1.setVisibility(8);
            }
        }
        TextView textView12 = (TextView) view.findViewById(AbstractC6918a0.hint_todo_passcodeAct);
        this.f75807b1 = textView12;
        int i11 = f75794n1;
        if (i11 == 0) {
            textView12.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputToSetPssCode));
        } else if (i11 == 1) {
            textView12.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputOldPssCode));
        } else {
            if (i11 != 2 && i11 != 3) {
                textView12.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_setupPssCode));
                if (AbstractC23165o5.m119333b()) {
                    AbstractC23304d.f113282H0 = true;
                    if (!AbstractC23304d.f113266D0) {
                        AbstractC23304d.f113266D0 = true;
                        AbstractC23309i.m121506Ut(true);
                    }
                }
                this.f75815j1 = z11;
            }
            textView12.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_setupPssCode));
        }
        z11 = true;
        this.f75815j1 = z11;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.keypad_0) {
            m82490uM('0');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_1) {
            m82490uM('1');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_2) {
            m82490uM('2');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_3) {
            m82490uM('3');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_4) {
            m82490uM('4');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_5) {
            m82490uM('5');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_6) {
            m82490uM('6');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_7) {
            m82490uM('7');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_8) {
            m82490uM('8');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_9) {
            m82490uM('9');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_back && !this.f75814i1 && this.f75809d1.length() != 4 && !this.f75818m1) {
            if (this.f75809d1.length() > 0) {
                this.f75809d1.deleteCharAt(r2.length() - 1);
            }
            m82486lM(this.f75809d1.length());
            this.f75809d1.toString();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                int i12 = f75794n1;
                if (i12 != 0 && i12 != 2 && i12 != 1 && i12 != 3) {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    intent.setFlags(268435456);
                    this.f72421L0.m92641HK(intent);
                    return true;
                }
                finish();
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        int i11;
        super.onResume();
        if (AbstractC23165o5.m119333b() && !this.f75814i1 && (i11 = f75794n1) != 0 && i11 != 2 && i11 != 1 && i11 != 3) {
            if (!AbstractC23304d.f113266D0) {
                finish();
                return;
            }
            boolean m122048j9 = AbstractC23309i.m122048j9();
            AbstractC23304d.f113266D0 = m122048j9;
            if (!m122048j9) {
                finish();
            }
        }
    }

    /* renamed from: sM */
    void m82488sM(String str) {
        if (!this.f75818m1 && !this.f75814i1 && str.length() == 4) {
            int i11 = f75794n1;
            if (i11 == 0) {
                this.f75818m1 = true;
                int i12 = this.f75811f1;
                if (i12 == 0) {
                    this.f75813h1 = str;
                    this.f75811f1 = i12 + 1;
                    m82489tM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputToSetPssCodeAgain), 300L);
                    return;
                }
                if (i12 == 1) {
                    if (str.equals(this.f75813h1)) {
                        this.f75813h1 = "";
                        this.f75811f1 = 0;
                        this.f75807b1.setText("");
                        AbstractC23309i.m121137Ku(MainApplication.getAppContext(), AbstractC23352g.m122788d(str));
                        AbstractC23309i.m122523vz(true);
                        C18922m.m99141t().m99156p();
                        C28023b6.m141250h0().m141370p();
                        this.f75814i1 = true;
                        this.f75810e1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.o30
                            public /* synthetic */ o30() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                PasscodeView.this.m82481nM();
                            }
                        }, 500L);
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_setPssCodeSuccess));
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_wrongInputPssCodeAgain));
                    m82489tM(null, 300L);
                    return;
                }
                return;
            }
            if (i11 == 1) {
                this.f75818m1 = true;
                int i13 = this.f75812g1;
                if (i13 == 0) {
                    String m121338Q9 = AbstractC23309i.m121338Q9();
                    String m122788d = AbstractC23352g.m122788d(str);
                    if (!TextUtils.isEmpty(m122788d)) {
                        if (m121338Q9.equals(m122788d)) {
                            this.f75812g1++;
                            m82489tM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputToSetPssCode), 300L);
                            return;
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputPssCodeIncorrect));
                            m82489tM(null, 300L);
                            return;
                        }
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_wrongOldPssCode));
                    m82489tM(null, 300L);
                    return;
                }
                if (i13 == 1) {
                    this.f75813h1 = str;
                    this.f75812g1 = i13 + 1;
                    m82489tM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputToSetPssCodeAgain), 300L);
                    return;
                }
                if (i13 == 2) {
                    if (str.equals(this.f75813h1)) {
                        this.f75813h1 = "";
                        this.f75812g1 = 0;
                        this.f75807b1.setText("");
                        AbstractC23309i.m121137Ku(MainApplication.getAppContext(), AbstractC23352g.m122788d(str));
                        AbstractC23309i.m122523vz(true);
                        C18922m.m99141t().m99156p();
                        C28023b6.m141250h0().m141370p();
                        this.f75814i1 = true;
                        this.f75810e1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.p30
                            public /* synthetic */ p30() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                PasscodeView.this.m82482oM();
                            }
                        }, 500L);
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_changePssCodeSuccess));
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_wrongInputPssCodeAgain));
                    m82489tM(null, 300L);
                    return;
                }
                return;
            }
            if (i11 != 2 && i11 != 3) {
                String m121338Q92 = AbstractC23309i.m121338Q9();
                String m122788d2 = AbstractC23352g.m122788d(str);
                if (!TextUtils.isEmpty(m122788d2)) {
                    if (m121338Q92.equals(m122788d2)) {
                        this.f75814i1 = true;
                        AbstractC23304d.f113266D0 = false;
                        AbstractC23304d.f113270E0 = false;
                        AbstractC23304d.f113282H0 = false;
                        AbstractC23304d.f113306N0 = 0;
                        AbstractC23304d.f113298L0 = "";
                        AbstractC23304d.f113310O0 = 0L;
                        AbstractC23309i.m122020ih();
                        this.f75810e1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.r30
                            public /* synthetic */ r30() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                PasscodeView.this.m82484qM();
                            }
                        }, 500L);
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputPssCodeIncorrect));
                    m82489tM(null, 300L);
                    return;
                }
                return;
            }
            this.f75818m1 = true;
            String m121338Q93 = AbstractC23309i.m121338Q9();
            String m122788d3 = AbstractC23352g.m122788d(str);
            if (!TextUtils.isEmpty(m122788d3)) {
                if (m121338Q93.equals(m122788d3)) {
                    this.f75814i1 = true;
                    AbstractC23304d.f113266D0 = false;
                    AbstractC23309i.m121506Ut(false);
                    this.f75810e1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.q30
                        public /* synthetic */ q30() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            PasscodeView.this.m82483pM();
                        }
                    }, 500L);
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_inputPssCodeIncorrect));
                m82489tM(null, 300L);
            }
        }
    }

    /* renamed from: tM */
    void m82489tM(String str, long j11) {
        this.f75810e1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.s30

            /* renamed from: q */
            public final /* synthetic */ String f81886q;

            public /* synthetic */ s30(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PasscodeView.this.m82485rM(r2);
            }
        }, j11);
    }

    /* renamed from: uM */
    void m82490uM(char c11) {
        if (!this.f75814i1 && !this.f75818m1) {
            this.f75809d1.append(c11);
            if (this.f75809d1.length() > 4) {
                this.f75809d1.setLength(4);
            }
            m82486lM(this.f75809d1.length());
            if (this.f75809d1.length() == 4) {
                m82488sM(this.f75809d1.toString());
            }
            this.f75809d1.toString();
        }
    }

    /* renamed from: vM */
    void m82491vM(boolean z11) {
        if (m87077NK() != null) {
            if (!z11) {
                m87077NK().setLeadingType(ZdsActionBar.EnumC16988d.NONE.m91015c());
            } else {
                m87077NK().setLeadingType(ZdsActionBar.EnumC16988d.BACK.m91015c());
            }
        }
    }
}
