package l60;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import me0.AbstractC23136l9;
import p500s1.C26087b;

/* renamed from: l60.b */
/* loaded from: classes5.dex */
public class C22103b {

    /* renamed from: j */
    int f108846j;

    /* renamed from: k */
    int f108847k;

    /* renamed from: m */
    final ValueAnimator f108849m;

    /* renamed from: n */
    float f108850n;

    /* renamed from: o */
    a f108851o;

    /* renamed from: a */
    final int f108837a = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: b */
    final Paint f108838b = new Paint(1);

    /* renamed from: c */
    int f108839c = 0;

    /* renamed from: d */
    int f108840d = 0;

    /* renamed from: e */
    int f108841e = 0;

    /* renamed from: f */
    int f108842f = 0;

    /* renamed from: g */
    RectF f108843g = new RectF();

    /* renamed from: h */
    RectF f108844h = new RectF();

    /* renamed from: i */
    int f108845i = 0;

    /* renamed from: l */
    boolean f108848l = true;

    /* renamed from: l60.b$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo62638a();
    }

    public C22103b(a aVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f108849m = valueAnimator;
        this.f108850n = 0.0f;
        this.f108851o = aVar;
        valueAnimator.setInterpolator(new C26087b());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l60.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C22103b.this.m115319c(valueAnimator2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m115319c(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f108850n = floatValue;
        this.f108844h.set(0.0f, 0.0f, (floatValue / 100.0f) * this.f108846j, this.f108847k);
        if (this.f108848l) {
            this.f108851o.mo62638a();
        }
    }

    /* renamed from: b */
    public void m115320b(Canvas canvas) {
        if (!this.f108848l) {
            return;
        }
        canvas.save();
        canvas.translate(this.f108839c, this.f108840d);
        this.f108838b.setColor(1291845632);
        RectF rectF = this.f108843g;
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f108843g.height() / 2.0f, this.f108838b);
        int i11 = this.f108837a;
        canvas.translate(i11, i11);
        this.f108838b.setColor(-419430401);
        RectF rectF2 = this.f108844h;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f108844h.height() / 2.0f, this.f108838b);
        canvas.restore();
    }

    /* renamed from: d */
    public void m115321d(int i11, boolean z11) {
        if (this.f108845i != i11) {
            this.f108845i = Math.max(i11, 0);
            this.f108845i = Math.min(i11, 100);
            if (z11) {
                this.f108849m.cancel();
                this.f108849m.setFloatValues(this.f108850n, this.f108845i);
                this.f108849m.start();
            } else {
                float f11 = i11;
                this.f108850n = f11;
                this.f108844h.set(0.0f, 0.0f, (f11 / 100.0f) * this.f108846j, this.f108847k);
            }
            this.f108851o.mo62638a();
        }
    }

    /* renamed from: e */
    public void m115322e(int i11, int i12) {
        this.f108841e = i11;
        this.f108842f = i12;
        this.f108843g.set(0.0f, 0.0f, i11, i12);
        int i13 = this.f108837a;
        int i14 = i11 - (i13 * 2);
        this.f108846j = i14;
        int i15 = i12 - (i13 * 2);
        this.f108847k = i15;
        this.f108844h.set(0.0f, 0.0f, (this.f108850n / 100.0f) * i14, i15);
    }
}
