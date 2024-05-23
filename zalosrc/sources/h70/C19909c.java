package h70;

import fn0.AbstractC19060k;
import p716zh.C31961i8;

/* renamed from: h70.c */
/* loaded from: classes5.dex */
public final class C19909c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f98107a;

    /* renamed from: b */
    private C19916j f98108b;

    /* renamed from: c */
    private C19917k f98109c;

    /* renamed from: h70.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19909c(int i11) {
        this.f98107a = i11;
    }

    /* renamed from: a */
    public final long m103596a() {
        int i11;
        String str;
        C31961i8.a m103683c;
        int i12 = this.f98107a;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    return 0L;
                }
                i11 = -1999256852;
            } else {
                C19917k c19917k = this.f98109c;
                if (c19917k != null && (m103683c = c19917k.m103683c()) != null) {
                    str = m103683c.f146905e;
                } else {
                    str = null;
                }
                i11 = ("ITEM_TYPE_POLL_OPTION" + str).hashCode();
            }
        } else {
            i11 = -185338777;
        }
        return i11;
    }

    /* renamed from: b */
    public final int m103597b() {
        return this.f98107a;
    }

    /* renamed from: c */
    public final C19916j m103598c() {
        return this.f98108b;
    }

    /* renamed from: d */
    public final C19917k m103599d() {
        return this.f98109c;
    }

    /* renamed from: e */
    public final void m103600e(C19916j c19916j) {
        this.f98108b = c19916j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19909c) && this.f98107a == ((C19909c) obj).f98107a;
    }

    /* renamed from: f */
    public final void m103601f(C19917k c19917k) {
        this.f98109c = c19917k;
    }

    public int hashCode() {
        return this.f98107a;
    }

    public String toString() {
        return "PollDetailItem(itemType=" + this.f98107a + ")";
    }
}
