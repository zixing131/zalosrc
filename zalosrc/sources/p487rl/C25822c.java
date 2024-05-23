package p487rl;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: rl.c */
/* loaded from: classes3.dex */
public final class C25822c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f123179a;

    /* renamed from: b */
    private final int f123180b;

    /* renamed from: c */
    private final int f123181c;

    /* renamed from: d */
    private final int f123182d;

    /* renamed from: e */
    private final long f123183e;

    /* renamed from: rl.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25822c(String str, int i11, int i12, int i13, long j11) {
        AbstractC19074t.m100208f(str, "id");
        this.f123179a = str;
        this.f123180b = i11;
        this.f123181c = i12;
        this.f123182d = i13;
        this.f123183e = j11;
    }

    /* renamed from: a */
    public final String m133169a() {
        return this.f123179a;
    }

    /* renamed from: b */
    public final int m133170b() {
        return this.f123181c;
    }

    /* renamed from: c */
    public final int m133171c() {
        return this.f123182d;
    }

    /* renamed from: d */
    public final int m133172d() {
        return this.f123180b;
    }

    /* renamed from: e */
    public final long m133173e() {
        return this.f123183e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25822c)) {
            return false;
        }
        C25822c c25822c = (C25822c) obj;
        return AbstractC19074t.m100204b(this.f123179a, c25822c.f123179a) && this.f123180b == c25822c.f123180b && this.f123181c == c25822c.f123181c && this.f123182d == c25822c.f123182d && this.f123183e == c25822c.f123183e;
    }

    public int hashCode() {
        return (((((((this.f123179a.hashCode() * 31) + this.f123180b) * 31) + this.f123181c) * 31) + this.f123182d) * 31) + AbstractC2147g0.m11521a(this.f123183e);
    }

    public String toString() {
        return "MigrateStateLogItem(id=" + this.f123179a + ", state=" + this.f123180b + ", migrationStep=" + this.f123181c + ", progress=" + this.f123182d + ", timestamp=" + this.f123183e + ")";
    }
}
