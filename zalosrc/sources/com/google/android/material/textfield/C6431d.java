package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import com.google.android.material.internal.AbstractC6354u;
import com.google.android.material.textfield.TextInputLayout;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23580e;
import p357n6.AbstractC23585j;
import p382o6.AbstractC24041a;
import p439q6.AbstractC25136a;
import p706z6.C31689h;
import p706z6.C31694m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes3.dex */
public class C6431d extends AbstractC6432e {

    /* renamed from: q */
    private static final boolean f36096q = true;

    /* renamed from: d */
    private final TextWatcher f36097d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f36098e;

    /* renamed from: f */
    private final TextInputLayout.C6425e f36099f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC6426f f36100g;

    /* renamed from: h */
    private final TextInputLayout.InterfaceC6427g f36101h;

    /* renamed from: i */
    private boolean f36102i;

    /* renamed from: j */
    private boolean f36103j;

    /* renamed from: k */
    private long f36104k;

    /* renamed from: l */
    private StateListDrawable f36105l;

    /* renamed from: m */
    private C31689h f36106m;

    /* renamed from: n */
    private AccessibilityManager f36107n;

    /* renamed from: o */
    private ValueAnimator f36108o;

    /* renamed from: p */
    private ValueAnimator f36109p;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC6354u {

        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC32695a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ AutoCompleteTextView f36111p;

            RunnableC32695a(AutoCompleteTextView autoCompleteTextView) {
                this.f36111p = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f36111p.isPopupShowing();
                C6431d.this.m33163E(isPopupShowing);
                C6431d.this.f36102i = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.AbstractC6354u, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView m33187y = C6431d.m33187y(C6431d.this.f36125a.getEditText());
            if (C6431d.this.f36107n.isTouchExplorationEnabled() && C6431d.m33162D(m33187y) && !C6431d.this.f36127c.hasFocus()) {
                m33187y.dismissDropDown();
            }
            m33187y.post(new RunnableC32695a(m33187y));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$b */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6431d.this.f36127c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* loaded from: classes3.dex */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            C6431d.this.f36125a.setEndIconActivated(z11);
            if (!z11) {
                C6431d.this.m33163E(false);
                C6431d.this.f36102i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes3.dex */
    class d extends TextInputLayout.C6425e {
        d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C6425e, androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            if (!C6431d.m33162D(C6431d.this.f36125a.getEditText())) {
                c1507g0.m7619d0(Spinner.class.getName());
            }
            if (c1507g0.m7604N()) {
                c1507g0.m7634n0(null);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: h */
        public void mo7511h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo7511h(view, accessibilityEvent);
            AutoCompleteTextView m33187y = C6431d.m33187y(C6431d.this.f36125a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C6431d.this.f36107n.isTouchExplorationEnabled() && !C6431d.m33162D(C6431d.this.f36125a.getEditText())) {
                C6431d.this.m33166H(m33187y);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* loaded from: classes3.dex */
    class e implements TextInputLayout.InterfaceC6426f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC6426f
        /* renamed from: a */
        public void mo33137a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m33187y = C6431d.m33187y(textInputLayout.getEditText());
            C6431d.this.m33164F(m33187y);
            C6431d.this.m33184v(m33187y);
            C6431d.this.m33165G(m33187y);
            m33187y.setThreshold(0);
            m33187y.removeTextChangedListener(C6431d.this.f36097d);
            m33187y.addTextChangedListener(C6431d.this.f36097d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C6431d.m33162D(m33187y)) {
                AbstractC1579n0.m7823L0(C6431d.this.f36127c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C6431d.this.f36099f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* loaded from: classes3.dex */
    class f implements TextInputLayout.InterfaceC6427g {

        /* renamed from: com.google.android.material.textfield.d$f$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ AutoCompleteTextView f36118p;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f36118p = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f36118p.removeTextChangedListener(C6431d.this.f36097d);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC6427g
        /* renamed from: a */
        public void mo33138a(TextInputLayout textInputLayout, int i11) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i11 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C6431d.this.f36098e) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (C6431d.f36096q) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6431d.this.m33166H((AutoCompleteTextView) C6431d.this.f36125a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$h */
    /* loaded from: classes3.dex */
    public class h implements View.OnTouchListener {

        /* renamed from: p */
        final /* synthetic */ AutoCompleteTextView f36121p;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f36121p = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C6431d.this.m33161C()) {
                    C6431d.this.f36102i = false;
                }
                C6431d.this.m33166H(this.f36121p);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$i */
    /* loaded from: classes3.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C6431d.this.f36102i = true;
            C6431d.this.f36104k = System.currentTimeMillis();
            C6431d.this.m33163E(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$j */
    /* loaded from: classes3.dex */
    public class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6431d c6431d = C6431d.this;
            c6431d.f36127c.setChecked(c6431d.f36103j);
            C6431d.this.f36109p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6431d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f36097d = new a();
        this.f36098e = new c();
        this.f36099f = new d(this.f36125a);
        this.f36100g = new e();
        this.f36101h = new f();
        this.f36102i = false;
        this.f36103j = false;
        this.f36104k = Long.MAX_VALUE;
    }

    /* renamed from: A */
    private C31689h m33159A(float f11, float f12, float f13, int i11) {
        C31694m m152519m = C31694m.m152471a().m152513E(f11).m152517I(f11).m152527v(f12).m152531z(f12).m152519m();
        C31689h m152413m = C31689h.m152413m(this.f36126b, f13);
        m152413m.setShapeAppearanceModel(m152519m);
        m152413m.m152444e0(0, i11, 0, i11);
        return m152413m;
    }

    /* renamed from: B */
    private void m33160B() {
        this.f36109p = m33188z(67, 0.0f, 1.0f);
        ValueAnimator m33188z = m33188z(50, 1.0f, 0.0f);
        this.f36108o = m33188z;
        m33188z.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public boolean m33161C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f36104k;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m33162D(EditText editText) {
        if (editText.getKeyListener() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m33163E(boolean z11) {
        if (this.f36103j != z11) {
            this.f36103j = z11;
            this.f36109p.cancel();
            this.f36108o.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m33164F(AutoCompleteTextView autoCompleteTextView) {
        if (f36096q) {
            int boxBackgroundMode = this.f36125a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f36106m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f36105l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m33165G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f36098e);
        if (f36096q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m33166H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m33161C()) {
            this.f36102i = false;
        }
        if (!this.f36102i) {
            if (f36096q) {
                m33163E(!this.f36103j);
            } else {
                this.f36103j = !this.f36103j;
                this.f36127c.toggle();
            }
            if (this.f36103j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.f36102i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m33184v(AutoCompleteTextView autoCompleteTextView) {
        if (m33162D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f36125a.getBoxBackgroundMode();
        C31689h boxBackground = this.f36125a.getBoxBackground();
        int m130294d = AbstractC25136a.m130294d(autoCompleteTextView, AbstractC23577b.colorControlHighlight);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            m33186x(autoCompleteTextView, m130294d, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m33185w(autoCompleteTextView, m130294d, iArr, boxBackground);
        }
    }

    /* renamed from: w */
    private void m33185w(AutoCompleteTextView autoCompleteTextView, int i11, int[][] iArr, C31689h c31689h) {
        int boxBackgroundColor = this.f36125a.getBoxBackgroundColor();
        int[] iArr2 = {AbstractC25136a.m130297g(i11, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f36096q) {
            AbstractC1579n0.m7807D0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c31689h, c31689h));
            return;
        }
        C31689h c31689h2 = new C31689h(c31689h.m152427F());
        c31689h2.m152442c0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c31689h, c31689h2});
        int m7820K = AbstractC1579n0.m7820K(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m7818J = AbstractC1579n0.m7818J(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        AbstractC1579n0.m7807D0(autoCompleteTextView, layerDrawable);
        AbstractC1579n0.m7837S0(autoCompleteTextView, m7820K, paddingTop, m7818J, paddingBottom);
    }

    /* renamed from: x */
    private void m33186x(AutoCompleteTextView autoCompleteTextView, int i11, int[][] iArr, C31689h c31689h) {
        LayerDrawable layerDrawable;
        int m130294d = AbstractC25136a.m130294d(autoCompleteTextView, AbstractC23577b.colorSurface);
        C31689h c31689h2 = new C31689h(c31689h.m152427F());
        int m130297g = AbstractC25136a.m130297g(i11, m130294d, 0.1f);
        c31689h2.m152442c0(new ColorStateList(iArr, new int[]{m130297g, 0}));
        if (f36096q) {
            c31689h2.setTint(m130294d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m130297g, m130294d});
            C31689h c31689h3 = new C31689h(c31689h.m152427F());
            c31689h3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c31689h2, c31689h3), c31689h});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c31689h2, c31689h});
        }
        AbstractC1579n0.m7807D0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static AutoCompleteTextView m33187y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m33188z(int i11, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AbstractC24041a.f116358a);
        ofFloat.setDuration(i11);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC6432e
    /* renamed from: a */
    public void mo33148a() {
        int i11;
        float dimensionPixelOffset = this.f36126b.getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f36126b.getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f36126b.getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C31689h m33159A = m33159A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C31689h m33159A2 = m33159A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f36106m = m33159A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f36105l = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, m33159A);
        this.f36105l.addState(new int[0], m33159A2);
        if (f36096q) {
            i11 = AbstractC23580e.mtrl_dropdown_arrow;
        } else {
            i11 = AbstractC23580e.mtrl_ic_arrow_drop_down;
        }
        this.f36125a.setEndIconDrawable(AbstractC19694b.m103336d(this.f36126b, i11));
        TextInputLayout textInputLayout = this.f36125a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(AbstractC23585j.exposed_dropdown_menu_content_description));
        this.f36125a.setEndIconOnClickListener(new g());
        this.f36125a.m33127e(this.f36100g);
        this.f36125a.m33128f(this.f36101h);
        m33160B();
        this.f36107n = (AccessibilityManager) this.f36126b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC6432e
    /* renamed from: b */
    public boolean mo33189b(int i11) {
        return i11 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC6432e
    /* renamed from: d */
    public boolean mo33190d() {
        return true;
    }
}
