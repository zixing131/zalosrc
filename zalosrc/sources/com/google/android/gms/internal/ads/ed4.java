package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class ed4 {

    /* renamed from: a */
    public final hd4 f19593a;

    /* renamed from: b */
    public final MediaFormat f19594b;

    /* renamed from: c */
    public final C4671k3 f19595c;

    /* renamed from: d */
    public final Surface f19596d;

    /* renamed from: e */
    public final MediaCrypto f19597e = null;

    private ed4(hd4 hd4Var, MediaFormat mediaFormat, C4671k3 c4671k3, Surface surface, MediaCrypto mediaCrypto, int i11) {
        this.f19593a = hd4Var;
        this.f19594b = mediaFormat;
        this.f19595c = c4671k3;
        this.f19596d = surface;
    }

    /* renamed from: a */
    public static ed4 m21696a(hd4 hd4Var, MediaFormat mediaFormat, C4671k3 c4671k3, MediaCrypto mediaCrypto) {
        return new ed4(hd4Var, mediaFormat, c4671k3, null, null, 0);
    }

    /* renamed from: b */
    public static ed4 m21697b(hd4 hd4Var, MediaFormat mediaFormat, C4671k3 c4671k3, Surface surface, MediaCrypto mediaCrypto) {
        return new ed4(hd4Var, mediaFormat, c4671k3, surface, null, 0);
    }
}
