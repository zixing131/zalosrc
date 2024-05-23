package yj0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zinstant.zom.properties.ZOMIndicator;
import pm0.C24860q;

/* renamed from: yj0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC31000c extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final ZOMIndicator f143008a;

    /* renamed from: b */
    private int f143009b;

    /* renamed from: c */
    private int f143010c;

    /* renamed from: d */
    private int f143011d;

    /* renamed from: e */
    private int f143012e;

    /* renamed from: f */
    private float f143013f;

    /* renamed from: g */
    private float f143014g;

    /* renamed from: h */
    private float f143015h;

    /* renamed from: i */
    private float f143016i;

    /* renamed from: l */
    private float f143019l;

    /* renamed from: n */
    private c f143021n;

    /* renamed from: o */
    private final Paint f143022o;

    /* renamed from: p */
    private final Paint f143023p;

    /* renamed from: q */
    private final Paint f143024q;

    /* renamed from: r */
    private int f143025r;

    /* renamed from: j */
    private float f143017j = 0.0f;

    /* renamed from: k */
    private int f143018k = 0;

    /* renamed from: m */
    private final Interpolator f143020m = new AccelerateDecelerateInterpolator();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yj0.c$a */
    /* loaded from: classes7.dex */
    public class a implements c {
        a() {
        }

        /* renamed from: c */
        private void m150722c(Canvas canvas, float f11, float f12, float f13, float f14) {
            RectF rectF = new RectF(f11, f12, f13, f14);
            canvas.drawRoundRect(rectF, 20.0f, 20.0f, AbstractC31000c.this.f143022o);
            if (AbstractC31000c.this.f143017j > 0.0f) {
                canvas.drawRoundRect(rectF, 20.0f, 20.0f, AbstractC31000c.this.f143024q);
            }
        }

        @Override // yj0.AbstractC31000c.c
        /* renamed from: a */
        public void mo150723a(Canvas canvas, float f11, float f12, int i11, float f13, int i12) {
            float f14 = AbstractC31000c.this.f143015h + AbstractC31000c.this.f143019l;
            float f15 = f11 + (i11 * f14);
            float f16 = AbstractC31000c.this.f143015h * f13;
            m150722c(canvas, f15 + f16, f12, f15 + AbstractC31000c.this.f143015h, f12 + AbstractC31000c.this.f143016i);
            if (f13 > 0.0f && i11 < i12 - 1) {
                float f17 = f15 + f14;
                m150722c(canvas, f17, f12, f17 + f16, f12 + AbstractC31000c.this.f143016i);
            }
        }

        @Override // yj0.AbstractC31000c.c
        /* renamed from: b */
        public void mo150724b(Canvas canvas, float f11, float f12, int i11) {
            float f13 = AbstractC31000c.this.f143015h + AbstractC31000c.this.f143019l;
            float f14 = AbstractC31000c.this.f143016i + f12;
            for (int i12 = 0; i12 < i11; i12++) {
                canvas.drawRoundRect(new RectF(f11, f12, AbstractC31000c.this.f143015h + f11, f14), 20.0f, 20.0f, AbstractC31000c.this.f143023p);
                f11 += f13;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yj0.c$b */
    /* loaded from: classes7.dex */
    public class b implements c {
        b() {
        }

        @Override // yj0.AbstractC31000c.c
        /* renamed from: a */
        public void mo150723a(Canvas canvas, float f11, float f12, int i11, float f13, int i12) {
            float f14;
            float f15 = AbstractC31000c.this.f143015h + AbstractC31000c.this.f143019l;
            float f16 = AbstractC31000c.this.f143015h / 2.0f;
            float f17 = f11 + (f15 * i11);
            if (f13 == 0.0f) {
                f14 = 0.0f;
            } else {
                f14 = (AbstractC31000c.this.f143015h * f13) + (AbstractC31000c.this.f143019l * f13);
            }
            float f18 = f17 + f14 + f16;
            float f19 = f12 + f16;
            canvas.drawCircle(f18, f19, f16, AbstractC31000c.this.f143022o);
            if (AbstractC31000c.this.f143017j > 0.0f) {
                canvas.drawCircle(f18, f19, AbstractC31000c.this.f143015h / 2.0f, AbstractC31000c.this.f143024q);
            }
        }

        @Override // yj0.AbstractC31000c.c
        /* renamed from: b */
        public void mo150724b(Canvas canvas, float f11, float f12, int i11) {
            float f13 = AbstractC31000c.this.f143015h + AbstractC31000c.this.f143019l;
            float f14 = AbstractC31000c.this.f143015h / 2.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                canvas.drawCircle(f11 + f14, f12 + f14, f14, AbstractC31000c.this.f143023p);
                f11 += f13;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yj0.c$c */
    /* loaded from: classes7.dex */
    public interface c {
        /* renamed from: a */
        void mo150723a(Canvas canvas, float f11, float f12, int i11, float f13, int i12);

        /* renamed from: b */
        void mo150724b(Canvas canvas, float f11, float f12, int i11);
    }

    public AbstractC31000c(ZOMIndicator zOMIndicator) {
        Paint paint = new Paint();
        this.f143022o = paint;
        Paint paint2 = new Paint();
        this.f143023p = paint2;
        Paint paint3 = new Paint();
        this.f143024q = paint3;
        this.f143025r = 255;
        this.f143008a = zOMIndicator;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        m150721y();
    }

    /* renamed from: t */
    private float m150716t(float f11, float f12, float f13) {
        return Math.min(Math.max(f11, f13), f12);
    }

    /* renamed from: u */
    private void m150717u(int i11) {
        if (this.f143009b == i11) {
            return;
        }
        this.f143009b = i11;
        this.f143022o.setColor(i11);
        this.f143022o.setAlpha(this.f143025r);
    }

    /* renamed from: w */
    private void m150718w(int i11) {
        if (this.f143010c == i11) {
            return;
        }
        this.f143010c = i11;
        this.f143023p.setColor(i11);
        this.f143023p.setAlpha(this.f143025r);
    }

    /* renamed from: x */
    private void m150719x(int i11) {
        if (this.f143018k == i11) {
            return;
        }
        this.f143018k = i11;
        this.f143024q.setColor(i11);
        this.f143024q.setAlpha(this.f143025r);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        super.mo10066g(rect, view, recyclerView, c1899z);
        rect.bottom = (int) this.f143016i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: k */
    public void mo10070k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        float paddingLeft;
        float f11;
        super.mo10070k(canvas, recyclerView, c1899z);
        m150721y();
        if (recyclerView.getAdapter() == null) {
            return;
        }
        int mo10003k = recyclerView.getAdapter().mo10003k();
        float max = (this.f143015h * mo10003k) + (Math.max(0, mo10003k - 1) * this.f143019l);
        int i11 = this.f143012e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    paddingLeft = 0.0f;
                } else {
                    paddingLeft = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - max;
                }
            } else {
                paddingLeft = (recyclerView.getWidth() - max) / 2.0f;
            }
        } else {
            paddingLeft = recyclerView.getPaddingLeft();
        }
        float m150716t = m150716t(recyclerView.getPaddingLeft(), recyclerView.getWidth() - recyclerView.getPaddingRight(), paddingLeft + this.f143013f);
        int i12 = this.f143011d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    f11 = 0.0f;
                } else {
                    f11 = (recyclerView.getHeight() - this.f143016i) - this.f143017j;
                }
            } else {
                f11 = (recyclerView.getHeight() - this.f143016i) / 2.0f;
            }
        } else {
            f11 = this.f143017j;
        }
        float m150716t2 = m150716t(0.0f, recyclerView.getHeight(), f11 + this.f143014g);
        this.f143021n.mo150724b(canvas, m150716t, m150716t2, mo10003k);
        C24860q mo91629s = mo91629s(recyclerView);
        if (mo91629s == null) {
            return;
        }
        this.f143021n.mo150723a(canvas, m150716t, m150716t2, ((Integer) mo91629s.m129215c()).intValue(), ((Float) mo91629s.m129216d()).floatValue(), mo10003k);
    }

    /* renamed from: s */
    public C24860q mo91629s(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int m9740Y1 = linearLayoutManager.m9740Y1();
        if (m9740Y1 == -1) {
            return null;
        }
        View mo9732P = linearLayoutManager.mo9732P(m9740Y1);
        return new C24860q(Integer.valueOf(m9740Y1), Float.valueOf(this.f143020m.getInterpolation((mo9732P.getLeft() * (-1)) / mo9732P.getWidth())));
    }

    /* renamed from: v */
    public void m150720v(int i11) {
        if (this.f143025r == i11) {
            return;
        }
        this.f143025r = i11;
        this.f143024q.setAlpha(i11);
        this.f143022o.setAlpha(i11);
        this.f143023p.setAlpha(i11);
    }

    /* renamed from: y */
    void m150721y() {
        float f11;
        ZOMIndicator zOMIndicator = this.f143008a;
        this.f143011d = zOMIndicator.mVerticalAlign;
        this.f143012e = zOMIndicator.mHorizontalAlign;
        this.f143013f = zOMIndicator.mTranslateX;
        this.f143014g = zOMIndicator.mTranslateY;
        if (zOMIndicator.mShape != 1) {
            c cVar = this.f143021n;
            if (cVar == null || !(cVar instanceof b)) {
                this.f143021n = new b();
            }
        } else {
            c cVar2 = this.f143021n;
            if (cVar2 == null || !(cVar2 instanceof a)) {
                this.f143021n = new a();
            }
        }
        float f12 = zOMIndicator.mSize;
        this.f143015h = f12;
        if (zOMIndicator.mShape != 0) {
            f11 = zOMIndicator.mHeight;
        } else {
            f11 = f12;
        }
        this.f143016i = f11;
        float f13 = zOMIndicator.mGapWidth;
        if (f13 > 0.0f) {
            f12 = f13;
        }
        this.f143019l = f12;
        m150717u(zOMIndicator.mActiveColor);
        m150718w(zOMIndicator.mInactiveColor);
        float f14 = this.f143017j;
        float f15 = zOMIndicator.mStrokeWidth;
        if (f14 != f15) {
            this.f143017j = f15;
            this.f143024q.setStrokeWidth(f15);
        }
        m150719x(zOMIndicator.mStrokeColor);
    }
}
