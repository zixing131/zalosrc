package com.zing.zalo.p077ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.widget.c2 */
/* loaded from: classes6.dex */
public class C13573c2 {

    /* renamed from: a */
    private final WeakReference f69912a;

    /* renamed from: b */
    public int f69913b = AbstractC23136l9.m118742r(30.0f);

    /* renamed from: c */
    public int f69914c;

    /* renamed from: d */
    int f69915d;

    /* renamed from: e */
    int f69916e;

    /* renamed from: f */
    Paint f69917f;

    /* renamed from: g */
    Paint f69918g;

    /* renamed from: h */
    Handler f69919h;

    /* renamed from: i */
    Runnable f69920i;

    /* renamed from: j */
    int[] f69921j;

    /* renamed from: k */
    boolean[] f69922k;

    /* renamed from: l */
    RectF[] f69923l;

    /* renamed from: m */
    RectF f69924m;

    /* renamed from: n */
    int f69925n;

    /* renamed from: o */
    int f69926o;

    /* renamed from: p */
    int f69927p;

    /* renamed from: q */
    int f69928q;

    /* renamed from: r */
    boolean f69929r;

    /* renamed from: s */
    boolean f69930s;

    public C13573c2(InterfaceC13612d2 interfaceC13612d2) {
        int m118742r = AbstractC23136l9.m118742r(28.0f);
        this.f69914c = m118742r;
        this.f69915d = m118742r - AbstractC23136l9.m118742r(8.0f);
        this.f69916e = AbstractC23136l9.m118742r(5.0f);
        this.f69924m = new RectF();
        this.f69928q = AbstractC23136l9.m118742r(2.0f);
        this.f69929r = false;
        this.f69930s = true;
        this.f69912a = new WeakReference(interfaceC13612d2);
        m76028d();
        m76026b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m76024e() {
        int i11 = 0;
        while (true) {
            try {
                int[] iArr = this.f69921j;
                if (i11 >= iArr.length) {
                    break;
                }
                boolean[] zArr = this.f69922k;
                if (zArr[i11]) {
                    int i12 = iArr[i11] + 1;
                    iArr[i11] = i12;
                    if (i12 == this.f69915d) {
                        zArr[i11] = false;
                    }
                } else {
                    int i13 = iArr[i11] - 1;
                    iArr[i11] = i13;
                    if (i13 == this.f69916e) {
                        zArr[i11] = true;
                    }
                }
                i11++;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        InterfaceC13612d2 interfaceC13612d2 = (InterfaceC13612d2) this.f69912a.get();
        interfaceC13612d2.invalidate();
        this.f69919h.postDelayed(this.f69920i, 1L);
        if (!interfaceC13612d2.mo75888d()) {
            m76035l(1);
        }
    }

    /* renamed from: m */
    private void m76025m() {
        int i11;
        int i12;
        if (this.f69914c > AbstractC23136l9.m118742r(8.0f)) {
            i11 = this.f69914c - AbstractC23136l9.m118742r(8.0f);
        } else {
            i11 = this.f69914c;
        }
        this.f69915d = i11;
        this.f69916e = Math.min(i11, AbstractC23136l9.m118742r(5.0f));
        if (this.f69914c > AbstractC23136l9.m118742r(3.0f)) {
            i12 = this.f69914c - AbstractC23136l9.m118742r(3.0f);
        } else {
            i12 = this.f69914c;
        }
        this.f69927p = i12;
    }

    /* renamed from: b */
    void m76026b() {
        try {
            Paint paint = new Paint(1);
            this.f69917f = paint;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            this.f69917f.setColor(-1);
            Paint paint2 = new Paint(1);
            this.f69918g = paint2;
            paint2.setStyle(style);
            this.f69918g.setColor(1275068416);
            this.f69919h = new Handler(Looper.getMainLooper());
            this.f69920i = new Runnable() { // from class: com.zing.zalo.ui.widget.b2
                @Override // java.lang.Runnable
                public final void run() {
                    C13573c2.this.m76024e();
                }
            };
            m76027c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    void m76027c() {
        try {
            int[] iArr = new int[4];
            this.f69921j = iArr;
            iArr[0] = AbstractC23136l9.m118742r(12.0f);
            this.f69921j[1] = AbstractC23136l9.m118742r(5.0f);
            this.f69921j[2] = AbstractC23136l9.m118742r(18.0f);
            this.f69921j[3] = AbstractC23136l9.m118742r(10.0f);
            this.f69922k = r1;
            boolean[] zArr = {false, true, false, true};
            this.f69923l = new RectF[4];
            for (int i11 = 0; i11 < 4; i11++) {
                this.f69923l[i11] = new RectF(this.f69926o + ((this.f69925n + AbstractC23136l9.m118742r(2.0f)) * i11), this.f69927p - this.f69921j[i11], this.f69926o + ((this.f69925n + AbstractC23136l9.m118742r(2.0f)) * i11) + this.f69925n, this.f69927p);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    void m76028d() {
        this.f69913b = AbstractC23136l9.m118742r(30.0f);
        int m118742r = AbstractC23136l9.m118742r(28.0f);
        this.f69914c = m118742r;
        this.f69915d = m118742r - AbstractC23136l9.m118742r(8.0f);
        this.f69916e = AbstractC23136l9.m118742r(5.0f);
        this.f69925n = AbstractC23136l9.m118742r(3.0f);
        this.f69926o = AbstractC23136l9.m118742r(15.0f);
        this.f69927p = this.f69914c - AbstractC23136l9.m118742r(3.0f);
        this.f69928q = AbstractC23136l9.m118742r(2.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m76029f(Canvas canvas) {
        for (int i11 = 0; i11 < this.f69921j.length; i11++) {
            try {
                this.f69923l[i11].set(this.f69926o + ((this.f69925n + AbstractC23136l9.m118742r(2.0f)) * i11), this.f69927p - this.f69921j[i11], this.f69926o + ((this.f69925n + AbstractC23136l9.m118742r(2.0f)) * i11) + this.f69925n, this.f69927p);
                this.f69924m.set((this.f69926o + ((this.f69925n + AbstractC23136l9.m118742r(2.0f)) * i11)) - AbstractC23136l9.m118742r(1.0f), (this.f69927p - this.f69921j[i11]) - AbstractC23136l9.m118742r(1.0f), this.f69926o + ((this.f69925n + AbstractC23136l9.m118742r(2.0f)) * i11) + this.f69925n + AbstractC23136l9.m118742r(1.0f), this.f69927p);
                if (this.f69930s) {
                    RectF rectF = this.f69924m;
                    int i12 = this.f69928q;
                    canvas.drawRoundRect(rectF, i12, i12, this.f69918g);
                }
                RectF rectF2 = this.f69923l[i11];
                int i13 = this.f69928q;
                canvas.drawRoundRect(rectF2, i13, i13, this.f69917f);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: g */
    public void m76030g(int i11) {
        this.f69925n = i11;
        m76026b();
    }

    /* renamed from: h */
    public void m76031h(int i11) {
        this.f69926o = i11;
        m76026b();
    }

    /* renamed from: i */
    public void m76032i(int i11) {
        Paint paint = this.f69918g;
        if (paint != null) {
            paint.setColor(i11);
        }
    }

    /* renamed from: j */
    public void m76033j(boolean z11) {
        this.f69930s = z11;
    }

    /* renamed from: k */
    public void m76034k(int i11, int i12) {
        this.f69913b = i11;
        this.f69914c = i12;
        m76025m();
        m76026b();
    }

    /* renamed from: l */
    public void m76035l(int i11) {
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f69929r = false;
                    if (this.f69919h == null) {
                        this.f69919h = new Handler(Looper.getMainLooper());
                    }
                    this.f69919h.removeCallbacks(this.f69920i);
                    m76027c();
                    return;
                }
                return;
            }
            if (!this.f69929r) {
                this.f69929r = true;
                if (this.f69919h == null) {
                    this.f69919h = new Handler(Looper.getMainLooper());
                }
                this.f69919h.removeCallbacks(this.f69920i);
                this.f69919h.postDelayed(this.f69920i, 1L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
