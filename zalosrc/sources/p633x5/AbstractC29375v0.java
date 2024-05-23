package p633x5;

/* renamed from: x5.v0 */
/* loaded from: classes2.dex */
public abstract class AbstractC29375v0 {

    /* renamed from: a */
    private static C29373u0 f135870a;

    /* renamed from: a */
    public static synchronized C29359n0 m146514a(AbstractC29351j0 abstractC29351j0) {
        C29359n0 c29359n0;
        synchronized (AbstractC29375v0.class) {
            try {
                if (f135870a == null) {
                    f135870a = new C29373u0(null);
                }
                c29359n0 = (C29359n0) f135870a.m106487b(abstractC29351j0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29359n0;
    }

    /* renamed from: b */
    public static synchronized C29359n0 m146515b(String str) {
        C29359n0 m146514a;
        synchronized (AbstractC29375v0.class) {
            m146514a = m146514a(AbstractC29351j0.m146493d("common").mo146481c());
        }
        return m146514a;
    }
}
