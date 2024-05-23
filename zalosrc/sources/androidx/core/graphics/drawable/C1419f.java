package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.f */
/* loaded from: classes2.dex */
public class C1419f extends AbstractC1418e {

    /* renamed from: w */
    private static Method f6224w;

    public C1419f(Drawable drawable) {
        super(drawable);
        m7227g();
    }

    /* renamed from: g */
    private void m7227g() {
        if (f6224w == null) {
            try {
                f6224w = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC1418e
    /* renamed from: c */
    protected boolean mo7226c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f6223u;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f6223u.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f6223u.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f6223u;
        if (drawable != null && (method = f6224w) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f11, float f12) {
        this.f6223u.setHotspot(f11, f12);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        this.f6223u.setHotspotBounds(i11, i12, i13, i14);
    }

    @Override // androidx.core.graphics.drawable.AbstractC1418e, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.AbstractC1418e, android.graphics.drawable.Drawable
    public void setTint(int i11) {
        if (mo7226c()) {
            super.setTint(i11);
        } else {
            this.f6223u.setTint(i11);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC1418e, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (mo7226c()) {
            super.setTintList(colorStateList);
        } else {
            this.f6223u.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC1418e, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo7226c()) {
            super.setTintMode(mode);
        } else {
            this.f6223u.setTintMode(mode);
        }
    }

    public C1419f(C1420g c1420g, Resources resources) {
        super(c1420g, resources);
        m7227g();
    }
}
