package p116e;

import p025b.AbstractC2473b;

/* renamed from: e.d */
/* loaded from: classes2.dex */
public class C18153d {

    /* renamed from: a */
    private static final String f91813a = "LRUExpireCache";

    /* renamed from: b */
    private static C18153d f91814b;

    /* renamed from: c */
    private static C18150a f91815c;

    private C18153d(int i11) {
        f91815c = new C18150a(i11);
    }

    /* renamed from: a */
    public static C18153d m96446a(int i11) {
        if (f91814b == null) {
            f91814b = new C18153d(i11);
        }
        return f91814b;
    }

    /* renamed from: b */
    public final Object m96447b(Object obj) {
        try {
            C18152c c18152c = (C18152c) f91815c.m96439f(obj);
            if (c18152c != null) {
                long m96443a = c18152c.m96443a();
                if (m96443a == 0 || m96443a >= System.currentTimeMillis()) {
                    return c18152c.m96445c();
                }
                f91815c.m96440h(obj);
            }
        } catch (Exception e11) {
            AbstractC2473b.m12489b(f91813a, "get", e11);
        }
        return null;
    }

    /* renamed from: c */
    public final void m96448c(Object obj, Object obj2) {
        try {
            f91815c.m96436b(obj, new C18152c(obj2, 0L));
        } catch (Exception e11) {
            AbstractC2473b.m12489b(f91813a, "put", e11);
        }
    }

    /* renamed from: d */
    public final void m96449d(Object obj, Object obj2, long j11) {
        long j12 = 0;
        if (j11 != 0) {
            try {
                j12 = System.currentTimeMillis() + j11;
            } catch (Exception e11) {
                AbstractC2473b.m12489b(f91813a, "put", e11);
                return;
            }
        }
        f91815c.m96436b(obj, new C18152c(obj2, j12));
    }

    /* renamed from: e */
    public final void m96450e(Object obj, Object obj2) {
        try {
            C18152c c18152c = (C18152c) f91815c.m96439f(obj);
            if (c18152c != null) {
                c18152c.m96444b(obj2);
            }
            f91815c.m96436b(obj, c18152c);
        } catch (Exception e11) {
            AbstractC2473b.m12489b(f91813a, "put", e11);
        }
    }
}
