package l50;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import p185gc.AbstractC19384h;

/* renamed from: l50.e */
/* loaded from: classes5.dex */
public final class C22083e extends AbstractC19384h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C20304a f108696a;

    /* renamed from: l50.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C22083e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo13388b(Object obj) {
        return m115227c(((Boolean) obj).booleanValue());
    }

    /* renamed from: c */
    protected Integer m115227c(boolean z11) {
        return Integer.valueOf(this.f108696a.m105994p(z11));
    }

    public C22083e(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108696a = c20304a;
    }

    public /* synthetic */ C22083e(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
