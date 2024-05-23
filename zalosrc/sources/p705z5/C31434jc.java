package p705z5;

/* renamed from: z5.jc */
/* loaded from: classes2.dex */
public final class C31434jc {

    /* renamed from: a */
    private static C31434jc f144857a;

    private C31434jc() {
    }

    /* renamed from: a */
    public static synchronized C31434jc m152279a() {
        C31434jc c31434jc;
        synchronized (C31434jc.class) {
            try {
                if (f144857a == null) {
                    f144857a = new C31434jc();
                }
                c31434jc = f144857a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31434jc;
    }

    /* renamed from: b */
    public static final boolean m152280b() {
        return AbstractC31420ic.m152251a("mlkit-dev-profiling");
    }
}
