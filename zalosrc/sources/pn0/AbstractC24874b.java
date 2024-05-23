package pn0;

/* renamed from: pn0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC24874b {

    /* renamed from: a */
    private static final boolean f119362a = false;

    /* renamed from: b */
    private static final ThreadLocal[] f119363b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i11 = 0; i11 < 4; i11++) {
            threadLocalArr[i11] = new ThreadLocal();
        }
        f119363b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m129345a() {
        return f119362a;
    }
}
