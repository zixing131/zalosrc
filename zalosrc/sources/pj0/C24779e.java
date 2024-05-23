package pj0;

/* renamed from: pj0.e */
/* loaded from: classes7.dex */
public final class C24779e {

    /* renamed from: a */
    private final int f119005a;

    /* renamed from: b */
    private final int f119006b;

    /* renamed from: c */
    private final int f119007c;

    /* renamed from: d */
    private final int f119008d;

    public C24779e(int i11, int i12, int i13, int i14) {
        this.f119005a = i11;
        this.f119006b = i12;
        this.f119007c = i13;
        this.f119008d = i14;
    }

    /* renamed from: a */
    public final boolean m128795a(int i11, int i12) {
        int i13 = this.f119005a;
        if (i11 <= this.f119007c && i13 <= i11) {
            int i14 = this.f119006b;
            if (i12 <= this.f119008d && i14 <= i12) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int m128796b() {
        return this.f119005a;
    }

    /* renamed from: c */
    public final int m128797c() {
        return this.f119008d - this.f119006b;
    }

    /* renamed from: d */
    public final int m128798d() {
        return this.f119007c - this.f119005a;
    }
}
