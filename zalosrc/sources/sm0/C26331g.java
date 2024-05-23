package sm0;

import fn0.AbstractC19074t;
import java.util.Comparator;
import p148f3.C18710b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sm0.g */
/* loaded from: classes7.dex */
public final class C26331g implements Comparator {

    /* renamed from: p */
    public static final C26331g f125004p = new C26331g();

    private C26331g() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        AbstractC19074t.m100208f(comparable, "a");
        AbstractC19074t.m100208f(comparable2, C18710b.f94009e);
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C26330f.f125003p;
    }
}
