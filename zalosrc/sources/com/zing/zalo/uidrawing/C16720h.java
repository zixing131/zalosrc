package com.zing.zalo.uidrawing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.uidrawing.h */
/* loaded from: classes4.dex */
public class C16720h extends AbstractC16713a {

    /* renamed from: c */
    C16719g f84798c;

    /* renamed from: d */
    boolean f84799d;

    public C16720h(C16719g c16719g, int i11, C16719g c16719g2, boolean z11) {
        super(c16719g, i11);
        this.f84798c = c16719g2;
        this.f84799d = z11;
    }

    /* renamed from: g */
    private boolean m89162g() {
        C16719g c16719g;
        if (!this.f84799d && (c16719g = this.f84798c) != null && c16719g.m89136d0() != 8) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: b */
    public int mo88991b() {
        int i11;
        C16719g c16719g = this.f84798c;
        if (c16719g == null || (i11 = c16719g.f84746F) == -2147483647) {
            return -2147483647;
        }
        if (i11 == Integer.MIN_VALUE || c16719g.f84755O) {
            this.f84686a.f84755O = true;
        }
        if (i11 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (!m89162g()) {
            return i11 + this.f84798c.m89106L().f84723s;
        }
        return i11;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: c */
    public int mo88992c() {
        int i11;
        C16719g c16719g = this.f84798c;
        if (c16719g == null || (i11 = c16719g.f84743C) == -2147483647) {
            return -2147483647;
        }
        if (i11 == Integer.MIN_VALUE || c16719g.f84755O) {
            this.f84686a.f84755O = true;
        }
        if (i11 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (!m89162g()) {
            return i11 - this.f84798c.m89106L().f84720p;
        }
        return i11;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: d */
    public int mo88993d() {
        int i11;
        C16719g c16719g = this.f84798c;
        if (c16719g == null || (i11 = c16719g.f84745E) == -2147483647) {
            return -2147483647;
        }
        if (i11 == Integer.MIN_VALUE || c16719g.f84755O) {
            this.f84686a.f84755O = true;
        }
        if (i11 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (!m89162g()) {
            return i11 + this.f84798c.m89106L().f84722r;
        }
        return i11;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: e */
    public int mo88994e() {
        int i11;
        C16719g c16719g = this.f84798c;
        if (c16719g == null || (i11 = c16719g.f84744D) == -2147483647) {
            return -2147483647;
        }
        if (i11 == Integer.MIN_VALUE || c16719g.f84755O) {
            this.f84686a.f84755O = true;
        }
        if (i11 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (!m89162g()) {
            return i11 - this.f84798c.m89106L().f84721q;
        }
        return i11;
    }
}
