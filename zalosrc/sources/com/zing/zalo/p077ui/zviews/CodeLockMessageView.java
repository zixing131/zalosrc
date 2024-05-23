package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.settings.subsettings.SettingHiddenChatView;
import com.zing.zalo.p077ui.zviews.CodeLockMessageView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23195r2;
import me0.C23212s8;
import mm0.AbstractC23352g;
import p161fg.C18922m;
import p248iy.AbstractC20887g;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class CodeLockMessageView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: R0 */
    TextView f72791R0;

    /* renamed from: S0 */
    TextView f72792S0;

    /* renamed from: T0 */
    TextView f72793T0;

    /* renamed from: U0 */
    TextView f72794U0;

    /* renamed from: V0 */
    TextView f72795V0;

    /* renamed from: W0 */
    TextView f72796W0;

    /* renamed from: X0 */
    TextView f72797X0;

    /* renamed from: Y0 */
    TextView f72798Y0;

    /* renamed from: Z0 */
    TextView f72799Z0;

    /* renamed from: a1 */
    TextView f72800a1;

    /* renamed from: b1 */
    ImageButton f72801b1;

    /* renamed from: c1 */
    ImageView f72802c1;

    /* renamed from: d1 */
    TextView f72803d1;

    /* renamed from: e1 */
    TextView f72804e1;

    /* renamed from: o1 */
    InterfaceC14170f f72814o1;

    /* renamed from: P0 */
    int f72789P0 = -1;

    /* renamed from: Q0 */
    ImageView[] f72790Q0 = new ImageView[4];

    /* renamed from: f1 */
    StringBuilder f72805f1 = new StringBuilder(4);

    /* renamed from: g1 */
    Handler f72806g1 = new Handler();

    /* renamed from: h1 */
    int f72807h1 = 0;

    /* renamed from: i1 */
    int f72808i1 = 0;

    /* renamed from: j1 */
    String f72809j1 = "";

    /* renamed from: k1 */
    boolean f72810k1 = false;

    /* renamed from: l1 */
    String f72811l1 = "";

    /* renamed from: m1 */
    boolean f72812m1 = false;

    /* renamed from: n1 */
    Runnable f72813n1 = new Runnable() { // from class: com.zing.zalo.ui.zviews.c7
        @Override // java.lang.Runnable
        public final void run() {
            CodeLockMessageView.this.m78880xM();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CodeLockMessageView$a */
    /* loaded from: classes6.dex */
    public class C14165a extends AbstractC14171g {
        C14165a(int i11, int i12, int i13) {
            super(i11, i12, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m78888b() {
            try {
                if (CodeLockMessageView.this.m92650VI() instanceof ChatView) {
                    CodeLockMessageView.this.m92650VI().m92662fJ().m93069k2(SettingHiddenChatView.class, null, 1, true);
                } else {
                    CodeLockMessageView.this.m92662fJ().m93069k2(SettingHiddenChatView.class, null, 1, true);
                }
                if (CodeLockMessageView.this.m92650VI() instanceof ChatView) {
                    CodeLockMessageView.this.m92650VI().finish();
                } else {
                    CodeLockMessageView.this.finish();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            try {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zing.zalo.ui.zviews.g7
                    @Override // java.lang.Runnable
                    public final void run() {
                        CodeLockMessageView.C14165a.this.m78888b();
                    }
                });
                AbstractC23647d.m123906p("22001330");
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CodeLockMessageView$b */
    /* loaded from: classes6.dex */
    public class C14166b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f72816a;

        C14166b(String str) {
            this.f72816a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m78890d() {
            Intent intent = new Intent();
            intent.putExtra("uid_set_hidden_chat", CodeLockMessageView.this.f72811l1);
            intent.putExtra("case_passcode_process", CodeLockMessageView.this.f72789P0);
            CodeLockMessageView.this.mo50035CK(-1, intent);
            CodeLockMessageView codeLockMessageView = CodeLockMessageView.this;
            codeLockMessageView.f72812m1 = false;
            codeLockMessageView.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            CodeLockMessageView.this.mo49315c4();
            if (c20096c.m104491c() == 2254) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_add_hidden_not_in_group, Integer.valueOf(c20096c.m104491c())));
            } else {
                ToastUtils.showMess(c20096c.m104492d());
            }
            CodeLockMessageView.this.mo50035CK(0, null);
            CodeLockMessageView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            CodeLockMessageView.this.mo49315c4();
            CodeLockMessageView.this.f72810k1 = true;
            AbstractC23309i.m122654zi(this.f72816a);
            C19669z.f97568P.set(true);
            CodeLockMessageView.this.f72806g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.h7
                @Override // java.lang.Runnable
                public final void run() {
                    CodeLockMessageView.C14166b.this.m78890d();
                }
            }, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CodeLockMessageView$c */
    /* loaded from: classes6.dex */
    public class C14167c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f72818a;

        C14167c(String str) {
            this.f72818a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m78892d() {
            CodeLockMessageView codeLockMessageView = CodeLockMessageView.this;
            codeLockMessageView.f72812m1 = false;
            codeLockMessageView.mo50035CK(-1, null);
            CodeLockMessageView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            CodeLockMessageView.this.mo49315c4();
            ToastUtils.showMess(c20096c.m104492d());
            CodeLockMessageView.this.mo50035CK(0, null);
            CodeLockMessageView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            CodeLockMessageView.this.mo49315c4();
            AbstractC23309i.m122654zi(this.f72818a);
            CodeLockMessageView codeLockMessageView = CodeLockMessageView.this;
            codeLockMessageView.f72810k1 = true;
            codeLockMessageView.f72806g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.i7
                @Override // java.lang.Runnable
                public final void run() {
                    CodeLockMessageView.C14167c.this.m78892d();
                }
            }, 200L);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_pin_hidden_success));
            AbstractC23647d.m123906p("22001333");
            AbstractC23647d.m123893c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CodeLockMessageView$d */
    /* loaded from: classes6.dex */
    public class C14168d implements InterfaceC20094a {
        C14168d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m78894d() {
            CodeLockMessageView.this.f72812m1 = false;
            Intent intent = new Intent();
            intent.putExtra("uid_set_hidden_chat", CodeLockMessageView.this.f72811l1);
            intent.putExtra("case_passcode_process", CodeLockMessageView.this.f72789P0);
            CodeLockMessageView.this.mo50035CK(-1, intent);
            InterfaceC14170f interfaceC14170f = CodeLockMessageView.this.f72814o1;
            if (interfaceC14170f != null) {
                interfaceC14170f.mo78897a();
            }
            CodeLockMessageView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            CodeLockMessageView.this.mo49315c4();
            if (c20096c.m104491c() == 2254) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_add_hidden_not_in_group, Integer.valueOf(c20096c.m104491c())));
            } else {
                ToastUtils.showMess(c20096c.m104492d());
            }
            CodeLockMessageView.this.mo50035CK(0, null);
            CodeLockMessageView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            CodeLockMessageView.this.mo49315c4();
            CodeLockMessageView codeLockMessageView = CodeLockMessageView.this;
            codeLockMessageView.f72810k1 = true;
            codeLockMessageView.f72806g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.j7
                @Override // java.lang.Runnable
                public final void run() {
                    CodeLockMessageView.C14168d.this.m78894d();
                }
            }, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CodeLockMessageView$e */
    /* loaded from: classes6.dex */
    public class C14169e implements InterfaceC20094a {
        C14169e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m78896d() {
            C21927m.m114302u().m114326b0();
            if (CodeLockMessageView.this.m92650VI() instanceof ChatView) {
                CodeLockMessageView.this.m92650VI().finish();
            }
            CodeLockMessageView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(c20096c.m104492d());
            CodeLockMessageView.this.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            CodeLockMessageView.this.mo49315c4();
            if (CodeLockMessageView.this.m92676n2() != null) {
                CodeLockMessageView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.k7
                    @Override // java.lang.Runnable
                    public final void run() {
                        CodeLockMessageView.C14169e.this.m78896d();
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CodeLockMessageView$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC14170f {
        /* renamed from: a */
        void mo78897a();
    }

    /* renamed from: com.zing.zalo.ui.zviews.CodeLockMessageView$g */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC14171g extends ClickableSpan {

        /* renamed from: p */
        boolean f72822p;

        /* renamed from: q */
        int f72823q;

        /* renamed from: r */
        int f72824r;

        /* renamed from: s */
        int f72825s;

        public AbstractC14171g(int i11, int i12, int i13) {
            this.f72824r = i11;
            this.f72825s = i12;
            this.f72823q = i13;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            int i11;
            int i12;
            super.updateDrawState(textPaint);
            if (this.f72822p) {
                i11 = this.f72825s;
            } else {
                i11 = this.f72824r;
            }
            textPaint.setColor(i11);
            if (this.f72822p) {
                i12 = this.f72823q;
            } else {
                i12 = 0;
            }
            textPaint.bgColor = i12;
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m78873qM(View view) {
        showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m78874rM(View view) {
        try {
            if (m92650VI() instanceof ChatView) {
                m92650VI().m92662fJ().m93069k2(SettingHiddenChatView.class, null, 1, true);
            } else {
                m92662fJ().m93069k2(SettingHiddenChatView.class, null, 1, true);
            }
            if (m92650VI() instanceof ChatView) {
                m92650VI().finish();
            } else {
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m78875sM() {
        try {
            AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m78876tM() {
        this.f72805f1.delete(0, 4);
        m78883oM(this.f72805f1.length());
        this.f72803d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_confirm_code));
        this.f72804e1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_reinput_pin));
        this.f72812m1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m78877uM() {
        this.f72805f1.delete(0, 4);
        m78883oM(this.f72805f1.length());
        this.f72804e1.setVisibility(4);
        this.f72803d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_new_code));
        this.f72812m1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m78878vM() {
        this.f72804e1.setVisibility(4);
        this.f72805f1.delete(0, 4);
        m78883oM(this.f72805f1.length());
        this.f72803d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_confirm_new_code));
        this.f72812m1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m78879wM() {
        this.f72812m1 = false;
        InterfaceC14170f interfaceC14170f = this.f72814o1;
        if (interfaceC14170f != null) {
            interfaceC14170f.mo78897a();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m78880xM() {
        this.f72805f1.delete(0, 4);
        m78883oM(this.f72805f1.length());
        this.f72812m1 = false;
    }

    /* renamed from: AM */
    public void m78881AM(InterfaceC14170f interfaceC14170f) {
        this.f72814o1 = interfaceC14170f;
    }

    /* renamed from: BM */
    public void m78882BM(String str) {
        this.f72811l1 = str;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        this.f72789P0 = -1;
        if (this.f72421L0.m92642L3() != null) {
            this.f72789P0 = this.f72421L0.m92642L3().getInt("case_passcode_process", -1);
            if (this.f72421L0.m92642L3().containsKey("uid_set_hidden_chat")) {
                str = this.f72421L0.m92642L3().getString("uid_set_hidden_chat");
            } else {
                str = "";
            }
            this.f72811l1 = str;
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
        aVar.m43171t(AbstractC8020f0.str_titleDlg2);
        aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm_forgot_pin));
        aVar.m43164m(AbstractC8020f0.f43842ok, this);
        aVar.m43169r(AbstractC8020f0.cancel, this);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.code_lock_message_view, viewGroup, false);
        m78884pM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        this.f72810k1 = false;
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1) {
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                } else if (i11 == -2) {
                    interfaceC17463d.dismiss();
                    AbstractC20887g.m109230h(70001, "reset hidden chat manual CodeLockMessageView");
                    mo49282B8("", false);
                    AbstractC23195r2.m119523j(new C14169e());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CodeLockMessageView";
    }

    /* renamed from: oM */
    void m78883oM(int i11) {
        int i12 = 0;
        while (true) {
            ImageView[] imageViewArr = this.f72790Q0;
            if (i12 < imageViewArr.length) {
                if (i12 < i11) {
                    imageViewArr[i12].setImageResource(AbstractC16803z.pin_fill_circle_img);
                } else {
                    imageViewArr[i12].setImageResource(AbstractC16803z.pin_empty_circle_img);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.keypad_0) {
            m78886zM('0');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_1) {
            m78886zM('1');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_2) {
            m78886zM('2');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_3) {
            m78886zM('3');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_4) {
            m78886zM('4');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_5) {
            m78886zM('5');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_6) {
            m78886zM('6');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_7) {
            m78886zM('7');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_8) {
            m78886zM('8');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_9) {
            m78886zM('9');
            return;
        }
        if (id2 == AbstractC6918a0.keypad_back) {
            if (!this.f72810k1 && this.f72805f1.length() != 4 && !this.f72812m1) {
                if (this.f72805f1.length() > 0) {
                    this.f72805f1.deleteCharAt(r2.length() - 1);
                }
                m78883oM(this.f72805f1.length());
                this.f72805f1.toString();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.img_close_pin) {
            try {
                if (m92676n2() != null && m92676n2().mo35576n3() && this.f72789P0 == -1) {
                    if (!TextUtils.isEmpty(this.f72811l1)) {
                        C18922m.m99141t().m99145O(this.f72811l1);
                    }
                } else if ((m92650VI() instanceof ChatView) && this.f72789P0 == -1) {
                    m92650VI().finish();
                } else {
                    finish();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: pM */
    void m78884pM(View view) {
        this.f72790Q0[0] = (ImageView) view.findViewById(AbstractC6918a0.code_1);
        this.f72790Q0[1] = (ImageView) view.findViewById(AbstractC6918a0.code_2);
        this.f72790Q0[2] = (ImageView) view.findViewById(AbstractC6918a0.code_3);
        this.f72790Q0[3] = (ImageView) view.findViewById(AbstractC6918a0.code_4);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.keypad_0);
        this.f72791R0 = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(AbstractC6918a0.keypad_1);
        this.f72792S0 = textView2;
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) view.findViewById(AbstractC6918a0.keypad_2);
        this.f72793T0 = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) view.findViewById(AbstractC6918a0.keypad_3);
        this.f72794U0 = textView4;
        textView4.setOnClickListener(this);
        TextView textView5 = (TextView) view.findViewById(AbstractC6918a0.keypad_4);
        this.f72795V0 = textView5;
        textView5.setOnClickListener(this);
        TextView textView6 = (TextView) view.findViewById(AbstractC6918a0.keypad_5);
        this.f72796W0 = textView6;
        textView6.setOnClickListener(this);
        TextView textView7 = (TextView) view.findViewById(AbstractC6918a0.keypad_6);
        this.f72797X0 = textView7;
        textView7.setOnClickListener(this);
        TextView textView8 = (TextView) view.findViewById(AbstractC6918a0.keypad_7);
        this.f72798Y0 = textView8;
        textView8.setOnClickListener(this);
        TextView textView9 = (TextView) view.findViewById(AbstractC6918a0.keypad_8);
        this.f72799Z0 = textView9;
        textView9.setOnClickListener(this);
        TextView textView10 = (TextView) view.findViewById(AbstractC6918a0.keypad_9);
        this.f72800a1 = textView10;
        textView10.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC6918a0.keypad_back);
        this.f72801b1 = imageButton;
        imageButton.setOnClickListener(this);
        ImageView imageView = (ImageView) view.findViewById(AbstractC6918a0.img_close_pin);
        this.f72802c1 = imageView;
        imageView.setOnClickListener(this);
        view.findViewById(AbstractC6918a0.parent_fill_code_layout).setOnClickListener(this);
        view.findViewById(AbstractC6918a0.keypad_unknow).setOnClickListener(this);
        view.findViewById(AbstractC6918a0.num_pad_separate_line).setOnClickListener(this);
        this.f72803d1 = (TextView) view.findViewById(AbstractC6918a0.title_todo_passcodeAct);
        this.f72804e1 = (TextView) view.findViewById(AbstractC6918a0.hint_todo_passcodeAct);
        int i11 = this.f72789P0;
        if (i11 == 0) {
            this.f72803d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_code));
            this.f72804e1.setVisibility(0);
            this.f72804e1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_setup_pin_hidden_chat));
        } else if (i11 == 1) {
            this.f72803d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_old_code));
            this.f72804e1.setVisibility(8);
            this.f72804e1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_forgot_pin));
            this.f72804e1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.d7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CodeLockMessageView.this.m78873qM(view2);
                }
            });
            TextView textView11 = this.f72804e1;
            textView11.setPaintFlags(8 | textView11.getPaintFlags());
        } else {
            if (i11 == 2) {
                this.f72803d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_add_hidden_chat));
            } else {
                this.f72803d1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_open_hidden_chat));
            }
            this.f72804e1.setVisibility(0);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_forgot_pin_one);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_forgot_pin_two);
            int length = m118743r0.length() + 1;
            if (length != -1) {
                try {
                    int length2 = m118743r02.length() + length;
                    C14165a c14165a = new C14165a(C23212s8.m119607o(view.getContext(), AbstractC21196a.TextColor1), C23212s8.m119607o(view.getContext(), AbstractC21196a.TextColor1), C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemBackgroundSelectedColor));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m118743r0);
                    sb2.append(" ");
                    sb2.append(m118743r02);
                    SpannableString spannableString = new SpannableString(sb2);
                    spannableString.setSpan(c14165a, length, length2, 33);
                    this.f72804e1.setMovementMethod(LinkMovementMethod.getInstance());
                    this.f72804e1.setText(spannableString);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    try {
                        this.f72804e1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_forgot_pin));
                        this.f72804e1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.e7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                CodeLockMessageView.this.m78874rM(view2);
                            }
                        });
                        TextView textView12 = this.f72804e1;
                        textView12.setPaintFlags(8 | textView12.getPaintFlags());
                        this.f72804e1.setBackgroundResource(AbstractC16803z.mat_selected_text_view_background);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            }
        }
        if (AbstractC32226c.m155415n(m92676n2())) {
            try {
                if (m92650VI() instanceof ChatView) {
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin += AbstractC17484n.Companion.m92931b();
                } else {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f72802c1.getLayoutParams();
                    layoutParams.setMargins(0, AbstractC17484n.Companion.m92931b(), 0, 0);
                    this.f72802c1.setLayoutParams(layoutParams);
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        view.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.f7
            @Override // java.lang.Runnable
            public final void run() {
                CodeLockMessageView.this.m78875sM();
            }
        }, 200L);
    }

    /* renamed from: yM */
    void m78885yM(String str) {
        if (!this.f72812m1 && !this.f72810k1 && str.length() == 4) {
            int i11 = this.f72789P0;
            if (i11 == 0) {
                this.f72812m1 = true;
                int i12 = this.f72807h1;
                if (i12 == 0) {
                    this.f72809j1 = str;
                    this.f72807h1 = i12 + 1;
                    this.f72806g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.y6
                        @Override // java.lang.Runnable
                        public final void run() {
                            CodeLockMessageView.this.m78876tM();
                        }
                    }, 200L);
                    return;
                } else {
                    if (i12 == 1) {
                        if (str.equals(this.f72809j1)) {
                            this.f72809j1 = "";
                            this.f72807h1 = 0;
                            String m122788d = AbstractC23352g.m122788d(str);
                            mo49282B8("", false);
                            AbstractC23195r2.m119518e(this.f72811l1, m122788d, (byte) 2, new C14166b(m122788d));
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_wrong_input_code_again));
                        this.f72806g1.postDelayed(this.f72813n1, 200L);
                        return;
                    }
                    return;
                }
            }
            if (i11 == 1) {
                this.f72812m1 = true;
                int i13 = this.f72808i1;
                if (i13 == 0) {
                    String m122303q0 = AbstractC23309i.m122303q0();
                    String m122788d2 = AbstractC23352g.m122788d(str);
                    if (!TextUtils.isEmpty(m122303q0) && !TextUtils.isEmpty(m122788d2)) {
                        if (m122303q0.equals(m122788d2)) {
                            this.f72808i1++;
                            this.f72806g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.z6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CodeLockMessageView.this.m78877uM();
                                }
                            }, 200L);
                            return;
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_input_code_incorrect));
                            this.f72806g1.postDelayed(this.f72813n1, 200L);
                            return;
                        }
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_wrong_old_code));
                    this.f72806g1.postDelayed(this.f72813n1, 200L);
                    return;
                }
                if (i13 == 1) {
                    this.f72809j1 = str;
                    this.f72808i1 = i13 + 1;
                    this.f72806g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.a7
                        @Override // java.lang.Runnable
                        public final void run() {
                            CodeLockMessageView.this.m78878vM();
                        }
                    }, 200L);
                    return;
                } else {
                    if (i13 == 2) {
                        if (str.equals(this.f72809j1)) {
                            this.f72809j1 = "";
                            this.f72808i1 = 0;
                            String m122788d3 = AbstractC23352g.m122788d(str);
                            mo49282B8("", false);
                            AbstractC23195r2.m119518e(null, m122788d3, (byte) 3, new C14167c(m122788d3));
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_wrong_input_code_again));
                        this.f72806g1.postDelayed(this.f72813n1, 200L);
                        return;
                    }
                    return;
                }
            }
            String m122303q02 = AbstractC23309i.m122303q0();
            String m122788d4 = AbstractC23352g.m122788d(str);
            if (!TextUtils.isEmpty(m122303q02) && !TextUtils.isEmpty(m122788d4)) {
                if (m122303q02.equals(m122788d4)) {
                    if (this.f72789P0 == 2) {
                        mo49282B8("", false);
                        AbstractC23195r2.m119518e(this.f72811l1, null, (byte) 2, new C14168d());
                        return;
                    } else {
                        this.f72810k1 = true;
                        this.f72806g1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.b7
                            @Override // java.lang.Runnable
                            public final void run() {
                                CodeLockMessageView.this.m78879wM();
                            }
                        }, 200L);
                        return;
                    }
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_input_code_incorrect));
                this.f72806g1.postDelayed(this.f72813n1, 200L);
            }
        }
    }

    /* renamed from: zM */
    void m78886zM(char c11) {
        if (!this.f72810k1 && !this.f72812m1) {
            this.f72805f1.append(c11);
            if (this.f72805f1.length() > 4) {
                this.f72805f1.setLength(4);
            }
            m78883oM(this.f72805f1.length());
            if (this.f72805f1.length() == 4) {
                m78885yM(this.f72805f1.toString());
            }
            this.f72805f1.toString();
        }
    }
}
