package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: p */
    Drawable f35461p;

    /* renamed from: q */
    Rect f35462q;

    /* renamed from: r */
    private Rect f35463r;

    /* renamed from: s */
    private boolean f35464s;

    /* renamed from: t */
    private boolean f35465t;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    /* loaded from: classes3.dex */
    class C6333a implements InterfaceC1551g0 {
        C6333a() {
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            boolean z11;
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f35462q == null) {
                scrimInsetsFrameLayout.f35462q = new Rect();
            }
            ScrimInsetsFrameLayout.this.f35462q.set(c1580n1.m8059k(), c1580n1.m8061m(), c1580n1.m8060l(), c1580n1.m8058j());
            ScrimInsetsFrameLayout.this.mo32469a(c1580n1);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            if (c1580n1.m8062n() && ScrimInsetsFrameLayout.this.f35461p != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z11);
            AbstractC1579n0.m7898r0(ScrimInsetsFrameLayout.this);
            return c1580n1.m8051c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    protected void mo32469a(C1580n1 c1580n1) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f35462q != null && this.f35461p != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.f35464s) {
                this.f35463r.set(0, 0, width, this.f35462q.top);
                this.f35461p.setBounds(this.f35463r);
                this.f35461p.draw(canvas);
            }
            if (this.f35465t) {
                this.f35463r.set(0, height - this.f35462q.bottom, width, height);
                this.f35461p.setBounds(this.f35463r);
                this.f35461p.draw(canvas);
            }
            Rect rect = this.f35463r;
            Rect rect2 = this.f35462q;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f35461p.setBounds(this.f35463r);
            this.f35461p.draw(canvas);
            Rect rect3 = this.f35463r;
            Rect rect4 = this.f35462q;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f35461p.setBounds(this.f35463r);
            this.f35461p.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f35461p;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f35461p;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z11) {
        this.f35465t = z11;
    }

    public void setDrawTopInsetForeground(boolean z11) {
        this.f35464s = z11;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f35461p = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f35463r = new Rect();
        this.f35464s = true;
        this.f35465t = true;
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.ScrimInsetsFrameLayout, i11, AbstractC23586k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f35461p = m32639h.getDrawable(AbstractC23587l.ScrimInsetsFrameLayout_insetForeground);
        m32639h.recycle();
        setWillNotDraw(true);
        AbstractC1579n0.m7833Q0(this, new C6333a());
    }
}
