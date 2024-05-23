package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zznu extends Exception {

    /* renamed from: p */
    public final int f32147p;

    /* renamed from: q */
    public final boolean f32148q;

    /* renamed from: r */
    public final C4671k3 f32149r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zznu(int i11, int i12, int i13, int i14, C4671k3 c4671k3, boolean z11, Exception exc) {
        super("AudioTrack init failed " + i11 + " Config(" + i12 + ", " + i13 + ", " + i14 + ")" + r0, exc);
        String str;
        if (true != z11) {
            str = "";
        } else {
            str = " (recoverable)";
        }
        this.f32147p = i11;
        this.f32148q = z11;
        this.f32149r = c4671k3;
    }
}
