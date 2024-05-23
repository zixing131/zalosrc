package com.zing.zalo.zdesign.component.avatar;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.zdesign.component.avatar.d */
/* loaded from: classes7.dex */
public final class C16948d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f86511a;

    /* renamed from: b */
    private String f86512b;

    /* renamed from: c */
    private String f86513c;

    /* renamed from: d */
    private String f86514d;

    /* renamed from: com.zing.zalo.zdesign.component.avatar.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C16948d(int i11, String str, String str2, String str3) {
        this.f86511a = i11;
        this.f86512b = str;
        this.f86513c = str2;
        this.f86514d = str3;
    }

    /* renamed from: a */
    public final int m90774a() {
        return this.f86511a;
    }

    /* renamed from: b */
    public final String m90775b() {
        return this.f86514d;
    }

    /* renamed from: c */
    public final String m90776c() {
        return this.f86513c;
    }

    /* renamed from: d */
    public final String m90777d() {
        return this.f86512b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16948d)) {
            return false;
        }
        C16948d c16948d = (C16948d) obj;
        return this.f86511a == c16948d.f86511a && AbstractC19074t.m100204b(this.f86512b, c16948d.f86512b) && AbstractC19074t.m100204b(this.f86513c, c16948d.f86513c) && AbstractC19074t.m100204b(this.f86514d, c16948d.f86514d);
    }

    public int hashCode() {
        int i11 = this.f86511a * 31;
        String str = this.f86512b;
        int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86513c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86514d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AvatarProperties(avatarType=" + this.f86511a + ", uid=" + this.f86512b + ", shortDpn=" + this.f86513c + ", avatarUrl=" + this.f86514d + ')';
    }
}
