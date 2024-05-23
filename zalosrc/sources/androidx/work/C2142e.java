package androidx.work;

import android.net.Uri;
import android.os.Build;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.LinkedHashSet;
import java.util.Set;
import qm0.AbstractC25332a0;
import qm0.AbstractC25379x0;

/* renamed from: androidx.work.e */
/* loaded from: classes.dex */
public final class C2142e {

    /* renamed from: i */
    public static final b f9093i = new b(null);

    /* renamed from: j */
    public static final C2142e f9094j = new C2142e(null, false, false, false, 15, null);

    /* renamed from: a */
    private final EnumC2254v f9095a;

    /* renamed from: b */
    private final boolean f9096b;

    /* renamed from: c */
    private final boolean f9097c;

    /* renamed from: d */
    private final boolean f9098d;

    /* renamed from: e */
    private final boolean f9099e;

    /* renamed from: f */
    private final long f9100f;

    /* renamed from: g */
    private final long f9101g;

    /* renamed from: h */
    private final Set f9102h;

    /* renamed from: androidx.work.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f9103a;

        /* renamed from: b */
        private boolean f9104b;

        /* renamed from: d */
        private boolean f9106d;

        /* renamed from: e */
        private boolean f9107e;

        /* renamed from: c */
        private EnumC2254v f9105c = EnumC2254v.NOT_REQUIRED;

        /* renamed from: f */
        private long f9108f = -1;

        /* renamed from: g */
        private long f9109g = -1;

        /* renamed from: h */
        private Set f9110h = new LinkedHashSet();

        /* renamed from: a */
        public final C2142e m11513a() {
            Set m131551e;
            Set set;
            long j11;
            long j12;
            boolean z11;
            Set m131189Q0;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                m131189Q0 = AbstractC25332a0.m131189Q0(this.f9110h);
                set = m131189Q0;
                j11 = this.f9108f;
                j12 = this.f9109g;
            } else {
                m131551e = AbstractC25379x0.m131551e();
                set = m131551e;
                j11 = -1;
                j12 = -1;
            }
            boolean z12 = this.f9103a;
            if (i11 >= 23 && this.f9104b) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new C2142e(this.f9105c, z12, z11, this.f9106d, this.f9107e, j11, j12, set);
        }

        /* renamed from: b */
        public final a m11514b(EnumC2254v enumC2254v) {
            AbstractC19074t.m100208f(enumC2254v, "networkType");
            this.f9105c = enumC2254v;
            return this;
        }

        /* renamed from: c */
        public final a m11515c(boolean z11) {
            this.f9106d = z11;
            return this;
        }

        /* renamed from: d */
        public final a m11516d(boolean z11) {
            this.f9104b = z11;
            return this;
        }

        /* renamed from: e */
        public final a m11517e(boolean z11) {
            this.f9107e = z11;
            return this;
        }
    }

    /* renamed from: androidx.work.e$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: androidx.work.e$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private final Uri f9111a;

        /* renamed from: b */
        private final boolean f9112b;

        public c(Uri uri, boolean z11) {
            AbstractC19074t.m100208f(uri, "uri");
            this.f9111a = uri;
            this.f9112b = z11;
        }

        /* renamed from: a */
        public final Uri m11518a() {
            return this.f9111a;
        }

        /* renamed from: b */
        public final boolean m11519b() {
            return this.f9112b;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!AbstractC19074t.m100204b(c.class, cls)) {
                return false;
            }
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            if (AbstractC19074t.m100204b(this.f9111a, cVar.f9111a) && this.f9112b == cVar.f9112b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f9111a.hashCode() * 31) + AbstractC2144f.m11520a(this.f9112b);
        }
    }

    public /* synthetic */ C2142e(EnumC2254v enumC2254v, boolean z11, boolean z12, boolean z13, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? EnumC2254v.NOT_REQUIRED : enumC2254v, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13);
    }

    /* renamed from: a */
    public final long m11504a() {
        return this.f9101g;
    }

    /* renamed from: b */
    public final long m11505b() {
        return this.f9100f;
    }

    /* renamed from: c */
    public final Set m11506c() {
        return this.f9102h;
    }

    /* renamed from: d */
    public final EnumC2254v m11507d() {
        return this.f9095a;
    }

    /* renamed from: e */
    public final boolean m11508e() {
        if (Build.VERSION.SDK_INT < 24 || (!this.f9102h.isEmpty())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC19074t.m100204b(C2142e.class, obj.getClass())) {
            return false;
        }
        C2142e c2142e = (C2142e) obj;
        if (this.f9096b != c2142e.f9096b || this.f9097c != c2142e.f9097c || this.f9098d != c2142e.f9098d || this.f9099e != c2142e.f9099e || this.f9100f != c2142e.f9100f || this.f9101g != c2142e.f9101g || this.f9095a != c2142e.f9095a) {
            return false;
        }
        return AbstractC19074t.m100204b(this.f9102h, c2142e.f9102h);
    }

    /* renamed from: f */
    public final boolean m11509f() {
        return this.f9098d;
    }

    /* renamed from: g */
    public final boolean m11510g() {
        return this.f9096b;
    }

    /* renamed from: h */
    public final boolean m11511h() {
        return this.f9097c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f9095a.hashCode() * 31) + (this.f9096b ? 1 : 0)) * 31) + (this.f9097c ? 1 : 0)) * 31) + (this.f9098d ? 1 : 0)) * 31) + (this.f9099e ? 1 : 0)) * 31;
        long j11 = this.f9100f;
        int i11 = (hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f9101g;
        return ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f9102h.hashCode();
    }

    /* renamed from: i */
    public final boolean m11512i() {
        return this.f9099e;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f9095a + ", requiresCharging=" + this.f9096b + ", requiresDeviceIdle=" + this.f9097c + ", requiresBatteryNotLow=" + this.f9098d + ", requiresStorageNotLow=" + this.f9099e + ", contentTriggerUpdateDelayMillis=" + this.f9100f + ", contentTriggerMaxDelayMillis=" + this.f9101g + ", contentUriTriggers=" + this.f9102h + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2142e(EnumC2254v enumC2254v, boolean z11, boolean z12, boolean z13) {
        this(enumC2254v, z11, false, z12, z13);
        AbstractC19074t.m100208f(enumC2254v, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2142e(EnumC2254v enumC2254v, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(enumC2254v, z11, z12, z13, z14, -1L, 0L, null, 192, null);
        AbstractC19074t.m100208f(enumC2254v, "requiredNetworkType");
    }

    public /* synthetic */ C2142e(EnumC2254v enumC2254v, boolean z11, boolean z12, boolean z13, boolean z14, long j11, long j12, Set set, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? EnumC2254v.NOT_REQUIRED : enumC2254v, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) == 0 ? z14 : false, (i11 & 32) != 0 ? -1L : j11, (i11 & 64) == 0 ? j12 : -1L, (i11 & 128) != 0 ? AbstractC25379x0.m131551e() : set);
    }

    public C2142e(EnumC2254v enumC2254v, boolean z11, boolean z12, boolean z13, boolean z14, long j11, long j12, Set set) {
        AbstractC19074t.m100208f(enumC2254v, "requiredNetworkType");
        AbstractC19074t.m100208f(set, "contentUriTriggers");
        this.f9095a = enumC2254v;
        this.f9096b = z11;
        this.f9097c = z12;
        this.f9098d = z13;
        this.f9099e = z14;
        this.f9100f = j11;
        this.f9101g = j12;
        this.f9102h = set;
    }

    public C2142e(C2142e c2142e) {
        AbstractC19074t.m100208f(c2142e, "other");
        this.f9096b = c2142e.f9096b;
        this.f9097c = c2142e.f9097c;
        this.f9095a = c2142e.f9095a;
        this.f9098d = c2142e.f9098d;
        this.f9099e = c2142e.f9099e;
        this.f9102h = c2142e.f9102h;
        this.f9100f = c2142e.f9100f;
        this.f9101g = c2142e.f9101g;
    }
}
