package com.zing.zalo.uidrawing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.uidrawing.j */
/* loaded from: classes4.dex */
public class C16722j extends AbstractC16713a {
    public C16722j(C16719g c16719g, int i11) {
        super(c16719g, i11);
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: b */
    public int mo88991b() {
        C16719g c16719g = this.f84686a;
        if (c16719g != null && c16719g.m89116Q() != null) {
            InterfaceC16721i m89116Q = this.f84686a.m89116Q();
            if (m89116Q.getHeightMeasureMode() == 0) {
                this.f84686a.f84755O = true;
                return Integer.MIN_VALUE;
            }
            return (m89116Q.getHeightMeasureSize() - m89116Q.getPaddingTop()) - m89116Q.getPaddingBottom();
        }
        return -2147483647;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: c */
    public int mo88992c() {
        C16719g c16719g = this.f84686a;
        if (c16719g != null && c16719g.m89116Q() != null) {
            return 0;
        }
        return -2147483647;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: d */
    public int mo88993d() {
        C16719g c16719g = this.f84686a;
        if (c16719g != null && c16719g.m89116Q() != null) {
            InterfaceC16721i m89116Q = this.f84686a.m89116Q();
            if (m89116Q.getWidthMeasureMode() == 0) {
                this.f84686a.f84755O = true;
                return Integer.MIN_VALUE;
            }
            return (m89116Q.getWidthMeasureSize() - m89116Q.getPaddingLeft()) - m89116Q.getPaddingRight();
        }
        return -2147483647;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: e */
    public int mo88994e() {
        C16719g c16719g = this.f84686a;
        if (c16719g != null && c16719g.m89116Q() != null) {
            return 0;
        }
        return -2147483647;
    }
}
