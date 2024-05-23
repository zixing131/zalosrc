package xd0;

import bo.C3000l0;
import bo.C3020p0;
import dj.C17945a0;
import fn0.AbstractC19074t;
import p019aj.C0876j;
import p056cj.C3535c;
import p185gc.AbstractC19384h;
import pm0.C24848g0;

/* renamed from: xd0.g */
/* loaded from: classes4.dex */
public final class C29591g extends AbstractC19384h {

    /* renamed from: a */
    private final C0876j f136574a;

    /* renamed from: xd0.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f136575a;

        /* renamed from: b */
        private final String f136576b;

        public a(String str, String str2) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "feedId");
            this.f136575a = str;
            this.f136576b = str2;
        }

        /* renamed from: a */
        public final String m147043a() {
            return this.f136576b;
        }

        /* renamed from: b */
        public final String m147044b() {
            return this.f136575a;
        }
    }

    /* renamed from: xd0.g$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C17945a0 f136577a;

        /* renamed from: b */
        private final int f136578b;

        public b(C17945a0 c17945a0, int i11) {
            AbstractC19074t.m100208f(c17945a0, "foundMsg");
            this.f136577a = c17945a0;
            this.f136578b = i11;
        }

        /* renamed from: a */
        public final C17945a0 m147045a() {
            return this.f136577a;
        }
    }

    public C29591g(C0876j c0876j) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        this.f136574a = c0876j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        C3000l0 m95205n3;
        C3020p0 m14322a0;
        AbstractC19074t.m100208f(aVar, "params");
        C3535c m2634q = this.f136574a.m2634q(aVar.m147044b());
        if (m2634q == null || m2634q.m136068l0() == 0) {
            return null;
        }
        synchronized (m2634q) {
            int i11 = 0;
            for (C17945a0 c17945a0 : m2634q.m17941F0()) {
                if (c17945a0.m95261t6() && (m95205n3 = c17945a0.m95205n3()) != null && (m14322a0 = m95205n3.m14322a0()) != null) {
                    AbstractC19074t.m100205c(m14322a0);
                    if (AbstractC19074t.m100204b(m14322a0.f12057p, aVar.m147043a())) {
                        return new b(c17945a0, i11);
                    }
                }
                i11++;
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return null;
        }
    }
}
