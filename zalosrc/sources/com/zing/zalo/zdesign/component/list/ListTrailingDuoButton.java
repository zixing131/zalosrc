package com.zing.zalo.zdesign.component.list;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.EnumC17039q;
import com.zing.zalo.zdesign.component.list.ListTrailingDuoButton;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class ListTrailingDuoButton extends LinearLayout {

    /* renamed from: p */
    private ButtonWithProgress f87038p;

    /* renamed from: q */
    private ButtonWithProgress f87039q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListTrailingDuoButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m91091c(ListTrailingDuoButton listTrailingDuoButton, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(listTrailingDuoButton, "this$0");
        listTrailingDuoButton.m91094f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m91092d(ListTrailingDuoButton listTrailingDuoButton, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(listTrailingDuoButton, "this$0");
        listTrailingDuoButton.m91094f();
    }

    /* renamed from: e */
    private final boolean m91093e(int i11) {
        if (i11 != EnumC17039q.BUTTON_TYPE_TERTIARY.m91223c() && i11 != EnumC17039q.BUTTON_TYPE_TERTIARY_DANGER.m91223c() && i11 != EnumC17039q.BUTTON_TYPE_TERTIARY_NEUTRAL.m91223c() && i11 != EnumC17039q.BUTTON_TYPE_TERTIARY_ALPHA.m91223c() && i11 != EnumC17039q.BUTTON_TYPE_TERTIARY_ALPHA_NEUTRAL.m91223c()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final void m91094f() {
        if (m91093e(this.f87038p.getButton().getBtnType()) && m91093e(this.f87039q.getButton().getBtnType())) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            int m139649b = C27276c.m139649b(context, 8);
            if (this.f87038p.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = this.f87038p.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                if (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin != m139649b) {
                    ViewGroup.LayoutParams layoutParams2 = this.f87038p.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, m139649b, 0);
                    this.f87038p.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        int m139649b2 = C27276c.m139649b(context2, 16);
        if (this.f87038p.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams3 = this.f87038p.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            if (((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin != m139649b2) {
                ViewGroup.LayoutParams layoutParams4 = this.f87038p.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams4).setMargins(0, 0, m139649b2, 0);
                this.f87038p.requestLayout();
            }
        }
    }

    public final ButtonWithProgress getButtonLeft() {
        return this.f87038p;
    }

    public final ButtonWithProgress getButtonRight() {
        return this.f87039q;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
    }

    public final void setButtonLeft(ButtonWithProgress buttonWithProgress) {
        AbstractC19074t.m100208f(buttonWithProgress, "<set-?>");
        this.f87038p = buttonWithProgress;
    }

    public final void setButtonRight(ButtonWithProgress buttonWithProgress) {
        AbstractC19074t.m100208f(buttonWithProgress, "<set-?>");
        this.f87039q = buttonWithProgress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListTrailingDuoButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        LayoutInflater.from(context).inflate(AbstractC2812f.item_list_trailing_duo_button, this);
        View findViewById = findViewById(AbstractC2811e.btn_trailing_left);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.btn_trailing_left)");
        this.f87038p = (ButtonWithProgress) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.btn_trailing_right);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.btn_trailing_right)");
        this.f87039q = (ButtonWithProgress) findViewById2;
        this.f87038p.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hi0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                ListTrailingDuoButton.m91091c(ListTrailingDuoButton.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
        this.f87038p.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hi0.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                ListTrailingDuoButton.m91092d(ListTrailingDuoButton.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }
}
