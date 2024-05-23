package com.zing.zalo.zview.passcode;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.AbstractC17470g;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.passcode.PassCodeView;
import mm0.AbstractC23352g;

/* loaded from: classes7.dex */
public class PassCodeView extends FrameLayout implements View.OnClickListener {

    /* renamed from: A */
    TextView f89152A;

    /* renamed from: B */
    TextView f89153B;

    /* renamed from: C */
    TextView f89154C;

    /* renamed from: D */
    TextView f89155D;

    /* renamed from: E */
    ImageButton f89156E;

    /* renamed from: F */
    LinearLayout f89157F;

    /* renamed from: G */
    TextView f89158G;

    /* renamed from: H */
    ImageView f89159H;

    /* renamed from: I */
    StringBuilder f89160I;

    /* renamed from: J */
    Handler f89161J;

    /* renamed from: K */
    InterfaceC17497h f89162K;

    /* renamed from: L */
    InterfaceC17496g f89163L;

    /* renamed from: M */
    InterfaceC17494e f89164M;

    /* renamed from: N */
    ActionBar f89165N;

    /* renamed from: O */
    boolean f89166O;

    /* renamed from: P */
    boolean f89167P;

    /* renamed from: Q */
    Runnable f89168Q;

    /* renamed from: p */
    final int f89169p;

    /* renamed from: q */
    ImageView[] f89170q;

    /* renamed from: r */
    String f89171r;

    /* renamed from: s */
    String f89172s;

    /* renamed from: t */
    public int f89173t;

    /* renamed from: u */
    TextView f89174u;

    /* renamed from: v */
    TextView f89175v;

    /* renamed from: w */
    TextView f89176w;

    /* renamed from: x */
    TextView f89177x;

    /* renamed from: y */
    TextView f89178y;

    /* renamed from: z */
    TextView f89179z;

    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$a */
    /* loaded from: classes7.dex */
    class C17490a implements Handler.Callback {
        C17490a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                PassCodeView.this.m93108d();
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$b */
    /* loaded from: classes7.dex */
    public class RunnableC17491b implements Runnable {
        RunnableC17491b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb2 = PassCodeView.this.f89160I;
            sb2.delete(0, sb2.length());
            PassCodeView passCodeView = PassCodeView.this;
            passCodeView.m93106b(passCodeView.f89160I.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$c */
    /* loaded from: classes7.dex */
    public class RunnableC17492c implements Runnable {
        RunnableC17492c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PassCodeView.this.f89167P = false;
        }
    }

    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$d */
    /* loaded from: classes7.dex */
    class RunnableC17493d implements Runnable {

        /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$d$a */
        /* loaded from: classes7.dex */
        class a implements InterfaceC17495f {

            /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            class RunnableC32797a implements Runnable {
                RunnableC32797a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    PassCodeView.this.m93106b(4);
                }
            }

            a() {
            }

            @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17495f
            /* renamed from: a */
            public void mo93116a() {
                try {
                    PassCodeView.this.f89162K.mo35562b0();
                    PassCodeView.this.f89164M.mo92925a();
                    PassCodeView.this.m93114k();
                    Handler handler = PassCodeView.this.f89161J;
                    if (handler != null) {
                        handler.post(new RunnableC32797a());
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17495f
            /* renamed from: b */
            public void mo93117b(int i11, String str) {
            }

            @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17495f
            /* renamed from: c */
            public void mo93118c() {
            }
        }

        RunnableC17493d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InterfaceC17497h interfaceC17497h = PassCodeView.this.f89162K;
                if (interfaceC17497h != null) {
                    interfaceC17497h.mo35580p0(new a());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$e */
    /* loaded from: classes7.dex */
    public interface InterfaceC17494e {
        /* renamed from: a */
        void mo92925a();
    }

    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$f */
    /* loaded from: classes7.dex */
    public interface InterfaceC17495f {
        /* renamed from: a */
        void mo93116a();

        /* renamed from: b */
        void mo93117b(int i11, String str);

        /* renamed from: c */
        void mo93118c();
    }

    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$g */
    /* loaded from: classes7.dex */
    public interface InterfaceC17496g {
        /* renamed from: a */
        void mo93097a();
    }

    /* renamed from: com.zing.zalo.zview.passcode.PassCodeView$h */
    /* loaded from: classes.dex */
    public interface InterfaceC17497h {
        /* renamed from: G */
        String mo35550G();

        /* renamed from: L0 */
        String mo35553L0();

        /* renamed from: b */
        String mo35561b();

        /* renamed from: b0 */
        void mo35562b0();

        /* renamed from: b1 */
        void mo35563b1();

        /* renamed from: d */
        void mo35566d();

        /* renamed from: p0 */
        void mo35580p0(InterfaceC17495f interfaceC17495f);

        /* renamed from: s */
        String mo35583s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassCodeView(Context context, int i11) {
        super(context);
        this.f89169p = 4;
        this.f89170q = new ImageView[4];
        this.f89173t = -1;
        this.f89160I = new StringBuilder(4);
        this.f89161J = new Handler(Looper.getMainLooper(), new C17490a());
        this.f89166O = false;
        this.f89167P = false;
        this.f89168Q = new RunnableC17493d();
        this.f89173t = i11;
        m93109e();
        if (context != 0 && (context instanceof InterfaceC17497h)) {
            this.f89162K = (InterfaceC17497h) context;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m93105f() {
        try {
            this.f89171r = this.f89162K.mo35553L0();
            this.f89172s = this.f89162K.mo35550G();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    void m93106b(int i11) {
        int i12 = 0;
        while (true) {
            try {
                ImageView[] imageViewArr = this.f89170q;
                if (i12 < imageViewArr.length) {
                    if (i12 < i11) {
                        imageViewArr[i12].setImageResource(AbstractC17466e.passcode_fill_img);
                    } else {
                        imageViewArr[i12].setImageResource(AbstractC17466e.passcode_empty_img);
                    }
                    i12++;
                } else {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: c */
    public void m93107c() {
        Handler handler = this.f89161J;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, 300L);
        }
    }

    /* renamed from: d */
    void m93108d() {
        this.f89160I.delete(0, 4);
        m93106b(this.f89160I.length());
        m93114k();
        InterfaceC17496g interfaceC17496g = this.f89163L;
        if (interfaceC17496g != null) {
            interfaceC17496g.mo93097a();
        }
    }

    /* renamed from: e */
    void m93109e() {
        try {
            LayoutInflater.from(getContext()).inflate(AbstractC17470g.pass_code_view, (ViewGroup) this, true);
            ActionBar actionBar = (ActionBar) findViewById(AbstractC17468f.zalo_action_bar);
            this.f89165N = actionBar;
            if (actionBar != null) {
                InterfaceC17497h interfaceC17497h = this.f89162K;
                if (interfaceC17497h != null && interfaceC17497h.mo35583s() != null) {
                    this.f89165N.setTitle(this.f89162K.mo35583s());
                }
                this.f89165N.setBackgroundResource(AbstractC17466e.stencil_bg_action_bar);
            }
            this.f89170q[0] = (ImageView) findViewById(AbstractC17468f.code_1);
            this.f89170q[1] = (ImageView) findViewById(AbstractC17468f.code_2);
            this.f89170q[2] = (ImageView) findViewById(AbstractC17468f.code_3);
            this.f89170q[3] = (ImageView) findViewById(AbstractC17468f.code_4);
            this.f89159H = (ImageView) findViewById(AbstractC17468f.img_fingerprint_support);
            this.f89157F = (LinearLayout) findViewById(AbstractC17468f.llimgFingerPrint);
            TextView textView = (TextView) findViewById(AbstractC17468f.keypad_0);
            this.f89174u = textView;
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) findViewById(AbstractC17468f.keypad_1);
            this.f89175v = textView2;
            textView2.setOnClickListener(this);
            TextView textView3 = (TextView) findViewById(AbstractC17468f.keypad_2);
            this.f89176w = textView3;
            textView3.setOnClickListener(this);
            TextView textView4 = (TextView) findViewById(AbstractC17468f.keypad_3);
            this.f89177x = textView4;
            textView4.setOnClickListener(this);
            TextView textView5 = (TextView) findViewById(AbstractC17468f.keypad_4);
            this.f89178y = textView5;
            textView5.setOnClickListener(this);
            TextView textView6 = (TextView) findViewById(AbstractC17468f.keypad_5);
            this.f89179z = textView6;
            textView6.setOnClickListener(this);
            TextView textView7 = (TextView) findViewById(AbstractC17468f.keypad_6);
            this.f89152A = textView7;
            textView7.setOnClickListener(this);
            TextView textView8 = (TextView) findViewById(AbstractC17468f.keypad_7);
            this.f89153B = textView8;
            textView8.setOnClickListener(this);
            TextView textView9 = (TextView) findViewById(AbstractC17468f.keypad_8);
            this.f89154C = textView9;
            textView9.setOnClickListener(this);
            TextView textView10 = (TextView) findViewById(AbstractC17468f.keypad_9);
            this.f89155D = textView10;
            textView10.setOnClickListener(this);
            ImageButton imageButton = (ImageButton) findViewById(AbstractC17468f.keypad_back);
            this.f89156E = imageButton;
            imageButton.setOnClickListener(this);
            this.f89158G = (TextView) findViewById(AbstractC17468f.hint_todo_passcodeAct);
            InterfaceC17497h interfaceC17497h2 = this.f89162K;
            if (interfaceC17497h2 != null && interfaceC17497h2.mo35561b() != null) {
                this.f89158G.setText(this.f89162K.mo35561b());
            }
            findViewById(AbstractC17468f.empty_layout).setOnClickListener(this);
            findViewById(AbstractC17468f.keypad_unknow).setOnClickListener(this);
            findViewById(AbstractC17468f.num_pad_separate_line).setOnClickListener(this);
            ImageView imageView = this.f89159H;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
            LinearLayout linearLayout = this.f89157F;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m93110g() {
    }

    public InterfaceC17494e getAcceptedListener() {
        return this.f89164M;
    }

    /* renamed from: h */
    public void m93111h() {
        Handler handler = this.f89161J;
        if (handler != null) {
            handler.postDelayed(new RunnableC17492c(), 200L);
        }
    }

    /* renamed from: i */
    public void m93112i() {
        this.f89167P = true;
        m93114k();
    }

    /* renamed from: j */
    void m93113j(char c11) {
        this.f89160I.append(c11);
        m93106b(this.f89160I.length());
        if (this.f89160I.length() == 4) {
            String substring = this.f89160I.substring(0, 4);
            InterfaceC17497h interfaceC17497h = this.f89162K;
            if (interfaceC17497h != null) {
                if (this.f89171r == null) {
                    this.f89171r = interfaceC17497h.mo35553L0();
                }
                String m122788d = AbstractC23352g.m122788d(substring);
                if (!TextUtils.isEmpty(m122788d)) {
                    String str = this.f89171r;
                    if (str != null && !str.equals(m122788d)) {
                        if (this.f89172s == null) {
                            this.f89172s = this.f89162K.mo35550G();
                        }
                        String str2 = this.f89172s;
                        if (str2 != null && !str2.equals(m122788d)) {
                            this.f89162K.mo35566d();
                            Handler handler = this.f89161J;
                            if (handler != null) {
                                handler.postDelayed(new RunnableC17491b(), 300L);
                                return;
                            }
                            return;
                        }
                        this.f89162K.mo35562b0();
                        InterfaceC17494e interfaceC17494e = this.f89164M;
                        if (interfaceC17494e != null) {
                            this.f89167P = true;
                            interfaceC17494e.mo92925a();
                            m93114k();
                        }
                        this.f89162K.mo35563b1();
                        return;
                    }
                    this.f89162K.mo35562b0();
                    InterfaceC17494e interfaceC17494e2 = this.f89164M;
                    if (interfaceC17494e2 != null) {
                        this.f89167P = true;
                        interfaceC17494e2.mo92925a();
                        m93114k();
                    }
                }
            }
        }
    }

    /* renamed from: k */
    void m93114k() {
        try {
            this.f89166O = false;
            this.f89161J.removeCallbacks(this.f89168Q);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public void m93115l() {
        String str;
        TextView textView;
        ActionBar actionBar;
        InterfaceC17497h interfaceC17497h = this.f89162K;
        if (interfaceC17497h != null && interfaceC17497h.mo35561b() != null) {
            str = this.f89162K.mo35561b();
        } else {
            str = null;
        }
        ImageView imageView = this.f89159H;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f89157F;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        InterfaceC17497h interfaceC17497h2 = this.f89162K;
        if (interfaceC17497h2 != null && interfaceC17497h2.mo35583s() != null && (actionBar = this.f89165N) != null) {
            actionBar.setTitle(this.f89162K.mo35583s());
        }
        if (!TextUtils.isEmpty(str) && (textView = this.f89158G) != null) {
            textView.setText(str);
        }
        Handler handler = this.f89161J;
        if (handler != null && handler.hasMessages(1)) {
            this.f89161J.removeMessages(1);
            m93108d();
        }
        StringBuilder sb2 = this.f89160I;
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
        m93106b(0);
        if (this.f89162K != null) {
            this.f89171r = null;
            this.f89172s = null;
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: yl0.a
                @Override // java.lang.Runnable
                public final void run() {
                    PassCodeView.this.m93105f();
                }
            });
        }
        this.f89161J.removeCallbacks(this.f89168Q);
        this.f89161J.postDelayed(this.f89168Q, 100L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC17468f.keypad_0) {
            m93113j('0');
            return;
        }
        if (id2 == AbstractC17468f.keypad_1) {
            m93113j('1');
            return;
        }
        if (id2 == AbstractC17468f.keypad_2) {
            m93113j('2');
            return;
        }
        if (id2 == AbstractC17468f.keypad_3) {
            m93113j('3');
            return;
        }
        if (id2 == AbstractC17468f.keypad_4) {
            m93113j('4');
            return;
        }
        if (id2 == AbstractC17468f.keypad_5) {
            m93113j('5');
            return;
        }
        if (id2 == AbstractC17468f.keypad_6) {
            m93113j('6');
            return;
        }
        if (id2 == AbstractC17468f.keypad_7) {
            m93113j('7');
            return;
        }
        if (id2 == AbstractC17468f.keypad_8) {
            m93113j('8');
            return;
        }
        if (id2 == AbstractC17468f.keypad_9) {
            m93113j('9');
            return;
        }
        if (id2 != AbstractC17468f.keypad_back || this.f89160I.length() >= 4) {
            return;
        }
        if (this.f89160I.length() > 0) {
            this.f89160I.deleteCharAt(r2.length() - 1);
        }
        m93106b(this.f89160I.length());
    }

    public void setAcceptedPassCodeListener(InterfaceC17494e interfaceC17494e) {
        this.f89164M = interfaceC17494e;
    }

    public void setPassCodeContainerListener(InterfaceC17496g interfaceC17496g) {
        this.f89163L = interfaceC17496g;
    }
}
