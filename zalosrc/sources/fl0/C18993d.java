package fl0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ik0.AbstractC20595r;
import ik0.AbstractC20596s;
import lk0.C22507e;

/* renamed from: fl0.d */
/* loaded from: classes7.dex */
public final class C18993d {

    /* renamed from: a */
    private final C22507e f94815a;

    /* renamed from: b */
    private final C18994e f94816b;

    public C18993d(C22507e c22507e, C18994e c18994e) {
        AbstractC19074t.m100208f(c22507e, "zinstantDataKeyProvider");
        AbstractC19074t.m100208f(c18994e, "layoutKeyProvider");
        this.f94815a = c22507e;
        this.f94816b = c18994e;
    }

    /* renamed from: a */
    public final String m99728a(AbstractC20595r abstractC20595r) {
        AbstractC19074t.m100208f(abstractC20595r, "request");
        String m116374b = this.f94815a.m116374b(abstractC20595r);
        AbstractC19074t.m100207e(m116374b, "zinstantDataKeyProvider.key(request)");
        return m116374b;
    }

    /* renamed from: b */
    public final String m99729b(AbstractC20596s abstractC20596s) {
        AbstractC19074t.m100208f(abstractC20596s, "layoutRequest");
        return this.f94816b.m99730a(abstractC20596s);
    }

    public /* synthetic */ C18993d(C22507e c22507e, C18994e c18994e, int i11, AbstractC19060k abstractC19060k) {
        this(c22507e, (i11 & 2) != 0 ? new C18994e() : c18994e);
    }
}
