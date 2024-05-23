package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import fn0.AbstractC19074t;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class PhoneField extends BaseInputField {

    /* renamed from: V */
    private ImageView f86343V;

    /* renamed from: W */
    private RobotoTextView f86344W;

    /* renamed from: a0 */
    private FrameLayout f86345a0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: H */
    private final void m90600H() {
        LinearLayout leftControlsLayout = getLeftControlsLayout();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        leftControlsLayout.setBackground(C27280g.m139658a(context, AbstractC2810d.bg_form_phonecode_n));
        FrameLayout frameLayout = this.f86345a0;
        if (frameLayout != null) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            frameLayout.setBackground(C27280g.m139658a(context2, AbstractC2810d.bg_form_phonecode_divider_n));
        }
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        Drawable m139660c = C27280g.m139660c(context3, AbstractC2810d.zds_ic_chevron_down_line_16, AbstractC2807a.input_field_country_code_icon);
        ImageView imageView = this.f86343V;
        if (imageView != null) {
            imageView.setImageDrawable(m139660c);
        }
        ImageView imageView2 = this.f86343V;
        if (imageView2 != null) {
            imageView2.setImageTintList(null);
        }
    }

    /* renamed from: I */
    private final void m90601I() {
        LinearLayout leftControlsLayout = getLeftControlsLayout();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        leftControlsLayout.setBackground(C27280g.m139658a(context, AbstractC2810d.bg_form_phonecode));
        FrameLayout frameLayout = this.f86345a0;
        if (frameLayout != null) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            frameLayout.setBackground(C27280g.m139658a(context2, AbstractC2810d.bg_form_phonecode_divider));
        }
        ImageView imageView = this.f86343V;
        if (imageView != null) {
            imageView.setImageResource(AbstractC2810d.zds_ic_chevron_down_line_16);
        }
        ImageView imageView2 = this.f86343V;
        if (imageView2 != null) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            imageView2.setImageTintList(aVar.m13593b(context3, AbstractC2807a.form_ic_phonecode_color));
        }
    }

    /* renamed from: J */
    private final void m90602J() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f86344W = robotoTextView;
        AbstractC19074t.m100205c(robotoTextView);
        robotoTextView.setEnabled(isEnabled());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        RobotoTextView robotoTextView2 = this.f86344W;
        AbstractC19074t.m100205c(robotoTextView2);
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        robotoTextView2.setTextColor(aVar.m13593b(context2, AbstractC2807a.form_text_color));
        RobotoTextView robotoTextView3 = this.f86344W;
        AbstractC19074t.m100205c(robotoTextView3);
        robotoTextView3.setTextAppearance(getContext(), AbstractC2814h.t_large);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        layoutParams.rightMargin = C27276c.m139649b(context3, 4);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        layoutParams.leftMargin = C27276c.m139649b(context4, 12);
        getLeftControlsLayout().addView(this.f86344W, layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.f86343V = imageView;
        AbstractC19074t.m100205c(imageView);
        imageView.setEnabled(isEnabled());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "context");
        layoutParams2.rightMargin = C27276c.m139649b(context5, 12);
        getLeftControlsLayout().addView(this.f86343V, layoutParams2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f86345a0 = frameLayout;
        frameLayout.setEnabled(isEnabled());
        Context context6 = getContext();
        AbstractC19074t.m100207e(context6, "context");
        getLeftControlsLayout().addView(this.f86345a0, new LinearLayout.LayoutParams(C27276c.m139649b(context6, 1), -1));
        getLeftControlsLayout().setEnabled(isEnabled());
        mo76215q();
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.zdesign.component.h0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PhoneField.m90603K(PhoneField.this, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m90603K(PhoneField phoneField, View view, boolean z11) {
        AbstractC19074t.m100208f(phoneField, "this$0");
        phoneField.getLeftControlsLayout().setActivated(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: n */
    public void mo90604n() {
        super.mo90604n();
        m90600H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: p */
    public void mo90605p() {
        super.mo90605p();
        m90600H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: q */
    public void mo76215q() {
        super.mo76215q();
        m90601I();
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        ImageView imageView = this.f86343V;
        if (imageView != null) {
            imageView.setEnabled(z11);
        }
        RobotoTextView robotoTextView = this.f86344W;
        if (robotoTextView != null) {
            robotoTextView.setEnabled(z11);
        }
        FrameLayout frameLayout = this.f86345a0;
        if (frameLayout != null) {
            frameLayout.setEnabled(z11);
        }
        getLeftControlsLayout().setEnabled(z11);
    }

    public final void setPhoneCode(String str) {
        AbstractC19074t.m100208f(str, "code");
        RobotoTextView robotoTextView = this.f86344W;
        if (robotoTextView != null) {
            robotoTextView.setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        getEditText().setInputType(3);
        m91047v();
        m90602J();
    }
}
