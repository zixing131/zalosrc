package p641xd;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: xd.b */
/* loaded from: classes3.dex */
public final class C29578b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f136515a;

    /* renamed from: b */
    private final int f136516b;

    /* renamed from: c */
    private final long f136517c;

    /* renamed from: xd.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29578b(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, "conversationId");
        this.f136515a = str;
        this.f136516b = i11;
        this.f136517c = j11;
    }

    /* renamed from: a */
    public final int m146984a() {
        return this.f136516b;
    }

    /* renamed from: b */
    public final String m146985b() {
        return this.f136515a;
    }

    /* renamed from: c */
    public final long m146986c() {
        return this.f136517c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29578b)) {
            return false;
        }
        C29578b c29578b = (C29578b) obj;
        return AbstractC19074t.m100204b(this.f136515a, c29578b.f136515a) && this.f136516b == c29578b.f136516b && this.f136517c == c29578b.f136517c;
    }

    public int hashCode() {
        return (((this.f136515a.hashCode() * 31) + this.f136516b) * 31) + AbstractC2147g0.m11521a(this.f136517c);
    }

    public String toString() {
        return "BlockStrangerChatInfo(conversationId=" + this.f136515a + ", blockType=" + this.f136516b + ", expiredTime=" + this.f136517c + ")";
    }
}
