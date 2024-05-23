package okio;

/* renamed from: okio.e */
/* loaded from: classes7.dex */
abstract class AbstractC24295e {

    /* renamed from: a */
    static C24294d f117292a;

    /* renamed from: b */
    static long f117293b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m126832a(C24294d c24294d) {
        if (c24294d.f117290f == null && c24294d.f117291g == null) {
            if (c24294d.f117288d) {
                return;
            }
            synchronized (AbstractC24295e.class) {
                try {
                    long j11 = f117293b;
                    if (j11 + 8192 > 65536) {
                        return;
                    }
                    f117293b = j11 + 8192;
                    c24294d.f117290f = f117292a;
                    c24294d.f117287c = 0;
                    c24294d.f117286b = 0;
                    f117292a = c24294d;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C24294d m126833b() {
        synchronized (AbstractC24295e.class) {
            try {
                C24294d c24294d = f117292a;
                if (c24294d != null) {
                    f117292a = c24294d.f117290f;
                    c24294d.f117290f = null;
                    f117293b -= 8192;
                    return c24294d;
                }
                return new C24294d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
