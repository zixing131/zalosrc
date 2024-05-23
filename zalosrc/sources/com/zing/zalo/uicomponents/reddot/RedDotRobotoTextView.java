package com.zing.zalo.uicomponents.reddot;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import rc0.C25729b;
import rc0.InterfaceC25728a;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class RedDotRobotoTextView extends RobotoTextView implements InterfaceC25728a {

    /* renamed from: A */
    C25729b f82952A;

    /* renamed from: B */
    Drawable[] f82953B;

    /* renamed from: C */
    boolean f82954C;

    public RedDotRobotoTextView(Context context) {
        super(context);
        this.f82954C = false;
        m87613i();
    }

    /* renamed from: i */
    void m87613i() {
        C25729b c25729b = new C25729b(this);
        this.f82952A = c25729b;
        c25729b.setRedDotMargin(AbstractC32232i.m155453a(11.0f));
    }

    /* renamed from: j */
    void m87614j() {
        this.f82953B = getCompoundDrawables();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.RobotoTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (this.f82952A != null) {
            if (this.f82954C) {
                Drawable[] drawableArr = this.f82953B;
                if (drawableArr != null && drawableArr.length > 0 && (drawable = drawableArr[0]) != null && drawable.getBounds() != null) {
                    this.f82952A.m132815a(canvas, getPaddingLeft() + this.f82953B[0].getBounds().width() + getCompoundDrawablePadding());
                    return;
                }
                return;
            }
            canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            this.f82952A.m132815a(canvas, canvas.getWidth());
            canvas.restore();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m87614j();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
        m87614j();
    }

    public void setDrawRedDotOnCompoundDrawable(boolean z11) {
        this.f82954C = z11;
    }

    @Override // rc0.InterfaceC25728a
    public void setEnableNoti(boolean z11) {
        this.f82952A.setEnableNoti(z11);
    }

    public void setLeftRedDot(boolean z11) {
        this.f82952A.m132817c(z11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRadiusNoti(int i11) {
        this.f82952A.setRadiusNoti(i11);
    }

    public void setRedDotColor(int i11) {
        this.f82952A.m132818d(i11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRedDotMargin(int i11) {
        this.f82952A.setRedDotMargin(i11);
    }

    public void setRedDotMarginLeft(int i11) {
        this.f82952A.m132819e(i11);
    }

    public void setRedDotMarginTop(int i11) {
        this.f82952A.m132820f(i11);
    }

    public void setRightRedDot(boolean z11) {
        this.f82952A.m132821g(z11);
    }

    public RedDotRobotoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82954C = false;
        m87613i();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        m87614j();
    }

    public RedDotRobotoTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f82954C = false;
        m87613i();
    }
}
