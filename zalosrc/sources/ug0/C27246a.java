package ug0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ug0.a */
/* loaded from: classes7.dex */
public final class C27246a {

    /* renamed from: a */
    private final String f128031a;

    /* renamed from: b */
    private final int f128032b;

    /* renamed from: c */
    private final boolean f128033c;

    /* renamed from: d */
    private final boolean f128034d;

    public C27246a(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "filePath");
        this.f128031a = str;
        this.f128032b = i11;
        this.f128033c = z11;
        this.f128034d = i11 != 0 || str.length() == 0;
    }

    /* renamed from: a */
    public final int m139385a() {
        return this.f128032b;
    }

    /* renamed from: b */
    public final String m139386b() {
        return this.f128031a;
    }

    /* renamed from: c */
    public final boolean m139387c() {
        return this.f128033c;
    }

    /* renamed from: d */
    public final boolean m139388d() {
        return this.f128034d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27246a)) {
            return false;
        }
        C27246a c27246a = (C27246a) obj;
        return AbstractC19074t.m100204b(this.f128031a, c27246a.f128031a) && this.f128032b == c27246a.f128032b && this.f128033c == c27246a.f128033c;
    }

    public int hashCode() {
        return (((this.f128031a.hashCode() * 31) + this.f128032b) * 31) + AbstractC2144f.m11520a(this.f128033c);
    }

    public String toString() {
        return "MigrationBackupInfoResult(filePath=" + this.f128031a + ", errorCode=" + this.f128032b + ", isCache=" + this.f128033c + ")";
    }

    public /* synthetic */ C27246a(String str, int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? true : z11);
    }
}
