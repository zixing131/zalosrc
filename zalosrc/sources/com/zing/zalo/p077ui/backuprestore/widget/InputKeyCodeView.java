package com.zing.zalo.p077ui.backuprestore.widget;

import ac.C0732w;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.p077ui.backuprestore.widget.InputKeyCodeView;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p006a0.C0012a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sc.C26220b;
import ti0.C26705d;
import vl0.AbstractC28291a;

/* loaded from: classes5.dex */
public final class InputKeyCodeView extends AppCompatEditText implements View.OnTouchListener {
    public static final C11136a Companion = new C11136a(null);

    /* renamed from: A */
    private boolean f56069A;

    /* renamed from: B */
    private int f56070B;

    /* renamed from: C */
    private final int f56071C;

    /* renamed from: D */
    private final int f56072D;

    /* renamed from: E */
    private final float f56073E;

    /* renamed from: F */
    private final float f56074F;

    /* renamed from: G */
    private final float f56075G;

    /* renamed from: H */
    private final InterfaceC24854k f56076H;

    /* renamed from: I */
    private final InterfaceC24854k f56077I;

    /* renamed from: J */
    private final PopupWindow f56078J;

    /* renamed from: K */
    private final Paint f56079K;

    /* renamed from: L */
    private final Paint f56080L;

    /* renamed from: M */
    private final TextPaint f56081M;

    /* renamed from: N */
    private final Handler f56082N;

    /* renamed from: O */
    private final RunnableC11138c f56083O;

    /* renamed from: P */
    private boolean f56084P;

    /* renamed from: Q */
    private Runnable f56085Q;

    /* renamed from: s */
    private final InterfaceC24854k f56086s;

    /* renamed from: t */
    private final float f56087t;

    /* renamed from: u */
    private final float f56088u;

    /* renamed from: v */
    private final float f56089v;

    /* renamed from: w */
    private final float f56090w;

    /* renamed from: x */
    private final float f56091x;

    /* renamed from: y */
    private TextWatcher f56092y;

    /* renamed from: z */
    private String f56093z;

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.InputKeyCodeView$a */
    /* loaded from: classes5.dex */
    public static final class C11136a {
        private C11136a() {
        }

        public /* synthetic */ C11136a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.InputKeyCodeView$b */
    /* loaded from: classes5.dex */
    public static final class C11137b implements TextWatcher {
        public C11137b(InputKeyCodeView inputKeyCodeView) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj;
            if (editable != null && (obj = editable.toString()) != null) {
                InputKeyCodeView.this.m58367M("Character: " + obj);
                InputKeyCodeView.this.f56093z = obj;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            InputKeyCodeView.this.m58367M("Character: " + ((Object) charSequence));
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.InputKeyCodeView$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC11138c implements Runnable {
        RunnableC11138c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InputKeyCodeView.this.f56069A = !r0.f56069A;
            InputKeyCodeView.this.invalidate();
            InputKeyCodeView.this.f56082N.postDelayed(this, 500L);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.InputKeyCodeView$d */
    /* loaded from: classes5.dex */
    static final class C11139d extends AbstractC19075u implements InterfaceC18494a {
        C11139d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            int m104529e;
            StaticLayout staticLayout;
            int m104529e2;
            StaticLayout.Builder obtain;
            StaticLayout.Builder alignment;
            StaticLayout.Builder lineSpacing;
            StaticLayout.Builder includePad;
            float measureText = InputKeyCodeView.this.f56081M.measureText("0");
            if (Build.VERSION.SDK_INT >= 23) {
                TextPaint textPaint = InputKeyCodeView.this.f56081M;
                m104529e2 = AbstractC20104d.m104529e(measureText);
                obtain = StaticLayout.Builder.obtain("0", 0, 1, textPaint, m104529e2);
                alignment = obtain.setAlignment(Layout.Alignment.ALIGN_CENTER);
                lineSpacing = alignment.setLineSpacing(0.0f, 1.0f);
                includePad = lineSpacing.setIncludePad(false);
                staticLayout = includePad.build();
                AbstractC19074t.m100205c(staticLayout);
            } else {
                TextPaint textPaint2 = InputKeyCodeView.this.f56081M;
                m104529e = AbstractC20104d.m104529e(measureText);
                staticLayout = new StaticLayout("0", textPaint2, m104529e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return Float.valueOf(staticLayout.getHeight() * 1.0f);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.InputKeyCodeView$e */
    /* loaded from: classes5.dex */
    static final class C11140e extends AbstractC19075u implements InterfaceC18494a {
        C11140e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(InputKeyCodeView.this.getCharacterHeightMeasure());
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.widget.InputKeyCodeView$f */
    /* loaded from: classes5.dex */
    static final class C11141f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f56098q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11141f(Context context) {
            super(0);
            this.f56098q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Typeface mo12V4() {
            Typeface m76694c;
            C13694n1 m137282i = C26705d.m137293a(this.f56098q, AbstractC8915g0.Passphrase).m137282i();
            if (m137282i == null || (m76694c = C13718q1.m76694c(this.f56098q, m137282i.m76446h())) == null) {
                return Typeface.MONOSPACE;
            }
            return m76694c;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputKeyCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m58356B(InputKeyCodeView inputKeyCodeView, View view) {
        AbstractC19074t.m100208f(inputKeyCodeView, "this$0");
        inputKeyCodeView.m58369O();
    }

    /* renamed from: C */
    private final void m58357C() {
        C11137b c11137b = new C11137b(this);
        addTextChangedListener(c11137b);
        this.f56092y = c11137b;
    }

    /* renamed from: D */
    private final void m58358D() {
        int m104529e;
        m104529e = AbstractC20104d.m104529e(getPaddingTop() + ((this.f56071C - 1) * this.f56089v) + (getCharacterHeightMeasure() * this.f56071C) + getPaddingBottom());
        setHeight(m104529e);
    }

    /* renamed from: E */
    private final void m58359E() {
        m58367M("Long click canceled");
        this.f56084P = false;
        this.f56082N.removeCallbacks(this.f56085Q);
    }

    /* renamed from: F */
    private final float m58360F() {
        int i11 = 64 / this.f56071C;
        float f11 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12++;
            float f12 = this.f56087t;
            float f13 = this.f56088u;
            f11 += f12 + f13;
            if (i12 == this.f56070B) {
                f11 += this.f56090w - f13;
                i12 = 0;
            }
            if (i13 == i11 - 1) {
                f11 -= this.f56090w;
            }
        }
        return (getWidth() - f11) / 2;
    }

    /* renamed from: G */
    private final float m58361G(float f11) {
        return f11 * getContext().getResources().getDisplayMetrics().density;
    }

    /* renamed from: H */
    private final void m58362H(Canvas canvas) {
        if (!this.f56069A) {
            return;
        }
        float paddingTop = (getPaddingTop() * 1.0f) + getCharacterHeightMeasure();
        float m58360F = m58360F();
        float f11 = this.f56087t + m58360F;
        if (this.f56093z.length() == 0) {
            float f12 = m58360F + (this.f56087t / 2);
            float f13 = (paddingTop - this.f56073E) + this.f56074F;
            canvas.drawLine(f12, f13, f12, (f13 - getCursorHeight()) + this.f56075G, this.f56080L);
            return;
        }
        if (this.f56093z.length() + 1 <= 64) {
            int length = this.f56093z.length();
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (i12 % 16 == 0 && i12 != 0) {
                    f11 = this.f56087t + m58360F();
                    paddingTop += this.f56089v + getCharacterHeightMeasure();
                }
                float f14 = this.f56088u;
                float f15 = f11 + f14;
                float f16 = this.f56087t;
                float f17 = f15 + f16;
                i11++;
                if (i11 == 4) {
                    float f18 = f15 + (this.f56090w - f14);
                    m58360F = f18;
                    f11 = f16 + f18;
                    i11 = 0;
                } else {
                    m58360F = f15;
                    f11 = f17;
                }
            }
            if (this.f56093z.length() % 16 == 0) {
                m58360F = m58360F();
                paddingTop += this.f56089v + getCharacterHeightMeasure();
            }
            float f19 = m58360F + (this.f56087t / 2);
            float f21 = (paddingTop - this.f56073E) + this.f56074F;
            canvas.drawLine(f19, f21, f19, (f21 - getCursorHeight()) + this.f56075G, this.f56080L);
        }
    }

    /* renamed from: I */
    private final void m58363I(Canvas canvas) {
        StaticLayout staticLayout;
        int m104529e;
        int m104529e2;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        float paddingTop = (getPaddingTop() * 1.0f) + getCharacterHeightMeasure();
        float m58360F = m58360F();
        float f11 = this.f56087t + m58360F;
        String str = this.f56093z;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < str.length()) {
            int i14 = i12 + 1;
            String valueOf = String.valueOf(str.charAt(i11));
            float measureText = this.f56081M.measureText(valueOf);
            if (Build.VERSION.SDK_INT >= 23) {
                int length = valueOf.length();
                TextPaint textPaint = this.f56081M;
                m104529e2 = AbstractC20104d.m104529e(measureText);
                obtain = StaticLayout.Builder.obtain(valueOf, 0, length, textPaint, m104529e2);
                alignment = obtain.setAlignment(Layout.Alignment.ALIGN_CENTER);
                lineSpacing = alignment.setLineSpacing(0.0f, 1.0f);
                includePad = lineSpacing.setIncludePad(true);
                staticLayout = includePad.build();
                AbstractC19074t.m100205c(staticLayout);
            } else {
                TextPaint textPaint2 = this.f56081M;
                m104529e = AbstractC20104d.m104529e(measureText);
                staticLayout = new StaticLayout(valueOf, textPaint2, m104529e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            if (i12 % 16 == 0 && i12 != 0) {
                m58360F = m58360F();
                f11 = this.f56087t + m58360F;
                paddingTop += this.f56089v + getCharacterHeightMeasure();
            }
            float f12 = 2;
            float f13 = ((f11 - m58360F) / f12) - (measureText / f12);
            float characterHeightMeasure = paddingTop - getCharacterHeightMeasure();
            canvas.save();
            canvas.translate(m58360F + f13, characterHeightMeasure);
            staticLayout.draw(canvas);
            canvas.restore();
            float f14 = this.f56088u;
            float f15 = f11 + f14;
            float f16 = this.f56087t;
            float f17 = f15 + f16;
            i13++;
            if (i13 == 4) {
                float f18 = f15 + (this.f56090w - f14);
                i13 = 0;
                f11 = f16 + f18;
                m58360F = f18;
            } else {
                m58360F = f15;
                f11 = f17;
            }
            i11++;
            i12 = i14;
        }
    }

    /* renamed from: J */
    private final void m58364J(Canvas canvas) {
        int m127163V;
        float paddingTop = (getPaddingTop() * 1.0f) + getCharacterHeightMeasure();
        float m58360F = m58360F();
        float f11 = this.f56087t + m58360F;
        int i11 = 0;
        for (int i12 = 0; i12 < 64; i12++) {
            if (i12 % 16 == 0 && i12 != 0) {
                m58360F = m58360F();
                f11 = this.f56087t + m58360F;
                paddingTop += this.f56089v + getCharacterHeightMeasure();
            }
            float f12 = m58360F;
            m127163V = AbstractC24342w.m127163V(this.f56093z);
            if (i12 > m127163V) {
                float f13 = this.f56074F;
                canvas.drawLine(f12, paddingTop + f13, f11, paddingTop + f13, this.f56079K);
            }
            float f14 = this.f56088u;
            float f15 = f11 + f14;
            float f16 = this.f56087t;
            float f17 = f15 + f16;
            i11++;
            if (i11 == 4) {
                float f18 = f15 + (this.f56090w - f14);
                m58360F = f18;
                f11 = f16 + f18;
                i11 = 0;
            } else {
                m58360F = f15;
                f11 = f17;
            }
        }
    }

    /* renamed from: K */
    private final void m58365K() {
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC1388a.m6969k(getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this, 1);
        }
    }

    /* renamed from: L */
    private final boolean m58366L(View view, int i11, int i12) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        int width = view.getWidth() + i13;
        int height = view.getHeight() + i14;
        if (i13 > i11 || i11 > width || i12 < i14 || i12 > height) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final void m58367M(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m58368N(InputKeyCodeView inputKeyCodeView) {
        AbstractC19074t.m100208f(inputKeyCodeView, "this$0");
        if (inputKeyCodeView.f56084P) {
            C26220b.m134826i("SMLInputKeyCodeView", "performLongClick", null, 4, null);
            inputKeyCodeView.m58371Q();
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_64key_press_pwarea", null, null, null, 14, null);
        }
    }

    /* renamed from: O */
    private final void m58369O() {
        Object systemService = getContext().getSystemService("clipboard");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipData m15b = new C0012a((ClipboardManager) systemService, new SensitiveData("clipboard_paste_passphrase_setup_zcloud", "zcloud", null, 4, null)).m15b();
        if (m15b != null && m15b.getItemCount() > 0) {
            try {
                String obj = m15b.getItemAt(0).getText().toString();
                StringBuilder sb2 = new StringBuilder();
                int length = obj.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = obj.charAt(i11);
                    if (Character.isLetterOrDigit(charAt)) {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                AbstractC19074t.m100207e(sb3, "toString(...)");
                setText(sb3);
                this.f56093z = sb3;
            } catch (Exception e11) {
                setText("");
                this.f56093z = "";
                AbstractC23350e.m122776f("SMLInputKeyCodeView", e11);
            }
        }
        clearFocus();
        this.f56078J.dismiss();
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_restore_64key_paste_key", null, null, null, 14, null);
    }

    /* renamed from: P */
    private final void m58370P() {
        TextWatcher textWatcher = this.f56092y;
        if (textWatcher == null) {
            AbstractC19074t.m100223u("textChangeListener");
            textWatcher = null;
        }
        removeTextChangedListener(textWatcher);
    }

    /* renamed from: Q */
    private final void m58371Q() {
        int m104529e;
        int m104529e2;
        int m104529e3;
        m104529e = AbstractC20104d.m104529e(getX());
        int width = (((m104529e + getWidth()) / 2) - (this.f56078J.getWidth() / 2)) - getPaddingStart();
        PopupWindow popupWindow = this.f56078J;
        m104529e2 = AbstractC20104d.m104529e(getY());
        m104529e3 = AbstractC20104d.m104529e(m58361G(50.0f));
        popupWindow.showAtLocation(this, 0, width, m104529e2 + m104529e3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getCharacterHeightMeasure() {
        return ((Number) this.f56076H.getValue()).floatValue();
    }

    private final float getCursorHeight() {
        return ((Number) this.f56077I.getValue()).floatValue();
    }

    private final Typeface getMonospaceTypeface() {
        Object value = this.f56086s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Typeface) value;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56082N.post(this.f56083O);
        m58357C();
        m58358D();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m58370P();
        this.f56082N.removeCallbacks(this.f56083O);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        m58367M("width: " + getWidth());
        m58364J(canvas);
        m58363I(canvas);
        m58362H(canvas);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        m58367M("On Touch");
        clearFocus();
        int i11 = 64;
        if (this.f56093z.length() <= 64) {
            i11 = this.f56093z.length();
        }
        setSelection(i11);
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            m58367M("On Touch ACTION_CANCEL");
                            m58359E();
                            return true;
                        }
                    } else {
                        m58367M("On Touch ACTION_MOVE");
                        if (!m58366L(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                            m58359E();
                        }
                        return true;
                    }
                } else {
                    m58367M("On Touch ACTION_UP");
                    m58365K();
                    requestFocus();
                    m58359E();
                    return true;
                }
            } else {
                m58367M("On Touch ACTION_DOWN");
                m58365K();
                requestFocus();
                this.f56084P = true;
                this.f56082N.postDelayed(this.f56085Q, ViewConfiguration.getLongPressTimeout());
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setPassCode(String str) {
        AbstractC19074t.m100208f(str, "code");
        setText(str);
        this.f56093z = str;
        invalidate();
    }

    public /* synthetic */ InputKeyCodeView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputKeyCodeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m129210a = AbstractC24856m.m129210a(new C11141f(context));
        this.f56086s = m129210a;
        this.f56087t = m58361G(10.0f);
        this.f56088u = m58361G(4.0f);
        this.f56089v = m58361G(12.0f);
        this.f56090w = m58361G(16.0f);
        float m58361G = m58361G(2.0f);
        this.f56091x = m58361G;
        this.f56093z = "";
        this.f56069A = true;
        this.f56070B = 4;
        this.f56071C = 4;
        this.f56072D = 4;
        this.f56073E = m58361G(4.0f);
        this.f56074F = m58361G(4.0f);
        this.f56075G = m58361G(2.0f);
        m129210a2 = AbstractC24856m.m129210a(new C11139d());
        this.f56076H = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C11140e());
        this.f56077I = m129210a3;
        PopupWindow popupWindow = new PopupWindow(this);
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.layout_popup_input_passphrase, (ViewGroup) null);
        ((RobotoTextView) inflate.findViewById(AbstractC6918a0.tvPaste)).setOnClickListener(new View.OnClickListener() { // from class: d50.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputKeyCodeView.m58356B(InputKeyCodeView.this, view);
            }
        });
        popupWindow.setContentView(inflate);
        popupWindow.setHeight(-2);
        popupWindow.setWidth(-2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        this.f56078J = popupWindow;
        Paint paint = new Paint(1);
        paint.setColor(C23212s8.m119606n(AbstractC28291a.text_secondary));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setStrokeWidth(m58361G);
        paint.setTypeface(getMonospaceTypeface());
        this.f56079K = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(C23212s8.m119606n(AbstractC28291a.text_secondary));
        paint2.setStyle(style);
        paint2.setStrokeWidth(m58361G(1.0f));
        paint2.setTypeface(getMonospaceTypeface());
        this.f56080L = paint2;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(C23212s8.m119606n(AbstractC28291a.text_primary));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setStyle(style);
        textPaint.setTextSize(m58361G(14.0f));
        textPaint.setTypeface(getMonospaceTypeface());
        this.f56081M = textPaint;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(64), new InputFilter.AllCaps()});
        setTextIsSelectable(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setCursorVisible(false);
        setTextSize(-1.0f);
        setOnTouchListener(this);
        setLongClickable(false);
        setTextColor(0);
        setMaxLines(1);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        this.f56082N = new Handler(Looper.getMainLooper());
        this.f56083O = new RunnableC11138c();
        this.f56085Q = new Runnable() { // from class: d50.e
            @Override // java.lang.Runnable
            public final void run() {
                InputKeyCodeView.m58368N(InputKeyCodeView.this);
            }
        };
    }
}
