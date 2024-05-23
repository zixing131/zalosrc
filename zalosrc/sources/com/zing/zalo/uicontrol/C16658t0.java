package com.zing.zalo.uicontrol;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.animation.DecelerateInterpolator;
import com.zing.zalo.AbstractC16781w;
import me0.C23212s8;
import zl0.AbstractC32232i;

/* renamed from: com.zing.zalo.uicontrol.t0 */
/* loaded from: classes4.dex */
public class C16658t0 {

    /* renamed from: d */
    float f84441d;

    /* renamed from: i */
    PathMeasure f84446i;

    /* renamed from: p */
    int f84453p;

    /* renamed from: r */
    ValueAnimator f84455r;

    /* renamed from: t */
    Paint f84457t;

    /* renamed from: u */
    b f84458u;

    /* renamed from: a */
    RectF f84438a = new RectF();

    /* renamed from: b */
    RectF f84439b = new RectF();

    /* renamed from: c */
    Matrix f84440c = new Matrix();

    /* renamed from: e */
    int f84442e = 1500;

    /* renamed from: f */
    int f84443f = 150;

    /* renamed from: g */
    boolean f84444g = true;

    /* renamed from: h */
    int f84445h = AbstractC32232i.m155453a(200.0f);

    /* renamed from: j */
    float[] f84447j = new float[2];

    /* renamed from: k */
    RectF f84448k = new RectF();

    /* renamed from: l */
    Matrix f84449l = new Matrix();

    /* renamed from: m */
    private int f84450m = -1;

    /* renamed from: n */
    private boolean f84451n = false;

    /* renamed from: o */
    private long f84452o = 0;

    /* renamed from: q */
    RectF f84454q = new RectF();

    /* renamed from: s */
    ValueAnimator.AnimatorUpdateListener f84456s = new a();

    /* renamed from: com.zing.zalo.uicontrol.t0$a */
    /* loaded from: classes4.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PathMeasure pathMeasure = C16658t0.this.f84446i;
            if (pathMeasure != null) {
                float length = pathMeasure.getLength() * valueAnimator.getAnimatedFraction();
                C16658t0 c16658t0 = C16658t0.this;
                c16658t0.f84446i.getPosTan(length, c16658t0.f84447j, null);
                C16658t0.this.f84454q.setEmpty();
                C16658t0 c16658t02 = C16658t0.this;
                float f11 = c16658t02.f84447j[0];
                float f12 = c16658t02.f84445h / 2.0f;
                RectF rectF = c16658t02.f84439b;
                c16658t02.f84454q.set(f11 - f12, rectF.top, f11 + f12, rectF.bottom);
                C16658t0.this.f84448k.setEmpty();
                C16658t0 c16658t03 = C16658t0.this;
                c16658t03.f84448k.set(c16658t03.f84454q);
                C16658t0.this.m88775m();
                C16658t0 c16658t04 = C16658t0.this;
                b bVar = c16658t04.f84458u;
                if (bVar != null) {
                    bVar.mo44637a(c16658t04, c16658t04.f84448k);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.t0$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo44637a(C16658t0 c16658t0, RectF rectF);
    }

    public C16658t0(Context context) {
        this.f84453p = C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m88775m() {
        RectF rectF = this.f84439b;
        float width = rectF.width();
        float height = rectF.height();
        float f11 = rectF.left;
        if (width != 0.0f && height != 0.0f) {
            float width2 = rectF.width();
            int[] iArr = {0, Color.argb(2, Color.red(this.f84453p), Color.green(this.f84453p), Color.blue(this.f84453p)), Color.argb(12, Color.red(this.f84453p), Color.green(this.f84453p), Color.blue(this.f84453p)), Color.argb(76, Color.red(this.f84453p), Color.green(this.f84453p), Color.blue(this.f84453p)), Color.argb(12, Color.red(this.f84453p), Color.green(this.f84453p), Color.blue(this.f84453p)), Color.argb(2, Color.red(this.f84453p), Color.green(this.f84453p), Color.blue(this.f84453p)), 0};
            float f12 = this.f84445h / width2;
            float centerX = (this.f84454q.centerX() - f11) / width2;
            float f13 = f12 / 2.0f;
            float f14 = f12 / 4.0f;
            LinearGradient linearGradient = new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, iArr, new float[]{0.0f, centerX - f13, centerX - f14, centerX, f14 + centerX, centerX + f13, 1.0f}, Shader.TileMode.CLAMP);
            if (this.f84457t == null) {
                Paint paint = new Paint(1);
                this.f84457t = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            this.f84457t.setShader(linearGradient);
        }
    }

    /* renamed from: b */
    public Paint m88776b() {
        return this.f84457t;
    }

    /* renamed from: c */
    public void m88777c(int i11, int i12) {
        this.f84442e = i11;
        this.f84443f = i12;
    }

    /* renamed from: d */
    public void m88778d(Rect rect) {
        if (rect != null) {
            RectF rectF = this.f84438a;
            int i11 = rect.left;
            int i12 = this.f84445h;
            rectF.set(i11 - i12, rect.top, rect.right + i12, rect.bottom);
            m88786l();
        }
    }

    /* renamed from: e */
    public void m88779e(int i11) {
        this.f84450m = i11;
    }

    /* renamed from: f */
    public void m88780f(boolean z11) {
        this.f84451n = z11;
    }

    /* renamed from: g */
    public void m88781g(int i11) {
        this.f84453p = i11;
    }

    /* renamed from: h */
    public void m88782h(b bVar) {
        this.f84458u = bVar;
    }

    /* renamed from: i */
    public void m88783i(int i11) {
        this.f84445h = i11;
    }

    /* renamed from: j */
    public void mo88784j() {
        ValueAnimator valueAnimator = this.f84455r;
        if (valueAnimator != null) {
            valueAnimator.isStarted();
            this.f84455r.cancel();
            this.f84455r.removeAllUpdateListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (this.f84443f / this.f84442e) + 1.0f);
        this.f84455r = ofFloat;
        ofFloat.setRepeatMode(1);
        this.f84455r.setRepeatCount(this.f84450m);
        this.f84455r.setDuration(this.f84442e + this.f84443f);
        this.f84455r.setInterpolator(new DecelerateInterpolator());
        this.f84455r.addUpdateListener(this.f84456s);
        if (this.f84451n) {
            this.f84455r.setCurrentPlayTime(this.f84452o);
        }
        this.f84455r.start();
    }

    /* renamed from: k */
    public void m88785k() {
        ValueAnimator valueAnimator = this.f84455r;
        if (valueAnimator != null) {
            if (this.f84451n) {
                this.f84452o = valueAnimator.getCurrentPlayTime();
            }
            this.f84455r.cancel();
            this.f84455r.removeAllUpdateListeners();
        }
    }

    /* renamed from: l */
    void m88786l() {
        Path path = new Path();
        this.f84440c.reset();
        this.f84440c.setRotate(this.f84441d, this.f84438a.centerX(), this.f84438a.centerY());
        this.f84440c.mapRect(this.f84439b, this.f84438a);
        this.f84449l.reset();
        this.f84449l.setRotate(-this.f84441d, this.f84438a.centerX(), this.f84438a.centerY());
        if (this.f84444g) {
            RectF rectF = this.f84439b;
            path.moveTo(rectF.left, rectF.top);
            RectF rectF2 = this.f84439b;
            path.lineTo(rectF2.right, rectF2.top);
        } else {
            RectF rectF3 = this.f84439b;
            path.moveTo(rectF3.right, rectF3.top);
            RectF rectF4 = this.f84439b;
            path.lineTo(rectF4.left, rectF4.top);
        }
        this.f84446i = new PathMeasure(path, false);
        m88775m();
    }
}
