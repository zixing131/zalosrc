package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzff;

/* loaded from: classes2.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public Builder setClickToExpandRequested(boolean z11) {
            this.zzc = z11;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z11) {
            this.zzb = z11;
            return this;
        }

        public Builder setStartMuted(boolean z11) {
            this.zza = z11;
            return this;
        }
    }

    /* synthetic */ VideoOptions(Builder builder, zzi zziVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }

    public VideoOptions(zzff zzffVar) {
        this.zza = zzffVar.zza;
        this.zzb = zzffVar.zzb;
        this.zzc = zzffVar.zzc;
    }
}
