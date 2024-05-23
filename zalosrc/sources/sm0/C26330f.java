package sm0;

import fn0.AbstractC19074t;
import java.util.Comparator;
import p148f3.C18710b;

/* renamed from: sm0.f */
/* loaded from: classes7.dex */
final class C26330f implements Comparator {

    /* renamed from: p */
    public static final C26330f f125003p = new C26330f();

    private C26330f() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        AbstractC19074t.m100208f(comparable, "a");
        AbstractC19074t.m100208f(comparable2, C18710b.f94009e);
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C26331g.f125004p;
    }
}
