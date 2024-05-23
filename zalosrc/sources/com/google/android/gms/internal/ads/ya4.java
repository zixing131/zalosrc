package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ya4 {

    /* renamed from: a */
    public final C4671k3 f30861a;

    /* renamed from: b */
    public final int f30862b;

    /* renamed from: c */
    public final int f30863c;

    /* renamed from: d */
    public final int f30864d;

    /* renamed from: e */
    public final int f30865e;

    /* renamed from: f */
    public final int f30866f;

    /* renamed from: g */
    public final int f30867g;

    /* renamed from: h */
    public final int f30868h;

    /* renamed from: i */
    public final n94[] f30869i;

    public ya4(C4671k3 c4671k3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, n94[] n94VarArr) {
        this.f30861a = c4671k3;
        this.f30862b = i11;
        this.f30863c = i12;
        this.f30864d = i13;
        this.f30865e = i14;
        this.f30866f = i15;
        this.f30867g = i16;
        this.f30868h = i17;
        this.f30869i = n94VarArr;
    }

    /* renamed from: a */
    public final long m28174a(long j11) {
        return (j11 * 1000000) / this.f30865e;
    }

    /* renamed from: b */
    public final AudioTrack m28175b(boolean z11, b44 b44Var, int i11) {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        boolean z12;
        AudioTrack.Builder offloadedPlayback;
        try {
            int i12 = g92.f20474a;
            if (i12 >= 29) {
                int i13 = this.f30865e;
                build2 = new AudioFormat.Builder().setSampleRate(i13).setChannelMask(this.f30866f).setEncoding(this.f30867g).build();
                AudioAttributes audioAttributes2 = b44Var.m20400a().f17513a;
                qa4.m25676a();
                audioAttributes = pa4.m25424a().setAudioAttributes(audioAttributes2);
                audioFormat = audioAttributes.setAudioFormat(build2);
                transferMode = audioFormat.setTransferMode(1);
                bufferSizeInBytes = transferMode.setBufferSizeInBytes(this.f30868h);
                sessionId = bufferSizeInBytes.setSessionId(i11);
                if (this.f30863c == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z12);
                audioTrack = offloadedPlayback.build();
            } else if (i12 >= 21) {
                AudioAttributes audioAttributes3 = b44Var.m20400a().f17513a;
                int i14 = this.f30865e;
                build = new AudioFormat.Builder().setSampleRate(i14).setChannelMask(this.f30866f).setEncoding(this.f30867g).build();
                audioTrack = new AudioTrack(audioAttributes3, build, this.f30868h, 1, i11);
            } else {
                int i15 = b44Var.f17582a;
                if (i11 == 0) {
                    audioTrack = new AudioTrack(3, this.f30865e, this.f30866f, this.f30867g, this.f30868h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f30865e, this.f30866f, this.f30867g, this.f30868h, 1, i11);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zznu(state, this.f30865e, this.f30866f, this.f30868h, this.f30861a, m28176c(), null);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new zznu(0, this.f30865e, this.f30866f, this.f30868h, this.f30861a, m28176c(), e);
        } catch (UnsupportedOperationException e12) {
            e = e12;
            throw new zznu(0, this.f30865e, this.f30866f, this.f30868h, this.f30861a, m28176c(), e);
        }
    }

    /* renamed from: c */
    public final boolean m28176c() {
        return this.f30863c == 1;
    }
}
