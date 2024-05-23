package h70;

import androidx.work.AbstractC2144f;

/* renamed from: h70.d */
/* loaded from: classes5.dex */
public final class C19910d {

    /* renamed from: a */
    private final boolean f98110a;

    /* renamed from: b */
    private final int f98111b;

    public C19910d(boolean z11, int i11) {
        this.f98110a = z11;
        this.f98111b = i11;
    }

    /* renamed from: a */
    public final int m103602a() {
        return this.f98111b;
    }

    /* renamed from: b */
    public final boolean m103603b() {
        return this.f98110a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19910d)) {
            return false;
        }
        C19910d c19910d = (C19910d) obj;
        return this.f98110a == c19910d.f98110a && this.f98111b == c19910d.f98111b;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f98110a) * 31) + this.f98111b;
    }

    public String toString() {
        return "PollDetailLoadingState(loading=" + this.f98110a + ", errorCode=" + this.f98111b + ")";
    }
}
