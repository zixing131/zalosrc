package uz;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: uz.a */
/* loaded from: classes4.dex */
public final class C27385a {

    /* renamed from: a */
    private final a f129020a;

    /* renamed from: b */
    private final String f129021b;

    /* renamed from: c */
    private final float f129022c;

    /* renamed from: d */
    private final boolean f129023d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: uz.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f129024p = new a("CameraPreview", 0);

        /* renamed from: q */
        public static final a f129025q = new a("Bitmap", 1);

        /* renamed from: r */
        private static final /* synthetic */ a[] f129026r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f129027s;

        static {
            a[] m140306b = m140306b();
            f129026r = m140306b;
            f129027s = AbstractC30166b.m148796a(m140306b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m140306b() {
            return new a[]{f129024p, f129025q};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f129026r.clone();
        }
    }

    public C27385a(a aVar, String str, float f11, boolean z11) {
        AbstractC19074t.m100208f(aVar, "reportSource");
        AbstractC19074t.m100208f(str, "reportFile");
        this.f129020a = aVar;
        this.f129021b = str;
        this.f129022c = f11;
        this.f129023d = z11;
    }

    /* renamed from: a */
    public final float m140302a() {
        return this.f129022c;
    }

    /* renamed from: b */
    public final String m140303b() {
        return this.f129021b;
    }

    /* renamed from: c */
    public final a m140304c() {
        return this.f129020a;
    }

    /* renamed from: d */
    public final boolean m140305d() {
        return this.f129023d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27385a)) {
            return false;
        }
        C27385a c27385a = (C27385a) obj;
        return this.f129020a == c27385a.f129020a && AbstractC19074t.m100204b(this.f129021b, c27385a.f129021b) && Float.compare(this.f129022c, c27385a.f129022c) == 0 && this.f129023d == c27385a.f129023d;
    }

    public int hashCode() {
        return (((((this.f129020a.hashCode() * 31) + this.f129021b.hashCode()) * 31) + Float.floatToIntBits(this.f129022c)) * 31) + AbstractC2144f.m11520a(this.f129023d);
    }

    public String toString() {
        return "BottomSheetReportQRData(reportSource=" + this.f129020a + ", reportFile=" + this.f129021b + ", modelScore=" + this.f129022c + ", isTempReportFile=" + this.f129023d + ")";
    }

    public /* synthetic */ C27385a(a aVar, String str, float f11, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this(aVar, str, f11, (i11 & 8) != 0 ? true : z11);
    }
}
