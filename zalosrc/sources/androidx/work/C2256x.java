package androidx.work;

import android.os.Build;
import androidx.work.AbstractC2241j0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: androidx.work.x */
/* loaded from: classes2.dex */
public final class C2256x extends AbstractC2241j0 {

    /* renamed from: e */
    public static final b f9480e = new b(null);

    /* renamed from: androidx.work.x$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2241j0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(cls);
            AbstractC19074t.m100208f(cls, "workerClass");
        }

        @Override // androidx.work.AbstractC2241j0.a
        /* renamed from: o */
        public C2256x mo11464c() {
            if (m11864d() && Build.VERSION.SDK_INT >= 23 && m11867h().f127506j.m11511h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new C2256x(this);
        }

        @Override // androidx.work.AbstractC2241j0.a
        /* renamed from: p */
        public a mo11465g() {
            return this;
        }
    }

    /* renamed from: androidx.work.x$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2256x m11912a(Class cls) {
            AbstractC19074t.m100208f(cls, "workerClass");
            return (C2256x) new a(cls).m11863b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2256x(a aVar) {
        super(aVar.m11865e(), aVar.m11867h(), aVar.m11866f());
        AbstractC19074t.m100208f(aVar, "builder");
    }

    /* renamed from: e */
    public static final C2256x m11909e(Class cls) {
        return f9480e.m11912a(cls);
    }
}
