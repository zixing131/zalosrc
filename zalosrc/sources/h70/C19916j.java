package h70;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import p716zh.C31862c;

/* renamed from: h70.j */
/* loaded from: classes5.dex */
public final class C19916j {

    /* renamed from: a */
    private final CharSequence f98158a;

    /* renamed from: b */
    private final CharSequence f98159b;

    /* renamed from: c */
    private final boolean f98160c;

    /* renamed from: d */
    private final boolean f98161d;

    /* renamed from: e */
    private final CharSequence f98162e;

    /* renamed from: f */
    private final boolean f98163f;

    /* renamed from: g */
    private final boolean f98164g;

    /* renamed from: h */
    private final boolean f98165h;

    /* renamed from: i */
    private final CharSequence f98166i;

    /* renamed from: j */
    private final int f98167j;

    /* renamed from: k */
    private final CharSequence f98168k;

    /* renamed from: l */
    private C31862c f98169l;

    public C19916j(CharSequence charSequence, CharSequence charSequence2, boolean z11, boolean z12, CharSequence charSequence3, boolean z13, boolean z14, boolean z15, CharSequence charSequence4, int i11, CharSequence charSequence5) {
        AbstractC19074t.m100208f(charSequence, "question");
        AbstractC19074t.m100208f(charSequence2, "createInfo");
        AbstractC19074t.m100208f(charSequence3, "endTimeText");
        AbstractC19074t.m100208f(charSequence4, "choiceModeDesc");
        AbstractC19074t.m100208f(charSequence5, "votedCountDesc");
        this.f98158a = charSequence;
        this.f98159b = charSequence2;
        this.f98160c = z11;
        this.f98161d = z12;
        this.f98162e = charSequence3;
        this.f98163f = z13;
        this.f98164g = z14;
        this.f98165h = z15;
        this.f98166i = charSequence4;
        this.f98167j = i11;
        this.f98168k = charSequence5;
    }

    /* renamed from: a */
    public final boolean m103669a() {
        return this.f98165h;
    }

    /* renamed from: b */
    public final CharSequence m103670b() {
        return this.f98166i;
    }

    /* renamed from: c */
    public final CharSequence m103671c() {
        return this.f98159b;
    }

    /* renamed from: d */
    public final CharSequence m103672d() {
        return this.f98162e;
    }

    /* renamed from: e */
    public final boolean m103673e() {
        return this.f98160c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19916j)) {
            return false;
        }
        C19916j c19916j = (C19916j) obj;
        return AbstractC19074t.m100204b(this.f98158a, c19916j.f98158a) && AbstractC19074t.m100204b(this.f98159b, c19916j.f98159b) && this.f98160c == c19916j.f98160c && this.f98161d == c19916j.f98161d && AbstractC19074t.m100204b(this.f98162e, c19916j.f98162e) && this.f98163f == c19916j.f98163f && this.f98164g == c19916j.f98164g && this.f98165h == c19916j.f98165h && AbstractC19074t.m100204b(this.f98166i, c19916j.f98166i) && this.f98167j == c19916j.f98167j && AbstractC19074t.m100204b(this.f98168k, c19916j.f98168k);
    }

    /* renamed from: f */
    public final CharSequence m103674f() {
        return this.f98158a;
    }

    /* renamed from: g */
    public final C31862c m103675g() {
        return this.f98169l;
    }

    /* renamed from: h */
    public final CharSequence m103676h() {
        return this.f98168k;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f98158a.hashCode() * 31) + this.f98159b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f98160c)) * 31) + AbstractC2144f.m11520a(this.f98161d)) * 31) + this.f98162e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f98163f)) * 31) + AbstractC2144f.m11520a(this.f98164g)) * 31) + AbstractC2144f.m11520a(this.f98165h)) * 31) + this.f98166i.hashCode()) * 31) + this.f98167j) * 31) + this.f98168k.hashCode();
    }

    /* renamed from: i */
    public final int m103677i() {
        return this.f98167j;
    }

    /* renamed from: j */
    public final boolean m103678j() {
        return this.f98163f;
    }

    /* renamed from: k */
    public final boolean m103679k() {
        return this.f98164g;
    }

    /* renamed from: l */
    public final void m103680l(C31862c c31862c) {
        this.f98169l = c31862c;
    }

    public String toString() {
        CharSequence charSequence = this.f98158a;
        CharSequence charSequence2 = this.f98159b;
        boolean z11 = this.f98160c;
        boolean z12 = this.f98161d;
        CharSequence charSequence3 = this.f98162e;
        boolean z13 = this.f98163f;
        boolean z14 = this.f98164g;
        boolean z15 = this.f98165h;
        CharSequence charSequence4 = this.f98166i;
        return "PollInfoData(question=" + ((Object) charSequence) + ", createInfo=" + ((Object) charSequence2) + ", hasEndTime=" + z11 + ", isEnded=" + z12 + ", endTimeText=" + ((Object) charSequence3) + ", isAnonymous=" + z13 + ", isHideVotePreview=" + z14 + ", canShowVoteDetail=" + z15 + ", choiceModeDesc=" + ((Object) charSequence4) + ", votesCount=" + this.f98167j + ", votedCountDesc=" + ((Object) this.f98168k) + ")";
    }
}
