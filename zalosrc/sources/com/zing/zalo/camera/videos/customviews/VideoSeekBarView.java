package com.zing.zalo.camera.videos.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import cf.C3451b;
import com.zing.zalo.AbstractC16801x;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

/* loaded from: classes3.dex */
public class VideoSeekBarView extends View {

    /* renamed from: A */
    float f41642A;

    /* renamed from: B */
    float f41643B;

    /* renamed from: C */
    Paint f41644C;

    /* renamed from: D */
    Paint f41645D;

    /* renamed from: E */
    TextPaint f41646E;

    /* renamed from: F */
    Paint f41647F;

    /* renamed from: G */
    Paint f41648G;

    /* renamed from: H */
    Paint f41649H;

    /* renamed from: I */
    Paint f41650I;

    /* renamed from: J */
    RectF f41651J;

    /* renamed from: K */
    RectF f41652K;

    /* renamed from: L */
    RectF f41653L;

    /* renamed from: M */
    RectF f41654M;

    /* renamed from: N */
    RectF f41655N;

    /* renamed from: O */
    RectF f41656O;

    /* renamed from: P */
    RectF f41657P;

    /* renamed from: Q */
    RectF f41658Q;

    /* renamed from: R */
    RectF f41659R;

    /* renamed from: S */
    StaticLayout f41660S;

    /* renamed from: T */
    boolean f41661T;

    /* renamed from: U */
    boolean f41662U;

    /* renamed from: V */
    boolean f41663V;

    /* renamed from: W */
    boolean f41664W;

    /* renamed from: a0 */
    boolean f41665a0;

    /* renamed from: b0 */
    float f41666b0;

    /* renamed from: c0 */
    float f41667c0;

    /* renamed from: d0 */
    float f41668d0;

    /* renamed from: e0 */
    boolean f41669e0;

    /* renamed from: f0 */
    float f41670f0;

    /* renamed from: g0 */
    float f41671g0;

    /* renamed from: h0 */
    long f41672h0;

    /* renamed from: i0 */
    private final C3451b f41673i0;

    /* renamed from: p */
    float f41674p;

    /* renamed from: q */
    float f41675q;

    /* renamed from: r */
    float f41676r;

    /* renamed from: s */
    float f41677s;

    /* renamed from: t */
    float f41678t;

    /* renamed from: u */
    float f41679u;

    /* renamed from: v */
    float f41680v;

    /* renamed from: w */
    float f41681w;

    /* renamed from: x */
    AbstractC7767a f41682x;

    /* renamed from: y */
    float f41683y;

    /* renamed from: z */
    float f41684z;

    public VideoSeekBarView(Context context) {
        super(context);
        this.f41681w = AbstractC23222t7.f112558f;
        this.f41683y = 0.0f;
        this.f41642A = 1.0f;
        this.f41643B = 1.0f;
        this.f41666b0 = 1.0f;
        this.f41667c0 = 0.0f;
        this.f41669e0 = false;
        this.f41670f0 = 0.0f;
        this.f41671g0 = 0.0f;
        this.f41672h0 = System.currentTimeMillis();
        this.f41673i0 = new C3451b();
        this.f41674p = AbstractC23222t7.f112586t;
        this.f41675q = AbstractC23222t7.f112562h;
        this.f41676r = AbstractC23222t7.f112552c;
        this.f41677s = AbstractC23222t7.f112584s;
        this.f41678t = AbstractC23222t7.f112594x;
        int i11 = AbstractC23222t7.f112552c;
        this.f41679u = i11;
        this.f41680v = i11;
        Paint paint = new Paint(1);
        this.f41644C = paint;
        paint.setColor(-16749835);
        Paint paint2 = new Paint(1);
        this.f41645D = paint2;
        paint2.setColor(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        TextPaint textPaint = new TextPaint(1);
        this.f41646E = textPaint;
        textPaint.setColor(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f41646E.setTextSize(AbstractC23136l9.m118742r(10.0f));
        Paint paint3 = new Paint(1);
        this.f41647F = paint3;
        paint3.setColor(AbstractC23136l9.m118641B(context, AbstractC16801x.black_40));
        Paint paint4 = new Paint();
        this.f41648G = paint4;
        paint4.setColor(-1308622848);
        Paint paint5 = new Paint(1);
        this.f41649H = paint5;
        paint5.setColor(-7355905);
        Paint paint6 = new Paint();
        this.f41650I = paint6;
        paint6.setColor(-13223878);
        this.f41668d0 = context.getResources().getDisplayMetrics().density;
        this.f41651J = new RectF();
        this.f41652K = new RectF();
        this.f41653L = new RectF();
        this.f41654M = new RectF();
        this.f41655N = new RectF();
        this.f41656O = new RectF();
        this.f41657P = new RectF();
        this.f41658Q = new RectF();
        this.f41659R = new RectF();
        setMinProgress(this.f41667c0);
        setMaxProgress(this.f41666b0);
    }

    /* renamed from: d */
    private void m39575d(float f11) {
        long j11;
        if (this.f41671g0 != f11) {
            j11 = System.currentTimeMillis() - this.f41672h0;
        } else {
            j11 = 0;
        }
        if (this.f41661T) {
            this.f41673i0.m17371a(j11);
            float f12 = this.f41671g0;
            if (f12 > f11) {
                this.f41673i0.m17381k(1);
                return;
            } else {
                if (f12 < f11) {
                    this.f41673i0.m17382l(1);
                    return;
                }
                return;
            }
        }
        if (this.f41662U) {
            this.f41673i0.m17371a(j11);
            float f13 = this.f41671g0;
            if (f13 > f11) {
                this.f41673i0.m17383m(1);
                return;
            } else {
                if (f13 < f11) {
                    this.f41673i0.m17384n(1);
                    return;
                }
                return;
            }
        }
        if (this.f41664W) {
            this.f41673i0.m17371a(j11);
            float f14 = this.f41671g0;
            if (f14 > f11) {
                this.f41673i0.m17385o(1);
                return;
            } else {
                if (f14 < f11) {
                    this.f41673i0.m17386p(1);
                    return;
                }
                return;
            }
        }
        if (this.f41663V) {
            this.f41673i0.m17371a(j11);
            this.f41673i0.m17380j(1);
        }
    }

    /* renamed from: a */
    void m39576a(Canvas canvas, float f11) {
        if (this.f41660S != null) {
            RectF rectF = this.f41658Q;
            float f12 = this.f41674p;
            rectF.set(f11 - f12, 0.0f, (f11 - f12) + AbstractC23136l9.m118742r(44.0f), AbstractC23136l9.m118742r(14.0f));
            float width = this.f41660S.getWidth();
            float height = this.f41660S.getHeight();
            float centerX = this.f41658Q.centerX() - (width / 2.0f);
            float centerY = this.f41658Q.centerY() - (height / 2.0f);
            RectF rectF2 = this.f41658Q;
            int i11 = AbstractC23222t7.f112552c;
            canvas.drawRoundRect(rectF2, i11, i11, this.f41647F);
            canvas.save();
            canvas.translate(centerX, centerY);
            this.f41660S.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: b */
    void m39577b(Canvas canvas, float f11) {
        if (this.f41660S != null) {
            this.f41659R.set((this.f41674p + f11) - AbstractC23136l9.m118742r(44.0f), 0.0f, f11 + this.f41674p, AbstractC23136l9.m118742r(14.0f));
            float width = this.f41660S.getWidth();
            float height = this.f41660S.getHeight();
            float centerX = this.f41659R.centerX() - (width / 2.0f);
            float centerY = this.f41659R.centerY() - (height / 2.0f);
            RectF rectF = this.f41659R;
            int i11 = AbstractC23222t7.f112552c;
            canvas.drawRoundRect(rectF, i11, i11, this.f41647F);
            canvas.save();
            canvas.translate(centerX, centerY);
            this.f41660S.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: c */
    public void m39578c(int i11, int i12, int i13, int i14, int i15) {
        this.f41674p = i11;
        this.f41675q = i12;
        this.f41678t = i13;
        this.f41680v = i14;
        this.f41681w = i15;
    }

    public float getLeftProgress() {
        return this.f41684z;
    }

    public float getProgress() {
        return this.f41683y;
    }

    public float getRightProgress() {
        return this.f41642A;
    }

    public C3451b getVideoTrimLogInfo() {
        return this.f41673i0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC7767a abstractC7767a;
        AbstractC7767a abstractC7767a2;
        try {
            float measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth - (this.f41674p * 2.0f);
            float measuredHeight = getMeasuredHeight();
            float f12 = this.f41684z * f11;
            float f13 = this.f41674p;
            float f14 = f12 + f13;
            float f15 = (f11 * this.f41642A) + f13;
            float f16 = this.f41675q;
            float f17 = (((f15 - f14) - f16) * this.f41683y) + (f16 / 2.0f) + f14;
            this.f41651J.set(this.f41680v, this.f41678t, f13, measuredHeight - this.f41679u);
            this.f41653L.set(0.0f, this.f41678t, this.f41674p, measuredHeight - this.f41679u);
            this.f41652K.set(measuredWidth - this.f41674p, this.f41678t, measuredWidth - this.f41680v, measuredHeight - this.f41679u);
            this.f41654M.set(measuredWidth - this.f41674p, this.f41678t, measuredWidth, measuredHeight - this.f41679u);
            canvas.drawRect(this.f41651J, this.f41650I);
            RectF rectF = this.f41653L;
            float f18 = this.f41680v;
            canvas.drawRoundRect(rectF, f18, f18, this.f41650I);
            canvas.drawRect(this.f41652K, this.f41650I);
            RectF rectF2 = this.f41654M;
            float f19 = this.f41680v;
            canvas.drawRoundRect(rectF2, f19, f19, this.f41650I);
            float f21 = this.f41680v;
            float f22 = this.f41678t;
            canvas.drawRect(f21, f22, measuredWidth - f21, f22 + AbstractC23136l9.m118742r(4.0f), this.f41650I);
            canvas.drawRect(this.f41680v, measuredHeight - AbstractC23136l9.m118742r(6.0f), measuredWidth - this.f41680v, measuredHeight - AbstractC23136l9.m118742r(2.0f), this.f41650I);
            canvas.drawRect(this.f41674p, AbstractC23136l9.m118742r(4.0f) + this.f41678t, f14, (measuredHeight - this.f41679u) - AbstractC23136l9.m118742r(4.0f), this.f41648G);
            canvas.drawRect(f15, this.f41678t + AbstractC23136l9.m118742r(4.0f), measuredWidth - this.f41674p, (measuredHeight - this.f41679u) - AbstractC23136l9.m118742r(4.0f), this.f41648G);
            canvas.drawRect(this.f41680v + (f14 - this.f41674p), this.f41678t, f14, measuredHeight - this.f41679u, this.f41644C);
            this.f41655N.set(f14 - this.f41674p, this.f41678t, f14, measuredHeight - this.f41679u);
            RectF rectF3 = this.f41655N;
            float f23 = this.f41680v;
            canvas.drawRoundRect(rectF3, f23, f23, this.f41644C);
            float f24 = this.f41674p;
            float f25 = this.f41676r;
            float f26 = this.f41678t;
            float f27 = this.f41677s;
            canvas.drawRect((f14 - (f24 / 2.0f)) - (f25 / 2.0f), ((measuredHeight + f26) / 2.0f) - (f27 / 2.0f), (f14 - (f24 / 2.0f)) + (f25 / 2.0f), (f27 / 2.0f) + ((f26 + measuredHeight) / 2.0f), this.f41649H);
            canvas.drawRect(f15, this.f41678t, (this.f41674p + f15) - this.f41680v, measuredHeight - this.f41679u, this.f41644C);
            this.f41656O.set(f15, this.f41678t, this.f41674p + f15, measuredHeight - this.f41679u);
            RectF rectF4 = this.f41656O;
            float f28 = this.f41680v;
            canvas.drawRoundRect(rectF4, f28, f28, this.f41644C);
            float f29 = this.f41674p;
            float f31 = this.f41676r;
            float f32 = this.f41678t;
            float f33 = this.f41677s;
            canvas.drawRect(((f29 / 2.0f) + f15) - (f31 / 2.0f), ((measuredHeight + f32) / 2.0f) - (f33 / 2.0f), (f29 / 2.0f) + f15 + (f31 / 2.0f), (f33 / 2.0f) + ((f32 + measuredHeight) / 2.0f), this.f41649H);
            float f34 = this.f41678t;
            canvas.drawRect(f14, f34, f15, f34 + AbstractC23136l9.m118742r(4.0f), this.f41644C);
            canvas.drawRect(f14, measuredHeight - AbstractC23136l9.m118742r(6.0f), f15, measuredHeight - AbstractC23136l9.m118742r(2.0f), this.f41644C);
            this.f41657P.set(f17 - (this.f41675q / 2.0f), this.f41678t - AbstractC23136l9.m118742r(2.0f), f17 + (this.f41675q / 2.0f), measuredHeight);
            RectF rectF5 = this.f41657P;
            float f35 = this.f41681w;
            canvas.drawRoundRect(rectF5, f35, f35, this.f41645D);
            if (this.f41661T && (abstractC7767a2 = this.f41682x) != null) {
                setText(abstractC7767a2.mo39608b());
                m39576a(canvas, f14);
            }
            if (this.f41662U && (abstractC7767a = this.f41682x) != null) {
                setText(abstractC7767a.mo39607a());
                m39577b(canvas, f15);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        if (motionEvent == null || this.f41669e0) {
            return false;
        }
        float x11 = motionEvent.getX();
        float rawY = motionEvent.getRawY();
        float measuredWidth = getMeasuredWidth();
        float f11 = this.f41674p;
        float f12 = measuredWidth - (f11 * 2.0f);
        float f13 = (this.f41684z * f12) + f11;
        float f14 = (this.f41642A * f12) + f11;
        float f15 = this.f41675q;
        float f16 = (f14 - f13) - f15;
        float f17 = (this.f41683y * f16) + (f15 / 2.0f) + f13;
        if (x11 >= f13 - (f11 * 3.5f) && x11 <= (f11 * 0.5f) + f13) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (x11 >= f14 - (0.5f * f11) && x11 <= (f11 * 3.5f) + f14) {
            z12 = true;
        } else {
            z12 = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f41672h0 = System.currentTimeMillis();
            this.f41670f0 = x11;
            this.f41671g0 = x11;
            if (rawY < AbstractC23136l9.m118742r(48.0f)) {
                return false;
            }
            if (z11) {
                this.f41661T = true;
                getParent().requestDisallowInterceptTouchEvent(true);
                invalidate();
                return true;
            }
            if (z12) {
                this.f41662U = true;
                getParent().requestDisallowInterceptTouchEvent(true);
                invalidate();
                return true;
            }
            float f18 = (this.f41675q * 2.0f) / 2.0f;
            if (x11 >= f17 - f18 && x11 <= f17 + f18) {
                this.f41663V = true;
                getParent().requestDisallowInterceptTouchEvent(true);
                invalidate();
                return true;
            }
            if (!this.f41663V) {
                float f19 = this.f41674p;
                if (x11 > f13 + (f19 * 0.25f) && x11 < f14 - (f19 * 0.25f) && (this.f41684z > 0.0f || this.f41642A < 1.0f)) {
                    this.f41664W = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            }
        } else if (action != 1 && action != 3) {
            if (action == 2) {
                float f21 = x11 - this.f41670f0;
                this.f41670f0 = x11;
                if (this.f41661T) {
                    if (!this.f41665a0) {
                        if (Math.abs((f13 - (this.f41674p / 2.0f)) - x11) < this.f41674p / 2.0f) {
                            return false;
                        }
                        this.f41665a0 = true;
                    }
                    this.f41645D.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.transparent));
                    float f22 = this.f41674p;
                    if (x11 < f22) {
                        x11 = f22;
                    } else if (x11 + 1.0f > f14) {
                        x11 = f14 - 1.0f;
                    } else if (x11 > f14) {
                        x11 = f14;
                    }
                    float f23 = (x11 - f22) / f12;
                    this.f41684z = f23;
                    float f24 = this.f41642A;
                    float f25 = f24 - f23;
                    float f26 = this.f41643B;
                    if (f25 >= f26) {
                        this.f41684z = f24 - f26;
                    } else {
                        float f27 = f24 - f23;
                        float f28 = this.f41667c0;
                        if (f27 < f28) {
                            this.f41684z = f24 - f28;
                        }
                    }
                    this.f41683y = 0.0f;
                    AbstractC7767a abstractC7767a = this.f41682x;
                    if (abstractC7767a != null) {
                        abstractC7767a.mo39610d(this.f41684z);
                        this.f41682x.mo39611e(this.f41683y);
                    }
                    invalidate();
                    return true;
                }
                if (this.f41662U) {
                    if (!this.f41665a0) {
                        if (Math.abs((f14 + (this.f41674p / 2.0f)) - x11) < this.f41674p / 2.0f) {
                            return false;
                        }
                        this.f41665a0 = true;
                    }
                    this.f41645D.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.transparent));
                    float f29 = this.f41674p;
                    if (x11 > f12 + f29) {
                        x11 = f12 + f29;
                    } else if (x11 - 1.0f < f13) {
                        x11 = f13 + 1.0f;
                    } else if (x11 < f13) {
                        x11 = f13;
                    }
                    float f31 = (x11 - f29) / f12;
                    this.f41642A = f31;
                    float f32 = this.f41684z;
                    float f33 = f31 - f32;
                    float f34 = this.f41643B;
                    if (f33 >= f34) {
                        this.f41642A = f32 + f34;
                    } else {
                        float f35 = f31 - f32;
                        float f36 = this.f41667c0;
                        if (f35 < f36) {
                            this.f41642A = f32 + f36;
                        }
                    }
                    this.f41683y = 1.0f;
                    AbstractC7767a abstractC7767a2 = this.f41682x;
                    if (abstractC7767a2 != null) {
                        abstractC7767a2.mo39612f(this.f41642A);
                        this.f41682x.mo39611e(this.f41683y);
                    }
                    invalidate();
                    return true;
                }
                if (this.f41663V) {
                    if (!this.f41665a0) {
                        if (Math.abs(f17 - x11) < this.f41675q / 1.5f) {
                            return false;
                        }
                        this.f41665a0 = true;
                    }
                    this.f41645D.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.solid_yellow));
                    float f37 = this.f41675q;
                    if (x11 > f14 - (f37 / 2.0f)) {
                        x11 = f14 - (f37 / 2.0f);
                    } else if (x11 < (f37 / 2.0f) + f13) {
                        x11 = (f37 / 2.0f) + f13;
                    }
                    float f38 = ((x11 - f13) - (f37 / 2.0f)) / f16;
                    this.f41683y = f38;
                    AbstractC7767a abstractC7767a3 = this.f41682x;
                    if (abstractC7767a3 != null) {
                        abstractC7767a3.mo39611e(f38);
                    }
                    invalidate();
                    return true;
                }
                if (this.f41664W) {
                    this.f41645D.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.transparent));
                    if (!this.f41665a0) {
                        this.f41665a0 = true;
                    }
                    float f39 = f13 + f21;
                    float f41 = f14 + f21;
                    float f42 = this.f41674p;
                    if (f39 < f42) {
                        f39 = f42;
                    } else {
                        float f43 = this.f41675q;
                        if (f39 + f43 > f41) {
                            f39 = f41 - f43;
                        } else if (f39 > f41) {
                            f39 = f41;
                        }
                    }
                    if (f41 > f12 + f42) {
                        f41 = f12 + f42;
                    } else {
                        float f44 = this.f41675q;
                        if (f41 - f44 < f39) {
                            f41 = f39 + f44;
                        } else if (f41 < f39) {
                            f41 = f39;
                        }
                    }
                    float f45 = (f39 - f42) / f12;
                    float f46 = (f41 - f42) / f12;
                    float f47 = this.f41642A;
                    float f48 = this.f41684z;
                    float f49 = f47 - f48;
                    if (f46 - f45 != f49) {
                        if (f21 < 0.0f) {
                            f46 = f45 + f49;
                        } else if (f21 > 0.0f) {
                            f45 = f46 - f49;
                        }
                    }
                    if (f48 != f45 && f47 != f46) {
                        this.f41684z = f45;
                        this.f41642A = f46;
                        this.f41683y = 0.0f;
                        float f51 = f46 - f45;
                        float f52 = this.f41666b0;
                        if (f51 >= f52) {
                            this.f41684z = f46 - f52;
                        } else {
                            float f53 = f46 - f45;
                            float f54 = this.f41667c0;
                            if (f53 < f54) {
                                this.f41684z = f46 - f54;
                            }
                        }
                        float f55 = this.f41684z;
                        if (f46 - f55 >= f52) {
                            this.f41642A = f52 + f55;
                        } else {
                            float f56 = f46 - f55;
                            float f57 = this.f41667c0;
                            if (f56 < f57) {
                                this.f41642A = f57 + f55;
                            }
                        }
                        AbstractC7767a abstractC7767a4 = this.f41682x;
                        if (abstractC7767a4 != null) {
                            abstractC7767a4.mo39610d(f55);
                            this.f41682x.mo39612f(this.f41642A);
                            this.f41682x.mo39611e(this.f41683y);
                        }
                        invalidate();
                        return true;
                    }
                }
            }
        } else {
            this.f41645D.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
            AbstractC7767a abstractC7767a5 = this.f41682x;
            if (abstractC7767a5 != null) {
                abstractC7767a5.mo39609c(true, this.f41663V);
            }
            m39575d(x11);
            this.f41665a0 = false;
            this.f41664W = false;
            this.f41663V = false;
            this.f41662U = false;
            this.f41661T = false;
            invalidate();
            return true;
        }
        return false;
    }

    public void setDisableTouch(boolean z11) {
        this.f41669e0 = z11;
    }

    public void setLeftProgress(float f11) {
        this.f41684z = f11;
    }

    public void setMaxDistanceLeftToRightProcess(float f11) {
        this.f41643B = f11;
    }

    public void setMaxProgress(float f11) {
        if (f11 >= 0.0f && f11 <= 1.0f && this.f41667c0 <= f11) {
            this.f41666b0 = f11;
            float f12 = this.f41642A;
            float f13 = this.f41684z;
            if (f12 - f13 > f11) {
                this.f41642A = f13 + f11;
                invalidate();
            }
        }
    }

    public void setMinProgress(float f11) {
        if (f11 >= 0.0f && f11 <= 1.0f && f11 <= this.f41666b0) {
            this.f41667c0 = f11;
            float f12 = this.f41642A;
            float f13 = this.f41684z;
            if (f12 - f13 < f11) {
                this.f41642A = f13 + f11;
                invalidate();
            }
        }
    }

    public void setProgress(float f11) {
        float f12 = this.f41683y;
        if (f12 >= 0.0f && f12 <= 1.0d) {
            this.f41683y = f11;
            invalidate();
        }
    }

    public void setRightProgress(float f11) {
        this.f41642A = f11;
    }

    void setText(String str) {
        if (this.f41646E != null && !TextUtils.isEmpty(str)) {
            this.f41660S = new StaticLayout(str, this.f41646E, (int) this.f41646E.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            this.f41660S = null;
        }
    }

    public void setVideoSeekBarListener(AbstractC7767a abstractC7767a) {
        this.f41682x = abstractC7767a;
    }
}
