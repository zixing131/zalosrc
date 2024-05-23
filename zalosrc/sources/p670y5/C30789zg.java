package p670y5;

/* renamed from: y5.zg */
/* loaded from: classes2.dex */
public final class C30789zg {

    /* renamed from: a */
    private static C30789zg f142098a;

    private C30789zg() {
    }

    /* renamed from: a */
    public static synchronized C30789zg m149740a() {
        C30789zg c30789zg;
        synchronized (C30789zg.class) {
            try {
                if (f142098a == null) {
                    f142098a = new C30789zg();
                }
                c30789zg = f142098a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c30789zg;
    }
}
