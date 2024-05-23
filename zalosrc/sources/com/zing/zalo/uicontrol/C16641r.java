package com.zing.zalo.uicontrol;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: com.zing.zalo.uicontrol.r */
/* loaded from: classes4.dex */
public class C16641r extends Drawable {

    /* renamed from: b */
    private long f83910b;

    /* renamed from: c */
    private int f83911c;

    /* renamed from: d */
    private int f83912d;

    /* renamed from: e */
    private int f83913e;

    /* renamed from: g */
    private boolean f83915g;

    /* renamed from: h */
    Drawable[] f83916h;

    /* renamed from: i */
    a f83917i;

    /* renamed from: j */
    boolean f83918j;

    /* renamed from: a */
    private int f83909a = 2;

    /* renamed from: f */
    private int f83914f = 0;

    /* renamed from: com.zing.zalo.uicontrol.r$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo88421a();
    }

    public C16641r(Drawable[] drawableArr) {
        this.f83916h = drawableArr;
    }

    /* renamed from: a */
    Drawable m88417a() {
        Drawable[] drawableArr = this.f83916h;
        if (drawableArr != null && drawableArr.length >= 2) {
            return drawableArr[1];
        }
        return null;
    }

    /* renamed from: b */
    public void m88418b(boolean z11) {
        this.f83915g = z11;
    }

    /* renamed from: c */
    public void m88419c(a aVar) {
        this.f83918j = true;
        this.f83917i = aVar;
    }

    /* renamed from: d */
    public void m88420d(int i11) {
        this.f83911c = 0;
        this.f83912d = 255;
        this.f83914f = 0;
        this.f83913e = i11;
        this.f83909a = 0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z11;
        try {
            int i11 = this.f83909a;
            if (i11 != 0) {
                if (i11 == 1 && this.f83910b >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f83910b)) / this.f83913e;
                    if (uptimeMillis >= 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    float min = Math.min(uptimeMillis, 1.0f);
                    this.f83914f = (int) (this.f83911c + ((this.f83912d - r3) * min));
                }
                z11 = true;
            } else {
                this.f83910b = SystemClock.uptimeMillis();
                this.f83909a = 1;
                z11 = false;
            }
            int i12 = this.f83914f;
            boolean z12 = this.f83915g;
            if (z11) {
                if (!z12 || i12 == 0) {
                    this.f83916h[0].draw(canvas);
                }
                if (i12 == 255) {
                    this.f83916h[1].draw(canvas);
                }
                a aVar = this.f83917i;
                if (aVar != null && this.f83918j) {
                    this.f83918j = false;
                    aVar.mo88421a();
                    return;
                }
                return;
            }
            Drawable drawable = this.f83916h[0];
            if (z12) {
                drawable.setAlpha(255 - i12);
            }
            drawable.draw(canvas);
            if (z12) {
                drawable.setAlpha(255);
            }
            if (i12 > 0) {
                Drawable drawable2 = this.f83916h[1];
                drawable2.setAlpha(i12);
                drawable2.draw(canvas);
                drawable2.setAlpha(255);
            }
            if (!z11) {
                invalidateSelf();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable m88417a = m88417a();
        if (m88417a != null) {
            return m88417a.getOpacity();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        Drawable m88417a = m88417a();
        if (m88417a != null) {
            m88417a.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable m88417a = m88417a();
        if (m88417a != null) {
            m88417a.setColorFilter(colorFilter);
        }
    }
}
