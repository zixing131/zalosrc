package zo0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zo0.a */
/* loaded from: classes7.dex */
public final class C32532a {

    /* renamed from: a */
    private final EnumC32540i f150274a;

    /* renamed from: b */
    private final EnumC32540i f150275b;

    /* renamed from: c */
    private final int f150276c;

    /* renamed from: d */
    private final boolean f150277d;

    public C32532a(EnumC32540i enumC32540i, EnumC32540i enumC32540i2, int i11, boolean z11) {
        AbstractC19074t.m100208f(enumC32540i, "splitMode");
        AbstractC19074t.m100208f(enumC32540i2, "skinFilter");
        this.f150274a = enumC32540i;
        this.f150275b = enumC32540i2;
        this.f150276c = i11;
        this.f150277d = z11;
    }

    /* renamed from: b */
    public static /* synthetic */ C32532a m157497b(C32532a c32532a, EnumC32540i enumC32540i, EnumC32540i enumC32540i2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            enumC32540i = c32532a.f150274a;
        }
        if ((i12 & 2) != 0) {
            enumC32540i2 = c32532a.f150275b;
        }
        if ((i12 & 4) != 0) {
            i11 = c32532a.f150276c;
        }
        if ((i12 & 8) != 0) {
            z11 = c32532a.f150277d;
        }
        return c32532a.m157498a(enumC32540i, enumC32540i2, i11, z11);
    }

    /* renamed from: a */
    public final C32532a m157498a(EnumC32540i enumC32540i, EnumC32540i enumC32540i2, int i11, boolean z11) {
        AbstractC19074t.m100208f(enumC32540i, "splitMode");
        AbstractC19074t.m100208f(enumC32540i2, "skinFilter");
        return new C32532a(enumC32540i, enumC32540i2, i11, z11);
    }

    /* renamed from: c */
    public final int m157499c() {
        return this.f150276c;
    }

    /* renamed from: d */
    public final boolean m157500d() {
        return this.f150277d;
    }

    /* renamed from: e */
    public final EnumC32540i m157501e() {
        return this.f150275b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32532a)) {
            return false;
        }
        C32532a c32532a = (C32532a) obj;
        return this.f150274a == c32532a.f150274a && this.f150275b == c32532a.f150275b && this.f150276c == c32532a.f150276c && this.f150277d == c32532a.f150277d;
    }

    /* renamed from: f */
    public final EnumC32540i m157502f() {
        return this.f150274a;
    }

    public int hashCode() {
        return (((((this.f150274a.hashCode() * 31) + this.f150275b.hashCode()) * 31) + this.f150276c) * 31) + AbstractC2144f.m11520a(this.f150277d);
    }

    public String toString() {
        return "CallConfigUiState(splitMode=" + this.f150274a + ", skinFilter=" + this.f150275b + ", audioOutput=" + this.f150276c + ", close=" + this.f150277d + ")";
    }

    public /* synthetic */ C32532a(EnumC32540i enumC32540i, EnumC32540i enumC32540i2, int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this(enumC32540i, enumC32540i2, i11, (i12 & 8) != 0 ? false : z11);
    }
}
