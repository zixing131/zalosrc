package p083cq;

import androidx.work.AbstractC2147g0;
import aq.C2288h;
import bg0.C2797c;
import fn0.AbstractC19074t;
import p185gc.AbstractC19384h;
import pm0.C24848g0;

/* renamed from: cq.f */
/* loaded from: classes4.dex */
public final class C17559f extends AbstractC19384h {

    /* renamed from: a */
    private final C2288h f89448a;

    /* renamed from: b */
    private final C2797c f89449b;

    /* renamed from: cq.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f89450a;

        /* renamed from: b */
        private final long f89451b;

        public a(String str, long j11) {
            AbstractC19074t.m100208f(str, "userId");
            this.f89450a = str;
            this.f89451b = j11;
        }

        /* renamed from: a */
        public final long m93506a() {
            return this.f89451b;
        }

        /* renamed from: b */
        public final String m93507b() {
            return this.f89450a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f89450a, aVar.f89450a) && this.f89451b == aVar.f89451b;
        }

        public int hashCode() {
            return (this.f89450a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f89451b);
        }

        public String toString() {
            return "Params(userId=" + this.f89450a + ", notificationId=" + this.f89451b + ")";
        }
    }

    public C17559f(C2288h c2288h, C2797c c2797c) {
        AbstractC19074t.m100208f(c2288h, "repository");
        AbstractC19074t.m100208f(c2797c, "serialTaskDispatcher");
        this.f89448a = c2288h;
        this.f89449b = c2797c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m93504e(C17559f c17559f, a aVar) {
        AbstractC19074t.m100208f(c17559f, "this$0");
        AbstractC19074t.m100208f(aVar, "$params");
        c17559f.f89448a.mo12066j(aVar.m93507b(), aVar.m93506a());
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo13388b(Object obj) {
        m93505d((a) obj);
        return C24848g0.f119245a;
    }

    /* renamed from: d */
    protected void m93505d(final a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        this.f89449b.mo13474a(new Runnable() { // from class: cq.e
            @Override // java.lang.Runnable
            public final void run() {
                C17559f.m93504e(C17559f.this, aVar);
            }
        });
    }
}
