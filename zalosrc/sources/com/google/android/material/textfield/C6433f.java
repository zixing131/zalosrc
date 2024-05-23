package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.AbstractC1640l;
import java.util.ArrayList;
import java.util.List;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23581f;
import p382o6.AbstractC24041a;
import p382o6.AbstractC24042b;
import p599w6.AbstractC28774c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes3.dex */
public final class C6433f {

    /* renamed from: a */
    private final Context f36128a;

    /* renamed from: b */
    private final TextInputLayout f36129b;

    /* renamed from: c */
    private LinearLayout f36130c;

    /* renamed from: d */
    private int f36131d;

    /* renamed from: e */
    private FrameLayout f36132e;

    /* renamed from: f */
    private Animator f36133f;

    /* renamed from: g */
    private final float f36134g;

    /* renamed from: h */
    private int f36135h;

    /* renamed from: i */
    private int f36136i;

    /* renamed from: j */
    private CharSequence f36137j;

    /* renamed from: k */
    private boolean f36138k;

    /* renamed from: l */
    private TextView f36139l;

    /* renamed from: m */
    private CharSequence f36140m;

    /* renamed from: n */
    private int f36141n;

    /* renamed from: o */
    private ColorStateList f36142o;

    /* renamed from: p */
    private CharSequence f36143p;

    /* renamed from: q */
    private boolean f36144q;

    /* renamed from: r */
    private TextView f36145r;

    /* renamed from: s */
    private int f36146s;

    /* renamed from: t */
    private ColorStateList f36147t;

    /* renamed from: u */
    private Typeface f36148u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.f$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ int f36149p;

        /* renamed from: q */
        final /* synthetic */ TextView f36150q;

        /* renamed from: r */
        final /* synthetic */ int f36151r;

        /* renamed from: s */
        final /* synthetic */ TextView f36152s;

        a(int i11, TextView textView, int i12, TextView textView2) {
            this.f36149p = i11;
            this.f36150q = textView;
            this.f36151r = i12;
            this.f36152s = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6433f.this.f36135h = this.f36149p;
            C6433f.this.f36133f = null;
            TextView textView = this.f36150q;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f36151r == 1 && C6433f.this.f36139l != null) {
                    C6433f.this.f36139l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f36152s;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f36152s.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f36152s;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C6433f(TextInputLayout textInputLayout) {
        this.f36128a = textInputLayout.getContext();
        this.f36129b = textInputLayout;
        this.f36134g = r0.getResources().getDimensionPixelSize(AbstractC23579d.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    private void m33191A(int i11, int i12) {
        TextView m33203l;
        TextView m33203l2;
        if (i11 == i12) {
            return;
        }
        if (i12 != 0 && (m33203l2 = m33203l(i12)) != null) {
            m33203l2.setVisibility(0);
            m33203l2.setAlpha(1.0f);
        }
        if (i11 != 0 && (m33203l = m33203l(i11)) != null) {
            m33203l.setVisibility(4);
            if (i11 == 1) {
                m33203l.setText((CharSequence) null);
            }
        }
        this.f36135h = i12;
    }

    /* renamed from: I */
    private void m33192I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: K */
    private void m33193K(ViewGroup viewGroup, int i11) {
        if (i11 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    private boolean m33194L(TextView textView, CharSequence charSequence) {
        if (AbstractC1579n0.m7865e0(this.f36129b) && this.f36129b.isEnabled() && (this.f36136i != this.f36135h || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private void m33195O(int i11, int i12, boolean z11) {
        if (i11 == i12) {
            return;
        }
        if (z11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f36133f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m33200h(arrayList, this.f36144q, this.f36145r, 2, i11, i12);
            m33200h(arrayList, this.f36138k, this.f36139l, 1, i11, i12);
            AbstractC24042b.m125913a(animatorSet, arrayList);
            animatorSet.addListener(new a(i12, m33203l(i11), i11, m33203l(i12)));
            animatorSet.start();
        } else {
            m33191A(i11, i12);
        }
        this.f36129b.m33132u0();
        this.f36129b.m33133x0(z11);
        this.f36129b.m33118H0();
    }

    /* renamed from: f */
    private boolean m33199f() {
        if (this.f36130c != null && this.f36129b.getEditText() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m33200h(List list, boolean z11, TextView textView, int i11, int i12, int i13) {
        boolean z12;
        if (textView != null && z11) {
            if (i11 == i13 || i11 == i12) {
                if (i13 == i11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                list.add(m33201i(textView, z12));
                if (i13 == i11) {
                    list.add(m33202j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m33201i(TextView textView, boolean z11) {
        float f11;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f11);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(AbstractC24041a.f116358a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m33202j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f36134g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(AbstractC24041a.f116361d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m33203l(int i11) {
        if (i11 == 1) {
            return this.f36139l;
        }
        if (i11 != 2) {
            return null;
        }
        return this.f36145r;
    }

    /* renamed from: s */
    private int m33204s(boolean z11, int i11, int i12) {
        if (z11) {
            return this.f36128a.getResources().getDimensionPixelSize(i11);
        }
        return i12;
    }

    /* renamed from: v */
    private boolean m33205v(int i11) {
        if (i11 == 1 && this.f36139l != null && !TextUtils.isEmpty(this.f36137j)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m33206B(CharSequence charSequence) {
        this.f36140m = charSequence;
        TextView textView = this.f36139l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m33207C(boolean z11) {
        if (this.f36138k == z11) {
            return;
        }
        m33218g();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f36128a);
            this.f36139l = appCompatTextView;
            appCompatTextView.setId(AbstractC23581f.textinput_error);
            this.f36139l.setTextAlignment(5);
            Typeface typeface = this.f36148u;
            if (typeface != null) {
                this.f36139l.setTypeface(typeface);
            }
            m33208D(this.f36141n);
            m33209E(this.f36142o);
            m33206B(this.f36140m);
            this.f36139l.setVisibility(4);
            AbstractC1579n0.m7803B0(this.f36139l, 1);
            m33216d(this.f36139l, 0);
        } else {
            m33226t();
            m33231z(this.f36139l, 0);
            this.f36139l = null;
            this.f36129b.m33132u0();
            this.f36129b.m33118H0();
        }
        this.f36138k = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m33208D(int i11) {
        this.f36141n = i11;
        TextView textView = this.f36139l;
        if (textView != null) {
            this.f36129b.m33129g0(textView, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m33209E(ColorStateList colorStateList) {
        this.f36142o = colorStateList;
        TextView textView = this.f36139l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m33210F(int i11) {
        this.f36146s = i11;
        TextView textView = this.f36145r;
        if (textView != null) {
            AbstractC1640l.m8424o(textView, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m33211G(boolean z11) {
        if (this.f36144q == z11) {
            return;
        }
        m33218g();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f36128a);
            this.f36145r = appCompatTextView;
            appCompatTextView.setId(AbstractC23581f.textinput_helper_text);
            this.f36145r.setTextAlignment(5);
            Typeface typeface = this.f36148u;
            if (typeface != null) {
                this.f36145r.setTypeface(typeface);
            }
            this.f36145r.setVisibility(4);
            AbstractC1579n0.m7803B0(this.f36145r, 1);
            m33210F(this.f36146s);
            m33212H(this.f36147t);
            m33216d(this.f36145r, 1);
        } else {
            m33227u();
            m33231z(this.f36145r, 1);
            this.f36145r = null;
            this.f36129b.m33132u0();
            this.f36129b.m33118H0();
        }
        this.f36144q = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m33212H(ColorStateList colorStateList) {
        this.f36147t = colorStateList;
        TextView textView = this.f36145r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m33213J(Typeface typeface) {
        if (typeface != this.f36148u) {
            this.f36148u = typeface;
            m33192I(this.f36139l, typeface);
            m33192I(this.f36145r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m33214M(CharSequence charSequence) {
        m33218g();
        this.f36137j = charSequence;
        this.f36139l.setText(charSequence);
        int i11 = this.f36135h;
        if (i11 != 1) {
            this.f36136i = 1;
        }
        m33195O(i11, this.f36136i, m33194L(this.f36139l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m33215N(CharSequence charSequence) {
        m33218g();
        this.f36143p = charSequence;
        this.f36145r.setText(charSequence);
        int i11 = this.f36135h;
        if (i11 != 2) {
            this.f36136i = 2;
        }
        m33195O(i11, this.f36136i, m33194L(this.f36145r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m33216d(TextView textView, int i11) {
        if (this.f36130c == null && this.f36132e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f36128a);
            this.f36130c = linearLayout;
            linearLayout.setOrientation(0);
            this.f36129b.addView(this.f36130c, -1, -2);
            this.f36132e = new FrameLayout(this.f36128a);
            this.f36130c.addView(this.f36132e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f36129b.getEditText() != null) {
                m33217e();
            }
        }
        if (m33228w(i11)) {
            this.f36132e.setVisibility(0);
            this.f36132e.addView(textView);
        } else {
            this.f36130c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f36130c.setVisibility(0);
        this.f36131d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m33217e() {
        if (m33199f()) {
            EditText editText = this.f36129b.getEditText();
            boolean m143979g = AbstractC28774c.m143979g(this.f36128a);
            AbstractC1579n0.m7837S0(this.f36130c, m33204s(m143979g, AbstractC23579d.material_helper_text_font_1_3_padding_horizontal, AbstractC1579n0.m7820K(editText)), m33204s(m143979g, AbstractC23579d.material_helper_text_font_1_3_padding_top, this.f36128a.getResources().getDimensionPixelSize(AbstractC23579d.material_helper_text_default_padding_top)), m33204s(m143979g, AbstractC23579d.material_helper_text_font_1_3_padding_horizontal, AbstractC1579n0.m7818J(editText)), 0);
        }
    }

    /* renamed from: g */
    void m33218g() {
        Animator animator = this.f36133f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m33219k() {
        return m33205v(this.f36136i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence m33220m() {
        return this.f36140m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence m33221n() {
        return this.f36137j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m33222o() {
        TextView textView = this.f36139l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public ColorStateList m33223p() {
        TextView textView = this.f36139l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence m33224q() {
        return this.f36143p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m33225r() {
        TextView textView = this.f36145r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m33226t() {
        this.f36137j = null;
        m33218g();
        if (this.f36135h == 1) {
            if (this.f36144q && !TextUtils.isEmpty(this.f36143p)) {
                this.f36136i = 2;
            } else {
                this.f36136i = 0;
            }
        }
        m33195O(this.f36135h, this.f36136i, m33194L(this.f36139l, null));
    }

    /* renamed from: u */
    void m33227u() {
        m33218g();
        int i11 = this.f36135h;
        if (i11 == 2) {
            this.f36136i = 0;
        }
        m33195O(i11, this.f36136i, m33194L(this.f36145r, null));
    }

    /* renamed from: w */
    boolean m33228w(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m33229x() {
        return this.f36138k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m33230y() {
        return this.f36144q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m33231z(TextView textView, int i11) {
        FrameLayout frameLayout;
        if (this.f36130c == null) {
            return;
        }
        if (m33228w(i11) && (frameLayout = this.f36132e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f36130c.removeView(textView);
        }
        int i12 = this.f36131d - 1;
        this.f36131d = i12;
        m33193K(this.f36130c, i12);
    }
}
