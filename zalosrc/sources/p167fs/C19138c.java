package p167fs;

import fn0.AbstractC19060k;

/* renamed from: fs.c */
/* loaded from: classes4.dex */
public final class C19138c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f95169a;

    /* renamed from: b */
    private final int f95170b;

    /* renamed from: c */
    private final int f95171c;

    /* renamed from: fs.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19138c(int i11, int i12, int i13) {
        this.f95169a = i11;
        this.f95170b = i12;
        this.f95171c = i13;
    }

    /* renamed from: a */
    public final int m100446a() {
        return this.f95170b;
    }

    /* renamed from: b */
    public final int m100447b() {
        return this.f95171c;
    }

    /* renamed from: c */
    public final int m100448c() {
        return this.f95169a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19138c)) {
            return false;
        }
        C19138c c19138c = (C19138c) obj;
        return this.f95169a == c19138c.f95169a && this.f95170b == c19138c.f95170b && this.f95171c == c19138c.f95171c;
    }

    public int hashCode() {
        return (((this.f95169a * 31) + this.f95170b) * 31) + this.f95171c;
    }

    public String toString() {
        return "FeedReactionTrackingParams(reactContext=" + this.f95169a + ", currentReactId=" + this.f95170b + ", newReactId=" + this.f95171c + ")";
    }
}
