package com.zing.zalo.uidrawing;

import hd0.C20005c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.uidrawing.e */
/* loaded from: classes4.dex */
public class C16717e extends AbstractC16713a {

    /* renamed from: c */
    public C20005c f84704c;

    public C16717e(C16719g c16719g, int i11, C20005c c20005c) {
        super(c16719g, i11);
        this.f84704c = c20005c;
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: b */
    public int mo88991b() {
        return m89010h();
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: c */
    public int mo88992c() {
        return m89009g();
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: d */
    public int mo88993d() {
        return m89009g();
    }

    @Override // com.zing.zalo.uidrawing.AbstractC16713a
    /* renamed from: e */
    public int mo88994e() {
        return m89010h();
    }

    /* renamed from: g */
    public int m89009g() {
        C16719g c16719g;
        if (this.f84704c != null && (c16719g = this.f84686a) != null && c16719g.m89116Q() != null) {
            int m103820c = this.f84704c.m103820c();
            C16719g c16719g2 = this.f84686a;
            if (c16719g2 != null && c16719g2.m89116Q() != null) {
                InterfaceC16721i m89116Q = this.f84686a.m89116Q();
                m103820c = (int) (m103820c + (m89116Q.getCurrentWidth() * this.f84704c.m103818a()));
                if (m89116Q.getWidthMeasureMode() != 1073741824) {
                    this.f84686a.f84755O = true;
                }
            }
            return m103820c;
        }
        return 0;
    }

    /* renamed from: h */
    public int m89010h() {
        C16719g c16719g;
        if (this.f84704c != null && (c16719g = this.f84686a) != null && c16719g.m89116Q() != null) {
            int m103821d = this.f84704c.m103821d();
            C16719g c16719g2 = this.f84686a;
            if (c16719g2 != null && c16719g2.m89116Q() != null) {
                InterfaceC16721i m89116Q = this.f84686a.m89116Q();
                m103821d = (int) (m103821d + (m89116Q.getCurrentHeight() * this.f84704c.m103819b()));
                if (m89116Q.getHeightMeasureMode() != 1073741824) {
                    this.f84686a.f84755O = true;
                }
            }
            return m103821d;
        }
        return 0;
    }
}
