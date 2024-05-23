package p012a6;

/* renamed from: a6.ah */
/* loaded from: classes2.dex */
public final class C0162ah {

    /* renamed from: a */
    private static C0162ah f776a;

    private C0162ah() {
    }

    /* renamed from: a */
    public static synchronized C0162ah m616a() {
        C0162ah c0162ah;
        synchronized (C0162ah.class) {
            try {
                if (f776a == null) {
                    f776a = new C0162ah();
                }
                c0162ah = f776a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0162ah;
    }
}
