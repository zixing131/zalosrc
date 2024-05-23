package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import p175g0.AbstractC19187j;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C1161d {

    /* renamed from: a */
    private final View f4615a;

    /* renamed from: d */
    private C1205r1 f4618d;

    /* renamed from: e */
    private C1205r1 f4619e;

    /* renamed from: f */
    private C1205r1 f4620f;

    /* renamed from: c */
    private int f4617c = -1;

    /* renamed from: b */
    private final C1167f f4616b = C1167f.m5528b();

    public C1161d(View view) {
        this.f4615a = view;
    }

    /* renamed from: a */
    private boolean m5504a(Drawable drawable) {
        if (this.f4620f == null) {
            this.f4620f = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4620f;
        c1205r1.m5689a();
        ColorStateList m7907w = AbstractC1579n0.m7907w(this.f4615a);
        if (m7907w != null) {
            c1205r1.f4718d = true;
            c1205r1.f4715a = m7907w;
        }
        PorterDuff.Mode m7909x = AbstractC1579n0.m7909x(this.f4615a);
        if (m7909x != null) {
            c1205r1.f4717c = true;
            c1205r1.f4716b = m7909x;
        }
        if (!c1205r1.f4718d && !c1205r1.f4717c) {
            return false;
        }
        C1167f.m5531i(drawable, c1205r1, this.f4615a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m5505k() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 > 21 ? this.f4618d != null : i11 == 21;
    }

    /* renamed from: b */
    public void m5506b() {
        Drawable background = this.f4615a.getBackground();
        if (background != null) {
            if (m5505k() && m5504a(background)) {
                return;
            }
            C1205r1 c1205r1 = this.f4619e;
            if (c1205r1 != null) {
                C1167f.m5531i(background, c1205r1, this.f4615a.getDrawableState());
                return;
            }
            C1205r1 c1205r12 = this.f4618d;
            if (c1205r12 != null) {
                C1167f.m5531i(background, c1205r12, this.f4615a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m5507c() {
        C1205r1 c1205r1 = this.f4619e;
        if (c1205r1 != null) {
            return c1205r1.f4715a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m5508d() {
        C1205r1 c1205r1 = this.f4619e;
        if (c1205r1 != null) {
            return c1205r1.f4716b;
        }
        return null;
    }

    /* renamed from: e */
    public void m5509e(AttributeSet attributeSet, int i11) {
        C1211t1 m5716v = C1211t1.m5716v(this.f4615a.getContext(), attributeSet, AbstractC19187j.ViewBackgroundHelper, i11, 0);
        View view = this.f4615a;
        AbstractC1579n0.m7912y0(view, view.getContext(), AbstractC19187j.ViewBackgroundHelper, attributeSet, m5716v.m5734r(), i11, 0);
        try {
            if (m5716v.m5735s(AbstractC19187j.ViewBackgroundHelper_android_background)) {
                this.f4617c = m5716v.m5730n(AbstractC19187j.ViewBackgroundHelper_android_background, -1);
                ColorStateList m5534f = this.f4616b.m5534f(this.f4615a.getContext(), this.f4617c);
                if (m5534f != null) {
                    m5512h(m5534f);
                }
            }
            if (m5716v.m5735s(AbstractC19187j.ViewBackgroundHelper_backgroundTint)) {
                AbstractC1579n0.m7809E0(this.f4615a, m5716v.m5719c(AbstractC19187j.ViewBackgroundHelper_backgroundTint));
            }
            if (m5716v.m5735s(AbstractC19187j.ViewBackgroundHelper_backgroundTintMode)) {
                AbstractC1579n0.m7811F0(this.f4615a, AbstractC1225y0.m5773e(m5716v.m5727k(AbstractC19187j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            m5716v.m5736w();
        } catch (Throwable th2) {
            m5716v.m5736w();
            throw th2;
        }
    }

    /* renamed from: f */
    public void m5510f(Drawable drawable) {
        this.f4617c = -1;
        m5512h(null);
        m5506b();
    }

    /* renamed from: g */
    public void m5511g(int i11) {
        ColorStateList colorStateList;
        this.f4617c = i11;
        C1167f c1167f = this.f4616b;
        if (c1167f != null) {
            colorStateList = c1167f.m5534f(this.f4615a.getContext(), i11);
        } else {
            colorStateList = null;
        }
        m5512h(colorStateList);
        m5506b();
    }

    /* renamed from: h */
    void m5512h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f4618d == null) {
                this.f4618d = new C1205r1();
            }
            C1205r1 c1205r1 = this.f4618d;
            c1205r1.f4715a = colorStateList;
            c1205r1.f4718d = true;
        } else {
            this.f4618d = null;
        }
        m5506b();
    }

    /* renamed from: i */
    public void m5513i(ColorStateList colorStateList) {
        if (this.f4619e == null) {
            this.f4619e = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4619e;
        c1205r1.f4715a = colorStateList;
        c1205r1.f4718d = true;
        m5506b();
    }

    /* renamed from: j */
    public void m5514j(PorterDuff.Mode mode) {
        if (this.f4619e == null) {
            this.f4619e = new C1205r1();
        }
        C1205r1 c1205r1 = this.f4619e;
        c1205r1.f4716b = mode;
        c1205r1.f4717c = true;
        m5506b();
    }
}
