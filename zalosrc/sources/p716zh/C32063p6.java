package p716zh;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p560uw.EnumC27375b;

/* renamed from: zh.p6 */
/* loaded from: classes3.dex */
public final class C32063p6 {

    /* renamed from: a */
    private EnumC27375b f147632a;

    /* renamed from: b */
    private boolean f147633b;

    /* renamed from: c */
    private boolean f147634c;

    /* renamed from: d */
    private final int f147635d;

    /* renamed from: e */
    private final long f147636e;

    /* renamed from: f */
    private boolean f147637f;

    public C32063p6() {
        this(null, false, false, 0, 0L, false, 63, null);
    }

    /* renamed from: a */
    public final int m154677a() {
        return this.f147635d;
    }

    /* renamed from: b */
    public final boolean m154678b() {
        return this.f147633b;
    }

    /* renamed from: c */
    public final boolean m154679c() {
        return this.f147634c;
    }

    /* renamed from: d */
    public final EnumC27375b m154680d() {
        return this.f147632a;
    }

    /* renamed from: e */
    public final long m154681e() {
        return this.f147636e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32063p6)) {
            return false;
        }
        C32063p6 c32063p6 = (C32063p6) obj;
        return this.f147632a == c32063p6.f147632a && this.f147633b == c32063p6.f147633b && this.f147634c == c32063p6.f147634c && this.f147635d == c32063p6.f147635d && this.f147636e == c32063p6.f147636e && this.f147637f == c32063p6.f147637f;
    }

    /* renamed from: f */
    public final boolean m154682f() {
        return this.f147637f;
    }

    public int hashCode() {
        return (((((((((this.f147632a.hashCode() * 31) + AbstractC2144f.m11520a(this.f147633b)) * 31) + AbstractC2144f.m11520a(this.f147634c)) * 31) + this.f147635d) * 31) + AbstractC2147g0.m11521a(this.f147636e)) * 31) + AbstractC2144f.m11520a(this.f147637f);
    }

    public String toString() {
        return "LogLinkInfo(source=" + this.f147632a + ", hasPreview=" + this.f147633b + ", hasThumbnail=" + this.f147634c + ", contain=" + this.f147635d + ", timeLoad=" + this.f147636e + ", isHidePreview=" + this.f147637f + ")";
    }

    public C32063p6(EnumC27375b enumC27375b, boolean z11, boolean z12, int i11, long j11, boolean z13) {
        AbstractC19074t.m100208f(enumC27375b, "source");
        this.f147632a = enumC27375b;
        this.f147633b = z11;
        this.f147634c = z12;
        this.f147635d = i11;
        this.f147636e = j11;
        this.f147637f = z13;
    }

    public /* synthetic */ C32063p6(EnumC27375b enumC27375b, boolean z11, boolean z12, int i11, long j11, boolean z13, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? EnumC27375b.f128972q : enumC27375b, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? -1 : i11, (i12 & 16) != 0 ? 0L : j11, (i12 & 32) == 0 ? z13 : false);
    }
}
