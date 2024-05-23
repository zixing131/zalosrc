package p030b4;

/* renamed from: b4.g */
/* loaded from: classes.dex */
public abstract class AbstractC2513g {

    /* renamed from: b4.g$a */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC2513g m12601a() {
        return new C2508b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC2513g m12602d() {
        return new C2508b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC2513g m12603e(long j11) {
        return new C2508b(a.OK, j11);
    }

    /* renamed from: f */
    public static AbstractC2513g m12604f() {
        return new C2508b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo12593b();

    /* renamed from: c */
    public abstract a mo12594c();
}
