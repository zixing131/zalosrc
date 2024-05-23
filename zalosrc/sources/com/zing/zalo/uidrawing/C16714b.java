package com.zing.zalo.uidrawing;

import hd0.C20003a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.uidrawing.b */
/* loaded from: classes4.dex */
public class C16714b extends AbstractC16713a {

    /* renamed from: c */
    private C20003a f84688c;

    public C16714b(C16719g c16719g, int i11, C20003a c20003a) {
        super(c16719g, i11);
        this.f84688c = c20003a;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: b */
    public int mo88991b() {
        int i11;
        int i12;
        C20003a c20003a = this.f84688c;
        if (c20003a == null || c20003a.m103808a() == null) {
            return -2147483647;
        }
        int i13 = -2147483647;
        int i14 = -2147483647;
        for (C16719g c16719g : this.f84688c.m103808a()) {
            if (c16719g != null && (i11 = c16719g.f84746F) != -2147483647) {
                if (i11 != Integer.MIN_VALUE) {
                    if (c16719g.m89136d0() != 8) {
                        i12 = c16719g.m89106L().f84723s;
                    } else {
                        i12 = 0;
                    }
                    i14 = Math.max(i11 + i12, i14);
                    if (this.f84688c.m103809b() && c16719g.m89136d0() != 8) {
                        i13 = Math.max(c16719g.f84746F + c16719g.m89106L().f84723s, i13);
                    }
                }
                if (c16719g.f84746F == Integer.MIN_VALUE || c16719g.f84755O) {
                    this.f84686a.f84755O = true;
                }
            }
        }
        if (!this.f84688c.m103809b() || i13 == -2147483647) {
            return i14;
        }
        return i13;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: c */
    public int mo88992c() {
        int i11;
        int i12;
        C20003a c20003a = this.f84688c;
        if (c20003a == null || c20003a.m103808a() == null) {
            return -2147483647;
        }
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (C16719g c16719g : this.f84688c.m103808a()) {
            if (c16719g != null && (i11 = c16719g.f84743C) != -2147483647) {
                if (i11 != Integer.MIN_VALUE) {
                    if (c16719g.m89136d0() != 8) {
                        i12 = c16719g.m89106L().f84720p;
                    } else {
                        i12 = 0;
                    }
                    i14 = Math.min(i11 - i12, i14);
                    if (this.f84688c.m103809b() && c16719g.m89136d0() != 8) {
                        i13 = Math.min(c16719g.f84743C - c16719g.m89106L().f84720p, i13);
                    }
                }
                if (c16719g.f84743C == Integer.MIN_VALUE || c16719g.f84755O) {
                    this.f84686a.f84755O = true;
                }
            }
        }
        if (!this.f84688c.m103809b() || i13 == Integer.MAX_VALUE) {
            i13 = i14;
        }
        if (i13 == Integer.MAX_VALUE) {
            return -2147483647;
        }
        return i13;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: d */
    public int mo88993d() {
        int i11;
        int i12;
        C20003a c20003a = this.f84688c;
        if (c20003a == null || c20003a.m103808a() == null) {
            return -2147483647;
        }
        int i13 = -2147483647;
        int i14 = -2147483647;
        for (C16719g c16719g : this.f84688c.m103808a()) {
            if (c16719g != null && (i11 = c16719g.f84745E) != -2147483647) {
                if (i11 != Integer.MIN_VALUE) {
                    if (c16719g.m89136d0() != 8) {
                        i12 = c16719g.m89106L().f84722r;
                    } else {
                        i12 = 0;
                    }
                    i14 = Math.max(i11 + i12, i14);
                    if (this.f84688c.m103809b() && c16719g.m89136d0() != 8) {
                        i13 = Math.max(c16719g.f84745E + c16719g.m89106L().f84722r, i13);
                    }
                }
                if (c16719g.f84745E == Integer.MIN_VALUE || c16719g.f84755O) {
                    this.f84686a.f84755O = true;
                }
            }
        }
        if (!this.f84688c.m103809b() || i13 == -2147483647) {
            return i14;
        }
        return i13;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: e */
    public int mo88994e() {
        int i11;
        int i12;
        C20003a c20003a = this.f84688c;
        if (c20003a == null || c20003a.m103808a() == null) {
            return -2147483647;
        }
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (C16719g c16719g : this.f84688c.m103808a()) {
            if (c16719g != null && (i11 = c16719g.f84744D) != -2147483647) {
                if (i11 != Integer.MIN_VALUE) {
                    if (c16719g.m89136d0() != 8) {
                        i12 = c16719g.m89106L().f84721q;
                    } else {
                        i12 = 0;
                    }
                    i14 = Math.min(i11 - i12, i14);
                    if (this.f84688c.m103809b() && c16719g.m89136d0() != 8) {
                        i13 = Math.min(c16719g.f84744D - c16719g.m89106L().f84721q, i13);
                    }
                }
                if (c16719g.f84744D == Integer.MIN_VALUE || c16719g.f84755O) {
                    this.f84686a.f84755O = true;
                }
            }
        }
        if (!this.f84688c.m103809b() || i13 == Integer.MAX_VALUE) {
            i13 = i14;
        }
        if (i13 == Integer.MAX_VALUE) {
            return -2147483647;
        }
        return i13;
    }

    /* renamed from: g */
    public void m88996g(C20003a c20003a) {
        this.f84688c = c20003a;
    }
}
