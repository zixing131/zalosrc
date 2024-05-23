package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zznx extends Exception {

    /* renamed from: p */
    public final int f32150p;

    /* renamed from: q */
    public final boolean f32151q;

    /* renamed from: r */
    public final C4671k3 f32152r;

    public zznx(int i11, C4671k3 c4671k3, boolean z11) {
        super("AudioTrack write failed: " + i11);
        this.f32151q = z11;
        this.f32150p = i11;
        this.f32152r = c4671k3;
    }
}
