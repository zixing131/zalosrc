package p705z5;

/* renamed from: z5.fc */
/* loaded from: classes2.dex */
public abstract class AbstractC31378fc {

    /* renamed from: a */
    private static C31364ec f144714a;

    /* renamed from: a */
    public static synchronized C31615wb m152235a(AbstractC31545rb abstractC31545rb) {
        C31615wb c31615wb;
        synchronized (AbstractC31378fc.class) {
            try {
                if (f144714a == null) {
                    f144714a = new C31364ec(null);
                }
                c31615wb = (C31615wb) f144714a.m106487b(abstractC31545rb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31615wb;
    }

    /* renamed from: b */
    public static synchronized C31615wb m152236b(String str) {
        C31615wb m152235a;
        synchronized (AbstractC31378fc.class) {
            m152235a = m152235a(AbstractC31545rb.m152341d("vision-common").mo152283c());
        }
        return m152235a;
    }
}
