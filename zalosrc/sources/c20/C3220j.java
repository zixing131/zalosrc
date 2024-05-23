package c20;

import android.graphics.Rect;
import android.view.View;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;

/* renamed from: c20.j */
/* loaded from: classes5.dex */
public final class C3220j {

    /* renamed from: a */
    private InterfaceC18494a f13749a;

    /* renamed from: b */
    private int f13750b;

    /* renamed from: c */
    private int f13751c;

    /* renamed from: d */
    private int f13752d;

    /* renamed from: e */
    private int f13753e;

    /* renamed from: f */
    private View f13754f;

    /* renamed from: g */
    private float f13755g = 0.5625f;

    /* renamed from: h */
    private Rect f13756h = new Rect();

    /* renamed from: a */
    public final Rect m16328a() {
        return new Rect(this.f13756h);
    }

    /* renamed from: b */
    public final void m16329b(boolean z11, int i11, int i12, int i13, int i14) {
        Rect rect = this.f13756h;
        int i15 = i11 + rect.left;
        int i16 = i12 + rect.top;
        View view = this.f13754f;
        if (view != null) {
            AbstractC26112n.m134383X(view, i16, i15);
        }
    }

    /* renamed from: c */
    public final void m16330c(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        View view = this.f13754f;
        if (view != null) {
            float f11 = size;
            float f12 = size2;
            float f13 = f11 / f12;
            float f14 = this.f13755g;
            if (f13 < f14) {
                AbstractC26112n.m134387a0(view, size, 1073741824, (int) (f11 / f14), 1073741824);
                m16332e(0, (size2 - view.getMeasuredHeight()) / 2, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                AbstractC26112n.m134387a0(view, (int) (f12 * f14), 1073741824, size2, 1073741824);
                m16332e((size - view.getMeasuredWidth()) / 2, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
    }

    /* renamed from: d */
    public final void m16331d(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        View view = this.f13754f;
        if (view != null) {
            float f11 = size;
            float f12 = this.f13755g;
            int i13 = (int) (f11 / f12);
            int i14 = this.f13750b;
            int i15 = this.f13751c;
            int i16 = this.f13752d;
            int i17 = this.f13753e;
            int i18 = (((size2 - i14) - i15) - (i16 * 2)) - i17;
            if (i13 <= i18) {
                AbstractC26112n.m134387a0(view, size, 1073741824, i13, 1073741824);
                m16332e(0, this.f13750b + this.f13751c + this.f13752d, view.getMeasuredWidth(), view.getMeasuredHeight());
                return;
            }
            int i19 = i18 + (i16 * 2);
            if (i13 <= i19) {
                AbstractC26112n.m134387a0(view, size, 1073741824, i13, 1073741824);
                m16332e(0, this.f13750b + this.f13751c, view.getMeasuredWidth(), view.getMeasuredHeight());
                return;
            }
            int i21 = i19 + i14 + i15 + i17;
            if (i13 <= i21) {
                AbstractC26112n.m134387a0(view, (int) (i21 * f12), 1073741824, i21, 1073741824);
                m16332e((size - view.getMeasuredWidth()) / 2, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                AbstractC26112n.m134387a0(view, size, 1073741824, (int) (f11 / f12), 1073741824);
                m16332e(0, (size2 - view.getMeasuredHeight()) / 2, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
    }

    /* renamed from: e */
    public final void m16332e(int i11, int i12, int i13, int i14) {
        Rect rect = this.f13756h;
        if (rect.left != i11 || rect.top != i12 || rect.width() != i13 || this.f13756h.height() != i14) {
            this.f13756h = new Rect(i11, i12, i13 + i11, i14 + i12);
            InterfaceC18494a interfaceC18494a = this.f13749a;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    /* renamed from: f */
    public final void m16333f(int i11) {
        this.f13753e = i11;
    }

    /* renamed from: g */
    public final void m16334g(int i11) {
        this.f13752d = i11;
    }

    /* renamed from: h */
    public final void m16335h(int i11) {
        this.f13751c = i11;
    }

    /* renamed from: i */
    public final void m16336i(InterfaceC18494a interfaceC18494a) {
        this.f13749a = interfaceC18494a;
    }

    /* renamed from: j */
    public final void m16337j(float f11) {
        this.f13755g = f11;
    }

    /* renamed from: k */
    public final void m16338k(int i11) {
        this.f13750b = i11;
    }

    /* renamed from: l */
    public final void m16339l(View view) {
        AbstractC19074t.m100208f(view, "view");
        this.f13754f = view;
    }
}
