package sj0;

import android.graphics.Canvas;
import android.graphics.Rect;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import sj0.C26299x;

/* renamed from: sj0.m */
/* loaded from: classes7.dex */
public final class C26288m extends C26280e {

    /* renamed from: S */
    private C26299x f124830S;

    /* renamed from: Q */
    private int f124828Q = 1;

    /* renamed from: R */
    private LinkedHashSet f124829R = new LinkedHashSet();

    /* renamed from: T */
    private a f124831T = new a();

    /* renamed from: sj0.m$a */
    /* loaded from: classes7.dex */
    public static final class a implements C26299x.b {
        a() {
        }

        @Override // sj0.C26299x.b
        /* renamed from: a */
        public void mo135267a(C26299x c26299x) {
            AbstractC19074t.m100208f(c26299x, "layer");
            C26288m.this.invalidateSelf();
        }

        @Override // sj0.C26299x.b
        /* renamed from: b */
        public void mo135268b(C26299x c26299x) {
            AbstractC19074t.m100208f(c26299x, "layer");
            C26288m.this.f124829R.remove(c26299x);
        }
    }

    /* renamed from: v */
    private final void m135263v(Canvas canvas) {
        if (this.f124829R.size() > 0) {
            canvas.save();
            m135229f(canvas);
            Iterator it = this.f124829R.iterator();
            while (it.hasNext()) {
                ((C26299x) it.next()).m135381e(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: w */
    private final void m135264w() {
        C26299x c26299x = this.f124830S;
        if (c26299x != null) {
            c26299x.m135383i(false);
        }
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        int i11 = this.f124828Q;
        if (i11 != 1) {
            if (i11 == 2) {
                m135263v(canvas);
                return;
            }
            return;
        }
        mo135177g(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sj0.C26280e
    /* renamed from: g */
    public void mo135177g(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f124784P) {
            super.mo135177g(canvas);
        }
    }

    @Override // sj0.C26280e
    /* renamed from: o */
    public void mo135235o(int i11) {
        super.mo135235o(i11);
        Iterator it = this.f124829R.iterator();
        while (it.hasNext()) {
            ((C26299x) it.next()).m135386m(this.f124783O);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        AbstractC19074t.m100208f(rect, "bounds");
        super.onBoundsChange(rect);
        Iterator it = this.f124829R.iterator();
        while (it.hasNext()) {
            ((C26299x) it.next()).m135385l(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "stateSet");
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (iArr[i11] == 16842919) {
                    break;
                }
                i11++;
            } else {
                m135264w();
                break;
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        Iterator it = this.f124829R.iterator();
        while (it.hasNext()) {
            ((C26299x) it.next()).m135384k(i11);
        }
    }

    /* renamed from: x */
    public final void m135265x(float f11, float f12) {
        if (this.f124784P && this.f124828Q == 2) {
            C26299x c26299x = new C26299x(this.f124831T);
            c26299x.m135387n(f11, f12);
            c26299x.m135386m(this.f124783O);
            c26299x.m135384k(getAlpha());
            Rect bounds = getBounds();
            AbstractC19074t.m100207e(bounds, "this@ZinstantClickEffectDrawable.bounds");
            c26299x.m135385l(bounds);
            c26299x.m135388r();
            this.f124829R.add(c26299x);
            C26299x c26299x2 = this.f124830S;
            if (c26299x2 != null) {
                c26299x2.m135383i(false);
            }
            this.f124830S = c26299x;
            c26299x.m135383i(true);
        }
    }

    /* renamed from: y */
    public final void m135266y(int i11) {
        this.f124828Q = i11;
    }
}
