package p670y5;

/* renamed from: y5.yg */
/* loaded from: classes2.dex */
public abstract class AbstractC30770yg {

    /* renamed from: a */
    private static C30751xg f142072a;

    /* renamed from: a */
    public static synchronized C30561ng m149735a(AbstractC30409fg abstractC30409fg) {
        C30561ng c30561ng;
        synchronized (AbstractC30770yg.class) {
            try {
                if (f142072a == null) {
                    f142072a = new C30751xg(null);
                }
                c30561ng = (C30561ng) f142072a.m106487b(abstractC30409fg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c30561ng;
    }

    /* renamed from: b */
    public static synchronized C30561ng m149736b(String str) {
        C30561ng m149735a;
        synchronized (AbstractC30770yg.class) {
            m149735a = m149735a(AbstractC30409fg.m149503d(str).mo149499c());
        }
        return m149735a;
    }
}
