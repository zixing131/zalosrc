package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.j2 */
/* loaded from: classes6.dex */
public class C13656j2 {

    /* renamed from: a */
    View f70496a;

    /* renamed from: d */
    RectF f70499d;

    /* renamed from: e */
    int f70500e;

    /* renamed from: f */
    int f70501f;

    /* renamed from: g */
    Paint f70502g;

    /* renamed from: i */
    Handler f70504i;

    /* renamed from: o */
    float f70510o;

    /* renamed from: q */
    float f70512q;

    /* renamed from: s */
    float f70514s;

    /* renamed from: u */
    float f70516u;

    /* renamed from: b */
    int f70497b = AbstractC23136l9.m118742r(25.0f);

    /* renamed from: c */
    int f70498c = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: h */
    int f70503h = AbstractC23136l9.m118742r(7.0f);

    /* renamed from: j */
    int[] f70505j = {0, -16538118};

    /* renamed from: k */
    int f70506k = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: l */
    float f70507l = 0.0f;

    /* renamed from: m */
    boolean f70508m = false;

    /* renamed from: n */
    int f70509n = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: p */
    float f70511p = 90.0f;

    /* renamed from: r */
    float f70513r = 180.0f;

    /* renamed from: t */
    float f70515t = 270.0f;

    /* renamed from: v */
    float f70517v = 360.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.j2$a */
    /* loaded from: classes6.dex */
    public class a extends Handler {

        /* renamed from: a */
        final /* synthetic */ View f70518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Looper looper, View view) {
            super(looper);
            this.f70518a = view;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            View view;
            try {
                if (message.what == 10) {
                    if (C13656j2.this.f70508m && (view = this.f70518a) != null && view.isShown()) {
                        C13656j2 c13656j2 = C13656j2.this;
                        c13656j2.f70507l = c13656j2.m76315i(c13656j2.f70507l) % 360.0f;
                        C13656j2.this.m76321o();
                        C13656j2.this.f70496a.invalidate();
                        C13656j2.this.f70504i.sendEmptyMessageDelayed(10, 16L);
                        return;
                    }
                    C13656j2.this.f70508m = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C13656j2(View view) {
        this.f70496a = view;
        Paint paint = new Paint(1);
        this.f70502g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f70502g.setStrokeWidth(this.f70506k);
        this.f70502g.setShader(new SweepGradient(this.f70497b / 2, this.f70498c / 2, this.f70505j, (float[]) null));
        this.f70504i = new a(Looper.getMainLooper(), view);
    }

    /* renamed from: a */
    float m76307a(float f11) {
        float ceil;
        try {
            int i11 = this.f70497b / 2;
            int i12 = this.f70498c / 2;
            double d11 = i11;
            double tan = (Math.tan(f11 * 0.017453292519943295d) * d11) + this.f70509n;
            if (tan >= i12) {
                ceil = this.f70510o;
            } else {
                ceil = (float) Math.ceil(Math.toDegrees(Math.atan(tan / d11)));
            }
            return ceil;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: b */
    float m76308b(float f11) {
        float f12;
        try {
            int i11 = this.f70497b / 2;
            int i12 = this.f70498c / 2;
            float f13 = this.f70510o;
            float f14 = f11 - f13;
            float f15 = this.f70511p;
            float f16 = f15 - f13;
            float f17 = f16 - f14;
            if (f17 > 0.0f) {
                double d11 = i12;
                double tan = (Math.tan(f17 * 0.017453292519943295d) * d11) - this.f70509n;
                if (tan > 0.0d) {
                    f12 = this.f70510o + (f16 - ((float) Math.toDegrees(Math.atan(tan / d11))));
                } else {
                    f12 = this.f70511p;
                }
                return f12;
            }
            return f15;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: c */
    float m76309c(float f11) {
        float f12;
        try {
            int i11 = this.f70497b / 2;
            double d11 = this.f70498c / 2;
            double tan = (Math.tan((f11 - this.f70511p) * 0.017453292519943295d) * d11) + this.f70509n;
            if (tan < i11) {
                f12 = this.f70511p + ((float) Math.toDegrees(Math.atan(tan / d11)));
            } else {
                f12 = this.f70512q;
            }
            return f12;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: d */
    float m76310d(float f11) {
        float f12;
        try {
            int i11 = this.f70497b / 2;
            int i12 = this.f70498c / 2;
            float f13 = this.f70512q;
            float f14 = f11 - f13;
            float f15 = this.f70513r;
            float f16 = f15 - f13;
            float f17 = f16 - f14;
            if (f17 > 0.0f) {
                double d11 = i11;
                double tan = (Math.tan(f17 * 0.017453292519943295d) * d11) - this.f70509n;
                if (tan > 0.0d) {
                    f12 = this.f70512q + (f16 - ((float) Math.toDegrees(Math.atan(tan / d11))));
                } else {
                    f12 = this.f70513r;
                }
                return f12;
            }
            return f15;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: e */
    float m76311e(float f11) {
        int i11 = this.f70497b / 2;
        int i12 = this.f70498c / 2;
        double d11 = i11;
        double tan = (Math.tan((f11 - this.f70513r) * 0.017453292519943295d) * d11) + this.f70509n;
        if (tan >= i12) {
            return this.f70514s;
        }
        return this.f70513r + ((float) Math.toDegrees(Math.atan(tan / d11)));
    }

    /* renamed from: f */
    float m76312f(float f11) {
        float f12;
        try {
            int i11 = this.f70497b / 2;
            int i12 = this.f70498c / 2;
            float f13 = this.f70514s;
            float f14 = f11 - f13;
            float f15 = this.f70515t;
            float f16 = f15 - f13;
            float f17 = f16 - f14;
            if (f17 > 0.0f) {
                double d11 = i12;
                double tan = (Math.tan(f17 * 0.017453292519943295d) * d11) - this.f70509n;
                if (tan > 0.0d) {
                    f12 = this.f70514s + (f16 - ((float) Math.toDegrees(Math.atan(tan / d11))));
                } else {
                    f12 = this.f70515t;
                }
                return f12;
            }
            return f15;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: g */
    float m76313g(float f11) {
        float degrees;
        try {
            int i11 = this.f70497b / 2;
            double d11 = this.f70498c / 2;
            double tan = (Math.tan((f11 - this.f70515t) * 0.017453292519943295d) * d11) + this.f70509n;
            if (tan >= i11) {
                degrees = this.f70516u;
            } else {
                degrees = this.f70515t + ((float) Math.toDegrees(Math.atan(tan / d11)));
            }
            return degrees;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: h */
    float m76314h(float f11) {
        float f12;
        try {
            int i11 = this.f70497b / 2;
            int i12 = this.f70498c / 2;
            float f13 = this.f70516u;
            float f14 = f11 - f13;
            float f15 = this.f70517v;
            float f16 = f15 - f13;
            float f17 = f16 - f14;
            if (f17 > 0.0f) {
                double d11 = i11;
                double tan = (Math.tan(f17 * 0.017453292519943295d) * d11) - this.f70509n;
                if (tan > 0.0d) {
                    f12 = this.f70516u + (f16 - ((float) Math.toDegrees(Math.atan(tan / d11))));
                } else {
                    f12 = this.f70517v;
                }
                return f12;
            }
            return f15;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: i */
    float m76315i(float f11) {
        float f12 = 0.0f;
        if (f11 >= 0.0f) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (f11 < this.f70510o) {
                f12 = m76307a(f11);
                return f12;
            }
        }
        if (f11 >= this.f70510o && f11 < this.f70511p) {
            f12 = m76308b(f11);
        } else if (f11 >= this.f70511p && f11 < this.f70512q) {
            f12 = m76309c(f11);
        } else if (f11 >= this.f70512q && f11 < this.f70513r) {
            f12 = m76310d(f11);
        } else if (f11 >= this.f70513r && f11 < this.f70514s) {
            f12 = m76311e(f11);
        } else if (f11 >= this.f70514s && f11 < this.f70515t) {
            f12 = m76312f(f11);
        } else if (f11 >= this.f70515t && f11 < this.f70516u) {
            f12 = m76313g(f11);
        } else if (f11 >= this.f70516u && f11 < this.f70517v) {
            f12 = m76314h(f11);
        }
        return f12;
    }

    /* renamed from: j */
    public void m76316j(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f70501f, this.f70500e);
        RectF rectF = this.f70499d;
        int i11 = this.f70503h;
        canvas.drawRoundRect(rectF, i11, i11, this.f70502g);
        canvas.restore();
    }

    /* renamed from: k */
    void m76317k(int i11, int i12) {
        double d11 = (i11 * 1.0f) / 2.0f;
        double d12 = (i12 * 1.0f) / 2.0f;
        try {
            this.f70510o = (float) Math.toDegrees(Math.atan(d12 / d11));
            double atan = Math.atan(d11 / d12);
            this.f70512q = this.f70511p + ((float) Math.toDegrees(atan));
            this.f70514s = this.f70513r + this.f70510o;
            this.f70516u = this.f70515t + ((float) Math.toDegrees(atan));
            int i13 = this.f70506k;
            this.f70499d = new RectF(i13, i13, i11 - i13, i12 - i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public void m76318l(int i11, int i12) {
        this.f70501f = i11;
        this.f70500e = i12;
    }

    /* renamed from: m */
    public void m76319m(int i11, int i12) {
        this.f70497b = i11;
        this.f70498c = i12;
        m76317k(i11, i12);
    }

    /* renamed from: n */
    public void m76320n() {
        try {
            this.f70504i.removeMessages(10);
            if (this.f70508m) {
                this.f70508m = false;
                this.f70496a.invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    void m76321o() {
        try {
            SweepGradient sweepGradient = new SweepGradient(this.f70497b / 2, this.f70498c / 2, this.f70505j, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f70507l, this.f70497b / 2, this.f70498c / 2);
            sweepGradient.setLocalMatrix(matrix);
            this.f70502g.setShader(sweepGradient);
            this.f70502g.setStrokeWidth(this.f70506k);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
