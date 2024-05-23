package ac;

import fn0.AbstractC19074t;
import java.util.HashMap;

/* renamed from: ac.p */
/* loaded from: classes3.dex */
public final class C0722p {

    /* renamed from: a */
    private final long f2401a;

    /* renamed from: b */
    private long f2402b;

    /* renamed from: d */
    private long f2404d;

    /* renamed from: f */
    private boolean f2406f;

    /* renamed from: c */
    private b f2403c = b.UNKNOWN;

    /* renamed from: e */
    private a f2405e = a.NORMAL_END;

    /* renamed from: g */
    private HashMap f2407g = new HashMap();

    /* renamed from: ac.p$a */
    /* loaded from: classes3.dex */
    public enum a {
        CRASH(-1),
        NORMAL_END(0),
        CLOSE_MINI_CHAT(1);


        /* renamed from: p */
        private final int f2412p;

        a(int i11) {
            this.f2412p = i11;
        }

        /* renamed from: c */
        public final int m1163c() {
            return this.f2412p;
        }
    }

    /* renamed from: ac.p$b */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(-1),
        APP_LAUNCHER(0),
        APP_RESUME(1),
        NOTIFICATION(2),
        CALL(3),
        OTHER_APP(4),
        CHAT_HEAD(8),
        BUBBLE(9);


        /* renamed from: p */
        private final int f2422p;

        b(int i11) {
            this.f2422p = i11;
        }

        /* renamed from: c */
        public final int m1165c() {
            return this.f2422p;
        }
    }

    public C0722p(long j11) {
        this.f2401a = j11;
    }

    /* renamed from: a */
    public final a m1150a() {
        return this.f2405e;
    }

    /* renamed from: b */
    public final long m1151b() {
        return this.f2404d;
    }

    /* renamed from: c */
    public final long m1152c() {
        return this.f2402b;
    }

    /* renamed from: d */
    public final long m1153d() {
        return this.f2401a;
    }

    /* renamed from: e */
    public final boolean m1154e() {
        return this.f2406f;
    }

    /* renamed from: f */
    public final b m1155f() {
        return this.f2403c;
    }

    /* renamed from: g */
    public final long m1156g() {
        return this.f2401a;
    }

    /* renamed from: h */
    public final void m1157h(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f2405e = aVar;
    }

    /* renamed from: i */
    public final void m1158i(long j11) {
        this.f2404d = j11;
    }

    /* renamed from: j */
    public final void m1159j(long j11) {
        this.f2402b = j11;
    }

    /* renamed from: k */
    public final void m1160k(boolean z11) {
        this.f2406f = z11;
    }

    /* renamed from: l */
    public final void m1161l(b bVar) {
        AbstractC19074t.m100208f(bVar, "<set-?>");
        this.f2403c = bVar;
    }
}
