package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.AbstractC1579n0;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.progressindicator.AbstractC6378a;
import java.util.Arrays;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p439q6.AbstractC25136a;
import p569v6.C27928a;

/* loaded from: classes3.dex */
public abstract class BaseProgressIndicator<S extends AbstractC6378a> extends ProgressBar {

    /* renamed from: D */
    static final int f35684D = AbstractC23586k.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: A */
    private final Runnable f35685A;

    /* renamed from: B */
    private final InterfaceC2038b.a f35686B;

    /* renamed from: C */
    private final InterfaceC2038b.a f35687C;

    /* renamed from: p */
    AbstractC6378a f35688p;

    /* renamed from: q */
    private int f35689q;

    /* renamed from: r */
    private boolean f35690r;

    /* renamed from: s */
    private boolean f35691s;

    /* renamed from: t */
    private final int f35692t;

    /* renamed from: u */
    private final int f35693u;

    /* renamed from: v */
    private long f35694v;

    /* renamed from: w */
    C27928a f35695w;

    /* renamed from: x */
    private boolean f35696x;

    /* renamed from: y */
    private int f35697y;

    /* renamed from: z */
    private final Runnable f35698z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    /* loaded from: classes3.dex */
    public class RunnableC6374a implements Runnable {
        RunnableC6374a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m32722k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    /* loaded from: classes3.dex */
    public class RunnableC6375b implements Runnable {
        RunnableC6375b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.m32721j();
            BaseProgressIndicator.this.f35694v = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    /* loaded from: classes3.dex */
    public class C6376c extends InterfaceC2038b.a {
        C6376c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.InterfaceC2038b.a
        /* renamed from: b */
        public void mo11042b(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator.this.mo32729p(0, false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.mo32729p(baseProgressIndicator.f35689q, BaseProgressIndicator.this.f35690r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    /* loaded from: classes3.dex */
    public class C6377d extends InterfaceC2038b.a {
        C6377d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.InterfaceC2038b.a
        /* renamed from: b */
        public void mo11042b(Drawable drawable) {
            super.mo11042b(drawable);
            if (!BaseProgressIndicator.this.f35696x) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f35697y);
            }
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, f35684D), attributeSet, i11);
        this.f35694v = -1L;
        this.f35696x = false;
        this.f35697y = 4;
        this.f35698z = new RunnableC6374a();
        this.f35685A = new RunnableC6375b();
        this.f35686B = new C6376c();
        this.f35687C = new C6377d();
        Context context2 = getContext();
        this.f35688p = mo32727i(context2, attributeSet);
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.BaseProgressIndicator, i11, i12, new int[0]);
        this.f35692t = m32639h.getInt(AbstractC23587l.BaseProgressIndicator_showDelay, -1);
        this.f35693u = Math.min(m32639h.getInt(AbstractC23587l.BaseProgressIndicator_minHideDelay, -1), 1000);
        m32639h.recycle();
        this.f35695w = new C27928a();
        this.f35691s = true;
    }

    private AbstractC6383f getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m32810v();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().m32784w();
    }

    /* renamed from: j */
    public void m32721j() {
        ((AbstractC6382e) getCurrentDrawable()).mo32781p(false, false, true);
        if (m32723m()) {
            setVisibility(4);
        }
    }

    /* renamed from: k */
    public void m32722k() {
        if (this.f35693u > 0) {
            this.f35694v = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m32723m() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private void m32724n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m32809u().mo32761d(this.f35686B);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo11040a(this.f35687C);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo11040a(this.f35687C);
        }
    }

    /* renamed from: q */
    private void m32725q() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo32783r(this.f35687C);
            getIndeterminateDrawable().m32809u().mo32764h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo32783r(this.f35687C);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f35688p.f35716f;
    }

    public int[] getIndicatorColor() {
        return this.f35688p.f35713c;
    }

    public int getShowAnimationBehavior() {
        return this.f35688p.f35715e;
    }

    public int getTrackColor() {
        return this.f35688p.f35714d;
    }

    public int getTrackCornerRadius() {
        return this.f35688p.f35712b;
    }

    public int getTrackThickness() {
        return this.f35688p.f35711a;
    }

    /* renamed from: h */
    protected void m32726h(boolean z11) {
        if (!this.f35691s) {
            return;
        }
        ((AbstractC6382e) getCurrentDrawable()).mo32781p(m32730r(), false, z11);
    }

    /* renamed from: i */
    abstract AbstractC6378a mo32727i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: l */
    boolean m32728l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m32724n();
        if (m32730r()) {
            m32722k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f35685A);
        removeCallbacks(this.f35698z);
        ((AbstractC6382e) getCurrentDrawable()).mo32778i();
        m32725q();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i11, int i12) {
        int paddingLeft;
        int paddingTop;
        try {
            super.onMeasure(i11, i12);
            AbstractC6383f currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int mo32746e = currentDrawingDelegate.mo32746e();
            int mo32745d = currentDrawingDelegate.mo32745d();
            if (mo32746e < 0) {
                paddingLeft = getMeasuredWidth();
            } else {
                paddingLeft = mo32746e + getPaddingLeft() + getPaddingRight();
            }
            if (mo32745d < 0) {
                paddingTop = getMeasuredHeight();
            } else {
                paddingTop = mo32745d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(paddingLeft, paddingTop);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        boolean z11;
        super.onVisibilityChanged(view, i11);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m32726h(z11);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        m32726h(false);
    }

    /* renamed from: p */
    public void mo32729p(int i11, boolean z11) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f35689q = i11;
                this.f35690r = z11;
                this.f35696x = true;
                if (getIndeterminateDrawable().isVisible() && this.f35695w.m140783a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().m32809u().mo32762f();
                    return;
                } else {
                    this.f35686B.mo11042b(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i11);
        if (getProgressDrawable() != null && !z11) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    /* renamed from: r */
    public boolean m32730r() {
        if (AbstractC1579n0.m7862d0(this) && getWindowVisibility() == 0 && m32728l()) {
            return true;
        }
        return false;
    }

    public void setAnimatorDurationScaleProvider(C27928a c27928a) {
        this.f35695w = c27928a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f35748r = c27928a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f35748r = c27928a;
        }
    }

    public void setHideAnimationBehavior(int i11) {
        this.f35688p.f35716f = i11;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z11) {
        try {
            if (z11 == isIndeterminate()) {
                return;
            }
            if (m32730r() && z11) {
                throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
            }
            AbstractC6382e abstractC6382e = (AbstractC6382e) getCurrentDrawable();
            if (abstractC6382e != null) {
                abstractC6382e.mo32778i();
            }
            super.setIndeterminate(z11);
            AbstractC6382e abstractC6382e2 = (AbstractC6382e) getCurrentDrawable();
            if (abstractC6382e2 != null) {
                abstractC6382e2.mo32781p(m32730r(), false, false);
            }
            this.f35696x = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof C6385h) {
                ((AbstractC6382e) drawable).mo32778i();
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC25136a.m130292b(getContext(), AbstractC23577b.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f35688p.f35713c = iArr;
            getIndeterminateDrawable().m32809u().mo32760c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i11) {
        if (isIndeterminate()) {
            return;
        }
        mo32729p(i11, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof C6381d) {
                C6381d c6381d = (C6381d) drawable;
                c6381d.mo32778i();
                super.setProgressDrawable(c6381d);
                c6381d.m32777A(getProgress() / getMax());
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i11) {
        this.f35688p.f35715e = i11;
        invalidate();
    }

    public void setTrackColor(int i11) {
        AbstractC6378a abstractC6378a = this.f35688p;
        if (abstractC6378a.f35714d != i11) {
            abstractC6378a.f35714d = i11;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i11) {
        AbstractC6378a abstractC6378a = this.f35688p;
        if (abstractC6378a.f35712b != i11) {
            abstractC6378a.f35712b = Math.min(i11, abstractC6378a.f35711a / 2);
        }
    }

    public void setTrackThickness(int i11) {
        AbstractC6378a abstractC6378a = this.f35688p;
        if (abstractC6378a.f35711a != i11) {
            abstractC6378a.f35711a = i11;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f35697y = i11;
    }

    @Override // android.widget.ProgressBar
    public C6385h getIndeterminateDrawable() {
        return (C6385h) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C6381d getProgressDrawable() {
        return (C6381d) super.getProgressDrawable();
    }
}
