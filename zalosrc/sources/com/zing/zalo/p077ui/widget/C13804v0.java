package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.v0 */
/* loaded from: classes6.dex */
public class C13804v0 {

    /* renamed from: a */
    Paint f71442a;

    /* renamed from: b */
    int f71443b;

    /* renamed from: c */
    int f71444c;

    /* renamed from: d */
    View f71445d;

    /* renamed from: e */
    boolean f71446e;

    /* renamed from: f */
    int f71447f;

    /* renamed from: g */
    Handler f71448g;

    /* renamed from: h */
    RectF f71449h;

    /* renamed from: i */
    int[] f71450i = {0, -16538118};

    /* renamed from: j */
    int f71451j;

    /* renamed from: k */
    int f71452k;

    /* renamed from: com.zing.zalo.ui.widget.v0$a */
    /* loaded from: classes6.dex */
    class a extends Handler {

        /* renamed from: a */
        final /* synthetic */ View f71453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Looper looper, View view) {
            super(looper);
            this.f71453a = view;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            View view;
            try {
                if (message.what == 10) {
                    if (C13804v0.this.f71446e && (view = this.f71453a) != null && view.isShown()) {
                        C13804v0 c13804v0 = C13804v0.this;
                        c13804v0.f71447f = (c13804v0.f71447f + 5) % 360;
                        View view2 = this.f71453a;
                        int m118742r = c13804v0.f71452k - AbstractC23136l9.m118742r(2.0f);
                        int m118742r2 = C13804v0.this.f71451j - AbstractC23136l9.m118742r(2.0f);
                        C13804v0 c13804v02 = C13804v0.this;
                        int m118742r3 = c13804v02.f71452k + c13804v02.f71443b + AbstractC23136l9.m118742r(2.0f);
                        C13804v0 c13804v03 = C13804v0.this;
                        view2.invalidate(m118742r, m118742r2, m118742r3, c13804v03.f71451j + c13804v03.f71444c + AbstractC23136l9.m118742r(2.0f));
                        C13804v0.this.f71448g.sendEmptyMessageDelayed(10, 16L);
                        return;
                    }
                    C13804v0.this.f71446e = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C13804v0(View view) {
        try {
            this.f71445d = view;
            view.invalidate();
            this.f71447f = 0;
            this.f71443b = AbstractC23136l9.m118742r(25.0f);
            this.f71444c = AbstractC23136l9.m118742r(25.0f);
            this.f71449h = new RectF(0.0f, 0.0f, this.f71443b, this.f71444c);
            Paint paint = new Paint(1);
            this.f71442a = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f71442a.setStrokeWidth(AbstractC23136l9.m118742r(3.0f));
            this.f71442a.setShader(new SweepGradient(this.f71443b / 2, this.f71444c / 2, this.f71450i, (float[]) null));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f71448g = new a(Looper.getMainLooper(), view);
    }

    /* renamed from: a */
    public void m77062a(Canvas canvas) {
        m77069h();
        canvas.save();
        canvas.translate(this.f71452k, this.f71451j);
        canvas.rotate(this.f71447f, this.f71443b / 2, this.f71444c / 2);
        canvas.drawArc(this.f71449h, 0.0f, 360.0f, false, this.f71442a);
        canvas.restore();
    }

    /* renamed from: b */
    public int m77063b() {
        return this.f71444c;
    }

    /* renamed from: c */
    public int m77064c() {
        return this.f71443b;
    }

    /* renamed from: d */
    public void m77065d(int[] iArr) {
        this.f71450i = iArr;
        SweepGradient sweepGradient = new SweepGradient(this.f71443b / 2, this.f71444c / 2, iArr, (float[]) null);
        Paint paint = this.f71442a;
        if (paint != null) {
            paint.setShader(sweepGradient);
        }
    }

    /* renamed from: e */
    public void m77066e(int i11, int i12) {
        this.f71443b = i11;
        this.f71444c = i12;
        try {
            this.f71449h = new RectF(0.0f, 0.0f, i11, i12);
            SweepGradient sweepGradient = new SweepGradient(i11 / 2, i12 / 2, this.f71450i, (float[]) null);
            Paint paint = this.f71442a;
            if (paint != null) {
                paint.setShader(sweepGradient);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m77067f(int i11, int i12) {
        this.f71452k = i11;
        this.f71451j = i12;
    }

    /* renamed from: g */
    public void m77068g(int i11) {
        Paint paint = this.f71442a;
        if (paint != null) {
            paint.setStrokeWidth(i11);
        }
    }

    /* renamed from: h */
    void m77069h() {
        View view = this.f71445d;
        if (view != null && view.isShown()) {
            this.f71447f = (this.f71447f + 5) % 360;
            this.f71445d.invalidate();
        }
    }
}
