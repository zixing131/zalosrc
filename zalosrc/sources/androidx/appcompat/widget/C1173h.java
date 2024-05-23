package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.AbstractC1635g;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public class C1173h {

    /* renamed from: a */
    private final ImageView f4636a;

    /* renamed from: b */
    private C1205r1 f4637b;

    /* renamed from: c */
    private C1205r1 f4638c;

    /* renamed from: d */
    private C1205r1 f4639d;

    public C1173h(ImageView imageView) {
        this.f4636a = imageView;
    }

    /* renamed from: a */
    private boolean m5552a(Drawable drawable) {
        if (this.f4639d == null) {
            this.f4639d = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4639d;
        c1205r1.m5689a();
        ColorStateList m8389a = AbstractC1635g.m8389a(this.f4636a);
        if (m8389a != null) {
            c1205r1.f4718d = true;
            c1205r1.f4715a = m8389a;
        }
        PorterDuff.Mode m8390b = AbstractC1635g.m8390b(this.f4636a);
        if (m8390b != null) {
            c1205r1.f4717c = true;
            c1205r1.f4716b = m8390b;
        }
        if (!c1205r1.f4718d && !c1205r1.f4717c) {
            return false;
        }
        C1167f.m5531i(drawable, c1205r1, this.f4636a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m5553j() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 > 21 ? this.f4637b != null : i11 == 21;
    }

    /* renamed from: b */
    public void m5554b() {
        Drawable drawable = this.f4636a.getDrawable();
        if (drawable != null) {
            AbstractC1225y0.m5770b(drawable);
        }
        if (drawable != null) {
            if (m5553j() && m5552a(drawable)) {
                return;
            }
            C1205r1 c1205r1 = this.f4638c;
            if (c1205r1 != null) {
                C1167f.m5531i(drawable, c1205r1, this.f4636a.getDrawableState());
                return;
            }
            C1205r1 c1205r12 = this.f4637b;
            if (c1205r12 != null) {
                C1167f.m5531i(drawable, c1205r12, this.f4636a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m5555c() {
        C1205r1 c1205r1 = this.f4638c;
        if (c1205r1 != null) {
            return c1205r1.f4715a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m5556d() {
        C1205r1 c1205r1 = this.f4638c;
        if (c1205r1 != null) {
            return c1205r1.f4716b;
        }
        return null;
    }

    /* renamed from: e */
    public boolean m5557e() {
        if (this.f4636a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void m5558f(AttributeSet attributeSet, int i11) {
        int m5730n;
        C1211t1 m5716v = C1211t1.m5716v(this.f4636a.getContext(), attributeSet, AbstractC19187j.AppCompatImageView, i11, 0);
        ImageView imageView = this.f4636a;
        AbstractC1579n0.m7912y0(imageView, imageView.getContext(), AbstractC19187j.AppCompatImageView, attributeSet, m5716v.m5734r(), i11, 0);
        try {
            Drawable drawable = this.f4636a.getDrawable();
            if (drawable == null && (m5730n = m5716v.m5730n(AbstractC19187j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = AbstractC19694b.m103336d(this.f4636a.getContext(), m5730n)) != null) {
                this.f4636a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1225y0.m5770b(drawable);
            }
            if (m5716v.m5735s(AbstractC19187j.AppCompatImageView_tint)) {
                AbstractC1635g.m8391c(this.f4636a, m5716v.m5719c(AbstractC19187j.AppCompatImageView_tint));
            }
            if (m5716v.m5735s(AbstractC19187j.AppCompatImageView_tintMode)) {
                AbstractC1635g.m8392d(this.f4636a, AbstractC1225y0.m5773e(m5716v.m5727k(AbstractC19187j.AppCompatImageView_tintMode, -1), null));
            }
            m5716v.m5736w();
        } catch (Throwable th2) {
            m5716v.m5736w();
            throw th2;
        }
    }

    /* renamed from: g */
    public void m5559g(int i11) {
        if (i11 != 0) {
            Drawable m103336d = AbstractC19694b.m103336d(this.f4636a.getContext(), i11);
            if (m103336d != null) {
                AbstractC1225y0.m5770b(m103336d);
            }
            this.f4636a.setImageDrawable(m103336d);
        } else {
            this.f4636a.setImageDrawable(null);
        }
        m5554b();
    }

    /* renamed from: h */
    public void m5560h(ColorStateList colorStateList) {
        if (this.f4638c == null) {
            this.f4638c = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4638c;
        c1205r1.f4715a = colorStateList;
        c1205r1.f4718d = true;
        m5554b();
    }

    /* renamed from: i */
    public void m5561i(PorterDuff.Mode mode) {
        if (this.f4638c == null) {
            this.f4638c = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4638c;
        c1205r1.f4716b = mode;
        c1205r1.f4717c = true;
        m5554b();
    }
}
