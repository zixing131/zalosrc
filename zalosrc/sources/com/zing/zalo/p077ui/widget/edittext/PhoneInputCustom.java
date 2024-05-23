package com.zing.zalo.p077ui.widget.edittext;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zdesign.component.PhoneField;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public final class PhoneInputCustom extends PhoneField {

    /* renamed from: b0 */
    private View f70256b0;

    /* renamed from: c0 */
    private View f70257c0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneInputCustom(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m76214M(PhoneInputCustom phoneInputCustom, View view, boolean z11) {
        AbstractC19074t.m100208f(phoneInputCustom, "this$0");
        phoneInputCustom.getLeftControlsLayout().setActivated(z11);
        View view2 = phoneInputCustom.f70256b0;
        if (view2 != null) {
            view2.setSelected(z11);
        }
    }

    public final View getBgInput() {
        return this.f70256b0;
    }

    public final View getBtnNext() {
        return this.f70257c0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setPhoneCode("+84");
        View view = new View(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC23136l9.m118742r(49.0f));
        layoutParams.bottomMargin = AbstractC23136l9.m118742r(15.0f);
        view.setLayoutParams(layoutParams);
        view.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.bg_phone_input_normal));
        View childAt = getChildAt(0);
        AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) childAt).addView(view);
        this.f70256b0 = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.PhoneField, com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: q */
    public void mo76215q() {
        super.mo76215q();
        getEditText().setBackground(null);
        View view = this.f70256b0;
        if (view != null) {
            view.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.bg_phone_input_normal));
        }
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: r */
    public void mo76216r() {
        boolean z11;
        super.mo76216r();
        View view = this.f70257c0;
        if (view != null) {
            Editable text = getEditText().getText();
            if (text != null && text.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            view.setEnabled(!z11);
        }
    }

    public final void setBgInput(View view) {
        this.f70256b0 = view;
    }

    public final void setBtnNext(View view) {
        this.f70257c0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneInputCustom(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        getEditText().setPadding(0, AbstractC23136l9.m118742r(10.0f), 0, AbstractC23136l9.m118742r(26.0f));
        ViewGroup.LayoutParams layoutParams = getEditText().getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = AbstractC23136l9.m118742r(64.0f);
        getEditText().setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = getLeftControlsLayout().getLayoutParams();
        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomMargin = AbstractC23136l9.m118742r(16.0f);
        getLeftControlsLayout().setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = getRightControlsLayout().getLayoutParams();
        AbstractC19074t.m100206d(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.bottomMargin = AbstractC23136l9.m118742r(16.0f);
        getRightControlsLayout().setLayoutParams(layoutParams6);
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.widget.edittext.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PhoneInputCustom.m76214M(PhoneInputCustom.this, view, z11);
            }
        });
    }
}
