package k50;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: k50.d */
/* loaded from: classes5.dex */
public final class C21476d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f104508a;

    /* renamed from: b */
    private final List f104509b;

    /* renamed from: c */
    private final long f104510c;

    /* renamed from: k50.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C21476d(String str, List list) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(list, "ringtones");
        this.f104508a = str;
        this.f104509b = list;
        this.f104510c = System.currentTimeMillis();
    }

    /* renamed from: c */
    private final boolean m111089c() {
        if (System.currentTimeMillis() - this.f104510c > 600000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String m111090a() {
        return this.f104508a;
    }

    /* renamed from: b */
    public final List m111091b() {
        return this.f104509b;
    }

    /* renamed from: d */
    public final boolean m111092d() {
        return !m111089c();
    }
}
