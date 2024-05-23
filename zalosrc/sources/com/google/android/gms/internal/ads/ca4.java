package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes2.dex */
final class ca4 {

    /* renamed from: a */
    private final AudioTrack f18166a;

    /* renamed from: b */
    private final AudioTimestamp f18167b = new AudioTimestamp();

    /* renamed from: c */
    private long f18168c;

    /* renamed from: d */
    private long f18169d;

    /* renamed from: e */
    private long f18170e;

    public ca4(AudioTrack audioTrack) {
        this.f18166a = audioTrack;
    }

    /* renamed from: a */
    public final long m20850a() {
        return this.f18170e;
    }

    /* renamed from: b */
    public final long m20851b() {
        return this.f18167b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final boolean m20852c() {
        boolean timestamp = this.f18166a.getTimestamp(this.f18167b);
        if (timestamp) {
            long j11 = this.f18167b.framePosition;
            if (this.f18169d > j11) {
                this.f18168c++;
            }
            this.f18169d = j11;
            this.f18170e = j11 + (this.f18168c << 32);
        }
        return timestamp;
    }
}
