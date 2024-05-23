package com.zing.zalo.p077ui.imgdecor.caption.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.Editable;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p110dt.AbstractC18066a;
import p298kf.C21700a;

/* loaded from: classes5.dex */
public final class AutoSizeEditText extends AppCompatEditText {

    /* renamed from: A */
    private int f63127A;

    /* renamed from: B */
    private int f63128B;

    /* renamed from: C */
    private boolean f63129C;

    /* renamed from: D */
    private boolean f63130D;

    /* renamed from: E */
    private boolean f63131E;

    /* renamed from: F */
    private int f63132F;

    /* renamed from: s */
    private final Paint f63133s;

    /* renamed from: t */
    private Path f63134t;

    /* renamed from: u */
    private LinearGradient f63135u;

    /* renamed from: v */
    private int f63136v;

    /* renamed from: w */
    private int f63137w;

    /* renamed from: x */
    private int f63138x;

    /* renamed from: y */
    private int f63139y;

    /* renamed from: z */
    private float f63140z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoSizeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: h */
    private final void m67489h() {
        Layout layout = getLayout();
        if (layout != null) {
            this.f63134t = AbstractC18066a.m96061g(layout, getPaddingLeft(), getPaddingTop());
        }
    }

    /* renamed from: j */
    private final void m67490j() {
        Editable text = getText();
        if (text != null) {
            Object[] spans = text.getSpans(0, text.length(), ParcelableSpan.class);
            AbstractC19074t.m100207e(spans, "getSpans(...)");
            for (ParcelableSpan parcelableSpan : (ParcelableSpan[]) spans) {
                text.removeSpan(parcelableSpan);
            }
        }
    }

    /* renamed from: k */
    private final void m67491k() {
        Editable text = getText();
        if (text != null) {
            m67490j();
            text.setSpan(new RelativeSizeSpan(this.f63140z), 0, length(), 18);
            requestLayout();
            m67492v();
        }
    }

    /* renamed from: v */
    private final void m67492v() {
        Layout layout = getLayout();
        if (layout == null) {
            this.f63129C = false;
            return;
        }
        int lineCount = layout.getLineCount();
        int i11 = 0;
        for (int i12 = 0; i12 < lineCount; i12++) {
            i11 += layout.getLineBottom(i12) - layout.getLineTop(i12);
        }
        int paddingBottom = i11 + getPaddingBottom() + getPaddingTop();
        int i13 = -2;
        if (AbstractC23136l9.m118722k0() > AbstractC23136l9.m118713h0()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams.bottomMargin = this.f63132F + AbstractC23222t7.f112572m;
            setLayoutParams(layoutParams);
            setScaleX(1.0f);
            setScaleY(1.0f);
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                if (paddingBottom > this.f63138x) {
                    if (paddingBottom > AbstractC23136l9.m118713h0()) {
                        i13 = paddingBottom;
                    }
                    layoutParams2.height = i13;
                    float f11 = paddingBottom;
                    setScaleX((this.f63138x * 1.0f) / f11);
                    setScaleY((this.f63138x * 1.0f) / f11);
                    requestLayout();
                } else {
                    layoutParams2.height = -2;
                    setScaleX(1.0f);
                    setScaleY(1.0f);
                }
                setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.f63129C = true;
    }

    public final int getBottomHeight() {
        return this.f63137w;
    }

    public final int getEndColor() {
        return this.f63128B;
    }

    public final LinearGradient getLinearGradient() {
        return this.f63135u;
    }

    public final float getScaleSize() {
        return this.f63140z;
    }

    public final int getStartColor() {
        return this.f63127A;
    }

    public final int getTopHeight() {
        return this.f63136v;
    }

    /* renamed from: i */
    public final boolean m67493i() {
        return this.f63130D;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!this.f63129C) {
            m67492v();
            m67489h();
        }
        int lineCount = getLayout().getLineCount();
        if (this.f63139y != lineCount && this.f63127A != 0 && this.f63128B != 0) {
            this.f63135u = null;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f63127A, this.f63128B, Shader.TileMode.CLAMP);
            this.f63135u = linearGradient;
            this.f63133s.setShader(linearGradient);
            this.f63139y = lineCount;
        }
        canvas.drawPath(this.f63134t, this.f63133s);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(charSequence, "text");
        super.onTextChanged(charSequence, i11, i12, i13);
        if (i13 == 0 && i12 == 0) {
            return;
        }
        this.f63134t.reset();
        m67490j();
        m67491k();
        m67492v();
        m67489h();
    }

    /* renamed from: r */
    public final void m67494r(int i11, int i12) {
        int i13;
        this.f63127A = i11;
        this.f63128B = i12;
        Paint paint = this.f63133s;
        if (this.f63130D) {
            i13 = 127;
        } else {
            i13 = 255;
        }
        paint.setAlpha(i13);
        this.f63139y = 0;
        m67489h();
        invalidate();
    }

    /* renamed from: s */
    public final void m67495s(C21700a c21700a, int i11) {
        AbstractC19074t.m100208f(c21700a, "textFontItem");
        setTypeface(c21700a.m111995f());
        this.f63130D = c21700a.m111996g();
        setLineSpacing(c21700a.m111993d() - i11, 1.0f);
        this.f63129C = false;
        m67489h();
    }

    public final void setBackgroundLineColor(int i11) {
        int i12;
        this.f63133s.setShader(null);
        this.f63127A = 0;
        this.f63128B = 0;
        this.f63133s.setColor(i11);
        if (i11 != 0) {
            Paint paint = this.f63133s;
            if (this.f63130D) {
                i12 = 127;
            } else {
                i12 = 255;
            }
            paint.setAlpha(i12);
        }
        m67489h();
        invalidate();
    }

    public final void setBottomHeight(int i11) {
        this.f63137w = i11;
    }

    public final void setEndColor(int i11) {
        this.f63128B = i11;
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        super.setGravity(i11);
        m67489h();
    }

    public final void setKeyboardHeight(int i11) {
        this.f63132F = i11;
        if (AbstractC23136l9.m118722k0() < AbstractC23136l9.m118713h0()) {
            int m118713h0 = AbstractC23136l9.m118713h0() - i11;
            int i12 = this.f63136v;
            int i13 = this.f63137w;
            this.f63138x = (m118713h0 - i12) - i13;
            setTranslationY((((-i11) / 2.0f) + (i12 / 2.0f)) - (i13 / 2.0f));
        } else if (getTranslationY() != 0.0f) {
            setTranslationY(0.0f);
        }
        m67492v();
        m67489h();
    }

    public final void setLightMode(boolean z11) {
        this.f63130D = z11;
    }

    public final void setLinearGradient(LinearGradient linearGradient) {
        this.f63135u = linearGradient;
    }

    public final void setMemeMode(boolean z11) {
        this.f63131E = z11;
    }

    public final void setScaleSize(float f11) {
        this.f63140z = f11;
        m67491k();
        m67489h();
    }

    public final void setStartColor(int i11) {
        this.f63127A = i11;
    }

    public final void setTopHeight(int i11) {
        this.f63136v = i11;
    }

    public /* synthetic */ AutoSizeEditText(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSizeEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setStrokeWidth(5.0f);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f63133s = paint;
        this.f63134t = new Path();
        this.f63140z = 1.0f;
        this.f63129C = true;
        this.f63138x = AbstractC23136l9.m118713h0();
    }
}
