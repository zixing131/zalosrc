package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class DropdownField extends BaseInputField {

    /* renamed from: V */
    private View f86261V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DropdownField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: G */
    private final void m90564G() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        layoutParams.rightMargin = C27276c.m139649b(context, 12);
        imageView.setImageResource(AbstractC2810d.zds_ic_chevron_down_line_24);
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        imageView.setImageTintList(aVar.m13593b(context2, AbstractC2807a.form_ic_trailing_color));
        getRightLayoutInput().addView(imageView, layoutParams);
        this.f86261V = imageView;
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        View view = this.f86261V;
        if (view != null) {
            view.setEnabled(z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        getEditText().setFocusable(false);
        getEditText().setCursorVisible(false);
        m90564G();
    }
}
