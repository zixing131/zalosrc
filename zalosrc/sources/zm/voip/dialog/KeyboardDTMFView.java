package zm.voip.dialog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ep0.C18556p;
import kg.AbstractC21705b;
import kg.C21709f;
import kg.C21715l;
import me0.AbstractC23136l9;
import p266jg.AbstractC21245c;
import zm.voip.dialog.KeyboardDTMFView;

/* loaded from: classes7.dex */
public class KeyboardDTMFView extends LinearLayout {

    /* renamed from: A */
    private RobotoTextView f148690A;

    /* renamed from: B */
    private RobotoTextView f148691B;

    /* renamed from: C */
    private RobotoTextView f148692C;

    /* renamed from: D */
    private RobotoTextView f148693D;

    /* renamed from: E */
    private final StringBuilder f148694E;

    /* renamed from: F */
    private C21709f f148695F;

    /* renamed from: G */
    private C21709f f148696G;

    /* renamed from: H */
    private C21709f f148697H;

    /* renamed from: I */
    private C21709f f148698I;

    /* renamed from: J */
    private C21709f f148699J;

    /* renamed from: K */
    private C21709f f148700K;

    /* renamed from: L */
    private C21709f f148701L;

    /* renamed from: M */
    private C21709f f148702M;

    /* renamed from: N */
    private C21709f f148703N;

    /* renamed from: O */
    private C21709f f148704O;

    /* renamed from: P */
    private C21709f f148705P;

    /* renamed from: Q */
    private C21709f f148706Q;

    /* renamed from: R */
    private C21709f f148707R;

    /* renamed from: S */
    private final AbstractC21705b f148708S;

    /* renamed from: T */
    private final boolean f148709T;

    /* renamed from: p */
    private InterfaceC32242b f148710p;

    /* renamed from: q */
    private ImageButton f148711q;

    /* renamed from: r */
    private RobotoTextView f148712r;

    /* renamed from: s */
    private RobotoTextView f148713s;

    /* renamed from: t */
    private RobotoTextView f148714t;

    /* renamed from: u */
    private RobotoTextView f148715u;

    /* renamed from: v */
    private RobotoTextView f148716v;

    /* renamed from: w */
    private RobotoTextView f148717w;

    /* renamed from: x */
    private RobotoTextView f148718x;

    /* renamed from: y */
    private RobotoTextView f148719y;

    /* renamed from: z */
    private RobotoTextView f148720z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.dialog.KeyboardDTMFView$a */
    /* loaded from: classes7.dex */
    public class ViewOnTouchListenerC32241a implements View.OnTouchListener {

        /* renamed from: p */
        private Rect f148721p;

        /* renamed from: q */
        private final C21709f f148722q;

        /* renamed from: r */
        private final int f148723r = AbstractC3104p.m15650a(10.0f);

        /* renamed from: s */
        private boolean f148724s;

        ViewOnTouchListenerC32241a(C21709f c21709f) {
            this.f148722q = c21709f;
        }

        /* renamed from: a */
        void m155504a(View view) {
            this.f148724s = false;
            view.setPressed(false);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            if (view instanceof RobotoTextView) {
                ((RobotoTextView) view).setTextColor(-1);
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 3) {
                            this.f148722q.m112046s(0.0d);
                            if (this.f148724s) {
                                m155504a(view);
                            }
                        }
                    } else if (this.f148724s) {
                        m155504a(view);
                        this.f148722q.m112046s(0.0d);
                        if (this.f148721p.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY())) && (view instanceof RobotoTextView)) {
                            KeyboardDTMFView.this.m155501h(((RobotoTextView) view).getText().toString());
                        }
                        if (KeyboardDTMFView.this.f148710p != null) {
                            KeyboardDTMFView.this.f148710p.mo155507c(true);
                        }
                        if (view == KeyboardDTMFView.this.f148711q && KeyboardDTMFView.this.f148710p != null) {
                            KeyboardDTMFView.this.f148710p.mo155505a(false);
                        }
                    }
                } else {
                    this.f148724s = true;
                    view.setPressed(true);
                    if (view instanceof RobotoTextView) {
                        ((RobotoTextView) view).setTextColor(Color.parseColor("#001a33"));
                    }
                    view.performHapticFeedback(0);
                    this.f148721p = new Rect(view.getLeft() - this.f148723r, view.getTop() - this.f148723r, view.getRight() + this.f148723r, view.getBottom() + this.f148723r);
                    this.f148722q.m112046s(1.0d);
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }

    /* renamed from: zm.voip.dialog.KeyboardDTMFView$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC32242b {
        /* renamed from: a */
        void mo155505a(boolean z11);

        /* renamed from: b */
        void mo155506b(String str);

        /* renamed from: c */
        void mo155507c(boolean z11);
    }

    public KeyboardDTMFView(Context context, boolean z11) {
        super(context);
        this.f148694E = new StringBuilder();
        this.f148708S = C21715l.m112062k();
        this.f148709T = z11;
        m155503i();
        m155499f();
        m155502e();
    }

    /* renamed from: f */
    private void m155499f() {
        int m15665h0 = AbstractC3104p.m15665h0();
        int m15650a = AbstractC3104p.m15650a(10.0f);
        int m15650a2 = AbstractC3104p.m15650a(5.0f);
        int i11 = (m15650a * 2) + (m15665h0 * 3);
        int i12 = (int) (m15665h0 / 2.5d);
        setOrientation(1);
        if (this.f148709T) {
            setBackgroundResource(AbstractC16803z.bg_call_keyboard_video);
        } else {
            setBackgroundResource(AbstractC16803z.bg_call_keyboard_audio);
        }
        setPadding(AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(8.0f));
        setOnTouchListener(new View.OnTouchListener() { // from class: no0.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m155500g;
                m155500g = KeyboardDTMFView.this.m155500g(view, motionEvent);
                return m155500g;
            }
        });
        LinearLayout.LayoutParams m15703f = AbstractC3105q.m15703f((AbstractC23136l9.m118742r(3.0f) * 2) + i12, i12 + (AbstractC23136l9.m118742r(3.0f) * 2));
        m15703f.gravity = 5;
        ImageButton imageButton = new ImageButton(getContext());
        this.f148711q = imageButton;
        imageButton.setId(AbstractC6918a0.call_closeKeyboard);
        this.f148711q.setImageResource(AbstractC16803z.ic_call_close_keyboard);
        this.f148711q.setBackgroundResource(AbstractC16803z.bg_call_circle);
        this.f148711q.setPadding(AbstractC23136l9.m118742r(3.0f), AbstractC23136l9.m118742r(3.0f), AbstractC23136l9.m118742r(3.0f), AbstractC23136l9.m118742r(3.0f));
        this.f148711q.setLayoutParams(m15703f);
        LinearLayout.LayoutParams m15701d = AbstractC3105q.m15701d(-2, -2);
        m15701d.bottomMargin = AbstractC23136l9.m118742r(5.0f);
        m15701d.gravity = 17;
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f148693D = robotoTextView;
        robotoTextView.setLayoutParams(m15701d);
        this.f148693D.setTextSize(1, 32.0f);
        this.f148693D.setMaxLines(1);
        this.f148693D.setEllipsize(TextUtils.TruncateAt.START);
        this.f148693D.setTextColor(-1);
        this.f148693D.setVisibility(4);
        this.f148693D.setMaxWidth(i11);
        LinearLayout.LayoutParams m15701d2 = AbstractC3105q.m15701d(-2, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(m15701d2);
        LinearLayout.LayoutParams m15703f2 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f2.leftMargin = m15650a;
        m15703f2.topMargin = m15650a2;
        m15703f2.rightMargin = m15650a;
        m15703f2.bottomMargin = m15650a2;
        RobotoTextView robotoTextView2 = new RobotoTextView(getContext());
        this.f148713s = robotoTextView2;
        robotoTextView2.setId(AbstractC6918a0.call_keyPad1);
        this.f148713s.setLayoutParams(m15703f2);
        this.f148713s.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148713s.setGravity(17);
        this.f148713s.setTextColor(-1);
        this.f148713s.setText("1");
        this.f148713s.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f3 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f3.leftMargin = m15650a;
        m15703f3.topMargin = m15650a2;
        m15703f3.rightMargin = m15650a;
        m15703f3.bottomMargin = m15650a2;
        RobotoTextView robotoTextView3 = new RobotoTextView(getContext());
        this.f148714t = robotoTextView3;
        robotoTextView3.setId(AbstractC6918a0.call_keyPad2);
        this.f148714t.setLayoutParams(m15703f3);
        this.f148714t.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148714t.setGravity(17);
        this.f148714t.setTextColor(-1);
        this.f148714t.setText("2");
        this.f148714t.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f4 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f4.leftMargin = m15650a;
        m15703f4.topMargin = m15650a2;
        m15703f4.rightMargin = m15650a;
        m15703f4.bottomMargin = m15650a2;
        RobotoTextView robotoTextView4 = new RobotoTextView(getContext());
        this.f148715u = robotoTextView4;
        robotoTextView4.setId(AbstractC6918a0.call_keyPad3);
        this.f148715u.setLayoutParams(m15703f4);
        this.f148715u.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148715u.setGravity(17);
        this.f148715u.setTextColor(-1);
        this.f148715u.setText("3");
        this.f148715u.setTextSize(1, 24.0f);
        linearLayout.addView(this.f148713s);
        linearLayout.addView(this.f148714t);
        linearLayout.addView(this.f148715u);
        LinearLayout.LayoutParams m15701d3 = AbstractC3105q.m15701d(-2, -2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(m15701d3);
        LinearLayout.LayoutParams m15703f5 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f5.leftMargin = m15650a;
        m15703f5.topMargin = m15650a2;
        m15703f5.rightMargin = m15650a;
        m15703f5.bottomMargin = m15650a2;
        RobotoTextView robotoTextView5 = new RobotoTextView(getContext());
        this.f148716v = robotoTextView5;
        robotoTextView5.setId(AbstractC6918a0.call_keyPad4);
        this.f148716v.setLayoutParams(m15703f5);
        this.f148716v.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148716v.setGravity(17);
        this.f148716v.setTextColor(-1);
        this.f148716v.setText("4");
        this.f148716v.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f6 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f6.leftMargin = m15650a;
        m15703f6.topMargin = m15650a2;
        m15703f6.rightMargin = m15650a;
        m15703f6.bottomMargin = m15650a2;
        RobotoTextView robotoTextView6 = new RobotoTextView(getContext());
        this.f148717w = robotoTextView6;
        robotoTextView6.setId(AbstractC6918a0.call_keyPad5);
        this.f148717w.setLayoutParams(m15703f6);
        this.f148717w.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148717w.setGravity(17);
        this.f148717w.setTextColor(-1);
        this.f148717w.setText("5");
        this.f148717w.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f7 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f7.leftMargin = m15650a;
        m15703f7.topMargin = m15650a2;
        m15703f7.rightMargin = m15650a;
        m15703f7.bottomMargin = m15650a2;
        RobotoTextView robotoTextView7 = new RobotoTextView(getContext());
        this.f148718x = robotoTextView7;
        robotoTextView7.setId(AbstractC6918a0.call_keyPad6);
        this.f148718x.setLayoutParams(m15703f7);
        this.f148718x.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148718x.setGravity(17);
        this.f148718x.setTextColor(-1);
        this.f148718x.setText("6");
        this.f148718x.setTextSize(1, 24.0f);
        linearLayout2.addView(this.f148716v);
        linearLayout2.addView(this.f148717w);
        linearLayout2.addView(this.f148718x);
        LinearLayout.LayoutParams m15701d4 = AbstractC3105q.m15701d(-2, -2);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(m15701d4);
        LinearLayout.LayoutParams m15703f8 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f8.leftMargin = m15650a;
        m15703f8.topMargin = m15650a2;
        m15703f8.rightMargin = m15650a;
        m15703f8.bottomMargin = m15650a2;
        RobotoTextView robotoTextView8 = new RobotoTextView(getContext());
        this.f148719y = robotoTextView8;
        robotoTextView8.setId(AbstractC6918a0.call_keyPad7);
        this.f148719y.setLayoutParams(m15703f8);
        this.f148719y.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148719y.setGravity(17);
        this.f148719y.setTextColor(-1);
        this.f148719y.setText("7");
        this.f148719y.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f9 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f9.leftMargin = m15650a;
        m15703f9.topMargin = m15650a2;
        m15703f9.rightMargin = m15650a;
        m15703f9.bottomMargin = m15650a2;
        RobotoTextView robotoTextView9 = new RobotoTextView(getContext());
        this.f148720z = robotoTextView9;
        robotoTextView9.setId(AbstractC6918a0.call_keyPad8);
        this.f148720z.setLayoutParams(m15703f9);
        this.f148720z.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148720z.setGravity(17);
        this.f148720z.setTextColor(-1);
        this.f148720z.setText("8");
        this.f148720z.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f10 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f10.leftMargin = m15650a;
        m15703f10.topMargin = m15650a2;
        m15703f10.rightMargin = m15650a;
        m15703f10.bottomMargin = m15650a2;
        RobotoTextView robotoTextView10 = new RobotoTextView(getContext());
        this.f148690A = robotoTextView10;
        robotoTextView10.setId(AbstractC6918a0.call_keyPad9);
        this.f148690A.setLayoutParams(m15703f10);
        this.f148690A.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148690A.setGravity(17);
        this.f148690A.setTextColor(-1);
        this.f148690A.setText("9");
        this.f148690A.setTextSize(1, 24.0f);
        linearLayout3.addView(this.f148719y);
        linearLayout3.addView(this.f148720z);
        linearLayout3.addView(this.f148690A);
        LinearLayout.LayoutParams m15701d5 = AbstractC3105q.m15701d(-2, -2);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(m15701d5);
        LinearLayout.LayoutParams m15703f11 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f11.leftMargin = m15650a;
        m15703f11.topMargin = m15650a2;
        m15703f11.rightMargin = m15650a;
        m15703f11.bottomMargin = m15650a2;
        RobotoTextView robotoTextView11 = new RobotoTextView(getContext());
        this.f148691B = robotoTextView11;
        robotoTextView11.setId(AbstractC6918a0.call_keyPadAsterisk);
        this.f148691B.setLayoutParams(m15703f11);
        this.f148691B.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148691B.setGravity(17);
        this.f148691B.setTextColor(-1);
        this.f148691B.setText("*");
        this.f148691B.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f12 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f12.leftMargin = m15650a;
        m15703f12.topMargin = m15650a2;
        m15703f12.rightMargin = m15650a;
        m15703f12.bottomMargin = m15650a2;
        m15703f12.gravity = 17;
        RobotoTextView robotoTextView12 = new RobotoTextView(getContext());
        this.f148712r = robotoTextView12;
        robotoTextView12.setId(AbstractC6918a0.call_keyPad0);
        this.f148712r.setLayoutParams(m15703f12);
        this.f148712r.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148712r.setGravity(17);
        this.f148712r.setTextColor(-1);
        this.f148712r.setText("0");
        this.f148712r.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams m15703f13 = AbstractC3105q.m15703f(m15665h0, m15665h0);
        m15703f13.leftMargin = m15650a;
        m15703f13.topMargin = m15650a2;
        m15703f13.rightMargin = m15650a;
        m15703f13.bottomMargin = m15650a2;
        RobotoTextView robotoTextView13 = new RobotoTextView(getContext());
        this.f148692C = robotoTextView13;
        robotoTextView13.setId(AbstractC6918a0.call_keyPadSharp);
        this.f148692C.setLayoutParams(m15703f13);
        this.f148692C.setBackgroundResource(AbstractC16803z.bg_call_keypad_selector);
        this.f148692C.setGravity(17);
        this.f148692C.setTextColor(-1);
        this.f148692C.setText("#");
        this.f148692C.setTextSize(1, 24.0f);
        linearLayout4.addView(this.f148691B);
        linearLayout4.addView(this.f148712r);
        linearLayout4.addView(this.f148692C);
        addView(this.f148711q);
        addView(this.f148693D);
        addView(linearLayout);
        addView(linearLayout2);
        addView(linearLayout3);
        addView(linearLayout4);
        this.f148711q.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148695F));
        this.f148712r.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148696G));
        this.f148713s.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148697H));
        this.f148714t.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148698I));
        this.f148715u.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148699J));
        this.f148716v.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148700K));
        this.f148717w.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148701L));
        this.f148718x.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148702M));
        this.f148719y.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148703N));
        this.f148720z.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148704O));
        this.f148690A.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148705P));
        this.f148691B.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148706Q));
        this.f148692C.setOnTouchListener(new ViewOnTouchListenerC32241a(this.f148707R));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ boolean m155500g(View view, MotionEvent motionEvent) {
        InterfaceC32242b interfaceC32242b = this.f148710p;
        if (interfaceC32242b != null) {
            interfaceC32242b.mo155507c(true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m155501h(String str) {
        InterfaceC32242b interfaceC32242b;
        this.f148694E.append(str);
        this.f148693D.setText(this.f148694E.toString());
        if (!TextUtils.isEmpty(this.f148694E)) {
            this.f148693D.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str) && (interfaceC32242b = this.f148710p) != null) {
            interfaceC32242b.mo155506b(str);
        }
    }

    /* renamed from: e */
    public void m155502e() {
        try {
            this.f148695F.m112030a(new C18556p(this.f148711q));
            this.f148696G.m112030a(new C18556p(this.f148712r));
            this.f148697H.m112030a(new C18556p(this.f148713s));
            this.f148698I.m112030a(new C18556p(this.f148714t));
            this.f148699J.m112030a(new C18556p(this.f148715u));
            this.f148700K.m112030a(new C18556p(this.f148716v));
            this.f148701L.m112030a(new C18556p(this.f148717w));
            this.f148702M.m112030a(new C18556p(this.f148718x));
            this.f148703N.m112030a(new C18556p(this.f148719y));
            this.f148704O.m112030a(new C18556p(this.f148720z));
            this.f148705P.m112030a(new C18556p(this.f148690A));
            this.f148706Q.m112030a(new C18556p(this.f148691B));
            this.f148707R.m112030a(new C18556p(this.f148692C));
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    void m155503i() {
        this.f148695F = this.f148708S.m112019d();
        this.f148696G = this.f148708S.m112019d();
        this.f148697H = this.f148708S.m112019d();
        this.f148698I = this.f148708S.m112019d();
        this.f148699J = this.f148708S.m112019d();
        this.f148700K = this.f148708S.m112019d();
        this.f148701L = this.f148708S.m112019d();
        this.f148702M = this.f148708S.m112019d();
        this.f148703N = this.f148708S.m112019d();
        this.f148704O = this.f148708S.m112019d();
        this.f148705P = this.f148708S.m112019d();
        this.f148706Q = this.f148708S.m112019d();
        this.f148707R = this.f148708S.m112019d();
        this.f148695F.m112048u(AbstractC21245c.f103555b);
        this.f148696G.m112048u(AbstractC21245c.f103555b);
        this.f148697H.m112048u(AbstractC21245c.f103555b);
        this.f148698I.m112048u(AbstractC21245c.f103555b);
        this.f148699J.m112048u(AbstractC21245c.f103555b);
        this.f148700K.m112048u(AbstractC21245c.f103555b);
        this.f148701L.m112048u(AbstractC21245c.f103555b);
        this.f148702M.m112048u(AbstractC21245c.f103555b);
        this.f148703N.m112048u(AbstractC21245c.f103555b);
        this.f148704O.m112048u(AbstractC21245c.f103555b);
        this.f148705P.m112048u(AbstractC21245c.f103555b);
        this.f148706Q.m112048u(AbstractC21245c.f103555b);
        this.f148707R.m112048u(AbstractC21245c.f103555b);
    }

    public void setListener(InterfaceC32242b interfaceC32242b) {
        this.f148710p = interfaceC32242b;
    }
}
