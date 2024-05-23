package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23580e;
import p357n6.AbstractC23585j;
import p382o6.AbstractC24041a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes3.dex */
public class C6428a extends AbstractC6432e {

    /* renamed from: d */
    private final TextWatcher f36076d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f36077e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC6426f f36078f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC6427g f36079g;

    /* renamed from: h */
    private AnimatorSet f36080h;

    /* renamed from: i */
    private ValueAnimator f36081i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes3.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            if (C6428a.this.f36125a.getSuffixText() != null) {
                return;
            }
            C6428a c6428a = C6428a.this;
            if (c6428a.f36125a.hasFocus() && C6428a.m33146l(editable)) {
                z11 = true;
            } else {
                z11 = false;
            }
            c6428a.m33143i(z11);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes3.dex */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            boolean z12 = true;
            boolean z13 = !TextUtils.isEmpty(((EditText) view).getText());
            C6428a c6428a = C6428a.this;
            if (!z13 || !z11) {
                z12 = false;
            }
            c6428a.m33143i(z12);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes3.dex */
    class c implements TextInputLayout.InterfaceC6426f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC6426f
        /* renamed from: a */
        public void mo33137a(TextInputLayout textInputLayout) {
            boolean z11;
            EditText editText = textInputLayout.getEditText();
            if (editText.hasFocus() && C6428a.m33146l(editText.getText())) {
                z11 = true;
            } else {
                z11 = false;
            }
            textInputLayout.setEndIconVisible(z11);
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C6428a.this.f36077e);
            editText.removeTextChangedListener(C6428a.this.f36076d);
            editText.addTextChangedListener(C6428a.this.f36076d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes3.dex */
    class d implements TextInputLayout.InterfaceC6427g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ EditText f36086p;

            a(EditText editText) {
                this.f36086p = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f36086p.removeTextChangedListener(C6428a.this.f36076d);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC6427g
        /* renamed from: a */
        public void mo33138a(TextInputLayout textInputLayout, int i11) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i11 == 2) {
                editText.post(new a(editText));
                if (editText.getOnFocusChangeListener() == C6428a.this.f36077e) {
                    editText.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C6428a.this.f36125a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C6428a.this.f36125a.m33124X();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C6428a.this.f36125a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes3.dex */
    public class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6428a.this.f36125a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$h */
    /* loaded from: classes3.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C6428a.this.f36127c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$i */
    /* loaded from: classes3.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C6428a.this.f36127c.setScaleX(floatValue);
            C6428a.this.f36127c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6428a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f36076d = new a();
        this.f36077e = new b();
        this.f36078f = new c();
        this.f36079g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m33143i(boolean z11) {
        boolean z12;
        if (this.f36125a.m33119M() == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && !this.f36080h.isRunning()) {
            this.f36081i.cancel();
            this.f36080h.start();
            if (z12) {
                this.f36080h.end();
                return;
            }
            return;
        }
        if (!z11) {
            this.f36080h.cancel();
            this.f36081i.start();
            if (z12) {
                this.f36081i.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m33144j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AbstractC24041a.f116358a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m33145k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(AbstractC24041a.f116361d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m33146l(Editable editable) {
        if (editable.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m33147m() {
        ValueAnimator m33145k = m33145k();
        ValueAnimator m33144j = m33144j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f36080h = animatorSet;
        animatorSet.playTogether(m33145k, m33144j);
        this.f36080h.addListener(new f());
        ValueAnimator m33144j2 = m33144j(1.0f, 0.0f);
        this.f36081i = m33144j2;
        m33144j2.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC6432e
    /* renamed from: a */
    public void mo33148a() {
        this.f36125a.setEndIconDrawable(AbstractC19694b.m103336d(this.f36126b, AbstractC23580e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f36125a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(AbstractC23585j.clear_text_end_icon_content_description));
        this.f36125a.setEndIconOnClickListener(new e());
        this.f36125a.m33127e(this.f36078f);
        this.f36125a.m33128f(this.f36079g);
        m33147m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC6432e
    /* renamed from: c */
    public void mo33149c(boolean z11) {
        if (this.f36125a.getSuffixText() == null) {
            return;
        }
        m33143i(z11);
    }
}
