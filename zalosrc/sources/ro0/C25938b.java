package ro0;

import androidx.work.AbstractC2144f;

/* renamed from: ro0.b */
/* loaded from: classes7.dex */
public final class C25938b {

    /* renamed from: a */
    private final int f123679a;

    /* renamed from: b */
    private final int f123680b;

    /* renamed from: c */
    private boolean f123681c;

    public C25938b(int i11, int i12, boolean z11) {
        this.f123679a = i11;
        this.f123680b = i12;
        this.f123681c = z11;
    }

    /* renamed from: a */
    public final int m133645a() {
        return this.f123680b;
    }

    /* renamed from: b */
    public final int m133646b() {
        return this.f123679a;
    }

    /* renamed from: c */
    public final boolean m133647c() {
        return this.f123681c;
    }

    /* renamed from: d */
    public final void m133648d(boolean z11) {
        this.f123681c = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25938b)) {
            return false;
        }
        C25938b c25938b = (C25938b) obj;
        return this.f123679a == c25938b.f123679a && this.f123680b == c25938b.f123680b && this.f123681c == c25938b.f123681c;
    }

    public int hashCode() {
        return (((this.f123679a * 31) + this.f123680b) * 31) + AbstractC2144f.m11520a(this.f123681c);
    }

    public String toString() {
        return "CallMiddleScreenEvent(type=" + this.f123679a + ", subType=" + this.f123680b + ", isValid=" + this.f123681c + ")";
    }

    public C25938b(int i11, int i12) {
        this(i11, i12, true);
    }
}
