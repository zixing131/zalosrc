package eg0;

import fn0.AbstractC19074t;
import mg.C23288a;

/* renamed from: eg0.c */
/* loaded from: classes6.dex */
public abstract class AbstractC18428c {
    /* renamed from: a */
    public static final void m97658a(C23288a c23288a, String str, int i11, Runnable runnable) {
        AbstractC19074t.m100208f(c23288a, "<this>");
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(runnable, "task");
        c23288a.mo13474a(new C18427b(str, i11, runnable));
    }

    /* renamed from: b */
    public static /* synthetic */ void m97659b(C23288a c23288a, String str, int i11, Runnable runnable, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        m97658a(c23288a, str, i11, runnable);
    }
}
