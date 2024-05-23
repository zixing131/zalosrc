package p426pp;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: pp.b */
/* loaded from: classes4.dex */
public final class C24899b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f119468a;

    /* renamed from: b */
    private final List f119469b;

    /* renamed from: c */
    private final long f119470c;

    /* renamed from: pp.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24899b(String str, List list) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(list, "songs");
        this.f119468a = str;
        this.f119469b = list;
        this.f119470c = System.currentTimeMillis();
    }

    /* renamed from: c */
    private final boolean m129469c() {
        if (System.currentTimeMillis() - this.f119470c > 600000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String m129470a() {
        return this.f119468a;
    }

    /* renamed from: b */
    public final List m129471b() {
        return this.f119469b;
    }

    /* renamed from: d */
    public final boolean m129472d() {
        return !m129469c();
    }
}
