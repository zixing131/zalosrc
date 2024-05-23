package ln0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ln0.c */
/* loaded from: classes7.dex */
public final class C22534c extends AbstractC22532a {

    /* renamed from: t */
    public static final a f110297t = new a(null);

    /* renamed from: u */
    private static final C22534c f110298u = new C22534c(1, 0);

    /* renamed from: ln0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C22534c(char c11, char c12) {
        super(c11, c12, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22534c) {
            if (!isEmpty() || !((C22534c) obj).isEmpty()) {
                C22534c c22534c = (C22534c) obj;
                if (m116542d() != c22534c.m116542d() || m116543e() != c22534c.m116543e()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m116542d() * 31) + m116543e();
    }

    public boolean isEmpty() {
        if (AbstractC19074t.m100209g(m116542d(), m116543e()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m116546j(char c11) {
        if (AbstractC19074t.m100209g(m116542d(), c11) <= 0 && AbstractC19074t.m100209g(c11, m116543e()) <= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return m116542d() + ".." + m116543e();
    }
}
