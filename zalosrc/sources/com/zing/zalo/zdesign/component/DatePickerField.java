package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import fn0.AbstractC19074t;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class DatePickerField extends BaseInputField {

    /* renamed from: V */
    private View f86258V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatePickerField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: G */
    private final void m90560G() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        layoutParams.rightMargin = C27276c.m139649b(context, 12);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        Drawable m139658a = C27280g.m139658a(context2, AbstractC2810d.zds_ic_calendar_line_24);
        if (m139658a != null) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            m139658a.setTintList(aVar.m13593b(context3, AbstractC2807a.form_ic_trailing_color));
        }
        imageView.setImageDrawable(m139658a);
        getRightLayoutInput().addView(imageView, layoutParams);
        EditText editText = getEditText();
        int paddingLeft = getEditText().getPaddingLeft();
        int paddingTop = getEditText().getPaddingTop();
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        editText.setPadding(paddingLeft, paddingTop, C27276c.m139649b(context4, 48), getEditText().getPaddingBottom());
        this.f86258V = imageView;
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        View view = this.f86258V;
        if (view != null) {
            view.setEnabled(z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        getEditText().setFocusable(false);
        getEditText().setCursorVisible(false);
        m90560G();
    }
}
