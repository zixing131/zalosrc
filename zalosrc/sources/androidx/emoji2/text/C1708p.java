package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p469r1.C25599a;

/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes2.dex */
public class C1708p {

    /* renamed from: d */
    private static final ThreadLocal f6893d = new ThreadLocal();

    /* renamed from: a */
    private final int f6894a;

    /* renamed from: b */
    private final C1706n f6895b;

    /* renamed from: c */
    private volatile int f6896c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1708p(C1706n c1706n, int i11) {
        this.f6895b = c1706n;
        this.f6894a = i11;
    }

    /* renamed from: g */
    private C25599a m8754g() {
        ThreadLocal threadLocal = f6893d;
        C25599a c25599a = (C25599a) threadLocal.get();
        if (c25599a == null) {
            c25599a = new C25599a();
            threadLocal.set(c25599a);
        }
        this.f6895b.m8747d().m132246j(c25599a, this.f6894a);
        return c25599a;
    }

    /* renamed from: a */
    public void m8755a(Canvas canvas, float f11, float f12, Paint paint) {
        Typeface m8749f = this.f6895b.m8749f();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m8749f);
        canvas.drawText(this.f6895b.m8746c(), this.f6894a * 2, 2, f11, f12, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m8756b(int i11) {
        return m8754g().m132235h(i11);
    }

    /* renamed from: c */
    public int m8757c() {
        return m8754g().m132236i();
    }

    /* renamed from: d */
    public int m8758d() {
        return this.f6896c & 3;
    }

    /* renamed from: e */
    public int m8759e() {
        return m8754g().m132238k();
    }

    /* renamed from: f */
    public int m8760f() {
        return m8754g().m132239l();
    }

    /* renamed from: h */
    public short m8761h() {
        return m8754g().m132240m();
    }

    /* renamed from: i */
    public int m8762i() {
        return m8754g().m132241n();
    }

    /* renamed from: j */
    public boolean m8763j() {
        return m8754g().m132237j();
    }

    /* renamed from: k */
    public boolean m8764k() {
        return (this.f6896c & 4) > 0;
    }

    /* renamed from: l */
    public void m8765l(boolean z11) {
        int m8758d = m8758d();
        if (z11) {
            this.f6896c = m8758d | 4;
        } else {
            this.f6896c = m8758d;
        }
    }

    /* renamed from: m */
    public void m8766m(boolean z11) {
        int i11 = this.f6896c & 4;
        this.f6896c = z11 ? i11 | 2 : i11 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(m8760f()));
        sb2.append(", codepoints:");
        int m8757c = m8757c();
        for (int i11 = 0; i11 < m8757c; i11++) {
            sb2.append(Integer.toHexString(m8756b(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
