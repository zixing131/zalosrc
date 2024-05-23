package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class PasswordField extends BaseInputField {

    /* renamed from: V */
    private ImageView f86337V;

    /* renamed from: W */
    private boolean f86338W;

    /* renamed from: a0 */
    private View f86339a0;

    /* renamed from: b0 */
    private View f86340b0;

    /* renamed from: c0 */
    private View f86341c0;

    /* renamed from: d0 */
    private View f86342d0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PasswordField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: H */
    private final void m90597H() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        layoutParams.rightMargin = C27276c.m139649b(context, 12);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(AbstractC2810d.zds_ic_unhide_line_24);
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        imageView.setImageTintList(aVar.m13593b(context2, AbstractC2807a.form_ic_trailing_color));
        getEditText().setInputType(129);
        getRightLayoutInput().addView(imageView, layoutParams);
        this.f86337V = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zdesign.component.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordField.m90598I(PasswordField.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m90598I(PasswordField passwordField, View view) {
        AbstractC19074t.m100208f(passwordField, "this$0");
        boolean z11 = !passwordField.f86338W;
        passwordField.f86338W = z11;
        if (z11) {
            passwordField.getEditText().setInputType(145);
            ImageView imageView = passwordField.f86337V;
            if (imageView != null) {
                imageView.setImageResource(AbstractC2810d.zds_ic_hide_line_24);
            }
        } else {
            passwordField.getEditText().setInputType(129);
            ImageView imageView2 = passwordField.f86337V;
            if (imageView2 != null) {
                imageView2.setImageResource(AbstractC2810d.zds_ic_unhide_line_24);
            }
        }
        Editable text = passwordField.getEditText().getText();
        if (text != null) {
            passwordField.getEditText().setSelection(text.length());
        }
        passwordField.getEditText().setMinHeight(passwordField.getContext().getResources().getDimensionPixelSize(AbstractC2809c.form_edit_text_min_height));
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        ImageView imageView = this.f86337V;
        if (imageView != null) {
            imageView.setEnabled(z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        View findViewById = findViewById(AbstractC2811e.form_pass_strength);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.form_pass_strength)");
        this.f86339a0 = findViewById;
        View findViewById2 = findViewById(AbstractC2811e.form_pass_strength_1);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.form_pass_strength_1)");
        this.f86340b0 = findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.form_pass_strength_2);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.form_pass_strength_2)");
        this.f86341c0 = findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.form_pass_strength_3);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.form_pass_strength_3)");
        this.f86342d0 = findViewById4;
        m91047v();
        m90597H();
    }
}
