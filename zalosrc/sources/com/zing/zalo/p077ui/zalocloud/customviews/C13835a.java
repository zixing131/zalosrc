package com.zing.zalo.p077ui.zalocloud.customviews;

import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.zalocloud.customviews.a */
/* loaded from: classes6.dex */
public final class C13835a {

    /* renamed from: a */
    private final int f71533a;

    /* renamed from: b */
    private final String f71534b;

    /* renamed from: c */
    private final String f71535c;

    /* renamed from: d */
    private final String f71536d;

    /* renamed from: e */
    private final String f71537e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zalocloud.customviews.a$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f71538p = new a("CURRENT", 0);

        /* renamed from: q */
        public static final a f71539q = new a("DONE", 1);

        /* renamed from: r */
        public static final a f71540r = new a("NEXT", 2);

        /* renamed from: s */
        public static final a f71541s = new a("FINAL", 3);

        /* renamed from: t */
        public static final a f71542t = new a("CURRENT_FINAL", 4);

        /* renamed from: u */
        private static final /* synthetic */ a[] f71543u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f71544v;

        static {
            a[] m77126b = m77126b();
            f71543u = m77126b;
            f71544v = AbstractC30166b.m148796a(m77126b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m77126b() {
            return new a[]{f71538p, f71539q, f71540r, f71541s, f71542t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f71543u.clone();
        }
    }

    public C13835a(int i11, String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "description");
        AbstractC19074t.m100208f(str3, "finishTitle");
        AbstractC19074t.m100208f(str4, "finishDescription");
        this.f71533a = i11;
        this.f71534b = str;
        this.f71535c = str2;
        this.f71536d = str3;
        this.f71537e = str4;
    }

    /* renamed from: a */
    public final String m77121a() {
        return this.f71535c;
    }

    /* renamed from: b */
    public final String m77122b() {
        return this.f71537e;
    }

    /* renamed from: c */
    public final String m77123c() {
        return this.f71536d;
    }

    /* renamed from: d */
    public final int m77124d() {
        return this.f71533a;
    }

    /* renamed from: e */
    public final String m77125e() {
        return this.f71534b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13835a)) {
            return false;
        }
        C13835a c13835a = (C13835a) obj;
        return this.f71533a == c13835a.f71533a && AbstractC19074t.m100204b(this.f71534b, c13835a.f71534b) && AbstractC19074t.m100204b(this.f71535c, c13835a.f71535c) && AbstractC19074t.m100204b(this.f71536d, c13835a.f71536d) && AbstractC19074t.m100204b(this.f71537e, c13835a.f71537e);
    }

    public int hashCode() {
        return (((((((this.f71533a * 31) + this.f71534b.hashCode()) * 31) + this.f71535c.hashCode()) * 31) + this.f71536d.hashCode()) * 31) + this.f71537e.hashCode();
    }

    public String toString() {
        return "Step(stepNumber=" + this.f71533a + ", title=" + this.f71534b + ", description=" + this.f71535c + ", finishTitle=" + this.f71536d + ", finishDescription=" + this.f71537e + ")";
    }
}
