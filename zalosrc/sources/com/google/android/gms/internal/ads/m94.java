package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class m94 {

    /* renamed from: e */
    public static final m94 f24443e = new m94(-1, -1, -1);

    /* renamed from: a */
    public final int f24444a;

    /* renamed from: b */
    public final int f24445b;

    /* renamed from: c */
    public final int f24446c;

    /* renamed from: d */
    public final int f24447d;

    public m94(int i11, int i12, int i13) {
        int i14;
        this.f24444a = i11;
        this.f24445b = i12;
        this.f24446c = i13;
        if (g92.m22364v(i13)) {
            i14 = g92.m22331Y(i13, i12);
        } else {
            i14 = -1;
        }
        this.f24447d = i14;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f24444a + ", channelCount=" + this.f24445b + ", encoding=" + this.f24446c + "]";
    }
}
