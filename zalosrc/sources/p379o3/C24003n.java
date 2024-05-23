package p379o3;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p471r3.EnumC25629a;

/* renamed from: o3.n */
/* loaded from: classes2.dex */
public final class C24003n {

    /* renamed from: z */
    public static final a f116259z = new a(null);

    /* renamed from: a */
    public int f116260a;

    /* renamed from: b */
    public Drawable f116261b;

    /* renamed from: c */
    public int f116262c;

    /* renamed from: d */
    public boolean f116263d;

    /* renamed from: e */
    public int f116264e;

    /* renamed from: f */
    public boolean f116265f;

    /* renamed from: g */
    public EnumC25629a f116266g;

    /* renamed from: h */
    public boolean f116267h;

    /* renamed from: i */
    public boolean f116268i;

    /* renamed from: j */
    public boolean f116269j;

    /* renamed from: k */
    public float f116270k;

    /* renamed from: l */
    public int f116271l;

    /* renamed from: m */
    public boolean f116272m;

    /* renamed from: n */
    public boolean f116273n;

    /* renamed from: o */
    public int f116274o;

    /* renamed from: p */
    public boolean f116275p;

    /* renamed from: q */
    public boolean f116276q;

    /* renamed from: r */
    public Drawable f116277r;

    /* renamed from: s */
    public int f116278s;

    /* renamed from: t */
    public float f116279t;

    /* renamed from: u */
    public boolean f116280u;

    /* renamed from: v */
    public boolean f116281v;

    /* renamed from: w */
    public Rect f116282w;

    /* renamed from: x */
    public boolean f116283x;

    /* renamed from: y */
    public boolean f116284y;

    /* renamed from: o3.n$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24003n() {
        this(0, null, 0, false, 0, false, null, 127, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C24003n m125832b(C24003n c24003n, int i11, Drawable drawable, int i12, boolean z11, int i13, boolean z12, EnumC25629a enumC25629a, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = c24003n.f116260a;
        }
        if ((i14 & 2) != 0) {
            drawable = c24003n.f116261b;
        }
        Drawable drawable2 = drawable;
        if ((i14 & 4) != 0) {
            i12 = c24003n.f116262c;
        }
        int i15 = i12;
        if ((i14 & 8) != 0) {
            z11 = c24003n.f116263d;
        }
        boolean z13 = z11;
        if ((i14 & 16) != 0) {
            i13 = c24003n.f116264e;
        }
        int i16 = i13;
        if ((i14 & 32) != 0) {
            z12 = c24003n.f116265f;
        }
        boolean z14 = z12;
        if ((i14 & 64) != 0) {
            enumC25629a = c24003n.f116266g;
        }
        return c24003n.m125833a(i11, drawable2, i15, z13, i16, z14, enumC25629a);
    }

    /* renamed from: a */
    public final C24003n m125833a(int i11, Drawable drawable, int i12, boolean z11, int i13, boolean z12, EnumC25629a enumC25629a) {
        return new C24003n(i11, drawable, i12, z11, i13, z12, enumC25629a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24003n)) {
            return false;
        }
        C24003n c24003n = (C24003n) obj;
        return this.f116260a == c24003n.f116260a && AbstractC19074t.m100204b(this.f116261b, c24003n.f116261b) && this.f116262c == c24003n.f116262c && this.f116263d == c24003n.f116263d && this.f116264e == c24003n.f116264e && this.f116265f == c24003n.f116265f && this.f116266g == c24003n.f116266g;
    }

    public int hashCode() {
        int i11 = this.f116260a * 31;
        Drawable drawable = this.f116261b;
        int hashCode = (((((((((i11 + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f116262c) * 31) + AbstractC2144f.m11520a(this.f116263d)) * 31) + this.f116264e) * 31) + AbstractC2144f.m11520a(this.f116265f)) * 31;
        EnumC25629a enumC25629a = this.f116266g;
        return hashCode + (enumC25629a != null ? enumC25629a.hashCode() : 0);
    }

    public String toString() {
        return "ImageOptions(targetWidth=" + this.f116260a + ", preset=" + this.f116261b + ", animation=" + this.f116262c + ", rotate=" + this.f116263d + ", round=" + this.f116264e + ", isAvatar=" + this.f116265f + ", memoryOption=" + this.f116266g + ")";
    }

    public C24003n(int i11, Drawable drawable, int i12, boolean z11, int i13, boolean z12, EnumC25629a enumC25629a) {
        this.f116260a = i11;
        this.f116261b = drawable;
        this.f116262c = i12;
        this.f116263d = z11;
        this.f116264e = i13;
        this.f116265f = z12;
        this.f116266g = enumC25629a;
        this.f116275p = true;
        this.f116276q = true;
        this.f116279t = Float.MAX_VALUE;
    }

    public /* synthetic */ C24003n(int i11, Drawable drawable, int i12, boolean z11, int i13, boolean z12, EnumC25629a enumC25629a, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? null : drawable, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? false : z11, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) == 0 ? z12 : false, (i14 & 64) != 0 ? null : enumC25629a);
    }
}
