package com.google.android.gms.internal.ads;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;

/* loaded from: classes2.dex */
public final class kg4 implements ff4 {

    /* renamed from: a */
    private final pi2 f23315a;

    /* renamed from: b */
    private int f23316b;

    /* renamed from: c */
    private final jg4 f23317c;

    /* renamed from: d */
    private final nj4 f23318d;

    /* renamed from: e */
    private final bc4 f23319e;

    public kg4(pi2 pi2Var, jg4 jg4Var, byte[] bArr) {
        bc4 bc4Var = new bc4();
        nj4 nj4Var = new nj4(-1);
        this.f23315a = pi2Var;
        this.f23317c = jg4Var;
        this.f23319e = bc4Var;
        this.f23318d = nj4Var;
        this.f23316b = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
    }

    /* renamed from: a */
    public final kg4 m23947a(int i11) {
        this.f23316b = i11;
        return this;
    }

    /* renamed from: b */
    public final mg4 m23948b(C4330au c4330au) {
        c4330au.f17245b.getClass();
        return new mg4(c4330au, this.f23315a, this.f23317c, jc4.f22780a, this.f23318d, this.f23316b, null, null);
    }
}
