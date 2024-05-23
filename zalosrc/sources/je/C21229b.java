package je;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;

/* renamed from: je.b */
/* loaded from: classes3.dex */
public final class C21229b {

    /* renamed from: a */
    private final int f103502a;

    /* renamed from: b */
    private final long f103503b;

    /* renamed from: c */
    private final ArrayList f103504c;

    /* renamed from: d */
    private int f103505d;

    public C21229b(int i11, long j11, ArrayList arrayList, int i12) {
        AbstractC19074t.m100208f(arrayList, "ringBackTones");
        this.f103502a = i11;
        this.f103503b = j11;
        this.f103504c = arrayList;
        this.f103505d = i12;
    }

    /* renamed from: a */
    public final long m110014a() {
        return this.f103503b;
    }

    /* renamed from: b */
    public final int m110015b() {
        return this.f103505d;
    }

    /* renamed from: c */
    public final ArrayList m110016c() {
        return this.f103504c;
    }

    /* renamed from: d */
    public final int m110017d() {
        return this.f103502a;
    }

    /* renamed from: e */
    public final void m110018e(int i11) {
        this.f103505d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21229b)) {
            return false;
        }
        C21229b c21229b = (C21229b) obj;
        return this.f103502a == c21229b.f103502a && this.f103503b == c21229b.f103503b && AbstractC19074t.m100204b(this.f103504c, c21229b.f103504c) && this.f103505d == c21229b.f103505d;
    }

    public int hashCode() {
        return (((((this.f103502a * 31) + AbstractC2147g0.m11521a(this.f103503b)) * 31) + this.f103504c.hashCode()) * 31) + this.f103505d;
    }

    public String toString() {
        return "RingBackToneResult(status=" + this.f103502a + ", expiredDate=" + this.f103503b + ", ringBackTones=" + this.f103504c + ", positionOfSelectedRBT=" + this.f103505d + ")";
    }

    public /* synthetic */ C21229b(int i11, long j11, ArrayList arrayList, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(i11, j11, arrayList, (i13 & 8) != 0 ? 0 : i12);
    }
}
