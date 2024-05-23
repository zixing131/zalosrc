package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes2.dex */
public abstract class AbstractC1418e extends Drawable implements Drawable.Callback, InterfaceC1417d, InterfaceC1416c {

    /* renamed from: v */
    static final PorterDuff.Mode f6217v = PorterDuff.Mode.SRC_IN;

    /* renamed from: p */
    private int f6218p;

    /* renamed from: q */
    private PorterDuff.Mode f6219q;

    /* renamed from: r */
    private boolean f6220r;

    /* renamed from: s */
    C1420g f6221s;

    /* renamed from: t */
    private boolean f6222t;

    /* renamed from: u */
    Drawable f6223u;

    public AbstractC1418e(C1420g c1420g, Resources resources) {
        this.f6221s = c1420g;
        m7224e(resources);
    }

    /* renamed from: d */
    private C1420g m7223d() {
        return new C1420g(this.f6221s);
    }

    /* renamed from: e */
    private void m7224e(Resources resources) {
        Drawable.ConstantState constantState;
        C1420g c1420g = this.f6221s;
        if (c1420g != null && (constantState = c1420g.f6226b) != null) {
            mo7222b(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m7225f(int[] iArr) {
        if (!mo7226c()) {
            return false;
        }
        C1420g c1420g = this.f6221s;
        ColorStateList colorStateList = c1420g.f6227c;
        PorterDuff.Mode mode = c1420g.f6228d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f6220r || colorForState != this.f6218p || mode != this.f6219q) {
                setColorFilter(colorForState, mode);
                this.f6218p = colorForState;
                this.f6219q = mode;
                this.f6220r = true;
                return true;
            }
        } else {
            this.f6220r = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC1417d
    /* renamed from: a */
    public final Drawable mo7221a() {
        return this.f6223u;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC1417d
    /* renamed from: b */
    public final void mo7222b(Drawable drawable) {
        Drawable drawable2 = this.f6223u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6223u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1420g c1420g = this.f6221s;
            if (c1420g != null) {
                c1420g.f6226b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    protected abstract boolean mo7226c();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6223u.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i11;
        int changingConfigurations = super.getChangingConfigurations();
        C1420g c1420g = this.f6221s;
        if (c1420g != null) {
            i11 = c1420g.getChangingConfigurations();
        } else {
            i11 = 0;
        }
        return changingConfigurations | i11 | this.f6223u.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C1420g c1420g = this.f6221s;
        if (c1420g != null && c1420g.m7228a()) {
            this.f6221s.f6225a = getChangingConfigurations();
            return this.f6221s;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f6223u.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6223u.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6223u.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return AbstractC1414a.m7188f(this.f6223u);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f6223u.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f6223u.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f6223u.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f6223u.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f6223u.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f6223u.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return AbstractC1414a.m7190h(this.f6223u);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        C1420g c1420g;
        if (mo7226c() && (c1420g = this.f6221s) != null) {
            colorStateList = c1420g.f6227c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f6223u.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f6223u.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f6222t && super.mutate() == this) {
            this.f6221s = m7223d();
            Drawable drawable = this.f6223u;
            if (drawable != null) {
                drawable.mutate();
            }
            C1420g c1420g = this.f6221s;
            if (c1420g != null) {
                Drawable drawable2 = this.f6223u;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                c1420g.f6226b = constantState;
            }
            this.f6222t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6223u;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        return AbstractC1414a.m7195m(this.f6223u, i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        return this.f6223u.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f6223u.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        AbstractC1414a.m7192j(this.f6223u, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i11) {
        this.f6223u.setChangingConfigurations(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6223u.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z11) {
        this.f6223u.setDither(z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f6223u.setFilterBitmap(z11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f6223u.setState(iArr);
        if (!m7225f(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6221s.f6227c = colorStateList;
        m7225f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f6221s.f6228d = mode;
        m7225f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        if (!super.setVisible(z11, z12) && !this.f6223u.setVisible(z11, z12)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public AbstractC1418e(Drawable drawable) {
        this.f6221s = m7223d();
        mo7222b(drawable);
    }
}
