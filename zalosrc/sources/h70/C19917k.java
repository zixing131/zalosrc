package h70;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import p716zh.C31961i8;

/* renamed from: h70.k */
/* loaded from: classes5.dex */
public final class C19917k {

    /* renamed from: a */
    private final C31961i8.a f98170a;

    /* renamed from: b */
    private final boolean f98171b;

    /* renamed from: c */
    private CharSequence f98172c;

    /* renamed from: d */
    private float f98173d;

    /* renamed from: e */
    private boolean f98174e;

    /* renamed from: f */
    private final boolean f98175f;

    /* renamed from: g */
    private int f98176g;

    /* renamed from: h */
    private boolean f98177h;

    /* renamed from: i */
    private boolean f98178i;

    /* renamed from: j */
    private boolean f98179j;

    public C19917k(C31961i8.a aVar, boolean z11, CharSequence charSequence, float f11, boolean z12, boolean z13, int i11, boolean z14, boolean z15, boolean z16) {
        AbstractC19074t.m100208f(aVar, "pollOption");
        AbstractC19074t.m100208f(charSequence, "optionText");
        this.f98170a = aVar;
        this.f98171b = z11;
        this.f98172c = charSequence;
        this.f98173d = f11;
        this.f98174e = z12;
        this.f98175f = z13;
        this.f98176g = i11;
        this.f98177h = z14;
        this.f98178i = z15;
        this.f98179j = z16;
    }

    /* renamed from: a */
    public final boolean m103681a() {
        return this.f98175f;
    }

    /* renamed from: b */
    public final boolean m103682b() {
        return this.f98177h;
    }

    /* renamed from: c */
    public final C31961i8.a m103683c() {
        return this.f98170a;
    }

    /* renamed from: d */
    public final int m103684d() {
        return this.f98176g;
    }

    /* renamed from: e */
    public final boolean m103685e() {
        return this.f98174e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19917k)) {
            return false;
        }
        C19917k c19917k = (C19917k) obj;
        return AbstractC19074t.m100204b(this.f98170a, c19917k.f98170a) && this.f98171b == c19917k.f98171b && AbstractC19074t.m100204b(this.f98172c, c19917k.f98172c) && Float.compare(this.f98173d, c19917k.f98173d) == 0 && this.f98174e == c19917k.f98174e && this.f98175f == c19917k.f98175f && this.f98176g == c19917k.f98176g && this.f98177h == c19917k.f98177h && this.f98178i == c19917k.f98178i && this.f98179j == c19917k.f98179j;
    }

    /* renamed from: f */
    public final float m103686f() {
        return this.f98173d;
    }

    /* renamed from: g */
    public final boolean m103687g() {
        return this.f98179j;
    }

    /* renamed from: h */
    public final boolean m103688h() {
        return this.f98171b;
    }

    public int hashCode() {
        return (((((((((((((((((this.f98170a.hashCode() * 31) + AbstractC2144f.m11520a(this.f98171b)) * 31) + this.f98172c.hashCode()) * 31) + Float.floatToIntBits(this.f98173d)) * 31) + AbstractC2144f.m11520a(this.f98174e)) * 31) + AbstractC2144f.m11520a(this.f98175f)) * 31) + this.f98176g) * 31) + AbstractC2144f.m11520a(this.f98177h)) * 31) + AbstractC2144f.m11520a(this.f98178i)) * 31) + AbstractC2144f.m11520a(this.f98179j);
    }

    /* renamed from: i */
    public final void m103689i(boolean z11) {
        this.f98174e = z11;
    }

    /* renamed from: j */
    public final void m103690j(float f11) {
        this.f98173d = f11;
    }

    public String toString() {
        C31961i8.a aVar = this.f98170a;
        boolean z11 = this.f98171b;
        CharSequence charSequence = this.f98172c;
        return "PollOptionData(pollOption=" + aVar + ", isVoted=" + z11 + ", optionText=" + ((Object) charSequence) + ", votePercentage=" + this.f98173d + ", userVotedInPoll=" + this.f98174e + ", canUserVote=" + this.f98175f + ", pollState=" + this.f98176g + ", pollHasVotes=" + this.f98177h + ", isMultichoice=" + this.f98178i + ", isAnonymous=" + this.f98179j + ")";
    }
}
