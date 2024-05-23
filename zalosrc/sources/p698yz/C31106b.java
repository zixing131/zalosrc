package p698yz;

import fn0.AbstractC19074t;

/* renamed from: yz.b */
/* loaded from: classes4.dex */
public final class C31106b {

    /* renamed from: a */
    private final CharSequence f143340a;

    /* renamed from: b */
    private final int f143341b;

    public C31106b(CharSequence charSequence, int i11) {
        AbstractC19074t.m100208f(charSequence, "statusMessage");
        this.f143340a = charSequence;
        this.f143341b = i11;
    }

    /* renamed from: a */
    public final CharSequence m151115a() {
        return this.f143340a;
    }

    /* renamed from: b */
    public final int m151116b() {
        return this.f143341b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31106b)) {
            return false;
        }
        C31106b c31106b = (C31106b) obj;
        return AbstractC19074t.m100204b(this.f143340a, c31106b.f143340a) && this.f143341b == c31106b.f143341b;
    }

    public int hashCode() {
        return (this.f143340a.hashCode() * 31) + this.f143341b;
    }

    public String toString() {
        CharSequence charSequence = this.f143340a;
        return "ChatFileStatusMessage(statusMessage=" + ((Object) charSequence) + ", statusTextColor=" + this.f143341b + ")";
    }
}
