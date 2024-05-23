package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.gi */
/* loaded from: classes2.dex */
class C4539gi {

    /* renamed from: a */
    protected AudioTrack f20595a;

    /* renamed from: b */
    private boolean f20596b;

    /* renamed from: c */
    private int f20597c;

    /* renamed from: d */
    private long f20598d;

    /* renamed from: e */
    private long f20599e;

    /* renamed from: f */
    private long f20600f;

    /* renamed from: g */
    private long f20601g;

    /* renamed from: h */
    private long f20602h;

    /* renamed from: i */
    private long f20603i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4539gi(AbstractC4502fi abstractC4502fi) {
    }

    /* renamed from: a */
    public final long m22442a() {
        if (this.f20601g != -9223372036854775807L) {
            return Math.min(this.f20603i, this.f20602h + ((((SystemClock.elapsedRealtime() * 1000) - this.f20601g) * this.f20597c) / 1000000));
        }
        int playState = this.f20595a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f20595a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f20596b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f20600f = this.f20598d;
            }
            playbackHeadPosition += this.f20600f;
        }
        if (this.f20598d > playbackHeadPosition) {
            this.f20599e++;
        }
        this.f20598d = playbackHeadPosition;
        return playbackHeadPosition + (this.f20599e << 32);
    }

    /* renamed from: b */
    public final long m22443b() {
        return (m22442a() * 1000000) / this.f20597c;
    }

    /* renamed from: c */
    public long mo22444c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public long mo22445d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void m22446e(long j11) {
        this.f20602h = m22442a();
        this.f20601g = SystemClock.elapsedRealtime() * 1000;
        this.f20603i = j11;
        this.f20595a.stop();
    }

    /* renamed from: f */
    public final void m22447f() {
        if (this.f20601g != -9223372036854775807L) {
            return;
        }
        this.f20595a.pause();
    }

    /* renamed from: g */
    public void mo22448g(AudioTrack audioTrack, boolean z11) {
        this.f20595a = audioTrack;
        this.f20596b = z11;
        this.f20601g = -9223372036854775807L;
        this.f20598d = 0L;
        this.f20599e = 0L;
        this.f20600f = 0L;
        if (audioTrack != null) {
            this.f20597c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: h */
    public boolean mo22449h() {
        return false;
    }
}
