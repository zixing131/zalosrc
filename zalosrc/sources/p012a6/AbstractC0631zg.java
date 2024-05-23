package p012a6;

/* renamed from: a6.zg */
/* loaded from: classes2.dex */
public abstract class AbstractC0631zg {

    /* renamed from: a */
    private static C0613yg f2149a;

    /* renamed from: a */
    public static synchronized C0427og m905a(AbstractC0275gg abstractC0275gg) {
        C0427og c0427og;
        synchronized (AbstractC0631zg.class) {
            try {
                if (f2149a == null) {
                    f2149a = new C0613yg(null);
                }
                c0427og = (C0427og) f2149a.m106487b(abstractC0275gg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0427og;
    }

    /* renamed from: b */
    public static synchronized C0427og m906b(String str) {
        C0427og m905a;
        synchronized (AbstractC0631zg.class) {
            m905a = m905a(AbstractC0275gg.m741d(str).mo614c());
        }
        return m905a;
    }
}
