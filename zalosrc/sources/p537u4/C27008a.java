package p537u4;

/* renamed from: u4.a */
/* loaded from: classes2.dex */
public class C27008a {

    /* renamed from: b */
    static int f127653b = 31;

    /* renamed from: a */
    private int f127654a = 1;

    /* renamed from: a */
    public C27008a m139140a(Object obj) {
        int hashCode;
        int i11 = f127653b * this.f127654a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f127654a = i11 + hashCode;
        return this;
    }

    /* renamed from: b */
    public int m139141b() {
        return this.f127654a;
    }

    /* renamed from: c */
    public final C27008a m139142c(boolean z11) {
        this.f127654a = (f127653b * this.f127654a) + (z11 ? 1 : 0);
        return this;
    }
}
