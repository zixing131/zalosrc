package sj0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: sj0.d */
/* loaded from: classes7.dex */
public class C26279d {

    /* renamed from: a */
    private float f124764a;

    /* renamed from: b */
    private int f124765b = 1500;

    /* renamed from: c */
    private Drawable f124766c;

    /* renamed from: d */
    private long f124767d;

    /* renamed from: e */
    private long f124768e;

    public C26279d(Drawable drawable) {
        this.f124766c = drawable;
    }

    /* renamed from: b */
    private void m135220b() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f124767d;
        this.f124767d = currentTimeMillis;
        long j12 = this.f124768e + j11;
        int i11 = this.f124765b;
        long j13 = j12 % i11;
        this.f124768e = j13;
        this.f124764a = ((float) (j13 * 360)) / i11;
    }

    /* renamed from: a */
    public void m135221a(Canvas canvas) {
        if (this.f124766c == null) {
            return;
        }
        canvas.save();
        canvas.rotate(this.f124764a, this.f124766c.getBounds().centerX(), this.f124766c.getBounds().centerY());
        this.f124766c.draw(canvas);
        canvas.restore();
        m135220b();
    }
}
