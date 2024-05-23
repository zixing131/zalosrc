package ni0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.Collections;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;

/* renamed from: ni0.b */
/* loaded from: classes7.dex */
public final class C23797b {

    /* renamed from: a */
    private float f115008a;

    /* renamed from: b */
    private float f115009b;

    /* renamed from: c */
    private float f115010c;

    /* renamed from: d */
    private RectF f115011d;

    /* renamed from: e */
    private int f115012e;

    /* renamed from: f */
    private boolean f115013f = true;

    /* renamed from: g */
    private Drawable f115014g;

    /* renamed from: h */
    private int f115015h;

    /* renamed from: i */
    private final InterfaceC24854k f115016i;

    /* renamed from: j */
    private final InterfaceC24854k f115017j;

    /* renamed from: k */
    private int f115018k;

    /* renamed from: l */
    private int f115019l;

    /* renamed from: m */
    private View f115020m;

    /* renamed from: n */
    private float f115021n;

    /* renamed from: o */
    private float f115022o;

    /* renamed from: p */
    private float f115023p;

    /* renamed from: q */
    private int f115024q;

    /* renamed from: r */
    private int f115025r;

    /* renamed from: s */
    private ArrayList f115026s;

    /* renamed from: ni0.b$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f115027q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            return new Paint();
        }
    }

    /* renamed from: ni0.b$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f115028q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo12V4() {
            return new Paint();
        }
    }

    public C23797b(float f11, float f12, float f13) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f115008a = f11;
        this.f115009b = f12;
        this.f115010c = f13;
        this.f115011d = new RectF();
        m129210a = AbstractC24856m.m129210a(b.f115028q);
        this.f115016i = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f115027q);
        this.f115017j = m129210a2;
        this.f115026s = new ArrayList();
        float f14 = this.f115008a;
        float f15 = 2;
        float f16 = this.f115009b;
        this.f115011d = new RectF((-f14) / f15, f16 / f15, f14 / f15, (-f16) / f15);
        Paint m124347g = m124347g();
        Paint.Style style = Paint.Style.FILL;
        m124347g.setStyle(style);
        Paint m124347g2 = m124347g();
        Paint.Cap cap = Paint.Cap.ROUND;
        m124347g2.setStrokeCap(cap);
        m124347g().setColor(-16777216);
        m124346f().setStyle(style);
        m124346f().setStrokeCap(cap);
        m124346f().setColor(-65536);
    }

    /* renamed from: e */
    private final float[] m124345e() {
        Float f11 = (Float) Collections.max(this.f115026s);
        Float f12 = (Float) Collections.min(this.f115026s);
        if (this.f115026s.size() == 1) {
            f12 = Float.valueOf(this.f115023p);
        }
        AbstractC19074t.m100207e(f12, "if (values.size == 1) valueFrom else min");
        float m124351l = m124351l(f12.floatValue());
        AbstractC19074t.m100207e(f11, "max");
        float m124351l2 = m124351l(f11.floatValue());
        if (m124350k()) {
            return new float[]{m124351l2, m124351l};
        }
        return new float[]{m124351l, m124351l2};
    }

    /* renamed from: f */
    private final Paint m124346f() {
        return (Paint) this.f115017j.getValue();
    }

    /* renamed from: g */
    private final Paint m124347g() {
        return (Paint) this.f115016i.getValue();
    }

    /* renamed from: h */
    private final int[] m124348h() {
        int[] iArr = new int[this.f115026s.size()];
        int size = this.f115026s.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = this.f115012e;
            Object obj = this.f115026s.get(i11);
            AbstractC19074t.m100207e(obj, "values[i]");
            iArr[i11] = m124352m(i12, m124351l(((Number) obj).floatValue()));
        }
        return iArr;
    }

    /* renamed from: i */
    private final float m124349i(float f11) {
        if (m124350k()) {
            f11 = 1 - f11;
        }
        float f12 = this.f115022o;
        float f13 = this.f115023p;
        return (f11 * (f12 - f13)) + f13;
    }

    /* renamed from: k */
    private final boolean m124350k() {
        View view = this.f115020m;
        if (view == null || AbstractC1579n0.m7812G(view) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private final float m124351l(float f11) {
        float f12 = this.f115023p;
        float f13 = (f11 - f12) / (this.f115022o - f12);
        if (m124350k()) {
            return 1 - f13;
        }
        return f13;
    }

    /* renamed from: m */
    private final int m124352m(int i11, float f11) {
        int m104529e;
        m104529e = AbstractC20104d.m104529e(f11 * (i11 - 1));
        return m104529e;
    }

    /* renamed from: a */
    public final void m124353a(int i11) {
        if (this.f115013f) {
            this.f115015h = i11;
            float f11 = this.f115021n;
            if (f11 > 0.0f) {
                int i12 = (int) (((this.f115022o - this.f115023p) / f11) + 1);
                this.f115012e = i12;
                this.f115012e = Math.min(i12, (i11 / (this.f115024q * 2)) + 1);
            }
            this.f115013f = false;
        }
    }

    /* renamed from: b */
    public final void m124354b(float f11, float f12, float f13) {
        this.f115023p = f12;
        this.f115022o = f13;
        this.f115021n = f11;
        this.f115013f = true;
    }

    /* renamed from: c */
    public final boolean m124355c(float f11, int i11) {
        float f12 = i11;
        float min = Math.min(1.0f, Math.max(0.0f, ((f11 - f12) - this.f115025r) / this.f115015h));
        float min2 = Math.min(1.0f, Math.max(0.0f, ((f11 + f12) - this.f115025r) / this.f115015h));
        int size = this.f115026s.size();
        for (int i12 = 0; i12 < size; i12++) {
            float m124349i = m124349i(min);
            float m124349i2 = m124349i(min2);
            Object obj = this.f115026s.get(i12);
            AbstractC19074t.m100207e(obj, "values[i]");
            float floatValue = ((Number) obj).floatValue();
            if (m124349i <= floatValue && floatValue <= m124349i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m124356d(Canvas canvas, ArrayList arrayList) {
        int i11;
        boolean m131388u;
        int i12;
        int i13;
        AbstractC19074t.m100208f(canvas, "canvas");
        AbstractC19074t.m100208f(arrayList, "newValues");
        if (this.f115021n <= 0.0f) {
            return;
        }
        this.f115026s = arrayList;
        if (this.f115012e > 1) {
            Drawable drawable = this.f115014g;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i12 = intrinsicWidth / 2;
                } else {
                    i12 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i13 = intrinsicHeight / 2;
                } else {
                    i13 = 1;
                }
                drawable.setBounds(-i12, -i13, i12, i13);
            }
            float f11 = this.f115015h / (this.f115012e - 1);
            float[] m124345e = m124345e();
            int i14 = 0;
            int m124352m = m124352m(this.f115012e, m124345e[0]);
            int m124352m2 = m124352m(this.f115012e, m124345e[1]);
            int[] m124348h = m124348h();
            int save = canvas.save();
            float f12 = this.f115025r;
            View view = this.f115020m;
            if (view != null) {
                i11 = view.getHeight();
            } else {
                i11 = 0;
            }
            canvas.translate(f12, i11 / 2);
            int i15 = this.f115012e;
            if (i15 >= 0) {
                while (true) {
                    Drawable drawable2 = this.f115014g;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    if (m124352m <= i14 && i14 <= m124352m2) {
                        m131388u = AbstractC25358n.m131388u(m124348h, i14);
                        if (!m131388u) {
                            RectF rectF = this.f115011d;
                            float f13 = this.f115010c;
                            canvas.drawRoundRect(rectF, f13, f13, m124346f());
                        }
                    } else {
                        RectF rectF2 = this.f115011d;
                        float f14 = this.f115010c;
                        canvas.drawRoundRect(rectF2, f14, f14, m124347g());
                    }
                    canvas.translate(f11, 0.0f);
                    if (i14 == i15) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: j */
    public final ArrayList m124357j() {
        return this.f115026s;
    }

    /* renamed from: n */
    public final void m124358n() {
        this.f115013f = true;
    }

    /* renamed from: o */
    public final void m124359o(View view) {
        this.f115020m = view;
    }

    /* renamed from: p */
    public final void m124360p(int i11) {
        if (i11 == this.f115018k) {
            return;
        }
        this.f115018k = i11;
        m124346f().setColor(this.f115018k);
        View view = this.f115020m;
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: q */
    public final void m124361q(int i11) {
        if (i11 == this.f115019l) {
            return;
        }
        this.f115019l = i11;
        m124347g().setColor(this.f115019l);
        View view = this.f115020m;
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: r */
    public final void m124362r(float f11) {
        this.f115021n = f11;
    }

    /* renamed from: s */
    public final void m124363s(int i11) {
        this.f115024q = i11;
    }

    /* renamed from: t */
    public final void m124364t(int i11) {
        this.f115025r = i11;
    }

    /* renamed from: u */
    public final void m124365u(float f11) {
        this.f115023p = f11;
    }

    /* renamed from: v */
    public final void m124366v(float f11) {
        this.f115022o = f11;
    }

    /* renamed from: w */
    public final void m124367w(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f115026s = arrayList;
    }
}
