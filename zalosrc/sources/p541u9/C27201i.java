package p541u9;

import com.google.firebase.remoteconfig.internal.C6729m;

/* renamed from: u9.i */
/* loaded from: classes3.dex */
public class C27201i {

    /* renamed from: a */
    private final long f127917a;

    /* renamed from: b */
    private final long f127918b;

    /* renamed from: u9.i$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private long f127919a = 60;

        /* renamed from: b */
        private long f127920b = C6729m.f37011j;

        /* renamed from: c */
        public C27201i m139268c() {
            return new C27201i(this);
        }

        /* renamed from: d */
        public b m139269d(long j11) {
            if (j11 >= 0) {
                this.f127919a = j11;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
        }

        /* renamed from: e */
        public b m139270e(long j11) {
            if (j11 >= 0) {
                this.f127920b = j11;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j11 + " is an invalid argument");
        }
    }

    private C27201i(b bVar) {
        this.f127917a = bVar.f127919a;
        this.f127918b = bVar.f127920b;
    }
}
