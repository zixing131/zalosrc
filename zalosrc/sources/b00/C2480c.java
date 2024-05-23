package b00;

import a00.AbstractC0016a;
import a00.C0018c;
import a00.InterfaceC0017b;
import android.graphics.PointF;
import i00.C20180c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b00.c */
/* loaded from: classes4.dex */
public class C2480c implements Cloneable {

    /* renamed from: t */
    public static final C2480c f10102t = m12518b();

    /* renamed from: p */
    private InterfaceC0017b f10103p;

    /* renamed from: q */
    private InterfaceC0017b f10104q;

    /* renamed from: r */
    private InterfaceC0017b f10105r;

    /* renamed from: s */
    private InterfaceC0017b f10106s;

    public C2480c(InterfaceC0017b interfaceC0017b, InterfaceC0017b interfaceC0017b2, InterfaceC0017b interfaceC0017b3, InterfaceC0017b interfaceC0017b4) {
        this.f10103p = new C0018c();
        this.f10104q = new C0018c();
        this.f10105r = new C0018c();
        new C0018c();
        this.f10103p = interfaceC0017b;
        this.f10104q = interfaceC0017b2;
        this.f10105r = interfaceC0017b3;
        this.f10106s = interfaceC0017b4;
    }

    /* renamed from: b */
    public static C2480c m12518b() {
        return new C2480c(new float[][]{new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}});
    }

    /* renamed from: c */
    public static C2480c m12519c(int i11, int i12) {
        float f11 = i11 - 1;
        float[] fArr = {f11, 0.0f};
        float f12 = i12 - 1;
        return new C2480c(new float[][]{new float[]{0.0f, 0.0f}, fArr, new float[]{f11, f12}, new float[]{0.0f, f12}});
    }

    /* renamed from: j */
    private boolean m12520j() {
        if (this.f10103p.getX() > this.f10105r.getX() && this.f10103p.getY() > this.f10105r.getY()) {
            return true;
        }
        if ((this.f10104q.getX() < this.f10106s.getX() && this.f10104q.getY() > this.f10106s.getY()) || this.f10103p.getY() > this.f10106s.getY() || this.f10104q.getY() > this.f10105r.getY() || this.f10103p.getX() > this.f10104q.getX() || this.f10106s.getX() > this.f10105r.getX()) {
            return true;
        }
        return false;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2480c clone() {
        try {
            return (C2480c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("Can't happen! See: https://www.youtube.com/watch?v=ilB9h1pfjc8");
        }
    }

    /* renamed from: e */
    public InterfaceC0017b m12522e() {
        return this.f10106s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2480c)) {
            return false;
        }
        C2480c c2480c = (C2480c) obj;
        if (!this.f10103p.mo35f(c2480c.f10103p) || !this.f10104q.mo35f(c2480c.f10104q) || !this.f10105r.mo35f(c2480c.f10105r) || !this.f10106s.mo35f(c2480c.f10106s)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public InterfaceC0017b m12523f() {
        return this.f10105r;
    }

    /* renamed from: g */
    public InterfaceC0017b m12524g() {
        return this.f10103p;
    }

    /* renamed from: h */
    public InterfaceC0017b m12525h() {
        return this.f10104q;
    }

    /* renamed from: i */
    public boolean m12526i() {
        return new C2479b(m12532p()).m12514r();
    }

    /* renamed from: k */
    public void m12527k(int i11) {
        int i12;
        if (i11 == 0) {
            return;
        }
        if (i11 < 0) {
            i12 = -i11;
        } else {
            i12 = 360 - i11;
        }
        while (i12 > 0) {
            C0018c c0018c = new C0018c(this.f10103p);
            this.f10103p.mo36g(this.f10104q);
            this.f10104q.mo36g(this.f10105r);
            this.f10105r.mo36g(this.f10106s);
            this.f10106s.mo36g(c0018c);
            i12 -= 90;
        }
    }

    /* renamed from: l */
    public C2480c m12528l(double d11) {
        C20180c m105266o = C20180c.m105266o(d11);
        return new C2480c(m12524g().mo33c(m105266o), m12525h().mo33c(m105266o), m12523f().mo33c(m105266o), m12522e().mo33c(m105266o));
    }

    /* renamed from: m */
    public C2480c m12529m(float f11) {
        float[][] m12531o = m12531o();
        for (float[] fArr : m12531o) {
            for (int i11 = 0; i11 < 2; i11++) {
                fArr[i11] = fArr[i11] * f11;
            }
        }
        return new C2480c(m12531o);
    }

    /* renamed from: n */
    public void m12530n() {
        while (m12520j()) {
            if (this.f10103p.getX() > this.f10105r.getX() && this.f10103p.getY() > this.f10105r.getY()) {
                AbstractC0016a.m30a(this.f10103p, this.f10105r);
            } else if (this.f10104q.getX() < this.f10106s.getX() && this.f10104q.getY() > this.f10106s.getY()) {
                AbstractC0016a.m30a(this.f10104q, this.f10106s);
            } else if (this.f10103p.getY() > this.f10106s.getY()) {
                AbstractC0016a.m30a(this.f10103p, this.f10106s);
            } else if (this.f10104q.getY() > this.f10105r.getY()) {
                AbstractC0016a.m30a(this.f10104q, this.f10105r);
            } else if (this.f10103p.getX() > this.f10104q.getX()) {
                AbstractC0016a.m30a(this.f10103p, this.f10104q);
            } else if (this.f10106s.getX() > this.f10105r.getX()) {
                AbstractC0016a.m30a(this.f10106s, this.f10105r);
            }
        }
    }

    /* renamed from: o */
    public float[][] m12531o() {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
        fArr[0][0] = this.f10103p.getX();
        fArr[0][1] = this.f10103p.getY();
        fArr[1][0] = this.f10104q.getX();
        fArr[1][1] = this.f10104q.getY();
        fArr[2][0] = this.f10105r.getX();
        fArr[2][1] = this.f10105r.getY();
        fArr[3][0] = this.f10106s.getX();
        fArr[3][1] = this.f10106s.getY();
        return fArr;
    }

    /* renamed from: p */
    public List m12532p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f10103p);
        arrayList.add(this.f10104q);
        arrayList.add(this.f10105r);
        arrayList.add(this.f10106s);
        return arrayList;
    }

    /* renamed from: q */
    public PointF[] m12533q() {
        return new PointF[]{new PointF(this.f10103p.getX(), this.f10103p.getY()), new PointF(this.f10104q.getX(), this.f10104q.getY()), new PointF(this.f10105r.getX(), this.f10105r.getY()), new PointF(this.f10106s.getX(), this.f10106s.getY())};
    }

    /* renamed from: r */
    public C2480c m12534r(float f11, float f12) {
        float[][] m12531o = m12531o();
        for (float[] fArr : m12531o) {
            fArr[0] = fArr[0] + f11;
            fArr[1] = fArr[1] + f12;
        }
        return new C2480c(m12531o);
    }

    public String toString() {
        return "Tetragram{tl=" + this.f10103p + ", tr=" + this.f10104q + ", br=" + this.f10105r + ", bl=" + this.f10106s + '}';
    }

    public C2480c(float[][] fArr) {
        this.f10103p = new C0018c();
        this.f10104q = new C0018c();
        this.f10105r = new C0018c();
        this.f10106s = new C0018c();
        try {
            this.f10103p.mo34e(fArr[0][0]);
            this.f10103p.mo32b(fArr[0][1]);
            this.f10104q.mo34e(fArr[1][0]);
            this.f10104q.mo32b(fArr[1][1]);
            this.f10105r.mo34e(fArr[2][0]);
            this.f10105r.mo32b(fArr[2][1]);
            this.f10106s.mo34e(fArr[3][0]);
            this.f10106s.mo32b(fArr[3][1]);
        } catch (Exception e11) {
            e11.printStackTrace();
            throw new RuntimeException("Data array must be shape of float[4][2]");
        }
    }

    public C2480c(PointF[] pointFArr) {
        this.f10103p = new C0018c();
        this.f10104q = new C0018c();
        this.f10105r = new C0018c();
        this.f10106s = new C0018c();
        try {
            this.f10103p.mo34e(pointFArr[0].x);
            this.f10103p.mo32b(pointFArr[0].y);
            this.f10104q.mo34e(pointFArr[1].x);
            this.f10104q.mo32b(pointFArr[1].y);
            this.f10105r.mo34e(pointFArr[2].x);
            this.f10105r.mo32b(pointFArr[2].y);
            this.f10106s.mo34e(pointFArr[3].x);
            this.f10106s.mo32b(pointFArr[3].y);
        } catch (Exception e11) {
            e11.printStackTrace();
            throw new RuntimeException("Data array must be shape of PointF[4]");
        }
    }
}
