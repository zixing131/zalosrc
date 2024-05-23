package com.zing.mp3.sdk.view.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p156fb.AbstractC18863i;

/* loaded from: classes3.dex */
public class WaveBar extends View {

    /* renamed from: A */
    public static final int[] f37664A = {14, 15, 16, 17, 18, 19, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 19, 18, 17, 16, 15, 14, 15, 16, 17, 18, 19, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    /* renamed from: B */
    public static final int[] f37665B = {6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 10, 11, 10, 9, 8, 7, 6, 5, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7};

    /* renamed from: C */
    public static final int[] f37666C = {7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 15, 14, 13, 12, 11, 10, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 6, 7, 8, 9, 10, 11, 10, 9, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10};

    /* renamed from: D */
    public static final int[] f37667D = {19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 9, 10, 11, 12, 13, 14, 15, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    /* renamed from: E */
    public static final int f37668E = 2940;

    /* renamed from: F */
    public static float f37669F;

    /* renamed from: p */
    public Paint f37670p;

    /* renamed from: q */
    public float f37671q;

    /* renamed from: r */
    public RectF[] f37672r;

    /* renamed from: s */
    public int f37673s;

    /* renamed from: t */
    public int f37674t;

    /* renamed from: u */
    public int f37675u;

    /* renamed from: v */
    public int f37676v;

    /* renamed from: w */
    public float f37677w;

    /* renamed from: x */
    public float f37678x;

    /* renamed from: y */
    public long f37679y;

    /* renamed from: z */
    public boolean f37680z;

    public WaveBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void m35296a(AttributeSet attributeSet, int i11) {
        this.f37670p = new Paint();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC18863i.WaveBar, 0, i11);
        try {
            this.f37670p.setColor(obtainStyledAttributes.getColor(AbstractC18863i.WaveBar_zingmp3sdk_wb_color, 0));
            this.f37671q = obtainStyledAttributes.getDimension(AbstractC18863i.WaveBar_zingmp3sdk_wb_radius, 0.0f);
            this.f37675u = obtainStyledAttributes.getInt(AbstractC18863i.WaveBar_zingmp3sdk_wb_bar_count, 4);
            obtainStyledAttributes.recycle();
            this.f37670p.setStyle(Paint.Style.FILL);
            this.f37670p.setAntiAlias(true);
            this.f37672r = new RectF[this.f37675u];
            for (int i12 = 0; i12 < this.f37675u; i12++) {
                this.f37672r[i12] = new RectF();
            }
            this.f37673s = 0;
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.view.View
    public final int getBaseline() {
        return this.f37674t - this.f37676v;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i11;
        int i12;
        float f11;
        super.onDraw(canvas);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        if (this.f37680z) {
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f37679y) % f37668E)) / 42.0f;
            f37669F = currentTimeMillis;
            if (currentTimeMillis < 0.0f) {
                f37669F = 0.0f;
            } else if (currentTimeMillis > 69.0f) {
                f37669F = 69.0f;
            }
        }
        for (int i13 = 0; i13 < this.f37675u; i13++) {
            float f12 = this.f37678x;
            float f13 = f37669F;
            int i14 = (int) f13;
            int i15 = (i14 + 1) % 70;
            float f14 = f13 % 1.0f;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            i11 = 0;
                        } else {
                            i11 = f37667D[i14];
                        }
                    } else {
                        i11 = f37666C[i14];
                    }
                } else {
                    i11 = f37665B[i14];
                }
            } else {
                i11 = f37664A[i14];
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            i12 = 0;
                        } else {
                            i12 = f37667D[i15];
                        }
                    } else {
                        i12 = f37666C[i15];
                    }
                } else {
                    i12 = f37665B[i15];
                }
            } else {
                i12 = f37664A[i15];
            }
            float abs = Math.abs(i11 - i12) * f14;
            float f15 = i11;
            if (i11 > i12) {
                f11 = f15 - abs;
            } else {
                f11 = f15 + abs;
            }
            int i16 = (int) (f12 * f11);
            RectF rectF = this.f37672r[i13];
            float f16 = this.f37677w;
            float f17 = i13 * 2 * f16;
            float f18 = paddingStart;
            int i17 = this.f37674t;
            int i18 = this.f37676v;
            rectF.set(f17 + f18, ((i17 - i16) - i18) + paddingTop, f17 + f16 + f18, (i17 - i18) + paddingTop);
            RectF rectF2 = this.f37672r[i13];
            float f19 = this.f37671q;
            canvas.drawRoundRect(rectF2, f19, f19, this.f37670p);
        }
        if (this.f37680z) {
            postInvalidateDelayed(30L);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f37673s = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        this.f37674t = measuredHeight;
        float f11 = (this.f37675u * 2) - 1;
        float f12 = this.f37673s / f11;
        this.f37677w = f12;
        float f13 = f12 * f11;
        this.f37678x = f13 / 20.0f;
        this.f37676v = (int) ((measuredHeight - f13) / 2.0f);
    }

    public WaveBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f37675u = 4;
        m35296a(attributeSet, i11);
    }
}
