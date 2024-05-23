package kotlinx.coroutines.internal;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class InlineList<E> {

    /* renamed from: a */
    private final Object f107374a;

    /* renamed from: a */
    public static Object m113634a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m113635b(Object obj, int i11, AbstractC19060k abstractC19060k) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        return m113634a(obj);
    }

    /* renamed from: c */
    public static boolean m113636c(Object obj, Object obj2) {
        return (obj2 instanceof InlineList) && AbstractC19074t.m100204b(obj, ((InlineList) obj2).m113640g());
    }

    /* renamed from: d */
    public static int m113637d(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: e */
    public static final Object m113638e(Object obj, Object obj2) {
        if (obj == null) {
            return m113634a(obj2);
        }
        if (obj instanceof ArrayList) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return m113634a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m113634a(arrayList);
    }

    /* renamed from: f */
    public static String m113639f(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m113636c(this.f107374a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ Object m113640g() {
        return this.f107374a;
    }

    public int hashCode() {
        return m113637d(this.f107374a);
    }

    public String toString() {
        return m113639f(this.f107374a);
    }
}
