package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.s0 */
/* loaded from: classes2.dex */
final class C4966s0 extends AbstractC5114w0 {

    /* renamed from: e */
    private static final int[] f27426e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f27427b;

    /* renamed from: c */
    private boolean f27428c;

    /* renamed from: d */
    private int f27429d;

    public C4966s0(InterfaceC4928r interfaceC4928r) {
        super(interfaceC4928r);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5114w0
    /* renamed from: a */
    protected final boolean mo26217a(x02 x02Var) {
        String str;
        if (!this.f27427b) {
            int m27788s = x02Var.m27788s();
            int i11 = m27788s >> 4;
            this.f27429d = i11;
            if (i11 == 2) {
                int i12 = f27426e[(m27788s >> 2) & 3];
                C5004t1 c5004t1 = new C5004t1();
                c5004t1.m26523s("audio/mpeg");
                c5004t1.m26506e0(1);
                c5004t1.m26524t(i12);
                this.f29649a.mo23300d(c5004t1.m26529y());
                this.f27428c = true;
            } else if (i11 != 7 && i11 != 8) {
                if (i11 != 10) {
                    throw new zzabt("Audio format not supported: " + i11);
                }
            } else {
                if (i11 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                C5004t1 c5004t12 = new C5004t1();
                c5004t12.m26523s(str);
                c5004t12.m26506e0(1);
                c5004t12.m26524t(8000);
                this.f29649a.mo23300d(c5004t12.m26529y());
                this.f27428c = true;
            }
            this.f27427b = true;
        } else {
            x02Var.m27776g(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5114w0
    /* renamed from: b */
    protected final boolean mo26218b(x02 x02Var, long j11) {
        if (this.f27429d == 2) {
            int m27778i = x02Var.m27778i();
            this.f29649a.mo23301e(x02Var, m27778i);
            this.f29649a.mo23302f(j11, 1, m27778i, 0, null);
            return true;
        }
        int m27788s = x02Var.m27788s();
        if (m27788s == 0 && !this.f27428c) {
            int m27778i2 = x02Var.m27778i();
            byte[] bArr = new byte[m27778i2];
            x02Var.m27771b(bArr, 0, m27778i2);
            fl4 m22466a = gl4.m22466a(bArr);
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26523s("audio/mp4a-latm");
            c5004t1.m26508f0(m22466a.f20188c);
            c5004t1.m26506e0(m22466a.f20187b);
            c5004t1.m26524t(m22466a.f20186a);
            c5004t1.m26513i(Collections.singletonList(bArr));
            this.f29649a.mo23300d(c5004t1.m26529y());
            this.f27428c = true;
            return false;
        }
        if (this.f27429d == 10 && m27788s != 1) {
            return false;
        }
        int m27778i3 = x02Var.m27778i();
        this.f29649a.mo23301e(x02Var, m27778i3);
        this.f29649a.mo23302f(j11, 1, m27778i3, 0, null);
        return true;
    }
}
