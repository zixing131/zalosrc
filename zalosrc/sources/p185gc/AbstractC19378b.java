package p185gc;

/* renamed from: gc.b */
/* loaded from: classes3.dex */
public abstract class AbstractC19378b {

    /* renamed from: gc.b$a */
    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: gc.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32825a {
            /* renamed from: a */
            public static void m101502a(a aVar) {
            }
        }

        /* renamed from: b */
        void mo1004b();

        void onSuccess(Object obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m101499c(AbstractC19378b abstractC19378b, Object obj, a aVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 2) != 0) {
                aVar = null;
            }
            abstractC19378b.m101501b(obj, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    /* renamed from: a */
    public final void m101500a(Object obj) {
        m101499c(this, obj, null, 2, null);
    }

    /* renamed from: b */
    public final void m101501b(Object obj, a aVar) {
        mo1884d(obj, aVar);
    }

    /* renamed from: d */
    protected abstract void mo1884d(Object obj, a aVar);
}
