package p294ka;

import com.google.android.gms.common.internal.AbstractC4199m;
import java.util.concurrent.Executor;

/* renamed from: ka.b */
/* loaded from: classes3.dex */
public class C21631b {

    /* renamed from: a */
    private final int f105008a;

    /* renamed from: b */
    private final boolean f105009b;

    /* renamed from: c */
    private final Executor f105010c;

    /* renamed from: ka.b$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private int f105011a = 0;

        /* renamed from: b */
        private boolean f105012b;

        /* renamed from: c */
        private Executor f105013c;

        /* renamed from: a */
        public C21631b m111561a() {
            return new C21631b(this.f105011a, this.f105012b, this.f105013c, null);
        }

        /* renamed from: b */
        public a m111562b(int i11, int... iArr) {
            this.f105011a = i11;
            if (iArr != null) {
                for (int i12 : iArr) {
                    this.f105011a = i12 | this.f105011a;
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m111563c(Executor executor) {
            this.f105013c = executor;
            return this;
        }
    }

    /* synthetic */ C21631b(int i11, boolean z11, Executor executor, AbstractC21633d abstractC21633d) {
        this.f105008a = i11;
        this.f105009b = z11;
        this.f105010c = executor;
    }

    /* renamed from: a */
    public final int m111558a() {
        return this.f105008a;
    }

    /* renamed from: b */
    public final Executor m111559b() {
        return this.f105010c;
    }

    /* renamed from: c */
    public final boolean m111560c() {
        return this.f105009b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21631b)) {
            return false;
        }
        C21631b c21631b = (C21631b) obj;
        if (this.f105008a == c21631b.f105008a && this.f105009b == c21631b.f105009b && AbstractC4199m.m19701a(this.f105010c, c21631b.f105010c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(Integer.valueOf(this.f105008a), Boolean.valueOf(this.f105009b), this.f105010c);
    }
}
