package androidx.work;

import android.os.Build;
import androidx.work.AbstractC2241j0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.a0 */
/* loaded from: classes.dex */
public final class C2135a0 extends AbstractC2241j0 {

    /* renamed from: e */
    public static final b f9059e = new b(null);

    /* renamed from: androidx.work.a0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC2241j0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, long j11, TimeUnit timeUnit) {
            super(cls);
            AbstractC19074t.m100208f(cls, "workerClass");
            AbstractC19074t.m100208f(timeUnit, "repeatIntervalTimeUnit");
            m11867h().m138986q(timeUnit.toMillis(j11));
        }

        @Override // androidx.work.AbstractC2241j0.a
        /* renamed from: o */
        public C2135a0 mo11464c() {
            if (m11864d() && Build.VERSION.SDK_INT >= 23 && m11867h().f127506j.m11511h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (!m11867h().f127513q) {
                return new C2135a0(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }

        @Override // androidx.work.AbstractC2241j0.a
        /* renamed from: p */
        public a mo11465g() {
            return this;
        }
    }

    /* renamed from: androidx.work.a0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2135a0(a aVar) {
        super(aVar.m11865e(), aVar.m11867h(), aVar.m11866f());
        AbstractC19074t.m100208f(aVar, "builder");
    }
}
