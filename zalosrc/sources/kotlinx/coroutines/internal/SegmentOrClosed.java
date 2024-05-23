package kotlinx.coroutines.internal;

import fn0.AbstractC19074t;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes7.dex */
public final class SegmentOrClosed<S extends Segment<S>> {

    /* renamed from: a */
    private final Object f107416a;

    /* renamed from: a */
    public static Object m113705a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static boolean m113706b(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && AbstractC19074t.m100204b(obj, ((SegmentOrClosed) obj2).m113711g());
    }

    /* renamed from: c */
    public static final Segment m113707c(Object obj) {
        if (obj != ConcurrentLinkedListKt.f107350a) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (Segment) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: d */
    public static int m113708d(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: e */
    public static final boolean m113709e(Object obj) {
        if (obj == ConcurrentLinkedListKt.f107350a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static String m113710f(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m113706b(this.f107416a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ Object m113711g() {
        return this.f107416a;
    }

    public int hashCode() {
        return m113708d(this.f107416a);
    }

    public String toString() {
        return m113710f(this.f107416a);
    }
}
