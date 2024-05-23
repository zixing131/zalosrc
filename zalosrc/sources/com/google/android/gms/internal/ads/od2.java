package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class od2 implements sh2 {

    /* renamed from: a */
    private final uc3 f25607a;

    /* renamed from: b */
    private final Context f25608b;

    public od2(uc3 uc3Var, Context context) {
        this.f25607a = uc3Var;
        this.f25608b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ pd2 m25164a() {
        int i11;
        int i12;
        AudioManager audioManager = (AudioManager) this.f25608b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20970D8)).booleanValue()) {
            i11 = zzt.zzq().zzi(audioManager);
            i12 = audioManager.getStreamMaxVolume(3);
        } else {
            i11 = -1;
            i12 = -1;
        }
        return new pd2(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i11, i12, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f25607a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.nd2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return od2.this.m25164a();
            }
        });
    }
}
