package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zdesign.component.inputfield.EnumC17006h;
import fn0.AbstractC19074t;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class SearchField extends BaseInputField {

    /* renamed from: V */
    private View f86354V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchField(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: G */
    private final void m90616G() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        layoutParams.leftMargin = C27276c.m139649b(context, 12);
        imageView.setImageResource(AbstractC2810d.zds_ic_search_line_24);
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        imageView.setImageTintList(aVar.m13593b(context2, AbstractC2807a.form_ic_leading_color));
        getLeftControlsLayout().addView(imageView, layoutParams);
        this.f86354V = imageView;
    }

    /* renamed from: H */
    private final void m90617H(boolean z11) {
        Context context;
        int i11;
        if (z11) {
            context = getContext();
            AbstractC19074t.m100207e(context, "context");
            i11 = 8;
        } else {
            context = getContext();
            AbstractC19074t.m100207e(context, "context");
            i11 = 12;
        }
        int m139649b = C27276c.m139649b(context, i11);
        setBaseFormPaddingLeft(m139649b);
        setBaseFormPaddingRight(m139649b);
        View view = this.f86354V;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = m139649b;
            view.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = getIcClearText().getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = layoutParams3;
        }
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = m139649b;
        getIcClearText().setLayoutParams(layoutParams);
    }

    /* renamed from: I */
    private final void m90618I(boolean z11) {
        int i11;
        int i12;
        if (z11) {
            i11 = AbstractC2809c.form_edit_text_form_small_height;
        } else {
            i11 = AbstractC2809c.form_edit_text_min_height;
        }
        getEditText().setMinHeight(getContext().getResources().getDimensionPixelSize(i11));
        if (z11) {
            i12 = AbstractC2814h.t_normal;
        } else {
            i12 = AbstractC2814h.t_large;
        }
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        new C26708g(getEditText()).m137319a(C26705d.m137293a(context, i12));
        EditText editText = getEditText();
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        editText.setTextColor(aVar.m13593b(context2, AbstractC2807a.form_text_color));
        EditText editText2 = getEditText();
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        editText2.setHintTextColor(aVar.m13593b(context3, AbstractC2807a.input_field_text_primary_inactive));
    }

    /* renamed from: J */
    public final void m90619J(boolean z11) {
        m90618I(z11);
        m90617H(z11);
        invalidate();
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: n */
    public void mo90604n() {
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: p */
    public void mo90605p() {
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        View view = this.f86354V;
        if (view != null) {
            view.setEnabled(z11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        setClearIconMode(EnumC17006h.WhileEditing);
        m91047v();
        m90616G();
    }
}
