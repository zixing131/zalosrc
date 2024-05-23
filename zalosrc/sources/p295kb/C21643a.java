package p295kb;

import p665y0.C30246h;

/* renamed from: kb.a */
/* loaded from: classes3.dex */
public class C21643a implements Cloneable {

    /* renamed from: p */
    private C30246h f105025p;

    public C21643a() {
        this(new C30246h());
    }

    /* renamed from: a */
    public void m111565a(int i11) {
        this.f105025p.m149177k(i11, this);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C21643a clone() {
        C21643a c21643a;
        C21643a c21643a2 = null;
        try {
            c21643a = (C21643a) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        try {
            c21643a.f105025p = this.f105025p.clone();
            return c21643a;
        } catch (CloneNotSupportedException unused2) {
            c21643a2 = c21643a;
            return c21643a2;
        }
    }

    /* renamed from: c */
    public boolean m111567c(int i11) {
        if (this.f105025p.m149174h(i11) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int[] m111568e() {
        int m149179m = this.f105025p.m149179m();
        int[] iArr = new int[m149179m];
        for (int i11 = 0; i11 < m149179m; i11++) {
            iArr[i11] = this.f105025p.m149176j(i11);
        }
        return iArr;
    }

    /* renamed from: f */
    public boolean m111569f() {
        if (this.f105025p.m149179m() == 0) {
            return true;
        }
        return false;
    }

    private C21643a(C30246h c30246h) {
        this.f105025p = c30246h;
    }
}
