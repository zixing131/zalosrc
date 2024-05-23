package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.hi */
/* loaded from: classes2.dex */
final class C4576hi extends C4539gi {

    /* renamed from: j */
    private final AudioTimestamp f21759j;

    /* renamed from: k */
    private long f21760k;

    /* renamed from: l */
    private long f21761l;

    /* renamed from: m */
    private long f21762m;

    public C4576hi() {
        super(null);
        this.f21759j = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.C4539gi
    /* renamed from: c */
    public final long mo22444c() {
        return this.f21762m;
    }

    @Override // com.google.android.gms.internal.ads.C4539gi
    /* renamed from: d */
    public final long mo22445d() {
        return this.f21759j.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.C4539gi
    /* renamed from: g */
    public final void mo22448g(AudioTrack audioTrack, boolean z11) {
        super.mo22448g(audioTrack, z11);
        this.f21760k = 0L;
        this.f21761l = 0L;
        this.f21762m = 0L;
    }

    @Override // com.google.android.gms.internal.ads.C4539gi
    /* renamed from: h */
    public final boolean mo22449h() {
        boolean timestamp = this.f20595a.getTimestamp(this.f21759j);
        if (timestamp) {
            long j11 = this.f21759j.framePosition;
            if (this.f21761l > j11) {
                this.f21760k++;
            }
            this.f21761l = j11;
            this.f21762m = j11 + (this.f21760k << 32);
        }
        return timestamp;
    }
}
