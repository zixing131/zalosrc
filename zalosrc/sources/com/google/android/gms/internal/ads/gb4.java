package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gb4 extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ ob4 f20528a;

    /* renamed from: b */
    final /* synthetic */ jb4 f20529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gb4(jb4 jb4Var, ob4 ob4Var) {
        this.f20529b = jb4Var;
        this.f20528a = ob4Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i11) {
        AudioTrack audioTrack2;
        aa4 aa4Var;
        boolean z11;
        aa4 aa4Var2;
        audioTrack2 = this.f20529b.f22752c.f25576q;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        ob4 ob4Var = this.f20529b.f22752c;
        aa4Var = ob4Var.f25573n;
        if (aa4Var != null) {
            z11 = ob4Var.f25552O;
            if (z11) {
                aa4Var2 = ob4Var.f25573n;
                aa4Var2.zzb();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        aa4 aa4Var;
        boolean z11;
        aa4 aa4Var2;
        audioTrack2 = this.f20529b.f22752c.f25576q;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        ob4 ob4Var = this.f20529b.f22752c;
        aa4Var = ob4Var.f25573n;
        if (aa4Var != null) {
            z11 = ob4Var.f25552O;
            if (z11) {
                aa4Var2 = ob4Var.f25573n;
                aa4Var2.zzb();
            }
        }
    }
}
