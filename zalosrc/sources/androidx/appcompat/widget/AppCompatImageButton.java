package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p175g0.AbstractC19178a;

/* loaded from: classes2.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: p */
    private final C1161d f4265p;

    /* renamed from: q */
    private final C1173h f4266q;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1161d c1161d = this.f4265p;
        if (c1161d != null) {
            c1161d.m5506b();
        }
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            c1173h.m5554b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1161d c1161d = this.f4265p;
        if (c1161d != null) {
            return c1161d.m5507c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1161d c1161d = this.f4265p;
        if (c1161d != null) {
            return c1161d.m5508d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            return c1173h.m5555c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            return c1173h.m5556d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.f4266q.m5557e() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1161d c1161d = this.f4265p;
        if (c1161d != null) {
            c1161d.m5510f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C1161d c1161d = this.f4265p;
        if (c1161d != null) {
            c1161d.m5511g(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            c1173h.m5554b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            c1173h.m5554b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.f4266q.m5559g(i11);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            c1173h.m5554b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1161d c1161d = this.f4265p;
        if (c1161d != null) {
            c1161d.m5513i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1161d c1161d = this.f4265p;
        if (c1161d != null) {
            c1161d.m5514j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            c1173h.m5560h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1173h c1173h = this.f4266q;
        if (c1173h != null) {
            c1173h.m5561i(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(C1202q1.m5687b(context), attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1161d c1161d = new C1161d(this);
        this.f4265p = c1161d;
        c1161d.m5509e(attributeSet, i11);
        C1173h c1173h = new C1173h(this);
        this.f4266q = c1173h;
        c1173h.m5558f(attributeSet, i11);
    }
}
