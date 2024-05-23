package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.zing.zalo.uidrawing.C16719g;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.m */
/* loaded from: classes6.dex */
public class C13687m {

    /* renamed from: p */
    protected static final int f70697p = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: q */
    private static DecelerateInterpolator f70698q;

    /* renamed from: b */
    protected Paint f70700b;

    /* renamed from: c */
    protected Paint f70701c;

    /* renamed from: d */
    protected TextPaint f70702d;

    /* renamed from: e */
    protected Paint f70703e;

    /* renamed from: f */
    private RectF f70704f;

    /* renamed from: g */
    protected final Context f70705g;

    /* renamed from: h */
    private View f70706h;

    /* renamed from: i */
    private C16719g f70707i;

    /* renamed from: j */
    private int f70708j;

    /* renamed from: k */
    private long f70709k;

    /* renamed from: l */
    private float f70710l;

    /* renamed from: m */
    private float f70711m;

    /* renamed from: n */
    private long f70712n;

    /* renamed from: a */
    protected int f70699a = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: o */
    protected int f70713o = 1;

    public C13687m(View view) {
        this.f70706h = view;
        this.f70705g = view.getContext();
        m76409a();
        m76414i();
    }

    /* renamed from: o */
    private void m76408o() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f70709k;
        this.f70709k = currentTimeMillis;
        if (this.f70710l != -1.0f) {
            int i11 = this.f70708j;
            float f11 = this.f70711m;
            float f12 = i11 - f11;
            if (f12 > 0.0f) {
                long j12 = this.f70712n + j11;
                this.f70712n = j12;
                if (j12 >= 300) {
                    this.f70710l = i11;
                    this.f70711m = i11;
                    this.f70712n = 0L;
                } else {
                    this.f70710l = f11 + (f12 * f70698q.getInterpolation(((float) j12) / 300.0f));
                }
                m76409a();
            }
        }
    }

    /* renamed from: a */
    void m76409a() {
        View view = this.f70706h;
        if (view != null) {
            view.invalidate();
            return;
        }
        C16719g c16719g = this.f70707i;
        if (c16719g != null) {
            c16719g.invalidate();
        }
    }

    /* renamed from: b */
    public void m76410b(Canvas canvas) {
        int i11 = this.f70699a;
        int i12 = f70697p;
        canvas.drawCircle(i11 + i12, i12 + i11, i11, this.f70700b);
        mo76346d(canvas);
        mo76239c(canvas);
        m76408o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76239c(Canvas canvas) {
        String str = ((int) this.f70710l) + "%";
        int i11 = this.f70699a;
        canvas.drawText(str, f70697p + i11, i11 + (AbstractC23136l9.m118742r(11.0f) / 2), this.f70702d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo76346d(Canvas canvas) {
        int i11 = this.f70699a;
        int i12 = f70697p;
        canvas.drawCircle(i11 + i12, i12 + i11, i11, this.f70701c);
        canvas.drawArc(this.f70704f, -90.0f, Math.max(4.0f, (this.f70710l * 360.0f) / 100.0f), false, this.f70703e);
    }

    /* renamed from: e */
    Context m76411e() {
        View view = this.f70706h;
        if (view != null) {
            return view.getContext();
        }
        C16719g c16719g = this.f70707i;
        if (c16719g != null) {
            return c16719g.getContext();
        }
        return null;
    }

    /* renamed from: f */
    public int m76412f() {
        return this.f70708j;
    }

    /* renamed from: g */
    public int m76413g() {
        return this.f70699a + f70697p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo76240h() {
        Typeface typeface;
        Paint paint = new Paint(1);
        this.f70700b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70700b.setColor(Integer.MIN_VALUE);
        Paint paint2 = new Paint(1);
        this.f70701c = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f70701c.setColor(1728053247);
        Paint paint3 = this.f70701c;
        int i11 = f70697p;
        paint3.setStrokeWidth(i11);
        Paint paint4 = new Paint(1);
        this.f70703e = paint4;
        paint4.setStyle(style);
        this.f70703e.setColor(-1);
        this.f70703e.setStrokeWidth(i11);
        TextPaint textPaint = new TextPaint(1);
        this.f70702d = textPaint;
        textPaint.setColor(-838860801);
        this.f70702d.setTextAlign(Paint.Align.CENTER);
        this.f70702d.setTextSize(AbstractC23136l9.m118759w1(11));
        if (m76411e() != null) {
            typeface = C13718q1.m76694c(m76411e(), 9);
        } else {
            typeface = Typeface.DEFAULT_BOLD;
        }
        this.f70702d.setTypeface(typeface);
    }

    /* renamed from: i */
    void m76414i() {
        this.f70708j = 0;
        this.f70710l = -1.0f;
        this.f70711m = -1.0f;
        this.f70709k = 0L;
        mo76240h();
        if (f70698q == null) {
            f70698q = new DecelerateInterpolator(1.5f);
        }
        int i11 = f70697p;
        int i12 = this.f70699a;
        this.f70704f = new RectF(i11, i11, (i12 * 2) + i11, (i12 * 2) + i11);
    }

    /* renamed from: j */
    public void m76415j() {
        this.f70708j = 0;
        this.f70710l = -1.0f;
        this.f70711m = -1.0f;
        this.f70709k = 0L;
    }

    /* renamed from: k */
    public void m76416k(int i11) {
        m76417l(i11, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76417l(int i11, boolean z11) {
        if (z11) {
            float f11 = i11;
            float f12 = this.f70710l;
            if (f11 > f12) {
                if (f12 == -1.0f) {
                    this.f70710l = 0.0f;
                    this.f70709k = System.currentTimeMillis();
                }
                this.f70711m = this.f70710l;
                if (i11 == this.f70708j) {
                    this.f70708j = i11;
                    this.f70712n = 0L;
                    if (this.f70706h != null) {
                        if (AbstractC19444a.m101693a()) {
                            this.f70706h.invalidate();
                            return;
                        } else {
                            this.f70706h.postInvalidate();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        float f13 = i11;
        this.f70710l = f13;
        this.f70711m = f13;
        this.f70709k = 0L;
        if (i11 == this.f70708j) {
        }
    }

    /* renamed from: m */
    public void mo76241m(int i11) {
        this.f70699a = i11;
        int i12 = f70697p;
        int i13 = i11 * 2;
        this.f70704f = new RectF(i12, i12, i13 + i12, i13 + i12);
    }

    /* renamed from: n */
    public void m76418n(int i11, int i12) {
        this.f70713o = i11;
        mo76241m(i12);
    }

    public C13687m(C16719g c16719g) {
        this.f70707i = c16719g;
        this.f70705g = c16719g.getContext();
        m76409a();
        m76414i();
    }
}
