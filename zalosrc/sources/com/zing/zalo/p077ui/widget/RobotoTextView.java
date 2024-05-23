package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public class RobotoTextView extends AppCompatTextView implements InterfaceC13722r1 {
    public static final C13521a Companion = new C13521a(null);

    /* renamed from: t */
    private int f69566t;

    /* renamed from: u */
    private String f69567u;

    /* renamed from: v */
    private boolean f69568v;

    /* renamed from: w */
    private float f69569w;

    /* renamed from: x */
    private float f69570x;

    /* renamed from: y */
    private int f69571y;

    /* renamed from: z */
    private int f69572z;

    /* renamed from: com.zing.zalo.ui.widget.RobotoTextView$a */
    /* loaded from: classes.dex */
    public static final class C13521a {
        private C13521a() {
        }

        public /* synthetic */ C13521a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoTextView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f69566t = EnumC13569b3.NONE.m76022e();
        this.f69569w = Float.MAX_VALUE;
        this.f69570x = Float.MIN_VALUE;
        this.f69572z = C13778s1.m76961b().length;
        m75861f(context, null, 0);
        m75862h(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    /* renamed from: f */
    private final void m75861f(Context context, AttributeSet attributeSet, int i11) {
        if (isInEditMode()) {
            return;
        }
        C13699o1 c13699o1 = C13699o1.f70798a;
        C13694n1 m76488c = c13699o1.m76488c(context, attributeSet, i11, 0);
        int m76446h = m76488c.m76446h();
        this.f69566t = m76488c.m76445g();
        this.f69567u = m76488c.m76440b();
        this.f69568v = m76488c.m76439a();
        this.f69569w = m76488c.m76442d();
        this.f69570x = m76488c.m76444f();
        this.f69572z = m76488c.m76441c();
        this.f69571y = m76488c.m76443e();
        c13699o1.m76487b(this, this.f69567u, Integer.valueOf(m76446h));
    }

    /* renamed from: h */
    private final void m75862h(int i11, float f11) {
        if (C13778s1.m76966g() && !this.f69568v) {
            super.setTextSize(i11, f11 * C13778s1.m76964e(this.f69566t, Math.min(Math.max(C13778s1.m76965f(), this.f69571y), this.f69572z)));
            float textSize = getTextSize();
            float f12 = this.f69569w;
            if (textSize > f12) {
                super.setTextSize(0, f12);
            }
            float textSize2 = getTextSize();
            float f13 = this.f69570x;
            if (textSize2 < f13) {
                super.setTextSize(0, f13);
                return;
            }
            return;
        }
        super.setTextSize(i11, f11);
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    /* renamed from: g */
    public void mo75850g(boolean z11) {
        this.f69568v = z11;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "drawable");
        super.invalidateDrawable(drawable);
        if (getVisibility() == 0) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        int saveCount = canvas.getSaveCount();
        try {
            super.onDraw(canvas);
        } catch (Exception e11) {
            e11.printStackTrace();
            if (canvas.getSaveCount() != saveCount) {
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public final void setFontStyle(int i11) {
        if (isInEditMode()) {
            return;
        }
        if (C13778s1.m76960a()) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            super.setTypeface(C13718q1.m76694c(context, i11));
        } else {
            if (i11 != 6) {
                if (i11 != 7 && i11 != 9) {
                    super.setTypeface(Typeface.DEFAULT);
                    return;
                } else {
                    super.setTypeface(Typeface.DEFAULT, 1);
                    return;
                }
            }
            super.setTypeface(Typeface.DEFAULT, 2);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextRatioIndex(int i11) {
        this.f69572z = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMaxScaledTextSize(float f11) {
        this.f69569w = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextRatioIndex(int i11) {
        this.f69571y = i11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setMinScaledTextSize(float f11) {
        this.f69570x = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13722r1
    public void setTextClass(int i11) {
        this.f69566t = i11;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i11, float f11) {
        m75862h(i11, f11);
    }

    public final void setTextStyleBold(boolean z11) {
        Typeface typeface;
        if (z11) {
            if (C13778s1.m76960a()) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                typeface = C13718q1.m76694c(context, 7);
            } else {
                typeface = Typeface.DEFAULT_BOLD;
            }
        } else {
            typeface = Typeface.DEFAULT;
        }
        setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (isInEditMode()) {
            return;
        }
        if (!C13778s1.m76960a()) {
            super.setTypeface(typeface);
            return;
        }
        if (AbstractC19074t.m100204b(Typeface.DEFAULT, typeface)) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            super.setTypeface(C13718q1.m76694c(context, 5));
        } else {
            if (AbstractC19074t.m100204b(Typeface.DEFAULT_BOLD, typeface)) {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                super.setTypeface(C13718q1.m76694c(context2, 9));
                return;
            }
            super.setTypeface(typeface);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f69566t = EnumC13569b3.NONE.m76022e();
        this.f69569w = Float.MAX_VALUE;
        this.f69570x = Float.MIN_VALUE;
        this.f69572z = C13778s1.m76961b().length;
        m75861f(context, attributeSet, 0);
        m75862h(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f69566t = EnumC13569b3.NONE.m76022e();
        this.f69569w = Float.MAX_VALUE;
        this.f69570x = Float.MIN_VALUE;
        this.f69572z = C13778s1.m76961b().length;
        m75861f(context, attributeSet, i11);
        m75862h(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        if (isInEditMode()) {
            return;
        }
        if (!C13778s1.m76960a()) {
            super.setTypeface(typeface, i11);
            return;
        }
        if (i11 == 1) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            super.setTypeface(C13718q1.m76694c(context, 9));
        } else if (i11 != 2) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            super.setTypeface(C13718q1.m76694c(context2, 5));
        } else {
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            super.setTypeface(C13718q1.m76694c(context3, 6));
        }
    }
}
